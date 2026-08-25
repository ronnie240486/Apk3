package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
public class StatsUtils {
    public StatsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getEventKey(@androidx.annotation.NonNull android.os.PowerManager.WakeLock r4, @androidx.annotation.NonNull java.lang.String r5) {
            int r0 = android.os.Process.myPid()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r4 = java.lang.System.identityHashCode(r4)
            long r2 = (long) r4
            long r0 = r0 | r2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            if (r1 == r0) goto L1e
            goto L20
        L1e:
            java.lang.String r5 = ""
        L20:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r0 = r5.length()
            if (r0 == 0) goto L2f
            java.lang.String r4 = r4.concat(r5)
            goto L35
        L2f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L35:
            return r4
    }
}
