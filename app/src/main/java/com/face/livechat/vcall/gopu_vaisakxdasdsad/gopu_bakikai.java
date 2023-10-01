package com.face.livechat.vcall.gopu_vaisakxdasdsad;

import android.annotation.SuppressLint;
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
import com.face.livechat.vcall.gopu_fagansds.gopu_ghare;
import com.face.livechat.vcall.gopu_bhadaravodsd.gopu_dada;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;
import com.face.livechat.vcall.gopu_ratksdzsx.Loan_MBit;




@SuppressLint("WrongConstant")

public class gopu_bakikai extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActLoanTypes";


    public int f46i = 0;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private ImageView imgAutoLoan;
    private ImageView imgBusinessLoan;
    private ImageView imgHomeLoan;
    private ImageView imgMortgages;
    private ImageView imgPaydayLoan;
    private ImageView imgPersonalLoan;
    private ImageView imgSmallBusiness;
    private ImageView imgStudentLoan;

    private boolean isOnline() {
        @SuppressLint("MissingPermission") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_ram);


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
                    gopu_bakikai.this.progressDialog.isShowing();
                    gopu_bakikai.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        imgPersonalLoan = (ImageView) findViewById(R.id.imgPersonalLoan);
        imgAutoLoan = (ImageView) findViewById(R.id.imgAutoLoan);
        imgHomeLoan = (ImageView) findViewById(R.id.imgHomeLoan);
        imgBusinessLoan = (ImageView) findViewById(R.id.imgBusinessLoan);
        imgStudentLoan = (ImageView) findViewById(R.id.imgStudentLoan);
        imgMortgages = (ImageView) findViewById(R.id.imgMortgages);
        imgPaydayLoan = (ImageView) findViewById(R.id.imgPaydayLoan);
        imgSmallBusiness = (ImageView) findViewById(R.id.imgSmallBusiness);
        ivBack = findViewById(R.id.id_ivBack);
        tvTitle = findViewById(R.id.id_tvTitle);

        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.loan_type);


        imgPersonalLoan.setOnClickListener(this);
        imgAutoLoan.setOnClickListener(this);
        imgHomeLoan.setOnClickListener(this);
        imgBusinessLoan.setOnClickListener(this);
        imgStudentLoan.setOnClickListener(this);
        imgMortgages.setOnClickListener(this);
        imgPaydayLoan.setOnClickListener(this);
        imgSmallBusiness.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgAutoLoan:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.AUTO_LOAN;
                    ironfullscreen(2);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.AUTO_LOAN;
                click(2);
                return;
            case R.id.imgBusinessLoan:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.BUSINESS_LOAN;
                    ironfullscreen(4);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.BUSINESS_LOAN;
                click(4);
                return;
            case R.id.imgHomeLoan:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.HOME_LOAN;
                    ironfullscreen(3);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.HOME_LOAN;
                click(3);
                return;

            case R.id.imgMortgages:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.MORTGAGES;
                    ironfullscreen(6);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.MORTGAGES;
                click(6);
                return;
            case R.id.imgPaydayLoan:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.PAYDAY_LOAN;
                    ironfullscreen(7);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.PAYDAY_LOAN;
                click(7);
                return;
            case R.id.imgPersonalLoan:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.PERSONAL_LOAN;
                    ironfullscreen(1);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.PERSONAL_LOAN;
                click(1);
                return;
            case R.id.imgSmallBusiness:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.SMALL_BUSINESS;
                    ironfullscreen(8);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.SMALL_BUSINESS;
                click(8);
                return;
            case R.id.imgStudentLoan:
                gopu_fas.gclick++;
                if (gopu_fas.gclick % gopu_fas.click == 0) {
                    Loan_MBit.SFLoanTPPP = gopu_ghare.STUDENT_LOAN;
                    ironfullscreen(5);
                    return;
                }
                Loan_MBit.SFLoanTPPP = gopu_ghare.STUDENT_LOAN;
                click(5);
                return;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        this.progressBar.setMessage("Ads Loading ...");
        this.progressBar.setProgressStyle(0);
        this.progressBar.show();
        gopu_bakikai.this.progressBar.dismiss();
        gopu_bakikai.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        } else if (i == 2) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        } else if (i == 3) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        } else if (i == 4) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        } else if (i == 5) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        } else if (i == 6) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        } else if (i == 7) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        } else if (i == 8) {
            startActivity(new Intent(this, gopu_dada.class));
//            finish();
        }
    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);
    }
}
