package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class zaa implements android.os.IInterface {
    private final android.os.IBinder zaa;
    private final java.lang.String zab;

    public zaa(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.zaa
            return r0
    }

    public final android.os.Parcel zaa() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.zab
            r0.writeInterfaceToken(r1)
            return r0
    }

    public final android.os.Parcel zab(android.os.Parcel r5) throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r4.zaa     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L14
            r2 = 2
            r3 = 0
            r1.transact(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L14
            r0.readException()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L14
            r5.recycle()
            return r0
        L12:
            r0 = move-exception
            goto L19
        L14:
            r1 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L19:
            r5.recycle()
            throw r0
    }

    public final void zac(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.zaa     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L14
            r0.readException()     // Catch: java.lang.Throwable -> L14
            r5.recycle()
            r0.recycle()
            return
        L14:
            r4 = move-exception
            r5.recycle()
            r0.recycle()
            throw r4
    }

    public final void zad(android.os.Parcel r4) throws android.os.RemoteException {
            r3 = this;
            android.os.IBinder r0 = r3.zaa     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2 = 1
            r0.transact(r2, r4, r1, r2)     // Catch: java.lang.Throwable -> Lb
            r4.recycle()
            return
        Lb:
            r0 = move-exception
            r4.recycle()
            throw r0
    }
}
