package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedDrmException extends java.lang.Exception {
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    public UnsupportedDrmException(int r1) {
            r0 = this;
            r0.<init>()
            r0.reason = r1
            return
    }

    public UnsupportedDrmException(int r1, java.lang.Exception r2) {
            r0 = this;
            r0.<init>(r2)
            r0.reason = r1
            return
    }
}
