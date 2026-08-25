package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FieldMappingDictionaryEntryCreator")
public final class zal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zal> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zab;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final java.util.ArrayList<com.google.android.gms.common.server.response.zam> zac;

    static {
            com.google.android.gms.common.server.response.zap r0 = new com.google.android.gms.common.server.response.zap
            r0.<init>()
            com.google.android.gms.common.server.response.zal.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zal(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.util.ArrayList<com.google.android.gms.common.server.response.zam> r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public zal(java.lang.String r5, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.zaa = r0
            r4.zab = r5
            if (r6 != 0) goto Lc
            r5 = 0
            goto L34
        Lc:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.common.server.response.zam r2 = new com.google.android.gms.common.server.response.zam
            java.lang.Object r3 = r6.get(r1)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r3
            r2.<init>(r1, r3)
            r5.add(r2)
            goto L19
        L34:
            r4.zac = r5
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zaa
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.String r0 = r3.zab
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.util.ArrayList<com.google.android.gms.common.server.response.zam> r0 = r3.zac
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
