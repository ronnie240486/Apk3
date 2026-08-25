package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.ThreadFactory zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    public NamedThreadFactory(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.zzb = r0
            java.lang.String r0 = "Name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    @androidx.annotation.NonNull
    public final java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable r4) {
            r3 = this;
            java.util.concurrent.ThreadFactory r0 = r3.zzb
            com.google.android.gms.common.util.concurrent.zza r1 = new com.google.android.gms.common.util.concurrent.zza
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.Thread r4 = r0.newThread(r1)
            java.lang.String r0 = r3.zza
            r4.setName(r0)
            return r4
    }
}
