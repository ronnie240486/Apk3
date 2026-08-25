package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private final java.util.concurrent.ThreadFactory zzc;

    @com.google.android.gms.common.annotation.KeepForSdk
    public NumberedThreadFactory(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.zzc = r0
            java.lang.String r0 = "Name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    @androidx.annotation.NonNull
    public final java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable r5) {
            r4 = this;
            java.util.concurrent.ThreadFactory r0 = r4.zzc
            com.google.android.gms.common.util.concurrent.zza r1 = new com.google.android.gms.common.util.concurrent.zza
            r2 = 0
            r1.<init>(r5, r2)
            java.lang.Thread r5 = r0.newThread(r1)
            java.lang.String r0 = r4.zza
            java.util.concurrent.atomic.AtomicInteger r1 = r4.zzb
            int r1 = r1.getAndIncrement()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length()
            int r3 = r3 + 13
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.setName(r0)
            return r5
    }
}
