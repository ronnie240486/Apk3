package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.zzj> {
    public zzk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zzj createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = r2
            r4 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L43
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 1
            if (r6 == r7) goto L3e
            r7 = 2
            if (r6 == r7) goto L35
            r7 = 3
            if (r6 == r7) goto L30
            r7 = 4
            if (r6 == r7) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L9
        L27:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.ConnectionTelemetryConfiguration> r3 = com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r3)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r3 = (com.google.android.gms.common.internal.ConnectionTelemetryConfiguration) r3
            goto L9
        L30:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L35:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r2 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r9, r5, r2)
            com.google.android.gms.common.Feature[] r2 = (com.google.android.gms.common.Feature[]) r2
            goto L9
        L3e:
            android.os.Bundle r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r9, r5)
            goto L9
        L43:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.internal.zzj r9 = new com.google.android.gms.common.internal.zzj
            r9.<init>(r1, r2, r4, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.zzj[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.zzj[] r1 = new com.google.android.gms.common.internal.zzj[r1]
            return r1
    }
}
