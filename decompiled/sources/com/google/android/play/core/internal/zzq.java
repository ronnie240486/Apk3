package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzq extends com.google.android.play.core.internal.zzl implements com.google.android.play.core.internal.zzr {
    public zzq() {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzl
    public final boolean zza(int r2, android.os.Parcel r3) throws android.os.RemoteException {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzb(r2)
            goto L1f
        L14:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzc(r2)
        L1f:
            r2 = 1
            return r2
    }
}
