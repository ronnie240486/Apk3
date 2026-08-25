package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface TransferListener {
    void onBytesTransferred(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, boolean r3, int r4);

    void onTransferEnd(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, boolean r3);

    void onTransferInitializing(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, boolean r3);

    void onTransferStart(com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, boolean r3);
}
