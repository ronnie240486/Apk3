package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface HttpDataSource extends com.google.android.exoplayer2.upstream.DataSource {
    public static final com.google.common.base.Predicate<java.lang.String> REJECT_PAYWALL_TYPES = null;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
                com.google.common.base.Predicate<java.lang.String> r0 = com.google.android.exoplayer2.upstream.HttpDataSource.REJECT_PAYWALL_TYPES
                return
        }

        public static /* synthetic */ boolean lambda$static$0(java.lang.String r2) {
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                java.lang.String r2 = com.google.common.base.Ascii.toLowerCase(r2)
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                if (r1 != 0) goto L32
                java.lang.String r1 = "text"
                boolean r1 = r2.contains(r1)
                if (r1 == 0) goto L20
                java.lang.String r1 = "text/vtt"
                boolean r1 = r2.contains(r1)
                if (r1 == 0) goto L32
            L20:
                java.lang.String r1 = "html"
                boolean r1 = r2.contains(r1)
                if (r1 != 0) goto L32
                java.lang.String r1 = "xml"
                boolean r2 = r2.contains(r1)
                if (r2 != 0) goto L32
                r0 = 1
            L32:
                return r0
        }
    }

    public static abstract class BaseFactory implements com.google.android.exoplayer2.upstream.HttpDataSource.Factory {
        private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties;

        public BaseFactory() {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties
                r0.<init>()
                r1.defaultRequestProperties = r0
                return
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.HttpDataSource r0 = r1.createDataSource()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final com.google.android.exoplayer2.upstream.HttpDataSource createDataSource() {
                r1 = this;
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.defaultRequestProperties
                com.google.android.exoplayer2.upstream.HttpDataSource r0 = r1.createDataSourceInternal(r0)
                return r0
        }

        public abstract com.google.android.exoplayer2.upstream.HttpDataSource createDataSourceInternal(com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties r1);

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final com.google.android.exoplayer2.upstream.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                com.google.android.exoplayer2.upstream.HttpDataSource$RequestProperties r0 = r1.defaultRequestProperties
                r0.clearAndSet(r2)
                return r1
        }
    }

    public static final class CleartextNotPermittedException extends com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        public CleartextNotPermittedException(java.io.IOException r7, com.google.android.exoplayer2.upstream.DataSpec r8) {
                r6 = this;
                java.lang.String r1 = "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted"
                r4 = 2007(0x7d7, float:2.812E-42)
                r5 = 1
                r0 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    public interface Factory extends com.google.android.exoplayer2.upstream.DataSource.Factory {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$Factory$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes2.dex */
        public final /* synthetic */ class CC {
            public static /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource $default$createDataSource(com.google.android.exoplayer2.upstream.HttpDataSource.Factory r0) {
                    com.google.android.exoplayer2.upstream.HttpDataSource r0 = r0.createDataSource()
                    return r0
            }
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.DataSource createDataSource();

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        com.google.android.exoplayer2.upstream.HttpDataSource createDataSource();

        com.google.android.exoplayer2.upstream.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class HttpDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        @java.lang.Deprecated
        public HttpDataSourceException(com.google.android.exoplayer2.upstream.DataSpec r2, int r3) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r0, r3)
                return
        }

        public HttpDataSourceException(com.google.android.exoplayer2.upstream.DataSpec r1, int r2, int r3) {
                r0 = this;
                int r2 = assignErrorCode(r2, r3)
                r0.<init>(r2)
                r0.dataSpec = r1
                r0.type = r3
                return
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.io.IOException r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r3, r0, r4)
                return
        }

        public HttpDataSourceException(java.io.IOException r1, com.google.android.exoplayer2.upstream.DataSpec r2, int r3, int r4) {
                r0 = this;
                int r3 = assignErrorCode(r3, r4)
                r0.<init>(r1, r3)
                r0.dataSpec = r2
                r0.type = r4
                return
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4) {
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                r1.<init>(r2, r3, r0, r4)
                return
        }

        public HttpDataSourceException(java.lang.String r1, com.google.android.exoplayer2.upstream.DataSpec r2, int r3, int r4) {
                r0 = this;
                int r3 = assignErrorCode(r3, r4)
                r0.<init>(r1, r3)
                r0.dataSpec = r2
                r0.type = r4
                return
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String r7, java.io.IOException r8, com.google.android.exoplayer2.upstream.DataSpec r9, int r10) {
                r6 = this;
                r4 = 2000(0x7d0, float:2.803E-42)
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public HttpDataSourceException(java.lang.String r1, @androidx.annotation.Nullable java.io.IOException r2, com.google.android.exoplayer2.upstream.DataSpec r3, int r4, int r5) {
                r0 = this;
                int r4 = assignErrorCode(r4, r5)
                r0.<init>(r1, r2, r4)
                r0.dataSpec = r3
                r0.type = r5
                return
        }

        private static int assignErrorCode(int r1, int r2) {
                r0 = 2000(0x7d0, float:2.803E-42)
                if (r1 != r0) goto L9
                r0 = 1
                if (r2 != r0) goto L9
                r1 = 2001(0x7d1, float:2.804E-42)
            L9:
                return r1
        }

        public static com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException createForIOException(java.io.IOException r3, com.google.android.exoplayer2.upstream.DataSpec r4, int r5) {
                java.lang.String r0 = r3.getMessage()
                boolean r1 = r3 instanceof java.net.SocketTimeoutException
                r2 = 2007(0x7d7, float:2.812E-42)
                if (r1 == 0) goto Ld
                r0 = 2002(0x7d2, float:2.805E-42)
                goto L27
            Ld:
                boolean r1 = r3 instanceof java.io.InterruptedIOException
                if (r1 == 0) goto L14
                r0 = 1004(0x3ec, float:1.407E-42)
                goto L27
            L14:
                if (r0 == 0) goto L25
                java.lang.String r0 = com.google.common.base.Ascii.toLowerCase(r0)
                java.lang.String r1 = "cleartext.*not permitted.*"
                boolean r0 = r0.matches(r1)
                if (r0 == 0) goto L25
                r0 = 2007(0x7d7, float:2.812E-42)
                goto L27
            L25:
                r0 = 2001(0x7d1, float:2.804E-42)
            L27:
                if (r0 != r2) goto L2f
                com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException r5 = new com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
                r5.<init>(r3, r4)
                goto L35
            L2f:
                com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
                r1.<init>(r3, r4, r0, r5)
                r5 = r1
            L35:
                return r5
        }
    }

    public static final class InvalidContentTypeException extends com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        public final java.lang.String contentType;

        public InvalidContentTypeException(java.lang.String r4, com.google.android.exoplayer2.upstream.DataSpec r5) {
                r3 = this;
                java.lang.String r0 = "Invalid content type: "
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
                r1 = 2003(0x7d3, float:2.807E-42)
                r2 = 1
                r3.<init>(r0, r5, r1, r2)
                r3.contentType = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class InvalidResponseCodeException extends com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;

        @androidx.annotation.Nullable
        public final java.lang.String responseMessage;

        public InvalidResponseCodeException(int r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.io.IOException r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11, com.google.android.exoplayer2.upstream.DataSpec r12, byte[] r13) {
                r7 = this;
                java.lang.String r0 = "Response code: "
                java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8)
                r5 = 2004(0x7d4, float:2.808E-42)
                r6 = 1
                r1 = r7
                r3 = r10
                r4 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                r7.responseCode = r8
                r7.responseMessage = r9
                r7.headerFields = r11
                r7.responseBody = r13
                return
        }

        @java.lang.Deprecated
        public InvalidResponseCodeException(int r8, @androidx.annotation.Nullable java.lang.String r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, com.google.android.exoplayer2.upstream.DataSpec r11) {
                r7 = this;
                byte[] r6 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
                r3 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r4 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @java.lang.Deprecated
        public InvalidResponseCodeException(int r8, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9, com.google.android.exoplayer2.upstream.DataSpec r10) {
                r7 = this;
                byte[] r6 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
                r2 = 0
                r3 = 0
                r0 = r7
                r1 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RequestProperties {
        private final java.util.Map<java.lang.String, java.lang.String> requestProperties;

        @androidx.annotation.Nullable
        private java.util.Map<java.lang.String, java.lang.String> requestPropertiesSnapshot;

        public RequestProperties() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.requestProperties = r0
                return
        }

        public synchronized void clear() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.requestPropertiesSnapshot = r0     // Catch: java.lang.Throwable -> Lb
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.requestProperties     // Catch: java.lang.Throwable -> Lb
                r0.clear()     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return
            Lb:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        public synchronized void clearAndSet(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.requestPropertiesSnapshot = r0     // Catch: java.lang.Throwable -> L10
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.requestProperties     // Catch: java.lang.Throwable -> L10
                r0.clear()     // Catch: java.lang.Throwable -> L10
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.requestProperties     // Catch: java.lang.Throwable -> L10
                r0.putAll(r2)     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        public synchronized java.util.Map<java.lang.String, java.lang.String> getSnapshot() {
                r2 = this;
                monitor-enter(r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.requestPropertiesSnapshot     // Catch: java.lang.Throwable -> L16
                if (r0 != 0) goto L12
                java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L16
                java.util.Map<java.lang.String, java.lang.String> r1 = r2.requestProperties     // Catch: java.lang.Throwable -> L16
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L16
                r2.requestPropertiesSnapshot = r0     // Catch: java.lang.Throwable -> L16
            L12:
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.requestPropertiesSnapshot     // Catch: java.lang.Throwable -> L16
                monitor-exit(r2)
                return r0
            L16:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        public synchronized void remove(java.lang.String r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.requestPropertiesSnapshot = r0     // Catch: java.lang.Throwable -> Lb
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.requestProperties     // Catch: java.lang.Throwable -> Lb
                r0.remove(r2)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return
            Lb:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        public synchronized void set(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.requestPropertiesSnapshot = r0     // Catch: java.lang.Throwable -> Lb
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.requestProperties     // Catch: java.lang.Throwable -> Lb
                r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return
            Lb:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        public synchronized void set(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.requestPropertiesSnapshot = r0     // Catch: java.lang.Throwable -> Lb
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.requestProperties     // Catch: java.lang.Throwable -> Lb
                r0.putAll(r2)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return
            Lb:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }
    }

    static {
            com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.upstream.HttpDataSource.REJECT_PAYWALL_TYPES = r0
            return
    }

    void clearAllRequestProperties();

    void clearRequestProperty(java.lang.String r1);

    void close() throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;

    int getResponseCode();

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders();

    long open(com.google.android.exoplayer2.upstream.DataSpec r1) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;

    int read(byte[] r1, int r2, int r3) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;

    void setRequestProperty(java.lang.String r1, java.lang.String r2);
}
