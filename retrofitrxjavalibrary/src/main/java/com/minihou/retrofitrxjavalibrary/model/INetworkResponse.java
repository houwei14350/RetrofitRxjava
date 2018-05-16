package com.minihou.retrofitrxjavalibrary.model;

/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public interface INetworkResponse<T> {
    boolean isSuccess();

    int getCode();

    String getMessage();

    T getResult();
}
