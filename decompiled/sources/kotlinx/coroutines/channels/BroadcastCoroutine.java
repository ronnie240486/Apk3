package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u0010.\u001a\u00020-\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010/\u001a\u00020\u000e¢\u0006\u0004\b0\u00101J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0097\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u0019\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%0$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "handler", "invokeOnClose", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "close", "_channel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "get_channel", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "isActive", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "channel", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/BroadcastChannel;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
class BroadcastCoroutine<E> extends kotlinx.coroutines.AbstractCoroutine<kotlin.Unit> implements kotlinx.coroutines.channels.ProducerScope<E>, kotlinx.coroutines.channels.BroadcastChannel<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.BroadcastChannel<E> _channel;

    public BroadcastCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BroadcastChannel<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r4)
            r1._channel = r3
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r1.initParentJob(r2)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            r3 = 0
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = kotlinx.coroutines.JobSupport.access$cancellationExceptionMessage(r2)
            r0.<init>(r1, r3, r2)
            r3 = r0
        Ld:
            r2.cancelInternal(r3)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            r3 = 0
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = kotlinx.coroutines.JobSupport.access$cancellationExceptionMessage(r2)
            r0.<init>(r1, r3, r2)
            r3 = r0
        Ld:
            r2.cancelInternal(r3)
            r3 = 1
            return r3
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.CancellationException r3 = kotlinx.coroutines.JobSupport.toCancellationException$default(r2, r3, r0, r1, r0)
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r2._channel
            r0.cancel(r3)
            r2.cancelCoroutine(r3)
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            boolean r2 = r0.close(r2)
            r1.start()
            return r2
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.SendChannel<E> getChannel() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            kotlinx.coroutines.selects.SelectClause2 r0 = r0.getOnSend()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.BroadcastChannel<E> get_channel() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public void invokeOnClose(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            r0.invokeOnClose(r2)
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            boolean r0 = r0.isClosedForSend()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, boolean r3) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            boolean r0 = r0.close(r2)
            if (r0 != 0) goto L11
            if (r3 != 0) goto L11
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r2)
        L11:
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(kotlin.Unit r3) {
            r2 = this;
            kotlin.Unit r3 = (kotlin.Unit) r3
            kotlinx.coroutines.channels.BroadcastChannel<E> r3 = r2._channel
            r0 = 0
            r1 = 1
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r3, r0, r1, r0)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.openSubscription()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @org.jetbrains.annotations.Nullable
    public java.lang.Object send(E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            java.lang.Object r2 = r0.send(r2, r3)
            return r2
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo1821trySendJP2dKIU(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel<E> r0 = r1._channel
            java.lang.Object r2 = r0.mo1821trySendJP2dKIU(r2)
            return r2
    }
}
