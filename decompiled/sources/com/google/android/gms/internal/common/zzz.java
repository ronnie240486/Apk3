package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzz<E> extends com.google.android.gms.internal.common.zzak<E> {
    private final int zza;
    private int zzb;

    public zzz(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "index"
            com.google.android.gms.internal.common.zzs.zzb(r3, r2, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zza
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            int r0 = r2.zzb
            int r1 = r0 + 1
            r2.zzb = r1
            java.lang.Object r0 = r2.zza(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // java.util.ListIterator
    public final E previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L11
            int r0 = r1.zzb
            int r0 = r0 + (-1)
            r1.zzb = r0
            java.lang.Object r0 = r1.zza(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.zzb
            int r0 = r0 + (-1)
            return r0
    }

    public abstract E zza(int r1);
}
