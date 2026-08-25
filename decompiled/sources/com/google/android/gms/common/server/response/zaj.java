package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaj implements android.os.Parcelable.Creator<com.google.android.gms.common.server.response.FastJsonResponse.Field> {
    public zaj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.server.response.FastJsonResponse.Field createFromParcel(android.os.Parcel r14) {
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            r1 = 0
            r2 = 0
            r9 = r1
            r11 = r9
            r12 = r11
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
        Lf:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L5e
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L58;
                case 2: goto L52;
                case 3: goto L4c;
                case 4: goto L46;
                case 5: goto L40;
                case 6: goto L3a;
                case 7: goto L34;
                case 8: goto L2e;
                case 9: goto L24;
                default: goto L20;
            }
        L20:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto Lf
        L24:
            android.os.Parcelable$Creator<com.google.android.gms.common.server.converter.zaa> r2 = com.google.android.gms.common.server.converter.zaa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            com.google.android.gms.common.server.converter.zaa r1 = (com.google.android.gms.common.server.converter.zaa) r1
            r12 = r1
            goto Lf
        L2e:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            r11 = r1
            goto Lf
        L34:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r10 = r1
            goto Lf
        L3a:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r14, r1)
            r9 = r1
            goto Lf
        L40:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r14, r1)
            r8 = r1
            goto Lf
        L46:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r7 = r1
            goto Lf
        L4c:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r14, r1)
            r6 = r1
            goto Lf
        L52:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r5 = r1
            goto Lf
        L58:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r1)
            r4 = r1
            goto Lf
        L5e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r14 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.server.response.FastJsonResponse.Field[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$Field[] r1 = new com.google.android.gms.common.server.response.FastJsonResponse.Field[r1]
            return r1
    }
}
