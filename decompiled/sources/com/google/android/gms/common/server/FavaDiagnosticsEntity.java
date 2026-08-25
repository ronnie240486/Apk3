package com.google.android.gms.common.server;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.FavaDiagnosticsEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zac;

    static {
            com.google.android.gms.common.server.zaa r0 = new com.google.android.gms.common.server.zaa
            r0.<init>()
            com.google.android.gms.common.server.FavaDiagnosticsEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @androidx.annotation.NonNull @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public FavaDiagnosticsEntity(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zaa
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.String r0 = r3.zab
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            int r0 = r3.zac
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
