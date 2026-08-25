package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ConverterWrapperCreator")
public final class zaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.zaa> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStringToIntConverter", id = 2)
    private final com.google.android.gms.common.server.converter.StringToIntConverter zab;

    static {
            com.google.android.gms.common.server.converter.zab r0 = new com.google.android.gms.common.server.converter.zab
            r0.<init>()
            com.google.android.gms.common.server.converter.zaa.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zaa(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.common.server.converter.StringToIntConverter r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    private zaa(com.google.android.gms.common.server.converter.StringToIntConverter r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            return
    }

    public static com.google.android.gms.common.server.converter.zaa zaa(com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> r1) {
            boolean r0 = r1 instanceof com.google.android.gms.common.server.converter.StringToIntConverter
            if (r0 == 0) goto Lc
            com.google.android.gms.common.server.converter.zaa r0 = new com.google.android.gms.common.server.converter.zaa
            com.google.android.gms.common.server.converter.StringToIntConverter r1 = (com.google.android.gms.common.server.converter.StringToIntConverter) r1
            r0.<init>(r1)
            return r0
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported safe parcelable field converter class."
            r1.<init>(r0)
            throw r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.common.server.converter.StringToIntConverter r1 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> zab() {
            r2 = this;
            com.google.android.gms.common.server.converter.StringToIntConverter r0 = r2.zab
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "There was no converter wrapped in this ConverterWrapper."
            r0.<init>(r1)
            throw r0
    }
}
