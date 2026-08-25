package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzde {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzbh zzb;
    private final com.google.android.play.core.internal.zzco zzc;
    private final com.google.android.play.core.assetpacks.zzco zzd;
    private final com.google.android.play.core.internal.zzco zze;
    private final java.util.Map zzf;
    private final java.util.concurrent.locks.ReentrantLock zzg;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "ExtractorSessionStoreView"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzde.zza = r0
            return
    }

    public zzde(com.google.android.play.core.assetpacks.zzbh r1, com.google.android.play.core.internal.zzco r2, com.google.android.play.core.assetpacks.zzco r3, com.google.android.play.core.internal.zzco r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzf = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.zzg = r1
            return
    }

    private final com.google.android.play.core.assetpacks.zzdb zzq(int r5) {
            r4 = this;
            java.util.Map r0 = r4.zzf
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.play.core.assetpacks.zzdb r0 = (com.google.android.play.core.assetpacks.zzdb) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "Could not find session %d while trying to get it"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1, r5)
            throw r0
    }

    private final java.lang.Object zzr(com.google.android.play.core.assetpacks.zzdd r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.zzg     // Catch: java.lang.Throwable -> Lf
            r0.lock()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.locks.ReentrantLock r0 = r1.zzg
            r0.unlock()
            return r2
        Lf:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r1.zzg
            r0.unlock()
            throw r2
    }

    private static java.lang.String zzs(android.os.Bundle r1) {
            java.lang.String r0 = "pack_names"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)
            if (r1 == 0) goto L16
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L16
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L16:
            com.google.android.play.core.assetpacks.zzck r1 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r0 = "Session without pack received."
            r1.<init>(r0)
            throw r1
    }

    private static java.util.List zzt(java.util.List r0) {
            if (r0 != 0) goto L6
            java.util.List r0 = java.util.Collections.emptyList()
        L6:
            return r0
    }

    private final java.util.Map zzu(java.util.List r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzcx r0 = new com.google.android.play.core.assetpacks.zzcx
            r0.<init>(r1, r2)
            java.lang.Object r2 = r1.zzr(r0)
            java.util.Map r2 = (java.util.Map) r2
            return r2
    }

    public final /* synthetic */ java.lang.Boolean zza(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "session_id"
            int r0 = r4.getInt(r0)
            if (r0 != 0) goto Lc
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        Lc:
            java.util.Map r1 = r3.zzf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L1b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L1b:
            java.util.Map r1 = r3.zzf
            java.lang.Object r0 = r1.get(r0)
            com.google.android.play.core.assetpacks.zzdb r0 = (com.google.android.play.core.assetpacks.zzdb) r0
            com.google.android.play.core.assetpacks.zzda r1 = r0.zzc
            int r1 = r1.zzd
            r2 = 6
            if (r1 != r2) goto L2d
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L2d:
            java.lang.String r1 = zzs(r4)
            java.lang.String r2 = "status"
            java.lang.String r1 = com.google.android.play.core.assetpacks.model.zzb.zza(r2, r1)
            int r4 = r4.getInt(r1)
            com.google.android.play.core.assetpacks.zzda r0 = r0.zzc
            int r0 = r0.zzd
            boolean r4 = com.google.android.play.core.assetpacks.zzbg.zzc(r0, r4)
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }

    public final /* synthetic */ java.lang.Boolean zzb(android.os.Bundle r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            java.lang.String r2 = "session_id"
            int r2 = r1.getInt(r2)
            if (r2 != 0) goto L10
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L10:
            java.util.Map r3 = r0.zzf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.containsKey(r4)
            java.lang.String r5 = "chunk_intents"
            java.lang.String r6 = "status"
            r7 = 1
            r8 = 0
            if (r3 == 0) goto Leb
            com.google.android.play.core.assetpacks.zzdb r3 = r0.zzq(r2)
            com.google.android.play.core.assetpacks.zzda r9 = r3.zzc
            java.lang.String r9 = r9.zza
            java.lang.String r6 = com.google.android.play.core.assetpacks.model.zzb.zza(r6, r9)
            int r6 = r1.getInt(r6)
            com.google.android.play.core.assetpacks.zzda r9 = r3.zzc
            int r10 = r9.zzd
            boolean r11 = com.google.android.play.core.assetpacks.zzbg.zzc(r10, r6)
            if (r11 == 0) goto L8d
            com.google.android.play.core.internal.zzag r1 = com.google.android.play.core.assetpacks.zzde.zza
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r5[r7] = r4
            java.lang.String r4 = "Found stale update for session %s with status %d."
            r1.zza(r4, r5)
            com.google.android.play.core.assetpacks.zzda r1 = r3.zzc
            java.lang.String r3 = r1.zza
            int r1 = r1.zzd
            r4 = 4
            if (r1 != r4) goto L65
            com.google.android.play.core.internal.zzco r1 = r0.zzc
            java.lang.Object r1 = r1.zza()
            com.google.android.play.core.assetpacks.zzy r1 = (com.google.android.play.core.assetpacks.zzy) r1
            r1.zzh(r2, r3)
            goto L1d8
        L65:
            r4 = 5
            if (r1 != r4) goto L75
            com.google.android.play.core.internal.zzco r1 = r0.zzc
            java.lang.Object r1 = r1.zza()
            com.google.android.play.core.assetpacks.zzy r1 = (com.google.android.play.core.assetpacks.zzy) r1
            r1.zzi(r2)
            goto L1d8
        L75:
            r2 = 6
            if (r1 != r2) goto L1d8
            com.google.android.play.core.internal.zzco r1 = r0.zzc
            java.lang.Object r1 = r1.zza()
            com.google.android.play.core.assetpacks.zzy r1 = (com.google.android.play.core.assetpacks.zzy) r1
            java.lang.String[] r2 = new java.lang.String[r7]
            r2[r8] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.zze(r2)
            goto L1d8
        L8d:
            r9.zzd = r6
            boolean r4 = com.google.android.play.core.assetpacks.zzbg.zzd(r6)
            if (r4 == 0) goto La3
            r0.zzn(r2)
            com.google.android.play.core.assetpacks.zzco r1 = r0.zzd
            com.google.android.play.core.assetpacks.zzda r2 = r3.zzc
            java.lang.String r2 = r2.zza
            r1.zzc(r2)
            goto L1d8
        La3:
            java.util.List r2 = r9.zzf
            java.util.Iterator r2 = r2.iterator()
        La9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1d8
            java.lang.Object r4 = r2.next()
            com.google.android.play.core.assetpacks.zzdc r4 = (com.google.android.play.core.assetpacks.zzdc) r4
            com.google.android.play.core.assetpacks.zzda r6 = r3.zzc
            java.lang.String r6 = r6.zza
            java.lang.String r9 = r4.zza
            java.lang.String r6 = com.google.android.play.core.assetpacks.model.zzb.zzb(r5, r6, r9)
            java.util.ArrayList r6 = r1.getParcelableArrayList(r6)
            if (r6 == 0) goto La9
            r9 = 0
        Lc6:
            int r10 = r6.size()
            if (r9 >= r10) goto La9
            java.lang.Object r10 = r6.get(r9)
            if (r10 == 0) goto Le8
            java.lang.Object r10 = r6.get(r9)
            android.content.Intent r10 = (android.content.Intent) r10
            android.net.Uri r10 = r10.getData()
            if (r10 == 0) goto Le8
            java.util.List r10 = r4.zzd
            java.lang.Object r10 = r10.get(r9)
            com.google.android.play.core.assetpacks.zzcz r10 = (com.google.android.play.core.assetpacks.zzcz) r10
            r10.zza = r7
        Le8:
            int r9 = r9 + 1
            goto Lc6
        Leb:
            java.lang.String r11 = zzs(r28)
            java.lang.String r3 = "pack_version"
            java.lang.String r3 = com.google.android.play.core.assetpacks.model.zzb.zza(r3, r11)
            long r12 = r1.getLong(r3)
            java.lang.String r3 = "pack_version_tag"
            java.lang.String r3 = com.google.android.play.core.assetpacks.model.zzb.zza(r3, r11)
            java.lang.String r4 = ""
            java.lang.String r18 = r1.getString(r3, r4)
            java.lang.String r3 = com.google.android.play.core.assetpacks.model.zzb.zza(r6, r11)
            int r14 = r1.getInt(r3)
            java.lang.String r3 = "total_bytes_to_download"
            java.lang.String r3 = com.google.android.play.core.assetpacks.model.zzb.zza(r3, r11)
            long r15 = r1.getLong(r3)
            java.lang.String r3 = "slice_ids"
            java.lang.String r3 = com.google.android.play.core.assetpacks.model.zzb.zza(r3, r11)
            java.util.ArrayList r3 = r1.getStringArrayList(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r3 = zzt(r3)
            java.util.Iterator r3 = r3.iterator()
        L130:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1bc
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = com.google.android.play.core.assetpacks.model.zzb.zzb(r5, r11, r6)
            java.util.ArrayList r9 = r1.getParcelableArrayList(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r9 = zzt(r9)
            java.util.Iterator r9 = r9.iterator()
        L151:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L16c
            java.lang.Object r17 = r9.next()
            android.content.Intent r17 = (android.content.Intent) r17
            if (r17 == 0) goto L160
            goto L161
        L160:
            r7 = 0
        L161:
            com.google.android.play.core.assetpacks.zzcz r8 = new com.google.android.play.core.assetpacks.zzcz
            r8.<init>(r7)
            r10.add(r8)
            r7 = 1
            r8 = 0
            goto L151
        L16c:
            java.lang.String r7 = "uncompressed_hash_sha256"
            java.lang.String r7 = com.google.android.play.core.assetpacks.model.zzb.zzb(r7, r11, r6)
            java.lang.String r21 = r1.getString(r7)
            java.lang.String r7 = "uncompressed_size"
            java.lang.String r7 = com.google.android.play.core.assetpacks.model.zzb.zzb(r7, r11, r6)
            long r22 = r1.getLong(r7)
            java.lang.String r7 = "patch_format"
            java.lang.String r7 = com.google.android.play.core.assetpacks.model.zzb.zzb(r7, r11, r6)
            r8 = 0
            int r26 = r1.getInt(r7, r8)
            if (r26 == 0) goto L19e
            com.google.android.play.core.assetpacks.zzdc r7 = new com.google.android.play.core.assetpacks.zzdc
            r25 = 0
            r19 = r7
            r20 = r6
            r24 = r10
            r19.<init>(r20, r21, r22, r24, r25, r26)
            r8 = 0
            goto L1b6
        L19e:
            java.lang.String r7 = "compression_format"
            java.lang.String r7 = com.google.android.play.core.assetpacks.model.zzb.zzb(r7, r11, r6)
            r8 = 0
            int r25 = r1.getInt(r7, r8)
            com.google.android.play.core.assetpacks.zzdc r7 = new com.google.android.play.core.assetpacks.zzdc
            r26 = 0
            r19 = r7
            r20 = r6
            r24 = r10
            r19.<init>(r20, r21, r22, r24, r25, r26)
        L1b6:
            r4.add(r7)
            r7 = 1
            goto L130
        L1bc:
            com.google.android.play.core.assetpacks.zzda r3 = new com.google.android.play.core.assetpacks.zzda
            r10 = r3
            r17 = r4
            r10.<init>(r11, r12, r14, r15, r17, r18)
            com.google.android.play.core.assetpacks.zzdb r4 = new com.google.android.play.core.assetpacks.zzdb
            java.lang.String r5 = "app_version_code"
            int r1 = r1.getInt(r5)
            r4.<init>(r2, r1, r3)
            java.util.Map r1 = r0.zzf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r4)
        L1d8:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
    }

    public final /* synthetic */ void zzc(java.lang.String r6, int r7, long r8) {
            r5 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r6
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Map r1 = r5.zzu(r1)
            java.lang.Object r1 = r1.get(r6)
            com.google.android.play.core.assetpacks.zzdb r1 = (com.google.android.play.core.assetpacks.zzdb) r1
            if (r1 == 0) goto L20
            com.google.android.play.core.assetpacks.zzda r3 = r1.zzc
            int r3 = r3.zzd
            boolean r3 = com.google.android.play.core.assetpacks.zzbg.zzd(r3)
            if (r3 == 0) goto L31
        L20:
            com.google.android.play.core.internal.zzag r3 = com.google.android.play.core.assetpacks.zzde.zza
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            java.lang.String r4 = "Could not find pack %s while trying to complete it"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3.zzb(r0, r2)
        L31:
            com.google.android.play.core.assetpacks.zzbh r0 = r5.zzb
            r0.zzE(r6, r7, r8)
            com.google.android.play.core.assetpacks.zzda r6 = r1.zzc
            r7 = 4
            r6.zzd = r7
            return
    }

    public final /* synthetic */ void zzd(int r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzdb r2 = r1.zzq(r2)
            com.google.android.play.core.assetpacks.zzda r2 = r2.zzc
            r0 = 5
            r2.zzd = r0
            return
    }

    public final /* synthetic */ void zze(int r7) {
            r6 = this;
            com.google.android.play.core.assetpacks.zzdb r0 = r6.zzq(r7)
            com.google.android.play.core.assetpacks.zzda r1 = r0.zzc
            int r2 = r1.zzd
            boolean r2 = com.google.android.play.core.assetpacks.zzbg.zzd(r2)
            if (r2 == 0) goto L2f
            com.google.android.play.core.assetpacks.zzbh r7 = r6.zzb
            java.lang.String r2 = r1.zza
            int r3 = r0.zzb
            long r4 = r1.zzb
            r7.zzE(r2, r3, r4)
            com.google.android.play.core.assetpacks.zzda r7 = r0.zzc
            int r1 = r7.zzd
            r2 = 5
            if (r1 == r2) goto L23
            r2 = 6
            if (r1 != r2) goto L2e
        L23:
            com.google.android.play.core.assetpacks.zzbh r1 = r6.zzb
            java.lang.String r2 = r7.zza
            int r0 = r0.zzb
            long r3 = r7.zzb
            r1.zzF(r2, r0, r3)
        L2e:
            return
        L2f:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1[r2] = r3
            java.lang.String r2 = "Could not safely delete session %d because it is not in a terminal state."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r7)
            throw r0
    }

    public final java.util.Map zzf(java.util.List r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzcw r0 = new com.google.android.play.core.assetpacks.zzcw
            r0.<init>(r1, r2)
            java.lang.Object r2 = r1.zzr(r0)
            java.util.Map r2 = (java.util.Map) r2
            return r2
    }

    public final java.util.Map zzg() {
            r1 = this;
            java.util.Map r0 = r1.zzf
            return r0
    }

    public final /* synthetic */ java.util.Map zzh(java.util.List r9) {
            r8 = this;
            java.util.Map r0 = r8.zzu(r9)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            com.google.android.play.core.assetpacks.zzdb r3 = (com.google.android.play.core.assetpacks.zzdb) r3
            if (r3 != 0) goto L2b
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r3)
            goto Ld
        L2b:
            com.google.android.play.core.assetpacks.zzda r4 = r3.zzc
            int r5 = r4.zzd
            boolean r5 = com.google.android.play.core.assetpacks.zzbg.zza(r5)
            if (r5 == 0) goto L64
            r5 = 6
            r4.zzd = r5     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            com.google.android.play.core.internal.zzco r4 = r8.zze     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            java.lang.Object r4 = r4.zza()     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            com.google.android.play.core.assetpacks.zzcy r5 = new com.google.android.play.core.assetpacks.zzcy     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            r5.<init>(r8, r3)     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            r4.execute(r5)     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            com.google.android.play.core.assetpacks.zzco r4 = r8.zzd     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            r4.zzc(r2)     // Catch: com.google.android.play.core.assetpacks.zzck -> L4e
            goto L64
        L4e:
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.assetpacks.zzde.zza
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            int r7 = r3.zza
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r6] = r7
            r6 = 1
            r5[r6] = r2
            java.lang.String r6 = "Session %d with pack %s does not exist, no need to cancel."
            r4.zzd(r6, r5)
        L64:
            com.google.android.play.core.assetpacks.zzda r3 = r3.zzc
            int r3 = r3.zzd
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r3)
            goto Ld
        L70:
            return r1
    }

    public final /* synthetic */ java.util.Map zzi(java.util.List r7) {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r1 = r6.zzf
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            com.google.android.play.core.assetpacks.zzdb r2 = (com.google.android.play.core.assetpacks.zzdb) r2
            com.google.android.play.core.assetpacks.zzda r3 = r2.zzc
            java.lang.String r3 = r3.zza
            boolean r4 = r7.contains(r3)
            if (r4 == 0) goto Lf
            java.lang.Object r4 = r0.get(r3)
            com.google.android.play.core.assetpacks.zzdb r4 = (com.google.android.play.core.assetpacks.zzdb) r4
            if (r4 != 0) goto L2f
            r4 = -1
            goto L31
        L2f:
            int r4 = r4.zza
        L31:
            int r5 = r2.zza
            if (r4 >= r5) goto Lf
            r0.put(r3, r2)
            goto Lf
        L39:
            return r0
    }

    public final void zzj() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.zzg
            r0.lock()
            return
    }

    public final void zzk(java.lang.String r8, int r9, long r10) {
            r7 = this;
            com.google.android.play.core.assetpacks.zzcv r6 = new com.google.android.play.core.assetpacks.zzcv
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            r7.zzr(r6)
            return
    }

    public final void zzl() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.zzg
            r0.unlock()
            return
    }

    public final void zzm(int r3) {
            r2 = this;
            com.google.android.play.core.assetpacks.zzcs r0 = new com.google.android.play.core.assetpacks.zzcs
            r1 = 5
            r0.<init>(r2, r3, r1)
            r2.zzr(r0)
            return
    }

    public final void zzn(int r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzcr r0 = new com.google.android.play.core.assetpacks.zzcr
            r0.<init>(r1, r2)
            r1.zzr(r0)
            return
    }

    public final boolean zzo(android.os.Bundle r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzct r0 = new com.google.android.play.core.assetpacks.zzct
            r0.<init>(r1, r2)
            java.lang.Object r2 = r1.zzr(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public final boolean zzp(android.os.Bundle r2) {
            r1 = this;
            com.google.android.play.core.assetpacks.zzcu r0 = new com.google.android.play.core.assetpacks.zzcu
            r0.<init>(r1, r2)
            java.lang.Object r2 = r1.zzr(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }
}
