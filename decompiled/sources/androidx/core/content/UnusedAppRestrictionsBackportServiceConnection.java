package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
class UnusedAppRestrictionsBackportServiceConnection implements android.content.ServiceConnection {
    private final android.content.Context mContext;
    private boolean mHasBoundService;

    @androidx.annotation.NonNull
    public androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> mResultFuture;

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService;


    public UnusedAppRestrictionsBackportServiceConnection(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mUnusedAppRestrictionsService = r0
            r0 = 0
            r1.mHasBoundService = r0
            r1.mContext = r2
            return
    }

    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback getBackportCallback() {
            r1 = this;
            androidx.core.content.UnusedAppRestrictionsBackportServiceConnection$1 r0 = new androidx.core.content.UnusedAppRestrictionsBackportServiceConnection$1
            r0.<init>(r1)
            return r0
    }

    public void connectAndFetchResult(@androidx.annotation.NonNull androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r2.mHasBoundService
            if (r0 != 0) goto L24
            r0 = 1
            r2.mHasBoundService = r0
            r2.mResultFuture = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r1 = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService"
            r3.<init>(r1)
            android.content.Context r1 = r2.mContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r1 = androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(r1)
            android.content.Intent r3 = r3.setPackage(r1)
            android.content.Context r1 = r2.mContext
            r1.bindService(r3, r2, r0)
            return
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Each UnusedAppRestrictionsBackportServiceConnection can only be bound once."
            r3.<init>(r0)
            throw r3
    }

    public void disconnectFromService() {
            r2 = this;
            boolean r0 = r2.mHasBoundService
            if (r0 == 0) goto Ld
            r0 = 0
            r2.mHasBoundService = r0
            android.content.Context r0 = r2.mContext
            r0.unbindService(r2)
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bindService must be called before unbind"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            r0 = this;
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService r1 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.asInterface(r2)
            r0.mUnusedAppRestrictionsService = r1
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r2 = r0.getBackportCallback()     // Catch: android.os.RemoteException -> Le
            r1.isPermissionRevocationEnabledForApp(r2)     // Catch: android.os.RemoteException -> Le
            goto L18
        Le:
            androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> r1 = r0.mResultFuture
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.set(r2)
        L18:
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            r1 = 0
            r0.mUnusedAppRestrictionsService = r1
            return
    }
}
