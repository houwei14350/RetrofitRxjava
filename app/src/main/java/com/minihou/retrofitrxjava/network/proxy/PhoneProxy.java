package com.minihou.retrofitrxjava.network.proxy;


import com.minihou.retrofitrxjava.network.api.PhoneApi;
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

public class PhoneProxy extends BaseProxy {
    private static volatile PhoneProxy proxy = new PhoneProxy();
    private volatile PhoneApi api;

    private PhoneProxy() {
        super();
    }

    @Override
    protected Object init() {
        return api = (PhoneApi) RetrofitBuilder.getInstance().build(PhoneApi.class);
    }

    public static PhoneProxy getProxy() {
        return proxy;
    }


    public Observable getPhoneInfo(HashMap<String, String> params) {
        return api.getPhoneInfo(params).compose(transformerNetToBiz());
    }


//    public BaseProxy getPhoneInfo(HashMap<String, String> params, BaseObserver observer) {
//        BaseProxy observable=api.getPhoneInfo(params);
//        doHttp(observable, observer);
//        return observable;
//    }

//    public void getPhoneInfo(HashMap<String, String> params, LifecycleOwner lifecycleOwner, BaseObserver observer) {
//        BaseProxy observable=api.getPhoneInfo(params);
//        doHttp(api.getPhoneInfo(params), observer,lifecycleOwner);
//        return observable;
//    }
}
