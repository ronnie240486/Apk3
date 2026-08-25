package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
class zzal extends com.google.android.play.core.internal.zzv {
    public final com.google.android.play.core.tasks.zzi zza;
    public final /* synthetic */ com.google.android.play.core.assetpacks.zzaw zzb;

    public zzal(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public final void zzb(int r3, android.os.Bundle r4) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzaw r4 = r2.zzb
            com.google.android.play.core.internal.zzas r4 = com.google.android.play.core.assetpacks.zzaw.zzs(r4)
            com.google.android.play.core.tasks.zzi r0 = r2.zza
            r4.zzs(r0)
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "onCancelDownload(%d)"
            r4.zzd(r3, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public final void zzc(android.os.Bundle r3) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzaw r3 = r2.zzb
            com.google.android.play.core.internal.zzas r3 = com.google.android.play.core.assetpacks.zzaw.zzs(r3)
            com.google.android.play.core.tasks.zzi r0 = r2.zza
            r3.zzs(r0)
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "onCancelDownloads()"
            r3.zzd(r1, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public void zzd(android.os.Bundle r5) {
            r4 = this;
            com.google.android.play.core.assetpacks.zzaw r0 = r4.zzb
            com.google.android.play.core.internal.zzas r0 = com.google.android.play.core.assetpacks.zzaw.zzs(r0)
            com.google.android.play.core.tasks.zzi r1 = r4.zza
            r0.zzs(r1)
            java.lang.String r0 = "error_code"
            int r5 = r5.getInt(r0)
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "onError(%d)"
            r0.zzb(r2, r1)
            com.google.android.play.core.tasks.zzi r0 = r4.zza
            com.google.android.play.core.assetpacks.AssetPackException r1 = new com.google.android.play.core.assetpacks.AssetPackException
            r1.<init>(r5)
            r0.zzd(r1)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public void zze(android.os.Bundle r2, android.os.Bundle r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.play.core.assetpacks.zzaw r2 = r1.zzb
            com.google.android.play.core.internal.zzas r2 = com.google.android.play.core.assetpacks.zzaw.zzs(r2)
            com.google.android.play.core.tasks.zzi r3 = r1.zza
            r2.zzs(r3)
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "onGetChunkFileDescriptor"
            r2.zzd(r0, r3)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public final void zzf(int r3, android.os.Bundle r4) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzaw r4 = r2.zzb
            com.google.android.play.core.internal.zzas r4 = com.google.android.play.core.assetpacks.zzaw.zzs(r4)
            com.google.android.play.core.tasks.zzi r0 = r2.zza
            r4.zzs(r0)
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "onGetSession(%d)"
            r4.zzd(r3, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public void zzg(java.util.List r3) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzaw r3 = r2.zzb
            com.google.android.play.core.internal.zzas r3 = com.google.android.play.core.assetpacks.zzaw.zzs(r3)
            com.google.android.play.core.tasks.zzi r0 = r2.zza
            r3.zzs(r0)
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "onGetSessionStates"
            r3.zzd(r1, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public void zzh(android.os.Bundle r3, android.os.Bundle r4) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzaw r4 = r2.zzb
            com.google.android.play.core.internal.zzas r4 = com.google.android.play.core.assetpacks.zzaw.zzt(r4)
            com.google.android.play.core.tasks.zzi r0 = r2.zza
            r4.zzs(r0)
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "keep_alive"
            boolean r3 = r3.getBoolean(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "onKeepAlive(%b)"
            r4.zzd(r3, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public final void zzi(android.os.Bundle r4, android.os.Bundle r5) {
            r3 = this;
            com.google.android.play.core.assetpacks.zzaw r5 = r3.zzb
            com.google.android.play.core.internal.zzas r5 = com.google.android.play.core.assetpacks.zzaw.zzs(r5)
            com.google.android.play.core.tasks.zzi r0 = r3.zza
            r5.zzs(r0)
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "module_name"
            java.lang.String r1 = r4.getString(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "slice_id"
            java.lang.String r1 = r4.getString(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "chunk_number"
            int r1 = r4.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "session_id"
            int r4 = r4.getInt(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 3
            r0[r1] = r4
            java.lang.String r4 = "onNotifyChunkTransferred(%s, %s, %d, session=%d)"
            r5.zzd(r4, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public final void zzj(android.os.Bundle r4, android.os.Bundle r5) {
            r3 = this;
            com.google.android.play.core.assetpacks.zzaw r5 = r3.zzb
            com.google.android.play.core.internal.zzas r5 = com.google.android.play.core.assetpacks.zzaw.zzs(r5)
            com.google.android.play.core.tasks.zzi r0 = r3.zza
            r5.zzs(r0)
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "module_name"
            java.lang.String r1 = r4.getString(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "session_id"
            int r4 = r4.getInt(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 1
            r0[r1] = r4
            java.lang.String r4 = "onNotifyModuleCompleted(%s, sessionId=%d)"
            r5.zzd(r4, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public final void zzk(android.os.Bundle r3, android.os.Bundle r4) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzaw r4 = r2.zzb
            com.google.android.play.core.internal.zzas r4 = com.google.android.play.core.assetpacks.zzaw.zzs(r4)
            com.google.android.play.core.tasks.zzi r0 = r2.zza
            r4.zzs(r0)
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "session_id"
            int r3 = r3.getInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "onNotifySessionFailed(%d)"
            r4.zzd(r3, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public final void zzl(android.os.Bundle r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzaw r2 = r1.zzb
            com.google.android.play.core.internal.zzas r2 = com.google.android.play.core.assetpacks.zzaw.zzs(r2)
            com.google.android.play.core.tasks.zzi r3 = r1.zza
            r2.zzs(r3)
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "onRemoveModule()"
            r2.zzd(r0, r3)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public void zzm(android.os.Bundle r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzaw r2 = r1.zzb
            com.google.android.play.core.internal.zzas r2 = com.google.android.play.core.assetpacks.zzaw.zzs(r2)
            com.google.android.play.core.tasks.zzi r3 = r1.zza
            r2.zzs(r3)
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "onRequestDownloadInfo()"
            r2.zzd(r0, r3)
            return
    }

    @Override // com.google.android.play.core.internal.zzw
    public void zzn(int r3, android.os.Bundle r4) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzaw r4 = r2.zzb
            com.google.android.play.core.internal.zzas r4 = com.google.android.play.core.assetpacks.zzaw.zzs(r4)
            com.google.android.play.core.tasks.zzi r0 = r2.zza
            r4.zzs(r0)
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzaw.zzr()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "onStartDownload(%d)"
            r4.zzd(r3, r0)
            return
    }
}
