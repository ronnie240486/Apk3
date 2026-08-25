package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class ExtractionForegroundService extends android.app.Service {
    private final android.os.IBinder zza;

    public ExtractionForegroundService() {
            r1 = this;
            r1.<init>()
            com.google.android.play.core.assetpacks.zzch r0 = new com.google.android.play.core.assetpacks.zzch
            r0.<init>(r1)
            r1.zza = r0
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            android.os.IBinder r1 = r0.zza
            return r1
    }

    public final synchronized void zza() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.stopForeground(r0)     // Catch: java.lang.Throwable -> La
            r1.stopSelf()     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
