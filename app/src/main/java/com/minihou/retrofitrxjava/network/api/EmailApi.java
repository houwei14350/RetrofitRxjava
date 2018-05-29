package com.minihou.retrofitrxjava.network.api;


import com.minihou.retrofitrxjava.network.bean.EmailList;
import com.minihou.retrofitrxjava.network.response.OtherNetWorkResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


/**
 * Created by Simon Hou Wei
 * on 2018/4/19
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public interface EmailApi {
    @GET("/postcode/query")
    Observable<OtherNetWorkResponse<EmailList>> getEmailInfo(@QueryMap Map<String, String> name);
}
