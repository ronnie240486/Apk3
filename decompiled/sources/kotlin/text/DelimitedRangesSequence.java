package kotlin.text;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class DelimitedRangesSequence implements kotlin.sequences.Sequence<kotlin.ranges.IntRange> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> getNextMatch;

    @org.jetbrains.annotations.NotNull
    private final java.lang.CharSequence input;
    private final int limit;
    private final int startIndex;

    /* JADX INFO: renamed from: kotlin.text.DelimitedRangesSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Strings.kt */
    @kotlin.Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<kotlin.ranges.IntRange>, kotlin.jvm.internal.markers.KMappedMarker {
        private int counter;
        private int currentStartIndex;

        @org.jetbrains.annotations.Nullable
        private kotlin.ranges.IntRange nextItem;
        private int nextSearchIndex;
        private int nextState;
        public final /* synthetic */ kotlin.text.DelimitedRangesSequence this$0;

        public AnonymousClass1(kotlin.text.DelimitedRangesSequence r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = -1
                r1.nextState = r0
                int r0 = kotlin.text.DelimitedRangesSequence.access$getStartIndex$p(r2)
                java.lang.CharSequence r2 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r2)
                int r2 = r2.length()
                int r2 = kotlin.ranges.RangesKt.coerceIn(r0, r2)
                r1.currentStartIndex = r2
                r1.nextSearchIndex = r2
                return
        }

        private final void calcNext() {
                r6 = this;
                int r0 = r6.nextSearchIndex
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.nextState = r1
                r0 = 0
                r6.nextItem = r0
                goto L9e
            Lc:
                kotlin.text.DelimitedRangesSequence r0 = r6.this$0
                int r0 = kotlin.text.DelimitedRangesSequence.access$getLimit$p(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.counter
                int r0 = r0 + r3
                r6.counter = r0
                kotlin.text.DelimitedRangesSequence r4 = r6.this$0
                int r4 = kotlin.text.DelimitedRangesSequence.access$getLimit$p(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.nextSearchIndex
                kotlin.text.DelimitedRangesSequence r4 = r6.this$0
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.currentStartIndex
                kotlin.text.DelimitedRangesSequence r4 = r6.this$0
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r4)
                int r4 = kotlin.text.StringsKt__StringsKt.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.nextItem = r0
                r6.nextSearchIndex = r2
                goto L9c
            L47:
                kotlin.text.DelimitedRangesSequence r0 = r6.this$0
                kotlin.jvm.functions.Function2 r0 = kotlin.text.DelimitedRangesSequence.access$getGetNextMatch$p(r0)
                kotlin.text.DelimitedRangesSequence r4 = r6.this$0
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r4)
                int r5 = r6.nextSearchIndex
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.currentStartIndex
                kotlin.text.DelimitedRangesSequence r4 = r6.this$0
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r4)
                int r4 = kotlin.text.StringsKt__StringsKt.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.nextItem = r0
                r6.nextSearchIndex = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.currentStartIndex
                kotlin.ranges.IntRange r4 = kotlin.ranges.RangesKt.until(r4, r2)
                r6.nextItem = r4
                int r2 = r2 + r0
                r6.currentStartIndex = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.nextSearchIndex = r2
            L9c:
                r6.nextState = r3
            L9e:
                return
        }

        public final int getCounter() {
                r1 = this;
                int r0 = r1.counter
                return r0
        }

        public final int getCurrentStartIndex() {
                r1 = this;
                int r0 = r1.currentStartIndex
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.ranges.IntRange getNextItem() {
                r1 = this;
                kotlin.ranges.IntRange r0 = r1.nextItem
                return r0
        }

        public final int getNextSearchIndex() {
                r1 = this;
                int r0 = r1.nextSearchIndex
                return r0
        }

        public final int getNextState() {
                r1 = this;
                int r0 = r1.nextState
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.nextState
                r1 = -1
                if (r0 != r1) goto L8
                r2.calcNext()
            L8:
                int r0 = r2.nextState
                r1 = 1
                if (r0 != r1) goto Le
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ kotlin.ranges.IntRange next() {
                r1 = this;
                kotlin.ranges.IntRange r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public kotlin.ranges.IntRange next2() {
                r3 = this;
                int r0 = r3.nextState
                r1 = -1
                if (r0 != r1) goto L8
                r3.calcNext()
            L8:
                int r0 = r3.nextState
                if (r0 == 0) goto L19
                kotlin.ranges.IntRange r0 = r3.nextItem
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.ranges.IntRange"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
                r2 = 0
                r3.nextItem = r2
                r3.nextState = r1
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        public final void setCounter(int r1) {
                r0 = this;
                r0.counter = r1
                return
        }

        public final void setCurrentStartIndex(int r1) {
                r0 = this;
                r0.currentStartIndex = r1
                return
        }

        public final void setNextItem(@org.jetbrains.annotations.Nullable kotlin.ranges.IntRange r1) {
                r0 = this;
                r0.nextItem = r1
                return
        }

        public final void setNextSearchIndex(int r1) {
                r0 = this;
                r0.nextSearchIndex = r1
                return
        }

        public final void setNextState(int r1) {
                r0 = this;
                r0.nextState = r1
                return
        }
    }

    public DelimitedRangesSequence(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, int r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r5) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "getNextMatch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.input = r2
            r1.startIndex = r3
            r1.limit = r4
            r1.getNextMatch = r5
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$getGetNextMatch$p(kotlin.text.DelimitedRangesSequence r0) {
            kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r0.getNextMatch
            return r0
    }

    public static final /* synthetic */ java.lang.CharSequence access$getInput$p(kotlin.text.DelimitedRangesSequence r0) {
            java.lang.CharSequence r0 = r0.input
            return r0
    }

    public static final /* synthetic */ int access$getLimit$p(kotlin.text.DelimitedRangesSequence r0) {
            int r0 = r0.limit
            return r0
    }

    public static final /* synthetic */ int access$getStartIndex$p(kotlin.text.DelimitedRangesSequence r0) {
            int r0 = r0.startIndex
            return r0
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.ranges.IntRange> iterator() {
            r1 = this;
            kotlin.text.DelimitedRangesSequence$iterator$1 r0 = new kotlin.text.DelimitedRangesSequence$iterator$1
            r0.<init>(r1)
            return r0
    }
}
