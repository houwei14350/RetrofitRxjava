package com.minihou.retrofitrxjava.base;

/**
 * Created by Simon Hou Wei
 * on 2018/5/30
 * in RetrofitRxjava
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */
public class BaseServerBean {
    public String ActionStatus;
    public String ErrorInfo;
    public int ErrorCode;
    public int TimeStamp;

    public String getActionStatus() {
        return ActionStatus;
    }

    public void setActionStatus(String actionStatus) {
        ActionStatus = actionStatus;
    }

    public String getErrorInfo() {
        return ErrorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        ErrorInfo = errorInfo;
    }

    public int getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(int errorCode) {
        ErrorCode = errorCode;
    }

    public int getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        TimeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "BaseServerBean{" +
                "ActionStatus='" + ActionStatus + '\'' +
                ", ErrorInfo='" + ErrorInfo + '\'' +
                ", ErrorCode=" + ErrorCode +
                ", TimeStamp=" + TimeStamp +
                '}';
    }
}
