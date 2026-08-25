package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"HandlerLeak"})
final class zac extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zaa;
    private final android.content.Context zab;

    public zac(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
            r0 = this;
            r0.zaa = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.zab = r1
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r3 = r3.what
            r0 = 1
            if (r3 == r0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 50
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle this message: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "GoogleApiAvailability"
            android.util.Log.w(r0, r3)
            return
        L1e:
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zaa
            android.content.Context r0 = r2.zab
            int r3 = r3.isGooglePlayServicesAvailable(r0)
            com.google.android.gms.common.GoogleApiAvailability r0 = r2.zaa
            boolean r0 = r0.isUserResolvableError(r3)
            if (r0 == 0) goto L35
            com.google.android.gms.common.GoogleApiAvailability r0 = r2.zaa
            android.content.Context r1 = r2.zab
            r0.showErrorNotification(r1, r3)
        L35:
            return
    }
}
