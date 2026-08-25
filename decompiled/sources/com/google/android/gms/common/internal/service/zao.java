package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zao extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.internal.TelemetryLoggingOptions> implements com.google.android.gms.common.internal.TelemetryLoggingClient {
    public static final /* synthetic */ int zab = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.common.internal.service.zap> zac = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.common.internal.service.zap, com.google.android.gms.common.internal.TelemetryLoggingOptions> zad = null;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.internal.TelemetryLoggingOptions> zae = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.common.internal.service.zao.zac = r0
            com.google.android.gms.common.internal.service.zan r1 = new com.google.android.gms.common.internal.service.zan
            r1.<init>()
            com.google.android.gms.common.internal.service.zao.zad = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "ClientTelemetry.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.common.internal.service.zao.zae = r2
            return
    }

    public zao(android.content.Context r3, com.google.android.gms.common.internal.TelemetryLoggingOptions r4) {
            r2 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.common.internal.TelemetryLoggingOptions> r0 = com.google.android.gms.common.internal.service.zao.zae
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> log(com.google.android.gms.common.internal.TelemetryData r5) {
            r4 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.base.zad.zaa
            r3 = 0
            r1[r3] = r2
            r0.setFeatures(r1)
            r0.setAutoResolveMissingFeatures(r3)
            com.google.android.gms.common.internal.service.zam r1 = new com.google.android.gms.common.internal.service.zam
            r1.<init>(r5)
            r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r0.build()
            com.google.android.gms.tasks.Task r5 = r4.doBestEffortWrite(r5)
            return r5
    }
}
