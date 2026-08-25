package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004CDEFB)\u0012 \u0010A\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010*j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`@¢\u0006\u0004\bB\u0010.J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\n2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u001b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\b\u001a\u00028\u00002(\u0010\u001a\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J$\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0$2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020\n2\u0018\u0010,\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\n0*j\u0002`+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00101R\u0011\u0010;\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b;\u00108R#\u0010?\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020<8F¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/Closed;", "closed", "", "helpCloseAndGetSendException", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "element", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "", "sendSuspend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "cause", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "countQueueSize", "()I", "send", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "isFullImpl", "()Z", "getQueueDebugStateString", "queueDebugStateString", "isClosedForSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class AbstractSendChannel<E> implements kotlinx.coroutines.channels.SendChannel<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater onCloseHandler$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object onCloseHandler;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.internal.LockFreeLinkedListHead queue;

    /* JADX INFO: compiled from: AbstractChannel.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SendBuffered<E> extends kotlinx.coroutines.channels.Send {

        @kotlin.jvm.JvmField
        public final E element;

        public SendBuffered(E r1) {
                r0 = this;
                r0.<init>()
                r0.element = r1
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend() {
                r0 = this;
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        @org.jetbrains.annotations.Nullable
        public java.lang.Object getPollResult() {
                r1 = this;
                E r0 = r1.element
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public void resumeSendClosed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r1) {
                r0 = this;
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "SendBuffered@"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                E r1 = r2.element
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.Symbol tryResumeSend(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r1 = this;
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r2 != 0) goto L5
                goto L8
            L5:
                r2.finishPrepare()
            L8:
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "element", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class SendBufferedDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered<? extends E>> {
        public SendBufferedDesc(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListHead r2, E r3) {
                r1 = this;
                kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered
                r0.<init>(r3)
                r1.<init>(r2, r0)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object failure(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
                if (r2 == 0) goto Lc
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BV\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t\u0012(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u00152\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0015H\u0016R7\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;", "E", "R", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/DisposableHandle;", "pollResult", "channel", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "", "dispose", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "undeliveredElement", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SendSelect<E, R> extends kotlinx.coroutines.channels.Send implements kotlinx.coroutines.DisposableHandle {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.SendChannel<? super E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.channels.AbstractSendChannel<E> channel;
        private final E pollResult;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        public SendSelect(E r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.AbstractSendChannel<E> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<? super R> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.<init>()
                r0.pollResult = r1
                r0.channel = r2
                r0.select = r3
                r0.block = r4
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend() {
                r6 = this;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.SendChannel<? super E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r6.block
                kotlinx.coroutines.channels.AbstractSendChannel<E> r1 = r6.channel
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r6.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                r3 = 0
                r4 = 4
                r5 = 0
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                boolean r0 = r1.mo1865remove()
                if (r0 != 0) goto L7
                return
            L7:
                r1.undeliveredElement()
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public E getPollResult() {
                r1 = this;
                E r0 = r1.pollResult
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public void resumeSendClosed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                boolean r0 = r0.trySelect()
                if (r0 == 0) goto L11
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                java.lang.Throwable r2 = r2.getSendException()
                r0.resumeSelectWithException(r2)
            L11:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "SendSelect@"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                java.lang.Object r1 = r2.getPollResult()
                r0.append(r1)
                java.lang.String r1 = ")["
                r0.append(r1)
                kotlinx.coroutines.channels.AbstractSendChannel<E> r1 = r2.channel
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.Symbol tryResumeSend(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                java.lang.Object r2 = r0.trySelectOther(r2)
                kotlinx.coroutines.internal.Symbol r2 = (kotlinx.coroutines.internal.Symbol) r2
                return r2
        }

        @Override // kotlinx.coroutines.channels.Send
        public void undeliveredElement() {
                r3 = this;
                kotlinx.coroutines.channels.AbstractSendChannel<E> r0 = r3.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 != 0) goto L7
                goto L18
            L7:
                java.lang.Object r1 = r3.getPollResult()
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r3.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlin.coroutines.CoroutineContext r2 = r2.getContext()
                kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r1, r2)
            L18:
                return
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00028\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016R\u0014\u0010\n\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "", "onPrepare", "element", "Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class TryOfferDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.ReceiveOrClosed<? super E>> {

        @kotlin.jvm.JvmField
        public final E element;

        public TryOfferDesc(E r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListHead r2) {
                r0 = this;
                r0.<init>(r2)
                r0.element = r1
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object failure(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
                if (r2 != 0) goto Lc
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public java.lang.Object onPrepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r3) {
                r2 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.affected
                kotlinx.coroutines.channels.ReceiveOrClosed r0 = (kotlinx.coroutines.channels.ReceiveOrClosed) r0
                E r1 = r2.element
                kotlinx.coroutines.internal.Symbol r3 = r0.tryResumeReceive(r1, r3)
                if (r3 != 0) goto Lf
                java.lang.Object r3 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r3
            Lf:
                java.lang.Object r0 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                if (r3 != r0) goto L14
                return r0
            L14:
                r3 = 0
                return r3
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.channels.AbstractSendChannel> r0 = kotlinx.coroutines.channels.AbstractSendChannel.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "onCloseHandler"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU = r0
            return
    }

    public AbstractSendChannel(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>()
            r0.onUndeliveredElement = r1
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = new kotlinx.coroutines.internal.LockFreeLinkedListHead
            r1.<init>()
            r0.queue = r1
            r1 = 0
            r0.onCloseHandler = r1
            return
    }

    public static final /* synthetic */ void access$helpCloseAndResumeWithSendException(kotlinx.coroutines.channels.AbstractSendChannel r0, kotlin.coroutines.Continuation r1, java.lang.Object r2, kotlinx.coroutines.channels.Closed r3) {
            r0.helpCloseAndResumeWithSendException(r1, r2, r3)
            return
    }

    public static final /* synthetic */ boolean access$isFullImpl(kotlinx.coroutines.channels.AbstractSendChannel r0) {
            boolean r0 = r0.isFullImpl()
            return r0
    }

    public static final /* synthetic */ void access$registerSelectSend(kotlinx.coroutines.channels.AbstractSendChannel r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectSend(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$sendSuspend(kotlinx.coroutines.channels.AbstractSendChannel r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.sendSuspend(r1, r2)
            return r0
    }

    private final int countQueueSize() {
            r4 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            java.lang.Object r1 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
        L9:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r3 != 0) goto L1a
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r3 == 0) goto L15
            int r2 = r2 + 1
        L15:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
            goto L9
        L1a:
            return r2
    }

    private final java.lang.String getQueueDebugStateString() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r3.queue
            if (r0 != r1) goto Ld
            java.lang.String r0 = "EmptyQueue"
            return r0
        Ld:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.toString()
            goto L2a
        L16:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Receive
            if (r1 == 0) goto L1d
            java.lang.String r1 = "ReceiveQueued"
            goto L2a
        L1d:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Send
            if (r1 == 0) goto L24
            java.lang.String r1 = "SendQueued"
            goto L2a
        L24:
            java.lang.String r1 = "UNEXPECTED:"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
        L2a:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getPrevNode()
            if (r2 == r0) goto L5b
            java.lang.String r0 = ",queueSize="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r1, r0)
            int r1 = r3.countQueueSize()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ",closedForSend="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
        L5b:
            return r1
    }

    private final void helpClose(kotlinx.coroutines.channels.Closed<?> r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m1857constructorimpl$default(r0, r1, r0)
        L6:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r6.getPrevNode()
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.Receive
            if (r4 == 0) goto L11
            kotlinx.coroutines.channels.Receive r3 = (kotlinx.coroutines.channels.Receive) r3
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 != 0) goto L3b
            if (r2 != 0) goto L17
            goto L3a
        L17:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto L21
            kotlinx.coroutines.channels.Receive r2 = (kotlinx.coroutines.channels.Receive) r2
            r2.resumeReceiveClosed(r6)
            goto L3a
        L21:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            int r0 = r0 - r1
            if (r0 < 0) goto L3a
        L2a:
            int r1 = r0 + (-1)
            java.lang.Object r0 = r2.get(r0)
            kotlinx.coroutines.channels.Receive r0 = (kotlinx.coroutines.channels.Receive) r0
            r0.resumeReceiveClosed(r6)
            if (r1 >= 0) goto L38
            goto L3a
        L38:
            r0 = r1
            goto L2a
        L3a:
            return
        L3b:
            boolean r4 = r3.mo1865remove()
            if (r4 != 0) goto L45
            r3.helpRemove()
            goto L6
        L45:
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m1862plusFjFbRPM(r2, r3)
            goto L6
    }

    private final java.lang.Throwable helpCloseAndGetSendException(E r4, kotlinx.coroutines.channels.Closed<?> r5) {
            r3 = this;
            r3.helpClose(r5)
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r3.onUndeliveredElement
            if (r0 != 0) goto L8
            goto L10
        L8:
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r4 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r0, r4, r2, r1, r2)
            if (r4 != 0) goto L15
        L10:
            java.lang.Throwable r4 = r5.getSendException()
            return r4
        L15:
            java.lang.Throwable r5 = r5.getSendException()
            kotlin.ExceptionsKt.addSuppressed(r4, r5)
            throw r4
    }

    private final java.lang.Throwable helpCloseAndGetSendException(kotlinx.coroutines.channels.Closed<?> r1) {
            r0 = this;
            r0.helpClose(r1)
            java.lang.Throwable r1 = r1.getSendException()
            return r1
    }

    private final void helpCloseAndResumeWithSendException(kotlin.coroutines.Continuation<?> r4, E r5, kotlinx.coroutines.channels.Closed<?> r6) {
            r3 = this;
            r3.helpClose(r6)
            java.lang.Throwable r6 = r6.getSendException()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r3.onUndeliveredElement
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r5 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r0, r5, r2, r1, r2)
            if (r5 != 0) goto L22
        L14:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r5 = kotlin.Result.m333constructorimpl(r5)
            r4.resumeWith(r5)
            return
        L22:
            kotlin.ExceptionsKt.addSuppressed(r5, r6)
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m333constructorimpl(r5)
            r4.resumeWith(r5)
            return
    }

    private final void invokeOnCloseHandler(java.lang.Throwable r6) {
            r5 = this;
            java.lang.Object r0 = r5.onCloseHandler
            if (r0 == 0) goto L25
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r0 == r1) goto L25
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
        La:
            boolean r3 = r2.compareAndSet(r5, r0, r1)
            r4 = 1
            if (r3 == 0) goto L13
            r1 = 1
            goto L1a
        L13:
            java.lang.Object r3 = r2.get(r5)
            if (r3 == r0) goto La
            r1 = 0
        L1a:
            if (r1 == 0) goto L25
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r0, r4)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r6)
        L25:
            return
    }

    private final boolean isFullImpl() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r0 != 0) goto L12
            boolean r0 = r1.isBufferFull()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private final <R> void registerSelectSend(kotlinx.coroutines.selects.SelectInstance<? super R> r3, E r4, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.isFullImpl()
            if (r0 == 0) goto L55
            kotlinx.coroutines.channels.AbstractSendChannel$SendSelect r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendSelect
            r0.<init>(r4, r2, r3, r5)
            java.lang.Object r1 = r2.enqueueSend(r0)
            if (r1 != 0) goto L1c
            r3.disposeOnSelect(r0)
            return
        L1c:
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r0 != 0) goto L4a
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            if (r1 != r0) goto L25
            goto L55
        L25:
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.Receive
            if (r0 == 0) goto L2a
            goto L55
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enqueueSend returned "
            r4.append(r5)
            r4.append(r1)
            r5 = 32
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4a:
            kotlinx.coroutines.channels.Closed r1 = (kotlinx.coroutines.channels.Closed) r1
            java.lang.Throwable r3 = r2.helpCloseAndGetSendException(r4, r1)
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r3)
            throw r3
        L55:
            java.lang.Object r0 = r2.offerSelectInternal(r4, r3)
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L60
            return
        L60:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r1) goto L65
            goto L0
        L65:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L6a
            goto L0
        L6a:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L76
            kotlin.coroutines.Continuation r3 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r5, r2, r3)
            return
        L76:
            boolean r3 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L85
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            java.lang.Throwable r3 = r2.helpCloseAndGetSendException(r4, r0)
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r3)
            throw r3
        L85:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "offerSelectInternal returned "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private final java.lang.Object sendSuspend(E r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r3 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
        L8:
            boolean r1 = access$isFullImpl(r3)
            if (r1 == 0) goto L4d
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r3.onUndeliveredElement
            if (r1 != 0) goto L18
            kotlinx.coroutines.channels.SendElement r1 = new kotlinx.coroutines.channels.SendElement
            r1.<init>(r4, r0)
            goto L1f
        L18:
            kotlinx.coroutines.channels.SendElementWithUndeliveredHandler r1 = new kotlinx.coroutines.channels.SendElementWithUndeliveredHandler
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r3.onUndeliveredElement
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.enqueueSend(r1)
            if (r2 != 0) goto L29
            kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(r0, r1)
            goto L6f
        L29:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L33
            kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
            access$helpCloseAndResumeWithSendException(r3, r0, r4, r2)
            goto L6f
        L33:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            if (r2 != r1) goto L38
            goto L4d
        L38:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.Receive
            if (r1 == 0) goto L3d
            goto L4d
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "enqueueSend returned "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.Object r1 = r3.offerInternal(r4)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r1 != r2) goto L61
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m333constructorimpl(r4)
            r0.resumeWith(r4)
            goto L6f
        L61:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r1 != r2) goto L66
            goto L8
        L66:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L86
            kotlinx.coroutines.channels.Closed r1 = (kotlinx.coroutines.channels.Closed) r1
            access$helpCloseAndResumeWithSendException(r3, r0, r4, r1)
        L6f:
            java.lang.Object r4 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r0) goto L7c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L7c:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L83
            return r4
        L83:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "offerInternal returned "
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(@org.jetbrains.annotations.Nullable java.lang.Throwable r6) {
            r5 = this;
            kotlinx.coroutines.channels.Closed r0 = new kotlinx.coroutines.channels.Closed
            r0.<init>(r6)
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r5.queue
        L7:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.getPrevNode()
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed
            r4 = 1
            r3 = r3 ^ r4
            if (r3 != 0) goto L13
            r4 = 0
            goto L19
        L13:
            boolean r2 = r2.addNext(r0, r1)
            if (r2 == 0) goto L7
        L19:
            if (r4 == 0) goto L1c
            goto L24
        L1c:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r5.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getPrevNode()
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
        L24:
            r5.helpClose(r0)
            if (r4 == 0) goto L2c
            r5.invokeOnCloseHandler(r6)
        L2c:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<?> describeSendBuffered(E r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$SendBufferedDesc r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBufferedDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.queue
            r0.<init>(r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.AbstractSendChannel.TryOfferDesc<E> describeTryOffer(E r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r0 = new kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.queue
            r0.<init>(r3, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object enqueueSend(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Send r5) {
            r4 = this;
            boolean r0 = r4.isBufferAlwaysFull()
            if (r0 == 0) goto L18
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
        L8:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.getPrevNode()
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r2 == 0) goto L11
            return r1
        L11:
            boolean r1 = r1.addNext(r5, r0)
            if (r1 == 0) goto L8
            goto L39
        L18:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1 r1 = new kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1
            r1.<init>(r5, r4)
        L1f:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.getPrevNode()
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r3 == 0) goto L28
            return r2
        L28:
            int r2 = r2.tryCondAddNext(r5, r0, r1)
            r3 = 1
            if (r2 == r3) goto L34
            r3 = 2
            if (r2 == r3) goto L33
            goto L1f
        L33:
            r3 = 0
        L34:
            if (r3 != 0) goto L39
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            return r5
        L39:
            r5 = 0
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getBufferDebugString() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.channels.Closed<?> getClosedForReceive() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            r2 = 0
            if (r1 == 0) goto Le
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L12
            goto L16
        L12:
            r3.helpClose(r0)
            r2 = r0
        L16:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.channels.Closed<?> getClosedForSend() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getPrevNode()
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            r2 = 0
            if (r1 == 0) goto Le
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L12
            goto L16
        L12:
            r3.helpClose(r0)
            r2 = r0
        L16:
            return r2
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$onSend$1 r0 = new kotlinx.coroutines.channels.AbstractSendChannel$onSend$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.LockFreeLinkedListHead getQueue() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.queue
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
        L2:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Ld
            r0 = 1
            goto L14
        Ld:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L2
            r0 = 0
        L14:
            if (r0 != 0) goto L30
            java.lang.Object r7 = r6.onCloseHandler
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r7 != r0) goto L24
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Another handler was already registered and successfully invoked"
            r7.<init>(r0)
            throw r7
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Another handler was already registered: "
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r7)
            r0.<init>(r7)
            throw r0
        L30:
            kotlinx.coroutines.channels.Closed r0 = r6.getClosedForSend()
            if (r0 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
        L3a:
            boolean r5 = r1.compareAndSet(r6, r7, r4)
            if (r5 == 0) goto L42
            r2 = 1
            goto L48
        L42:
            java.lang.Object r5 = r1.get(r6)
            if (r5 == r7) goto L3a
        L48:
            if (r2 == 0) goto L4f
            java.lang.Throwable r0 = r0.closeCause
            r7.invoke(r0)
        L4f:
            return
    }

    public abstract boolean isBufferAlwaysFull();

    public abstract boolean isBufferFull();

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
            r1 = this;
            kotlinx.coroutines.channels.Closed r0 = r1.getClosedForSend()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(E r5) {
            r4 = this;
            boolean r5 = kotlinx.coroutines.channels.SendChannel.DefaultImpls.offer(r4, r5)     // Catch: java.lang.Throwable -> L5
            return r5
        L5:
            r0 = move-exception
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 == 0) goto L17
            r2 = 2
            r3 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r5 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r5, r3, r2, r3)
            if (r5 != 0) goto L13
            goto L17
        L13:
            kotlin.ExceptionsKt.addSuppressed(r5, r0)
            throw r5
        L17:
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Object offerInternal(E r3) {
            r2 = this;
        L0:
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = r2.takeFirstReceiveOrPeekClosed()
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            return r3
        L9:
            r1 = 0
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeReceive(r3, r1)
            if (r1 == 0) goto L0
            r0.completeResumeReceive(r3)
            java.lang.Object r3 = r0.getOfferResult()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Object offerSelectInternal(E r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r3) {
            r1 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r0 = r1.describeTryOffer(r2)
            java.lang.Object r3 = r3.performAtomicTrySelect(r0)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            java.lang.Object r3 = r0.getResult()
            kotlinx.coroutines.channels.ReceiveOrClosed r3 = (kotlinx.coroutines.channels.ReceiveOrClosed) r3
            r3.completeResumeReceive(r2)
            java.lang.Object r2 = r3.getOfferResult()
            return r2
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object send(E r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            java.lang.Object r0 = r2.offerInternal(r3)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto Lb
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        Lb:
            java.lang.Object r3 = r2.sendSuspend(r3, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L16
            return r3
        L16:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.channels.ReceiveOrClosed<?> sendBuffered(E r4) {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r1 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered
            r1.<init>(r4)
        L7:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r0.getPrevNode()
            boolean r2 = r4 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r2 == 0) goto L12
            kotlinx.coroutines.channels.ReceiveOrClosed r4 = (kotlinx.coroutines.channels.ReceiveOrClosed) r4
            return r4
        L12:
            boolean r4 = r4.addNext(r1, r0)
            if (r4 == 0) goto L7
            r4 = 0
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
            r4 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
        L2:
            java.lang.Object r1 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            kotlinx.coroutines.channels.ReceiveOrClosed r2 = (kotlinx.coroutines.channels.ReceiveOrClosed) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L20
            boolean r2 = r1.isRemoved()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.removeOrNext()
            if (r2 != 0) goto L29
        L26:
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = (kotlinx.coroutines.channels.ReceiveOrClosed) r1
            return r1
        L29:
            r2.helpRemovePrev()
            goto L2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.channels.Send takeFirstSendOrPeekClosed() {
            r4 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
        L2:
            java.lang.Object r1 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.Send
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            kotlinx.coroutines.channels.Send r2 = (kotlinx.coroutines.channels.Send) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L20
            boolean r2 = r1.isRemoved()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.removeOrNext()
            if (r2 != 0) goto L29
        L26:
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            return r1
        L29:
            r2.helpRemovePrev()
            goto L2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.String r1 = r2.getQueueDebugStateString()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r1 = r2.getBufferDebugString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public final java.lang.Object mo1821trySendJP2dKIU(E r3) {
            r2 = this;
            java.lang.Object r3 = r2.offerInternal(r3)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r3 != r0) goto L11
            kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r3.m1841successJP2dKIU(r0)
            goto L3d
        L11:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r3 != r0) goto L2d
            kotlinx.coroutines.channels.Closed r3 = r2.getClosedForSend()
            if (r3 != 0) goto L22
            kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r3 = r3.m1840failurePtdJZtk()
            return r3
        L22:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r3 = r2.helpCloseAndGetSendException(r3)
            java.lang.Object r3 = r0.m1839closedJP2dKIU(r3)
            goto L3d
        L2d:
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L3e
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r3 = (kotlinx.coroutines.channels.Closed) r3
            java.lang.Throwable r3 = r2.helpCloseAndGetSendException(r3)
            java.lang.Object r3 = r0.m1839closedJP2dKIU(r3)
        L3d:
            return r3
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "trySend returned "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
