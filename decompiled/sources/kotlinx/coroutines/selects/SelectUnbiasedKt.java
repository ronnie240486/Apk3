package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"selectUnbiased", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SelectUnbiasedKt {
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object selectUnbiased(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r2) {
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl r0 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r1 = move-exception
            r0.handleBuilderException(r1)
        Ld:
            java.lang.Object r1 = r0.initSelectResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L1a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r2)
        L1a:
            return r1
    }

    private static final <R> java.lang.Object selectUnbiased$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r1, kotlin.coroutines.Continuation<? super R> r2) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl r0 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r1 = move-exception
            r0.handleBuilderException(r1)
        L11:
            java.lang.Object r1 = r0.initSelectResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L1e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r2)
        L1e:
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }
}
