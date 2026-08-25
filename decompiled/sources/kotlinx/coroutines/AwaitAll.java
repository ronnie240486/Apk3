package kotlinx.coroutines;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u000e:\u0002\u000b\fB\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "Lkotlinx/coroutines/Deferred;", "deferreds", "<init>", "([Lkotlinx/coroutines/Deferred;)V", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "[Lkotlinx/coroutines/Deferred;", "AwaitAllNode", "DisposeHandlersOnCancel", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AwaitAll<T> {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater notCompletedCount$FU = null;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.Deferred<T>[] deferreds;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: compiled from: Await.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0082\u0004\u0018\u00002\u00020\u001cB\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR<\u0010\u0013\u001a\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000e\u001a\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00028\u00000\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "<init>", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "", "cause", "", "invoke", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "value", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "disposer", "Lkotlinx/coroutines/DisposableHandle;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core", "Lkotlinx/coroutines/JobNode;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AwaitAllNode extends kotlinx.coroutines.JobNode {

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ java.lang.Object _disposer;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> continuation;
        public kotlinx.coroutines.DisposableHandle handle;
        public final /* synthetic */ kotlinx.coroutines.AwaitAll<T> this$0;

        public AwaitAllNode(@org.jetbrains.annotations.NotNull kotlinx.coroutines.AwaitAll r1, kotlinx.coroutines.CancellableContinuation<? super java.util.List<? extends T>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.continuation = r2
                r1 = 0
                r0._disposer = r1
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel getDisposer() {
                r1 = this;
                java.lang.Object r0 = r1._disposer
                kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r0 = (kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel) r0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.DisposableHandle getHandle() {
                r1 = this;
                kotlinx.coroutines.DisposableHandle r0 = r1.handle
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "handle"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r6) {
                r5 = this;
                if (r6 == 0) goto L1a
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r0 = r5.continuation
                java.lang.Object r6 = r0.tryResumeWithException(r6)
                if (r6 == 0) goto L4b
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r0 = r5.continuation
                r0.completeResume(r6)
                kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r6 = r5.getDisposer()
                if (r6 != 0) goto L16
                goto L4b
            L16:
                r6.disposeAll()
                goto L4b
            L1a:
                kotlinx.coroutines.AwaitAll<T> r6 = r5.this$0
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.AwaitAll.notCompletedCount$FU
                int r6 = r0.decrementAndGet(r6)
                if (r6 != 0) goto L4b
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r6 = r5.continuation
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                kotlinx.coroutines.AwaitAll<T> r0 = r5.this$0
                kotlinx.coroutines.Deferred[] r0 = kotlinx.coroutines.AwaitAll.access$getDeferreds$p(r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.length
                r1.<init>(r2)
                r2 = 0
                int r3 = r0.length
            L36:
                if (r2 >= r3) goto L44
                r4 = r0[r2]
                int r2 = r2 + 1
                java.lang.Object r4 = r4.getCompleted()
                r1.add(r4)
                goto L36
            L44:
                java.lang.Object r0 = kotlin.Result.m333constructorimpl(r1)
                r6.resumeWith(r0)
            L4b:
                return
        }

        public final void setDisposer(@org.jetbrains.annotations.Nullable kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel r1) {
                r0 = this;
                r0._disposer = r1
                return
        }

        public final void setHandle(@org.jetbrains.annotations.NotNull kotlinx.coroutines.DisposableHandle r1) {
                r0 = this;
                r0.handle = r1
                return
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "nodes", "", "Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/AwaitAll;", "(Lkotlinx/coroutines/AwaitAll;[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;)V", "[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "disposeAll", "", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class DisposeHandlersOnCancel extends kotlinx.coroutines.CancelHandler {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.AwaitAll r1, kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] r2) {
                r0 = this;
                r0.<init>()
                r0.nodes = r2
                return
        }

        public final void disposeAll() {
                r4 = this;
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r0 = r4.nodes
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r2 = r2 + 1
                kotlinx.coroutines.DisposableHandle r3 = r3.getHandle()
                r3.dispose()
                goto L4
            L12:
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                r0.disposeAll()
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "DisposeHandlersOnCancel["
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r1 = r2.nodes
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.AwaitAll> r0 = kotlinx.coroutines.AwaitAll.class
            java.lang.String r1 = "notCompletedCount"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.AwaitAll.notCompletedCount$FU = r0
            return
    }

    public AwaitAll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Deferred<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.deferreds = r1
            int r1 = r1.length
            r0.notCompletedCount = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.Deferred[] access$getDeferreds$p(kotlinx.coroutines.AwaitAll r0) {
            kotlinx.coroutines.Deferred<T>[] r0 = r0.deferreds
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object await(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r8) {
            r7 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            kotlinx.coroutines.Deferred[] r1 = access$getDeferreds$p(r7)
            int r1 = r1.length
            kotlinx.coroutines.AwaitAll$AwaitAllNode[] r2 = new kotlinx.coroutines.AwaitAll.AwaitAllNode[r1]
            r3 = 0
            r4 = 0
        L16:
            if (r4 >= r1) goto L34
            kotlinx.coroutines.Deferred[] r5 = access$getDeferreds$p(r7)
            r5 = r5[r4]
            r5.start()
            kotlinx.coroutines.AwaitAll$AwaitAllNode r6 = new kotlinx.coroutines.AwaitAll$AwaitAllNode
            r6.<init>(r7, r0)
            kotlinx.coroutines.DisposableHandle r5 = r5.invokeOnCompletion(r6)
            r6.setHandle(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r2[r4] = r6
            int r4 = r4 + 1
            goto L16
        L34:
            kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r4 = new kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel
            r4.<init>(r7, r2)
        L39:
            if (r3 >= r1) goto L43
            r5 = r2[r3]
            int r3 = r3 + 1
            r5.setDisposer(r4)
            goto L39
        L43:
            boolean r1 = r0.isCompleted()
            if (r1 == 0) goto L4d
            r4.disposeAll()
            goto L50
        L4d:
            r0.invokeOnCancellation(r4)
        L50:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L5d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L5d:
            return r0
    }
}
