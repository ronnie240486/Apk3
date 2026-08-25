package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzeb {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final com.google.android.play.core.assetpacks.zzbh zzb;
    private final com.google.android.play.core.assetpacks.zzed zzc;
    private final com.google.android.play.core.common.zza zzd;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "PackMetadataManager"
            r0.<init>(r1)
            com.google.android.play.core.assetpacks.zzeb.zza = r0
            return
    }

    public zzeb(com.google.android.play.core.assetpacks.zzbh r1, com.google.android.play.core.assetpacks.zzed r2, com.google.android.play.core.common.zza r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            return
    }

    public final java.lang.String zza(java.lang.String r7) {
            r6 = this;
            com.google.android.play.core.common.zza r0 = r6.zzd
            java.lang.String r1 = "assetOnlyUpdates"
            boolean r0 = r0.zza(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L68
            com.google.android.play.core.assetpacks.zzbh r0 = r6.zzb
            boolean r0 = r0.zzG(r7)
            if (r0 != 0) goto L15
            goto L68
        L15:
            com.google.android.play.core.assetpacks.zzed r0 = r6.zzc
            int r0 = r0.zza()
            com.google.android.play.core.assetpacks.zzbh r2 = r6.zzb
            long r3 = r2.zzc(r7)
            java.io.File r5 = new java.io.File
            java.io.File r2 = r2.zzi(r7, r0, r3)
            java.lang.String r3 = "properties.dat"
            r5.<init>(r2, r3)
            boolean r2 = r5.exists()     // Catch: java.io.IOException -> L5b
            if (r2 != 0) goto L37
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L5b
            goto L55
        L37:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L5b
            r2.<init>(r5)     // Catch: java.io.IOException -> L5b
            java.util.Properties r3 = new java.util.Properties     // Catch: java.lang.Throwable -> L56
            r3.<init>()     // Catch: java.lang.Throwable -> L56
            r3.load(r2)     // Catch: java.lang.Throwable -> L56
            r2.close()     // Catch: java.io.IOException -> L5b
            java.lang.String r2 = "moduleVersionTag"
            java.lang.String r2 = r3.getProperty(r2)     // Catch: java.io.IOException -> L5b
            if (r2 != 0) goto L54
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L5b
            goto L55
        L54:
            r7 = r2
        L55:
            return r7
        L56:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L5a
        L5a:
            throw r0     // Catch: java.io.IOException -> L5b
        L5b:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.assetpacks.zzeb.zza
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            java.lang.String r7 = "Failed to read pack version tag for pack %s"
            r0.zzb(r7, r2)
        L68:
            return r1
    }

    public final void zzb(java.lang.String r4, int r5, long r6, @androidx.annotation.Nullable java.lang.String r8) throws java.io.IOException {
            r3 = this;
            if (r8 == 0) goto L8
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto Lc
        L8:
            java.lang.String r8 = java.lang.String.valueOf(r5)
        Lc:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "moduleVersionTag"
            r0.put(r1, r8)
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            com.google.android.play.core.assetpacks.zzbh r1 = r3.zzb
            java.util.Objects.requireNonNull(r1)
            java.io.File r2 = new java.io.File
            java.io.File r4 = r1.zzi(r4, r5, r6)
            java.lang.String r5 = "properties.dat"
            r2.<init>(r4, r5)
            java.io.File r4 = r2.getParentFile()
            r4.mkdirs()
            r2.createNewFile()
            r8.<init>(r2)
            r4 = 0
            r0.store(r8, r4)     // Catch: java.lang.Throwable -> L3d
            r8.close()
            return
        L3d:
            r4 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L41
        L41:
            throw r4
    }
}
