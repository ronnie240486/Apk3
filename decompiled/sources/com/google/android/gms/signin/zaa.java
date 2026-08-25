package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaa extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.SignInOptions> {
    public zaa() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.ClientSettings r11, com.google.android.gms.signin.SignInOptions r12, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r13, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r14) {
            r8 = this;
            com.google.android.gms.signin.SignInOptions r12 = (com.google.android.gms.signin.SignInOptions) r12
            com.google.android.gms.signin.internal.SignInClientImpl r12 = new com.google.android.gms.signin.internal.SignInClientImpl
            android.os.Bundle r5 = com.google.android.gms.signin.internal.SignInClientImpl.createBundleFromClientSettings(r11)
            r3 = 1
            r0 = r12
            r1 = r9
            r2 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
    }
}
