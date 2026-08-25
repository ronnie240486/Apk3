package androidx.core.location;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LocationManagerCompat$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.core.util.Consumer f$0;
    public final /* synthetic */ android.location.Location f$1;

    public /* synthetic */ LocationManagerCompat$$ExternalSyntheticLambda1(androidx.core.util.Consumer r1, android.location.Location r2, int r3) {
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
            androidx.core.util.Consumer r0 = r2.f$0
            android.location.Location r1 = r2.f$1
            androidx.core.location.LocationManagerCompat.$r8$lambda$BuDFX8p4cZynZHSiCJ1nwl98OSc(r0, r1)
            return
        Le:
            androidx.core.util.Consumer r0 = r2.f$0
            android.location.Location r1 = r2.f$1
            androidx.core.location.LocationManagerCompat.CancellableLocationListener.$r8$lambda$YCtILUhe93mA2Pmh3tYj1h0qzZs(r0, r1)
            return
    }
}
