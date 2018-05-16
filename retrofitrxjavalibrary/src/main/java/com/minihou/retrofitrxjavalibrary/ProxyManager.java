package com.minihou.retrofitrxjavalibrary;

import java.util.ArrayList;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class ProxyManager {
    private volatile static ProxyManager manager;
    private ArrayList<BaseProxy> proxyList;
    private CompositeDisposable mDisposables;

    private ProxyManager() {
        proxyList = new ArrayList<>();
        mDisposables = new CompositeDisposable();
    }

    public static ProxyManager getInstance() {
        if (manager == null) {
            synchronized (ProxyManager.class) {
                if (manager == null) {
                    manager = new ProxyManager();
                }
            }
        }
        return manager;
    }

    public ArrayList<BaseProxy> getProxyList() {
        return proxyList;
    }

    public CompositeDisposable getDisposables() {
        return mDisposables;
    }
}
