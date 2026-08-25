package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdo implements com.google.android.play.core.assetpacks.zzy {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private static final java.util.concurrent.atomic.AtomicInteger zzb = null;
    private final java.lang.String zzc;
    private final com.google.android.play.core.assetpacks.zzbb zzd;
    private final com.google.android.play.core.assetpacks.zzco zze;
    private final android.content.Context zzf;
    private final com.google.android.play.core.assetpacks.zzed zzg;
    private final com.google.android.play.core.internal.zzco zzh;
    private final com.google.android.play.core.assetpacks.zzeb zzi;
    private final android.os.Handler zzj;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "FakeAssetPackService"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzdo.zza = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzdo.zzb = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    public zzdo(java.io.File r3, com.google.android.play.core.assetpacks.zzbb r4, com.google.android.play.core.assetpacks.zzco r5, android.content.Context r6, com.google.android.play.core.assetpacks.zzed r7, com.google.android.play.core.internal.zzco r8, com.google.android.play.core.assetpacks.zzeb r9) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zzj = r0
            java.lang.String r3 = r3.getAbsolutePath()
            r2.zzc = r3
            r2.zzd = r4
            r2.zze = r5
            r2.zzf = r6
            r2.zzg = r7
            r2.zzh = r8
            r2.zzi = r9
            return
    }

    @androidx.annotation.VisibleForTesting
    public static long zzk(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r2, long r3) {
            r0 = 2
            if (r2 == r0) goto Ld
            r0 = 3
            if (r2 == r0) goto Lc
            r0 = 4
            if (r2 == r0) goto Lc
            r2 = 0
            return r2
        Lc:
            return r3
        Ld:
            r0 = 2
            long r3 = r3 / r0
            return r3
    }

    private final android.os.Bundle zzp(int r13, java.lang.String r14, @com.google.android.play.core.assetpacks.model.AssetPackStatus int r15) throws com.google.android.play.core.common.LocalTestingException {
            r12 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.play.core.assetpacks.zzed r1 = r12.zzg
            int r1 = r1.zza()
            java.lang.String r2 = "app_version_code"
            r0.putInt(r2, r1)
            java.lang.String r1 = "session_id"
            r0.putInt(r1, r13)
            java.io.File[] r13 = r12.zzs(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r13.length
            r3 = 0
            r4 = 0
            r6 = 0
        L24:
            if (r6 >= r2) goto L74
            r7 = r13[r6]
            long r8 = r7.length()
            long r4 = r4 + r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 3
            if (r15 != r9) goto L41
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            android.net.Uri r10 = android.net.Uri.EMPTY
            android.content.Intent r9 = r9.setData(r10)
            goto L42
        L41:
            r9 = 0
        L42:
            r8.add(r9)
            java.lang.String r9 = com.google.android.play.core.internal.zzcj.zza(r7)
            java.lang.String r10 = "chunk_intents"
            java.lang.String r10 = com.google.android.play.core.assetpacks.model.zzb.zzb(r10, r14, r9)
            r0.putParcelableArrayList(r10, r8)
            java.lang.String r8 = "uncompressed_hash_sha256"
            java.lang.String r8 = com.google.android.play.core.assetpacks.model.zzb.zzb(r8, r14, r9)
            java.lang.String r10 = zzr(r7)
            r0.putString(r8, r10)
            java.lang.String r8 = "uncompressed_size"
            java.lang.String r8 = com.google.android.play.core.assetpacks.model.zzb.zzb(r8, r14, r9)
            long r10 = r7.length()
            r0.putLong(r8, r10)
            r1.add(r9)
            int r6 = r6 + 1
            goto L24
        L74:
            java.lang.String r13 = "slice_ids"
            java.lang.String r13 = com.google.android.play.core.assetpacks.model.zzb.zza(r13, r14)
            r0.putStringArrayList(r13, r1)
            java.lang.String r13 = "pack_version"
            java.lang.String r13 = com.google.android.play.core.assetpacks.model.zzb.zza(r13, r14)
            com.google.android.play.core.assetpacks.zzed r1 = r12.zzg
            int r1 = r1.zza()
            long r1 = (long) r1
            r0.putLong(r13, r1)
            java.lang.String r13 = "status"
            java.lang.String r13 = com.google.android.play.core.assetpacks.model.zzb.zza(r13, r14)
            r0.putInt(r13, r15)
            java.lang.String r13 = "error_code"
            java.lang.String r13 = com.google.android.play.core.assetpacks.model.zzb.zza(r13, r14)
            r0.putInt(r13, r3)
            java.lang.String r13 = "bytes_downloaded"
            java.lang.String r1 = com.google.android.play.core.assetpacks.model.zzb.zza(r13, r14)
            long r6 = zzk(r15, r4)
            r0.putLong(r1, r6)
            java.lang.String r1 = "total_bytes_to_download"
            java.lang.String r2 = com.google.android.play.core.assetpacks.model.zzb.zza(r1, r14)
            r0.putLong(r2, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]
            r6[r3] = r14
            java.util.List r14 = java.util.Arrays.asList(r6)
            r2.<init>(r14)
            java.lang.String r14 = "pack_names"
            r0.putStringArrayList(r14, r2)
            long r14 = zzk(r15, r4)
            r0.putLong(r13, r14)
            r0.putLong(r1, r4)
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r14 = "com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"
            r13.<init>(r14)
            java.lang.String r14 = "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE"
            android.content.Intent r13 = r13.putExtra(r14, r0)
            android.os.Handler r14 = r12.zzj
            com.google.android.play.core.assetpacks.zzdl r15 = new com.google.android.play.core.assetpacks.zzdl
            r15.<init>(r12, r13)
            r14.post(r15)
            return r0
    }

    private final com.google.android.play.core.assetpacks.AssetPackState zzq(java.lang.String r15, @com.google.android.play.core.assetpacks.model.AssetPackStatus int r16) throws com.google.android.play.core.common.LocalTestingException {
            r14 = this;
            r0 = r14
            r1 = r15
            java.io.File[] r2 = r14.zzs(r15)
            int r3 = r2.length
            r4 = 0
            r6 = 0
            r7 = r4
        Lb:
            if (r6 >= r3) goto L17
            r4 = r2[r6]
            long r4 = r4.length()
            long r7 = r7 + r4
            int r6 = r6 + 1
            goto Lb
        L17:
            r3 = 0
            r2 = r16
            long r4 = zzk(r2, r7)
            com.google.android.play.core.assetpacks.zzco r6 = r0.zze
            double r9 = r6.zza(r15)
            r11 = 1
            com.google.android.play.core.assetpacks.zzed r6 = r0.zzg
            int r6 = r6.zza()
            java.lang.String r12 = java.lang.String.valueOf(r6)
            com.google.android.play.core.assetpacks.zzeb r6 = r0.zzi
            java.lang.String r13 = r6.zza(r15)
            r1 = r15
            r6 = r7
            r8 = r9
            r10 = r11
            r11 = r12
            r12 = r13
            com.google.android.play.core.assetpacks.AssetPackState r1 = com.google.android.play.core.assetpacks.AssetPackState.zzb(r1, r2, r3, r4, r6, r8, r10, r11, r12)
            return r1
    }

    private static java.lang.String zzr(java.io.File r4) throws com.google.android.play.core.common.LocalTestingException {
            r0 = 0
            r1 = 1
            java.io.File[] r2 = new java.io.File[r1]     // Catch: java.io.IOException -> Lf java.security.NoSuchAlgorithmException -> L20
            r2[r0] = r4     // Catch: java.io.IOException -> Lf java.security.NoSuchAlgorithmException -> L20
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.io.IOException -> Lf java.security.NoSuchAlgorithmException -> L20
            java.lang.String r4 = com.google.android.play.core.assetpacks.zzdq.zza(r2)     // Catch: java.io.IOException -> Lf java.security.NoSuchAlgorithmException -> L20
            return r4
        Lf:
            r2 = move-exception
            com.google.android.play.core.common.LocalTestingException r3 = new com.google.android.play.core.common.LocalTestingException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.String r4 = "Could not digest file: %s."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r3.<init>(r4, r2)
            throw r3
        L20:
            r4 = move-exception
            com.google.android.play.core.common.LocalTestingException r0 = new com.google.android.play.core.common.LocalTestingException
            java.lang.String r1 = "SHA256 algorithm not supported."
            r0.<init>(r1, r4)
            throw r0
    }

    private final java.io.File[] zzs(java.lang.String r7) throws com.google.android.play.core.common.LocalTestingException {
            r6 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r6.zzc
            r0.<init>(r1)
            boolean r1 = r0.isDirectory()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L60
            com.google.android.play.core.assetpacks.zzdj r1 = new com.google.android.play.core.assetpacks.zzdj
            r1.<init>(r7)
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto L50
            int r1 = r0.length
            if (r1 == 0) goto L40
            r4 = 0
        L1e:
            if (r4 >= r1) goto L30
            r5 = r0[r4]
            java.lang.String r5 = com.google.android.play.core.internal.zzcj.zza(r5)
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L2d
            return r0
        L2d:
            int r4 = r4 + 1
            goto L1e
        L30:
            com.google.android.play.core.common.LocalTestingException r0 = new com.google.android.play.core.common.LocalTestingException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r7
            java.lang.String r7 = "No main slice available for pack '%s'."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r0.<init>(r7)
            throw r0
        L40:
            com.google.android.play.core.common.LocalTestingException r0 = new com.google.android.play.core.common.LocalTestingException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r7
            java.lang.String r7 = "No APKs available for pack '%s'."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r0.<init>(r7)
            throw r0
        L50:
            com.google.android.play.core.common.LocalTestingException r0 = new com.google.android.play.core.common.LocalTestingException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r7
            java.lang.String r7 = "Failed fetching APKs for pack '%s'."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r0.<init>(r7)
            throw r0
        L60:
            com.google.android.play.core.common.LocalTestingException r7 = new com.google.android.play.core.common.LocalTestingException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r0
            java.lang.String r0 = "Local testing directory '%s' not found."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r7.<init>(r0)
            throw r7
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zza(int r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            java.lang.String r0 = "getChunkFileDescriptor failed"
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzdo.zza
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3 = 0
            r2[r3] = r7
            r7 = 1
            r2[r7] = r8
            r4 = 2
            r2[r4] = r9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4 = 3
            r2[r4] = r10
            java.lang.String r10 = "getChunkFileDescriptor(session=%d, %s, %s, %d)"
            r1.zzd(r10, r2)
            com.google.android.play.core.tasks.zzi r10 = new com.google.android.play.core.tasks.zzi
            r10.<init>()
            java.io.File[] r8 = r6.zzs(r8)     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            int r1 = r8.length     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            r2 = 0
        L2b:
            if (r2 >= r1) goto L46
            r4 = r8[r2]     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            java.lang.String r5 = com.google.android.play.core.internal.zzcj.zza(r4)     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            boolean r5 = r5.equals(r9)     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            if (r5 == 0) goto L43
            r8 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r8 = android.os.ParcelFileDescriptor.open(r4, r8)     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            r10.zzc(r8)     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            goto L78
        L43:
            int r2 = r2 + 1
            goto L2b
        L46:
            com.google.android.play.core.common.LocalTestingException r8 = new com.google.android.play.core.common.LocalTestingException     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            r1[r3] = r9     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            java.lang.String r9 = "Local testing slice for '%s' not found."
            java.lang.String r9 = java.lang.String.format(r9, r1)     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            r8.<init>(r9)     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
            throw r8     // Catch: com.google.android.play.core.common.LocalTestingException -> L56 java.io.FileNotFoundException -> L64
        L56:
            r8 = move-exception
            com.google.android.play.core.internal.zzag r9 = com.google.android.play.core.assetpacks.zzdo.zza
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r8
            r9.zze(r0, r7)
            r10.zzb(r8)
            goto L78
        L64:
            r8 = move-exception
            com.google.android.play.core.internal.zzag r9 = com.google.android.play.core.assetpacks.zzdo.zza
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r8
            r9.zze(r0, r7)
            com.google.android.play.core.common.LocalTestingException r7 = new com.google.android.play.core.common.LocalTestingException
            java.lang.String r9 = "Asset Slice file not found."
            r7.<init>(r9, r8)
            r10.zzb(r7)
        L78:
            com.google.android.play.core.tasks.Task r7 = r10.zza()
            return r7
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zzb(java.util.List r3, com.google.android.play.core.assetpacks.zzbe r4, java.util.Map r5) {
            r2 = this;
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.assetpacks.zzdo.zza
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r1 = "getPackStates(%s)"
            com.google.android.play.core.tasks.zzi r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r1, r0)
            com.google.android.play.core.internal.zzco r0 = r2.zzh
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzdm r1 = new com.google.android.play.core.assetpacks.zzdm
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            com.google.android.play.core.tasks.Task r3 = r5.zza()
            return r3
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zzc(java.util.List r3, java.util.List r4, java.util.Map r5) {
            r2 = this;
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.assetpacks.zzdo.zza
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r1 = "startDownload(%s)"
            com.google.android.play.core.tasks.zzi r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r1, r0)
            com.google.android.play.core.internal.zzco r0 = r2.zzh
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzdn r1 = new com.google.android.play.core.assetpacks.zzdn
            r1.<init>(r2, r4, r5, r3)
            r0.execute(r1)
            com.google.android.play.core.tasks.Task r3 = r5.zza()
            return r3
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final com.google.android.play.core.tasks.Task zzd(java.util.Map r3) {
            r2 = this;
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzdo.zza
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "syncPacks()"
            r3.zzd(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.android.play.core.tasks.Task r3 = com.google.android.play.core.tasks.Tasks.zzb(r3)
            return r3
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zze(java.util.List r4) {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdo.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "cancelDownload(%s)"
            r0.zzd(r4, r1)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzf() {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdo.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "keepAlive"
            r0.zzd(r2, r1)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzg(int r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzdo.zza
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "notifyChunkTransferred"
            r1.zzd(r3, r2)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzh(int r4, java.lang.String r5) {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdo.zza
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "notifyModuleCompleted"
            r0.zzd(r2, r1)
            com.google.android.play.core.internal.zzco r0 = r3.zzh
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.play.core.assetpacks.zzdk r1 = new com.google.android.play.core.assetpacks.zzdk
            r1.<init>(r3, r4, r5)
            r0.execute(r1)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzi(int r3) {
            r2 = this;
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzdo.zza
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "notifySessionFailed"
            r3.zzd(r1, r0)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    public final void zzj(java.lang.String r4) {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzdo.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "removePack(%s)"
            r0.zzd(r4, r1)
            return
    }

    public final /* synthetic */ void zzl(android.content.Intent r3) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzbb r0 = r2.zzd
            android.content.Context r1 = r2.zzf
            r0.zza(r1, r3)
            return
    }

    public final /* synthetic */ void zzm(java.util.List r8, com.google.android.play.core.assetpacks.zzbe r9, com.google.android.play.core.tasks.zzi r10) {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        Lb:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r9
            com.google.android.play.core.assetpacks.zze r4 = (com.google.android.play.core.assetpacks.zze) r4
            com.google.android.play.core.assetpacks.zzl r4 = r4.zza
            r5 = 8
            int r4 = r4.zza(r5, r3)
            com.google.android.play.core.assetpacks.AssetPackState r4 = r7.zzq(r3, r4)     // Catch: com.google.android.play.core.common.LocalTestingException -> L2f
            long r5 = r4.totalBytesToDownload()
            long r1 = r1 + r5
            r0.put(r3, r4)
            goto Lb
        L2f:
            r8 = move-exception
            r10.zzb(r8)
            return
        L34:
            com.google.android.play.core.assetpacks.zzbo r8 = new com.google.android.play.core.assetpacks.zzbo
            r8.<init>(r1, r0)
            r10.zzc(r8)
            return
    }

    public final /* synthetic */ void zzn(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 4
            r2.zzp(r3, r4, r0)     // Catch: com.google.android.play.core.common.LocalTestingException -> L5
            return
        L5:
            r3 = move-exception
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzdo.zza
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "notifyModuleCompleted failed"
            r4.zze(r3, r0)
            return
    }

    public final /* synthetic */ void zzo(java.util.List r20, com.google.android.play.core.tasks.zzi r21, java.util.List r22) {
            r19 = this;
            r1 = r19
            r2 = r21
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r3 = r20.iterator()
            r4 = 0
        Lf:
            boolean r6 = r3.hasNext()
            r7 = 1
            if (r6 == 0) goto L2f
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.play.core.assetpacks.AssetPackState r7 = r1.zzq(r6, r7)     // Catch: com.google.android.play.core.common.LocalTestingException -> L29
            long r8 = r7.totalBytesToDownload()
            long r4 = r4 + r8
            r0.put(r6, r7)
            goto Lf
        L29:
            r0 = move-exception
            r3 = r0
            r2.zzb(r3)
            return
        L2f:
            java.util.Iterator r3 = r20.iterator()
        L33:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.concurrent.atomic.AtomicInteger r8 = com.google.android.play.core.assetpacks.zzdo.zzb     // Catch: com.google.android.play.core.common.LocalTestingException -> L51
            int r8 = r8.getAndIncrement()     // Catch: com.google.android.play.core.common.LocalTestingException -> L51
            r1.zzp(r8, r6, r7)     // Catch: com.google.android.play.core.common.LocalTestingException -> L51
            r9 = 2
            r1.zzp(r8, r6, r9)     // Catch: com.google.android.play.core.common.LocalTestingException -> L51
            r9 = 3
            r1.zzp(r8, r6, r9)     // Catch: com.google.android.play.core.common.LocalTestingException -> L51
            goto L33
        L51:
            r0 = move-exception
            r2.zzb(r0)
            return
        L56:
            java.util.Iterator r3 = r22.iterator()
        L5a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            r8 = 4
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 1
            com.google.android.play.core.assetpacks.zzed r7 = r1.zzg
            int r7 = r7.zza()
            java.lang.String r17 = java.lang.String.valueOf(r7)
            com.google.android.play.core.assetpacks.zzed r7 = r1.zzg
            int r7 = r7.zza()
            java.lang.String r18 = java.lang.String.valueOf(r7)
            r7 = r6
            com.google.android.play.core.assetpacks.AssetPackState r7 = com.google.android.play.core.assetpacks.AssetPackState.zzb(r7, r8, r9, r10, r12, r14, r16, r17, r18)
            r0.put(r6, r7)
            goto L5a
        L8d:
            com.google.android.play.core.assetpacks.zzbo r3 = new com.google.android.play.core.assetpacks.zzbo
            r3.<init>(r4, r0)
            r2.zzc(r3)
            return
    }
}
