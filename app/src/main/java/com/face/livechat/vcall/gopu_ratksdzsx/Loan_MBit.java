package com.face.livechat.vcall.gopu_ratksdzsx;

import android.content.Context;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.sdk.ads.SdkAppController;
import com.face.livechat.vcall.gopu_fagansds.gopu_moru;
import com.face.livechat.vcall.gopu_fagansds.gopu_ghare;
import com.face.livechat.vcall.gopu_fagansds.gopu_moriya;
import com.face.livechat.vcall.gopu_fagansds.gopu_chacha;


public class Loan_MBit extends SdkAppController {
    public static final String TAG = "MyApplicationClass";
    public static Loan_MBit Loan_MBit;
    public static Context context = null;
    public static gopu_moru SFLoanDB = null;
    public static boolean isDownloaded = false;
    public static gopu_ghare SFLoanTPPP;
    private RequestQueue mRequestQueue;


    public static synchronized Loan_MBit getInstance() {
        Loan_MBit SFLoanMBit;
        synchronized (Loan_MBit.class) {
            SFLoanMBit = Loan_MBit;
        }
        return SFLoanMBit;
    }

    public static Context getContext() {
        return context;
    }

    public void onCreate() {
        super.onCreate();
        Loan_MBit = this;
        context = getApplicationContext();
        gopu_chacha.sharedPreferences();
        if (!gopu_chacha.sharedPreferences().contains("spin")) {
            gopu_chacha.editorString("spin", gopu_chacha.SPIN);
        }
        SFLoanDB = new gopu_moru(getApplicationContext());
        gopu_moriya.setDefaultFont(this, "DEFAULT", "fonts/MyFont.ttf");
        gopu_moriya.setDefaultFont(this, "MONOSPACE", "fonts/MyFont.ttf");
        gopu_moriya.setDefaultFont(this, "SERIF", "fonts/MyFont.ttf");
        gopu_moriya.setDefaultFont(this, "SANS_SERIF", "fonts/MyFont.ttf");
    }

    public RequestQueue getRequestQueue() {
        if (this.mRequestQueue == null) {
            this.mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return this.mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request, String str) {
        if (TextUtils.isEmpty(str)) {
            str = TAG;
        }
        request.setTag(str);
        getRequestQueue().add(request);
    }

    public <T> void addToRequestQueue(Request<T> request) {
        request.setTag(TAG);
        getRequestQueue().add(request);
    }

    public void cancelPendingRequests(Object obj) {
        RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            requestQueue.cancelAll(obj);
        }
    }


}
