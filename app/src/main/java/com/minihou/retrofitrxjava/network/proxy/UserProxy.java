package com.minihou.retrofitrxjava.network.proxy;


import com.minihou.retrofitrxjava.consts.ConstUrl;
import com.minihou.retrofitrxjava.network.api.UserApi;
import com.minihou.retrofitrxjava.network.response.ECServerLoginResponse;
import com.minihou.retrofitrxjavalibrary.BaseProxy;
import com.minihou.retrofitrxjavalibrary.RetrofitBuilder;
import com.minihou.retrofitrxjavalibrary.model.INetworkResponse;

import java.util.HashMap;

import io.reactivex.Observable;


/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class UserProxy extends BaseProxy {
    private static volatile UserProxy proxy = new UserProxy();
    private volatile UserApi api;

    private UserProxy() {
        super();
    }

    @Override
    protected Object init() {
        return api = (UserApi) RetrofitBuilder.getInstance().build(ConstUrl.LITE_WORKEC_COM, UserApi.class);
    }

    public static UserProxy getProxy() {
        return proxy;
    }


    public Observable<INetworkResponse> login(HashMap<String, Object> params) {
        Observable<ECServerLoginResponse> ecServerLoginResponseObservable = api.postLogin(params);
        return ecServerLoginResponseObservable.compose(transformerNetToBiz());
    }

}
