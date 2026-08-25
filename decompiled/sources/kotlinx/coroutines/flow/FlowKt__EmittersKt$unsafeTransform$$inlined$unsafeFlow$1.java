package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements kotlinx.coroutines.flow.Flow<R> {
    public final /* synthetic */ kotlinx.coroutines.flow.Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ kotlin.jvm.functions.Function3 $transform$inlined;


    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function3 r2) {
            r0 = this;
            r0.$this_unsafeTransform$inlined = r1
            r0.$transform$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super R> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r3 = this;
            kotlinx.coroutines.flow.Flow r0 = r3.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1
            kotlin.jvm.functions.Function3 r2 = r3.$transform$inlined
            r1.<init>(r2, r4)
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
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1
            r0.<init>(r3, r5)
            r0 = 5
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.flow.Flow r0 = r3.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1
            kotlin.jvm.functions.Function3 r2 = r3.$transform$inlined
            r1.<init>(r2, r4)
            r4 = 0
            kotlin.jvm.internal.InlineMarker.mark(r4)
            r0.collect(r1, r5)
            r4 = 1
            kotlin.jvm.internal.InlineMarker.mark(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
