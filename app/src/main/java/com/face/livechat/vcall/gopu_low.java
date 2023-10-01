package com.face.livechat.vcall;

import android.os.SystemClock;
import android.view.View;

public abstract class gopu_low implements View.OnClickListener {

    protected int defaultInterval;
    private long lastTimeClicked = 0;

    public gopu_low() {
        this(1000);
    }

    public gopu_low(int minInterval) {
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