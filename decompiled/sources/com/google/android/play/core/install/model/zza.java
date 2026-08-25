package com.google.android.play.core.install.model;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    private static final java.util.Map zza = null;
    private static final java.util.Map zzb = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.install.model.zza.zza = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.play.core.install.model.zza.zzb = r1
            r2 = -2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "An unknown error occurred."
            r4 = -3
            java.lang.String r5 = "The API is not available on this device."
            java.lang.Integer r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r3, r4, r5)
            r4 = -4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "The request that was sent by the app is malformed."
            r6 = -5
            java.lang.String r7 = "The install is unavailable to this user or device."
            java.lang.Integer r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r4, r5, r6, r7)
            r6 = -6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...)."
            r8 = -7
            java.lang.String r9 = "The install/update has not been (fully) downloaded yet."
            java.lang.Integer r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r6, r7, r8, r9)
            r8 = -8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "The install is already in progress and there is no UI flow to resume."
            r10 = -9
            java.lang.String r11 = "The Play Store app is either not installed or not the official version."
            java.lang.Integer r9 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r8, r9, r10, r11)
            r10 = -10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play."
            r12 = -100
            java.lang.String r13 = "An internal error happened in the Play Store."
            java.lang.Integer r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r10, r11, r12, r13)
            java.lang.String r11 = "ERROR_UNKNOWN"
            r1.put(r2, r11)
            java.lang.String r2 = "ERROR_API_NOT_AVAILABLE"
            r1.put(r3, r2)
            java.lang.String r2 = "ERROR_INVALID_REQUEST"
            r1.put(r4, r2)
            java.lang.String r2 = "ERROR_INSTALL_UNAVAILABLE"
            r1.put(r5, r2)
            java.lang.String r2 = "ERROR_INSTALL_NOT_ALLOWED"
            r1.put(r6, r2)
            java.lang.String r2 = "ERROR_DOWNLOAD_NOT_PRESENT"
            r1.put(r7, r2)
            java.lang.String r2 = "ERROR_INSTALL_IN_PROGRESS"
            r1.put(r8, r2)
            java.lang.String r2 = "ERROR_INTERNAL_ERROR"
            r1.put(r0, r2)
            java.lang.String r3 = "ERROR_PLAY_STORE_NOT_FOUND"
            r1.put(r9, r3)
            java.lang.String r3 = "ERROR_APP_NOT_OWNED"
            r1.put(r10, r3)
            r1.put(r0, r2)
            return
    }

    public static java.lang.String zza(@com.google.android.play.core.install.model.InstallErrorCode int r4) {
            java.util.Map r0 = com.google.android.play.core.install.model.zza.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L42
            java.util.Map r1 = com.google.android.play.core.install.model.zza.zzb
            boolean r2 = r1.containsKey(r4)
            if (r2 != 0) goto L15
            goto L42
        L15:
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 103
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            java.lang.String r2 = ")"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r4, r2)
            return r4
        L42:
            java.lang.String r4 = ""
            return r4
    }
}
