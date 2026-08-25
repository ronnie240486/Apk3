package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zab implements android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.zaa> {
    public zab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.server.converter.zaa createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L2c
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L27
            r5 = 2
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L6
        L1e:
            android.os.Parcelable$Creator<com.google.android.gms.common.server.converter.StringToIntConverter> r2 = com.google.android.gms.common.server.converter.StringToIntConverter.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r7, r3, r2)
            com.google.android.gms.common.server.converter.StringToIntConverter r2 = (com.google.android.gms.common.server.converter.StringToIntConverter) r2
            goto L6
        L27:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r7, r3)
            goto L6
        L2c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r0)
            com.google.android.gms.common.server.converter.zaa r7 = new com.google.android.gms.common.server.converter.zaa
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.server.converter.zaa[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.server.converter.zaa[] r1 = new com.google.android.gms.common.server.converter.zaa[r1]
            return r1
    }
}
