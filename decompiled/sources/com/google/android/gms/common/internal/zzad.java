package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzad extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzaf {
    public zzad(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzn r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zzc(r0, r2)
            r2 = 6
            android.os.Parcel r2 = r1.zzB(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.common.zzq> r0 = com.google.android.gms.common.zzq.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.common.zzc.zza(r2, r0)
            com.google.android.gms.common.zzq r0 = (com.google.android.gms.common.zzq) r0
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzf(com.google.android.gms.common.zzs r2, com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.common.zzc.zzc(r0, r2)
            com.google.android.gms.internal.common.zzc.zze(r0, r3)
            r2 = 5
            android.os.Parcel r2 = r1.zzB(r2, r0)
            boolean r3 = com.google.android.gms.internal.common.zzc.zzf(r2)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 7
            android.os.Parcel r0 = r2.zzB(r1, r0)
            boolean r1 = com.google.android.gms.internal.common.zzc.zzf(r0)
            r0.recycle()
            return r1
    }
}
