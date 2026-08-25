package io.realm.internal.coroutines;

/* JADX INFO: compiled from: InternalFlowFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J6\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\r0\f0\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rH\u0016J6\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00100\f0\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016J3\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00070\u0006\"\b\b\u0000\u0010\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002H\u000eH\u0016¢\u0006\u0002\u0010\u0016J6\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\r0\f0\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rH\u0016J6\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00100\f0\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J0\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\r0\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rH\u0016J0\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00100\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0006\"\b\b\u0000\u0010\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002H\u000eH\u0016¢\u0006\u0002\u0010\u0016J0\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\r0\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rH\u0016J0\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00100\u0006\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/realm/internal/coroutines/InternalFlowFactory;", "Lio/realm/coroutines/FlowFactory;", "returnFrozenObjects", "", "(Z)V", "changesetFrom", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/ObjectChange;", "Lio/realm/DynamicRealmObject;", "dynamicRealm", "Lio/realm/DynamicRealm;", "dynamicRealmObject", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmList;", "T", "list", "Lio/realm/RealmResults;", "results", "Lio/realm/RealmModel;", "realm", "Lio/realm/Realm;", "realmObject", "(Lio/realm/Realm;Lio/realm/RealmModel;)Lkotlinx/coroutines/flow/Flow;", "from", "realmList", "realm-android-library_baseRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class InternalFlowFactory implements io.realm.coroutines.FlowFactory {
    private final boolean returnFrozenObjects;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmResults;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1", f = "InternalFlowFactory.kt", i = {}, l = {166, 192}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmResults<T>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmResults<T> $results;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        /* JADX INFO: renamed from: $r8$lambda$X7LXaX9W_-Gehv0zHwBdQPaDq5s, reason: not valid java name */
        public static /* synthetic */ void m309$r8$lambda$X7LXaX9W_Gehv0zHwBdQPaDq5s(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmResults r2, io.realm.OrderedCollectionChangeSet r3) {
                m310invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        public AnonymousClass1(io.realm.RealmResults<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass1> r4) {
                r0 = this;
                r0.$results = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m310invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmResults r3, io.realm.OrderedCollectionChangeSet r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L21
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                io.realm.RealmResults r3 = r3.freeze()
                r2.<init>(r3, r4)
                r1.offer(r2)
                goto L21
            L19:
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                r2.<init>(r3, r4)
                r1.offer(r2)
            L21:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1
                io.realm.RealmResults<T> r1 = r4.$results
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r8)
                goto L80
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                io.realm.RealmResults<T> r1 = r7.$results
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass1.C00431.INSTANCE
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r1, r7)
                if (r8 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L3b:
                io.realm.RealmConfiguration r1 = r7.$config
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0
                r5 = 0
                r4.<init>(r8, r3, r5)
                io.realm.RealmResults<T> r3 = r7.$results
                r3.addChangeListener(r4)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                r5 = 0
                if (r3 == 0) goto L66
                io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
                io.realm.RealmResults<T> r6 = r7.$results
                io.realm.RealmResults r6 = r6.freeze()
                r3.<init>(r6, r5)
                r8.offer(r3)
                goto L70
            L66:
                io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
                io.realm.RealmResults<T> r6 = r7.$results
                r3.<init>(r6, r5)
                r8.offer(r3)
            L70:
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$2
                io.realm.RealmResults<T> r5 = r7.$results
                r3.<init>(r1, r5, r4)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r3, r7)
                if (r8 != r0) goto L80
                return r0
            L80:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmResults;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2", f = "InternalFlowFactory.kt", i = {}, l = {266, 292}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmResults<T>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmResults<T> $results;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        public static /* synthetic */ void $r8$lambda$kUzkxXXEX2mItRPrm83WiLOTQok(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmResults r2, io.realm.OrderedCollectionChangeSet r3) {
                m311invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        public AnonymousClass2(io.realm.RealmResults<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass2> r4) {
                r0 = this;
                r0.$results = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m311invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmResults r3, io.realm.OrderedCollectionChangeSet r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L21
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                io.realm.RealmResults r3 = r3.freeze()
                r2.<init>(r3, r4)
                r1.offer(r2)
                goto L21
            L19:
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                r2.<init>(r3, r4)
                r1.offer(r2)
            L21:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2
                io.realm.RealmResults<T> r1 = r4.$results
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r8)
                goto L7f
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                io.realm.RealmResults<T> r1 = r7.$results
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass2.AnonymousClass1.INSTANCE
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r1, r7)
                if (r8 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L3b:
                io.realm.RealmConfiguration r1 = r7.$config
                io.realm.DynamicRealm r1 = io.realm.DynamicRealm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r4 = r7.this$0
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0 r5 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0
                r5.<init>(r8, r4, r3)
                io.realm.RealmResults<T> r3 = r7.$results
                r3.addChangeListener(r5)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                r4 = 0
                if (r3 == 0) goto L65
                io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
                io.realm.RealmResults<T> r6 = r7.$results
                io.realm.RealmResults r6 = r6.freeze()
                r3.<init>(r6, r4)
                r8.offer(r3)
                goto L6f
            L65:
                io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
                io.realm.RealmResults<T> r6 = r7.$results
                r3.<init>(r6, r4)
                r8.offer(r3)
            L6f:
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2$2
                io.realm.RealmResults<T> r4 = r7.$results
                r3.<init>(r1, r4, r5)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r3, r7)
                if (r8 != r0) goto L7f
                return r0
            L7f:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmList;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3", f = "InternalFlowFactory.kt", i = {}, l = {366, 394}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmList<T>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmList<T> $list;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        public static /* synthetic */ void $r8$lambda$Xjm1ghsEou1JAEToBGOPdewoEgc(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmList r2, io.realm.OrderedCollectionChangeSet r3) {
                m312invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        public AnonymousClass3(io.realm.RealmList<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass3> r4) {
                r0 = this;
                r0.$list = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m312invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmList r3, io.realm.OrderedCollectionChangeSet r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L2d
                boolean r0 = r3.isValid()
                if (r0 != 0) goto L12
                r2 = 1
                r3 = 0
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r1, r3, r2, r3)
                goto L2d
            L12:
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L25
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                io.realm.RealmList r3 = r3.freeze()
                r2.<init>(r3, r4)
                r1.offer(r2)
                goto L2d
            L25:
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                r2.<init>(r3, r4)
                r1.offer(r2)
            L2d:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3
                io.realm.RealmList<T> r1 = r4.$list
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmList<T>>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass3) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.throwOnFailure(r8)
                goto L7f
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                io.realm.RealmList<T> r1 = r7.$list
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass3.AnonymousClass1.INSTANCE
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r1, r7)
                if (r8 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L3b:
                io.realm.RealmConfiguration r1 = r7.$config
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r2 = r7.this$0
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0
                r4.<init>(r8, r2, r3)
                io.realm.RealmList<T> r2 = r7.$list
                r2.addChangeListener(r4)
                io.realm.internal.coroutines.InternalFlowFactory r2 = r7.this$0
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                r5 = 0
                if (r2 == 0) goto L65
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                io.realm.RealmList<T> r6 = r7.$list
                io.realm.RealmList r6 = r6.freeze()
                r2.<init>(r6, r5)
                r8.offer(r2)
                goto L6f
            L65:
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                io.realm.RealmList<T> r6 = r7.$list
                r2.<init>(r6, r5)
                r8.offer(r2)
            L6f:
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3$2 r2 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3$2
                io.realm.RealmList<T> r5 = r7.$list
                r2.<init>(r1, r5, r4)
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r2, r7)
                if (r8 != r0) goto L7f
                return r0
            L7f:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmList;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4", f = "InternalFlowFactory.kt", i = {}, l = {467, 495}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmList<T>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmList<T> $list;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        /* JADX INFO: renamed from: $r8$lambda$9qv5NKj4Jqg6s9SfhI-NNXugcoI, reason: not valid java name */
        public static /* synthetic */ void m313$r8$lambda$9qv5NKj4Jqg6s9SfhINNXugcoI(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmList r2, io.realm.OrderedCollectionChangeSet r3) {
                m314invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        public AnonymousClass4(io.realm.RealmList<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass4> r4) {
                r0 = this;
                r0.$list = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m314invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmList r3, io.realm.OrderedCollectionChangeSet r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L2d
                boolean r0 = r3.isValid()
                if (r0 != 0) goto L12
                r2 = 1
                r3 = 0
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r1, r3, r2, r3)
                goto L2d
            L12:
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L25
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                io.realm.RealmList r3 = r3.freeze()
                r2.<init>(r3, r4)
                r1.offer(r2)
                goto L2d
            L25:
                io.realm.rx.CollectionChange r2 = new io.realm.rx.CollectionChange
                r2.<init>(r3, r4)
                r1.offer(r2)
            L2d:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4
                io.realm.RealmList<T> r1 = r4.$list
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.CollectionChange<io.realm.RealmList<T>>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass4) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r8)
                goto L80
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                io.realm.RealmList<T> r1 = r7.$list
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass4.AnonymousClass1.INSTANCE
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r1, r7)
                if (r8 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L3b:
                io.realm.RealmConfiguration r1 = r7.$config
                io.realm.DynamicRealm r1 = io.realm.DynamicRealm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0
                r5 = 3
                r4.<init>(r8, r3, r5)
                io.realm.RealmList<T> r3 = r7.$list
                r3.addChangeListener(r4)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                r5 = 0
                if (r3 == 0) goto L66
                io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
                io.realm.RealmList<T> r6 = r7.$list
                io.realm.RealmList r6 = r6.freeze()
                r3.<init>(r6, r5)
                r8.offer(r3)
                goto L70
            L66:
                io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
                io.realm.RealmList<T> r6 = r7.$list
                r3.<init>(r6, r5)
                r8.offer(r3)
            L70:
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4$2
                io.realm.RealmList<T> r5 = r7.$list
                r3.<init>(r1, r5, r4)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r3, r7)
                if (r8 != r0) goto L80
                return r0
            L80:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@"}, d2 = {"Lio/realm/RealmModel;", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/ObjectChange;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5", f = "InternalFlowFactory.kt", i = {}, l = {569, 597}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.ObjectChange<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.Realm $realm;

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ io.realm.RealmModel $realmObject;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        public static /* synthetic */ void $r8$lambda$n45p70UenmQ8UyDHodgcBUkEGak(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmModel r2, io.realm.ObjectChangeSet r3) {
                m315invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;Lio/realm/RealmConfiguration;TT;Lio/realm/internal/coroutines/InternalFlowFactory;Lkotlin/coroutines/Continuation<-Lio/realm/internal/coroutines/InternalFlowFactory$changesetFrom$5;>;)V */
        public AnonymousClass5(io.realm.Realm r1, io.realm.RealmConfiguration r2, io.realm.RealmModel r3, io.realm.internal.coroutines.InternalFlowFactory r4, kotlin.coroutines.Continuation r5) {
                r0 = this;
                r0.$realm = r1
                r0.$config = r2
                r0.$realmObject = r3
                r0.this$0 = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m315invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmModel r3, io.realm.ObjectChangeSet r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L21
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.rx.ObjectChange r2 = new io.realm.rx.ObjectChange
                io.realm.RealmModel r3 = io.realm.RealmObject.freeze(r3)
                r2.<init>(r3, r4)
                r1.offer(r2)
                goto L21
            L19:
                io.realm.rx.ObjectChange r2 = new io.realm.rx.ObjectChange
                r2.<init>(r3, r4)
                r1.offer(r2)
            L21:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5 r6 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5
                io.realm.Realm r1 = r7.$realm
                io.realm.RealmConfiguration r2 = r7.$config
                io.realm.RealmModel r3 = r7.$realmObject
                io.realm.internal.coroutines.InternalFlowFactory r4 = r7.this$0
                r0 = r6
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                r6.L$0 = r8
                return r6
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.ObjectChange<T>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass5) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r8)
                goto L89
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L39
            L1f:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                io.realm.Realm r1 = r7.$realm
                boolean r1 = r1.isClosed()
                if (r1 == 0) goto L3c
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass5.AnonymousClass1.INSTANCE
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r1, r7)
                if (r8 != r0) goto L39
                return r0
            L39:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L3c:
                io.realm.RealmConfiguration r1 = r7.$config
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$$ExternalSyntheticLambda0
                r5 = 0
                r4.<init>(r8, r3, r5)
                io.realm.RealmModel r3 = r7.$realmObject
                io.realm.RealmObject.addChangeListener(r3, r4)
                io.realm.RealmModel r3 = r7.$realmObject
                boolean r3 = io.realm.RealmObject.isLoaded(r3)
                if (r3 == 0) goto L79
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                r5 = 0
                if (r3 == 0) goto L6f
                io.realm.rx.ObjectChange r3 = new io.realm.rx.ObjectChange
                io.realm.RealmModel r6 = r7.$realmObject
                io.realm.RealmModel r6 = io.realm.RealmObject.freeze(r6)
                r3.<init>(r6, r5)
                r8.offer(r3)
                goto L79
            L6f:
                io.realm.rx.ObjectChange r3 = new io.realm.rx.ObjectChange
                io.realm.RealmModel r6 = r7.$realmObject
                r3.<init>(r6, r5)
                r8.offer(r3)
            L79:
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$2
                io.realm.RealmModel r5 = r7.$realmObject
                r3.<init>(r1, r5, r4)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r3, r7)
                if (r8 != r0) goto L89
                return r0
            L89:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/ObjectChange;", "Lio/realm/DynamicRealmObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6", f = "InternalFlowFactory.kt", i = {}, l = {674, 702}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.DynamicRealmObject $dynamicRealmObject;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        /* JADX INFO: renamed from: $r8$lambda$Tuj7GVUV-ste-QluKqO93D3_3UQ, reason: not valid java name */
        public static /* synthetic */ void m316$r8$lambda$Tuj7GVUVsteQluKqO93D3_3UQ(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.DynamicRealmObject r2, io.realm.ObjectChangeSet r3) {
                m317invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        public AnonymousClass6(io.realm.DynamicRealmObject r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass6> r4) {
                r0 = this;
                r0.$dynamicRealmObject = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m317invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.DynamicRealmObject r3, io.realm.ObjectChangeSet r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L21
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.rx.ObjectChange r2 = new io.realm.rx.ObjectChange
                io.realm.RealmModel r3 = io.realm.RealmObject.freeze(r3)
                r2.<init>(r3, r4)
                r1.offer(r2)
                goto L21
            L19:
                io.realm.rx.ObjectChange r2 = new io.realm.rx.ObjectChange
                r2.<init>(r3, r4)
                r1.offer(r2)
            L21:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6
                io.realm.DynamicRealmObject r1 = r4.$dynamicRealmObject
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass6) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r8)
                goto L88
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L39
            L1f:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                io.realm.DynamicRealmObject r1 = r7.$dynamicRealmObject
                boolean r1 = io.realm.RealmObject.isValid(r1)
                if (r1 != 0) goto L3c
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass6.AnonymousClass1.INSTANCE
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r1, r7)
                if (r8 != r0) goto L39
                return r0
            L39:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L3c:
                io.realm.RealmConfiguration r1 = r7.$config
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r4 = r7.this$0
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$$ExternalSyntheticLambda0 r5 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$$ExternalSyntheticLambda0
                r5.<init>(r8, r4, r3)
                io.realm.DynamicRealmObject r3 = r7.$dynamicRealmObject
                io.realm.RealmObject.addChangeListener(r3, r5)
                io.realm.DynamicRealmObject r3 = r7.$dynamicRealmObject
                boolean r3 = io.realm.RealmObject.isLoaded(r3)
                if (r3 == 0) goto L78
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                r4 = 0
                if (r3 == 0) goto L6e
                io.realm.rx.ObjectChange r3 = new io.realm.rx.ObjectChange
                io.realm.DynamicRealmObject r6 = r7.$dynamicRealmObject
                io.realm.RealmModel r6 = io.realm.RealmObject.freeze(r6)
                r3.<init>(r6, r4)
                r8.offer(r3)
                goto L78
            L6e:
                io.realm.rx.ObjectChange r3 = new io.realm.rx.ObjectChange
                io.realm.DynamicRealmObject r6 = r7.$dynamicRealmObject
                r3.<init>(r6, r4)
                r8.offer(r3)
            L78:
                io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$2
                io.realm.DynamicRealmObject r4 = r7.$dynamicRealmObject
                r3.<init>(r1, r4, r5)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r3, r7)
                if (r8 != r0) goto L88
                return r0
            L88:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/Realm;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$1", f = "InternalFlowFactory.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class C00631 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.Realm>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.Realm $realm;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;


        public static /* synthetic */ void $r8$lambda$JH1LpjkSTMKSCZRCZzFLr2jOOgE(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.Realm r2, io.realm.Realm r3) {
                m318invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        public C00631(io.realm.Realm r1, io.realm.internal.coroutines.InternalFlowFactory r2, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.C00631> r3) {
                r0 = this;
                r0.$realm = r1
                r0.this$0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m318invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.Realm r3, io.realm.Realm r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L1c
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.Realm r2 = r3.freeze()
                java.lang.String r3 = "realm.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.offer(r2)
                goto L1c
            L19:
                r1.offer(r4)
            L1c:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$1 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$1
                io.realm.Realm r1 = r3.$realm
                io.realm.internal.coroutines.InternalFlowFactory r2 = r3.this$0
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.realm.Realm> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.Realm> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$1 r1 = (io.realm.internal.coroutines.InternalFlowFactory.C00631) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r8)
                goto L60
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                io.realm.Realm r1 = r7.$realm
                io.realm.RealmConfiguration r1 = r1.getConfiguration()
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                io.realm.Realm r4 = r7.$realm
                io.realm.internal.coroutines.InternalFlowFactory$from$1$$ExternalSyntheticLambda0 r5 = new io.realm.internal.coroutines.InternalFlowFactory$from$1$$ExternalSyntheticLambda0
                r6 = 0
                r5.<init>(r8, r3, r4, r6)
                r1.addChangeListener(r5)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r7.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                if (r3 == 0) goto L4a
                io.realm.Realm r3 = r1.freeze()
                java.lang.String r4 = "flowRealm.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r8.offer(r3)
                goto L52
            L4a:
                java.lang.String r3 = "flowRealm"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                r8.offer(r1)
            L52:
                io.realm.internal.coroutines.InternalFlowFactory$from$1$1 r3 = new io.realm.internal.coroutines.InternalFlowFactory$from$1$1
                r3.<init>(r1, r5)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r8, r3, r7)
                if (r8 != r0) goto L60
                return r0
            L60:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/DynamicRealm;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$2", f = "InternalFlowFactory.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class C00642 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.DynamicRealm>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.DynamicRealm $dynamicRealm;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;


        public static /* synthetic */ void $r8$lambda$Lwtb1C40riPhNzP6XQyBZm1MOik(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.DynamicRealm r2, io.realm.DynamicRealm r3) {
                m319invokeSuspend$lambda0(r0, r1, r2, r3)
                return
        }

        public C00642(io.realm.DynamicRealm r1, io.realm.internal.coroutines.InternalFlowFactory r2, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.C00642> r3) {
                r0 = this;
                r0.$dynamicRealm = r1
                r0.this$0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m319invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.DynamicRealm r3, io.realm.DynamicRealm r4) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L1c
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.DynamicRealm r2 = r3.freeze()
                java.lang.String r3 = "dynamicRealm.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.offer(r2)
                goto L1c
            L19:
                r1.offer(r4)
            L1c:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$2 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$2
                io.realm.DynamicRealm r1 = r3.$dynamicRealm
                io.realm.internal.coroutines.InternalFlowFactory r2 = r3.this$0
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.realm.DynamicRealm> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.DynamicRealm> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$2 r1 = (io.realm.internal.coroutines.InternalFlowFactory.C00642) r1
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
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r7)
                goto L5f
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                io.realm.DynamicRealm r1 = r6.$dynamicRealm
                io.realm.RealmConfiguration r1 = r1.getConfiguration()
                io.realm.DynamicRealm r1 = io.realm.DynamicRealm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                io.realm.DynamicRealm r4 = r6.$dynamicRealm
                io.realm.internal.coroutines.InternalFlowFactory$from$1$$ExternalSyntheticLambda0 r5 = new io.realm.internal.coroutines.InternalFlowFactory$from$1$$ExternalSyntheticLambda0
                r5.<init>(r7, r3, r4, r2)
                r1.addChangeListener(r5)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                if (r3 == 0) goto L49
                io.realm.DynamicRealm r3 = r1.freeze()
                java.lang.String r4 = "flowRealm.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r7.offer(r3)
                goto L51
            L49:
                java.lang.String r3 = "flowRealm"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                r7.offer(r1)
            L51:
                io.realm.internal.coroutines.InternalFlowFactory$from$2$1 r3 = new io.realm.internal.coroutines.InternalFlowFactory$from$2$1
                r3.<init>(r1, r5)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r3, r6)
                if (r7 != r0) goto L5f
                return r0
            L5f:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/RealmResults;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$3", f = "InternalFlowFactory.kt", i = {}, l = {116, 142}, m = "invokeSuspend", n = {}, s = {})
    public static final class C00653<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmResults<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmResults<T> $results;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        /* JADX INFO: renamed from: $r8$lambda$WGdWxo2RtlVUtd33NUxBJ5I1t-0, reason: not valid java name */
        public static /* synthetic */ void m320$r8$lambda$WGdWxo2RtlVUtd33NUxBJ5I1t0(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmResults r2) {
                m321invokeSuspend$lambda0(r0, r1, r2)
                return
        }

        public C00653(io.realm.RealmResults<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.C00653> r4) {
                r0 = this;
                r0.$results = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m321invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmResults r3) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L1c
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.RealmResults r2 = r3.freeze()
                java.lang.String r3 = "listenerResults.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.offer(r2)
                goto L1c
            L19:
                r1.offer(r3)
            L1c:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$3 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$3
                io.realm.RealmResults<T> r1 = r4.$results
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmResults<T>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$3 r1 = (io.realm.internal.coroutines.InternalFlowFactory.C00653) r1
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L7b
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                io.realm.RealmResults<T> r1 = r6.$results
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$from$3$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.C00653.AnonymousClass1.INSTANCE
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r1, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L3b:
                io.realm.RealmConfiguration r1 = r6.$config
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0
                r5 = 0
                r4.<init>(r7, r3, r5)
                io.realm.RealmResults<T> r3 = r6.$results
                r3.addChangeListener(r4)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                if (r3 == 0) goto L66
                io.realm.RealmResults<T> r3 = r6.$results
                io.realm.RealmResults r3 = r3.freeze()
                java.lang.String r5 = "results.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                r7.offer(r3)
                goto L6b
            L66:
                io.realm.RealmResults<T> r3 = r6.$results
                r7.offer(r3)
            L6b:
                io.realm.internal.coroutines.InternalFlowFactory$from$3$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$from$3$2
                io.realm.RealmResults<T> r5 = r6.$results
                r3.<init>(r1, r5, r4)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r3, r6)
                if (r7 != r0) goto L7b
                return r0
            L7b:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/RealmResults;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$4", f = "InternalFlowFactory.kt", i = {}, l = {216, 242}, m = "invokeSuspend", n = {}, s = {})
    public static final class C00664<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmResults<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmResults<T> $results;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        /* JADX INFO: renamed from: $r8$lambda$ozC-Cv0PV3WwfP7U6jQLd6TcYOo, reason: not valid java name */
        public static /* synthetic */ void m322$r8$lambda$ozCCv0PV3WwfP7U6jQLd6TcYOo(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmResults r2) {
                m323invokeSuspend$lambda0(r0, r1, r2)
                return
        }

        public C00664(io.realm.RealmResults<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.C00664> r4) {
                r0 = this;
                r0.$results = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m323invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmResults r3) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L1c
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.RealmResults r2 = r3.freeze()
                java.lang.String r3 = "listenerResults.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.offer(r2)
                goto L1c
            L19:
                r1.offer(r3)
            L1c:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$4 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$4
                io.realm.RealmResults<T> r1 = r4.$results
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmResults<T>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$4 r1 = (io.realm.internal.coroutines.InternalFlowFactory.C00664) r1
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L7a
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                io.realm.RealmResults<T> r1 = r6.$results
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$from$4$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.C00664.AnonymousClass1.INSTANCE
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r1, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L3b:
                io.realm.RealmConfiguration r1 = r6.$config
                io.realm.DynamicRealm r1 = io.realm.DynamicRealm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r4 = r6.this$0
                io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0 r5 = new io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0
                r5.<init>(r7, r4, r3)
                io.realm.RealmResults<T> r3 = r6.$results
                r3.addChangeListener(r5)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                if (r3 == 0) goto L65
                io.realm.RealmResults<T> r3 = r6.$results
                io.realm.RealmResults r3 = r3.freeze()
                java.lang.String r4 = "results.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r7.offer(r3)
                goto L6a
            L65:
                io.realm.RealmResults<T> r3 = r6.$results
                r7.offer(r3)
            L6a:
                io.realm.internal.coroutines.InternalFlowFactory$from$4$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$from$4$2
                io.realm.RealmResults<T> r4 = r6.$results
                r3.<init>(r1, r4, r5)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r3, r6)
                if (r7 != r0) goto L7a
                return r0
            L7a:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/RealmList;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$5", f = "InternalFlowFactory.kt", i = {}, l = {314, 342}, m = "invokeSuspend", n = {}, s = {})
    public static final class C00675<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmList<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmList<T> $realmList;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        public static /* synthetic */ void $r8$lambda$2qjOtD7UrBzMxDiDhzxcjgLy8n4(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmList r2) {
                m324invokeSuspend$lambda0(r0, r1, r2)
                return
        }

        public C00675(io.realm.RealmList<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.C00675> r4) {
                r0 = this;
                r0.$realmList = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m324invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmList r3) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L28
                boolean r0 = r3.isValid()
                if (r0 != 0) goto L12
                r2 = 1
                r3 = 0
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r1, r3, r2, r3)
                goto L28
            L12:
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L25
                io.realm.RealmList r2 = r3.freeze()
                java.lang.String r3 = "listenerResults.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.offer(r2)
                goto L28
            L25:
                r1.offer(r3)
            L28:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$5 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$5
                io.realm.RealmList<T> r1 = r4.$realmList
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmList<T>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$5 r1 = (io.realm.internal.coroutines.InternalFlowFactory.C00675) r1
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
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L79
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                io.realm.RealmList<T> r1 = r6.$realmList
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$from$5$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.C00675.AnonymousClass1.INSTANCE
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r1, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L3b:
                io.realm.RealmConfiguration r1 = r6.$config
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r2 = r6.this$0
                io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0
                r4.<init>(r7, r2, r3)
                io.realm.RealmList<T> r2 = r6.$realmList
                r2.addChangeListener(r4)
                io.realm.internal.coroutines.InternalFlowFactory r2 = r6.this$0
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L64
                io.realm.RealmList<T> r2 = r6.$realmList
                io.realm.RealmList r2 = r2.freeze()
                java.lang.String r5 = "realmList.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                r7.offer(r2)
                goto L69
            L64:
                io.realm.RealmList<T> r2 = r6.$realmList
                r7.offer(r2)
            L69:
                io.realm.internal.coroutines.InternalFlowFactory$from$5$2 r2 = new io.realm.internal.coroutines.InternalFlowFactory$from$5$2
                io.realm.RealmList<T> r5 = r6.$realmList
                r2.<init>(r1, r5, r4)
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r2, r6)
                if (r7 != r0) goto L79
                return r0
            L79:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$6, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/RealmList;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$6", f = "InternalFlowFactory.kt", i = {}, l = {415, 443}, m = "invokeSuspend", n = {}, s = {})
    public static final class C00686<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmList<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.RealmList<T> $realmList;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        public static /* synthetic */ void $r8$lambda$S4qgyjw_rcMOu5Hpev2YfnJKQd8(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmList r2) {
                m325invokeSuspend$lambda0(r0, r1, r2)
                return
        }

        public C00686(io.realm.RealmList<T> r1, io.realm.RealmConfiguration r2, io.realm.internal.coroutines.InternalFlowFactory r3, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.C00686> r4) {
                r0 = this;
                r0.$realmList = r1
                r0.$config = r2
                r0.this$0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m325invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmList r3) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L28
                boolean r0 = r3.isValid()
                if (r0 != 0) goto L12
                r2 = 1
                r3 = 0
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r1, r3, r2, r3)
                goto L28
            L12:
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L25
                io.realm.RealmList r2 = r3.freeze()
                java.lang.String r3 = "listenerResults.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.offer(r2)
                goto L28
            L25:
                r1.offer(r3)
            L28:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$6 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$6
                io.realm.RealmList<T> r1 = r4.$realmList
                io.realm.RealmConfiguration r2 = r4.$config
                io.realm.internal.coroutines.InternalFlowFactory r3 = r4.this$0
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.RealmList<T>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$6 r1 = (io.realm.internal.coroutines.InternalFlowFactory.C00686) r1
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L7a
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                io.realm.RealmList<T> r1 = r6.$realmList
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$from$6$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.C00686.AnonymousClass1.INSTANCE
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r1, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L3b:
                io.realm.RealmConfiguration r1 = r6.$config
                io.realm.DynamicRealm r1 = io.realm.DynamicRealm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0
                r5 = 3
                r4.<init>(r7, r3, r5)
                io.realm.RealmList<T> r3 = r6.$realmList
                r3.addChangeListener(r4)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                if (r3 == 0) goto L65
                io.realm.RealmList<T> r3 = r6.$realmList
                io.realm.RealmList r3 = r3.freeze()
                java.lang.String r5 = "realmList.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                r7.offer(r3)
                goto L6a
            L65:
                io.realm.RealmList<T> r3 = r6.$realmList
                r7.offer(r3)
            L6a:
                io.realm.internal.coroutines.InternalFlowFactory$from$6$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$from$6$2
                io.realm.RealmList<T> r5 = r6.$realmList
                r3.<init>(r1, r5, r4)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r3, r6)
                if (r7 != r0) goto L7a
                return r0
            L7a:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$7, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"Lio/realm/RealmModel;", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$7", f = "InternalFlowFactory.kt", i = {}, l = {517, 545}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass7<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.Realm $realm;

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ io.realm.RealmModel $realmObject;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        public static /* synthetic */ void $r8$lambda$XFoTSpTEZhDIZeA7qDK98ftgXB8(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.RealmModel r2) {
                m326invokeSuspend$lambda0(r0, r1, r2)
                return
        }

        /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;Lio/realm/RealmConfiguration;TT;Lio/realm/internal/coroutines/InternalFlowFactory;Lkotlin/coroutines/Continuation<-Lio/realm/internal/coroutines/InternalFlowFactory$from$7;>;)V */
        public AnonymousClass7(io.realm.Realm r1, io.realm.RealmConfiguration r2, io.realm.RealmModel r3, io.realm.internal.coroutines.InternalFlowFactory r4, kotlin.coroutines.Continuation r5) {
                r0 = this;
                r0.$realm = r1
                r0.$config = r2
                r0.$realmObject = r3
                r0.this$0 = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m326invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.RealmModel r3) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L1c
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.RealmModel r2 = io.realm.RealmObject.freeze(r3)
                java.lang.String r3 = "null cannot be cast to non-null type T of io.realm.internal.coroutines.InternalFlowFactory.from.<no name provided>.invokeSuspend$lambda-0"
                java.util.Objects.requireNonNull(r2, r3)
                r1.offer(r2)
                goto L1c
            L19:
                r1.offer(r3)
            L1c:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$7 r6 = new io.realm.internal.coroutines.InternalFlowFactory$from$7
                io.realm.Realm r1 = r7.$realm
                io.realm.RealmConfiguration r2 = r7.$config
                io.realm.RealmModel r3 = r7.$realmObject
                io.realm.internal.coroutines.InternalFlowFactory r4 = r7.this$0
                r0 = r6
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                r6.L$0 = r8
                return r6
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$7 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass7) r1
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L82
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                io.realm.Realm r1 = r6.$realm
                boolean r1 = r1.isClosed()
                if (r1 == 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$from$7$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass7.AnonymousClass1.INSTANCE
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r1, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L3b:
                io.realm.RealmConfiguration r1 = r6.$config
                io.realm.Realm r1 = io.realm.Realm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0
                r5 = 4
                r4.<init>(r7, r3, r5)
                io.realm.RealmModel r3 = r6.$realmObject
                io.realm.RealmObject.addChangeListener(r3, r4)
                io.realm.RealmModel r3 = r6.$realmObject
                boolean r3 = io.realm.RealmObject.isLoaded(r3)
                if (r3 == 0) goto L72
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                if (r3 == 0) goto L6d
                io.realm.RealmModel r3 = r6.$realmObject
                io.realm.RealmModel r3 = io.realm.RealmObject.freeze(r3)
                java.lang.String r5 = "freeze(realmObject)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                r7.offer(r3)
                goto L72
            L6d:
                io.realm.RealmModel r3 = r6.$realmObject
                r7.offer(r3)
            L72:
                io.realm.internal.coroutines.InternalFlowFactory$from$7$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$from$7$2
                io.realm.RealmModel r5 = r6.$realmObject
                r3.<init>(r1, r5, r4)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r3, r6)
                if (r7 != r0) goto L82
                return r0
            L82:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$8, reason: invalid class name */
    /* JADX INFO: compiled from: InternalFlowFactory.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/DynamicRealmObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.internal.coroutines.InternalFlowFactory$from$8", f = "InternalFlowFactory.kt", i = {}, l = {622, 650}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass8 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.realm.DynamicRealmObject>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.RealmConfiguration $config;
        public final /* synthetic */ io.realm.DynamicRealm $dynamicRealm;
        public final /* synthetic */ io.realm.DynamicRealmObject $dynamicRealmObject;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ io.realm.internal.coroutines.InternalFlowFactory this$0;



        public static /* synthetic */ void $r8$lambda$B3rGt53URu6XWz5d1Me9uYGmPb8(kotlinx.coroutines.channels.ProducerScope r0, io.realm.internal.coroutines.InternalFlowFactory r1, io.realm.DynamicRealmObject r2) {
                m327invokeSuspend$lambda0(r0, r1, r2)
                return
        }

        public AnonymousClass8(io.realm.DynamicRealm r1, io.realm.RealmConfiguration r2, io.realm.DynamicRealmObject r3, io.realm.internal.coroutines.InternalFlowFactory r4, kotlin.coroutines.Continuation<? super io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass8> r5) {
                r0 = this;
                r0.$dynamicRealm = r1
                r0.$config = r2
                r0.$dynamicRealmObject = r3
                r0.this$0 = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m327invokeSuspend$lambda0(kotlinx.coroutines.channels.ProducerScope r1, io.realm.internal.coroutines.InternalFlowFactory r2, io.realm.DynamicRealmObject r3) {
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r0 == 0) goto L1c
                boolean r2 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r2)
                if (r2 == 0) goto L19
                io.realm.RealmModel r2 = r3.freeze()
                java.lang.String r3 = "listenerObj.freeze()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.offer(r2)
                goto L1c
            L19:
                r1.offer(r3)
            L1c:
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                io.realm.internal.coroutines.InternalFlowFactory$from$8 r6 = new io.realm.internal.coroutines.InternalFlowFactory$from$8
                io.realm.DynamicRealm r1 = r7.$dynamicRealm
                io.realm.RealmConfiguration r2 = r7.$config
                io.realm.DynamicRealmObject r3 = r7.$dynamicRealmObject
                io.realm.internal.coroutines.InternalFlowFactory r4 = r7.this$0
                r0 = r6
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                r6.L$0 = r8
                return r6
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.realm.DynamicRealmObject> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super io.realm.DynamicRealmObject> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                io.realm.internal.coroutines.InternalFlowFactory$from$8 r1 = (io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass8) r1
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r7)
                goto L82
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                io.realm.DynamicRealm r1 = r6.$dynamicRealm
                boolean r1 = r1.isClosed()
                if (r1 == 0) goto L3b
                io.realm.internal.coroutines.InternalFlowFactory$from$8$1 r1 = io.realm.internal.coroutines.InternalFlowFactory.AnonymousClass8.AnonymousClass1.INSTANCE
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r1, r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L3b:
                io.realm.RealmConfiguration r1 = r6.$config
                io.realm.DynamicRealm r1 = io.realm.DynamicRealm.getInstance(r1)
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0 r4 = new io.realm.internal.coroutines.InternalFlowFactory$from$3$$ExternalSyntheticLambda0
                r5 = 5
                r4.<init>(r7, r3, r5)
                io.realm.DynamicRealmObject r3 = r6.$dynamicRealmObject
                r3.addChangeListener(r4)
                io.realm.DynamicRealmObject r3 = r6.$dynamicRealmObject
                boolean r3 = io.realm.RealmObject.isLoaded(r3)
                if (r3 == 0) goto L72
                io.realm.internal.coroutines.InternalFlowFactory r3 = r6.this$0
                boolean r3 = io.realm.internal.coroutines.InternalFlowFactory.access$getReturnFrozenObjects$p(r3)
                if (r3 == 0) goto L6d
                io.realm.DynamicRealmObject r3 = r6.$dynamicRealmObject
                io.realm.RealmModel r3 = io.realm.RealmObject.freeze(r3)
                java.lang.String r5 = "freeze(dynamicRealmObject)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                r7.offer(r3)
                goto L72
            L6d:
                io.realm.DynamicRealmObject r3 = r6.$dynamicRealmObject
                r7.offer(r3)
            L72:
                io.realm.internal.coroutines.InternalFlowFactory$from$8$2 r3 = new io.realm.internal.coroutines.InternalFlowFactory$from$8$2
                io.realm.DynamicRealmObject r5 = r6.$dynamicRealmObject
                r3.<init>(r1, r5, r4)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r7, r3, r6)
                if (r7 != r0) goto L82
                return r0
            L82:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    public InternalFlowFactory() {
            r3 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    public InternalFlowFactory(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.returnFrozenObjects = r1
            return
    }

    public /* synthetic */ InternalFlowFactory(boolean r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L5
            r1 = 1
        L5:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ boolean access$getReturnFrozenObjects$p(io.realm.internal.coroutines.InternalFlowFactory r0) {
            boolean r0 = r0.returnFrozenObjects
            return r0
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>> changesetFrom(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r3, @org.jetbrains.annotations.NotNull io.realm.DynamicRealmObject r4) {
            r2 = this;
            java.lang.String r0 = "dynamicRealm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "dynamicRealmObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            r1 = 0
            if (r0 == 0) goto L1b
            io.realm.rx.ObjectChange r3 = new io.realm.rx.ObjectChange
            r3.<init>(r4, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
        L1b:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmList<T>>> changesetFrom(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r3, @org.jetbrains.annotations.NotNull io.realm.RealmList<T> r4) {
            r2 = this;
            java.lang.String r0 = "dynamicRealm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "list"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            r1 = 0
            if (r0 == 0) goto L1b
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r3.<init>(r4, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
        L1b:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> changesetFrom(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r3, @org.jetbrains.annotations.NotNull io.realm.RealmResults<T> r4) {
            r2 = this;
            java.lang.String r0 = "dynamicRealm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "results"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            r1 = 0
            if (r0 == 0) goto L1c
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r3.<init>(r4, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
        L1c:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmList<T>>> changesetFrom(@org.jetbrains.annotations.NotNull io.realm.Realm r3, @org.jetbrains.annotations.NotNull io.realm.RealmList<T> r4) {
            r2 = this;
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "list"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            r1 = 0
            if (r0 == 0) goto L1b
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r3.<init>(r4, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
        L1b:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T>> changesetFrom(@org.jetbrains.annotations.NotNull io.realm.Realm r8, @org.jetbrains.annotations.NotNull T r9) {
            r7 = this;
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "realmObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.isFrozen()
            if (r0 == 0) goto L1b
            io.realm.rx.ObjectChange r8 = new io.realm.rx.ObjectChange
            r0 = 0
            r8.<init>(r9, r0)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.flowOf(r8)
            return r8
        L1b:
            io.realm.RealmConfiguration r2 = r8.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5 r6 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5
            r5 = 0
            r0 = r6
            r1 = r8
            r3 = r9
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r6)
            return r8
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.rx.CollectionChange<io.realm.RealmResults<T>>> changesetFrom(@org.jetbrains.annotations.NotNull io.realm.Realm r3, @org.jetbrains.annotations.NotNull io.realm.RealmResults<T> r4) {
            r2 = this;
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "results"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            r1 = 0
            if (r0 == 0) goto L1c
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r3.<init>(r4, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
        L1c:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1 r0 = new io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<io.realm.DynamicRealm> from(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r3) {
            r2 = this;
            java.lang.String r0 = "dynamicRealm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L10
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
        L10:
            io.realm.internal.coroutines.InternalFlowFactory$from$2 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$2
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<io.realm.DynamicRealmObject> from(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r8, @org.jetbrains.annotations.NotNull io.realm.DynamicRealmObject r9) {
            r7 = this;
            java.lang.String r0 = "dynamicRealm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "dynamicRealmObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.isFrozen()
            if (r0 == 0) goto L15
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.flowOf(r9)
            return r8
        L15:
            io.realm.RealmConfiguration r2 = r8.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$from$8 r6 = new io.realm.internal.coroutines.InternalFlowFactory$from$8
            r5 = 0
            r0 = r6
            r1 = r8
            r3 = r9
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r6)
            return r8
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmList<T>> from(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r3, @org.jetbrains.annotations.NotNull io.realm.RealmList<T> r4) {
            r2 = this;
            java.lang.String r0 = "dynamicRealm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "realmList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L15
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r4)
            return r3
        L15:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$from$6 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$6
            r1 = 0
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmResults<T>> from(@org.jetbrains.annotations.NotNull io.realm.DynamicRealm r3, @org.jetbrains.annotations.NotNull io.realm.RealmResults<T> r4) {
            r2 = this;
            java.lang.String r0 = "dynamicRealm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "results"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L16
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r4)
            return r3
        L16:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$from$4 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$4
            r1 = 0
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<io.realm.Realm> from(@org.jetbrains.annotations.NotNull io.realm.Realm r3) {
            r2 = this;
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L10
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r3)
            return r3
        L10:
            io.realm.internal.coroutines.InternalFlowFactory$from$1 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmList<T>> from(@org.jetbrains.annotations.NotNull io.realm.Realm r3, @org.jetbrains.annotations.NotNull io.realm.RealmList<T> r4) {
            r2 = this;
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "realmList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L15
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r4)
            return r3
        L15:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$from$5 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$5
            r1 = 0
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T extends io.realm.RealmModel> kotlinx.coroutines.flow.Flow<T> from(@org.jetbrains.annotations.NotNull io.realm.Realm r8, @org.jetbrains.annotations.NotNull T r9) {
            r7 = this;
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "realmObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.isFrozen()
            if (r0 == 0) goto L15
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.flowOf(r9)
            return r8
        L15:
            io.realm.RealmConfiguration r2 = r8.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$from$7 r6 = new io.realm.internal.coroutines.InternalFlowFactory$from$7
            r5 = 0
            r0 = r6
            r1 = r8
            r3 = r9
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r6)
            return r8
    }

    @Override // io.realm.coroutines.FlowFactory
    @org.jetbrains.annotations.NotNull
    public <T> kotlinx.coroutines.flow.Flow<io.realm.RealmResults<T>> from(@org.jetbrains.annotations.NotNull io.realm.Realm r3, @org.jetbrains.annotations.NotNull io.realm.RealmResults<T> r4) {
            r2 = this;
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "results"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L16
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.flowOf(r4)
            return r3
        L16:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.realm.internal.coroutines.InternalFlowFactory$from$3 r0 = new io.realm.internal.coroutines.InternalFlowFactory$from$3
            r1 = 0
            r0.<init>(r4, r3, r2, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r3
    }
}
