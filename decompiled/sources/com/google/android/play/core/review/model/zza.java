package com.google.android.play.core.review.model;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    private static final java.util.Map zza = null;
    private static final java.util.Map zzb = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.review.model.zza.zza = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.play.core.review.model.zza.zzb = r1
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "The Play Store app is either not installed or not the official version."
            r4 = -2
            java.lang.String r5 = "Call first requestReviewFlow to get the ReviewInfo."
            java.lang.Integer r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r3, r4, r5)
            java.lang.String r3 = "PLAY_STORE_NOT_FOUND"
            r1.put(r2, r3)
            java.lang.String r2 = "INVALID_REQUEST"
            r1.put(r0, r2)
            return
    }

    public static java.lang.String zza(int r4) {
            java.util.Map r0 = com.google.android.play.core.review.model.zza.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto Lf
            java.lang.String r4 = ""
            return r4
        Lf:
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r1 = com.google.android.play.core.review.model.zza.zzb
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 106
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            java.lang.String r2 = ")"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r4, r2)
            return r4
    }
}
