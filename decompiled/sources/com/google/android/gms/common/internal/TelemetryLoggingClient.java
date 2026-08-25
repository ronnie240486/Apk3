package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public interface TelemetryLoggingClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.internal.TelemetryLoggingOptions> {
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> log(@androidx.annotation.NonNull com.google.android.gms.common.internal.TelemetryData r1);
}
