package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class QuicException extends org.chromium.net.NetworkException {
    public QuicException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public abstract int getQuicDetailedErrorCode();
}
