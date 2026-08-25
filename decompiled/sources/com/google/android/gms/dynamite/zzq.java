package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq extends com.google.android.gms.internal.common.zza {
    public zzq(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            r1.<init>(r2, r0)
            return
    }

    public final int zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            android.os.Parcel r0 = r2.zzB(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    public final int zzf(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, boolean r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.common.zzc.zzb(r0, r4)
            r2 = 3
            android.os.Parcel r2 = r1.zzB(r2, r0)
            int r3 = r2.readInt()
            r2.recycle()
            return r3
    }

    public final int zzg(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, boolean r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.common.zzc.zzb(r0, r4)
            r2 = 5
            android.os.Parcel r2 = r1.zzB(r2, r0)
            int r3 = r2.readInt()
            r2.recycle()
            return r3
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzh(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, int r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 2
            android.os.Parcel r2 = r1.zzB(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzi(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, int r4, com.google.android.gms.dynamic.IObjectWrapper r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            com.google.android.gms.internal.common.zzc.zze(r0, r5)
            r2 = 8
            android.os.Parcel r2 = r1.zzB(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzj(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, int r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 4
            android.os.Parcel r2 = r1.zzB(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzk(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, boolean r4, long r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zze(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.common.zzc.zzb(r0, r4)
            r0.writeLong(r5)
            r2 = 7
            android.os.Parcel r2 = r1.zzB(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }
}
