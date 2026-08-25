package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001ab\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e\u001a=\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0017\"\u0002H\u0002¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0002¢\u0006\u0002\b\u001c\u001a)\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001d0\u0001H\u0007¢\u0006\u0002\b\u001e\u001a\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0007\u001a@\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0'0&\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0&0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "flatMapIndexed", "R", "C", "source", "transform", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "generateSequence", "", "nextFunction", "seedFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "shuffled", "random", "Lkotlin/random/Random;", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/sequences/SequencesKt")
class SequencesKt__SequencesKt extends kotlin.sequences.SequencesKt__SequencesJVMKt {


    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {"T", "C", "R", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
    public static final class C00861<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlin.jvm.functions.Function1<C, java.util.Iterator<R>> $iterator;
        public final /* synthetic */ kotlin.sequences.Sequence<T> $source;
        public final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, C> $transform;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public java.util.Iterator L$1;
        public int label;

        public C00861(kotlin.sequences.Sequence<? extends T> r1, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> r2, kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> r3, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt__SequencesKt.C00861> r4) {
                r0 = this;
                r0.$source = r1
                r0.$transform = r2
                r0.$iterator = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1
                kotlin.sequences.Sequence<T> r1 = r4.$source
                kotlin.jvm.functions.Function2<java.lang.Integer, T, C> r2 = r4.$transform
                kotlin.jvm.functions.Function1<C, java.util.Iterator<R>> r3 = r4.$iterator
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super R> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1 r1 = (kotlin.sequences.SequencesKt__SequencesKt.C00861) r1
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
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                int r1 = r7.I$0
                java.util.Iterator r3 = r7.L$1
                java.lang.Object r4 = r7.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r8)
                goto L2e
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                r4 = r8
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                r1 = 0
                kotlin.sequences.Sequence<T> r8 = r7.$source
                java.util.Iterator r3 = r8.iterator()
            L2e:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L62
                java.lang.Object r8 = r3.next()
                kotlin.jvm.functions.Function2<java.lang.Integer, T, C> r5 = r7.$transform
                int r6 = r1 + 1
                if (r1 >= 0) goto L41
                kotlin.collections.CollectionsKt.throwIndexOverflow()
            L41:
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
                java.lang.Object r8 = r5.invoke(r1, r8)
                kotlin.jvm.functions.Function1<C, java.util.Iterator<R>> r1 = r7.$iterator
                java.lang.Object r8 = r1.invoke(r8)
                java.util.Iterator r8 = (java.util.Iterator) r8
                r7.L$0 = r4
                r7.L$1 = r3
                r7.I$0 = r6
                r7.label = r2
                java.lang.Object r8 = r4.yieldAll(r8, r7)
                if (r8 != r0) goto L60
                return r0
            L60:
                r1 = r6
                goto L2e
            L62:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }






    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    public static final class C00901<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.sequences.Sequence<T>> $defaultValue;
        public final /* synthetic */ kotlin.sequences.Sequence<T> $this_ifEmpty;
        private /* synthetic */ java.lang.Object L$0;
        public int label;

