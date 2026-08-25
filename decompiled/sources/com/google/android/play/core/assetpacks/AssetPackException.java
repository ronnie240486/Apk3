package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class AssetPackException extends com.google.android.play.core.tasks.zzj {

    @com.google.android.play.core.assetpacks.model.AssetPackErrorCode
    private final int zza;

    public AssetPackException(@com.google.android.play.core.assetpacks.model.AssetPackErrorCode int r4) {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = com.google.android.play.core.assetpacks.model.zza.zza(r4)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Asset Pack Download Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            if (r4 == 0) goto L1f
            r3.zza = r4
            return
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r4.<init>(r0)
            throw r4
    }

    @Override // com.google.android.play.core.tasks.zzj
    @com.google.android.play.core.assetpacks.model.AssetPackErrorCode
    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
