package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
public class GoogleApiManager implements android.os.Handler.Callback {

    @androidx.annotation.NonNull
    public static final com.google.android.gms.common.api.Status zaa = null;
    private static final com.google.android.gms.common.api.Status zab = null;
    private static final java.lang.Object zac = null;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("lock")
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private long zae;
    private long zaf;
    private long zag;
    private boolean zah;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.TelemetryData zai;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.TelemetryLoggingClient zaj;
    private final android.content.Context zak;
    private final com.google.android.gms.common.GoogleApiAvailability zal;
    private final com.google.android.gms.common.internal.zal zam;
    private final java.util.concurrent.atomic.AtomicInteger zan;
    private final java.util.concurrent.atomic.AtomicInteger zao;
    private final java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> zap;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("lock")
    private com.google.android.gms.common.api.internal.zaae zaq;

    @javax.annotation.concurrent.GuardedBy("lock")
    private final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zar;
    private final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zas;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.os.Handler zat;
    private volatile boolean zau;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 4
            java.lang.String r2 = "Sign-out occurred while this API call was in progress."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zaa = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "The user must be signed in to make this API call."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zab = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.api.internal.GoogleApiManager.zac = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    private GoogleApiManager(android.content.Context r6, android.os.Looper r7, com.google.android.gms.common.GoogleApiAvailability r8) {
            r5 = this;
            r5.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.zae = r0
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r5.zaf = r0
            r0 = 10000(0x2710, double:4.9407E-320)
            r5.zag = r0
            r0 = 0
            r5.zah = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            r1.<init>(r2)
            r5.zan = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r5.zao = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r3 = 5
            r4 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r3, r4, r2)
            r5.zap = r1
            r1 = 0
            r5.zaq = r1
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            r5.zar = r1
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            r5.zas = r1
            r5.zau = r2
            r5.zak = r6
            com.google.android.gms.internal.base.zaq r1 = new com.google.android.gms.internal.base.zaq
            r1.<init>(r7, r5)
            r5.zat = r1
            r5.zal = r8
            com.google.android.gms.common.internal.zal r7 = new com.google.android.gms.common.internal.zal
            r7.<init>(r8)
            r5.zam = r7
            boolean r6 = com.google.android.gms.common.util.DeviceProperties.isAuto(r6)
            if (r6 == 0) goto L59
            r5.zau = r0
        L59:
            r6 = 6
            android.os.Message r6 = r1.obtainMessage(r6)
            r1.sendMessage(r6)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void reportSignOut() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicInteger r2 = r1.zao     // Catch: java.lang.Throwable -> L19
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> L19
            android.os.Handler r1 = r1.zat     // Catch: java.lang.Throwable -> L19
            r2 = 10
            android.os.Message r2 = r1.obtainMessage(r2)     // Catch: java.lang.Throwable -> L19
            r1.sendMessageAtFrontOfQueue(r2)     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    public static /* bridge */ /* synthetic */ boolean zaE(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            boolean r0 = r0.zau
            return r0
    }

    private static com.google.android.gms.common.api.Status zaH(com.google.android.gms.common.api.internal.ApiKey<?> r5, com.google.android.gms.common.ConnectionResult r6) {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r5 = r5.zab()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r2 = r2.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 63
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "API: "
            java.lang.String r3 = " is not available on this device. Connection failed with: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2, r5, r3, r1)
            r0.<init>(r6, r5)
            return r0
    }

    @androidx.annotation.WorkerThread
    private final com.google.android.gms.common.api.internal.zabq<?> zaI(com.google.android.gms.common.api.GoogleApi<?> r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.ApiKey r0 = r3.getApiKey()
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r1 = r2.zap
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.common.api.internal.zabq r1 = (com.google.android.gms.common.api.internal.zabq) r1
            if (r1 != 0) goto L18
            com.google.android.gms.common.api.internal.zabq r1 = new com.google.android.gms.common.api.internal.zabq
            r1.<init>(r2, r3)
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r3 = r2.zap
            r3.put(r0, r1)
        L18:
            boolean r3 = r1.zaz()
            if (r3 == 0) goto L23
            java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> r3 = r2.zas
            r3.add(r0)
        L23:
            r1.zao()
            return r1
    }

    @androidx.annotation.WorkerThread
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaJ() {
            r1 = this;
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zaj
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.zak
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = com.google.android.gms.common.internal.TelemetryLogging.getClient(r0)
            r1.zaj = r0
        Lc:
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zaj
            return r0
    }

