package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    public zza(android.os.IBinder r1, java.lang.String r2) {
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

    public final android.os.Parcel zzB(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.zza     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r0.readException()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r5.recycle()
            return r0
        L11:
            r4 = move-exception
            goto L18
        L13:
            r4 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L11
            throw r4     // Catch: java.lang.Throwable -> L11
        L18:
            r5.recycle()
            throw r4
    }

    public final void zzC(android.os.Parcel r5) throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r4.zza     // Catch: java.lang.Throwable -> L15
            r2 = 1
            r3 = 0
            r1.transact(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L15
            r0.readException()     // Catch: java.lang.Throwable -> L15
            r5.recycle()
            r0.recycle()
            return
        L15:
            r1 = move-exception
            r5.recycle()
            r0.recycle()
            throw r1
    }

    public final void zzD(android.os.Parcel r5) throws android.os.RemoteException {
            r4 = this;
            android.os.IBinder r0 = r4.zza     // Catch: java.lang.Throwable -> Lc
            r1 = 2
            r2 = 0
            r3 = 1
            r0.transact(r1, r5, r2, r3)     // Catch: java.lang.Throwable -> Lc
            r5.recycle()
            return
        Lc:
            r0 = move-exception
            r5.recycle()
            throw r0
    }

    public final android.os.Parcel zza() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.zzb
            r0.writeInterfaceToken(r1)
            return r0
    }
}
