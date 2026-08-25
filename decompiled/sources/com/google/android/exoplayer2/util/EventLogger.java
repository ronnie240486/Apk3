package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public class EventLogger implements com.google.android.exoplayer2.analytics.AnalyticsListener {
    private static final java.lang.String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final java.text.NumberFormat TIME_FORMAT = null;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private final long startTimeMs;
    private final java.lang.String tag;
    private final com.google.android.exoplayer2.Timeline.Window window;

    static {
            java.util.Locale r0 = java.util.Locale.US
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r0)
            com.google.android.exoplayer2.util.EventLogger.TIME_FORMAT = r0
            r1 = 2
            r0.setMinimumFractionDigits(r1)
            r0.setMaximumFractionDigits(r1)
            r1 = 0
            r0.setGroupingUsed(r1)
            return
    }

    public EventLogger() {
            r1 = this;
            java.lang.String r0 = "EventLogger"
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public EventLogger(@androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.MappingTrackSelector r1) {
            r0 = this;
            java.lang.String r1 = "EventLogger"
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public EventLogger(@androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.MappingTrackSelector r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    public EventLogger(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r2.tag = r3
            com.google.android.exoplayer2.Timeline$Window r3 = new com.google.android.exoplayer2.Timeline$Window
            r3.<init>()
            r2.window = r3
            com.google.android.exoplayer2.Timeline$Period r3 = new com.google.android.exoplayer2.Timeline$Period
            r3.<init>()
            r2.period = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.startTimeMs = r0
            return
    }

    private static java.lang.String getDiscontinuityReasonString(int r1) {
            if (r1 == 0) goto L23
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L17
            r0 = 5
            if (r1 == r0) goto L14
            java.lang.String r1 = "?"
            return r1
        L14:
            java.lang.String r1 = "INTERNAL"
            return r1
        L17:
            java.lang.String r1 = "REMOVE"
            return r1
        L1a:
            java.lang.String r1 = "SKIP"
            return r1
        L1d:
            java.lang.String r1 = "SEEK_ADJUSTMENT"
            return r1
        L20:
            java.lang.String r1 = "SEEK"
            return r1
        L23:
            java.lang.String r1 = "AUTO_TRANSITION"
            return r1
    }

    private java.lang.String getEventString(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable java.lang.Throwable r5) {
            r1 = this;
            java.lang.String r0 = " ["
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r3, r0)
            java.lang.String r2 = r1.getEventTimeString(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            boolean r3 = r5 instanceof com.google.android.exoplayer2.PlaybackException
            if (r3 == 0) goto L29
            java.lang.String r3 = ", errorCode="
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r2, r3)
            r3 = r5
            com.google.android.exoplayer2.PlaybackException r3 = (com.google.android.exoplayer2.PlaybackException) r3
            java.lang.String r3 = r3.getErrorCodeName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L29:
            if (r4 == 0) goto L31
            java.lang.String r3 = ", "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3, r4)
        L31:
            java.lang.String r3 = com.google.android.exoplayer2.util.Log.getThrowableString(r5)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L53
            java.lang.String r4 = "\n  "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r2, r4)
            java.lang.String r5 = "\n"
            java.lang.String r3 = r3.replace(r5, r4)
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L53:
            java.lang.String r3 = "]"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3)
            return r2
    }

    private java.lang.String getEventTimeString(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7) {
            r6 = this;
            java.lang.String r0 = "window="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r7.windowIndex
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId
            if (r1 == 0) goto L55
            java.lang.String r1 = ", period="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
            com.google.android.exoplayer2.Timeline r1 = r7.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.mediaPeriodId
            java.lang.Object r2 = r2.periodUid
            int r1 = r1.getIndexOfPeriod(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId
            boolean r1 = r1.isAd()
            if (r1 == 0) goto L55
            java.lang.String r1 = ", adGroup="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId
            int r1 = r1.adGroupIndex
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = ", ad="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId
            int r1 = r1.adIndexInAdGroup
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L55:
            java.lang.String r1 = "eventTime="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            long r2 = r7.realtimeMs
            long r4 = r6.startTimeMs
            long r2 = r2 - r4
            java.lang.String r2 = getTimeString(r2)
            r1.append(r2)
            java.lang.String r2 = ", mediaPos="
            r1.append(r2)
            long r2 = r7.eventPlaybackPositionMs
            java.lang.String r7 = getTimeString(r2)
            java.lang.String r2 = ", "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7, r2, r0)
            return r7
    }

    private static java.lang.String getMediaItemTransitionReasonString(int r1) {
            if (r1 == 0) goto L17
            r0 = 1
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 3
            if (r1 == r0) goto Le
            java.lang.String r1 = "?"
            return r1
        Le:
            java.lang.String r1 = "PLAYLIST_CHANGED"
            return r1
        L11:
            java.lang.String r1 = "SEEK"
            return r1
        L14:
            java.lang.String r1 = "AUTO"
            return r1
        L17:
            java.lang.String r1 = "REPEAT"
            return r1
    }

    private static java.lang.String getPlayWhenReadyChangeReasonString(int r1) {
            r0 = 1
            if (r1 == r0) goto L1e
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 == r0) goto L15
            r0 = 5
            if (r1 == r0) goto L12
            java.lang.String r1 = "?"
            return r1
        L12:
            java.lang.String r1 = "END_OF_MEDIA_ITEM"
            return r1
        L15:
            java.lang.String r1 = "REMOTE"
            return r1
        L18:
            java.lang.String r1 = "AUDIO_BECOMING_NOISY"
            return r1
        L1b:
            java.lang.String r1 = "AUDIO_FOCUS_LOSS"
            return r1
        L1e:
            java.lang.String r1 = "USER_REQUEST"
            return r1
    }

    private static java.lang.String getPlaybackSuppressionReasonString(int r1) {
            if (r1 == 0) goto Lb
            r0 = 1
            if (r1 == r0) goto L8
            java.lang.String r1 = "?"
            return r1
        L8:
            java.lang.String r1 = "TRANSIENT_AUDIO_FOCUS_LOSS"
            return r1
        Lb:
            java.lang.String r1 = "NONE"
            return r1
    }

    private static java.lang.String getRepeatModeString(int r1) {
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 == r0) goto Le
            r0 = 2
            if (r1 == r0) goto Lb
            java.lang.String r1 = "?"
            return r1
        Lb:
            java.lang.String r1 = "ALL"
            return r1
        Le:
            java.lang.String r1 = "ONE"
            return r1
        L11:
            java.lang.String r1 = "OFF"
            return r1
    }

    private static java.lang.String getStateString(int r1) {
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L12
            r0 = 4
            if (r1 == r0) goto Lf
            java.lang.String r1 = "?"
            return r1
        Lf:
            java.lang.String r1 = "ENDED"
            return r1
        L12:
            java.lang.String r1 = "READY"
            return r1
        L15:
            java.lang.String r1 = "BUFFERING"
            return r1
        L18:
            java.lang.String r1 = "IDLE"
            return r1
    }

    private static java.lang.String getTimeString(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            java.lang.String r3 = "?"
            goto L17
        Lc:
            java.text.NumberFormat r0 = com.google.android.exoplayer2.util.EventLogger.TIME_FORMAT
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            double r3 = (double) r3
            java.lang.String r3 = r0.format(r3)
        L17:
            return r3
    }

    private static java.lang.String getTimelineChangeReasonString(int r1) {
            if (r1 == 0) goto Lb
            r0 = 1
            if (r1 == r0) goto L8
            java.lang.String r1 = "?"
            return r1
        L8:
            java.lang.String r1 = "SOURCE_UPDATE"
            return r1
        Lb:
            java.lang.String r1 = "PLAYLIST_CHANGED"
            return r1
    }

    private static java.lang.String getTrackStatusString(boolean r0) {
            if (r0 == 0) goto L5
            java.lang.String r0 = "[X]"
            goto L7
        L5:
            java.lang.String r0 = "[ ]"
        L7:
            return r0
    }

    private void logd(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getEventString(r2, r3, r0, r0)
            r1.logd(r2)
            return
    }

    private void logd(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getEventString(r2, r3, r4, r0)
            r1.logd(r2)
            return
    }

    private void loge(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, java.lang.String r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r0 = this;
            java.lang.String r1 = r0.getEventString(r1, r2, r3, r4)
            java.lang.String r2 = r0.tag
            com.google.android.exoplayer2.util.Log.e(r2, r1)
            return
    }

    private void loge(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getEventString(r2, r3, r0, r4)
            java.lang.String r3 = r1.tag
            com.google.android.exoplayer2.util.Log.e(r3, r2)
            return
    }

    private void printInternalError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3, java.lang.Exception r4) {
            r1 = this;
            java.lang.String r0 = "internalError"
            r1.loge(r2, r0, r3, r4)
            return
    }

    private void printMetadata(com.google.android.exoplayer2.metadata.Metadata r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L1c
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            com.google.android.exoplayer2.metadata.Metadata$Entry r2 = r4.get(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.logd(r1)
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    public final void logd(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.tag
            com.google.android.exoplayer2.util.Log.d(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r4, com.google.android.exoplayer2.audio.AudioAttributes r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.contentType
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            int r2 = r5.flags
            r0.append(r2)
            r0.append(r1)
            int r2 = r5.usage
            r0.append(r2)
            r0.append(r1)
            int r5 = r5.allowedCapturePolicy
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "audioAttributes"
            r3.logd(r4, r0, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioCodecError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
            r0 = this;
            java.lang.String r3 = "audioDecoderInitialized"
            r0.logd(r1, r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "audioDecoderReleased"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            java.lang.String r2 = "audioDisabled"
            r0.logd(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            java.lang.String r2 = "audioEnabled"
            r0.logd(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioInputFormatChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
            r0 = this;
            java.lang.String r2 = com.google.android.exoplayer2.Format.toLogString(r2)
            java.lang.String r3 = "audioInputFormat"
            r0.logd(r1, r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioPositionAdvancing(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3) {
            r1 = this;
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "audioSessionId"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioSinkError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3, long r4, long r6) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r4)
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "audioTrackUnderrun"
            r5 = 0
            r1.loge(r2, r4, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.Commands r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAvailableCommandsChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.text.CueGroup r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.util.List r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderDisabled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderEnabled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, java.lang.String r3, long r4) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInitialized(r0, r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.Format r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInputFormatChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.DeviceInfo r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceInfoChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, boolean r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceVolumeChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r1 = this;
            com.google.android.exoplayer2.Format r3 = r3.trackFormat
            java.lang.String r3 = com.google.android.exoplayer2.Format.toLogString(r3)
            java.lang.String r0 = "downstreamFormat"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2) {
            r1 = this;
            java.lang.String r0 = "drmKeysLoaded"
            r1.logd(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2) {
            r1 = this;
            java.lang.String r0 = "drmKeysRemoved"
            r1.logd(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2) {
            r1 = this;
            java.lang.String r0 = "drmKeysRestored"
            r1.logd(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3) {
            r1 = this;
            java.lang.String r0 = "state="
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
            java.lang.String r0 = "drmSessionAcquired"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.Exception r3) {
            r1 = this;
            java.lang.String r0 = "drmSessionManagerError"
            r1.printInternalError(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2) {
            r1 = this;
            java.lang.String r0 = "drmSessionReleased"
            r1.logd(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3) {
            r0 = this;
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r3 = "droppedFrames"
            r0.logd(r1, r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onEvents(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onEvents(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r0 = "loading"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r0 = "isPlaying"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, java.io.IOException r4, boolean r5) {
            r0 = this;
            java.lang.String r2 = "loadError"
            r0.printInternalError(r1, r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadingChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMaxSeekToPreviousPositionChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r2, int r3) {
            r0 = this;
            java.lang.String r2 = "mediaItem ["
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r1 = r0.getEventTimeString(r1)
            r2.append(r1)
            java.lang.String r1 = ", reason="
            r2.append(r1)
            java.lang.String r1 = getMediaItemTransitionReasonString(r3)
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.logd(r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMediaMetadataChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, com.google.android.exoplayer2.metadata.Metadata r3) {
            r1 = this;
            java.lang.String r0 = "metadata ["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r2 = r1.getEventTimeString(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.logd(r2)
            java.lang.String r2 = "  "
            r1.printMetadata(r3, r2)
            java.lang.String r2 = "]"
            r1.logd(r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, boolean r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            java.lang.String r3 = getPlayWhenReadyChangeReasonString(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "playWhenReady"
            r1.logd(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, com.google.android.exoplayer2.PlaybackParameters r3) {
            r1 = this;
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "playbackParameters"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3) {
            r1 = this;
            java.lang.String r3 = getStateString(r3)
            java.lang.String r0 = "state"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3) {
            r1 = this;
            java.lang.String r3 = getPlaybackSuppressionReasonString(r3)
            java.lang.String r0 = "playbackSuppressionReason"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, com.google.android.exoplayer2.PlaybackException r3) {
            r1 = this;
            java.lang.String r0 = "playerFailed"
            r1.loge(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerErrorChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerReleased(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerStateChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaylistMetadataChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPositionDiscontinuity(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r11, com.google.android.exoplayer2.Player.PositionInfo r12, com.google.android.exoplayer2.Player.PositionInfo r13, int r14) {
            r10 = this;
            java.lang.String r0 = "reason="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r14 = getDiscontinuityReasonString(r14)
            r0.append(r14)
            java.lang.String r14 = ", PositionInfo:old ["
            r0.append(r14)
            java.lang.String r14 = "mediaItem="
            r0.append(r14)
            int r1 = r12.mediaItemIndex
            r0.append(r1)
            java.lang.String r1 = ", period="
            r0.append(r1)
            int r2 = r12.periodIndex
            r0.append(r2)
            java.lang.String r2 = ", pos="
            r0.append(r2)
            long r3 = r12.positionMs
            r0.append(r3)
            int r3 = r12.adGroupIndex
            java.lang.String r4 = ", ad="
            java.lang.String r5 = ", adGroup="
            java.lang.String r6 = ", contentPos="
            r7 = -1
            if (r3 == r7) goto L54
            r0.append(r6)
            long r8 = r12.contentPositionMs
            r0.append(r8)
            r0.append(r5)
            int r3 = r12.adGroupIndex
            r0.append(r3)
            r0.append(r4)
            int r12 = r12.adIndexInAdGroup
            r0.append(r12)
        L54:
            java.lang.String r12 = "], PositionInfo:new ["
            r0.append(r12)
            r0.append(r14)
            int r12 = r13.mediaItemIndex
            r0.append(r12)
            r0.append(r1)
            int r12 = r13.periodIndex
            r0.append(r12)
            r0.append(r2)
            long r1 = r13.positionMs
            r0.append(r1)
            int r12 = r13.adGroupIndex
            if (r12 == r7) goto L8d
            r0.append(r6)
            long r1 = r13.contentPositionMs
            r0.append(r1)
            r0.append(r5)
            int r12 = r13.adGroupIndex
            r0.append(r12)
            r0.append(r4)
            int r12 = r13.adIndexInAdGroup
            r0.append(r12)
        L8d:
            java.lang.String r12 = "]"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r13 = "positionDiscontinuity"
            r10.logd(r11, r13, r12)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Object r2, long r3) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "renderedFirstFrame"
            r0.logd(r1, r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3) {
            r1 = this;
            java.lang.String r3 = getRepeatModeString(r3)
            java.lang.String r0 = "repeatMode"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekBackIncrementChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekForwardIncrementChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekProcessed(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekStarted(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r0 = "shuffleModeEnabled"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r0 = "skipSilenceEnabled"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "surfaceSize"
            r1.logd(r2, r4, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r9, int r10) {
            r8 = this;
            com.google.android.exoplayer2.Timeline r0 = r9.timeline
            int r0 = r0.getPeriodCount()
            com.google.android.exoplayer2.Timeline r1 = r9.timeline
            int r1 = r1.getWindowCount()
            java.lang.String r2 = "timeline ["
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = r8.getEventTimeString(r9)
            r2.append(r3)
            java.lang.String r3 = ", periodCount="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", windowCount="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", reason="
            r2.append(r3)
            java.lang.String r10 = getTimelineChangeReasonString(r10)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r8.logd(r10)
            r10 = 0
            r2 = 0
        L3f:
            r3 = 3
            int r4 = java.lang.Math.min(r0, r3)
            java.lang.String r5 = "]"
            if (r2 >= r4) goto L73
            com.google.android.exoplayer2.Timeline r3 = r9.timeline
            com.google.android.exoplayer2.Timeline$Period r4 = r8.period
            r3.getPeriod(r2, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "  period ["
            r3.append(r4)
            com.google.android.exoplayer2.Timeline$Period r4 = r8.period
            long r6 = r4.getDurationMs()
            java.lang.String r4 = getTimeString(r6)
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r8.logd(r3)
            int r2 = r2 + 1
            goto L3f
        L73:
            java.lang.String r2 = "  ..."
            if (r0 <= r3) goto L7a
            r8.logd(r2)
        L7a:
            int r0 = java.lang.Math.min(r1, r3)
            if (r10 >= r0) goto Lc3
            com.google.android.exoplayer2.Timeline r0 = r9.timeline
            com.google.android.exoplayer2.Timeline$Window r4 = r8.window
            r0.getWindow(r10, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "  window ["
            r0.append(r4)
            com.google.android.exoplayer2.Timeline$Window r4 = r8.window
            long r6 = r4.getDurationMs()
            java.lang.String r4 = getTimeString(r6)
            r0.append(r4)
            java.lang.String r4 = ", seekable="
            r0.append(r4)
            com.google.android.exoplayer2.Timeline$Window r4 = r8.window
            boolean r4 = r4.isSeekable
            r0.append(r4)
            java.lang.String r4 = ", dynamic="
            r0.append(r4)
            com.google.android.exoplayer2.Timeline$Window r4 = r8.window
            boolean r4 = r4.isDynamic
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r8.logd(r0)
            int r10 = r10 + 1
            goto L7a
        Lc3:
            if (r1 <= r3) goto Lc8
            r8.logd(r2)
        Lc8:
            r8.logd(r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTrackSelectionParametersChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r8, com.google.android.exoplayer2.Tracks r9) {
            r7 = this;
            java.lang.String r0 = "tracks ["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r8 = r7.getEventTimeString(r8)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.logd(r8)
            com.google.common.collect.ImmutableList r8 = r9.getGroups()
            r9 = 0
        L1a:
            int r0 = r8.size()
            java.lang.String r1 = "    "
            java.lang.String r2 = "  ]"
            if (r9 >= r0) goto L7f
            java.lang.Object r0 = r8.get(r9)
            com.google.android.exoplayer2.Tracks$Group r0 = (com.google.android.exoplayer2.Tracks.Group) r0
            java.lang.String r3 = "  group ["
            r7.logd(r3)
            r3 = 0
        L30:
            int r4 = r0.length
            if (r3 >= r4) goto L79
            boolean r4 = r0.isTrackSelected(r3)
            java.lang.String r4 = getTrackStatusString(r4)
            int r5 = r0.getTrackSupport(r3)
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.getFormatSupportString(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r4)
            java.lang.String r4 = " Track:"
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = ", "
            r6.append(r4)
            com.google.android.exoplayer2.Format r4 = r0.getTrackFormat(r3)
            java.lang.String r4 = com.google.android.exoplayer2.Format.toLogString(r4)
            r6.append(r4)
            java.lang.String r4 = ", supported="
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r7.logd(r4)
            int r3 = r3 + 1
            goto L30
        L79:
            r7.logd(r2)
            int r9 = r9 + 1
            goto L1a
        L7f:
            r9 = 0
            r0 = 0
        L81:
            if (r9 != 0) goto Lbc
            int r3 = r8.size()
            if (r0 >= r3) goto Lbc
            java.lang.Object r3 = r8.get(r0)
            com.google.android.exoplayer2.Tracks$Group r3 = (com.google.android.exoplayer2.Tracks.Group) r3
            r4 = 0
        L90:
            if (r9 != 0) goto Lb9
            int r5 = r3.length
            if (r4 >= r5) goto Lb9
            boolean r5 = r3.isTrackSelected(r4)
            if (r5 == 0) goto Lb6
            com.google.android.exoplayer2.Format r5 = r3.getTrackFormat(r4)
            com.google.android.exoplayer2.metadata.Metadata r5 = r5.metadata
            if (r5 == 0) goto Lb6
            int r6 = r5.length()
            if (r6 <= 0) goto Lb6
            java.lang.String r9 = "  Metadata ["
            r7.logd(r9)
            r7.printMetadata(r5, r1)
            r7.logd(r2)
            r9 = 1
        Lb6:
            int r4 = r4 + 1
            goto L90
        Lb9:
            int r0 = r0 + 1
            goto L81
        Lbc:
            java.lang.String r8 = "]"
            r7.logd(r8)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r1 = this;
            com.google.android.exoplayer2.Format r3 = r3.trackFormat
            java.lang.String r3 = com.google.android.exoplayer2.Format.toLogString(r3)
            java.lang.String r0 = "upstreamDiscarded"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoCodecError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
            r0 = this;
            java.lang.String r3 = "videoDecoderInitialized"
            r0.logd(r1, r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "videoDecoderReleased"
            r1.logd(r2, r0, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            java.lang.String r2 = "videoDisabled"
            r0.logd(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            java.lang.String r2 = "videoEnabled"
            r0.logd(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2, int r4) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoFrameProcessingOffset(r0, r1, r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoInputFormatChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
            r0 = this;
            java.lang.String r2 = com.google.android.exoplayer2.Format.toLogString(r2)
            java.lang.String r3 = "videoInputFormat"
            r0.logd(r1, r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3, int r4, float r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoSizeChanged(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r3, com.google.android.exoplayer2.video.VideoSize r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.width
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r4 = r4.height
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "videoSize"
            r2.logd(r3, r0, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, float r3) {
            r1 = this;
            java.lang.String r3 = java.lang.Float.toString(r3)
            java.lang.String r0 = "volume"
            r1.logd(r2, r0, r3)
            return
    }
}
