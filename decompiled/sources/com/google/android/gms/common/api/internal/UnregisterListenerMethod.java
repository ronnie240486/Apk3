package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> zaa;

    @com.google.android.gms.common.annotation.KeepForSdk
    public UnregisterListenerMethod(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<L> r0 = r1.zaa
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract void unregisterListener(@androidx.annotation.NonNull A r1, @androidx.annotation.NonNull com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r2) throws android.os.RemoteException;
}
