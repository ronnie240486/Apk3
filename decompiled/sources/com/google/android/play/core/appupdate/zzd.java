package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzd extends android.os.ResultReceiver {
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zza;

    public zzd(android.os.Handler r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>(r1)
            return
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r2, android.os.Bundle r3) {
            r1 = this;
            r3 = 1
            if (r2 == r3) goto L1b
            r0 = 2
            if (r2 == r0) goto L10
            com.google.android.play.core.tasks.zzi r2 = r1.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.zze(r3)
            return
        L10:
            com.google.android.play.core.tasks.zzi r2 = r1.zza
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.zze(r3)
            return
        L1b:
            com.google.android.play.core.tasks.zzi r2 = r1.zza
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.zze(r3)
            return
    }
}
