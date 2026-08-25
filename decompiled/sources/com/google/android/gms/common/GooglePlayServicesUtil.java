package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class GooglePlayServicesUtil extends com.google.android.gms.common.GooglePlayServicesUtilLight {

    @androidx.annotation.NonNull
    public static final java.lang.String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;

    @androidx.annotation.NonNull
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    static {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            return
    }

    private GooglePlayServicesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int r1, @androidx.annotation.NonNull android.app.Activity r2, int r3) {
            r0 = 0
            android.app.Dialog r1 = getErrorDialog(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.app.Dialog getErrorDialog(int r2, @androidx.annotation.NonNull android.app.Activity r3, int r4, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r5) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r3, r2)
            r1 = 1
            if (r1 != r0) goto L9
            r2 = 18
        L9:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            android.app.Dialog r2 = r0.getErrorDialog(r3, r2, r4, r5)
            return r2
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int r0, @androidx.annotation.NonNull android.content.Context r1, int r2) {
            android.app.PendingIntent r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorPendingIntent(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    @java.lang.Deprecated
    public static java.lang.String getErrorString(int r0) {
            java.lang.String r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.content.Context getRemoteContext(@androidx.annotation.NonNull android.content.Context r0) {
            android.content.Context r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.content.res.Resources getRemoteResource(@androidx.annotation.NonNull android.content.Context r0) {
            android.content.res.Resources r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteResource(r0)
            return r0
    }

    @com.google.android.gms.common.internal.HideFirstParty
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r0) {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r0, int r1) {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int r0) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int r1, @androidx.annotation.NonNull android.app.Activity r2, int r3) {
            r0 = 0
            boolean r1 = showErrorDialogFragment(r1, r2, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static boolean showErrorDialogFragment(int r1, @androidx.annotation.NonNull android.app.Activity r2, int r3, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r4) {
            r0 = 0
            boolean r1 = showErrorDialogFragment(r1, r2, r0, r3, r4)
            return r1
    }

    public static boolean showErrorDialogFragment(int r4, @androidx.annotation.NonNull android.app.Activity r5, @androidx.annotation.Nullable androidx.fragment.app.Fragment r6, int r7, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r8) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r5, r4)
            r1 = 1
            if (r1 != r0) goto L9
            r4 = 18
        L9:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            if (r6 != 0) goto L14
            boolean r4 = r0.showErrorDialogFragment(r5, r4, r7, r8)
            return r4
        L14:
            com.google.android.gms.common.GoogleApiAvailability r2 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            java.lang.String r3 = "d"
            android.content.Intent r2 = r2.getErrorResolutionIntent(r5, r4, r3)
            com.google.android.gms.common.internal.zag r6 = com.google.android.gms.common.internal.zag.zac(r6, r2, r7)
            android.app.Dialog r4 = r0.zaa(r5, r4, r6, r8)
            if (r4 != 0) goto L2a
            r4 = 0
            return r4
        L2a:
            java.lang.String r6 = "GooglePlayServicesErrorDialog"
            r0.zad(r5, r4, r6, r8)
            return r1
    }

    @java.lang.Deprecated
    public static void showErrorNotification(int r2, @androidx.annotation.NonNull android.content.Context r3) {
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r3, r2)
            if (r1 != 0) goto L15
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(r3, r2)
            if (r1 == 0) goto L11
            goto L15
        L11:
            r0.showErrorNotification(r3, r2)
            return
        L15:
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.zac r2 = new com.google.android.gms.common.zac
            r2.<init>(r0, r3)
            r3 = 1
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r2.sendEmptyMessageDelayed(r3, r0)
            return
    }
}
