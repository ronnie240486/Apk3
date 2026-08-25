package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes.dex */
public interface Downloader {

    /* JADX INFO: loaded from: classes3.dex */
    public interface ProgressListener {
        void onProgress(long r1, long r3, float r5);
    }

    void cancel();

    void download(@androidx.annotation.Nullable com.google.android.exoplayer2.offline.Downloader.ProgressListener r1) throws java.io.IOException, java.lang.InterruptedException;

    void remove();
}
