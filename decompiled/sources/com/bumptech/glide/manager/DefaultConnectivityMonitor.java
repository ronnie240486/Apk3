package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultConnectivityMonitor implements com.bumptech.glide.manager.ConnectivityMonitor {
    private static final java.lang.String TAG = "ConnectivityMonitor";
    private final android.content.BroadcastReceiver connectivityReceiver;
    private final android.content.Context context;
    public boolean isConnected;
    private boolean isRegistered;
    public final com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener listener;


    public DefaultConnectivityMonitor(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.manager.DefaultConnectivityMonitor$1 r0 = new com.bumptech.glide.manager.DefaultConnectivityMonitor$1
            r0.<init>(r1)
            r1.connectivityReceiver = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.context = r2
            r1.listener = r3
            return
    }

    private void register() {
            r4 = this;
            boolean r0 = r4.isRegistered
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = r4.context
            boolean r0 = r4.isConnected(r0)
            r4.isConnected = r0
            android.content.Context r0 = r4.context     // Catch: java.lang.SecurityException -> L1f
            android.content.BroadcastReceiver r1 = r4.connectivityReceiver     // Catch: java.lang.SecurityException -> L1f
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.SecurityException -> L1f
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)     // Catch: java.lang.SecurityException -> L1f
            r0.registerReceiver(r1, r2)     // Catch: java.lang.SecurityException -> L1f
            r0 = 1
            r4.isRegistered = r0     // Catch: java.lang.SecurityException -> L1f
            goto L2e
        L1f:
            r0 = move-exception
            r1 = 5
            java.lang.String r2 = "ConnectivityMonitor"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "Failed to register"
            android.util.Log.w(r2, r1, r0)
        L2e:
            return
    }

    private void unregister() {
            r2 = this;
            boolean r0 = r2.isRegistered
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = r2.context
            android.content.BroadcastReceiver r1 = r2.connectivityReceiver
            r0.unregisterReceiver(r1)
            r0 = 0
            r2.isRegistered = r0
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public final boolean isConnected(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            java.lang.Object r4 = com.bumptech.glide.util.Preconditions.checkNotNull(r4)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            r0 = 1
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L1e
            if (r4 == 0) goto L1c
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            r4 = move-exception
            r1 = 5
            java.lang.String r2 = "ConnectivityMonitor"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L2d
            java.lang.String r1 = "Failed to determine connectivity status when connectivity changed"
            android.util.Log.w(r2, r1, r4)
        L2d:
            return r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r0 = this;
            r0.register()
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r0 = this;
            r0.unregister()
            return
    }
}
