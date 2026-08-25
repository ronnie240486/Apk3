package com.google.android.play.core.listener;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzb extends android.content.BroadcastReceiver {
    public final /* synthetic */ com.google.android.play.core.listener.zzc zza;

    public /* synthetic */ zzb(com.google.android.play.core.listener.zzc r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            com.google.android.play.core.listener.zzc r0 = r1.zza
            r0.zza(r2, r3)
            return
    }
}
