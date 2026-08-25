package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface TimeToFirstByteEstimator {
    long getTimeToFirstByteEstimateUs();

    void onTransferInitializing(com.google.android.exoplayer2.upstream.DataSpec r1);

    void onTransferStart(com.google.android.exoplayer2.upstream.DataSpec r1);

    void reset();
}
