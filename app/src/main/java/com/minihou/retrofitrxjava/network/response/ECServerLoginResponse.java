package com.minihou.retrofitrxjava.network.response;

import com.minihou.retrofitrxjava.base.BaseServerBean;
import com.minihou.retrofitrxjavalibrary.model.INetworkResponse;

/**
 * Created by Simon Hou Wei
 * on 2018/5/16
 * in RetrofitRxjava
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */
public class ECServerLoginResponse extends BaseServerBean implements INetworkResponse {
    private String SdkAppid;
    private String AccountType;
    private int Userid;
    private int Corpid;
    private String DataKey;
    private String PvKey;
    private String TimKey;
    private String SecreKey; //登陆密匙只有账号密码登陆的时候才有值


    public String getSdkAppid() {
        return SdkAppid;
    }

    public void setSdkAppid(String sdkAppid) {
        SdkAppid = sdkAppid;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public int getCorpid() {
        return Corpid;
    }

    public void setCorpid(int corpid) {
        Corpid = corpid;
    }

    public String getDataKey() {
        return DataKey;
    }

    public void setDataKey(String dataKey) {
        DataKey = dataKey;
    }

    public String getPvKey() {
        return PvKey;
    }

    public void setPvKey(String pvKey) {
        PvKey = pvKey;
    }

    public String getTimKey() {
        return TimKey;
    }

    public void setTimKey(String timKey) {
        TimKey = timKey;
    }

    public String getSecreKey() {
        return SecreKey;
    }

    public void setSecreKey(String secreKey) {
        SecreKey = secreKey;
    }

    @Override
    public boolean isSuccess() {
        return ErrorCode == 0;
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

    @Override
    public String toString() {
        return "ECServerLoginResponse{" +
                "ActionStatus='" + ActionStatus + '\'' +
                ", TimeStamp=" + TimeStamp +
                ", ErrorInfo='" + ErrorInfo + '\'' +
                ", ErrorCode=" + ErrorCode +
                ", SdkAppid='" + SdkAppid + '\'' +
                ", AccountType='" + AccountType + '\'' +
                ", Userid=" + Userid +
                ", Corpid=" + Corpid +
                ", DataKey='" + DataKey + '\'' +
                ", PvKey='" + PvKey + '\'' +
                ", TimKey='" + TimKey + '\'' +
                ", SecreKey='" + SecreKey + '\'' +
                '}';
    }
}
