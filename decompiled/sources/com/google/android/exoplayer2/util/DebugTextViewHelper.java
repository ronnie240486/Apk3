package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final com.google.android.exoplayer2.ExoPlayer player;
    private boolean started;
    private final android.widget.TextView textView;
    private final com.google.android.exoplayer2.util.DebugTextViewHelper.Updater updater;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.DebugTextViewHelper$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class Updater implements com.google.android.exoplayer2.Player.Listener, java.lang.Runnable {
        public final /* synthetic */ com.google.android.exoplayer2.util.DebugTextViewHelper this$0;

        private Updater(com.google.android.exoplayer2.util.DebugTextViewHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ Updater(com.google.android.exoplayer2.util.DebugTextViewHelper r1, com.google.android.exoplayer2.util.DebugTextViewHelper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioAttributesChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAudioSessionIdChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioSessionIdChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAvailableCommandsChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onCues(com.google.android.exoplayer2.text.CueGroup r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onCues(java.util.List r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceInfoChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onDeviceVolumeChanged(int r1, boolean r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceVolumeChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onEvents(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.Player.Events r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onEvents(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onIsLoadingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onIsLoadingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onIsPlayingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onIsPlayingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onLoadingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onLoadingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.MediaItem r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaItemTransition(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaMetadataChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMetadata(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.util.DebugTextViewHelper r1 = r0.this$0
                r1.updateAndPost()
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.util.DebugTextViewHelper r1 = r0.this$0
                r1.updateAndPost()
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerError(com.google.android.exoplayer2.PlaybackException r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerError(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackException r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerErrorChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerStateChanged(boolean r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerStateChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaylistMetadataChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, int r3) {
                r0 = this;
                com.google.android.exoplayer2.util.DebugTextViewHelper r1 = r0.this$0
                r1.updateAndPost()
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onRenderedFirstFrame() {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onRenderedFirstFrame(r0)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onRepeatModeChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onRepeatModeChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekBackIncrementChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekBackIncrementChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekForwardIncrementChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekForwardIncrementChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekProcessed() {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekProcessed(r0)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onShuffleModeEnabledChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSkipSilenceEnabledChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSurfaceSizeChanged(int r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSurfaceSizeChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.Timeline r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTimelineChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTrackSelectionParametersChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.Tracks r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTracksChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onVideoSizeChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onVolumeChanged(float r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(r0, r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.google.android.exoplayer2.util.DebugTextViewHelper r0 = r1.this$0
                r0.updateAndPost()
                return
        }
    }

    public DebugTextViewHelper(com.google.android.exoplayer2.ExoPlayer r3, android.widget.TextView r4) {
            r2 = this;
            r2.<init>()
            android.os.Looper r0 = r3.getApplicationLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r2.player = r3
            r2.textView = r4
            com.google.android.exoplayer2.util.DebugTextViewHelper$Updater r3 = new com.google.android.exoplayer2.util.DebugTextViewHelper$Updater
            r4 = 0
            r3.<init>(r2, r4)
            r2.updater = r3
            return
    }

    private static java.lang.String getDecoderCountersBufferCountString(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            r2.ensureUpdated()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " sib:"
            r0.append(r1)
            int r1 = r2.skippedInputBufferCount
            r0.append(r1)
            java.lang.String r1 = " sb:"
            r0.append(r1)
            int r1 = r2.skippedOutputBufferCount
            r0.append(r1)
            java.lang.String r1 = " rb:"
            r0.append(r1)
            int r1 = r2.renderedOutputBufferCount
            r0.append(r1)
            java.lang.String r1 = " db:"
            r0.append(r1)
            int r1 = r2.droppedBufferCount
            r0.append(r1)
            java.lang.String r1 = " mcdb:"
            r0.append(r1)
            int r1 = r2.maxConsecutiveDroppedBufferCount
            r0.append(r1)
            java.lang.String r1 = " dk:"
            r0.append(r1)
            int r2 = r2.droppedToKeyframeCount
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String getPixelAspectRatioString(float r4) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L2d
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            goto L2d
        Ld:
            java.lang.String r0 = " par:"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r2[r3] = r4
            java.lang.String r4 = "%.02f"
            java.lang.String r4 = java.lang.String.format(r1, r4, r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L2f
        L2d:
            java.lang.String r4 = ""
        L2f:
            return r4
    }

    private static java.lang.String getVideoFrameProcessingOffsetAverageString(long r2, int r4) {
            if (r4 != 0) goto L5
            java.lang.String r2 = "N/A"
            return r2
        L5:
            double r2 = (double) r2
            double r0 = (double) r4
            double r2 = r2 / r0
            long r2 = (long) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
    }

    public final void start() {
            r2 = this;
            boolean r0 = r2.started
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.started = r0
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player
            com.google.android.exoplayer2.util.DebugTextViewHelper$Updater r1 = r2.updater
            r0.addListener(r1)
            r2.updateAndPost()
            return
    }

    public final void stop() {
            r2 = this;
            boolean r0 = r2.started
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.started = r0
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player
            com.google.android.exoplayer2.util.DebugTextViewHelper$Updater r1 = r2.updater
            r0.removeListener(r1)
            android.widget.TextView r0 = r2.textView
            com.google.android.exoplayer2.util.DebugTextViewHelper$Updater r1 = r2.updater
            r0.removeCallbacks(r1)
            return
    }

    @android.annotation.SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
            r11 = this;
            android.widget.TextView r0 = r11.textView
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.android.exoplayer2.ExoPlayer r2 = r11.player
            int r2 = r2.getPlaybackState()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == r5) goto L27
            if (r2 == r4) goto L24
            if (r2 == r3) goto L20
            r6 = 4
            if (r2 == r6) goto L1d
            java.lang.String r2 = "unknown"
            goto L29
        L1d:
            java.lang.String r2 = "ended"
            goto L29
        L20:
            java.lang.String r2 = "ready"
            goto L29
        L24:
            java.lang.String r2 = "buffering"
            goto L29
        L27:
            java.lang.String r2 = "idle"
        L29:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6 = 0
            com.google.android.exoplayer2.ExoPlayer r7 = r11.player
            boolean r7 = r7.getPlayWhenReady()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3[r6] = r7
            r3[r5] = r2
            com.google.android.exoplayer2.ExoPlayer r2 = r11.player
            int r2 = r2.getCurrentMediaItemIndex()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            java.lang.String r2 = "playWhenReady:%s playbackState:%s item:%s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.append(r2)
            com.google.android.exoplayer2.ExoPlayer r2 = r11.player
            com.google.android.exoplayer2.Format r2 = r2.getVideoFormat()
            com.google.android.exoplayer2.ExoPlayer r3 = r11.player
            com.google.android.exoplayer2.decoder.DecoderCounters r3 = r3.getVideoDecoderCounters()
            java.lang.String r4 = ")"
            java.lang.String r5 = "(id:"
            java.lang.String r6 = "\n"
            java.lang.String r7 = ""
            if (r2 == 0) goto Lb0
            if (r3 != 0) goto L68
            goto Lb0
        L68:
            java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r9 = r2.sampleMimeType
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = r2.id
            r8.append(r9)
            java.lang.String r9 = " r:"
            r8.append(r9)
            int r9 = r2.width
            r8.append(r9)
            java.lang.String r9 = "x"
            r8.append(r9)
            int r9 = r2.height
            r8.append(r9)
            float r2 = r2.pixelWidthHeightRatio
            java.lang.String r2 = getPixelAspectRatioString(r2)
            r8.append(r2)
            java.lang.String r2 = getDecoderCountersBufferCountString(r3)
            r8.append(r2)
            java.lang.String r2 = " vfpo: "
            r8.append(r2)
            long r9 = r3.totalVideoFrameProcessingOffsetUs
            int r2 = r3.videoFrameProcessingOffsetCount
            java.lang.String r2 = getVideoFrameProcessingOffsetAverageString(r9, r2)
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r2, r4)
            goto Lb1
        Lb0:
            r2 = r7
        Lb1:
            r1.append(r2)
            com.google.android.exoplayer2.ExoPlayer r2 = r11.player
            com.google.android.exoplayer2.Format r2 = r2.getAudioFormat()
            com.google.android.exoplayer2.ExoPlayer r3 = r11.player
            com.google.android.exoplayer2.decoder.DecoderCounters r3 = r3.getAudioDecoderCounters()
            if (r2 == 0) goto Lf2
            if (r3 != 0) goto Lc5
            goto Lf2
        Lc5:
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r7 = r2.sampleMimeType
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r2.id
            r6.append(r5)
            java.lang.String r5 = " hz:"
            r6.append(r5)
            int r5 = r2.sampleRate
            r6.append(r5)
            java.lang.String r5 = " ch:"
            r6.append(r5)
            int r2 = r2.channelCount
            r6.append(r2)
            java.lang.String r2 = getDecoderCountersBufferCountString(r3)
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r2, r4)
        Lf2:
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r11.textView
            com.google.android.exoplayer2.util.DebugTextViewHelper$Updater r1 = r11.updater
            r0.removeCallbacks(r1)
            android.widget.TextView r0 = r11.textView
            com.google.android.exoplayer2.util.DebugTextViewHelper$Updater r1 = r11.updater
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
    }
}
