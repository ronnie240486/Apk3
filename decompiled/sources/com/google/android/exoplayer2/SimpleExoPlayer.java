package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class SimpleExoPlayer extends com.google.android.exoplayer2.BasePlayer implements com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent, com.google.android.exoplayer2.ExoPlayer.VideoComponent, com.google.android.exoplayer2.ExoPlayer.TextComponent, com.google.android.exoplayer2.ExoPlayer.DeviceComponent {
    private final com.google.android.exoplayer2.util.ConditionVariable constructorFinished;
    private final com.google.android.exoplayer2.ExoPlayerImpl player;

    @java.lang.Deprecated
    public static final class Builder {
        private final com.google.android.exoplayer2.ExoPlayer.Builder wrappedBuilder;

        @java.lang.Deprecated
        public Builder(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder
                r0.<init>(r2)
                r1.wrappedBuilder = r0
                return
        }

        @java.lang.Deprecated
        public Builder(android.content.Context r2, com.google.android.exoplayer2.RenderersFactory r3) {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder
                r0.<init>(r2, r3)
                r1.wrappedBuilder = r0
                return
        }

        @java.lang.Deprecated
        public Builder(android.content.Context r3, com.google.android.exoplayer2.RenderersFactory r4, com.google.android.exoplayer2.extractor.ExtractorsFactory r5) {
                r2 = this;
                r2.<init>()
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory r1 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
                r1.<init>(r3, r5)
                r0.<init>(r3, r4, r1)
                r2.wrappedBuilder = r0
                return
        }

        @java.lang.Deprecated
        public Builder(android.content.Context r10, com.google.android.exoplayer2.RenderersFactory r11, com.google.android.exoplayer2.trackselection.TrackSelector r12, com.google.android.exoplayer2.source.MediaSource.Factory r13, com.google.android.exoplayer2.LoadControl r14, com.google.android.exoplayer2.upstream.BandwidthMeter r15, com.google.android.exoplayer2.analytics.AnalyticsCollector r16) {
                r9 = this;
                r9.<init>()
                com.google.android.exoplayer2.ExoPlayer$Builder r8 = new com.google.android.exoplayer2.ExoPlayer$Builder
                r0 = r8
                r1 = r10
                r2 = r11
                r3 = r13
                r4 = r12
                r5 = r14
                r6 = r15
                r7 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r0 = r9
                r0.wrappedBuilder = r8
                return
        }

        @java.lang.Deprecated
        public Builder(android.content.Context r3, com.google.android.exoplayer2.extractor.ExtractorsFactory r4) {
                r2 = this;
                r2.<init>()
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = new com.google.android.exoplayer2.ExoPlayer$Builder
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory r1 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
                r1.<init>(r3, r4)
                r0.<init>(r3, r1)
                r2.wrappedBuilder = r0
                return
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer build() {
                r3 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r3.wrappedBuilder
                boolean r1 = r0.buildCalled
                r2 = 1
                r1 = r1 ^ r2
                com.google.android.exoplayer2.util.Assertions.checkState(r1)
                r0.buildCalled = r2
                com.google.android.exoplayer2.SimpleExoPlayer r1 = new com.google.android.exoplayer2.SimpleExoPlayer
                r1.<init>(r0)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder experimentalSetForegroundModeTimeoutMs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.experimentalSetForegroundModeTimeoutMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setAnalyticsCollector(com.google.android.exoplayer2.analytics.AnalyticsCollector r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setAnalyticsCollector(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r2, boolean r3) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setAudioAttributes(r2, r3)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setBandwidthMeter(com.google.android.exoplayer2.upstream.BandwidthMeter r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setBandwidthMeter(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @androidx.annotation.VisibleForTesting
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setClock(com.google.android.exoplayer2.util.Clock r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setClock(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setDetachSurfaceTimeoutMs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setDetachSurfaceTimeoutMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setHandleAudioBecomingNoisy(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setHandleAudioBecomingNoisy(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setLivePlaybackSpeedControl(com.google.android.exoplayer2.LivePlaybackSpeedControl r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setLivePlaybackSpeedControl(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setLoadControl(com.google.android.exoplayer2.LoadControl r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setLoadControl(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setLooper(android.os.Looper r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setLooper(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setMediaSourceFactory(com.google.android.exoplayer2.source.MediaSource.Factory r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setMediaSourceFactory(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setPauseAtEndOfMediaItems(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setPauseAtEndOfMediaItems(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setPriorityTaskManager(@androidx.annotation.Nullable com.google.android.exoplayer2.util.PriorityTaskManager r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setPriorityTaskManager(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setReleaseTimeoutMs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setReleaseTimeoutMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setSeekBackIncrementMs(@androidx.annotation.IntRange(from = 1) long r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setSeekBackIncrementMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setSeekForwardIncrementMs(@androidx.annotation.IntRange(from = 1) long r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setSeekForwardIncrementMs(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setSeekParameters(com.google.android.exoplayer2.SeekParameters r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setSeekParameters(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setSkipSilenceEnabled(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setSkipSilenceEnabled(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setTrackSelector(com.google.android.exoplayer2.trackselection.TrackSelector r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setTrackSelector(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setUseLazyPreparation(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setUseLazyPreparation(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setVideoChangeFrameRateStrategy(int r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setVideoChangeFrameRateStrategy(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setVideoScalingMode(int r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setVideoScalingMode(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.SimpleExoPlayer.Builder setWakeMode(int r2) {
                r1 = this;
                com.google.android.exoplayer2.ExoPlayer$Builder r0 = r1.wrappedBuilder
                r0.setWakeMode(r2)
                return r1
        }
    }

    public SimpleExoPlayer(com.google.android.exoplayer2.ExoPlayer.Builder r3) {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ConditionVariable r0 = new com.google.android.exoplayer2.util.ConditionVariable
            r0.<init>()
            r2.constructorFinished = r0
            com.google.android.exoplayer2.ExoPlayerImpl r1 = new com.google.android.exoplayer2.ExoPlayerImpl     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L15
            r2.player = r1     // Catch: java.lang.Throwable -> L15
            r0.open()
            return
        L15:
            r3 = move-exception
            com.google.android.exoplayer2.util.ConditionVariable r0 = r2.constructorFinished
            r0.open()
            throw r3
    }

    private void blockUntilConstructorFinished() {
            r1 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r1.constructorFinished
            r0.blockUninterruptible()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addAnalyticsListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addAudioOffloadListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int r2, java.util.List<com.google.android.exoplayer2.MediaItem> r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addMediaItems(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int r2, com.google.android.exoplayer2.source.MediaSource r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addMediaSource(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(com.google.android.exoplayer2.source.MediaSource r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addMediaSource(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int r2, java.util.List<com.google.android.exoplayer2.source.MediaSource> r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addMediaSources(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.addMediaSources(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearAuxEffectInfo()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearCameraMotionListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearVideoFrameMetadataListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearVideoSurface()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearVideoSurface(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearVideoSurfaceHolder(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearVideoSurfaceView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.clearVideoTextureView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.PlayerMessage createMessage(com.google.android.exoplayer2.PlayerMessage.Target r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.PlayerMessage r2 = r0.createMessage(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void decreaseDeviceVolume() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.decreaseDeviceVolume()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.experimentalIsSleepingForOffload()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.experimentalSetOffloadSchedulingEnabled(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.analytics.AnalyticsCollector getAnalyticsCollector() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r0.getAnalyticsCollector()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public android.os.Looper getApplicationLooper() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            android.os.Looper r0 = r0.getApplicationLooper()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r0.getAudioAttributes()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.AudioComponent getAudioComponent() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.decoder.DecoderCounters getAudioDecoderCounters() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r0.getAudioDecoderCounters()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format getAudioFormat() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.Format r0 = r0.getAudioFormat()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getAudioSessionId()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Player.Commands getAvailableCommands() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.Player$Commands r0 = r0.getAvailableCommands()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getBufferedPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.util.Clock getClock() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.util.Clock r0 = r0.getClock()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getContentBufferedPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getContentPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getCurrentAdGroupIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getCurrentAdIndexInAdGroup()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public com.google.android.exoplayer2.text.CueGroup getCurrentCues() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.text.CueGroup r0 = r0.getCurrentCues()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getCurrentMediaItemIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getCurrentPeriodIndex()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getCurrentPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Timeline getCurrentTimeline() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.Timeline r0 = r0.getCurrentTimeline()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public com.google.android.exoplayer2.source.TrackGroupArray getCurrentTrackGroups() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getCurrentTrackGroups()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public com.google.android.exoplayer2.trackselection.TrackSelectionArray getCurrentTrackSelections() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.trackselection.TrackSelectionArray r0 = r0.getCurrentTrackSelections()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Tracks getCurrentTracks() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.Tracks r0 = r0.getCurrentTracks()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.DeviceComponent getDeviceComponent() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public com.google.android.exoplayer2.DeviceInfo getDeviceInfo() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.DeviceInfo r0 = r0.getDeviceInfo()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public int getDeviceVolume() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getDeviceVolume()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getDuration()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getMaxSeekToPreviousPosition() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getMaxSeekToPreviousPosition()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getMediaMetadata() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.MediaMetadata r0 = r0.getMediaMetadata()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.getPauseAtEndOfMediaItems()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.getPlayWhenReady()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public android.os.Looper getPlaybackLooper() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            android.os.Looper r0 = r0.getPlaybackLooper()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getPlaybackState()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getPlaybackSuppressionReason()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.ExoPlaybackException getPlayerError() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.ExoPlaybackException r0 = r0.getPlayerError()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.PlaybackException getPlayerError() {
            r1 = this;
            com.google.android.exoplayer2.ExoPlaybackException r0 = r1.getPlayerError()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.MediaMetadata r0 = r0.getPlaylistMetadata()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.Renderer getRenderer(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.Renderer r2 = r0.getRenderer(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getRendererCount()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r2 = r0.getRendererType(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getRepeatMode()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getSeekBackIncrement()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getSeekForwardIncrement()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.SeekParameters getSeekParameters() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.SeekParameters r0 = r0.getSeekParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.getShuffleModeEnabled()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.getSkipSilenceEnabled()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.util.Size getSurfaceSize() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.util.Size r0 = r0.getSurfaceSize()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.TextComponent getTextComponent() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
            r2 = this;
            r2.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r2.player
            long r0 = r0.getTotalBufferedDuration()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.getTrackSelectionParameters()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.trackselection.TrackSelector getTrackSelector() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r0.getTrackSelector()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getVideoChangeFrameRateStrategy()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.VideoComponent getVideoComponent() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.decoder.DecoderCounters getVideoDecoderCounters() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.decoder.DecoderCounters r0 = r0.getVideoDecoderCounters()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Format getVideoFormat() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.Format r0 = r0.getVideoFormat()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            int r0 = r0.getVideoScalingMode()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public com.google.android.exoplayer2.video.VideoSize getVideoSize() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            com.google.android.exoplayer2.video.VideoSize r0 = r0.getVideoSize()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public float getVolume() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            float r0 = r0.getVolume()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void increaseDeviceVolume() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.increaseDeviceVolume()
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public boolean isDeviceMuted() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.isDeviceMuted()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.isLoading()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.isPlayingAd()
            return r0
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isTunnelingEnabled() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            boolean r0 = r0.isTunnelingEnabled()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int r2, int r3, int r4) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.moveMediaItems(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.prepare()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void prepare(com.google.android.exoplayer2.source.MediaSource r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.prepare(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void prepare(com.google.android.exoplayer2.source.MediaSource r2, boolean r3, boolean r4) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.prepare(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.removeAnalyticsListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.removeAudioOffloadListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.removeListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int r2, int r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.removeMediaItems(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void retry() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.retry()
            return
    }

    @Override // com.google.android.exoplayer2.BasePlayer
    @androidx.annotation.VisibleForTesting(otherwise = 4)
    public void seekTo(int r7, long r8, int r10, boolean r11) {
            r6 = this;
            r6.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r6.player
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.seekTo(r1, r2, r4, r5)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r2, boolean r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setAudioAttributes(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioSessionId(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setAudioSessionId(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setAuxEffectInfo(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setCameraMotionListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceMuted(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setDeviceMuted(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceVolume(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setDeviceVolume(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setForegroundMode(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setHandleAudioBecomingNoisy(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void setHandleWakeLock(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setHandleWakeLock(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2, int r3, long r4) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaItems(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r2, boolean r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaItems(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaSource(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource r2, long r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaSource(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource r2, boolean r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaSource(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaSources(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r2, int r3, long r4) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaSources(r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> r2, boolean r3) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setMediaSources(r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setPauseAtEndOfMediaItems(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setPlayWhenReady(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setPlaybackParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setPlaylistMetadata(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @androidx.annotation.RequiresApi(23)
    public void setPreferredAudioDevice(@androidx.annotation.Nullable android.media.AudioDeviceInfo r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setPreferredAudioDevice(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPriorityTaskManager(@androidx.annotation.Nullable com.google.android.exoplayer2.util.PriorityTaskManager r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setPriorityTaskManager(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setRepeatMode(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@androidx.annotation.Nullable com.google.android.exoplayer2.SeekParameters r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setSeekParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setShuffleModeEnabled(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setShuffleOrder(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setSkipSilenceEnabled(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setTrackSelectionParameters(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVideoChangeFrameRateStrategy(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVideoFrameMetadataListener(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVideoScalingMode(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurface(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVideoSurface(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVideoSurfaceHolder(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVideoSurfaceView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVideoTextureView(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setVolume(float r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setVolume(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setWakeMode(int r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.setWakeMode(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.stop()
            return
    }

    @Override // com.google.android.exoplayer2.Player
    @java.lang.Deprecated
    public void stop(boolean r2) {
            r1 = this;
            r1.blockUntilConstructorFinished()
            com.google.android.exoplayer2.ExoPlayerImpl r0 = r1.player
            r0.stop(r2)
            return
    }
}
