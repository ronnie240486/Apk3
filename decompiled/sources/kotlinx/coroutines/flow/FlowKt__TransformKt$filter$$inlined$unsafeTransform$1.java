package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 176)
public final class FlowKt__TransformKt$filter$$inlined$unsafeTransform$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    public final /* synthetic */ kotlin.jvm.functions.Function2 $predicate$inlined;
    public final /* synthetic */ kotlinx.coroutines.flow.Flow $this_unsafeTransform$inlined;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        public final /* synthetic */ kotlin.jvm.functions.Function2 $predicate$inlined;
        public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            public java.lang.Object L$0;
            public kotlinx.coroutines.flow.FlowCollector L$1;
            public int label;
            public /* synthetic */ java.lang.Object result;
            public final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2 this$0;

            public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2 r1, kotlin.coroutines.Continuation r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.result = r2
                    int r2 = r1.label
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.label = r2
                    kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2 r2 = r1.this$0
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector r1, kotlin.jvm.functions.Function2 r2) {
                r0 = this;
                r0.$this_unsafeFlow = r1
                r0.$predicate$inlined = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6a
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                kotlinx.coroutines.flow.FlowCollector r7 = r0.L$1
                java.lang.Object r2 = r0.L$0
                kotlin.ResultKt.throwOnFailure(r8)
                goto L54
            L3c:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                kotlin.jvm.functions.Function2 r2 = r6.$predicate$inlined
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r2 = r2.invoke(r7, r0)
                if (r2 != r1) goto L50
                return r1
            L50:
                r5 = r2
                r2 = r7
                r7 = r8
                r8 = r5
            L54:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6a
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L6a
                return r1
            L6a:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit$$forInline(java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r4) {
                r2 = this;
                r0 = 4
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1
                r0.<init>(r2, r4)
                r0 = 5
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowCollector r0 = r2.$this_unsafeFlow
                kotlin.jvm.functions.Function2 r1 = r2.$predicate$inlined
                java.lang.Object r1 = r1.invoke(r3, r4)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L28
                r1 = 0
                kotlin.jvm.internal.InlineMarker.mark(r1)
                r0.emit(r3, r4)
                r3 = 1
                kotlin.jvm.internal.InlineMarker.mark(r3)
            L28:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
        }
    }

    public FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function2 r2) {
            r0 = this;
            r0.$this_unsafeTransform$inlined = r1
            r0.$predicate$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
            r3 = this;
            kotlinx.coroutines.flow.Flow r0 = r3.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r2 = r3.$predicate$inlined
            r1.<init>(r4, r2)
            java.lang.Object r4 = r0.collect(r1, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L14
            return r4
        L14:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect$$forInline(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) {
            r3 = this;
            r0 = 4
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$1
            r0.<init>(r3, r5)
            r0 = 5
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.flow.Flow r0 = r3.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r2 = r3.$predicate$inlined
            r1.<init>(r4, r2)
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)
            r0.collect(r1, r5)
            r4 = 1
            kotlin.jvm.internal.InlineMarker.mark(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
