package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class GlideUrl implements com.bumptech.glide.load.Key {
    private static final java.lang.String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%;$";

    @androidx.annotation.Nullable
    private volatile byte[] cacheKeyBytes;
    private int hashCode;
    private final com.bumptech.glide.load.model.Headers headers;

    @androidx.annotation.Nullable
    private java.lang.String safeStringUrl;

    @androidx.annotation.Nullable
    private java.net.URL safeUrl;

    @androidx.annotation.Nullable
    private final java.lang.String stringUrl;

    @androidx.annotation.Nullable
    private final java.net.URL url;

    public GlideUrl(java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.load.model.Headers r0 = com.bumptech.glide.load.model.Headers.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    public GlideUrl(java.lang.String r2, com.bumptech.glide.load.model.Headers r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.url = r0
            java.lang.String r2 = com.bumptech.glide.util.Preconditions.checkNotEmpty(r2)
            r1.stringUrl = r2
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.load.model.Headers r2 = (com.bumptech.glide.load.model.Headers) r2
            r1.headers = r2
            return
    }

    public GlideUrl(java.net.URL r2) {
            r1 = this;
            com.bumptech.glide.load.model.Headers r0 = com.bumptech.glide.load.model.Headers.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    public GlideUrl(java.net.URL r1, com.bumptech.glide.load.model.Headers r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            java.net.URL r1 = (java.net.URL) r1
            r0.url = r1
            r1 = 0
            r0.stringUrl = r1
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            com.bumptech.glide.load.model.Headers r1 = (com.bumptech.glide.load.model.Headers) r1
            r0.headers = r1
            return
    }

    private byte[] getCacheKeyBytes() {
            r2 = this;
            byte[] r0 = r2.cacheKeyBytes
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.getCacheKey()
            java.nio.charset.Charset r1 = com.bumptech.glide.load.Key.CHARSET
            byte[] r0 = r0.getBytes(r1)
            r2.cacheKeyBytes = r0
        L10:
            byte[] r0 = r2.cacheKeyBytes
            return r0
    }

    private java.lang.String getSafeStringUrl() {
            r2 = this;
            java.lang.String r0 = r2.safeStringUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.stringUrl
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1c
            java.net.URL r0 = r2.url
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            java.net.URL r0 = (java.net.URL) r0
            java.lang.String r0 = r0.toString()
        L1c:
            java.lang.String r1 = "@#&=*+-_.,:!?()/~'%;$"
            java.lang.String r0 = android.net.Uri.encode(r0, r1)
            r2.safeStringUrl = r0
        L24:
            java.lang.String r0 = r2.safeStringUrl
            return r0
    }

    private java.net.URL getSafeUrl() throws java.net.MalformedURLException {
            r2 = this;
            java.net.URL r0 = r2.safeUrl
            if (r0 != 0) goto Lf
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r2.getSafeStringUrl()
            r0.<init>(r1)
            r2.safeUrl = r0
        Lf:
            java.net.URL r0 = r2.safeUrl
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.model.GlideUrl
            r1 = 0
            if (r0 == 0) goto L20
            com.bumptech.glide.load.model.GlideUrl r4 = (com.bumptech.glide.load.model.GlideUrl) r4
            java.lang.String r0 = r3.getCacheKey()
            java.lang.String r2 = r4.getCacheKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L20
            com.bumptech.glide.load.model.Headers r0 = r3.headers
            com.bumptech.glide.load.model.Headers r4 = r4.headers
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L20
            r1 = 1
        L20:
            return r1
    }

    public java.lang.String getCacheKey() {
            r1 = this;
            java.lang.String r0 = r1.stringUrl
            if (r0 == 0) goto L5
            goto L11
        L5:
            java.net.URL r0 = r1.url
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            java.net.URL r0 = (java.net.URL) r0
            java.lang.String r0 = r0.toString()
        L11:
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            r1 = this;
            com.bumptech.glide.load.model.Headers r0 = r1.headers
            java.util.Map r0 = r0.getHeaders()
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.getCacheKey()
            int r0 = r0.hashCode()
            r2.hashCode = r0
            int r0 = r0 * 31
            com.bumptech.glide.load.model.Headers r1 = r2.headers
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.hashCode = r1
        L19:
            int r0 = r2.hashCode
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getCacheKey()
            return r0
    }

    public java.lang.String toStringUrl() {
            r1 = this;
            java.lang.String r0 = r1.getSafeStringUrl()
            return r0
    }

    public java.net.URL toURL() throws java.net.MalformedURLException {
            r1 = this;
            java.net.URL r0 = r1.getSafeUrl()
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = r1.getCacheKeyBytes()
            r2.update(r0)
            return
    }
}
