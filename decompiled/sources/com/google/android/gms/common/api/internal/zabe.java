package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zabe extends com.google.android.gms.common.api.GoogleApiClient implements com.google.android.gms.common.api.internal.zabz {

    @com.google.android.gms.common.util.VisibleForTesting
    public final java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?>> zaa;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.util.VisibleForTesting
    public com.google.android.gms.common.api.internal.zabx zab;
    public final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> zac;
    public java.util.Set<com.google.android.gms.common.api.Scope> zad;
    public final com.google.android.gms.common.internal.ClientSettings zae;
    public final java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> zaf;
    public final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> zag;

    @androidx.annotation.Nullable
    public java.util.Set<com.google.android.gms.common.api.internal.zada> zah;
    public final com.google.android.gms.common.api.internal.zadc zai;
    private final java.util.concurrent.locks.Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.internal.zaca zal;
    private final int zam;
    private final android.content.Context zan;
    private final android.os.Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final com.google.android.gms.common.api.internal.zabc zas;
    private final com.google.android.gms.common.GoogleApiAvailability zat;
    private final com.google.android.gms.common.api.internal.ListenerHolders zau;
    private final java.util.ArrayList<com.google.android.gms.common.api.internal.zat> zav;
    private java.lang.Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;

    public zabe(android.content.Context r7, java.util.concurrent.locks.Lock r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.GoogleApiAvailability r11, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r12, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r13, java.util.List<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> r14, java.util.List<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> r15, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> r16, int r17, int r18, java.util.ArrayList<com.google.android.gms.common.api.internal.zat> r19) {
            r6 = this;
            r0 = r6
            r1 = r9
            r2 = r17
            r6.<init>()
            r3 = 0
            r0.zal = r3
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r0.zaa = r4
            boolean r4 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            r5 = 1
            if (r5 == r4) goto L1c
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            goto L1e
        L1c:
            r4 = 10000(0x2710, double:4.9407E-320)
        L1e:
            r0.zaq = r4
            r4 = 5000(0x1388, double:2.4703E-320)
            r0.zar = r4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r0.zad = r4
            com.google.android.gms.common.api.internal.ListenerHolders r4 = new com.google.android.gms.common.api.internal.ListenerHolders
            r4.<init>()
            r0.zau = r4
            r0.zaw = r3
            r0.zah = r3
            com.google.android.gms.common.api.internal.zaay r3 = new com.google.android.gms.common.api.internal.zaay
            r3.<init>(r6)
            r0.zax = r3
            r4 = r7
            r0.zan = r4
            r4 = r8
            r0.zaj = r4
            com.google.android.gms.common.internal.zak r4 = new com.google.android.gms.common.internal.zak
            r4.<init>(r9, r3)
            r0.zak = r4
            r0.zao = r1
            com.google.android.gms.common.api.internal.zabc r3 = new com.google.android.gms.common.api.internal.zabc
            r3.<init>(r6, r9)
            r0.zas = r3
            r1 = r11
            r0.zat = r1
            r0.zam = r2
            if (r2 < 0) goto L60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0.zaw = r1
        L60:
            r1 = r13
            r0.zaf = r1
            r1 = r16
            r0.zac = r1
            r1 = r19
            r0.zav = r1
            com.google.android.gms.common.api.internal.zadc r1 = new com.google.android.gms.common.api.internal.zadc
            r1.<init>()
            r0.zai = r1
            java.util.Iterator r1 = r14.iterator()
        L76:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r2 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r2
            com.google.android.gms.common.internal.zak r3 = r0.zak
            r3.zaf(r2)
            goto L76
        L88:
            java.util.Iterator r1 = r15.iterator()
        L8c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r2 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r2
            com.google.android.gms.common.internal.zak r3 = r0.zak
            r3.zag(r2)
            goto L8c
        L9e:
            r2 = r10
            r0.zae = r2
            r1 = r12
            r0.zag = r1
            return
    }

    public static int zad(java.lang.Iterable<com.google.android.gms.common.api.Api.Client> r4, boolean r5) {
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            boolean r3 = r2.requiresSignIn()
            r0 = r0 | r3
            boolean r2 = r2.providesSignIn()
            r1 = r1 | r2
            goto L6
        L1d:
            if (r0 == 0) goto L27
            if (r1 == 0) goto L25
            if (r5 == 0) goto L25
            r4 = 2
            return r4
        L25:
            r4 = 1
            return r4
        L27:
            r4 = 3
            return r4
    }

    public static /* bridge */ /* synthetic */ android.content.Context zae(com.google.android.gms.common.api.internal.zabe r0) {
            android.content.Context r0 = r0.zan
            return r0
    }

    public static java.lang.String zag(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lc:
            java.lang.String r1 = "SIGN_IN_MODE_NONE"
            return r1
        Lf:
            java.lang.String r1 = "SIGN_IN_MODE_OPTIONAL"
            return r1
        L12:
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED"
            return r1
    }

    public static /* bridge */ /* synthetic */ void zah(com.google.android.gms.common.api.internal.zabe r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.common.api.internal.StatusPendingResult r3) {
            r0 = 1
            r1.zam(r2, r3, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void zai(com.google.android.gms.common.api.internal.zabe r1) {
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.lock()
            boolean r0 = r1.zap     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lc
            r1.zan()     // Catch: java.lang.Throwable -> L12
        Lc:
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            return
        L12:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            throw r0
    }

    public static /* bridge */ /* synthetic */ void zaj(com.google.android.gms.common.api.internal.zabe r1) {
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.lock()
            boolean r0 = r1.zak()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Le
            r1.zan()     // Catch: java.lang.Throwable -> L14
        Le:
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            return
        L14:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            throw r0
    }

    private final void zal(int r13) {
            r12 = this;
            java.lang.Integer r0 = r12.zaw
            if (r0 != 0) goto Lb
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.zaw = r13
            goto L11
        Lb:
            int r0 = r0.intValue()
            if (r0 != r13) goto L93
        L11:
            com.google.android.gms.common.api.internal.zaca r13 = r12.zal
            if (r13 == 0) goto L16
            return
        L16:
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r13 = r12.zac
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
            r1 = 0
        L22:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r13.next()
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            boolean r3 = r2.requiresSignIn()
            r0 = r0 | r3
            boolean r2 = r2.providesSignIn()
            r1 = r1 | r2
            goto L22
        L39:
            java.lang.Integer r13 = r12.zaw
            int r13 = r13.intValue()
            r2 = 1
            if (r13 == r2) goto L62
            r1 = 2
            if (r13 == r1) goto L46
            goto L66
        L46:
            if (r0 == 0) goto L66
            android.content.Context r2 = r12.zan
            java.util.concurrent.locks.Lock r4 = r12.zaj
            android.os.Looper r5 = r12.zao
            com.google.android.gms.common.GoogleApiAvailability r6 = r12.zat
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r7 = r12.zac
            com.google.android.gms.common.internal.ClientSettings r8 = r12.zae
            java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r9 = r12.zaf
            com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r10 = r12.zag
            java.util.ArrayList<com.google.android.gms.common.api.internal.zat> r11 = r12.zav
            r3 = r12
            com.google.android.gms.common.api.internal.zaaa r13 = com.google.android.gms.common.api.internal.zaaa.zag(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.zal = r13
            return
        L62:
            if (r0 == 0) goto L8b
            if (r1 != 0) goto L83
        L66:
            com.google.android.gms.common.api.internal.zabi r13 = new com.google.android.gms.common.api.internal.zabi
            android.content.Context r1 = r12.zan
            java.util.concurrent.locks.Lock r3 = r12.zaj
            android.os.Looper r4 = r12.zao
            com.google.android.gms.common.GoogleApiAvailability r5 = r12.zat
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r6 = r12.zac
            com.google.android.gms.common.internal.ClientSettings r7 = r12.zae
            java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> r8 = r12.zaf
            com.google.android.gms.common.api.Api$AbstractClientBuilder<? extends com.google.android.gms.signin.zae, com.google.android.gms.signin.SignInOptions> r9 = r12.zag
            java.util.ArrayList<com.google.android.gms.common.api.internal.zat> r10 = r12.zav
            r0 = r13
            r2 = r12
            r11 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.zal = r13
            return
        L83:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r13.<init>(r0)
            throw r13
        L8b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r13.<init>(r0)
            throw r13
        L93:
            java.lang.String r13 = zag(r13)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r1 = r12.zaw
            int r1 = r1.intValue()
            java.lang.String r1 = zag(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r13.length()
            int r3 = r3 + 51
            int r4 = r1.length()
            int r4 = r4 + r3
            r2.<init>(r4)
            java.lang.String r3 = "Cannot use sign-in mode: "
            java.lang.String r4 = ". Mode was already set to "
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3, r13, r4, r1)
            r0.<init>(r13)
            throw r0
    }

    private final void zam(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.common.api.internal.StatusPendingResult r4, boolean r5) {
            r2 = this;
            com.google.android.gms.common.internal.service.zae r0 = com.google.android.gms.common.internal.service.Common.zaa
            com.google.android.gms.common.api.PendingResult r0 = r0.zaa(r3)
            com.google.android.gms.common.api.internal.zabb r1 = new com.google.android.gms.common.api.internal.zabb
            r1.<init>(r2, r4, r5, r3)
            r0.setResultCallback(r1)
            return
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    private final void zan() {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zab()
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.api.internal.zaca r0 = (com.google.android.gms.common.api.internal.zaca) r0
            r0.zaq()
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "blockingConnect must not be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.lock()
            int r0 = r4.zam     // Catch: java.lang.Throwable -> L73
            if (r0 < 0) goto L29
            java.lang.Integer r0 = r4.zaw     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r0)     // Catch: java.lang.Throwable -> L73
            goto L45
        L29:
            java.lang.Integer r0 = r4.zaw     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L3e
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r4.zac     // Catch: java.lang.Throwable -> L73
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L73
            int r0 = zad(r0, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            r4.zaw = r0     // Catch: java.lang.Throwable -> L73
            goto L45
        L3e:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            r1 = 2
            if (r0 == r1) goto L6b
        L45:
            java.lang.Integer r0 = r4.zaw     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L73
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            r4.zal(r0)     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.common.internal.zak r0 = r4.zak     // Catch: java.lang.Throwable -> L73
            r0.zab()     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.common.api.internal.zaca r0 = r4.zal     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.common.api.internal.zaca r0 = (com.google.android.gms.common.api.internal.zaca) r0     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.common.ConnectionResult r0 = r0.zab()     // Catch: java.lang.Throwable -> L73
            java.util.concurrent.locks.Lock r1 = r4.zaj
            r1.unlock()
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r4.zaj
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long r4, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 == r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "blockingConnect must not be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.lang.String r0 = "TimeUnit must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            java.lang.Integer r0 = r3.zaw     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L32
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r3.zac     // Catch: java.lang.Throwable -> L67
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L67
            int r0 = zad(r0, r2)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L67
            r3.zaw = r0     // Catch: java.lang.Throwable -> L67
            goto L39
        L32:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L67
            r1 = 2
            if (r0 == r1) goto L5f
        L39:
            java.lang.Integer r0 = r3.zaw     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L67
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L67
            r3.zal(r0)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.internal.zak r0 = r3.zak     // Catch: java.lang.Throwable -> L67
            r0.zab()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.api.internal.zaca r0 = r3.zal     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.api.internal.zaca r0 = (com.google.android.gms.common.api.internal.zaca) r0     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.ConnectionResult r4 = r0.zac(r4, r6)     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.locks.Lock r5 = r3.zaj
            r5.unlock()
            return r4
        L5f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L67
            throw r4     // Catch: java.lang.Throwable -> L67
        L67:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = r3.zaj
            r5.unlock()
            throw r4
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
            r6 = this;
            boolean r0 = r6.isConnected()
            java.lang.String r1 = "GoogleApiClient is not connected yet."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.lang.Integer r0 = r6.zaw
            r1 = 0
            if (r0 == 0) goto L18
            int r0 = r0.intValue()
            r2 = 2
            if (r0 == r2) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            java.lang.String r2 = "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = new com.google.android.gms.common.api.internal.StatusPendingResult
            r0.<init>(r6)
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r2 = r6.zac
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.common.internal.service.zah> r3 = com.google.android.gms.common.internal.service.Common.CLIENT_KEY
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L31
            r6.zam(r6, r0, r1)
            goto L61
        L31:
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.common.api.internal.zaaz r2 = new com.google.android.gms.common.api.internal.zaaz
            r2.<init>(r6, r1, r0)
            com.google.android.gms.common.api.internal.zaba r3 = new com.google.android.gms.common.api.internal.zaba
            r3.<init>(r0)
            com.google.android.gms.common.api.GoogleApiClient$Builder r4 = new com.google.android.gms.common.api.GoogleApiClient$Builder
            android.content.Context r5 = r6.zan
            r4.<init>(r5)
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r5 = com.google.android.gms.common.internal.service.Common.API
            r4.addApi(r5)
            r4.addConnectionCallbacks(r2)
            r4.addOnConnectionFailedListener(r3)
            com.google.android.gms.common.api.internal.zabc r2 = r6.zas
            r4.setHandler(r2)
            com.google.android.gms.common.api.GoogleApiClient r2 = r4.build()
            r1.set(r2)
            r2.connect()
        L61:
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.zaj
            r0.lock()
            int r0 = r5.zam     // Catch: java.lang.Throwable -> L87
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 < 0) goto L19
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.String r4 = "Sign-in mode should have been set explicitly by auto-manage."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r4)     // Catch: java.lang.Throwable -> L87
            goto L34
        L19:
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L2e
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r5.zac     // Catch: java.lang.Throwable -> L87
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L87
            int r0 = zad(r0, r2)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L87
            r5.zaw = r0     // Catch: java.lang.Throwable -> L87
            goto L34
        L2e:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == r1) goto L7f
        L34:
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L87
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.locks.Lock r4 = r5.zaj     // Catch: java.lang.Throwable -> L87
            r4.lock()     // Catch: java.lang.Throwable -> L87
            r4 = 3
            if (r0 == r4) goto L4f
            if (r0 == r3) goto L4f
            if (r0 != r1) goto L4d
            goto L50
        L4d:
            r1 = r0
            goto L51
        L4f:
            r1 = r0
        L50:
            r2 = 1
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r3 = 33
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = "Illegal sign-in mode: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L78
            r0.append(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r0)     // Catch: java.lang.Throwable -> L78
            r5.zal(r1)     // Catch: java.lang.Throwable -> L78
            r5.zan()     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.locks.Lock r0 = r5.zaj     // Catch: java.lang.Throwable -> L87
            r0.unlock()     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.locks.Lock r0 = r5.zaj
            r0.unlock()
            return
        L78:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.zaj     // Catch: java.lang.Throwable -> L87
            r1.unlock()     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.zaj
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int r4) {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            r0 = 2
            r1 = 1
            r2 = 3
            if (r4 == r2) goto L11
            if (r4 == r1) goto L11
            if (r4 != r0) goto L10
            r4 = 2
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r2 = 33
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "Illegal sign-in mode: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L33
            r0.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)     // Catch: java.lang.Throwable -> L33
            r3.zal(r4)     // Catch: java.lang.Throwable -> L33
            r3.zan()     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.locks.Lock r4 = r3.zaj
            r4.unlock()
            return
        L33:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            throw r4
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.zadc r0 = r3.zai     // Catch: java.lang.Throwable -> L4a
            r0.zab()     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.common.api.internal.zaca r0 = r3.zal     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L11
            r0.zar()     // Catch: java.lang.Throwable -> L4a
        L11:
            com.google.android.gms.common.api.internal.ListenerHolders r0 = r3.zau     // Catch: java.lang.Throwable -> L4a
            r0.zab()     // Catch: java.lang.Throwable -> L4a
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r3.zaa     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4a
        L1c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r1     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            r1.zan(r2)     // Catch: java.lang.Throwable -> L4a
            r1.cancel()     // Catch: java.lang.Throwable -> L4a
            goto L1c
        L30:
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r3.zaa     // Catch: java.lang.Throwable -> L4a
            r0.clear()     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.common.api.internal.zaca r0 = r3.zal     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L3c
            java.util.concurrent.locks.Lock r0 = r3.zaj
            goto L46
        L3c:
            r3.zak()     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.common.internal.zak r0 = r3.zak     // Catch: java.lang.Throwable -> L4a
            r0.zaa()     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.locks.Lock r0 = r3.zaj
        L46:
            r0.unlock()
            return
        L4a:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zaj
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(java.lang.String r3, @androidx.annotation.Nullable java.io.FileDescriptor r4, java.io.PrintWriter r5, @androidx.annotation.Nullable java.lang.String[] r6) {
            r2 = this;
            java.io.PrintWriter r0 = r5.append(r3)
            java.lang.String r1 = "mContext="
            java.io.PrintWriter r0 = r0.append(r1)
            android.content.Context r1 = r2.zan
            r0.println(r1)
            java.io.PrintWriter r0 = r5.append(r3)
            java.lang.String r1 = "mResuming="
            java.io.PrintWriter r0 = r0.append(r1)
            boolean r1 = r2.zap
            r0.print(r1)
            java.lang.String r0 = " mWorkQueue.size()="
            java.io.PrintWriter r0 = r5.append(r0)
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r1 = r2.zaa
            int r1 = r1.size()
            r0.print(r1)
            com.google.android.gms.common.api.internal.zadc r0 = r2.zai
            java.lang.String r1 = " mUnconsumedApiCalls.size()="
            java.io.PrintWriter r1 = r5.append(r1)
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r0 = r0.zab
            int r0 = r0.size()
            r1.println(r0)
            com.google.android.gms.common.api.internal.zaca r0 = r2.zal
            if (r0 == 0) goto L45
            r0.zas(r3, r4, r5, r6)
        L45:
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@androidx.annotation.NonNull T r5) {
            r4 = this;
            com.google.android.gms.common.api.Api r0 = r5.getApi()
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r1 = r4.zac
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r5.getClientKey()
            boolean r1 = r1.containsKey(r2)
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.zad()
            goto L18
        L15:
            java.lang.String r0 = "the API"
        L18:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 65
            r3.<init>(r2)
            java.lang.String r2 = "GoogleApiClient is not configured to use "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " required for this call."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.zaca r0 = r4.zal     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L4c
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r4.zaa     // Catch: java.lang.Throwable -> L56
            r0.add(r5)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.locks.Lock r0 = r4.zaj
            goto L52
        L4c:
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r0.zae(r5)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.locks.Lock r0 = r4.zaj
        L52:
            r0.unlock()
            return r5
        L56:
            r5 = move-exception
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.unlock()
            throw r5
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(@androidx.annotation.NonNull T r5) {
            r4 = this;
            com.google.android.gms.common.api.Api r0 = r5.getApi()
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r1 = r4.zac
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r5.getClientKey()
            boolean r1 = r1.containsKey(r2)
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.zad()
            goto L18
        L15:
            java.lang.String r0 = "the API"
        L18:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 65
            r3.<init>(r2)
            java.lang.String r2 = "GoogleApiClient is not configured to use "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " required for this call."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.zaca r0 = r4.zal     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L75
            boolean r1 = r4.zap     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6b
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r4.zaa     // Catch: java.lang.Throwable -> L7d
            r0.add(r5)     // Catch: java.lang.Throwable -> L7d
        L4d:
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r4.zaa     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L68
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r4.zaa     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r0     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.common.api.internal.zadc r1 = r4.zai     // Catch: java.lang.Throwable -> L7d
            r1.zaa(r0)     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR     // Catch: java.lang.Throwable -> L7d
            r0.setFailedResult(r1)     // Catch: java.lang.Throwable -> L7d
            goto L4d
        L68:
            java.util.concurrent.locks.Lock r0 = r4.zaj
            goto L71
        L6b:
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r0.zaf(r5)     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.locks.Lock r0 = r4.zaj
        L71:
            r0.unlock()
            return r5
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = "GoogleApiClient is not connected yet."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L7d
            throw r5     // Catch: java.lang.Throwable -> L7d
        L7d:
            r5 = move-exception
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.unlock()
            throw r5
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @androidx.annotation.NonNull
    public final <C extends com.google.android.gms.common.api.Api.Client> C getClient(@androidx.annotation.NonNull com.google.android.gms.common.api.Api.AnyClientKey<C> r2) {
            r1 = this;
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r1.zac
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            java.lang.String r0 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @androidx.annotation.NonNull
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r4) {
            r3 = this;
            java.lang.String r0 = "GoogleApiClientImpl"
            java.util.concurrent.locks.Lock r1 = r3.zaj
            r1.lock()
            boolean r1 = r3.isConnected()     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L1a
            boolean r1 = r3.zap     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "Cannot invoke getConnectionResult unless GoogleApiClient is connected"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L82
            throw r4     // Catch: java.lang.Throwable -> L82
        L1a:
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r1 = r3.zac     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r4.zab()     // Catch: java.lang.Throwable -> L82
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L6e
            com.google.android.gms.common.api.internal.zaca r1 = r3.zal     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.api.internal.zaca r1 = (com.google.android.gms.common.api.internal.zaca) r1     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.ConnectionResult r1 = r1.zad(r4)     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L68
            boolean r1 = r3.zap     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L40
            com.google.android.gms.common.ConnectionResult r4 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.locks.Lock r0 = r3.zaj
        L3c:
            r0.unlock()
            return r4
        L40:
            java.lang.String r1 = r3.zaf()     // Catch: java.lang.Throwable -> L82
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r4.zad()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = " requested in getConnectionResult is not connected but is not present in the failed  connections map"
            java.lang.String r4 = r4.concat(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            android.util.Log.wtf(r0, r4, r1)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L82
            r0 = 8
            r1 = 0
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.locks.Lock r0 = r3.zaj
            goto L3c
        L68:
            java.util.concurrent.locks.Lock r4 = r3.zaj
            r4.unlock()
            return r1
        L6e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r4.zad()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = " was never registered with GoogleApiClient"
            java.lang.String r4 = r4.concat(r1)     // Catch: java.lang.Throwable -> L82
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            throw r4
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zan
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.zao
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r2) {
            r1 = this;
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r1.zac
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r2.zab()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r3) {
            r2 = this;
            boolean r0 = r2.isConnected()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r2.zac
            com.google.android.gms.common.api.Api$AnyClientKey r3 = r3.zab()
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            if (r3 == 0) goto L1e
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            return r1
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto Lc
            boolean r0 = r0.zaw()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto Lc
            boolean r0 = r0.zax()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            boolean r2 = r0.zaj(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            boolean r2 = r0.zak(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto Lc
            boolean r2 = r0.zay(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto L7
            r0.zau()
        L7:
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
            r0 = this;
            r0.disconnect()
            r0.connect()
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zaf(r2)
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zag(r2)
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(@androidx.annotation.NonNull L r4) {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.ListenerHolders r0 = r3.zau     // Catch: java.lang.Throwable -> L15
            android.os.Looper r1 = r3.zao     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "NO_TYPE"
            com.google.android.gms.common.api.internal.ListenerHolder r4 = r0.zaa(r4, r1, r2)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            return r4
        L15:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            throw r4
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
            r0.<init>(r2)
            int r2 = r1.zam
            if (r2 < 0) goto L13
            com.google.android.gms.common.api.internal.zak r2 = com.google.android.gms.common.api.internal.zak.zaa(r0)
            int r0 = r1.zam
            r2.zae(r0)
            return
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Called stopAutoManage but automatic lifecycle management is not enabled."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zah(r2)
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zai(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zaa(com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = r3.zat
            android.content.Context r1 = r3.zan
            int r2 = r4.getErrorCode()
            boolean r0 = r0.isPlayServicesPossiblyUpdating(r1, r2)
            if (r0 != 0) goto L11
            r3.zak()
        L11:
            boolean r0 = r3.zap
            if (r0 != 0) goto L1f
            com.google.android.gms.common.internal.zak r0 = r3.zak
            r0.zac(r4)
            com.google.android.gms.common.internal.zak r4 = r3.zak
            r4.zaa()
        L1f:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zab(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
        L0:
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r1.zaa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>> r0 = r1.zaa
            java.lang.Object r0 = r0.remove()
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r0
            r1.execute(r0)
            goto L0
        L14:
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zad(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @javax.annotation.concurrent.GuardedBy("mLock")
    public final void zac(int r6, boolean r7) {
            r5 = this;
            r0 = 2
            r1 = 1
            if (r6 != r1) goto L41
            if (r7 != 0) goto L40
            boolean r6 = r5.zap
            if (r6 == 0) goto Lb
            goto L40
        Lb:
            r5.zap = r1
            com.google.android.gms.common.api.internal.zabx r6 = r5.zab
            if (r6 != 0) goto L2a
            boolean r6 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r6 != 0) goto L2a
            com.google.android.gms.common.GoogleApiAvailability r6 = r5.zat     // Catch: java.lang.SecurityException -> L2a
            android.content.Context r7 = r5.zan     // Catch: java.lang.SecurityException -> L2a
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.SecurityException -> L2a
            com.google.android.gms.common.api.internal.zabd r2 = new com.google.android.gms.common.api.internal.zabd     // Catch: java.lang.SecurityException -> L2a
            r2.<init>(r5)     // Catch: java.lang.SecurityException -> L2a
            com.google.android.gms.common.api.internal.zabx r6 = r6.zac(r7, r2)     // Catch: java.lang.SecurityException -> L2a
            r5.zab = r6     // Catch: java.lang.SecurityException -> L2a
        L2a:
            com.google.android.gms.common.api.internal.zabc r6 = r5.zas
            android.os.Message r7 = r6.obtainMessage(r1)
            long r2 = r5.zaq
            r6.sendMessageDelayed(r7, r2)
            com.google.android.gms.common.api.internal.zabc r6 = r5.zas
            android.os.Message r7 = r6.obtainMessage(r0)
            long r2 = r5.zar
            r6.sendMessageDelayed(r7, r2)
        L40:
            r6 = 1
        L41:
            com.google.android.gms.common.api.internal.zadc r7 = r5.zai
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r7 = r7.zab
            r1 = 0
            com.google.android.gms.common.api.internal.BasePendingResult[] r2 = new com.google.android.gms.common.api.internal.BasePendingResult[r1]
            java.lang.Object[] r7 = r7.toArray(r2)
            com.google.android.gms.common.api.internal.BasePendingResult[] r7 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r7
            int r2 = r7.length
        L4f:
            if (r1 >= r2) goto L5b
            r3 = r7[r1]
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.internal.zadc.zaa
            r3.forceFailureUnlessReady(r4)
            int r1 = r1 + 1
            goto L4f
        L5b:
            com.google.android.gms.common.internal.zak r7 = r5.zak
            r7.zae(r6)
            com.google.android.gms.common.internal.zak r7 = r5.zak
            r7.zaa()
            if (r6 != r0) goto L6a
            r5.zan()
        L6a:
            return
    }

    public final java.lang.String zaf() {
            r4 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.String r2 = ""
            r3 = 0
            r4.dump(r2, r3, r1, r3)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    public final boolean zak() {
            r2 = this;
            boolean r0 = r2.zap
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2.zap = r1
            com.google.android.gms.common.api.internal.zabc r0 = r2.zas
            r1 = 2
            r0.removeMessages(r1)
            com.google.android.gms.common.api.internal.zabc r0 = r2.zas
            r1 = 1
            r0.removeMessages(r1)
            com.google.android.gms.common.api.internal.zabx r0 = r2.zab
            if (r0 == 0) goto L1e
            r0.zab()
            r0 = 0
            r2.zab = r0
        L1e:
            return r1
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(com.google.android.gms.common.api.internal.zada r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.zada> r0 = r1.zah     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L10
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            r1.zah = r0     // Catch: java.lang.Throwable -> L1b
        L10:
            java.util.Set<com.google.android.gms.common.api.internal.zada> r0 = r1.zah     // Catch: java.lang.Throwable -> L1b
            r0.add(r2)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.Lock r2 = r1.zaj
            r2.unlock()
            return
        L1b:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(com.google.android.gms.common.api.internal.zada r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.zada> r0 = r2.zah     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L16
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L16:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L27
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L27:
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.lock()     // Catch: java.lang.Throwable -> L57
            java.util.Set<com.google.android.gms.common.api.internal.zada> r3 = r2.zah     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L36
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.unlock()     // Catch: java.lang.Throwable -> L57
            goto L43
        L36:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L4a
        L43:
            com.google.android.gms.common.api.internal.zaca r3 = r2.zal     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4a
            r3.zat()     // Catch: java.lang.Throwable -> L57
        L4a:
            java.util.concurrent.locks.Lock r3 = r2.zaj
            r3.unlock()
            return
        L50:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.unlock()
            throw r3
    }
}
