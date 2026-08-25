package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
final class CallbackException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public CallbackException(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Unexpected exception thrown by non-Glide code"
            r1.<init>(r0, r2)
            return
    }
}
