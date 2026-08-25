package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzl implements com.google.android.play.core.assetpacks.AssetPackManager {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzbh zzb;
    private final com.google.android.play.core.internal.zzco zzc;
    private final com.google.android.play.core.assetpacks.zzbb zzd;
    private final com.google.android.play.core.splitinstall.zzs zze;
    private final com.google.android.play.core.assetpacks.zzde zzf;
    private final com.google.android.play.core.assetpacks.zzco zzg;
    private final com.google.android.play.core.assetpacks.zzbx zzh;
    private final com.google.android.play.core.internal.zzco zzi;
    private final com.google.android.play.core.common.zza zzj;
    private final com.google.android.play.core.assetpacks.zzeb zzk;
    private final android.os.Handler zzl;
    private boolean zzm;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "AssetPackManager"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzl.zza = r0
            return
    }

    public zzl(com.google.android.play.core.assetpacks.zzbh r3, com.google.android.play.core.internal.zzco r4, com.google.android.play.core.assetpacks.zzbb r5, com.google.android.play.core.splitinstall.zzs r6, com.google.android.play.core.assetpacks.zzde r7, com.google.android.play.core.assetpacks.zzco r8, com.google.android.play.core.assetpacks.zzbx r9, com.google.android.play.core.internal.zzco r10, com.google.android.play.core.common.zza r11, com.google.android.play.core.assetpacks.zzeb r12) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zzl = r0
            r2.zzb = r3
            r2.zzc = r4
            r2.zzd = r5
            r2.zze = r6
            r2.zzf = r7
            r2.zzg = r8
            r2.zzh = r9
            r2.zzi = r10
            r2.zzj = r11
            r2.zzk = r12
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.assetpacks.zzbx zzb(com.google.android.play.core.assetpacks.zzl r0) {
            com.google.android.play.core.assetpacks.zzbx r0 = r0.zzh
            return r0
    }

    public static /* synthetic */ void zze(java.lang.Exception r3) {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzl.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "Could not sync active asset packs. %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.zze(r3, r1)
            return
    }

    private final void zzh() {
            r2 = this;
            com.google.android.play.core.internal.zzco r0 = r2.zzi
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzi r1 = new com.google.android.play.core.assetpacks.zzi
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.assetpacks.AssetPackStates cancel(java.util.List<java.lang.String> r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.play.core.assetpacks.zzde r2 = r0.zzf
            java.util.Map r2 = r2.zzf(r1)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r4 = r19.iterator()
        L13:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L2a
            r6 = 0
            r7 = 0
            goto L2f
        L2a:
            int r6 = r6.intValue()
            r7 = r6
        L2f:
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            r6 = r5
            com.google.android.play.core.assetpacks.AssetPackState r6 = com.google.android.play.core.assetpacks.AssetPackState.zzb(r6, r7, r8, r9, r11, r13, r15, r16, r17)
            r3.put(r5, r6)
            goto L13
        L44:
            com.google.android.play.core.internal.zzco r2 = r0.zzc
            java.lang.Object r2 = r2.zza()
            com.google.android.play.core.assetpacks.zzy r2 = (com.google.android.play.core.assetpacks.zzy) r2
            r2.zze(r1)
            com.google.android.play.core.assetpacks.zzbo r1 = new com.google.android.play.core.assetpacks.zzbo
            r4 = 0
            r1.<init>(r4, r3)
            return r1
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void clearListeners() {
            r1 = this;
            com.google.android.play.core.assetpacks.zzbb r0 = r1.zzd
            r0.zze()
            return
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> fetch(java.util.List<java.lang.String> r12) {
            r11 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r11.zzb
            java.util.Map r0 = r0.zzu()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.play.core.common.zza r3 = r11.zzj
            java.lang.String r4 = "assetOnlyUpdates"
            boolean r3 = r3.zza(r4)
            if (r3 != 0) goto L2a
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.util.Set r3 = r3.keySet()
            r1.removeAll(r3)
            r2.addAll(r12)
            r2.removeAll(r1)
        L2a:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L96
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "session_id"
            r2 = 0
            r0.putInt(r1, r2)
            java.lang.String r1 = "error_code"
            r0.putInt(r1, r2)
            java.util.Iterator r3 = r12.iterator()
        L45:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "bytes_downloaded"
            java.lang.String r6 = "total_bytes_to_download"
            r7 = 0
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r9 = "status"
            java.lang.String r9 = com.google.android.play.core.assetpacks.model.zzb.zza(r9, r4)
            r10 = 4
            r0.putInt(r9, r10)
            java.lang.String r9 = com.google.android.play.core.assetpacks.model.zzb.zza(r1, r4)
            r0.putInt(r9, r2)
            java.lang.String r6 = com.google.android.play.core.assetpacks.model.zzb.zza(r6, r4)
            r0.putLong(r6, r7)
            java.lang.String r4 = com.google.android.play.core.assetpacks.model.zzb.zza(r5, r4)
            r0.putLong(r4, r7)
            goto L45
        L79:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.lang.String r12 = "pack_names"
            r0.putStringArrayList(r12, r1)
            r0.putLong(r6, r7)
            r0.putLong(r5, r7)
            com.google.android.play.core.assetpacks.zzco r12 = r11.zzg
            com.google.android.play.core.assetpacks.zzeb r1 = r11.zzk
            com.google.android.play.core.assetpacks.AssetPackStates r12 = com.google.android.play.core.assetpacks.AssetPackStates.zza(r0, r12, r1)
            com.google.android.play.core.tasks.Task r12 = com.google.android.play.core.tasks.Tasks.zzb(r12)
            return r12
        L96:
            com.google.android.play.core.internal.zzco r12 = r11.zzc
            java.lang.Object r12 = r12.zza()
            com.google.android.play.core.assetpacks.zzy r12 = (com.google.android.play.core.assetpacks.zzy) r12
            com.google.android.play.core.tasks.Task r12 = r12.zzc(r2, r1, r0)
            return r12
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    @androidx.annotation.Nullable
    public final com.google.android.play.core.assetpacks.AssetLocation getAssetLocation(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = r5.zzm
            r1 = 1
            if (r0 != 0) goto L17
            com.google.android.play.core.internal.zzco r0 = r5.zzi
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzh r2 = new com.google.android.play.core.assetpacks.zzh
            r2.<init>(r5)
            r0.execute(r2)
            r5.zzm = r1
        L17:
            com.google.android.play.core.assetpacks.zzbh r0 = r5.zzb
            boolean r0 = r0.zzG(r6)
            r2 = 0
            if (r0 == 0) goto L27
            com.google.android.play.core.assetpacks.zzbh r0 = r5.zzb     // Catch: java.io.IOException -> L38
            com.google.android.play.core.assetpacks.AssetPackLocation r0 = r0.zzf(r6)     // Catch: java.io.IOException -> L38
            goto L39
        L27:
            com.google.android.play.core.splitinstall.zzs r0 = r5.zze
            java.util.Set r0 = r0.zzc()
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L38
            com.google.android.play.core.assetpacks.AssetPackLocation r0 = com.google.android.play.core.assetpacks.AssetPackLocation.zza()
            goto L39
        L38:
            r0 = r2
        L39:
            if (r0 != 0) goto L3c
            return r2
        L3c:
            int r3 = r0.packStorageMethod()
            if (r3 != r1) goto L4d
            com.google.android.play.core.assetpacks.zzbh r0 = r5.zzb
            java.util.List r1 = r0.zzs(r6)
            com.google.android.play.core.assetpacks.AssetLocation r6 = r0.zzd(r6, r7, r1)
            return r6
        L4d:
            int r3 = r0.packStorageMethod()
            if (r3 != 0) goto L5a
            com.google.android.play.core.assetpacks.zzbh r1 = r5.zzb
            com.google.android.play.core.assetpacks.AssetLocation r6 = r1.zze(r6, r7, r0)
            return r6
        L5a:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzl.zza
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r3[r1] = r6
            java.lang.String r6 = "The asset %s is not present in Asset Pack %s"
            r0.zza(r6, r3)
            return r2
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    @androidx.annotation.Nullable
    public final com.google.android.play.core.assetpacks.AssetPackLocation getPackLocation(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.zzm
            if (r0 != 0) goto L17
            com.google.android.play.core.internal.zzco r0 = r2.zzi
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzh r1 = new com.google.android.play.core.assetpacks.zzh
            r1.<init>(r2)
            r0.execute(r1)
            r0 = 1
            r2.zzm = r0
        L17:
            com.google.android.play.core.assetpacks.zzbh r0 = r2.zzb
            boolean r0 = r0.zzG(r3)
            r1 = 0
            if (r0 == 0) goto L28
            com.google.android.play.core.assetpacks.zzbh r0 = r2.zzb     // Catch: java.io.IOException -> L27
            com.google.android.play.core.assetpacks.AssetPackLocation r3 = r0.zzf(r3)     // Catch: java.io.IOException -> L27
            return r3
        L27:
            return r1
        L28:
            com.google.android.play.core.splitinstall.zzs r0 = r2.zze
            java.util.Set r0 = r0.zzc()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L39
            com.google.android.play.core.assetpacks.AssetPackLocation r3 = com.google.android.play.core.assetpacks.AssetPackLocation.zza()
            return r3
        L39:
            return r1
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackLocation> getPackLocations() {
            r5 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r5.zzb
            java.util.Map r0 = r0.zzv()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.play.core.splitinstall.zzs r2 = r5.zze
            java.util.Set r2 = r2.zzc()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.play.core.assetpacks.AssetPackLocation r4 = com.google.android.play.core.assetpacks.AssetPackLocation.zza()
            r1.put(r3, r4)
            goto L15
        L29:
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.putAll(r1)
            return r0
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.assetpacks.AssetPackStates> getPackStates(java.util.List<java.lang.String> r4) {
            r3 = this;
            com.google.android.play.core.internal.zzco r0 = r3.zzc
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            com.google.android.play.core.assetpacks.zze r1 = new com.google.android.play.core.assetpacks.zze
            r1.<init>(r3)
            com.google.android.play.core.assetpacks.zzbh r2 = r3.zzb
            java.util.Map r2 = r2.zzu()
            com.google.android.play.core.tasks.Task r4 = r0.zzb(r4, r1, r2)
            return r4
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final synchronized void registerListener(com.google.android.play.core.assetpacks.AssetPackStateUpdateListener r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.play.core.assetpacks.zzbb r0 = r2.zzd     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.zzj()     // Catch: java.lang.Throwable -> L15
            com.google.android.play.core.assetpacks.zzbb r1 = r2.zzd     // Catch: java.lang.Throwable -> L15
            r1.zzf(r3)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L13
            r2.zzh()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L13:
            monitor-exit(r2)
            return
        L15:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> removePack(java.lang.String r4) {
            r3 = this;
            com.google.android.play.core.tasks.zzi r0 = new com.google.android.play.core.tasks.zzi
            r0.<init>()
            com.google.android.play.core.internal.zzco r1 = r3.zzi
            java.lang.Object r1 = r1.zza()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.android.play.core.assetpacks.zzj r2 = new com.google.android.play.core.assetpacks.zzj
            r2.<init>(r3, r4, r0)
            r1.execute(r2)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> showCellularDataConfirmation(android.app.Activity r5) {
            r4 = this;
            if (r5 != 0) goto Ld
            com.google.android.play.core.assetpacks.AssetPackException r5 = new com.google.android.play.core.assetpacks.AssetPackException
            r0 = -3
            r5.<init>(r0)
            com.google.android.play.core.tasks.Task r5 = com.google.android.play.core.tasks.Tasks.zza(r5)
            return r5
        Ld:
            com.google.android.play.core.assetpacks.zzbx r0 = r4.zzh
            android.app.PendingIntent r0 = r0.zza()
            if (r0 != 0) goto L21
            com.google.android.play.core.assetpacks.AssetPackException r5 = new com.google.android.play.core.assetpacks.AssetPackException
            r0 = -12
            r5.<init>(r0)
            com.google.android.play.core.tasks.Task r5 = com.google.android.play.core.tasks.Tasks.zza(r5)
            return r5
        L21:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.android.play.core.common.PlayCoreDialogWrapperActivity> r1 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class
            r0.<init>(r5, r1)
            com.google.android.play.core.assetpacks.zzbx r1 = r4.zzh
            android.app.PendingIntent r1 = r1.zza()
            java.lang.String r2 = "confirmation_intent"
            r0.putExtra(r2, r1)
            com.google.android.play.core.tasks.zzi r1 = new com.google.android.play.core.tasks.zzi
            r1.<init>()
            com.google.android.play.core.assetpacks.zzk r2 = new com.google.android.play.core.assetpacks.zzk
            android.os.Handler r3 = r4.zzl
            r2.<init>(r4, r3, r1)
            java.lang.String r3 = "result_receiver"
            r0.putExtra(r3, r2)
            r5.startActivity(r0)
            com.google.android.play.core.tasks.Task r5 = r1.zza()
            return r5
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void unregisterListener(com.google.android.play.core.assetpacks.AssetPackStateUpdateListener r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzbb r0 = r1.zzd
            r0.zzh(r2)
            return
    }

    @com.google.android.play.core.assetpacks.model.AssetPackStatus
    @androidx.annotation.VisibleForTesting
    public final int zza(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r3, java.lang.String r4) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r2.zzb
            boolean r0 = r0.zzG(r4)
            r1 = 4
            if (r0 != 0) goto Lf
            if (r3 == r1) goto Lc
            goto Lf
        Lc:
            r3 = 8
            return r3
        Lf:
            com.google.android.play.core.assetpacks.zzbh r0 = r2.zzb
            boolean r4 = r0.zzG(r4)
            if (r4 == 0) goto L1a
            if (r3 == r1) goto L1a
            return r1
        L1a:
            return r3
    }

    public final /* synthetic */ void zzc() {
            r1 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r1.zzb
            r0.zzy()
            com.google.android.play.core.assetpacks.zzbh r0 = r1.zzb
            r0.zzw()
            com.google.android.play.core.assetpacks.zzbh r0 = r1.zzb
            r0.zzx()
            return
    }

    public final /* synthetic */ void zzd(java.lang.String r4, com.google.android.play.core.tasks.zzi r5) {
            r3 = this;
            com.google.android.play.core.assetpacks.zzbh r0 = r3.zzb
            boolean r0 = r0.zzD(r4)
            if (r0 == 0) goto L18
            r0 = 0
            r5.zzc(r0)
            com.google.android.play.core.internal.zzco r5 = r3.zzc
            java.lang.Object r5 = r5.zza()
            com.google.android.play.core.assetpacks.zzy r5 = (com.google.android.play.core.assetpacks.zzy) r5
            r5.zzj(r4)
            return
        L18:
            java.io.IOException r0 = new java.io.IOException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Failed to remove pack %s."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            r5.zzb(r0)
            return
    }

    public final /* synthetic */ void zzf() {
            r4 = this;
            com.google.android.play.core.internal.zzco r0 = r4.zzc
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            com.google.android.play.core.assetpacks.zzbh r1 = r4.zzb
            java.util.Map r1 = r1.zzu()
            com.google.android.play.core.tasks.Task r0 = r0.zzd(r1)
            com.google.android.play.core.internal.zzco r1 = r4.zzi
            java.lang.Object r1 = r1.zza()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.android.play.core.assetpacks.zzbh r2 = r4.zzb
            java.util.Objects.requireNonNull(r2)
            com.google.android.play.core.assetpacks.zzg r3 = new com.google.android.play.core.assetpacks.zzg
            r3.<init>(r2)
            r0.addOnSuccessListener(r1, r3)
            com.google.android.play.core.internal.zzco r1 = r4.zzi
            java.lang.Object r1 = r1.zza()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.android.play.core.assetpacks.zzf r2 = com.google.android.play.core.assetpacks.zzf.zza
            r0.addOnFailureListener(r1, r2)
            return
    }

    public final void zzg(boolean r3) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzbb r0 = r2.zzd
            boolean r0 = r0.zzj()
            com.google.android.play.core.assetpacks.zzbb r1 = r2.zzd
            r1.zzg(r3)
            if (r3 == 0) goto L12
            if (r0 != 0) goto L12
            r2.zzh()
        L12:
            return
    }
}
