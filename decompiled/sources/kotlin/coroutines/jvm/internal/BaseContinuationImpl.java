package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R!\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/coroutines/Continuation;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class BaseContinuationImpl implements kotlin.coroutines.Continuation<java.lang.Object>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, java.io.Serializable {

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.Continuation<java.lang.Object> completion;

    public BaseContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.completion = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2) {
            r0 = this;
            java.lang.String r1 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "create(Any?;Continuation) has not been overridden"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "create(Continuation) has not been overridden"
            r2.<init>(r0)
            throw r2
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r2.completion
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.Continuation<java.lang.Object> getCompletion() {
            r1 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r1.completion
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            java.lang.StackTraceElement r0 = kotlin.coroutines.jvm.internal.DebugMetadataKt.getStackTraceElement(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r1);

    public void releaseIntercepted() {
            r0 = this;
            return
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            r0 = r3
        L1:
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineResumed(r0)
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r0 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r0
            kotlin.coroutines.Continuation<java.lang.Object> r1 = r0.completion
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Object r4 = r0.invokeSuspend(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L1d
            if (r4 != r2) goto L16
            return
        L16:
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = kotlin.Result.m333constructorimpl(r4)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r4 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m333constructorimpl(r4)
        L28:
            r0.releaseIntercepted()
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 == 0) goto L31
            r0 = r1
            goto L1
        L31:
            r1.resumeWith(r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Continuation at "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto Ld
            goto L15
        Ld:
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
        L15:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
