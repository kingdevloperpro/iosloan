package com.face.livechat.vcall.gopu_ratksdzsx;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SettingInterface {
    @GET("getApps/gopal/Money_Loan_Coach/fhyu/setting.json")
    Call<Setting> getSetting();
}