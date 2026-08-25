package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTrackSelection implements com.google.android.exoplayer2.trackselection.ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final com.google.android.exoplayer2.Format[] formats;
    public final com.google.android.exoplayer2.source.TrackGroup group;
    private int hashCode;
    public final int length;
    public final int[] tracks;
    private final int type;

    /* JADX INFO: renamed from: $r8$lambda$ALcklVtTNeq1fd041-XkLZDVu5M, reason: not valid java name */
    public static /* synthetic */ int m258$r8$lambda$ALcklVtTNeq1fd041XkLZDVu5M(com.google.android.exoplayer2.Format r0, com.google.android.exoplayer2.Format r1) {
            int r0 = lambda$new$0(r0, r1)
            return r0
    }

    public BaseTrackSelection(com.google.android.exoplayer2.source.TrackGroup r2, int... r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BaseTrackSelection(com.google.android.exoplayer2.source.TrackGroup r4, int[] r5, int r6) {
            r3 = this;
            r3.<init>()
            int r0 = r5.length
            r1 = 0
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r3.type = r6
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.source.TrackGroup r6 = (com.google.android.exoplayer2.source.TrackGroup) r6
            r3.group = r6
            int r6 = r5.length
            r3.length = r6
            com.google.android.exoplayer2.Format[] r6 = new com.google.android.exoplayer2.Format[r6]
            r3.formats = r6
            r6 = 0
        L1f:
            int r0 = r5.length
            if (r6 >= r0) goto L2f
            com.google.android.exoplayer2.Format[] r0 = r3.formats
            r2 = r5[r6]
            com.google.android.exoplayer2.Format r2 = r4.getFormat(r2)
            r0[r6] = r2
            int r6 = r6 + 1
            goto L1f
        L2f:
            com.google.android.exoplayer2.Format[] r5 = r3.formats
            com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0 r6 = com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0.INSTANCE
            java.util.Arrays.sort(r5, r6)
            int r5 = r3.length
            int[] r5 = new int[r5]
            r3.tracks = r5
        L3c:
            int r5 = r3.length
            if (r1 >= r5) goto L4f
            int[] r5 = r3.tracks
            com.google.android.exoplayer2.Format[] r6 = r3.formats
            r6 = r6[r1]
            int r6 = r4.indexOf(r6)
            r5[r1] = r6
            int r1 = r1 + 1
            goto L3c
        L4f:
            long[] r4 = new long[r5]
            r3.excludeUntilTimes = r4
            return
    }

    private static /* synthetic */ int lambda$new$0(com.google.android.exoplayer2.Format r0, com.google.android.exoplayer2.Format r1) {
            int r1 = r1.bitrate
            int r0 = r0.bitrate
            int r1 = r1 - r0
            return r1
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean blacklist(int r11, long r12) {
            r10 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            boolean r2 = r10.isBlacklisted(r11, r0)
            r3 = 0
            r4 = 0
        La:
            int r5 = r10.length
            r6 = 1
            if (r4 >= r5) goto L1f
            if (r2 != 0) goto L1f
            if (r4 == r11) goto L1b
            boolean r2 = r10.isBlacklisted(r4, r0)
            if (r2 != 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            int r4 = r4 + 1
            goto La
        L1f:
            if (r2 != 0) goto L22
            return r3
        L22:
            long[] r7 = r10.excludeUntilTimes
            r8 = r7[r11]
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = r12
            long r12 = com.google.android.exoplayer2.util.Util.addWithOverflowDefault(r0, r2, r4)
            long r12 = java.lang.Math.max(r8, r12)
            r7[r11] = r12
            return r6
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
            r0 = this;
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L27
        L12:
            com.google.android.exoplayer2.trackselection.BaseTrackSelection r5 = (com.google.android.exoplayer2.trackselection.BaseTrackSelection) r5
            com.google.android.exoplayer2.source.TrackGroup r2 = r4.group
            com.google.android.exoplayer2.source.TrackGroup r3 = r5.group
            if (r2 != r3) goto L25
            int[] r2 = r4.tracks
            int[] r5 = r5.tracks
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
        L27:
            return r1
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long r1, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r3) {
            r0 = this;
            int r1 = r3.size()
            return r1
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final com.google.android.exoplayer2.Format getFormat(int r2) {
            r1 = this;
            com.google.android.exoplayer2.Format[] r0 = r1.formats
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int r2) {
            r1 = this;
            int[] r0 = r1.tracks
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final com.google.android.exoplayer2.Format getSelectedFormat() {
            r2 = this;
            com.google.android.exoplayer2.Format[] r0 = r2.formats
            int r1 = r2.getSelectedIndex()
            r0 = r0[r1]
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
            r2 = this;
            int[] r0 = r2.tracks
            int r1 = r2.getSelectedIndex()
            r0 = r0[r1]
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final com.google.android.exoplayer2.source.TrackGroup getTrackGroup() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroup r0 = r1.group
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L15
            com.google.android.exoplayer2.source.TrackGroup r0 = r2.group
            int r0 = java.lang.System.identityHashCode(r0)
            int r0 = r0 * 31
            int[] r1 = r2.tracks
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            r2.hashCode = r1
        L15:
            int r0 = r2.hashCode
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.length
            if (r0 >= r1) goto Lf
            int[] r1 = r2.tracks
            r1 = r1[r0]
            if (r1 != r3) goto Lc
            return r0
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            r3 = -1
            return r3
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(com.google.android.exoplayer2.Format r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.length
            if (r0 >= r1) goto Lf
            com.google.android.exoplayer2.Format[] r1 = r2.formats
            r1 = r1[r0]
            if (r1 != r3) goto Lc
            return r0
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            r3 = -1
            return r3
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean isBlacklisted(int r4, long r5) {
            r3 = this;
            long[] r0 = r3.excludeUntilTimes
            r1 = r0[r4]
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            return r4
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
            r1 = this;
            int[] r0 = r1.tracks
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final /* synthetic */ void onDiscontinuity() {
            r0 = this;
            com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$onDiscontinuity(r0)
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean r1) {
            r0 = this;
            com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$onPlayWhenReadyChanged(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final /* synthetic */ void onRebuffer() {
            r0 = this;
            com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$onRebuffer(r0)
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final /* synthetic */ boolean shouldCancelChunkLoad(long r1, com.google.android.exoplayer2.source.chunk.Chunk r3, java.util.List r4) {
            r0 = this;
            boolean r1 = com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$shouldCancelChunkLoad(r0, r1, r3, r4)
            return r1
    }
}
