package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "isActive", "()Z", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/Channel;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
final class ProducerCoroutine<E> extends kotlinx.coroutines.channels.ChannelCoroutine<E> implements kotlinx.coroutines.channels.ProducerScope<E> {
    public ProducerCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Channel<E> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public /* bridge */ /* synthetic */ kotlinx.coroutines.channels.SendChannel getChannel() {
            r1 = this;
            kotlinx.coroutines.channels.Channel r0 = r1.getChannel()
            return r0
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, boolean r3) {
            r1 = this;
            kotlinx.coroutines.channels.Channel r0 = r1.get_channel()
            boolean r0 = r0.close(r2)
            if (r0 != 0) goto L13
            if (r3 != 0) goto L13
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r2)
        L13:
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(kotlin.Unit r3) {
            r2 = this;
            kotlin.Unit r3 = (kotlin.Unit) r3
            kotlinx.coroutines.channels.Channel r3 = r2.get_channel()
            r0 = 0
            r1 = 1
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r3, r0, r1, r0)
            return
    }
}
