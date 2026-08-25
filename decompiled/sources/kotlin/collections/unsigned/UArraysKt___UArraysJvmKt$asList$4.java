package kotlin.collections.unsigned;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "Lkotlin/UShort;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-xj2QHRw", "(S)Z", "get", "index", "get-Mh2AYeg", "(I)S", "indexOf", "indexOf-xj2QHRw", "(S)I", "isEmpty", "lastIndexOf", "lastIndexOf-xj2QHRw", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$4 extends kotlin.collections.AbstractList<kotlin.UShort> implements java.util.RandomAccess {
    public final /* synthetic */ short[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$4(short[] r1) {
            r0 = this;
            r0.$this_asList = r1
            r0.<init>()
            return
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.UShort
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            kotlin.UShort r2 = (kotlin.UShort) r2
            short r2 = r2.m660unboximpl()
            boolean r2 = r1.m848containsxj2QHRw(r2)
            return r2
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m848containsxj2QHRw(short r2) {
            r1 = this;
            short[] r0 = r1.$this_asList
            boolean r2 = kotlin.UShortArray.m664containsxj2QHRw(r0, r2)
            return r2
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            short r1 = r0.m849getMh2AYeg(r1)
            kotlin.UShort r1 = kotlin.UShort.m605boximpl(r1)
            return r1
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public short m849getMh2AYeg(int r2) {
            r1 = this;
            short[] r0 = r1.$this_asList
            short r2 = kotlin.UShortArray.m668getMh2AYeg(r0, r2)
            return r2
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            short[] r0 = r1.$this_asList
            int r0 = kotlin.UShortArray.m669getSizeimpl(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.UShort
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            kotlin.UShort r2 = (kotlin.UShort) r2
            short r2 = r2.m660unboximpl()
            int r2 = r1.m850indexOfxj2QHRw(r2)
            return r2
    }

    /* JADX INFO: renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public int m850indexOfxj2QHRw(short r2) {
            r1 = this;
            short[] r0 = r1.$this_asList
            int r2 = kotlin.collections.ArraysKt.indexOf(r0, r2)
            return r2
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            short[] r0 = r1.$this_asList
            boolean r0 = kotlin.UShortArray.m671isEmptyimpl(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.UShort
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            kotlin.UShort r2 = (kotlin.UShort) r2
            short r2 = r2.m660unboximpl()
            int r2 = r1.m851lastIndexOfxj2QHRw(r2)
            return r2
    }

    /* JADX INFO: renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public int m851lastIndexOfxj2QHRw(short r2) {
            r1 = this;
            short[] r0 = r1.$this_asList
            int r2 = kotlin.collections.ArraysKt.lastIndexOf(r0, r2)
            return r2
    }
}
