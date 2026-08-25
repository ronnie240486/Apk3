package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcb extends com.google.android.play.core.internal.zzl implements com.google.android.play.core.internal.zzcc {
    public zzcb() {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzl
    public final boolean zza(int r2, android.os.Parcel r3) throws android.os.RemoteException {
            r1 = this;
            switch(r2) {
                case 2: goto L96;
                case 3: goto L86;
                case 4: goto L76;
                case 5: goto L66;
                case 6: goto L5a;
                case 7: goto L50;
                case 8: goto L44;
                case 9: goto L38;
                case 10: goto L2c;
                case 11: goto L1f;
                case 12: goto L12;
                case 13: goto L5;
                default: goto L3;
            }
        L3:
            r2 = 0
            return r2
        L5:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zze(r2)
            goto La5
        L12:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzd(r2)
            goto La5
        L1f:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzk(r2)
            goto La5
        L2c:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzm(r2)
            goto La5
        L38:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzc(r2)
            goto La5
        L44:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzf(r2)
            goto La5
        L50:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.util.ArrayList r2 = r3.createTypedArrayList(r2)
            r1.zzh(r2)
            goto La5
        L5a:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzl(r2)
            goto La5
        L66:
            int r2 = r3.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.play.core.internal.zzm.zza(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.zzg(r2, r3)
            goto La5
        L76:
            int r2 = r3.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.play.core.internal.zzm.zza(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.zzb(r2, r3)
            goto La5
        L86:
            int r2 = r3.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.play.core.internal.zzm.zza(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.zzj(r2, r3)
            goto La5
        L96:
            int r2 = r3.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.play.core.internal.zzm.zza(r3, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1.zzi(r2, r3)
        La5:
            r2 = 1
            return r2
    }
}
