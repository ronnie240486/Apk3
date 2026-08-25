package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends java.io.IOException {
    public final long bytesLoaded;
    public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders;
    public final android.net.Uri uriAfterRedirects;

    public MediaDrmCallbackException(com.google.android.exoplayer2.upstream.DataSpec r1, android.net.Uri r2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3, long r4, java.lang.Throwable r6) {
            r0 = this;
            r0.<init>(r6)
            r0.dataSpec = r1
            r0.uriAfterRedirects = r2
            r0.responseHeaders = r3
            r0.bytesLoaded = r4
            return
    }
}
