package androidx.core.location;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport f$0;
    public final /* synthetic */ java.util.concurrent.Executor f$1;

    public /* synthetic */ LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r1, java.util.concurrent.Executor r2, int r3) {
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
            androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = r2.f$0
            java.util.concurrent.Executor r1 = r2.f$1
            androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.m34$r8$lambda$W1WiagGzlSlFoo8c3Qd6urjz2M(r0, r1)
            return
        Le:
            androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = r2.f$0
            java.util.concurrent.Executor r1 = r2.f$1
            androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.$r8$lambda$EV3ALfMBDotS9TFPL4C05K2QFGM(r0, r1)
            return
    }
}
