package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GetServiceRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({9})
public class GetServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.GetServiceRequest> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public android.os.IBinder zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public com.google.android.gms.common.api.Scope[] zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public android.os.Bundle zzg;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public android.accounts.Account zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    public com.google.android.gms.common.Feature[] zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 11)
    public com.google.android.gms.common.Feature[] zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 12)
    public boolean zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "0", id = 13)
    public int zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    public boolean zzm;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    private java.lang.String zzn;

    static {
            com.google.android.gms.common.internal.zzm r0 = new com.google.android.gms.common.internal.zzm
            r0.<init>()
            com.google.android.gms.common.internal.GetServiceRequest.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public GetServiceRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.common.api.Scope[] r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) android.os.Bundle r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) android.accounts.Account r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) com.google.android.gms.common.Feature[] r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) com.google.android.gms.common.Feature[] r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) boolean r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) int r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) boolean r13, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) java.lang.String r14) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            java.lang.String r2 = "com.google.android.gms"
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L14
            r0.zzd = r2
            goto L16
        L14:
            r0.zzd = r4
        L16:
            r2 = 2
            if (r1 >= r2) goto L28
            if (r5 == 0) goto L24
            com.google.android.gms.common.internal.IAccountAccessor r1 = com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(r5)
            android.accounts.Account r1 = com.google.android.gms.common.internal.AccountAccessor.getAccountBinderSafe(r1)
            goto L25
        L24:
            r1 = 0
        L25:
            r0.zzh = r1
            goto L2c
        L28:
            r0.zze = r5
            r0.zzh = r8
        L2c:
            r0.zzf = r6
            r0.zzg = r7
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            r0.zzl = r12
            r0.zzm = r13
            r0.zzn = r14
            return
    }

    public GetServiceRequest(int r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 6
            r1.zza = r0
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r1.zzc = r0
            r1.zzb = r2
            r2 = 1
            r1.zzk = r2
            r1.zzn = r3
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getExtraArgs() {
            r1 = this;
            android.os.Bundle r0 = r1.zzg
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.common.internal.zzm.zza(r0, r1, r2)
            return
    }

    @androidx.annotation.Nullable
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzn
            return r0
    }
}
