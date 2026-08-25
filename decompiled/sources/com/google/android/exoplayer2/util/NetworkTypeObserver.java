package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkTypeObserver {

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.util.NetworkTypeObserver staticInstance;
    private final java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.exoplayer2.util.NetworkTypeObserver.Listener>> listeners;
    private final android.os.Handler mainHandler;

    @androidx.annotation.GuardedBy("networkTypeLock")
    private int networkType;
    private final java.lang.Object networkTypeLock;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.NetworkTypeObserver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @androidx.annotation.RequiresApi(31)
    public static final class Api31 {

        /* JADX INFO: loaded from: classes2.dex */
        public static final class DisplayInfoCallback extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
            private final com.google.android.exoplayer2.util.NetworkTypeObserver instance;

            public DisplayInfoCallback(com.google.android.exoplayer2.util.NetworkTypeObserver r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instance = r1
                    return
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r3) {
                    r2 = this;
                    int r3 = r3.getOverrideNetworkType()
                    r0 = 5
                    r1 = 3
                    if (r3 == r1) goto L10
                    r1 = 4
                    if (r3 == r1) goto L10
                    if (r3 != r0) goto Le
                    goto L10
                Le:
                    r3 = 0
                    goto L11
                L10:
                    r3 = 1
                L11:
                    com.google.android.exoplayer2.util.NetworkTypeObserver r1 = r2.instance
                    if (r3 == 0) goto L17
                    r0 = 10
                L17:
                    com.google.android.exoplayer2.util.NetworkTypeObserver.access$200(r1, r0)
                    return
            }
        }

        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void disambiguate4gAnd5gNsa(android.content.Context r2, com.google.android.exoplayer2.util.NetworkTypeObserver r3) {
                java.lang.String r0 = "phone"
                java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L1e
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L1e
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.RuntimeException -> L1e
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L1e
                com.google.android.exoplayer2.util.NetworkTypeObserver$Api31$DisplayInfoCallback r1 = new com.google.android.exoplayer2.util.NetworkTypeObserver$Api31$DisplayInfoCallback     // Catch: java.lang.RuntimeException -> L1e
                r1.<init>(r3)     // Catch: java.lang.RuntimeException -> L1e
                java.util.concurrent.Executor r2 = r2.getMainExecutor()     // Catch: java.lang.RuntimeException -> L1e
                r0.registerTelephonyCallback(r2, r1)     // Catch: java.lang.RuntimeException -> L1e
                r0.unregisterTelephonyCallback(r1)     // Catch: java.lang.RuntimeException -> L1e
                goto L22
            L1e:
                r2 = 5
                com.google.android.exoplayer2.util.NetworkTypeObserver.access$200(r3, r2)
            L22:
                return
        }
    }

    public interface Listener {
        void onNetworkTypeChanged(int r1);
    }

    public final class Receiver extends android.content.BroadcastReceiver {
        public final /* synthetic */ com.google.android.exoplayer2.util.NetworkTypeObserver this$0;

        private Receiver(com.google.android.exoplayer2.util.NetworkTypeObserver r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ Receiver(com.google.android.exoplayer2.util.NetworkTypeObserver r1, com.google.android.exoplayer2.util.NetworkTypeObserver.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                int r4 = com.google.android.exoplayer2.util.NetworkTypeObserver.access$100(r3)
                int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
                r1 = 31
                if (r0 < r1) goto L13
                r0 = 5
                if (r4 != r0) goto L13
                com.google.android.exoplayer2.util.NetworkTypeObserver r4 = r2.this$0
                com.google.android.exoplayer2.util.NetworkTypeObserver.Api31.disambiguate4gAnd5gNsa(r3, r4)
                goto L18
            L13:
                com.google.android.exoplayer2.util.NetworkTypeObserver r3 = r2.this$0
                com.google.android.exoplayer2.util.NetworkTypeObserver.access$200(r3, r4)
            L18:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$EVCFWWbwcYvLW4o0qHoGjijNIek(com.google.android.exoplayer2.util.NetworkTypeObserver r0, com.google.android.exoplayer2.util.NetworkTypeObserver.Listener r1) {
            r0.lambda$register$0(r1)
            return
    }

    private NetworkTypeObserver(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r3.mainHandler = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.listeners = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.networkTypeLock = r0
            r0 = 0
            r3.networkType = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)
            com.google.android.exoplayer2.util.NetworkTypeObserver$Receiver r1 = new com.google.android.exoplayer2.util.NetworkTypeObserver$Receiver
            r2 = 0
            r1.<init>(r3, r2)
            r4.registerReceiver(r1, r0)
            return
    }

    public static /* synthetic */ int access$100(android.content.Context r0) {
            int r0 = getNetworkTypeFromConnectivityManager(r0)
            return r0
    }

    public static /* synthetic */ void access$200(com.google.android.exoplayer2.util.NetworkTypeObserver r0, int r1) {
            r0.updateNetworkType(r1)
            return
    }

    public static synchronized com.google.android.exoplayer2.util.NetworkTypeObserver getInstance(android.content.Context r2) {
            java.lang.Class<com.google.android.exoplayer2.util.NetworkTypeObserver> r0 = com.google.android.exoplayer2.util.NetworkTypeObserver.class
            monitor-enter(r0)
            com.google.android.exoplayer2.util.NetworkTypeObserver r1 = com.google.android.exoplayer2.util.NetworkTypeObserver.staticInstance     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.exoplayer2.util.NetworkTypeObserver r1 = new com.google.android.exoplayer2.util.NetworkTypeObserver     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.google.android.exoplayer2.util.NetworkTypeObserver.staticInstance = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.exoplayer2.util.NetworkTypeObserver r2 = com.google.android.exoplayer2.util.NetworkTypeObserver.staticInstance     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private static int getMobileNetworkType(android.net.NetworkInfo r1) {
            int r1 = r1.getSubtype()
            switch(r1) {
                case 1: goto L1a;
                case 2: goto L1a;
                case 3: goto L18;
                case 4: goto L18;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                case 11: goto L18;
                case 12: goto L18;
                case 13: goto L16;
                case 14: goto L18;
                case 15: goto L18;
                case 16: goto L7;
                case 17: goto L18;
                case 18: goto L14;
                case 19: goto L7;
                case 20: goto L9;
                default: goto L7;
            }
        L7:
            r1 = 6
            return r1
        L9:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 29
            if (r1 < r0) goto L12
            r1 = 9
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
        L14:
            r1 = 2
            return r1
        L16:
            r1 = 5
            return r1
        L18:
            r1 = 4
            return r1
        L1a:
            r1 = 3
            return r1
    }

    private static int getNetworkTypeFromConnectivityManager(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r0 = 0
            if (r2 != 0) goto Lc
            return r0
        Lc:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L3c
            r0 = 1
            if (r2 == 0) goto L3c
            boolean r1 = r2.isConnected()
            if (r1 != 0) goto L1a
            goto L3c
        L1a:
            int r1 = r2.getType()
            if (r1 == 0) goto L37
            if (r1 == r0) goto L35
            r0 = 4
            if (r1 == r0) goto L37
            r0 = 5
            if (r1 == r0) goto L37
            r2 = 6
            if (r1 == r2) goto L34
            r2 = 9
            if (r1 == r2) goto L32
            r2 = 8
            return r2
        L32:
            r2 = 7
            return r2
        L34:
            return r0
        L35:
            r2 = 2
            return r2
        L37:
            int r2 = getMobileNetworkType(r2)
            return r2
        L3c:
            return r0
    }

    private /* synthetic */ void lambda$register$0(com.google.android.exoplayer2.util.NetworkTypeObserver.Listener r2) {
            r1 = this;
            int r0 = r1.getNetworkType()
            r2.onNetworkTypeChanged(r0)
            return
    }

    private void removeClearedReferences() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.exoplayer2.util.NetworkTypeObserver$Listener>> r0 = r3.listeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            if (r2 != 0) goto L6
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.exoplayer2.util.NetworkTypeObserver$Listener>> r2 = r3.listeners
            r2.remove(r1)
            goto L6
        L1e:
            return
    }

    @androidx.annotation.VisibleForTesting
    public static synchronized void resetForTests() {
            java.lang.Class<com.google.android.exoplayer2.util.NetworkTypeObserver> r0 = com.google.android.exoplayer2.util.NetworkTypeObserver.class
            monitor-enter(r0)
            r1 = 0
            com.google.android.exoplayer2.util.NetworkTypeObserver.staticInstance = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private void updateNetworkType(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.networkTypeLock
            monitor-enter(r0)
            int r1 = r3.networkType     // Catch: java.lang.Throwable -> L31
            if (r1 != r4) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L9:
            r3.networkType = r4     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.exoplayer2.util.NetworkTypeObserver$Listener>> r0 = r3.listeners
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.google.android.exoplayer2.util.NetworkTypeObserver$Listener r2 = (com.google.android.exoplayer2.util.NetworkTypeObserver.Listener) r2
            if (r2 == 0) goto L2a
            r2.onNetworkTypeChanged(r4)
            goto L12
        L2a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.exoplayer2.util.NetworkTypeObserver$Listener>> r2 = r3.listeners
            r2.remove(r1)
            goto L12
        L30:
            return
        L31:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
    }

    public int getNetworkType() {
            r2 = this;
            java.lang.Object r0 = r2.networkTypeLock
            monitor-enter(r0)
            int r1 = r2.networkType     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void register(com.google.android.exoplayer2.util.NetworkTypeObserver.Listener r4) {
            r3 = this;
            r3.removeClearedReferences()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.exoplayer2.util.NetworkTypeObserver$Listener>> r0 = r3.listeners
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.add(r1)
            android.os.Handler r0 = r3.mainHandler
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
            r2 = 9
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }
}
