package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa {
    public zaf(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            r1.<init>(r2, r0)
            return
    }

    public final void zae(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            r0.writeInt(r2)
            r2 = 7
            r1.zac(r2, r0)
            return
    }

    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor r2, int r3, boolean r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zad(r0, r2)
            r0.writeInt(r3)
            com.google.android.gms.internal.base.zac.zab(r0, r4)
            r2 = 9
            r1.zac(r2, r0)
            return
    }

    public final void zag(com.google.android.gms.signin.internal.zai r2, com.google.android.gms.signin.internal.zae r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zac(r0, r2)
            com.google.android.gms.internal.base.zac.zad(r0, r3)
            r2 = 12
            r1.zac(r2, r0)
            return
    }
}
