package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zag implements android.content.DialogInterface.OnClickListener {
    public zag() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.internal.zag zab(android.app.Activity r1, @androidx.annotation.Nullable android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zad r0 = new com.google.android.gms.common.internal.zad
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zac(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1, @androidx.annotation.Nullable android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zae r0 = new com.google.android.gms.common.internal.zae
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zad(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleFragment r0, @androidx.annotation.Nullable android.content.Intent r1, int r2) {
            com.google.android.gms.common.internal.zaf r2 = new com.google.android.gms.common.internal.zaf
            r2.<init>(r1, r0)
            return r2
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            r4.zaa()     // Catch: java.lang.Throwable -> L7 android.content.ActivityNotFoundException -> L9
            r5.dismiss()
            return
        L7:
            r6 = move-exception
            goto L23
        L9:
            r6 = move-exception
            java.lang.String r0 = "Failed to start resolution intent."
            java.lang.String r1 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L7
            java.lang.String r3 = "generic"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L7
            r3 = 1
            if (r3 != r2) goto L1a
            r0 = r1
        L1a:
            java.lang.String r1 = "DialogRedirect"
            android.util.Log.e(r1, r0, r6)     // Catch: java.lang.Throwable -> L7
            r5.dismiss()
            return
        L23:
            r5.dismiss()
            throw r6
    }

    public abstract void zaa();
}
