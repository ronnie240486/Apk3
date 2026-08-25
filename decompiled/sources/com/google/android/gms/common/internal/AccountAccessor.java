package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor.Stub {
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.accounts.Account getAccountBinderSafe(@androidx.annotation.NonNull com.google.android.gms.common.internal.IAccountAccessor r4) {
            r0 = 0
            if (r4 == 0) goto L1d
            long r1 = android.os.Binder.clearCallingIdentity()
            android.accounts.Account r0 = r4.zzb()     // Catch: java.lang.Throwable -> Lf android.os.RemoteException -> L11
        Lb:
            android.os.Binder.restoreCallingIdentity(r1)
            goto L1d
        Lf:
            r4 = move-exception
            goto L19
        L11:
            java.lang.String r4 = "AccountAccessor"
            java.lang.String r3 = "Remote account accessor probably died"
            android.util.Log.w(r4, r3)     // Catch: java.lang.Throwable -> Lf
            goto Lb
        L19:
            android.os.Binder.restoreCallingIdentity(r1)
            throw r4
        L1d:
            return r0
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    @androidx.annotation.NonNull
    public final android.accounts.Account zzb() {
            r1 = this;
            r0 = 0
            throw r0
    }
}
