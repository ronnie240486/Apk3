package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.internal.service.zak {
    public zaj() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.ICommonCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto Lb
            int r1 = r2.readInt()
            r0.zab(r1)
            return r3
        Lb:
            r1 = 0
            return r1
    }
}
