package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzad extends com.google.android.play.core.internal.zzl implements com.google.android.play.core.internal.zzae {
    public zzad() {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzl
    public final boolean zza(int r2, android.os.Parcel r3) throws android.os.RemoteException {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto L10
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.play.core.internal.zzm.zza(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.zzb(r2)
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
