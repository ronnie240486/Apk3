package okhttp3;

/* JADX INFO: compiled from: TlsVersion.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0006R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lokhttp3/TlsVersion;", "", "javaName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "()Ljava/lang/String;", "-deprecated_javaName", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final enum TlsVersion extends java.lang.Enum<okhttp3.TlsVersion> {
    private static final /* synthetic */ okhttp3.TlsVersion[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.TlsVersion.Companion Companion = null;
    public static final okhttp3.TlsVersion SSL_3_0 = null;
    public static final okhttp3.TlsVersion TLS_1_0 = null;
    public static final okhttp3.TlsVersion TLS_1_1 = null;
    public static final okhttp3.TlsVersion TLS_1_2 = null;
    public static final okhttp3.TlsVersion TLS_1_3 = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String javaName;

    /* JADX INFO: compiled from: TlsVersion.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lokhttp3/TlsVersion$Companion;", "", "()V", "forJavaName", "Lokhttp3/TlsVersion;", "javaName", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final okhttp3.TlsVersion forJavaName(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "javaName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                int r0 = r3.hashCode()
                r1 = 79201641(0x4b88569, float:4.338071E-36)
                if (r0 == r1) goto L43
                r1 = 79923350(0x4c38896, float:4.5969714E-36)
                if (r0 == r1) goto L38
                switch(r0) {
                    case -503070503: goto L2d;
                    case -503070502: goto L22;
                    case -503070501: goto L17;
                    default: goto L16;
                }
            L16:
                goto L4e
            L17:
                java.lang.String r0 = "TLSv1.3"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_3
                goto L4d
            L22:
                java.lang.String r0 = "TLSv1.2"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_2
                goto L4d
            L2d:
                java.lang.String r0 = "TLSv1.1"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_1
                goto L4d
            L38:
                java.lang.String r0 = "TLSv1"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_0
                goto L4d
            L43:
                java.lang.String r0 = "SSLv3"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r3 = okhttp3.TlsVersion.SSL_3_0
            L4d:
                return r3
            L4e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unexpected TLS version: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
        }
    }

    static {
            r0 = 5
            okhttp3.TlsVersion[] r0 = new okhttp3.TlsVersion[r0]
            okhttp3.TlsVersion r1 = new okhttp3.TlsVersion
            java.lang.String r2 = "TLS_1_3"
            r3 = 0
            java.lang.String r4 = "TLSv1.3"
            r1.<init>(r2, r3, r4)
            okhttp3.TlsVersion.TLS_1_3 = r1
            r0[r3] = r1
            okhttp3.TlsVersion r1 = new okhttp3.TlsVersion
            java.lang.String r2 = "TLS_1_2"
            r3 = 1
            java.lang.String r4 = "TLSv1.2"
            r1.<init>(r2, r3, r4)
            okhttp3.TlsVersion.TLS_1_2 = r1
            r0[r3] = r1
            okhttp3.TlsVersion r1 = new okhttp3.TlsVersion
            java.lang.String r2 = "TLS_1_1"
            r3 = 2
            java.lang.String r4 = "TLSv1.1"
            r1.<init>(r2, r3, r4)
            okhttp3.TlsVersion.TLS_1_1 = r1
            r0[r3] = r1
            okhttp3.TlsVersion r1 = new okhttp3.TlsVersion
            java.lang.String r2 = "TLS_1_0"
            r3 = 3
            java.lang.String r4 = "TLSv1"
            r1.<init>(r2, r3, r4)
            okhttp3.TlsVersion.TLS_1_0 = r1
            r0[r3] = r1
            okhttp3.TlsVersion r1 = new okhttp3.TlsVersion
            java.lang.String r2 = "SSL_3_0"
            r3 = 4
            java.lang.String r4 = "SSLv3"
            r1.<init>(r2, r3, r4)
            okhttp3.TlsVersion.SSL_3_0 = r1
            r0[r3] = r1
            okhttp3.TlsVersion.$VALUES = r0
            okhttp3.TlsVersion$Companion r0 = new okhttp3.TlsVersion$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.TlsVersion.Companion = r0
            return
    }

    private TlsVersion(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.javaName = r3
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.TlsVersion forJavaName(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.TlsVersion$Companion r0 = okhttp3.TlsVersion.Companion
            okhttp3.TlsVersion r1 = r0.forJavaName(r1)
            return r1
    }

    public static okhttp3.TlsVersion valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.TlsVersion> r0 = okhttp3.TlsVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.TlsVersion r1 = (okhttp3.TlsVersion) r1
            return r1
    }

    public static okhttp3.TlsVersion[] values() {
            okhttp3.TlsVersion[] r0 = okhttp3.TlsVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.TlsVersion[] r0 = (okhttp3.TlsVersion[]) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "javaName", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_javaName")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final java.lang.String m2012deprecated_javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }

    @kotlin.jvm.JvmName(name = "javaName")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }
}
