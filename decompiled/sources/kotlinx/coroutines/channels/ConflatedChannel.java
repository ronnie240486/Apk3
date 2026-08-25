package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ConflatedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "updateValueLocked", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "value", "Ljava/lang/Object;", "", "isEmpty", "()Z", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class ConflatedChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock lock;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object value;

    public ConflatedChannel(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.lock = r1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r0.value = r1
            return
    }

    private final kotlinx.coroutines.internal.UndeliveredElementException updateValueLocked(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.value
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r2 = 0
            if (r0 != r1) goto L8
            goto L12
        L8:
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            r3 = 2
            kotlinx.coroutines.internal.UndeliveredElementException r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r0, r2, r3, r2)
        L12:
            r4.value = r5
            return r2
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
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBufferDebugString() {
            r2 = this;
            java.lang.String r0 = "(value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Object r1 = r2.value
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
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
            r2 = this;
            java.lang.Object r0 = r2.value
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public final boolean isBufferFull() {
            r1 = this;
            r0 = 0
            return r0
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
    public java.lang.Object offerInternal(E r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r3.getClosedForSend()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L41
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L45
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L45
            if (r1 != r2) goto L34
        L11:
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = r3.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L18
            goto L34
        L18:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L20
            r0.unlock()
            return r1
        L20:
            r2 = 0
            kotlinx.coroutines.internal.Symbol r2 = r1.tryResumeReceive(r4, r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L11
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            r0.unlock()
            r1.completeResumeReceive(r4)
            java.lang.Object r4 = r1.getOfferResult()
            return r4
        L34:
            kotlinx.coroutines.internal.UndeliveredElementException r4 = r3.updateValueLocked(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L40
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L45
            r0.unlock()
            return r4
        L40:
            throw r4     // Catch: java.lang.Throwable -> L45
        L41:
            r0.unlock()
            return r1
        L45:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object offerSelectInternal(E r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r5) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r3.getClosedForSend()     // Catch: java.lang.Throwable -> L79
            if (r1 != 0) goto L75
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L79
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L79
            if (r1 != r2) goto L5a
        L11:
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r1 = r3.describeTryOffer(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r2 = r5.performAtomicTrySelect(r1)     // Catch: java.lang.Throwable -> L79
            if (r2 != 0) goto L31
            java.lang.Object r5 = r1.getResult()     // Catch: java.lang.Throwable -> L79
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L79
            r0.unlock()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlinx.coroutines.channels.ReceiveOrClosed r5 = (kotlinx.coroutines.channels.ReceiveOrClosed) r5
            r5.completeResumeReceive(r4)
            java.lang.Object r4 = r5.getOfferResult()
            return r4
        L31:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L79
            if (r2 != r1) goto L36
            goto L5a
        L36:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> L79
            if (r2 != r1) goto L3b
            goto L11
        L3b:
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L79
            if (r2 == r4) goto L56
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L46
            goto L56
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L79
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L79
            throw r4     // Catch: java.lang.Throwable -> L79
        L56:
            r0.unlock()
            return r2
        L5a:
            boolean r5 = r5.trySelect()     // Catch: java.lang.Throwable -> L79
            if (r5 != 0) goto L68
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L79
            r0.unlock()
            return r4
        L68:
            kotlinx.coroutines.internal.UndeliveredElementException r4 = r3.updateValueLocked(r4)     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L74
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L79
            r0.unlock()
            return r4
        L74:
            throw r4     // Catch: java.lang.Throwable -> L79
        L75:
            r0.unlock()
            return r1
        L79:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public void onCancelIdempotent(boolean r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.internal.UndeliveredElementException r1 = r3.updateValueLocked(r1)     // Catch: java.lang.Throwable -> L17
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            super.onCancelIdempotent(r4)
            if (r1 != 0) goto L16
            return
        L16:
            throw r1
        L17:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pollInternal() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L1f
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L1f
            if (r1 != r2) goto L17
            kotlinx.coroutines.channels.Closed r1 = r3.getClosedForSend()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L13
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L1f
        L13:
            r0.unlock()
            return r1
        L17:
            r3.value = r2     // Catch: java.lang.Throwable -> L1f
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1f
            r0.unlock()
            return r1
        L1f:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pollSelectInternal(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L2f
            if (r1 != r2) goto L17
            kotlinx.coroutines.channels.Closed r4 = r3.getClosedForSend()     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L13
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L2f
        L13:
            r0.unlock()
            return r4
        L17:
            boolean r4 = r4.trySelect()     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L25
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L2f
            r0.unlock()
            return r4
        L25:
            java.lang.Object r4 = r3.value     // Catch: java.lang.Throwable -> L2f
            r3.value = r2     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2f
            r0.unlock()
            return r4
        L2f:
            r4 = move-exception
            r0.unlock()
            throw r4
    }
}
