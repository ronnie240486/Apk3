package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
public final class HttpMediaDrmCallback implements com.google.android.exoplayer2.drm.MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;

    @androidx.annotation.Nullable
    private final java.lang.String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final java.util.Map<java.lang.String, java.lang.String> keyRequestProperties;

    public HttpMediaDrmCallback(@androidx.annotation.Nullable java.lang.String r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public HttpMediaDrmCallback(@androidx.annotation.Nullable java.lang.String r2, boolean r3, com.google.android.exoplayer2.upstream.DataSource.Factory r4) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.dataSourceFactory = r4
            r1.defaultLicenseUrl = r2
            r1.forceDefaultLicenseUrl = r3
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.keyRequestProperties = r2
            return
    }

    private static byte[] executePost(com.google.android.exoplayer2.upstream.DataSource.Factory r8, java.lang.String r9, @androidx.annotation.Nullable byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = new com.google.android.exoplayer2.upstream.StatsDataSource
            com.google.android.exoplayer2.upstream.DataSource r8 = r8.createDataSource()
            r0.<init>(r8)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r8.<init>()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r8.setUri(r9)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r8.setHttpRequestHeaders(r11)
            r9 = 2
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r8.setHttpMethod(r9)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r8.setHttpBody(r10)
            r9 = 1
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = r8.setFlags(r9)
            com.google.android.exoplayer2.upstream.DataSpec r2 = r8.build()
            r8 = 0
            r9 = r2
        L2a:
            com.google.android.exoplayer2.upstream.DataSourceInputStream r10 = new com.google.android.exoplayer2.upstream.DataSourceInputStream     // Catch: java.lang.Exception -> L57
            r10.<init>(r0, r9)     // Catch: java.lang.Exception -> L57
            byte[] r8 = com.google.android.exoplayer2.util.Util.toByteArray(r10)     // Catch: java.lang.Throwable -> L37 com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException -> L39
            com.google.android.exoplayer2.util.Util.closeQuietly(r10)     // Catch: java.lang.Exception -> L57
            return r8
        L37:
            r8 = move-exception
            goto L53
        L39:
            r11 = move-exception
            java.lang.String r1 = getRedirectUrl(r11, r8)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L52
            int r8 = r8 + 1
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.buildUpon()     // Catch: java.lang.Throwable -> L37
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.setUri(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.exoplayer2.upstream.DataSpec r9 = r9.build()     // Catch: java.lang.Throwable -> L37
            com.google.android.exoplayer2.util.Util.closeQuietly(r10)     // Catch: java.lang.Exception -> L57
            goto L2a
        L52:
            throw r11     // Catch: java.lang.Throwable -> L37
        L53:
            com.google.android.exoplayer2.util.Util.closeQuietly(r10)     // Catch: java.lang.Exception -> L57
            throw r8     // Catch: java.lang.Exception -> L57
        L57:
            r8 = move-exception
            r7 = r8
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r8 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r9 = r0.getLastOpenedUri()
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            r3 = r9
            android.net.Uri r3 = (android.net.Uri) r3
            java.util.Map r4 = r0.getResponseHeaders()
            long r5 = r0.getBytesRead()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
    }

    @androidx.annotation.Nullable
    private static java.lang.String getRedirectUrl(com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException r3, int r4) {
            int r0 = r3.responseCode
            r1 = 0
            r2 = 307(0x133, float:4.3E-43)
            if (r0 == r2) goto Lb
            r2 = 308(0x134, float:4.32E-43)
            if (r0 != r2) goto L10
        Lb:
            r0 = 5
            if (r4 >= r0) goto L10
            r4 = 1
            goto L11
        L10:
            r4 = 0
        L11:
            r0 = 0
            if (r4 != 0) goto L15
            return r0
        L15:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r3.headerFields
            if (r3 == 0) goto L30
            java.lang.String r4 = "Location"
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L30
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L30
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L30:
            return r0
    }

    public void clearAllKeyRequestProperties() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.keyRequestProperties
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.keyRequestProperties     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public void clearKeyRequestProperty(java.lang.String r3) {
            r2 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.keyRequestProperties
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.keyRequestProperties     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(java.util.UUID r8, com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest r9) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
            r7 = this;
            java.lang.String r0 = r9.getLicenseServerUrl()
            boolean r1 = r7.forceDefaultLicenseUrl
            if (r1 != 0) goto Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L10
        Le:
            java.lang.String r0 = r7.defaultLicenseUrl
        L10:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L5d
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.UUID r2 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r3 = r2.equals(r8)
            if (r3 == 0) goto L27
            java.lang.String r3 = "text/xml"
            goto L34
        L27:
            java.util.UUID r3 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L32
            java.lang.String r3 = "application/json"
            goto L34
        L32:
            java.lang.String r3 = "application/octet-stream"
        L34:
            java.lang.String r4 = "Content-Type"
            r1.put(r4, r3)
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L46
            java.lang.String r8 = "SOAPAction"
            java.lang.String r2 = "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense"
            r1.put(r8, r2)
        L46:
            java.util.Map<java.lang.String, java.lang.String> r8 = r7.keyRequestProperties
            monitor-enter(r8)
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.keyRequestProperties     // Catch: java.lang.Throwable -> L5a
            r1.putAll(r2)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            com.google.android.exoplayer2.upstream.DataSource$Factory r8 = r7.dataSourceFactory
            byte[] r9 = r9.getData()
            byte[] r8 = executePost(r8, r0, r9, r1)
            return r8
        L5a:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            throw r9
        L5d:
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r8 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r9.<init>()
            android.net.Uri r0 = android.net.Uri.EMPTY
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.setUri(r0)
            com.google.android.exoplayer2.upstream.DataSpec r1 = r9.build()
            android.net.Uri r2 = android.net.Uri.EMPTY
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.of()
            r4 = 0
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r9 = "No license URL"
            r6.<init>(r9)
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r6)
            throw r8
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(java.util.UUID r3, com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest r4) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
            r2 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r4.getDefaultUrl()
            r3.append(r0)
            java.lang.String r0 = "&signedRequest="
            r3.append(r0)
            byte[] r4 = r4.getData()
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.google.android.exoplayer2.upstream.DataSource$Factory r4 = r2.dataSourceFactory
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1 = 0
            byte[] r3 = executePost(r4, r3, r1, r0)
            return r3
    }

    public void setKeyRequestProperty(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.keyRequestProperties
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.keyRequestProperties     // Catch: java.lang.Throwable -> L10
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }
}
