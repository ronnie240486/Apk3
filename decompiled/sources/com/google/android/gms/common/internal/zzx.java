package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzx extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzz {
    public zzx(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzB(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            android.os.Parcel r0 = r2.zzB(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }
}
