package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda6 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda6(boolean r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            boolean r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.m156$r8$lambda$4ODH6SgCaE7a2MHWdNxAf25uF0(r0, r2)
            return
        Le:
            boolean r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$KI01NQgkBscS_W9aEJjB4RBqq08(r0, r2)
            return
        L16:
            boolean r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.$r8$lambda$tyDvBM9tdSObJtQb09IfdDl7BMk(r0, r2)
            return
    }
}
