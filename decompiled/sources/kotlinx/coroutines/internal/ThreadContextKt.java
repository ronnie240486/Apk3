package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ThreadContextKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol NO_THREAD_ELEMENTS = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object> countAll = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>> findOne = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState> updateState = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r0.<init>(r1)
            kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS = r0
            kotlinx.coroutines.internal.ThreadContextKt$countAll$1 r0 = kotlinx.coroutines.internal.ThreadContextKt$countAll$1.INSTANCE
            kotlinx.coroutines.internal.ThreadContextKt.countAll = r0
            kotlinx.coroutines.internal.ThreadContextKt$findOne$1 r0 = kotlinx.coroutines.internal.ThreadContextKt$findOne$1.INSTANCE
            kotlinx.coroutines.internal.ThreadContextKt.findOne = r0
            kotlinx.coroutines.internal.ThreadContextKt$updateState$1 r0 = kotlinx.coroutines.internal.ThreadContextKt$updateState$1.INSTANCE
            kotlinx.coroutines.internal.ThreadContextKt.updateState = r0
            return
    }

    public static final void restoreThreadContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 != r0) goto L5
            return
        L5:
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.ThreadState
            if (r0 == 0) goto Lf
            kotlinx.coroutines.internal.ThreadState r3 = (kotlinx.coroutines.internal.ThreadState) r3
            r3.restore(r2)
            goto L20
        Lf:
            r0 = 0
            kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext$Element, kotlinx.coroutines.ThreadContextElement<?>> r1 = kotlinx.coroutines.internal.ThreadContextKt.findOne
            java.lang.Object r0 = r2.fold(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            java.util.Objects.requireNonNull(r0, r1)
            kotlinx.coroutines.ThreadContextElement r0 = (kotlinx.coroutines.ThreadContextElement) r0
            r0.restoreThreadContext(r2, r3)
        L20:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object threadContextElements(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext$Element, java.lang.Object> r1 = kotlinx.coroutines.internal.ThreadContextKt.countAll
            java.lang.Object r2 = r2.fold(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object updateThreadContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            if (r2 != 0) goto L6
            java.lang.Object r2 = threadContextElements(r1)
        L6:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != r0) goto L10
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            goto L2c
        L10:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L26
            kotlinx.coroutines.internal.ThreadState r0 = new kotlinx.coroutines.internal.ThreadState
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext$Element, kotlinx.coroutines.internal.ThreadState> r2 = kotlinx.coroutines.internal.ThreadContextKt.updateState
            java.lang.Object r1 = r1.fold(r0, r2)
            goto L2c
        L26:
            kotlinx.coroutines.ThreadContextElement r2 = (kotlinx.coroutines.ThreadContextElement) r2
            java.lang.Object r1 = r2.updateThreadContext(r1)
        L2c:
            return r1
    }
}
