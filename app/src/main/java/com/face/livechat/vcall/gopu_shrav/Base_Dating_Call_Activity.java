package com.face.livechat.vcall.gopu_shrav;

import android.view.View;

import com.face.livechat.vcall.gopu_ratksdzsx.AppPrefs;
import com.face.livechat.vcall.gopu_ratksdzsx.Loan_MBit;

public class Base_Dating_Call_Activity extends VD_CommonActivity {
    public AppPrefs appPrefs;
    public int displayWidth;

    private void hideSystemUI() {
        // Set the IMMERSIVE flag.
        // Set the content to appear under the system bars so that the content
        // doesn't resize when the system bars hide and show.
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }

    private void showSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }



//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }



    @Override
    public void set_onCreate_Common() {

        appPrefs = new AppPrefs(this);

        displayWidth = getWindowManager().getDefaultDisplay().getWidth();
        displayWidth = (displayWidth * 92) / 100;

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        hideSystemUI();
    }

    @Override
    protected void onResume() {
        Loan_MBit.getInstance().context = this;
        super.onResume();
    }

//    @Override
//    public void onBackPressed() {
//        setResult(Activity.RESULT_CANCELED);
//        finish();
//    }



}
