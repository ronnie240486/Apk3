package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SubSequence<T> implements kotlin.sequences.Sequence<T>, kotlin.sequences.DropTakeSequence<T> {
    private final int endIndex;

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.Sequence<T> sequence;
    private final int startIndex;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

        @org.jetbrains.annotations.NotNull
        private final java.util.Iterator<T> iterator;
        private int position;
        public final /* synthetic */ kotlin.sequences.SubSequence<T> this$0;

        public AnonymousClass1(kotlin.sequences.SubSequence<T> r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                kotlin.sequences.Sequence r1 = kotlin.sequences.SubSequence.access$getSequence$p(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.iterator = r1
                return
        }

        private final void drop() {
                r2 = this;
            L0:
                int r0 = r2.position
                kotlin.sequences.SubSequence<T> r1 = r2.this$0
                int r1 = kotlin.sequences.SubSequence.access$getStartIndex$p(r1)
                if (r0 >= r1) goto L1e
                java.util.Iterator<T> r0 = r2.iterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1e
                java.util.Iterator<T> r0 = r2.iterator
                r0.next()
                int r0 = r2.position
                int r0 = r0 + 1
                r2.position = r0
                goto L0
            L1e:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Iterator<T> getIterator() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iterator
                return r0
        }

        public final int getPosition() {
                r1 = this;
                int r0 = r1.position
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                r2.drop()
                int r0 = r2.position
                kotlin.sequences.SubSequence<T> r1 = r2.this$0
                int r1 = kotlin.sequences.SubSequence.access$getEndIndex$p(r1)
                if (r0 >= r1) goto L17
                java.util.Iterator<T> r0 = r2.iterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                r2.drop()
                int r0 = r2.position
                kotlin.sequences.SubSequence<T> r1 = r2.this$0
                int r1 = kotlin.sequences.SubSequence.access$getEndIndex$p(r1)
                if (r0 >= r1) goto L1a
                int r0 = r2.position
                int r0 = r0 + 1
                r2.position = r0
                java.util.Iterator<T> r0 = r2.iterator
                java.lang.Object r0 = r0.next()
                return r0
            L1a:
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

        public final void setPosition(int r1) {
                r0 = this;
                r0.position = r1
                return
        }
    }

    public SubSequence(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.sequence = r2
            r1.startIndex = r3
            r1.endIndex = r4
            r2 = 1
            if (r3 < 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L47
            if (r4 < 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L37
            if (r4 < r3) goto L21
            goto L22
        L21:
            r2 = 0
        L22:
            if (r2 == 0) goto L25
            return
        L25:
            java.lang.String r2 = "endIndex should be not less than startIndex, but was "
            java.lang.String r0 = " < "
            java.lang.String r2 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r2, r4, r0, r3)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L37:
            java.lang.String r2 = "endIndex should be non-negative, but is "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L47:
            java.lang.String r2 = "startIndex should be non-negative, but is "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final /* synthetic */ int access$getEndIndex$p(kotlin.sequences.SubSequence r0) {
            int r0 = r0.endIndex
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence$p(kotlin.sequences.SubSequence r0) {
            kotlin.sequences.Sequence<T> r0 = r0.sequence
            return r0
    }

    public static final /* synthetic */ int access$getStartIndex$p(kotlin.sequences.SubSequence r0) {
            int r0 = r0.startIndex
            return r0
    }

    private final int getCount() {
            r2 = this;
            int r0 = r2.endIndex
            int r1 = r2.startIndex
            int r0 = r0 - r1
            return r0
    }

    @Override // kotlin.sequences.DropTakeSequence
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.Sequence<T> drop(int r4) {
            r3 = this;
            int r0 = r3.getCount()
            if (r4 < r0) goto Lb
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt__SequencesKt.emptySequence()
            goto L18
        Lb:
            kotlin.sequences.SubSequence r0 = new kotlin.sequences.SubSequence
            kotlin.sequences.Sequence<T> r1 = r3.sequence
            int r2 = r3.startIndex
            int r2 = r2 + r4
            int r4 = r3.endIndex
            r0.<init>(r1, r2, r4)
            r4 = r0
        L18:
            return r4
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.SubSequence$iterator$1 r0 = new kotlin.sequences.SubSequence$iterator$1
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.sequences.DropTakeSequence
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.Sequence<T> take(int r4) {
            r3 = this;
            int r0 = r3.getCount()
            if (r4 < r0) goto L8
            r0 = r3
            goto L12
        L8:
            kotlin.sequences.SubSequence r0 = new kotlin.sequences.SubSequence
            kotlin.sequences.Sequence<T> r1 = r3.sequence
            int r2 = r3.startIndex
            int r4 = r4 + r2
            r0.<init>(r1, r2, r4)
        L12:
            return r0
    }
}
