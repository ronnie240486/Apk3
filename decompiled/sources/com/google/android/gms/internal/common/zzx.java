package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzx {
    private final com.google.android.gms.internal.common.zzo zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzu zzc;

    private zzx(com.google.android.gms.internal.common.zzu r1, boolean r2, com.google.android.gms.internal.common.zzo r3, int r4, byte[] r5) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zza = r3
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.common.zzo zza(com.google.android.gms.internal.common.zzx r0) {
            com.google.android.gms.internal.common.zzo r0 = r0.zza
            return r0
    }

    public static com.google.android.gms.internal.common.zzx zzc(com.google.android.gms.internal.common.zzo r7) {
            com.google.android.gms.internal.common.zzx r6 = new com.google.android.gms.internal.common.zzx
            com.google.android.gms.internal.common.zzu r1 = new com.google.android.gms.internal.common.zzu
            r1.<init>(r7)
            com.google.android.gms.internal.common.zzn r3 = com.google.android.gms.internal.common.zzn.zza
            r2 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ java.util.Iterator zze(com.google.android.gms.internal.common.zzx r0, java.lang.CharSequence r1) {
            java.util.Iterator r0 = r0.zzh(r1)
            return r0
    }

    public static /* synthetic */ boolean zzg(com.google.android.gms.internal.common.zzx r0) {
            boolean r0 = r0.zzb
            return r0
    }

    private final java.util.Iterator<java.lang.String> zzh(java.lang.CharSequence r3) {
            r2 = this;
            com.google.android.gms.internal.common.zzu r0 = r2.zzc
            com.google.android.gms.internal.common.zzt r1 = new com.google.android.gms.internal.common.zzt
            r1.<init>(r0, r2, r3)
            return r1
    }

    public final com.google.android.gms.internal.common.zzx zzb() {
            r7 = this;
            com.google.android.gms.internal.common.zzx r6 = new com.google.android.gms.internal.common.zzx
            com.google.android.gms.internal.common.zzu r1 = r7.zzc
            com.google.android.gms.internal.common.zzo r3 = r7.zza
            r2 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public final java.lang.Iterable<java.lang.String> zzd(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzv r0 = new com.google.android.gms.internal.common.zzv
            r0.<init>(r1, r2)
            return r0
    }

    public final java.util.List<java.lang.String> zzf(java.lang.CharSequence r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            java.util.Iterator r3 = r2.zzh(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Lc
        L1c:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }
}
