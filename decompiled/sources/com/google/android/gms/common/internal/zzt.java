package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    private static final android.net.Uri zza = null;
    private static final android.net.Uri zzb = null;

    static {
            java.lang.String r0 = "https://plus.google.com/"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.gms.common.internal.zzt.zza = r0
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "circles"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "find"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzt.zzb = r0
            return
    }

    public static android.content.Intent zza() {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"
            r0.<init>(r1)
            java.lang.String r1 = "com.google.android.wearable.app"
            r0.setPackage(r1)
            return r0
    }

    public static android.content.Intent zzb(java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r3.<init>(r0)
            java.lang.String r0 = "market://details"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "id"
            java.lang.String r2 = "com.google.android.gms"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L24
            java.lang.String r1 = "pcampaignid"
            r0.appendQueryParameter(r1, r4)
        L24:
            android.net.Uri r4 = r0.build()
            r3.setData(r4)
            java.lang.String r4 = "com.android.vending"
            r3.setPackage(r4)
            r4 = 524288(0x80000, float:7.34684E-40)
            r3.addFlags(r4)
            return r3
    }

    public static android.content.Intent zzc(java.lang.String r2) {
            java.lang.String r2 = "package"
            java.lang.String r0 = "com.google.android.gms"
            r1 = 0
            android.net.Uri r2 = android.net.Uri.fromParts(r2, r0, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            r0.setData(r2)
            return r0
    }
}
