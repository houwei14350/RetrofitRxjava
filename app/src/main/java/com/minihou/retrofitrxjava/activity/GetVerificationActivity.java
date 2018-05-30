package com.minihou.retrofitrxjava.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.minihou.retrofitrxjava.R;
import com.minihou.retrofitrxjava.network.proxy.UserProxy;
import com.minihou.retrofitrxjava.network.response.ECServerRequestCodeResponse;
import com.minihou.retrofitrxjavalibrary.BaseObserver;
import com.minihou.retrofitrxjavalibrary.RxHelper;

import java.util.HashMap;

/**
 * Created by Simon Hou Wei
 * on 2018/5/30
 * in RetrofitRxjava
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */
public class GetVerificationActivity extends AppCompatActivity {
    private TextView tv_description;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_code);
        tv_description=findViewById(R.id.tv_description);
        findViewById(R.id.btn_get_code).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("HardwareIds")
            @Override
            public void onClick(View v) {
                HashMap<String, Object> params = new HashMap<>();
                params.put("MachineCode", Settings.Secure.getString(getApplication().getContentResolver(), Settings.Secure.ANDROID_ID));
                params.put("Platform",4);
                params.put("Account","18621514815");
                params.put("Type",1010);
                RxHelper.doHttp(UserProxy.getProxy().getVerificationCode(params), new BaseObserver<ECServerRequestCodeResponse>() {

                    @Override
                    protected void onStart() {

                    }

                    @Override
                    protected void onSuccess(ECServerRequestCodeResponse ecServerRequestCodeResponse) {
                        tv_description.setText(ecServerRequestCodeResponse.toString());
                    }

                    @Override
                    protected void onFailure(int errorCode, String message) {
                        tv_description.setText(message);
                    }
                });
            }
        });
    }
}
