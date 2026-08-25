package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzu extends com.google.android.play.core.appupdate.AppUpdateOptions.Builder {
    private int zza;
    private boolean zzb;
    private byte zzc;

    public zzu() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final com.google.android.play.core.appupdate.AppUpdateOptions build() {
            r3 = this;
            byte r0 = r3.zzc
            r1 = 3
            if (r0 == r1) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte r1 = r3.zzc
            r1 = r1 & 1
            if (r1 != 0) goto L15
            java.lang.String r1 = " appUpdateType"
            r0.append(r1)
        L15:
            byte r1 = r3.zzc
            r1 = r1 & 2
            if (r1 != 0) goto L20
            java.lang.String r1 = " allowAssetPackDeletion"
            r0.append(r1)
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L30:
            com.google.android.play.core.appupdate.zzw r0 = new com.google.android.play.core.appupdate.zzw
            int r1 = r3.zza
            boolean r2 = r3.zzb
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final com.google.android.play.core.appupdate.AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean r1) {
            r0 = this;
            r0.zzb = r1
            byte r1 = r0.zzc
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final com.google.android.play.core.appupdate.AppUpdateOptions.Builder setAppUpdateType(int r1) {
            r0 = this;
            r0.zza = r1
            byte r1 = r0.zzc
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zzc = r1
            return r0
    }
}
