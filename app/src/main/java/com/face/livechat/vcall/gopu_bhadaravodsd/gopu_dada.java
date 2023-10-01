package com.face.livechat.vcall.gopu_bhadaravodsd;

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
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;
import com.face.livechat.vcall.gopu_ratksdzsx.Loan_MBit;



@SuppressLint("WrongConstant")

public class gopu_dada extends AppCompatActivity {
    private static final String TAG = "ActLoanDetails";

    public Activity activity;
    public int f46i = 0;
    public Intent intent;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    ImageView ivBack;
    private LinearLayout btnApplyForLoan;
    private TextView tvDescription;
    private TextView tvName, tvTitle;

    private boolean isOnline() {
        @SuppressLint("WrongConstant") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_sagar);


        IntertitialAdsEvent.CallInterstitial(this);
        IntertitialAdsEvent.ShowInterstitialAdsOnCreate(this);
        AllNativeAds.NativeAdsNew(this, findViewById(R.id.adsContainer));

        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    gopu_dada.this.progressDialog.isShowing();
                    gopu_dada.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.personal_loan);
        tvDescription = (TextView) findViewById(R.id.tvDescription);
        btnApplyForLoan = (LinearLayout) findViewById(R.id.btnApplyForLoan);
        TextView textView = this.tvTitle;
        if (!Loan_MBit.SFLoanTPPP.getName().equals("")) {
            textView.setText(Loan_MBit.SFLoanTPPP.getName() + " Information");
        }
        tvDescription.setText(Loan_MBit.SFLoanTPPP.getDescription());
        btnApplyForLoan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    gopu_dada.this.ironfullscreen(1);
                } else {
                    gopu_dada.this.click(1);
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();

        gopu_dada.this.progressBar.dismiss();
        gopu_dada.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, gopu_jayho.class);
            this.intent = intent2;
            startActivity(intent2);
        }
    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);
    }
}
