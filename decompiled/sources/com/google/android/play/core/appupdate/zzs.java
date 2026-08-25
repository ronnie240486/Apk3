package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzs {
    private final android.content.Context zza;

    public zzs(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static long zzb(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto Lb
            long r0 = r6.length()
            return r0
        Lb:
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 == 0) goto L21
            int r2 = r6.length
            r3 = 0
        L15:
            if (r3 >= r2) goto L21
            r4 = r6[r3]
            long r4 = zzb(r4)
            long r0 = r0 + r4
            int r3 = r3 + 1
            goto L15
        L21:
            return r0
    }

    public final long zza() {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.zza
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "assetpacks"
            r0.<init>(r1, r2)
            long r0 = zzb(r0)
            return r0
    }
}
