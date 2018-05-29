package com.minihou.retrofitrxjava.network.proxy;


import com.minihou.retrofitrxjava.network.api.EmailApi;
import com.minihou.retrofitrxjavalibrary.BaseProxy;
import com.minihou.retrofitrxjavalibrary.RetrofitBuilder;

import java.util.HashMap;

import io.reactivex.Observable;


/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class EmailProxy extends BaseProxy {
    private static final String EMAIL_URL = "http://v.juhe.cn";
    private static EmailProxy proxy = new EmailProxy();
    private EmailApi api;

    private EmailProxy() {
        super();
    }



    @Override
    protected Object init() {
        return api = (EmailApi) RetrofitBuilder.getInstance().build(EMAIL_URL, EmailApi.class);
    }

    public static EmailProxy getProxy() {
        return proxy;
    }


    public Observable getEmailInfo(HashMap<String, String> params) {
        return  api.getEmailInfo(params).compose(transformerNetToBiz());
    }

}
