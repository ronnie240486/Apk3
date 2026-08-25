package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public class ForwardingPlayer implements com.google.android.exoplayer2.Player {
    private final com.google.android.exoplayer2.Player player;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ForwardingListener implements com.google.android.exoplayer2.Player.Listener {
        private final com.google.android.exoplayer2.ForwardingPlayer forwardingPlayer;
        private final com.google.android.exoplayer2.Player.Listener listener;

        public ForwardingListener(com.google.android.exoplayer2.ForwardingPlayer r1, com.google.android.exoplayer2.Player.Listener r2) {
                r0 = this;
                r0.<init>()
                r0.forwardingPlayer = r1
                r0.listener = r2
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                boolean r0 = r4 instanceof com.google.android.exoplayer2.ForwardingPlayer.ForwardingListener
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                com.google.android.exoplayer2.ForwardingPlayer$ForwardingListener r4 = (com.google.android.exoplayer2.ForwardingPlayer.ForwardingListener) r4
                com.google.android.exoplayer2.ForwardingPlayer r0 = r3.forwardingPlayer
                com.google.android.exoplayer2.ForwardingPlayer r2 = r4.forwardingPlayer
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L17
                return r1
            L17:
                com.google.android.exoplayer2.Player$Listener r0 = r3.listener
                com.google.android.exoplayer2.Player$Listener r4 = r4.listener
                boolean r4 = r0.equals(r4)
                return r4
        }

        public int hashCode() {
                r2 = this;
                com.google.android.exoplayer2.ForwardingPlayer r0 = r2.forwardingPlayer
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.android.exoplayer2.Player$Listener r1 = r2.listener
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onAudioAttributesChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioSessionIdChanged(int r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onAudioSessionIdChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onAvailableCommandsChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(com.google.android.exoplayer2.text.CueGroup r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onCues(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(java.util.List<com.google.android.exoplayer2.text.Cue> r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onCues(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onDeviceInfoChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceVolumeChanged(int r2, boolean r3) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onDeviceVolumeChanged(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(com.google.android.exoplayer2.Player r2, com.google.android.exoplayer2.Player.Events r3) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r2 = r1.listener
                com.google.android.exoplayer2.ForwardingPlayer r0 = r1.forwardingPlayer
                r2.onEvents(r0, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsLoadingChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onIsLoadingChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onIsPlayingChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onLoadingChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onIsLoadingChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onMaxSeekToPreviousPositionChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaItemTransition(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onMediaItemTransition(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onMediaMetadataChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMetadata(com.google.android.exoplayer2.metadata.Metadata r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onMetadata(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlayWhenReadyChanged(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlaybackParametersChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlaybackStateChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackSuppressionReasonChanged(int r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlaybackSuppressionReasonChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(com.google.android.exoplayer2.PlaybackException r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlayerError(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerErrorChanged(@androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlayerErrorChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerStateChanged(boolean r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlayerStateChanged(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPlaylistMetadataChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(int r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPositionDiscontinuity(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, int r4) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onPositionDiscontinuity(r2, r3, r4)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onRenderedFirstFrame()
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRepeatModeChanged(int r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onRepeatModeChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekBackIncrementChanged(long r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onSeekBackIncrementChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekForwardIncrementChanged(long r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onSeekForwardIncrementChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekProcessed() {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onSeekProcessed()
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onShuffleModeEnabledChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onShuffleModeEnabledChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onSkipSilenceEnabledChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSurfaceSizeChanged(int r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onSurfaceSizeChanged(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTimelineChanged(com.google.android.exoplayer2.Timeline r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onTimelineChanged(r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onTrackSelectionParametersChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTracksChanged(com.google.android.exoplayer2.Tracks r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onTracksChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onVideoSizeChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVolumeChanged(float r2) {
                r1 = this;
                com.google.android.exoplayer2.Player$Listener r0 = r1.listener
                r0.onVolumeChanged(r2)
                return
        }
    }

    public ForwardingPlayer(com.google.android.exoplayer2.Player r1) {
            r0 = this;
            r0.<init>()
            r0.player = r1
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.CallSuper
    public void addListener(com.google.android.exoplayer2.Player.Listener r3) {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            com.google.android.exoplayer2.ForwardingPlayer$ForwardingListener r1 = new com.google.android.exoplayer2.ForwardingPlayer$ForwardingListener
            r1.<init>(r2, r3)
            r0.addListener(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItem(int r2, com.google.android.exoplayer2.MediaItem r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.addMediaItem(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItem(com.google.android.exoplayer2.MediaItem r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.addMediaItem(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int r2, java.util.List<com.google.android.exoplayer2.MediaItem> r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.addMediaItems(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.addMediaItems(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean canAdvertiseSession() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.canAdvertiseSession()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearMediaItems() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.clearMediaItems()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.clearVideoSurface()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.clearVideoSurface(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.clearVideoSurfaceHolder(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.clearVideoSurfaceView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.clearVideoTextureView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void decreaseDeviceVolume() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.decreaseDeviceVolume()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public android.os.Looper getApplicationLooper() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            android.os.Looper r0 = r0.getApplicationLooper()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r0.getAudioAttributes()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Player.Commands getAvailableCommands() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.Player$Commands r0 = r0.getAvailableCommands()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getBufferedPercentage() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getBufferedPercentage()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getBufferedPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getContentBufferedPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentDuration() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getContentDuration()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getContentPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getCurrentAdGroupIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getCurrentAdIndexInAdGroup()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public com.google.android.exoplayer2.text.CueGroup getCurrentCues() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.text.CueGroup r0 = r0.getCurrentCues()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentLiveOffset() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getCurrentLiveOffset()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public java.lang.Object getCurrentManifest() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            java.lang.Object r0 = r0.getCurrentManifest()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.MediaItem getCurrentMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.MediaItem r0 = r0.getCurrentMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getCurrentMediaItemIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getCurrentPeriodIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getCurrentPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Timeline getCurrentTimeline() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.Timeline r0 = r0.getCurrentTimeline()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Tracks getCurrentTracks() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.Tracks r0 = r0.getCurrentTracks()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public int getCurrentWindowIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getCurrentWindowIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public com.google.android.exoplayer2.DeviceInfo getDeviceInfo() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.DeviceInfo r0 = r0.getDeviceInfo()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public int getDeviceVolume() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getDeviceVolume()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getDuration()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getMaxSeekToPreviousPosition() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getMaxSeekToPreviousPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaItem getMediaItemAt(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.MediaItem r2 = r0.getMediaItemAt(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Player
    public int getMediaItemCount() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getMediaItemCount()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getMediaMetadata() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.MediaMetadata r0 = r0.getMediaMetadata()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getNextMediaItemIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getNextMediaItemIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public int getNextWindowIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getNextWindowIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.getPlayWhenReady()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getPlaybackState()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getPlaybackSuppressionReason()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.PlaybackException getPlayerError() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.PlaybackException r0 = r0.getPlayerError()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.MediaMetadata r0 = r0.getPlaylistMetadata()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPreviousMediaItemIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getPreviousMediaItemIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public int getPreviousWindowIndex() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getPreviousWindowIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            int r0 = r0.getRepeatMode()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getSeekBackIncrement()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getSeekForwardIncrement()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.getShuffleModeEnabled()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.util.Size getSurfaceSize() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.util.Size r0 = r0.getSurfaceSize()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            long r0 = r0.getTotalBufferedDuration()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.getTrackSelectionParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public com.google.android.exoplayer2.video.VideoSize getVideoSize() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            com.google.android.exoplayer2.video.VideoSize r0 = r0.getVideoSize()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public float getVolume() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            float r0 = r0.getVolume()
            return r0
    }

    public com.google.android.exoplayer2.Player getWrappedPlayer() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public boolean hasNext() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean hasNextMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.hasNextMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public boolean hasNextWindow() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.hasNextWindow()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public boolean hasPrevious() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean hasPreviousMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.hasPreviousMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public boolean hasPreviousWindow() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.hasPreviousWindow()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void increaseDeviceVolume() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.increaseDeviceVolume()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCommandAvailable(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r2 = r0.isCommandAvailable(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemDynamic() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isCurrentMediaItemDynamic()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemLive() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isCurrentMediaItemLive()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemSeekable() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isCurrentMediaItemSeekable()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowDynamic() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isCurrentWindowDynamic()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowLive() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isCurrentWindowLive()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowSeekable() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isCurrentWindowSeekable()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public boolean isDeviceMuted() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isDeviceMuted()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isLoading()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlaying() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isPlaying()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            boolean r0 = r0.isPlayingAd()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItem(int r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.moveMediaItem(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int r2, int r3, int r4) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.moveMediaItems(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public void next() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.next()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void pause() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.pause()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void play() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.play()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.prepare()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public void previous() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.previous()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.CallSuper
    public void removeListener(com.google.android.exoplayer2.Player.Listener r3) {
            r2 = this;
            com.google.android.exoplayer2.Player r0 = r2.player
            com.google.android.exoplayer2.ForwardingPlayer$ForwardingListener r1 = new com.google.android.exoplayer2.ForwardingPlayer$ForwardingListener
            r1.<init>(r2, r3)
            r0.removeListener(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItem(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.removeMediaItem(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.removeMediaItems(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekBack() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekBack()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekForward() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekForward()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int r2, long r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekTo(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(long r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekTo(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToDefaultPosition()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToDefaultPosition(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToNext() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToNext()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToNextMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToNextMediaItem()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public void seekToNextWindow() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToNextWindow()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToPrevious() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToPrevious()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToPreviousMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToPreviousMediaItem()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public void seekToPreviousWindow() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.seekToPreviousWindow()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceMuted(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setDeviceMuted(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceVolume(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setDeviceVolume(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(com.google.android.exoplayer2.MediaItem r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setMediaItem(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(com.google.android.exoplayer2.MediaItem r2, long r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setMediaItem(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(com.google.android.exoplayer2.MediaItem r2, boolean r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setMediaItem(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setMediaItems(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2, int r3, long r4) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setMediaItems(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2, boolean r3) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setMediaItems(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setPlayWhenReady(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setPlaybackParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackSpeed(float r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setPlaybackSpeed(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setPlaylistMetadata(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setRepeatMode(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setShuffleModeEnabled(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setTrackSelectionParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurface(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setVideoSurface(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setVideoSurfaceHolder(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setVideoSurfaceView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setVideoTextureView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setVolume(float r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.setVolume(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.stop()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public void stop(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.Player r0 = r1.player
            r0.stop(r2)
            return
    }
}
