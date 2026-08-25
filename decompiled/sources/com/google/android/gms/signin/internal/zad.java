package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements com.google.android.gms.signin.internal.zae {
    public zad() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 3: goto L3d;
                case 4: goto L34;
                case 5: goto L3;
                case 6: goto L2b;
                case 7: goto L1a;
                case 8: goto Le;
                case 9: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.Parcelable$Creator<com.google.android.gms.signin.internal.zag> r1 = com.google.android.gms.signin.internal.zag.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.signin.internal.zag r1 = (com.google.android.gms.signin.internal.zag) r1
            goto L4d
        Le:
            android.os.Parcelable$Creator<com.google.android.gms.signin.internal.zak> r1 = com.google.android.gms.signin.internal.zak.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.signin.internal.zak r1 = (com.google.android.gms.signin.internal.zak) r1
            r0.zab(r1)
            goto L4d
        L1a:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
            goto L4d
        L2b:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L4d
        L34:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L4d
        L3d:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.ConnectionResult r1 = (com.google.android.gms.common.ConnectionResult) r1
            android.os.Parcelable$Creator<com.google.android.gms.signin.internal.zaa> r1 = com.google.android.gms.signin.internal.zaa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.signin.internal.zaa r1 = (com.google.android.gms.signin.internal.zaa) r1
        L4d:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
