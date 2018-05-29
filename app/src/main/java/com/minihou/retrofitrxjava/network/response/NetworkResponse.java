package com.minihou.retrofitrxjava.network.response;


import com.minihou.retrofitrxjavalibrary.model.INetworkResponse;

public class NetworkResponse<T> implements INetworkResponse {
    private static final int SUCCESS_CODE = 200;
    public int resultCode;
    public String reason;
    public T result;

    @Override
    public String toString() {
        return "NetworkResponse{" +
                "resultCode=" + resultCode +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean isSuccess() {
        return getCode() == SUCCESS_CODE;
    }

    @Override
    public int getCode() {
        return resultCode;
    }

    @Override
    public String getMessage() {
        return reason;
    }

    @Override
    public T getResult() {
        return result;
    }
}
