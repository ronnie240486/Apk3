package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class RegisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder<L> zaa;

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.Feature[] zab;
    private final boolean zac;
    private final int zad;

    @com.google.android.gms.common.annotation.KeepForSdk
    public RegisterListenerMethod(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder<L> r1, @androidx.annotation.Nullable com.google.android.gms.common.Feature[] r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void clearListener() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder<L> r0 = r1.zaa
            r0.clear()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder<L> r0 = r1.zaa
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = r1.zab
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract void registerListener(@androidx.annotation.NonNull A r1, @androidx.annotation.NonNull com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2) throws android.os.RemoteException;

    public final int zaa() {
            r1 = this;
            int r0 = r1.zad
            return r0
    }

    public final boolean zab() {
            r1 = this;
            boolean r0 = r1.zac
            return r0
    }
}
