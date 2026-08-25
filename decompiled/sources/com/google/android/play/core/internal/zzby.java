package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzby extends com.google.android.play.core.internal.zzk implements com.google.android.play.core.internal.zzca {
    public zzby(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zzc(java.lang.String r2, int r3, android.os.Bundle r4, com.google.android.play.core.internal.zzcc r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeInt(r3)
            com.google.android.play.core.internal.zzm.zzb(r0, r4)
            com.google.android.play.core.internal.zzm.zzc(r0, r5)
            r2 = 4
            r1.zzb(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zzd(java.lang.String r2, java.util.List r3, android.os.Bundle r4, com.google.android.play.core.internal.zzcc r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeTypedList(r3)
            com.google.android.play.core.internal.zzm.zzb(r0, r4)
            com.google.android.play.core.internal.zzm.zzc(r0, r5)
            r2 = 8
            r1.zzb(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zze(java.lang.String r2, java.util.List r3, android.os.Bundle r4, com.google.android.play.core.internal.zzcc r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeTypedList(r3)
            com.google.android.play.core.internal.zzm.zzb(r0, r4)
            com.google.android.play.core.internal.zzm.zzc(r0, r5)
            r2 = 13
            r1.zzb(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zzf(java.lang.String r2, java.util.List r3, android.os.Bundle r4, com.google.android.play.core.internal.zzcc r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeTypedList(r3)
            com.google.android.play.core.internal.zzm.zzb(r0, r4)
            com.google.android.play.core.internal.zzm.zzc(r0, r5)
            r2 = 14
            r1.zzb(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zzg(java.lang.String r2, java.util.List r3, android.os.Bundle r4, com.google.android.play.core.internal.zzcc r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeTypedList(r3)
            com.google.android.play.core.internal.zzm.zzb(r0, r4)
            com.google.android.play.core.internal.zzm.zzc(r0, r5)
            r2 = 7
            r1.zzb(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zzh(java.lang.String r2, int r3, com.google.android.play.core.internal.zzcc r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeInt(r3)
            com.google.android.play.core.internal.zzm.zzc(r0, r4)
            r2 = 5
            r1.zzb(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zzi(java.lang.String r2, com.google.android.play.core.internal.zzcc r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.play.core.internal.zzm.zzc(r0, r3)
            r2 = 6
            r1.zzb(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzca
    public final void zzj(java.lang.String r2, java.util.List r3, android.os.Bundle r4, com.google.android.play.core.internal.zzcc r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeTypedList(r3)
            com.google.android.play.core.internal.zzm.zzb(r0, r4)
            com.google.android.play.core.internal.zzm.zzc(r0, r5)
            r2 = 2
            r1.zzb(r2, r0)
            return
    }
}
