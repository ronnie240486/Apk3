package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getVersion", id = 1)
    private final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBatchPeriodMillis", id = 4)
    private final int zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int zze;

    static {
            com.google.android.gms.common.internal.zzai r0 = new com.google.android.gms.common.internal.zzai
            r0.<init>()
            com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public RootTelemetryConfiguration(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getBatchPeriodMillis() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getVersion() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            int r0 = r2.getVersion()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            boolean r0 = r2.getMethodInvocationTelemetryEnabled()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            boolean r0 = r2.getMethodTimingTelemetryEnabled()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            int r0 = r2.getBatchPeriodMillis()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            int r0 = r2.getMaxMethodInvocationsInBatch()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
