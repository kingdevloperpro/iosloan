package com.sdk.ads.client;

import com.sdk.ads.ResModel.MainResModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("getApps/gopal/Money_Loan_Coach/fhyu/getData.json")
    Call<MainResModel> doGetListData();

    @GET("getApps/gopal/Money_Loan_Coach/fhyu/getData2.json")
    Call<MainResModel> doGetListData2();

    @GET("getApps/gopal/Money_Loan_Coach/fhyu/getData.json")
    Call<MainResModel> doGetListData_Def();

}
