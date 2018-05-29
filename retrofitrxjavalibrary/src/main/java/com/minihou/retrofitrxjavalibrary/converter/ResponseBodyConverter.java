package com.minihou.retrofitrxjavalibrary.converter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by Simon Hou Wei
 * on 2018/4/18
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class ResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private Type type;

    public ResponseBodyConverter(Type type) {
        this.type = type;
    }

    @Override
    public T convert(ResponseBody body) throws IOException {
        String content = body.string();
        JSONObject jsonObject = JSON.parseObject(content);
        String result = jsonObject.getString("result");
        if ("{}".equals(result) || "[]".equals(result) || result == null) {
            jsonObject.remove("result");
        }
        content = jsonObject.toJSONString();
        return JSON.parseObject(content, type);
    }
}
