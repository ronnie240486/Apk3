package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
final class WakeLockManager {
    private static final java.lang.String TAG = "WakeLockManager";
    private static final java.lang.String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;

    @androidx.annotation.Nullable
    private final android.os.PowerManager powerManager;
    private boolean stayAwake;

    @androidx.annotation.Nullable
    private android.os.PowerManager.WakeLock wakeLock;

    public WakeLockManager(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "power"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            r1.powerManager = r2
            return
    }

    @android.annotation.SuppressLint({"WakelockTimeout"})
    private void updateWakeLock() {
            r2 = this;
            android.os.PowerManager$WakeLock r0 = r2.wakeLock
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.enabled
            if (r1 == 0) goto L11
            boolean r1 = r2.stayAwake
            if (r1 == 0) goto L11
            r0.acquire()
            goto L14
        L11:
            r0.release()
        L14:
            return
    }

    public void setEnabled(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L1f
            android.os.PowerManager$WakeLock r0 = r3.wakeLock
            if (r0 != 0) goto L1f
            android.os.PowerManager r0 = r3.powerManager
            if (r0 != 0) goto L12
            java.lang.String r4 = "WakeLockManager"
            java.lang.String r0 = "PowerManager is null, therefore not creating the WakeLock."
            com.google.android.exoplayer2.util.Log.w(r4, r0)
            return
        L12:
            r1 = 1
            java.lang.String r2 = "ExoPlayer:WakeLockManager"
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r1, r2)
            r3.wakeLock = r0
            r1 = 0
            r0.setReferenceCounted(r1)
        L1f:
            r3.enabled = r4
            r3.updateWakeLock()
            return
    }

    public void setStayAwake(boolean r1) {
            r0 = this;
            r0.stayAwake = r1
            r0.updateWakeLock()
            return
    }
}
