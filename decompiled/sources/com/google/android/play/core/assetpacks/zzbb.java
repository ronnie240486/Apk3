package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbb extends com.google.android.play.core.listener.zzc {
    private final com.google.android.play.core.assetpacks.zzde zzc;
    private final com.google.android.play.core.assetpacks.zzcl zzd;
    private final com.google.android.play.core.internal.zzco zze;
    private final com.google.android.play.core.assetpacks.zzbx zzf;
    private final com.google.android.play.core.assetpacks.zzco zzg;
    private final com.google.android.play.core.internal.zzco zzh;
    private final com.google.android.play.core.internal.zzco zzi;
    private final com.google.android.play.core.assetpacks.zzeb zzj;
    private final android.os.Handler zzk;

    public zzbb(android.content.Context r4, com.google.android.play.core.assetpacks.zzde r5, com.google.android.play.core.assetpacks.zzcl r6, com.google.android.play.core.internal.zzco r7, com.google.android.play.core.assetpacks.zzco r8, com.google.android.play.core.assetpacks.zzbx r9, com.google.android.play.core.internal.zzco r10, com.google.android.play.core.internal.zzco r11, com.google.android.play.core.assetpacks.zzeb r12) {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "AssetPackServiceListenerRegistry"
            r0.<init>(r1)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"
            r1.<init>(r2)
            r3.<init>(r0, r1, r4)
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            r3.zzk = r4
            r3.zzc = r5
            r3.zzd = r6
            r3.zze = r7
            r3.zzg = r8
            r3.zzf = r9
            r3.zzh = r10
            r3.zzi = r11
            r3.zzj = r12
            return
    }

    @Override // com.google.android.play.core.listener.zzc
    public final void zza(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            java.lang.String r6 = "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE"
            android.os.Bundle r6 = r7.getBundleExtra(r6)
            r7 = 0
            if (r6 == 0) goto L6e
            java.lang.String r0 = "pack_names"
            java.util.ArrayList r0 = r6.getStringArrayList(r0)
            if (r0 == 0) goto L64
            int r1 = r0.size()
            r2 = 1
            if (r1 == r2) goto L19
            goto L64
        L19:
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.play.core.assetpacks.zzco r1 = r5.zzg
            com.google.android.play.core.assetpacks.zzeb r3 = r5.zzj
            com.google.android.play.core.assetpacks.zzbd r4 = com.google.android.play.core.assetpacks.zzbd.zza
            com.google.android.play.core.assetpacks.AssetPackState r0 = com.google.android.play.core.assetpacks.AssetPackState.zzc(r6, r0, r1, r3, r4)
            com.google.android.play.core.internal.zzag r1 = r5.zza
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r7] = r0
            java.lang.String r7 = "ListenerRegistryBroadcastReceiver.onReceive: %s"
            r1.zza(r7, r2)
            java.lang.String r7 = "confirmation_intent"
            android.os.Parcelable r7 = r6.getParcelable(r7)
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            if (r7 == 0) goto L43
            com.google.android.play.core.assetpacks.zzbx r1 = r5.zzf
            r1.zzb(r7)
        L43:
            com.google.android.play.core.internal.zzco r7 = r5.zzi
            java.lang.Object r7 = r7.zza()
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7
            com.google.android.play.core.assetpacks.zzaz r1 = new com.google.android.play.core.assetpacks.zzaz
            r1.<init>(r5, r6, r0)
            r7.execute(r1)
            com.google.android.play.core.internal.zzco r7 = r5.zzh
            java.lang.Object r7 = r7.zza()
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7
            com.google.android.play.core.assetpacks.zzay r0 = new com.google.android.play.core.assetpacks.zzay
            r0.<init>(r5, r6)
            r7.execute(r0)
            return
        L64:
            com.google.android.play.core.internal.zzag r6 = r5.zza
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "Corrupt bundle received from broadcast."
            r6.zzb(r0, r7)
            return
        L6e:
            com.google.android.play.core.internal.zzag r6 = r5.zza
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "Empty bundle received from broadcast."
            r6.zzb(r0, r7)
            return
    }

    public final /* synthetic */ void zzb(android.os.Bundle r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzde r0 = r1.zzc
            boolean r2 = r0.zzp(r2)
            if (r2 == 0) goto Ld
            com.google.android.play.core.assetpacks.zzcl r2 = r1.zzd
            r2.zza()
        Ld:
            return
    }

    public final void zzc(android.os.Bundle r2, com.google.android.play.core.assetpacks.AssetPackState r3) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzde r0 = r1.zzc
            boolean r2 = r0.zzo(r2)
            if (r2 == 0) goto L1d
            android.os.Handler r2 = r1.zzk
            com.google.android.play.core.assetpacks.zzba r0 = new com.google.android.play.core.assetpacks.zzba
            r0.<init>(r1, r3)
            r2.post(r0)
            com.google.android.play.core.internal.zzco r2 = r1.zze
            java.lang.Object r2 = r2.zza()
            com.google.android.play.core.assetpacks.zzy r2 = (com.google.android.play.core.assetpacks.zzy) r2
            r2.zzf()
        L1d:
            return
    }

    public final void zzd(com.google.android.play.core.assetpacks.AssetPackState r3) {
            r2 = this;
            android.os.Handler r0 = r2.zzk
            com.google.android.play.core.assetpacks.zzba r1 = new com.google.android.play.core.assetpacks.zzba
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }
}
