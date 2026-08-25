package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class FlowKt {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> asFlow(@org.jetbrains.annotations.NotNull kotlin.ranges.IntRange r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<java.lang.Long> asFlow(@org.jetbrains.annotations.NotNull kotlin.ranges.LongRange r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BroadcastChannel<T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> asFlow(@org.jetbrains.annotations.NotNull int[] r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<java.lang.Long> asFlow(@org.jetbrains.annotations.NotNull long[] r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull T[] r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.asFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> asSharedFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.MutableSharedFlow<T> r0) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.asSharedFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.StateFlow<T> asStateFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.MutableStateFlow<T> r0) {
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.asStateFlow(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.Flow buffer(kotlinx.coroutines.flow.Flow r0, int r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> buffer(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, kotlinx.coroutines.channels.BufferOverflow r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> cache(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.cache(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> callbackFlow(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.callbackFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.cancellable(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1844catch(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.m1851catch(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object catchImpl(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Throwable> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> channelFlow(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.channelFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<?> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collect(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> java.lang.Object collect(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collect(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object collectIndexed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collectIndexed(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object collectLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object collectWhile(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combine(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combine(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combine(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combine(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T5> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combine(kotlinx.coroutines.flow.Flow<? extends T>[] r0, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combine(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T5> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.combineLatest(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> combineTransform(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.Flow<R> combineTransform(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.Flow<R> combineTransform(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.Flow<R> combineTransform(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T5> r4, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function7<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.Flow<R> combineTransform(kotlinx.coroutines.flow.Flow<? extends T>[] r0, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.combineTransform(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.ReplaceWith(expression = "let(transformer)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> compose(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.flow.Flow<? extends T>, ? extends kotlinx.coroutines.flow.Flow<? extends R>> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.compose(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> concatMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlinx.coroutines.flow.Flow<? extends R>> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.concatMap(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.concatWith(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> concatWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.concatWith(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.conflate(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.consumeAsFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object count(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CountKt.count(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object count(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CountKt.count(r0, r1, r2)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.debounce(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.OverloadResolutionByLambdaReturnType
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Long> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.debounce(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1845debounceHG0u8IE(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.m1847debounceHG0u8IE(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.jvm.JvmName(name = "debounceDuration")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.debounceDuration(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayEach(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.delayEach(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> delayFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.delayFlow(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.distinctUntilChanged(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.distinctUntilChanged(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> kotlinx.coroutines.flow.Flow<T> distinctUntilChangedBy(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DistinctKt.distinctUntilChangedBy(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> drop(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.drop(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> dropWhile(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.dropWhile(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object emitAll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAll(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object emitAll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.emitAll(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> emptyFlow() {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.emptyFlow()
            return r0
    }

    public static final void ensureActive(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<?> r0) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt.ensureActive(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> filter(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filter(r0, r1)
            return r0
    }

    public static final /* synthetic */ <R> kotlinx.coroutines.flow.Flow<R> filterIsInstance(kotlinx.coroutines.flow.Flow<?> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filterIsInstance(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> filterNot(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filterNot(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> filterNotNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.filterNotNull(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object first(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.first(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object first(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.first(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object firstOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.firstOrNull(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object firstOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.firstOrNull(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r0, long r1, long r3) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.fixedPeriodTicker(r0, r1, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel fixedPeriodTicker$default(kotlinx.coroutines.CoroutineScope r0, long r1, long r3, int r5, java.lang.Object r6) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.fixedPeriodTicker$default(r0, r1, r3, r5, r6)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.flatMap(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapConcat(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapConcat(r0, r1)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapLatest(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapMerge(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapMerge(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flatMapMerge$default(kotlinx.coroutines.flow.Flow r0, int r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flatMapMerge$default(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flatten(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.flatten(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenConcat(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flattenConcat(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenMerge(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0, int r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flattenMerge(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flattenMerge$default(kotlinx.coroutines.flow.Flow r0, int r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.flattenMerge$default(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flow(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.flow(r0)
            return r0
    }

    @kotlin.jvm.JvmName(name = "flowCombine")
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombine(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.flowCombine(r0, r1, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "flowCombineTransform")
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> flowCombineTransform(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.flowCombineTransform(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOf(T r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.flowOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOf(@org.jetbrains.annotations.NotNull T... r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.flowOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ContextKt.flowOn(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, R> java.lang.Object fold(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.fold(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void forEach(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.forEach(r0, r1)
            return
    }

    public static final int getDEFAULT_CONCURRENCY() {
            int r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.getDEFAULT_CONCURRENCY()
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
            kotlinx.coroutines.flow.FlowKt__MergeKt.getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object last(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.last(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object lastOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.Job launchIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.launchIn(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> map(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.map(r0, r1)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.mapLatest(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapNotNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.mapNotNull(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.merge(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.merge(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T>... r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.merge(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void noImpl() {
            java.lang.Void r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.noImpl()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> observeOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.observeOn(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onCompletion(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.onCompletion(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onEach(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.onEach(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onEmpty(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.onEmpty(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResume(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorResume(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorResumeNext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorResumeNext(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorReturn(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onErrorReturn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, T r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorReturn(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow onErrorReturn$default(kotlinx.coroutines.flow.Flow r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.onErrorReturn$default(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> onStart(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.onStart(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> onSubscription(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.onSubscription(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1) {
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.produceIn(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.publish(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> publish(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.publish(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> publishOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.publishOn(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.receiveAsFlow(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> java.lang.Object reduce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super S> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.reduce(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.replay(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> replay(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.replay(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> retry(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry(r0, r1, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow retry$default(kotlinx.coroutines.flow.Flow r0, long r1, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.retry$default(r0, r1, r3, r4, r5)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> retryWhen(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.retryWhen(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> runningFold(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.runningFold(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> runningReduce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.runningReduce(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.sample(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1846sampleHG0u8IE(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__DelayKt.m1848sampleHG0u8IE(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> scan(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.scan(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> scanFold(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.scanFold(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> scanReduce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.scanReduce(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> shareIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingStarted r2, int r3) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.shareIn(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.SharedFlow shareIn$default(kotlinx.coroutines.flow.Flow r0, kotlinx.coroutines.CoroutineScope r1, kotlinx.coroutines.flow.SharingStarted r2, int r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.shareIn$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object single(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.single(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object singleOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.singleOrNull(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.ReplaceWith(expression = "drop(count)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> skip(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.skip(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.startWith(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> startWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.startWith(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object stateIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.stateIn(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.StateFlow<T> stateIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingStarted r2, T r3) {
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt__ShareKt.stateIn(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribe(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribe(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void subscribe(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribe(r0, r1, r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> subscribeOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.subscribeOn(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> switchMap(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.switchMap(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> take(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.take(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> takeWhile(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.takeWhile(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull C r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toCollection(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object toList(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.List<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toList(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object toList$default(kotlinx.coroutines.flow.Flow r0, java.util.List r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toList$default(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object toSet(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.Set<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toSet(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object toSet$default(kotlinx.coroutines.flow.Flow r0, java.util.Set r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectionKt.toSet$default(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transform(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.transform(r0, r1)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.transformLatest(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformWhile(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.transformWhile(r0, r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.Flow<R> unsafeTransform(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.unsafeTransform(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<kotlin.collections.IndexedValue<T>> withIndex(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.withIndex(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> zip(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.zip(r0, r1, r2)
            return r0
    }
}
