package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class ActivityLifecycleObserver {
    public ActivityLifecycleObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(@androidx.annotation.NonNull android.app.Activity r1) {
            com.google.android.gms.common.api.internal.zab r0 = new com.google.android.gms.common.api.internal.zab
            com.google.android.gms.common.api.internal.zaa r1 = com.google.android.gms.common.api.internal.zaa.zaa(r1)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(@androidx.annotation.NonNull java.lang.Runnable r1);
}
