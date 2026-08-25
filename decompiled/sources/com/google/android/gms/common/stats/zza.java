package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza implements android.os.Parcelable.Creator<com.google.android.gms.common.stats.WakeLockEvent> {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.stats.WakeLockEvent createFromParcel(android.os.Parcel r27) {
            r26 = this;
            r0 = r27
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r27)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = r2
            r16 = r9
            r22 = r16
            r12 = r5
            r14 = r12
            r15 = r14
            r19 = r15
            r20 = r19
            r24 = r20
            r8 = 0
            r11 = 0
            r13 = 0
            r18 = 0
            r21 = 0
            r25 = 0
        L22:
            int r2 = r27.dataPosition()
            if (r2 >= r1) goto L99
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r27)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L93;
                case 2: goto L8d;
                case 3: goto L33;
                case 4: goto L87;
                case 5: goto L81;
                case 6: goto L7b;
                case 7: goto L33;
                case 8: goto L74;
                case 9: goto L33;
                case 10: goto L6d;
                case 11: goto L67;
                case 12: goto L61;
                case 13: goto L5a;
                case 14: goto L53;
                case 15: goto L4c;
                case 16: goto L45;
                case 17: goto L3e;
                case 18: goto L37;
                default: goto L33;
            }
        L33:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L22
        L37:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r25 = r2
            goto L22
        L3e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r24 = r2
            goto L22
        L45:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r22 = r2
            goto L22
        L4c:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            r21 = r2
            goto L22
        L53:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r18 = r2
            goto L22
        L5a:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r20 = r2
            goto L22
        L61:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r15 = r2
            goto L22
        L67:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r11 = r2
            goto L22
        L6d:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r19 = r2
            goto L22
        L74:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r16 = r2
            goto L22
        L7b:
            java.util.ArrayList r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            r14 = r2
            goto L22
        L81:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r13 = r2
            goto L22
        L87:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r12 = r2
            goto L22
        L8d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            r9 = r2
            goto L22
        L93:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r8 = r2
            goto L22
        L99:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.common.stats.WakeLockEvent r0 = new com.google.android.gms.common.stats.WakeLockEvent
            r7 = r0
            r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r24, r25)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.stats.WakeLockEvent[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.stats.WakeLockEvent[] r1 = new com.google.android.gms.common.stats.WakeLockEvent[r1]
            return r1
    }
}
