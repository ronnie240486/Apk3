package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBuffer<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @androidx.annotation.NonNull
    public final T next() {
            r5 = this;
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L51
            int r0 = r5.zab
            int r0 = r0 + 1
            r5.zab = r0
            if (r0 != 0) goto L41
            com.google.android.gms.common.data.DataBuffer<T> r0 = r5.zaa
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r5.zac = r0
            boolean r1 = r0 instanceof com.google.android.gms.common.data.DataBufferRef
            if (r1 == 0) goto L20
            goto L4e
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 44
            r3.<init>(r2)
            java.lang.String r2 = "DataBuffer reference of type "
            java.lang.String r4 = " is not movable"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r0, r4)
            r1.<init>(r0)
            throw r1
        L41:
            T r0 = r5.zac
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.data.DataBufferRef r0 = (com.google.android.gms.common.data.DataBufferRef) r0
            int r1 = r5.zab
            r0.zaa(r1)
        L4e:
            T r0 = r5.zac
            return r0
        L51:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            int r1 = r5.zab
            r2 = 46
            java.lang.String r3 = "Cannot advance the iterator beyond "
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r1)
            r0.<init>(r1)
            throw r0
    }
}
