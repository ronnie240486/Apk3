package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaf extends com.google.android.gms.internal.common.zzag {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ com.google.android.gms.internal.common.zzag zzc;

    public zzaf(com.google.android.gms.internal.common.zzag r1, int r2, int r3) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzb
            java.lang.String r1 = "index"
            com.google.android.gms.internal.common.zzs.zza(r3, r0, r1)
            com.google.android.gms.internal.common.zzag r0 = r2.zzc
            int r1 = r2.zza
            int r3 = r3 + r1
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.common.zzag r1 = r0.zzh(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzb() {
            r2 = this;
            com.google.android.gms.internal.common.zzag r0 = r2.zzc
            int r0 = r0.zzc()
            int r1 = r2.zza
            int r0 = r0 + r1
            int r1 = r2.zzb
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
            r2 = this;
            com.google.android.gms.internal.common.zzag r0 = r2.zzc
            int r0 = r0.zzc()
            int r1 = r2.zza
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    @javax.annotation.CheckForNull
    public final java.lang.Object[] zzg() {
            r1 = this;
            com.google.android.gms.internal.common.zzag r0 = r1.zzc
            java.lang.Object[] r0 = r0.zzg()
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final com.google.android.gms.internal.common.zzag zzh(int r3, int r4) {
            r2 = this;
            int r0 = r2.zzb
            com.google.android.gms.internal.common.zzs.zzc(r3, r4, r0)
            com.google.android.gms.internal.common.zzag r0 = r2.zzc
            int r1 = r2.zza
            int r3 = r3 + r1
            int r4 = r4 + r1
            com.google.android.gms.internal.common.zzag r3 = r0.zzh(r3, r4)
            return r3
    }
}
