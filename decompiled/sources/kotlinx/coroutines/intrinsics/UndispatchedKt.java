package kotlinx.coroutines.intrinsics;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082\b\u001a>\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001aY\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aY\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"startDirect", "", "T", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", "", "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", "", "", "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class UndispatchedKt {
    public static final <T> void startCoroutineUndispatched(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r4)
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()     // Catch: java.lang.Throwable -> L30
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r1)     // Catch: java.lang.Throwable -> L30
            r2 = 1
            java.lang.Object r3 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r1)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 == r4) goto L3e
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
            goto L3e
        L2b:
            r3 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r1)     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
        L3e:
            return
    }

    public static final <R, T> void startCoroutineUndispatched(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r5) {
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r5)
            kotlin.coroutines.CoroutineContext r5 = r5.getContext()     // Catch: java.lang.Throwable -> L30
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r5, r1)     // Catch: java.lang.Throwable -> L30
            r2 = 2
            java.lang.Object r3 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r1)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 == r4) goto L3e
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
            goto L3e
        L2b:
            r3 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r1)     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
        L3e:
            return
    }

    public static final <T> void startCoroutineUnintercepted(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r2)
            r0 = 1
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r0)     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.invoke(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 == r0) goto L2d
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
            r2.resumeWith(r1)
            goto L2d
        L1f:
            r1 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
            r2.resumeWith(r1)
        L2d:
            return
    }

    public static final <R, T> void startCoroutineUnintercepted(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r3) {
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r3)
            r0 = 2
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r0)     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 == r2) goto L2d
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
            r3.resumeWith(r1)
            goto L2d
        L1f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
            r3.resumeWith(r1)
        L2d:
            return
    }

    private static final <T> void startDirect(kotlin.coroutines.Continuation<? super T> r1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2) {
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r1)
            java.lang.Object r2 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 == r0) goto L17
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m333constructorimpl(r2)
            r1.resumeWith(r2)
        L17:
            return
        L18:
            r2 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m333constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, R> java.lang.Object startUndispatchedOrReturn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.ScopeCoroutine<? super T> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5) {
            r0 = 2
            java.lang.Object r5 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r5, r0)     // Catch: java.lang.Throwable -> Lc
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r4 = r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r4 = move-exception
            kotlinx.coroutines.CompletedExceptionally r5 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 0
            r5.<init>(r4, r1, r0, r2)
            r4 = r5
        L15:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L20
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L35
        L20:
            java.lang.Object r3 = r3.makeCompletingOnce$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r3 != r4) goto L2d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L35
        L2d:
            boolean r4 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r4 != 0) goto L36
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r3)
        L35:
            return r3
        L36:
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            throw r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, R> java.lang.Object startUndispatchedOrReturnIgnoreTimeout(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.ScopeCoroutine<? super T> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5) {
            r0 = 0
            r1 = 2
            java.lang.Object r5 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r5, r1)     // Catch: java.lang.Throwable -> Ld
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r4 = r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> Ld
            goto L15
        Ld:
            r4 = move-exception
            kotlinx.coroutines.CompletedExceptionally r5 = new kotlinx.coroutines.CompletedExceptionally
            r2 = 0
            r5.<init>(r4, r0, r1, r2)
            r4 = r5
        L15:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L20
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L53
        L20:
            java.lang.Object r5 = r3.makeCompletingOnce$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r5 != r1) goto L2d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L53
        L2d:
            boolean r1 = r5 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L4e
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5
            java.lang.Throwable r5 = r5.cause
            boolean r1 = r5 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r1 == 0) goto L40
            r1 = r5
            kotlinx.coroutines.TimeoutCancellationException r1 = (kotlinx.coroutines.TimeoutCancellationException) r1
            kotlinx.coroutines.Job r1 = r1.coroutine
            if (r1 == r3) goto L41
        L40:
            r0 = 1
        L41:
            if (r0 != 0) goto L4d
            boolean r3 = r4 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 != 0) goto L48
            goto L52
        L48:
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r3 = r4.cause
            throw r3
        L4d:
            throw r5
        L4e:
            java.lang.Object r4 = kotlinx.coroutines.JobSupportKt.unboxState(r5)
        L52:
            r3 = r4
        L53:
            return r3
    }

    private static final <T> java.lang.Object undispatchedResult(kotlinx.coroutines.internal.ScopeCoroutine<? super T> r4, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r5, kotlin.jvm.functions.Function0<? extends java.lang.Object> r6) {
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5
            goto Lf
        L5:
            r6 = move-exception
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r6, r1, r2, r3)
            r6 = r0
        Lf:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r0) goto L1a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r4
        L1a:
            java.lang.Object r4 = r4.makeCompletingOnce$kotlinx_coroutines_core(r6)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r4 != r0) goto L27
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r4
        L27:
            boolean r0 = r4 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L48
            kotlinx.coroutines.CompletedExceptionally r4 = (kotlinx.coroutines.CompletedExceptionally) r4
            java.lang.Throwable r0 = r4.cause
            java.lang.Object r5 = r5.invoke(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L45
            boolean r4 = r6 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r4 != 0) goto L40
            goto L4c
        L40:
            kotlinx.coroutines.CompletedExceptionally r6 = (kotlinx.coroutines.CompletedExceptionally) r6
            java.lang.Throwable r4 = r6.cause
            throw r4
        L45:
            java.lang.Throwable r4 = r4.cause
            throw r4
        L48:
            java.lang.Object r6 = kotlinx.coroutines.JobSupportKt.unboxState(r4)
        L4c:
            return r6
    }
}
