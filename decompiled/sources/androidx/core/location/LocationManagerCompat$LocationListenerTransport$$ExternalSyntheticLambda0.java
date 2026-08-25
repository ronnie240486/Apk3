package androidx.core.location;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.core.location.LocationManagerCompat.LocationListenerTransport f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0(androidx.core.location.LocationManagerCompat.LocationListenerTransport r1, java.lang.Object r2, int r3) {
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
            goto L10
        L6:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r0 = r2.f$0
            java.lang.Object r1 = r2.f$1
            java.util.List r1 = (java.util.List) r1
            androidx.core.location.LocationManagerCompat.LocationListenerTransport.$r8$lambda$MhoeUnGkDr3ot8_83pxTiAeIweg(r0, r1)
            return
        L10:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r0 = r2.f$0
            java.lang.Object r1 = r2.f$1
            android.location.Location r1 = (android.location.Location) r1
            androidx.core.location.LocationManagerCompat.LocationListenerTransport.$r8$lambda$nQA1ES9Z0HoQZ4k2kiq64G5J1Hw(r0, r1)
            return
    }
}
