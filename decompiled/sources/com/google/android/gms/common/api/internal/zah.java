package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zah extends com.google.android.gms.common.api.internal.zad<java.lang.Boolean> {
    public final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> zab;

    public zah(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> r2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r3) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r3)
            r1.zab = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq<?> r2) {
            r1 = this;
            java.util.Map r2 = r2.zah()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?> r0 = r1.zab
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.common.api.internal.zaci r2 = (com.google.android.gms.common.api.internal.zaci) r2
            if (r2 == 0) goto L18
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r2 = r2.zaa
            boolean r2 = r2.zab()
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @androidx.annotation.Nullable
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq<?> r2) {
            r1 = this;
            java.util.Map r2 = r2.zah()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?> r0 = r1.zab
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.common.api.internal.zaci r2 = (com.google.android.gms.common.api.internal.zaci) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r2 = r2.zaa
            com.google.android.gms.common.Feature[] r2 = r2.getRequiredFeatures()
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabq<?> r4) throws android.os.RemoteException {
            r3 = this;
            java.util.Map r0 = r4.zah()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?> r1 = r3.zab
            java.lang.Object r0 = r0.remove(r1)
            com.google.android.gms.common.api.internal.zaci r0 = (com.google.android.gms.common.api.internal.zaci) r0
            if (r0 == 0) goto L1f
            com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r1 = r0.zab
            com.google.android.gms.common.api.Api$Client r4 = r4.zaf()
            com.google.android.gms.tasks.TaskCompletionSource<T> r2 = r3.zaa
            r1.unregisterListener(r4, r2)
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r4 = r0.zaa
            r4.clearListener()
            return
        L1f:
            com.google.android.gms.tasks.TaskCompletionSource<T> r4 = r3.zaa
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.trySetResult(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            return
    }
}
