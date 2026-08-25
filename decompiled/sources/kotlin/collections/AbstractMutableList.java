package kotlin.collections;

/* JADX INFO: compiled from: AbstractMutableList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J \u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/collections/AbstractMutableList;", "E", "", "Ljava/util/AbstractList;", "", "index", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeAt", "(I)Ljava/lang/Object;", "", "add", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> implements kotlin.jvm.internal.markers.KMutableList {
    public AbstractMutableList() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int r1, E r2);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.removeAt(r1)
            return r1
    }

    public abstract E removeAt(int r1);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int r1, E r2);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
