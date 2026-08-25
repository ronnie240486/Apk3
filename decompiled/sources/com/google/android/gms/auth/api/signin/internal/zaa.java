package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> {
    public zaa() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r8)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L32
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r8)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            r6 = 1
            if (r5 == r6) goto L2d
            r6 = 2
            if (r5 == r6) goto L28
            r6 = 3
            if (r5 == r6) goto L23
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r8, r4)
            goto L8
        L23:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r8, r4)
            goto L8
        L28:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L2d:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r8, r4)
            goto L8
        L32:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r8, r0)
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r8 = new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable[] r1 = new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable[r1]
            return r1
    }
}
