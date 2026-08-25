package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public interface ExoTrackSelection extends com.google.android.exoplayer2.trackselection.TrackSelection {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.ExoTrackSelection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDiscontinuity(com.google.android.exoplayer2.trackselection.ExoTrackSelection r0) {
                return
        }

        public static void $default$onPlayWhenReadyChanged(com.google.android.exoplayer2.trackselection.ExoTrackSelection r0, boolean r1) {
                return
        }

        public static void $default$onRebuffer(com.google.android.exoplayer2.trackselection.ExoTrackSelection r0) {
                return
        }

        public static boolean $default$shouldCancelChunkLoad(com.google.android.exoplayer2.trackselection.ExoTrackSelection r0, long r1, com.google.android.exoplayer2.source.chunk.Chunk r3, java.util.List r4) {
                r0 = 0
                return r0
        }
    }

    public static final class Definition {
        private static final java.lang.String TAG = "ETSDefinition";
        public final com.google.android.exoplayer2.source.TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(com.google.android.exoplayer2.source.TrackGroup r2, int... r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public Definition(com.google.android.exoplayer2.source.TrackGroup r4, int[] r5, int r6) {
                r3 = this;
                r3.<init>()
                int r0 = r5.length
                if (r0 != 0) goto L12
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                java.lang.String r1 = "ETSDefinition"
                java.lang.String r2 = "Empty tracks are not allowed"
                com.google.android.exoplayer2.util.Log.e(r1, r2, r0)
            L12:
                r3.group = r4
                r3.tracks = r5
                r3.type = r6
                return
        }
    }

    public interface Factory {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r1, com.google.android.exoplayer2.upstream.BandwidthMeter r2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.Timeline r4);
    }

    boolean blacklist(int r1, long r2);

    void disable();

    void enable();

    int evaluateQueueSize(long r1, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r3);

    com.google.android.exoplayer2.Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @androidx.annotation.Nullable
    java.lang.Object getSelectionData();

    int getSelectionReason();

    boolean isBlacklisted(int r1, long r2);

    void onDiscontinuity();

    void onPlayWhenReadyChanged(boolean r1);

    void onPlaybackSpeed(float r1);

    void onRebuffer();

    boolean shouldCancelChunkLoad(long r1, com.google.android.exoplayer2.source.chunk.Chunk r3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r4);

    void updateSelectedTrack(long r1, long r3, long r5, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r7, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r8);
}
