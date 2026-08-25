package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr extends com.google.android.gms.internal.common.zza {
    public zzr(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            r1.<init>(r2, r0)
            return
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, int r4, com.google.android.gms.dynamic.IObjectWrapper r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            com.google.android.gms.internal.common.zzc.zze(r0, r5)
            r2 = 2
            android.os.Parcel r2 = r1.zzB(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzf(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, int r4, com.google.android.gms.dynamic.IObjectWrapper r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            com.google.android.gms.internal.common.zzc.zze(r0, r5)
            r2 = 3
            android.os.Parcel r2 = r1.zzB(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }
}
