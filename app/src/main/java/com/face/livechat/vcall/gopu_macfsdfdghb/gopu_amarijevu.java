package com.face.livechat.vcall.gopu_macfsdfdghb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.sdk.ads.ads.AllNativeAds;
import com.sdk.ads.ads.IntertitialAdsEvent;
import com.face.livechat.vcall.gopu_fagansds.gopu_moriya;
import com.face.livechat.vcall.R;
import com.face.livechat.vcall.gopu_fas;



@SuppressLint("WrongConstant")

public class gopu_amarijevu extends AppCompatActivity {
    private static final String TAG = "WebViewActivity";
    public Activity activity;
    public int f46i = 0;
    ProgressDialog progressDialog;
    private WebView webView;

    private boolean isOnline() {
        @SuppressLint("MissingPermission") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.saturday_special_sath);


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
                    gopu_amarijevu.this.progressDialog.isShowing();
                    gopu_amarijevu.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        this.activity = this;
        String string = getIntent().getExtras().getString("title");
        String str = gopu_fas.privacy;
        gopu_moriya.toolbar(this.activity, string, false);
        WebView webView2 = (WebView) findViewById(R.id.webView);
        webView = webView2;
        webView2.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(str);
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }
        finish();
        return true;
    }

    @Override
    public void onBackPressed() {
        IntertitialAdsEvent.ShowInterstitialAdsOnBack(this);;
    }
}
