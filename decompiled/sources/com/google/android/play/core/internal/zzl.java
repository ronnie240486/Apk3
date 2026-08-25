package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class zzl extends android.os.Binder implements android.os.IInterface {
    public zzl(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.attachInterface(r0, r1)
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r2 <= r0) goto Ld
            boolean r4 = super.onTransact(r2, r3, r4, r5)
            if (r4 == 0) goto L14
            r2 = 1
            return r2
        Ld:
            java.lang.String r4 = r1.getInterfaceDescriptor()
            r3.enforceInterface(r4)
        L14:
            boolean r2 = r1.zza(r2, r3)
            return r2
    }

    public boolean zza(int r1, android.os.Parcel r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }
}
