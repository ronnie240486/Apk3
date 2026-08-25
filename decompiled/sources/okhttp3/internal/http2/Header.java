package okhttp3.internal.http2;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Header {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Header.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString PSEUDO_PREFIX = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString RESPONSE_STATUS = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RESPONSE_STATUS_UTF8 = ":status";

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString TARGET_AUTHORITY = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TARGET_AUTHORITY_UTF8 = ":authority";

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString TARGET_METHOD = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TARGET_METHOD_UTF8 = ":method";

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString TARGET_PATH = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TARGET_PATH_UTF8 = ":path";

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString TARGET_SCHEME = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TARGET_SCHEME_UTF8 = ":scheme";

    @kotlin.jvm.JvmField
    public final int hpackSize;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString name;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString value;

    /* JADX INFO: compiled from: Header.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "()V", "PSEUDO_PREFIX", "Lokio/ByteString;", "RESPONSE_STATUS", "RESPONSE_STATUS_UTF8", "", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "okhttp"}, k = 1, mv = {1, 4, 1})
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
    }

    static {
            okhttp3.internal.http2.Header$Companion r0 = new okhttp3.internal.http2.Header$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Header.Companion = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = ":"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.PSEUDO_PREFIX = r1
            java.lang.String r1 = ":status"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.RESPONSE_STATUS = r1
            java.lang.String r1 = ":method"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_METHOD = r1
            java.lang.String r1 = ":path"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_PATH = r1
            java.lang.String r1 = ":scheme"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_SCHEME = r1
            java.lang.String r1 = ":authority"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_AUTHORITY = r0
            return
    }

    public Header(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.encodeUtf8(r2)
            okio.ByteString r3 = r0.encodeUtf8(r3)
            r1.<init>(r2, r3)
            return
    }

    public Header(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r3 = r0.encodeUtf8(r3)
            r1.<init>(r2, r3)
            return
    }

    public Header(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.name = r2
            r1.value = r3
            int r2 = r2.size()
            int r2 = r2 + 32
            int r3 = r3.size()
            int r3 = r3 + r2
            r1.hpackSize = r3
            return
    }

    public static /* synthetic */ okhttp3.internal.http2.Header copy$default(okhttp3.internal.http2.Header r0, okio.ByteString r1, okio.ByteString r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            okio.ByteString r1 = r0.name
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            okio.ByteString r2 = r0.value
        Lc:
            okhttp3.internal.http2.Header r0 = r0.copy(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString component1() {
            r1 = this;
            okio.ByteString r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString component2() {
            r1 = this;
            okio.ByteString r0 = r1.value
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Header copy(@org.jetbrains.annotations.NotNull okio.ByteString r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 == r3) goto L1f
            boolean r0 = r3 instanceof okhttp3.internal.http2.Header
            if (r0 == 0) goto L1d
            okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
            okio.ByteString r0 = r2.name
            okio.ByteString r1 = r3.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L1d
            okio.ByteString r0 = r2.value
            okio.ByteString r3 = r3.value
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            r3 = 1
            return r3
    }

    public int hashCode() {
            r3 = this;
            okio.ByteString r0 = r3.name
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            okio.ByteString r2 = r3.value
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okio.ByteString r1 = r2.name
            java.lang.String r1 = r1.utf8()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            okio.ByteString r1 = r2.value
            java.lang.String r1 = r1.utf8()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
