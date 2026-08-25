package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/channels/ActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/Channel;", "channel", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
class ActorCoroutine<E> extends kotlinx.coroutines.channels.ChannelCoroutine<E> implements kotlinx.coroutines.channels.ActorScope<E> {
    public ActorCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Channel<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r1.initParentJob(r2)
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean handleJobException(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r2)
            r2 = 1
            return r2
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void onCancelling(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r3 = this;
            kotlinx.coroutines.channels.Channel r0 = r3.get_channel()
            r1 = 0
            if (r4 != 0) goto L8
            goto L20
        L8:
            boolean r2 = r4 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto Lf
            r1 = r4
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        Lf:
            if (r1 != 0) goto L20
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r3)
            java.lang.String r2 = " was cancelled"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            java.util.concurrent.CancellationException r4 = kotlinx.coroutines.ExceptionsKt.CancellationException(r1, r4)
            r1 = r4
        L20:
            r0.cancel(r1)
            return
    }
}
