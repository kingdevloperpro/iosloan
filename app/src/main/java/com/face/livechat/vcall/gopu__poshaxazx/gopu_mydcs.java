package com.face.livechat.vcall.gopu__poshaxazx;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class gopu_mydcs implements Serializable {
    @SerializedName("resultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("resultData")
    @Expose
    private List<gopu_dfdf> resultData = null;
    @SerializedName("totalMoney")
    @Expose
    private Integer totalMoney;

    public static gopu_mydcs parseJSON(String str) {
        return (gopu_mydcs) new GsonBuilder().create().fromJson(str, gopu_mydcs.class);
    }

    public List<gopu_dfdf> getResultData() {
        return this.resultData;
    }

    public void setResultData(List<gopu_dfdf> list) {
        this.resultData = list;
    }

    public Integer getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(Integer num) {
        this.resultCode = num;
    }

    public Integer getTotalMoney() {
        return this.totalMoney;
    }

    public void setTotalMoney(Integer num) {
        this.totalMoney = num;
    }
}
