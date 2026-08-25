package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class CancellationTokenSource {
    private final com.google.android.gms.tasks.zzb zza;

    public CancellationTokenSource() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzb r0 = new com.google.android.gms.tasks.zzb
            r0.<init>()
            r1.zza = r0
            return
    }

    public void cancel() {
            r1 = this;
            com.google.android.gms.tasks.zzb r0 = r1.zza
            r0.zza()
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.CancellationToken getToken() {
            r1 = this;
            com.google.android.gms.tasks.zzb r0 = r1.zza
            return r0
    }
}
