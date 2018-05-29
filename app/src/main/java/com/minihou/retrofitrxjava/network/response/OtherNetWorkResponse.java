package com.minihou.retrofitrxjava.network.response;


import com.minihou.retrofitrxjavalibrary.model.INetworkResponse;

/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class OtherNetWorkResponse<T> implements INetworkResponse {
    private static final int SUCCESS_CODE = 0;
    public int error_code;
    public String reason;
    public T result;


    @Override
    public boolean isSuccess() {
        return getCode() == SUCCESS_CODE;
    }

    @Override
    public int getCode() {
        return error_code;
    }

    @Override
    public String getMessage() {
        return reason;
    }

    @Override
    public T getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "OtherNetWorkResponse{" +
                "error_code=" + error_code +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}
