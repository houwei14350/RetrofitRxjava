package com.minihou.retrofitrxjavalibrary;

import android.support.annotation.NonNull;

import java.util.List;

import okhttp3.CookieJar;
import okhttp3.Interceptor;
import retrofit2.Converter;

/**
 * Created by Simon Hou Wei
 * on 2018/4/24
 * in RetrofitRxjavaDemo
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class RetrofitNetwork {
    public static void init(@NonNull String defaultHost, Converter.Factory dataConvertFactory, CookieJar cookieJar, List<Interceptor> interceptors) {
        RetrofitBuilder.getInstance().initRetrofit(defaultHost, dataConvertFactory, cookieJar, interceptors);
    }
}
