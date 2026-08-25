package okio;

/* JADX INFO: renamed from: okio.-DeprecatedUpgrade, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedUpgrade.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Okio", "Lokio/-DeprecatedOkio;", "getOkio", "()Lokio/-DeprecatedOkio;", "Utf8", "Lokio/-DeprecatedUtf8;", "getUtf8", "()Lokio/-DeprecatedUtf8;", "okio"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "-DeprecatedUpgrade")
public final class DeprecatedUpgrade {

    @org.jetbrains.annotations.NotNull
    private static final okio.DeprecatedOkio Okio = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.DeprecatedUtf8 Utf8 = null;

    static {
            okio.-DeprecatedOkio r0 = okio.DeprecatedOkio.INSTANCE
            okio.DeprecatedUpgrade.Okio = r0
            okio.-DeprecatedUtf8 r0 = okio.DeprecatedUtf8.INSTANCE
            okio.DeprecatedUpgrade.Utf8 = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.DeprecatedOkio getOkio() {
            okio.-DeprecatedOkio r0 = okio.DeprecatedUpgrade.Okio
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.DeprecatedUtf8 getUtf8() {
            okio.-DeprecatedUtf8 r0 = okio.DeprecatedUpgrade.Utf8
            return r0
    }
}
