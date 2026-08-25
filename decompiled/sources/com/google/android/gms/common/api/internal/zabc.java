package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zabc extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zabe zaa;

    public zabc(com.google.android.gms.common.api.internal.zabe r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r3 = r3.what
            r0 = 1
            if (r3 == r0) goto L27
            r0 = 2
            if (r3 == r0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 31
            r0.<init>(r1)
            java.lang.String r1 = "Unknown message id: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "GoogleApiClientImpl"
            android.util.Log.w(r0, r3)
            return
        L21:
            com.google.android.gms.common.api.internal.zabe r3 = r2.zaa
            com.google.android.gms.common.api.internal.zabe.zai(r3)
            return
        L27:
            com.google.android.gms.common.api.internal.zabe r3 = r2.zaa
            com.google.android.gms.common.api.internal.zabe.zaj(r3)
            return
    }
}
