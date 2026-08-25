package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzai implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> {
    public zzai() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.internal.RootTelemetryConfiguration createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L49
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 1
            if (r2 == r8) goto L43
            r8 = 2
            if (r2 == r8) goto L3d
            r8 = 3
            if (r2 == r8) goto L37
            r8 = 4
            if (r2 == r8) goto L31
            r8 = 5
            if (r2 == r8) goto L2b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto La
        L2b:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            r7 = r1
            goto La
        L31:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            r6 = r1
            goto La
        L37:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            r5 = r1
            goto La
        L3d:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            r4 = r1
            goto La
        L43:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            r3 = r1
            goto La
        L49:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r10 = new com.google.android.gms.common.internal.RootTelemetryConfiguration
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.RootTelemetryConfiguration[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration[] r1 = new com.google.android.gms.common.internal.RootTelemetryConfiguration[r1]
            return r1
    }
}
