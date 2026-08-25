package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
public final class FlowKt__DelayKt$debounceInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_debounceInternal;
    public final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Long> $timeoutMillisSelector;
    private /* synthetic */ java.lang.Object L$0;
    public /* synthetic */ java.lang.Object L$1;
    public kotlin.jvm.internal.Ref.ObjectRef L$2;
    public kotlin.jvm.internal.Ref.LongRef L$3;
    public int label;

    public FlowKt__DelayKt$debounceInternal$1(kotlin.jvm.functions.Function1<? super T, java.lang.Long> r1, kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1> r3) {
            r0 = this;
            r0.$timeoutMillisSelector = r1
            r0.$this_debounceInternal = r2
            r1 = 3
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r1 = r0.invoke(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r5, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1
            kotlin.jvm.functions.Function1<T, java.lang.Long> r1 = r3.$timeoutMillisSelector
            kotlinx.coroutines.flow.Flow<T> r2 = r3.$this_debounceInternal
            r0.<init>(r1, r2, r6)
            r0.L$0 = r4
            r0.L$1 = r5
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r0.invokeSuspend(r4)
            return r4
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            r17 = this;
            r1 = r17
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L28
            if (r2 != r3) goto L20
            kotlin.jvm.internal.Ref$ObjectRef r2 = r1.L$2
            java.lang.Object r6 = r1.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            kotlin.ResultKt.throwOnFailure(r18)
            r8 = r1
            goto L61
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L28:
            kotlin.jvm.internal.Ref$LongRef r2 = r1.L$3
            kotlin.jvm.internal.Ref$ObjectRef r6 = r1.L$2
            java.lang.Object r7 = r1.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            kotlin.ResultKt.throwOnFailure(r18)
            r9 = r8
            r8 = r1
            goto Lad
        L3b:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r1.L$0
            r6 = r2
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            java.lang.Object r2 = r1.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            r7 = 0
            r8 = 0
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.Flow<T> r10 = r1.$this_debounceInternal
            r9.<init>(r10, r5)
            r10 = 3
            r11 = 0
            kotlinx.coroutines.channels.ReceiveChannel r6 = kotlinx.coroutines.channels.ProduceKt.produce$default(r6, r7, r8, r9, r10, r11)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r8 = r1
            r16 = r7
            r7 = r2
            r2 = r16
        L61:
            T r9 = r2.element
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            if (r9 == r10) goto L10d
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            T r10 = r2.element
            if (r10 == 0) goto Lc1
            kotlin.jvm.functions.Function1<T, java.lang.Long> r11 = r8.$timeoutMillisSelector
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r10 != r12) goto L77
            r10 = r5
        L77:
            java.lang.Object r10 = r11.invoke(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            r9.element = r10
            r13 = 0
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L8b
            r10 = 1
            goto L8c
        L8b:
            r10 = 0
        L8c:
            if (r10 == 0) goto Lb5
            if (r15 != 0) goto Lc1
            T r10 = r2.element
            if (r10 != r12) goto L95
            r10 = r5
        L95:
            r8.L$0 = r7
            r8.L$1 = r6
            r8.L$2 = r2
            r8.L$3 = r9
            r8.label = r4
            java.lang.Object r10 = r7.emit(r10, r8)
            if (r10 != r0) goto La6
            return r0
        La6:
            r16 = r6
            r6 = r2
            r2 = r9
            r9 = r7
            r7 = r16
        Lad:
            r6.element = r5
            r16 = r2
            r2 = r0
            r0 = r16
            goto Lc9
        Lb5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Debounce timeout should not be negative"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        Lc1:
            r16 = r2
            r2 = r0
            r0 = r9
            r9 = r7
            r7 = r6
            r6 = r16
        Lc9:
            r8.L$0 = r9
            r8.L$1 = r7
            r8.L$2 = r6
            r8.L$3 = r0
            r8.label = r3
            kotlinx.coroutines.selects.SelectBuilderImpl r10 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r10.<init>(r8)
            T r11 = r6.element     // Catch: java.lang.Throwable -> Lf3
            if (r11 == 0) goto Le6
            long r11 = r0.element     // Catch: java.lang.Throwable -> Lf3
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1     // Catch: java.lang.Throwable -> Lf3
            r0.<init>(r9, r6, r5)     // Catch: java.lang.Throwable -> Lf3
            r10.onTimeout(r11, r0)     // Catch: java.lang.Throwable -> Lf3
        Le6:
            kotlinx.coroutines.selects.SelectClause1 r0 = r7.getOnReceiveCatching()     // Catch: java.lang.Throwable -> Lf3
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r11 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2     // Catch: java.lang.Throwable -> Lf3
            r11.<init>(r6, r9, r5)     // Catch: java.lang.Throwable -> Lf3
            r10.invoke(r0, r11)     // Catch: java.lang.Throwable -> Lf3
            goto Lf7
        Lf3:
            r0 = move-exception
            r10.handleBuilderException(r0)
        Lf7:
            java.lang.Object r0 = r10.getResult()
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r10) goto L104
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L104:
            if (r0 != r2) goto L107
            return r2
        L107:
            r0 = r2
            r2 = r6
            r6 = r7
            r7 = r9
            goto L61
        L10d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
