package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007=>?@ABCB)\u0012 \u0010:\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u000108j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`9¢\u0006\u0004\b;\u0010<J!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0013\u0010\n\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001eJ\"\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010\u001eJ\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\u0012\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0007J\u0016\u0010'\u001a\u00020\u00132\u000e\u0010&\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)J\u0019\u0010,\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0086\u0002R\u0014\u0010/\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00100R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000028F¢\u0006\u0006\u001a\u0004\b3\u00104R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b6\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "R", "", "receiveMode", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceive", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "block", "", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "value", "tryStartBlockUnintercepted", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "enqueueReceiveSelect", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "removeReceiveOnCancel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "", "cause", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)Z", "cancelInternal", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "isClosedForReceive", "()Z", "isEmpty", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "getOnReceiveCatching", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class AbstractChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.Channel<E> {

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0011\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Itr<E> implements kotlinx.coroutines.channels.ChannelIterator<E> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.channels.AbstractChannel<E> channel;

        @org.jetbrains.annotations.Nullable
        private java.lang.Object result;

        public Itr(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.AbstractChannel<E> r1) {
                r0 = this;
                r0.<init>()
                r0.channel = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                r0.result = r1
                return
        }

        public static final /* synthetic */ java.lang.Object access$hasNextSuspend(kotlinx.coroutines.channels.AbstractChannel.Itr r0, kotlin.coroutines.Continuation r1) {
                java.lang.Object r0 = r0.hasNextSuspend(r1)
                return r0
        }

        private final boolean hasNextResult(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L15
                kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
                java.lang.Throwable r0 = r2.closeCause
                if (r0 != 0) goto Lc
                r2 = 0
                return r2
            Lc:
                java.lang.Throwable r2 = r2.getReceiveException()
                java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r2)
                throw r2
            L15:
                r2 = 1
                return r2
        }

        private final java.lang.Object hasNextSuspend(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
                r5 = this;
                kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
                kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
                kotlinx.coroutines.channels.AbstractChannel$ReceiveHasNext r1 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveHasNext
                r1.<init>(r5, r0)
            Ld:
                kotlinx.coroutines.channels.AbstractChannel<E> r2 = r5.channel
                boolean r2 = kotlinx.coroutines.channels.AbstractChannel.access$enqueueReceive(r2, r1)
                if (r2 == 0) goto L1b
                kotlinx.coroutines.channels.AbstractChannel<E> r2 = r5.channel
                kotlinx.coroutines.channels.AbstractChannel.access$removeReceiveOnCancel(r2, r0, r1)
                goto L6b
            L1b:
                kotlinx.coroutines.channels.AbstractChannel<E> r2 = r5.channel
                java.lang.Object r2 = r2.pollInternal()
                r5.setResult(r2)
                boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r3 == 0) goto L4f
                kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
                java.lang.Throwable r1 = r2.closeCause
                if (r1 != 0) goto L3d
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
                r0.resumeWith(r1)
                goto L6b
            L3d:
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Throwable r1 = r2.getReceiveException()
                java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
                java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
                r0.resumeWith(r1)
                goto L6b
            L4f:
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r2 == r3) goto Ld
                r1 = 1
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                kotlinx.coroutines.channels.AbstractChannel<E> r3 = r5.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r3 = r3.onUndeliveredElement
                if (r3 != 0) goto L60
                r2 = 0
                goto L68
            L60:
                kotlin.coroutines.CoroutineContext r4 = r0.getContext()
                kotlin.jvm.functions.Function1 r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r3, r2, r4)
            L68:
                r0.resume(r1, r2)
            L6b:
                java.lang.Object r0 = r0.getResult()
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto L78
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
            L78:
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getResult() {
                r1 = this;
                java.lang.Object r0 = r1.result
                return r0
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @org.jetbrains.annotations.Nullable
        public java.lang.Object hasNext(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r2 = this;
                java.lang.Object r0 = r2.getResult()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto L15
                java.lang.Object r3 = r2.getResult()
                boolean r3 = r2.hasNextResult(r3)
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r3
            L15:
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r2.channel
                java.lang.Object r0 = r0.pollInternal()
                r2.setResult(r0)
                java.lang.Object r0 = r2.getResult()
                if (r0 == r1) goto L31
                java.lang.Object r3 = r2.getResult()
                boolean r3 = r2.hasNextResult(r3)
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r3
            L31:
                java.lang.Object r3 = r2.hasNextSuspend(r3)
                return r3
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
                r2 = this;
                java.lang.Object r0 = r2.result
                boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
                if (r1 != 0) goto L15
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto Ld
                r2.result = r1
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "'hasNext' should be called prior to 'next' invocation"
                r0.<init>(r1)
                throw r0
            L15:
                kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
                java.lang.Throwable r0 = r0.getReceiveException()
                java.lang.Throwable r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r0)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @kotlin.jvm.JvmName(name = "next")
        public /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation r1) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(r0, r1)
                return r1
        }

        public final void setResult(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                r0.result = r1
                return
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class ReceiveElement<E> extends kotlinx.coroutines.channels.Receive<E> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.CancellableContinuation<java.lang.Object> cont;

        @kotlin.jvm.JvmField
        public final int receiveMode;

        public ReceiveElement(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.cont = r1
                r0.receiveMode = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r2 = r1.cont
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r2.completeResume(r0)
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r3) {
                r2 = this;
                int r0 = r2.receiveMode
                r1 = 1
                if (r0 != r1) goto L1d
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r2.cont
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r3 = r3.closeCause
                java.lang.Object r3 = r1.m1839closedJP2dKIU(r3)
                kotlinx.coroutines.channels.ChannelResult r3 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r3)
                java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
                r0.resumeWith(r3)
                goto L30
            L1d:
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r2.cont
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Throwable r3 = r3.getReceiveException()
                java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
                java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
                r0.resumeWith(r3)
            L30:
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object resumeValue(E r3) {
                r2 = this;
                int r0 = r2.receiveMode
                r1 = 1
                if (r0 != r1) goto Lf
                kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Object r3 = r0.m1841successJP2dKIU(r3)
                kotlinx.coroutines.channels.ChannelResult r3 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r3)
            Lf:
                return r3
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "ReceiveElement@"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r3)
                r0.append(r1)
                java.lang.String r1 = "[receiveMode="
                r0.append(r1)
                int r1 = r3.receiveMode
                r2 = 93
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r5, @org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r6) {
                r4 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r4.cont
                java.lang.Object r1 = r4.resumeValue(r5)
                r2 = 0
                if (r6 != 0) goto Lb
                r3 = r2
                goto Ld
            Lb:
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r3 = r6.desc
            Ld:
                kotlin.jvm.functions.Function1 r5 = r4.resumeOnCancellationFun(r5)
                java.lang.Object r5 = r0.tryResume(r1, r3, r5)
                if (r5 != 0) goto L18
                return r2
            L18:
                if (r6 != 0) goto L1b
                goto L1e
            L1b:
                r6.finishPrepare()
            L1e:
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                return r5
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ReceiveElementWithUndeliveredHandler<E> extends kotlinx.coroutines.channels.AbstractChannel.ReceiveElement<E> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;

        public ReceiveElementWithUndeliveredHandler(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.onUndeliveredElement = r3
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        @org.jetbrains.annotations.Nullable
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r2.onUndeliveredElement
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1 = r2.cont
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
                return r3
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class ReceiveHasNext<E> extends kotlinx.coroutines.channels.Receive<E> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.channels.AbstractChannel.Itr<E> iterator;

        public ReceiveHasNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.AbstractChannel.Itr<E> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> r2) {
                r0 = this;
                r0.<init>()
                r0.iterator = r1
                r0.cont = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r2) {
                r1 = this;
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r0 = r1.iterator
                r0.setResult(r2)
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r2 = r1.cont
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r2.completeResume(r0)
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        @org.jetbrains.annotations.Nullable
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r0 = r2.iterator
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r0.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 != 0) goto La
                r3 = 0
                goto L14
            La:
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r1 = r2.cont
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
            L14:
                return r3
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r5) {
                r4 = this;
                java.lang.Throwable r0 = r5.closeCause
                if (r0 != 0) goto Lf
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r2 = 2
                r3 = 0
                java.lang.Object r0 = kotlinx.coroutines.CancellableContinuation.DefaultImpls.tryResume$default(r0, r1, r3, r2, r3)
                goto L19
            Lf:
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                java.lang.Throwable r1 = r5.getReceiveException()
                java.lang.Object r0 = r0.tryResumeWithException(r1)
            L19:
                if (r0 == 0) goto L25
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r1 = r4.iterator
                r1.setResult(r5)
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r5 = r4.cont
                r5.completeResume(r0)
            L25:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.String r1 = "ReceiveHasNext@"
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r5, @org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r6) {
                r4 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r2 = 0
                if (r6 != 0) goto L9
                r3 = r2
                goto Lb
            L9:
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r3 = r6.desc
            Lb:
                kotlin.jvm.functions.Function1 r5 = r4.resumeOnCancellationFun(r5)
                java.lang.Object r5 = r0.tryResume(r1, r3, r5)
                if (r5 != 0) goto L16
                return r2
            L16:
                if (r6 != 0) goto L19
                goto L1c
            L19:
                r6.finishPrepare()
            L1c:
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                return r5
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BR\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00028\u00022\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#R3\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "dispose", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ReceiveSelect<R, E> extends kotlinx.coroutines.channels.Receive<E> implements kotlinx.coroutines.DisposableHandle {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.channels.AbstractChannel<E> channel;

        @kotlin.jvm.JvmField
        public final int receiveMode;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        public ReceiveSelect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.AbstractChannel<E> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<? super R> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.channel = r1
                r0.select = r2
                r0.block = r3
                r0.receiveMode = r4
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r4) {
                r3 = this;
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r3.block
                int r1 = r3.receiveMode
                r2 = 1
                if (r1 != r2) goto L12
                kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Object r1 = r1.m1841successJP2dKIU(r4)
                kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r1)
                goto L13
            L12:
                r1 = r4
            L13:
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r3.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlin.jvm.functions.Function1 r4 = r3.resumeOnCancellationFun(r4)
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1, r2, r4)
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                boolean r0 = r1.mo1865remove()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r1.channel
                java.util.Objects.requireNonNull(r0)
            Lb:
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        @org.jetbrains.annotations.Nullable
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r2.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 != 0) goto L8
                r3 = 0
                goto L16
            L8:
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                kotlin.coroutines.Continuation r1 = r1.getCompletion()
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
            L16:
                return r3
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r9) {
                r8 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r8.select
                boolean r0 = r0.trySelect()
                if (r0 != 0) goto L9
                return
            L9:
                int r0 = r8.receiveMode
                if (r0 == 0) goto L2c
                r1 = 1
                if (r0 == r1) goto L11
                goto L35
            L11:
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r8.block
                kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r9 = r9.closeCause
                java.lang.Object r9 = r0.m1839closedJP2dKIU(r9)
                kotlinx.coroutines.channels.ChannelResult r3 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r9)
                kotlinx.coroutines.selects.SelectInstance<R> r9 = r8.select
                kotlin.coroutines.Continuation r4 = r9.getCompletion()
                r5 = 0
                r6 = 4
                r7 = 0
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r2, r3, r4, r5, r6, r7)
                goto L35
            L2c:
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r8.select
                java.lang.Throwable r9 = r9.getReceiveException()
                r0.resumeSelectWithException(r9)
            L35:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "ReceiveSelect@"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r3)
                r0.append(r1)
                r1 = 91
                r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r3.select
                r0.append(r1)
                java.lang.String r1 = ",receiveMode="
                r0.append(r1)
                int r1 = r3.receiveMode
                r2 = 93
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r0 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r0.select
                java.lang.Object r1 = r1.trySelectOther(r2)
                kotlinx.coroutines.internal.Symbol r1 = (kotlinx.coroutines.internal.Symbol) r1
                return r1
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class RemoveReceiveOnCancel extends kotlinx.coroutines.BeforeResumeCancelHandler {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.channels.Receive<?> receive;
        public final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel<E> this$0;

        public RemoveReceiveOnCancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.AbstractChannel r1, kotlinx.coroutines.channels.Receive<?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.receive = r2
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
                kotlinx.coroutines.channels.Receive<?> r1 = r0.receive
                boolean r1 = r1.mo1865remove()
                if (r1 == 0) goto Ld
                kotlinx.coroutines.channels.AbstractChannel<E> r1 = r0.this$0
                java.util.Objects.requireNonNull(r1)
            Ld:
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "RemoveReceiveOnCancel["
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                kotlinx.coroutines.channels.Receive<?> r1 = r2.receive
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "", "onPrepare", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affected", "", "onRemoved", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class TryPollDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.Send> {
        public TryPollDesc(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListHead r1) {
                r0 = this;
                r0.<init>(r1)
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
                boolean r2 = r2 instanceof kotlinx.coroutines.channels.Send
                if (r2 != 0) goto Lc
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @org.jetbrains.annotations.Nullable
        public java.lang.Object onPrepare(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.affected
                kotlinx.coroutines.channels.Send r0 = (kotlinx.coroutines.channels.Send) r0
                kotlinx.coroutines.internal.Symbol r2 = r0.tryResumeSend(r2)
                if (r2 != 0) goto Ld
                java.lang.Object r2 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r2
            Ld:
                java.lang.Object r0 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                if (r2 != r0) goto L12
                return r0
            L12:
                r2 = 0
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void onRemoved(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
                r1.undeliveredElement()
                return
        }
    }

    public AbstractChannel(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ boolean access$enqueueReceive(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.channels.Receive r1) {
            boolean r0 = r0.enqueueReceive(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$receiveSuspend(kotlinx.coroutines.channels.AbstractChannel r0, int r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.receiveSuspend(r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$registerSelectReceiveMode(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.selects.SelectInstance r1, int r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectReceiveMode(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$removeReceiveOnCancel(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.CancellableContinuation r1, kotlinx.coroutines.channels.Receive r2) {
            r0.removeReceiveOnCancel(r1, r2)
            return
    }

    private final boolean enqueueReceive(kotlinx.coroutines.channels.Receive<? super E> r1) {
            r0 = this;
            boolean r1 = r0.enqueueReceiveInternal(r1)
            return r1
    }

    private final <R> boolean enqueueReceiveSelect(kotlinx.coroutines.selects.SelectInstance<? super R> r2, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, int r4) {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$ReceiveSelect r0 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveSelect
            r0.<init>(r1, r2, r3, r4)
            boolean r3 = r1.enqueueReceive(r0)
            if (r3 == 0) goto Le
            r2.disposeOnSelect(r0)
        Le:
            return r3
    }

    private final <R> java.lang.Object receiveSuspend(int r4, kotlin.coroutines.Continuation<? super R> r5) {
            r3 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r3.onUndeliveredElement
            if (r1 != 0) goto L12
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElement r1 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElement
            r1.<init>(r0, r4)
            goto L19
        L12:
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler r1 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r3.onUndeliveredElement
            r1.<init>(r0, r4, r2)
        L19:
            boolean r4 = access$enqueueReceive(r3, r1)
            if (r4 == 0) goto L23
            access$removeReceiveOnCancel(r3, r0, r1)
            goto L40
        L23:
            java.lang.Object r4 = r3.pollInternal()
            boolean r2 = r4 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L31
            kotlinx.coroutines.channels.Closed r4 = (kotlinx.coroutines.channels.Closed) r4
            r1.resumeReceiveClosed(r4)
            goto L40
        L31:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r4 == r2) goto L19
            java.lang.Object r2 = r1.resumeValue(r4)
            kotlin.jvm.functions.Function1 r4 = r1.resumeOnCancellationFun(r4)
            r0.resume(r2, r4)
        L40:
            java.lang.Object r4 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r0) goto L4d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L4d:
            return r4
    }

    private final <R> void registerSelectReceiveMode(kotlinx.coroutines.selects.SelectInstance<? super R> r3, int r4, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.isEmptyImpl()
            if (r0 == 0) goto L14
            boolean r0 = r2.enqueueReceiveSelect(r3, r5, r4)
            if (r0 == 0) goto L0
            return
        L14:
            java.lang.Object r0 = r2.pollSelectInternal(r3)
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L1f
            return
        L1f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 != r1) goto L24
            goto L0
        L24:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L29
            goto L0
        L29:
            r2.tryStartBlockUnintercepted(r5, r3, r4, r0)
            goto L0
    }

    private final void removeReceiveOnCancel(kotlinx.coroutines.CancellableContinuation<?> r2, kotlinx.coroutines.channels.Receive<?> r3) {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel r0 = new kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel
            r0.<init>(r1, r3)
            r2.invokeOnCancellation(r0)
            return
    }

    private final <R> void tryStartBlockUnintercepted(kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, kotlinx.coroutines.selects.SelectInstance<? super R> r4, int r5, java.lang.Object r6) {
            r2 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.Closed
            r1 = 1
            if (r0 == 0) goto L32
            if (r5 == 0) goto L27
            if (r5 == r1) goto La
            goto L58
        La:
            boolean r5 = r4.trySelect()
            if (r5 != 0) goto L11
            return
        L11:
            kotlinx.coroutines.channels.ChannelResult$Companion r5 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r6 = (kotlinx.coroutines.channels.Closed) r6
            java.lang.Throwable r6 = r6.closeCause
            java.lang.Object r5 = r5.m1839closedJP2dKIU(r6)
            kotlinx.coroutines.channels.ChannelResult r5 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r5)
            kotlin.coroutines.Continuation r4 = r4.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r3, r5, r4)
            goto L58
        L27:
            kotlinx.coroutines.channels.Closed r6 = (kotlinx.coroutines.channels.Closed) r6
            java.lang.Throwable r3 = r6.getReceiveException()
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r3)
            throw r3
        L32:
            if (r5 != r1) goto L51
            kotlinx.coroutines.channels.ChannelResult$Companion r5 = kotlinx.coroutines.channels.ChannelResult.Companion
            if (r0 == 0) goto L41
            kotlinx.coroutines.channels.Closed r6 = (kotlinx.coroutines.channels.Closed) r6
            java.lang.Throwable r6 = r6.closeCause
            java.lang.Object r5 = r5.m1839closedJP2dKIU(r6)
            goto L45
        L41:
            java.lang.Object r5 = r5.m1841successJP2dKIU(r6)
        L45:
            kotlinx.coroutines.channels.ChannelResult r5 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r5)
            kotlin.coroutines.Continuation r4 = r4.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r3, r5, r4)
            goto L58
        L51:
            kotlin.coroutines.Continuation r4 = r4.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r3, r6, r4)
        L58:
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.channels.Channel.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            r2 = this;
            boolean r0 = r2.isClosedForReceive()
            if (r0 == 0) goto L7
            return
        L7:
            if (r3 != 0) goto L18
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.String r1 = " was cancelled"
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            r3.<init>(r0)
        L18:
            r2.cancelInternal$kotlinx_coroutines_core(r3)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.cancelInternal$kotlinx_coroutines_core(r1)
            return r1
    }

    public final boolean cancelInternal$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.close(r1)
            r0.onCancelIdempotent(r1)
            return r1
    }

    public boolean enqueueReceiveInternal(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Receive<? super E> r7) {
            r6 = this;
            boolean r0 = r6.isBufferAlwaysEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1d
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r6.getQueue()
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r0.getPrevNode()
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.Send
            r4 = r4 ^ r2
            if (r4 != 0) goto L16
            goto L3b
        L16:
            boolean r3 = r3.addNext(r7, r0)
            if (r3 == 0) goto Lc
            goto L3a
        L1d:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r6.getQueue()
            kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1 r3 = new kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1
            r3.<init>(r7, r6)
        L26:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r0.getPrevNode()
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.Send
            r5 = r5 ^ r2
            if (r5 != 0) goto L30
            goto L3b
        L30:
            int r4 = r4.tryCondAddNext(r7, r0, r3)
            if (r4 == r2) goto L3a
            r5 = 2
            if (r4 == r5) goto L3b
            goto L26
        L3a:
            r1 = 1
        L3b:
            return r1
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$onReceive$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$onReceive$1
            r0.<init>(r1)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$onReceiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$onReceiveCatching$1
            r0.<init>(r1)
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
            r1 = this;
            kotlinx.coroutines.selects.SelectClause1 r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.getOnReceiveOrNull(r1)
            return r0
    }

    public abstract boolean isBufferAlwaysEmpty();

    public abstract boolean isBufferEmpty();

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r1 = this;
            kotlinx.coroutines.channels.Closed r0 = r1.getClosedForReceive()
            if (r0 == 0) goto Le
            boolean r0 = r1.isBufferEmpty()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = r1.isEmptyImpl()
            return r0
    }

    public final boolean isEmptyImpl() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.Send
            if (r0 != 0) goto L14
            boolean r0 = r1.isBufferEmpty()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$Itr r0 = new kotlinx.coroutines.channels.AbstractChannel$Itr
            r0.<init>(r1)
            return r0
    }

    public void onCancelIdempotent(boolean r4) {
            r3 = this;
            kotlinx.coroutines.channels.Closed r4 = r3.getClosedForSend()
            if (r4 == 0) goto L29
            r0 = 1
            r1 = 0
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m1857constructorimpl$default(r1, r0, r1)
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.getPrevNode()
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.LockFreeLinkedListHead
            if (r2 == 0) goto L18
            r3.mo1818onCancelIdempotentListww6eGU(r0, r4)
            return
        L18:
            boolean r2 = r1.mo1865remove()
            if (r2 != 0) goto L22
            r1.helpRemove()
            goto Lc
        L22:
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m1862plusFjFbRPM(r0, r1)
            goto Lc
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: onCancelIdempotentList-w-w6eGU, reason: not valid java name */
    public void mo1818onCancelIdempotentListww6eGU(@org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r4) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L27
        L3:
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 != 0) goto Ld
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            r3.resumeSendClosed(r4)
            goto L27
        Ld:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L27
        L17:
            int r1 = r0 + (-1)
            java.lang.Object r0 = r3.get(r0)
            kotlinx.coroutines.channels.Send r0 = (kotlinx.coroutines.channels.Send) r0
            r0.resumeSendClosed(r4)
            if (r1 >= 0) goto L25
            goto L27
        L25:
            r0 = r1
            goto L17
        L27:
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @org.jetbrains.annotations.Nullable
    public E poll() {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.poll(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object pollInternal() {
            r2 = this;
        L0:
            kotlinx.coroutines.channels.Send r0 = r2.takeFirstSendOrPeekClosed()
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            return r0
        L9:
            r1 = 0
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeSend(r1)
            if (r1 == 0) goto L18
            r0.completeResumeSend()
            java.lang.Object r0 = r0.getPollResult()
            return r0
        L18:
            r0.undeliveredElement()
            goto L0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object pollSelectInternal(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r0 = new kotlinx.coroutines.channels.AbstractChannel$TryPollDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.getQueue()
            r0.<init>(r1)
            java.lang.Object r3 = r3.performAtomicTrySelect(r0)
            if (r3 == 0) goto L10
            return r3
        L10:
            java.lang.Object r3 = r0.getResult()
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            r3.completeResumeSend()
            java.lang.Object r3 = r0.getResult()
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            java.lang.Object r3 = r3.getPollResult()
            return r3
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object receive(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super E> r3) {
            r2 = this;
            java.lang.Object r0 = r2.pollInternal()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 == r1) goto Ld
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 != 0) goto Ld
            return r0
        Ld:
            r0 = 0
            java.lang.Object r3 = r2.receiveSuspend(r0, r3)
            return r3
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public final java.lang.Object mo1819receiveCatchingJP2dKIU(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.pollInternal()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L4b
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r5 = (kotlinx.coroutines.channels.Closed) r5
            java.lang.Throwable r5 = r5.closeCause
            java.lang.Object r5 = r0.m1839closedJP2dKIU(r5)
            goto L51
        L4b:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r5 = r0.m1841successJP2dKIU(r5)
        L51:
            return r5
        L52:
            r0.label = r3
            java.lang.Object r5 = r4.receiveSuspend(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.m1838unboximpl()
            return r5
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @org.jetbrains.annotations.Nullable
    public java.lang.Object receiveOrNull(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super E> r1) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.channels.Channel.DefaultImpls.receiveOrNull(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
            r2 = this;
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = super.takeFirstReceiveOrPeekClosed()
            if (r0 == 0) goto L8
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
        L8:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public final java.lang.Object mo1820tryReceivePtdJZtk() {
            r2 = this;
            java.lang.Object r0 = r2.pollInternal()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 != r1) goto Lf
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m1840failurePtdJZtk()
            return r0
        Lf:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L1e
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            java.lang.Throwable r0 = r0.closeCause
            java.lang.Object r0 = r1.m1839closedJP2dKIU(r0)
            return r0
        L1e:
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r1.m1841successJP2dKIU(r0)
            return r0
    }
}
