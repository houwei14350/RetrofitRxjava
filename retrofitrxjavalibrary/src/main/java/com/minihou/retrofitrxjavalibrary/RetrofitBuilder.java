package com.minihou.retrofitrxjavalibrary;

import android.text.TextUtils;
import android.util.Log;

import com.minihou.retrofitrxjavalibrary.converter.FastJsonConverter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by Simon Hou Wei
 * on 2018/4/18
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class RetrofitBuilder<T> {
    private static final String TAG = "RetrofitBuilder";

    private HashMap<String, T> maps;
    private String defaultHost;
    private Converter.Factory dataConverterFactory;
    private CookieJar cookieJar;

    private RetrofitBuilder() {
        maps = new HashMap<>();
        interceptors = new ArrayList<>();
    }

    private ArrayList<Interceptor> interceptors;

    private static class SingletonHolder {
        volatile static RetrofitBuilder instance = new RetrofitBuilder();
    }

    public static RetrofitBuilder getInstance() {
        return SingletonHolder.instance;
    }

    public T build(String host, Class<T> clazz) {

        if (TextUtils.isEmpty(host)) {
            throw new NullPointerException("host can not be a null object");
        }

        if (maps.containsKey(host) && maps.get(host) != null) {
            return maps.get(host);
        } else {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            if (interceptors != null && interceptors.size() > 0) {
                for (Interceptor interceptor : interceptors) {
                    builder.addInterceptor(interceptor);
                }
            }
            OkHttpClient client = builder.build();
            builder.connectTimeout(20, TimeUnit.SECONDS);
            builder.readTimeout(20, TimeUnit.SECONDS);
            builder.followRedirects(true);
            //增加持久化session
            if (cookieJar != null) {
                builder.cookieJar(cookieJar);
            }

            //todo 这个免认证是否要去掉？
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            T t = new Retrofit.Builder()
                    .baseUrl(host)
                    .client(client)
                    .addConverterFactory(dataConverterFactory == null ? FastJsonConverter.create() : dataConverterFactory)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
                    .create(clazz);
            maps.put(host, t);
            return t;
        }
    }

    public T build(Class<T> clazz) {
        if (TextUtils.isEmpty(defaultHost)) {
            throw new RuntimeException("EcNetWork must be init");
        }
        if (maps.containsKey(defaultHost) && maps.get(defaultHost) != null) {
            return maps.get(defaultHost);
        } else {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
            if (interceptors != null && interceptors.size() > 0) {
                for (Interceptor interceptor : interceptors) {
                    builder.addInterceptor(interceptor);
                }
            }
            OkHttpClient client = builder.build();
            builder.connectTimeout(20, TimeUnit.SECONDS);
            builder.readTimeout(20, TimeUnit.SECONDS);
            builder.followRedirects(true);
            //增加持久化session
            if (cookieJar != null) {
                builder.cookieJar(cookieJar);
            }
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            T t = new Retrofit.Builder()
                    .baseUrl(defaultHost)
                    .client(client)
                    .addConverterFactory(dataConverterFactory == null ? FastJsonConverter.create() : dataConverterFactory)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
                    .create(clazz);
            maps.put(defaultHost, t);
            return t;
        }
    }


    //必须调用这个初始化方法
    void initRetrofit(String baseHost, Converter.Factory dataConverterFactory, CookieJar cookieJar, List<Interceptor> list) {
        if (!TextUtils.isEmpty(defaultHost)) {
            //不允许设置2次默认的host
            Log.e(TAG, "不允许设置2次默认的host，请检查并移除多的");
            return;
        }

        if (TextUtils.isEmpty(baseHost)) {
            throw new NullPointerException("baseHost can not be a null object");
        }

        defaultHost = baseHost;
        if (list != null) {
            interceptors.addAll(list);
        }
        this.dataConverterFactory = dataConverterFactory;
        this.cookieJar = cookieJar;
    }
}
