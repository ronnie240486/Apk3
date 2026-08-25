package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzab extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzab() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int r4, android.os.Parcel r5, android.os.Parcel r6) throws android.os.RemoteException {
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L2f
            r1 = 2
            if (r4 == r1) goto L1f
            r1 = 3
            if (r4 == r1) goto Lb
            r4 = 0
            return r4
        Lb:
            int r4 = r5.readInt()
            android.os.IBinder r1 = r5.readStrongBinder()
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzj> r2 = com.google.android.gms.common.internal.zzj.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.common.zzc.zza(r5, r2)
            com.google.android.gms.common.internal.zzj r5 = (com.google.android.gms.common.internal.zzj) r5
            r3.zzc(r4, r1, r5)
            goto L42
        L1f:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.common.zzc.zza(r5, r1)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.zzb(r4, r5)
            goto L42
        L2f:
            int r4 = r5.readInt()
            android.os.IBinder r1 = r5.readStrongBinder()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.common.zzc.zza(r5, r2)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.onPostInitComplete(r4, r1, r5)
        L42:
            r6.writeNoException()
            return r0
    }
}
