package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcp implements com.google.android.play.core.internal.zzcs {
    private com.google.android.play.core.internal.zzcs zza;

    public zzcp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zzb(com.google.android.play.core.internal.zzcs r1, com.google.android.play.core.internal.zzcs r2) {
            com.google.android.play.core.internal.zzcp r1 = (com.google.android.play.core.internal.zzcp) r1
            com.google.android.play.core.internal.zzcs r0 = r1.zza
            if (r0 != 0) goto L9
            r1.zza = r2
            return
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final java.lang.Object zza() {
            r1 = this;
            com.google.android.play.core.internal.zzcs r0 = r1.zza
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.zza()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }
}
