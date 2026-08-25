package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
public interface Clock {

    /* JADX INFO: renamed from: com.google.android.gms.common.util.Clock$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public final /* synthetic */ class CC {
        @com.google.android.gms.common.annotation.KeepForSdk
        public static long $default$currentThreadTimeMillis(@androidx.annotation.NonNull com.google.android.gms.common.util.Clock r2) {
                long r0 = android.os.SystemClock.currentThreadTimeMillis()
                return r0
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    long currentThreadTimeMillis();

    @com.google.android.gms.common.annotation.KeepForSdk
    long currentTimeMillis();

    @com.google.android.gms.common.annotation.KeepForSdk
    long elapsedRealtime();

    @com.google.android.gms.common.annotation.KeepForSdk
    long nanoTime();
}
