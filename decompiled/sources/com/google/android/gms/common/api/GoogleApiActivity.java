package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepName
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {

    @com.google.android.gms.common.util.VisibleForTesting
    public int zaa;

    public GoogleApiActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaa = r0
            return
    }

    @androidx.annotation.NonNull
    public static android.content.Intent zaa(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.app.PendingIntent r3, int r4, boolean r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r1 = com.google.android.gms.common.api.GoogleApiActivity.class
            r0.<init>(r2, r1)
            java.lang.String r2 = "pending_intent"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "failing_client_id"
            r0.putExtra(r2, r4)
            java.lang.String r2 = "notify_manager"
            r0.putExtra(r2, r5)
            return r0
    }

    private final void zab() {
            r12 = this;
            android.content.Intent r0 = r12.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "GoogleApiActivity"
            if (r0 != 0) goto L15
            java.lang.String r0 = "Activity started without extras"
            android.util.Log.e(r1, r0)
            r12.finish()
            return
        L15:
            java.lang.String r2 = "pending_intent"
            java.lang.Object r2 = r0.get(r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            java.lang.String r3 = "error_code"
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r2 != 0) goto L33
            if (r3 == 0) goto L2a
            goto L33
        L2a:
            java.lang.String r0 = "Activity started without resolution"
            android.util.Log.e(r1, r0)
            r12.finish()
            return
        L33:
            r4 = 1
            if (r2 == 0) goto La4
            android.content.IntentSender r6 = r2.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> L46 android.content.ActivityNotFoundException -> L50
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r12
            r5.startIntentSenderForResult(r6, r7, r8, r9, r10, r11)     // Catch: android.content.IntentSender.SendIntentException -> L46 android.content.ActivityNotFoundException -> L50
            r12.zaa = r4     // Catch: android.content.IntentSender.SendIntentException -> L46 android.content.ActivityNotFoundException -> L50
            return
        L46:
            r0 = move-exception
            java.lang.String r2 = "Failed to launch pendingIntent"
            android.util.Log.e(r1, r2, r0)
            r12.finish()
            return
        L50:
            r3 = move-exception
            java.lang.String r5 = "notify_manager"
            boolean r0 = r0.getBoolean(r5, r4)
            if (r0 == 0) goto L74
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zam(r12)
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r2 = 22
            r3 = 0
            r1.<init>(r2, r3)
            android.content.Intent r2 = r12.getIntent()
            r3 = -1
            java.lang.String r5 = "failing_client_id"
            int r2 = r2.getIntExtra(r5, r3)
            r0.zaz(r1, r2)
            goto L9e
        L74:
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r5 = r0.length()
            int r5 = r5 + 36
            r2.<init>(r5)
            java.lang.String r5 = "Activity not found while launching "
            java.lang.String r6 = "."
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5, r0, r6)
            java.lang.String r2 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "generic"
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L9b
            java.lang.String r2 = " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            java.lang.String r0 = r0.concat(r2)
        L9b:
            android.util.Log.e(r1, r0, r3)
        L9e:
            r12.zaa = r4
            r12.finish()
            return
        La4:
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r2 = 2
            r1.showErrorDialogFragment(r12, r0, r2, r12)
            r12.zaa = r4
            return
    }

    @Override // android.app.Activity
    public final void onActivityResult(int r4, int r5, @androidx.annotation.NonNull android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L3c
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r2 = "notify_manager"
            boolean r4 = r4.getBooleanExtra(r2, r1)
            r3.zaa = r0
            r3.setResult(r5, r6)
            if (r4 == 0) goto L44
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zam(r3)
            r6 = -1
            if (r5 == r6) goto L38
            if (r5 == 0) goto L22
            goto L44
        L22:
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            r0 = 13
            r1 = 0
            r5.<init>(r0, r1)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "failing_client_id"
            int r6 = r0.getIntExtra(r1, r6)
            r4.zaz(r5, r6)
            goto L44
        L38:
            r4.zaA()
            goto L44
        L3c:
            r1 = 2
            if (r4 != r1) goto L44
            r3.zaa = r0
            r3.setResult(r5, r6)
        L44:
            r3.finish()
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@androidx.annotation.NonNull android.content.DialogInterface r1) {
            r0 = this;
            r1 = 0
            r0.zaa = r1
            r0.setResult(r1)
            r0.finish()
            return
    }

    @Override // android.app.Activity
    public final void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 == 0) goto Le
            java.lang.String r0 = "resolution"
            int r2 = r2.getInt(r0)
            r1.zaa = r2
        Le:
            int r2 = r1.zaa
            r0 = 1
            if (r2 == r0) goto L16
            r1.zab()
        L16:
            return
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            int r0 = r2.zaa
            java.lang.String r1 = "resolution"
            r3.putInt(r1, r0)
            super.onSaveInstanceState(r3)
            return
    }
}
