package com.google.android.play.core.missingsplits;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes3.dex */
public class PlayCoreMissingSplitsActivity extends android.app.Activity implements android.content.DialogInterface.OnClickListener {
    public PlayCoreMissingSplitsActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String zza() {
            r2 = this;
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.CharSequence r0 = r0.loadLabel(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private final void zzb(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 66
            r1.<init>(r0)
            java.lang.String r0 = "market://details?id="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "&referrer=utm_source%3Dplay.core.missingsplits"
            r1.append(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.content.Intent r0 = r0.setData(r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r0 = r0.setPackage(r1)
            r4.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L39
            return
        L39:
            r0 = move-exception
            com.google.android.play.core.internal.zzag r1 = new com.google.android.play.core.internal.zzag
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Couldn't start missing splits activity for %s"
            r1.zzc(r0, r5, r2)
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r1 = -1
            if (r2 == r1) goto L4
            goto Lb
        L4:
            java.lang.String r1 = r0.getPackageName()
            r0.zzb(r1)
        Lb:
            r0.finish()
            return
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            android.app.AlertDialog$Builder r5 = new android.app.AlertDialog$Builder
            r5.<init>(r4)
            java.lang.String r0 = "Installation failed"
            android.app.AlertDialog$Builder r5 = r5.setTitle(r0)
            r0 = 0
            android.app.AlertDialog$Builder r5 = r5.setCancelable(r0)
            java.lang.String r0 = "Close"
            android.app.AlertDialog$Builder r5 = r5.setNeutralButton(r0, r4)
            boolean r0 = com.google.android.play.core.internal.zzch.zzb(r4)
            java.lang.String r1 = "The app "
            if (r0 == 0) goto L4d
            java.lang.String r0 = r4.zza()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 91
            r3.<init>(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " is missing required components and must be reinstalled from the Google Play Store."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.app.AlertDialog$Builder r0 = r5.setMessage(r0)
            java.lang.String r1 = "Reinstall"
            r0.setPositiveButton(r1, r4)
            goto L72
        L4d:
            java.lang.String r0 = r4.zza()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 87
            r3.<init>(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " is missing required components and must be reinstalled from an official store."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.setMessage(r0)
        L72:
            android.app.AlertDialog r5 = r5.create()
            r5.show()
            return
    }
}
