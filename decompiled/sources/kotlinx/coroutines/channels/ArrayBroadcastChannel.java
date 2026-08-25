package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001>B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b=\u0010;J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001b\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R6\u0010.\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0,j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f`-8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\u000bR$\u00105\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u00104R$\u00108\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u00104R$\u0010<\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b9\u0010#\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "cause", "", "cancelInternal", "(Ljava/lang/Throwable;)Z", "", "checkSubOffers", "()V", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "addSub", "removeSub", "updateHead", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;)V", "", "computeMinHead", "()J", "index", "elementAt", "(J)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "close", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "", "capacity", "I", "getCapacity", "()I", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "bufferLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "", "buffer", "[Ljava/lang/Object;", "", "Lkotlinx/coroutines/internal/SubscribersList;", "subscribers", "Ljava/util/List;", "getSubscribers$annotations", "value", "getHead", "setHead", "(J)V", "head", "getTail", "setTail", "tail", "getSize", "setSize", "(I)V", "size", "<init>", "Subscriber", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ArrayBroadcastChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ long _head;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int _size;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ long _tail;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] buffer;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock bufferLock;
    private final int capacity;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E>> subscribers;

    /* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u00060\u0012j\u0002`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "needsToCheckOfferWithoutLock", "()Z", "", "peekUnderLock", "()Ljava/lang/Object;", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "checkOffer", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "broadcastChannel", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "subLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "value", "getSubHead", "()J", "setSubHead", "(J)V", "subHead", "<init>", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Subscriber<E> extends kotlinx.coroutines.channels.AbstractChannel<E> implements kotlinx.coroutines.channels.ReceiveChannel<E> {

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ long _subHead;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.channels.ArrayBroadcastChannel<E> broadcastChannel;

        @org.jetbrains.annotations.NotNull
        private final java.util.concurrent.locks.ReentrantLock subLock;

        public Subscriber(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.broadcastChannel = r3
                java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
                r3.<init>()
                r2.subLock = r3
                r0 = 0
                r2._subHead = r0
                return
        }

        private final boolean needsToCheckOfferWithoutLock() {
                r2 = this;
                kotlinx.coroutines.channels.Closed r0 = r2.getClosedForReceive()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r2.isBufferEmpty()
                if (r0 == 0) goto L17
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r2.broadcastChannel
                kotlinx.coroutines.channels.Closed r0 = r0.getClosedForReceive()
                if (r0 != 0) goto L17
                return r1
            L17:
                r0 = 1
                return r0
        }

        private final java.lang.Object peekUnderLock() {
                r6 = this;
                long r0 = r6.getSubHead()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r6.broadcastChannel
                kotlinx.coroutines.channels.Closed r2 = r2.getClosedForReceive()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r3 = r6.broadcastChannel
                long r3 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r3)
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L1f
                if (r2 != 0) goto L1a
                kotlinx.coroutines.channels.Closed r2 = r6.getClosedForReceive()
            L1a:
                if (r2 != 0) goto L1e
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            L1e:
                return r2
            L1f:
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r6.broadcastChannel
                java.lang.Object r0 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$elementAt(r2, r0)
                kotlinx.coroutines.channels.Closed r1 = r6.getClosedForReceive()
                if (r1 == 0) goto L2c
                return r1
            L2c:
                return r0
        }

        public final boolean checkOffer() {
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.needsToCheckOfferWithoutLock()
                r2 = 0
                if (r1 == 0) goto L5a
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                boolean r1 = r1.tryLock()
                if (r1 != 0) goto L11
                goto L5a
            L11:
                java.lang.Object r1 = r8.peekUnderLock()     // Catch: java.lang.Throwable -> L53
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L53
                if (r1 != r3) goto L1f
            L19:
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                goto L1
            L1f:
                boolean r3 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L53
                if (r3 == 0) goto L2c
                r2 = r1
                kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2     // Catch: java.lang.Throwable -> L53
            L26:
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                goto L5a
            L2c:
                kotlinx.coroutines.channels.ReceiveOrClosed r3 = r8.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L53
                if (r3 != 0) goto L33
                goto L26
            L33:
                boolean r4 = r3 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L53
                if (r4 == 0) goto L38
                goto L26
            L38:
                kotlinx.coroutines.internal.Symbol r2 = r3.tryResumeReceive(r1, r2)     // Catch: java.lang.Throwable -> L53
                if (r2 != 0) goto L3f
                goto L19
            L3f:
                long r4 = r8.getSubHead()     // Catch: java.lang.Throwable -> L53
                r6 = 1
                long r4 = r4 + r6
                r8.setSubHead(r4)     // Catch: java.lang.Throwable -> L53
                r0 = 1
                java.util.concurrent.locks.ReentrantLock r2 = r8.subLock
                r2.unlock()
                r3.completeResumeReceive(r1)
                goto L1
            L53:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                throw r0
            L5a:
                if (r2 != 0) goto L5d
                goto L62
            L5d:
                java.lang.Throwable r1 = r2.closeCause
                r8.close(r1)
            L62:
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
        public boolean close(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                r3 = this;
                boolean r4 = super.close(r4)
                if (r4 == 0) goto L26
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r3.broadcastChannel
                r1 = 1
                r2 = 0
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r0, r2, r3, r1)
                java.util.concurrent.locks.ReentrantLock r0 = r3.subLock
                r0.lock()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r1 = r3.broadcastChannel     // Catch: java.lang.Throwable -> L21
                long r1 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r1)     // Catch: java.lang.Throwable -> L21
                r3.setSubHead(r1)     // Catch: java.lang.Throwable -> L21
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L21
                r0.unlock()
                goto L26
            L21:
                r4 = move-exception
                r0.unlock()
                throw r4
            L26:
                return r4
        }

        public final long getSubHead() {
                r2 = this;
                long r0 = r2._subHead
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
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        public final boolean isBufferEmpty() {
                r5 = this;
                long r0 = r5.getSubHead()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r5.broadcastChannel
                long r2 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r2)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        public final boolean isBufferFull() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object pollInternal() {
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.subLock
                r0.lock()
                java.lang.Object r1 = r8.peekUnderLock()     // Catch: java.lang.Throwable -> L46
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L46
                r3 = 1
                if (r2 == 0) goto Lf
                goto L13
            Lf:
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L46
                if (r1 != r2) goto L15
            L13:
                r2 = 0
                goto L20
            L15:
                long r4 = r8.getSubHead()     // Catch: java.lang.Throwable -> L46
                r6 = 1
                long r4 = r4 + r6
                r8.setSubHead(r4)     // Catch: java.lang.Throwable -> L46
                r2 = 1
            L20:
                r0.unlock()
                boolean r0 = r1 instanceof kotlinx.coroutines.channels.Closed
                r4 = 0
                if (r0 == 0) goto L2c
                r0 = r1
                kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
                goto L2d
            L2c:
                r0 = r4
            L2d:
                if (r0 != 0) goto L30
                goto L35
            L30:
                java.lang.Throwable r0 = r0.closeCause
                r8.close(r0)
            L35:
                boolean r0 = r8.checkOffer()
                if (r0 == 0) goto L3c
                goto L3d
            L3c:
                r3 = r2
            L3d:
                if (r3 == 0) goto L45
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r8.broadcastChannel
                r2 = 3
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r0, r4, r4, r2)
            L45:
                return r1
            L46:
                r1 = move-exception
                r0.unlock()
                throw r1
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object pollSelectInternal(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r8) {
                r7 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r7.subLock
                r0.lock()
                java.lang.Object r1 = r7.peekUnderLock()     // Catch: java.lang.Throwable -> L51
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L51
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L10
                goto L2b
            L10:
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L51
                if (r1 != r2) goto L15
                goto L2b
            L15:
                boolean r8 = r8.trySelect()     // Catch: java.lang.Throwable -> L51
                if (r8 != 0) goto L20
                java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L51
                goto L2b
            L20:
                long r2 = r7.getSubHead()     // Catch: java.lang.Throwable -> L51
                r5 = 1
                long r2 = r2 + r5
                r7.setSubHead(r2)     // Catch: java.lang.Throwable -> L51
                r3 = 1
            L2b:
                r0.unlock()
                boolean r8 = r1 instanceof kotlinx.coroutines.channels.Closed
                r0 = 0
                if (r8 == 0) goto L37
                r8 = r1
                kotlinx.coroutines.channels.Closed r8 = (kotlinx.coroutines.channels.Closed) r8
                goto L38
            L37:
                r8 = r0
            L38:
                if (r8 != 0) goto L3b
                goto L40
            L3b:
                java.lang.Throwable r8 = r8.closeCause
                r7.close(r8)
            L40:
                boolean r8 = r7.checkOffer()
                if (r8 == 0) goto L47
                goto L48
            L47:
                r4 = r3
            L48:
                if (r4 == 0) goto L50
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r8 = r7.broadcastChannel
                r2 = 3
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r8, r0, r0, r2)
            L50:
                return r1
            L51:
                r8 = move-exception
                r0.unlock()
                throw r8
        }

        public final void setSubHead(long r1) {
                r0 = this;
                r0._subHead = r1
                return
        }
    }

    public ArrayBroadcastChannel(int r4) {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            r3.capacity = r4
            r0 = 0
            r1 = 1
            if (r4 < r1) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L28
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r3.bufferLock = r1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3.buffer = r4
            r1 = 0
            r3._head = r1
            r3._tail = r1
            r3._size = r0
            java.util.List r4 = kotlinx.coroutines.internal.ConcurrentKt.subscriberList()
            r3.subscribers = r4
            return
        L28:
            java.lang.String r4 = "ArrayBroadcastChannel capacity must be at least 1, but "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            int r0 = r3.getCapacity()
            r4.append(r0)
            java.lang.String r0 = " was specified"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static final /* synthetic */ java.lang.Object access$elementAt(kotlinx.coroutines.channels.ArrayBroadcastChannel r0, long r1) {
            java.lang.Object r0 = r0.elementAt(r1)
            return r0
    }

    public static final /* synthetic */ long access$getTail(kotlinx.coroutines.channels.ArrayBroadcastChannel r2) {
            long r0 = r2.getTail()
            return r0
    }

    private final boolean cancelInternal(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.close(r4)
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r1 = r3.subscribers
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r2 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r2
            r2.cancelInternal$kotlinx_coroutines_core(r4)
            goto La
        L1a:
            return r0
    }

    private final void checkSubOffers() {
            r5 = this;
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r0 = r5.subscribers
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = 0
            r3 = 0
        L9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1e
            java.lang.Object r3 = r0.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r3 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r3
            boolean r3 = r3.checkOffer()
            if (r3 == 0) goto L1c
            r2 = 1
        L1c:
            r3 = 1
            goto L9
        L1e:
            if (r2 != 0) goto L22
            if (r3 != 0) goto L27
        L22:
            r0 = 3
            r1 = 0
            updateHead$default(r5, r1, r1, r0)
        L27:
            return
    }

    private final long computeMinHead() {
            r5 = this;
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r0 = r5.subscribers
            java.util.Iterator r0 = r0.iterator()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lb:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r3 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r3
            long r3 = r3.getSubHead()
            long r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r3)
            goto Lb
        L20:
            return r1
    }

    private final E elementAt(long r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.buffer
            int r1 = r3.capacity
            long r1 = (long) r1
            long r4 = r4 % r1
            int r5 = (int) r4
            r4 = r0[r5]
            return r4
    }

    private final long getHead() {
            r2 = this;
            long r0 = r2._head
            return r0
    }

    private final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    private static /* synthetic */ void getSubscribers$annotations() {
            return
    }

    private final long getTail() {
            r2 = this;
            long r0 = r2._tail
            return r0
    }

    private final void setHead(long r1) {
            r0 = this;
            r0._head = r1
            return
    }

    private final void setSize(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    private final void setTail(long r1) {
            r0 = this;
            r0._tail = r1
            return
    }

    private final void updateHead(kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> r12, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> r13) {
            r11 = this;
            r0 = 0
        L1:
            java.util.concurrent.locks.ReentrantLock r1 = r11.bufferLock
            r1.lock()
            if (r12 == 0) goto L23
            long r2 = r11.getTail()     // Catch: java.lang.Throwable -> L20
            r12.setSubHead(r2)     // Catch: java.lang.Throwable -> L20
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r2 = r11.subscribers     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L20
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r3 = r11.subscribers     // Catch: java.lang.Throwable -> L20
            r3.add(r12)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L23
            r1.unlock()
            return
        L20:
            r12 = move-exception
            goto Lba
        L23:
            if (r13 == 0) goto L3a
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r12 = r11.subscribers     // Catch: java.lang.Throwable -> L20
            r12.remove(r13)     // Catch: java.lang.Throwable -> L20
            long r2 = r11.getHead()     // Catch: java.lang.Throwable -> L20
            long r12 = r13.getSubHead()     // Catch: java.lang.Throwable -> L20
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L3a
            r1.unlock()
            return
        L3a:
            long r12 = r11.computeMinHead()     // Catch: java.lang.Throwable -> L20
            long r2 = r11.getTail()     // Catch: java.lang.Throwable -> L20
            long r4 = r11.getHead()     // Catch: java.lang.Throwable -> L20
            long r12 = kotlin.ranges.RangesKt.coerceAtMost(r12, r2)     // Catch: java.lang.Throwable -> L20
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 > 0) goto L52
            r1.unlock()
            return
        L52:
            int r6 = r11.getSize()     // Catch: java.lang.Throwable -> L20
        L56:
            int r7 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r7 >= 0) goto Lb6
            java.lang.Object[] r7 = r11.buffer     // Catch: java.lang.Throwable -> L20
            int r8 = r11.getCapacity()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            long r8 = r4 % r8
            int r9 = (int) r8     // Catch: java.lang.Throwable -> L20
            r7[r9] = r0     // Catch: java.lang.Throwable -> L20
            int r7 = r11.getCapacity()     // Catch: java.lang.Throwable -> L20
            if (r6 < r7) goto L6e
            r7 = 1
            goto L6f
        L6e:
            r7 = 0
        L6f:
            r8 = 1
            long r4 = r4 + r8
            r11.setHead(r4)     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + (-1)
            r11.setSize(r6)     // Catch: java.lang.Throwable -> L20
            if (r7 == 0) goto L56
        L7c:
            kotlinx.coroutines.channels.Send r7 = r11.takeFirstSendOrPeekClosed()     // Catch: java.lang.Throwable -> L20
            if (r7 != 0) goto L83
            goto L56
        L83:
            boolean r10 = r7 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L20
            if (r10 == 0) goto L88
            goto L56
        L88:
            kotlinx.coroutines.internal.Symbol r10 = r7.tryResumeSend(r0)     // Catch: java.lang.Throwable -> L20
            if (r10 == 0) goto L7c
            java.lang.Object[] r12 = r11.buffer     // Catch: java.lang.Throwable -> L20
            int r13 = r11.getCapacity()     // Catch: java.lang.Throwable -> L20
            long r4 = (long) r13     // Catch: java.lang.Throwable -> L20
            long r4 = r2 % r4
            int r13 = (int) r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r7.getPollResult()     // Catch: java.lang.Throwable -> L20
            r12[r13] = r4     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + 1
            r11.setSize(r6)     // Catch: java.lang.Throwable -> L20
            long r2 = r2 + r8
            r11.setTail(r2)     // Catch: java.lang.Throwable -> L20
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            r1.unlock()
            r7.completeResumeSend()
            r11.checkSubOffers()
            r12 = r0
            r13 = r12
            goto L1
        Lb6:
            r1.unlock()
            return
        Lba:
            r1.unlock()
            throw r12
    }

    public static /* synthetic */ void updateHead$default(kotlinx.coroutines.channels.ArrayBroadcastChannel r2, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber r3, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            r2.updateHead(r3, r4)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            r0 = this;
            r0.cancelInternal(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.cancelInternal(r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.close(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0.checkSubOffers()
            r1 = 1
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBufferDebugString() {
            r3 = this;
            java.lang.String r0 = "(buffer:capacity="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Object[] r1 = r3.buffer
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = ",size="
            r0.append(r1)
            int r1 = r3.getSize()
            r2 = 41
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public final boolean isBufferAlwaysFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    public final boolean isBufferFull() {
            r2 = this;
            int r0 = r2.getSize()
            int r1 = r2.capacity
            if (r0 < r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object offerInternal(E r8) {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.bufferLock
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r7.getClosedForSend()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L41
            int r1 = r7.getSize()     // Catch: java.lang.Throwable -> L45
            int r2 = r7.getCapacity()     // Catch: java.lang.Throwable -> L45
            if (r1 < r2) goto L1b
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L45
            r0.unlock()
            return r8
        L1b:
            long r2 = r7.getTail()     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r4 = r7.buffer     // Catch: java.lang.Throwable -> L45
            int r5 = r7.getCapacity()     // Catch: java.lang.Throwable -> L45
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L45
            long r5 = r2 % r5
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L45
            r4[r6] = r8     // Catch: java.lang.Throwable -> L45
            int r1 = r1 + 1
            r7.setSize(r1)     // Catch: java.lang.Throwable -> L45
            r4 = 1
            long r2 = r2 + r4
            r7.setTail(r2)     // Catch: java.lang.Throwable -> L45
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            r0.unlock()
            r7.checkSubOffers()
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r8
        L41:
            r0.unlock()
            return r1
        L45:
            r8 = move-exception
            r0.unlock()
            throw r8
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object offerSelectInternal(E r7, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r8) {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.bufferLock
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r6.getClosedForSend()     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L4f
            int r1 = r6.getSize()     // Catch: java.lang.Throwable -> L53
            int r2 = r6.getCapacity()     // Catch: java.lang.Throwable -> L53
            if (r1 < r2) goto L1b
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L53
            r0.unlock()
            return r7
        L1b:
            boolean r8 = r8.trySelect()     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto L29
            java.lang.Object r7 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L53
            r0.unlock()
            return r7
        L29:
            long r2 = r6.getTail()     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r8 = r6.buffer     // Catch: java.lang.Throwable -> L53
            int r4 = r6.getCapacity()     // Catch: java.lang.Throwable -> L53
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L53
            long r4 = r2 % r4
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L53
            r8[r5] = r7     // Catch: java.lang.Throwable -> L53
            int r1 = r1 + 1
            r6.setSize(r1)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            long r2 = r2 + r7
            r6.setTail(r2)     // Catch: java.lang.Throwable -> L53
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L53
            r0.unlock()
            r6.checkSubOffers()
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r7
        L4f:
            r0.unlock()
            return r1
        L53:
            r7 = move-exception
            r0.unlock()
            throw r7
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r3 = this;
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber
            r0.<init>(r3)
            r1 = 0
            r2 = 2
            updateHead$default(r3, r0, r1, r2)
            return r0
    }
}
