package com.minihou.retrofitrxjava.base;

import android.app.Application;

import com.minihou.retrofitrxjava.network.interceptor.LogInterceptor;
import com.minihou.retrofitrxjavalibrary.RetrofitNetwork;

import java.util.ArrayList;

import okhttp3.Interceptor;


/**
 * Created by Simon Hou Wei
 * on 2018/5/2
 * in RetrofitRxjavaDemo
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ArrayList<Interceptor> list = new ArrayList<>();
        list.add(new LogInterceptor());
        RetrofitNetwork.init("http://apis.juhe.cn", null, null, list);
    }
}
