package com.minihou.retrofitrxjava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import com.minihou.retrofitrxjava.R;

import java.util.HashMap;

/**
 * Created by Simon Hou Wei
 * on 2018/4/20
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class StartFinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_finish_activity);
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData1();
            }
        });

    }

    private void getData1() {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("phone", "18621514815");
        maps.put("key", "b71f93669c67b7614b308d58958048fd");
//        PhoneProxy.getProxy().getPhoneInfo(maps, new BaseObserver<PhoneInfo>() {
//
//            @Override
//            protected void onStart() {
//                showProgressCanDissmiss(StartFinishActivity.this);
//            }
//
//            @Override
//            protected void onSuccess(PhoneInfo phoneInfo) {
//                //此处会返回 PhoneInfo对象 可以直接操作他
//
//            }
//
//            @Override
//            protected void onFailure(int errorCode, String message) {
//                //此处是所有的错误返回 可以根据errorCode 来定制接下来的操作
//            }
//
//            @Override
//            protected void onFinish() {
//                super.onFinish();
//                closeProgressDialog();
//            }
//        });
    }
}
