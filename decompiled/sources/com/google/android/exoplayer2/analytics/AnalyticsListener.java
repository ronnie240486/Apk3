package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes2.dex */
public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_CODEC_ERROR = 1029;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1008;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1012;
    public static final int EVENT_AUDIO_DISABLED = 1013;
    public static final int EVENT_AUDIO_ENABLED = 1007;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1009;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1010;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AUDIO_SINK_ERROR = 1014;
    public static final int EVENT_AUDIO_UNDERRUN = 1011;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1023;
    public static final int EVENT_DRM_KEYS_REMOVED = 1026;
    public static final int EVENT_DRM_KEYS_RESTORED = 1025;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1022;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1024;
    public static final int EVENT_DRM_SESSION_RELEASED = 1027;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1018;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
    public static final int EVENT_PLAYER_RELEASED = 1028;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 15;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 5;
    public static final int EVENT_POSITION_DISCONTINUITY = 11;
    public static final int EVENT_RENDERED_FIRST_FRAME = 26;
    public static final int EVENT_REPEAT_MODE_CHANGED = 8;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 16;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 17;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 9;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 23;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 24;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_TRACK_SELECTION_PARAMETERS_CHANGED = 19;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_CODEC_ERROR = 1030;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1016;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1019;
    public static final int EVENT_VIDEO_DISABLED = 1020;
    public static final int EVENT_VIDEO_ENABLED = 1015;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1021;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1017;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.AnalyticsListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.audio.AudioAttributes r2) {
                return
        }

        public static void $default$onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
                return
        }

        public static void $default$onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
                return
        }

        public static void $default$onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
                return
        }

        public static void $default$onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                return
        }

        public static void $default$onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
                return
        }

        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
                return
        }

        public static void $default$onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
                return
        }

        public static void $default$onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                return
        }

        public static void $default$onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
                return
        }

        public static void $default$onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5) {
                return
        }

        public static void $default$onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.Commands r2) {
                return
        }

        public static void $default$onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5) {
                return
        }

        public static void $default$onCues(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.text.CueGroup r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onCues(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.util.List r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, java.lang.String r3, long r4) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.Format r3) {
                return
        }

        public static void $default$onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.DeviceInfo r2) {
                return
        }

        public static void $default$onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, boolean r3) {
                return
        }

        public static void $default$onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.MediaLoadData r2) {
                return
        }

        public static void $default$onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        public static void $default$onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        public static void $default$onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                return
        }

        public static void $default$onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
                return
        }

        public static void $default$onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        public static void $default$onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3) {
                return
        }

        public static void $default$onEvents(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r2) {
                return
        }

        public static void $default$onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
                return
        }

        public static void $default$onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
                return
        }

        public static void $default$onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                return
        }

        public static void $default$onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                return
        }

        public static void $default$onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, java.io.IOException r4, boolean r5) {
                return
        }

        public static void $default$onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
                return
        }

        public static void $default$onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
                return
        }

        public static void $default$onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r2, int r3) {
                return
        }

        public static void $default$onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
                return
        }

        public static void $default$onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.metadata.Metadata r2) {
                return
        }

        public static void $default$onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3) {
                return
        }

        public static void $default$onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackParameters r2) {
                return
        }

        public static void $default$onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                return
        }

        public static void $default$onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                return
        }

        public static void $default$onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2) {
                return
        }

        public static void $default$onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, @androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r2) {
                return
        }

        public static void $default$onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3) {
                return
        }

        public static void $default$onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                return
        }

        public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, int r4) {
                return
        }

        public static void $default$onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Object r2, long r3) {
                return
        }

        public static void $default$onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                return
        }

        public static void $default$onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
                return
        }

        public static void $default$onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
                return
        }

        public static void $default$onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
                return
        }

        public static void $default$onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
                return
        }

        public static void $default$onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3) {
                return
        }

        public static void $default$onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
                return
        }

        public static void $default$onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
                return
        }

        public static void $default$onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Tracks r2) {
                return
        }

        public static void $default$onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.MediaLoadData r2) {
                return
        }

        public static void $default$onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
                return
        }

        public static void $default$onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
                return
        }

        public static void $default$onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
                return
        }

        public static void $default$onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                return
        }

        public static void $default$onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                return
        }

        public static void $default$onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2, int r4) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
                return
        }

        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3, int r4, float r5) {
                return
        }

        public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.video.VideoSize r2) {
                return
        }

        public static void $default$onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener r0, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, float r2) {
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class EventTime {

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final com.google.android.exoplayer2.Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final com.google.android.exoplayer2.Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long r1, com.google.android.exoplayer2.Timeline r3, int r4, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5, long r6, com.google.android.exoplayer2.Timeline r8, int r9, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r10, long r11, long r13) {
                r0 = this;
                r0.<init>()
                r0.realtimeMs = r1
                r0.timeline = r3
                r0.windowIndex = r4
                r0.mediaPeriodId = r5
                r0.eventPlaybackPositionMs = r6
                r0.currentTimeline = r8
                r0.currentWindowIndex = r9
                r0.currentMediaPeriodId = r10
                r0.currentPlaybackPositionMs = r11
                r0.totalBufferedDurationMs = r13
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L69
                java.lang.Class<com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime> r2 = com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L69
            L10:
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r8 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r8
                long r2 = r7.realtimeMs
                long r4 = r8.realtimeMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                int r2 = r7.windowIndex
                int r3 = r8.windowIndex
                if (r2 != r3) goto L67
                long r2 = r7.eventPlaybackPositionMs
                long r4 = r8.eventPlaybackPositionMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                int r2 = r7.currentWindowIndex
                int r3 = r8.currentWindowIndex
                if (r2 != r3) goto L67
                long r2 = r7.currentPlaybackPositionMs
                long r4 = r8.currentPlaybackPositionMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                long r2 = r7.totalBufferedDurationMs
                long r4 = r8.totalBufferedDurationMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                com.google.android.exoplayer2.Timeline r2 = r7.timeline
                com.google.android.exoplayer2.Timeline r3 = r8.timeline
                boolean r2 = com.google.common.base.Objects.equal(r2, r3)
                if (r2 == 0) goto L67
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.mediaPeriodId
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r8.mediaPeriodId
                boolean r2 = com.google.common.base.Objects.equal(r2, r3)
                if (r2 == 0) goto L67
                com.google.android.exoplayer2.Timeline r2 = r7.currentTimeline
                com.google.android.exoplayer2.Timeline r3 = r8.currentTimeline
                boolean r2 = com.google.common.base.Objects.equal(r2, r3)
                if (r2 == 0) goto L67
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.currentMediaPeriodId
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = r8.currentMediaPeriodId
                boolean r8 = com.google.common.base.Objects.equal(r2, r8)
                if (r8 == 0) goto L67
                goto L68
            L67:
                r0 = 0
            L68:
                return r0
            L69:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 10
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r1 = r3.realtimeMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                com.google.android.exoplayer2.Timeline r1 = r3.timeline
                r2 = 1
                r0[r2] = r1
                int r1 = r3.windowIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId
                r2 = 3
                r0[r2] = r1
                long r1 = r3.eventPlaybackPositionMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 4
                r0[r2] = r1
                com.google.android.exoplayer2.Timeline r1 = r3.currentTimeline
                r2 = 5
                r0[r2] = r1
                int r1 = r3.currentWindowIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 6
                r0[r2] = r1
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.currentMediaPeriodId
                r2 = 7
                r0[r2] = r1
                long r1 = r3.currentPlaybackPositionMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 8
                r0[r2] = r1
                long r1 = r3.totalBufferedDurationMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 9
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Events {
        private final android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> eventTimes;
        private final com.google.android.exoplayer2.util.FlagSet flags;

        public Events(com.google.android.exoplayer2.util.FlagSet r5, android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> r6) {
                r4 = this;
                r4.<init>()
                r4.flags = r5
                android.util.SparseArray r0 = new android.util.SparseArray
                int r1 = r5.size()
                r0.<init>(r1)
                r1 = 0
            Lf:
                int r2 = r5.size()
                if (r1 >= r2) goto L2b
                int r2 = r5.get(r1)
                java.lang.Object r3 = r6.get(r2)
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r3
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r3 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r3
                r0.append(r2, r3)
                int r1 = r1 + 1
                goto Lf
            L2b:
                r4.eventTimes = r0
                return
        }

        public boolean contains(int r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                boolean r2 = r0.contains(r2)
                return r2
        }

        public boolean containsAny(int... r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                boolean r2 = r0.containsAny(r2)
                return r2
        }

        public int get(int r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r2 = r0.get(r2)
                return r2
        }

        public com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime getEventTime(int r2) {
                r1 = this;
                android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime> r0 = r1.eventTimes
                java.lang.Object r2 = r0.get(r2)
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r2
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) r2
                return r2
        }

        public int size() {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r0 = r0.size()
                return r0
        }
    }

    void onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.audio.AudioAttributes r2);

    void onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2);

    @java.lang.Deprecated
    void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3);

    void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5);

    void onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2);

    void onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2);

    void onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2);

    @java.lang.Deprecated
    void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2);

    void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3);

    void onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2);

    void onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2);

    void onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5);

    void onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.Commands r2);

    void onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5);

    void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.text.CueGroup r2);

    @java.lang.Deprecated
    void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.util.List<com.google.android.exoplayer2.text.Cue> r2);

    @java.lang.Deprecated
    void onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3);

    @java.lang.Deprecated
    void onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3);

    @java.lang.Deprecated
    void onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, java.lang.String r3, long r4);

    @java.lang.Deprecated
    void onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.Format r3);

    void onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.DeviceInfo r2);

    void onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, boolean r3);

    void onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.MediaLoadData r2);

    void onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    void onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    void onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    @java.lang.Deprecated
    void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2);

    void onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    void onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3);

    void onEvents(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r2);

    void onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2);

    void onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2);

    void onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3);

    void onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3);

    void onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, java.io.IOException r4, boolean r5);

    void onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3);

    @java.lang.Deprecated
    void onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2);

    void onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2);

    void onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r2, int r3);

    void onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2);

    void onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.metadata.Metadata r2);

    void onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3);

    void onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackParameters r2);

    void onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2);

    void onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, @androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r2);

    void onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    @java.lang.Deprecated
    void onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3);

    void onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2);

    @java.lang.Deprecated
    void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, int r4);

    void onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Object r2, long r3);

    void onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2);

    void onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2);

    @java.lang.Deprecated
    void onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    @java.lang.Deprecated
    void onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1);

    void onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2);

    void onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2);

    void onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3);

    void onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2);

    void onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2);

    void onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Tracks r2);

    void onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.MediaLoadData r2);

    void onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2);

    @java.lang.Deprecated
    void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3);

    void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5);

    void onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2);

    void onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2);

    void onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2);

    void onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2, int r4);

    @java.lang.Deprecated
    void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2);

    void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3);

    @java.lang.Deprecated
    void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3, int r4, float r5);

    void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.video.VideoSize r2);

    void onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, float r2);
}
