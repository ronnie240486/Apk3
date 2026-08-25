package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelLimitedFlowMerge$collectTo$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
    public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $flow;
    public int label;

    public ChannelLimitedFlowMerge$collectTo$2$1(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.internal.SendingCollector<T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1> r3) {
            r0 = this;
            r0.$flow = r1
            r0.$collector = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r3 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1
            kotlinx.coroutines.flow.Flow<T> r0 = r2.$flow
            kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r2.$collector
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r1 = (kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r4)
            goto L27
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlinx.coroutines.flow.Flow<T> r4 = r3.$flow
            kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r3.$collector
            r3.label = r2
            java.lang.Object r4 = r4.collect(r1, r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
