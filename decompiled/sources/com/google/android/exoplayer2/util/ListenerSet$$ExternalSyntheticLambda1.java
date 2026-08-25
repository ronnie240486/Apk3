package com.google.android.exoplayer2.util;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ListenerSet$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ ListenerSet$$ExternalSyntheticLambda1(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r2, com.google.android.exoplayer2.drm.DrmSessionEventListener r3, int r4) {
            r1 = this;
            r0 = 1
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$2 = r3
            r1.f$1 = r4
            return
    }

    public /* synthetic */ ListenerSet$$ExternalSyntheticLambda1(java.util.concurrent.CopyOnWriteArraySet r2, int r3, com.google.android.exoplayer2.util.ListenerSet.Event r4) {
            r1 = this;
            r0 = 0
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$0 = r2
            r1.f$1 = r3
            r1.f$2 = r4
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
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            int r1 = r3.f$1
            java.lang.Object r2 = r3.f$2
            com.google.android.exoplayer2.util.ListenerSet$Event r2 = (com.google.android.exoplayer2.util.ListenerSet.Event) r2
            com.google.android.exoplayer2.util.ListenerSet.$r8$lambda$NbKDn9xtItiyMgYZmjIx_Sv1FFQ(r0, r1, r2)
            return
        L14:
            java.lang.Object r0 = r3.f$0
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) r0
            java.lang.Object r1 = r3.f$2
            com.google.android.exoplayer2.drm.DrmSessionEventListener r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener) r1
            int r2 = r3.f$1
            com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.$r8$lambda$xLBvWT_5jMYrnZeEFJL0zYPleFg(r0, r1, r2)
            return
    }
}
