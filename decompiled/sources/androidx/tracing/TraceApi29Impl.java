package androidx.tracing;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(29)
final class TraceApi29Impl {
    private TraceApi29Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(@androidx.annotation.NonNull java.lang.String r0, int r1) {
            android.os.Trace.beginAsyncSection(r0, r1)
            return
    }

    public static void endAsyncSection(@androidx.annotation.NonNull java.lang.String r0, int r1) {
            android.os.Trace.endAsyncSection(r0, r1)
            return
    }

    public static void setCounter(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            long r0 = (long) r3
            android.os.Trace.setCounter(r2, r0)
            return
    }
}
