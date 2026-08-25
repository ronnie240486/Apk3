package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.ApiOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zabv<O extends com.google.android.gms.common.api.Api.ApiOptions> extends com.google.android.gms.common.api.internal.zaag {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.GoogleApi<O> zaa;

    public zabv(com.google.android.gms.common.api.GoogleApi<O> r2) {
            r1 = this;
            java.lang.String r0 = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."
            r1.<init>(r0)
            r1.zaa = r2
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@androidx.annotation.NonNull T r2) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r1.zaa
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r0.doRead(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(@androidx.annotation.NonNull T r2) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r1.zaa
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r0.doWrite(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r1.zaa
            android.content.Context r0 = r0.getApplicationContext()
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r1.zaa
            android.os.Looper r0 = r0.getLooper()
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            return
    }
}
