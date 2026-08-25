package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FilteringSequence<T> implements kotlin.sequences.Sequence<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> predicate;
    private final boolean sendWhen;

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.Sequence<T> sequence;

    /* JADX INFO: renamed from: kotlin.sequences.FilteringSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

        @org.jetbrains.annotations.NotNull
        private final java.util.Iterator<T> iterator;

        @org.jetbrains.annotations.Nullable
        private T nextItem;
        private int nextState;
        public final /* synthetic */ kotlin.sequences.FilteringSequence<T> this$0;

        public AnonymousClass1(kotlin.sequences.FilteringSequence<T> r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                kotlin.sequences.Sequence r1 = kotlin.sequences.FilteringSequence.access$getSequence$p(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.iterator = r1
                r1 = -1
                r0.nextState = r1
                return
        }

        private final void calcNext() {
                r3 = this;
            L0:
                java.util.Iterator<T> r0 = r3.iterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L2c
                java.util.Iterator<T> r0 = r3.iterator
                java.lang.Object r0 = r0.next()
                kotlin.sequences.FilteringSequence<T> r1 = r3.this$0
                kotlin.jvm.functions.Function1 r1 = kotlin.sequences.FilteringSequence.access$getPredicate$p(r1)
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                kotlin.sequences.FilteringSequence<T> r2 = r3.this$0
                boolean r2 = kotlin.sequences.FilteringSequence.access$getSendWhen$p(r2)
                if (r1 != r2) goto L0
                r3.nextItem = r0
                r0 = 1
                r3.nextState = r0
                return
            L2c:
                r0 = 0
                r3.nextState = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Iterator<T> getIterator() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iterator
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final T getNextItem() {
                r1 = this;
                T r0 = r1.nextItem
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
        public T next() {
                r3 = this;
                int r0 = r3.nextState
                r1 = -1
                if (r0 != r1) goto L8
                r3.calcNext()
            L8:
                int r0 = r3.nextState
                if (r0 == 0) goto L14
                T r0 = r3.nextItem
                r2 = 0
                r3.nextItem = r2
                r3.nextState = r1
                return r0
            L14:
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

        public final void setNextItem(@org.jetbrains.annotations.Nullable T r1) {
                r0 = this;
                r0.nextItem = r1
                return
        }

        public final void setNextState(int r1) {
                r0 = this;
                r0.nextState = r1
                return
        }
    }

    public FilteringSequence(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.sequence = r2
            r1.sendWhen = r3
            r1.predicate = r4
            return
    }

    public /* synthetic */ FilteringSequence(kotlin.sequences.Sequence r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r2 = 1
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getPredicate$p(kotlin.sequences.FilteringSequence r0) {
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r0 = r0.predicate
            return r0
    }

    public static final /* synthetic */ boolean access$getSendWhen$p(kotlin.sequences.FilteringSequence r0) {
            boolean r0 = r0.sendWhen
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence$p(kotlin.sequences.FilteringSequence r0) {
            kotlin.sequences.Sequence<T> r0 = r0.sequence
            return r0
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.FilteringSequence$iterator$1 r0 = new kotlin.sequences.FilteringSequence$iterator$1
            r0.<init>(r1)
            return r0
    }
}
