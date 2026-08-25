package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u001aB\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0018H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0019\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"EMPTY_LOCKED", "Lkotlinx/coroutines/sync/Empty;", "getEMPTY_LOCKED$annotations", "()V", "EMPTY_UNLOCKED", "getEMPTY_UNLOCKED$annotations", "LOCKED", "Lkotlinx/coroutines/internal/Symbol;", "getLOCKED$annotations", "LOCK_FAIL", "getLOCK_FAIL$annotations", "UNLOCKED", "getUNLOCKED$annotations", "UNLOCK_FAIL", "getUNLOCK_FAIL$annotations", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "withLock", "T", "owner", "", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MutexKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.sync.Empty EMPTY_LOCKED = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.sync.Empty EMPTY_UNLOCKED = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol LOCKED = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol LOCK_FAIL = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol UNLOCKED = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol UNLOCK_FAIL = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1, reason: invalid class name */
    /* JADX INFO: compiled from: Mutex.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {112}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.sync.Mutex L$0;
        public java.lang.Object L$1;
        public kotlin.jvm.functions.Function0 L$2;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.MutexKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
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
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.sync.MutexKt.withLock(r2, r2, r2, r1)
                return r2
        }
    }

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "LOCK_FAIL"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.LOCK_FAIL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNLOCK_FAIL"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.UNLOCK_FAIL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "LOCKED"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.LOCKED = r0
            kotlinx.coroutines.internal.Symbol r1 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r2 = "UNLOCKED"
            r1.<init>(r2)
            kotlinx.coroutines.sync.MutexKt.UNLOCKED = r1
            kotlinx.coroutines.sync.Empty r2 = new kotlinx.coroutines.sync.Empty
            r2.<init>(r0)
            kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED = r2
            kotlinx.coroutines.sync.Empty r0 = new kotlinx.coroutines.sync.Empty
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean r1) {
            kotlinx.coroutines.sync.MutexImpl r0 = new kotlinx.coroutines.sync.MutexImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.sync.Mutex r0 = Mutex(r0)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.Empty access$getEMPTY_LOCKED$p() {
            kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.Empty access$getEMPTY_UNLOCKED$p() {
            kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getLOCKED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.LOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getLOCK_FAIL$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.LOCK_FAIL
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNLOCKED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.UNLOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNLOCK_FAIL$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.UNLOCK_FAIL
            return r0
    }

    private static /* synthetic */ void getEMPTY_LOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getEMPTY_UNLOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getLOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getLOCK_FAIL$annotations() {
            return
    }

    private static /* synthetic */ void getUNLOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getUNLOCK_FAIL$annotations() {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object withLock(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.Mutex r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.functions.Function0 r6 = r0.L$2
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.sync.Mutex r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.lock(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L57
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r6
        L57:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r6
    }

    private static final <T> java.lang.Object withLock$$forInline(kotlinx.coroutines.sync.Mutex r1, java.lang.Object r2, kotlin.jvm.functions.Function0<? extends T> r3, kotlin.coroutines.Continuation<? super T> r4) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r1.lock(r2, r4)
            r4 = 1
            kotlin.jvm.internal.InlineMarker.mark(r4)
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L19
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r1.unlock(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r3
        L19:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r1.unlock(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r3
    }

    public static /* synthetic */ java.lang.Object withLock$default(kotlinx.coroutines.sync.Mutex r0, java.lang.Object r1, kotlin.jvm.functions.Function0 r2, kotlin.coroutines.Continuation r3, int r4, java.lang.Object r5) {
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)
            r0.lock(r1, r3)
            kotlin.jvm.internal.InlineMarker.mark(r5)
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1d
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            r0.unlock(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            return r2
        L1d:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            r0.unlock(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r2
    }
}
