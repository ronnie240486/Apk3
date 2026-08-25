package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzq> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean zza;

    @javax.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int zzc;

    static {
            com.google.android.gms.common.zzr r0 = new com.google.android.gms.common.zzr
            r0.<init>()
            com.google.android.gms.common.zzq.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzq(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            int r1 = com.google.android.gms.common.zzp.zza(r3)
            int r1 = r1 + (-1)
            r0.zzc = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            boolean r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            java.lang.String r0 = r3.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            int r0 = r3.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    @javax.annotation.Nullable
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final boolean zzb() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zzc
            int r0 = com.google.android.gms.common.zzp.zza(r0)
            return r0
    }
}
