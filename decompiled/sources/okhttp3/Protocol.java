package okhttp3;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lokhttp3/Protocol;", "", "protocol", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final enum Protocol extends java.lang.Enum<okhttp3.Protocol> {
    private static final /* synthetic */ okhttp3.Protocol[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Protocol.Companion Companion = null;
    public static final okhttp3.Protocol H2_PRIOR_KNOWLEDGE = null;
    public static final okhttp3.Protocol HTTP_1_0 = null;
    public static final okhttp3.Protocol HTTP_1_1 = null;
    public static final okhttp3.Protocol HTTP_2 = null;
    public static final okhttp3.Protocol QUIC = null;

    @kotlin.Deprecated(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    public static final okhttp3.Protocol SPDY_3 = null;
    private final java.lang.String protocol;

    /* JADX INFO: compiled from: Protocol.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "()V", "get", "Lokhttp3/Protocol;", "protocol", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Protocol get(@org.jetbrains.annotations.NotNull java.lang.String r3) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 == 0) goto L12
                goto L52
            L12:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 == 0) goto L1f
                goto L52
            L1f:
                okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 == 0) goto L2c
                goto L52
            L2c:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_2
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 == 0) goto L39
                goto L52
            L39:
                okhttp3.Protocol r0 = okhttp3.Protocol.SPDY_3
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 == 0) goto L46
                goto L52
            L46:
                okhttp3.Protocol r0 = okhttp3.Protocol.QUIC
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 == 0) goto L53
            L52:
                return r0
            L53:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Unexpected protocol: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
        }
    }

    static {
            r0 = 6
            okhttp3.Protocol[] r0 = new okhttp3.Protocol[r0]
            okhttp3.Protocol r1 = new okhttp3.Protocol
            java.lang.String r2 = "HTTP_1_0"
            r3 = 0
            java.lang.String r4 = "http/1.0"
            r1.<init>(r2, r3, r4)
            okhttp3.Protocol.HTTP_1_0 = r1
            r0[r3] = r1
            okhttp3.Protocol r1 = new okhttp3.Protocol
            java.lang.String r2 = "HTTP_1_1"
            r3 = 1
            java.lang.String r4 = "http/1.1"
            r1.<init>(r2, r3, r4)
            okhttp3.Protocol.HTTP_1_1 = r1
            r0[r3] = r1
            okhttp3.Protocol r1 = new okhttp3.Protocol
            java.lang.String r2 = "SPDY_3"
            r3 = 2
            java.lang.String r4 = "spdy/3.1"
            r1.<init>(r2, r3, r4)
            okhttp3.Protocol.SPDY_3 = r1
            r0[r3] = r1
            okhttp3.Protocol r1 = new okhttp3.Protocol
            java.lang.String r2 = "HTTP_2"
            r3 = 3
            java.lang.String r4 = "h2"
            r1.<init>(r2, r3, r4)
            okhttp3.Protocol.HTTP_2 = r1
            r0[r3] = r1
            okhttp3.Protocol r1 = new okhttp3.Protocol
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE"
            r3 = 4
            java.lang.String r4 = "h2_prior_knowledge"
            r1.<init>(r2, r3, r4)
            okhttp3.Protocol.H2_PRIOR_KNOWLEDGE = r1
            r0[r3] = r1
            okhttp3.Protocol r1 = new okhttp3.Protocol
            java.lang.String r2 = "QUIC"
            r3 = 5
            java.lang.String r4 = "quic"
            r1.<init>(r2, r3, r4)
            okhttp3.Protocol.QUIC = r1
            r0[r3] = r1
            okhttp3.Protocol.$VALUES = r0
            okhttp3.Protocol$Companion r0 = new okhttp3.Protocol$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Protocol.Companion = r0
            return
    }

    private Protocol(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.protocol = r3
            return
    }

    public static final /* synthetic */ java.lang.String access$getProtocol$p(okhttp3.Protocol r0) {
            java.lang.String r0 = r0.protocol
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Protocol get(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.io.IOException {
            okhttp3.Protocol$Companion r0 = okhttp3.Protocol.Companion
            okhttp3.Protocol r1 = r0.get(r1)
            return r1
    }

    public static okhttp3.Protocol valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.Protocol> r0 = okhttp3.Protocol.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.Protocol r1 = (okhttp3.Protocol) r1
            return r1
    }

    public static okhttp3.Protocol[] values() {
            okhttp3.Protocol[] r0 = okhttp3.Protocol.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.Protocol[] r0 = (okhttp3.Protocol[]) r0
            return r0
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }
}
