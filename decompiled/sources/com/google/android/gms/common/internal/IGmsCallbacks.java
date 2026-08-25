package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface IGmsCallbacks extends android.os.IInterface {
    void onPostInitComplete(int r1, @androidx.annotation.NonNull android.os.IBinder r2, @androidx.annotation.NonNull android.os.Bundle r3) throws android.os.RemoteException;

    void zzb(int r1, @androidx.annotation.NonNull android.os.Bundle r2) throws android.os.RemoteException;

    void zzc(int r1, android.os.IBinder r2, com.google.android.gms.common.internal.zzj r3) throws android.os.RemoteException;
}
