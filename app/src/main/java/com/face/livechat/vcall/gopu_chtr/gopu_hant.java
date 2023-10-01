package com.face.livechat.vcall.gopu_chtr;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class gopu_hant {

    public static final String BASE_URL = "http://ip-api.com/";

    public static gopu_mama getGeoApiService() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(gopu_mama.class);
    }

}
