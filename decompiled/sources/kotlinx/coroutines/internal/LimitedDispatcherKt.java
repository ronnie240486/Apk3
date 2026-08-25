package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"checkParallelism", "", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int r1) {
            r0 = 1
            if (r1 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "Expected positive parallelism level, but got "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
