package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zak implements android.os.Handler.Callback {

    @com.google.android.gms.common.util.VisibleForTesting
    public final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> zaa;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.internal.zaj zab;
    private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> zac;
    private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> zad;
    private volatile boolean zae;
    private final java.util.concurrent.atomic.AtomicInteger zaf;
    private boolean zag;
    private final android.os.Handler zah;
    private final java.lang.Object zai;

    public zak(android.os.Looper r3, com.google.android.gms.common.internal.zaj r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zac = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zaa = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zad = r0
            r0 = 0
            r2.zae = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r2.zaf = r1
            r2.zag = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zai = r0
            r2.zab = r4
            com.google.android.gms.internal.base.zaq r4 = new com.google.android.gms.internal.base.zaq
            r4.<init>(r3, r2)
            r2.zah = r4
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what
            r1 = 1
            if (r0 != r1) goto L29
            java.lang.Object r4 = r4.obj
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r4 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r4
            java.lang.Object r2 = r3.zai
            monitor-enter(r2)
            boolean r0 = r3.zae     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            com.google.android.gms.common.internal.zaj r0 = r3.zab     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r0 = r3.zac     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r0 = 0
            r4.onConnected(r0)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            return r1
        L26:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r4
        L29:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r1 = 45
            r4.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r4.append(r1)
            r4.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClientEvents"
            java.lang.String r4 = r4.toString()
            android.util.Log.wtf(r1, r4, r0)
            r4 = 0
            return r4
    }

    public final void zaa() {
            r1 = this;
            r0 = 0
            r1.zae = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zaf
            r0.incrementAndGet()
            return
    }

    public final void zab() {
            r1 = this;
            r0 = 1
            r1.zae = r0
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public final void zac(com.google.android.gms.common.ConnectionResult r6) {
            r5 = this;
            android.os.Handler r0 = r5.zah
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            android.os.Handler r0 = r5.zah
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r2 = r5.zad     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.atomic.AtomicInteger r2 = r5.zaf     // Catch: java.lang.Throwable -> L4a
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4a
        L21:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L48
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r3 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r3     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r5.zae     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L46
            java.util.concurrent.atomic.AtomicInteger r4 = r5.zaf     // Catch: java.lang.Throwable -> L4a
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L4a
            if (r4 == r2) goto L3a
            goto L46
        L3a:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r4 = r5.zad     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L21
            r3.onConnectionFailed(r6)     // Catch: java.lang.Throwable -> L4a
            goto L21
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r6
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public final void zad(@androidx.annotation.Nullable android.os.Bundle r6) {
            r5 = this;
            android.os.Handler r0 = r5.zah
            java.lang.String r1 = "onConnectionSuccess must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            java.lang.Object r0 = r5.zai
            monitor-enter(r0)
            boolean r1 = r5.zag     // Catch: java.lang.Throwable -> L69
            r2 = 1
            r1 = r1 ^ r2
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L69
            android.os.Handler r1 = r5.zah     // Catch: java.lang.Throwable -> L69
            r1.removeMessages(r2)     // Catch: java.lang.Throwable -> L69
            r5.zag = r2     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r1 = r5.zaa     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r2 = r5.zac     // Catch: java.lang.Throwable -> L69
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.atomic.AtomicInteger r2 = r5.zaf     // Catch: java.lang.Throwable -> L69
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
        L32:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r3 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r3     // Catch: java.lang.Throwable -> L69
            boolean r4 = r5.zae     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L5f
            com.google.android.gms.common.internal.zaj r4 = r5.zab     // Catch: java.lang.Throwable -> L69
            boolean r4 = r4.isConnected()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L5f
            java.util.concurrent.atomic.AtomicInteger r4 = r5.zaf     // Catch: java.lang.Throwable -> L69
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L69
            if (r4 == r2) goto L53
            goto L5f
        L53:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r4 = r5.zaa     // Catch: java.lang.Throwable -> L69
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L69
            if (r4 != 0) goto L32
            r3.onConnected(r6)     // Catch: java.lang.Throwable -> L69
            goto L32
        L5f:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r6 = r5.zaa     // Catch: java.lang.Throwable -> L69
            r6.clear()     // Catch: java.lang.Throwable -> L69
            r6 = 0
            r5.zag = r6     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            return
        L69:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r6
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public final void zae(int r6) {
            r5 = this;
            android.os.Handler r0 = r5.zah
            java.lang.String r1 = "onUnintentionalDisconnection must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            android.os.Handler r0 = r5.zah
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.zai
            monitor-enter(r0)
            r5.zag = r1     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r2 = r5.zac     // Catch: java.lang.Throwable -> L52
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicInteger r2 = r5.zaf     // Catch: java.lang.Throwable -> L52
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L52
        L23:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L48
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r3 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r3     // Catch: java.lang.Throwable -> L52
            boolean r4 = r5.zae     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L48
            java.util.concurrent.atomic.AtomicInteger r4 = r5.zaf     // Catch: java.lang.Throwable -> L52
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L52
            if (r4 == r2) goto L3c
            goto L48
        L3c:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r4 = r5.zac     // Catch: java.lang.Throwable -> L52
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L23
            r3.onConnectionSuspended(r6)     // Catch: java.lang.Throwable -> L52
            goto L23
        L48:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r6 = r5.zaa     // Catch: java.lang.Throwable -> L52
            r6.clear()     // Catch: java.lang.Throwable -> L52
            r6 = 0
            r5.zag = r6     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return
        L52:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r6
    }

    public final void zaf(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r6) {
            r5 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.lang.Object r0 = r5.zai
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r1 = r5.zac     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r1.contains(r6)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L35
            java.lang.String r1 = "GmsClientEvents"
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L4e
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L4e
            int r3 = r3 + 62
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = "registerConnectionCallbacks(): listener "
            r4.append(r3)     // Catch: java.lang.Throwable -> L4e
            r4.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = " is already registered"
            r4.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L4e
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L4e
            goto L3a
        L35:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r1 = r5.zac     // Catch: java.lang.Throwable -> L4e
            r1.add(r6)     // Catch: java.lang.Throwable -> L4e
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.common.internal.zaj r0 = r5.zab
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L4d
            android.os.Handler r0 = r5.zah
            r1 = 1
            android.os.Message r6 = r0.obtainMessage(r1, r6)
            r0.sendMessage(r6)
        L4d:
            return
        L4e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r6
    }

    public final void zag(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.Object r0 = r4.zai
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r1 = r4.zad     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.contains(r5)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L35
            java.lang.String r1 = "GmsClientEvents"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L3c
            int r2 = r2 + 67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "registerConnectionFailedListener(): listener "
            r3.append(r2)     // Catch: java.lang.Throwable -> L3c
            r3.append(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = " is already registered"
            r3.append(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L3c
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L35:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r1 = r4.zad     // Catch: java.lang.Throwable -> L3c
            r1.add(r5)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r5
    }

    public final void zah(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.Object r0 = r4.zai
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r1 = r4.zac     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.remove(r5)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L35
            java.lang.String r1 = "GmsClientEvents"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L40
            int r2 = r2 + 52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "unregisterConnectionCallbacks(): listener "
            r3.append(r2)     // Catch: java.lang.Throwable -> L40
            r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = " not found"
            r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L40
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L40
            goto L3e
        L35:
            boolean r1 = r4.zag     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L3e
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r1 = r4.zaa     // Catch: java.lang.Throwable -> L40
            r1.add(r5)     // Catch: java.lang.Throwable -> L40
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    public final void zai(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.Object r0 = r4.zai
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r1 = r4.zad     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.remove(r5)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L34
            java.lang.String r1 = "GmsClientEvents"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L36
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L36
            int r2 = r2 + 57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "unregisterConnectionFailedListener(): listener "
            r3.append(r2)     // Catch: java.lang.Throwable -> L36
            r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = " not found"
            r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L36
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r5
    }

    public final boolean zaj(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r1 = r2.zac     // Catch: java.lang.Throwable -> Le
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    public final boolean zak(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r1 = r2.zad     // Catch: java.lang.Throwable -> Le
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
