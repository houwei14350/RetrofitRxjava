package com.minihou.retrofitrxjavalibrary;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.support.annotation.CallSuper;
import android.util.Log;


import com.minihou.retrofitrxjavalibrary.exception.ApiException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * 统一处理请求回调
 *
 * @param <T>
 */
public abstract class BaseObserver<T> implements Observer<T> {
    private Disposable disposable;

    public BaseObserver() {

    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        disposable = d;
        ProxyManager.getInstance().getDisposables().add(d);
        onStart();
    }

    @Override
    public void onNext(T tNetworkResponse) {
        onSuccess(tNetworkResponse);
        onFinish();
    }

    @Override
    public void onError(Throwable e) {
        Log.e("simon  eeee:", e.toString());
        if (e instanceof ConnectException
                || e instanceof TimeoutException
                || e instanceof NetworkErrorException
                || e instanceof UnknownHostException
                || e instanceof SocketTimeoutException) {
            onFailure(9999, "网络出问题啦");
        } else if (e instanceof ApiException) {
            onFailure(((ApiException) e).errorCode, ((ApiException) e).message);
        } else if (e instanceof SecurityException) {
            onFailure(7777, "缺少权限");
        } else {
            onFailure(8888, "服务器异常");
        }
        onFinish();
    }

    @Override
    public void onComplete() {
        Log.e("simon", "complete");
    }

    protected abstract void onStart();

    @CallSuper
    protected void onFinish() {
        onRequestEnd();
    }

    /**
     * 返回成功
     *
     * @param t
     * @throws Exception
     */
    protected abstract void onSuccess(T t);

    /**
     * 返回失败
     *
     * @throws Exception
     */
    protected abstract void onFailure(int errorCode, String message);


    private void onRequestStart() {

    }

    private void onRequestEnd() {
        //这里是网络请求的结束 需要删除map里的请求
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
            ProxyManager.getInstance().getDisposables().remove(disposable);
        }

//        if (mContext != null) {
//            closeProgressDialog();
//        }
    }

    public void showProgress(@android.support.annotation.NonNull Context context) {
//        ProgressDialog.show(context, false, "请稍后");
    }

    public void showProgressCanDissmiss(@android.support.annotation.NonNull Context context) {
//        ProgressDialog.show(context, true, "请稍后");
    }

    public void closeProgressDialog() {
//        ProgressDialog.cancel();
    }


}
