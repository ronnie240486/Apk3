package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"toCollection", "C", "T", "", "Lkotlinx/coroutines/flow/Flow;", "destination", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSet", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collection.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    public static final class AnonymousClass1<T, C extends java.util.Collection<? super T>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.util.Collection L$0;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
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
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.toCollection(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2, reason: invalid class name */
    /* JADX INFO: compiled from: Collection.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "C", "", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {

        /* JADX INFO: Incorrect field signature: TC; */
        public final /* synthetic */ java.util.Collection $destination;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public AnonymousClass2(java.util.Collection r1) {
                r0 = this;
                r0.$destination = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                java.util.Collection r2 = r0.$destination
                r2.add(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r4, @org.jetbrains.annotations.NotNull C r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super C> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Collection r5 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2 r6 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2
            r6.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object toList(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.List<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toCollection(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object toList$default(kotlinx.coroutines.flow.Flow r0, java.util.List r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toList(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object toSet(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.Set<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toCollection(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object toSet$default(kotlinx.coroutines.flow.Flow r0, java.util.Set r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L9
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
        L9:
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.toSet(r0, r1, r2)
            return r0
    }
}
