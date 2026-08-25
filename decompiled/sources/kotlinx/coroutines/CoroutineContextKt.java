package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a8\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0013\u001a4\u0010\u0014\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\n*\u00020\u0003H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0003H\u0007\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u00020\u001dH\u0080\u0010\u001a(\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006 "}, d2 = {"DEBUG_THREAD_NAME_SEPARATOR", "", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "foldCopies", "originalContext", "appendContext", "isNewCoroutine", "", "withContinuationContext", "T", "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", "context", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasCopyableElements", "newCoroutineContext", "addedContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CoroutineContextKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DEBUG_THREAD_NAME_SEPARATOR = " @";



    private static final kotlin.coroutines.CoroutineContext foldCopies(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.CoroutineContext r4, boolean r5) {
            boolean r0 = hasCopyableElements(r3)
            boolean r1 = hasCopyableElements(r4)
            if (r0 != 0) goto L11
            if (r1 != 0) goto L11
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r4)
            return r3
        L11:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.element = r4
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1 r2 = new kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            r2.<init>(r0, r5)
            java.lang.Object r3 = r3.fold(r4, r2)
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            if (r1 == 0) goto L33
            T r5 = r0.element
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            kotlinx.coroutines.CoroutineContextKt$foldCopies$1 r1 = kotlinx.coroutines.CoroutineContextKt.AnonymousClass1.INSTANCE
            java.lang.Object r4 = r5.fold(r4, r1)
            r0.element = r4
        L33:
            T r4 = r0.element
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r4)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getCoroutineName(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0) {
            r0 = 0
            return r0
    }

    private static final boolean hasCopyableElements(kotlin.coroutines.CoroutineContext r2) {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1 r1 = kotlinx.coroutines.CoroutineContextKt.C01191.INSTANCE
            java.lang.Object r2 = r2.fold(r0, r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
            boolean r0 = hasCopyableElements(r2)
            if (r0 != 0) goto Lb
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
            return r1
        Lb:
            r0 = 0
            kotlin.coroutines.CoroutineContext r1 = foldCopies(r1, r2, r0)
            return r1
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            r0 = 1
            kotlin.coroutines.CoroutineContext r1 = foldCopies(r1, r2, r0)
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getDefault()
            if (r1 == r2) goto L1f
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r2)
            if (r2 != 0) goto L1f
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
        L1f:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCompletion(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
        L0:
            boolean r0 = r2 instanceof kotlinx.coroutines.DispatchedCoroutine
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r2.getCallerFrame()
            if (r2 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2 instanceof kotlinx.coroutines.UndispatchedCoroutine
            if (r0 == 0) goto L0
            kotlinx.coroutines.UndispatchedCoroutine r2 = (kotlinx.coroutines.UndispatchedCoroutine) r2
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            boolean r0 = r2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r0 = r3.get(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L14
            return r1
        L14:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r2
            kotlinx.coroutines.UndispatchedCoroutine r2 = undispatchedCompletion(r2)
            if (r2 != 0) goto L1d
            goto L20
        L1d:
            r2.saveThreadContext(r3, r4)
        L20:
            return r2
    }

    public static final <T> T withContinuationContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4) {
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r0, r3)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 == r1) goto L11
            kotlinx.coroutines.UndispatchedCoroutine r2 = updateUndispatchedCompletion(r2, r0, r3)
            goto L12
        L11:
            r2 = 0
        L12:
            r1 = 1
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            if (r2 == 0) goto L22
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L25
        L22:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r0, r3)
        L25:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r4
        L29:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            if (r2 == 0) goto L35
            boolean r2 = r2.clearThreadContext()
            if (r2 == 0) goto L38
        L35:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r0, r3)
        L38:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r4
    }

    public static final <T> T withCoroutineContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r1, r2)
            r0 = 1
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L13
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r3
        L13:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r3
    }
}
