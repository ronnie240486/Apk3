package com.google.android.exoplayer2.source.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerSideAdInsertionMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource implements com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller, com.google.android.exoplayer2.source.MediaSourceEventListener, com.google.android.exoplayer2.drm.DrmSessionEventListener {

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater adPlaybackStateUpdater;
    private com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> adPlaybackStates;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Timeline contentTimeline;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod lastUsedMediaPeriod;
    private final com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod> mediaPeriods;
    private final com.google.android.exoplayer2.source.MediaSource mediaSource;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private android.os.Handler playbackHandler;

    public interface AdPlaybackStateUpdater {
        boolean onAdPlaybackStateUpdateRequested(com.google.android.exoplayer2.Timeline r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MediaPeriodImpl implements com.google.android.exoplayer2.source.MediaPeriod {
        public com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
        public final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public boolean[] hasNotifiedDownstreamFormatChange;
        public long lastStartPositionUs;
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedPeriod;

        public MediaPeriodImpl(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r3, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r4) {
                r0 = this;
                r0.<init>()
                r0.sharedPeriod = r1
                r0.mediaPeriodId = r2
                r0.mediaSourceEventDispatcher = r3
                r0.drmEventDispatcher = r4
                r1 = 0
                boolean[] r1 = new boolean[r1]
                r0.hasNotifiedDownstreamFormatChange = r1
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                boolean r2 = r0.continueLoading(r1, r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long r2, boolean r4) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                r0.discardBuffer(r1, r2, r4)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long r2, com.google.android.exoplayer2.SeekParameters r4) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                long r2 = r0.getAdjustedSeekPositionUs(r1, r2, r4)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
                r2 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r2.sharedPeriod
                long r0 = r0.getBufferedPositionUs(r2)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
                r2 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r2.sharedPeriod
                long r0 = r0.getNextLoadPositionUs(r2)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                java.util.List r2 = r0.getStreamKeys(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups()
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                boolean r0 = r0.isLoading(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                r0.maybeThrowPrepareError()
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
                r0 = this;
                r0.callback = r1
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = r0.sharedPeriod
                r1.prepare(r0, r2)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
                r2 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r2.sharedPeriod
                long r0 = r0.readDiscontinuity(r2)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                r0.reevaluateBuffer(r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                long r2 = r0.seekToUs(r1, r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r10, boolean[] r11, com.google.android.exoplayer2.source.SampleStream[] r12, boolean[] r13, long r14) {
                r9 = this;
                boolean[] r0 = r9.hasNotifiedDownstreamFormatChange
                int r0 = r0.length
                if (r0 != 0) goto La
                int r0 = r12.length
                boolean[] r0 = new boolean[r0]
                r9.hasNotifiedDownstreamFormatChange = r0
            La:
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = r9.sharedPeriod
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                long r10 = r1.selectTracks(r2, r3, r4, r5, r6, r7)
                return r10
        }
    }

    public static final class SampleStreamImpl implements com.google.android.exoplayer2.source.SampleStream {
        private final com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriod;
        private final int streamIndex;

        public SampleStreamImpl(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mediaPeriod = r1
                r0.streamIndex = r2
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
                r2 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r2.mediaPeriod
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r0.sharedPeriod
                int r1 = r2.streamIndex
                boolean r0 = r0.isReady(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
                r2 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r2.mediaPeriod
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r0.sharedPeriod
                int r1 = r2.streamIndex
                r0.maybeThrowError(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder r7, com.google.android.exoplayer2.decoder.DecoderInputBuffer r8, int r9) {
                r6 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r1 = r6.mediaPeriod
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r1.sharedPeriod
                int r2 = r6.streamIndex
                r3 = r7
                r4 = r8
                r5 = r9
                int r7 = r0.readData(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r3.mediaPeriod
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = r0.sharedPeriod
                int r2 = r3.streamIndex
                int r4 = r1.skipData(r0, r2, r4)
                return r4
        }
    }

    public static final class ServerSideAdInsertionTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        private final com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> adPlaybackStates;

        public ServerSideAdInsertionTimeline(com.google.android.exoplayer2.Timeline r5, com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r6) {
                r4 = this;
                r4.<init>(r5)
                int r0 = r5.getWindowCount()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.Timeline$Period r0 = new com.google.android.exoplayer2.Timeline$Period
                r0.<init>()
            L16:
                int r3 = r5.getPeriodCount()
                if (r1 >= r3) goto L2f
                r5.getPeriod(r1, r0, r2)
                java.lang.Object r3 = r0.uid
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                boolean r3 = r6.containsKey(r3)
                com.google.android.exoplayer2.util.Assertions.checkState(r3)
                int r1 = r1 + 1
                goto L16
            L2f:
                r4.adPlaybackStates = r6
                return
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r13, com.google.android.exoplayer2.Timeline.Period r14, boolean r15) {
                r12 = this;
                r15 = 1
                super.getPeriod(r13, r14, r15)
                com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r12.adPlaybackStates
                java.lang.Object r1 = r14.uid
                java.lang.Object r0 = r0.get(r1)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                r9 = r0
                com.google.android.exoplayer2.source.ads.AdPlaybackState r9 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r9
                long r0 = r14.durationUs
                r2 = -1
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L24
                long r0 = r9.contentDurationUs
                goto L28
            L24:
                long r0 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(r0, r2, r9)
            L28:
                r5 = r0
                r0 = 0
                com.google.android.exoplayer2.Timeline$Period r3 = new com.google.android.exoplayer2.Timeline$Period
                r3.<init>()
                r4 = 0
                r7 = r0
            L32:
                int r0 = r13 + 1
                if (r4 >= r0) goto L64
                com.google.android.exoplayer2.Timeline r0 = r12.timeline
                r0.getPeriod(r4, r3, r15)
                com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r12.adPlaybackStates
                java.lang.Object r1 = r3.uid
                java.lang.Object r0 = r0.get(r1)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
                if (r4 != 0) goto L57
                long r7 = r3.getPositionInWindowUs()
                long r7 = -r7
                long r7 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(r7, r2, r0)
                long r7 = -r7
            L57:
                if (r4 == r13) goto L61
                long r10 = r3.durationUs
                long r0 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(r10, r2, r0)
                long r0 = r0 + r7
                r7 = r0
            L61:
                int r4 = r4 + 1
                goto L32
            L64:
                java.lang.Object r2 = r14.id
                java.lang.Object r3 = r14.uid
                int r4 = r14.windowIndex
                boolean r10 = r14.isPlaceholder
                r1 = r14
                r1.set(r2, r3, r4, r5, r7, r9, r10)
                return r14
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r9, com.google.android.exoplayer2.Timeline.Window r10, long r11) {
                r8 = this;
                super.getWindow(r9, r10, r11)
                com.google.android.exoplayer2.Timeline$Period r9 = new com.google.android.exoplayer2.Timeline$Period
                r9.<init>()
                int r11 = r10.firstPeriodIndex
                r12 = 1
                com.google.android.exoplayer2.Timeline$Period r11 = r8.getPeriod(r11, r9, r12)
                java.lang.Object r11 = r11.uid
                java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
                com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r8.adPlaybackStates
                java.lang.Object r11 = r0.get(r11)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r11 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r11
                java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r11 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r11
                long r0 = r10.positionInFirstPeriodUs
                r2 = -1
                long r0 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(r0, r2, r11)
                long r3 = r10.durationUs
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L3f
                long r11 = r11.contentDurationUs
                int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r9 == 0) goto L69
                long r11 = r11 - r0
                r10.durationUs = r11
                goto L69
            L3f:
                int r11 = r10.lastPeriodIndex
                com.google.android.exoplayer2.Timeline$Period r11 = super.getPeriod(r11, r9, r12)
                long r3 = r11.positionInWindowUs
                com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r12 = r8.adPlaybackStates
                java.lang.Object r11 = r11.uid
                java.lang.Object r11 = r12.get(r11)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r11 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r11
                java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r11 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r11
                int r12 = r10.lastPeriodIndex
                com.google.android.exoplayer2.Timeline$Period r9 = r8.getPeriod(r12, r9)
                long r5 = r10.durationUs
                long r5 = r5 - r3
                long r11 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(r5, r2, r11)
                long r2 = r9.positionInWindowUs
                long r2 = r2 + r11
                r10.durationUs = r2
            L69:
                r10.positionInFirstPeriodUs = r0
                return r10
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SharedMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod.Callback {
        private final java.util.Map<java.lang.Long, android.util.Pair<com.google.android.exoplayer2.source.LoadEventInfo, com.google.android.exoplayer2.source.MediaLoadData>> activeLoads;
        private final com.google.android.exoplayer2.source.MediaPeriod actualMediaPeriod;
        private com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
        private boolean hasStartedPreparing;
        private boolean isPrepared;
        public com.google.android.exoplayer2.source.MediaLoadData[] lastDownstreamFormatChangeData;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl loadingPeriod;
        private final java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl> mediaPeriods;
        private final java.lang.Object periodUid;
        public com.google.android.exoplayer2.source.SampleStream[] sampleStreams;
        public com.google.android.exoplayer2.trackselection.ExoTrackSelection[] trackSelections;

        public SharedMediaPeriod(com.google.android.exoplayer2.source.MediaPeriod r1, java.lang.Object r2, com.google.android.exoplayer2.source.ads.AdPlaybackState r3) {
                r0 = this;
                r0.<init>()
                r0.actualMediaPeriod = r1
                r0.periodUid = r2
                r0.adPlaybackState = r3
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mediaPeriods = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.activeLoads = r1
                r1 = 0
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r1]
                r0.trackSelections = r2
                com.google.android.exoplayer2.source.SampleStream[] r2 = new com.google.android.exoplayer2.source.SampleStream[r1]
                r0.sampleStreams = r2
                com.google.android.exoplayer2.source.MediaLoadData[] r1 = new com.google.android.exoplayer2.source.MediaLoadData[r1]
                r0.lastDownstreamFormatChangeData = r1
                return
        }

        public static /* synthetic */ java.lang.Object access$000(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod r0) {
                java.lang.Object r0 = r0.periodUid
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl access$100(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod r0) {
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r0.loadingPeriod
                return r0
        }

        public static /* synthetic */ java.util.List access$200(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod r0) {
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r0.mediaPeriods
                return r0
        }

        private int findMatchingStreamIndex(com.google.android.exoplayer2.source.MediaLoadData r9) {
                r8 = this;
                com.google.android.exoplayer2.Format r0 = r9.trackFormat
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = 0
                r2 = 0
            L8:
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r3 = r8.trackSelections
                int r4 = r3.length
                if (r2 >= r4) goto L55
                r4 = r3[r2]
                if (r4 == 0) goto L52
                r3 = r3[r2]
                com.google.android.exoplayer2.source.TrackGroup r3 = r3.getTrackGroup()
                int r4 = r9.trackType
                if (r4 != 0) goto L2b
                com.google.android.exoplayer2.source.TrackGroupArray r4 = r8.getTrackGroups()
                com.google.android.exoplayer2.source.TrackGroup r4 = r4.get(r0)
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L2b
                r4 = 1
                goto L2c
            L2b:
                r4 = 0
            L2c:
                r5 = 0
            L2d:
                int r6 = r3.length
                if (r5 >= r6) goto L52
                com.google.android.exoplayer2.Format r6 = r3.getFormat(r5)
                com.google.android.exoplayer2.Format r7 = r9.trackFormat
                boolean r7 = r6.equals(r7)
                if (r7 != 0) goto L51
                if (r4 == 0) goto L4e
                java.lang.String r6 = r6.id
                if (r6 == 0) goto L4e
                com.google.android.exoplayer2.Format r7 = r9.trackFormat
                java.lang.String r7 = r7.id
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L4e
                goto L51
            L4e:
                int r5 = r5 + 1
                goto L2d
            L51:
                return r2
            L52:
                int r2 = r2 + 1
                goto L8
            L55:
                return r1
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r5, long r6) {
                r4 = this;
                r0 = -9223372036854775808
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                return r0
            L7:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r5.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r3 = r4.adPlaybackState
                long r6 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(r6, r2, r3)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = r4.adPlaybackState
                long r2 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.access$300(r5, r2)
                int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r5 < 0) goto L1a
                goto L1b
            L1a:
                r0 = r6
            L1b:
                return r0
        }

        private long getStreamPositionUsWithNotYetStartedHandling(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r5, long r6) {
                r4 = this;
                long r0 = r5.lastStartPositionUs
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 >= 0) goto L13
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r5.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r3 = r4.adPlaybackState
                long r0 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r0, r2, r3)
                long r2 = r5.lastStartPositionUs
                long r2 = r2 - r6
                long r0 = r0 - r2
                return r0
            L13:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r5.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r4.adPlaybackState
                long r5 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r6, r5, r0)
                return r5
        }

        private void maybeNotifyDownstreamFormatChanged(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r4, int r5) {
                r3 = this;
                boolean[] r0 = r4.hasNotifiedDownstreamFormatChange
                boolean r1 = r0[r5]
                if (r1 != 0) goto L1c
                com.google.android.exoplayer2.source.MediaLoadData[] r1 = r3.lastDownstreamFormatChangeData
                r2 = r1[r5]
                if (r2 == 0) goto L1c
                r2 = 1
                r0[r5] = r2
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r4.mediaSourceEventDispatcher
                r5 = r1[r5]
                com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r3.adPlaybackState
                com.google.android.exoplayer2.source.MediaLoadData r4 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.access$400(r4, r5, r1)
                r0.downstreamFormatChanged(r4)
            L1c:
                return
        }

        public void add(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r2) {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r1.mediaPeriods
                r0.add(r2)
                return
        }

        public boolean canReuseMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5, long r6) {
                r4 = this;
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r4.mediaPeriods
                java.lang.Object r0 = com.google.common.collect.Iterables.getLast(r0)
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) r0
                com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r4.adPlaybackState
                long r1 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.access$300(r0, r1)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r3 = r4.adPlaybackState
                long r0 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r1, r0, r3)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = r4.adPlaybackState
                long r5 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r6, r5, r2)
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 != 0) goto L22
                r5 = 1
                goto L23
            L22:
                r5 = 0
            L23:
                return r5
        }

        public boolean continueLoading(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r8, long r9) {
                r7 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r7.loadingPeriod
                if (r0 == 0) goto L47
                boolean r1 = r8.equals(r0)
                if (r1 != 0) goto L47
                java.util.Map<java.lang.Long, android.util.Pair<com.google.android.exoplayer2.source.LoadEventInfo, com.google.android.exoplayer2.source.MediaLoadData>> r1 = r7.activeLoads
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L14:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L47
                java.lang.Object r2 = r1.next()
                android.util.Pair r2 = (android.util.Pair) r2
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r0.mediaSourceEventDispatcher
                java.lang.Object r4 = r2.first
                com.google.android.exoplayer2.source.LoadEventInfo r4 = (com.google.android.exoplayer2.source.LoadEventInfo) r4
                java.lang.Object r5 = r2.second
                com.google.android.exoplayer2.source.MediaLoadData r5 = (com.google.android.exoplayer2.source.MediaLoadData) r5
                com.google.android.exoplayer2.source.ads.AdPlaybackState r6 = r7.adPlaybackState
                com.google.android.exoplayer2.source.MediaLoadData r5 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.access$400(r0, r5, r6)
                r3.loadCompleted(r4, r5)
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r8.mediaSourceEventDispatcher
                java.lang.Object r4 = r2.first
                com.google.android.exoplayer2.source.LoadEventInfo r4 = (com.google.android.exoplayer2.source.LoadEventInfo) r4
                java.lang.Object r2 = r2.second
                com.google.android.exoplayer2.source.MediaLoadData r2 = (com.google.android.exoplayer2.source.MediaLoadData) r2
                com.google.android.exoplayer2.source.ads.AdPlaybackState r5 = r7.adPlaybackState
                com.google.android.exoplayer2.source.MediaLoadData r2 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.access$400(r8, r2, r5)
                r3.loadStarted(r4, r2)
                goto L14
            L47:
                r7.loadingPeriod = r8
                long r8 = r7.getStreamPositionUsWithNotYetStartedHandling(r8, r9)
                com.google.android.exoplayer2.source.MediaPeriod r10 = r7.actualMediaPeriod
                boolean r8 = r10.continueLoading(r8)
                return r8
        }

        public void discardBuffer(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r2, long r3, boolean r5) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                long r2 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r3, r2, r0)
                com.google.android.exoplayer2.source.MediaPeriod r4 = r1.actualMediaPeriod
                r4.discardBuffer(r2, r5)
                return
        }

        public long getAdjustedSeekPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r3, long r4, com.google.android.exoplayer2.SeekParameters r6) {
                r2 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r3.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r2.adPlaybackState
                long r4 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r4, r0, r1)
                com.google.android.exoplayer2.source.MediaPeriod r0 = r2.actualMediaPeriod
                long r4 = r0.getAdjustedSeekPositionUs(r4, r6)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r6 = r2.adPlaybackState
                long r3 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(r4, r3, r6)
                return r3
        }

        public long getBufferedPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r3) {
                r2 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r2.actualMediaPeriod
                long r0 = r0.getBufferedPositionUs()
                long r0 = r2.getMediaPeriodPositionUsWithEndOfSourceHandling(r3, r0)
                return r0
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl getMediaPeriodForEvent(@androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaLoadData r10) {
                r9 = this;
                if (r10 == 0) goto L40
                long r0 = r10.mediaStartTimeMs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L40
                r0 = 0
            Le:
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r1 = r9.mediaPeriods
                int r1 = r1.size()
                if (r0 >= r1) goto L40
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r1 = r9.mediaPeriods
                java.lang.Object r1 = r1.get(r0)
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r1 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) r1
                long r2 = r10.mediaStartTimeMs
                long r2 = com.google.android.exoplayer2.util.Util.msToUs(r2)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r1.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r5 = r9.adPlaybackState
                long r2 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(r2, r4, r5)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r4 = r9.adPlaybackState
                long r4 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.access$300(r1, r4)
                r6 = 0
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 < 0) goto L3d
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L3d
                return r1
            L3d:
                int r0 = r0 + 1
                goto Le
            L40:
                r10 = 0
                return r10
        }

        public long getNextLoadPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r3) {
                r2 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r2.actualMediaPeriod
                long r0 = r0.getNextLoadPositionUs()
                long r0 = r2.getMediaPeriodPositionUsWithEndOfSourceHandling(r3, r0)
                return r0
        }

        public java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> r2) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.actualMediaPeriod
                java.util.List r2 = r0.getStreamKeys(r2)
                return r2
        }

        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.actualMediaPeriod
                com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups()
                return r0
        }

        public boolean isLoading(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r1.loadingPeriod
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L12
                com.google.android.exoplayer2.source.MediaPeriod r2 = r1.actualMediaPeriod
                boolean r2 = r2.isLoading()
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public boolean isReady(int r2) {
                r1 = this;
                com.google.android.exoplayer2.source.SampleStream[] r0 = r1.sampleStreams
                r2 = r0[r2]
                java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
                com.google.android.exoplayer2.source.SampleStream r2 = (com.google.android.exoplayer2.source.SampleStream) r2
                boolean r2 = r2.isReady()
                return r2
        }

        public boolean isUnused() {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r1.mediaPeriods
                boolean r0 = r0.isEmpty()
                return r0
        }

        public void maybeThrowError(int r2) throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.SampleStream[] r0 = r1.sampleStreams
                r2 = r0[r2]
                java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
                com.google.android.exoplayer2.source.SampleStream r2 = (com.google.android.exoplayer2.source.SampleStream) r2
                r2.maybeThrowError()
                return
        }

        public void maybeThrowPrepareError() throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.actualMediaPeriod
                r0.maybeThrowPrepareError()
                return
        }

        public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r2 = r1.loadingPeriod
                if (r2 != 0) goto L5
                return
            L5:
                com.google.android.exoplayer2.source.MediaPeriod$Callback r2 = r2.callback
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.source.MediaPeriod$Callback r2 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r2
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r1.loadingPeriod
                r2.onContinueLoadingRequested(r0)
                return
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
                r0 = this;
                com.google.android.exoplayer2.source.MediaPeriod r1 = (com.google.android.exoplayer2.source.MediaPeriod) r1
                r0.onContinueLoadingRequested(r1)
                return
        }

        public void onDownstreamFormatChanged(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r2 = this;
                int r0 = r2.findMatchingStreamIndex(r4)
                r1 = -1
                if (r0 == r1) goto L10
                com.google.android.exoplayer2.source.MediaLoadData[] r1 = r2.lastDownstreamFormatChangeData
                r1[r0] = r4
                boolean[] r3 = r3.hasNotifiedDownstreamFormatChange
                r4 = 1
                r3[r0] = r4
            L10:
                return
        }

        public void onLoadFinished(com.google.android.exoplayer2.source.LoadEventInfo r4) {
                r3 = this;
                java.util.Map<java.lang.Long, android.util.Pair<com.google.android.exoplayer2.source.LoadEventInfo, com.google.android.exoplayer2.source.MediaLoadData>> r0 = r3.activeLoads
                long r1 = r4.loadTaskId
                java.lang.Long r4 = java.lang.Long.valueOf(r1)
                r0.remove(r4)
                return
        }

        public void onLoadStarted(com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r3 = this;
                java.util.Map<java.lang.Long, android.util.Pair<com.google.android.exoplayer2.source.LoadEventInfo, com.google.android.exoplayer2.source.MediaLoadData>> r0 = r3.activeLoads
                long r1 = r4.loadTaskId
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                android.util.Pair r4 = android.util.Pair.create(r4, r5)
                r0.put(r1, r4)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r3) {
                r2 = this;
                r3 = 1
                r2.isPrepared = r3
                r3 = 0
            L4:
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r2.mediaPeriods
                int r0 = r0.size()
                if (r3 >= r0) goto L1e
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r2.mediaPeriods
                java.lang.Object r0 = r0.get(r3)
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) r0
                com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
                if (r1 == 0) goto L1b
                r1.onPrepared(r0)
            L1b:
                int r3 = r3 + 1
                goto L4
            L1e:
                return
        }

        public void prepare(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r2, long r3) {
                r1 = this;
                r2.lastStartPositionUs = r3
                boolean r0 = r1.hasStartedPreparing
                if (r0 == 0) goto L16
                boolean r3 = r1.isPrepared
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.source.MediaPeriod$Callback r3 = r2.callback
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.source.MediaPeriod$Callback r3 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r3
                r3.onPrepared(r2)
            L15:
                return
            L16:
                r0 = 1
                r1.hasStartedPreparing = r0
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                long r2 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r3, r2, r0)
                com.google.android.exoplayer2.source.MediaPeriod r4 = r1.actualMediaPeriod
                r4.prepare(r1, r2)
                return
        }

        public int readData(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r11, int r12, com.google.android.exoplayer2.FormatHolder r13, com.google.android.exoplayer2.decoder.DecoderInputBuffer r14, int r15) {
                r10 = this;
                r0 = r15 | 1
                r1 = 4
                r0 = r0 | r1
                com.google.android.exoplayer2.source.SampleStream[] r2 = r10.sampleStreams
                r2 = r2[r12]
                java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
                com.google.android.exoplayer2.source.SampleStream r2 = (com.google.android.exoplayer2.source.SampleStream) r2
                int r0 = r2.readData(r13, r14, r0)
                long r2 = r14.timeUs
                long r2 = r10.getMediaPeriodPositionUsWithEndOfSourceHandling(r11, r2)
                r4 = -9223372036854775808
                r6 = -4
                if (r0 != r6) goto L21
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L30
            L21:
                r7 = -3
                if (r0 != r7) goto L3a
                long r7 = r10.getBufferedPositionUs(r11)
                int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r9 != 0) goto L3a
                boolean r4 = r14.waitingForKeys
                if (r4 != 0) goto L3a
            L30:
                r10.maybeNotifyDownstreamFormatChanged(r11, r12)
                r14.clear()
                r14.addFlag(r1)
                return r6
            L3a:
                if (r0 != r6) goto L4e
                r10.maybeNotifyDownstreamFormatChanged(r11, r12)
                com.google.android.exoplayer2.source.SampleStream[] r11 = r10.sampleStreams
                r11 = r11[r12]
                java.lang.Object r11 = com.google.android.exoplayer2.util.Util.castNonNull(r11)
                com.google.android.exoplayer2.source.SampleStream r11 = (com.google.android.exoplayer2.source.SampleStream) r11
                r11.readData(r13, r14, r15)
                r14.timeUs = r2
            L4e:
                return r0
        }

        public long readDiscontinuity(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r6) {
                r5 = this;
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r5.mediaPeriods
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                boolean r0 = r6.equals(r0)
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r0 != 0) goto L13
                return r1
            L13:
                com.google.android.exoplayer2.source.MediaPeriod r0 = r5.actualMediaPeriod
                long r3 = r0.readDiscontinuity()
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L1e
                goto L26
            L1e:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r6.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r5.adPlaybackState
                long r1 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(r3, r6, r0)
            L26:
                return r1
        }

        public void reevaluateBuffer(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r2, long r3) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.actualMediaPeriod
                long r2 = r1.getStreamPositionUsWithNotYetStartedHandling(r2, r3)
                r0.reevaluateBuffer(r2)
                return
        }

        public void release(com.google.android.exoplayer2.source.MediaSource r2) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaPeriod r0 = r1.actualMediaPeriod
                r2.releasePeriod(r0)
                return
        }

        public void remove(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r0 = r1.loadingPeriod
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L10
                r0 = 0
                r1.loadingPeriod = r0
                java.util.Map<java.lang.Long, android.util.Pair<com.google.android.exoplayer2.source.LoadEventInfo, com.google.android.exoplayer2.source.MediaLoadData>> r0 = r1.activeLoads
                r0.clear()
            L10:
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r0 = r1.mediaPeriods
                r0.remove(r2)
                return
        }

        public long seekToUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r3, long r4) {
                r2 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r3.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r2.adPlaybackState
                long r4 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r4, r0, r1)
                com.google.android.exoplayer2.source.MediaPeriod r0 = r2.actualMediaPeriod
                long r4 = r0.seekToUs(r4)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r2.adPlaybackState
                long r3 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(r4, r3, r0)
                return r3
        }

        public long selectTracks(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r13, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r14, boolean[] r15, com.google.android.exoplayer2.source.SampleStream[] r16, boolean[] r17, long r18) {
                r12 = this;
                r0 = r12
                r1 = r13
                r3 = r14
                r4 = r18
                r1.lastStartPositionUs = r4
                java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl> r2 = r0.mediaPeriods
                r9 = 0
                java.lang.Object r2 = r2.get(r9)
                boolean r2 = r13.equals(r2)
                r10 = 0
                if (r2 == 0) goto L83
                int r2 = r3.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r14, r2)
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r2 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection[]) r2
                r0.trackSelections = r2
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r1.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r6 = r0.adPlaybackState
                long r7 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r4, r2, r6)
                com.google.android.exoplayer2.source.SampleStream[] r2 = r0.sampleStreams
                int r4 = r2.length
                if (r4 != 0) goto L2f
                int r2 = r3.length
                com.google.android.exoplayer2.source.SampleStream[] r2 = new com.google.android.exoplayer2.source.SampleStream[r2]
                goto L36
            L2f:
                int r4 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
                com.google.android.exoplayer2.source.SampleStream[] r2 = (com.google.android.exoplayer2.source.SampleStream[]) r2
            L36:
                r11 = r2
                com.google.android.exoplayer2.source.MediaPeriod r2 = r0.actualMediaPeriod
                r3 = r14
                r4 = r15
                r5 = r11
                r6 = r17
                long r2 = r2.selectTracks(r3, r4, r5, r6, r7)
                int r4 = r11.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r11, r4)
                com.google.android.exoplayer2.source.SampleStream[] r4 = (com.google.android.exoplayer2.source.SampleStream[]) r4
                r0.sampleStreams = r4
                com.google.android.exoplayer2.source.MediaLoadData[] r4 = r0.lastDownstreamFormatChangeData
                int r5 = r11.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
                com.google.android.exoplayer2.source.MediaLoadData[] r4 = (com.google.android.exoplayer2.source.MediaLoadData[]) r4
                r0.lastDownstreamFormatChangeData = r4
            L56:
                int r4 = r11.length
                if (r9 >= r4) goto L7a
                r4 = r11[r9]
                if (r4 != 0) goto L64
                r16[r9] = r10
                com.google.android.exoplayer2.source.MediaLoadData[] r4 = r0.lastDownstreamFormatChangeData
                r4[r9] = r10
                goto L77
            L64:
                r4 = r16[r9]
                if (r4 == 0) goto L6c
                boolean r4 = r17[r9]
                if (r4 == 0) goto L77
            L6c:
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SampleStreamImpl r4 = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SampleStreamImpl
                r4.<init>(r13, r9)
                r16[r9] = r4
                com.google.android.exoplayer2.source.MediaLoadData[] r4 = r0.lastDownstreamFormatChangeData
                r4[r9] = r10
            L77:
                int r9 = r9 + 1
                goto L56
            L7a:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r4 = r0.adPlaybackState
                long r1 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(r2, r1, r4)
                return r1
            L83:
                r2 = 0
            L84:
                int r6 = r3.length
                if (r2 >= r6) goto Lbd
                r6 = r3[r2]
                r7 = 1
                if (r6 == 0) goto Lb6
                boolean r6 = r15[r2]
                if (r6 == 0) goto L96
                r6 = r16[r2]
                if (r6 != 0) goto L95
                goto L96
            L95:
                r7 = 0
            L96:
                r17[r2] = r7
                boolean r6 = r17[r2]
                if (r6 == 0) goto Lba
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r6 = r0.trackSelections
                r6 = r6[r2]
                r7 = r3[r2]
                boolean r6 = com.google.android.exoplayer2.util.Util.areEqual(r6, r7)
                if (r6 == 0) goto Lae
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SampleStreamImpl r6 = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SampleStreamImpl
                r6.<init>(r13, r2)
                goto Lb3
            Lae:
                com.google.android.exoplayer2.source.EmptySampleStream r6 = new com.google.android.exoplayer2.source.EmptySampleStream
                r6.<init>()
            Lb3:
                r16[r2] = r6
                goto Lba
            Lb6:
                r16[r2] = r10
                r17[r2] = r7
            Lba:
                int r2 = r2 + 1
                goto L84
            Lbd:
                return r4
        }

        public int skipData(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r2, int r3, long r4) {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.mediaPeriodId
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                long r4 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r4, r2, r0)
                com.google.android.exoplayer2.source.SampleStream[] r2 = r1.sampleStreams
                r2 = r2[r3]
                java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
                com.google.android.exoplayer2.source.SampleStream r2 = (com.google.android.exoplayer2.source.SampleStream) r2
                int r2 = r2.skipData(r4)
                return r2
        }

        public void updateAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState r1) {
                r0 = this;
                r0.adPlaybackState = r1
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$_M-_hyjEORwjoOtigaHohPfWjK4, reason: not valid java name */
    public static /* synthetic */ void m255$r8$lambda$_M_hyjEORwjoOtigaHohPfWjK4(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource r0, com.google.common.collect.ImmutableMap r1) {
            r0.lambda$setAdPlaybackStates$0(r1)
            return
    }

    public ServerSideAdInsertionMediaSource(com.google.android.exoplayer2.source.MediaSource r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater r2) {
            r0 = this;
            r0.<init>()
            r0.mediaSource = r1
            r0.adPlaybackStateUpdater = r2
            com.google.common.collect.ArrayListMultimap r1 = com.google.common.collect.ArrayListMultimap.create()
            r0.mediaPeriods = r1
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of()
            r0.adPlaybackStates = r1
            r1 = 0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.createEventDispatcher(r1)
            r0.mediaSourceEventDispatcherWithoutId = r2
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r1 = r0.createDrmEventDispatcher(r1)
            r0.drmEventDispatcherWithoutId = r1
            return
    }

    public static /* synthetic */ long access$300(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r0, com.google.android.exoplayer2.source.ads.AdPlaybackState r1) {
            long r0 = getMediaPeriodEndPositionUs(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaLoadData access$400(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r0, com.google.android.exoplayer2.source.MediaLoadData r1, com.google.android.exoplayer2.source.ads.AdPlaybackState r2) {
            com.google.android.exoplayer2.source.MediaLoadData r0 = correctMediaLoadData(r0, r1, r2)
            return r0
    }

    private static com.google.android.exoplayer2.source.MediaLoadData correctMediaLoadData(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r11, com.google.android.exoplayer2.source.MediaLoadData r12, com.google.android.exoplayer2.source.ads.AdPlaybackState r13) {
            com.google.android.exoplayer2.source.MediaLoadData r10 = new com.google.android.exoplayer2.source.MediaLoadData
            int r1 = r12.dataType
            int r2 = r12.trackType
            com.google.android.exoplayer2.Format r3 = r12.trackFormat
            int r4 = r12.trackSelectionReason
            java.lang.Object r5 = r12.trackSelectionData
            long r6 = r12.mediaStartTimeMs
            long r6 = correctMediaLoadDataPositionMs(r6, r11, r13)
            long r8 = r12.mediaEndTimeMs
            long r8 = correctMediaLoadDataPositionMs(r8, r11, r13)
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return r10
    }

    private static long correctMediaLoadDataPositionMs(long r3, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r5, com.google.android.exoplayer2.source.ads.AdPlaybackState r6) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            return r0
        La:
            long r3 = com.google.android.exoplayer2.util.Util.msToUs(r3)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r5.mediaPeriodId
            boolean r0 = r5.isAd()
            if (r0 == 0) goto L1f
            int r0 = r5.adGroupIndex
            int r5 = r5.adIndexInAdGroup
            long r3 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForAd(r3, r0, r5, r6)
            goto L24
        L1f:
            r5 = -1
            long r3 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(r3, r5, r6)
        L24:
            long r3 = com.google.android.exoplayer2.util.Util.usToMs(r3)
            return r3
    }

    private static long getMediaPeriodEndPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r5, com.google.android.exoplayer2.source.ads.AdPlaybackState r6) {
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r5.mediaPeriodId
            boolean r0 = r5.isAd()
            r1 = -1
            if (r0 == 0) goto L1d
            int r0 = r5.adGroupIndex
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r6 = r6.getAdGroup(r0)
            int r0 = r6.count
            if (r0 != r1) goto L16
            r5 = 0
            goto L1c
        L16:
            long[] r6 = r6.durationsUs
            int r5 = r5.adIndexInAdGroup
            r5 = r6[r5]
        L1c:
            return r5
        L1d:
            int r5 = r5.nextAdGroupIndex
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r5 != r1) goto L27
            return r2
        L27:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r5 = r6.getAdGroup(r5)
            long r5 = r5.timeUs
            r0 = -9223372036854775808
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L34
            goto L35
        L34:
            r2 = r5
        L35:
            return r2
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl getMediaPeriodForEvent(@androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r6, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaLoadData r7, boolean r8) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod> r1 = r5.mediaPeriods
            android.util.Pair r2 = new android.util.Pair
            long r3 = r6.windowSequenceNumber
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r6 = r6.periodUid
            r2.<init>(r3, r6)
            java.util.List r6 = r1.get(r2)
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            if (r8 == 0) goto L3c
            java.lang.Object r6 = com.google.common.collect.Iterables.getLast(r6)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r6 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) r6
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r7 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.access$100(r6)
            if (r7 == 0) goto L31
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r6 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.access$100(r6)
            goto L3b
        L31:
            java.util.List r6 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.access$200(r6)
            java.lang.Object r6 = com.google.common.collect.Iterables.getLast(r6)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r6 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) r6
        L3b:
            return r6
        L3c:
            r8 = 0
            r0 = 0
        L3e:
            int r1 = r6.size()
            if (r0 >= r1) goto L54
            java.lang.Object r1 = r6.get(r0)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) r1
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r1 = r1.getMediaPeriodForEvent(r7)
            if (r1 == 0) goto L51
            return r1
        L51:
            int r0 = r0 + 1
            goto L3e
        L54:
            java.lang.Object r6 = r6.get(r8)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r6 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) r6
            java.util.List r6 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.access$200(r6)
            java.lang.Object r6 = r6.get(r8)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r6 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) r6
            return r6
    }

    private /* synthetic */ void lambda$setAdPlaybackStates$0(com.google.common.collect.ImmutableMap r4) {
            r3 = this;
            com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod> r0 = r3.mediaPeriods
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) r1
            java.lang.Object r2 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.access$000(r1)
            java.lang.Object r2 = r4.get(r2)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r2
            if (r2 == 0) goto La
            r1.updateAdPlaybackState(r2)
            goto La
        L26:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r3.lastUsedMediaPeriod
            if (r0 == 0) goto L3b
            java.lang.Object r0 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.access$000(r0)
            java.lang.Object r0 = r4.get(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            if (r0 == 0) goto L3b
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = r3.lastUsedMediaPeriod
            r1.updateAdPlaybackState(r0)
        L3b:
            r3.adPlaybackStates = r4
            com.google.android.exoplayer2.Timeline r0 = r3.contentTimeline
            if (r0 == 0) goto L4b
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$ServerSideAdInsertionTimeline r0 = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$ServerSideAdInsertionTimeline
            com.google.android.exoplayer2.Timeline r1 = r3.contentTimeline
            r0.<init>(r1, r4)
            r3.refreshSourceInfo(r0)
        L4b:
            return
    }

    private void releaseLastUsedMediaPeriod() {
            r2 = this;
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r2.lastUsedMediaPeriod
            if (r0 == 0) goto Lc
            com.google.android.exoplayer2.source.MediaSource r1 = r2.mediaSource
            r0.release(r1)
            r0 = 0
            r2.lastUsedMediaPeriod = r0
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r12, com.google.android.exoplayer2.upstream.Allocator r13, long r14) {
            r11 = this;
            android.util.Pair r0 = new android.util.Pair
            long r1 = r12.windowSequenceNumber
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r2 = r12.periodUid
            r0.<init>(r1, r2)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = r11.lastUsedMediaPeriod
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L33
            java.lang.Object r1 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.access$000(r1)
            java.lang.Object r4 = r12.periodUid
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L28
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = r11.lastUsedMediaPeriod
            com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod> r3 = r11.mediaPeriods
            r3.put(r0, r1)
            r3 = 1
            goto L30
        L28:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = r11.lastUsedMediaPeriod
            com.google.android.exoplayer2.source.MediaSource r4 = r11.mediaSource
            r1.release(r4)
            r1 = r2
        L30:
            r11.lastUsedMediaPeriod = r2
            goto L34
        L33:
            r1 = r2
        L34:
            if (r1 != 0) goto L7b
            com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod> r1 = r11.mediaPeriods
            java.util.List r1 = r1.get(r0)
            java.lang.Object r1 = com.google.common.collect.Iterables.getLast(r1, r2)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r1 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) r1
            if (r1 == 0) goto L4b
            boolean r2 = r1.canReuseMediaPeriod(r12, r14)
            if (r2 == 0) goto L4b
            goto L7b
        L4b:
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r1 = r11.adPlaybackStates
            java.lang.Object r2 = r12.periodUid
            java.lang.Object r1 = r1.get(r2)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r1
            long r4 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(r14, r12, r1)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r2 = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod
            com.google.android.exoplayer2.source.MediaSource r6 = r11.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            java.lang.Object r8 = r12.periodUid
            long r9 = r12.windowSequenceNumber
            r7.<init>(r8, r9)
            com.google.android.exoplayer2.source.MediaPeriod r13 = r6.createPeriod(r7, r13, r4)
            java.lang.Object r4 = r12.periodUid
            r2.<init>(r13, r4, r1)
            com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod> r13 = r11.mediaPeriods
            r13.put(r0, r2)
            r1 = r2
        L7b:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r13 = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r11.createEventDispatcher(r12)
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r11.createDrmEventDispatcher(r12)
            r13.<init>(r1, r12, r0, r2)
            r1.add(r13)
            if (r3 == 0) goto L95
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r12 = r1.trackSelections
            int r12 = r12.length
            if (r12 <= 0) goto L95
            r13.seekToUs(r14)
        L95:
            return r13
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void disableInternal() {
            r1 = this;
            r1.releaseLastUsedMediaPeriod()
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.disable(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void enableInternal() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.enable(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            com.google.android.exoplayer2.MediaItem r0 = r0.getMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.maybeThrowSourceInfoRefreshError()
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
            r2 = this;
            r3 = 0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r3 = r2.getMediaPeriodForEvent(r4, r5, r3)
            if (r3 != 0) goto Ld
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r2.mediaSourceEventDispatcherWithoutId
            r3.downstreamFormatChanged(r5)
            goto L2d
        Ld:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r4 = r3.sharedPeriod
            r4.onDownstreamFormatChanged(r3, r5)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r3.mediaSourceEventDispatcher
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r2.adPlaybackStates
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId
            java.lang.Object r1 = r1.periodUid
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            com.google.android.exoplayer2.source.MediaLoadData r3 = correctMediaLoadData(r3, r5, r0)
            r4.downstreamFormatChanged(r3)
        L2d:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            r2 = 0
            r0 = 0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r2 = r1.getMediaPeriodForEvent(r3, r2, r0)
            if (r2 != 0) goto Le
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.drmEventDispatcherWithoutId
            r2.drmKeysLoaded()
            goto L13
        Le:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r2.drmEventDispatcher
            r2.drmKeysLoaded()
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            r2 = 0
            r0 = 0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r2 = r1.getMediaPeriodForEvent(r3, r2, r0)
            if (r2 != 0) goto Le
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.drmEventDispatcherWithoutId
            r2.drmKeysRemoved()
            goto L13
        Le:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r2.drmEventDispatcher
            r2.drmKeysRemoved()
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            r2 = 0
            r0 = 0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r2 = r1.getMediaPeriodForEvent(r3, r2, r0)
            if (r2 != 0) goto Le
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.drmEventDispatcherWithoutId
            r2.drmKeysRestored()
            goto L13
        Le:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r2.drmEventDispatcher
            r2.drmKeysRestored()
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final /* synthetic */ void onDrmSessionAcquired(int r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r0 = this;
            com.google.android.exoplayer2.drm.DrmSessionEventListener.CC.$default$onDrmSessionAcquired(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, int r4) {
            r1 = this;
            r2 = 0
            r0 = 1
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r2 = r1.getMediaPeriodForEvent(r3, r2, r0)
            if (r2 != 0) goto Le
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.drmEventDispatcherWithoutId
            r2.drmSessionAcquired(r4)
            goto L13
        Le:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r2.drmEventDispatcher
            r2.drmSessionAcquired(r4)
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, java.lang.Exception r4) {
            r1 = this;
            r2 = 0
            r0 = 0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r2 = r1.getMediaPeriodForEvent(r3, r2, r0)
            if (r2 != 0) goto Le
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.drmEventDispatcherWithoutId
            r2.drmSessionManagerError(r4)
            goto L13
        Le:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r2.drmEventDispatcher
            r2.drmSessionManagerError(r4)
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            r2 = 0
            r0 = 0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r2 = r1.getMediaPeriodForEvent(r3, r2, r0)
            if (r2 != 0) goto Le
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r1.drmEventDispatcherWithoutId
            r2.drmSessionReleased()
            goto L13
        Le:
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r2 = r2.drmEventDispatcher
            r2.drmSessionReleased()
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCanceled(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.LoadEventInfo r5, com.google.android.exoplayer2.source.MediaLoadData r6) {
            r2 = this;
            r3 = 1
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r3 = r2.getMediaPeriodForEvent(r4, r6, r3)
            if (r3 != 0) goto Ld
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r2.mediaSourceEventDispatcherWithoutId
            r3.loadCanceled(r5, r6)
            goto L2d
        Ld:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r4 = r3.sharedPeriod
            r4.onLoadFinished(r5)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r3.mediaSourceEventDispatcher
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r2.adPlaybackStates
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId
            java.lang.Object r1 = r1.periodUid
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            com.google.android.exoplayer2.source.MediaLoadData r3 = correctMediaLoadData(r3, r6, r0)
            r4.loadCanceled(r5, r3)
        L2d:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCompleted(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.LoadEventInfo r5, com.google.android.exoplayer2.source.MediaLoadData r6) {
            r2 = this;
            r3 = 1
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r3 = r2.getMediaPeriodForEvent(r4, r6, r3)
            if (r3 != 0) goto Ld
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r2.mediaSourceEventDispatcherWithoutId
            r3.loadCompleted(r5, r6)
            goto L2d
        Ld:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r4 = r3.sharedPeriod
            r4.onLoadFinished(r5)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r3.mediaSourceEventDispatcher
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r2.adPlaybackStates
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId
            java.lang.Object r1 = r1.periodUid
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            com.google.android.exoplayer2.source.MediaLoadData r3 = correctMediaLoadData(r3, r6, r0)
            r4.loadCompleted(r5, r3)
        L2d:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.LoadEventInfo r5, com.google.android.exoplayer2.source.MediaLoadData r6, java.io.IOException r7, boolean r8) {
            r2 = this;
            r3 = 1
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r3 = r2.getMediaPeriodForEvent(r4, r6, r3)
            if (r3 != 0) goto Ld
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r2.mediaSourceEventDispatcherWithoutId
            r3.loadError(r5, r6, r7, r8)
            goto L2f
        Ld:
            if (r8 == 0) goto L14
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r4 = r3.sharedPeriod
            r4.onLoadFinished(r5)
        L14:
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r3.mediaSourceEventDispatcher
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r2.adPlaybackStates
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId
            java.lang.Object r1 = r1.periodUid
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            com.google.android.exoplayer2.source.MediaLoadData r3 = correctMediaLoadData(r3, r6, r0)
            r4.loadError(r5, r3, r7, r8)
        L2f:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadStarted(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.LoadEventInfo r5, com.google.android.exoplayer2.source.MediaLoadData r6) {
            r2 = this;
            r3 = 1
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r3 = r2.getMediaPeriodForEvent(r4, r6, r3)
            if (r3 != 0) goto Ld
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r2.mediaSourceEventDispatcherWithoutId
            r3.loadStarted(r5, r6)
            goto L2d
        Ld:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r4 = r3.sharedPeriod
            r4.onLoadStarted(r5, r6)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r3.mediaSourceEventDispatcher
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r2.adPlaybackStates
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId
            java.lang.Object r1 = r1.periodUid
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            com.google.android.exoplayer2.source.MediaLoadData r3 = correctMediaLoadData(r3, r6, r0)
            r4.loadStarted(r5, r3)
        L2d:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.Timeline r3) {
            r1 = this;
            r1.contentTimeline = r3
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$AdPlaybackStateUpdater r2 = r1.adPlaybackStateUpdater
            if (r2 == 0) goto Lc
            boolean r2 = r2.onAdPlaybackStateUpdateRequested(r3)
            if (r2 != 0) goto L1e
        Lc:
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r2 = r1.adPlaybackStates
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1e
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$ServerSideAdInsertionTimeline r2 = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$ServerSideAdInsertionTimeline
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r1.adPlaybackStates
            r2.<init>(r3, r0)
            r1.refreshSourceInfo(r2)
        L1e:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int r3, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
            r2 = this;
            r3 = 0
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r3 = r2.getMediaPeriodForEvent(r4, r5, r3)
            if (r3 != 0) goto Ld
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r2.mediaSourceEventDispatcherWithoutId
            r3.upstreamDiscarded(r5)
            goto L28
        Ld:
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r3.mediaSourceEventDispatcher
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = r2.adPlaybackStates
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId
            java.lang.Object r1 = r1.periodUid
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            com.google.android.exoplayer2.source.MediaLoadData r3 = correctMediaLoadData(r3, r5, r0)
            r4.upstreamDiscarded(r3)
        L28:
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r2 = this;
            android.os.Handler r0 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
            monitor-enter(r2)
            r2.playbackHandler = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            com.google.android.exoplayer2.source.MediaSource r1 = r2.mediaSource
            r1.addEventListener(r0, r2)
            com.google.android.exoplayer2.source.MediaSource r1 = r2.mediaSource
            r1.addDrmEventListener(r0, r2)
            com.google.android.exoplayer2.source.MediaSource r0 = r2.mediaSource
            com.google.android.exoplayer2.analytics.PlayerId r1 = r2.getPlayerId()
            r0.prepareSource(r2, r3, r1)
            return
        L1c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r5) {
            r4 = this;
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl r5 = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) r5
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r5.sharedPeriod
            r0.remove(r5)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r0 = r5.sharedPeriod
            boolean r0 = r0.isUnused()
            if (r0 == 0) goto L3b
            com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod> r0 = r4.mediaPeriods
            android.util.Pair r1 = new android.util.Pair
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r5.mediaPeriodId
            long r2 = r2.windowSequenceNumber
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r5.mediaPeriodId
            java.lang.Object r3 = r3.periodUid
            r1.<init>(r2, r3)
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r2 = r5.sharedPeriod
            r0.remove(r1, r2)
            com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod> r0 = r4.mediaPeriods
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L34
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r5 = r5.sharedPeriod
            r4.lastUsedMediaPeriod = r5
            goto L3b
        L34:
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$SharedMediaPeriod r5 = r5.sharedPeriod
            com.google.android.exoplayer2.source.MediaSource r0 = r4.mediaSource
            r5.release(r0)
        L3b:
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r1 = this;
            r1.releaseLastUsedMediaPeriod()
            r0 = 0
            r1.contentTimeline = r0
            monitor-enter(r1)
            r1.playbackHandler = r0     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.releaseSource(r1)
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.removeEventListener(r1)
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            r0.removeDrmEventListener(r1)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public void setAdPlaybackStates(com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r15) {
            r14 = this;
            boolean r0 = r15.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.common.collect.ImmutableCollection r0 = r15.values()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            java.lang.Object r0 = r0.adsId
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.common.collect.ImmutableSet r3 = r15.entrySet()
            com.google.common.collect.UnmodifiableIterator r3 = r3.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Laf
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            com.google.android.exoplayer2.source.ads.AdPlaybackState r4 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r4
            java.lang.Object r6 = r4.adsId
            boolean r6 = com.google.android.exoplayer2.util.Util.areEqual(r0, r6)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r6)
            com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> r6 = r14.adPlaybackStates
            java.lang.Object r5 = r6.get(r5)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r5 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r5
            if (r5 == 0) goto L26
            int r6 = r4.removedAdGroupCount
        L51:
            int r7 = r4.adGroupCount
            if (r6 >= r7) goto L26
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r7 = r4.getAdGroup(r6)
            boolean r8 = r7.isServerSideInserted
            com.google.android.exoplayer2.util.Assertions.checkArgument(r8)
            int r8 = r5.adGroupCount
            if (r6 >= r8) goto L98
            int r8 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(r4, r6)
            int r9 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(r5, r6)
            if (r8 >= r9) goto L98
            int r8 = r6 + 1
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r8 = r4.getAdGroup(r8)
            long r9 = r7.contentResumeOffsetUs
            long r11 = r8.contentResumeOffsetUs
            long r9 = r9 + r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r5.getAdGroup(r6)
            long r11 = r11.contentResumeOffsetUs
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L83
            r9 = 1
            goto L84
        L83:
            r9 = 0
        L84:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r9)
            long r9 = r7.timeUs
            long r11 = r7.contentResumeOffsetUs
            long r9 = r9 + r11
            long r11 = r8.timeUs
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 != 0) goto L94
            r8 = 1
            goto L95
        L94:
            r8 = 0
        L95:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r8)
        L98:
            long r7 = r7.timeUs
            r9 = -9223372036854775808
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto Lac
            int r7 = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(r4, r6)
            if (r7 != 0) goto La8
            r7 = 1
            goto La9
        La8:
            r7 = 0
        La9:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
        Lac:
            int r6 = r6 + 1
            goto L51
        Laf:
            monitor-enter(r14)
            android.os.Handler r0 = r14.playbackHandler     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto Lb7
            r14.adPlaybackStates = r15     // Catch: java.lang.Throwable -> Lc2
            goto Lc0
        Lb7:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> Lc2
            r2 = 2
            r1.<init>(r14, r15, r2)     // Catch: java.lang.Throwable -> Lc2
            r0.post(r1)     // Catch: java.lang.Throwable -> Lc2
        Lc0:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lc2
            return
        Lc2:
            r15 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lc2
            throw r15
    }
}
