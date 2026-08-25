package kotlin.collections.builders;

/* JADX INFO: compiled from: SetBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0019\b\u0000\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0002J\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u0016\u0010 \u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\b\u0010\"\u001a\u00020#H\u0002R\u0018\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "backing", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "build", "", "clear", "", "contains", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "writeReplace", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SetBuilder<E> extends kotlin.collections.AbstractMutableSet<E> implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private final kotlin.collections.builders.MapBuilder<E, ?> backing;

    public SetBuilder() {
            r1 = this;
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public SetBuilder(int r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public SetBuilder(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<E, ?> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.backing = r2
            return
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r2.backing
            boolean r0 = r0.isReadOnly$kotlin_stdlib()
            if (r0 == 0) goto Lf
            kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Lf:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The set cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            int r2 = r0.addKey$kotlin_stdlib(r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.addAll(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<E> build() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.build()
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            kotlin.collections.builders.MapBuilder$KeysItr r0 = r0.keysIterator$kotlin_stdlib()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            int r2 = r0.removeKey$kotlin_stdlib(r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.retainAll(r2)
            return r2
    }
}
