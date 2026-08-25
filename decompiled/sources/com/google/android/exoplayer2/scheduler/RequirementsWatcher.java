package com.google.android.exoplayer2.scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class RequirementsWatcher {
    private final android.content.Context context;
    private final android.os.Handler handler;
    private final com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener listener;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback networkCallback;
    private int notMetRequirements;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver receiver;
    private final com.google.android.exoplayer2.scheduler.Requirements requirements;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.RequirementsWatcher$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class DeviceStatusChangeReceiver extends android.content.BroadcastReceiver {
        public final /* synthetic */ com.google.android.exoplayer2.scheduler.RequirementsWatcher this$0;

        private DeviceStatusChangeReceiver(com.google.android.exoplayer2.scheduler.RequirementsWatcher r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ DeviceStatusChangeReceiver(com.google.android.exoplayer2.scheduler.RequirementsWatcher r1, com.google.android.exoplayer2.scheduler.RequirementsWatcher.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                boolean r1 = r0.isInitialStickyBroadcast()
                if (r1 != 0) goto Lb
                com.google.android.exoplayer2.scheduler.RequirementsWatcher r1 = r0.this$0
                com.google.android.exoplayer2.scheduler.RequirementsWatcher.access$200(r1)
            Lb:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Listener {
        void onRequirementsStateChanged(com.google.android.exoplayer2.scheduler.RequirementsWatcher r1, int r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public final class NetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;
        public final /* synthetic */ com.google.android.exoplayer2.scheduler.RequirementsWatcher this$0;

        public static /* synthetic */ void $r8$lambda$Tjcpa8xGVatnfnVqNaRZDmEOR5E(com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback r0) {
                r0.lambda$postCheckRequirements$0()
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$ka6Ww24q498b9n62x-I6-0YNrzg, reason: not valid java name */
        public static /* synthetic */ void m235$r8$lambda$ka6Ww24q498b9n62xI60YNrzg(com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback r0) {
                r0.lambda$postRecheckNotMetNetworkRequirements$1()
                return
        }

        private NetworkCallback(com.google.android.exoplayer2.scheduler.RequirementsWatcher r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ NetworkCallback(com.google.android.exoplayer2.scheduler.RequirementsWatcher r1, com.google.android.exoplayer2.scheduler.RequirementsWatcher.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private /* synthetic */ void lambda$postCheckRequirements$0() {
                r1 = this;
                com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r1.this$0
                com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r0 = com.google.android.exoplayer2.scheduler.RequirementsWatcher.access$400(r0)
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r1.this$0
                com.google.android.exoplayer2.scheduler.RequirementsWatcher.access$200(r0)
            Ld:
                return
        }

        private /* synthetic */ void lambda$postRecheckNotMetNetworkRequirements$1() {
                r1 = this;
                com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r1.this$0
                com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r0 = com.google.android.exoplayer2.scheduler.RequirementsWatcher.access$400(r0)
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r1.this$0
                com.google.android.exoplayer2.scheduler.RequirementsWatcher.access$500(r0)
            Ld:
                return
        }

        private void postCheckRequirements() {
                r3 = this;
                com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r3.this$0
                android.os.Handler r0 = com.google.android.exoplayer2.scheduler.RequirementsWatcher.access$300(r0)
                com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r2)
                r0.post(r1)
                return
        }

        private void postRecheckNotMetNetworkRequirements() {
                r3 = this;
                com.google.android.exoplayer2.scheduler.RequirementsWatcher r0 = r3.this$0
                android.os.Handler r0 = com.google.android.exoplayer2.scheduler.RequirementsWatcher.access$300(r0)
                com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r2)
                r0.post(r1)
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network r1) {
                r0 = this;
                r0.postCheckRequirements()
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(android.net.Network r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L5
                r0.postRecheckNotMetNetworkRequirements()
            L5:
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network r1, android.net.NetworkCapabilities r2) {
                r0 = this;
                r1 = 16
                boolean r1 = r2.hasCapability(r1)
                boolean r2 = r0.receivedCapabilitiesChange
                if (r2 == 0) goto L15
                boolean r2 = r0.networkValidated
                if (r2 == r1) goto Lf
                goto L15
            Lf:
                if (r1 == 0) goto L1d
                r0.postRecheckNotMetNetworkRequirements()
                goto L1d
            L15:
                r2 = 1
                r0.receivedCapabilitiesChange = r2
                r0.networkValidated = r1
                r0.postCheckRequirements()
            L1d:
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network r1) {
                r0 = this;
                r0.postCheckRequirements()
                return
        }
    }

    public RequirementsWatcher(android.content.Context r1, com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener r2, com.google.android.exoplayer2.scheduler.Requirements r3) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.listener = r2
            r0.requirements = r3
            android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper()
            r0.handler = r1
            return
    }

    public static /* synthetic */ void access$200(com.google.android.exoplayer2.scheduler.RequirementsWatcher r0) {
            r0.checkRequirements()
            return
    }

    public static /* synthetic */ android.os.Handler access$300(com.google.android.exoplayer2.scheduler.RequirementsWatcher r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback access$400(com.google.android.exoplayer2.scheduler.RequirementsWatcher r0) {
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r0 = r0.networkCallback
            return r0
    }

    public static /* synthetic */ void access$500(com.google.android.exoplayer2.scheduler.RequirementsWatcher r0) {
            r0.recheckNotMetNetworkRequirements()
            return
    }

    private void checkRequirements() {
            r2 = this;
            com.google.android.exoplayer2.scheduler.Requirements r0 = r2.requirements
            android.content.Context r1 = r2.context
            int r0 = r0.getNotMetRequirements(r1)
            int r1 = r2.notMetRequirements
            if (r1 == r0) goto L13
            r2.notMetRequirements = r0
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$Listener r1 = r2.listener
            r1.onRequirementsStateChanged(r2, r0)
        L13:
            return
    }

    private void recheckNotMetNetworkRequirements() {
            r1 = this;
            int r0 = r1.notMetRequirements
            r0 = r0 & 3
            if (r0 != 0) goto L7
            return
        L7:
            r1.checkRequirements()
            return
    }

    @androidx.annotation.RequiresApi(24)
    private void registerNetworkCallbackV24() {
            r3 = this;
            android.content.Context r0 = r3.context
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r1 = new com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback
            r2 = 0
            r1.<init>(r3, r2)
            r3.networkCallback = r1
            r0.registerDefaultNetworkCallback(r1)
            return
    }

    @androidx.annotation.RequiresApi(24)
    private void unregisterNetworkCallbackV24() {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r1 = r2.networkCallback
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            android.net.ConnectivityManager$NetworkCallback r1 = (android.net.ConnectivityManager.NetworkCallback) r1
            r0.unregisterNetworkCallback(r1)
            r0 = 0
            r2.networkCallback = r0
            return
    }

    public com.google.android.exoplayer2.scheduler.Requirements getRequirements() {
            r1 = this;
            com.google.android.exoplayer2.scheduler.Requirements r0 = r1.requirements
            return r0
    }

    public int start() {
            r5 = this;
            com.google.android.exoplayer2.scheduler.Requirements r0 = r5.requirements
            android.content.Context r1 = r5.context
            int r0 = r0.getNotMetRequirements(r1)
            r5.notMetRequirements = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            com.google.android.exoplayer2.scheduler.Requirements r1 = r5.requirements
            boolean r1 = r1.isNetworkRequired()
            if (r1 == 0) goto L26
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 24
            if (r1 < r2) goto L21
            r5.registerNetworkCallbackV24()
            goto L26
        L21:
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)
        L26:
            com.google.android.exoplayer2.scheduler.Requirements r1 = r5.requirements
            boolean r1 = r1.isChargingRequired()
            if (r1 == 0) goto L38
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r0.addAction(r1)
        L38:
            com.google.android.exoplayer2.scheduler.Requirements r1 = r5.requirements
            boolean r1 = r1.isIdleRequired()
            if (r1 == 0) goto L56
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 23
            if (r1 < r2) goto L4c
            java.lang.String r1 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
            r0.addAction(r1)
            goto L56
        L4c:
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
        L56:
            com.google.android.exoplayer2.scheduler.Requirements r1 = r5.requirements
            boolean r1 = r1.isStorageNotLowRequired()
            if (r1 == 0) goto L68
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_OK"
            r0.addAction(r1)
        L68:
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$DeviceStatusChangeReceiver r1 = new com.google.android.exoplayer2.scheduler.RequirementsWatcher$DeviceStatusChangeReceiver
            r2 = 0
            r1.<init>(r5, r2)
            r5.receiver = r1
            android.content.Context r3 = r5.context
            android.os.Handler r4 = r5.handler
            r3.registerReceiver(r1, r0, r2, r4)
            int r0 = r5.notMetRequirements
            return r0
    }

    public void stop() {
            r2 = this;
            android.content.Context r0 = r2.context
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$DeviceStatusChangeReceiver r1 = r2.receiver
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            r0.unregisterReceiver(r1)
            r0 = 0
            r2.receiver = r0
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 24
            if (r0 < r1) goto L1d
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r0 = r2.networkCallback
            if (r0 == 0) goto L1d
            r2.unregisterNetworkCallbackV24()
        L1d:
            return
    }
}
