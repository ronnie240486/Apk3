package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zah implements android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zag> {
    public zah() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.signin.internal.zag createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L28
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L6
        L1e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r7, r3)
            goto L6
        L23:
            java.util.ArrayList r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r7, r3)
            goto L6
        L28:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r0)
            com.google.android.gms.signin.internal.zag r7 = new com.google.android.gms.signin.internal.zag
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.signin.internal.zag[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.signin.internal.zag[] r1 = new com.google.android.gms.signin.internal.zag[r1]
            return r1
    }
}
