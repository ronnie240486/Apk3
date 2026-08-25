package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class NonGmsServiceBrokerClient implements com.google.android.gms.common.api.Api.Client, android.content.ServiceConnection {
    private static final java.lang.String zaa = null;

    @androidx.annotation.Nullable
    private final java.lang.String zab;

    @androidx.annotation.Nullable
    private final java.lang.String zac;

    @androidx.annotation.Nullable
    private final android.content.ComponentName zad;
    private final android.content.Context zae;
    private final com.google.android.gms.common.api.internal.ConnectionCallbacks zaf;
    private final android.os.Handler zag;
    private final com.google.android.gms.common.api.internal.OnConnectionFailedListener zah;

    @androidx.annotation.Nullable
    private android.os.IBinder zai;
    private boolean zaj;

    @androidx.annotation.Nullable
    private java.lang.String zak;

    @androidx.annotation.Nullable
    private java.lang.String zal;

    static {
            java.lang.Class<com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient> r0 = com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.class
            java.lang.String r0 = "NonGmsServiceBrokerClient"
            com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.zaa = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public NonGmsServiceBrokerClient(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull android.os.Looper r10, @androidx.annotation.NonNull android.content.ComponentName r11, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks r12, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r8 = this;
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private NonGmsServiceBrokerClient(android.content.Context r2, android.os.Looper r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable android.content.ComponentName r6, com.google.android.gms.common.api.internal.ConnectionCallbacks r7, com.google.android.gms.common.api.internal.OnConnectionFailedListener r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zak = r0
            r1.zae = r2
            com.google.android.gms.internal.base.zaq r2 = new com.google.android.gms.internal.base.zaq
            r2.<init>(r3)
            r1.zag = r2
            r1.zaf = r7
            r1.zah = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.zab = r4
            r1.zac = r5
            r1.zad = r6
            return
        L27:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public NonGmsServiceBrokerClient(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull android.os.Looper r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks r13, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener r14) {
            r8 = this;
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @androidx.annotation.WorkerThread
    private final void zad() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Handler r1 = r2.zag
            android.os.Looper r1 = r1.getLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This method should only run on the NonGmsServiceBrokerClient's handler thread."
            r0.<init>(r1)
            throw r0
    }

    private final void zae(java.lang.String r1) {
            r0 = this;
            android.os.IBinder r1 = r0.zai
            java.lang.String.valueOf(r1)
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.WorkerThread
    public final void connect(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r4) {
            r3 = this;
            r3.zad()
            java.lang.String r4 = "Connect started."
            r3.zae(r4)
            boolean r4 = r3.isConnected()
            if (r4 == 0) goto L13
            java.lang.String r4 = "connect() called when already connected"
            r3.disconnect(r4)     // Catch: java.lang.Exception -> L13
        L13:
            r4 = 0
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.SecurityException -> L4e
            r0.<init>()     // Catch: java.lang.SecurityException -> L4e
            android.content.ComponentName r1 = r3.zad     // Catch: java.lang.SecurityException -> L4e
            if (r1 == 0) goto L21
            r0.setComponent(r1)     // Catch: java.lang.SecurityException -> L4e
            goto L2c
        L21:
            java.lang.String r1 = r3.zab     // Catch: java.lang.SecurityException -> L4e
            android.content.Intent r1 = r0.setPackage(r1)     // Catch: java.lang.SecurityException -> L4e
            java.lang.String r2 = r3.zac     // Catch: java.lang.SecurityException -> L4e
            r1.setAction(r2)     // Catch: java.lang.SecurityException -> L4e
        L2c:
            android.content.Context r1 = r3.zae     // Catch: java.lang.SecurityException -> L4e
            int r2 = com.google.android.gms.common.internal.GmsClientSupervisor.getDefaultBindFlags()     // Catch: java.lang.SecurityException -> L4e
            boolean r0 = r1.bindService(r0, r3, r2)     // Catch: java.lang.SecurityException -> L4e
            r3.zaj = r0     // Catch: java.lang.SecurityException -> L4e
            if (r0 != 0) goto L48
            r3.zai = r4
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r4 = r3.zah
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 16
            r0.<init>(r1)
            r4.onConnectionFailed(r0)
        L48:
            java.lang.String r4 = "Finished connect."
            r3.zae(r4)
            return
        L4e:
            r0 = move-exception
            r1 = 0
            r3.zaj = r1
            r3.zai = r4
            throw r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.WorkerThread
    public final void disconnect() {
            r1 = this;
            r1.zad()
            java.lang.String r0 = "Disconnect called."
            r1.zae(r0)
            android.content.Context r0 = r1.zae     // Catch: java.lang.IllegalArgumentException -> Ld
            r0.unbindService(r1)     // Catch: java.lang.IllegalArgumentException -> Ld
        Ld:
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zai = r0
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.WorkerThread
    public final void disconnect(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.zad()
            r0.zak = r1
            r0.disconnect()
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.io.FileDescriptor r2, @androidx.annotation.NonNull java.io.PrintWriter r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public android.os.IBinder getBinder() {
            r1 = this;
            r1.zad()
            android.os.IBinder r0 = r1.zai
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    public final java.lang.String getEndpointPackageName() {
            r1 = this;
            java.lang.String r0 = r1.zab
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.ComponentName r0 = r1.zad
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.ComponentName r0 = r1.zad
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.Nullable
    public final java.lang.String getLastDisconnectMessage() {
            r1 = this;
            java.lang.String r0 = r1.zak
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void getRemoteService(@androidx.annotation.Nullable com.google.android.gms.common.internal.IAccountAccessor r1, @androidx.annotation.Nullable java.util.Set<com.google.android.gms.common.api.Scope> r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    public final com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    public final java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.Nullable
    public final android.os.IBinder getServiceBrokerBinder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    public final android.content.Intent getSignInIntent() {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.WorkerThread
    public final boolean isConnected() {
            r1 = this;
            r1.zad()
            android.os.IBinder r0 = r1.zai
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.WorkerThread
    public final boolean isConnecting() {
            r1 = this;
            r1.zad()
            boolean r0 = r1.zaj
            return r0
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@androidx.annotation.NonNull android.content.ComponentName r2, @androidx.annotation.NonNull android.os.IBinder r3) {
            r1 = this;
            android.os.Handler r2 = r1.zag
            com.google.android.gms.common.api.internal.zacg r0 = new com.google.android.gms.common.api.internal.zacg
            r0.<init>(r1, r3)
            r2.post(r0)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@androidx.annotation.NonNull android.content.ComponentName r2) {
            r1 = this;
            android.os.Handler r2 = r1.zag
            com.google.android.gms.common.api.internal.zacf r0 = new com.google.android.gms.common.api.internal.zacf
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final /* synthetic */ void zaa(android.os.IBinder r2) {
            r1 = this;
            r0 = 0
            r1.zaj = r0
            r1.zai = r2
            java.lang.String r2 = "Connected."
            r1.zae(r2)
            com.google.android.gms.common.api.internal.ConnectionCallbacks r2 = r1.zaf
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.onConnected(r0)
            return
    }

    public final /* synthetic */ void zab() {
            r2 = this;
            r0 = 0
            r2.zaj = r0
            r0 = 0
            r2.zai = r0
            java.lang.String r0 = "Disconnected."
            r2.zae(r0)
            com.google.android.gms.common.api.internal.ConnectionCallbacks r0 = r2.zaf
            r1 = 1
            r0.onConnectionSuspended(r1)
            return
    }

    public final void zac(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            r0.zal = r1
            return
    }
}
