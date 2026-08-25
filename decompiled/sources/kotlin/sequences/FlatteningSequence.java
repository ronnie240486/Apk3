package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0096\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FlatteningSequence<T, R, E> implements kotlin.sequences.Sequence<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<R, java.util.Iterator<E>> iterator;

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.Sequence<T> sequence;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, R> transformer;

    /* JADX INFO: renamed from: kotlin.sequences.FlatteningSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {

        @org.jetbrains.annotations.Nullable
        private java.util.Iterator<? extends E> itemIterator;

        @org.jetbrains.annotations.NotNull
        private final java.util.Iterator<T> iterator;
        public final /* synthetic */ kotlin.sequences.FlatteningSequence<T, R, E> this$0;

        public AnonymousClass1(kotlin.sequences.FlatteningSequence<T, R, E> r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                kotlin.sequences.Sequence r1 = kotlin.sequences.FlatteningSequence.access$getSequence$p(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.iterator = r1
                return
        }

        private final boolean ensureItemIterator() {
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.itemIterator
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.itemIterator = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.itemIterator
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.iterator
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.iterator
                java.lang.Object r0 = r0.next()
                kotlin.sequences.FlatteningSequence<T, R, E> r3 = r5.this$0
                kotlin.jvm.functions.Function1 r3 = kotlin.sequences.FlatteningSequence.access$getIterator$p(r3)
                kotlin.sequences.FlatteningSequence<T, R, E> r4 = r5.this$0
                kotlin.jvm.functions.Function1 r4 = kotlin.sequences.FlatteningSequence.access$getTransformer$p(r4)
                java.lang.Object r0 = r4.invoke(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.itemIterator = r0
            L45:
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.util.Iterator<E> getItemIterator() {
                r1 = this;
                java.util.Iterator<? extends E> r0 = r1.itemIterator
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Iterator<T> getIterator() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iterator
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.ensureItemIterator()
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r1 = this;
                boolean r0 = r1.ensureItemIterator()
                if (r0 == 0) goto L10
                java.util.Iterator<? extends E> r0 = r1.itemIterator
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.Object r0 = r0.next()
                return r0
            L10:
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

        public final void setItemIterator(@org.jetbrains.annotations.Nullable java.util.Iterator<? extends E> r1) {
                r0 = this;
                r0.itemIterator = r1
                return
        }
    }

    public FlatteningSequence(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super R, ? extends java.util.Iterator<? extends E>> r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transformer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.sequence = r2
            r1.transformer = r3
            r1.iterator = r4
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getIterator$p(kotlin.sequences.FlatteningSequence r0) {
            kotlin.jvm.functions.Function1<R, java.util.Iterator<E>> r0 = r0.iterator
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence$p(kotlin.sequences.FlatteningSequence r0) {
            kotlin.sequences.Sequence<T> r0 = r0.sequence
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getTransformer$p(kotlin.sequences.FlatteningSequence r0) {
            kotlin.jvm.functions.Function1<T, R> r0 = r0.transformer
            return r0
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.sequences.FlatteningSequence$iterator$1 r0 = new kotlin.sequences.FlatteningSequence$iterator$1
            r0.<init>(r1)
            return r0
    }
}
