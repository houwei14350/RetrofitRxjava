package com.minihou.retrofitrxjavalibrary.converter;

import com.alibaba.fastjson.serializer.SerializeConfig;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created by Simon Hou Wei
 * on 2018/4/18
 * in retrofit2_rxjava2-android
 * All Rights Reserved. 六度人和
 * description : use a dialog to description this file
 */

public class FastJsonConverter extends Converter.Factory {
    private final SerializeConfig serializeConfig;

    private FastJsonConverter(SerializeConfig serializeConfig) {
        if (serializeConfig == null)
            throw new NullPointerException("serializeConfig == null");
        this.serializeConfig = serializeConfig;
    }

    public static FastJsonConverter create() {
        return create(SerializeConfig.getGlobalInstance());
    }

    public static FastJsonConverter create(SerializeConfig serializeConfig) {
        return new FastJsonConverter(serializeConfig);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return new RequestBodyConverter<>(serializeConfig);
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new ResponseBodyConverter<>(type);
    }
}
