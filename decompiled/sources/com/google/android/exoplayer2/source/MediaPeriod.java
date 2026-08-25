package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public interface MediaPeriod extends com.google.android.exoplayer2.source.SequenceableLoader {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.MediaPeriod$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static java.util.List $default$getStreamKeys(com.google.android.exoplayer2.source.MediaPeriod r0, java.util.List r1) {
                java.util.List r0 = java.util.Collections.emptyList()
                return r0
        }
    }

    public interface Callback extends com.google.android.exoplayer2.source.SequenceableLoader.Callback<com.google.android.exoplayer2.source.MediaPeriod> {
        void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r1);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    boolean continueLoading(long r1);

    void discardBuffer(long r1, boolean r3);

    long getAdjustedSeekPositionUs(long r1, com.google.android.exoplayer2.SeekParameters r3);

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    long getNextLoadPositionUs();

    java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> r1);

    com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    boolean isLoading();

    void maybeThrowPrepareError() throws java.io.IOException;

    void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2);

    long readDiscontinuity();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    void reevaluateBuffer(long r1);

    long seekToUs(long r1);

    long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1, boolean[] r2, com.google.android.exoplayer2.source.SampleStream[] r3, boolean[] r4, long r5);
}
