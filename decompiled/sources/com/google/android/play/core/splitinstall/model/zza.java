package com.google.android.play.core.splitinstall.model;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    private static final java.util.Map zza = null;
    private static final java.util.Map zzb = null;
    private static final java.util.Map zzc = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.splitinstall.model.zza.zza = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.play.core.splitinstall.model.zza.zzb = r1
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Too many sessions are running for current app, existing sessions must be resolved first."
            r4 = -2
            java.lang.String r5 = "A requested module is not available (to this user/device, for the installed apk)."
            java.lang.Integer r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r3, r4, r5)
            r4 = -3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Request is otherwise invalid."
            r6 = -4
            java.lang.String r7 = "Requested session is not found."
            java.lang.Integer r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r4, r5, r6, r7)
            r6 = -5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "Split Install API is not available."
            r8 = -6
            java.lang.String r9 = "Network error: unable to obtain split details."
            java.lang.Integer r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r6, r7, r8, r9)
            r8 = -7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Download not permitted under current device circumstances (e.g. in background)."
            r10 = -8
            java.lang.String r11 = "Requested session contains modules from an existing active session and also new modules."
            java.lang.Integer r9 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r8, r9, r10, r11)
            r10 = -9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "Service handling split install has died."
            r12 = -10
            java.lang.String r13 = "Install failed due to insufficient storage."
            java.lang.Integer r11 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r10, r11, r12, r13)
            r12 = -11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "Signature verification error when invoking SplitCompat."
            r14 = -12
            java.lang.String r15 = "Error in SplitCompat emulation."
            java.lang.Integer r13 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r12, r13, r14, r15)
            r14 = -13
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r15 = "Error in copying files for SplitCompat."
            r16 = r13
            r13 = -14
            r17 = r12
            java.lang.String r12 = "The Play Store app is either not installed or not the official version."
            java.lang.Integer r12 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r14, r15, r13, r12)
            r13 = -15
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r15 = "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play."
            r18 = r12
            r12 = -100
            r19 = r14
            java.lang.String r14 = "Unknown error processing split install."
            java.lang.Integer r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r13, r15, r12, r14)
            java.lang.String r12 = "ACTIVE_SESSIONS_LIMIT_EXCEEDED"
            r1.put(r2, r12)
            java.lang.String r2 = "MODULE_UNAVAILABLE"
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
            java.lang.String r2 = "INCOMPATIBLE_WITH_EXISTING_SESSION"
            r1.put(r9, r2)
            java.lang.String r2 = "SERVICE_DIED"
            r1.put(r10, r2)
            java.lang.String r2 = "INSUFFICIENT_STORAGE"
            r1.put(r11, r2)
            java.lang.String r2 = "SPLITCOMPAT_VERIFICATION_ERROR"
            r3 = r17
            r1.put(r3, r2)
            java.lang.String r2 = "SPLITCOMPAT_EMULATION_ERROR"
            r3 = r16
            r1.put(r3, r2)
            java.lang.String r2 = "SPLITCOMPAT_COPY_ERROR"
            r3 = r19
            r1.put(r3, r2)
            java.lang.String r2 = "PLAY_STORE_NOT_FOUND"
            r3 = r18
            r1.put(r3, r2)
            java.lang.String r2 = "APP_NOT_OWNED"
            r1.put(r13, r2)
            java.lang.String r2 = "INTERNAL_ERROR"
            r1.put(r0, r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.splitinstall.model.zza.zzc = r0
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lf5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L113
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Map r2 = com.google.android.play.core.splitinstall.model.zza.zzc
            java.lang.Object r3 = r1.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2.put(r3, r1)
            goto Lf5
        L113:
            return
    }

    @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode
    public static int zza(java.lang.String r2) {
            java.util.Map r0 = com.google.android.play.core.splitinstall.model.zza.zzc
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r2 = r0.intValue()
            return r2
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = " is unknown error."
            java.lang.String r2 = r2.concat(r1)
            r0.<init>(r2)
            throw r0
    }

    public static java.lang.String zzb(@com.google.android.play.core.splitinstall.model.SplitInstallErrorCode int r4) {
            java.util.Map r0 = com.google.android.play.core.splitinstall.model.zza.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L42
            java.util.Map r1 = com.google.android.play.core.splitinstall.model.zza.zzb
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
            int r1 = r1 + 118
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#"
            java.lang.String r2 = ")"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0, r1, r4, r2)
            return r4
        L42:
            java.lang.String r4 = ""
            return r4
    }
}
