package com.minihou.retrofitrxjava.network.interceptor;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Locale;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;


/**
 * Created by Simon Hou Wei
 * on 2018/4/20
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class LogInterceptor implements Interceptor {
    private final static String TAG = "simon-retrofit";


    @Override
    public Response intercept(Chain chain) throws IOException {
        //                        if (LogUtil.isDebug()) {
        Request request = handleRequest(chain.request());
        Log.i(TAG, "=====================REQUEST START=====================");
        Log.i(TAG, String.format("Sending request method %s, %nurl %s, %nrequest headers===>%n[%n%s]", request.method(), request.url(),
                request.headers()));
        if (null != request.body()) {
            Log.i(TAG, bodyToString(request));
        }
        Log.i(TAG, "=====================REQUEST END=======================");

        Log.i(TAG, "=====================RESPONSE START====================");
        long t1 = System.nanoTime();
        Response response = chain.proceed(request);
        long t2 = System.nanoTime();
        Log.i(TAG, String.format(Locale.CHINA, "Received response for %s in %.1fms", response.request().url(),
                (t2 - t1) / 1e6d));

        String bodyString = response.body().string();
        if (null != bodyString) {
            try {
                Log.i(TAG, new JSONObject(bodyString).toString(4));
            } catch (JSONException e) {
            }
        }
        Log.i(TAG, "=====================RESPONSE END======================");
        return response.newBuilder()
                .body(ResponseBody.create(response.body().contentType(), bodyString))
                .build();
//                        } else {
//                            return chain.proceed(handleRequest(chain.request()));
//                        }
    }

    private Request handleRequest(Request request) {
        String url = request.url().url().toString();
        int p = url.indexOf('|');
        if (p != -1) {
            url = url.replace("|", "%7C");
        }


        return request.newBuilder()
                .header("Accept-Language", "zh-cn,zh")
                .header("Accept-Charset", "utf-8")
                .header("Content-type", "application/json")
                .header("User-Agent", "EC/7200")
                .url(url)
                .build();
    }


    private String bodyToString(Request request) {
        Request copy = request.newBuilder().build();
        Buffer buffer = new Buffer();
        try {
            copy.body().writeTo(buffer);
            return buffer.readUtf8();
        } catch (IOException e) {
            return "did not work";
        }
    }
}
