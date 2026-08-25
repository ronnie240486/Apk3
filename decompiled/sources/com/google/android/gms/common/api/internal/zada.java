package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zada<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.TransformedResult<R> implements com.google.android.gms.common.api.ResultCallback<R> {

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.ResultTransform<? super R, ? extends com.google.android.gms.common.api.Result> zaa;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.internal.zada<? extends com.google.android.gms.common.api.Result> zab;

    @androidx.annotation.Nullable
    private volatile com.google.android.gms.common.api.ResultCallbacks<? super R> zac;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.PendingResult<R> zad;
    private final java.lang.Object zae;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.Status zaf;
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> zag;
    private final com.google.android.gms.common.api.internal.zacz zah;
    private boolean zai;

    public zada(java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zaa = r0
            r2.zab = r0
            r2.zac = r0
            r2.zad = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zae = r1
            r2.zaf = r0
            r0 = 0
            r2.zai = r0
            java.lang.String r0 = "GoogleApiClient reference must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r2.zag = r3
            java.lang.Object r3 = r3.get()
            com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
            com.google.android.gms.common.api.internal.zacz r0 = new com.google.android.gms.common.api.internal.zacz
            if (r3 == 0) goto L2e
            android.os.Looper r3 = r3.getLooper()
            goto L32
        L2e:
            android.os.Looper r3 = android.os.Looper.getMainLooper()
        L32:
            r0.<init>(r2, r3)
            r2.zah = r0
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.ResultTransform zaa(com.google.android.gms.common.api.internal.zada r0) {
            com.google.android.gms.common.api.ResultTransform<? super R extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Result> r0 = r0.zaa
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zacz zab(com.google.android.gms.common.api.internal.zada r0) {
            com.google.android.gms.common.api.internal.zacz r0 = r0.zah
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zada zac(com.google.android.gms.common.api.internal.zada r0) {
            com.google.android.gms.common.api.internal.zada<? extends com.google.android.gms.common.api.Result> r0 = r0.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zad(com.google.android.gms.common.api.internal.zada r0) {
            java.lang.Object r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.ref.WeakReference zae(com.google.android.gms.common.api.internal.zada r0) {
            java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> r0 = r0.zag
            return r0
    }

    public static /* bridge */ /* synthetic */ void zaf(com.google.android.gms.common.api.Result r0) {
            zan(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zada r0, com.google.android.gms.common.api.Status r1) {
            r0.zaj(r1)
            return
    }

    private final void zaj(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            java.lang.Object r0 = r1.zae
            monitor-enter(r0)
            r1.zaf = r2     // Catch: java.lang.Throwable -> La
            r1.zal(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    @javax.annotation.concurrent.GuardedBy("mSyncToken")
    private final void zak() {
            r2 = this;
            com.google.android.gms.common.api.ResultTransform<? super R extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Result> r0 = r2.zaa
            if (r0 != 0) goto La
            com.google.android.gms.common.api.ResultCallbacks<? super R extends com.google.android.gms.common.api.Result> r0 = r2.zac
            if (r0 == 0) goto L9
            goto La
        L9:
            return
        La:
            java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> r0 = r2.zag
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            boolean r1 = r2.zai
            if (r1 != 0) goto L22
            com.google.android.gms.common.api.ResultTransform<? super R extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Result> r1 = r2.zaa
            if (r1 == 0) goto L22
            if (r0 == 0) goto L22
            r0.zao(r2)
            r0 = 1
            r2.zai = r0
        L22:
            com.google.android.gms.common.api.Status r0 = r2.zaf
            if (r0 == 0) goto L2a
            r2.zal(r0)
            return
        L2a:
            com.google.android.gms.common.api.PendingResult<R extends com.google.android.gms.common.api.Result> r0 = r2.zad
            if (r0 == 0) goto L31
            r0.setResultCallback(r2)
        L31:
            return
    }

    private final void zal(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.ResultTransform<? super R extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Result> r1 = r2.zaa     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L1f
            com.google.android.gms.common.api.Status r3 = r1.onFailure(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "onFailure must not return null"
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zada<? extends com.google.android.gms.common.api.Result> r1 = r2.zab     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zada r1 = (com.google.android.gms.common.api.internal.zada) r1     // Catch: java.lang.Throwable -> L32
            r1.zaj(r3)     // Catch: java.lang.Throwable -> L32
            goto L30
        L1f:
            boolean r1 = r2.zam()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
            com.google.android.gms.common.api.ResultCallbacks<? super R extends com.google.android.gms.common.api.Result> r1 = r2.zac     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.ResultCallbacks r1 = (com.google.android.gms.common.api.ResultCallbacks) r1     // Catch: java.lang.Throwable -> L32
            r1.onFailure(r3)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
    }

    @javax.annotation.concurrent.GuardedBy("mSyncToken")
    private final boolean zam() {
            r2 = this;
            java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> r0 = r2.zag
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            com.google.android.gms.common.api.ResultCallbacks<? super R extends com.google.android.gms.common.api.Result> r1 = r2.zac
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private static final void zan(com.google.android.gms.common.api.Result r2) {
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
            java.lang.String r1 = "TransformedResultImpl"
            android.util.Log.w(r1, r2, r0)
        L1b:
            return
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallbacks<? super R> r6) {
            r5 = this;
            java.lang.Object r0 = r5.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.ResultCallbacks<? super R extends com.google.android.gms.common.api.Result> r1 = r5.zac     // Catch: java.lang.Throwable -> L23
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r4 = "Cannot call andFinally() twice."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.api.ResultTransform<? super R extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Result> r1 = r5.zaa     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            java.lang.String r1 = "Cannot call then() and andFinally() on the same TransformedResult."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> L23
            r5.zac = r6     // Catch: java.lang.Throwable -> L23
            r5.zak()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r4) {
            r3 = this;
            java.lang.Object r0 = r3.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.Status r1 = r4.getStatus()     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.isSuccess()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L30
            com.google.android.gms.common.api.ResultTransform<? super R extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Result> r1 = r3.zaa     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L1e
            java.util.concurrent.ExecutorService r1 = com.google.android.gms.common.api.internal.zaco.zaa()     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.common.api.internal.zacy r2 = new com.google.android.gms.common.api.internal.zacy     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c
            r1.submit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L1e:
            boolean r1 = r3.zam()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3a
            com.google.android.gms.common.api.ResultCallbacks<? super R extends com.google.android.gms.common.api.Result> r1 = r3.zac     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.common.api.ResultCallbacks r1 = (com.google.android.gms.common.api.ResultCallbacks) r1     // Catch: java.lang.Throwable -> L3c
            r1.onSuccess(r4)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L30:
            com.google.android.gms.common.api.Status r1 = r4.getStatus()     // Catch: java.lang.Throwable -> L3c
            r3.zaj(r1)     // Catch: java.lang.Throwable -> L3c
            zan(r4)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r4
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @androidx.annotation.NonNull
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r6) {
            r5 = this;
            java.lang.Object r0 = r5.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.ResultTransform<? super R extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Result> r1 = r5.zaa     // Catch: java.lang.Throwable -> L2c
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r4 = "Cannot call then() twice."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.common.api.ResultCallbacks<? super R extends com.google.android.gms.common.api.Result> r1 = r5.zac     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            java.lang.String r1 = "Cannot call then() and andFinally() on the same TransformedResult."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> L2c
            r5.zaa = r6     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.common.api.internal.zada r6 = new com.google.android.gms.common.api.internal.zada     // Catch: java.lang.Throwable -> L2c
            java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> r1 = r5.zag     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            r5.zab = r6     // Catch: java.lang.Throwable -> L2c
            r5.zak()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return r6
        L2c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r6
    }

    public final void zah() {
            r1 = this;
            r0 = 0
            r1.zac = r0
            return
    }

    public final void zai(com.google.android.gms.common.api.PendingResult<?> r2) {
            r1 = this;
            java.lang.Object r0 = r1.zae
            monitor-enter(r0)
            r1.zad = r2     // Catch: java.lang.Throwable -> La
            r1.zak()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }
}
