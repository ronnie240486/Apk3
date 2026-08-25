package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zacc extends com.google.android.gms.common.api.internal.zap {
    private com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zad;

    private zacc(com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r1 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1.<init>(r2, r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r1.zad = r0
            java.lang.String r0 = "GmsAvailabilityHelper"
            r2.addCallback(r0, r1)
            return
    }

    public static com.google.android.gms.common.api.internal.zacc zaa(@androidx.annotation.NonNull android.app.Activity r2) {
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r2)
            java.lang.Class<com.google.android.gms.common.api.internal.zacc> r0 = com.google.android.gms.common.api.internal.zacc.class
            java.lang.String r1 = "GmsAvailabilityHelper"
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r2.getCallbackOrNull(r1, r0)
            com.google.android.gms.common.api.internal.zacc r0 = (com.google.android.gms.common.api.internal.zacc) r0
            if (r0 == 0) goto L24
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2 = r0.zad
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            boolean r2 = r2.isComplete()
            if (r2 == 0) goto L23
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            r0.zad = r2
        L23:
            return r0
        L24:
            com.google.android.gms.common.api.internal.zacc r0 = new com.google.android.gms.common.api.internal.zacc
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
            r3 = this;
            super.onDestroy()
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r3.zad
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "Host activity was destroyed before Google Play services could be made available."
            r1.<init>(r2)
            r0.trySetException(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(com.google.android.gms.common.ConnectionResult r5, int r6) {
            r4 = this;
            java.lang.String r6 = r5.getErrorMessage()
            if (r6 != 0) goto L8
            java.lang.String r6 = "Error connecting to Google Play services"
        L8:
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r4.zad
            com.google.android.gms.common.api.ApiException r1 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            int r3 = r5.getErrorCode()
            r2.<init>(r5, r6, r3)
            r1.<init>(r2)
            r0.setException(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
            r4 = this;
            com.google.android.gms.common.api.internal.LifecycleFragment r0 = r4.mLifecycleFragment
            android.app.Activity r0 = r0.getLifecycleActivity()
            if (r0 != 0) goto L1a
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r4.zad
            com.google.android.gms.common.api.ApiException r1 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = 8
            r2.<init>(r3)
            r1.<init>(r2)
            r0.trySetException(r1)
            return
        L1a:
            com.google.android.gms.common.GoogleApiAvailability r1 = r4.zac
            int r0 = r1.isGooglePlayServicesAvailable(r0)
            r1 = 0
            if (r0 != 0) goto L29
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r4.zad
            r0.trySetResult(r1)
            return
        L29:
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2 = r4.zad
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            boolean r2 = r2.isComplete()
            if (r2 != 0) goto L3e
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r2.<init>(r0, r1)
            r0 = 0
            r4.zah(r2, r0)
        L3e:
            return
    }

    public final com.google.android.gms.tasks.Task<java.lang.Void> zad() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r1.zad
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }
}
