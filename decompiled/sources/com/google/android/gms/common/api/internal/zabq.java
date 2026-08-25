package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.ApiOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zabq<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.internal.zau {
    public final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final java.util.Queue<com.google.android.gms.common.api.internal.zai> zab;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.Api.Client zac;
    private final com.google.android.gms.common.api.internal.ApiKey<O> zad;
    private final com.google.android.gms.common.api.internal.zaad zae;
    private final java.util.Set<com.google.android.gms.common.api.internal.zal> zaf;
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> zag;
    private final int zah;

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.api.internal.zact zai;
    private boolean zaj;
    private final java.util.List<com.google.android.gms.common.api.internal.zabs> zak;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.ConnectionResult zal;
    private int zam;

    @androidx.annotation.WorkerThread
    public zabq(com.google.android.gms.common.api.internal.GoogleApiManager r4, com.google.android.gms.common.api.GoogleApi<O> r5) {
            r3 = this;
            r3.zaa = r4
            r3.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.zab = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.zaf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.zag = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.zak = r0
            r0 = 0
            r3.zal = r0
            r1 = 0
            r3.zam = r1
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r4)
            android.os.Looper r1 = r1.getLooper()
            com.google.android.gms.common.api.Api$Client r1 = r5.zab(r1, r3)
            r3.zac = r1
            com.google.android.gms.common.api.internal.ApiKey r2 = r5.getApiKey()
            r3.zad = r2
            com.google.android.gms.common.api.internal.zaad r2 = new com.google.android.gms.common.api.internal.zaad
            r2.<init>()
            r3.zae = r2
            int r2 = r5.zaa()
            r3.zah = r2
            boolean r1 = r1.requiresSignIn()
            if (r1 == 0) goto L5d
            android.content.Context r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zae(r4)
            android.os.Handler r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r4)
            com.google.android.gms.common.api.internal.zact r4 = r5.zac(r0, r4)
            r3.zai = r4
            return
        L5d:
            r3.zai = r0
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    private final com.google.android.gms.common.Feature zaB(@androidx.annotation.Nullable com.google.android.gms.common.Feature[] r11) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L51
            int r1 = r11.length
            if (r1 != 0) goto L7
            goto L51
        L7:
            com.google.android.gms.common.api.Api$Client r1 = r10.zac
            com.google.android.gms.common.Feature[] r1 = r1.getAvailableFeatures()
            r2 = 0
            if (r1 != 0) goto L12
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r2]
        L12:
            int r3 = r1.length
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>(r3)
            r5 = 0
        L19:
            if (r5 >= r3) goto L2f
            r6 = r1[r5]
            java.lang.String r7 = r6.getName()
            long r8 = r6.getVersion()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r4.put(r7, r6)
            int r5 = r5 + 1
            goto L19
        L2f:
            int r1 = r11.length
        L30:
            if (r2 >= r1) goto L51
            r3 = r11[r2]
            java.lang.String r5 = r3.getName()
            java.lang.Object r5 = r4.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L50
            long r5 = r5.longValue()
            long r7 = r3.getVersion()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L4d
            goto L50
        L4d:
            int r2 = r2 + 1
            goto L30
        L50:
            return r3
        L51:
            return r0
    }

    @androidx.annotation.WorkerThread
    private final void zaC(com.google.android.gms.common.ConnectionResult r5) {
            r4 = this;
            java.util.Set<com.google.android.gms.common.api.internal.zal> r0 = r4.zaf
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.zal r1 = (com.google.android.gms.common.api.internal.zal) r1
            com.google.android.gms.common.ConnectionResult r2 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r5, r2)
            if (r2 == 0) goto L21
            com.google.android.gms.common.api.Api$Client r2 = r4.zac
            java.lang.String r2 = r2.getEndpointPackageName()
            goto L22
        L21:
            r2 = 0
        L22:
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r3 = r4.zad
            r1.zac(r3, r5, r2)
            goto L6
        L28:
            java.util.Set<com.google.android.gms.common.api.internal.zal> r5 = r4.zaf
            r5.clear()
            return
    }

    @androidx.annotation.WorkerThread
    private final void zaD(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            r0 = 0
            r1 = 0
            r2.zaE(r3, r0, r1)
            return
    }

    @androidx.annotation.WorkerThread
    private final void zaE(@androidx.annotation.Nullable com.google.android.gms.common.api.Status r5, @androidx.annotation.Nullable java.lang.Exception r6, boolean r7) {
            r4 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r4.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            r0 = 0
            r1 = 1
            if (r5 == 0) goto Lf
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            if (r6 == 0) goto L13
            goto L14
        L13:
            r0 = 1
        L14:
            if (r2 == r0) goto L3d
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r0 = r4.zab
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.zai r1 = (com.google.android.gms.common.api.internal.zai) r1
            if (r7 == 0) goto L2f
            int r2 = r1.zac
            r3 = 2
            if (r2 != r3) goto L1c
        L2f:
            if (r5 == 0) goto L35
            r1.zad(r5)
            goto L38
        L35:
            r1.zae(r6)
        L38:
            r0.remove()
            goto L1c
        L3c:
            return
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Status XOR exception should be null"
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.WorkerThread
    private final void zaF() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r1 = r5.zab
            r0.<init>(r1)
            int r1 = r0.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.common.api.internal.zai r3 = (com.google.android.gms.common.api.internal.zai) r3
            com.google.android.gms.common.api.Api$Client r4 = r5.zac
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L1d
            goto L2b
        L1d:
            boolean r4 = r5.zaL(r3)
            if (r4 == 0) goto L28
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r4 = r5.zab
            r4.remove(r3)
        L28:
            int r2 = r2 + 1
            goto Lc
        L2b:
            return
    }

    @androidx.annotation.WorkerThread
    private final void zaG() {
            r4 = this;
            r4.zan()
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            r4.zaC(r0)
            r4.zaK()
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> r0 = r4.zag
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.zaci r1 = (com.google.android.gms.common.api.internal.zaci) r1
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r2 = r1.zaa
            com.google.android.gms.common.Feature[] r2 = r2.getRequiredFeatures()
            com.google.android.gms.common.Feature r2 = r4.zaB(r2)
            if (r2 == 0) goto L31
            r0.remove()
            goto L15
        L31:
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r1 = r1.zaa     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            com.google.android.gms.common.api.Api$Client r2 = r4.zac     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            r3.<init>()     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            r1.registerListener(r2, r3)     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            goto L15
        L3e:
            r0.remove()
            goto L15
        L42:
            r0 = 3
            r4.onConnectionSuspended(r0)
            com.google.android.gms.common.api.Api$Client r0 = r4.zac
            java.lang.String r1 = "DeadObjectException thrown while calling register listener method."
            r0.disconnect(r1)
        L4d:
            r4.zaF()
            r4.zaI()
            return
    }

    @androidx.annotation.WorkerThread
    private final void zaH(int r4) {
            r3 = this;
            r3.zan()
            r0 = 1
            r3.zaj = r0
            com.google.android.gms.common.api.internal.zaad r0 = r3.zae
            com.google.android.gms.common.api.Api$Client r1 = r3.zac
            java.lang.String r1 = r1.getLastDisconnectMessage()
            r0.zae(r4, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = r3.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r4)
            android.os.Handler r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r4)
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r1 = r3.zad
            r2 = 9
            android.os.Message r4 = android.os.Message.obtain(r4, r2, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.zaa
            long r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zab(r1)
            r0.sendMessageDelayed(r4, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = r3.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r4)
            android.os.Handler r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r4)
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r1 = r3.zad
            r2 = 11
            android.os.Message r4 = android.os.Message.obtain(r4, r2, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.zaa
            long r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zac(r1)
            r0.sendMessageDelayed(r4, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = r3.zaa
            com.google.android.gms.common.internal.zal r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zan(r4)
            r4.zac()
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> r4 = r3.zag
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L5a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r4.next()
            com.google.android.gms.common.api.internal.zaci r0 = (com.google.android.gms.common.api.internal.zaci) r0
            java.lang.Runnable r0 = r0.zac
            r0.run()
            goto L5a
        L6c:
            return
    }

    private final void zaI() {
            r4 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r4.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r1 = r4.zad
            r2 = 12
            r0.removeMessages(r2, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r4.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r3 = r4.zad
            android.os.Message r0 = r0.obtainMessage(r2, r3)
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r4.zaa
            long r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r2)
            r1.sendMessageDelayed(r0, r2)
            return
    }

    @androidx.annotation.WorkerThread
    private final void zaJ(com.google.android.gms.common.api.internal.zai r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaad r0 = r2.zae
            boolean r1 = r2.zaz()
            r3.zag(r0, r1)
            r3.zaf(r2)     // Catch: android.os.DeadObjectException -> Ld
            return
        Ld:
            r3 = 1
            r2.onConnectionSuspended(r3)
            com.google.android.gms.common.api.Api$Client r3 = r2.zac
            java.lang.String r0 = "DeadObjectException thrown while running ApiCallRunner."
            r3.disconnect(r0)
            return
    }

    @androidx.annotation.WorkerThread
    private final void zaK() {
            r3 = this;
            boolean r0 = r3.zaj
            if (r0 == 0) goto L21
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            r1 = 11
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r2 = r3.zad
            r0.removeMessages(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            r1 = 9
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r2 = r3.zad
            r0.removeMessages(r1, r2)
            r0 = 0
            r3.zaj = r0
        L21:
            return
    }

    @androidx.annotation.WorkerThread
    private final boolean zaL(com.google.android.gms.common.api.internal.zai r10) {
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.common.api.internal.zac
            r1 = 1
            if (r0 != 0) goto L9
            r9.zaJ(r10)
            return r1
        L9:
            r0 = r10
            com.google.android.gms.common.api.internal.zac r0 = (com.google.android.gms.common.api.internal.zac) r0
            com.google.android.gms.common.Feature[] r2 = r0.zab(r9)
            com.google.android.gms.common.Feature r2 = r9.zaB(r2)
            if (r2 != 0) goto L1a
            r9.zaJ(r10)
            return r1
        L1a:
            com.google.android.gms.common.api.Api$Client r10 = r9.zac
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r3 = r2.getName()
            long r4 = r2.getVersion()
            int r6 = r10.length()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 77
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = " could not execute call because it requires feature ("
            java.lang.String r7 = ", "
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r8, r10, r6, r3, r7)
            r8.append(r4)
            java.lang.String r10 = ")."
            r8.append(r10)
            java.lang.String r10 = r8.toString()
            java.lang.String r3 = "GoogleApiManager"
            android.util.Log.w(r3, r10)
            com.google.android.gms.common.api.internal.GoogleApiManager r10 = r9.zaa
            boolean r10 = com.google.android.gms.common.api.internal.GoogleApiManager.zaE(r10)
            if (r10 == 0) goto Leb
            boolean r10 = r0.zaa(r9)
            if (r10 == 0) goto Leb
            com.google.android.gms.common.api.internal.zabs r10 = new com.google.android.gms.common.api.internal.zabs
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r9.zad
            r1 = 0
            r10.<init>(r0, r2)
            java.util.List<com.google.android.gms.common.api.internal.zabs> r0 = r9.zak
            int r0 = r0.indexOf(r10)
            r2 = 15
            if (r0 < 0) goto La1
            java.util.List<com.google.android.gms.common.api.internal.zabs> r10 = r9.zak
            java.lang.Object r10 = r10.get(r0)
            com.google.android.gms.common.api.internal.zabs r10 = (com.google.android.gms.common.api.internal.zabs) r10
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r9.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            r0.removeMessages(r2, r10)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r9.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Message r10 = android.os.Message.obtain(r0, r2, r10)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r9.zaa
            long r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zab(r0)
            r1.sendMessageDelayed(r10, r2)
            goto Le9
        La1:
            java.util.List<com.google.android.gms.common.api.internal.zabs> r0 = r9.zak
            r0.add(r10)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r9.zaa
            android.os.Handler r3 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r10)
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r9.zaa
            long r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zab(r2)
            r3.sendMessageDelayed(r0, r4)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r9.zaa
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            r3 = 16
            android.os.Message r10 = android.os.Message.obtain(r0, r3, r10)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r9.zaa
            long r3 = com.google.android.gms.common.api.internal.GoogleApiManager.zac(r0)
            r2.sendMessageDelayed(r10, r3)
            com.google.android.gms.common.ConnectionResult r10 = new com.google.android.gms.common.ConnectionResult
            r0 = 2
            r10.<init>(r0, r1)
            boolean r0 = r9.zaM(r10)
            if (r0 != 0) goto Le9
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r9.zaa
            int r1 = r9.zah
            r0.zaG(r10, r1)
        Le9:
            r10 = 0
            return r10
        Leb:
            com.google.android.gms.common.api.UnsupportedApiCallException r10 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r10.<init>(r2)
            r0.zae(r10)
            return r1
    }

    @androidx.annotation.WorkerThread
    private final boolean zaM(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zas()
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.zaa     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.api.internal.zaae r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zaj(r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L27
            java.util.Set r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zau(r1)     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r2 = r3.zad     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L27
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.zaa     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.common.api.internal.zaae r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaj(r1)     // Catch: java.lang.Throwable -> L2a
            int r2 = r3.zah     // Catch: java.lang.Throwable -> L2a
            r1.zah(r4, r2)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r4 = 1
            return r4
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            return r4
        L2a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r4
    }

    @androidx.annotation.WorkerThread
    private final boolean zaN(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Api$Client r0 = r2.zac
            boolean r0 = r0.isConnected()
            r1 = 0
            if (r0 == 0) goto L31
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> r0 = r2.zag
            int r0 = r0.size()
            if (r0 != 0) goto L31
            com.google.android.gms.common.api.internal.zaad r0 = r2.zae
            boolean r0 = r0.zag()
            if (r0 == 0) goto L28
            if (r3 == 0) goto L27
            r2.zaI()
        L27:
            return r1
        L28:
            com.google.android.gms.common.api.Api$Client r3 = r2.zac
            java.lang.String r0 = "Timing out service connection."
            r3.disconnect(r0)
            r3 = 1
            return r3
        L31:
            return r1
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client zae(com.google.android.gms.common.api.internal.zabq r0) {
            com.google.android.gms.common.api.Api$Client r0 = r0.zac
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.ApiKey zag(com.google.android.gms.common.api.internal.zabq r0) {
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r0.zad
            return r0
    }

    public static /* bridge */ /* synthetic */ void zai(com.google.android.gms.common.api.internal.zabq r0, com.google.android.gms.common.api.Status r1) {
            r0.zaD(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void zaj(com.google.android.gms.common.api.internal.zabq r0) {
            r0.zaG()
            return
    }

    public static /* bridge */ /* synthetic */ void zak(com.google.android.gms.common.api.internal.zabq r0, int r1) {
            r0.zaH(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void zal(com.google.android.gms.common.api.internal.zabq r1, com.google.android.gms.common.api.internal.zabs r2) {
            java.util.List<com.google.android.gms.common.api.internal.zabs> r0 = r1.zak
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L9
            goto L1c
        L9:
            boolean r2 = r1.zaj
            if (r2 != 0) goto L1c
            com.google.android.gms.common.api.Api$Client r2 = r1.zac
            boolean r2 = r2.isConnected()
            if (r2 != 0) goto L19
            r1.zao()
            return
        L19:
            r1.zaF()
        L1c:
            return
    }

    public static /* bridge */ /* synthetic */ void zam(com.google.android.gms.common.api.internal.zabq r5, com.google.android.gms.common.api.internal.zabs r6) {
            java.util.List<com.google.android.gms.common.api.internal.zabs> r0 = r5.zak
            boolean r0 = r0.remove(r6)
            if (r0 == 0) goto L73
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            r1 = 15
            r0.removeMessages(r1, r6)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            r1 = 16
            r0.removeMessages(r1, r6)
            com.google.android.gms.common.Feature r6 = com.google.android.gms.common.api.internal.zabs.zaa(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r1 = r5.zab
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r1 = r5.zab
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.internal.zai r2 = (com.google.android.gms.common.api.internal.zai) r2
            boolean r3 = r2 instanceof com.google.android.gms.common.api.internal.zac
            if (r3 == 0) goto L33
            r3 = r2
            com.google.android.gms.common.api.internal.zac r3 = (com.google.android.gms.common.api.internal.zac) r3
            com.google.android.gms.common.Feature[] r3 = r3.zab(r5)
            if (r3 == 0) goto L33
            boolean r3 = com.google.android.gms.common.util.ArrayUtils.contains(r3, r6)
            if (r3 == 0) goto L33
            r0.add(r2)
            goto L33
        L56:
            int r1 = r0.size()
            r2 = 0
        L5b:
            if (r2 >= r1) goto L73
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.common.api.internal.zai r3 = (com.google.android.gms.common.api.internal.zai) r3
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r4 = r5.zab
            r4.remove(r3)
            com.google.android.gms.common.api.UnsupportedApiCallException r4 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r4.<init>(r6)
            r3.zae(r4)
            int r2 = r2 + 1
            goto L5b
        L73:
            return
    }

    public static /* bridge */ /* synthetic */ boolean zax(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = 0
            boolean r1 = r1.zaN(r0)
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Looper r0 = r0.getLooper()
            if (r2 != r0) goto L14
            r1.zaG()
            return
        L14:
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r1.zaa
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r2)
            com.google.android.gms.common.api.internal.zabm r0 = new com.google.android.gms.common.api.internal.zabm
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @androidx.annotation.WorkerThread
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            r0 = 0
            r1.zar(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r3) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r2.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r1)
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L14
            r2.zaH(r3)
            return
        L14:
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.api.internal.zabn r1 = new com.google.android.gms.common.api.internal.zabn
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @androidx.annotation.WorkerThread
    public final boolean zaA() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.zaN(r0)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult r1, com.google.android.gms.common.api.Api<?> r2, boolean r3) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public final int zab() {
            r1 = this;
            int r0 = r1.zah
            return r0
    }

    @androidx.annotation.WorkerThread
    public final int zac() {
            r1 = this;
            int r0 = r1.zam
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.common.ConnectionResult zad() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.ConnectionResult r0 = r1.zal
            return r0
    }

    public final com.google.android.gms.common.api.Api.Client zaf() {
            r1 = this;
            com.google.android.gms.common.api.Api$Client r0 = r1.zac
            return r0
    }

    public final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> zah() {
            r1 = this;
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> r0 = r1.zag
            return r0
    }

    @androidx.annotation.WorkerThread
    public final void zan() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            r0 = 0
            r1.zal = r0
            return
    }

    @androidx.annotation.WorkerThread
    public final void zao() {
            r8 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r8.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Api$Client r0 = r8.zac
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto La5
            com.google.android.gms.common.api.Api$Client r0 = r8.zac
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto L1b
            goto La5
        L1b:
            r0 = 10
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r8.zaa     // Catch: java.lang.IllegalStateException -> L9c
            com.google.android.gms.common.internal.zal r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zan(r1)     // Catch: java.lang.IllegalStateException -> L9c
            android.content.Context r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zae(r1)     // Catch: java.lang.IllegalStateException -> L9c
            com.google.android.gms.common.api.Api$Client r3 = r8.zac     // Catch: java.lang.IllegalStateException -> L9c
            int r1 = r2.zab(r1, r3)     // Catch: java.lang.IllegalStateException -> L9c
            if (r1 == 0) goto L70
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.IllegalStateException -> L9c
            r3 = 0
            r2.<init>(r1, r3)     // Catch: java.lang.IllegalStateException -> L9c
            java.lang.String r1 = "GoogleApiManager"
            com.google.android.gms.common.api.Api$Client r4 = r8.zac     // Catch: java.lang.IllegalStateException -> L9c
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.IllegalStateException -> L9c
            java.lang.String r4 = r4.getName()     // Catch: java.lang.IllegalStateException -> L9c
            java.lang.String r5 = r2.toString()     // Catch: java.lang.IllegalStateException -> L9c
            int r6 = r4.length()     // Catch: java.lang.IllegalStateException -> L9c
            int r6 = r6 + 35
            int r7 = r5.length()     // Catch: java.lang.IllegalStateException -> L9c
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L9c
            r7.<init>(r6)     // Catch: java.lang.IllegalStateException -> L9c
            java.lang.String r6 = "The service for "
            r7.append(r6)     // Catch: java.lang.IllegalStateException -> L9c
            r7.append(r4)     // Catch: java.lang.IllegalStateException -> L9c
            java.lang.String r4 = " is not available: "
            r7.append(r4)     // Catch: java.lang.IllegalStateException -> L9c
            r7.append(r5)     // Catch: java.lang.IllegalStateException -> L9c
            java.lang.String r4 = r7.toString()     // Catch: java.lang.IllegalStateException -> L9c
            android.util.Log.w(r1, r4)     // Catch: java.lang.IllegalStateException -> L9c
            r8.zar(r2, r3)     // Catch: java.lang.IllegalStateException -> L9c
            return
        L70:
            com.google.android.gms.common.api.internal.zabu r1 = new com.google.android.gms.common.api.internal.zabu
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r8.zaa
            com.google.android.gms.common.api.Api$Client r3 = r8.zac
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r4 = r8.zad
            r1.<init>(r2, r3, r4)
            boolean r2 = r3.requiresSignIn()
            if (r2 == 0) goto L8c
            com.google.android.gms.common.api.internal.zact r2 = r8.zai
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.api.internal.zact r2 = (com.google.android.gms.common.api.internal.zact) r2
            r2.zae(r1)
        L8c:
            com.google.android.gms.common.api.Api$Client r2 = r8.zac     // Catch: java.lang.SecurityException -> L92
            r2.connect(r1)     // Catch: java.lang.SecurityException -> L92
            return
        L92:
            r1 = move-exception
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r2.<init>(r0)
            r8.zar(r2, r1)
            return
        L9c:
            r1 = move-exception
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r2.<init>(r0)
            r8.zar(r2, r1)
        La5:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zap(com.google.android.gms.common.api.internal.zai r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Api$Client r0 = r1.zac
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L21
            boolean r0 = r1.zaL(r2)
            if (r0 == 0) goto L1b
            r1.zaI()
            return
        L1b:
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r0 = r1.zab
            r0.add(r2)
            return
        L21:
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r0 = r1.zab
            r0.add(r2)
            com.google.android.gms.common.ConnectionResult r2 = r1.zal
            if (r2 == 0) goto L37
            boolean r2 = r2.hasResolution()
            if (r2 == 0) goto L37
            com.google.android.gms.common.ConnectionResult r2 = r1.zal
            r0 = 0
            r1.zar(r2, r0)
            return
        L37:
            r1.zao()
            return
    }

    @androidx.annotation.WorkerThread
    public final void zaq() {
            r1 = this;
            int r0 = r1.zam
            int r0 = r0 + 1
            r1.zam = r0
            return
    }

    @androidx.annotation.WorkerThread
    public final void zar(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r6, @androidx.annotation.Nullable java.lang.Exception r7) {
            r5 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.internal.zact r0 = r5.zai
            if (r0 == 0) goto L10
            r0.zaf()
        L10:
            r5.zan()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            com.google.android.gms.common.internal.zal r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zan(r0)
            r0.zac()
            r5.zaC(r6)
            com.google.android.gms.common.api.Api$Client r0 = r5.zac
            boolean r0 = r0 instanceof com.google.android.gms.common.internal.service.zap
            r1 = 1
            if (r0 == 0) goto L49
            int r0 = r6.getErrorCode()
            r2 = 24
            if (r0 == r2) goto L49
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            com.google.android.gms.common.api.internal.GoogleApiManager.zav(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            r3 = 19
            android.os.Message r0 = r0.obtainMessage(r3)
            r3 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r0, r3)
        L49:
            int r0 = r6.getErrorCode()
            r2 = 4
            if (r0 != r2) goto L58
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zah()
            r5.zaD(r6)
            return
        L58:
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r0 = r5.zab
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L63
            r5.zal = r6
            return
        L63:
            r0 = 0
            if (r7 == 0) goto L74
            com.google.android.gms.common.api.internal.GoogleApiManager r6 = r5.zaa
            android.os.Handler r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r6)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r6)
            r6 = 0
            r5.zaE(r0, r7, r6)
            return
        L74:
            com.google.android.gms.common.api.internal.GoogleApiManager r7 = r5.zaa
            boolean r7 = com.google.android.gms.common.api.internal.GoogleApiManager.zaE(r7)
            if (r7 == 0) goto Ld3
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r7 = r5.zad
            com.google.android.gms.common.api.Status r7 = com.google.android.gms.common.api.internal.GoogleApiManager.zai(r7, r6)
            r5.zaE(r7, r0, r1)
            java.util.Queue<com.google.android.gms.common.api.internal.zai> r7 = r5.zab
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L8e
            return
        L8e:
            boolean r7 = r5.zaM(r6)
            if (r7 == 0) goto L95
            return
        L95:
            com.google.android.gms.common.api.internal.GoogleApiManager r7 = r5.zaa
            int r0 = r5.zah
            boolean r7 = r7.zaG(r6, r0)
            if (r7 != 0) goto Ld2
            int r7 = r6.getErrorCode()
            r0 = 18
            if (r7 != r0) goto La9
            r5.zaj = r1
        La9:
            boolean r7 = r5.zaj
            if (r7 == 0) goto Lc9
            com.google.android.gms.common.api.internal.GoogleApiManager r6 = r5.zaa
            android.os.Handler r7 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r6)
            android.os.Handler r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r6)
            r0 = 9
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r1 = r5.zad
            android.os.Message r6 = android.os.Message.obtain(r6, r0, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            long r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zab(r0)
            r7.sendMessageDelayed(r6, r0)
            return
        Lc9:
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r7 = r5.zad
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zai(r7, r6)
            r5.zaD(r6)
        Ld2:
            return
        Ld3:
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r7 = r5.zad
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zai(r7, r6)
            r5.zaD(r6)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zas(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r7) {
            r6 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r6.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Api$Client r0 = r6.zac
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r3 = r1.length()
            int r4 = r2.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 25
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "onSignInFailed for "
            java.lang.String r4 = " with "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r3, r1, r4, r2)
            r0.disconnect(r1)
            r0 = 0
            r6.zar(r7, r0)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zat(com.google.android.gms.common.api.internal.zal r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            java.util.Set<com.google.android.gms.common.api.internal.zal> r0 = r1.zaf
            r0.add(r2)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zau() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            boolean r0 = r1.zaj
            if (r0 == 0) goto L10
            r1.zao()
        L10:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zav() {
            r6 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r6.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaa
            r6.zaD(r0)
            com.google.android.gms.common.api.internal.zaad r0 = r6.zae
            r0.zaf()
            java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci> r0 = r6.zag
            java.util.Set r0 = r0.keySet()
            r1 = 0
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey[] r2 = new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey[] r0 = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[]) r0
            int r2 = r0.length
        L23:
            if (r1 >= r2) goto L37
            r3 = r0[r1]
            com.google.android.gms.common.api.internal.zah r4 = new com.google.android.gms.common.api.internal.zah
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource
            r5.<init>()
            r4.<init>(r3, r5)
            r6.zap(r4)
            int r1 = r1 + 1
            goto L23
        L37:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 4
            r0.<init>(r1)
            r6.zaC(r0)
            com.google.android.gms.common.api.Api$Client r0 = r6.zac
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L52
            com.google.android.gms.common.api.Api$Client r0 = r6.zac
            com.google.android.gms.common.api.internal.zabp r1 = new com.google.android.gms.common.api.internal.zabp
            r1.<init>(r6)
            r0.onUserSignOut(r1)
        L52:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zaw() {
            r3 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            boolean r0 = r3.zaj
            if (r0 == 0) goto L3f
            r3.zaK()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zag(r0)
            android.content.Context r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zae(r0)
            int r0 = r1.isGooglePlayServicesAvailable(r0)
            r1 = 18
            if (r0 != r1) goto L2c
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 21
            java.lang.String r2 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r1, r2)
            goto L35
        L2c:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 22
            java.lang.String r2 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r1, r2)
        L35:
            r3.zaD(r0)
            com.google.android.gms.common.api.Api$Client r0 = r3.zac
            java.lang.String r1 = "Timing out connection while resuming."
            r0.disconnect(r1)
        L3f:
            return
    }

    public final boolean zay() {
            r1 = this;
            com.google.android.gms.common.api.Api$Client r0 = r1.zac
            boolean r0 = r0.isConnected()
            return r0
    }

    public final boolean zaz() {
            r1 = this;
            com.google.android.gms.common.api.Api$Client r0 = r1.zac
            boolean r0 = r0.requiresSignIn()
            return r0
    }
}
