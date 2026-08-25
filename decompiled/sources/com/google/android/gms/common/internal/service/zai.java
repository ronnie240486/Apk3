package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zai extends com.google.android.gms.internal.base.zaa {
    public zai(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            r1.<init>(r2, r0)
            return
    }

    public final void zae(com.google.android.gms.common.internal.TelemetryData r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zac(r0, r2)
            r1.zad(r0)
            return
    }
}
