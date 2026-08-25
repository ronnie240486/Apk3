package com.google.android.play.core.assetpacks.model;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {
    private static final java.util.Map zza = null;
    private static final java.util.Map zzb = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.assetpacks.model.zza.zza = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.play.core.assetpacks.model.zza.zzb = r1
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "The requesting app is unavailable (e.g. unpublished, nonexistent version code)."
            r4 = -2
            java.lang.String r5 = "The requested pack is not available."
            java.lang.Integer r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r3, r4, r5)
            r4 = -3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "The request is invalid."
            r6 = -4
            java.lang.String r7 = "The requested download is not found."
            java.lang.Integer r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r4, r5, r6, r7)
            r6 = -5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "The Asset Delivery API is not available."
            r8 = -6
            java.lang.String r9 = "Network error. Unable to obtain the asset pack details."
            java.lang.Integer r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r6, r7, r8, r9)
            r8 = -7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Download not permitted under current device circumstances (e.g. in background)."
            r10 = -10
            java.lang.String r11 = "Asset pack download failed due to insufficient storage."
            java.lang.Integer r9 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r8, r9, r10, r11)
            r10 = -11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "The Play Store app is either not installed or not the official version."
            r12 = -12
            java.lang.String r13 = "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi."
            java.lang.Integer r11 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r10, r11, r12, r13)
            r12 = -13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play."
            r14 = -100
            java.lang.String r15 = "Unknown error downloading an asset pack."
            java.lang.Integer r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r12, r13, r14, r15)
            java.lang.String r13 = "APP_UNAVAILABLE"
            r1.put(r2, r13)
            java.lang.String r2 = "PACK_UNAVAILABLE"
            r1.put(r3, r2)
            java.lang.String r2 = "INVALID_REQUEST"
            r1.put(r4, r2)
            java.lang.String r2 = "DOWNLOAD_NOT_FOUND"
            r1.put(r5, r2)
            java.lang.String r2 = "API_NOT_AVAILABLE"
            r1.put(r6, r2)
            java.lang.String r2 = "NETWORK_ERROR"
            r1.put(r7, r2)
            java.lang.String r2 = "ACCESS_DENIED"
            r1.put(r8, r2)
            java.lang.String r2 = "INSUFFICIENT_STORAGE"
            r1.put(r9, r2)
            java.lang.String r2 = "PLAY_STORE_NOT_FOUND"
            r1.put(r10, r2)
            java.lang.String r2 = "NETWORK_UNRESTRICTED"
            r1.put(r11, r2)
            java.lang.String r2 = "APP_NOT_OWNED"
            r1.put(r12, r2)
            java.lang.String r2 = "INTERNAL_ERROR"
            r1.put(r0, r2)
            return
    }

    public static java.lang.String zza(@com.google.android.play.core.assetpacks.model.AssetPackErrorCode int r4) {
            java.util.Map r0 = com.google.android.play.core.assetpacks.model.zza.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto Lf
            java.lang.String r4 = ""
            return r4
        Lf:
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r1 = com.google.android.play.core.assetpacks.model.zza.zzb
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 113
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#"
            java.lang.String r2 = ")"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r4, r2)
            return r4
    }
}
