package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioProcessorChain {
    com.google.android.exoplayer2.PlaybackParameters applyPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r1);

    boolean applySkipSilenceEnabled(boolean r1);

    com.google.android.exoplayer2.audio.AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long r1);

    long getSkippedOutputFrameCount();
}
