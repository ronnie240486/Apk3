package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzn extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzn> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAllowTestKeys", id = 2)
    private final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final android.content.Context zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIsChimeraPackage", id = 5)
    private final boolean zze;

    static {
            com.google.android.gms.common.zzo r0 = new com.google.android.gms.common.zzo
            r0.<init>()
            com.google.android.gms.common.zzn.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzn(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            r0.zzd = r1
            r0.zze = r5
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.zza
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            boolean r0 = r3.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            boolean r0 = r3.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            android.content.Context r0 = r3.zzd
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r0, r2)
            boolean r0 = r3.zze
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
