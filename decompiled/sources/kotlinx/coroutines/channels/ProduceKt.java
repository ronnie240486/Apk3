package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u009e\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a¨\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001ae\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"awaitClose", "", "Lkotlinx/coroutines/channels/ProducerScope;", "block", "Lkotlin/Function0;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produce", "Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1, reason: invalid class name */
    /* JADX INFO: compiled from: Produce.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.channels.ProducerScope L$0;
        public kotlin.jvm.functions.Function0 L$1;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ProduceKt.AnonymousClass1> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r2, r2, r1)
                return r2
        }
    }


    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object awaitClose(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<?> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.functions.Function0 r5 = r0.L$1
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L77
            goto L71
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            if (r6 == 0) goto L7c
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L77
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L77
            r0.label = r3     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L77
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L77
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L77
            r6.initCancellability()     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L77
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L77
            r4.invokeOnClose(r2)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r4 = r6.getResult()     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L77
            if (r4 != r6) goto L6e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L77
        L6e:
            if (r4 != r1) goto L71
            return r1
        L71:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L77:
            r4 = move-exception
            r5.invoke()
            throw r4
        L7c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ java.lang.Object awaitClose$default(kotlinx.coroutines.channels.ProducerScope r0, kotlin.jvm.functions.Function0 r1, kotlin.coroutines.Continuation r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$2 r1 = kotlinx.coroutines.channels.ProduceKt.AnonymousClass2.INSTANCE
        L6:
            java.lang.Object r0 = awaitClose(r0, r1, r2)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r8, int r9, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r10
            kotlinx.coroutines.channels.ReceiveChannel r7 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r8, int r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r10, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r11, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r12) {
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            kotlinx.coroutines.channels.ReceiveChannel r7 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> produce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r6, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r7, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8) {
            r0 = 0
            r1 = 4
            kotlinx.coroutines.channels.Channel r4 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r4, r5, r0, r1, r0)
            kotlin.coroutines.CoroutineContext r2 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r2, r3)
            kotlinx.coroutines.channels.ProducerCoroutine r3 = new kotlinx.coroutines.channels.ProducerCoroutine
            r3.<init>(r2, r4)
            if (r7 == 0) goto L14
            r3.invokeOnCompletion(r7)
        L14:
            r3.start(r6, r3, r8)
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r2 = 0
        Lb:
            kotlinx.coroutines.channels.ReceiveChannel r0 = produce(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r6, kotlin.coroutines.CoroutineContext r7, int r8, kotlinx.coroutines.CoroutineStart r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function2 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Le
            r8 = 0
            r2 = 0
            goto Lf
        Le:
            r2 = r8
        Lf:
            r7 = r12 & 4
            if (r7 == 0) goto L15
            kotlinx.coroutines.CoroutineStart r9 = kotlinx.coroutines.CoroutineStart.DEFAULT
        L15:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            r10 = 0
        L1b:
            r4 = r10
            r0 = r6
            r5 = r11
            kotlinx.coroutines.channels.ReceiveChannel r6 = produce(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel produce$default(kotlinx.coroutines.CoroutineScope r7, kotlin.coroutines.CoroutineContext r8, int r9, kotlinx.coroutines.channels.BufferOverflow r10, kotlinx.coroutines.CoroutineStart r11, kotlin.jvm.functions.Function1 r12, kotlin.jvm.functions.Function2 r13, int r14, java.lang.Object r15) {
            r15 = r14 & 1
            if (r15 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r8 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto Le
            r9 = 0
            r2 = 0
            goto Lf
        Le:
            r2 = r9
        Lf:
            r8 = r14 & 4
            if (r8 == 0) goto L15
            kotlinx.coroutines.channels.BufferOverflow r10 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L15:
            r3 = r10
            r8 = r14 & 8
            if (r8 == 0) goto L1c
            kotlinx.coroutines.CoroutineStart r11 = kotlinx.coroutines.CoroutineStart.DEFAULT
        L1c:
            r4 = r11
            r8 = r14 & 16
            if (r8 == 0) goto L22
            r12 = 0
        L22:
            r5 = r12
            r0 = r7
            r6 = r13
            kotlinx.coroutines.channels.ReceiveChannel r7 = produce(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }
}
