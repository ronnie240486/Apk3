package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzc extends android.os.ResultReceiver {
    public final /* synthetic */ com.google.android.play.core.tasks.zzi zza;

    public zzc(android.os.Handler r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>(r1)
            return
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r1, android.os.Bundle r2) {
            r0 = this;
            com.google.android.play.core.tasks.zzi r1 = r0.zza
            r2 = 0
            r1.zze(r2)
            return
    }
}
