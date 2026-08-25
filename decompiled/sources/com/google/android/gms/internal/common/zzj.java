package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzj<T> implements java.util.Iterator<T> {

    @javax.annotation.CheckForNull
    private T zza;
    private int zzb;

    public zzj() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zzb = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.zzb
            r1 = 4
            if (r0 == r1) goto L24
            int r2 = r0 + (-1)
            if (r0 == 0) goto L22
            r0 = 1
            if (r2 == 0) goto L21
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L20
            r5.zzb = r1
            java.lang.Object r1 = r5.zza()
            r5.zza = r1
            int r1 = r5.zzb
            r2 = 3
            if (r1 == r2) goto L20
            r5.zzb = r0
            return r0
        L20:
            return r4
        L21:
            return r0
        L22:
            r0 = 0
            throw r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.zzb = r0
            T r0 = r2.zza
            r1 = 0
            r2.zza = r1
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @javax.annotation.CheckForNull
    public abstract T zza();

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @javax.annotation.CheckForNull
    public final void zzb() {
            r1 = this;
            r0 = 3
            r1.zzb = r0
            return
    }
}
