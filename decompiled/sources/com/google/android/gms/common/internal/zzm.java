package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.GetServiceRequest> {
    public zzm() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(com.google.android.gms.common.internal.GetServiceRequest r4, android.os.Parcel r5, int r6) {
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zza
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            int r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            int r1 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            java.lang.String r1 = r4.zzd
            r2 = 4
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.os.IBinder r1 = r4.zze
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r5, r2, r1, r3)
            com.google.android.gms.common.api.Scope[] r1 = r4.zzf
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r2, r1, r6, r3)
            android.os.Bundle r1 = r4.zzg
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r2, r1, r3)
            android.accounts.Account r1 = r4.zzh
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.Feature[] r1 = r4.zzi
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r2, r1, r6, r3)
            com.google.android.gms.common.Feature[] r1 = r4.zzj
            r2 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzk
            r1 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            int r6 = r4.zzl
            r1 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            boolean r6 = r4.zzm
            r1 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            java.lang.String r4 = r4.zza()
            r6 = 15
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r4, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.internal.GetServiceRequest createFromParcel(android.os.Parcel r20) {
            r19 = this;
            r0 = r20
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r20)
            r2 = 0
            r3 = 0
            r8 = r3
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r18 = r14
            r5 = 0
            r6 = 0
            r7 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L19:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L95
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r20)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L8f;
                case 2: goto L89;
                case 3: goto L83;
                case 4: goto L7d;
                case 5: goto L77;
                case 6: goto L6d;
                case 7: goto L67;
                case 8: goto L5d;
                case 9: goto L2a;
                case 10: goto L53;
                case 11: goto L49;
                case 12: goto L43;
                case 13: goto L3c;
                case 14: goto L35;
                case 15: goto L2e;
                default: goto L2a;
            }
        L2a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L19
        L2e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r18 = r2
            goto L19
        L35:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r17 = r2
            goto L19
        L3c:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r16 = r2
            goto L19
        L43:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            r15 = r2
            goto L19
        L49:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            com.google.android.gms.common.Feature[] r2 = (com.google.android.gms.common.Feature[]) r2
            r14 = r2
            goto L19
        L53:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            com.google.android.gms.common.Feature[] r2 = (com.google.android.gms.common.Feature[]) r2
            r13 = r2
            goto L19
        L5d:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            android.accounts.Account r2 = (android.accounts.Account) r2
            r12 = r2
            goto L19
        L67:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            r11 = r2
            goto L19
        L6d:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            com.google.android.gms.common.api.Scope[] r2 = (com.google.android.gms.common.api.Scope[]) r2
            r10 = r2
            goto L19
        L77:
            android.os.IBinder r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r0, r2)
            r9 = r2
            goto L19
        L7d:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            r8 = r2
            goto L19
        L83:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r7 = r2
            goto L19
        L89:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r6 = r2
            goto L19
        L8f:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            r5 = r2
            goto L19
        L95:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.common.internal.GetServiceRequest r0 = new com.google.android.gms.common.internal.GetServiceRequest
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.GetServiceRequest[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.GetServiceRequest[] r1 = new com.google.android.gms.common.internal.GetServiceRequest[r1]
            return r1
    }
}
