package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class BlockingServiceConnection implements android.content.ServiceConnection {
    public boolean zza;
    private final java.util.concurrent.BlockingQueue<android.os.IBinder> zzb;

    public BlockingServiceConnection() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.zzb = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.IBinder getService() throws java.lang.InterruptedException {
            r2 = this;
            java.lang.String r0 = "BlockingServiceConnection.getService() called on main thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            boolean r0 = r2.zza
            if (r0 != 0) goto L15
            r0 = 1
            r2.zza = r0
            java.util.concurrent.BlockingQueue<android.os.IBinder> r0 = r2.zzb
            java.lang.Object r0 = r0.take()
            android.os.IBinder r0 = (android.os.IBinder) r0
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot call get on this connection more than once"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.IBinder getServiceWithTimeout(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.lang.String r0 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            boolean r0 = r1.zza
            if (r0 != 0) goto L1f
            r0 = 1
            r1.zza = r0
            java.util.concurrent.BlockingQueue<android.os.IBinder> r0 = r1.zzb
            java.lang.Object r2 = r0.poll(r2, r4)
            android.os.IBinder r2 = (android.os.IBinder) r2
            if (r2 == 0) goto L17
            return r2
        L17:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = "Timed out waiting for the service connection"
            r2.<init>(r3)
            throw r2
        L1f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot call get on this connection more than once"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@androidx.annotation.NonNull android.content.ComponentName r1, @androidx.annotation.NonNull android.os.IBinder r2) {
            r0 = this;
            java.util.concurrent.BlockingQueue<android.os.IBinder> r1 = r0.zzb
            r1.add(r2)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@androidx.annotation.NonNull android.content.ComponentName r1) {
            r0 = this;
            return
    }
}
