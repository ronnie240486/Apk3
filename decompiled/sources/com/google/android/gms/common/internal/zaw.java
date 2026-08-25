package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class zaw implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.zav> {
    public zaw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zav createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r4 = 0
            r7 = 0
            r8 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4e
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L48
            r3 = 2
            if (r2 == r3) goto L42
            r3 = 3
            if (r2 == r3) goto L38
            r3 = 4
            if (r2 == r3) goto L32
            r3 = 5
            if (r2 == r3) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto Lb
        L2c:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            r8 = r1
            goto Lb
        L32:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            r7 = r1
            goto Lb
        L38:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r2 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            com.google.android.gms.common.ConnectionResult r1 = (com.google.android.gms.common.ConnectionResult) r1
            r6 = r1
            goto Lb
        L42:
            android.os.IBinder r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r10, r1)
            r5 = r1
            goto Lb
        L48:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            r4 = r1
            goto Lb
        L4e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.internal.zav r10 = new com.google.android.gms.common.internal.zav
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.zav[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.zav[] r1 = new com.google.android.gms.common.internal.zav[r1]
            return r1
    }
}
