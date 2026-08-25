package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: LinkedListChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class LinkedListChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    public LinkedListChannel(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    public final boolean isBufferAlwaysEmpty() {
            r1 = this;
            r0 = 1
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
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public final boolean isBufferFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object offerInternal(E r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = super.offerInternal(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L9
            return r1
        L9:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r2) goto L19
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = r3.sendBuffered(r4)
            if (r0 != 0) goto L14
            return r1
        L14:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L0
            return r0
        L19:
            boolean r4 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r4 == 0) goto L1e
            return r0
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid offerInternal result "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object offerSelectInternal(E r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r4) {
            r2 = this;
        L0:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r2.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r0 == 0) goto L11
            java.lang.Object r0 = super.offerSelectInternal(r3, r4)
            goto L1d
        L11:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc r0 = r2.describeSendBuffered(r3)
            java.lang.Object r0 = r4.performAtomicTrySelect(r0)
            if (r0 != 0) goto L1d
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
        L1d:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L28
            java.lang.Object r3 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            return r3
        L28:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L2d
            return r1
        L2d:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r1) goto L32
            goto L0
        L32:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L37
            goto L0
        L37:
            boolean r3 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L3c
            return r0
        L3c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Invalid result "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: onCancelIdempotentList-w-w6eGU */
    public final void mo1818onCancelIdempotentListww6eGU(@org.jetbrains.annotations.NotNull java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r7) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            goto L4f
        L4:
            boolean r1 = r6 instanceof java.util.ArrayList
            if (r1 != 0) goto L20
            kotlinx.coroutines.channels.Send r6 = (kotlinx.coroutines.channels.Send) r6
            boolean r1 = r6 instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered
            if (r1 == 0) goto L1c
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r7 = r5.onUndeliveredElement
            if (r7 != 0) goto L13
            goto L4f
        L13:
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r6 = (kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered) r6
            E r6 = r6.element
            kotlinx.coroutines.internal.UndeliveredElementException r0 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r7, r6, r0)
            goto L4f
        L1c:
            r6.resumeSendClosed(r7)
            goto L4f
        L20:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r1 = r6.size()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4f
            r2 = r0
        L2b:
            int r3 = r1 + (-1)
            java.lang.Object r1 = r6.get(r1)
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            boolean r4 = r1 instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered
            if (r4 == 0) goto L46
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r5.onUndeliveredElement
            if (r4 != 0) goto L3d
            r2 = r0
            goto L49
        L3d:
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r1 = (kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered) r1
            E r1 = r1.element
            kotlinx.coroutines.internal.UndeliveredElementException r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r4, r1, r2)
            goto L49
        L46:
            r1.resumeSendClosed(r7)
        L49:
            if (r3 >= 0) goto L4d
            r0 = r2
            goto L4f
        L4d:
            r1 = r3
            goto L2b
        L4f:
            if (r0 != 0) goto L52
            return
        L52:
            throw r0
    }
}
