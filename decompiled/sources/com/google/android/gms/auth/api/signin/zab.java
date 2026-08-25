package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class zab implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> {
    public zab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInAccount createFromParcel(android.os.Parcel r21) {
            r20 = this;
            r0 = r21
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r21)
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r14 = r4
            r7 = 0
        L1a:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L81
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r21)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L7b;
                case 2: goto L75;
                case 3: goto L6f;
                case 4: goto L69;
                case 5: goto L63;
                case 6: goto L59;
                case 7: goto L53;
                case 8: goto L4d;
                case 9: goto L46;
                case 10: goto L3d;
                case 11: goto L36;
                case 12: goto L2f;
                default: goto L2b;
            }
        L2b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L1a
        L2f:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r19 = r2
            goto L1a
        L36:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r18 = r2
            goto L1a
        L3d:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r0, r2, r3)
            r17 = r2
            goto L1a
        L46:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r16 = r2
            goto L1a
        L4d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r14 = r2
            goto L1a
        L53:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r13 = r2
            goto L1a
        L59:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L1a
        L63:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r11 = r2
            goto L1a
        L69:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r10 = r2
            goto L1a
        L6f:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r9 = r2
            goto L1a
        L75:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r8 = r2
            goto L1a
        L7b:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r7 = r2
            goto L1a
        L81:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInAccount[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInAccount[] r1 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount[r1]
            return r1
    }
}
