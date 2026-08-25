package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zam> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> zac;

    static {
            com.google.android.gms.common.server.response.zak r0 = new com.google.android.gms.common.server.response.zak
            r0.<init>()
            com.google.android.gms.common.server.response.zam.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zam(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public zam(java.lang.String r2, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            java.lang.String r1 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field<?, ?> r1 = r4.zac
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
