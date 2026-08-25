package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzy implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallRequest zza;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzaa zzb;

    public zzy(com.google.android.play.core.splitinstall.zzaa r1, com.google.android.play.core.splitinstall.SplitInstallRequest r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            com.google.android.play.core.splitinstall.zzaa r0 = r7.zzb
            com.google.android.play.core.splitinstall.zzx r0 = com.google.android.play.core.splitinstall.zzaa.zzc(r0)
            com.google.android.play.core.splitinstall.SplitInstallRequest r1 = r7.zza
            java.util.List r1 = r1.getModuleNames()
            com.google.android.play.core.splitinstall.SplitInstallRequest r2 = r7.zza
            java.util.List r2 = r2.getLanguages()
            java.util.List r2 = com.google.android.play.core.splitinstall.zzaa.zzd(r2)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "session_id"
            r5 = 0
            r3.putInt(r4, r5)
            java.lang.String r4 = "status"
            r6 = 5
            r3.putInt(r4, r6)
            java.lang.String r4 = "error_code"
            r3.putInt(r4, r5)
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L3e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.lang.String r1 = "module_names"
            r3.putStringArrayList(r1, r4)
        L3e:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L4e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.lang.String r2 = "languages"
            r3.putStringArrayList(r2, r1)
        L4e:
            java.lang.String r1 = "total_bytes_to_download"
            r4 = 0
            r3.putLong(r1, r4)
            java.lang.String r1 = "bytes_downloaded"
            r3.putLong(r1, r4)
            com.google.android.play.core.splitinstall.SplitInstallSessionState r1 = com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd(r3)
            r0.zzm(r1)
            return
    }
}
