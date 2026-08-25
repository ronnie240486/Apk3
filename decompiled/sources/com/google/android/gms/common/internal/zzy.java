package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzy extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzz {
    public zzy() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.common.internal.zzz zzg(android.os.IBinder r2) {
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.zzz
            if (r1 == 0) goto Ld
            com.google.android.gms.common.internal.zzz r0 = (com.google.android.gms.common.internal.zzz) r0
            return r0
        Ld:
            com.google.android.gms.common.internal.zzx r0 = new com.google.android.gms.common.internal.zzx
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4) throws android.os.RemoteException {
            r1 = this;
            r3 = 1
            if (r2 == r3) goto L13
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            int r2 = r1.zzc()
            r4.writeNoException()
            r4.writeInt(r2)
            goto L1d
        L13:
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzd()
            r4.writeNoException()
            com.google.android.gms.internal.common.zzc.zze(r4, r2)
        L1d:
            return r3
    }
}
