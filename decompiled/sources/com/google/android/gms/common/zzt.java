package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt implements android.os.Parcelable.Creator<com.google.android.gms.common.zzs> {
    public zzt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.zzs createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3b
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 1
            if (r6 == r7) goto L36
            r7 = 2
            if (r6 == r7) goto L31
            r7 = 3
            if (r6 == r7) goto L2c
            r7 = 4
            if (r6 == r7) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L9
        L27:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r9, r5)
            goto L9
        L2c:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r9, r5)
            goto L9
        L31:
            android.os.IBinder r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r9, r5)
            goto L9
        L36:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r5)
            goto L9
        L3b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.zzs r9 = new com.google.android.gms.common.zzs
            r9.<init>(r3, r4, r1, r2)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.zzs[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.zzs[] r1 = new com.google.android.gms.common.zzs[r1]
            return r1
    }
}
