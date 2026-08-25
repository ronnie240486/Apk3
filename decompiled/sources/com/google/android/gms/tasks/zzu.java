package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzu implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public zzu() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.tasks.zza r0 = new com.google.android.gms.internal.tasks.zza
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.zza
            r0.post(r2)
            return
    }
}
