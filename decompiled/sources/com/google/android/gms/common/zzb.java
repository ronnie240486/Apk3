package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.common.ConnectionResult> {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = 0
            r4 = 0
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
            if (r6 == r7) goto L2c
            r7 = 4
            if (r6 == r7) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L9
        L27:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r5)
            goto L9
        L2c:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L9
        L35:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L3a:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L3f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.ConnectionResult r9 = new com.google.android.gms.common.ConnectionResult
            r9.<init>(r3, r4, r1, r2)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.ConnectionResult[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.ConnectionResult[] r1 = new com.google.android.gms.common.ConnectionResult[r1]
            return r1
    }
}
