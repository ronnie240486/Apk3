package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzc<TListener> {

    @androidx.annotation.Nullable
    private TListener zza;
    private boolean zzb;
    public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient r1, TListener r2) {
            r0 = this;
            r0.zzd = r1
            r0.<init>()
            r0.zza = r2
            r1 = 0
            r0.zzb = r1
            return
    }

    public abstract void zza();

    public abstract void zzc();

    public final void zze() {
            r5 = this;
            monitor-enter(r5)
            TListener r0 = r5.zza     // Catch: java.lang.Throwable -> L41
            boolean r1 = r5.zzb     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L2c
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L41
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L41
            int r3 = r3 + 47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "Callback proxy "
            r4.append(r3)     // Catch: java.lang.Throwable -> L41
            r4.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = " being reused. This is not safe."
            r4.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L41
        L2c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L35
            r5.zza()     // Catch: java.lang.RuntimeException -> L33
            goto L35
        L33:
            r0 = move-exception
            throw r0
        L35:
            monitor-enter(r5)
            r0 = 1
            r5.zzb = r0     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            r5.zzg()
            return
        L3e:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            throw r0
        L41:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            throw r0
    }

    public final void zzf() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zza = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public final void zzg() {
            r2 = this;
            r2.zzf()
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zzd
            java.util.ArrayList r0 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.BaseGmsClient r1 = r2.zzd     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r1 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r1)     // Catch: java.lang.Throwable -> L15
            r1.remove(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }
}
