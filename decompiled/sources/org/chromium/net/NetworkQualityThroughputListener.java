package org.chromium.net;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkQualityThroughputListener {
    private final java.util.concurrent.Executor mExecutor;

    public NetworkQualityThroughputListener(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.mExecutor = r2
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Executor must not be null"
            r2.<init>(r0)
            throw r2
    }

    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    public abstract void onThroughputObservation(int r1, long r2, int r4);
}
