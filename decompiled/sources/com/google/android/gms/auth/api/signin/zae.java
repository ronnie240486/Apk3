package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class zae implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> {
    public zae() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions createFromParcel(android.os.Parcel r15) {
            r14 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r15)
            r1 = 0
            r2 = 0
            r5 = r2
            r6 = r5
            r10 = r6
            r11 = r10
            r12 = r11
            r13 = r12
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L10:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L69
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r15)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L63;
                case 2: goto L5b;
                case 3: goto L51;
                case 4: goto L4b;
                case 5: goto L45;
                case 6: goto L3f;
                case 7: goto L39;
                case 8: goto L33;
                case 9: goto L2b;
                case 10: goto L25;
                default: goto L21;
            }
        L21:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r15, r1)
            goto L10
        L25:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r13 = r1
            goto L10
        L2b:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r2 = com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR
            java.util.ArrayList r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r15, r1, r2)
            r12 = r1
            goto L10
        L33:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r11 = r1
            goto L10
        L39:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r15, r1)
            r10 = r1
            goto L10
        L3f:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r15, r1)
            r9 = r1
            goto L10
        L45:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r15, r1)
            r8 = r1
            goto L10
        L4b:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r15, r1)
            r7 = r1
            goto L10
        L51:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r15, r1, r2)
            android.accounts.Account r1 = (android.accounts.Account) r1
            r6 = r1
            goto L10
        L5b:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r2 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r15, r1, r2)
            r5 = r1
            goto L10
        L63:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r15, r1)
            r4 = r1
            goto L10
        L69:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r15, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r15 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInOptions[] r1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions[r1]
            return r1
    }
}
