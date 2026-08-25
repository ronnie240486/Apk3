package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public interface SequenceableLoader {

    public interface Callback<T extends com.google.android.exoplayer2.source.SequenceableLoader> {
        void onContinueLoadingRequested(T r1);
    }

    boolean continueLoading(long r1);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long r1);
}
