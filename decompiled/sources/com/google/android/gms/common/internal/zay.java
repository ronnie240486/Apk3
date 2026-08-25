package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zay implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.zax> {
    public zay() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zax createFromParcel(android.os.Parcel r9) {
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
            if (r6 == r7) goto L35
            r7 = 3
            if (r6 == r7) goto L30
            r7 = 4
            if (r6 == r7) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L9
        L27:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r9, r5, r4)
            com.google.android.gms.common.api.Scope[] r4 = (com.google.android.gms.common.api.Scope[]) r4
            goto L9
        L30:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L35:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L3a:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L3f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.internal.zax r9 = new com.google.android.gms.common.internal.zax
            r9.<init>(r1, r2, r3, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.zax[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.zax[] r1 = new com.google.android.gms.common.internal.zax[r1]
            return r1
    }
}
