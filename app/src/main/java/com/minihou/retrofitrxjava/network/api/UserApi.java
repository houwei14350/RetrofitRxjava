package com.minihou.retrofitrxjava.network.api;

import com.minihou.retrofitrxjava.consts.ConstUrl;
import com.minihou.retrofitrxjava.network.response.ECServerLoginResponse;
import com.minihou.retrofitrxjava.network.response.ECServerRequestCodeResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Simon Hou Wei
 * on 2018/5/16
 * in RetrofitRxjava
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */
public interface UserApi {
    @POST(ConstUrl.LOGIN_SERVER)
    Observable<ECServerLoginResponse> postLogin(@Body Map<String, Object> params);

    @POST(ConstUrl.GET_VERIFICATION_CODE_FOR_SAFETY)
    Observable<ECServerRequestCodeResponse> postVerificationCode(@Body Map<String, Object> params);
}
