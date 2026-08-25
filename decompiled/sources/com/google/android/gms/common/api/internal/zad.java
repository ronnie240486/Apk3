package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
abstract class zad<T> extends com.google.android.gms.common.api.internal.zac {
    public final com.google.android.gms.tasks.TaskCompletionSource<T> zaa;

    public zad(int r1, com.google.android.gms.tasks.TaskCompletionSource<T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zaa = r2
            return
    }

    public abstract void zac(com.google.android.gms.common.api.internal.zabq<?> r1) throws android.os.RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource<T> r0 = r2.zaa
            com.google.android.gms.common.api.ApiException r1 = new com.google.android.gms.common.api.ApiException
            r1.<init>(r3)
            r0.trySetException(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@androidx.annotation.NonNull java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<T> r0 = r1.zaa
            r0.trySetException(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq<?> r2) throws android.os.DeadObjectException {
            r1 = this;
            r1.zac(r2)     // Catch: java.lang.RuntimeException -> L4 android.os.RemoteException -> Lb android.os.DeadObjectException -> L14
            return
        L4:
            r2 = move-exception
            com.google.android.gms.tasks.TaskCompletionSource<T> r0 = r1.zaa
            r0.trySetException(r2)
            return
        Lb:
            r2 = move-exception
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.zai.zah(r2)
            r1.zad(r2)
            return
        L14:
            r2 = move-exception
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.zai.zah(r2)
            r1.zad(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            return
    }
}
