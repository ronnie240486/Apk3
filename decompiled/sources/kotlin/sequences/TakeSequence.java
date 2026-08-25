package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TakeSequence<T> implements kotlin.sequences.Sequence<T>, kotlin.sequences.DropTakeSequence<T> {
    private final int count;

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.Sequence<T> sequence;

    /* JADX INFO: renamed from: kotlin.sequences.TakeSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

        @org.jetbrains.annotations.NotNull
        private final java.util.Iterator<T> iterator;
        private int left;

        public AnonymousClass1(kotlin.sequences.TakeSequence<T> r2) {
                r1 = this;
                r1.<init>()
                int r0 = kotlin.sequences.TakeSequence.access$getCount$p(r2)
                r1.left = r0
                kotlin.sequences.Sequence r2 = kotlin.sequences.TakeSequence.access$getSequence$p(r2)
                java.util.Iterator r2 = r2.iterator()
                r1.iterator = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Iterator<T> getIterator() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iterator
                return r0
        }

        public final int getLeft() {
                r1 = this;
                int r0 = r1.left
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.left
                if (r0 <= 0) goto Le
                java.util.Iterator<T> r0 = r1.iterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                int r0 = r1.left
                if (r0 == 0) goto Lf
                int r0 = r0 + (-1)
                r1.left = r0
                java.util.Iterator<T> r0 = r1.iterator
                java.lang.Object r0 = r0.next()
                return r0
            Lf:
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

        public final void setLeft(int r1) {
                r0 = this;
                r0.left = r1
                return
        }
    }

    public TakeSequence(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.sequence = r2
            r1.count = r3
            if (r3 < 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L14
            return
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "count must be non-negative, but was "
            r2.append(r0)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final /* synthetic */ int access$getCount$p(kotlin.sequences.TakeSequence r0) {
            int r0 = r0.count
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence$p(kotlin.sequences.TakeSequence r0) {
            kotlin.sequences.Sequence<T> r0 = r0.sequence
            return r0
    }

    @Override // kotlin.sequences.DropTakeSequence
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.Sequence<T> drop(int r4) {
            r3 = this;
            int r0 = r3.count
            if (r4 < r0) goto L9
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt__SequencesKt.emptySequence()
            goto L11
        L9:
            kotlin.sequences.SubSequence r1 = new kotlin.sequences.SubSequence
            kotlin.sequences.Sequence<T> r2 = r3.sequence
            r1.<init>(r2, r4, r0)
            r4 = r1
        L11:
            return r4
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.TakeSequence$iterator$1 r0 = new kotlin.sequences.TakeSequence$iterator$1
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.sequences.DropTakeSequence
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.Sequence<T> take(int r3) {
            r2 = this;
            int r0 = r2.count
            if (r3 < r0) goto L6
            r0 = r2
            goto Ld
        L6:
            kotlin.sequences.TakeSequence r0 = new kotlin.sequences.TakeSequence
            kotlin.sequences.Sequence<T> r1 = r2.sequence
            r0.<init>(r1, r3)
        Ld:
            return r0
    }
}
