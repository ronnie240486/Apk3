package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zak extends com.google.android.gms.common.api.internal.zap {
    private final android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> zad;

    private zak(com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r1 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1.<init>(r2, r0)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.zad = r0
            java.lang.String r0 = "AutoManageHelper"
            r2.addCallback(r0, r1)
            return
    }

    public static com.google.android.gms.common.api.internal.zak zaa(com.google.android.gms.common.api.internal.LifecycleActivity r2) {
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r2)
            java.lang.Class<com.google.android.gms.common.api.internal.zak> r0 = com.google.android.gms.common.api.internal.zak.class
            java.lang.String r1 = "AutoManageHelper"
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r2.getCallbackOrNull(r1, r0)
            com.google.android.gms.common.api.internal.zak r0 = (com.google.android.gms.common.api.internal.zak) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            com.google.android.gms.common.api.internal.zak r0 = new com.google.android.gms.common.api.internal.zak
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.api.internal.zaj zai(int r2) {
            r1 = this;
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r0 = r1.zad
            int r0 = r0.size()
            if (r0 > r2) goto La
            r2 = 0
            return r2
        La:
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r0 = r1.zad
            int r2 = r0.keyAt(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.internal.zaj r2 = (com.google.android.gms.common.api.internal.zaj) r2
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            r0 = 0
        L1:
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r1 = r4.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L35
            com.google.android.gms.common.api.internal.zaj r1 = r4.zai(r0)
            if (r1 == 0) goto L32
            java.io.PrintWriter r2 = r7.append(r5)
            java.lang.String r3 = "GoogleApiClient #"
            java.io.PrintWriter r2 = r2.append(r3)
            int r3 = r1.zaa
            r2.print(r3)
            java.lang.String r2 = ":"
            r7.println(r2)
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "  "
            java.lang.String r2 = r2.concat(r3)
            r1.dump(r2, r6, r7, r8)
        L32:
            int r0 = r0 + 1
            goto L1
        L35:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
            r4 = this;
            super.onStart()
            boolean r0 = r4.zaa
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r1 = r4.zad
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 14
            r3.<init>(r2)
            java.lang.String r2 = "onStart "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "AutoManageHelper"
            android.util.Log.d(r1, r0)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zam> r0 = r4.zab
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L4e
            r0 = 0
        L38:
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r1 = r4.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L4e
            com.google.android.gms.common.api.internal.zaj r1 = r4.zai(r0)
            if (r1 == 0) goto L4b
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            r1.connect()
        L4b:
            int r0 = r0 + 1
            goto L38
        L4e:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
            r2 = this;
            super.onStop()
            r0 = 0
        L4:
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r1 = r2.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L1a
            com.google.android.gms.common.api.internal.zaj r1 = r2.zai(r0)
            if (r1 == 0) goto L17
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            r1.disconnect()
        L17:
            int r0 = r0 + 1
            goto L4
        L1a:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(com.google.android.gms.common.ConnectionResult r3, int r4) {
            r2 = this;
            java.lang.String r0 = "AutoManageHelper"
            java.lang.String r1 = "Unresolved error while connecting client. Stopping auto-manage."
            android.util.Log.w(r0, r1)
            if (r4 >= 0) goto L14
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>()
            java.lang.String r4 = "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set"
            android.util.Log.wtf(r0, r4, r3)
            return
        L14:
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r0 = r2.zad
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.common.api.internal.zaj r0 = (com.google.android.gms.common.api.internal.zaj) r0
            if (r0 == 0) goto L28
            r2.zae(r4)
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r4 = r0.zac
            if (r4 == 0) goto L28
            r4.onConnectionFailed(r3)
        L28:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
            r2 = this;
            r0 = 0
        L1:
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r1 = r2.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            com.google.android.gms.common.api.internal.zaj r1 = r2.zai(r0)
            if (r1 == 0) goto L14
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            r1.connect()
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    public final void zad(int r6, com.google.android.gms.common.api.GoogleApiClient r7, @androidx.annotation.Nullable com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r8) {
            r5 = this;
            java.lang.String r0 = "GoogleApiClient instance cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r0 = r5.zad
            int r0 = r0.indexOfKey(r6)
            if (r0 >= 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 54
            r1.<init>(r2)
            java.lang.String r2 = "Already managing a GoogleApiClient with id "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zam> r0 = r5.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            boolean r1 = r5.zaa
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r3 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 49
            r4.<init>(r3)
            java.lang.String r3 = "starting AutoManage for client "
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = " "
            r4.append(r3)
            r4.append(r1)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "AutoManageHelper"
            android.util.Log.d(r2, r1)
            com.google.android.gms.common.api.internal.zaj r1 = new com.google.android.gms.common.api.internal.zaj
            r1.<init>(r5, r6, r7, r8)
            r7.registerConnectionFailedListener(r1)
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r8 = r5.zad
            r8.put(r6, r1)
            boolean r6 = r5.zaa
            if (r6 == 0) goto L82
            if (r0 != 0) goto L82
            java.lang.String r6 = r7.toString()
            java.lang.String r8 = "connecting "
            java.lang.String r6 = r8.concat(r6)
            android.util.Log.d(r2, r6)
            r7.connect()
        L82:
            return
    }

    public final void zae(int r3) {
            r2 = this;
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r0 = r2.zad
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.common.api.internal.zaj r0 = (com.google.android.gms.common.api.internal.zaj) r0
            android.util.SparseArray<com.google.android.gms.common.api.internal.zaj> r1 = r2.zad
            r1.remove(r3)
            if (r0 == 0) goto L19
            com.google.android.gms.common.api.GoogleApiClient r3 = r0.zab
            r3.unregisterConnectionFailedListener(r0)
            com.google.android.gms.common.api.GoogleApiClient r3 = r0.zab
            r3.disconnect()
        L19:
            return
    }
}
