package com.face.livechat.vcall.gopu_macfsdfdghb;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
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

public class gopu_bakito extends AppCompatActivity implements View.OnClickListener {
    TextView detailsloan;
    ProgressDialog progressBar;
    TextView tvTitle;
    ImageView ivBack;
    private ImageView imgAutoLoan;
    private ImageView imgBusinessLoan;
    private ImageView imgHomeLoan;
    private ImageView imgMortgages;
    private ImageView imgPaydayLoan;
    private ImageView imgPersonalLoan;
    private ImageView imgSmallBusiness;
    private ImageView imgStudentLoan;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.saturday_special_gun);


        IntertitialAdsEvent.CallInterstitial(this);
        IntertitialAdsEvent.ShowInterstitialAdsOnCreate(this);
        AllNativeAds.NativeBanner(this, findViewById(R.id.adsContainer));

        ivBack = findViewById(R.id.id_ivBack);
        tvTitle = findViewById(R.id.id_tvTitle);

        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.loan_information);

        detailsloan = findViewById(R.id.detailsloan);

        imgPersonalLoan = (ImageView) findViewById(R.id.imgPersonalLoan);
        imgAutoLoan = (ImageView) findViewById(R.id.imgAutoLoan);
        imgHomeLoan = (ImageView) findViewById(R.id.imgHomeLoan);
        imgBusinessLoan = (ImageView) findViewById(R.id.imgBusinessLoan);
        imgStudentLoan = (ImageView) findViewById(R.id.imgStudentLoan);
        imgMortgages = (ImageView) findViewById(R.id.imgMortgages);
        imgPaydayLoan = (ImageView) findViewById(R.id.imgPaydayLoan);
        imgSmallBusiness = (ImageView) findViewById(R.id.imgSmallBusiness);

        imgPersonalLoan.setOnClickListener(this);
        imgAutoLoan.setOnClickListener(this);
        imgHomeLoan.setOnClickListener(this);
        imgBusinessLoan.setOnClickListener(this);
        imgStudentLoan.setOnClickListener(this);
        imgMortgages.setOnClickListener(this);
        imgPaydayLoan.setOnClickListener(this);
        imgSmallBusiness.setOnClickListener(this);

        if (Loan_MBit.SFLoanTPPP == gopu_ghare.HOME_LOAN) {
            detailsloan.setText(R.string.homeloandata);
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.AUTO_LOAN) {
            detailsloan.setText(R.string.autoloandata);
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.BUSINESS_LOAN) {
            detailsloan.setText(R.string.bussinessloandata);
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.MORTGAGES) {
            detailsloan.setText(R.string.moratagesdata);
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.PAYDAY_LOAN) {
            detailsloan.setText(R.string.paydayloandata);
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.PERSONAL_LOAN) {
            detailsloan.setText(R.string.personaldata);
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.SMALL_BUSINESS) {
            detailsloan.setText(R.string.smallbusinessdata);
        } else if (Loan_MBit.SFLoanTPPP == gopu_ghare.STUDENT_LOAN) {
            detailsloan.setText(R.string.studentloandata);
        }
    }


    public void ironfullscreen(final int i) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressBar = progressDialog;
        progressDialog.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();

        gopu_bakito.this.progressBar.dismiss();
        gopu_bakito.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            startActivity(new Intent(this, gopu_dada.class));
        } else if (i == 2) {
            startActivity(new Intent(this, gopu_dada.class));
        } else if (i == 3) {
            startActivity(new Intent(this, gopu_dada.class));
        } else if (i == 4) {
            startActivity(new Intent(this, gopu_dada.class));
        } else if (i == 5) {
            startActivity(new Intent(this, gopu_dada.class));
        } else if (i == 6) {
            startActivity(new Intent(this, gopu_dada.class));
        } else if (i == 7) {
            startActivity(new Intent(this, gopu_dada.class));
        } else if (i == 8) {
            startActivity(new Intent(this, gopu_dada.class));
        }
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
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);
    }
}
