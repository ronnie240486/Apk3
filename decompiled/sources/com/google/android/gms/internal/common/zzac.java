package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzac<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private static final java.lang.Object[] zza = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.internal.common.zzac.zza = r0
            return
    }

    public zzac() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.common.zzaj r0 = r1.zze()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.android.gms.internal.common.zzac.zza
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            int r0 = r3.size()
            int r1 = r4.length
            if (r1 >= r0) goto L30
            java.lang.Object[] r1 = r3.zzg()
            if (r1 != 0) goto L1f
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto L35
        L1f:
            int r0 = r3.zzc()
            int r2 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r1, r0, r2, r4)
            return r4
        L30:
            if (r1 <= r0) goto L35
            r1 = 0
            r4[r0] = r1
        L35:
            r3.zza(r4)
            return r4
    }

    public int zza(java.lang.Object[] r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public int zzb() {
            r1 = this;
            r0 = 0
            throw r0
    }

    int zzc() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public com.google.android.gms.internal.common.zzag<E> zzd() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public abstract com.google.android.gms.internal.common.zzaj<E> zze();

    public abstract boolean zzf();

    @javax.annotation.CheckForNull
    public java.lang.Object[] zzg() {
            r1 = this;
            r0 = 0
            throw r0
    }
}
