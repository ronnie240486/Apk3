package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"sendBlocking", "", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)V", "trySendBlocking", "Lkotlinx/coroutines/channels/ChannelResult;", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__ChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: Channels.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ E $element;
        public final /* synthetic */ kotlinx.coroutines.channels.SendChannel<E> $this_sendBlocking;
        public int label;

        public AnonymousClass1(kotlinx.coroutines.channels.SendChannel<? super E> r1, E r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass1> r3) {
                r0 = this;
                r0.$this_sendBlocking = r1
                r0.$element = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1 r3 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1
                kotlinx.coroutines.channels.SendChannel<E> r0 = r2.$this_sendBlocking
                E r1 = r2.$element
                r3.<init>(r0, r1, r4)
                return r3
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
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                kotlinx.coroutines.channels.SendChannel<E> r4 = r3.$this_sendBlocking
                E r1 = r3.$element
                r3.label = r2
                java.lang.Object r4 = r4.send(r1, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2, reason: invalid class name */
    /* JADX INFO: compiled from: Channels.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ChannelResult;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>>, java.lang.Object> {
        public final /* synthetic */ E $element;
        public final /* synthetic */ kotlinx.coroutines.channels.SendChannel<E> $this_trySendBlocking;
        private /* synthetic */ java.lang.Object L$0;
        public int label;

        public AnonymousClass2(kotlinx.coroutines.channels.SendChannel<? super E> r1, E r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass2> r3) {
                r0 = this;
                r0.$this_trySendBlocking = r1
                r0.$element = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2
                kotlinx.coroutines.channels.SendChannel<E> r1 = r3.$this_trySendBlocking
                E r2 = r3.$element
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<kotlin.Unit>> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 r1 = (kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L34
                goto L2d
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                kotlinx.coroutines.channels.SendChannel<E> r5 = r4.$this_trySendBlocking
                E r1 = r4.$element
                kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L34
                r4.label = r2     // Catch: java.lang.Throwable -> L34
                java.lang.Object r5 = r5.send(r1, r4)     // Catch: java.lang.Throwable -> L34
                if (r5 != r0) goto L2d
                return r0
            L2d:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L34
                java.lang.Object r5 = kotlin.Result.m333constructorimpl(r5)     // Catch: java.lang.Throwable -> L34
                goto L3f
            L34:
                r5 = move-exception
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
                java.lang.Object r5 = kotlin.Result.m333constructorimpl(r5)
            L3f:
                boolean r0 = kotlin.Result.m340isSuccessimpl(r5)
                if (r0 == 0) goto L4e
                kotlinx.coroutines.channels.ChannelResult$Companion r5 = kotlinx.coroutines.channels.ChannelResult.Companion
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                java.lang.Object r5 = r5.m1841successJP2dKIU(r0)
                goto L58
            L4e:
                kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r5 = kotlin.Result.m336exceptionOrNullimpl(r5)
                java.lang.Object r5 = r0.m1839closedJP2dKIU(r5)
            L58:
                kotlinx.coroutines.channels.ChannelResult r5 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r5)
                return r5
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @kotlin.ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void sendBlocking(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.SendChannel<? super E> r2, E r3) {
            java.lang.Object r0 = r2.mo1821trySendJP2dKIU(r3)
            boolean r0 = kotlinx.coroutines.channels.ChannelResult.m1836isSuccessimpl(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2 = 1
            kotlinx.coroutines.BuildersKt.runBlocking$default(r1, r0, r2, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.lang.Object trySendBlocking(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.SendChannel<? super E> r2, E r3) {
            java.lang.Object r0 = r2.mo1821trySendJP2dKIU(r3)
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r1 != 0) goto L13
            kotlin.Unit r0 = (kotlin.Unit) r0
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.m1841successJP2dKIU(r3)
            return r2
        L13:
            kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2 = 1
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.runBlocking$default(r1, r0, r2, r1)
            kotlinx.coroutines.channels.ChannelResult r2 = (kotlinx.coroutines.channels.ChannelResult) r2
            java.lang.Object r2 = r2.m1838unboximpl()
            return r2
    }
}
