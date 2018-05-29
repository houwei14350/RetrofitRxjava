package com.minihou.retrofitrxjava.network.api;


import com.minihou.retrofitrxjava.network.bean.PhoneInfo;
import com.minihou.retrofitrxjava.network.response.NetworkResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


/**
 * @author yemao
 * @date 2017/4/9
 * @description API接口!
 */

public interface PhoneApi {

    @GET("/mobile/get")
    Observable<NetworkResponse<PhoneInfo>> getPhoneInfo(@QueryMap Map<String, String> name);



//    //上传单张图片
//    @POST("服务器地址")
//    BaseProxy<Object> imageUpload(@Part() MultipartBody.Part img);
//
//    //上传多张图片
//    @POST("服务器地址")
//    BaseProxy<Object> imagesUpload(@Part() List<MultipartBody.Part> imgs);
}
