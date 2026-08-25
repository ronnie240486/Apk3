package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r4 = 0
            r5 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L53
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L4d
            r3 = 2
            if (r2 == r3) goto L47
            r3 = 3
            if (r2 == r3) goto L3d
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
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r2 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            com.google.android.gms.common.ConnectionResult r1 = (com.google.android.gms.common.ConnectionResult) r1
            r8 = r1
            goto Lb
        L3d:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r7 = r1
            goto Lb
        L47:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            r6 = r1
            goto Lb
        L4d:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            r5 = r1
            goto Lb
        L53:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.api.Status r10 = new com.google.android.gms.common.api.Status
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.api.Status[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.Status[] r1 = new com.google.android.gms.common.api.Status[r1]
            return r1
    }
}