    @androidx.annotation.WorkerThread
    private final void zaK() {
            r2 = this;
            com.google.android.gms.common.internal.TelemetryData r0 = r2.zai
            if (r0 == 0) goto L1a
            int r1 = r0.zaa()
            if (r1 > 0) goto L10
            boolean r1 = r2.zaF()
            if (r1 == 0) goto L17
        L10:
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = r2.zaJ()
            r1.log(r0)
        L17:
            r0 = 0
            r2.zai = r0
        L1a:
            return
    }

    private final <T> void zaL(com.google.android.gms.tasks.TaskCompletionSource<T> r2, int r3, com.google.android.gms.common.api.GoogleApi r4) {
            r1 = this;
            if (r3 == 0) goto L1d
            com.google.android.gms.common.api.internal.ApiKey r4 = r4.getApiKey()
            com.google.android.gms.common.api.internal.zacd r3 = com.google.android.gms.common.api.internal.zacd.zaa(r1, r3, r4)
            if (r3 == 0) goto L1d
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            android.os.Handler r4 = r1.zat
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.common.api.internal.zabk r0 = new com.google.android.gms.common.api.internal.zabk
            r0.<init>(r4)
            r2.addOnCompleteListener(r0, r3)
        L1d:
            return
    }

    public static /* bridge */ /* synthetic */ long zab(com.google.android.gms.common.api.internal.GoogleApiManager r2) {
            long r0 = r2.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ long zac(com.google.android.gms.common.api.internal.GoogleApiManager r2) {
            long r0 = r2.zaf
            return r0
    }

    public static /* bridge */ /* synthetic */ long zad(com.google.android.gms.common.api.internal.GoogleApiManager r2) {
            long r0 = r2.zag
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Context zae(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.content.Context r0 = r0.zak
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler zaf(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.os.Handler r0 = r0.zat
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zag(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.GoogleApiAvailability r0 = r0.zal
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zah() {
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zai(com.google.android.gms.common.api.internal.ApiKey r0, com.google.android.gms.common.ConnectionResult r1) {
            com.google.android.gms.common.api.Status r0 = zaH(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zaae zaj(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.api.internal.zaae r0 = r0.zaq
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.api.internal.GoogleApiManager zal() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Must guarantee manager is non-null before using getInstance"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.api.internal.GoogleApiManager zam(@androidx.annotation.NonNull android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1e
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L22
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = new com.google.android.gms.common.api.internal.GoogleApiManager     // Catch: java.lang.Throwable -> L22
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L22
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.api.internal.GoogleApiManager.zad = r2     // Catch: java.lang.Throwable -> L22
        L1e:
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r4
        L22:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zal zan(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.internal.zal r0 = r0.zam
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zas() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zat(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r0.zap
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Set zau(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> r0 = r0.zar
            return r0
    }

    public static /* bridge */ /* synthetic */ void zav(com.google.android.gms.common.api.internal.GoogleApiManager r1) {
            r0 = 1
            r1.zah = r0
            return
    }

    @Override // android.os.Handler.Callback
    @androidx.annotation.WorkerThread
    public final boolean handleMessage(@androidx.annotation.NonNull android.os.Message r10) {
            r9 = this;
            int r0 = r10.what
            r1 = 13
            r2 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "GoogleApiManager"
            r5 = 17
            r6 = 0
            r7 = 0
            r8 = 1
            switch(r0) {
                case 1: goto L302;
                case 2: goto L2b2;
                case 3: goto L295;
                case 4: goto L258;
                case 5: goto L1c6;
                case 6: goto L197;
                case 7: goto L18e;
                case 8: goto L258;
                case 9: goto L175;
                case 10: goto L14e;
                case 11: goto L135;
                case 12: goto L11c;
                case 13: goto L258;
                case 14: goto Le8;
                case 15: goto Lc7;
                case 16: goto La6;
                case 17: goto La1;
                case 18: goto L2c;
                case 19: goto L28;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r1 = 31
            r10.<init>(r1)
            java.lang.String r1 = "Unknown message id: "
            r10.append(r1)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r4, r10)
            return r7
        L28:
            r9.zah = r7
            goto L33a
        L2c:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zace r10 = (com.google.android.gms.common.api.internal.zace) r10
            long r0 = r10.zac
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L52
            com.google.android.gms.common.internal.TelemetryData r0 = new com.google.android.gms.common.internal.TelemetryData
            int r1 = r10.zab
            com.google.android.gms.common.internal.MethodInvocation[] r2 = new com.google.android.gms.common.internal.MethodInvocation[r8]
            com.google.android.gms.common.internal.MethodInvocation r10 = r10.zaa
            r2[r7] = r10
            java.util.List r10 = java.util.Arrays.asList(r2)
            r0.<init>(r1, r10)
            com.google.android.gms.common.internal.TelemetryLoggingClient r10 = r9.zaJ()
            r10.log(r0)
            goto L33a
        L52:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zai
            if (r0 == 0) goto L7d
            java.util.List r1 = r0.zab()
            int r0 = r0.zaa()
            int r2 = r10.zab
            if (r0 != r2) goto L75
            if (r1 == 0) goto L6d
            int r0 = r1.size()
            int r1 = r10.zad
            if (r0 < r1) goto L6d
            goto L75
        L6d:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zai
            com.google.android.gms.common.internal.MethodInvocation r1 = r10.zaa
            r0.zac(r1)
            goto L7d
        L75:
            android.os.Handler r0 = r9.zat
            r0.removeMessages(r5)
            r9.zaK()
        L7d:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zai
            if (r0 != 0) goto L33a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.internal.MethodInvocation r1 = r10.zaa
            r0.add(r1)
            com.google.android.gms.common.internal.TelemetryData r1 = new com.google.android.gms.common.internal.TelemetryData
            int r2 = r10.zab
            r1.<init>(r2, r0)
            r9.zai = r1
            android.os.Handler r0 = r9.zat
            android.os.Message r1 = r0.obtainMessage(r5)
            long r2 = r10.zac
            r0.sendMessageDelayed(r1, r2)
            goto L33a
        La1:
            r9.zaK()
            goto L33a
        La6:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zabs r10 = (com.google.android.gms.common.api.internal.zabs) r10
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L33a
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            com.google.android.gms.common.api.internal.zabq.zam(r0, r10)
            goto L33a
        Lc7:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zabs r10 = (com.google.android.gms.common.api.internal.zabs) r10
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L33a
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            com.google.android.gms.common.api.internal.zabq.zal(r0, r10)
            goto L33a
        Le8:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zaaf r10 = (com.google.android.gms.common.api.internal.zaaf) r10
            com.google.android.gms.common.api.internal.ApiKey r0 = r10.zaa()
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r1 = r9.zap
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L103
            com.google.android.gms.tasks.TaskCompletionSource r10 = r10.zab()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.setResult(r0)
            goto L33a
        L103:
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r1 = r9.zap
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            boolean r0 = com.google.android.gms.common.api.internal.zabq.zax(r0)
            com.google.android.gms.tasks.TaskCompletionSource r10 = r10.zab()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.setResult(r0)
            goto L33a
        L11c:
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L33a
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            java.lang.Object r10 = r10.obj
            java.lang.Object r10 = r0.get(r10)
            com.google.android.gms.common.api.internal.zabq r10 = (com.google.android.gms.common.api.internal.zabq) r10
            r10.zaA()
            goto L33a
        L135:
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L33a
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            java.lang.Object r10 = r10.obj
            java.lang.Object r10 = r0.get(r10)
            com.google.android.gms.common.api.internal.zabq r10 = (com.google.android.gms.common.api.internal.zabq) r10
            r10.zaw()
            goto L33a
        L14e:
            java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> r10 = r9.zas
            java.util.Iterator r10 = r10.iterator()
        L154:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L16e
            java.lang.Object r0 = r10.next()
            com.google.android.gms.common.api.internal.ApiKey r0 = (com.google.android.gms.common.api.internal.ApiKey) r0
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r1 = r9.zap
            java.lang.Object r0 = r1.remove(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 == 0) goto L154
            r0.zav()
            goto L154
        L16e:
            java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> r10 = r9.zas
            r10.clear()
            goto L33a
        L175:
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L33a
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            java.lang.Object r10 = r10.obj
            java.lang.Object r10 = r0.get(r10)
            com.google.android.gms.common.api.internal.zabq r10 = (com.google.android.gms.common.api.internal.zabq) r10
            r10.zau()
            goto L33a
        L18e:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.GoogleApi r10 = (com.google.android.gms.common.api.GoogleApi) r10
            r9.zaI(r10)
            goto L33a
        L197:
            android.content.Context r10 = r9.zak
            android.content.Context r10 = r10.getApplicationContext()
            boolean r10 = r10 instanceof android.app.Application
            if (r10 == 0) goto L33a
            android.content.Context r10 = r9.zak
            android.content.Context r10 = r10.getApplicationContext()
            android.app.Application r10 = (android.app.Application) r10
            com.google.android.gms.common.api.internal.BackgroundDetector.initialize(r10)
            com.google.android.gms.common.api.internal.BackgroundDetector r10 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            com.google.android.gms.common.api.internal.zabl r0 = new com.google.android.gms.common.api.internal.zabl
            r0.<init>(r9)
            r10.addListener(r0)
            com.google.android.gms.common.api.internal.BackgroundDetector r10 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            boolean r10 = r10.readCurrentStateIfPossible(r8)
            if (r10 != 0) goto L33a
            r9.zag = r2
            goto L33a
        L1c6:
            int r0 = r10.arg1
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.ConnectionResult r10 = (com.google.android.gms.common.ConnectionResult) r10
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r2 = r9.zap
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L1d6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1e9
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            int r7 = r3.zab()
            if (r7 != r0) goto L1d6
            r6 = r3
        L1e9:
            if (r6 == 0) goto L236
            int r0 = r10.getErrorCode()
            if (r0 != r1) goto L229
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            com.google.android.gms.common.GoogleApiAvailability r1 = r9.zal
            int r2 = r10.getErrorCode()
            java.lang.String r1 = r1.getErrorString(r2)
            java.lang.String r10 = r10.getErrorMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r10)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 69
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Error resolution was canceled by the user, original error message: "
            java.lang.String r3 = ": "
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2, r1, r3, r10)
            r0.<init>(r5, r10)
            com.google.android.gms.common.api.internal.zabq.zai(r6, r0)
            goto L33a
        L229:
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabq.zag(r6)
            com.google.android.gms.common.api.Status r10 = zaH(r0, r10)
            com.google.android.gms.common.api.internal.zabq.zai(r6, r10)
            goto L33a
        L236:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r1 = 76
            r10.<init>(r1)
            java.lang.String r1 = "Could not find API instance "
            r10.append(r1)
            r10.append(r0)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r10.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r10 = r10.toString()
            android.util.Log.wtf(r4, r10, r0)
            goto L33a
        L258:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zach r10 = (com.google.android.gms.common.api.internal.zach) r10
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r9.zap
            com.google.android.gms.common.api.GoogleApi<?> r1 = r10.zac
            com.google.android.gms.common.api.internal.ApiKey r1 = r1.getApiKey()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L272
            com.google.android.gms.common.api.GoogleApi<?> r0 = r10.zac
            com.google.android.gms.common.api.internal.zabq r0 = r9.zaI(r0)
        L272:
            boolean r1 = r0.zaz()
            if (r1 == 0) goto L28e
            java.util.concurrent.atomic.AtomicInteger r1 = r9.zao
            int r1 = r1.get()
            int r2 = r10.zab
            if (r1 == r2) goto L28e
            com.google.android.gms.common.api.internal.zai r10 = r10.zaa
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaa
            r10.zad(r1)
            r0.zav()
            goto L33a
        L28e:
            com.google.android.gms.common.api.internal.zai r10 = r10.zaa
            r0.zap(r10)
            goto L33a
        L295:
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r10 = r9.zap
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        L29f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L33a
            java.lang.Object r0 = r10.next()
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            r0.zan()
            r0.zao()
            goto L29f
        L2b2:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zal r10 = (com.google.android.gms.common.api.internal.zal) r10
            java.util.Set r0 = r10.zab()
            java.util.Iterator r0 = r0.iterator()
        L2be:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33a
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.internal.ApiKey r2 = (com.google.android.gms.common.api.internal.ApiKey) r2
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r3 = r9.zap
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            if (r3 != 0) goto L2dd
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r1)
            r10.zac(r2, r0, r6)
            goto L33a
        L2dd:
            boolean r4 = r3.zay()
            if (r4 == 0) goto L2f1
            com.google.android.gms.common.ConnectionResult r4 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            com.google.android.gms.common.api.Api$Client r3 = r3.zaf()
            java.lang.String r3 = r3.getEndpointPackageName()
            r10.zac(r2, r4, r3)
            goto L2be
        L2f1:
            com.google.android.gms.common.ConnectionResult r4 = r3.zad()
            if (r4 == 0) goto L2fb
            r10.zac(r2, r4, r6)
            goto L2be
        L2fb:
            r3.zat(r10)
            r3.zao()
            goto L2be
        L302:
            java.lang.Object r10 = r10.obj
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r8 == r10) goto L30d
            goto L30f
        L30d:
            r2 = 10000(0x2710, double:4.9407E-320)
        L30f:
            r9.zag = r2
            android.os.Handler r10 = r9.zat
            r0 = 12
            r10.removeMessages(r0)
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r10 = r9.zap
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L322:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L33a
            java.lang.Object r1 = r10.next()
            com.google.android.gms.common.api.internal.ApiKey r1 = (com.google.android.gms.common.api.internal.ApiKey) r1
            android.os.Handler r2 = r9.zat
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            long r3 = r9.zag
            r2.sendMessageDelayed(r1, r3)
            goto L322
        L33a:
            return r8
    }

    public final void zaA() {
            r2 = this;
            android.os.Handler r0 = r2.zat
            r1 = 3
            android.os.Message r1 = r0.obtainMessage(r1)
            r0.sendMessage(r1)
            return
    }

    public final void zaB(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<?> r3) {
            r2 = this;
            android.os.Handler r0 = r2.zat
            r1 = 7
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    public final void zaC(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zaq     // Catch: java.lang.Throwable -> L19
            if (r1 == r3) goto Le
            r2.zaq = r3     // Catch: java.lang.Throwable -> L19
            java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> r1 = r2.zar     // Catch: java.lang.Throwable -> L19
            r1.clear()     // Catch: java.lang.Throwable -> L19
        Le:
            java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> r1 = r2.zar     // Catch: java.lang.Throwable -> L19
            androidx.collection.ArraySet r3 = r3.zaa()     // Catch: java.lang.Throwable -> L19
            r1.addAll(r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public final void zaD(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zaq     // Catch: java.lang.Throwable -> L11
            if (r1 != r3) goto Lf
            r3 = 0
            r2.zaq = r3     // Catch: java.lang.Throwable -> L11
            java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> r3 = r2.zar     // Catch: java.lang.Throwable -> L11
            r3.clear()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @androidx.annotation.WorkerThread
    public final boolean zaF() {
            r4 = this;
            boolean r0 = r4.zah
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L18
            boolean r0 = r0.getMethodInvocationTelemetryEnabled()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            com.google.android.gms.common.internal.zal r0 = r4.zam
            android.content.Context r2 = r4.zak
            r3 = 203400000(0xc1fa340, float:1.2298041E-31)
            int r0 = r0.zaa(r2, r3)
            r2 = -1
            if (r0 == r2) goto L2a
            if (r0 != 0) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            r0 = 1
            return r0
    }

    public final boolean zaG(com.google.android.gms.common.ConnectionResult r3, int r4) {
            r2 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = r2.zal
            android.content.Context r1 = r2.zak
            boolean r3 = r0.zah(r1, r3, r4)
            return r3
    }

    public final int zaa() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zan
            int r0 = r0.getAndIncrement()
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.gms.common.api.internal.zabq zak(com.google.android.gms.common.api.internal.ApiKey<?> r2) {
            r1 = this;
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>> r0 = r1.zap
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.internal.zabq r2 = (com.google.android.gms.common.api.internal.zabq) r2
            return r2
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zao(@androidx.annotation.NonNull java.lang.Iterable<? extends com.google.android.gms.common.api.HasApiKey<?>> r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zal r0 = new com.google.android.gms.common.api.internal.zal
            r0.<init>(r3)
            android.os.Handler r3 = r2.zat
            r1 = 2
            android.os.Message r1 = r3.obtainMessage(r1, r0)
            r3.sendMessage(r1)
            com.google.android.gms.tasks.Task r3 = r0.zaa()
            return r3
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> zap(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<?> r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaf r0 = new com.google.android.gms.common.api.internal.zaaf
            com.google.android.gms.common.api.internal.ApiKey r3 = r3.getApiKey()
            r0.<init>(r3)
            android.os.Handler r3 = r2.zat
            r1 = 14
            android.os.Message r1 = r3.obtainMessage(r1, r0)
            r3.sendMessage(r1)
            com.google.android.gms.tasks.TaskCompletionSource r3 = r0.zab()
            com.google.android.gms.tasks.Task r3 = r3.getTask()
            return r3
    }

    @androidx.annotation.NonNull
    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.tasks.Task<java.lang.Void> zaq(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<O> r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> r5, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> r6, @androidx.annotation.NonNull java.lang.Runnable r7) {
            r3 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            int r1 = r5.zaa()
            r3.zaL(r0, r1, r4)
            com.google.android.gms.common.api.internal.zaf r1 = new com.google.android.gms.common.api.internal.zaf
            com.google.android.gms.common.api.internal.zaci r2 = new com.google.android.gms.common.api.internal.zaci
            r2.<init>(r5, r6, r7)
            r1.<init>(r2, r0)
            android.os.Handler r5 = r3.zat
            com.google.android.gms.common.api.internal.zach r6 = new com.google.android.gms.common.api.internal.zach
            java.util.concurrent.atomic.AtomicInteger r7 = r3.zao
            int r7 = r7.get()
            r6.<init>(r1, r7, r4)
            r4 = 8
            android.os.Message r4 = r5.obtainMessage(r4, r6)
            r5.sendMessage(r4)
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            return r4
    }

    @androidx.annotation.NonNull
    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.tasks.Task<java.lang.Boolean> zar(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<O> r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r5, int r6) {
            r3 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r3.zaL(r0, r6, r4)
            com.google.android.gms.common.api.internal.zah r6 = new com.google.android.gms.common.api.internal.zah
            r6.<init>(r5, r0)
            android.os.Handler r5 = r3.zat
            com.google.android.gms.common.api.internal.zach r1 = new com.google.android.gms.common.api.internal.zach
            java.util.concurrent.atomic.AtomicInteger r2 = r3.zao
            int r2 = r2.get()
            r1.<init>(r6, r2, r4)
            r4 = 13
            android.os.Message r4 = r5.obtainMessage(r4, r1)
            r5.sendMessage(r4)
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            return r4
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> void zaw(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<O> r3, int r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api.AnyClient> r5) {
            r2 = this;
            com.google.android.gms.common.api.internal.zae r0 = new com.google.android.gms.common.api.internal.zae
            r0.<init>(r4, r5)
            android.os.Handler r4 = r2.zat
            com.google.android.gms.common.api.internal.zach r5 = new com.google.android.gms.common.api.internal.zach
            java.util.concurrent.atomic.AtomicInteger r1 = r2.zao
            int r1 = r1.get()
            r5.<init>(r0, r1, r3)
            r3 = 4
            android.os.Message r3 = r4.obtainMessage(r3, r5)
            r4.sendMessage(r3)
            return
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions, ResultT> void zax(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<O> r2, int r3, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api.AnyClient, ResultT> r4, @androidx.annotation.NonNull com.google.android.gms.tasks.TaskCompletionSource<ResultT> r5, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
            r1 = this;
            int r0 = r4.zaa()
            r1.zaL(r5, r0, r2)
            com.google.android.gms.common.api.internal.zag r0 = new com.google.android.gms.common.api.internal.zag
            r0.<init>(r3, r4, r5, r6)
            android.os.Handler r3 = r1.zat
            com.google.android.gms.common.api.internal.zach r4 = new com.google.android.gms.common.api.internal.zach
            java.util.concurrent.atomic.AtomicInteger r5 = r1.zao
            int r5 = r5.get()
            r4.<init>(r0, r5, r2)
            r2 = 4
            android.os.Message r2 = r3.obtainMessage(r2, r4)
            r3.sendMessage(r2)
            return
    }

    public final void zay(com.google.android.gms.common.internal.MethodInvocation r9, int r10, long r11, int r13) {
            r8 = this;
            android.os.Handler r0 = r8.zat
            com.google.android.gms.common.api.internal.zace r7 = new com.google.android.gms.common.api.internal.zace
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r6)
            r9 = 18
            android.os.Message r9 = r0.obtainMessage(r9, r7)
            r0.sendMessage(r9)
            return
    }

    public final void zaz(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4, int r5) {
            r3 = this;
            boolean r0 = r3.zaG(r4, r5)
            if (r0 != 0) goto L11
            android.os.Handler r0 = r3.zat
            r1 = 5
            r2 = 0
            android.os.Message r4 = r0.obtainMessage(r1, r5, r2, r4)
            r0.sendMessage(r4)
        L11:
            return
    }
}
