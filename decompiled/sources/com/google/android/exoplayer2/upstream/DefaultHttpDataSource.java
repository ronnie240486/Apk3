package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public class DefaultHttpDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource implements com.google.android.exoplayer2.upstream.HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final java.lang.String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;

    @androidx.annotation.Nullable
    private java.net.HttpURLConnection connection;

    @androidx.annotation.Nullable
    private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties;

    @androidx.annotation.Nullable
    private java.io.InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private final int readTimeoutMillis;
    private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties requestProperties;
    private int responseCode;

    @androidx.annotation.Nullable
    private final java.lang.String userAgent;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.DefaultHttpDataSource$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Factory implements com.google.android.exoplayer2.upstream.HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private int connectTimeoutMs;

        @androidx.annotation.Nullable
        private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
        private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties;
        private boolean keepPostFor302Redirects;
        private int readTimeoutMs;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.TransferListener transferListener;

        @androidx.annotation.Nullable
        private java.lang.String userAgent;

        public Factory() {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties
                r0.<init>()
                r1.defaultRequestProperties = r0
                r0 = 8000(0x1f40, float:1.121E-41)
                r1.connectTimeoutMs = r0
                r1.readTimeoutMs = r0
                return
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource r0 = r1.createDataSource()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource createDataSource() {
                r10 = this;
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource r9 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource
                java.lang.String r1 = r10.userAgent
                int r2 = r10.connectTimeoutMs
                int r3 = r10.readTimeoutMs
                boolean r4 = r10.allowCrossProtocolRedirects
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r5 = r10.defaultRequestProperties
                com.google.common.base.Predicate<java.lang.String> r6 = r10.contentTypePredicate
                boolean r7 = r10.keepPostFor302Redirects
                r8 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                com.google.android.exoplayer2.upstream.TransferListener r0 = r10.transferListener
                if (r0 == 0) goto L1c
                r9.addTransferListener(r0)
            L1c:
                return r9
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.HttpDataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource r0 = r1.createDataSource()
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setAllowCrossProtocolRedirects(boolean r1) {
                r0 = this;
                r0.allowCrossProtocolRedirects = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setConnectTimeoutMs(int r1) {
                r0 = this;
                r0.connectTimeoutMs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setContentTypePredicate(@androidx.annotation.Nullable com.google.common.base.Predicate<java.lang.String> r1) {
                r0 = this;
                r0.contentTypePredicate = r1
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.defaultRequestProperties
                r0.clearAndSet(r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map r1) {
                r0 = this;
                com.google.android.exoplayer2.upstream.DefaultHttpDataSource$Factory r1 = r0.setDefaultRequestProperties(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setKeepPostFor302Redirects(boolean r1) {
                r0 = this;
                r0.keepPostFor302Redirects = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setReadTimeoutMs(int r1) {
                r0 = this;
                r0.readTimeoutMs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setTransferListener(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1) {
                r0 = this;
                r0.transferListener = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setUserAgent(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.userAgent = r1
                return r0
        }
    }

    public static class NullFilteringHeadersMap extends com.google.common.collect.ForwardingMap<java.lang.String, java.util.List<java.lang.String>> {
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;

        public static /* synthetic */ boolean $r8$lambda$DVYd1RNlWDfio80CnK0S49qNCjc(java.util.Map.Entry r0) {
                boolean r0 = lambda$entrySet$1(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$KEnQ8YaC9x7448-o-c4v_duvcOo, reason: not valid java name */
        public static /* synthetic */ boolean m271$r8$lambda$KEnQ8YaC9x7448oc4v_duvcOo(java.lang.String r0) {
                boolean r0 = lambda$keySet$0(r0)
                return r0
        }

        public NullFilteringHeadersMap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1) {
                r0 = this;
                r0.<init>()
                r0.headers = r1
                return
        }

        private static /* synthetic */ boolean lambda$entrySet$1(java.util.Map.Entry r0) {
                java.lang.Object r0 = r0.getKey()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        private static /* synthetic */ boolean lambda$keySet$0(java.lang.String r0) {
                if (r0 == 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsKey(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                if (r1 == 0) goto La
                boolean r1 = super.containsKey(r1)
                if (r1 == 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsValue(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                boolean r1 = r0.standardContainsValue(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.headers
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> delegate() {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.headers
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet() {
                r2 = this;
                java.util.Set r0 = super.entrySet()
                com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0.INSTANCE$2
                java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean equals(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                if (r1 == 0) goto La
                boolean r1 = com.google.common.collect.Maps.equalsImpl(r0, r1)
                if (r1 == 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        @androidx.annotation.Nullable
        public /* bridge */ /* synthetic */ java.lang.Object get(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        @androidx.annotation.Nullable
        public java.util.List<java.lang.String> get(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                goto La
            L4:
                java.lang.Object r1 = super.get(r1)
                java.util.List r1 = (java.util.List) r1
            La:
                return r1
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int hashCode() {
                r1 = this;
                java.util.Set r0 = r1.entrySet()
                int r0 = com.google.common.collect.Sets.hashCodeImpl(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean isEmpty() {
                r2 = this;
                boolean r0 = super.isEmpty()
                r1 = 1
                if (r0 != 0) goto L16
                int r0 = super.size()
                if (r0 != r1) goto L15
                r0 = 0
                boolean r0 = super.containsKey(r0)
                if (r0 == 0) goto L15
                goto L16
            L15:
                r1 = 0
            L16:
                return r1
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.lang.String> keySet() {
                r2 = this;
                java.util.Set r0 = super.keySet()
                com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 r1 = com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0.INSTANCE$1
                java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int size() {
                r2 = this;
                int r0 = super.size()
                r1 = 0
                boolean r1 = super.containsKey(r1)
                int r0 = r0 - r1
                return r0
        }
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource() {
            r2 = this;
            r0 = 0
            r1 = 8000(0x1f40, float:1.121E-41)
            r2.<init>(r0, r1, r1)
            return
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.<init>(r2, r0, r0)
            return
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource(@androidx.annotation.Nullable java.lang.String r7, int r8, int r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource(@androidx.annotation.Nullable java.lang.String r9, int r10, int r11, boolean r12, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private DefaultHttpDataSource(@androidx.annotation.Nullable java.lang.String r2, int r3, int r4, boolean r5, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties r6, @androidx.annotation.Nullable com.google.common.base.Predicate<java.lang.String> r7, boolean r8) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.userAgent = r2
            r1.connectTimeoutMillis = r3
            r1.readTimeoutMillis = r4
            r1.allowCrossProtocolRedirects = r5
            r1.defaultRequestProperties = r6
            r1.contentTypePredicate = r7
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties
            r2.<init>()
            r1.requestProperties = r2
            r1.keepPostFor302Redirects = r8
            return
    }

    public /* synthetic */ DefaultHttpDataSource(java.lang.String r1, int r2, int r3, boolean r4, com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties r5, com.google.common.base.Predicate r6, boolean r7, com.google.android.exoplayer2.upstream.DefaultHttpDataSource.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private void closeConnectionQuietly() {
            r3 = this;
            java.net.HttpURLConnection r0 = r3.connection
            if (r0 == 0) goto L13
            r0.disconnect()     // Catch: java.lang.Exception -> L8
            goto L10
        L8:
            r0 = move-exception
            java.lang.String r1 = "DefaultHttpDataSource"
            java.lang.String r2 = "Unexpected error while disconnecting"
            com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
        L10:
            r0 = 0
            r3.connection = r0
        L13:
            return
    }

    private java.net.URL handleRedirect(java.net.URL r5, @androidx.annotation.Nullable java.lang.String r6, com.google.android.exoplayer2.upstream.DataSpec r7) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r4 = this;
            r0 = 1
            r1 = 2001(0x7d1, float:2.804E-42)
            if (r6 == 0) goto L66
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L5f
            r2.<init>(r5, r6)     // Catch: java.net.MalformedURLException -> L5f
            java.lang.String r6 = r2.getProtocol()
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L2b
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1f
            goto L2b
        L1f:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r5 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.String r2 = "Unsupported protocol redirect: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r6)
            r5.<init>(r6, r7, r1, r0)
            throw r5
        L2b:
            boolean r3 = r4.allowCrossProtocolRedirects
            if (r3 != 0) goto L5e
            java.lang.String r3 = r5.getProtocol()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L3a
            goto L5e
        L3a:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.String r3 = "Disallowed cross-protocol redirect ("
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r5 = r5.getProtocol()
            r3.append(r5)
            java.lang.String r5 = " to "
            r3.append(r5)
            r3.append(r6)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5, r7, r1, r0)
            throw r2
        L5e:
            return r2
        L5f:
            r5 = move-exception
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r6 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r6.<init>(r5, r7, r1, r0)
            throw r6
        L66:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r5 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.String r6 = "Null location redirect"
            r5.<init>(r6, r7, r1, r0)
            throw r5
    }

    private static boolean isCompressed(java.net.HttpURLConnection r1) {
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = r1.getHeaderField(r0)
            java.lang.String r0 = "gzip"
            boolean r1 = r0.equalsIgnoreCase(r1)
            return r1
    }

    private java.net.HttpURLConnection makeConnection(com.google.android.exoplayer2.upstream.DataSpec r26) throws java.io.IOException {
            r25 = this;
            r11 = r25
            r12 = r26
            java.net.URL r1 = new java.net.URL
            android.net.Uri r0 = r12.uri
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            int r2 = r12.httpMethod
            byte[] r3 = r12.httpBody
            long r13 = r12.position
            long r9 = r12.length
            r15 = 1
            boolean r16 = r12.isFlagSet(r15)
            boolean r0 = r11.allowCrossProtocolRedirects
            if (r0 != 0) goto L34
            boolean r0 = r11.keepPostFor302Redirects
            if (r0 != 0) goto L34
            r15 = 1
            java.util.Map<java.lang.String, java.lang.String> r12 = r12.httpRequestHeaders
            r0 = r25
            r4 = r13
            r6 = r9
            r8 = r16
            r9 = r15
            r10 = r12
            java.net.HttpURLConnection r0 = r0.makeConnection(r1, r2, r3, r4, r6, r8, r9, r10)
            return r0
        L34:
            r0 = 0
            r8 = r1
            r6 = r2
            r17 = r3
        L39:
            int r7 = r0 + 1
            r1 = 20
            if (r0 > r1) goto Lc0
            r18 = 0
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.httpRequestHeaders
            r0 = r25
            r1 = r8
            r2 = r6
            r3 = r17
            r19 = r4
            r4 = r13
            r20 = r13
            r13 = r6
            r14 = r7
            r6 = r9
            r22 = r8
            r8 = r16
            r23 = r9
            r9 = r18
            r10 = r19
            java.net.HttpURLConnection r0 = r0.makeConnection(r1, r2, r3, r4, r6, r8, r9, r10)
            int r1 = r0.getResponseCode()
            java.lang.String r2 = "Location"
            java.lang.String r2 = r0.getHeaderField(r2)
            r3 = 303(0x12f, float:4.25E-43)
            r4 = 301(0x12d, float:4.22E-43)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 302(0x12e, float:4.23E-43)
            if (r13 == r15) goto L76
            r7 = 3
            if (r13 != r7) goto L87
        L76:
            if (r1 == r5) goto Lae
            if (r1 == r4) goto Lae
            if (r1 == r6) goto Lae
            if (r1 == r3) goto Lae
            r7 = 307(0x133, float:4.3E-43)
            if (r1 == r7) goto Lae
            r7 = 308(0x134, float:4.32E-43)
            if (r1 != r7) goto L87
            goto Lae
        L87:
            r7 = 2
            if (r13 != r7) goto Lad
            if (r1 == r5) goto L92
            if (r1 == r4) goto L92
            if (r1 == r6) goto L92
            if (r1 != r3) goto Lad
        L92:
            r0.disconnect()
            boolean r0 = r11.keepPostFor302Redirects
            if (r0 == 0) goto L9d
            if (r1 != r6) goto L9d
            r0 = 1
            goto L9e
        L9d:
            r0 = 0
        L9e:
            if (r0 != 0) goto La4
            r17 = 0
            r6 = 1
            goto La5
        La4:
            r6 = r13
        La5:
            r1 = r22
            java.net.URL r0 = r11.handleRedirect(r1, r2, r12)
            r8 = r0
            goto Lb9
        Lad:
            return r0
        Lae:
            r1 = r22
            r0.disconnect()
            java.net.URL r0 = r11.handleRedirect(r1, r2, r12)
            r8 = r0
            r6 = r13
        Lb9:
            r0 = r14
            r13 = r20
            r9 = r23
            goto L39
        Lc0:
            r14 = r7
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException
            java.lang.String r2 = "Too many redirects: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r14)
            r1.<init>(r2)
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.<init>(r1, r12, r2, r15)
            throw r0
    }

    private java.net.HttpURLConnection makeConnection(java.net.URL r3, int r4, @androidx.annotation.Nullable byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map<java.lang.String, java.lang.String> r12) throws java.io.IOException {
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r0 = r2.connectTimeoutMillis
            r3.setConnectTimeout(r0)
            int r0 = r2.readTimeoutMillis
            r3.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r1 = r2.defaultRequestProperties
            if (r1 == 0) goto L20
            java.util.Map r1 = r1.getSnapshot()
            r0.putAll(r1)
        L20:
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r1 = r2.requestProperties
            java.util.Map r1 = r1.getSnapshot()
            r0.putAll(r1)
            r0.putAll(r12)
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L34:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setRequestProperty(r1, r0)
            goto L34
        L50:
            java.lang.String r6 = com.google.android.exoplayer2.upstream.HttpUtil.buildRangeRequestHeader(r6, r8)
            if (r6 == 0) goto L5b
            java.lang.String r7 = "Range"
            r3.setRequestProperty(r7, r6)
        L5b:
            java.lang.String r6 = r2.userAgent
            if (r6 == 0) goto L64
            java.lang.String r7 = "User-Agent"
            r3.setRequestProperty(r7, r6)
        L64:
            if (r10 == 0) goto L69
            java.lang.String r6 = "gzip"
            goto L6b
        L69:
            java.lang.String r6 = "identity"
        L6b:
            java.lang.String r7 = "Accept-Encoding"
            r3.setRequestProperty(r7, r6)
            r3.setInstanceFollowRedirects(r11)
            if (r5 == 0) goto L77
            r6 = 1
            goto L78
        L77:
            r6 = 0
        L78:
            r3.setDoOutput(r6)
            java.lang.String r4 = com.google.android.exoplayer2.upstream.DataSpec.getStringForHttpMethod(r4)
            r3.setRequestMethod(r4)
            if (r5 == 0) goto L96
            int r4 = r5.length
            r3.setFixedLengthStreamingMode(r4)
            r3.connect()
            java.io.OutputStream r4 = r3.getOutputStream()
            r4.write(r5)
            r4.close()
            goto L99
        L96:
            r3.connect()
        L99:
            return r3
    }

    private static void maybeTerminateInputStream(@androidx.annotation.Nullable java.net.HttpURLConnection r3, long r4) {
            if (r3 == 0) goto L5f
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 19
            if (r0 < r1) goto L5f
            r1 = 20
            if (r0 <= r1) goto Ld
            goto L5f
        Ld:
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Exception -> L5f
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L1f
            int r4 = r3.read()     // Catch: java.lang.Exception -> L5f
            r5 = -1
            if (r4 != r5) goto L26
            return
        L1f:
            r0 = 2048(0x800, double:1.012E-320)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L26
            return
        L26:
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> L5f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L5f
            java.lang.String r5 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Exception -> L5f
            if (r5 != 0) goto L3e
            java.lang.String r5 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Exception -> L5f
            if (r4 == 0) goto L5f
        L3e:
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> L5f
            java.lang.Class r4 = r4.getSuperclass()     // Catch: java.lang.Exception -> L5f
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)     // Catch: java.lang.Exception -> L5f
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Exception -> L5f
            java.lang.String r5 = "unexpectedEndOfInput"
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L5f
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Exception -> L5f
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Exception -> L5f
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L5f
            r4.invoke(r3, r5)     // Catch: java.lang.Exception -> L5f
        L5f:
            return
    }

    private int readInternal(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.bytesToRead
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1d
            long r2 = r6.bytesRead
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L17
            return r4
        L17:
            long r2 = (long) r9
            long r0 = java.lang.Math.min(r2, r0)
            int r9 = (int) r0
        L1d:
            java.io.InputStream r0 = r6.inputStream
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.io.InputStream r0 = (java.io.InputStream) r0
            int r7 = r0.read(r7, r8, r9)
            if (r7 != r4) goto L2c
            return r4
        L2c:
            long r8 = r6.bytesRead
            long r0 = (long) r7
            long r8 = r8 + r0
            r6.bytesRead = r8
            r6.bytesTransferred(r7)
            return r7
    }

    private void skipFully(long r8, com.google.android.exoplayer2.upstream.DataSpec r10) throws java.io.IOException {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r2]
        Lb:
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 <= 0) goto L4b
            long r4 = (long) r2
            long r4 = java.lang.Math.min(r8, r4)
            int r5 = (int) r4
            java.io.InputStream r4 = r7.inputStream
            java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)
            java.io.InputStream r4 = (java.io.InputStream) r4
            r6 = 0
            int r4 = r4.read(r3, r6, r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            boolean r5 = r5.isInterrupted()
            r6 = 1
            if (r5 != 0) goto L3e
            r5 = -1
            if (r4 == r5) goto L36
            long r5 = (long) r4
            long r8 = r8 - r5
            r7.bytesTransferred(r4)
            goto Lb
        L36:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r8 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r9 = 2008(0x7d8, float:2.814E-42)
            r8.<init>(r10, r9, r6)
            throw r8
        L3e:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r8 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException
            r9.<init>()
            r0 = 2000(0x7d0, float:2.803E-42)
            r8.<init>(r9, r10, r0, r6)
            throw r8
        L4b:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
            r1 = this;
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.requestProperties
            r0.clear()
            return
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(java.lang.String r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.requestProperties
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r8 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r8.inputStream     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2e
            long r3 = r8.bytesToRead     // Catch: java.lang.Throwable -> L3d
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L13
        Lf:
            long r5 = r8.bytesRead     // Catch: java.lang.Throwable -> L3d
            long r5 = r3 - r5
        L13:
            java.net.HttpURLConnection r3 = r8.connection     // Catch: java.lang.Throwable -> L3d
            maybeTerminateInputStream(r3, r5)     // Catch: java.lang.Throwable -> L3d
            r2.close()     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L3d
            goto L2e
        L1c:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r3 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException     // Catch: java.lang.Throwable -> L3d
            com.google.android.exoplayer2.upstream.DataSpec r4 = r8.dataSpec     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)     // Catch: java.lang.Throwable -> L3d
            com.google.android.exoplayer2.upstream.DataSpec r4 = (com.google.android.exoplayer2.upstream.DataSpec) r4     // Catch: java.lang.Throwable -> L3d
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L2e:
            r8.inputStream = r1
            r8.closeConnectionQuietly()
            boolean r1 = r8.opened
            if (r1 == 0) goto L3c
            r8.opened = r0
            r8.transferEnded()
        L3c:
            return
        L3d:
            r2 = move-exception
            r8.inputStream = r1
            r8.closeConnectionQuietly()
            boolean r1 = r8.opened
            if (r1 == 0) goto L4c
            r8.opened = r0
            r8.transferEnded()
        L4c:
            throw r2
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            if (r0 == 0) goto L8
            int r0 = r1.responseCode
            if (r0 > 0) goto L9
        L8:
            r0 = -1
        L9:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
            r2 = this;
            java.net.HttpURLConnection r0 = r2.connection
            if (r0 != 0) goto L9
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            return r0
        L9:
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource$NullFilteringHeadersMap r1 = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource$NullFilteringHeadersMap
            java.util.Map r0 = r0.getHeaderFields()
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            if (r0 != 0) goto L6
            r0 = 0
            goto L12
        L6:
            java.net.URL r0 = r0.getURL()
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L12:
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r15) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r14 = this;
            r14.dataSpec = r15
            r0 = 0
            r14.bytesRead = r0
            r14.bytesToRead = r0
            r14.transferInitializing(r15)
            r2 = 1
            java.net.HttpURLConnection r3 = r14.makeConnection(r15)     // Catch: java.io.IOException -> L105
            r14.connection = r3     // Catch: java.io.IOException -> L105
            int r4 = r3.getResponseCode()     // Catch: java.io.IOException -> L105
            r14.responseCode = r4     // Catch: java.io.IOException -> L105
            java.lang.String r7 = r3.getResponseMessage()     // Catch: java.io.IOException -> L105
            int r4 = r14.responseCode
            java.lang.String r5 = "Content-Range"
            r6 = 200(0xc8, float:2.8E-43)
            r8 = -1
            if (r4 < r6) goto Lb2
            r10 = 299(0x12b, float:4.19E-43)
            if (r4 <= r10) goto L2c
            goto Lb2
        L2c:
            java.lang.String r4 = r3.getContentType()
            com.google.common.base.Predicate<java.lang.String> r7 = r14.contentTypePredicate
            if (r7 == 0) goto L44
            boolean r7 = r7.apply(r4)
            if (r7 == 0) goto L3b
            goto L44
        L3b:
            r14.closeConnectionQuietly()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r4, r15)
            throw r0
        L44:
            int r4 = r14.responseCode
            if (r4 != r6) goto L4f
            long r6 = r15.position
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto L4f
            r0 = r6
        L4f:
            boolean r4 = isCompressed(r3)
            if (r4 != 0) goto L75
            long r6 = r15.length
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L5e
            r14.bytesToRead = r6
            goto L79
        L5e:
            java.lang.String r6 = "Content-Length"
            java.lang.String r6 = r3.getHeaderField(r6)
            java.lang.String r5 = r3.getHeaderField(r5)
            long r5 = com.google.android.exoplayer2.upstream.HttpUtil.getContentLength(r6, r5)
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L72
            long r8 = r5 - r0
        L72:
            r14.bytesToRead = r8
            goto L79
        L75:
            long r5 = r15.length
            r14.bytesToRead = r5
        L79:
            r5 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.io.IOException -> La8
            r14.inputStream = r3     // Catch: java.io.IOException -> La8
            if (r4 == 0) goto L8c
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> La8
            java.io.InputStream r4 = r14.inputStream     // Catch: java.io.IOException -> La8
            r3.<init>(r4)     // Catch: java.io.IOException -> La8
            r14.inputStream = r3     // Catch: java.io.IOException -> La8
        L8c:
            r14.opened = r2
            r14.transferStarted(r15)
            r14.skipFully(r0, r15)     // Catch: java.io.IOException -> L97
            long r0 = r14.bytesToRead
            return r0
        L97:
            r0 = move-exception
            r14.closeConnectionQuietly()
            boolean r1 = r0 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
            if (r1 == 0) goto La2
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = (com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) r0
            throw r0
        La2:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r1.<init>(r0, r15, r5, r2)
            throw r1
        La8:
            r0 = move-exception
            r14.closeConnectionQuietly()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r1.<init>(r0, r15, r5, r2)
            throw r1
        Lb2:
            java.util.Map r4 = r3.getHeaderFields()
            int r6 = r14.responseCode
            r10 = 416(0x1a0, float:5.83E-43)
            if (r6 != r10) goto Ld7
            java.lang.String r5 = r3.getHeaderField(r5)
            long r5 = com.google.android.exoplayer2.upstream.HttpUtil.getDocumentSize(r5)
            long r11 = r15.position
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 != 0) goto Ld7
            r14.opened = r2
            r14.transferStarted(r15)
            long r2 = r15.length
            int r15 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r15 == 0) goto Ld6
            r0 = r2
        Ld6:
            return r0
        Ld7:
            java.io.InputStream r0 = r3.getErrorStream()
            if (r0 == 0) goto Le2
            byte[] r0 = com.google.android.exoplayer2.util.Util.toByteArray(r0)     // Catch: java.io.IOException -> Le6
            goto Le4
        Le2:
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY     // Catch: java.io.IOException -> Le6
        Le4:
            r11 = r0
            goto Le9
        Le6:
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            goto Le4
        Le9:
            r14.closeConnectionQuietly()
            int r0 = r14.responseCode
            if (r0 != r10) goto Lf8
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1)
            goto Lf9
        Lf8:
            r0 = 0
        Lf9:
            r8 = r0
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            int r6 = r14.responseCode
            r5 = r0
            r9 = r4
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            throw r0
        L105:
            r0 = move-exception
            r14.closeConnectionQuietly()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r15 = com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException.createForIOException(r0, r15, r2)
            throw r15
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r1, int r2, int r3) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
            r0 = this;
            int r1 = r0.readInternal(r1, r2, r3)     // Catch: java.io.IOException -> L5
            return r1
        L5:
            r1 = move-exception
            com.google.android.exoplayer2.upstream.DataSpec r2 = r0.dataSpec
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            com.google.android.exoplayer2.upstream.DataSpec r2 = (com.google.android.exoplayer2.upstream.DataSpec) r2
            r3 = 2
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException.createForIOException(r1, r2, r3)
            throw r1
    }

    @java.lang.Deprecated
    public void setContentTypePredicate(@androidx.annotation.Nullable com.google.common.base.Predicate<java.lang.String> r1) {
            r0 = this;
            r0.contentTypePredicate = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.requestProperties
            r0.set(r2, r3)
            return
    }
}
