package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zan extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.common.internal.service.zap, com.google.android.gms.common.internal.TelemetryLoggingOptions> {
    public zan() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.internal.TelemetryLoggingOptions r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r7 = this;
            r4 = r11
            com.google.android.gms.common.internal.TelemetryLoggingOptions r4 = (com.google.android.gms.common.internal.TelemetryLoggingOptions) r4
            com.google.android.gms.common.internal.service.zap r11 = new com.google.android.gms.common.internal.service.zap
            r0 = r11
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
    }
}
