package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class zaag extends com.google.android.gms.common.api.GoogleApiClient {
    private final java.lang.String zaa;

    public zaag(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r2.zaa
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = r0.zaa
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r2.zaa
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r2.zaa
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r2.zaa
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = r0.zaa
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @androidx.annotation.NonNull
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r2.zaa
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r2.zaa
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r2.zaa
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = r1.zaa
            r2.<init>(r0)
            throw r2
    }
}
