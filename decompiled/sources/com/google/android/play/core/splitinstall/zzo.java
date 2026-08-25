package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final enum zzo extends java.lang.Enum implements com.google.android.play.core.splitinstall.zzg {
    public static final com.google.android.play.core.splitinstall.zzo zza = null;
    private static final java.util.concurrent.atomic.AtomicReference zzb = null;
    private static final /* synthetic */ com.google.android.play.core.splitinstall.zzo[] zzc = null;

    static {
            com.google.android.play.core.splitinstall.zzo r0 = new com.google.android.play.core.splitinstall.zzo
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.play.core.splitinstall.zzo.zza = r0
            r1 = 1
            com.google.android.play.core.splitinstall.zzo[] r1 = new com.google.android.play.core.splitinstall.zzo[r1]
            r1[r2] = r0
            com.google.android.play.core.splitinstall.zzo.zzc = r1
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            com.google.android.play.core.splitinstall.zzo.zzb = r0
            return
    }

    private zzo(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.play.core.splitinstall.zzo[] values() {
            com.google.android.play.core.splitinstall.zzo[] r0 = com.google.android.play.core.splitinstall.zzo.zzc
            java.lang.Object r0 = r0.clone()
            com.google.android.play.core.splitinstall.zzo[] r0 = (com.google.android.play.core.splitinstall.zzo[]) r0
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.zzg
    @androidx.annotation.Nullable
    public final com.google.android.play.core.splitinstall.zzh zza() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.play.core.splitinstall.zzo.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.splitinstall.zzh r0 = (com.google.android.play.core.splitinstall.zzh) r0
            return r0
    }

    public final void zzb(com.google.android.play.core.splitinstall.zzh r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.play.core.splitinstall.zzo.zzb
            r0.set(r2)
            return
    }
}
