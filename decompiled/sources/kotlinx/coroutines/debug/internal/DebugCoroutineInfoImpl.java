package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\b\u0010$\u001a\u00020\u000eH\u0016J!\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u000e2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(H\u0000¢\u0006\u0002\b)J%\u0010*\u001a\u00020&*\b\u0012\u0004\u0012\u00020\u00150+2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0082Pø\u0001\u0000¢\u0006\u0002\u0010,R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "sequenceNumber", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "_context", "Ljava/lang/ref/WeakReference;", "_lastObservedFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_state", "", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackBottom", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "value", "lastObservedFrame", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedThread", "Ljava/lang/Thread;", "state", "getState", "()Ljava/lang/String;", "lastObservedStackTrace", "toString", "updateState", "", "frame", "Lkotlin/coroutines/Continuation;", "updateState$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DebugCoroutineInfoImpl {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> _context;

    @org.jetbrains.annotations.Nullable
    private java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> _lastObservedFrame;

    @org.jetbrains.annotations.NotNull
    private java.lang.String _state;

    @org.jetbrains.annotations.Nullable
    private final kotlinx.coroutines.debug.internal.StackTraceFrame creationStackBottom;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public java.lang.Thread lastObservedThread;

    @kotlin.jvm.JvmField
    public final long sequenceNumber;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlinx.coroutines.debug.internal.StackTraceFrame $bottom;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl this$0;

        public AnonymousClass1(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1, kotlinx.coroutines.debug.internal.StackTraceFrame r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.AnonymousClass1> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$bottom = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = r3.this$0
                kotlinx.coroutines.debug.internal.StackTraceFrame r2 = r3.$bottom
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r1 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2f
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = r4.this$0
                kotlinx.coroutines.debug.internal.StackTraceFrame r3 = r4.$bottom
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = r3.getCallerFrame()
                r4.label = r2
                java.lang.Object r5 = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(r1, r5, r3, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    public static final class C01581 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl L$0;
        public kotlin.sequences.SequenceScope L$1;
        public kotlin.coroutines.jvm.internal.CoroutineStackFrame L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;
        public final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl this$0;

        public C01581(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01581> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(r2, r0, r0, r1)
                return r2
        }
    }

    public DebugCoroutineInfoImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.debug.internal.StackTraceFrame r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.creationStackBottom = r2
            r0.sequenceNumber = r3
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0._context = r2
            java.lang.String r1 = "CREATED"
            r0._state = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$yieldFrames(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0, kotlin.sequences.SequenceScope r1, kotlin.coroutines.jvm.internal.CoroutineStackFrame r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.yieldFrames(r1, r2, r3)
            return r0
    }

    private final java.util.List<java.lang.StackTraceElement> creationStackTrace() {
            r3 = this;
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r3.creationStackBottom
            if (r0 != 0) goto L9
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L9:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r1 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1
            r2 = 0
            r1.<init>(r3, r0, r2)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r1)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
            return r0
    }

    private final java.lang.Object yieldFrames(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01581
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = r0.L$2
            kotlin.sequences.SequenceScope r7 = r0.L$1
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = r5
        L3b:
            if (r7 != 0) goto L40
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L40:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 != 0) goto L47
            goto L5c
        L47:
            r0.L$0 = r2
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r6.yield(r8, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r4 = r7
            r7 = r6
            r6 = r4
        L5c:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r7.getCallerFrame()
            if (r7 == 0) goto L63
            goto L3b
        L63:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> r0 = r1._context
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.debug.internal.StackTraceFrame getCreationStackBottom() {
            r1 = this;
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r1.creationStackBottom
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> getCreationStackTrace() {
            r1 = this;
            java.util.List r0 = r1.creationStackTrace()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> r0 = r1._lastObservedFrame
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
        Lc:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
            r1 = this;
            java.lang.String r0 = r1._state
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace() {
            r3 = this;
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r3.getLastObservedFrame$kotlinx_coroutines_core()
            if (r0 != 0) goto Lb
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L10:
            if (r0 == 0) goto L21
            java.lang.StackTraceElement r2 = r0.getStackTraceElement()
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1.add(r2)
        L1c:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
            goto L10
        L21:
            return r1
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto La
        L4:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r2 = r0
        La:
            r1._lastObservedFrame = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DebugCoroutineInfo(state="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.getState()
            r0.append(r1)
            java.lang.String r1 = ",context="
            r0.append(r1)
            kotlin.coroutines.CoroutineContext r1 = r2.getContext()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void updateState$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            java.lang.String r0 = r2._state
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L17
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L17
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r2.getLastObservedFrame$kotlinx_coroutines_core()
            if (r0 == 0) goto L17
            return
        L17:
            r2._state = r3
            boolean r0 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r1 = 0
            if (r0 == 0) goto L21
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            goto L22
        L21:
            r4 = r1
        L22:
            r2.setLastObservedFrame$kotlinx_coroutines_core(r4)
            java.lang.String r4 = "RUNNING"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L31
            java.lang.Thread r1 = java.lang.Thread.currentThread()
        L31:
            r2.lastObservedThread = r1
            return
    }
}
