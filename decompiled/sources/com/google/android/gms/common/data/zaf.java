package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class zaf implements android.os.Parcelable.Creator<com.google.android.gms.common.data.DataHolder> {
    public zaf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.data.DataHolder createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r5 = r2
            r6 = r5
            r8 = r6
            r4 = 0
            r7 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4f
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L49
            r3 = 2
            if (r2 == r3) goto L3f
            r3 = 3
            if (r2 == r3) goto L39
            r3 = 4
            if (r2 == r3) goto L33
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L2d
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto Lb
        L2d:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            r4 = r1
            goto Lb
        L33:
            android.os.Bundle r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r10, r1)
            r8 = r1
            goto Lb
        L39:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            r7 = r1
            goto Lb
        L3f:
            android.os.Parcelable$Creator r2 = android.database.CursorWindow.CREATOR
            java.lang.Object[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r10, r1, r2)
            android.database.CursorWindow[] r1 = (android.database.CursorWindow[]) r1
            r6 = r1
            goto Lb
        L49:
            java.lang.String[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r10, r1)
            r5 = r1
            goto Lb
        L4f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.data.DataHolder r10 = new com.google.android.gms.common.data.DataHolder
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r10.zad()
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.data.DataHolder[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.data.DataHolder[] r1 = new com.google.android.gms.common.data.DataHolder[r1]
            return r1
    }
}
