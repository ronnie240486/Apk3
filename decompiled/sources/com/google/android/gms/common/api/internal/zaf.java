package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaf extends com.google.android.gms.common.api.internal.zad<java.lang.Void> {
    public final com.google.android.gms.common.api.internal.zaci zab;

    public zaf(com.google.android.gms.common.api.internal.zaci r2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r3) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r3)
            r1.zab = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq<?> r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zaci r1 = r0.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r1 = r1.zaa
            boolean r1 = r1.zab()
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @androidx.annotation.Nullable
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq<?> r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zaci r1 = r0.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r1 = r1.zaa
            com.google.android.gms.common.Feature[] r1 = r1.getRequiredFeatures()
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabq<?> r4) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.common.api.internal.zaci r0 = r3.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r0 = r0.zaa
            com.google.android.gms.common.api.Api$Client r1 = r4.zaf()
            com.google.android.gms.tasks.TaskCompletionSource<T> r2 = r3.zaa
            r0.registerListener(r1, r2)
            com.google.android.gms.common.api.internal.zaci r0 = r3.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api$AnyClient, ?> r0 = r0.zaa
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            if (r0 == 0) goto L20
            java.util.Map r4 = r4.zah()
            com.google.android.gms.common.api.internal.zaci r1 = r3.zab
            r4.put(r0, r1)
        L20:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            return
    }
}
