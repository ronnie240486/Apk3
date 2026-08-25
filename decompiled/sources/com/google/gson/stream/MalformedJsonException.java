package com.google.gson.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class MalformedJsonException extends java.io.IOException {
    private static final long serialVersionUID = 1;

    public MalformedJsonException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MalformedJsonException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1)
            r0.initCause(r2)
            return
    }

    public MalformedJsonException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.initCause(r1)
            return
    }
}
