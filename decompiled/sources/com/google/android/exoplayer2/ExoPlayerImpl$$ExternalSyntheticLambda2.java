package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda2 implements com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.MediaItem f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda2(com.google.android.exoplayer2.MediaItem r1, int r2, int r3) {
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
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            com.google.android.exoplayer2.MediaItem r0 = r2.f$0
            int r1 = r2.f$1
            com.google.android.exoplayer2.Player$Listener r3 = (com.google.android.exoplayer2.Player.Listener) r3
            com.google.android.exoplayer2.ExoPlayerImpl.m159$r8$lambda$kGyD8wJzq1Xdi0qkdvChl0sF3I(r0, r1, r3)
            return
        L10:
            com.google.android.exoplayer2.MediaItem r0 = r2.f$0
            int r1 = r2.f$1
            com.google.android.exoplayer2.Player$Listener r3 = (com.google.android.exoplayer2.Player.Listener) r3
            com.google.android.exoplayer2.SimpleBasePlayer.m179$r8$lambda$UNjZbEvwKNsQScgj0daOVnYVAc(r0, r1, r3)
            return
    }
}
