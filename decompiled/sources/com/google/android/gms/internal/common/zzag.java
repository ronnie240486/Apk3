package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzag<E> extends com.google.android.gms.internal.common.zzac<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.common.zzak<java.lang.Object> zza = null;

    static {
            com.google.android.gms.internal.common.zzae r0 = new com.google.android.gms.internal.common.zzae
            com.google.android.gms.internal.common.zzag<java.lang.Object> r1 = com.google.android.gms.internal.common.zzai.zza
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.common.zzag.zza = r0
            return
    }

    public zzag() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzi(java.lang.Object[] r1, int r2) {
            if (r2 != 0) goto L5
            com.google.android.gms.internal.common.zzag<java.lang.Object> r1 = com.google.android.gms.internal.common.zzai.zza
            return r1
        L5:
            com.google.android.gms.internal.common.zzai r0 = new com.google.android.gms.internal.common.zzai
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzj(java.lang.Iterable<? extends E> r3) {
            java.util.Objects.requireNonNull(r3)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r3 = (java.util.Collection) r3
            com.google.android.gms.internal.common.zzag r3 = zzk(r3)
            goto L41
        Le:
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1b
            com.google.android.gms.internal.common.zzag<java.lang.Object> r3 = com.google.android.gms.internal.common.zzai.zza
            goto L41
        L1b:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L2a
            com.google.android.gms.internal.common.zzag r3 = zzm(r0)
            goto L41
        L2a:
            com.google.android.gms.internal.common.zzad r1 = new com.google.android.gms.internal.common.zzad
            r2 = 4
            r1.<init>(r2)
            r1.zzb(r0)
            r1.zzc(r3)
            r3 = 1
            r1.zzc = r3
            java.lang.Object[] r3 = r1.zza
            int r0 = r1.zzb
            com.google.android.gms.internal.common.zzag r3 = zzi(r3, r0)
        L41:
            return r3
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzk(java.util.Collection<? extends E> r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.common.zzac
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.common.zzac r1 = (com.google.android.gms.internal.common.zzac) r1
            com.google.android.gms.internal.common.zzag r1 = r1.zzd()
            boolean r0 = r1.zzf()
            if (r0 == 0) goto L19
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            com.google.android.gms.internal.common.zzag r1 = zzi(r1, r0)
        L19:
            return r1
        L1a:
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            com.google.android.gms.internal.common.zzah.zza(r1, r0)
            com.google.android.gms.internal.common.zzag r1 = zzi(r1, r0)
            return r1
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzl() {
            com.google.android.gms.internal.common.zzag<java.lang.Object> r0 = com.google.android.gms.internal.common.zzai.zza
            return r0
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzm(E r3) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            com.google.android.gms.internal.common.zzah.zza(r1, r0)
            com.google.android.gms.internal.common.zzag r3 = zzi(r1, r0)
            return r3
    }

    public static <E> com.google.android.gms.internal.common.zzag<E> zzn(E r3, E r4) {
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            com.google.android.gms.internal.common.zzah.zza(r1, r0)
            com.google.android.gms.internal.common.zzag r3 = zzi(r1, r0)
            return r3
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != r6) goto L5
            goto L5b
        L5:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
        L9:
            r0 = 0
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L9
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L5b
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.android.gms.internal.common.zzr.zza(r4, r5)
            if (r4 != 0) goto L2e
            goto L9
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L9
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.google.android.gms.internal.common.zzr.zza(r3, r4)
            if (r3 != 0) goto L39
            goto L9
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L9
        L5b:
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L16
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L6
        L16:
            return r1
    }

    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r0 = r2
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.common.zzak r0 = r1.zzo(r0)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L1a
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L17
            r0 = r1
            goto L1a
        L17:
            int r1 = r1 + (-1)
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.common.zzak r0 = r1.zzo(r0)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.android.gms.internal.common.zzak r1 = r0.zzo(r1)
            return r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.common.zzag r1 = r0.zzh(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzac
    public int zza(java.lang.Object[] r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L10
            java.lang.Object r2 = r3.get(r1)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L5
        L10:
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    @java.lang.Deprecated
    public final com.google.android.gms.internal.common.zzag<E> zzd() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final com.google.android.gms.internal.common.zzaj<E> zze() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.common.zzak r0 = r1.zzo(r0)
            return r0
    }

    public com.google.android.gms.internal.common.zzag<E> zzh(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            com.google.android.gms.internal.common.zzs.zzc(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            com.google.android.gms.internal.common.zzag<java.lang.Object> r2 = com.google.android.gms.internal.common.zzai.zza
            return r2
        L14:
            com.google.android.gms.internal.common.zzaf r0 = new com.google.android.gms.internal.common.zzaf
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final com.google.android.gms.internal.common.zzak<E> zzo(int r3) {
            r2 = this;
            int r0 = r2.size()
            java.lang.String r1 = "index"
            com.google.android.gms.internal.common.zzs.zzb(r3, r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            com.google.android.gms.internal.common.zzak<java.lang.Object> r3 = com.google.android.gms.internal.common.zzag.zza
            return r3
        L12:
            com.google.android.gms.internal.common.zzae r0 = new com.google.android.gms.internal.common.zzae
            r0.<init>(r2, r3)
            return r0
    }
}
