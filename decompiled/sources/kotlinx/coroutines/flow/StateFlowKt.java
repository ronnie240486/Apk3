package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b¢\u0006\u0002\u0010\n\u001a6\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a2\u0010\u0014\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u0016H\u0086\b¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u0016H\u0086\b\u001a2\u0010\u001a\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u0016H\u0086\b¢\u0006\u0002\u0010\u0017\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u001b"}, d2 = {"NONE", "Lkotlinx/coroutines/internal/Symbol;", "getNONE$annotations", "()V", "PENDING", "getPENDING$annotations", "MutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "fuseStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "getAndUpdate", "function", "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "update", "", "updateAndGet", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StateFlowKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol NONE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol PENDING = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NONE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.StateFlowKt.NONE = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PENDING"
            r0.<init>(r1)
            kotlinx.coroutines.flow.StateFlowKt.PENDING = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.MutableStateFlow<T> MutableStateFlow(T r1) {
            kotlinx.coroutines.flow.StateFlowImpl r0 = new kotlinx.coroutines.flow.StateFlowImpl
            if (r1 != 0) goto L6
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L6:
            r0.<init>(r1)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNONE$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.NONE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPENDING$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.PENDING
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseStateFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.StateFlow<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = 0
            if (r4 < 0) goto L7
            r1 = 2
            if (r4 >= r1) goto L7
            r0 = 1
        L7:
            if (r0 != 0) goto Lc
            r0 = -2
            if (r4 != r0) goto L11
        Lc:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r5 != r0) goto L11
            return r2
        L11:
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(r2, r3, r4, r5)
            return r2
    }

    public static final <T> T getAndUpdate(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.MutableStateFlow<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
        L0:
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r1 = r2.compareAndSet(r0, r1)
            if (r1 == 0) goto L0
            return r0
    }

    private static /* synthetic */ void getNONE$annotations() {
            return
    }

    private static /* synthetic */ void getPENDING$annotations() {
            return
    }

    public static final <T> void update(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.MutableStateFlow<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
        L0:
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L0
            return
    }

    public static final <T> T updateAndGet(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.MutableStateFlow<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
        L0:
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L0
            return r1
    }
}
