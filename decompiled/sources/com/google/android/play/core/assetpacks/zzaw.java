package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw implements com.google.android.play.core.assetpacks.zzy {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private static final android.content.Intent zzb = null;
    private final java.lang.String zzc;
    private final com.google.android.play.core.assetpacks.zzco zzd;
    private final com.google.android.play.core.assetpacks.zzeb zze;

    @androidx.annotation.Nullable
    private com.google.android.play.core.internal.zzas zzf;

    @androidx.annotation.Nullable
    private com.google.android.play.core.internal.zzas zzg;
    private final java.util.concurrent.atomic.AtomicBoolean zzh;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "AssetPackServiceImpl"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzaw.zza = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r0 = r0.setPackage(r1)
            com.google.android.play.core.assetpacks.zzaw.zzb = r0
            return
    }

    public zzaw(android.content.Context r10, com.google.android.play.core.assetpacks.zzco r11, com.google.android.play.core.assetpacks.zzeb r12) {
            r9 = this;
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r9.zzh = r0
            java.lang.String r0 = r10.getPackageName()
            r9.zzc = r0
            r9.zzd = r11
            r9.zze = r12
            boolean r11 = com.google.android.play.core.internal.zzch.zzb(r10)
            if (r11 == 0) goto L45
            com.google.android.play.core.internal.zzas r11 = new com.google.android.play.core.internal.zzas
            android.content.Context r1 = com.google.android.play.core.internal.zzce.zza(r10)
            com.google.android.play.core.internal.zzag r12 = com.google.android.play.core.assetpacks.zzaw.zza
            android.content.Intent r7 = com.google.android.play.core.assetpacks.zzaw.zzb
            com.google.android.play.core.assetpacks.zzz r8 = com.google.android.play.core.assetpacks.zzz.zza
            r6 = 0
            java.lang.String r3 = "AssetPackService"
            r0 = r11
            r2 = r12
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.zzf = r11
            com.google.android.play.core.internal.zzas r11 = new com.google.android.play.core.internal.zzas
            android.content.Context r3 = com.google.android.play.core.internal.zzce.zza(r10)
            r10 = 0
            java.lang.String r5 = "AssetPackService-keepAlive"
            r2 = r11
            r4 = r12
            r6 = r7
            r7 = r8
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.zzg = r11
        L45:
            com.google.android.play.core.internal.zzag r10 = com.google.android.play.core.assetpacks.zzaw.zza
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = "AssetPackService initiated."
            r10.zza(r12, r11)
            return
    }

    private static android.os.Bundle zzA() {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "playcore_version_code"
            r2 = 11003(0x2afb, float:1.5418E-41)
            r0.putInt(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            java.lang.String r3 = "supported_compression_formats"
            r0.putIntegerArrayList(r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            java.lang.String r2 = "supported_patch_formats"
            r0.putIntegerArrayList(r2, r1)
            return r0
    }

    private static android.os.Bundle zzB(int r2) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "session_id"
            r0.putInt(r1, r2)
            return r0
    }

    private static com.google.android.play.core.tasks.Task zzC() {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = -11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "onError(%d)"
            r0.zzb(r3, r1)
            com.google.android.play.core.assetpacks.AssetPackException r0 = new com.google.android.play.core.assetpacks.AssetPackException
            r0.<init>(r2)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zza(r0)
            return r0
    }

    private final void zzD(int r11, java.lang.String r12, int r13) {
            r10 = this;
            com.google.android.play.core.internal.zzas r0 = r10.zzf
            if (r0 == 0) goto L21
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "notifyModuleCompleted"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r10.zzf
            com.google.android.play.core.assetpacks.zzah r2 = new com.google.android.play.core.assetpacks.zzah
            r3 = r2
            r4 = r10
            r5 = r0
            r6 = r11
            r7 = r12
            r8 = r0
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.zzq(r2, r0)
            return
        L21:
            com.google.android.play.core.assetpacks.zzck r12 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r13 = "The Play Store app is not installed or is an unofficial version."
            r12.<init>(r13, r11)
            throw r12
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzk(int r0, java.lang.String r1, java.lang.String r2, int r3) {
            android.os.Bundle r0 = zzz(r0, r1)
            java.lang.String r1 = "slice_id"
            r0.putString(r1, r2)
            java.lang.String r1 = "chunk_number"
            r0.putInt(r1, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzl(int r0, java.lang.String r1) {
            android.os.Bundle r0 = zzz(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzm() {
            android.os.Bundle r0 = zzA()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzn(java.util.Map r6) {
            android.os.Bundle r0 = zzA()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L11:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "installed_asset_module_name"
            r3.putString(r5, r4)
            java.lang.Object r2 = r2.getValue()
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            java.lang.String r2 = "installed_asset_module_version"
            r3.putLong(r2, r4)
            r1.add(r3)
            goto L11
        L40:
            java.lang.String r6 = "installed_asset_module"
            r0.putParcelableArrayList(r6, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzo(int r0) {
            android.os.Bundle r0 = zzB(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.assetpacks.zzco zzp(com.google.android.play.core.assetpacks.zzaw r0) {
            com.google.android.play.core.assetpacks.zzco r0 = r0.zzd
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.assetpacks.zzeb zzq(com.google.android.play.core.assetpacks.zzaw r0) {
            com.google.android.play.core.assetpacks.zzeb r0 = r0.zze
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzag zzr() {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzas zzs(com.google.android.play.core.assetpacks.zzaw r0) {
            com.google.android.play.core.internal.zzas r0 = r0.zzf
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzas zzt(com.google.android.play.core.assetpacks.zzaw r0) {
            com.google.android.play.core.internal.zzas r0 = r0.zzg
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zzu(com.google.android.play.core.assetpacks.zzaw r0) {
            java.lang.String r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.ArrayList zzv(java.util.Collection r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "module_name"
            r2.putString(r3, r1)
            r0.add(r2)
            goto Ld
        L27:
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List zzw(com.google.android.play.core.assetpacks.zzaw r5, java.util.List r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r6.next()
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.play.core.assetpacks.zzco r2 = r5.zzd
            com.google.android.play.core.assetpacks.zzeb r3 = r5.zze
            com.google.android.play.core.assetpacks.AssetPackStates r1 = com.google.android.play.core.assetpacks.AssetPackStates.zza(r1, r2, r3)
            java.util.Map r1 = r1.packStates()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            com.google.android.play.core.assetpacks.AssetPackState r1 = (com.google.android.play.core.assetpacks.AssetPackState) r1
            if (r1 != 0) goto L3b
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.assetpacks.zzaw.zza
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "onGetSessionStates: Bundle contained no pack."
            r2.zzb(r4, r3)
        L3b:
            int r2 = r1.status()
            boolean r2 = com.google.android.play.core.assetpacks.zzbg.zza(r2)
            if (r2 == 0) goto L9
            java.lang.String r1 = r1.name()
            r0.add(r1)
            goto L9
        L4d:
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzx(com.google.android.play.core.assetpacks.zzaw r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zzh
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzy(com.google.android.play.core.assetpacks.zzaw r0, int r1, java.lang.String r2, int r3) {
            r0.zzD(r1, r2, r3)
            return
    }

    private static android.os.Bundle zzz(int r1, java.lang.String r2) {
            android.os.Bundle r1 = zzB(r1)
            java.lang.String r0 = "module_name"
            r1.putString(r0, r2)
            return r1
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zza(int r12, java.lang.String r13, java.lang.String r14, int r15) {
            r11 = this;
            com.google.android.play.core.internal.zzas r0 = r11.zzf
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r12 = zzC()
            return r12
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r13
            r2 = 1
            r1[r2] = r14
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r1[r2] = r3
            r2 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r1[r2] = r3
            java.lang.String r2 = "getChunkFileDescriptor(%s, %s, %d, session=%d)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r11.zzf
            com.google.android.play.core.assetpacks.zzaj r2 = new com.google.android.play.core.assetpacks.zzaj
            r3 = r2
            r4 = r11
            r5 = r0
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r12 = r0.zza()
            return r12
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zzb(java.util.List r11, com.google.android.play.core.assetpacks.zzbe r12, java.util.Map r13) {
            r10 = this;
            com.google.android.play.core.internal.zzas r0 = r10.zzf
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r11 = zzC()
            return r11
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r11
            java.lang.String r2 = "getPackStates(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r10.zzf
            com.google.android.play.core.assetpacks.zzaf r2 = new com.google.android.play.core.assetpacks.zzaf
            r3 = r2
            r4 = r10
            r5 = r0
            r6 = r11
            r7 = r13
            r8 = r0
            r9 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r11 = r0.zza()
            return r11
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zzc(java.util.List r11, java.util.List r12, java.util.Map r13) {
            r10 = this;
            com.google.android.play.core.internal.zzas r0 = r10.zzf
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r11 = zzC()
            return r11
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r12
            java.lang.String r2 = "startDownload(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r10.zzf
            com.google.android.play.core.assetpacks.zzac r2 = new com.google.android.play.core.assetpacks.zzac
            r3 = r2
            r4 = r10
            r5 = r0
            r6 = r12
            r7 = r13
            r8 = r0
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r11 = r0.zza()
            com.google.android.play.core.assetpacks.zzaa r12 = new com.google.android.play.core.assetpacks.zzaa
            r12.<init>(r10)
            r11.addOnSuccessListener(r12)
            com.google.android.play.core.tasks.Task r11 = r0.zza()
            return r11
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zzd(java.util.Map r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zzf
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r4 = zzC()
            return r4
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "syncPacks"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zzf
            com.google.android.play.core.assetpacks.zzae r2 = new com.google.android.play.core.assetpacks.zzae
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zze(java.util.List r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zzf
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "cancelDownloads(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zzf
            com.google.android.play.core.assetpacks.zzad r2 = new com.google.android.play.core.assetpacks.zzad
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final synchronized void zzf() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.play.core.internal.zzas r0 = r4.zzg     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "Keep alive connection manager is not initialized."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3d
            r0.zze(r2, r1)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r4)
            return
        L11:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "keepAlive"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3d
            r0.zzd(r2, r3)     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.zzh     // Catch: java.lang.Throwable -> L3d
            r3 = 1
            boolean r2 = r2.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2c
            java.lang.String r2 = "Service is already kept alive."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3d
            r0.zzd(r2, r1)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r4)
            return
        L2c:
            com.google.android.play.core.tasks.zzi r0 = new com.google.android.play.core.tasks.zzi     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            com.google.android.play.core.internal.zzas r1 = r4.zzg     // Catch: java.lang.Throwable -> L3d
            com.google.android.play.core.assetpacks.zzak r2 = new com.google.android.play.core.assetpacks.zzak     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r4, r0, r0)     // Catch: java.lang.Throwable -> L3d
            r1.zzq(r2, r0)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r4)
            return
        L3d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzg(int r12, java.lang.String r13, java.lang.String r14, int r15) {
            r11 = this;
            com.google.android.play.core.internal.zzas r0 = r11.zzf
            if (r0 == 0) goto L22
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "notifyChunkTransferred"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r11.zzf
            com.google.android.play.core.assetpacks.zzag r2 = new com.google.android.play.core.assetpacks.zzag
            r3 = r2
            r4 = r11
            r5 = r0
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.zzq(r2, r0)
            return
        L22:
            com.google.android.play.core.assetpacks.zzck r13 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r14 = "The Play Store app is not installed or is an unofficial version."
            r13.<init>(r14, r12)
            throw r13
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzh(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 10
            r1.zzD(r2, r3, r0)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzi(int r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zzf
            if (r0 == 0) goto L1a
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "notifySessionFailed"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zzf
            com.google.android.play.core.assetpacks.zzai r2 = new com.google.android.play.core.assetpacks.zzai
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            return
        L1a:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "The Play Store app is not installed or is an unofficial version."
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzj(java.lang.String r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zzf
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzaw.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "removePack(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zzf
            com.google.android.play.core.assetpacks.zzab r2 = new com.google.android.play.core.assetpacks.zzab
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            return
    }
}
