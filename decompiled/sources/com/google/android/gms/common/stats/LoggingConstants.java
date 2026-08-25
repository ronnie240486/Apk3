package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class LoggingConstants {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_WAKE_LOCK_KEY = "WAKE_LOCK_KEY";

    @androidx.annotation.NonNull
    public static final android.content.ComponentName zza = null;

    static {
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = "com.google.android.gms.common.stats.GmsCoreStatsService"
            r0.<init>(r1, r2)
            com.google.android.gms.common.stats.LoggingConstants.zza = r0
            return
    }

    private LoggingConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
