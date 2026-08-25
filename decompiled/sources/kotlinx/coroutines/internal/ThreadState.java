package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "n", "", "(Lkotlin/coroutines/CoroutineContext;I)V", "elements", "", "Lkotlinx/coroutines/ThreadContextElement;", "[Lkotlinx/coroutines/ThreadContextElement;", "i", "values", "[Ljava/lang/Object;", "append", "", "element", "value", "restore", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ThreadState {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext context;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] elements;
    private int i;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] values;

    public ThreadState(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.values = r1
            kotlinx.coroutines.ThreadContextElement[] r1 = new kotlinx.coroutines.ThreadContextElement[r2]
            r0.elements = r1
            return
    }

    public final void append(@org.jetbrains.annotations.NotNull kotlinx.coroutines.ThreadContextElement<?> r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r2 = this;
            java.lang.Object[] r0 = r2.values
            int r1 = r2.i
            r0[r1] = r4
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r4 = r2.elements
            int r0 = r1 + 1
            r2.i = r0
            r4[r1] = r3
            return
    }

    public final void restore(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r5) {
            r4 = this;
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r0 = r4.elements
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1c
        L7:
            int r1 = r0 + (-1)
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r2 = r4.elements
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object[] r3 = r4.values
            r0 = r3[r0]
            r2.restoreThreadContext(r5, r0)
            if (r1 >= 0) goto L1a
            goto L1c
        L1a:
            r0 = r1
            goto L7
        L1c:
            return
    }
}
