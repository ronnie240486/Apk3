package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda5 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda5(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L12;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1e
        L6:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.PlaybackInfo r0 = (com.google.android.exoplayer2.PlaybackInfo) r0
            int r1 = r2.f$1
            com.google.android.exoplayer2.Player$Listener r3 = (com.google.android.exoplayer2.Player.Listener) r3
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$xPRvbbAFEXpRipm4zHUUlaXa8_c(r0, r1, r3)
            return
        L12:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.PlaybackInfo r0 = (com.google.android.exoplayer2.PlaybackInfo) r0
            int r1 = r2.f$1
            com.google.android.exoplayer2.Player$Listener r3 = (com.google.android.exoplayer2.Player.Listener) r3
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$mCYQfy342yJtmHOPlWY2PP6AubE(r0, r1, r3)
            return
        L1e:
            java.lang.Object r0 = r2.f$0
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = (com.google.android.exoplayer2.SimpleBasePlayer.State) r0
            int r1 = r2.f$1
            com.google.android.exoplayer2.Player$Listener r3 = (com.google.android.exoplayer2.Player.Listener) r3
            com.google.android.exoplayer2.SimpleBasePlayer.m180$r8$lambda$kAr3ZAQc456GRKSsHp0itrY1gk(r0, r1, r3)
            return
    }
}
