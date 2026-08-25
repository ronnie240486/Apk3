package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zab extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.common.internal.service.zah, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public zab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r7, android.os.Looper r8, com.google.android.gms.common.internal.ClientSettings r9, com.google.android.gms.common.api.Api.ApiOptions.NoOptions r10, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r11, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r12) {
            r6 = this;
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r10 = (com.google.android.gms.common.api.Api.ApiOptions.NoOptions) r10
            com.google.android.gms.common.internal.service.zah r10 = new com.google.android.gms.common.internal.service.zah
            r0 = r10
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r10
    }
}
