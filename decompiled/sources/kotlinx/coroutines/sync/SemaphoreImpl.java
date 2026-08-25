package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "tryResumeAcquire", "getAvailablePermits", "()I", "availablePermits", "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", "I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SemaphoreImpl implements kotlinx.coroutines.sync.Semaphore {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _availablePermits$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater deqIdx$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater enqIdx$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater head$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater tail$FU = null;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ int _availablePermits;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ long deqIdx;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ long enqIdx;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object head;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellationRelease;
    private final int permits;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object tail;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.sync.SemaphoreImpl> r1 = kotlinx.coroutines.sync.SemaphoreImpl.class
            java.lang.String r2 = "head"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.sync.SemaphoreImpl.head$FU = r2
            java.lang.String r2 = "deqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU = r2
            java.lang.String r2 = "tail"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.sync.SemaphoreImpl.tail$FU = r0
            java.lang.String r0 = "enqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU = r0
            java.lang.String r0 = "_availablePermits"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU = r0
            return
    }

    public SemaphoreImpl(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.permits = r6
            r0 = 0
            r5.deqIdx = r0
            r5.enqIdx = r0
            r2 = 1
            r3 = 0
            if (r6 <= 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            if (r4 == 0) goto L46
            if (r7 < 0) goto L19
            if (r7 > r6) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L32
            kotlinx.coroutines.sync.SemaphoreSegment r2 = new kotlinx.coroutines.sync.SemaphoreSegment
            r3 = 0
            r4 = 2
            r2.<init>(r0, r3, r4)
            r5.head = r2
            r5.tail = r2
            int r6 = r6 - r7
            r5._availablePermits = r6
            kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1 r6 = new kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            r6.<init>(r5)
            r5.onCancellationRelease = r6
            return
        L32:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "The number of acquired permits should be in 0.."
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L46:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "Semaphore should have at least 1 permit, but had "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public static final /* synthetic */ java.lang.Object access$acquireSlowPath(kotlinx.coroutines.sync.SemaphoreImpl r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.acquireSlowPath(r1)
            return r0
    }

    public static final /* synthetic */ boolean access$addAcquireToQueue(kotlinx.coroutines.sync.SemaphoreImpl r0, kotlinx.coroutines.CancellableContinuation r1) {
            boolean r0 = r0.addAcquireToQueue(r1)
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getOnCancellationRelease$p(kotlinx.coroutines.sync.SemaphoreImpl r0) {
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r0.onCancellationRelease
            return r0
    }

    private final java.lang.Object acquireSlowPath(kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r3 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
        L8:
            boolean r1 = access$addAcquireToQueue(r3, r0)
            if (r1 == 0) goto Lf
            goto L20
        Lf:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r1 = r1.getAndDecrement(r3)
            if (r1 <= 0) goto L8
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1 r2 = access$getOnCancellationRelease$p(r3)
            r0.resume(r1, r2)
        L20:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L2d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L2d:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r4) goto L34
            return r0
        L34:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private final boolean addAcquireToQueue(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object r2 = r0.tail
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU
            long r3 = r3.getAndIncrement(r0)
            int r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r5
            long r5 = r3 / r5
        L15:
            r7 = r2
        L16:
            long r8 = r7.getId()
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 < 0) goto L2a
            boolean r8 = r7.getRemoved()
            if (r8 == 0) goto L25
            goto L2a
        L25:
            java.lang.Object r7 = kotlinx.coroutines.internal.SegmentOrClosed.m1869constructorimpl(r7)
            goto L3c
        L2a:
            java.lang.Object r8 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r7)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r8 != r9) goto Lc4
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            java.lang.Object r7 = kotlinx.coroutines.internal.SegmentOrClosed.m1869constructorimpl(r7)
        L3c:
            boolean r8 = kotlinx.coroutines.internal.SegmentOrClosed.m1874isClosedimpl(r7)
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L8c
            kotlinx.coroutines.internal.Segment r8 = kotlinx.coroutines.internal.SegmentOrClosed.m1872getSegmentimpl(r7)
        L48:
            java.lang.Object r11 = r0.tail
            kotlinx.coroutines.internal.Segment r11 = (kotlinx.coroutines.internal.Segment) r11
            long r12 = r11.getId()
            long r14 = r8.getId()
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L5a
        L58:
            r8 = 1
            goto L7f
        L5a:
            boolean r12 = r8.tryIncPointers$kotlinx_coroutines_core()
            if (r12 != 0) goto L62
            r8 = 0
            goto L7f
        L62:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = kotlinx.coroutines.sync.SemaphoreImpl.tail$FU
        L64:
            boolean r13 = r12.compareAndSet(r0, r11, r8)
            if (r13 == 0) goto L6c
            r12 = 1
            goto L73
        L6c:
            java.lang.Object r13 = r12.get(r0)
            if (r13 == r11) goto L64
            r12 = 0
        L73:
            if (r12 == 0) goto L82
            boolean r8 = r11.decPointers$kotlinx_coroutines_core()
            if (r8 == 0) goto L58
            r11.remove()
            goto L58
        L7f:
            if (r8 == 0) goto L15
            goto L8c
        L82:
            boolean r11 = r8.decPointers$kotlinx_coroutines_core()
            if (r11 == 0) goto L48
            r8.remove()
            goto L48
        L8c:
            kotlinx.coroutines.internal.Segment r2 = kotlinx.coroutines.internal.SegmentOrClosed.m1872getSegmentimpl(r7)
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            int r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r5
            long r3 = r3 % r5
            int r4 = (int) r3
            r3 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.acquirers
            boolean r3 = r5.compareAndSet(r4, r3, r1)
            if (r3 == 0) goto Lab
            kotlinx.coroutines.sync.CancelSemaphoreAcquisitionHandler r3 = new kotlinx.coroutines.sync.CancelSemaphoreAcquisitionHandler
            r3.<init>(r2, r4)
            r1.invokeOnCancellation(r3)
            return r10
        Lab:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.acquirers
            boolean r2 = r2.compareAndSet(r4, r3, r5)
            if (r2 == 0) goto Lc3
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r0.onCancellationRelease
            r1.resume(r2, r3)
            return r10
        Lc3:
            return r9
        Lc4:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r8 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r8
            kotlinx.coroutines.internal.Segment r8 = (kotlinx.coroutines.internal.Segment) r8
            if (r8 == 0) goto Lcd
        Lca:
            r7 = r8
            goto L16
        Lcd:
            long r8 = r7.getId()
            r10 = 1
            long r8 = r8 + r10
            r10 = r7
            kotlinx.coroutines.sync.SemaphoreSegment r10 = (kotlinx.coroutines.sync.SemaphoreSegment) r10
            kotlinx.coroutines.sync.SemaphoreSegment r8 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r8, r10)
            boolean r9 = r7.trySetNext(r8)
            if (r9 == 0) goto L16
            boolean r9 = r7.getRemoved()
            if (r9 == 0) goto Lca
            r7.remove()
            goto Lca
    }

    private final boolean tryResumeAcquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
            r3 = this;
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r3.onCancellationRelease
            r2 = 0
            java.lang.Object r0 = r4.tryResume(r0, r2, r1)
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            r4.completeResume(r0)
            r4 = 1
            return r4
    }

    private final boolean tryResumeNextFromQueue() {
            r15 = this;
            java.lang.Object r0 = r15.head
            kotlinx.coroutines.sync.SemaphoreSegment r0 = (kotlinx.coroutines.sync.SemaphoreSegment) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU
            long r1 = r1.getAndIncrement(r15)
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r3 = (long) r3
            long r3 = r1 / r3
        L11:
            r5 = r0
        L12:
            long r6 = r5.getId()
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 < 0) goto L26
            boolean r6 = r5.getRemoved()
            if (r6 == 0) goto L21
            goto L26
        L21:
            java.lang.Object r5 = kotlinx.coroutines.internal.SegmentOrClosed.m1869constructorimpl(r5)
            goto L38
        L26:
            java.lang.Object r6 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r5)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r6 != r7) goto Le0
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            java.lang.Object r5 = kotlinx.coroutines.internal.SegmentOrClosed.m1869constructorimpl(r5)
        L38:
            boolean r6 = kotlinx.coroutines.internal.SegmentOrClosed.m1874isClosedimpl(r5)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L88
            kotlinx.coroutines.internal.Segment r6 = kotlinx.coroutines.internal.SegmentOrClosed.m1872getSegmentimpl(r5)
        L44:
            java.lang.Object r9 = r15.head
            kotlinx.coroutines.internal.Segment r9 = (kotlinx.coroutines.internal.Segment) r9
            long r10 = r9.getId()
            long r12 = r6.getId()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L56
        L54:
            r6 = 1
            goto L7b
        L56:
            boolean r10 = r6.tryIncPointers$kotlinx_coroutines_core()
            if (r10 != 0) goto L5e
            r6 = 0
            goto L7b
        L5e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = kotlinx.coroutines.sync.SemaphoreImpl.head$FU
        L60:
            boolean r11 = r10.compareAndSet(r15, r9, r6)
            if (r11 == 0) goto L68
            r10 = 1
            goto L6f
        L68:
            java.lang.Object r11 = r10.get(r15)
            if (r11 == r9) goto L60
            r10 = 0
        L6f:
            if (r10 == 0) goto L7e
            boolean r6 = r9.decPointers$kotlinx_coroutines_core()
            if (r6 == 0) goto L54
            r9.remove()
            goto L54
        L7b:
            if (r6 == 0) goto L11
            goto L88
        L7e:
            boolean r9 = r6.decPointers$kotlinx_coroutines_core()
            if (r9 == 0) goto L44
            r6.remove()
            goto L44
        L88:
            kotlinx.coroutines.internal.Segment r0 = kotlinx.coroutines.internal.SegmentOrClosed.m1872getSegmentimpl(r5)
            kotlinx.coroutines.sync.SemaphoreSegment r0 = (kotlinx.coroutines.sync.SemaphoreSegment) r0
            r0.cleanPrev()
            long r5 = r0.getId()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L9a
            return r7
        L9a:
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r3 = (long) r3
            long r1 = r1 % r3
            int r2 = (int) r1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r0.acquirers
            java.lang.Object r1 = r3.getAndSet(r2, r1)
            if (r1 != 0) goto Ld2
            int r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getMAX_SPIN_CYCLES$p()
        Lb1:
            if (r7 >= r1) goto Lc2
            int r7 = r7 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r0.acquirers
            java.lang.Object r3 = r3.get(r2)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            if (r3 != r4) goto Lb1
            return r8
        Lc2:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.acquirers
            boolean r0 = r0.compareAndSet(r2, r1, r3)
            r0 = r0 ^ r8
            return r0
        Ld2:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            if (r1 != r0) goto Ld9
            return r7
        Ld9:
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            boolean r0 = r15.tryResumeAcquire(r1)
            return r0
        Le0:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r6 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r6
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            if (r6 == 0) goto Le9
        Le6:
            r5 = r6
            goto L12
        Le9:
            long r6 = r5.getId()
            r8 = 1
            long r6 = r6 + r8
            r8 = r5
            kotlinx.coroutines.sync.SemaphoreSegment r8 = (kotlinx.coroutines.sync.SemaphoreSegment) r8
            kotlinx.coroutines.sync.SemaphoreSegment r6 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r6, r8)
            boolean r7 = r5.trySetNext(r6)
            if (r7 == 0) goto L12
            boolean r7 = r5.getRemoved()
            if (r7 == 0) goto Le6
            r5.remove()
            goto Le6
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    @org.jetbrains.annotations.Nullable
    public java.lang.Object acquire(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r0 = r0.getAndDecrement(r1)
            if (r0 <= 0) goto Lb
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        Lb:
            java.lang.Object r2 = r1.acquireSlowPath(r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L16
            return r2
        L16:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
            r2 = this;
            int r0 = r2._availablePermits
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
            r3 = this;
        L0:
            int r0 = r3._availablePermits
            int r1 = r3.permits
            if (r0 >= r1) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto L1f
            int r1 = r0 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            boolean r1 = r2.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L0
            if (r0 < 0) goto L18
            return
        L18:
            boolean r0 = r3.tryResumeNextFromQueue()
            if (r0 == 0) goto L0
            return
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "The number of released permits cannot be greater than "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
            r3 = this;
        L0:
            int r0 = r3._availablePermits
            if (r0 > 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r2 = r0 + (-1)
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }
}
