package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzac implements com.google.android.gms.common.internal.IGmsServiceBroker {
    private final android.os.IBinder zza;

    public zzac(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void getService(com.google.android.gms.common.internal.IGmsCallbacks r4, @androidx.annotation.Nullable com.google.android.gms.common.internal.GetServiceRequest r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L14
            android.os.IBinder r4 = r4.asBinder()     // Catch: java.lang.Throwable -> L37
            goto L15
        L14:
            r4 = 0
        L15:
            r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L37
            r4 = 0
            if (r5 == 0) goto L23
            r2 = 1
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.common.internal.zzm.zza(r5, r0, r4)     // Catch: java.lang.Throwable -> L37
            goto L26
        L23:
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L37
        L26:
            android.os.IBinder r5 = r3.zza     // Catch: java.lang.Throwable -> L37
            r2 = 46
            r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L37
            r1.readException()     // Catch: java.lang.Throwable -> L37
            r1.recycle()
            r0.recycle()
            return
        L37:
            r4 = move-exception
            r1.recycle()
            r0.recycle()
            throw r4
    }
}
