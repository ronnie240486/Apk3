package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zag<ResultT> extends com.google.android.gms.common.api.internal.zac {
    private final com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api.AnyClient, ResultT> zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource<ResultT> zab;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zad;

    public zag(int r1, com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api.AnyClient, ResultT> r2, com.google.android.gms.tasks.TaskCompletionSource<ResultT> r3, com.google.android.gms.common.api.internal.StatusExceptionMapper r4) {
            r0 = this;
            r0.<init>(r1)
            r0.zab = r3
            r0.zaa = r2
            r0.zad = r4
            r3 = 2
            if (r1 != r3) goto L1b
            boolean r1 = r2.shouldAutoResolveMissingFeatures()
            if (r1 != 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Best-effort write calls cannot pass methods that should auto-resolve missing features."
            r1.<init>(r2)
            throw r1
        L1b:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq<?> r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api$AnyClient, ResultT> r1 = r0.zaa
            boolean r1 = r1.shouldAutoResolveMissingFeatures()
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @androidx.annotation.Nullable
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq<?> r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api$AnyClient, ResultT> r1 = r0.zaa
            com.google.android.gms.common.Feature[] r1 = r1.zab()
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource<ResultT> r0 = r2.zab
            com.google.android.gms.common.api.internal.StatusExceptionMapper r1 = r2.zad
            java.lang.Exception r3 = r1.getException(r3)
            r0.trySetException(r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<ResultT> r0 = r1.zab
            r0.trySetException(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq<?> r3) throws android.os.DeadObjectException {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api$AnyClient, ResultT> r0 = r2.zaa     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> L13 android.os.DeadObjectException -> L1c
            com.google.android.gms.common.api.Api$Client r3 = r3.zaf()     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> L13 android.os.DeadObjectException -> L1c
            com.google.android.gms.tasks.TaskCompletionSource<ResultT> r1 = r2.zab     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> L13 android.os.DeadObjectException -> L1c
            r0.doExecute(r3, r1)     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> L13 android.os.DeadObjectException -> L1c
            return
        Lc:
            r3 = move-exception
            com.google.android.gms.tasks.TaskCompletionSource<ResultT> r0 = r2.zab
            r0.trySetException(r3)
            return
        L13:
            r3 = move-exception
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.internal.zai.zah(r3)
            r2.zad(r3)
            return
        L1c:
            r3 = move-exception
            throw r3
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaad r2, boolean r3) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<ResultT> r0 = r1.zab
            r2.zad(r0, r3)
            return
    }
}
