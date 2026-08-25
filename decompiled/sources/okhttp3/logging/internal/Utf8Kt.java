package okhttp3.logging.internal;

/* JADX INFO: compiled from: utf8.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isProbablyUtf8", "", "Lokio/Buffer;", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 1})
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@org.jetbrains.annotations.NotNull okio.Buffer r8) {
            java.lang.String r0 = "$this$isProbablyUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            okio.Buffer r7 = new okio.Buffer     // Catch: java.io.EOFException -> L3e
            r7.<init>()     // Catch: java.io.EOFException -> L3e
            long r1 = r8.size()     // Catch: java.io.EOFException -> L3e
            r3 = 64
            long r5 = kotlin.ranges.RangesKt.coerceAtMost(r1, r3)     // Catch: java.io.EOFException -> L3e
            r3 = 0
            r1 = r8
            r2 = r7
            r1.copyTo(r2, r3, r5)     // Catch: java.io.EOFException -> L3e
            r8 = 16
            r1 = 0
        L1f:
            if (r1 >= r8) goto L3c
            boolean r2 = r7.exhausted()     // Catch: java.io.EOFException -> L3e
            if (r2 == 0) goto L28
            goto L3c
        L28:
            int r2 = r7.readUtf8CodePoint()     // Catch: java.io.EOFException -> L3e
            boolean r3 = java.lang.Character.isISOControl(r2)     // Catch: java.io.EOFException -> L3e
            if (r3 == 0) goto L39
            boolean r2 = java.lang.Character.isWhitespace(r2)     // Catch: java.io.EOFException -> L3e
            if (r2 != 0) goto L39
            return r0
        L39:
            int r1 = r1 + 1
            goto L1f
        L3c:
            r8 = 1
            return r8
        L3e:
            return r0
    }
}
