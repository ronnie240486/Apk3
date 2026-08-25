package kotlin.collections;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001b\u001c\u001d\u001eJ\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "", "equals", "hashCode", "getSize", "()I", "size", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractList<E> extends kotlin.collections.AbstractCollection<E> implements java.util.List<E> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.AbstractList.Companion Companion = null;

    /* JADX INFO: compiled from: AbstractList.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012J%\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0002\b\u0018J\u0019\u0010\u0019\u001a\u00020\u00062\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "checkBoundsIndexes", "", "startIndex", "", "endIndex", "size", "checkBoundsIndexes$kotlin_stdlib", "checkElementIndex", "index", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int r5, int r6, int r7) {
                r4 = this;
                java.lang.String r0 = "startIndex: "
                if (r5 < 0) goto L16
                if (r6 > r7) goto L16
                if (r5 > r6) goto La
                return
            La:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r1 = " > endIndex: "
                java.lang.String r5 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r0, r5, r1, r6)
                r7.<init>(r5)
                throw r7
            L16:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.String r2 = ", endIndex: "
                java.lang.String r3 = ", size: "
                java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5, r2, r6, r3)
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                r1.<init>(r5)
                throw r1
        }

        public final void checkElementIndex$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 >= r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "index: "
                java.lang.String r2 = ", size: "
                java.lang.String r4 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r1, r4, r2, r5)
                r0.<init>(r4)
                throw r0
        }

        public final void checkPositionIndex$kotlin_stdlib(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 > r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "index: "
                java.lang.String r2 = ", size: "
                java.lang.String r4 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r1, r4, r2, r5)
                r0.<init>(r4)
                throw r0
        }

        public final void checkRangeIndexes$kotlin_stdlib(int r5, int r6, int r7) {
                r4 = this;
                java.lang.String r0 = "fromIndex: "
                if (r5 < 0) goto L15
                if (r6 > r7) goto L15
                if (r5 > r6) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r1 = " > toIndex: "
                java.lang.String r5 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r0, r5, r1, r6)
                r7.<init>(r5)
                throw r7
            L15:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.String r2 = ", toIndex: "
                java.lang.String r3 = ", size: "
                java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5, r2, r6, r3)
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                r1.<init>(r5)
                throw r1
        }

        public final boolean orderedEquals$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4, @org.jetbrains.annotations.NotNull java.util.Collection<?> r5) {
                r3 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r0 == r1) goto L16
                return r2
            L16:
                java.util.Iterator r5 = r5.iterator()
                java.util.Iterator r4 = r4.iterator()
            L1e:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L33
                java.lang.Object r0 = r4.next()
                java.lang.Object r1 = r5.next()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 != 0) goto L1e
                return r2
            L33:
                r4 = 1
                return r4
        }

        public final int orderedHashCode$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Collection<?> r3) {
                r2 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.util.Iterator r3 = r3.iterator()
                r0 = 1
            La:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r3.next()
                int r0 = r0 * 31
                if (r1 == 0) goto L1d
                int r1 = r1.hashCode()
                goto L1e
            L1d:
                r1 = 0
            L1e:
                int r0 = r0 + r1
                goto La
            L20:
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public class IteratorImpl implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
        private int index;
        public final /* synthetic */ kotlin.collections.AbstractList<E> this$0;

        public IteratorImpl(kotlin.collections.AbstractList r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public final int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                kotlin.collections.AbstractList<E> r1 = r2.this$0
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L13
                kotlin.collections.AbstractList<E> r0 = r3.this$0
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
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

        public final void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public class ListIteratorImpl extends kotlin.collections.AbstractList<E>.IteratorImpl implements java.util.ListIterator<E> {
        public final /* synthetic */ kotlin.collections.AbstractList<E> this$0;

        public ListIteratorImpl(kotlin.collections.AbstractList r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r2 = r2.size()
                r0.checkPositionIndex$kotlin_stdlib(r3, r2)
                r1.setIndex(r3)
                return
        }

        @Override // java.util.ListIterator
        public void add(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.getIndex()
                if (r0 <= 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.getIndex()
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                boolean r0 = r2.hasPrevious()
                if (r0 == 0) goto L1a
                kotlin.collections.AbstractList<E> r0 = r2.this$0
                int r1 = r2.getIndex()
                int r1 = r1 + (-1)
                r2.setIndex(r1)
                int r1 = r2.getIndex()
                java.lang.Object r0 = r0.get(r1)
                return r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.getIndex()
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator
        public void set(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SubList<E> extends kotlin.collections.AbstractList<E> implements java.util.RandomAccess {
        private int _size;
        private final int fromIndex;

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.AbstractList<E> list;

        public SubList(@org.jetbrains.annotations.NotNull kotlin.collections.AbstractList<? extends E> r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.list = r2
                r1.fromIndex = r3
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r2 = r2.size()
                r0.checkRangeIndexes$kotlin_stdlib(r3, r4, r2)
                int r4 = r4 - r3
                r1._size = r4
                return
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int r3) {
                r2 = this;
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r2._size
                r0.checkElementIndex$kotlin_stdlib(r3, r1)
                kotlin.collections.AbstractList<E> r0 = r2.list
                int r1 = r2.fromIndex
                int r1 = r1 + r3
                java.lang.Object r3 = r0.get(r1)
                return r3
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
                r1 = this;
                int r0 = r1._size
                return r0
        }
    }

    static {
            kotlin.collections.AbstractList$Companion r0 = new kotlin.collections.AbstractList$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.AbstractList.Companion = r0
            return
    }

    public AbstractList() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.List
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r0.orderedEquals$kotlin_stdlib(r1, r2)
            return r2
    }

    @Override // java.util.List
    public abstract E get(int r1);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r1 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r0 = r0.orderedHashCode$kotlin_stdlib(r1)
            return r0
    }

    @Override // java.util.List
    public int indexOf(E r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L16
            goto L1a
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r1 = -1
        L1a:
            return r1
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.collections.AbstractList$IteratorImpl r0 = new kotlin.collections.AbstractList$IteratorImpl
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(E r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            goto L1e
        L1d:
            r3 = -1
        L1e:
            return r3
    }

    @Override // java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            kotlin.collections.AbstractList$ListIteratorImpl r0 = new kotlin.collections.AbstractList$ListIteratorImpl
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            kotlin.collections.AbstractList$ListIteratorImpl r0 = new kotlin.collections.AbstractList$ListIteratorImpl
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public E remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            kotlin.collections.AbstractList$SubList r0 = new kotlin.collections.AbstractList$SubList
            r0.<init>(r1, r2, r3)
            return r0
    }
}
