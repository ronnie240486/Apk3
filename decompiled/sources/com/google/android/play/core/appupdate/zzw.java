package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzw extends com.google.android.play.core.appupdate.AppUpdateOptions {
    private final int zza;
    private final boolean zzb;

    public /* synthetic */ zzw(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean allowAssetPackDeletion() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    @com.google.android.play.core.install.model.AppUpdateType
    public final int appUpdateType() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.appupdate.AppUpdateOptions
            r2 = 0
            if (r1 == 0) goto L1c
            com.google.android.play.core.appupdate.AppUpdateOptions r5 = (com.google.android.play.core.appupdate.AppUpdateOptions) r5
            int r1 = r4.zza
            int r3 = r5.appUpdateType()
            if (r1 != r3) goto L1c
            boolean r1 = r4.zzb
            boolean r5 = r5.allowAssetPackDeletion()
            if (r1 != r5) goto L1c
            return r0
        L1c:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zza
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            boolean r1 = r3.zzb
            r2 = 1
            if (r2 == r1) goto L10
            r1 = 1237(0x4d5, float:1.733E-42)
            goto L12
        L10:
            r1 = 1231(0x4cf, float:1.725E-42)
        L12:
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.zza
            boolean r1 = r4.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 73
            r2.<init>(r3)
            java.lang.String r3 = "AppUpdateOptions{appUpdateType="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", allowAssetPackDeletion="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
