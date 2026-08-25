package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes.dex */
public class NetworkUtil {
    public NetworkUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasInternetAccess(android.content.Context r1) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L16
            boolean r1 = r1.isConnectedOrConnecting()
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }
}
