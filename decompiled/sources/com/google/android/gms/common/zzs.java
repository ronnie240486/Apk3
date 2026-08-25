package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzs> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final java.lang.String zza;

    @javax.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    private final com.google.android.gms.common.zzi zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean zzd;

    static {
            com.google.android.gms.common.zzt r0 = new com.google.android.gms.common.zzt
            r0.<init>()
            com.google.android.gms.common.zzs.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) @javax.annotation.Nullable android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r6) {
            r2 = this;
            java.lang.String r0 = "Could not unwrap certificate"
            java.lang.String r1 = "GoogleCertificatesQuery"
            r2.<init>()
            r2.zza = r3
            r3 = 0
            if (r4 != 0) goto Ld
            goto L2f
        Ld:
            com.google.android.gms.common.internal.zzz r4 = com.google.android.gms.common.internal.zzy.zzg(r4)     // Catch: android.os.RemoteException -> L2b
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.zzd()     // Catch: android.os.RemoteException -> L2b
            if (r4 != 0) goto L19
            r4 = r3
            goto L1f
        L19:
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            byte[] r4 = (byte[]) r4
        L1f:
            if (r4 == 0) goto L27
            com.google.android.gms.common.zzj r3 = new com.google.android.gms.common.zzj
            r3.<init>(r4)
            goto L2f
        L27:
            android.util.Log.e(r1, r0)
            goto L2f
        L2b:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
        L2f:
            r2.zzb = r3
            r2.zzc = r5
            r2.zzd = r6
            return
    }

    public zzs(java.lang.String r1, @javax.annotation.Nullable com.google.android.gms.common.zzi r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
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
            com.google.android.gms.common.zzi r0 = r3.zzb
            if (r0 != 0) goto L17
            java.lang.String r0 = "GoogleCertificatesQuery"
            java.lang.String r1 = "certificate binder is null"
            android.util.Log.w(r0, r1)
            r0 = 0
        L17:
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r0, r2)
            r0 = 3
            boolean r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r0, r1)
            r0 = 4
            boolean r1 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
