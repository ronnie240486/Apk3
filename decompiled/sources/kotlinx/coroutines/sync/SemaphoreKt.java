package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002\u001a6\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0019*\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"BROKEN", "Lkotlinx/coroutines/internal/Symbol;", "getBROKEN$annotations", "()V", "CANCELLED", "getCANCELLED$annotations", "MAX_SPIN_CYCLES", "", "getMAX_SPIN_CYCLES$annotations", "PERMIT", "getPERMIT$annotations", "SEGMENT_SIZE", "getSEGMENT_SIZE$annotations", "TAKEN", "getTAKEN$annotations", "Semaphore", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "acquiredPermits", "createSegment", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "id", "", "prev", "withPermit", "T", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Semaphore;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SemaphoreKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol BROKEN = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol CANCELLED = null;
    private static final int MAX_SPIN_CYCLES = 0;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol PERMIT = null;
    private static final int SEGMENT_SIZE = 0;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol TAKEN = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.SemaphoreKt$withPermit$1, reason: invalid class name */
    /* JADX INFO: compiled from: Semaphore.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.sync.Semaphore L$0;
        public kotlin.jvm.functions.Function0 L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.sync.SemaphoreKt.withPermit(r2, r2, r1)
                return r2
        }
    }

    static {
            java.lang.String r0 = "kotlinx.coroutines.semaphore.maxSpinCycles"
            r1 = 100
            r2 = 0
            r3 = 0
            r4 = 12
            r5 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PERMIT"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.PERMIT = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "TAKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.TAKEN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "BROKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.BROKEN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CANCELLED"
            r0.<init>(r1)
            kotlinx.coroutines.sync.SemaphoreKt.CANCELLED = r0
            java.lang.String r2 = "kotlinx.coroutines.semaphore.segmentSize"
            r3 = 16
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.sync.Semaphore Semaphore(int r1, int r2) {
            kotlinx.coroutines.sync.SemaphoreImpl r0 = new kotlinx.coroutines.sync.SemaphoreImpl
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Semaphore Semaphore$default(int r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 2
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.sync.Semaphore r0 = Semaphore(r0, r1)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment access$createSegment(long r0, kotlinx.coroutines.sync.SemaphoreSegment r2) {
            kotlinx.coroutines.sync.SemaphoreSegment r0 = createSegment(r0, r2)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getBROKEN$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.BROKEN
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCANCELLED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.CANCELLED
            return r0
    }

    public static final /* synthetic */ int access$getMAX_SPIN_CYCLES$p() {
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPERMIT$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.PERMIT
            return r0
    }

    public static final /* synthetic */ int access$getSEGMENT_SIZE$p() {
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getTAKEN$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.TAKEN
            return r0
    }

    private static final kotlinx.coroutines.sync.SemaphoreSegment createSegment(long r2, kotlinx.coroutines.sync.SemaphoreSegment r4) {
            kotlinx.coroutines.sync.SemaphoreSegment r0 = new kotlinx.coroutines.sync.SemaphoreSegment
            r1 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }

    private static /* synthetic */ void getBROKEN$annotations() {
            return
    }

    private static /* synthetic */ void getCANCELLED$annotations() {
            return
    }

    private static /* synthetic */ void getMAX_SPIN_CYCLES$annotations() {
            return
    }

    private static /* synthetic */ void getPERMIT$annotations() {
            return
    }

    private static /* synthetic */ void getSEGMENT_SIZE$annotations() {
            return
    }

    private static /* synthetic */ void getTAKEN$annotations() {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object withPermit(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.Semaphore r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = (kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.functions.Function0 r5 = r0.L$1
            kotlinx.coroutines.sync.Semaphore r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.acquire(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L53
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.release()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r5
        L53:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.release()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r5
    }

    private static final <T> java.lang.Object withPermit$$forInline(kotlinx.coroutines.sync.Semaphore r1, kotlin.jvm.functions.Function0<? extends T> r2, kotlin.coroutines.Continuation<? super T> r3) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r1.acquire(r3)
            r3 = 1
            kotlin.jvm.internal.InlineMarker.mark(r3)
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L19
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.release()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r2
        L19:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.release()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r2
    }
}
