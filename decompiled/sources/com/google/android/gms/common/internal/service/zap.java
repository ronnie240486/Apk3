package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zap extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.common.internal.service.zai> {
    private final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa;

    public zap(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.internal.TelemetryLoggingOptions r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 270(0x10e, float:3.78E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zaa = r11
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.Nullable
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.service.zai
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.common.internal.service.zai r3 = (com.google.android.gms.common.internal.service.zai) r3
            goto L18
        L12:
            com.google.android.gms.common.internal.service.zai r0 = new com.google.android.gms.common.internal.service.zai
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.internal.base.zad.zab
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
            r1 = this;
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = r1.zaa
            android.os.Bundle r0 = r0.zaa()
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 203400000(0xc1fa340, float:1.2298041E-31)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    public final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    public final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.telemetry.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
            r1 = this;
            r0 = 1
            return r0
    }
}
