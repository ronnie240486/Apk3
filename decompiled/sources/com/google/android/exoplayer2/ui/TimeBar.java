package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(com.google.android.exoplayer2.ui.TimeBar r1, long r2);

        void onScrubStart(com.google.android.exoplayer2.ui.TimeBar r1, long r2);

        void onScrubStop(com.google.android.exoplayer2.ui.TimeBar r1, long r2, boolean r4);
    }

    void addListener(com.google.android.exoplayer2.ui.TimeBar.OnScrubListener r1);

    long getPreferredUpdateDelay();

    void removeListener(com.google.android.exoplayer2.ui.TimeBar.OnScrubListener r1);

    void setAdGroupTimesMs(@androidx.annotation.Nullable long[] r1, @androidx.annotation.Nullable boolean[] r2, int r3);

    void setBufferedPosition(long r1);

    void setDuration(long r1);

    void setEnabled(boolean r1);

    void setKeyCountIncrement(int r1);

    void setKeyTimeIncrement(long r1);

    void setPosition(long r1);
}
