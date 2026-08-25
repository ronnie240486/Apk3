package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class LegacyMediaPlayerWrapper extends com.google.android.exoplayer2.SimpleBasePlayer {
    private boolean playWhenReady;
    private final android.media.MediaPlayer player;

    public LegacyMediaPlayerWrapper(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
            r0.player = r1
            return
    }

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    public final com.google.android.exoplayer2.SimpleBasePlayer.State getState() {
            r5 = this;
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = new com.google.android.exoplayer2.SimpleBasePlayer$State$Builder
            r0.<init>()
            com.google.android.exoplayer2.Player$Commands$Builder r1 = new com.google.android.exoplayer2.Player$Commands$Builder
            r1.<init>()
            r2 = 1
            int[] r3 = new int[r2]
            r4 = 0
            r3[r4] = r2
            com.google.android.exoplayer2.Player$Commands$Builder r1 = r1.addAll(r3)
            com.google.android.exoplayer2.Player$Commands r1 = r1.build()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setAvailableCommands(r1)
            boolean r1 = r5.playWhenReady
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setPlayWhenReady(r1, r2)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    public final com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean r1) {
            r0 = this;
            r0.playWhenReady = r1
            if (r1 == 0) goto La
            android.media.MediaPlayer r1 = r0.player
            r1.start()
            goto Lf
        La:
            android.media.MediaPlayer r1 = r0.player
            r1.pause()
        Lf:
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.immediateVoidFuture()
            return r1
    }
}
