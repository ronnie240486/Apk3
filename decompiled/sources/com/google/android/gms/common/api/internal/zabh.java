package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zabh extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zabi zaa;

    public zabh(com.google.android.gms.common.api.internal.zabi r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            r1 = 1
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 == r1) goto L21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r1 = 31
            r3.<init>(r1)
            java.lang.String r1 = "Unknown message id: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "GACStateManager"
            android.util.Log.w(r0, r3)
            return
        L21:
            java.lang.Object r3 = r3.obj
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L26:
            java.lang.Object r3 = r3.obj
            com.google.android.gms.common.api.internal.zabg r3 = (com.google.android.gms.common.api.internal.zabg) r3
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            r3.zab(r0)
            return
    }
}
