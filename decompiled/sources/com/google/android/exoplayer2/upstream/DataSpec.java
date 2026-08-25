package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @java.lang.Deprecated
    public final long absoluteStreamPosition;

    @androidx.annotation.Nullable
    public final java.lang.Object customData;
    public final int flags;

    @androidx.annotation.Nullable
    public final byte[] httpBody;
    public final int httpMethod;
    public final java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;

    @androidx.annotation.Nullable
    public final java.lang.String key;
    public final long length;
    public final long position;
    public final android.net.Uri uri;
    public final long uriPositionOffset;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.DataSpec$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {

        @androidx.annotation.Nullable
        private java.lang.Object customData;
        private int flags;

        @androidx.annotation.Nullable
        private byte[] httpBody;
        private int httpMethod;
        private java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;

        @androidx.annotation.Nullable
        private java.lang.String key;
        private long length;
        private long position;

        @androidx.annotation.Nullable
        private android.net.Uri uri;
        private long uriPositionOffset;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.httpMethod = r0
                java.util.Map r0 = java.util.Collections.emptyMap()
                r2.httpRequestHeaders = r0
                r0 = -1
                r2.length = r0
                return
        }

        private Builder(com.google.android.exoplayer2.upstream.DataSpec r3) {
                r2 = this;
                r2.<init>()
                android.net.Uri r0 = r3.uri
                r2.uri = r0
                long r0 = r3.uriPositionOffset
                r2.uriPositionOffset = r0
                int r0 = r3.httpMethod
                r2.httpMethod = r0
                byte[] r0 = r3.httpBody
                r2.httpBody = r0
                java.util.Map<java.lang.String, java.lang.String> r0 = r3.httpRequestHeaders
                r2.httpRequestHeaders = r0
                long r0 = r3.position
                r2.position = r0
                long r0 = r3.length
                r2.length = r0
                java.lang.String r0 = r3.key
                r2.key = r0
                int r0 = r3.flags
                r2.flags = r0
                java.lang.Object r3 = r3.customData
                r2.customData = r3
                return
        }

        public /* synthetic */ Builder(com.google.android.exoplayer2.upstream.DataSpec r1, com.google.android.exoplayer2.upstream.DataSpec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.exoplayer2.upstream.DataSpec build() {
                r18 = this;
                r0 = r18
                android.net.Uri r1 = r0.uri
                java.lang.String r2 = "The uri must be set."
                com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r1, r2)
                com.google.android.exoplayer2.upstream.DataSpec r1 = new com.google.android.exoplayer2.upstream.DataSpec
                android.net.Uri r4 = r0.uri
                long r5 = r0.uriPositionOffset
                int r7 = r0.httpMethod
                byte[] r8 = r0.httpBody
                java.util.Map<java.lang.String, java.lang.String> r9 = r0.httpRequestHeaders
                long r10 = r0.position
                long r12 = r0.length
                java.lang.String r14 = r0.key
                int r15 = r0.flags
                java.lang.Object r2 = r0.customData
                r17 = 0
                r3 = r1
                r16 = r2
                r3.<init>(r4, r5, r7, r8, r9, r10, r12, r14, r15, r16, r17)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setCustomData(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                r0.customData = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setFlags(int r1) {
                r0 = this;
                r0.flags = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setHttpBody(@androidx.annotation.Nullable byte[] r1) {
                r0 = this;
                r0.httpBody = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setHttpMethod(int r1) {
                r0 = this;
                r0.httpMethod = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setHttpRequestHeaders(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                r0.httpRequestHeaders = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setKey(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.key = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setLength(long r1) {
                r0 = this;
                r0.length = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setPosition(long r1) {
                r0 = this;
                r0.position = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setUri(android.net.Uri r1) {
                r0 = this;
                r0.uri = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setUri(java.lang.String r1) {
                r0 = this;
                android.net.Uri r1 = android.net.Uri.parse(r1)
                r0.uri = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.DataSpec.Builder setUriPositionOffset(long r1) {
                r0 = this;
                r0.uriPositionOffset = r1
                return r0
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
            java.lang.String r0 = "goog.exo.datasource"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    public DataSpec(android.net.Uri r7) {
            r6 = this;
            r2 = 0
            r4 = -1
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r9, int r10) {
            r8 = this;
            r2 = 0
            r4 = -1
            r6 = 0
            r0 = r8
            r1 = r9
            r7 = r10
            r0.<init>(r1, r2, r4, r6, r7)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r14, int r15, @androidx.annotation.Nullable byte[] r16, long r17, long r19, long r21, @androidx.annotation.Nullable java.lang.String r23, int r24) {
            r13 = this;
            java.util.Map r12 = java.util.Collections.emptyMap()
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r8 = r21
            r10 = r23
            r11 = r24
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11, r12)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r15, int r16, @androidx.annotation.Nullable byte[] r17, long r18, long r20, long r22, @androidx.annotation.Nullable java.lang.String r24, int r25, java.util.Map<java.lang.String, java.lang.String> r26) {
            r14 = this;
            long r2 = r18 - r20
            r13 = 0
            r0 = r14
            r1 = r15
            r4 = r16
            r5 = r17
            r6 = r26
            r7 = r20
            r9 = r22
            r11 = r24
            r12 = r25
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            return
    }

    private DataSpec(android.net.Uri r16, long r17, int r19, @androidx.annotation.Nullable byte[] r20, java.util.Map<java.lang.String, java.lang.String> r21, long r22, long r24, @androidx.annotation.Nullable java.lang.String r26, int r27, @androidx.annotation.Nullable java.lang.Object r28) {
            r15 = this;
            r0 = r15
            r1 = r17
            r3 = r20
            r4 = r22
            r6 = r24
            r15.<init>()
            long r8 = r1 + r4
            r10 = 1
            r11 = 0
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L18
            r14 = 1
            goto L19
        L18:
            r14 = 0
        L19:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r14)
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 < 0) goto L22
            r14 = 1
            goto L23
        L22:
            r14 = 0
        L23:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r14)
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 > 0) goto L32
            r12 = -1
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 != 0) goto L31
            goto L32
        L31:
            r10 = 0
        L32:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r10)
            r10 = r16
            r0.uri = r10
            r0.uriPositionOffset = r1
            r1 = r19
            r0.httpMethod = r1
            if (r3 == 0) goto L45
            int r1 = r3.length
            if (r1 == 0) goto L45
            goto L47
        L45:
            r1 = 0
            r3 = r1
        L47:
            r0.httpBody = r3
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r21
            r1.<init>(r2)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.httpRequestHeaders = r1
            r0.position = r4
            r0.absoluteStreamPosition = r8
            r0.length = r6
            r1 = r26
            r0.key = r1
            r1 = r27
            r0.flags = r1
            r1 = r28
            r0.customData = r1
            return
    }

    public /* synthetic */ DataSpec(android.net.Uri r1, long r2, int r4, byte[] r5, java.util.Map r6, long r7, long r9, java.lang.String r11, int r12, java.lang.Object r13, com.google.android.exoplayer2.upstream.DataSpec.AnonymousClass1 r14) {
            r0 = this;
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            return
    }

    public DataSpec(android.net.Uri r15, long r16, long r18) {
            r14 = this;
            java.util.Map r6 = java.util.Collections.emptyMap()
            r2 = 0
            r4 = 1
            r5 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = r14
            r1 = r15
            r7 = r16
            r9 = r18
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r12, long r13, long r15, long r17, @androidx.annotation.Nullable java.lang.String r19, int r20) {
            r11 = this;
            r2 = 0
            r0 = r11
            r1 = r12
            r3 = r13
            r5 = r15
            r7 = r17
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r10)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r11, long r12, long r14, @androidx.annotation.Nullable java.lang.String r16) {
            r10 = this;
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r12
            r6 = r14
            r8 = r16
            r0.<init>(r1, r2, r4, r6, r8, r9)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r11, long r12, long r14, @androidx.annotation.Nullable java.lang.String r16, int r17) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r12
            r6 = r14
            r8 = r16
            r9 = r17
            r0.<init>(r1, r2, r4, r6, r8, r9)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r14, long r15, long r17, @androidx.annotation.Nullable java.lang.String r19, int r20, java.util.Map<java.lang.String, java.lang.String> r21) {
            r13 = this;
            r2 = 1
            r3 = 0
            r0 = r13
            r1 = r14
            r4 = r15
            r6 = r15
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11, r12)
            return
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri r13, @androidx.annotation.Nullable byte[] r14, long r15, long r17, long r19, @androidx.annotation.Nullable java.lang.String r21, int r22) {
            r12 = this;
            if (r14 == 0) goto L5
            r0 = 2
            r2 = 2
            goto L7
        L5:
            r0 = 1
            r2 = 1
        L7:
            r0 = r12
            r1 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r8 = r19
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11)
            return
    }

    public static java.lang.String getStringForHttpMethod(int r1) {
            r0 = 1
            if (r1 == r0) goto L15
            r0 = 2
            if (r1 == r0) goto L12
            r0 = 3
            if (r1 != r0) goto Lc
            java.lang.String r1 = "HEAD"
            return r1
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L12:
            java.lang.String r1 = "POST"
            return r1
        L15:
            java.lang.String r1 = "GET"
            return r1
    }

    public com.google.android.exoplayer2.upstream.DataSpec.Builder buildUpon() {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSpec$Builder r0 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final java.lang.String getHttpMethodString() {
            r1 = this;
            int r0 = r1.httpMethod
            java.lang.String r0 = getStringForHttpMethod(r0)
            return r0
    }

    public boolean isFlagSet(int r2) {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public com.google.android.exoplayer2.upstream.DataSpec subrange(long r6) {
            r5 = this;
            long r0 = r5.length
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto Lb
        L9:
            long r2 = r0 - r6
        Lb:
            com.google.android.exoplayer2.upstream.DataSpec r6 = r5.subrange(r6, r2)
            return r6
    }

    public com.google.android.exoplayer2.upstream.DataSpec subrange(long r18, long r20) {
            r17 = this;
            r0 = r17
            r1 = 0
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto Lf
            long r1 = r0.length
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 != 0) goto Lf
            return r0
        Lf:
            com.google.android.exoplayer2.upstream.DataSpec r1 = new com.google.android.exoplayer2.upstream.DataSpec
            android.net.Uri r4 = r0.uri
            long r5 = r0.uriPositionOffset
            int r7 = r0.httpMethod
            byte[] r8 = r0.httpBody
            java.util.Map<java.lang.String, java.lang.String> r9 = r0.httpRequestHeaders
            long r2 = r0.position
            long r10 = r2 + r18
            java.lang.String r14 = r0.key
            int r15 = r0.flags
            java.lang.Object r2 = r0.customData
            r3 = r1
            r12 = r20
            r16 = r2
            r3.<init>(r4, r5, r7, r8, r9, r10, r12, r14, r15, r16)
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "DataSpec["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.getHttpMethodString()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            android.net.Uri r1 = r4.uri
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.position
            r0.append(r2)
            r0.append(r1)
            long r2 = r4.length
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r4.key
            r0.append(r2)
            r0.append(r1)
            int r1 = r4.flags
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    public com.google.android.exoplayer2.upstream.DataSpec withAdditionalHeaders(java.util.Map<java.lang.String, java.lang.String> r15) {
            r14 = this;
            java.util.HashMap r6 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r0 = r14.httpRequestHeaders
            r6.<init>(r0)
            r6.putAll(r15)
            com.google.android.exoplayer2.upstream.DataSpec r15 = new com.google.android.exoplayer2.upstream.DataSpec
            android.net.Uri r1 = r14.uri
            long r2 = r14.uriPositionOffset
            int r4 = r14.httpMethod
            byte[] r5 = r14.httpBody
            long r7 = r14.position
            long r9 = r14.length
            java.lang.String r11 = r14.key
            int r12 = r14.flags
            java.lang.Object r13 = r14.customData
            r0 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            return r15
    }

    public com.google.android.exoplayer2.upstream.DataSpec withRequestHeaders(java.util.Map<java.lang.String, java.lang.String> r17) {
            r16 = this;
            r0 = r16
            com.google.android.exoplayer2.upstream.DataSpec r15 = new com.google.android.exoplayer2.upstream.DataSpec
            android.net.Uri r2 = r0.uri
            long r3 = r0.uriPositionOffset
            int r5 = r0.httpMethod
            byte[] r6 = r0.httpBody
            long r8 = r0.position
            long r10 = r0.length
            java.lang.String r12 = r0.key
            int r13 = r0.flags
            java.lang.Object r14 = r0.customData
            r1 = r15
            r7 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r10, r12, r13, r14)
            return r15
    }

    public com.google.android.exoplayer2.upstream.DataSpec withUri(android.net.Uri r17) {
            r16 = this;
            r0 = r16
            com.google.android.exoplayer2.upstream.DataSpec r15 = new com.google.android.exoplayer2.upstream.DataSpec
            long r3 = r0.uriPositionOffset
            int r5 = r0.httpMethod
            byte[] r6 = r0.httpBody
            java.util.Map<java.lang.String, java.lang.String> r7 = r0.httpRequestHeaders
            long r8 = r0.position
            long r10 = r0.length
            java.lang.String r12 = r0.key
            int r13 = r0.flags
            java.lang.Object r14 = r0.customData
            r1 = r15
            r2 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r10, r12, r13, r14)
            return r15
    }
}
