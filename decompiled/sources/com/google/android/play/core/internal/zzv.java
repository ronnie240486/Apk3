package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzv extends com.google.android.play.core.internal.zzl implements com.google.android.play.core.internal.zzw {
    public zzv() {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzl
    public final boolean zza(int r2, android.os.Parcel r3) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 2: goto Lca;
                case 3: goto Lba;
                case 4: goto Laa;
                case 5: goto La0;
                case 6: goto L8e;
                case 7: goto L82;
                case 8: goto L70;
                case 9: goto L3;
                case 10: goto L5e;
                case 11: goto L4b;
                case 12: goto L38;
                case 13: goto L25;
                case 14: goto L12;
                case 15: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzc(r2)
            goto Ld9
        L12:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzl(r0, r2)
            goto Ld9
        L25:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzm(r0, r2)
            goto Ld9
        L38:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zze(r0, r2)
            goto Ld9
        L4b:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzh(r0, r2)
            goto Ld9
        L5e:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzk(r0, r2)
            goto Ld9
        L70:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzj(r0, r2)
            goto Ld9
        L82:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzd(r2)
            goto Ld9
        L8e:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzi(r0, r2)
            goto Ld9
        La0:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.util.ArrayList r2 = r3.createTypedArrayList(r2)
            r1.zzg(r2)
            goto Ld9
        Laa:
            int r2 = r3.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.play.core.internal.zzm.zza(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.zzf(r2, r3)
            goto Ld9
        Lba:
            int r2 = r3.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.play.core.internal.zzm.zza(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.zzb(r2, r3)
            goto Ld9
        Lca:
            int r2 = r3.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.play.core.internal.zzm.zza(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.zzn(r2, r3)
        Ld9:
            r2 = 1
            return r2
    }
}
