package kotlinx.coroutines;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a)\u0010\f\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\r\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0002¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"FINISHED", "", "INTERRUPTED", "INTERRUPTING", "WORKING", "runInterruptible", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runInterruptibleInExpectedContext", "coroutineContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class InterruptibleKt {
    private static final int FINISHED = 1;
    private static final int INTERRUPTED = 3;
    private static final int INTERRUPTING = 2;
    private static final int WORKING = 0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.InterruptibleKt$runInterruptible$2, reason: invalid class name */
    /* JADX INFO: compiled from: Interruptible.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        public final /* synthetic */ kotlin.jvm.functions.Function0<T> $block;
        private /* synthetic */ java.lang.Object L$0;

        public AnonymousClass2(kotlin.jvm.functions.Function0<? extends T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.InterruptibleKt.AnonymousClass2> r2) {
                r0 = this;
                r0.$block = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.InterruptibleKt$runInterruptible$2 r0 = new kotlinx.coroutines.InterruptibleKt$runInterruptible$2
                kotlin.jvm.functions.Function0<T> r1 = r2.$block
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super T> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.InterruptibleKt$runInterruptible$2 r1 = (kotlinx.coroutines.InterruptibleKt.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r2)
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.coroutines.CoroutineContext r2 = r2.getCoroutineContext()
                kotlin.jvm.functions.Function0<T> r0 = r1.$block
                java.lang.Object r2 = kotlinx.coroutines.InterruptibleKt.access$runInterruptibleInExpectedContext(r2, r0)
                return r2
        }
    }

    public static final /* synthetic */ java.lang.Object access$runInterruptibleInExpectedContext(kotlin.coroutines.CoroutineContext r0, kotlin.jvm.functions.Function0 r1) {
            java.lang.Object r0 = runInterruptibleInExpectedContext(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object runInterruptible(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
            kotlinx.coroutines.InterruptibleKt$runInterruptible$2 r0 = new kotlinx.coroutines.InterruptibleKt$runInterruptible$2
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r2, r0, r4)
            return r2
    }

    public static /* synthetic */ java.lang.Object runInterruptible$default(kotlin.coroutines.CoroutineContext r0, kotlin.jvm.functions.Function0 r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            java.lang.Object r0 = runInterruptible(r0, r1, r2)
            return r0
    }

    private static final <T> T runInterruptibleInExpectedContext(kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            kotlinx.coroutines.ThreadState r0 = new kotlinx.coroutines.ThreadState     // Catch: java.lang.InterruptedException -> L19
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.JobKt.getJob(r1)     // Catch: java.lang.InterruptedException -> L19
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L19
            r0.setup()     // Catch: java.lang.InterruptedException -> L19
            java.lang.Object r1 = r2.invoke()     // Catch: java.lang.Throwable -> L14
            r0.clearInterrupt()     // Catch: java.lang.InterruptedException -> L19
            return r1
        L14:
            r1 = move-exception
            r0.clearInterrupt()     // Catch: java.lang.InterruptedException -> L19
            throw r1     // Catch: java.lang.InterruptedException -> L19
        L19:
            r1 = move-exception
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r2.<init>(r0)
            java.lang.Throwable r1 = r2.initCause(r1)
            throw r1
    }
}
