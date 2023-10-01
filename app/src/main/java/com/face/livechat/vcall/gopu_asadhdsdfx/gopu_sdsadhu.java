package com.face.livechat.vcall.gopu_asadhdsdfx;

import android.annotation.SuppressLint;
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

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.face.livechat.vcall.gopu_jethaacfdf.gopu_nana;
import com.face.livechat.vcall.gopu_fagansds.gopu_moriya;
import com.face.livechat.vcall.gopu__poshaxazx.gopu_dfdf;
import com.face.livechat.vcall.gopu__poshaxazx.gopu_mydcs;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;
import com.face.livechat.vcall.gopu_ratksdzsx.Loan_MBit;
import com.face.livechat.vcall.gopu_vaisakxdasdsad.gopu_melnyrey;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressLint("WrongConstant")

public class gopu_sdsadhu extends AppCompatActivity {
    private static final String TAG = "ActInstantLoanTypes";
    public static ArrayList<gopu_dfdf> resultData;

    public int f46i = 0;
    FrameLayout frameLayout;
    RecyclerView loan_list;
    LinearLayout id_ll_dataNotFound;
    LinearLayout lottie_anim;
    ImageView imageView;
    ProgressDialog progressBar;
    View.OnClickListener onClickListener = new View.OnClickListener() {

        public void onClick(View view) {
            gopu_fas.gclick++;
            if (gopu_fas.gclick % gopu_fas.click == 0) {
                gopu_sdsadhu.this.ironfullscreen(1);
                int intValue = ((Integer) view.getTag()).intValue();
                Intent intent = new Intent(gopu_sdsadhu.this.getApplicationContext(), gopu_ssfasfsfsff.class);
                intent.putExtra(gopu_ssfasfsfsff.Data, gopu_sdsadhu.resultData.get(intValue));
                gopu_sdsadhu.this.startActivity(intent);
                return;
            }
            int intValue2 = ((Integer) view.getTag()).intValue();
            Intent intent2 = new Intent(gopu_sdsadhu.this.getApplicationContext(), gopu_ssfasfsfsff.class);
            intent2.putExtra(gopu_ssfasfsfsff.Data, gopu_sdsadhu.resultData.get(intValue2));
            gopu_sdsadhu.this.startActivity(intent2);
        }
    };
    ProgressDialog progressDialog;

    private boolean isOnline() {
        @SuppressLint("WrongConstant") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_jay_kapis);


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
                    gopu_sdsadhu.this.progressDialog.isShowing();
                    gopu_sdsadhu.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        loan_list = (RecyclerView) findViewById(R.id.loan_list);
        id_ll_dataNotFound = findViewById(R.id.id_llNotFound);
        lottie_anim = findViewById(R.id.lottie_anim);
//        MS_CommonClass.toolbar(this, "Speed Loan Coach", false);
        if (gopu_moriya.isNetworkConnected(getApplicationContext())) {
            getList();
        }

    }

    public void setData() {

        loan_list.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        loan_list.setAdapter(new gopu_nana(getApplicationContext(), resultData, this.onClickListener));
        if (resultData.size() == 0) {
            loan_list.setVisibility(View.VISIBLE);
            id_ll_dataNotFound.setVisibility(View.GONE);
        } else {
            loan_list.setVisibility(View.GONE);
            id_ll_dataNotFound.setVisibility(View.GONE);
            lottie_anim.setVisibility(View.VISIBLE);
        }
    }

    public void getList() {
        gopu_moriya.progressDialogShow(this);
        Loan_MBit.getInstance().addToRequestQueue(new StringRequest(0, "http://androidsolution.xyz/folder/aadharloan/listapp.json", new Response.Listener<String>() {

            public void onResponse(String str) {
                try {
                    gopu_sdsadhu.resultData = (ArrayList) gopu_mydcs.parseJSON(str).getResultData();

                    gopu_sdsadhu.this.setData();
                } catch (Exception unused) {
                }
                gopu_moriya.progressDialogDismiss();
            }
        }, new Response.ErrorListener() {

            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                gopu_moriya.progressDialogDismiss();
            }
        }) {

            @Override // com.android.volley.Request
            public Map<String, String> getParams() {
                HashMap hashMap = new HashMap();
                return checkParams(hashMap);
            }

            private Map<String, String> checkParams(Map<String, String> map) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getValue() == null) {
                        map.put(entry.getKey(), "");
                    }
                }
                return map;
            }
        }, "FORGOT PASSWORD");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
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

        gopu_sdsadhu.this.progressBar.dismiss();
    }

    public void click(int i) {
        if (i != 1 && i == 2) {
            startActivity(new Intent(this, gopu_melnyrey.class));
        }
    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);
    }
}
