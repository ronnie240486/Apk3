package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.common.Feature> {
    public zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.Feature createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r3 = -1
        L8:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L32
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 1
            if (r6 == r7) goto L2d
            r7 = 2
            if (r6 == r7) goto L28
            r7 = 3
            if (r6 == r7) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L8
        L23:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r9, r5)
            goto L8
        L28:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L8
        L2d:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r5)
            goto L8
        L32:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.Feature r9 = new com.google.android.gms.common.Feature
            r9.<init>(r1, r2, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.Feature[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            return r1
    }
}
