package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ConnectionTelemetryConfiguration> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRootTelemetryConfiguration", id = 1)
    private final com.google.android.gms.common.internal.RootTelemetryConfiguration zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean zzc;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    private final int[] zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int zze;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    private final int[] zzf;

    static {
            com.google.android.gms.common.internal.zzl r0 = new com.google.android.gms.common.internal.zzl
            r0.<init>()
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@androidx.annotation.NonNull @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.common.internal.RootTelemetryConfiguration r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r5, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int[] r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMaxMethodInvocationsLogged() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public int[] getMethodInvocationMethodKeyAllowlist() {
            r1 = this;
            int[] r0 = r1.zzd
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public int[] getMethodInvocationMethodKeyDisallowlist() {
            r1 = this;
            int[] r0 = r1.zzf
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

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.getMethodInvocationTelemetryEnabled()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.getMethodTimingTelemetryEnabled()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            int[] r6 = r4.getMethodInvocationMethodKeyAllowlist()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r5, r1, r6, r3)
            int r6 = r4.getMaxMethodInvocationsLogged()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int[] r6 = r4.getMethodInvocationMethodKeyDisallowlist()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.internal.RootTelemetryConfiguration zza() {
            r1 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r1.zza
            return r0
    }
}
