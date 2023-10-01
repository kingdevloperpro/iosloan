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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.face.livechat.vcall.gopu_asadhdsdfx.gopu_sdsadhu;
import com.face.livechat.vcall.gopu_jethaacfdf.gopu_tamarijevuny;
import com.face.livechat.vcall.gopu_jethaacfdf.gopu_cheho;
import com.face.livechat.vcall.gopu_fagansds.gopu_ghare;
import com.face.livechat.vcall.gopu_fagansds.gopu_chacha;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;
import com.face.livechat.vcall.gopu_ratksdzsx.Loan_MBit;



import java.util.ArrayList;

@SuppressLint("WrongConstant")

public class gopu_jayho extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActSelectAmount";
    public String emiTerms = "0";
    public int f46i = 0;
    public ArrayList<String> listAmount = new ArrayList<>();
    public ArrayList<String> listTerms = new ArrayList<>();
    public String loanAmount = "0";
    FrameLayout frame11;
    FrameLayout frameLayout;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private Activity activity;
    private gopu_tamarijevuny VBAmountAdapter;
    private LinearLayout btnNext;
    private String emiAmount = "0";
    private GridLayoutManager gridLayoutManager;
    private Intent intent;
    private RecyclerView rvAmount;
    private RecyclerView rvTerms;
    private gopu_cheho VBTermsAdapter;
    private TextView tvEmi;

    private boolean isOnline() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_lok);


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
                    gopu_jayho.this.progressDialog.isShowing();
                    gopu_jayho.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        rvAmount = (RecyclerView) findViewById(R.id.rvAmount);
        rvTerms = (RecyclerView) findViewById(R.id.rvTerms);
        tvEmi = (TextView) findViewById(R.id.tvEmi);
        LinearLayout button = (LinearLayout) findViewById(R.id.btnNext);
        btnNext = button;
        button.setOnClickListener(this);
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(Loan_MBit.SFLoanTPPP.getName());
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this.activity, 3);
        gridLayoutManager = gridLayoutManager2;
        rvAmount.setLayoutManager(gridLayoutManager2);
        addAmount();
        gopu_tamarijevuny VBAmountAdapter2 = new gopu_tamarijevuny(this.activity, this.listAmount, new gopu_tamarijevuny.CustomItemClickListener() {

            @Override
            public void onItemClick(View view, int i) {
                gopu_jayho VBActSelectAmount = gopu_jayho.this;
                VBActSelectAmount.loanAmount = VBActSelectAmount.listAmount.get(i);
                gopu_jayho.this.calculateEmiAmount();
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
                gopu_jayho VBActSelectAmount = gopu_jayho.this;
                VBActSelectAmount.emiTerms = VBActSelectAmount.listTerms.get(i);
                gopu_jayho.this.calculateEmiAmount();
            }
        });
        VBTermsAdapter = VBTermsAdapter2;
        rvTerms.setAdapter(VBTermsAdapter2);
        loanAmount = this.listAmount.get(0);
        emiTerms = this.listTerms.get(0);
        calculateEmiAmount();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnNext) {
            gopu_fas.gclick++;
            if (gopu_fas.gclick % gopu_fas.click == 0) {
                gopu_chacha.editorString("loanAmount", this.loanAmount);
                gopu_chacha.editorString("emiTerms", this.emiTerms);
                gopu_chacha.editorString("emiAmount", this.emiAmount);
                ironfullscreen(1);
                return;
            }
            gopu_chacha.editorString("loanAmount", this.loanAmount);
            gopu_chacha.editorString("emiTerms", this.emiTerms);
            gopu_chacha.editorString("emiAmount", this.emiAmount);
            click(1);
        }
    }

    public void calculateEmiAmount() {
        double parseDouble = Double.parseDouble(this.loanAmount) / Double.parseDouble(this.emiTerms);
        TextView textView = this.tvEmi;
        textView.setText("Monthly EMI Amount is Rs." + String.format("%.2f", Double.valueOf(parseDouble)));
        this.emiAmount = String.format("%.2f", Double.valueOf(parseDouble));
    }

    public void addAmount() {
        if (Loan_MBit.SFLoanTPPP == gopu_ghare.PERSONAL_LOAN) {
            listAmount.add("1000");
            listAmount.add("5000");
            listAmount.add("10000");
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("150000");
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.AUTO_LOAN) {
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("200000");
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.HOME_LOAN) {
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
            listAmount.add("2000000");
            listAmount.add("3000000");
            listAmount.add("5000000");
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.BUSINESS_LOAN) {
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
            listAmount.add("2000000");
            listAmount.add("3000000");
            listAmount.add("5000000");
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.STUDENT_LOAN) {
            listAmount.add("10000");
            listAmount.add("20000");
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("200000");
            listAmount.add("500000");
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.MORTGAGES) {
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
            listAmount.add("2000000");
            listAmount.add("3000000");
            listAmount.add("5000000");
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.PAYDAY_LOAN) {
            listAmount.add("1000");
            listAmount.add("5000");
            listAmount.add("10000");
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("150000");
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.SMALL_BUSINESS) {
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("150000");
            listAmount.add("200000");
            listAmount.add("350000");
            listAmount.add("500000");
        }
    }


    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();

        gopu_jayho.this.progressBar.dismiss();
        gopu_jayho.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, gopu_sdsadhu.class);
            intent = intent2;
            startActivity(intent2);
        }
    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);

    }
}
