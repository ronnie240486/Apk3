package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.annotation.KeepName
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    public static final java.lang.ThreadLocal<java.lang.Boolean> zaa = null;
    public static final /* synthetic */ int zad = 0;

    @com.google.android.gms.common.annotation.KeepName
    private com.google.android.gms.common.api.internal.zas mResultGuardian;

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> zab;

    @androidx.annotation.NonNull
    public final java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> zac;
    private final java.lang.Object zae;
    private final java.util.concurrent.CountDownLatch zaf;
    private final java.util.ArrayList<com.google.android.gms.common.api.PendingResult.StatusListener> zag;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.ResultCallback<? super R> zah;
    private final java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zadb> zai;

    @androidx.annotation.Nullable
    private R zaj;
    private com.google.android.gms.common.api.Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.ICancelToken zao;
    private volatile com.google.android.gms.common.api.internal.zada<R> zap;
    private boolean zaq;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.util.VisibleForTesting
    public static class CallbackHandler<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.internal.base.zaq {
        public CallbackHandler() {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                return
        }

        public CallbackHandler(@androidx.annotation.NonNull android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(@androidx.annotation.NonNull android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 == r1) goto L30
                r1 = 2
                if (r0 == r1) goto L26
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r1 = 45
                r3.<init>(r1)
                java.lang.String r1 = "Don't know how to handle message: "
                r3.append(r1)
                r3.append(r0)
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = "BasePendingResult"
                android.util.Log.wtf(r1, r3, r0)
                return
            L26:
                java.lang.Object r3 = r3.obj
                com.google.android.gms.common.api.internal.BasePendingResult r3 = (com.google.android.gms.common.api.internal.BasePendingResult) r3
                com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_TIMEOUT
                r3.forceFailureUnlessReady(r0)
                return
            L30:
                java.lang.Object r3 = r3.obj
                android.util.Pair r3 = (android.util.Pair) r3
                java.lang.Object r0 = r3.first
                com.google.android.gms.common.api.ResultCallback r0 = (com.google.android.gms.common.api.ResultCallback) r0
                java.lang.Object r3 = r3.second
                com.google.android.gms.common.api.Result r3 = (com.google.android.gms.common.api.Result) r3
                r0.onResult(r3)     // Catch: java.lang.RuntimeException -> L40
                return
            L40:
                r0 = move-exception
                com.google.android.gms.common.api.internal.BasePendingResult.zal(r3)
                throw r0
        }

        public final void zaa(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallback<? super R> r2, @androidx.annotation.NonNull R r3) {
                r1 = this;
                int r0 = com.google.android.gms.common.api.internal.BasePendingResult.zad
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                com.google.android.gms.common.api.ResultCallback r2 = (com.google.android.gms.common.api.ResultCallback) r2
                android.util.Pair r0 = new android.util.Pair
                r0.<init>(r2, r3)
                r2 = 1
                android.os.Message r2 = r1.obtainMessage(r2, r0)
                r1.sendMessage(r2)
                return
        }
    }

    static {
            com.google.android.gms.common.api.internal.zaq r0 = new com.google.android.gms.common.api.internal.zaq
            r0.<init>()
            com.google.android.gms.common.api.internal.BasePendingResult.zaa = r0
            return
    }

    @java.lang.Deprecated
    public BasePendingResult() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zae = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zaf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zag = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.zai = r0
            r0 = 0
            r2.zaq = r0
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r0 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zab = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.zac = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public BasePendingResult(@androidx.annotation.NonNull android.os.Looper r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zae = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zaf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zag = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.zai = r0
            r0 = 0
            r2.zaq = r0
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r0 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            r0.<init>(r3)
            r2.zab = r0
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r0 = 0
            r3.<init>(r0)
            r2.zac = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public BasePendingResult(@androidx.annotation.Nullable com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zae = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zaf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zag = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.zai = r0
            r0 = 0
            r2.zaq = r0
            if (r3 == 0) goto L2a
            android.os.Looper r0 = r3.getLooper()
            goto L2e
        L2a:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L2e:
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r1 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            r1.<init>(r0)
            r2.zab = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.zac = r0
            return
    }

    private final R zaa() {
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            boolean r1 = r4.zal     // Catch: java.lang.Throwable -> L37
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> L37
            boolean r1 = r4.isReady()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "Result is not ready."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> L37
            R extends com.google.android.gms.common.api.Result r1 = r4.zaj     // Catch: java.lang.Throwable -> L37
            r3 = 0
            r4.zaj = r3     // Catch: java.lang.Throwable -> L37
            r4.zah = r3     // Catch: java.lang.Throwable -> L37
            r4.zal = r2     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zadb> r0 = r4.zai
            java.lang.Object r0 = r0.getAndSet(r3)
            com.google.android.gms.common.api.internal.zadb r0 = (com.google.android.gms.common.api.internal.zadb) r0
            if (r0 == 0) goto L30
            com.google.android.gms.common.api.internal.zadc r0 = r0.zaa
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r0 = r0.zab
            r0.remove(r4)
        L30:
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.api.Result r0 = (com.google.android.gms.common.api.Result) r0
            return r0
        L37:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r1
    }

    private final void zab(R r5) {
            r4 = this;
            r4.zaj = r5
            com.google.android.gms.common.api.Status r5 = r5.getStatus()
            r4.zak = r5
            r5 = 0
            r4.zao = r5
            java.util.concurrent.CountDownLatch r0 = r4.zaf
            r0.countDown()
            boolean r0 = r4.zam
            if (r0 == 0) goto L17
            r4.zah = r5
            goto L38
        L17:
            com.google.android.gms.common.api.ResultCallback<? super R extends com.google.android.gms.common.api.Result> r5 = r4.zah
            if (r5 != 0) goto L29
            R extends com.google.android.gms.common.api.Result r5 = r4.zaj
            boolean r5 = r5 instanceof com.google.android.gms.common.api.Releasable
            if (r5 == 0) goto L38
            com.google.android.gms.common.api.internal.zas r5 = new com.google.android.gms.common.api.internal.zas
            r5.<init>(r4)
            r4.mResultGuardian = r5
            goto L38
        L29:
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R extends com.google.android.gms.common.api.Result> r0 = r4.zab
            r1 = 2
            r0.removeMessages(r1)
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R extends com.google.android.gms.common.api.Result> r0 = r4.zab
            com.google.android.gms.common.api.Result r1 = r4.zaa()
            r0.zaa(r5, r1)
        L38:
            java.util.ArrayList<com.google.android.gms.common.api.PendingResult$StatusListener> r5 = r4.zag
            int r0 = r5.size()
            r1 = 0
        L3f:
            if (r1 >= r0) goto L4f
            java.lang.Object r2 = r5.get(r1)
            com.google.android.gms.common.api.PendingResult$StatusListener r2 = (com.google.android.gms.common.api.PendingResult.StatusListener) r2
            com.google.android.gms.common.api.Status r3 = r4.zak
            r2.onComplete(r3)
            int r1 = r1 + 1
            goto L3f
        L4f:
            java.util.ArrayList<com.google.android.gms.common.api.PendingResult$StatusListener> r5 = r4.zag
            r5.clear()
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result zaj(com.google.android.gms.common.api.internal.BasePendingResult r0) {
            R extends com.google.android.gms.common.api.Result r0 = r0.zaj
            return r0
    }

    public static void zal(@androidx.annotation.Nullable com.google.android.gms.common.api.Result r2) {
            boolean r0 = r2 instanceof com.google.android.gms.common.api.Releasable
            if (r0 == 0) goto L1b
            r0 = r2
            com.google.android.gms.common.api.Releasable r0 = (com.google.android.gms.common.api.Releasable) r0     // Catch: java.lang.RuntimeException -> Lb
            r0.release()     // Catch: java.lang.RuntimeException -> Lb
            return
        Lb:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Unable to release "
            java.lang.String r2 = r1.concat(r2)
            java.lang.String r1 = "BasePendingResult"
            android.util.Log.w(r1, r2, r0)
        L1b:
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@androidx.annotation.NonNull com.google.android.gms.common.api.PendingResult.StatusListener r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Callback cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.isReady()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L19
            com.google.android.gms.common.api.Status r1 = r2.zak     // Catch: java.lang.Throwable -> L20
            r3.onComplete(r1)     // Catch: java.lang.Throwable -> L20
            goto L1e
        L19:
            java.util.ArrayList<com.google.android.gms.common.api.PendingResult$StatusListener> r1 = r2.zag     // Catch: java.lang.Throwable -> L20
            r1.add(r3)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @androidx.annotation.NonNull
    public final R await() {
            r3 = this;
            java.lang.String r0 = "await must not be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            boolean r0 = r3.zal
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Result has already been consumed"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r0 = r3.zap
            if (r0 != 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.String r0 = "Cannot await if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r3.zaf     // Catch: java.lang.InterruptedException -> L1f
            r0.await()     // Catch: java.lang.InterruptedException -> L1f
            goto L24
        L1f:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERRUPTED
            r3.forceFailureUnlessReady(r0)
        L24:
            boolean r0 = r3.isReady()
            java.lang.String r1 = "Result is not ready."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.common.api.Result r0 = r3.zaa()
            return r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @androidx.annotation.NonNull
    public final R await(long r4, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            java.lang.String r0 = "await must not be called on the UI thread when time is greater than zero."
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
        Lb:
            boolean r0 = r3.zal
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r0 = r3.zap
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r0 = "Cannot await if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r3.zaf     // Catch: java.lang.InterruptedException -> L2d
            boolean r4 = r0.await(r4, r6)     // Catch: java.lang.InterruptedException -> L2d
            if (r4 != 0) goto L32
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_TIMEOUT     // Catch: java.lang.InterruptedException -> L2d
            r3.forceFailureUnlessReady(r4)     // Catch: java.lang.InterruptedException -> L2d
            goto L32
        L2d:
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_INTERRUPTED
            r3.forceFailureUnlessReady(r4)
        L32:
            boolean r4 = r3.isReady()
            java.lang.String r5 = "Result is not ready."
            com.google.android.gms.common.internal.Preconditions.checkState(r4, r5)
            com.google.android.gms.common.api.Result r4 = r3.zaa()
            return r4
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @com.google.android.gms.common.annotation.KeepForSdk
    public void cancel() {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.zam     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L26
            boolean r1 = r2.zal     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto Lc
            goto L26
        Lc:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.zao     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L13
            r1.cancel()     // Catch: android.os.RemoteException -> L13 java.lang.Throwable -> L28
        L13:
            R extends com.google.android.gms.common.api.Result r1 = r2.zaj     // Catch: java.lang.Throwable -> L28
            zal(r1)     // Catch: java.lang.Throwable -> L28
            r1 = 1
            r2.zam = r1     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.api.Result r1 = r2.createFailedResult(r1)     // Catch: java.lang.Throwable -> L28
            r2.zab(r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract R createFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public final void forceFailureUnlessReady(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.isReady()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L13
            com.google.android.gms.common.api.Result r3 = r2.createFailedResult(r3)     // Catch: java.lang.Throwable -> L15
            r2.setResult(r3)     // Catch: java.lang.Throwable -> L15
            r3 = 1
            r2.zan = r3     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.zam     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final boolean isReady() {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = r5.zaf
            long r0 = r0.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final void setResult(@androidx.annotation.NonNull R r4) {
            r3 = this;
            java.lang.Object r0 = r3.zae
            monitor-enter(r0)
            boolean r1 = r3.zan     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L27
            boolean r1 = r3.zam     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L27
            r3.isReady()     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r3.isReady()     // Catch: java.lang.Throwable -> L2c
            r1 = r1 ^ 1
            java.lang.String r2 = "Results have already been set"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r3.zal     // Catch: java.lang.Throwable -> L2c
            r1 = r1 ^ 1
            java.lang.String r2 = "Result has already been consumed"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L2c
            r3.zab(r4)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L27:
            zal(r4)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void setResultCallback(@androidx.annotation.Nullable com.google.android.gms.common.api.ResultCallback<? super R> r5) {
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto La
            r5 = 0
            r4.zah = r5     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        La:
            boolean r1 = r4.zal     // Catch: java.lang.Throwable -> L3a
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r1 = r4.zap     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r4.isCanceled()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L26:
            boolean r1 = r4.isReady()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L36
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R extends com.google.android.gms.common.api.Result> r1 = r4.zab     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.common.api.Result r2 = r4.zaa()     // Catch: java.lang.Throwable -> L3a
            r1.zaa(r5, r2)     // Catch: java.lang.Throwable -> L3a
            goto L38
        L36:
            r4.zah = r5     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r5
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void setResultCallback(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallback<? super R> r5, long r6, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r8) {
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto La
            r5 = 0
            r4.zah = r5     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        La:
            boolean r1 = r4.zal     // Catch: java.lang.Throwable -> L48
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r1 = r4.zap     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> L48
            boolean r1 = r4.isCanceled()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L26:
            boolean r1 = r4.isReady()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L36
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R extends com.google.android.gms.common.api.Result> r6 = r4.zab     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.api.Result r7 = r4.zaa()     // Catch: java.lang.Throwable -> L48
            r6.zaa(r5, r7)     // Catch: java.lang.Throwable -> L48
            goto L46
        L36:
            r4.zah = r5     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R extends com.google.android.gms.common.api.Result> r5 = r4.zab     // Catch: java.lang.Throwable -> L48
            long r6 = r8.toMillis(r6)     // Catch: java.lang.Throwable -> L48
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch: java.lang.Throwable -> L48
            r5.sendMessageDelayed(r8, r6)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r5
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @androidx.annotation.NonNull
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r6) {
            r5 = this;
            boolean r0 = r5.zal
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            java.lang.Object r0 = r5.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r2 = r5.zap     // Catch: java.lang.Throwable -> L54
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            java.lang.String r4 = "Cannot call then() twice."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r4)     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.common.api.ResultCallback<? super R extends com.google.android.gms.common.api.Result> r2 = r5.zah     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L1e
            r3 = 1
        L1e:
            java.lang.String r2 = "Cannot call then() if callbacks are set."
            com.google.android.gms.common.internal.Preconditions.checkState(r3, r2)     // Catch: java.lang.Throwable -> L54
            boolean r2 = r5.zam     // Catch: java.lang.Throwable -> L54
            r2 = r2 ^ r1
            java.lang.String r3 = "Cannot call then() if result was canceled."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r3)     // Catch: java.lang.Throwable -> L54
            r5.zaq = r1     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.common.api.internal.zada r1 = new com.google.android.gms.common.api.internal.zada     // Catch: java.lang.Throwable -> L54
            java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> r2 = r5.zac     // Catch: java.lang.Throwable -> L54
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L54
            r5.zap = r1     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r1 = r5.zap     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.common.api.TransformedResult r6 = r1.then(r6)     // Catch: java.lang.Throwable -> L54
            boolean r1 = r5.isReady()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L4e
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R extends com.google.android.gms.common.api.Result> r1 = r5.zab     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r2 = r5.zap     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.common.api.Result r3 = r5.zaa()     // Catch: java.lang.Throwable -> L54
            r1.zaa(r2, r3)     // Catch: java.lang.Throwable -> L54
            goto L52
        L4e:
            com.google.android.gms.common.api.internal.zada<R extends com.google.android.gms.common.api.Result> r1 = r5.zap     // Catch: java.lang.Throwable -> L54
            r5.zah = r1     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            return r6
        L54:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r6
    }

    public final void zak() {
            r2 = this;
            boolean r0 = r2.zaq
            r1 = 1
            if (r0 != 0) goto L15
            java.lang.ThreadLocal<java.lang.Boolean> r0 = com.google.android.gms.common.api.internal.BasePendingResult.zaa
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r2.zaq = r1
            return
    }

    public final boolean zam() {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> r1 = r2.zac     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.common.api.GoogleApiClient r1 = (com.google.android.gms.common.api.GoogleApiClient) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L11
            boolean r1 = r2.zaq     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L14
        L11:
            r2.cancel()     // Catch: java.lang.Throwable -> L1a
        L14:
            boolean r1 = r2.isCanceled()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    public final void zan(@androidx.annotation.Nullable com.google.android.gms.common.api.internal.zadb r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zadb> r0 = r1.zai
            r0.set(r2)
            return
    }
}
