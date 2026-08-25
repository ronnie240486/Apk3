package com.google.android.exoplayer2.drm;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OfflineLicenseHelper$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ OfflineLicenseHelper$$ExternalSyntheticLambda1(java.lang.Object r1, java.lang.Object r2, int r3) {
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
            goto L12
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.drm.OfflineLicenseHelper r0 = (com.google.android.exoplayer2.drm.OfflineLicenseHelper) r0
            java.lang.Object r1 = r2.f$1
            com.google.common.util.concurrent.SettableFuture r1 = (com.google.common.util.concurrent.SettableFuture) r1
            com.google.android.exoplayer2.drm.OfflineLicenseHelper.$r8$lambda$Vn8jFPITYTK2gV4GrUT_kfq12Mw(r0, r1)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference r0 = (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference) r0
            java.lang.Object r1 = r2.f$1
            com.google.android.exoplayer2.Format r1 = (com.google.android.exoplayer2.Format) r1
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference.m216$r8$lambda$rqyTSlYT3rRwS_rvp1F3CN49xI(r0, r1)
            return
    }
}
