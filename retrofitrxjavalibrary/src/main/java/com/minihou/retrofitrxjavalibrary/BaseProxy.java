package com.minihou.retrofitrxjavalibrary;

import android.util.Log;


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

    protected ObservableTransformer<INetworkResponse<T>, T> transformerNetToBiz() {
        return new ObservableTransformer<INetworkResponse<T>, T>() {
            @Override
            public Observable<T> apply(Observable<INetworkResponse<T>> observable) {
                return observable.map(new Function<INetworkResponse<T>, T>() {
                    @Override
                    public T apply(INetworkResponse<T> tiNetworkResponse) throws Exception {
                        Log.e("simon===>compose", tiNetworkResponse.toString());
//                        if (tiNetworkResponse instanceof INetworkResponse) {
                        if (!tiNetworkResponse.isSuccess()) {
                            throw new ApiException(tiNetworkResponse.getCode(), tiNetworkResponse.getMessage());
                        }
                        return tiNetworkResponse.getResult();
//                        } else {
//                            throw new ApiException(ApiException.FORMAT_TYPE_WRONG_CODE, ApiException.FORMAT_TYPE_WRONG_MSG);
//                        }

                    }
                });
            }
        };
    }

}


