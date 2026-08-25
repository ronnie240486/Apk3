package com.google.android.exoplayer2.drm;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher f$0;
    public final /* synthetic */ com.google.android.exoplayer2.drm.DrmSessionEventListener f$1;

    public /* synthetic */ DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r1, com.google.android.exoplayer2.drm.DrmSessionEventListener r2, int r3) {
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
                case 0: goto L16;
                case 1: goto Le;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.drm.DrmSessionEventListener r1 = r2.f$1
            com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.m217$r8$lambda$VS4q9oF8IRPGvxstW7pqSGMYR4(r0, r1)
            return
        Le:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.drm.DrmSessionEventListener r1 = r2.f$1
            com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.$r8$lambda$VPDG80VEycbvsI4byl49iBfpehI(r0, r1)
            return
        L16:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.drm.DrmSessionEventListener r1 = r2.f$1
            com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.$r8$lambda$Go5N0OXEIhSEKTymQYW4yGQpa2E(r0, r1)
            return
        L1e:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = r2.f$0
            com.google.android.exoplayer2.drm.DrmSessionEventListener r1 = r2.f$1
            com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.m218$r8$lambda$c4cPBl_ZDrC5MJRvwOn14Vn00(r0, r1)
            return
    }
}
