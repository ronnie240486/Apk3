package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpResponse {

    @androidx.annotation.Nullable
    private final java.io.InputStream mContent;

    @androidx.annotation.Nullable
    private final byte[] mContentBytes;
    private final int mContentLength;
    private final java.util.List<com.android.volley.Header> mHeaders;
    private final int mStatusCode;

    public HttpResponse(int r3, java.util.List<com.android.volley.Header> r4) {
            r2 = this;
            r0 = -1
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public HttpResponse(int r1, java.util.List<com.android.volley.Header> r2, int r3, java.io.InputStream r4) {
            r0 = this;
            r0.<init>()
            r0.mStatusCode = r1
            r0.mHeaders = r2
            r0.mContentLength = r3
            r0.mContent = r4
            r1 = 0
            r0.mContentBytes = r1
            return
    }

    public HttpResponse(int r1, java.util.List<com.android.volley.Header> r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.mStatusCode = r1
            r0.mHeaders = r2
            int r1 = r3.length
            r0.mContentLength = r1
            r0.mContentBytes = r3
            r1 = 0
            r0.mContent = r1
            return
    }

    @androidx.annotation.Nullable
    public final java.io.InputStream getContent() {
            r2 = this;
            java.io.InputStream r0 = r2.mContent
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[] r0 = r2.mContentBytes
            if (r0 == 0) goto L11
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r2.mContentBytes
            r0.<init>(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public final byte[] getContentBytes() {
            r1 = this;
            byte[] r0 = r1.mContentBytes
            return r0
    }

    public final int getContentLength() {
            r1 = this;
            int r0 = r1.mContentLength
            return r0
    }

    public final java.util.List<com.android.volley.Header> getHeaders() {
            r1 = this;
            java.util.List<com.android.volley.Header> r0 = r1.mHeaders
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public final int getStatusCode() {
            r1 = this;
            int r0 = r1.mStatusCode
            return r0
    }
}
