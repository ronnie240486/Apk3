package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzae implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;

    public zzae(com.google.android.play.core.internal.zzcs r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    @androidx.annotation.Nullable
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            com.google.android.play.core.internal.zzcs r0 = r1.zza
            java.lang.Object r0 = r0.zza()
            java.io.File r0 = (java.io.File) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            com.google.android.play.core.splitinstall.testing.zzt r0 = com.google.android.play.core.splitinstall.testing.zzy.zza(r0)
            return r0
    }
}
