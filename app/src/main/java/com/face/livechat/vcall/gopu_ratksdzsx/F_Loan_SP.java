package com.face.livechat.vcall.gopu_ratksdzsx;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.sdk.ads.Comman;
import com.sdk.ads.LocalSave.Common;
import com.sdk.ads.ads.SplashBetaAds;
import com.sdk.ads.ads.TransferClass;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_vaisakxdasdsad.gopu_pan;
import com.face.livechat.vcall.gopu_shrav.SelectLanguage_Activity;

public class F_Loan_SP extends SplashBaseActivity {

    public  static int int_Language=1;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_tuhi);


    }

    @SuppressLint("SuspiciousIndentation")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (!isDevMode())
        getSetting();
    }



    public SharedPreferences getPrefs() {
        return getSharedPreferences(Common.SHARED_PREFS, MODE_PRIVATE);
    }

    public void moveToNext() {

        if (Common.isNetworkConnected(F_Loan_SP.this)) {
            try {
                SplashBetaAds.ShowInterstitialAd(this, () -> {
                    if (Comman.mainResModel.getData().getExtraFields().getExtraNewScreen().equalsIgnoreCase("on")) {
                        int_Language=1;
                        Intent intent = new Intent(F_Loan_SP.this, SelectLanguage_Activity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        TransferClass.setToNextActivity(F_Loan_SP.this, gopu_pan.class);

                    }
                });
            } catch (Exception e) {
                SplashBetaAds.ShowInterstitialAd(this, () -> {
                    if (Comman.mainResModel.getData().getExtraFields().getExtraNewScreen().equalsIgnoreCase("on")) {
                        int_Language=1;
                        Intent intent = new Intent(F_Loan_SP.this, SelectLanguage_Activity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        TransferClass.setToNextActivity(F_Loan_SP.this, gopu_pan.class);
                    }
                });
            }
        } else {
            Toast.makeText(this, "No Active Internet/WiFi Connection!", Toast.LENGTH_SHORT).show();
        }
    }
}
