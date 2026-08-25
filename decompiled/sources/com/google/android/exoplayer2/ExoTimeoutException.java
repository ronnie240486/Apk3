package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public final class ExoTimeoutException extends java.lang.RuntimeException {
    public static final int TIMEOUT_OPERATION_DETACH_SURFACE = 3;
    public static final int TIMEOUT_OPERATION_RELEASE = 1;
    public static final int TIMEOUT_OPERATION_SET_FOREGROUND_MODE = 2;
    public static final int TIMEOUT_OPERATION_UNDEFINED = 0;
    public final int timeoutOperation;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TimeoutOperation {
    }

    public ExoTimeoutException(int r2) {
            r1 = this;
            java.lang.String r0 = getErrorMessage(r2)
            r1.<init>(r0)
            r1.timeoutOperation = r2
            return
    }

    private static java.lang.String getErrorMessage(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "Undefined timeout."
            return r1
        Lc:
            java.lang.String r1 = "Detaching surface timed out."
            return r1
        Lf:
            java.lang.String r1 = "Setting foreground mode timed out."
            return r1
        L12:
            java.lang.String r1 = "Player release timed out."
            return r1
    }
}
