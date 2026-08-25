package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zae implements android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.zac> {
    public zae() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.server.converter.zac createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r8)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L32
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 1
            if (r5 == r6) goto L2d
            r6 = 2
            if (r5 == r6) goto L28
            r6 = 3
            if (r5 == r6) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L8
        L23:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L28:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r8, r4)
            goto L8
        L2d:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L32:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r0)
            com.google.android.gms.common.server.converter.zac r8 = new com.google.android.gms.common.server.converter.zac
            r8.<init>(r1, r3, r2)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.server.converter.zac[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.server.converter.zac[] r1 = new com.google.android.gms.common.server.converter.zac[r1]
            return r1
    }
}
