package com.minihou.retrofitrxjavalibrary.exception;

/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class ApiException extends Exception {
    public static final int FORMAT_TYPE_WRONG_CODE=1111;
    public static final String FORMAT_TYPE_WRONG_MSG="返回格式错误";

    public int errorCode;
    public String message;

    public ApiException(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;

    }

    @Override
    public String toString() {
        return "ApiException{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                '}';
    }
}
