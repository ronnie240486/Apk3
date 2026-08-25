package androidx.core.location;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.util.concurrent.Executor f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1(java.lang.Object r1, java.util.concurrent.Executor r2, java.lang.Object r3, int r4) {
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
            goto L14
        L6:
            java.lang.Object r0 = r3.f$0
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r0 = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) r0
            java.util.concurrent.Executor r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            androidx.core.location.GnssStatusCompat r2 = (androidx.core.location.GnssStatusCompat) r2
            androidx.core.location.LocationManagerCompat.GpsStatusTransport.m29$r8$lambda$V4NDbKd22V64RxjVMVd419nswo(r0, r1, r2)
            return
        L14:
            java.lang.Object r0 = r3.f$0
            androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r0
            java.util.concurrent.Executor r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            android.location.GnssStatus r2 = (android.location.GnssStatus) r2
            androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.$r8$lambda$M98hBYbLkP_lHaBu4FbOg7TdZV0(r0, r1, r2)
            return
    }
}
