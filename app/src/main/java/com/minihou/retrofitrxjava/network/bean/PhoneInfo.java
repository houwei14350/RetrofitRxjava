package com.minihou.retrofitrxjava.network.bean;


public class PhoneInfo {
    public String province;
    public String city;
    public String areacode;
    public String zip;
    public String company;
    public String card;

    @Override
    public String toString() {
        return "PhoneInfo{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", areacode='" + areacode + '\'' +
                ", zip='" + zip + '\'' +
                ", company='" + company + '\'' +
                ", card='" + card + '\'' +
                '}';
    }
}
