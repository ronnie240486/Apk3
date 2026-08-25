package io.realm.kotlin;

/* JADX INFO: compiled from: RealmExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0007\u001a\u001e\u0010\b\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\t\u001a(\u0010\b\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086\b¢\u0006\u0002\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b\u001aB\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019*\u00020\u0003\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"createEmbeddedObject", "T", "Lio/realm/RealmModel;", "Lio/realm/Realm;", "parentObject", "parentProperty", "", "(Lio/realm/Realm;Lio/realm/RealmModel;Ljava/lang/String;)Lio/realm/RealmModel;", "createObject", "(Lio/realm/Realm;)Lio/realm/RealmModel;", "primaryKeyValue", "", "(Lio/realm/Realm;Ljava/lang/Object;)Lio/realm/RealmModel;", "delete", "", "executeTransactionAwait", "context", "Lkotlin/coroutines/CoroutineContext;", "transaction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "realm", "(Lio/realm/Realm;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toflow", "Lkotlinx/coroutines/flow/Flow;", "where", "Lio/realm/RealmQuery;", "realm-kotlin-extensions_baseRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class RealmExtensionsKt {

    /* JADX INFO: renamed from: io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1, reason: invalid class name */
    /* JADX INFO: compiled from: RealmExtensions.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.kotlin.RealmExtensionsKt", f = "RealmExtensions.kt", i = {0}, l = {142}, m = "executeTransactionAwait", n = {"$this$executeTransactionAwait"}, s = {"L$0"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public io.realm.Realm L$0;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super io.realm.kotlin.RealmExtensionsKt.AnonymousClass1> r1) {
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
                java.lang.Object r2 = io.realm.kotlin.RealmExtensionsKt.executeTransactionAwait(r2, r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2, reason: invalid class name */
    /* JADX INFO: compiled from: RealmExtensions.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2", f = "RealmExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ io.realm.Realm $this_executeTransactionAwait;
        public final /* synthetic */ kotlin.jvm.functions.Function1<io.realm.Realm, kotlin.Unit> $transaction;
        private /* synthetic */ java.lang.Object L$0;

        public static /* synthetic */ void $r8$lambda$HZli_Y3T_224edgdxhQwHasY18c(kotlin.jvm.functions.Function1 r0, io.realm.Realm r1) {
                m328invokeSuspend$lambda1$lambda0(r0, r1)
                return
        }

        public AnonymousClass2(io.realm.Realm r1, kotlin.jvm.functions.Function1<? super io.realm.Realm, kotlin.Unit> r2, kotlin.coroutines.Continuation<? super io.realm.kotlin.RealmExtensionsKt.AnonymousClass2> r3) {
                r0 = this;
                r0.$this_executeTransactionAwait = r1
                r0.$transaction = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-1$lambda-0, reason: not valid java name */
        private static final void m328invokeSuspend$lambda1$lambda0(kotlin.jvm.functions.Function1 r0, io.realm.Realm r1) {
                r0.invoke(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2 r0 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2
                io.realm.Realm r1 = r3.$this_executeTransactionAwait
                kotlin.jvm.functions.Function1<io.realm.Realm, kotlin.Unit> r2 = r3.$transaction
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
                io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2 r1 = (io.realm.kotlin.RealmExtensionsKt.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                io.realm.Realm r0 = r3.$this_executeTransactionAwait
                io.realm.RealmConfiguration r0 = r0.getConfiguration()
                io.realm.Realm r0 = io.realm.Realm.getInstance(r0)
                kotlin.jvm.functions.Function1<io.realm.Realm, kotlin.Unit> r1 = r3.$transaction
                r2 = 0
                boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r4)     // Catch: java.lang.Throwable -> L2b
                if (r4 == 0) goto L25
                io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2$$ExternalSyntheticLambda0 r4 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L2b
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L2b
                r0.executeTransaction(r4)     // Catch: java.lang.Throwable -> L2b
            L25:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
                kotlin.io.CloseableKt.closeFinally(r0, r2)
                return r4
            L2b:
                r4 = move-exception
                throw r4     // Catch: java.lang.Throwable -> L2d
            L2d:
                r1 = move-exception
                kotlin.io.CloseableKt.closeFinally(r0, r4)
                throw r1
        }
    }

    public static final /* synthetic */ <T extends io.realm.RealmModel> T createEmbeddedObject(io.realm.Realm r2, io.realm.RealmModel r3, java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "parentObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "parentProperty"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            io.realm.RealmModel r2 = r2.createEmbeddedObject(r0, r3, r4)
            java.lang.String r3 = "this.createEmbeddedObjec…ntObject, parentProperty)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static final /* synthetic */ <T extends io.realm.RealmModel> T createObject(io.realm.Realm r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            io.realm.RealmModel r2 = r2.createObject(r0)
            java.lang.String r0 = "this.createObject(T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }

    public static final /* synthetic */ <T extends io.realm.RealmModel> T createObject(io.realm.Realm r2, java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            io.realm.RealmModel r2 = r2.createObject(r0, r3)
            java.lang.String r3 = "this.createObject(T::class.java, primaryKeyValue)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static final /* synthetic */ <T extends io.realm.RealmModel> void delete(io.realm.Realm r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            r2.delete(r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object executeTransactionAwait(@org.jetbrains.annotations.NotNull io.realm.Realm r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super io.realm.Realm, kotlin.Unit> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            boolean r0 = r7 instanceof io.realm.kotlin.RealmExtensionsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1 r0 = (io.realm.kotlin.RealmExtensionsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1 r0 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.realm.Realm r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2 r7 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2
            r2 = 0
            r7.<init>(r4, r6, r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r5, r7, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r4.refresh()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    public static /* synthetic */ java.lang.Object executeTransactionAwait$default(io.realm.Realm r0, kotlin.coroutines.CoroutineContext r1, kotlin.jvm.functions.Function1 r2, kotlin.coroutines.Continuation r3, int r4, java.lang.Object r5) {
            r4 = r4 & 1
            if (r4 == 0) goto Lf
            io.realm.internal.async.RealmThreadPoolExecutor r1 = io.realm.Realm.WRITE_EXECUTOR
            java.lang.String r4 = "WRITE_EXECUTOR"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            kotlinx.coroutines.ExecutorCoroutineDispatcher r1 = kotlinx.coroutines.ExecutorsKt.from(r1)
        Lf:
            java.lang.Object r0 = executeTransactionAwait(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.Flow<io.realm.Realm> toflow(@org.jetbrains.annotations.NotNull io.realm.Realm r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            io.realm.RealmConfiguration r0 = r1.getConfiguration()
            io.realm.coroutines.FlowFactory r0 = r0.getFlowFactory()
            kotlinx.coroutines.flow.Flow r1 = r0.from(r1)
            java.lang.String r0 = "configuration.flowFactory.from(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final /* synthetic */ <T extends io.realm.RealmModel> io.realm.RealmQuery<T> where(io.realm.Realm r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            io.realm.RealmQuery r2 = r2.where(r0)
            java.lang.String r0 = "this.where(T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }
}
