package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultConnectivityMonitorFactory implements com.bumptech.glide.manager.ConnectivityMonitorFactory {
    private static final java.lang.String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
    private static final java.lang.String TAG = "ConnectivityMonitor";

    public DefaultConnectivityMonitorFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.manager.ConnectivityMonitorFactory
    @androidx.annotation.NonNull
    public com.bumptech.glide.manager.ConnectivityMonitor build(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener r5) {
            r3 = this;
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r0)
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r1 = 3
            java.lang.String r2 = "ConnectivityMonitor"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L1e
            if (r0 == 0) goto L19
            java.lang.String r1 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"
            goto L1b
        L19:
            java.lang.String r1 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"
        L1b:
            android.util.Log.d(r2, r1)
        L1e:
            if (r0 == 0) goto L26
            com.bumptech.glide.manager.DefaultConnectivityMonitor r0 = new com.bumptech.glide.manager.DefaultConnectivityMonitor
            r0.<init>(r4, r5)
            goto L2b
        L26:
            com.bumptech.glide.manager.NullConnectivityMonitor r0 = new com.bumptech.glide.manager.NullConnectivityMonitor
            r0.<init>()
        L2b:
            return r0
    }
}
