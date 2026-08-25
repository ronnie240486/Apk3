package okio;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedUtf8.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Deprecated(message = "changed in Okio 2.x")
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lokio/-DeprecatedUtf8;", "", "()V", "size", "", "string", "", "beginIndex", "", "endIndex", "okio"}, k = 1, mv = {1, 4, 1})
public final class DeprecatedUtf8 {

    @org.jetbrains.annotations.NotNull
    public static final okio.DeprecatedUtf8 INSTANCE = null;

    static {
            okio.-DeprecatedUtf8 r0 = new okio.-DeprecatedUtf8
            r0.<init>()
            okio.DeprecatedUtf8.INSTANCE = r0
            return
    }

    private DeprecatedUtf8() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long size(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 3
            r2 = 0
            long r0 = okio.Utf8.size$default(r4, r0, r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long size(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r2 = okio.Utf8.size(r2, r3, r4)
            return r2
    }
}
