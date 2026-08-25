package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes2.dex */
public final class RandomTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {
    private final java.util.Random random;
    private int selectedIndex;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory {
        private final java.util.Random random;

        public static /* synthetic */ com.google.android.exoplayer2.trackselection.ExoTrackSelection $r8$lambda$daPFkhyilSrce3G1vNzNsPVQBCs(com.google.android.exoplayer2.trackselection.RandomTrackSelection.Factory r0, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition r1) {
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r0.lambda$createTrackSelections$0(r1)
                return r0
        }

        public Factory() {
                r1 = this;
                r1.<init>()
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                r1.random = r0
                return
        }

        public Factory(int r4) {
                r3 = this;
                r3.<init>()
                java.util.Random r0 = new java.util.Random
                long r1 = (long) r4
                r0.<init>(r1)
                r3.random = r0
                return
        }

        private /* synthetic */ com.google.android.exoplayer2.trackselection.ExoTrackSelection lambda$createTrackSelections$0(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition r5) {
                r4 = this;
                com.google.android.exoplayer2.trackselection.RandomTrackSelection r0 = new com.google.android.exoplayer2.trackselection.RandomTrackSelection
                com.google.android.exoplayer2.source.TrackGroup r1 = r5.group
                int[] r2 = r5.tracks
                int r5 = r5.type
                java.util.Random r3 = r4.random
                r0.<init>(r1, r2, r5, r3)
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r1, com.google.android.exoplayer2.upstream.BandwidthMeter r2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.Timeline r4) {
                r0 = this;
                com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r2 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
                r3 = 9
                r2.<init>(r0, r3)
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = com.google.android.exoplayer2.trackselection.TrackSelectionUtil.createTrackSelectionsForDefinitions(r1, r2)
                return r1
        }
    }

    public RandomTrackSelection(com.google.android.exoplayer2.source.TrackGroup r1, int[] r2, int r3, java.util.Random r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.random = r4
            int r1 = r0.length
            int r1 = r4.nextInt(r1)
            r0.selectedIndex = r1
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
            r1 = this;
            int r0 = r1.selectedIndex
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @androidx.annotation.Nullable
    public java.lang.Object getSelectionData() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long r1, long r3, long r5, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r7, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r8) {
            r0 = this;
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 0
            r4 = 0
            r5 = 0
        L7:
            int r6 = r0.length
            if (r4 >= r6) goto L16
            boolean r6 = r0.isBlacklisted(r4, r1)
            if (r6 != 0) goto L13
            int r5 = r5 + 1
        L13:
            int r4 = r4 + 1
            goto L7
        L16:
            java.util.Random r4 = r0.random
            int r4 = r4.nextInt(r5)
            r0.selectedIndex = r4
            int r4 = r0.length
            if (r5 == r4) goto L3a
            r4 = 0
        L23:
            int r5 = r0.length
            if (r3 >= r5) goto L3a
            boolean r5 = r0.isBlacklisted(r3, r1)
            if (r5 != 0) goto L37
            int r5 = r0.selectedIndex
            int r6 = r4 + 1
            if (r5 != r4) goto L36
            r0.selectedIndex = r3
            return
        L36:
            r4 = r6
        L37:
            int r3 = r3 + 1
            goto L23
        L3a:
            return
    }
}
