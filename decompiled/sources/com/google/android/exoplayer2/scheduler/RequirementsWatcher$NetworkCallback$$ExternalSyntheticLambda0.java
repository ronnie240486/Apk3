package com.google.android.exoplayer2.scheduler;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback f$0;

    public /* synthetic */ RequirementsWatcher$NetworkCallback$$ExternalSyntheticLambda0(com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r0 = r1.f$0
            com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback.m235$r8$lambda$ka6Ww24q498b9n62xI60YNrzg(r0)
            return
        Lc:
            com.google.android.exoplayer2.scheduler.RequirementsWatcher$NetworkCallback r0 = r1.f$0
            com.google.android.exoplayer2.scheduler.RequirementsWatcher.NetworkCallback.$r8$lambda$Tjcpa8xGVatnfnVqNaRZDmEOR5E(r0)
            return
    }
}
