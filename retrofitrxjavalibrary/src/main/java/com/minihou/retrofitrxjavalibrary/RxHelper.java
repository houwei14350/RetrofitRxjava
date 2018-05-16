package com.minihou.retrofitrxjavalibrary;

import android.arch.lifecycle.LifecycleOwner;


import com.minihou.retrofitrxjavalibrary.life.RxLifecycleUtils;
import com.minihou.retrofitrxjavalibrary.model.INetworkResponse;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Simon Hou Wei
 * on 2018/5/2
 * in RetrofitRxjavaDemo
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */


public class RxHelper {

    @SuppressWarnings("unchecked")
    public static <T> void doHttp(Observable<INetworkResponse<T>> observable, @android.support.annotation.NonNull BaseObserver observer) {
        observable.compose(schedulersTransformer()).subscribe(observer);
    }

    @SuppressWarnings("unchecked")
    public static void doHttpWithZip(Observable observable1, Observable observable2, BiFunction biFunction, BaseObserver observer) {
        Observable.zip(observable1, observable2, biFunction).compose(schedulersTransformer()).subscribe(observer);
    }


    @SuppressWarnings("unchecked")
    public static <T> void doHttpInLifecycle(Observable<INetworkResponse<T>> observable, LifecycleOwner lifecycleOwner, @android.support.annotation.NonNull BaseObserver observer) {
        observable.compose(schedulersTransformer()).as(RxLifecycleUtils.bindLifecycle(lifecycleOwner)).subscribe(observer);
    }

    @SuppressWarnings("unchecked")
    public static <T, F, R> void doHttpWithZipInLifecycle(Observable<INetworkResponse<T>> observable1, Observable<INetworkResponse<F>> observable2, LifecycleOwner lifecycleOwner, BiFunction<INetworkResponse<T>, INetworkResponse<F>, R> biFunction, BaseObserver observer) {
        Observable.zip(observable1, observable2, biFunction).compose(schedulersTransformer()).as(RxLifecycleUtils.bindLifecycle(lifecycleOwner)).subscribe(observer);
    }


    public static <T> ObservableTransformer<T, T> schedulersTransformer() {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
