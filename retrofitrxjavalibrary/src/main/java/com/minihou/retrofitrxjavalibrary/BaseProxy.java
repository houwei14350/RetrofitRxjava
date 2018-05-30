package com.minihou.retrofitrxjavalibrary;

import com.minihou.retrofitrxjavalibrary.exception.ApiException;
import com.minihou.retrofitrxjavalibrary.model.INetworkResponse;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;


/**
 * Created by Simon Hou Wei
 * on 2018/4/18
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : 所有网络请求的总代理，网络请求返回之后首先在这里脱掉最外层的壳
 */

public abstract class BaseProxy<T> {
    private final String TAG = "retrofit";


    public BaseProxy() {
        init();
        ProxyManager.getInstance().getProxyList().add(this);
    }


    protected abstract T init();

    protected <F> ObservableTransformer<INetworkResponse<F>, F> transformerNetToBiz() {
        return new ObservableTransformer<INetworkResponse<F>, F>() {
            @Override
            public Observable<F> apply(Observable<INetworkResponse<F>> observable) {
                return observable.map(new Function<INetworkResponse<F>, F>() {
                    @Override
                    public F apply(INetworkResponse<F> tiNetworkResponse) throws Exception {
                        if (!tiNetworkResponse.isSuccess()) {
                            throw new ApiException(tiNetworkResponse.getCode(), tiNetworkResponse.getMessage());
                        }
                        return tiNetworkResponse.getResult();
                    }
                });
            }
        };
    }


}


