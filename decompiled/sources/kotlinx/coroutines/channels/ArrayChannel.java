package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012 \u0010\"\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`!¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "", "currentSize", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", "element", "", "enqueueElement", "(ILjava/lang/Object;)V", "ensureCapacity", "(I)V", "capacity", "I", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "", "buffer", "[Ljava/lang/Object;", "head", "", "isEmpty", "()Z", "isClosedForReceive", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class ArrayChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {

    @org.jetbrains.annotations.NotNull
    private java.lang.Object[] buffer;
    private final int capacity;
    private int head;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock lock;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int size;

    /* JADX INFO: compiled from: ArrayChannel.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.channels.ArrayChannel.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public ArrayChannel(int r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r3) {
            r0 = this;
            r0.<init>(r3)
            r0.capacity = r1
            r0.onBufferOverflow = r2
            r2 = 0
            r3 = 1
            if (r1 < r3) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r3 == 0) goto L28
            java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
            r3.<init>()
            r0.lock = r3
            r3 = 8
            int r1 = java.lang.Math.min(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            kotlin.collections.ArraysKt.fill$default(r1, r3)
            r0.buffer = r1
            r0.size = r2
            return
        L28:
            java.lang.String r2 = "ArrayChannel capacity must be at least 1, but "
            java.lang.String r3 = " was specified"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    private final void enqueueElement(int r5, E r6) {
            r4 = this;
            int r0 = r4.capacity
            if (r5 >= r0) goto L11
            r4.ensureCapacity(r5)
            java.lang.Object[] r0 = r4.buffer
            int r1 = r4.head
            int r1 = r1 + r5
            int r5 = r0.length
            int r1 = r1 % r5
            r0[r1] = r6
            goto L26
        L11:
            java.lang.Object[] r0 = r4.buffer
            int r1 = r4.head
            int r2 = r0.length
            int r2 = r1 % r2
            r3 = 0
            r0[r2] = r3
            int r5 = r5 + r1
            int r2 = r0.length
            int r5 = r5 % r2
            r0[r5] = r6
            int r1 = r1 + 1
            int r5 = r0.length
            int r1 = r1 % r5
            r4.head = r1
        L26:
            return
    }

    private final void ensureCapacity(int r9) {
            r8 = this;
            java.lang.Object[] r0 = r8.buffer
            int r1 = r0.length
            if (r9 < r1) goto L2c
            int r0 = r0.length
            int r0 = r0 * 2
            int r1 = r8.capacity
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r9) goto L23
            int r4 = r3 + 1
            java.lang.Object[] r5 = r8.buffer
            int r6 = r8.head
            int r6 = r6 + r3
            int r7 = r5.length
            int r6 = r6 % r7
            r5 = r5[r6]
            r1[r3] = r5
            r3 = r4
            goto L12
        L23:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            kotlin.collections.ArraysKt.fill(r1, r3, r9, r0)
            r8.buffer = r1
            r8.head = r2
        L2c:
            return
    }

    private final kotlinx.coroutines.internal.Symbol updateBufferSize(int r4) {
            r3 = this;
            int r0 = r3.capacity
            r1 = 0
            r2 = 1
            if (r4 >= r0) goto La
            int r4 = r4 + r2
            r3.size = r4
            return r1
        La:
            kotlinx.coroutines.channels.BufferOverflow r4 = r3.onBufferOverflow
            int[] r0 = kotlinx.coroutines.channels.ArrayChannel.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r0[r4]
            if (r4 == r2) goto L26
            r0 = 2
            if (r4 == r0) goto L23
            r0 = 3
            if (r4 != r0) goto L1d
            goto L28
        L1d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L23:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            goto L28
        L26:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
        L28:
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean enqueueReceiveInternal(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Receive<? super E> r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            boolean r2 = super.enqueueReceiveInternal(r2)     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r2
        Ld:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object enqueueSend(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Send r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            java.lang.Object r2 = super.enqueueSend(r2)     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r2
        Ld:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBufferDebugString() {
            r3 = this;
            java.lang.String r0 = "(buffer:capacity="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.capacity
            r0.append(r1)
            java.lang.String r1 = ",size="
            r0.append(r1)
            int r1 = r3.size
            r2 = 41
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean isBufferAlwaysEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public final boolean isBufferAlwaysFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean isBufferEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public final boolean isBufferFull() {
            r2 = this;
            int r0 = r2.size
            int r1 = r2.capacity
            if (r0 != r1) goto Le
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = super.isClosedForReceive()     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r1
        Ld:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.isEmptyImpl()     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r1
        Ld:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object offerInternal(E r5) {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.lock
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L4d
            kotlinx.coroutines.channels.Closed r2 = r4.getClosedForSend()     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L49
            kotlinx.coroutines.internal.Symbol r2 = r4.updateBufferSize(r1)     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L45
            if (r1 != 0) goto L3c
        L15:
            kotlinx.coroutines.channels.ReceiveOrClosed r2 = r4.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L1c
            goto L3c
        L1c:
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L26
            r4.size = r1     // Catch: java.lang.Throwable -> L4d
            r0.unlock()
            return r2
        L26:
            r3 = 0
            kotlinx.coroutines.internal.Symbol r3 = r2.tryResumeReceive(r5, r3)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L15
            r4.size = r1     // Catch: java.lang.Throwable -> L4d
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4d
            r0.unlock()
            r2.completeResumeReceive(r5)
            java.lang.Object r5 = r2.getOfferResult()
            return r5
        L3c:
            r4.enqueueElement(r1, r5)     // Catch: java.lang.Throwable -> L4d
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L4d
            r0.unlock()
            return r5
        L45:
            r0.unlock()
            return r2
        L49:
            r0.unlock()
            return r2
        L4d:
            r5 = move-exception
            r0.unlock()
            throw r5
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object offerSelectInternal(E r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r6) {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.lock
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L83
            kotlinx.coroutines.channels.Closed r2 = r4.getClosedForSend()     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L7f
            kotlinx.coroutines.internal.Symbol r2 = r4.updateBufferSize(r1)     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L7b
            if (r1 != 0) goto L62
        L15:
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r2 = r4.describeTryOffer(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r3 = r6.performAtomicTrySelect(r2)     // Catch: java.lang.Throwable -> L83
            if (r3 != 0) goto L37
            r4.size = r1     // Catch: java.lang.Throwable -> L83
            java.lang.Object r6 = r2.getResult()     // Catch: java.lang.Throwable -> L83
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L83
            r0.unlock()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            kotlinx.coroutines.channels.ReceiveOrClosed r6 = (kotlinx.coroutines.channels.ReceiveOrClosed) r6
            r6.completeResumeReceive(r5)
            java.lang.Object r5 = r6.getOfferResult()
            return r5
        L37:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L83
            if (r3 != r2) goto L3c
            goto L62
        L3c:
            java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> L83
            if (r3 != r2) goto L41
            goto L15
        L41:
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L83
            if (r3 == r5) goto L5c
            boolean r5 = r3 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto L4c
            goto L5c
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L83
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L83
            throw r5     // Catch: java.lang.Throwable -> L83
        L5c:
            r4.size = r1     // Catch: java.lang.Throwable -> L83
            r0.unlock()
            return r3
        L62:
            boolean r6 = r6.trySelect()     // Catch: java.lang.Throwable -> L83
            if (r6 != 0) goto L72
            r4.size = r1     // Catch: java.lang.Throwable -> L83
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L83
            r0.unlock()
            return r5
        L72:
            r4.enqueueElement(r1, r5)     // Catch: java.lang.Throwable -> L83
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L83
            r0.unlock()
            return r5
        L7b:
            r0.unlock()
            return r2
        L7f:
            r0.unlock()
            return r2
        L83:
            r5 = move-exception
            r0.unlock()
            throw r5
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final void onCancelIdempotent(boolean r10) {
            r9 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r9.onUndeliveredElement
            java.util.concurrent.locks.ReentrantLock r1 = r9.lock
            r1.lock()
            int r2 = r9.size     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            r4 = 0
            r5 = 0
        Lc:
            if (r5 >= r2) goto L2f
            int r5 = r5 + 1
            java.lang.Object[] r6 = r9.buffer     // Catch: java.lang.Throwable -> L3d
            int r7 = r9.head     // Catch: java.lang.Throwable -> L3d
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L20
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L3d
            if (r6 == r7) goto L20
            kotlinx.coroutines.internal.UndeliveredElementException r4 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r6, r4)     // Catch: java.lang.Throwable -> L3d
        L20:
            java.lang.Object[] r6 = r9.buffer     // Catch: java.lang.Throwable -> L3d
            int r7 = r9.head     // Catch: java.lang.Throwable -> L3d
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L3d
            r6[r7] = r8     // Catch: java.lang.Throwable -> L3d
            int r7 = r7 + 1
            int r6 = r6.length     // Catch: java.lang.Throwable -> L3d
            int r7 = r7 % r6
            r9.head = r7     // Catch: java.lang.Throwable -> L3d
            goto Lc
        L2f:
            r9.size = r3     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            r1.unlock()
            super.onCancelIdempotent(r10)
            if (r4 != 0) goto L3c
            return
        L3c:
            throw r4
        L3d:
            r10 = move-exception
            r1.unlock()
            throw r10
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pollInternal() {
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r9.lock
            r0.lock()
            int r1 = r9.size     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L15
            kotlinx.coroutines.channels.Closed r1 = r9.getClosedForSend()     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L11
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L6f
        L11:
            r0.unlock()
            return r1
        L15:
            java.lang.Object[] r2 = r9.buffer     // Catch: java.lang.Throwable -> L6f
            int r3 = r9.head     // Catch: java.lang.Throwable -> L6f
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L6f
            int r2 = r1 + (-1)
            r9.size = r2     // Catch: java.lang.Throwable -> L6f
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L6f
            int r3 = r9.capacity     // Catch: java.lang.Throwable -> L6f
            r6 = 1
            r7 = 0
            if (r1 != r3) goto L45
            r3 = r5
        L2b:
            kotlinx.coroutines.channels.Send r8 = r9.takeFirstSendOrPeekClosed()     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto L33
            r5 = r3
            goto L45
        L33:
            kotlinx.coroutines.internal.Symbol r3 = r8.tryResumeSend(r5)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L40
            java.lang.Object r2 = r8.getPollResult()     // Catch: java.lang.Throwable -> L6f
            r5 = r8
            r7 = 1
            goto L45
        L40:
            r8.undeliveredElement()     // Catch: java.lang.Throwable -> L6f
            r3 = r8
            goto L2b
        L45:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L6f
            if (r2 == r3) goto L58
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L58
            r9.size = r1     // Catch: java.lang.Throwable -> L6f
            java.lang.Object[] r3 = r9.buffer     // Catch: java.lang.Throwable -> L6f
            int r8 = r9.head     // Catch: java.lang.Throwable -> L6f
            int r8 = r8 + r1
            int r1 = r3.length     // Catch: java.lang.Throwable -> L6f
            int r8 = r8 % r1
            r3[r8] = r2     // Catch: java.lang.Throwable -> L6f
        L58:
            int r1 = r9.head     // Catch: java.lang.Throwable -> L6f
            int r1 = r1 + r6
            java.lang.Object[] r2 = r9.buffer     // Catch: java.lang.Throwable -> L6f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L6f
            int r1 = r1 % r2
            r9.head = r1     // Catch: java.lang.Throwable -> L6f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6f
            r0.unlock()
            if (r7 == 0) goto L6e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r5.completeResumeSend()
        L6e:
            return r4
        L6f:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pollSelectInternal(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r9) {
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto L15
            kotlinx.coroutines.channels.Closed r9 = r8.getClosedForSend()     // Catch: java.lang.Throwable -> Lbf
            if (r9 != 0) goto L11
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lbf
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.buffer     // Catch: java.lang.Throwable -> Lbf
            int r3 = r8.head     // Catch: java.lang.Throwable -> Lbf
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lbf
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lbf
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lbf
            int r3 = r8.capacity     // Catch: java.lang.Throwable -> Lbf
            r6 = 1
            if (r1 != r3) goto L7b
        L29:
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r3 = new kotlinx.coroutines.channels.AbstractChannel$TryPollDesc     // Catch: java.lang.Throwable -> Lbf
            kotlinx.coroutines.internal.LockFreeLinkedListHead r7 = r8.getQueue()     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r7 = r9.performAtomicTrySelect(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r7 != 0) goto L48
            java.lang.Object r5 = r3.getResult()     // Catch: java.lang.Throwable -> Lbf
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lbf
            r2 = r5
            kotlinx.coroutines.channels.Send r2 = (kotlinx.coroutines.channels.Send) r2     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r2 = r2.getPollResult()     // Catch: java.lang.Throwable -> Lbf
        L46:
            r3 = 1
            goto L7c
        L48:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lbf
            if (r7 != r3) goto L4d
            goto L7b
        L4d:
            java.lang.Object r3 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> Lbf
            if (r7 != r3) goto L52
            goto L29
        L52:
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> Lbf
            if (r7 != r2) goto L64
            r8.size = r1     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lbf
            int r1 = r8.head     // Catch: java.lang.Throwable -> Lbf
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbf
            r0.unlock()
            return r7
        L64:
            boolean r2 = r7 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Lbf
            if (r2 == 0) goto L6b
            r2 = r7
            r5 = r2
            goto L46
        L6b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lbf
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lbf
            throw r9     // Catch: java.lang.Throwable -> Lbf
        L7b:
            r3 = 0
        L7c:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lbf
            if (r2 == r7) goto L90
            boolean r7 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Lbf
            if (r7 != 0) goto L90
            r8.size = r1     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lbf
            int r7 = r8.head     // Catch: java.lang.Throwable -> Lbf
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lbf
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lbf
            goto La6
        L90:
            boolean r9 = r9.trySelect()     // Catch: java.lang.Throwable -> Lbf
            if (r9 != 0) goto La6
            r8.size = r1     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lbf
            int r1 = r8.head     // Catch: java.lang.Throwable -> Lbf
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r9 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> Lbf
            r0.unlock()
            return r9
        La6:
            int r9 = r8.head     // Catch: java.lang.Throwable -> Lbf
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.buffer     // Catch: java.lang.Throwable -> Lbf
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lbf
            int r9 = r9 % r1
            r8.head = r9     // Catch: java.lang.Throwable -> Lbf
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            r0.unlock()
            if (r3 == 0) goto Lbe
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlinx.coroutines.channels.Send r5 = (kotlinx.coroutines.channels.Send) r5
            r5.completeResumeSend()
        Lbe:
            return r4
        Lbf:
            r9 = move-exception
            r0.unlock()
            throw r9
    }
}
