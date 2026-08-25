package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaaa implements com.google.android.gms.common.api.internal.zaca {
    private final android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabe zab;
    private final android.os.Looper zac;
    private final com.google.android.gms.common.api.internal.zabi zad;
    private final com.google.android.gms.common.api.internal.zabi zae;
    private final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.internal.zabi> zaf;
    private final java.util.Set<com.google.android.gms.common.api.internal.SignInConnectionListener> zag;

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.api.Api.Client zah;

    @androidx.annotation.Nullable
    private android.os.Bundle zai;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.ConnectionResult zaj;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.ConnectionResult zak;
    private boolean zal;
    private final java.util.concurrent.locks.Lock zam;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private int zan;

    private zaaa(android.content.Context r20, com.google.android.gms.common.api.internal.zabe r21, java.util.concurrent.locks.Lock r22, android.os.Looper r23, com.google.android.gms.common.GoogleApiAvailabilityLight r24, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> r25, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> r26, com.google.android.gms.common.internal.ClientSettings r27, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r28, @androidx.annotation.Nullable com.google.android.gms.common.api.Api.Client r29, java.util.ArrayList<com.google.android.gms.common.api.internal.zat> r30, java.util.ArrayList<com.google.android.gms.common.api.internal.zat> r31, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r32, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r33) {
            r19 = this;
            r0 = r19
            r19.<init>()
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.zag = r1
            r1 = 0
            r0.zaj = r1
            r0.zak = r1
            r1 = 0
            r0.zal = r1
            r0.zan = r1
            r1 = r20
            r0.zaa = r1
            r14 = r21
            r0.zab = r14
            r15 = r22
            r0.zam = r15
            r13 = r23
            r0.zac = r13
            r2 = r29
            r0.zah = r2
            com.google.android.gms.common.api.internal.zabi r12 = new com.google.android.gms.common.api.internal.zabi
            com.google.android.gms.common.api.internal.zax r11 = new com.google.android.gms.common.api.internal.zax
            r11.<init>(r0)
            r9 = 0
            r16 = 0
            r2 = r12
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r10 = r33
            r17 = r11
            r11 = r16
            r18 = r12
            r12 = r31
            r13 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r18
            r0.zad = r2
            com.google.android.gms.common.api.internal.zabi r13 = new com.google.android.gms.common.api.internal.zabi
            com.google.android.gms.common.api.internal.zaz r12 = new com.google.android.gms.common.api.internal.zaz
            r12.<init>(r0)
            r2 = r13
            r8 = r25
            r9 = r27
            r10 = r32
            r11 = r28
            r1 = r12
            r12 = r30
            r14 = r13
            r13 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.zae = r14
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.util.Set r2 = r26.keySet()
            java.util.Iterator r2 = r2.iterator()
        L7f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.Api$AnyClientKey r3 = (com.google.android.gms.common.api.Api.AnyClientKey) r3
            com.google.android.gms.common.api.internal.zabi r4 = r0.zad
            r1.put(r3, r4)
            goto L7f
        L91:
            java.util.Set r2 = r25.keySet()
            java.util.Iterator r2 = r2.iterator()
        L99:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lab
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.Api$AnyClientKey r3 = (com.google.android.gms.common.api.Api.AnyClientKey) r3
            com.google.android.gms.common.api.internal.zabi r4 = r0.zae
            r1.put(r3, r4)
            goto L99
        Lab:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.zaf = r1
            return
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    private final void zaA(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            int r0 = r2.zan
            r1 = 1
            if (r0 == r1) goto L1a
            r1 = 2
            if (r0 == r1) goto L15
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>()
            java.lang.String r0 = "CompositeGAC"
            java.lang.String r1 = "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor"
            android.util.Log.wtf(r0, r1, r3)
            goto L1d
        L15:
            com.google.android.gms.common.api.internal.zabe r0 = r2.zab
            r0.zaa(r3)
        L1a:
            r2.zaB()
        L1d:
            r3 = 0
            r2.zan = r3
            return
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    private final void zaB() {
            r2 = this;
            java.util.Set<com.google.android.gms.common.api.internal.SignInConnectionListener> r0 = r2.zag
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.SignInConnectionListener r1 = (com.google.android.gms.common.api.internal.SignInConnectionListener) r1
            r1.onComplete()
            goto L6
        L16:
            java.util.Set<com.google.android.gms.common.api.internal.SignInConnectionListener> r0 = r2.zag
            r0.clear()
            return
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    private final boolean zaC() {
            r2 = this;
            com.google.android.gms.common.ConnectionResult r0 = r2.zak
            if (r0 == 0) goto Ld
            int r0 = r0.getErrorCode()
            r1 = 4
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private final boolean zaD(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Api.AnyClient> r2) {
            r1 = this;
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r2.getClientKey()
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.internal.zabi> r0 = r1.zaf
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.internal.zabi r2 = (com.google.android.gms.common.api.internal.zabi) r2
            java.lang.String r0 = "GoogleApiClient is not configured to use the API required for this call."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.zabi r0 = r1.zae
            boolean r2 = r2.equals(r0)
            return r2
    }

    private static boolean zaE(@androidx.annotation.Nullable com.google.android.gms.common.ConnectionResult r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isSuccess()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult zaa(com.google.android.gms.common.api.internal.zaaa r0) {
            com.google.android.gms.common.ConnectionResult r0 = r0.zak
            return r0
    }

    public static com.google.android.gms.common.api.internal.zaaa zag(android.content.Context r16, com.google.android.gms.common.api.internal.zabe r17, java.util.concurrent.locks.Lock r18, android.os.Looper r19, com.google.android.gms.common.GoogleApiAvailabilityLight r20, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> r21, com.google.android.gms.common.internal.ClientSettings r22, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r23, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r24, java.util.ArrayList<com.google.android.gms.common.api.internal.zat> r25) {
            r0 = r23
            androidx.collection.ArrayMap r6 = new androidx.collection.ArrayMap
            r6.<init>()
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            java.util.Set r1 = r21.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r10 = r2
        L16:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            com.google.android.gms.common.api.Api$Client r4 = (com.google.android.gms.common.api.Api.Client) r4
            boolean r5 = r4.providesSignIn()
            if (r3 != r5) goto L30
            r10 = r4
        L30:
            boolean r3 = r4.requiresSignIn()
            if (r3 == 0) goto L40
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2
            r6.put(r2, r4)
            goto L16
        L40:
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2
            r7.put(r2, r4)
            goto L16
        L4a:
            boolean r1 = r6.isEmpty()
            r1 = r1 ^ r3
            java.lang.String r2 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            androidx.collection.ArrayMap r13 = new androidx.collection.ArrayMap
            r13.<init>()
            androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
            r14.<init>()
            java.util.Set r1 = r23.keySet()
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Api r2 = (com.google.android.gms.common.api.Api) r2
            com.google.android.gms.common.api.Api$AnyClientKey r3 = r2.zab()
            boolean r4 = r6.containsKey(r3)
            if (r4 == 0) goto L86
            java.lang.Object r3 = r0.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r13.put(r2, r3)
            goto L66
        L86:
            boolean r3 = r7.containsKey(r3)
            if (r3 == 0) goto L96
            java.lang.Object r3 = r0.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r14.put(r2, r3)
            goto L66
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            r0.<init>(r1)
            throw r0
        L9e:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r0 = r25.size()
            r1 = 0
        Lad:
            if (r1 >= r0) goto Ld9
            r2 = r25
            java.lang.Object r3 = r2.get(r1)
            com.google.android.gms.common.api.internal.zat r3 = (com.google.android.gms.common.api.internal.zat) r3
            com.google.android.gms.common.api.Api<?> r4 = r3.zaa
            boolean r4 = r13.containsKey(r4)
            if (r4 == 0) goto Lc3
            r11.add(r3)
            goto Lce
        Lc3:
            com.google.android.gms.common.api.Api<?> r4 = r3.zaa
            boolean r4 = r14.containsKey(r4)
            if (r4 == 0) goto Ld1
            r12.add(r3)
        Lce:
            int r1 = r1 + 1
            goto Lad
        Ld1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            r0.<init>(r1)
            throw r0
        Ld9:
            com.google.android.gms.common.api.internal.zaaa r15 = new com.google.android.gms.common.api.internal.zaaa
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r8 = r22
            r9 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zabi zah(com.google.android.gms.common.api.internal.zaaa r0) {
            com.google.android.gms.common.api.internal.zabi r0 = r0.zad
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zabi zai(com.google.android.gms.common.api.internal.zaaa r0) {
            com.google.android.gms.common.api.internal.zabi r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock zaj(com.google.android.gms.common.api.internal.zaaa r0) {
            java.util.concurrent.locks.Lock r0 = r0.zam
            return r0
    }

    public static /* bridge */ /* synthetic */ void zak(com.google.android.gms.common.api.internal.zaaa r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zaj = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zal(com.google.android.gms.common.api.internal.zaaa r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zak = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zam(com.google.android.gms.common.api.internal.zaaa r0, boolean r1) {
            r0.zal = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zan(com.google.android.gms.common.api.internal.zaaa r1, int r2, boolean r3) {
            com.google.android.gms.common.api.internal.zabe r0 = r1.zab
            r0.zac(r2, r3)
            r2 = 0
            r1.zak = r2
            r1.zaj = r2
            return
    }

    public static /* bridge */ /* synthetic */ void zao(com.google.android.gms.common.api.internal.zaaa r1, android.os.Bundle r2) {
            android.os.Bundle r0 = r1.zai
            if (r0 != 0) goto L7
            r1.zai = r2
            return
        L7:
            if (r2 == 0) goto Lc
            r0.putAll(r2)
        Lc:
            return
    }

    public static /* bridge */ /* synthetic */ void zap(com.google.android.gms.common.api.internal.zaaa r4) {
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            boolean r0 = zaE(r0)
            if (r0 == 0) goto L55
            com.google.android.gms.common.ConnectionResult r0 = r4.zak
            boolean r0 = zaE(r0)
            r1 = 1
            if (r0 != 0) goto L2d
            boolean r0 = r4.zaC()
            if (r0 == 0) goto L18
            goto L2d
        L18:
            com.google.android.gms.common.ConnectionResult r0 = r4.zak
            if (r0 == 0) goto L89
            int r2 = r4.zan
            if (r2 != r1) goto L24
            r4.zaB()
            return
        L24:
            r4.zaA(r0)
            com.google.android.gms.common.api.internal.zabi r4 = r4.zad
            r4.zar()
            return
        L2d:
            int r0 = r4.zan
            if (r0 == r1) goto L4e
            r1 = 2
            if (r0 == r1) goto L41
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.String r1 = "CompositeGAC"
            java.lang.String r2 = "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor"
            android.util.Log.wtf(r1, r2, r0)
            goto L51
        L41:
            com.google.android.gms.common.api.internal.zabe r0 = r4.zab
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.api.internal.zabe r0 = (com.google.android.gms.common.api.internal.zabe) r0
            android.os.Bundle r1 = r4.zai
            r0.zab(r1)
        L4e:
            r4.zaB()
        L51:
            r0 = 0
            r4.zan = r0
            return
        L55:
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            if (r0 == 0) goto L73
            com.google.android.gms.common.ConnectionResult r0 = r4.zak
            boolean r0 = zaE(r0)
            if (r0 != 0) goto L62
            goto L73
        L62:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zae
            r0.zar()
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.ConnectionResult r0 = (com.google.android.gms.common.ConnectionResult) r0
            r4.zaA(r0)
            return
        L73:
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            if (r0 == 0) goto L89
            com.google.android.gms.common.ConnectionResult r1 = r4.zak
            if (r1 == 0) goto L89
            com.google.android.gms.common.api.internal.zabi r2 = r4.zae
            int r2 = r2.zaf
            com.google.android.gms.common.api.internal.zabi r3 = r4.zad
            int r3 = r3.zaf
            if (r2 >= r3) goto L86
            r0 = r1
        L86:
            r4.zaA(r0)
        L89:
            return
    }

    public static /* bridge */ /* synthetic */ boolean zav(com.google.android.gms.common.api.internal.zaaa r0) {
            boolean r0 = r0.zal
            return r0
    }

    @androidx.annotation.Nullable
    private final android.app.PendingIntent zaz() {
            r5 = this;
            com.google.android.gms.common.api.Api$Client r0 = r5.zah
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.content.Context r0 = r5.zaa
            com.google.android.gms.common.api.internal.zabe r1 = r5.zab
            int r1 = java.lang.System.identityHashCode(r1)
            com.google.android.gms.common.api.Api$Client r2 = r5.zah
            android.content.Intent r2 = r2.getSignInIntent()
            int r3 = com.google.android.gms.internal.base.zal.zaa
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 | r4
            android.app.PendingIntent r0 = com.google.android.gms.internal.base.zal.zaa(r0, r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final com.google.android.gms.common.ConnectionResult zab() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final com.google.android.gms.common.ConnectionResult zac(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final com.google.android.gms.common.ConnectionResult zad(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r3) {
            r2 = this;
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.internal.zabi> r0 = r2.zaf
            com.google.android.gms.common.api.Api$AnyClientKey r1 = r3.zab()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabi r1 = r2.zae
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r1)
            if (r0 == 0) goto L2a
            boolean r0 = r2.zaC()
            if (r0 == 0) goto L23
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 4
            android.app.PendingIntent r1 = r2.zaz()
            r3.<init>(r0, r1)
            return r3
        L23:
            com.google.android.gms.common.api.internal.zabi r0 = r2.zae
            com.google.android.gms.common.ConnectionResult r3 = r0.zad(r3)
            return r3
        L2a:
            com.google.android.gms.common.api.internal.zabi r0 = r2.zad
            com.google.android.gms.common.ConnectionResult r3 = r0.zad(r3)
            return r3
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T zae(@androidx.annotation.NonNull T r5) {
            r4 = this;
            boolean r0 = r4.zaD(r5)
            if (r0 == 0) goto L21
            boolean r0 = r4.zaC()
            if (r0 == 0) goto L1b
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 4
            r2 = 0
            android.app.PendingIntent r3 = r4.zaz()
            r0.<init>(r1, r2, r3)
            r5.setFailedResult(r0)
            return r5
        L1b:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zae
            r0.zae(r5)
            return r5
        L21:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zad
            r0.zae(r5)
            return r5
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zaf(@androidx.annotation.NonNull T r5) {
            r4 = this;
            boolean r0 = r4.zaD(r5)
            if (r0 == 0) goto L22
            boolean r0 = r4.zaC()
            if (r0 == 0) goto L1b
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 4
            r2 = 0
            android.app.PendingIntent r3 = r4.zaz()
            r0.<init>(r1, r2, r3)
            r5.setFailedResult(r0)
            return r5
        L1b:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zae
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r0.zaf(r5)
            return r5
        L22:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zad
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r0.zaf(r5)
            return r5
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zaq() {
            r1 = this;
            r0 = 2
            r1.zan = r0
            r0 = 0
            r1.zal = r0
            r0 = 0
            r1.zak = r0
            r1.zaj = r0
            com.google.android.gms.common.api.internal.zabi r0 = r1.zad
            r0.zaq()
            com.google.android.gms.common.api.internal.zabi r0 = r1.zae
            r0.zaq()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zar() {
            r1 = this;
            r0 = 0
            r1.zak = r0
            r1.zaj = r0
            r0 = 0
            r1.zan = r0
            com.google.android.gms.common.api.internal.zabi r0 = r1.zad
            r0.zar()
            com.google.android.gms.common.api.internal.zabi r0 = r1.zae
            r0.zar()
            r1.zaB()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(java.lang.String r5, @androidx.annotation.Nullable java.io.FileDescriptor r6, java.io.PrintWriter r7, @androidx.annotation.Nullable java.lang.String[] r8) {
            r4 = this;
            java.io.PrintWriter r0 = r7.append(r5)
            java.lang.String r1 = "authClient"
            java.io.PrintWriter r0 = r0.append(r1)
            java.lang.String r1 = ":"
            r0.println(r1)
            com.google.android.gms.common.api.internal.zabi r0 = r4.zae
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "  "
            java.lang.String r2 = r2.concat(r3)
            r0.zas(r2, r6, r7, r8)
            java.io.PrintWriter r0 = r7.append(r5)
            java.lang.String r2 = "anonClient"
            java.io.PrintWriter r0 = r0.append(r2)
            r0.println(r1)
            com.google.android.gms.common.api.internal.zabi r0 = r4.zad
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r5.concat(r3)
            r0.zas(r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zat() {
            r1 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r1.zad
            r0.zat()
            com.google.android.gms.common.api.internal.zabi r0 = r1.zae
            r0.zat()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            boolean r0 = r3.zax()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.common.api.internal.zabi r1 = r3.zae     // Catch: java.lang.Throwable -> L31
            r1.zar()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L31
            r2 = 4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L31
            r3.zak = r1     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L28
            com.google.android.gms.internal.base.zaq r0 = new com.google.android.gms.internal.base.zaq     // Catch: java.lang.Throwable -> L31
            android.os.Looper r1 = r3.zac     // Catch: java.lang.Throwable -> L31
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.common.api.internal.zav r1 = new com.google.android.gms.common.api.internal.zav     // Catch: java.lang.Throwable -> L31
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r0.post(r1)     // Catch: java.lang.Throwable -> L31
            goto L2b
        L28:
            r3.zaB()     // Catch: java.lang.Throwable -> L31
        L2b:
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.unlock()
            return
        L31:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zam
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.zad     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            com.google.android.gms.common.api.internal.zabi r0 = r3.zae     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            boolean r0 = r3.zaC()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.zan     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L22
        L21:
            r1 = 1
        L22:
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zam
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zam
            r0.lock()
            int r0 = r2.zan     // Catch: java.lang.Throwable -> L13
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.util.concurrent.locks.Lock r1 = r2.zam
            r1.unlock()
            return r0
        L13:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.zam
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zam
            r0.lock()
            boolean r0 = r1.zax()     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L11
            boolean r0 = r1.zaw()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L33
        L11:
            com.google.android.gms.common.api.internal.zabi r0 = r1.zae     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L33
            java.util.Set<com.google.android.gms.common.api.internal.SignInConnectionListener> r0 = r1.zag     // Catch: java.lang.Throwable -> L3a
            r0.add(r2)     // Catch: java.lang.Throwable -> L3a
            int r2 = r1.zan     // Catch: java.lang.Throwable -> L3a
            r0 = 1
            if (r2 != 0) goto L25
            r1.zan = r0     // Catch: java.lang.Throwable -> L3a
        L25:
            r2 = 0
            r1.zak = r2     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.common.api.internal.zabi r2 = r1.zae     // Catch: java.lang.Throwable -> L3a
            r2.zaq()     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.locks.Lock r2 = r1.zam
            r2.unlock()
            return r0
        L33:
            java.util.concurrent.locks.Lock r2 = r1.zam
            r2.unlock()
            r2 = 0
            return r2
        L3a:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.zam
            r0.unlock()
            throw r2
    }
}
