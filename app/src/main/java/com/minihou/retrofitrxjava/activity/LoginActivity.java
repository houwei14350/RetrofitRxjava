package com.minihou.retrofitrxjava.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.minihou.retrofitrxjava.R;
import com.minihou.retrofitrxjava.network.proxy.UserProxy;
import com.minihou.retrofitrxjava.network.response.ECServerLoginResponse;
import com.minihou.retrofitrxjava.util.MD5Util;
import com.minihou.retrofitrxjavalibrary.BaseObserver;
import com.minihou.retrofitrxjavalibrary.RxHelper;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by Simon Hou Wei
 * on 2018/5/16
 * in RetrofitRxjava
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */
public class LoginActivity extends AppCompatActivity {
    private EditText et_account, et_password;
    private TextView tv_info;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_account = findViewById(R.id.et_account);
        et_password = findViewById(R.id.et_password);
        tv_info = findViewById(R.id.tv_info);
        et_account.setText(R.string.account);
        et_password.setText(R.string.password);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("HardwareIds")
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(et_account.getText().toString()) && !TextUtils.isEmpty(et_password.getText().toString())) {
                    HashMap<String, Object> params = new HashMap<>();
                    params.put("UserAccount", et_account.getText().toString().trim());
                    params.put("Password", MD5Util.getStringMD5(et_password.getText().toString().trim()));
                    params.put("TimeStamp", Long.parseLong(String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000)));
                    params.put("MachineCode", Settings.Secure.getString(getApplication().getContentResolver(), Settings.Secure.ANDROID_ID));
                    params.put("Platform", 4);
                    params.put("Version", 7200);
                    params.put("SecreKey", "");
                    RxHelper.doHttp(UserProxy.getProxy().login(params), new BaseObserver<ECServerLoginResponse>() {
                        @Override
                        protected void onStart() {
                            Log.e("simon", "start");
                        }

                        @Override
                        protected void onSuccess(ECServerLoginResponse o) {
                            tv_info.setText(MessageFormat.format("ActionStatus:{0}\nSdkAppid:{1}\nAccountType:{2}\nPvKey:{3}\nUserid:{4}",
                                    o.getActionStatus(), o.getSdkAppid(), o.getAccountType(), o.getPvKey(), o.getUserid()));
                        }

                        @Override
                        protected void onFailure(int errorCode, String message) {
                            Log.e("simon", "errorCode:" + errorCode + "   message:" + message);
                        }
                    });
                }
            }
        });
    }
}
