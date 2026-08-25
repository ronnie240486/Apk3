package okhttp3;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Credentials {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Credentials INSTANCE = null;

    static {
            okhttp3.Credentials r0 = new okhttp3.Credentials
            r0.<init>()
            okhttp3.Credentials.INSTANCE = r0
            return
    }

    private Credentials() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String basic(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = 0
            r1 = 4
            java.lang.String r2 = basic$default(r2, r3, r0, r1, r0)
            return r2
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String basic(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "username"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "password"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            okio.ByteString r1 = r2.encodeString(r1, r3)
            java.lang.String r1 = r1.base64()
            java.lang.String r2 = "Basic "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            return r1
    }

    public static /* synthetic */ java.lang.String basic$default(java.lang.String r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto Lb
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r3 = "ISO_8859_1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        Lb:
            java.lang.String r0 = basic(r0, r1, r2)
            return r0
    }
}
