package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/LazyBroadcastCoroutine;", "E", "Lkotlinx/coroutines/channels/BroadcastCoroutine;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "Lkotlin/coroutines/Continuation;", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/BroadcastChannel;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
final class LazyBroadcastCoroutine<E> extends kotlinx.coroutines.channels.BroadcastCoroutine<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.Continuation<kotlin.Unit> continuation;

    public LazyBroadcastCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BroadcastChannel<E> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r4, r1, r1)
            r1.continuation = r2
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void onStart() {
            r1 = this;
            kotlin.coroutines.Continuation<kotlin.Unit> r0 = r1.continuation
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r1 = this;
            kotlinx.coroutines.channels.BroadcastChannel r0 = r1.get_channel()
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.openSubscription()
            r1.start()
            return r0
    }
}
