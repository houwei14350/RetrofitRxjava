package com.minihou.retrofitrxjava.network.bean;

/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class EmailInfo {
    public String PostNumber;
    public String City;
    public String District;
    public String Address;

    @Override
    public String toString() {
        return "EmailInfo{" +
                "PostNumber='" + PostNumber + '\'' +
                ", City='" + City + '\'' +
                ", District='" + District + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
