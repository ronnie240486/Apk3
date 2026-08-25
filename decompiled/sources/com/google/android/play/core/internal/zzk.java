package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzk implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    public zzk(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.zza
            return r0
    }

    public final android.os.Parcel zza() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.zzb
            r0.writeInterfaceToken(r1)
            return r0
    }

    public final void zzb(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.IBinder r0 = r3.zza     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2 = 1
            r0.transact(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> Lb
            r5.recycle()
            return
        Lb:
            r4 = move-exception
            r5.recycle()
            throw r4
    }
}
