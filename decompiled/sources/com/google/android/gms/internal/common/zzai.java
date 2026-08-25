package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzai<E> extends com.google.android.gms.internal.common.zzag<E> {
    public static final com.google.android.gms.internal.common.zzag<java.lang.Object> zza = null;
    public final transient java.lang.Object[] zzb;
    private final transient int zzc;

    static {
            com.google.android.gms.internal.common.zzai r0 = new com.google.android.gms.internal.common.zzai
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.android.gms.internal.common.zzai.zza = r0
            return
    }

    public zzai(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    @Override // java.util.List
    public final E get(int r3) {
            r2 = this;
            int r0 = r2.zzc
            java.lang.String r1 = "index"
            com.google.android.gms.internal.common.zzs.zza(r3, r0, r1)
            java.lang.Object[] r0 = r2.zzb
            r3 = r0[r3]
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final int zza(java.lang.Object[] r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zzb
            int r1 = r3.zzc
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r4 = r3.zzc
            return r4
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final java.lang.Object[] zzg() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzb
            return r0
    }
}
