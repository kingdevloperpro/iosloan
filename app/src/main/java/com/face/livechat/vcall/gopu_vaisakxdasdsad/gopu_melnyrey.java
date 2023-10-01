package com.face.livechat.vcall.gopu_vaisakxdasdsad;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.face.livechat.vcall.gopu_asadhdsdfx.gopu_sdsadhu;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;

@SuppressLint("WrongConstant")

public class gopu_melnyrey extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActInstantCash";

    public Activity activity;
    public int f46i = 0;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private TextView btnApplyNow;
    private Intent intent;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_sukham);


        IntertitialAdsEvent.CallInterstitial(this);
        IntertitialAdsEvent.ShowInterstitialAdsOnCreate(this);
        AllNativeAds.NativeBanner(this, findViewById(R.id.adsContainer));
        


        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    gopu_melnyrey.this.progressDialog.isShowing();
                    gopu_melnyrey.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        TextView button = (TextView) findViewById(R.id.btnApplyNow);
        btnApplyNow = button;
        button.setOnClickListener(this);

        ivBack = findViewById(R.id.id_ivBack);
        tvTitle = findViewById(R.id.id_tvTitle);

        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText("Loan Amount");

    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnApplyNow) {
            gopu_fas.gclick++;
            if (gopu_fas.gclick % gopu_fas.click == 0) {
                ironfullscreen(1);
            } else {
                click(1);
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();
        gopu_melnyrey.this.progressBar.dismiss();
        gopu_melnyrey.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, gopu_sdsadhu.class);
            intent = intent2;
            startActivity(intent2);
        } else if (i == 2) {
            startActivity(new Intent(this, gopu_pan.class));
        }
    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);
    }
}
