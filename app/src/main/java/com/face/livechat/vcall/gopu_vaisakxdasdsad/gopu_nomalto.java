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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.face.livechat.vcall.gopu_jethaacfdf.gopu_bakitamaru;
import com.face.livechat.vcall.gopu__poshaxazx.gopu_hellodasA;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;
import com.face.livechat.vcall.gopu_ratksdzsx.Loan_MBit;

import java.util.ArrayList;

@SuppressLint("WrongConstant")

public class gopu_nomalto extends AppCompatActivity {
    private static final String TAG = "ActLoanStatus";

    public Activity activity;
    public int f46i = 0;
    public Intent intent;
    FrameLayout frame11;
    FrameLayout frameLayout;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private LinearLayout btnApply;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<gopu_hellodasA> list = new ArrayList<>();
    private LinearLayout llNoLoan;
    private gopu_bakitamaru VBLoanStatusAdapter;
    private RecyclerView recyclerView;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_dut);


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
                    gopu_nomalto.this.progressDialog.isShowing();
                    gopu_nomalto.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        this.activity = this;
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        llNoLoan = (LinearLayout) findViewById(R.id.llNoLoan);
        btnApply = (LinearLayout) findViewById(R.id.btnApply);
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.loan_status);

        ArrayList<gopu_hellodasA> arrayList = (ArrayList) Loan_MBit.SFLoanDB.getAllLoan();
        this.list = arrayList;
        if (arrayList.size() == 0) {
            this.llNoLoan.setVisibility(0);
        } else {
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.activity);
            linearLayoutManager = linearLayoutManager2;
            recyclerView.setLayoutManager(linearLayoutManager2);
            gopu_bakitamaru VBLoanStatusAdapter2 = new gopu_bakitamaru(this.activity, this.list);
            VBLoanStatusAdapter = VBLoanStatusAdapter2;
            recyclerView.setAdapter(VBLoanStatusAdapter2);
        }
        this.btnApply.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    gopu_nomalto.this.ironfullscreen(1);
                } else {
                    gopu_nomalto.this.click(1);
                }
            }
        });
    }


    public void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        this.progressBar.setMessage("Ads Loading ...");
        this.progressBar.setProgressStyle(0);
        this.progressBar.show();
        gopu_nomalto.this.progressBar.dismiss();
        gopu_nomalto.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, gopu_bakikai.class);
            this.intent = intent2;
            startActivity(intent2);
//            finish();
        }

    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);
    }
}
