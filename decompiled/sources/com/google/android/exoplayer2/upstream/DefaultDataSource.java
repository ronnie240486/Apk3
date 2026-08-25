package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private static final java.lang.String SCHEME_ANDROID_RESOURCE = "android.resource";
    private static final java.lang.String SCHEME_ASSET = "asset";
    private static final java.lang.String SCHEME_CONTENT = "content";
    private static final java.lang.String SCHEME_DATA = "data";
    private static final java.lang.String SCHEME_RAW = "rawresource";
    private static final java.lang.String SCHEME_RTMP = "rtmp";
    private static final java.lang.String SCHEME_UDP = "udp";
    private static final java.lang.String TAG = "DefaultDataSource";

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource assetDataSource;
    private final com.google.android.exoplayer2.upstream.DataSource baseDataSource;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource contentDataSource;
    private final android.content.Context context;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource dataSchemeDataSource;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource dataSource;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource fileDataSource;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource rawResourceDataSource;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource rtmpDataSource;
    private final java.util.List<com.google.android.exoplayer2.upstream.TransferListener> transferListeners;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSource udpDataSource;

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private final com.google.android.exoplayer2.upstream.DataSource.Factory baseDataSourceFactory;
        private final android.content.Context context;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.TransferListener transferListener;

        public Factory(android.content.Context r2) {
                r1 = this;
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
                r0.<init>()
                r1.<init>(r2, r0)
                return
        }

        public Factory(android.content.Context r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.context = r1
                r0.baseDataSourceFactory = r2
                return
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.DefaultDataSource r0 = r1.createDataSource()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.DefaultDataSource createDataSource() {
                r3 = this;
                com.google.android.exoplayer2.upstream.DefaultDataSource r0 = new com.google.android.exoplayer2.upstream.DefaultDataSource
                android.content.Context r1 = r3.context
                com.google.android.exoplayer2.upstream.DataSource$Factory r2 = r3.baseDataSourceFactory
                com.google.android.exoplayer2.upstream.DataSource r2 = r2.createDataSource()
                r0.<init>(r1, r2)
                com.google.android.exoplayer2.upstream.TransferListener r1 = r3.transferListener
                if (r1 == 0) goto L14
                r0.addTransferListener(r1)
            L14:
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultDataSource.Factory setTransferListener(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1) {
                r0 = this;
                r0.transferListener = r1
                return r0
        }
    }

    public DefaultDataSource(android.content.Context r1, com.google.android.exoplayer2.upstream.DataSource r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r1 = (com.google.android.exoplayer2.upstream.DataSource) r1
            r0.baseDataSource = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.transferListeners = r1
            return
    }

    public DefaultDataSource(android.content.Context r2, @androidx.annotation.Nullable java.lang.String r3, int r4, int r5, boolean r6) {
            r1 = this;
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory
            r0.<init>()
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r3 = r0.setUserAgent(r3)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r3 = r3.setConnectTimeoutMs(r4)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r3 = r3.setReadTimeoutMs(r5)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r3 = r3.setAllowCrossProtocolRedirects(r6)
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource r3 = r3.createDataSource()
            r1.<init>(r2, r3)
            return
    }

    public DefaultDataSource(android.content.Context r7, @androidx.annotation.Nullable java.lang.String r8, boolean r9) {
            r6 = this;
            r3 = 8000(0x1f40, float:1.121E-41)
            r4 = 8000(0x1f40, float:1.121E-41)
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DefaultDataSource(android.content.Context r7, boolean r8) {
            r6 = this;
            r2 = 0
            r3 = 8000(0x1f40, float:1.121E-41)
            r4 = 8000(0x1f40, float:1.121E-41)
            r0 = r6
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private void addListenersToDataSource(com.google.android.exoplayer2.upstream.DataSource r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<com.google.android.exoplayer2.upstream.TransferListener> r1 = r2.transferListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<com.google.android.exoplayer2.upstream.TransferListener> r1 = r2.transferListeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.upstream.TransferListener r1 = (com.google.android.exoplayer2.upstream.TransferListener) r1
            r3.addTransferListener(r1)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    private com.google.android.exoplayer2.upstream.DataSource getAssetDataSource() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.assetDataSource
            if (r0 != 0) goto L10
            com.google.android.exoplayer2.upstream.AssetDataSource r0 = new com.google.android.exoplayer2.upstream.AssetDataSource
            android.content.Context r1 = r2.context
            r0.<init>(r1)
            r2.assetDataSource = r0
            r2.addListenersToDataSource(r0)
        L10:
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.assetDataSource
            return r0
    }

    private com.google.android.exoplayer2.upstream.DataSource getContentDataSource() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.contentDataSource
            if (r0 != 0) goto L10
            com.google.android.exoplayer2.upstream.ContentDataSource r0 = new com.google.android.exoplayer2.upstream.ContentDataSource
            android.content.Context r1 = r2.context
            r0.<init>(r1)
            r2.contentDataSource = r0
            r2.addListenersToDataSource(r0)
        L10:
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.contentDataSource
            return r0
    }

    private com.google.android.exoplayer2.upstream.DataSource getDataSchemeDataSource() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSchemeDataSource
            if (r0 != 0) goto Le
            com.google.android.exoplayer2.upstream.DataSchemeDataSource r0 = new com.google.android.exoplayer2.upstream.DataSchemeDataSource
            r0.<init>()
            r1.dataSchemeDataSource = r0
            r1.addListenersToDataSource(r0)
        Le:
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSchemeDataSource
            return r0
    }

    private com.google.android.exoplayer2.upstream.DataSource getFileDataSource() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.fileDataSource
            if (r0 != 0) goto Le
            com.google.android.exoplayer2.upstream.FileDataSource r0 = new com.google.android.exoplayer2.upstream.FileDataSource
            r0.<init>()
            r1.fileDataSource = r0
            r1.addListenersToDataSource(r0)
        Le:
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.fileDataSource
            return r0
    }

    private com.google.android.exoplayer2.upstream.DataSource getRawResourceDataSource() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.rawResourceDataSource
            if (r0 != 0) goto L10
            com.google.android.exoplayer2.upstream.RawResourceDataSource r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource
            android.content.Context r1 = r2.context
            r0.<init>(r1)
            r2.rawResourceDataSource = r0
            r2.addListenersToDataSource(r0)
        L10:
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.rawResourceDataSource
            return r0
    }

    private com.google.android.exoplayer2.upstream.DataSource getRtmpDataSource() {
            r3 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r3.rtmpDataSource
            if (r0 != 0) goto L37
            java.lang.String r0 = "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            com.google.android.exoplayer2.upstream.DataSource r0 = (com.google.android.exoplayer2.upstream.DataSource) r0     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            r3.rtmpDataSource = r0     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            r3.addListenersToDataSource(r0)     // Catch: java.lang.Exception -> L1f java.lang.ClassNotFoundException -> L28
            goto L2f
        L1f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating RTMP extension"
            r1.<init>(r2, r0)
            throw r1
        L28:
            java.lang.String r0 = "DefaultDataSource"
            java.lang.String r1 = "Attempting to play RTMP stream without depending on the RTMP extension"
            com.google.android.exoplayer2.util.Log.w(r0, r1)
        L2f:
            com.google.android.exoplayer2.upstream.DataSource r0 = r3.rtmpDataSource
            if (r0 != 0) goto L37
            com.google.android.exoplayer2.upstream.DataSource r0 = r3.baseDataSource
            r3.rtmpDataSource = r0
        L37:
            com.google.android.exoplayer2.upstream.DataSource r0 = r3.rtmpDataSource
            return r0
    }

    private com.google.android.exoplayer2.upstream.DataSource getUdpDataSource() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.udpDataSource
            if (r0 != 0) goto Le
            com.google.android.exoplayer2.upstream.UdpDataSource r0 = new com.google.android.exoplayer2.upstream.UdpDataSource
            r0.<init>()
            r1.udpDataSource = r0
            r1.addListenersToDataSource(r0)
        Le:
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.udpDataSource
            return r0
    }

    private void maybeAddListenerToDataSource(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r1, com.google.android.exoplayer2.upstream.TransferListener r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.addTransferListener(r2)
        L5:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.baseDataSource
            r0.addTransferListener(r2)
            java.util.List<com.google.android.exoplayer2.upstream.TransferListener> r0 = r1.transferListeners
            r0.add(r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.fileDataSource
            r1.maybeAddListenerToDataSource(r0, r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.assetDataSource
            r1.maybeAddListenerToDataSource(r0, r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.contentDataSource
            r1.maybeAddListenerToDataSource(r0, r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.rtmpDataSource
            r1.maybeAddListenerToDataSource(r0, r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.udpDataSource
            r1.maybeAddListenerToDataSource(r0, r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSchemeDataSource
            r1.maybeAddListenerToDataSource(r0, r2)
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.rawResourceDataSource
            r1.maybeAddListenerToDataSource(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.dataSource
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r2.dataSource = r1
            goto Lf
        Lb:
            r0 = move-exception
            r2.dataSource = r1
            throw r0
        Lf:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSource
            if (r0 != 0) goto L9
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto Ld
        L9:
            java.util.Map r0 = r0.getResponseHeaders()
        Ld:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSource
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            android.net.Uri r0 = r0.getUri()
        La:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r3) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.dataSource
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            android.net.Uri r0 = r3.uri
            java.lang.String r0 = r0.getScheme()
            android.net.Uri r1 = r3.uri
            boolean r1 = com.google.android.exoplayer2.util.Util.isLocalFileUri(r1)
            if (r1 == 0) goto L37
            android.net.Uri r0 = r3.uri
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L30
            java.lang.String r1 = "/android_asset/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L30
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getAssetDataSource()
            r2.dataSource = r0
            goto La1
        L30:
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getFileDataSource()
            r2.dataSource = r0
            goto La1
        L37:
            java.lang.String r1 = "asset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L46
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getAssetDataSource()
            r2.dataSource = r0
            goto La1
        L46:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L55
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getContentDataSource()
            r2.dataSource = r0
            goto La1
        L55:
            java.lang.String r1 = "rtmp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getRtmpDataSource()
            r2.dataSource = r0
            goto La1
        L65:
            java.lang.String r1 = "udp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L75
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getUdpDataSource()
            r2.dataSource = r0
            goto La1
        L75:
            java.lang.String r1 = "data"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L84
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getDataSchemeDataSource()
            r2.dataSource = r0
            goto La1
        L84:
            java.lang.String r1 = "rawresource"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L9b
            java.lang.String r1 = "android.resource"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L96
            goto L9b
        L96:
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.baseDataSource
            r2.dataSource = r0
            goto La1
        L9b:
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.getRawResourceDataSource()
            r2.dataSource = r0
        La1:
            com.google.android.exoplayer2.upstream.DataSource r0 = r2.dataSource
            long r0 = r0.open(r3)
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r1.dataSource
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.upstream.DataSource r0 = (com.google.android.exoplayer2.upstream.DataSource) r0
            int r2 = r0.read(r2, r3, r4)
            return r2
    }
}
