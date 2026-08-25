package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aV\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000223\b\u0004\u0010\u0005\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\f\u001ak\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000eH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001aT\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000221\u0010\u0005\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022\u0006\u0010\u0019\u001a\u00020\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"collect", "", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectIndexed", "Lkotlin/Function3;", "", "index", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectLatest", "emitAll", "Lkotlinx/coroutines/flow/FlowCollector;", "flow", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIn", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CollectKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass3<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
        public final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;

        public AnonymousClass3(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.$action = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        public java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r1.$action
                java.lang.Object r2 = r0.invoke(r2, r3)
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r2 != r3) goto Ld
                return r2
            Ld:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Object emit$$forInline(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                r0 = 4
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
                r0.<init>(r1, r3)
                r0 = 5
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r1.$action
                r0.invoke(r2, r3)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", "index", "", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
        public final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;
        private int index;

        public AnonymousClass2(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.$action = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        public java.lang.Object emit(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r3 = this;
                kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r3.$action
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                if (r1 < 0) goto L1c
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
                java.lang.Object r4 = r0.invoke(r1, r4, r5)
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r4 != r5) goto L19
                return r4
            L19:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L1c:
                java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
                java.lang.String r5 = "Index overflow has happened"
                r4.<init>(r5)
                throw r4
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Object emit$$forInline(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r3 = this;
                r0 = 4
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
                r0.<init>(r3, r5)
                r0 = 5
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r3.$action
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                if (r1 < 0) goto L21
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.invoke(r1, r4, r5)
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L21:
                java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
                java.lang.String r5 = "Index overflow has happened"
                r4.<init>(r5)
                throw r4
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_launchIn;
        public int label;

        public AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CollectKt.AnonymousClass1> r2) {
                r0 = this;
                r0.$this_launchIn = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1 r2 = new kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1
                kotlinx.coroutines.flow.Flow<T> r0 = r1.$this_launchIn
                r2.<init>(r0, r3)
                return r2
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
                kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1 r1 = (kotlinx.coroutines.flow.FlowKt__CollectKt.AnonymousClass1) r1
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
                goto L25
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                kotlinx.coroutines.flow.Flow<T> r4 = r3.$this_launchIn
                r3.label = r2
                java.lang.Object r4 = kotlinx.coroutines.flow.FlowKt.collect(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<?> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            kotlinx.coroutines.flow.internal.NopCollector r0 = kotlinx.coroutines.flow.internal.NopCollector.INSTANCE
            java.lang.Object r1 = r1.collect(r0, r2)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Ld
            return r1
        Ld:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> java.lang.Object collect(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3
            r0.<init>(r2)
            java.lang.Object r1 = r1.collect(r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L10
            return r1
        L10:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> java.lang.Object collect$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3
            r0.<init>(r2)
            r2 = 0
            kotlin.jvm.internal.InlineMarker.mark(r2)
            r1.collect(r0, r3)
            r1 = 1
            kotlin.jvm.internal.InlineMarker.mark(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object collectIndexed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2
            r0.<init>(r2)
            java.lang.Object r1 = r1.collect(r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L10
            return r1
        L10:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final <T> java.lang.Object collectIndexed$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2
            r0.<init>(r2)
            r2 = 0
            kotlin.jvm.internal.InlineMarker.mark(r2)
            r1.collect(r0, r3)
            r1 = 1
            kotlin.jvm.internal.InlineMarker.mark(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object collectLatest(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.mapLatest(r2, r3)
            r3 = 0
            r0 = 0
            r1 = 2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.buffer$default(r2, r3, r0, r1, r0)
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.collect(r2, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L16
            return r2
        L16:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object emitAll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            kotlinx.coroutines.flow.FlowKt.ensureActive(r0)
            java.lang.Object r0 = r1.collect(r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Le
            return r0
        Le:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.Job launchIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r6, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r7) {
            kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1 r3 = new kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1
            r0 = 0
            r3.<init>(r6, r0)
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            r0 = r7
            kotlinx.coroutines.Job r6 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
