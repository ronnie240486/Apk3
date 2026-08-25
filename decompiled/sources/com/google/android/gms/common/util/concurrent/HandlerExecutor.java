package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class HandlerExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    public HandlerExecutor(@androidx.annotation.NonNull android.os.Looper r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.common.zzi r0 = new com.google.android.gms.internal.common.zzi
            r0.<init>(r2)
            r1.zza = r0
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
