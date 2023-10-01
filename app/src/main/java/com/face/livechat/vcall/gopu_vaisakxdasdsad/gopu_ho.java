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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.face.livechat.vcall.gopu_jethaacfdf.gopu_tamarijevuny;
import com.face.livechat.vcall.gopu_jethaacfdf.gopu_cheho;
import com.face.livechat.vcall.R;



import java.util.ArrayList;

@SuppressLint("WrongConstant")

public class gopu_ho extends AppCompatActivity {
    private static final String TAG = "ActCalc";
    public String emiTerms = "0";
    public int f46i = 0;
    public ArrayList<String> listAmount = new ArrayList<>();
    public ArrayList<String> listTerms = new ArrayList<>();
    public String loanAmount = "0";
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    TextView tvTitle;
    ImageView ivBack;
    private Activity activity;
    private gopu_tamarijevuny VBAmountAdapter;
    private GridLayoutManager gridLayoutManager;
    private RecyclerView rvAmount;
    private RecyclerView rvTerms;
    private gopu_cheho VBTermsAdapter;
    private TextView tvEmi;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_jay);


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
                    gopu_ho.this.progressDialog.isShowing();
                    gopu_ho.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        rvAmount = (RecyclerView) findViewById(R.id.rvAmount);
        rvTerms = (RecyclerView) findViewById(R.id.rvTerms);
        tvEmi = (TextView) findViewById(R.id.tvEmi);
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.personal);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this.activity, 3);
        gridLayoutManager = gridLayoutManager2;
        rvAmount.setLayoutManager(gridLayoutManager2);
        addAmount();
        gopu_tamarijevuny VBAmountAdapter2 = new gopu_tamarijevuny(this.activity, this.listAmount, new gopu_tamarijevuny.CustomItemClickListener() {

            @Override
            public void onItemClick(View view, int i) {
                gopu_ho VBActCalc = gopu_ho.this;
                VBActCalc.loanAmount = VBActCalc.listAmount.get(i);
                gopu_ho.this.calculateEmiAmount();
            }
        });
        VBAmountAdapter = VBAmountAdapter2;
        rvAmount.setAdapter(VBAmountAdapter2);
        GridLayoutManager gridLayoutManager3 = new GridLayoutManager(this.activity, 3);
        gridLayoutManager = gridLayoutManager3;
        rvTerms.setLayoutManager(gridLayoutManager3);
        listTerms.add("3");
        listTerms.add("6");
        listTerms.add("12");
        listTerms.add("24");
        listTerms.add("36");
        listTerms.add("48");
        gopu_cheho VBTermsAdapter2 = new gopu_cheho(this.activity, this.listTerms, new gopu_cheho.CustomItemClickListener() {

            @Override
            public void onItemClick(View view, int i) {
                gopu_ho VBActCalc = gopu_ho.this;
                VBActCalc.emiTerms = VBActCalc.listTerms.get(i);
                gopu_ho.this.calculateEmiAmount();
            }
        });
        VBTermsAdapter = VBTermsAdapter2;
        rvTerms.setAdapter(VBTermsAdapter2);
        loanAmount = this.listAmount.get(0);
        emiTerms = this.listTerms.get(0);
        calculateEmiAmount();
    }

    public void calculateEmiAmount() {
        double parseDouble = Double.parseDouble(this.loanAmount) / Double.parseDouble(this.emiTerms);
        double parseDouble2 = Double.parseDouble(this.emiTerms) * parseDouble;
        double parseDouble3 = Double.parseDouble(this.loanAmount) + parseDouble;
        TextView textView = this.tvEmi;
        textView.setText("Rs." + String.format("%.2f", Double.valueOf(parseDouble)));
        ((TextView) findViewById(R.id.tvTotalEmi)).setText("Rs." + String.format("%.2f", Double.valueOf(parseDouble2)));
        ((TextView) findViewById(R.id.tvTotal)).setText("Rs." + String.format("%.2f", Double.valueOf(parseDouble3)));
    }

    public void addAmount() {
        listAmount.add("5000");
        listAmount.add("10000");
        listAmount.add("15000");
        listAmount.add("25000");
        listAmount.add("35000");
        listAmount.add("50000");
        listAmount.add("75000");
        listAmount.add("100000");
        listAmount.add("500000");
        listAmount.add("1000000");
        listAmount.add("5000000");
        listAmount.add("10000000");
    }


    public void click(int i) {
        if (i == 1) {
            startActivity(new Intent(this, gopu_pan.class));
        }
    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);
    }
}
