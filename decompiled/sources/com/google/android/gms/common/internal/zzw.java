package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.ICancelToken {
    public zzw(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r1.zzD(r0)
            return
    }
}
