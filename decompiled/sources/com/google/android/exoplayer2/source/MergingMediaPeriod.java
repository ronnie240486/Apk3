package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
final class MergingMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaPeriod.Callback {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
    private final java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.source.TrackGroup> childTrackGroupByMergedTrackGroup;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> childrenPendingPreparation;
    private com.google.android.exoplayer2.source.SequenceableLoader compositeSequenceableLoader;
    private final com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private com.google.android.exoplayer2.source.MediaPeriod[] enabledPeriods;
    private final com.google.android.exoplayer2.source.MediaPeriod[] periods;
    private final java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> streamPeriodIndices;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.TrackGroupArray trackGroups;

    public static final class ForwardingTrackSelection implements com.google.android.exoplayer2.trackselection.ExoTrackSelection {
        private final com.google.android.exoplayer2.source.TrackGroup trackGroup;
        private final com.google.android.exoplayer2.trackselection.ExoTrackSelection trackSelection;

        public ForwardingTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection r1, com.google.android.exoplayer2.source.TrackGroup r2) {
                r0 = this;
                r0.<init>()
                r0.trackSelection = r1
                r0.trackGroup = r2
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean blacklist(int r2, long r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                boolean r2 = r0.blacklist(r2, r3)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void disable() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                r0.disable()
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void enable() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                r0.enable()
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.exoplayer2.source.MergingMediaPeriod.ForwardingTrackSelection
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.source.MergingMediaPeriod$ForwardingTrackSelection r5 = (com.google.android.exoplayer2.source.MergingMediaPeriod.ForwardingTrackSelection) r5
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r1 = r4.trackSelection
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r3 = r5.trackSelection
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                com.google.android.exoplayer2.source.TrackGroup r1 = r4.trackGroup
                com.google.android.exoplayer2.source.TrackGroup r5 = r5.trackGroup
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int evaluateQueueSize(long r2, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r4) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r2 = r0.evaluateQueueSize(r2, r4)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public com.google.android.exoplayer2.Format getFormat(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                com.google.android.exoplayer2.Format r2 = r0.getFormat(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getIndexInTrackGroup(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r2 = r0.getIndexInTrackGroup(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public com.google.android.exoplayer2.Format getSelectedFormat() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                com.google.android.exoplayer2.Format r0 = r0.getSelectedFormat()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r0 = r0.getSelectedIndex()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndexInTrackGroup() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r0 = r0.getSelectedIndexInTrackGroup()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @androidx.annotation.Nullable
        public java.lang.Object getSelectionData() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                java.lang.Object r0 = r0.getSelectionData()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r0 = r0.getSelectionReason()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public com.google.android.exoplayer2.source.TrackGroup getTrackGroup() {
                r1 = this;
                com.google.android.exoplayer2.source.TrackGroup r0 = r1.trackGroup
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getType() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r0 = r0.getType()
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.google.android.exoplayer2.source.TrackGroup r0 = r2.trackGroup
                int r0 = r0.hashCode()
                int r0 = r0 + 527
                int r0 = r0 * 31
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r1 = r2.trackSelection
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(int r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r2 = r0.indexOf(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(com.google.android.exoplayer2.Format r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r2 = r0.indexOf(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean isBlacklisted(int r2, long r3) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                boolean r2 = r0.isBlacklisted(r2, r3)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int length() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                int r0 = r0.length()
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onDiscontinuity() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                r0.onDiscontinuity()
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlayWhenReadyChanged(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                r0.onPlayWhenReadyChanged(r2)
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlaybackSpeed(float r2) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                r0.onPlaybackSpeed(r2)
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onRebuffer() {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                r0.onRebuffer()
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean shouldCancelChunkLoad(long r2, com.google.android.exoplayer2.source.chunk.Chunk r4, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r5) {
                r1 = this;
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r1.trackSelection
                boolean r2 = r0.shouldCancelChunkLoad(r2, r4, r5)
                return r2
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long r11, long r13, long r15, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r17, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r18) {
                r10 = this;
                r0 = r10
                com.google.android.exoplayer2.trackselection.ExoTrackSelection r1 = r0.trackSelection
                r2 = r11
                r4 = r13
                r6 = r15
                r8 = r17
                r9 = r18
                r1.updateSelectedTrack(r2, r4, r6, r8, r9)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class TimeOffsetMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaPeriod.Callback {
        private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
        private final com.google.android.exoplayer2.source.MediaPeriod mediaPeriod;
        private final long timeOffsetUs;

        public TimeOffsetMediaPeriod(com.google.android.exoplayer2.source.MediaPeriod r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.mediaPeriod = r1
                r0.timeOffsetUs = r2
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaPeriod access$000(com.google.android.exoplayer2.source.MergingMediaPeriod.TimeOffsetMediaPeriod r0) {
                com.google.android.exoplayer2.source.MediaPeriod r0 = r0.mediaPeriod
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r3.mediaPeriod
                long r1 = r3.timeOffsetUs
                long r4 = r4 - r1
                boolean r4 = r0.continueLoading(r4)
                return r4
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long r4, boolean r6) {
                r3 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r3.mediaPeriod
                long r1 = r3.timeOffsetUs
                long r4 = r4 - r1
                r0.discardBuffer(r4, r6)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long r4, com.google.android.exoplayer2.SeekParameters r6) {
                r3 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r3.mediaPeriod
                long r1 = r3.timeOffsetUs
                long r4 = r4 - r1
                long r4 = r0.getAdjustedSeekPositionUs(r4, r6)
                long r0 = r3.timeOffsetUs
                long r4 = r4 + r0
                return r4
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
                r5 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r5.mediaPeriod
                long r0 = r0.getBufferedPositionUs()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Ld
                goto L10
            Ld:
                long r2 = r5.timeOffsetUs
                long r2 = r2 + r0
            L10:
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
                r5 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r5.mediaPeriod
                long r0 = r0.getNextLoadPositionUs()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Ld
                goto L10
            Ld:
                long r2 = r5.timeOffsetUs
                long r2 = r2 + r0
            L10:
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> r2) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
                java.util.List r2 = r0.getStreamKeys(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
                com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups()
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
                boolean r0 = r0.isLoading()
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
                r0.maybeThrowPrepareError()
                return
        }

        public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r1) {
                r0 = this;
                com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
                r1.onContinueLoadingRequested(r0)
                return
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
                r0 = this;
                com.google.android.exoplayer2.source.MediaPeriod r1 = (com.google.android.exoplayer2.source.MediaPeriod) r1
                r0.onContinueLoadingRequested(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r1) {
                r0 = this;
                com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
                r1.onPrepared(r0)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r3, long r4) {
                r2 = this;
                r2.callback = r3
                com.google.android.exoplayer2.source.MediaPeriod r3 = r2.mediaPeriod
                long r0 = r2.timeOffsetUs
                long r4 = r4 - r0
                r3.prepare(r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
                r5 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r5.mediaPeriod
                long r0 = r0.readDiscontinuity()
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L10
                goto L13
            L10:
                long r2 = r5.timeOffsetUs
                long r2 = r2 + r0
            L13:
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r3.mediaPeriod
                long r1 = r3.timeOffsetUs
                long r4 = r4 - r1
                r0.reevaluateBuffer(r4)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r3.mediaPeriod
                long r1 = r3.timeOffsetUs
                long r4 = r4 - r1
                long r4 = r0.seekToUs(r4)
                long r0 = r3.timeOffsetUs
                long r4 = r4 + r0
                return r4
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r13, boolean[] r14, com.google.android.exoplayer2.source.SampleStream[] r15, boolean[] r16, long r17) {
                r12 = this;
                r0 = r12
                r1 = r15
                int r2 = r1.length
                com.google.android.exoplayer2.source.SampleStream[] r2 = new com.google.android.exoplayer2.source.SampleStream[r2]
                r10 = 0
                r3 = 0
            L7:
                int r4 = r1.length
                r11 = 0
                if (r3 >= r4) goto L1a
                r4 = r1[r3]
                com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetSampleStream r4 = (com.google.android.exoplayer2.source.MergingMediaPeriod.TimeOffsetSampleStream) r4
                if (r4 == 0) goto L15
                com.google.android.exoplayer2.source.SampleStream r11 = r4.getChildStream()
            L15:
                r2[r3] = r11
                int r3 = r3 + 1
                goto L7
            L1a:
                com.google.android.exoplayer2.source.MediaPeriod r3 = r0.mediaPeriod
                long r4 = r0.timeOffsetUs
                long r8 = r17 - r4
                r4 = r13
                r5 = r14
                r6 = r2
                r7 = r16
                long r3 = r3.selectTracks(r4, r5, r6, r7, r8)
            L29:
                int r5 = r1.length
                if (r10 >= r5) goto L4d
                r5 = r2[r10]
                if (r5 != 0) goto L33
                r1[r10] = r11
                goto L4a
            L33:
                r6 = r1[r10]
                if (r6 == 0) goto L41
                r6 = r1[r10]
                com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetSampleStream r6 = (com.google.android.exoplayer2.source.MergingMediaPeriod.TimeOffsetSampleStream) r6
                com.google.android.exoplayer2.source.SampleStream r6 = r6.getChildStream()
                if (r6 == r5) goto L4a
            L41:
                com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetSampleStream r6 = new com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetSampleStream
                long r7 = r0.timeOffsetUs
                r6.<init>(r5, r7)
                r1[r10] = r6
            L4a:
                int r10 = r10 + 1
                goto L29
            L4d:
                long r1 = r0.timeOffsetUs
                long r3 = r3 + r1
                return r3
        }
    }

    public static final class TimeOffsetSampleStream implements com.google.android.exoplayer2.source.SampleStream {
        private final com.google.android.exoplayer2.source.SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(com.google.android.exoplayer2.source.SampleStream r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.sampleStream = r1
                r0.timeOffsetUs = r2
                return
        }

        public com.google.android.exoplayer2.source.SampleStream getChildStream() {
                r1 = this;
                com.google.android.exoplayer2.source.SampleStream r0 = r1.sampleStream
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
                r1 = this;
                com.google.android.exoplayer2.source.SampleStream r0 = r1.sampleStream
                boolean r0 = r0.isReady()
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.SampleStream r0 = r1.sampleStream
                r0.maybeThrowError()
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder r7, com.google.android.exoplayer2.decoder.DecoderInputBuffer r8, int r9) {
                r6 = this;
                com.google.android.exoplayer2.source.SampleStream r0 = r6.sampleStream
                int r7 = r0.readData(r7, r8, r9)
                r9 = -4
                if (r7 != r9) goto L16
                r0 = 0
                long r2 = r8.timeUs
                long r4 = r6.timeOffsetUs
                long r2 = r2 + r4
                long r0 = java.lang.Math.max(r0, r2)
                r8.timeUs = r0
            L16:
                return r7
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.SampleStream r0 = r3.sampleStream
                long r1 = r3.timeOffsetUs
                long r4 = r4 - r1
                int r4 = r0.skipData(r4)
                return r4
        }
    }

    public MergingMediaPeriod(com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r6, long[] r7, com.google.android.exoplayer2.source.MediaPeriod... r8) {
            r5 = this;
            r5.<init>()
            r5.compositeSequenceableLoaderFactory = r6
            r5.periods = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.childrenPendingPreparation = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.childTrackGroupByMergedTrackGroup = r0
            r0 = 0
            com.google.android.exoplayer2.source.SequenceableLoader[] r1 = new com.google.android.exoplayer2.source.SequenceableLoader[r0]
            com.google.android.exoplayer2.source.SequenceableLoader r6 = r6.createCompositeSequenceableLoader(r1)
            r5.compositeSequenceableLoader = r6
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            r5.streamPeriodIndices = r6
            com.google.android.exoplayer2.source.MediaPeriod[] r6 = new com.google.android.exoplayer2.source.MediaPeriod[r0]
            r5.enabledPeriods = r6
        L29:
            int r6 = r8.length
            if (r0 >= r6) goto L44
            r1 = r7[r0]
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L41
            com.google.android.exoplayer2.source.MediaPeriod[] r6 = r5.periods
            com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetMediaPeriod r1 = new com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetMediaPeriod
            r2 = r8[r0]
            r3 = r7[r0]
            r1.<init>(r2, r3)
            r6[r0] = r1
        L41:
            int r0 = r0 + 1
            goto L29
        L44:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r5) {
            r4 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r0 = r4.childrenPendingPreparation
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r0 = r4.childrenPendingPreparation
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L10:
            if (r2 >= r0) goto L20
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r3 = r4.childrenPendingPreparation
            java.lang.Object r3 = r3.get(r2)
            com.google.android.exoplayer2.source.MediaPeriod r3 = (com.google.android.exoplayer2.source.MediaPeriod) r3
            r3.continueLoading(r5)
            int r2 = r2 + 1
            goto L10
        L20:
            return r1
        L21:
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r4.compositeSequenceableLoader
            boolean r5 = r0.continueLoading(r5)
            return r5
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long r5, boolean r7) {
            r4 = this;
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r4.enabledPeriods
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.discardBuffer(r5, r7)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long r4, com.google.android.exoplayer2.SeekParameters r6) {
            r3 = this;
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r3.enabledPeriods
            int r1 = r0.length
            r2 = 0
            if (r1 <= 0) goto L9
            r0 = r0[r2]
            goto Ld
        L9:
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r3.periods
            r0 = r0[r2]
        Ld:
            long r4 = r0.getAdjustedSeekPositionUs(r4, r6)
            return r4
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r2 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r2.compositeSequenceableLoader
            long r0 = r0.getBufferedPositionUs()
            return r0
    }

    public com.google.android.exoplayer2.source.MediaPeriod getChildPeriod(int r3) {
            r2 = this;
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r2.periods
            r1 = r0[r3]
            boolean r1 = r1 instanceof com.google.android.exoplayer2.source.MergingMediaPeriod.TimeOffsetMediaPeriod
            if (r1 == 0) goto L11
            r3 = r0[r3]
            com.google.android.exoplayer2.source.MergingMediaPeriod$TimeOffsetMediaPeriod r3 = (com.google.android.exoplayer2.source.MergingMediaPeriod.TimeOffsetMediaPeriod) r3
            com.google.android.exoplayer2.source.MediaPeriod r3 = com.google.android.exoplayer2.source.MergingMediaPeriod.TimeOffsetMediaPeriod.access$000(r3)
            goto L13
        L11:
            r3 = r0[r3]
        L13:
            return r3
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
            r2 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r2.compositeSequenceableLoader
            long r0 = r0.getNextLoadPositionUs()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final /* synthetic */ java.util.List getStreamKeys(java.util.List r1) {
            r0 = this;
            java.util.List r1 = com.google.android.exoplayer2.source.MediaPeriod.CC.$default$getStreamKeys(r0, r1)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.trackGroups
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.TrackGroupArray r0 = (com.google.android.exoplayer2.source.TrackGroupArray) r0
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r1.compositeSequenceableLoader
            boolean r0 = r0.isLoading()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r4.periods
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.maybeThrowPrepareError()
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
            r1.onContinueLoadingRequested(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod r1 = (com.google.android.exoplayer2.source.MediaPeriod) r1
            r0.onContinueLoadingRequested(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r10) {
            r9 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r0 = r9.childrenPendingPreparation
            r0.remove(r10)
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r10 = r9.childrenPendingPreparation
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Le
            return
        Le:
            com.google.android.exoplayer2.source.MediaPeriod[] r10 = r9.periods
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = 0
        L14:
            if (r2 >= r0) goto L22
            r4 = r10[r2]
            com.google.android.exoplayer2.source.TrackGroupArray r4 = r4.getTrackGroups()
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L14
        L22:
            com.google.android.exoplayer2.source.TrackGroup[] r10 = new com.google.android.exoplayer2.source.TrackGroup[r3]
            r0 = 0
            r2 = 0
        L26:
            com.google.android.exoplayer2.source.MediaPeriod[] r3 = r9.periods
            int r4 = r3.length
            if (r0 >= r4) goto L64
            r3 = r3[r0]
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r3.getTrackGroups()
            int r4 = r3.length
            r5 = 0
        L34:
            if (r5 >= r4) goto L61
            com.google.android.exoplayer2.source.TrackGroup r6 = r3.get(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r8 = ":"
            r7.append(r8)
            java.lang.String r8 = r6.id
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.google.android.exoplayer2.source.TrackGroup r7 = r6.copyWithId(r7)
            java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.source.TrackGroup> r8 = r9.childTrackGroupByMergedTrackGroup
            r8.put(r7, r6)
            int r6 = r2 + 1
            r10[r2] = r7
            int r5 = r5 + 1
            r2 = r6
            goto L34
        L61:
            int r0 = r0 + 1
            goto L26
        L64:
            com.google.android.exoplayer2.source.TrackGroupArray r0 = new com.google.android.exoplayer2.source.TrackGroupArray
            r0.<init>(r10)
            r9.trackGroups = r0
            com.google.android.exoplayer2.source.MediaPeriod$Callback r10 = r9.callback
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r10 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r10
            r10.onPrepared(r9)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r4, long r5) {
            r3 = this;
            r3.callback = r4
            java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r4 = r3.childrenPendingPreparation
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r3.periods
            java.util.Collections.addAll(r4, r0)
            com.google.android.exoplayer2.source.MediaPeriod[] r4 = r3.periods
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r4[r1]
            r2.prepare(r3, r5)
            int r1 = r1 + 1
            goto Ld
        L17:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
            r17 = this;
            r0 = r17
            com.google.android.exoplayer2.source.MediaPeriod[] r1 = r0.enabledPeriods
            int r2 = r1.length
            r3 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r4
            r6 = 0
        Ld:
            if (r6 >= r2) goto L60
            r9 = r1[r6]
            long r10 = r9.readDiscontinuity()
            java.lang.String r12 = "Unexpected child seekToUs result."
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 == 0) goto L4a
            int r13 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r13 != 0) goto L3d
            com.google.android.exoplayer2.source.MediaPeriod[] r7 = r0.enabledPeriods
            int r8 = r7.length
            r13 = 0
        L23:
            if (r13 >= r8) goto L3b
            r14 = r7[r13]
            if (r14 != r9) goto L2a
            goto L3b
        L2a:
            long r14 = r14.seekToUs(r10)
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 != 0) goto L35
            int r13 = r13 + 1
            goto L23
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r12)
            throw r1
        L3b:
            r7 = r10
            goto L5d
        L3d:
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 != 0) goto L42
            goto L5d
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Conflicting discontinuities."
            r1.<init>(r2)
            throw r1
        L4a:
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 == 0) goto L5d
            long r9 = r9.seekToUs(r7)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L57
            goto L5d
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r12)
            throw r1
        L5d:
            int r6 = r6 + 1
            goto Ld
        L60:
            return r7
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r1.compositeSequenceableLoader
            r0.reevaluateBuffer(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long r5) {
            r4 = this;
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r4.enabledPeriods
            r1 = 0
            r0 = r0[r1]
            long r5 = r0.seekToUs(r5)
            r0 = 1
        La:
            com.google.android.exoplayer2.source.MediaPeriod[] r1 = r4.enabledPeriods
            int r2 = r1.length
            if (r0 >= r2) goto L24
            r1 = r1[r0]
            long r1 = r1.seekToUs(r5)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c
            int r0 = r0 + 1
            goto La
        L1c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unexpected child seekToUs result."
            r5.<init>(r6)
            throw r5
        L24:
            return r5
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r21, boolean[] r22, com.google.android.exoplayer2.source.SampleStream[] r23, boolean[] r24, long r25) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = 0
        Le:
            int r7 = r1.length
            r8 = 0
            if (r6 >= r7) goto L4f
            r7 = r2[r6]
            if (r7 != 0) goto L17
            goto L22
        L17:
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> r7 = r0.streamPeriodIndices
            r8 = r2[r6]
            java.lang.Object r7 = r7.get(r8)
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
        L22:
            r7 = -1
            if (r8 != 0) goto L27
            r8 = -1
            goto L2b
        L27:
            int r8 = r8.intValue()
        L2b:
            r3[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L4a
            r7 = r1[r6]
            com.google.android.exoplayer2.source.TrackGroup r7 = r7.getTrackGroup()
            java.lang.String r7 = r7.id
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r4[r6] = r7
            goto L4c
        L4a:
            r4[r6] = r7
        L4c:
            int r6 = r6 + 1
            goto Le
        L4f:
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> r6 = r0.streamPeriodIndices
            r6.clear()
            int r6 = r1.length
            com.google.android.exoplayer2.source.SampleStream[] r7 = new com.google.android.exoplayer2.source.SampleStream[r6]
            int r9 = r1.length
            com.google.android.exoplayer2.source.SampleStream[] r9 = new com.google.android.exoplayer2.source.SampleStream[r9]
            int r10 = r1.length
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r15 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r10]
            java.util.ArrayList r14 = new java.util.ArrayList
            com.google.android.exoplayer2.source.MediaPeriod[] r10 = r0.periods
            int r10 = r10.length
            r14.<init>(r10)
            r17 = r25
            r13 = 0
        L68:
            com.google.android.exoplayer2.source.MediaPeriod[] r10 = r0.periods
            int r10 = r10.length
            if (r13 >= r10) goto L10f
            r10 = 0
        L6e:
            int r11 = r1.length
            if (r10 >= r11) goto La7
            r11 = r3[r10]
            if (r11 != r13) goto L78
            r11 = r2[r10]
            goto L79
        L78:
            r11 = r8
        L79:
            r9[r10] = r11
            r11 = r4[r10]
            if (r11 != r13) goto La1
            r11 = r1[r10]
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r11 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection) r11
            com.google.android.exoplayer2.source.TrackGroup r12 = r11.getTrackGroup()
            java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.source.TrackGroup> r5 = r0.childTrackGroupByMergedTrackGroup
            java.lang.Object r5 = r5.get(r12)
            com.google.android.exoplayer2.source.TrackGroup r5 = (com.google.android.exoplayer2.source.TrackGroup) r5
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            com.google.android.exoplayer2.source.TrackGroup r5 = (com.google.android.exoplayer2.source.TrackGroup) r5
            com.google.android.exoplayer2.source.MergingMediaPeriod$ForwardingTrackSelection r12 = new com.google.android.exoplayer2.source.MergingMediaPeriod$ForwardingTrackSelection
            r12.<init>(r11, r5)
            r15[r10] = r12
            goto La3
        La1:
            r15[r10] = r8
        La3:
            int r10 = r10 + 1
            r5 = 0
            goto L6e
        La7:
            com.google.android.exoplayer2.source.MediaPeriod[] r5 = r0.periods
            r10 = r5[r13]
            r11 = r15
            r12 = r22
            r5 = r13
            r13 = r9
            r8 = r14
            r14 = r24
            r19 = r15
            r15 = r17
            long r10 = r10.selectTracks(r11, r12, r13, r14, r15)
            if (r5 != 0) goto Lc0
            r17 = r10
            goto Lc4
        Lc0:
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 != 0) goto L107
        Lc4:
            r10 = 0
            r11 = 0
        Lc6:
            int r12 = r1.length
            if (r10 >= r12) goto Lf5
            r12 = r4[r10]
            r13 = 1
            if (r12 != r5) goto Le5
            r11 = r9[r10]
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            com.google.android.exoplayer2.source.SampleStream r11 = (com.google.android.exoplayer2.source.SampleStream) r11
            r12 = r9[r10]
            r7[r10] = r12
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> r12 = r0.streamPeriodIndices
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r12.put(r11, r14)
            r11 = 1
            goto Lf2
        Le5:
            r12 = r3[r10]
            if (r12 != r5) goto Lf2
            r12 = r9[r10]
            if (r12 != 0) goto Lee
            goto Lef
        Lee:
            r13 = 0
        Lef:
            com.google.android.exoplayer2.util.Assertions.checkState(r13)
        Lf2:
            int r10 = r10 + 1
            goto Lc6
        Lf5:
            if (r11 == 0) goto Lfe
            com.google.android.exoplayer2.source.MediaPeriod[] r10 = r0.periods
            r10 = r10[r5]
            r8.add(r10)
        Lfe:
            int r13 = r5 + 1
            r14 = r8
            r15 = r19
            r5 = 0
            r8 = 0
            goto L68
        L107:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Children enabled at different positions."
            r1.<init>(r2)
            throw r1
        L10f:
            r8 = r14
            r1 = 0
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            com.google.android.exoplayer2.source.MediaPeriod[] r1 = new com.google.android.exoplayer2.source.MediaPeriod[r1]
            java.lang.Object[] r1 = r8.toArray(r1)
            com.google.android.exoplayer2.source.MediaPeriod[] r1 = (com.google.android.exoplayer2.source.MediaPeriod[]) r1
            r0.enabledPeriods = r1
            com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r2 = r0.compositeSequenceableLoaderFactory
            com.google.android.exoplayer2.source.SequenceableLoader r1 = r2.createCompositeSequenceableLoader(r1)
            r0.compositeSequenceableLoader = r1
            return r17
    }
}
