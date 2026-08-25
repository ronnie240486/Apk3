package kotlin.sequences;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class GeneratorSequence<T> implements kotlin.sequences.Sequence<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<T> getInitialValue;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, T> getNextValue;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

        @org.jetbrains.annotations.Nullable
        private T nextItem;
        private int nextState;
        public final /* synthetic */ kotlin.sequences.GeneratorSequence<T> this$0;

        public AnonymousClass1(kotlin.sequences.GeneratorSequence<T> r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -2
                r0.nextState = r1
                return
        }

        private final void calcNext() {
                r2 = this;
                int r0 = r2.nextState
                r1 = -2
                if (r0 != r1) goto L10
                kotlin.sequences.GeneratorSequence<T> r0 = r2.this$0
                kotlin.jvm.functions.Function0 r0 = kotlin.sequences.GeneratorSequence.access$getGetInitialValue$p(r0)
                java.lang.Object r0 = r0.invoke()
                goto L1f
            L10:
                kotlin.sequences.GeneratorSequence<T> r0 = r2.this$0
                kotlin.jvm.functions.Function1 r0 = kotlin.sequences.GeneratorSequence.access$getGetNextValue$p(r0)
                T r1 = r2.nextItem
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                java.lang.Object r0 = r0.invoke(r1)
            L1f:
                r2.nextItem = r0
                if (r0 != 0) goto L25
                r0 = 0
                goto L26
            L25:
                r0 = 1
            L26:
                r2.nextState = r0
                return
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
                if (r0 >= 0) goto L7
                r2.calcNext()
            L7:
                int r0 = r2.nextState
                r1 = 1
                if (r0 != r1) goto Ld
                goto Le
            Ld:
                r1 = 0
            Le:
                return r1
        }

        @Override // java.util.Iterator
        @org.jetbrains.annotations.NotNull
        public T next() {
                r2 = this;
                int r0 = r2.nextState
                if (r0 >= 0) goto L7
                r2.calcNext()
            L7:
                int r0 = r2.nextState
                if (r0 == 0) goto L16
                T r0 = r2.nextItem
                java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                r1 = -1
                r2.nextState = r1
                return r0
            L16:
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

    public GeneratorSequence(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "getInitialValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "getNextValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.getInitialValue = r2
            r1.getNextValue = r3
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$getGetInitialValue$p(kotlin.sequences.GeneratorSequence r0) {
            kotlin.jvm.functions.Function0<T> r0 = r0.getInitialValue
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getGetNextValue$p(kotlin.sequences.GeneratorSequence r0) {
            kotlin.jvm.functions.Function1<T, T> r0 = r0.getNextValue
            return r0
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.GeneratorSequence$iterator$1 r0 = new kotlin.sequences.GeneratorSequence$iterator$1
            r0.<init>(r1)
            return r0
    }
}
