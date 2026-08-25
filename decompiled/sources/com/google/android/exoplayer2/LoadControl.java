package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public interface LoadControl {
    com.google.android.exoplayer2.upstream.Allocator getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    void onTracksSelected(com.google.android.exoplayer2.Renderer[] r1, com.google.android.exoplayer2.source.TrackGroupArray r2, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r3);

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long r1, long r3, float r5);

    boolean shouldStartPlayback(long r1, float r3, boolean r4, long r5);
}
