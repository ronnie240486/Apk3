package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class DataBufferIterator<T> implements java.util.Iterator<T> {

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.data.DataBuffer<T> zaa;
    public int zab;

    public DataBufferIterator(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBuffer<T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.data.DataBuffer r1 = (com.google.android.gms.common.data.DataBuffer) r1
            r0.zaa = r1
            r1 = -1
            r0.zab = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.zab
            com.google.android.gms.common.data.DataBuffer<T> r1 = r2.zaa
            int r1 = r1.getCount()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    @androidx.annotation.NonNull
    public T next() {
            r4 = this;
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L13
            com.google.android.gms.common.data.DataBuffer<T> r0 = r4.zaa
            int r1 = r4.zab
            int r1 = r1 + 1
            r4.zab = r1
            java.lang.Object r0 = r0.get(r1)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            int r1 = r4.zab
            r2 = 46
            java.lang.String r3 = "Cannot advance the iterator beyond "
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Cannot remove elements from a DataBufferIterator"
            r0.<init>(r1)
            throw r0
    }
}
