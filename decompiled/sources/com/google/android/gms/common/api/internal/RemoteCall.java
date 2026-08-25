package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public interface RemoteCall<T, U> {
    @com.google.android.gms.common.annotation.KeepForSdk
    void accept(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull U r2) throws android.os.RemoteException;
}
