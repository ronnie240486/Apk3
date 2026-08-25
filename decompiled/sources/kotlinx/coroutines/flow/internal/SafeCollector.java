package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ%\u0010\u001a\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J \u0010$\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0016ø\u0001\u0000¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0010H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collectContextSize", "", "completion", "Lkotlin/coroutines/Continuation;", "", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEmissionContext", "checkContext", "currentContext", "previousContext", "value", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "exceptionTransparencyViolated", "exception", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SafeCollector<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlinx.coroutines.flow.FlowCollector<T> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext collectContext;

    @kotlin.jvm.JvmField
    public final int collectContextSize;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.FlowCollector<T> collector;

    @org.jetbrains.annotations.Nullable
    private kotlin.coroutines.Continuation<? super kotlin.Unit> completion;

    @org.jetbrains.annotations.Nullable
    private kotlin.coroutines.CoroutineContext lastEmissionContext;

    public SafeCollector(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.NoOpContinuation r0 = kotlinx.coroutines.flow.internal.NoOpContinuation.INSTANCE
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r2.<init>(r0, r1)
            r2.collector = r3
            r2.collectContext = r4
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1 r0 = kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1.INSTANCE
            java.lang.Object r3 = r4.fold(r3, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.collectContextSize = r3
            return
    }

    private final void checkContext(kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.CoroutineContext r3, T r4) {
            r1 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            if (r0 == 0) goto L9
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r3 = (kotlinx.coroutines.flow.internal.DownstreamExceptionContext) r3
            r1.exceptionTransparencyViolated(r3, r4)
        L9:
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt.checkContext(r1, r2)
            return
    }

    private final java.lang.Object emit(kotlin.coroutines.Continuation<? super kotlin.Unit> r3, T r4) {
            r2 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            kotlin.coroutines.CoroutineContext r1 = r2.lastEmissionContext
            if (r1 == r0) goto L10
            r2.checkContext(r0, r1, r4)
            r2.lastEmissionContext = r0
        L10:
            r2.completion = r3
            kotlin.jvm.functions.Function3 r3 = kotlinx.coroutines.flow.internal.SafeCollectorKt.access$getEmitFun$p()
            kotlinx.coroutines.flow.FlowCollector<T> r0 = r2.collector
            java.lang.Object r3 = r3.invoke(r0, r4, r2)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 != 0) goto L29
            r4 = 0
            r2.completion = r4
        L29:
            return r3
    }

    private final void exceptionTransparencyViolated(kotlinx.coroutines.flow.internal.DownstreamExceptionContext r3, java.lang.Object r4) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Throwable r3 = r3.e
            r1.append(r3)
            java.lang.String r3 = ", but then emission attempt of value '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = kotlin.text.StringsKt.trimIndent(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r2 = r1.emit(r3, r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto Ld
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        Ld:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L14
            return r2
        L14:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L17:
            r2 = move-exception
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r0 = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            r0.<init>(r2, r3)
            r1.lastEmissionContext = r0
            throw r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r2.completion
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.lastEmissionContext
            if (r0 != 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = kotlin.Result.m336exceptionOrNullimpl(r4)
            if (r0 != 0) goto L7
            goto L12
        L7:
            kotlinx.coroutines.flow.internal.DownstreamExceptionContext r1 = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext
            kotlin.coroutines.CoroutineContext r2 = r3.getContext()
            r1.<init>(r0, r2)
            r3.lastEmissionContext = r1
        L12:
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r3.completion
            if (r0 != 0) goto L17
            goto L1a
        L17:
            r0.resumeWith(r4)
        L1a:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r4
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
            r0 = this;
            super.releaseIntercepted()
            return
    }
}
