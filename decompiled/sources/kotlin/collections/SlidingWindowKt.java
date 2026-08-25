package kotlin.collections;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.List<? extends T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ java.util.Iterator<T> $iterator;
        public final /* synthetic */ boolean $partialWindows;
        public final /* synthetic */ boolean $reuseBuffer;
        public final /* synthetic */ int $size;
        public final /* synthetic */ int $step;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public java.lang.Object L$1;
        public java.util.Iterator L$2;
        public int label;

        public AnonymousClass1(int r1, int r2, java.util.Iterator<? extends T> r3, boolean r4, boolean r5, kotlin.coroutines.Continuation<? super kotlin.collections.SlidingWindowKt.AnonymousClass1> r6) {
                r0 = this;
                r0.$size = r1
                r0.$step = r2
                r0.$iterator = r3
                r0.$reuseBuffer = r4
                r0.$partialWindows = r5
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r7 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
                int r1 = r8.$size
                int r2 = r8.$step
                java.util.Iterator<T> r3 = r8.$iterator
                boolean r4 = r8.$reuseBuffer
                boolean r5 = r8.$partialWindows
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.L$0 = r9
                return r7
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
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super java.util.List<? extends T>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r1 = (kotlin.collections.SlidingWindowKt.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                r3 = 2
                r4 = 3
                r5 = 4
                r6 = 5
                r7 = 1
                if (r1 == 0) goto L56
                if (r1 == r7) goto L44
                if (r1 == r3) goto L3f
                if (r1 == r4) goto L2f
                if (r1 == r5) goto L21
                if (r1 != r6) goto L19
                goto L3f
            L19:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L21:
                java.lang.Object r1 = r12.L$1
                kotlin.collections.RingBuffer r1 = (kotlin.collections.RingBuffer) r1
                java.lang.Object r3 = r12.L$0
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r12
                goto L149
            L2f:
                java.util.Iterator r1 = r12.L$2
                java.lang.Object r3 = r12.L$1
                kotlin.collections.RingBuffer r3 = (kotlin.collections.RingBuffer) r3
                java.lang.Object r8 = r12.L$0
                kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r12
                goto L11b
            L3f:
                kotlin.ResultKt.throwOnFailure(r13)
                goto L165
            L44:
                int r1 = r12.I$0
                java.util.Iterator r4 = r12.L$2
                java.lang.Object r5 = r12.L$1
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.lang.Object r6 = r12.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r12
                r8 = r1
                goto La4
            L56:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
                int r1 = r12.$size
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r8)
                int r8 = r12.$step
                int r9 = r12.$size
                int r8 = r8 - r9
                if (r8 < 0) goto Ld8
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r1)
                r1 = 0
                java.util.Iterator<T> r5 = r12.$iterator
                r6 = r13
                r13 = r12
                r11 = r5
                r5 = r4
                r4 = r11
            L79:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto Lb6
                java.lang.Object r9 = r4.next()
                if (r1 <= 0) goto L88
                int r1 = r1 + (-1)
                goto L79
            L88:
                r5.add(r9)
                int r9 = r5.size()
                int r10 = r13.$size
                if (r9 != r10) goto L79
                r13.L$0 = r6
                r13.L$1 = r5
                r13.L$2 = r4
                r13.I$0 = r8
                r13.label = r7
                java.lang.Object r1 = r6.yield(r5, r13)
                if (r1 != r0) goto La4
                return r0
            La4:
                boolean r1 = r13.$reuseBuffer
                if (r1 == 0) goto Lac
                r5.clear()
                goto Lb4
            Lac:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r5 = r13.$size
                r1.<init>(r5)
                r5 = r1
            Lb4:
                r1 = r8
                goto L79
            Lb6:
                boolean r1 = r5.isEmpty()
                r1 = r1 ^ r7
                if (r1 == 0) goto L165
                boolean r1 = r13.$partialWindows
                if (r1 != 0) goto Lc9
                int r1 = r5.size()
                int r4 = r13.$size
                if (r1 != r4) goto L165
            Lc9:
                r13.L$0 = r2
                r13.L$1 = r2
                r13.L$2 = r2
                r13.label = r3
                java.lang.Object r13 = r6.yield(r5, r13)
                if (r13 != r0) goto L165
                return r0
            Ld8:
                kotlin.collections.RingBuffer r3 = new kotlin.collections.RingBuffer
                r3.<init>(r1)
                java.util.Iterator<T> r1 = r12.$iterator
                r8 = r13
                r13 = r12
            Le1:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L121
                java.lang.Object r9 = r1.next()
                r3.add(r9)
                boolean r9 = r3.isFull()
                if (r9 == 0) goto Le1
                int r9 = r3.size()
                int r10 = r13.$size
                if (r9 >= r10) goto L101
                kotlin.collections.RingBuffer r3 = r3.expanded(r10)
                goto Le1
            L101:
                boolean r9 = r13.$reuseBuffer
                if (r9 == 0) goto L107
                r9 = r3
                goto L10c
            L107:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r3)
            L10c:
                r13.L$0 = r8
                r13.L$1 = r3
                r13.L$2 = r1
                r13.label = r4
                java.lang.Object r9 = r8.yield(r9, r13)
                if (r9 != r0) goto L11b
                return r0
            L11b:
                int r9 = r13.$step
                r3.removeFirst(r9)
                goto Le1
            L121:
                boolean r1 = r13.$partialWindows
                if (r1 == 0) goto L165
                r1 = r3
                r3 = r8
            L127:
                int r4 = r1.size()
                int r8 = r13.$step
                if (r4 <= r8) goto L14f
                boolean r4 = r13.$reuseBuffer
                if (r4 == 0) goto L135
                r4 = r1
                goto L13a
            L135:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r1)
            L13a:
                r13.L$0 = r3
                r13.L$1 = r1
                r13.L$2 = r2
                r13.label = r5
                java.lang.Object r4 = r3.yield(r4, r13)
                if (r4 != r0) goto L149
                return r0
            L149:
                int r4 = r13.$step
                r1.removeFirst(r4)
                goto L127
            L14f:
                boolean r4 = r1.isEmpty()
                r4 = r4 ^ r7
                if (r4 == 0) goto L165
                r13.L$0 = r2
                r13.L$1 = r2
                r13.L$2 = r2
                r13.label = r6
                java.lang.Object r13 = r3.yield(r1, r13)
                if (r13 != r0) goto L165
                return r0
            L165:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
        }
    }

    public static final void checkWindowSizeStep(int r3, int r4) {
            if (r3 <= 0) goto L6
            if (r4 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L3b
            java.lang.String r0 = " must be greater than zero."
            if (r3 == r4) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Both size "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " and step "
            r1.append(r3)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            goto L31
        L2a:
            java.lang.String r4 = "size "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r3, r0)
        L31:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L3b:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<java.util.List<T>> windowedIterator(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r8, int r9, int r10, boolean r11, boolean r12) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto Le
            kotlin.collections.EmptyIterator r8 = kotlin.collections.EmptyIterator.INSTANCE
            return r8
        Le:
            kotlin.collections.SlidingWindowKt$windowedIterator$1 r7 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
            r6 = 0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r12
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.Iterator r8 = kotlin.sequences.SequencesKt.iterator(r7)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<java.util.List<T>> windowedSequence(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r7, int r8, int r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            checkWindowSizeStep(r8, r9)
            kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1 r0 = new kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }
}
