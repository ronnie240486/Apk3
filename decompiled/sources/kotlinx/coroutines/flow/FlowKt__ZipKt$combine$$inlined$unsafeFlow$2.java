package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements kotlinx.coroutines.flow.Flow<R> {
    public final /* synthetic */ kotlinx.coroutines.flow.Flow[] $flows$inlined;
    public final /* synthetic */ kotlin.jvm.functions.Function2 $transform$inlined;


    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(kotlinx.coroutines.flow.Flow[] r1, kotlin.jvm.functions.Function2 r2) {
            r0 = this;
            r0.$flows$inlined = r1
            r0.$transform$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super R> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r5 = this;
            kotlinx.coroutines.flow.Flow[] r0 = r5.$flows$inlined
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1 r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1
            kotlinx.coroutines.flow.Flow[] r2 = r5.$flows$inlined
            r1.<init>(r2)
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2
            kotlin.jvm.functions.Function2 r3 = r5.$transform$inlined
            r4 = 0
            r2.<init>(r3, r4)
            java.lang.Object r6 = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r6, r0, r1, r2, r7)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L22
            return r6
        L22:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect$$forInline(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
            r5 = this;
            r0 = 4
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2$1
            r0.<init>(r5, r7)
            r0 = 5
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.flow.Flow[] r0 = r5.$flows$inlined
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1 r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1
            kotlinx.coroutines.flow.Flow[] r2 = r5.$flows$inlined
            r1.<init>(r2)
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2
            kotlin.jvm.functions.Function2 r3 = r5.$transform$inlined
            r4 = 0
            r2.<init>(r3, r4)
            r3 = 0
            kotlin.jvm.internal.InlineMarker.mark(r3)
            kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r6, r0, r1, r2, r7)
            r6 = 1
            kotlin.jvm.internal.InlineMarker.mark(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
