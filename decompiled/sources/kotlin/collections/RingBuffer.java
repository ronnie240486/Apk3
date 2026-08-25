package kotlin.collections;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", "size", "getSize", "()I", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "expanded", "maxCapacity", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class RingBuffer<T> extends kotlin.collections.AbstractList<T> implements java.util.RandomAccess {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;


    public RingBuffer(int r2) {
            r1 = this;
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RingBuffer(@org.jetbrains.annotations.NotNull java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r2.buffer = r3
            r0 = 1
            if (r4 < 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L3a
            int r1 = r3.length
            if (r4 > r1) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1f
            int r3 = r3.length
            r2.capacity = r3
            r2.size = r4
            return
        L1f:
            java.lang.String r0 = "ring buffer filled size: "
            java.lang.String r1 = " cannot be larger than the buffer size: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r0, r4, r1)
            int r3 = r3.length
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L3a:
            java.lang.String r3 = "ring buffer filled size should not be negative but it is "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static final /* synthetic */ java.lang.Object[] access$getBuffer$p(kotlin.collections.RingBuffer r0) {
            java.lang.Object[] r0 = r0.buffer
            return r0
    }

    public static final /* synthetic */ int access$getCapacity$p(kotlin.collections.RingBuffer r0) {
            int r0 = r0.capacity
            return r0
    }

    public static final /* synthetic */ int access$getStartIndex$p(kotlin.collections.RingBuffer r0) {
            int r0 = r0.startIndex
            return r0
    }

    private final int forward(int r1, int r2) {
            r0 = this;
            int r1 = r1 + r2
            int r2 = access$getCapacity$p(r0)
            int r1 = r1 % r2
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T r4) {
            r3 = this;
            boolean r0 = r3.isFull()
            if (r0 != 0) goto L1f
            java.lang.Object[] r0 = r3.buffer
            int r1 = r3.startIndex
            int r2 = r3.size()
            int r2 = r2 + r1
            int r1 = access$getCapacity$p(r3)
            int r2 = r2 % r1
            r0[r2] = r4
            int r4 = r3.size()
            int r4 = r4 + 1
            r3.size = r4
            return
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "ring buffer is full"
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.RingBuffer<T> expanded(int r3) {
            r2 = this;
            int r0 = r2.capacity
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r0 = r0 + 1
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r0, r3)
            int r0 = r2.startIndex
            if (r0 != 0) goto L1b
            java.lang.Object[] r0 = r2.buffer
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            goto L21
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r2.toArray(r3)
        L21:
            kotlin.collections.RingBuffer r0 = new kotlin.collections.RingBuffer
            int r1 = r2.size()
            r0.<init>(r3, r1)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.size()
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            java.lang.Object[] r0 = r2.buffer
            int r1 = r2.startIndex
            int r1 = r1 + r3
            int r3 = access$getCapacity$p(r2)
            int r1 = r1 % r3
            r3 = r0[r1]
            return r3
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public final boolean isFull() {
            r2 = this;
            int r0 = r2.size()
            int r1 = r2.capacity
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.collections.RingBuffer$iterator$1 r0 = new kotlin.collections.RingBuffer$iterator$1
            r0.<init>(r1)
            return r0
    }

    public final void removeFirst(int r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r2 == 0) goto L5a
            int r2 = r6.size()
            if (r7 > r2) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L3d
            if (r7 <= 0) goto L3c
            int r0 = r6.startIndex
            int r2 = r0 + r7
            int r3 = access$getCapacity$p(r6)
            int r2 = r2 % r3
            r3 = 0
            if (r0 <= r2) goto L2e
            java.lang.Object[] r4 = r6.buffer
            int r5 = r6.capacity
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r4, r3, r0, r5)
            java.lang.Object[] r0 = r6.buffer
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r0, r3, r1, r2)
            goto L33
        L2e:
            java.lang.Object[] r1 = r6.buffer
            kotlin.collections.ArraysKt___ArraysJvmKt.fill(r1, r3, r0, r2)
        L33:
            r6.startIndex = r2
            int r0 = r6.size()
            int r0 = r0 - r7
            r6.size = r0
        L3c:
            return
        L3d:
            java.lang.String r0 = "n shouldn't be greater than the buffer size: n = "
            java.lang.String r1 = ", size = "
            java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r0, r7, r1)
            int r0 = r6.size()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L5a:
            java.lang.String r0 = "n shouldn't be negative but it is "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r7)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @org.jetbrains.annotations.NotNull
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @org.jetbrains.annotations.NotNull
    public <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r6) {
            r5 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.length
            int r1 = r5.size()
            if (r0 >= r1) goto L19
            int r0 = r5.size()
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
        L19:
            int r0 = r5.size()
            int r1 = r5.startIndex
            r2 = 0
            r3 = 0
        L21:
            if (r3 >= r0) goto L32
            int r4 = r5.capacity
            if (r1 >= r4) goto L32
            java.lang.Object[] r4 = r5.buffer
            r4 = r4[r1]
            r6[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L21
        L32:
            if (r3 >= r0) goto L3f
            java.lang.Object[] r1 = r5.buffer
            r1 = r1[r2]
            r6[r3] = r1
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L32
        L3f:
            int r0 = r6.length
            int r1 = r5.size()
            if (r0 <= r1) goto L4d
            int r0 = r5.size()
            r1 = 0
            r6[r0] = r1
        L4d:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r0)
            return r6
    }
}
