package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbd implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;

    public zzbd(com.google.android.play.core.internal.zzcs r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r3 = this;
            com.google.android.play.core.internal.zzcs r0 = r3.zza
            com.google.android.play.core.splitinstall.zzad r0 = (com.google.android.play.core.splitinstall.zzad) r0
            android.content.Context r0 = r0.zzb()
            com.google.android.play.core.splitinstall.zzbc r1 = new com.google.android.play.core.splitinstall.zzbc
            java.lang.String r2 = r0.getPackageName()
            r1.<init>(r0, r2)
            return r1
    }
}
