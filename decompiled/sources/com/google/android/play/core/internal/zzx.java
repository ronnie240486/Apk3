package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzx extends com.google.android.play.core.internal.zzl implements com.google.android.play.core.internal.zzy {
    public zzx() {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzl
    public final boolean zza(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            r0 = 2
            r1 = 0
            java.lang.String r2 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            if (r4 == r0) goto L2f
            r0 = 3
            if (r4 == r0) goto Lb
            r4 = 0
            return r4
        Lb:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.play.core.internal.zzm.zza(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L1a
            goto L2b
        L1a:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.play.core.internal.zzz
            if (r1 == 0) goto L26
            r1 = r0
            com.google.android.play.core.internal.zzz r1 = (com.google.android.play.core.internal.zzz) r1
            goto L2b
        L26:
            com.google.android.play.core.internal.zzz r1 = new com.google.android.play.core.internal.zzz
            r1.<init>(r5)
        L2b:
            r3.zzb(r4, r1)
            goto L52
        L2f:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.play.core.internal.zzm.zza(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L3e
            goto L4f
        L3e:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.play.core.internal.zzz
            if (r1 == 0) goto L4a
            r1 = r0
            com.google.android.play.core.internal.zzz r1 = (com.google.android.play.core.internal.zzz) r1
            goto L4f
        L4a:
            com.google.android.play.core.internal.zzz r1 = new com.google.android.play.core.internal.zzz
            r1.<init>(r5)
        L4f:
            r3.zzc(r4, r1)
        L52:
            r4 = 1
            return r4
    }
}
