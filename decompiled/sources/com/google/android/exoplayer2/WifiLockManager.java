package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
final class WifiLockManager {
    private static final java.lang.String TAG = "WifiLockManager";
    private static final java.lang.String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;

    @androidx.annotation.Nullable
    private android.net.wifi.WifiManager.WifiLock wifiLock;

    @androidx.annotation.Nullable
    private final android.net.wifi.WifiManager wifiManager;

    public WifiLockManager(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            r1.wifiManager = r2
            return
    }

    private void updateWifiLock() {
            r2 = this;
            android.net.wifi.WifiManager$WifiLock r0 = r2.wifiLock
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
            android.net.wifi.WifiManager$WifiLock r0 = r3.wifiLock
            if (r0 != 0) goto L1f
            android.net.wifi.WifiManager r0 = r3.wifiManager
            if (r0 != 0) goto L12
            java.lang.String r4 = "WifiLockManager"
            java.lang.String r0 = "WifiManager is null, therefore not creating the WifiLock."
            com.google.android.exoplayer2.util.Log.w(r4, r0)
            return
        L12:
            r1 = 3
            java.lang.String r2 = "ExoPlayer:WifiLockManager"
            android.net.wifi.WifiManager$WifiLock r0 = r0.createWifiLock(r1, r2)
            r3.wifiLock = r0
            r1 = 0
            r0.setReferenceCounted(r1)
        L1f:
            r3.enabled = r4
            r3.updateWifiLock()
            return
    }

    public void setStayAwake(boolean r1) {
            r0 = this;
            r0.stayAwake = r1
            r0.updateWifiLock()
            return
    }
}
