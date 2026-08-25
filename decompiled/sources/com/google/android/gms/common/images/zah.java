package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zah implements android.os.Parcelable.Creator<com.google.android.gms.common.images.WebImage> {
    public zah() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.images.WebImage createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r4 = r2
            r2 = 0
            r3 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3f
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 1
            if (r6 == r7) goto L3a
            r7 = 2
            if (r6 == r7) goto L31
            r7 = 3
            if (r6 == r7) goto L2c
            r7 = 4
            if (r6 == r7) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L9
        L27:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L2c:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L31:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r4)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L9
        L3a:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L3f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.images.WebImage r9 = new com.google.android.gms.common.images.WebImage
            r9.<init>(r1, r4, r2, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.images.WebImage[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.images.WebImage[] r1 = new com.google.android.gms.common.images.WebImage[r1]
            return r1
    }
}
