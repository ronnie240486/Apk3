package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "transform", "Lkotlin/Function2;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MergingSequence<T1, T2, V> implements kotlin.sequences.Sequence<V> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.Sequence<T1> sequence1;

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.Sequence<T2> sequence2;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<T1, T2, V> transform;

    /* JADX INFO: renamed from: kotlin.sequences.MergingSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "iterator1", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<V>, kotlin.jvm.internal.markers.KMappedMarker {

        @org.jetbrains.annotations.NotNull
        private final java.util.Iterator<T1> iterator1;

        @org.jetbrains.annotations.NotNull
        private final java.util.Iterator<T2> iterator2;
        public final /* synthetic */ kotlin.sequences.MergingSequence<T1, T2, V> this$0;

        public AnonymousClass1(kotlin.sequences.MergingSequence<T1, T2, V> r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                kotlin.sequences.Sequence r0 = kotlin.sequences.MergingSequence.access$getSequence1$p(r2)
                java.util.Iterator r0 = r0.iterator()
                r1.iterator1 = r0
                kotlin.sequences.Sequence r2 = kotlin.sequences.MergingSequence.access$getSequence2$p(r2)
                java.util.Iterator r2 = r2.iterator()
                r1.iterator2 = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Iterator<T1> getIterator1() {
                r1 = this;
                java.util.Iterator<T1> r0 = r1.iterator1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Iterator<T2> getIterator2() {
                r1 = this;
                java.util.Iterator<T2> r0 = r1.iterator2
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T1> r0 = r1.iterator1
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L12
                java.util.Iterator<T2> r0 = r1.iterator2
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // java.util.Iterator
        public V next() {
                r3 = this;
                kotlin.sequences.MergingSequence<T1, T2, V> r0 = r3.this$0
                kotlin.jvm.functions.Function2 r0 = kotlin.sequences.MergingSequence.access$getTransform$p(r0)
                java.util.Iterator<T1> r1 = r3.iterator1
                java.lang.Object r1 = r1.next()
                java.util.Iterator<T2> r2 = r3.iterator2
                java.lang.Object r2 = r2.next()
                java.lang.Object r0 = r0.invoke(r1, r2)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public MergingSequence(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends V> r4) {
            r1 = this;
            java.lang.String r0 = "sequence1"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "sequence2"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.sequence1 = r2
            r1.sequence2 = r3
            r1.transform = r4
            return
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence1$p(kotlin.sequences.MergingSequence r0) {
            kotlin.sequences.Sequence<T1> r0 = r0.sequence1
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence2$p(kotlin.sequences.MergingSequence r0) {
            kotlin.sequences.Sequence<T2> r0 = r0.sequence2
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$getTransform$p(kotlin.sequences.MergingSequence r0) {
            kotlin.jvm.functions.Function2<T1, T2, V> r0 = r0.transform
            return r0
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<V> iterator() {
            r1 = this;
            kotlin.sequences.MergingSequence$iterator$1 r0 = new kotlin.sequences.MergingSequence$iterator$1
            r0.<init>(r1)
            return r0
    }
}
