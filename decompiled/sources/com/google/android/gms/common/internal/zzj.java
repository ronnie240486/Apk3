package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ConnectionInfoCreator")
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zzj> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public android.os.Bundle zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public com.google.android.gms.common.Feature[] zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "0", id = 3)
    public int zzc;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zzd;

    static {
            com.google.android.gms.common.internal.zzk r0 = new com.google.android.gms.common.internal.zzk
            r0.<init>()
            com.google.android.gms.common.internal.zzj.CREATOR = r0
            return
    }

    public zzj() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.os.Bundle r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.common.Feature[] r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.os.Bundle r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r2, r1, r3)
            com.google.android.gms.common.Feature[] r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r2, r1, r6, r3)
            int r1 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r1 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
