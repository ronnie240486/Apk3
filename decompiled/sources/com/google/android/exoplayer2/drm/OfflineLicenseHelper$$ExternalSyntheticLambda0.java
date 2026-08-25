package com.google.android.exoplayer2.drm;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OfflineLicenseHelper$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.drm.OfflineLicenseHelper f$0;
    public final /* synthetic */ com.google.android.exoplayer2.drm.DrmSession f$1;
    public final /* synthetic */ com.google.common.util.concurrent.SettableFuture f$2;

    public /* synthetic */ OfflineLicenseHelper$$ExternalSyntheticLambda0(com.google.android.exoplayer2.drm.OfflineLicenseHelper r2, com.google.android.exoplayer2.drm.DrmSession r3, com.google.common.util.concurrent.SettableFuture r4) {
            r1 = this;
            r0 = 0
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$1 = r3
            r1.f$2 = r4
            return
    }

    public /* synthetic */ OfflineLicenseHelper$$ExternalSyntheticLambda0(com.google.android.exoplayer2.drm.OfflineLicenseHelper r1, com.google.common.util.concurrent.SettableFuture r2, com.google.android.exoplayer2.drm.DrmSession r3, int r4) {
            r0 = this;
            r0.$r8$classId = r4
            r0.f$0 = r1
            r0.f$2 = r2
            r0.f$1 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.$r8$classId
            switch(r0) {
                case 0: goto L10;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1a
        L6:
            com.google.android.exoplayer2.drm.OfflineLicenseHelper r0 = r3.f$0
            com.google.common.util.concurrent.SettableFuture r1 = r3.f$2
            com.google.android.exoplayer2.drm.DrmSession r2 = r3.f$1
            com.google.android.exoplayer2.drm.OfflineLicenseHelper.m221$r8$lambda$o7YaSaM7X2dWltFphZGw8NzvZ8(r0, r1, r2)
            return
        L10:
            com.google.android.exoplayer2.drm.OfflineLicenseHelper r0 = r3.f$0
            com.google.android.exoplayer2.drm.DrmSession r1 = r3.f$1
            com.google.common.util.concurrent.SettableFuture r2 = r3.f$2
            com.google.android.exoplayer2.drm.OfflineLicenseHelper.$r8$lambda$_hPRVFtGW9A7R527QGC5QQRIxEU(r0, r1, r2)
            return
        L1a:
            com.google.android.exoplayer2.drm.OfflineLicenseHelper r0 = r3.f$0
            com.google.common.util.concurrent.SettableFuture r1 = r3.f$2
            com.google.android.exoplayer2.drm.DrmSession r2 = r3.f$1
            com.google.android.exoplayer2.drm.OfflineLicenseHelper.$r8$lambda$ZnFp2cUGcwBwPVBI2TnIm24hHz0(r0, r1, r2)
            return
    }
}
