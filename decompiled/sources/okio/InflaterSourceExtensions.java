package okio;

/* JADX INFO: renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "okio"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "-InflaterSourceExtensions")
public final class InflaterSourceExtensions {
    @org.jetbrains.annotations.NotNull
    public static final okio.InflaterSource inflate(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull java.util.zip.Inflater r2) {
            java.lang.String r0 = "$this$inflate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.InflaterSource r0 = new okio.InflaterSource
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.InflaterSource inflate$default(okio.Source r0, java.util.zip.Inflater r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
        L9:
            java.lang.String r2 = "$this$inflate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            okio.InflaterSource r2 = new okio.InflaterSource
            r2.<init>(r0, r1)
            return r2
    }
}
