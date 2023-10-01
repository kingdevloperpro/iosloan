package com.face.livechat.vcall.gopu_vaisakxdasdsad;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.sdk.ads.Comman;
import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.sdk.ads.ads.MoreAppUtils;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;
import com.face.livechat.vcall.gopu_fagansds.gopu_moriya;
import com.face.livechat.vcall.gopu_fagansds.gopu_chacha;
import com.face.livechat.vcall.databinding.ExitDialoggBinding;
import com.face.livechat.vcall.gopu_macfsdfdghb.gopu_amarijevu;
import com.face.livechat.vcall.gopu_macfsdfdghb.gopu_nathji;
import com.face.livechat.vcall.gopu_magasharzxcdxcxc.gopu_joilet;
import com.face.livechat.vcall.gopu_magasharzxcdxcxc.gopu_amthoamtho;


@SuppressLint("WrongConstant")

public class gopu_pan extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActMainLayout";
    public Activity activity;
    public int f46i = 0;
    public Intent intent;

    RelativeLayout cvcashcounter;
    boolean isBack = false;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    //back------------------------------------------------------------------------------------------
    boolean doubleBackToExitPressedOnce = false;
    private LinearLayout cvBankBalance;
    private RelativeLayout cvInstantCash;
    private LinearLayout cvLoanStatus;
    private RelativeLayout cvLoanTypes;
    private ImageView cvLuckySpinner;
    private ImageView cvVideoStatus;
    private LinearLayout ifsc_code;
    private TextView tvAccountName;
    private TextView tvName;
    private TextView tvNumber;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_ujagar);

        activity = this;

        IntertitialAdsEvent.CallInterstitial(this);
        IntertitialAdsEvent.ShowInterstitialAdsOnCreate(this);


//        if (getIntent().getBooleanExtra("app_inter", false)) {
//            IntertitialAdsEvent.ShowInterstitialAdsOnCreate(this);
//        }

        AllNativeAds.NativeAdsNew(this, findViewById(R.id.adsContainer));

        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    gopu_pan.this.progressDialog.isShowing();
                    gopu_pan.this.progressDialog.dismiss();
                }
            }, 3000);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvAccountName = (TextView) findViewById(R.id.tvAccountName);
        ifsc_code = (LinearLayout) findViewById(R.id.ifsc_code);
        cvBankBalance = (LinearLayout) findViewById(R.id.cvBankBalance);
        cvLoanStatus = (LinearLayout) findViewById(R.id.cvLoanStatus);
        cvLoanTypes = (RelativeLayout) findViewById(R.id.cvLoanTypes);
        cvInstantCash = (RelativeLayout) findViewById(R.id.cvInstantCash);
        cvcashcounter = (RelativeLayout) findViewById(R.id.cvcashcounter);
        TextView textView = this.tvAccountName;
        textView.setText("Hello " + gopu_chacha.getName() + "!");
        cvBankBalance.setOnClickListener(this);
        cvLoanStatus.setOnClickListener(this);
        cvLoanTypes.setOnClickListener(this);
        cvInstantCash.setOnClickListener(this);
        cvcashcounter.setOnClickListener(this);
        ifsc_code.setOnClickListener(this);
        findViewById(R.id.cvCalc).setOnClickListener(this);
    }

    public void onClick(View view) {
        if (gopu_moriya.isNetworkConnected(this.activity)) {
            switch (view.getId()) {
                case R.id.cvBankBalance:
                    gopu_fas.gclick++;
                    if (gopu_fas.gclick % gopu_fas.click == 0) {
                        ironfullscreen(6);
                        return;
                    } else {
                        click(6);
                        return;
                    }
                case R.id.cvCalc:
                    gopu_fas.gclick++;
                    if (gopu_fas.gclick % gopu_fas.click == 0) {
                        ironfullscreen(3);
                        return;
                    } else {
                        click(3);
                        return;
                    }
                case R.id.cvInstantCash:
                    gopu_fas.gclick++;
                    if (gopu_fas.gclick % gopu_fas.click == 0) {
                        ironfullscreen(5);
                        return;
                    } else {
                        click(5);
                        return;
                    }
                case R.id.cvLoanStatus:
                    gopu_fas.gclick++;
                    if (gopu_fas.gclick % gopu_fas.click == 0) {
                        ironfullscreen(7);
                        return;
                    } else {
                        click(7);
                        return;
                    }
                case R.id.cvLoanTypes:
                    gopu_fas.gclick++;
                    if (gopu_fas.gclick % gopu_fas.click == 0) {
                        ironfullscreen(1);
                        return;
                    } else {
                        click(1);
                        return;
                    }
                case R.id.cvcashcounter:
                    gopu_fas.gclick++;
                    if (gopu_fas.gclick % gopu_fas.click == 0) {
                        ironfullscreen(15);
                        return;
                    } else {
                        click(15);
                        return;
                    }
                case R.id.ifsc_code:
                    gopu_fas.gclick++;
                    if (gopu_fas.gclick % gopu_fas.click == 0) {
                        ironfullscreen(8);
                        return;
                    } else {
                        click(8);
                        return;
                    }
                default:
                    return;
            }
        } else {
            Toast.makeText(this.activity, getResources().getString(R.string.strNoInternet), 0).show();
        }
    }

    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();
        gopu_pan.this.progressBar.dismiss();
        gopu_pan.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, gopu_bakikai.class);
            this.intent = intent2;
            startActivity(intent2);
        } else if (i == 3) {
            Intent intent3 = new Intent(this.activity, gopu_ho.class);
            this.intent = intent3;
            startActivity(intent3);
        } else if (i == 5) {
            Intent intent4 = new Intent(this.activity, gopu_melnyrey.class);
            this.intent = intent4;
            startActivity(intent4);
        } else if (i == 6) {
            Intent intent5 = new Intent(this.activity, gopu_joilet.class);
            this.intent = intent5;
            startActivity(intent5);
        } else if (i == 7) {
            Intent intent6 = new Intent(this.activity, gopu_nomalto.class);
            this.intent = intent6;
            startActivity(intent6);
        } else if (i == 8) {
            Intent intent7 = new Intent(this.activity, gopu_amthoamtho.class);
            this.intent = intent7;
            startActivity(intent7);
        } else if (i == 10) {
            Intent intent8 = new Intent(this.activity, gopu_nomalto.class);
            this.intent = intent8;
            startActivity(intent8);
        } else if (i == 12) {
            Intent intent9 = new Intent(this.activity, gopu_amarijevu.class);
            this.intent = intent9;
            intent9.putExtra("title", "Terms & Condition");
            this.intent.putExtra("link", gopu_fas.privacy);
            startActivity(this.intent);
        } else if (i == 15) {
            startActivity(new Intent(this, gopu_nathji.class));
        }
    }

    @Override
    public void onBackPressed() {
        if (Comman.mainResModel.getData().getExtraFields().getExtraNewScreen().equalsIgnoreCase("off")) {
            MoreAppUtils.exitDialog(this);
        } else {
            final Dialog dialog = new Dialog(this);
            ExitDialoggBinding binding1 = ExitDialoggBinding.inflate(((Activity) this).getLayoutInflater());
            dialog.setContentView(binding1.getRoot());
            dialog.setCancelable(true);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            AllNativeAds.NativeAdsNew(this, binding1.adsContainer1);
            binding1.done.setOnClickListener(v -> {
                finishAffinity();

            });

            binding1.cancel.setOnClickListener(view -> dialog.dismiss());
            dialog.show();
        }
    }

}
