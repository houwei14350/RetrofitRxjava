package com.minihou.retrofitrxjava.activity;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.minihou.retrofitrxjava.R;
import com.minihou.retrofitrxjava.network.bean.EmailList;
import com.minihou.retrofitrxjava.network.bean.PhoneInfo;
import com.minihou.retrofitrxjava.network.proxy.EmailProxy;
import com.minihou.retrofitrxjava.network.proxy.PhoneProxy;
import com.minihou.retrofitrxjavalibrary.BaseObserver;
import com.minihou.retrofitrxjavalibrary.RxHelper;

import java.util.HashMap;

import io.reactivex.functions.BiFunction;


/**
 * Created by Simon Hou Wei
 * on 2018/4/20
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class DifferentiateDomainActivity extends AppCompatActivity implements LifecycleOwner {

    private TextView tv_show_domain;
    private TextView tv_content;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domain_activity);
        tv_show_domain = (TextView) findViewById(R.id.tv_show_domain);
        tv_content = (TextView) findViewById(R.id.tv_content);
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_domain.setText("域名:" + "http://apis.juhe.cn");
                getData1();
            }
        });

        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_show_domain.setText("域名:" + "http://v.juhe.cn");
                getData2();
            }
        });

        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData3();
            }
        });
    }


    private void getData1() {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("phone", "18621514815");
        maps.put("key", "b71f93669c67b7614b308d58958048fd");

        RxHelper.doHttp(PhoneProxy.getProxy().getPhoneInfo(maps),new BaseObserver<PhoneInfo>(){

            @Override
            protected void onStart() {

            }

            @Override
            protected void onSuccess(PhoneInfo phoneInfo) {
                Log.e("simon","====>");
                tv_content.setText("content:" + phoneInfo.toString());
            }

            @Override
            protected void onFailure(int errorCode, String message) {
                tv_content.setText("errorCode:" + errorCode + "\nmessage:" + message);
            }
        });

    }

    private void getData2() {
        HashMap<String, String> params = new HashMap<>();
        params.put("postcode", "415602");
        params.put("key", "9146ccc5268dce4fb31d361621733768");

        RxHelper.doHttp(EmailProxy.getProxy().getEmailInfo(params), new BaseObserver<EmailList>() {
            @Override
            protected void onStart() {

            }

            @Override
            protected void onSuccess(EmailList emailInfo) {
                tv_content.setText("content:" + emailInfo.toString());
            }

            @Override
            protected void onFailure(int errorCode, String message) {
                tv_content.setText("errorCode:" + errorCode + "\nmessage:" + message);
            }
        });

    }

    private void getData3() {

                HashMap<String, String> params = new HashMap<>();
        params.put("postcode", "415602");
        params.put("key", "9146ccc5268dce4fb31d361621733768");

        HashMap<String, String> maps = new HashMap<>();
        maps.put("phone", "18621514815");
        maps.put("key", "b71f93669c67b7614b308d58958048fd");

        RxHelper.doHttpWithZip(EmailProxy.getProxy().getEmailInfo(params), PhoneProxy.getProxy().getPhoneInfo(maps), new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) throws Exception {
                Log.e("simonApply",o.toString()+" ==="+o2.toString());
                return new OO(o,o2);
            }
        }, new BaseObserver() {
            @Override
            protected void onStart() {
                Log.e("simon start","====");
            }

            @Override
            protected void onSuccess(Object o) {
                Log.e("simon",o.toString());
            }

            @Override
            protected void onFailure(int errorCode, String message) {
                Log.e("simonFailure","=====");
            }
        });

    }

    public class OO {
        EmailList emailInfo;
        PhoneInfo phoneInfo;

        public OO(Object emailInfo, Object phoneInfo) {
            this.emailInfo = (EmailList) emailInfo;
            this.phoneInfo = (PhoneInfo) phoneInfo;
        }

        @Override
        public String toString() {
            return "OO{" +
                    "emailInfo=" + emailInfo +
                    ", phoneInfo=" + phoneInfo +
                    '}';
        }
    }
}
