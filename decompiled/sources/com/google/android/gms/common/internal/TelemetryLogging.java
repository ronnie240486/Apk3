package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class TelemetryLogging {
    private TelemetryLogging() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(@androidx.annotation.NonNull android.content.Context r1) {
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = getClient(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.google.android.gms.common.internal.TelemetryLoggingOptions r2) {
            com.google.android.gms.common.internal.service.zao r0 = new com.google.android.gms.common.internal.service.zao
            r0.<init>(r1, r2)
            return r0
    }
}
