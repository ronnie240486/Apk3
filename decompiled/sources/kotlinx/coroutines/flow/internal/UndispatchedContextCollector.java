package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "emitContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "countOrElement", "", "emitRef", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class UndispatchedContextCollector<T> implements kotlinx.coroutines.flow.FlowCollector<T> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object countOrElement;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext emitContext;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> emitRef;

    public UndispatchedContextCollector(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3) {
            r1 = this;
            r1.<init>()
            r1.emitContext = r3
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r3)
            r1.countOrElement = r3
            kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1 r3 = new kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1
            r0 = 0
            r3.<init>(r2, r0)
            r1.emitRef = r3
            return
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.emitContext
            java.lang.Object r1 = r3.countOrElement
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.emitRef
            java.lang.Object r4 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(r0, r4, r1, r2, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L11
            return r4
        L11:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
