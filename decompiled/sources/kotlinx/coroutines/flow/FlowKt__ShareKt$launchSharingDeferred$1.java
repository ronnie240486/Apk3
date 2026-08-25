package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    public final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> $result;
    public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
    private /* synthetic */ java.lang.Object L$0;
    public int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        public final /* synthetic */ kotlinx.coroutines.CoroutineScope $$this$launch;
        public final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> $result;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.flow.MutableStateFlow<T>> $state;

        public AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.flow.MutableStateFlow<T>> r1, kotlinx.coroutines.CoroutineScope r2, kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r3) {
                r0 = this;
                r0.$state = r1
                r0.$$this$launch = r2
                r0.$result = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r3 = this;
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.flow.MutableStateFlow<T>> r5 = r3.$state
                T r5 = r5.element
                kotlinx.coroutines.flow.MutableStateFlow r5 = (kotlinx.coroutines.flow.MutableStateFlow) r5
                if (r5 != 0) goto La
                r5 = 0
                goto Lf
            La:
                r5.setValue(r4)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
            Lf:
                if (r5 != 0) goto L2d
                kotlinx.coroutines.CoroutineScope r5 = r3.$$this$launch
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.flow.MutableStateFlow<T>> r0 = r3.$state
                kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r1 = r3.$result
                kotlinx.coroutines.flow.MutableStateFlow r4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r4)
                kotlinx.coroutines.flow.ReadonlyStateFlow r2 = new kotlinx.coroutines.flow.ReadonlyStateFlow
                kotlin.coroutines.CoroutineContext r5 = r5.getCoroutineContext()
                kotlinx.coroutines.Job r5 = kotlinx.coroutines.JobKt.getJob(r5)
                r2.<init>(r4, r5)
                r1.complete(r2)
                r0.element = r4
            L2d:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    public FlowKt__ShareKt$launchSharingDeferred$1(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1> r3) {
            r0 = this;
            r0.$upstream = r1
            r0.$result = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1
            kotlinx.coroutines.flow.Flow<T> r1 = r3.$upstream
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r2 = r3.$result
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
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
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> Lf
            goto L37
        Lf:
            r7 = move-exception
            goto L3a
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.Flow<T> r3 = r6.$upstream     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1 r4 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r5 = r6.$result     // Catch: java.lang.Throwable -> Lf
            r4.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> Lf
            r6.label = r2     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r3.collect(r4, r6)     // Catch: java.lang.Throwable -> Lf
            if (r7 != r0) goto L37
            return r0
        L37:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L3a:
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r0 = r6.$result
            r0.completeExceptionally(r7)
            throw r7
    }
}
