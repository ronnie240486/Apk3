package kotlinx.coroutines.channels;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class ChannelsKt {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.any(r0, r1)
            return r0
    }

    @kotlin.PublishedApi
    public static final void cancelConsumed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<?> r0, @org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.cancelConsumed(r0, r1)
            return
    }

    @kotlinx.coroutines.ObsoleteCoroutinesApi
    public static final <E, R> R consume(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BroadcastChannel<E> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consume(r0, r1)
            return r0
    }

    public static final <E, R> R consume(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consume(r0, r1)
            return r0
    }

    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object consumeEach(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BroadcastChannel<E> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object consumeEach(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(r0, r1, r2)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<?> r0) {
            kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumes(r0)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<?>... r0) {
            kotlin.jvm.functions.Function1 r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumesAll(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinct(kotlinx.coroutines.channels.ReceiveChannel r0) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.distinct(r0)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.distinctBy(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinctBy$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.distinctBy$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.drop(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.drop$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.dropWhile(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.dropWhile$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(r0, r1, r2)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filter(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filter$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filter$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterIndexed(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterIndexed$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNot(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNot$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r0, java.util.Collection r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r0, kotlinx.coroutines.channels.SendChannel r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.first(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.firstOrNull(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.flatMap(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.flatMap$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(r0, r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.map(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel map$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.map$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexed(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexed$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexed$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexedNotNull(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function3 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapIndexedNotNull$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapNotNull(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.mapNotNull$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r0, java.util.Comparator r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r0, java.util.Comparator r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.none(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.selects.SelectClause1<E> onReceiveOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0) {
            kotlinx.coroutines.selects.SelectClause1 r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object receiveOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super E> r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel requireNoNulls(kotlinx.coroutines.channels.ReceiveChannel r0) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.requireNoNulls(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @kotlin.ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void sendBlocking(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.SendChannel<? super E> r0, E r1) {
            kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.sendBlocking(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.single(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.singleOrNull(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.take(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlin.coroutines.CoroutineContext r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.take$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.takeWhile(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.takeWhile$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull C r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(r0, r1, r2)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull C r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object toList(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toList(r0, r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r0, @org.jetbrains.annotations.NotNull M r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super M> r2) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toMutableList(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMutableList(r0, r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object toMutableSet(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Set<E>> r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMutableSet(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object toSet(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toSet(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.lang.Object trySendBlocking(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.SendChannel<? super E> r0, E r1) {
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.trySendBlocking(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.withIndex(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlin.coroutines.CoroutineContext r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.withIndex$default(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip(kotlinx.coroutines.channels.ReceiveChannel r0, kotlinx.coroutines.channels.ReceiveChannel r1) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.zip(r0, r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends R> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.zip(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip$default(kotlinx.coroutines.channels.ReceiveChannel r0, kotlinx.coroutines.channels.ReceiveChannel r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.zip$default(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
