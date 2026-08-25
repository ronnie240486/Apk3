package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zan implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.MethodInvocation> {
    public zan() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.internal.MethodInvocation createFromParcel(android.os.Parcel r20) {
            r19 = this;
            r0 = r20
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r20)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = -1
            r15 = r2
            r16 = r15
            r11 = r3
            r13 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r17 = 0
            r18 = -1
        L17:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L65
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r20)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L5f;
                case 2: goto L59;
                case 3: goto L53;
                case 4: goto L4d;
                case 5: goto L47;
                case 6: goto L41;
                case 7: goto L3a;
                case 8: goto L33;
                case 9: goto L2c;
                default: goto L28;
            }
        L28:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L17
        L2c:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r18 = r2
            goto L17
        L33:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r17 = r2
            goto L17
        L3a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r16 = r2
            goto L17
        L41:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L17
        L47:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r13 = r2
            goto L17
        L4d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r11 = r2
            goto L17
        L53:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r10 = r2
            goto L17
        L59:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r9 = r2
            goto L17
        L5f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r8 = r2
            goto L17
        L65:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.common.internal.MethodInvocation r0 = new com.google.android.gms.common.internal.MethodInvocation
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.MethodInvocation[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.MethodInvocation[] r1 = new com.google.android.gms.common.internal.MethodInvocation[r1]
            return r1
    }
}
