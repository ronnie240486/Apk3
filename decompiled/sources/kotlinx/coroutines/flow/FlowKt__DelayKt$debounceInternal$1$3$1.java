package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $downstream;
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    public int label;

    public FlowKt__DelayKt$debounceInternal$1$3$1(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1> r3) {
            r0 = this;
            r0.$downstream = r1
            r0.$lastValue = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1
            kotlinx.coroutines.flow.FlowCollector<T> r1 = r3.$downstream
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r3.$lastValue
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.invoke2(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            kotlin.coroutines.Continuation r2 = r1.create(r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r2 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1) r2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2f
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.FlowCollector<T> r6 = r5.$downstream
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r5.$lastValue
            T r4 = r4.element
            if (r4 != r1) goto L26
            r4 = r2
        L26:
            r5.label = r3
            java.lang.Object r6 = r6.emit(r4, r5)
            if (r6 != r0) goto L2f
            return r0
        L2f:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.$lastValue
            r6.element = r2
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
