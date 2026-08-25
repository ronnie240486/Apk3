package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"actor", "Lkotlinx/coroutines/channels/SendChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ActorKt {
    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.SendChannel<E> actor(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ActorScope<E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r1, r2)
            r2 = 0
            r0 = 6
            kotlinx.coroutines.channels.Channel r2 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r3, r2, r2, r0, r2)
            boolean r3 = r4.isLazy()
            if (r3 == 0) goto L16
            kotlinx.coroutines.channels.LazyActorCoroutine r3 = new kotlinx.coroutines.channels.LazyActorCoroutine
            r3.<init>(r1, r2, r6)
            goto L1c
        L16:
            kotlinx.coroutines.channels.ActorCoroutine r3 = new kotlinx.coroutines.channels.ActorCoroutine
            r0 = 1
            r3.<init>(r1, r2, r0)
        L1c:
            if (r5 == 0) goto L21
            r3.invokeOnCompletion(r5)
        L21:
            r3.start(r4, r3, r6)
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.SendChannel actor$default(kotlinx.coroutines.CoroutineScope r6, kotlin.coroutines.CoroutineContext r7, int r8, kotlinx.coroutines.CoroutineStart r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function2 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Le
            r8 = 0
            r2 = 0
            goto Lf
        Le:
            r2 = r8
        Lf:
            r7 = r12 & 4
            if (r7 == 0) goto L15
            kotlinx.coroutines.CoroutineStart r9 = kotlinx.coroutines.CoroutineStart.DEFAULT
        L15:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            r10 = 0
        L1b:
            r4 = r10
            r0 = r6
            r5 = r11
            kotlinx.coroutines.channels.SendChannel r6 = actor(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
