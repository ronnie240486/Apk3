package okio;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, d2 = {"gzip", "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "-GzipSinkExtensions")
public final class GzipSinkExtensions {
    @org.jetbrains.annotations.NotNull
    public static final okio.GzipSink gzip(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            java.lang.String r0 = "$this$gzip"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.GzipSink r0 = new okio.GzipSink
            r0.<init>(r1)
            return r0
    }
}
