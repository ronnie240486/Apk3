package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda9 implements com.google.android.exoplayer2.util.ListenerSet.Event, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda9(java.lang.Object r1, int r2) {
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
                case 0: goto L4c;
                case 1: goto L42;
                case 2: goto L38;
                case 3: goto L2e;
                case 4: goto L24;
                case 5: goto L1a;
                case 6: goto L10;
                case 7: goto L6;
                default: goto L5;
            }
        L5:
            goto L56
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.video.VideoSize r0 = (com.google.android.exoplayer2.video.VideoSize) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.m161$r8$lambda$HdX85j9fh3Z_9KCQsK59i6Md_s(r0, r2)
            return
        L10:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.text.CueGroup r0 = (com.google.android.exoplayer2.text.CueGroup) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.m163$r8$lambda$_aBFihSlC5RQW56pfQ8lB5y8w(r0, r2)
            return
        L1a:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.DeviceInfo r0 = (com.google.android.exoplayer2.DeviceInfo) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.m164$r8$lambda$sUcxyDutLXGRaEs9oeNwJmrpLs(r0, r2)
            return
        L24:
            java.lang.Object r0 = r1.f$0
            java.util.List r0 = (java.util.List) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.$r8$lambda$gctp5ihBvE1rmNFbswaKePXtqGQ(r0, r2)
            return
        L2e:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.metadata.Metadata r0 = (com.google.android.exoplayer2.metadata.Metadata) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.$r8$lambda$HZOAricevDNUKKb0KBxzZasKe6E(r0, r2)
            return
        L38:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener r0 = (com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.$r8$lambda$pitVMvVzVidceF16ApRaB1pYLrY(r0, r2)
            return
        L42:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = (com.google.android.exoplayer2.trackselection.TrackSelectionParameters) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.m155$r8$lambda$WBngl4De8sjkkXv8fJ5kqblA(r0, r2)
            return
        L4c:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.audio.AudioAttributes r0 = (com.google.android.exoplayer2.audio.AudioAttributes) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.ExoPlayerImpl.$r8$lambda$cBuHNsZypGkQ1KYotO__eto6EPQ(r0, r2)
            return
        L56:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.Tracks r0 = (com.google.android.exoplayer2.Tracks) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.SimpleBasePlayer.$r8$lambda$NKBNir6luWyymSdYSynE4xWtpUg(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public final void invoke(java.lang.Object r2, com.google.android.exoplayer2.util.FlagSet r3) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.SimpleBasePlayer r0 = (com.google.android.exoplayer2.SimpleBasePlayer) r0
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            com.google.android.exoplayer2.SimpleBasePlayer.m173$r8$lambda$2AU_PwUU4Obh1IVmtWA59vsodE(r0, r2, r3)
            return
    }
}
