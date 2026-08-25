package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes2.dex */
public interface AnalyticsCollector extends com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.source.MediaSourceEventListener, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener, com.google.android.exoplayer2.drm.DrmSessionEventListener {
    void addListener(com.google.android.exoplayer2.analytics.AnalyticsListener r1);

    void notifySeekStarted();

    void onAudioCodecError(java.lang.Exception r1);

    void onAudioDecoderInitialized(java.lang.String r1, long r2, long r4);

    void onAudioDecoderReleased(java.lang.String r1);

    void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    void onAudioInputFormatChanged(com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2);

    void onAudioPositionAdvancing(long r1);

    void onAudioSinkError(java.lang.Exception r1);

    void onAudioUnderrun(int r1, long r2, long r4);

    void onDroppedFrames(int r1, long r2);

    void onRenderedFirstFrame(java.lang.Object r1, long r2);

    void onVideoCodecError(java.lang.Exception r1);

    void onVideoDecoderInitialized(java.lang.String r1, long r2, long r4);

    void onVideoDecoderReleased(java.lang.String r1);

    void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    void onVideoFrameProcessingOffset(long r1, int r3);

    void onVideoInputFormatChanged(com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2);

    void release();

    void removeListener(com.google.android.exoplayer2.analytics.AnalyticsListener r1);

    void setPlayer(com.google.android.exoplayer2.Player r1, android.os.Looper r2);

    void updateMediaPeriodQueueInfo(java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2);
}
