package androidx.tracing;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(18)
final class TraceApi18Impl {
    private TraceApi18Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginSection(@androidx.annotation.NonNull java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    public static void endSection() {
            android.os.Trace.endSection()
            return
    }
}
