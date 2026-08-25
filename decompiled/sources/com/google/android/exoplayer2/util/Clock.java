package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public interface Clock {
    public static final com.google.android.exoplayer2.util.Clock DEFAULT = null;

    static {
            com.google.android.exoplayer2.util.SystemClock r0 = new com.google.android.exoplayer2.util.SystemClock
            r0.<init>()
            com.google.android.exoplayer2.util.Clock.DEFAULT = r0
            return
    }

    com.google.android.exoplayer2.util.HandlerWrapper createHandler(android.os.Looper r1, @androidx.annotation.Nullable android.os.Handler.Callback r2);

    long currentTimeMillis();

    long elapsedRealtime();

    void onThreadBlocked();

    long uptimeMillis();
}
