package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlayer implements com.google.android.exoplayer2.Player {
    public final com.google.android.exoplayer2.Timeline.Window window;

    public BasePlayer() {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.Timeline$Window r0 = new com.google.android.exoplayer2.Timeline$Window
            r0.<init>()
            r1.window = r0
            return
    }

    private int getRepeatModeForNavigation() {
            r2 = this;
            int r0 = r2.getRepeatMode()
            r1 = 1
            if (r0 != r1) goto L8
            r0 = 0
        L8:
            return r0
    }

    private void repeatCurrentMediaItem(int r7) {
            r6 = this;
            int r1 = r6.getCurrentMediaItemIndex()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 1
            r0 = r6
            r4 = r7
            r0.seekTo(r1, r2, r4, r5)
            return
    }

    private void seekToCurrentItem(long r7, int r9) {
            r6 = this;
            int r1 = r6.getCurrentMediaItemIndex()
            r5 = 0
            r0 = r6
            r2 = r7
            r4 = r9
            r0.seekTo(r1, r2, r4, r5)
            return
    }

    private void seekToDefaultPositionInternal(int r7, int r8) {
            r6 = this;
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r0 = r6
            r1 = r7
            r4 = r8
            r0.seekTo(r1, r2, r4, r5)
            return
    }

    private void seekToNextMediaItemInternal(int r3) {
            r2 = this;
            int r0 = r2.getNextMediaItemIndex()
            r1 = -1
            if (r0 != r1) goto L8
            return
        L8:
            int r1 = r2.getCurrentMediaItemIndex()
            if (r0 != r1) goto L12
            r2.repeatCurrentMediaItem(r3)
            goto L15
        L12:
            r2.seekToDefaultPositionInternal(r0, r3)
        L15:
            return
    }

    private void seekToOffset(long r6, int r8) {
            r5 = this;
            long r0 = r5.getCurrentPosition()
            long r0 = r0 + r6
            long r6 = r5.getDuration()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            long r0 = java.lang.Math.min(r0, r6)
        L16:
            r6 = 0
            long r6 = java.lang.Math.max(r0, r6)
            r5.seekToCurrentItem(r6, r8)
            return
    }

    private void seekToPreviousMediaItemInternal(int r3) {
            r2 = this;
            int r0 = r2.getPreviousMediaItemIndex()
            r1 = -1
            if (r0 != r1) goto L8
            return
        L8:
            int r1 = r2.getCurrentMediaItemIndex()
            if (r0 != r1) goto L12
            r2.repeatCurrentMediaItem(r3)
            goto L15
        L12:
            r2.seekToDefaultPositionInternal(r0, r3)
        L15:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItem(int r1, com.google.android.exoplayer2.MediaItem r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            r0.addMediaItems(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItem(com.google.android.exoplayer2.MediaItem r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            r0.addMediaItems(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.addMediaItems(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean canAdvertiseSession() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearMediaItems() {
            r2 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.removeMediaItems(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getBufferedPercentage() {
            r9 = this;
            long r0 = r9.getBufferedPosition()
            long r2 = r9.getDuration()
            r4 = 100
            r5 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L2b
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L19
            goto L2b
        L19:
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L20
            goto L2c
        L20:
            r6 = 100
            long r0 = r0 * r6
            long r0 = r0 / r2
            int r1 = (int) r0
            int r4 = com.google.android.exoplayer2.util.Util.constrainValue(r1, r5, r4)
            goto L2c
        L2b:
            r4 = 0
        L2c:
            return r4
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentDuration() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L1e
        L10:
            int r1 = r3.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            long r0 = r0.getDurationMs()
        L1e:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentLiveOffset() {
            r5 = this;
            com.google.android.exoplayer2.Timeline r0 = r5.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L10
            return r2
        L10:
            int r1 = r5.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r4 = r5.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r4)
            long r0 = r0.windowStartTimeMs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L21
            return r2
        L21:
            com.google.android.exoplayer2.Timeline$Window r0 = r5.window
            long r0 = r0.getCurrentUnixTimeMs()
            com.google.android.exoplayer2.Timeline$Window r2 = r5.window
            long r2 = r2.windowStartTimeMs
            long r0 = r0 - r2
            long r2 = r5.getContentPosition()
            long r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public final java.lang.Object getCurrentManifest() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r0 = 0
            goto L18
        Lc:
            int r1 = r3.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            java.lang.Object r0 = r0.manifest
        L18:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.MediaItem getCurrentMediaItem() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r0 = 0
            goto L18
        Lc:
            int r1 = r3.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            com.google.android.exoplayer2.MediaItem r0 = r0.mediaItem
        L18:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final int getCurrentWindowIndex() {
            r1 = this;
            int r0 = r1.getCurrentMediaItemIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.MediaItem getMediaItemAt(int r3) {
            r2 = this;
            com.google.android.exoplayer2.Timeline r0 = r2.getCurrentTimeline()
            com.google.android.exoplayer2.Timeline$Window r1 = r2.window
            com.google.android.exoplayer2.Timeline$Window r3 = r0.getWindow(r3, r1)
            com.google.android.exoplayer2.MediaItem r3 = r3.mediaItem
            return r3
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getMediaItemCount() {
            r1 = this;
            com.google.android.exoplayer2.Timeline r0 = r1.getCurrentTimeline()
            int r0 = r0.getWindowCount()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getNextMediaItemIndex() {
            r4 = this;
            com.google.android.exoplayer2.Timeline r0 = r4.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r0 = -1
            goto L1c
        Lc:
            int r1 = r4.getCurrentMediaItemIndex()
            int r2 = r4.getRepeatModeForNavigation()
            boolean r3 = r4.getShuffleModeEnabled()
            int r0 = r0.getNextWindowIndex(r1, r2, r3)
        L1c:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final int getNextWindowIndex() {
            r1 = this;
            int r0 = r1.getNextMediaItemIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPreviousMediaItemIndex() {
            r4 = this;
            com.google.android.exoplayer2.Timeline r0 = r4.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r0 = -1
            goto L1c
        Lc:
            int r1 = r4.getCurrentMediaItemIndex()
            int r2 = r4.getRepeatModeForNavigation()
            boolean r3 = r4.getShuffleModeEnabled()
            int r0 = r0.getPreviousWindowIndex(r1, r2, r3)
        L1c:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final int getPreviousWindowIndex() {
            r1 = this;
            int r0 = r1.getPreviousMediaItemIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNextMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasNextMediaItem() {
            r2 = this;
            int r0 = r2.getNextMediaItemIndex()
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final boolean hasNextWindow() {
            r1 = this;
            boolean r0 = r1.hasNextMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final boolean hasPrevious() {
            r1 = this;
            boolean r0 = r1.hasPreviousMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasPreviousMediaItem() {
            r2 = this;
            int r0 = r2.getPreviousMediaItemIndex()
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final boolean hasPreviousWindow() {
            r1 = this;
            boolean r0 = r1.hasPreviousMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCommandAvailable(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Player$Commands r0 = r1.getAvailableCommands()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentMediaItemDynamic() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1a
            int r1 = r3.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            boolean r0 = r0.isDynamic
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentMediaItemLive() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1c
            int r1 = r3.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            boolean r0 = r0.isLive()
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentMediaItemSeekable() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1a
            int r1 = r3.getCurrentMediaItemIndex()
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            boolean r0 = r0.isSeekable
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowDynamic() {
            r1 = this;
            boolean r0 = r1.isCurrentMediaItemDynamic()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowLive() {
            r1 = this;
            boolean r0 = r1.isCurrentMediaItemLive()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowSeekable() {
            r1 = this;
            boolean r0 = r1.isCurrentMediaItemSeekable()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlaying() {
            r2 = this;
            int r0 = r2.getPlaybackState()
            r1 = 3
            if (r0 != r1) goto L15
            boolean r0 = r2.getPlayWhenReady()
            if (r0 == 0) goto L15
            int r0 = r2.getPlaybackSuppressionReason()
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItem(int r2, int r3) {
            r1 = this;
            if (r2 == r3) goto L7
            int r0 = r2 + 1
            r1.moveMediaItems(r2, r0, r3)
        L7:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final void next() {
            r0 = this;
            r0.seekToNextMediaItem()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void pause() {
            r1 = this;
            r0 = 0
            r1.setPlayWhenReady(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void play() {
            r1 = this;
            r0 = 1
            r1.setPlayWhenReady(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final void previous() {
            r0 = this;
            r0.seekToPreviousMediaItem()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItem(int r2) {
            r1 = this;
            int r0 = r2 + 1
            r1.removeMediaItems(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekBack() {
            r3 = this;
            long r0 = r3.getSeekBackIncrement()
            long r0 = -r0
            r2 = 11
            r3.seekToOffset(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekForward() {
            r3 = this;
            long r0 = r3.getSeekForwardIncrement()
            r2 = 12
            r3.seekToOffset(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekTo(int r7, long r8) {
            r6 = this;
            r4 = 10
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.seekTo(r1, r2, r4, r5)
            return
    }

    @androidx.annotation.VisibleForTesting(otherwise = 4)
    public abstract void seekTo(int r1, long r2, int r4, boolean r5);

    @Override // com.google.android.exoplayer2.Player
    public final void seekTo(long r2) {
            r1 = this;
            r0 = 5
            r1.seekToCurrentItem(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToDefaultPosition() {
            r2 = this;
            int r0 = r2.getCurrentMediaItemIndex()
            r1 = 4
            r2.seekToDefaultPositionInternal(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToDefaultPosition(int r2) {
            r1 = this;
            r0 = 10
            r1.seekToDefaultPositionInternal(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToNext() {
            r2 = this;
            com.google.android.exoplayer2.Timeline r0 = r2.getCurrentTimeline()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L30
            boolean r0 = r2.isPlayingAd()
            if (r0 == 0) goto L11
            goto L30
        L11:
            boolean r0 = r2.hasNextMediaItem()
            r1 = 9
            if (r0 == 0) goto L1d
            r2.seekToNextMediaItemInternal(r1)
            goto L30
        L1d:
            boolean r0 = r2.isCurrentMediaItemLive()
            if (r0 == 0) goto L30
            boolean r0 = r2.isCurrentMediaItemDynamic()
            if (r0 == 0) goto L30
            int r0 = r2.getCurrentMediaItemIndex()
            r2.seekToDefaultPositionInternal(r0, r1)
        L30:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToNextMediaItem() {
            r1 = this;
            r0 = 8
            r1.seekToNextMediaItemInternal(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final void seekToNextWindow() {
            r0 = this;
            r0.seekToNextMediaItem()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToPrevious() {
            r6 = this;
            com.google.android.exoplayer2.Timeline r0 = r6.getCurrentTimeline()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3f
            boolean r0 = r6.isPlayingAd()
            if (r0 == 0) goto L11
            goto L3f
        L11:
            boolean r0 = r6.hasPreviousMediaItem()
            boolean r1 = r6.isCurrentMediaItemLive()
            r2 = 7
            if (r1 == 0) goto L28
            boolean r1 = r6.isCurrentMediaItemSeekable()
            if (r1 != 0) goto L28
            if (r0 == 0) goto L3f
            r6.seekToPreviousMediaItemInternal(r2)
            goto L3f
        L28:
            if (r0 == 0) goto L3a
            long r0 = r6.getCurrentPosition()
            long r3 = r6.getMaxSeekToPreviousPosition()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L3a
            r6.seekToPreviousMediaItemInternal(r2)
            goto L3f
        L3a:
            r0 = 0
            r6.seekToCurrentItem(r0, r2)
        L3f:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToPreviousMediaItem() {
            r1 = this;
            r0 = 6
            r1.seekToPreviousMediaItemInternal(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public final void seekToPreviousWindow() {
            r0 = this;
            r0.seekToPreviousMediaItem()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(com.google.android.exoplayer2.MediaItem r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            r0.setMediaItems(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(com.google.android.exoplayer2.MediaItem r2, long r3) {
            r1 = this;
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            r0 = 0
            r1.setMediaItems(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(com.google.android.exoplayer2.MediaItem r1, boolean r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            r0.setMediaItems(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2) {
            r1 = this;
            r0 = 1
            r1.setMediaItems(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackSpeed(float r2) {
            r1 = this;
            com.google.android.exoplayer2.PlaybackParameters r0 = r1.getPlaybackParameters()
            com.google.android.exoplayer2.PlaybackParameters r2 = r0.withSpeed(r2)
            r1.setPlaybackParameters(r2)
            return
    }
}
