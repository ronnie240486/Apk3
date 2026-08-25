package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda10 implements com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent, com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener, com.google.android.exoplayer2.util.ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ com.google.android.exoplayer2.ExoPlayerImpl f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda10(com.google.android.exoplayer2.ExoPlayerImpl r1, int r2) {
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
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$iOATGEkasG8901G_1NGIbMM62eM(r0, r2)
            return
        Le:
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$hYDMtEQJ0aCOwH1qaXaj1gkqUZ8(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public final void invoke(java.lang.Object r2, com.google.android.exoplayer2.util.FlagSet r3) {
            r1 = this;
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.f$0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$FaN7Odt_OJn5xWFlmhnR2OmiNMg(r0, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public final void onPlaybackInfoUpdate(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r2) {
            r1 = this;
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.f$0
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$_fDKcLMFsI6W3dqufi3IgX6ZgeE(r0, r2)
            return
    }
}
