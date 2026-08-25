package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class FixedTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {

    @androidx.annotation.Nullable
    private final java.lang.Object data;
    private final int reason;

    public FixedTrackSelection(com.google.android.exoplayer2.source.TrackGroup r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FixedTrackSelection(com.google.android.exoplayer2.source.TrackGroup r7, int r8, int r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public FixedTrackSelection(com.google.android.exoplayer2.source.TrackGroup r3, int r4, int r5, int r6, @androidx.annotation.Nullable java.lang.Object r7) {
            r2 = this;
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r4
            r2.<init>(r3, r0, r5)
            r2.reason = r6
            r2.data = r7
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @androidx.annotation.Nullable
    public java.lang.Object getSelectionData() {
            r1 = this;
            java.lang.Object r0 = r1.data
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
            r1 = this;
            int r0 = r1.reason
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long r1, long r3, long r5, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r7, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r8) {
            r0 = this;
            return
    }
}
