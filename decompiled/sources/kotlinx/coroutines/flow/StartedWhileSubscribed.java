package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "stopTimeout", "", "replayExpiration", "(JJ)V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "equals", "", "other", "", "hashCode", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StartedWhileSubscribed implements kotlinx.coroutines.flow.SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public /* synthetic */ int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ kotlinx.coroutines.flow.StartedWhileSubscribed this$0;

        public AnonymousClass1(kotlinx.coroutines.flow.StartedWhileSubscribed r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r1, java.lang.Integer r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r3, int r4, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1
                kotlinx.coroutines.flow.StartedWhileSubscribed r1 = r2.this$0
                r0.<init>(r1, r5)
                r0.L$0 = r3
                r0.I$0 = r4
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L64
            L38:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L9c
            L3c:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                int r10 = r9.I$0
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
                r9.label = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
                long r6 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getStopTimeout$p(r10)
                r9.L$0 = r1
                r9.label = r5
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
                long r5 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
                r9.L$0 = r1
                r9.label = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
                long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.L$0 = r3
                r9.label = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        public /* synthetic */ java.lang.Object L$0;

        public AnonymousClass2(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$2
                r0.<init>(r3)
                r0.L$0 = r2
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingCommand r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r1 = (kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r2)
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.SharingCommand r2 = (kotlinx.coroutines.flow.SharingCommand) r2
                kotlinx.coroutines.flow.SharingCommand r0 = kotlinx.coroutines.flow.SharingCommand.START
                if (r2 == r0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r2
        }
    }

    public StartedWhileSubscribed(long r7, long r9) {
            r6 = this;
            r6.<init>()
            r6.stopTimeout = r7
            r6.replayExpiration = r9
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            java.lang.String r5 = " ms) cannot be negative"
            if (r4 == 0) goto L3e
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 < 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L1f
            return
        L1f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "replayExpiration("
            r7.append(r8)
            r7.append(r9)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L3e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "stopTimeout("
            r9.append(r10)
            r9.append(r7)
            r9.append(r5)
            java.lang.String r7 = r9.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public static final /* synthetic */ long access$getReplayExpiration$p(kotlinx.coroutines.flow.StartedWhileSubscribed r2) {
            long r0 = r2.replayExpiration
            return r0
    }

    public static final /* synthetic */ long access$getStopTimeout$p(kotlinx.coroutines.flow.StartedWhileSubscribed r2) {
            long r0 = r2.stopTimeout
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r3) {
            r2 = this;
            kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.transformLatest(r3, r0)
            kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$2
            r0.<init>(r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.dropWhile(r3, r0)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r3)
            return r3
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedWhileSubscribed
            if (r0 == 0) goto L18
            long r0 = r5.stopTimeout
            kotlinx.coroutines.flow.StartedWhileSubscribed r6 = (kotlinx.coroutines.flow.StartedWhileSubscribed) r6
            long r2 = r6.stopTimeout
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            long r0 = r5.replayExpiration
            long r2 = r6.replayExpiration
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L18
            r6 = 1
            goto L19
        L18:
            r6 = 0
        L19:
            return r6
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    public int hashCode() {
            r7 = this;
            long r0 = r7.stopTimeout
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            long r3 = r7.replayExpiration
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r8 = this;
            r0 = 2
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder(r0)
            long r1 = r8.stopTimeout
            java.lang.String r3 = "ms"
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L25
            java.lang.String r1 = "stopTimeout="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            long r4 = r8.stopTimeout
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L25:
            long r1 = r8.replayExpiration
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L46
            java.lang.String r1 = "replayExpiration="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            long r4 = r8.replayExpiration
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L46:
            java.util.List r2 = kotlin.collections.CollectionsKt.build(r0)
            java.lang.String r0 = "SharingStarted.WhileSubscribed("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 63
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
