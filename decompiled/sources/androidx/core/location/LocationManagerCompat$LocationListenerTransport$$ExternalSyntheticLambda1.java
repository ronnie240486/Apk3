package androidx.core.location;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.core.location.LocationManagerCompat.LocationListenerTransport f$0;
    public final /* synthetic */ java.lang.String f$1;

    public /* synthetic */ LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1(androidx.core.location.LocationManagerCompat.LocationListenerTransport r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r0 = r2.f$0
            java.lang.String r1 = r2.f$1
            androidx.core.location.LocationManagerCompat.LocationListenerTransport.m30$r8$lambda$B1gsSTxy0V0GwE3O1urJcFM1Nw(r0, r1)
            return
        Le:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r0 = r2.f$0
            java.lang.String r1 = r2.f$1
            androidx.core.location.LocationManagerCompat.LocationListenerTransport.$r8$lambda$lsVZkfjeu_iNJq_Fu3P9SKpwa6w(r0, r1)
            return
    }
}
