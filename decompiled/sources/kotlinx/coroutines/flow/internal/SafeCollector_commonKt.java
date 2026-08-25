package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0005\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0080\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "checkContext", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SafeCollector_commonKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.Flow<T> {
        public final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;

        public AnonymousClass1(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.$block = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.Flow
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r1.$block
                java.lang.Object r2 = r0.invoke(r2, r3)
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r2 != r3) goto Ld
                return r2
            Ld:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect$$forInline(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                r0 = 4
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1 r0 = new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
                r0.<init>(r1, r3)
                r0 = 5
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r1.$block
                r0.invoke(r2, r3)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }
    }

    @kotlin.jvm.JvmName(name = "checkContext")
    public static final void checkContext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.internal.SafeCollector<?> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1 r1 = new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            r1.<init>(r2)
            java.lang.Object r0 = r3.fold(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r2.collectContextSize
            if (r0 != r1) goto L19
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Flow invariant is violated:\n\t\tFlow was collected in "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            kotlin.coroutines.CoroutineContext r2 = r2.collectContext
            r1.append(r2)
            java.lang.String r2 = ",\n\t\tbut emission happened in "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.Job transitiveCoroutineParent(@org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r2) {
        L0:
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r1 != r2) goto L7
            return r1
        L7:
            boolean r0 = r1 instanceof kotlinx.coroutines.internal.ScopeCoroutine
            if (r0 != 0) goto Lc
            return r1
        Lc:
            kotlinx.coroutines.internal.ScopeCoroutine r1 = (kotlinx.coroutines.internal.ScopeCoroutine) r1
            kotlinx.coroutines.Job r1 = r1.getParent$kotlinx_coroutines_core()
            goto L0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> unsafeFlow(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1
            r0.<init>(r1)
            return r0
    }
}
