package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public class DataSourceException extends java.io.IOException {

    @java.lang.Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int r1) {
            r0 = this;
            r0.<init>()
            r0.reason = r1
            return
    }

    public DataSourceException(@androidx.annotation.Nullable java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.reason = r2
            return
    }

    public DataSourceException(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.reason = r3
            return
    }

    public DataSourceException(@androidx.annotation.Nullable java.lang.Throwable r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.reason = r2
            return
    }

    public static boolean isCausedByPositionOutOfRange(java.io.IOException r2) {
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof com.google.android.exoplayer2.upstream.DataSourceException
            if (r0 == 0) goto L11
            r0 = r2
            com.google.android.exoplayer2.upstream.DataSourceException r0 = (com.google.android.exoplayer2.upstream.DataSourceException) r0
            int r0 = r0.reason
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
    }
}
