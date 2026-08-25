package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends com.google.android.play.core.internal.zzk implements com.google.android.play.core.internal.zzac {
    public zzaa(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.inappreview.protocol.IInAppReviewService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzac
    public final void zzc(java.lang.String r2, android.os.Bundle r3, com.google.android.play.core.internal.zzae r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.play.core.internal.zzm.zzb(r0, r3)
            com.google.android.play.core.internal.zzm.zzc(r0, r4)
            r2 = 2
            r1.zzb(r2, r0)
            return
    }
}
