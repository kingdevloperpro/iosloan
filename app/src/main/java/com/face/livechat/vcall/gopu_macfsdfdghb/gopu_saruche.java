package com.face.livechat.vcall.gopu_macfsdfdghb;

import android.os.SystemClock;
import android.view.View;

public abstract class gopu_saruche implements View.OnClickListener {

    protected int defaultInterval;
    private long lastTimeClicked = 0;

    public gopu_saruche() {
        this(1000);
    }

    public gopu_saruche(int minInterval) {
        this.defaultInterval = minInterval;
    }

    @Override
    public void onClick(View v) {
        if (SystemClock.elapsedRealtime() - lastTimeClicked < defaultInterval) {
            return;
        }
        lastTimeClicked = SystemClock.elapsedRealtime();
        performClick(v);
    }

    public abstract void performClick(View v);
}