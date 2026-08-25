package com.google.android.gms.common.internal;

import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class GmsClient<T extends android.os.IInterface> extends com.google.android.gms.common.internal.BaseGmsClient<T> implements com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.internal.zaj {

    @androidx.annotation.Nullable
    private static volatile java.util.concurrent.Executor zaa;
    private final com.google.android.gms.common.internal.ClientSettings zab;
    private final java.util.Set<com.google.android.gms.common.api.Scope> zac;

    @androidx.annotation.Nullable
    private final android.accounts.Account zad;

    @com.google.android.gms.common.annotation.KeepForSdk
    public GmsClient(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r13, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks r14, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener r15) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            com.google.android.gms.common.api.internal.ConnectionCallbacks r14 = (com.google.android.gms.common.api.internal.ConnectionCallbacks) r14
            java.lang.Object r15 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r15 = (com.google.android.gms.common.api.internal.OnConnectionFailedListener) r15
            r0 = 0
            if (r14 != 0) goto L19
            r6 = r0
            goto L1f
        L19:
            com.google.android.gms.common.internal.zah r1 = new com.google.android.gms.common.internal.zah
            r1.<init>(r14)
            r6 = r1
        L1f:
            if (r15 != 0) goto L23
            r7 = r0
            goto L29
        L23:
            com.google.android.gms.common.internal.zai r14 = new com.google.android.gms.common.internal.zai
            r14.<init>(r15)
            r7 = r14
        L29:
            java.lang.String r8 = r13.zac()
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.zab = r13
            android.accounts.Account r10 = r13.getAccount()
            r9.zad = r10
            java.util.Set r10 = r13.getAllRequestedScopes()
            java.util.Set r10 = r9.zaa(r10)
            r9.zac = r10
            return
    }

    private final java.util.Set<com.google.android.gms.common.api.Scope> zaa(@androidx.annotation.NonNull java.util.Set<com.google.android.gms.common.api.Scope> r3) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Scope r1 = (com.google.android.gms.common.api.Scope) r1
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L17
            goto L4
        L17:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expanding scopes is not permitted, use implied scopes instead"
            r3.<init>(r0)
            throw r3
        L1f:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.Nullable
    public final android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zad
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.Nullable
    public final void getBindServiceExecutor() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r1 = this;
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r1.zac
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
            r1 = this;
            boolean r0 = r1.requiresSignIn()
            if (r0 == 0) goto L9
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r1.zac
            goto Ld
        L9:
            java.util.Set r0 = java.util.Collections.emptySet()
        Ld:
            return r0
    }
}
