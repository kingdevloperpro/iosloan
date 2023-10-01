package com.face.livechat.vcall.gopu_chtr;

import retrofit2.Call;
import retrofit2.http.GET;

public interface gopu_mama {
    @GET("json")
    Call<gopu_kaka> getLocation();
}