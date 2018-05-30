package com.minihou.retrofitrxjava.network.response;

import com.minihou.retrofitrxjava.base.BaseServerBean;
import com.minihou.retrofitrxjavalibrary.model.INetworkResponse;

/**
 * Created by Simon Hou Wei
 * on 2018/5/30
 * in RetrofitRxjava
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */
public class ECServerRequestCodeResponse extends BaseServerBean implements INetworkResponse {

    @Override
    public String toString() {
        return "ECServerRequestCodeResponse{" +
                "ActionStatus='" + ActionStatus + '\'' +
                ", ErrorInfo='" + ErrorInfo + '\'' +
                ", ErrorCode=" + ErrorCode +
                ", TimeStamp=" + TimeStamp +
                '}';
    }

    @Override
    public boolean isSuccess() {
        return ErrorCode == 200;
    }

    @Override
    public int getCode() {
        return ErrorCode;
    }

    @Override
    public String getMessage() {
        return ErrorInfo;
    }

    @Override
    public Object getResult() {
        return this;
    }
}
