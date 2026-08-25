package kotlin.collections;

/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/AbstractMutableCollection;", "E", "", "Ljava/util/AbstractCollection;", "element", "", "add", "(Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements kotlin.jvm.internal.markers.KMutableCollection {
    public AbstractMutableCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E r1);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