        public C00901(kotlin.sequences.Sequence<? extends T> r1, kotlin.jvm.functions.Function0<? extends kotlin.sequences.Sequence<? extends T>> r2, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt__SequencesKt.C00901> r3) {
                r0 = this;
                r0.$this_ifEmpty = r1
                r0.$defaultValue = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1
                kotlin.sequences.Sequence<T> r1 = r3.$this_ifEmpty
                kotlin.jvm.functions.Function0<kotlin.sequences.Sequence<T>> r2 = r3.$defaultValue
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1 r1 = (kotlin.sequences.SequencesKt__SequencesKt.C00901) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L48
            L1b:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.sequences.Sequence<T> r1 = r5.$this_ifEmpty
                java.util.Iterator r1 = r1.iterator()
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L37
                r5.label = r3
                java.lang.Object r6 = r6.yieldAll(r1, r5)
                if (r6 != r0) goto L48
                return r0
            L37:
                kotlin.jvm.functions.Function0<kotlin.sequences.Sequence<T>> r1 = r5.$defaultValue
                java.lang.Object r1 = r1.invoke()
                kotlin.sequences.Sequence r1 = (kotlin.sequences.Sequence) r1
                r5.label = r2
                java.lang.Object r6 = r6.yieldAll(r1, r5)
                if (r6 != r0) goto L48
                return r0
            L48:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$shuffled$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    public static final class C00911<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlin.random.Random $random;
        public final /* synthetic */ kotlin.sequences.Sequence<T> $this_shuffled;
        private /* synthetic */ java.lang.Object L$0;
        public java.util.List L$1;
        public int label;

        public C00911(kotlin.sequences.Sequence<? extends T> r1, kotlin.random.Random r2, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt__SequencesKt.C00911> r3) {
                r0 = this;
                r0.$this_shuffled = r1
                r0.$random = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlin.sequences.SequencesKt__SequencesKt$shuffled$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$shuffled$1
                kotlin.sequences.Sequence<T> r1 = r3.$this_shuffled
                kotlin.random.Random r2 = r3.$random
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.sequences.SequencesKt__SequencesKt$shuffled$1 r1 = (kotlin.sequences.SequencesKt__SequencesKt.C00911) r1
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
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.util.List r1 = r6.L$1
                java.lang.Object r3 = r6.L$0
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
                kotlin.ResultKt.throwOnFailure(r7)
                goto L2b
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                r3 = r7
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
                kotlin.sequences.Sequence<T> r7 = r6.$this_shuffled
                java.util.List r1 = kotlin.sequences.SequencesKt___SequencesKt.toMutableList(r7)
            L2b:
                boolean r7 = r1.isEmpty()
                r7 = r7 ^ r2
                if (r7 == 0) goto L57
                kotlin.random.Random r7 = r6.$random
                int r4 = r1.size()
                int r7 = r7.nextInt(r4)
                java.lang.Object r4 = kotlin.collections.CollectionsKt.removeLast(r1)
                int r5 = r1.size()
                if (r7 >= r5) goto L4a
                java.lang.Object r4 = r1.set(r7, r4)
            L4a:
                r6.L$0 = r3
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r7 = r3.yield(r4, r6)
                if (r7 != r0) goto L2b
                return r0
            L57:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    public SequencesKt__SequencesKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.Sequence<T> Sequence(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r1) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.SequencesKt__SequencesKt$Sequence$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$Sequence$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.Sequence<T> asSequence(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            r0.<init>(r1)
            kotlin.sequences.Sequence r1 = constrainOnce(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.Sequence<T> constrainOnce(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof kotlin.sequences.ConstrainedOnceSequence
            if (r0 == 0) goto La
            goto L10
        La:
            kotlin.sequences.ConstrainedOnceSequence r0 = new kotlin.sequences.ConstrainedOnceSequence
            r0.<init>(r1)
            r1 = r0
        L10:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.Sequence<T> emptySequence() {
            kotlin.sequences.EmptySequence r0 = kotlin.sequences.EmptySequence.INSTANCE
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C, R> kotlin.sequences.Sequence<R> flatMapIndexed(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> r4) {
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt__SequenceBuilderKt.sequence(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> flatten(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends kotlin.sequences.Sequence<? extends T>> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.SequencesKt__SequencesKt$flatten$1 r0 = kotlin.sequences.SequencesKt__SequencesKt.C00871.INSTANCE
            kotlin.sequences.Sequence r1 = flatten$SequencesKt__SequencesKt(r1, r0)
            return r1
    }

    private static final <T, R> kotlin.sequences.Sequence<R> flatten$SequencesKt__SequencesKt(kotlin.sequences.Sequence<? extends T> r2, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends R>> r3) {
            boolean r0 = r2 instanceof kotlin.sequences.TransformingSequence
            if (r0 == 0) goto Lb
            kotlin.sequences.TransformingSequence r2 = (kotlin.sequences.TransformingSequence) r2
            kotlin.sequences.Sequence r2 = r2.flatten$kotlin_stdlib(r3)
            return r2
        Lb:
            kotlin.sequences.FlatteningSequence r0 = new kotlin.sequences.FlatteningSequence
            kotlin.sequences.SequencesKt__SequencesKt$flatten$3 r1 = kotlin.sequences.SequencesKt__SequencesKt.AnonymousClass3.INSTANCE
            r0.<init>(r2, r1, r3)
            return r0
    }

    @kotlin.jvm.JvmName(name = "flattenSequenceOfIterable")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> flattenSequenceOfIterable(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends java.lang.Iterable<? extends T>> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.SequencesKt__SequencesKt$flatten$2 r0 = kotlin.sequences.SequencesKt__SequencesKt.AnonymousClass2.INSTANCE
            kotlin.sequences.Sequence r1 = flatten$SequencesKt__SequencesKt(r1, r0)
            return r1
    }

    @kotlin.internal.LowPriorityInOverloadResolution
    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.Sequence<T> generateSequence(@org.jetbrains.annotations.Nullable T r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
            java.lang.String r0 = "nextFunction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 != 0) goto La
            kotlin.sequences.EmptySequence r2 = kotlin.sequences.EmptySequence.INSTANCE
            goto L15
        La:
            kotlin.sequences.GeneratorSequence r0 = new kotlin.sequences.GeneratorSequence
            kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2 r1 = new kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            r1.<init>(r2)
            r0.<init>(r1, r3)
            r2 = r0
        L15:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> generateSequence(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "nextFunction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.sequences.GeneratorSequence r0 = new kotlin.sequences.GeneratorSequence
            kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1 r1 = new kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1
            r1.<init>(r2)
            r0.<init>(r2, r1)
            kotlin.sequences.Sequence r2 = constrainOnce(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.Sequence<T> generateSequence(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r2) {
            java.lang.String r0 = "seedFunction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "nextFunction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.sequences.GeneratorSequence r0 = new kotlin.sequences.GeneratorSequence
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> ifEmpty(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends kotlin.sequences.Sequence<? extends T>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt__SequenceBuilderKt.sequence(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> kotlin.sequences.Sequence<T> orEmpty(kotlin.sequences.Sequence<? extends T> r0) {
            if (r0 != 0) goto L6
            kotlin.sequences.Sequence r0 = emptySequence()
        L6:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> sequenceOf(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.length
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L12
            kotlin.sequences.Sequence r1 = emptySequence()
            goto L16
        L12:
            kotlin.sequences.Sequence r1 = kotlin.collections.ArraysKt.asSequence(r1)
        L16:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> shuffled(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.sequences.Sequence r1 = shuffled(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> shuffled(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.random.Random r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.sequences.SequencesKt__SequencesKt$shuffled$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$shuffled$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt__SequenceBuilderKt.sequence(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends kotlin.Pair<? extends T, ? extends R>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.getFirst()
            r0.add(r3)
            java.lang.Object r2 = r2.getSecond()
            r1.add(r2)
            goto L13
        L2e:
            kotlin.Pair r4 = kotlin.TuplesKt.to(r0, r1)
            return r4
    }
}
