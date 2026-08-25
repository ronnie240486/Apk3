package androidx.core.location;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.util.concurrent.Executor f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2(java.lang.Object r1, java.util.concurrent.Executor r2, int r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$1 = r2
            r0.f$2 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            java.lang.Object r0 = r3.f$0
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r0 = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) r0
            java.util.concurrent.Executor r1 = r3.f$1
            int r2 = r3.f$2
            androidx.core.location.LocationManagerCompat.GpsStatusTransport.m28$r8$lambda$T0auuLwzEMM99veZUbxskDo10s(r0, r1, r2)
            return
        L12:
            java.lang.Object r0 = r3.f$0
            androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r0
            java.util.concurrent.Executor r1 = r3.f$1
            int r2 = r3.f$2
            androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.m33$r8$lambda$UrmG531cBaBG_MqEWQ130Gx_xM(r0, r1, r2)
            return
    }
}
