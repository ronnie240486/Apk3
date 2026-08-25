package kotlin.collections;

/* JADX INFO: compiled from: AbstractSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u0000 \n*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nJ\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lkotlin/collections/AbstractSet;", "E", "Lkotlin/collections/AbstractCollection;", "", "", "other", "", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractSet<E> extends kotlin.collections.AbstractCollection<E> implements java.util.Set<E> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.AbstractSet.Companion Companion = null;

    /* JADX INFO: compiled from: AbstractSet.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\bJ\u0019\u0010\t\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractSet$Companion;", "", "()V", "setEquals", "", "c", "", "other", "setEquals$kotlin_stdlib", "unorderedHashCode", "", "", "unorderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

        public final boolean setEquals$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Set<?> r3, @org.jetbrains.annotations.NotNull java.util.Set<?> r4) {
                r2 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                int r0 = r3.size()
                int r1 = r4.size()
                if (r0 == r1) goto L16
                r3 = 0
                return r3
            L16:
                boolean r3 = r3.containsAll(r4)
                return r3
        }

        public final int unorderedHashCode$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
                r3 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.Iterator r4 = r4.iterator()
                r0 = 0
                r1 = 0
            Lb:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r4.next()
                if (r2 == 0) goto L1c
                int r2 = r2.hashCode()
                goto L1d
            L1c:
                r2 = 0
            L1d:
                int r1 = r1 + r2
                goto Lb
            L1f:
                return r1
        }
    }

    static {
            kotlin.collections.AbstractSet$Companion r0 = new kotlin.collections.AbstractSet$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.AbstractSet.Companion = r0
            return
    }

    public AbstractSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.Set
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.collections.AbstractSet$Companion r0 = kotlin.collections.AbstractSet.Companion
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r0.setEquals$kotlin_stdlib(r1, r2)
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            kotlin.collections.AbstractSet$Companion r0 = kotlin.collections.AbstractSet.Companion
            int r0 = r0.unorderedHashCode$kotlin_stdlib(r1)
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
