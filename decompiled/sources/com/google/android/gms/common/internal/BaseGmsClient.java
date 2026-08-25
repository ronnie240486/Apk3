package com.google.android.gms.common.internal;

import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class BaseGmsClient<T extends android.os.IInterface> {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private static final com.google.android.gms.common.Feature[] zze = null;

    @androidx.annotation.Nullable
    private volatile java.lang.String zzA;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.ConnectionResult zzB;
    private boolean zzC;

    @androidx.annotation.Nullable
    private volatile com.google.android.gms.common.internal.zzj zzD;

    @com.google.android.gms.common.util.VisibleForTesting
    public com.google.android.gms.common.internal.zzu zza;
    public final android.os.Handler zzb;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.util.VisibleForTesting
    public java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;

    @androidx.annotation.Nullable
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("mServiceBrokerLock")
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("mLock")
    private T zzs;
    private final java.util.ArrayList<com.google.android.gms.common.internal.zzc<?>> zzt;

    @androidx.annotation.Nullable
    @javax.annotation.concurrent.GuardedBy("mLock")
    private com.google.android.gms.common.internal.zze zzu;

    @javax.annotation.concurrent.GuardedBy("mLock")
    private int zzv;

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;

    @androidx.annotation.Nullable
    private final java.lang.String zzz;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface BaseConnectionCallbacks {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @com.google.android.gms.common.annotation.KeepForSdk
        void onConnected(@androidx.annotation.Nullable android.os.Bundle r1);

        @com.google.android.gms.common.annotation.KeepForSdk
        void onConnectionSuspended(int r1);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r1);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes3.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onReportServiceBinding(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r1);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

        @com.google.android.gms.common.annotation.KeepForSdk
        public LegacyClientCallbackAdapter(com.google.android.gms.common.internal.BaseGmsClient r1) {
                r0 = this;
                r0.zza = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
                r2 = this;
                boolean r0 = r3.isSuccess()
                if (r0 == 0) goto L11
                com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zza
                r0 = 0
                java.util.Set r1 = r3.getScopes()
                r3.getRemoteService(r0, r1)
                return
            L11:
                com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
                if (r0 == 0) goto L22
                com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
                r0.onConnectionFailed(r3)
            L22:
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface SignOutCallbacks {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onSignOutComplete();
    }

    static {
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.internal.BaseGmsClient.zze = r0
            java.lang.String r0 = "service_esmobile"
            java.lang.String r1 = "service_googleme"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.common.internal.BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = r0
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.annotation.KeepForSdk
    public BaseGmsClient(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.os.Looper r4, @androidx.annotation.NonNull com.google.android.gms.common.internal.GmsClientSupervisor r5, @androidx.annotation.NonNull com.google.android.gms.common.GoogleApiAvailabilityLight r6, int r7, @androidx.annotation.Nullable com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r8, @androidx.annotation.Nullable com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r9, @androidx.annotation.Nullable java.lang.String r10) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzk = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzp = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.zzt = r1
            r1 = 1
            r2.zzv = r1
            r2.zzB = r0
            r1 = 0
            r2.zzC = r1
            r2.zzD = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.zzd = r0
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r2.zzl = r3
            java.lang.String r3 = "Looper must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r3)
            r2.zzm = r4
            java.lang.String r3 = "Supervisor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r3)
            r2.zzn = r5
            java.lang.String r3 = "API availability must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r3)
            r2.zzo = r6
            com.google.android.gms.common.internal.zzb r3 = new com.google.android.gms.common.internal.zzb
            r3.<init>(r2, r4)
            r2.zzb = r3
            r2.zzy = r7
            r2.zzw = r8
            r2.zzx = r9
            r2.zzz = r10
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.ConnectionResult r0 = r0.zzB
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzb(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r0.zzw
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzc(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = r0.zzx
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzd(com.google.android.gms.common.internal.BaseGmsClient r0) {
            java.lang.Object r0 = r0.zzq
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.ArrayList zzf(com.google.android.gms.common.internal.BaseGmsClient r0) {
            java.util.ArrayList<com.google.android.gms.common.internal.zzc<?>> r0 = r0.zzt
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zzB = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.internal.IGmsServiceBroker r1) {
            r0.zzr = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = 0
            r1.zzp(r2, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.internal.zzj r1) {
            r0.zzD = r1
            boolean r0 = r0.usesClientTelemetry()
            if (r0 == 0) goto L19
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r1.zzd
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            if (r0 != 0) goto L12
            r0 = 0
            goto L16
        L12:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.zza()
        L16:
            r1.zza(r0)
        L19:
            return
    }

    public static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.common.internal.BaseGmsClient r3) {
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            r0 = 3
            if (r1 != r0) goto Le
            r0 = 1
            r3.zzC = r0
            r0 = 5
            goto Lf
        Le:
            r0 = 4
        Lf:
            android.os.Handler r1 = r3.zzb
            java.util.concurrent.atomic.AtomicInteger r3 = r3.zzd
            int r3 = r3.get()
            r2 = 16
            android.os.Message r3 = r1.obtainMessage(r0, r3, r2)
            r1.sendMessage(r3)
            return
        L21:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    public static /* bridge */ /* synthetic */ boolean zzm(com.google.android.gms.common.internal.BaseGmsClient r0) {
            boolean r0 = r0.zzC
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zzn(com.google.android.gms.common.internal.BaseGmsClient r2, int r3, int r4, android.os.IInterface r5) {
            java.lang.Object r0 = r2.zzp
            monitor-enter(r0)
            int r1 = r2.zzv     // Catch: java.lang.Throwable -> L10
            if (r1 == r3) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r2 = 0
            goto Lf
        La:
            r2.zzp(r4, r5)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r2 = 1
        Lf:
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.BaseGmsClient r2) {
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L21
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L21
        L11:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            goto L21
        L19:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L21
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L21
            r1 = 1
        L21:
            return r1
    }

    private final void zzp(int r12, @androidx.annotation.Nullable T r13) {
            r11 = this;
            r0 = 0
            r1 = 1
            r2 = 4
            if (r12 == r2) goto L7
            r3 = 0
            goto L8
        L7:
            r3 = 1
        L8:
            if (r13 != 0) goto Lc
            r4 = 0
            goto Ld
        Lc:
            r4 = 1
        Ld:
            if (r3 != r4) goto L10
            r0 = 1
        L10:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.lang.Object r0 = r11.zzp
            monitor-enter(r0)
            r11.zzv = r12     // Catch: java.lang.Throwable -> L1a4
            r11.zzs = r13     // Catch: java.lang.Throwable -> L1a4
            r3 = 0
            if (r12 == r1) goto L178
            r1 = 2
            r4 = 3
            if (r12 == r1) goto L32
            if (r12 == r4) goto L32
            if (r12 == r2) goto L27
            goto L1a2
        L27:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch: java.lang.Throwable -> L1a4
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a4
            r11.zzh = r12     // Catch: java.lang.Throwable -> L1a4
            goto L1a2
        L32:
            com.google.android.gms.common.internal.zze r8 = r11.zzu     // Catch: java.lang.Throwable -> L1a4
            if (r8 == 0) goto L9c
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            if (r12 == 0) goto L9c
            java.lang.String r13 = "GmsClient"
            java.lang.String r1 = r12.zzc()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r12 = r12.zzb()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1a4
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L1a4
            int r2 = r2 + 70
            java.lang.String r4 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L1a4
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L1a4
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a4
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r2 = "Calling connect() while still connected, missing disconnect() for "
            r4.append(r2)     // Catch: java.lang.Throwable -> L1a4
            r4.append(r1)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = " on "
            r4.append(r1)     // Catch: java.lang.Throwable -> L1a4
            r4.append(r12)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r12 = r4.toString()     // Catch: java.lang.Throwable -> L1a4
            android.util.Log.e(r13, r12)     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.GmsClientSupervisor r4 = r11.zzn     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r5 = r12.zzc()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r6 = r12.zzb()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            int r7 = r12.zza()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r9 = r11.zze()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            boolean r10 = r12.zzd()     // Catch: java.lang.Throwable -> L1a4
            r4.zzb(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a4
            java.util.concurrent.atomic.AtomicInteger r12 = r11.zzd     // Catch: java.lang.Throwable -> L1a4
            r12.incrementAndGet()     // Catch: java.lang.Throwable -> L1a4
        L9c:
            com.google.android.gms.common.internal.zze r12 = new com.google.android.gms.common.internal.zze     // Catch: java.lang.Throwable -> L1a4
            java.util.concurrent.atomic.AtomicInteger r13 = r11.zzd     // Catch: java.lang.Throwable -> L1a4
            int r13 = r13.get()     // Catch: java.lang.Throwable -> L1a4
            r12.<init>(r11, r13)     // Catch: java.lang.Throwable -> L1a4
            r11.zzu = r12     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r13 = new com.google.android.gms.common.internal.zzu     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r5 = "com.google.android.gms"
            java.lang.String r6 = r11.getStartServiceAction()     // Catch: java.lang.Throwable -> L1a4
            r7 = 0
            int r8 = com.google.android.gms.common.internal.GmsClientSupervisor.getDefaultBindFlags()     // Catch: java.lang.Throwable -> L1a4
            boolean r9 = r11.getUseDynamicLookup()     // Catch: java.lang.Throwable -> L1a4
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1a4
            r11.zza = r13     // Catch: java.lang.Throwable -> L1a4
            boolean r13 = r13.zzd()     // Catch: java.lang.Throwable -> L1a4
            if (r13 == 0) goto Lf2
            int r13 = r11.getMinApkVersion()     // Catch: java.lang.Throwable -> L1a4
            r1 = 17895000(0x1110e58, float:2.6642585E-38)
            if (r13 >= r1) goto Lf2
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r13 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "
            com.google.android.gms.common.internal.zzu r1 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = r1.zzc()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1a4
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L1a4
            if (r2 == 0) goto Le8
            java.lang.String r13 = r13.concat(r1)     // Catch: java.lang.Throwable -> L1a4
            goto Lee
        Le8:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L1a4
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L1a4
            r13 = r1
        Lee:
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1a4
            throw r12     // Catch: java.lang.Throwable -> L1a4
        Lf2:
            com.google.android.gms.common.internal.GmsClientSupervisor r13 = r11.zzn     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r1 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = r1.zzc()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r2 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r2 = r2.zzb()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r4 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            int r4 = r4.zza()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r5 = r11.zze()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r6 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            boolean r6 = r6.zzd()     // Catch: java.lang.Throwable -> L1a4
            r11.getBindServiceExecutor()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzn r7 = new com.google.android.gms.common.internal.zzn     // Catch: java.lang.Throwable -> L1a4
            r7.<init>(r1, r2, r4, r6)     // Catch: java.lang.Throwable -> L1a4
            boolean r12 = r13.zzc(r7, r12, r5, r3)     // Catch: java.lang.Throwable -> L1a4
            if (r12 != 0) goto L1a2
            java.lang.String r12 = "GmsClient"
            com.google.android.gms.common.internal.zzu r13 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r13 = r13.zzc()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r1 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r1 = r1.zzb()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r2 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L1a4
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L1a4
            int r2 = r2 + 34
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1a4
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L1a4
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a4
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r2 = "unable to connect to service: "
            r4.append(r2)     // Catch: java.lang.Throwable -> L1a4
            r4.append(r13)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r13 = " on "
            r4.append(r13)     // Catch: java.lang.Throwable -> L1a4
            r4.append(r1)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> L1a4
            android.util.Log.w(r12, r13)     // Catch: java.lang.Throwable -> L1a4
            r12 = 16
            java.util.concurrent.atomic.AtomicInteger r13 = r11.zzd     // Catch: java.lang.Throwable -> L1a4
            int r13 = r13.get()     // Catch: java.lang.Throwable -> L1a4
            android.os.Handler r1 = r11.zzb     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzg r2 = new com.google.android.gms.common.internal.zzg     // Catch: java.lang.Throwable -> L1a4
            r2.<init>(r11, r12, r3)     // Catch: java.lang.Throwable -> L1a4
            r12 = 7
            r3 = -1
            android.os.Message r12 = r1.obtainMessage(r12, r13, r3, r2)     // Catch: java.lang.Throwable -> L1a4
            r1.sendMessage(r12)     // Catch: java.lang.Throwable -> L1a4
            goto L1a2
        L178:
            com.google.android.gms.common.internal.zze r8 = r11.zzu     // Catch: java.lang.Throwable -> L1a4
            if (r8 == 0) goto L1a2
            com.google.android.gms.common.internal.GmsClientSupervisor r4 = r11.zzn     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r5 = r12.zzc()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r6 = r12.zzb()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            int r7 = r12.zza()     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r9 = r11.zze()     // Catch: java.lang.Throwable -> L1a4
            com.google.android.gms.common.internal.zzu r12 = r11.zza     // Catch: java.lang.Throwable -> L1a4
            boolean r10 = r12.zzd()     // Catch: java.lang.Throwable -> L1a4
            r4.zzb(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a4
            r11.zzu = r3     // Catch: java.lang.Throwable -> L1a4
        L1a2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a4
            return
        L1a4:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a4
            throw r12
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void checkAvailabilityAndConnect() {
            r5 = this;
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r5.zzo
            android.content.Context r1 = r5.zzl
            int r2 = r5.getMinApkVersion()
            int r0 = r0.isGooglePlayServicesAvailable(r1, r2)
            if (r0 == 0) goto L30
            r1 = 1
            r2 = 0
            r5.zzp(r1, r2)
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r1 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r1.<init>(r5)
            java.lang.String r3 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r3)
            r5.zzc = r1
            android.os.Handler r1 = r5.zzb
            java.util.concurrent.atomic.AtomicInteger r3 = r5.zzd
            int r3 = r3.get()
            r4 = 3
            android.os.Message r0 = r1.obtainMessage(r4, r3, r0, r2)
            r1.sendMessage(r0)
            return
        L30:
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r0 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r0.<init>(r5)
            r5.connect(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void connect(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r2) {
            r1 = this;
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zzc = r2
            r2 = 2
            r0 = 0
            r1.zzp(r2, r0)
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract T createServiceInterface(@androidx.annotation.NonNull android.os.IBinder r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public void disconnect() {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzd
            r0.incrementAndGet()
            java.util.ArrayList<com.google.android.gms.common.internal.zzc<?>> r0 = r4.zzt
            monitor-enter(r0)
            java.util.ArrayList<com.google.android.gms.common.internal.zzc<?>> r1 = r4.zzt     // Catch: java.lang.Throwable -> L34
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L34
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1f
            java.util.ArrayList<com.google.android.gms.common.internal.zzc<?>> r3 = r4.zzt     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.common.internal.zzc r3 = (com.google.android.gms.common.internal.zzc) r3     // Catch: java.lang.Throwable -> L34
            r3.zzf()     // Catch: java.lang.Throwable -> L34
            int r2 = r2 + 1
            goto Lf
        L1f:
            java.util.ArrayList<com.google.android.gms.common.internal.zzc<?>> r1 = r4.zzt     // Catch: java.lang.Throwable -> L34
            r1.clear()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r4.zzq
            monitor-enter(r1)
            r0 = 0
            r4.zzr = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            r1 = 1
            r4.zzp(r1, r0)
            return
        L31:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r0
        L34:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void disconnect(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.zzk = r1
            r0.disconnect()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void dump(@androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull java.io.FileDescriptor r12, @androidx.annotation.NonNull java.io.PrintWriter r13, @androidx.annotation.NonNull java.lang.String[] r14) {
            r10 = this;
            java.lang.Object r12 = r10.zzp
            monitor-enter(r12)
            int r14 = r10.zzv     // Catch: java.lang.Throwable -> L18e
            T extends android.os.IInterface r0 = r10.zzs     // Catch: java.lang.Throwable -> L18e
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L18e
            java.lang.Object r1 = r10.zzq
            monitor-enter(r1)
            com.google.android.gms.common.internal.IGmsServiceBroker r12 = r10.zzr     // Catch: java.lang.Throwable -> L18b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18b
            java.io.PrintWriter r1 = r13.append(r11)
            java.lang.String r2 = "mConnectState="
            r1.append(r2)
            r1 = 3
            r2 = 2
            r3 = 1
            if (r14 == r3) goto L44
            if (r14 == r2) goto L3e
            if (r14 == r1) goto L38
            r4 = 4
            if (r14 == r4) goto L32
            r4 = 5
            if (r14 == r4) goto L2c
            java.lang.String r14 = "UNKNOWN"
            r13.print(r14)
            goto L49
        L2c:
            java.lang.String r14 = "DISCONNECTING"
            r13.print(r14)
            goto L49
        L32:
            java.lang.String r14 = "CONNECTED"
            r13.print(r14)
            goto L49
        L38:
            java.lang.String r14 = "LOCAL_CONNECTING"
            r13.print(r14)
            goto L49
        L3e:
            java.lang.String r14 = "REMOTE_CONNECTING"
            r13.print(r14)
            goto L49
        L44:
            java.lang.String r14 = "DISCONNECTED"
            r13.print(r14)
        L49:
            java.lang.String r14 = " mService="
            r13.append(r14)
            if (r0 != 0) goto L56
            java.lang.String r14 = "null"
            r13.append(r14)
            goto L73
        L56:
            java.lang.String r14 = r10.getServiceDescriptor()
            java.io.PrintWriter r14 = r13.append(r14)
            java.lang.String r4 = "@"
            java.io.PrintWriter r14 = r14.append(r4)
            android.os.IBinder r0 = r0.asBinder()
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r14.append(r0)
        L73:
            java.lang.String r14 = " mServiceBroker="
            r13.append(r14)
            if (r12 != 0) goto L80
            java.lang.String r12 = "null"
            r13.println(r12)
            goto L95
        L80:
            java.lang.String r14 = "IGmsServiceBroker@"
            java.io.PrintWriter r14 = r13.append(r14)
            android.os.IBinder r12 = r12.asBinder()
            int r12 = java.lang.System.identityHashCode(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r14.println(r12)
        L95:
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat
            java.lang.String r14 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r0 = java.util.Locale.US
            r12.<init>(r14, r0)
            long r4 = r10.zzh
            r6 = 0
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 <= 0) goto Ldd
            java.io.PrintWriter r14 = r13.append(r11)
            java.lang.String r0 = "lastConnectedTime="
            java.io.PrintWriter r14 = r14.append(r0)
            long r4 = r10.zzh
            java.util.Date r0 = new java.util.Date
            r0.<init>(r4)
            java.lang.String r0 = r12.format(r0)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 21
            r9.<init>(r8)
            r9.append(r4)
            java.lang.String r4 = " "
            r9.append(r4)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r14.println(r0)
        Ldd:
            long r4 = r10.zzg
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 <= 0) goto L13f
            java.io.PrintWriter r14 = r13.append(r11)
            java.lang.String r0 = "lastSuspendedCause="
            r14.append(r0)
            int r14 = r10.zzf
            if (r14 == r3) goto L108
            if (r14 == r2) goto L102
            if (r14 == r1) goto Lfc
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r13.append(r14)
            goto L10d
        Lfc:
            java.lang.String r14 = "CAUSE_DEAD_OBJECT_EXCEPTION"
            r13.append(r14)
            goto L10d
        L102:
            java.lang.String r14 = "CAUSE_NETWORK_LOST"
            r13.append(r14)
            goto L10d
        L108:
            java.lang.String r14 = "CAUSE_SERVICE_DISCONNECTED"
            r13.append(r14)
        L10d:
            java.lang.String r14 = " lastSuspendedTime="
            java.io.PrintWriter r14 = r13.append(r14)
            long r0 = r10.zzg
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r2 = r12.format(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 21
            r4.<init>(r3)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r14.println(r0)
        L13f:
            long r0 = r10.zzj
            int r14 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r14 <= 0) goto L18a
            java.io.PrintWriter r11 = r13.append(r11)
            java.lang.String r14 = "lastFailedStatus="
            java.io.PrintWriter r11 = r11.append(r14)
            int r14 = r10.zzi
            java.lang.String r14 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r14)
            r11.append(r14)
            java.lang.String r11 = " lastFailedTime="
            java.io.PrintWriter r11 = r13.append(r11)
            long r13 = r10.zzj
            java.util.Date r0 = new java.util.Date
            r0.<init>(r13)
            java.lang.String r12 = r12.format(r0)
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 21
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r13 = " "
            r1.append(r13)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r11.println(r12)
        L18a:
            return
        L18b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18b
            throw r11
        L18e:
            r11 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L18e
            throw r11
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.accounts.Account getAccount() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.common.internal.BaseGmsClient.zze
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
            r1 = this;
            com.google.android.gms.common.internal.zzj r0 = r1.zzD
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.Feature[] r0 = r0.zzb
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public void getBindServiceExecutor() {
            r0 = this;
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getConnectionHint() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zzl
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getEndpointPackageName() {
            r2 = this;
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto Lf
            com.google.android.gms.common.internal.zzu r0 = r2.zza
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zzb()
            return r0
        Lf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to connect when checking package"
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getGCoreServiceId() {
            r1 = this;
            int r0 = r1.zzy
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getGetServiceRequestExtraArgs() {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getLastDisconnectMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzk
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.zzm
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMinApkVersion() {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    public void getRemoteService(@androidx.annotation.Nullable com.google.android.gms.common.internal.IAccountAccessor r5, @androidx.annotation.NonNull java.util.Set<com.google.android.gms.common.api.Scope> r6) {
            r4 = this;
            android.os.Bundle r0 = r4.getGetServiceRequestExtraArgs()
            com.google.android.gms.common.internal.GetServiceRequest r1 = new com.google.android.gms.common.internal.GetServiceRequest
            int r2 = r4.zzy
            java.lang.String r3 = r4.zzA
            r1.<init>(r2, r3)
            android.content.Context r2 = r4.zzl
            java.lang.String r2 = r2.getPackageName()
            r1.zzd = r2
            r1.zzg = r0
            if (r6 == 0) goto L27
            int r0 = r6.size()
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.lang.Object[] r6 = r6.toArray(r0)
            com.google.android.gms.common.api.Scope[] r6 = (com.google.android.gms.common.api.Scope[]) r6
            r1.zzf = r6
        L27:
            boolean r6 = r4.requiresSignIn()
            if (r6 == 0) goto L47
            android.accounts.Account r6 = r4.getAccount()
            if (r6 != 0) goto L3c
            android.accounts.Account r6 = new android.accounts.Account
            java.lang.String r0 = "<<default account>>"
            java.lang.String r2 = "com.google"
            r6.<init>(r0, r2)
        L3c:
            r1.zzh = r6
            if (r5 == 0) goto L53
            android.os.IBinder r5 = r5.asBinder()
            r1.zze = r5
            goto L53
        L47:
            boolean r5 = r4.requiresAccount()
            if (r5 == 0) goto L53
            android.accounts.Account r5 = r4.getAccount()
            r1.zzh = r5
        L53:
            com.google.android.gms.common.Feature[] r5 = com.google.android.gms.common.internal.BaseGmsClient.zze
            r1.zzi = r5
            com.google.android.gms.common.Feature[] r5 = r4.getApiFeatures()
            r1.zzj = r5
            boolean r5 = r4.usesClientTelemetry()
            r6 = 1
            if (r5 == 0) goto L66
            r1.zzm = r6
        L66:
            java.lang.Object r5 = r4.zzq     // Catch: java.lang.RuntimeException -> L88 android.os.RemoteException -> L8a java.lang.SecurityException -> Lab android.os.DeadObjectException -> Lad
            monitor-enter(r5)     // Catch: java.lang.RuntimeException -> L88 android.os.RemoteException -> L8a java.lang.SecurityException -> Lab android.os.DeadObjectException -> Lad
            com.google.android.gms.common.internal.IGmsServiceBroker r0 = r4.zzr     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L7c
            com.google.android.gms.common.internal.zzd r2 = new com.google.android.gms.common.internal.zzd     // Catch: java.lang.Throwable -> L85
            java.util.concurrent.atomic.AtomicInteger r3 = r4.zzd     // Catch: java.lang.Throwable -> L85
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L85
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L85
            r0.getService(r2, r1)     // Catch: java.lang.Throwable -> L85
            goto L83
        L7c:
            java.lang.String r0 = "GmsClient"
            java.lang.String r1 = "mServiceBroker is null, client disconnected"
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L85
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L85
            return
        L85:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.RuntimeException -> L88 android.os.RemoteException -> L8a java.lang.SecurityException -> Lab android.os.DeadObjectException -> Lad
        L88:
            r5 = move-exception
            goto L8b
        L8a:
            r5 = move-exception
        L8b:
            java.lang.String r0 = "GmsClient"
            java.lang.String r1 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r0, r1, r5)
            r5 = 8
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzd
            int r0 = r0.get()
            android.os.Handler r1 = r4.zzb
            com.google.android.gms.common.internal.zzf r2 = new com.google.android.gms.common.internal.zzf
            r3 = 0
            r2.<init>(r4, r5, r3, r3)
            r5 = -1
            android.os.Message r5 = r1.obtainMessage(r6, r0, r5, r2)
            r1.sendMessage(r5)
            return
        Lab:
            r5 = move-exception
            throw r5
        Lad:
            r5 = move-exception
            java.lang.String r6 = "GmsClient"
            java.lang.String r0 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r6, r0, r5)
            r5 = 3
            r4.triggerConnectionSuspended(r5)
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final T getService() throws android.os.DeadObjectException {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> L1f
            r2 = 5
            if (r1 == r2) goto L21
            boolean r1 = r3.isConnected()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L17
            T extends android.os.IInterface r1 = r3.zzs     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "Client is connected but service is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r1
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "Not connected. Call connect() and wait for onConnected() to be called."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L1f:
            r1 = move-exception
            goto L27
        L21:
            android.os.DeadObjectException r1 = new android.os.DeadObjectException     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.IBinder getServiceBrokerBinder() {
            r2 = this;
            java.lang.Object r0 = r2.zzq
            monitor-enter(r0)
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = r2.zzr     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            return r0
        La:
            android.os.IBinder r1 = r1.asBinder()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.String getServiceDescriptor();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Intent getSignInIntent() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not a sign in API"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.String getStartServiceAction();

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
            r1 = this;
            com.google.android.gms.common.internal.zzj r0 = r1.zzD
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r0.zzd
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean getUseDynamicLookup() {
            r2 = this;
            int r0 = r2.getMinApkVersion()
            r1 = 211700000(0xc9e4920, float:2.4387765E-31)
            if (r0 < r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasConnectionInfo() {
            r1 = this;
            com.google.android.gms.common.internal.zzj r0 = r1.zzD
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isConnected() {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isConnecting() {
            r4 = this;
            java.lang.Object r0 = r4.zzp
            monitor-enter(r0)
            int r1 = r4.zzv     // Catch: java.lang.Throwable -> L10
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Le
            r2 = 3
            if (r1 != r2) goto Ld
            goto Le
        Ld:
            r3 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r3
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.CallSuper
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            int r3 = r3.getErrorCode()
            r2.zzi = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzj = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.CallSuper
    public final void onConnectionSuspended(int r3) {
            r2 = this;
            r2.zzf = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzg = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onUserSignOut(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1) {
            r0 = this;
            r1.onSignOutComplete()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean providesSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean requiresAccount() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean requiresGooglePlayServices() {
            r1 = this;
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean requiresSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setAttributionTag(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.zzA = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void triggerConnectionSuspended(int r4) {
            r3 = this;
            android.os.Handler r0 = r3.zzb
            java.util.concurrent.atomic.AtomicInteger r1 = r3.zzd
            int r1 = r1.get()
            r2 = 6
            android.os.Message r4 = r0.obtainMessage(r2, r1, r4)
            r0.sendMessage(r4)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean usesClientTelemetry() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzz
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.zzl
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
        Le:
            return r0
    }
}
