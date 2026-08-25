package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodHolder {
    private static final java.lang.String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public com.google.android.exoplayer2.MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final com.google.android.exoplayer2.source.MediaPeriod mediaPeriod;
    private final com.google.android.exoplayer2.MediaSourceList mediaSourceList;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.MediaPeriodHolder next;
    public boolean prepared;
    private final com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final com.google.android.exoplayer2.source.SampleStream[] sampleStreams;
    private com.google.android.exoplayer2.source.TrackGroupArray trackGroups;
    private final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector;
    private com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult;
    public final java.lang.Object uid;

    public MediaPeriodHolder(com.google.android.exoplayer2.RendererCapabilities[] r8, long r9, com.google.android.exoplayer2.trackselection.TrackSelector r11, com.google.android.exoplayer2.upstream.Allocator r12, com.google.android.exoplayer2.MediaSourceList r13, com.google.android.exoplayer2.MediaPeriodInfo r14, com.google.android.exoplayer2.trackselection.TrackSelectorResult r15) {
            r7 = this;
            r7.<init>()
            r7.rendererCapabilities = r8
            r7.rendererPositionOffsetUs = r9
            r7.trackSelector = r11
            r7.mediaSourceList = r13
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r14.id
            java.lang.Object r9 = r0.periodUid
            r7.uid = r9
            r7.info = r14
            com.google.android.exoplayer2.source.TrackGroupArray r9 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            r7.trackGroups = r9
            r7.trackSelectorResult = r15
            int r9 = r8.length
            com.google.android.exoplayer2.source.SampleStream[] r9 = new com.google.android.exoplayer2.source.SampleStream[r9]
            r7.sampleStreams = r9
            int r8 = r8.length
            boolean[] r8 = new boolean[r8]
            r7.mayRetainStreamFlags = r8
            long r3 = r14.startPositionUs
            long r5 = r14.endPositionUs
            r1 = r13
            r2 = r12
            com.google.android.exoplayer2.source.MediaPeriod r8 = createMediaPeriod(r0, r1, r2, r3, r5)
            r7.mediaPeriod = r8
            return
    }

    private void associateNoSampleRenderersWithEmptySampleStream(com.google.android.exoplayer2.source.SampleStream[] r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r3.rendererCapabilities
            int r2 = r1.length
            if (r0 >= r2) goto L21
            r1 = r1[r0]
            int r1 = r1.getTrackType()
            r2 = -2
            if (r1 != r2) goto L1e
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r3.trackSelectorResult
            boolean r1 = r1.isRendererEnabled(r0)
            if (r1 == 0) goto L1e
            com.google.android.exoplayer2.source.EmptySampleStream r1 = new com.google.android.exoplayer2.source.EmptySampleStream
            r1.<init>()
            r4[r0] = r1
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            return
    }

    private static com.google.android.exoplayer2.source.MediaPeriod createMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r7, com.google.android.exoplayer2.MediaSourceList r8, com.google.android.exoplayer2.upstream.Allocator r9, long r10, long r12) {
            com.google.android.exoplayer2.source.MediaPeriod r1 = r8.createPeriod(r7, r9, r10)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 == 0) goto L18
            com.google.android.exoplayer2.source.ClippingMediaPeriod r7 = new com.google.android.exoplayer2.source.ClippingMediaPeriod
            r2 = 1
            r3 = 0
            r0 = r7
            r5 = r12
            r0.<init>(r1, r2, r3, r5)
            r1 = r7
        L18:
            return r1
    }

    private void disableTrackSelectionsInResult() {
            r3 = this;
            boolean r0 = r3.isLoadingMediaPeriod()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r3.trackSelectorResult
            int r2 = r1.length
            if (r0 >= r2) goto L22
            boolean r1 = r1.isRendererEnabled(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r3.trackSelectorResult
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2 = r2.selections
            r2 = r2[r0]
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L1f
            r2.disable()
        L1f:
            int r0 = r0 + 1
            goto L8
        L22:
            return
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(com.google.android.exoplayer2.source.SampleStream[] r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r3.rendererCapabilities
            int r2 = r1.length
            if (r0 >= r2) goto L15
            r1 = r1[r0]
            int r1 = r1.getTrackType()
            r2 = -2
            if (r1 != r2) goto L12
            r1 = 0
            r4[r0] = r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    private void enableTrackSelectionsInResult() {
            r3 = this;
            boolean r0 = r3.isLoadingMediaPeriod()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r3.trackSelectorResult
            int r2 = r1.length
            if (r0 >= r2) goto L22
            boolean r1 = r1.isRendererEnabled(r0)
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r3.trackSelectorResult
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2 = r2.selections
            r2 = r2[r0]
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L1f
            r2.enable()
        L1f:
            int r0 = r0 + 1
            goto L8
        L22:
            return
    }

    private boolean isLoadingMediaPeriod() {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.next
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static void releaseMediaPeriod(com.google.android.exoplayer2.MediaSourceList r1, com.google.android.exoplayer2.source.MediaPeriod r2) {
            boolean r0 = r2 instanceof com.google.android.exoplayer2.source.ClippingMediaPeriod     // Catch: java.lang.RuntimeException -> L10
            if (r0 == 0) goto Lc
            com.google.android.exoplayer2.source.ClippingMediaPeriod r2 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r2     // Catch: java.lang.RuntimeException -> L10
            com.google.android.exoplayer2.source.MediaPeriod r2 = r2.mediaPeriod     // Catch: java.lang.RuntimeException -> L10
            r1.releasePeriod(r2)     // Catch: java.lang.RuntimeException -> L10
            goto L18
        Lc:
            r1.releasePeriod(r2)     // Catch: java.lang.RuntimeException -> L10
            goto L18
        L10:
            r1 = move-exception
            java.lang.String r2 = "MediaPeriodHolder"
            java.lang.String r0 = "Period release failed."
            com.google.android.exoplayer2.util.Log.e(r2, r0, r1)
        L18:
            return
    }

    public long applyTrackSelection(com.google.android.exoplayer2.trackselection.TrackSelectorResult r8, long r9, boolean r11) {
            r7 = this;
            com.google.android.exoplayer2.RendererCapabilities[] r0 = r7.rendererCapabilities
            int r0 = r0.length
            boolean[] r6 = new boolean[r0]
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            long r8 = r1.applyTrackSelection(r2, r3, r5, r6)
            return r8
    }

    public long applyTrackSelection(com.google.android.exoplayer2.trackselection.TrackSelectorResult r14, long r15, boolean r17, boolean[] r18) {
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = 0
            r3 = 0
        L4:
            int r4 = r1.length
            r5 = 1
            if (r3 >= r4) goto L1c
            boolean[] r4 = r0.mayRetainStreamFlags
            if (r17 != 0) goto L16
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r6 = r0.trackSelectorResult
            boolean r6 = r14.isEquivalent(r6, r3)
            if (r6 == 0) goto L16
            goto L17
        L16:
            r5 = 0
        L17:
            r4[r3] = r5
            int r3 = r3 + 1
            goto L4
        L1c:
            com.google.android.exoplayer2.source.SampleStream[] r3 = r0.sampleStreams
            r13.disassociateNoSampleRenderersWithEmptySampleStream(r3)
            r13.disableTrackSelectionsInResult()
            r0.trackSelectorResult = r1
            r13.enableTrackSelectionsInResult()
            com.google.android.exoplayer2.source.MediaPeriod r6 = r0.mediaPeriod
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r7 = r1.selections
            boolean[] r8 = r0.mayRetainStreamFlags
            com.google.android.exoplayer2.source.SampleStream[] r9 = r0.sampleStreams
            r10 = r18
            r11 = r15
            long r3 = r6.selectTracks(r7, r8, r9, r10, r11)
            com.google.android.exoplayer2.source.SampleStream[] r6 = r0.sampleStreams
            r13.associateNoSampleRenderersWithEmptySampleStream(r6)
            r0.hasEnabledTracks = r2
            r6 = 0
        L40:
            com.google.android.exoplayer2.source.SampleStream[] r7 = r0.sampleStreams
            int r8 = r7.length
            if (r6 >= r8) goto L6d
            r7 = r7[r6]
            if (r7 == 0) goto L5e
            boolean r7 = r14.isRendererEnabled(r6)
            com.google.android.exoplayer2.util.Assertions.checkState(r7)
            com.google.android.exoplayer2.RendererCapabilities[] r7 = r0.rendererCapabilities
            r7 = r7[r6]
            int r7 = r7.getTrackType()
            r8 = -2
            if (r7 == r8) goto L6a
            r0.hasEnabledTracks = r5
            goto L6a
        L5e:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r7 = r1.selections
            r7 = r7[r6]
            if (r7 != 0) goto L66
            r7 = 1
            goto L67
        L66:
            r7 = 0
        L67:
            com.google.android.exoplayer2.util.Assertions.checkState(r7)
        L6a:
            int r6 = r6 + 1
            goto L40
        L6d:
            return r3
    }

    public void continueLoading(long r2) {
            r1 = this;
            boolean r0 = r1.isLoadingMediaPeriod()
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r2 = r1.toPeriodTime(r2)
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            r0.continueLoading(r2)
            return
    }

    public long getBufferedPositionUs() {
            r5 = this;
            boolean r0 = r5.prepared
            if (r0 != 0) goto L9
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r5.info
            long r0 = r0.startPositionUs
            return r0
        L9:
            boolean r0 = r5.hasEnabledTracks
            r1 = -9223372036854775808
            if (r0 == 0) goto L16
            com.google.android.exoplayer2.source.MediaPeriod r0 = r5.mediaPeriod
            long r3 = r0.getBufferedPositionUs()
            goto L17
        L16:
            r3 = r1
        L17:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r5.info
            long r3 = r0.durationUs
        L1f:
            return r3
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.MediaPeriodHolder getNext() {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.next
            return r0
    }

    public long getNextLoadPositionUs() {
            r2 = this;
            boolean r0 = r2.prepared
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            com.google.android.exoplayer2.source.MediaPeriod r0 = r2.mediaPeriod
            long r0 = r0.getNextLoadPositionUs()
        Ld:
            return r0
    }

    public long getRendererOffset() {
            r2 = this;
            long r0 = r2.rendererPositionOffsetUs
            return r0
    }

    public long getStartPositionRendererTime() {
            r4 = this;
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r4.info
            long r0 = r0.startPositionUs
            long r2 = r4.rendererPositionOffsetUs
            long r0 = r0 + r2
            return r0
    }

    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.trackGroups
            return r0
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectorResult getTrackSelectorResult() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r0 = r1.trackSelectorResult
            return r0
    }

    public void handlePrepared(float r7, com.google.android.exoplayer2.Timeline r8) throws com.google.android.exoplayer2.ExoPlaybackException {
            r6 = this;
            r0 = 1
            r6.prepared = r0
            com.google.android.exoplayer2.source.MediaPeriod r0 = r6.mediaPeriod
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups()
            r6.trackGroups = r0
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r7 = r6.selectTracks(r7, r8)
            com.google.android.exoplayer2.MediaPeriodInfo r8 = r6.info
            long r0 = r8.startPositionUs
            long r2 = r8.durationUs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L2b
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L2b
            r0 = 0
            r4 = 1
            long r2 = r2 - r4
            long r0 = java.lang.Math.max(r0, r2)
        L2b:
            r8 = 0
            long r7 = r6.applyTrackSelection(r7, r0, r8)
            long r0 = r6.rendererPositionOffsetUs
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r6.info
            long r3 = r2.startPositionUs
            long r3 = r3 - r7
            long r3 = r3 + r0
            r6.rendererPositionOffsetUs = r3
            com.google.android.exoplayer2.MediaPeriodInfo r7 = r2.copyWithStartPositionUs(r7)
            r6.info = r7
            return
    }

    public boolean isFullyBuffered() {
            r5 = this;
            boolean r0 = r5.prepared
            if (r0 == 0) goto L16
            boolean r0 = r5.hasEnabledTracks
            if (r0 == 0) goto L14
            com.google.android.exoplayer2.source.MediaPeriod r0 = r5.mediaPeriod
            long r0 = r0.getBufferedPositionUs()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
        L14:
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public void reevaluateBuffer(long r2) {
            r1 = this;
            boolean r0 = r1.isLoadingMediaPeriod()
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            boolean r0 = r1.prepared
            if (r0 == 0) goto L14
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            long r2 = r1.toPeriodTime(r2)
            r0.reevaluateBuffer(r2)
        L14:
            return
    }

    public void release() {
            r2 = this;
            r2.disableTrackSelectionsInResult()
            com.google.android.exoplayer2.MediaSourceList r0 = r2.mediaSourceList
            com.google.android.exoplayer2.source.MediaPeriod r1 = r2.mediaPeriod
            releaseMediaPeriod(r0, r1)
            return
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks(float r5, com.google.android.exoplayer2.Timeline r6) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            com.google.android.exoplayer2.trackselection.TrackSelector r0 = r4.trackSelector
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r4.rendererCapabilities
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r4.getTrackGroups()
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r4.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.id
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r6 = r0.selectTracks(r1, r2, r3, r6)
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r0 = r6.selections
            int r1 = r0.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            if (r3 == 0) goto L1d
            r3.onPlaybackSpeed(r5)
        L1d:
            int r2 = r2 + 1
            goto L14
        L20:
            return r6
    }

    public void setNext(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaPeriodHolder r2) {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r1.next
            if (r2 != r0) goto L5
            return
        L5:
            r1.disableTrackSelectionsInResult()
            r1.next = r2
            r1.enableTrackSelectionsInResult()
            return
    }

    public void setRendererOffset(long r1) {
            r0 = this;
            r0.rendererPositionOffsetUs = r1
            return
    }

    public long toPeriodTime(long r3) {
            r2 = this;
            long r0 = r2.getRendererOffset()
            long r3 = r3 - r0
            return r3
    }

    public long toRendererTime(long r3) {
            r2 = this;
            long r0 = r2.getRendererOffset()
            long r3 = r3 + r0
            return r3
    }

    public void updateClipping() {
            r6 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r6.mediaPeriod
            boolean r1 = r0 instanceof com.google.android.exoplayer2.source.ClippingMediaPeriod
            if (r1 == 0) goto L1c
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r6.info
            long r1 = r1.endPositionUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
            r1 = -9223372036854775808
        L15:
            com.google.android.exoplayer2.source.ClippingMediaPeriod r0 = (com.google.android.exoplayer2.source.ClippingMediaPeriod) r0
            r3 = 0
            r0.updateClipping(r3, r1)
        L1c:
            return
    }
}
