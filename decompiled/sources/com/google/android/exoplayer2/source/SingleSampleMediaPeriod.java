package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
final class SingleSampleMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable> {
    private static final int INITIAL_SAMPLE_SIZE = 1024;
    private static final java.lang.String TAG = "SingleSampleMediaPeriod";
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private final long durationUs;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
    public final com.google.android.exoplayer2.Format format;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    public final com.google.android.exoplayer2.upstream.Loader loader;
    public boolean loadingFinished;
    public byte[] sampleData;
    public int sampleSize;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SampleStreamImpl> sampleStreams;
    private final com.google.android.exoplayer2.source.TrackGroupArray tracks;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.TransferListener transferListener;
    public final boolean treatLoadErrorsAsEndOfStream;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.SingleSampleMediaPeriod$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class SampleStreamImpl implements com.google.android.exoplayer2.source.SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private boolean notifiedDownstreamFormat;
        private int streamState;
        public final /* synthetic */ com.google.android.exoplayer2.source.SingleSampleMediaPeriod this$0;

        private SampleStreamImpl(com.google.android.exoplayer2.source.SingleSampleMediaPeriod r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ SampleStreamImpl(com.google.android.exoplayer2.source.SingleSampleMediaPeriod r1, com.google.android.exoplayer2.source.SingleSampleMediaPeriod.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void maybeNotifyDownstreamFormat() {
                r8 = this;
                boolean r0 = r8.notifiedDownstreamFormat
                if (r0 != 0) goto L22
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r0 = r8.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = com.google.android.exoplayer2.source.SingleSampleMediaPeriod.access$300(r0)
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r0 = r8.this$0
                com.google.android.exoplayer2.Format r0 = r0.format
                java.lang.String r0 = r0.sampleMimeType
                int r2 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r0)
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r0 = r8.this$0
                com.google.android.exoplayer2.Format r3 = r0.format
                r4 = 0
                r5 = 0
                r6 = 0
                r1.downstreamFormatChanged(r2, r3, r4, r5, r6)
                r0 = 1
                r8.notifiedDownstreamFormat = r0
            L22:
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
                r1 = this;
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r0 = r1.this$0
                boolean r0 = r0.loadingFinished
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
                r2 = this;
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r0 = r2.this$0
                boolean r1 = r0.treatLoadErrorsAsEndOfStream
                if (r1 != 0) goto Lb
                com.google.android.exoplayer2.upstream.Loader r0 = r0.loader
                r0.maybeThrowError()
            Lb:
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder r8, com.google.android.exoplayer2.decoder.DecoderInputBuffer r9, int r10) {
                r7 = this;
                r7.maybeNotifyDownstreamFormat()
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r0 = r7.this$0
                boolean r1 = r0.loadingFinished
                r2 = 2
                if (r1 == 0) goto L10
                byte[] r3 = r0.sampleData
                if (r3 != 0) goto L10
                r7.streamState = r2
            L10:
                int r3 = r7.streamState
                r4 = -4
                if (r3 != r2) goto L1a
                r8 = 4
                r9.addFlag(r8)
                return r4
            L1a:
                r5 = r10 & 2
                r6 = 1
                if (r5 != 0) goto L50
                if (r3 != 0) goto L22
                goto L50
            L22:
                if (r1 != 0) goto L26
                r8 = -3
                return r8
            L26:
                byte[] r8 = r0.sampleData
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
                r9.addFlag(r6)
                r0 = 0
                r9.timeUs = r0
                r8 = r10 & 4
                if (r8 != 0) goto L49
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r8 = r7.this$0
                int r8 = r8.sampleSize
                r9.ensureSpaceForWrite(r8)
                java.nio.ByteBuffer r8 = r9.data
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod r9 = r7.this$0
                byte[] r0 = r9.sampleData
                r1 = 0
                int r9 = r9.sampleSize
                r8.put(r0, r1, r9)
            L49:
                r8 = r10 & 1
                if (r8 != 0) goto L4f
                r7.streamState = r2
            L4f:
                return r4
            L50:
                com.google.android.exoplayer2.Format r9 = r0.format
                r8.format = r9
                r7.streamState = r6
                r8 = -5
                return r8
        }

        public void reset() {
                r2 = this;
                int r0 = r2.streamState
                r1 = 2
                if (r0 != r1) goto L8
                r0 = 1
                r2.streamState = r0
            L8:
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long r4) {
                r3 = this;
                r3.maybeNotifyDownstreamFormat()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L12
                int r4 = r3.streamState
                r5 = 2
                if (r4 == r5) goto L12
                r3.streamState = r5
                r4 = 1
                return r4
            L12:
                r4 = 0
                return r4
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SourceLoadable implements com.google.android.exoplayer2.upstream.Loader.Loadable {
        private final com.google.android.exoplayer2.upstream.StatsDataSource dataSource;
        public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
        public final long loadTaskId;

        @androidx.annotation.Nullable
        private byte[] sampleData;

        public SourceLoadable(com.google.android.exoplayer2.upstream.DataSpec r3, com.google.android.exoplayer2.upstream.DataSource r4) {
                r2 = this;
                r2.<init>()
                long r0 = com.google.android.exoplayer2.source.LoadEventInfo.getNewId()
                r2.loadTaskId = r0
                r2.dataSpec = r3
                com.google.android.exoplayer2.upstream.StatsDataSource r3 = new com.google.android.exoplayer2.upstream.StatsDataSource
                r3.<init>(r4)
                r2.dataSource = r3
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.upstream.StatsDataSource access$100(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable r0) {
                com.google.android.exoplayer2.upstream.StatsDataSource r0 = r0.dataSource
                return r0
        }

        public static /* synthetic */ byte[] access$200(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable r0) {
                byte[] r0 = r0.sampleData
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws java.io.IOException {
                r4 = this;
                com.google.android.exoplayer2.upstream.StatsDataSource r0 = r4.dataSource
                r0.resetBytesRead()
                com.google.android.exoplayer2.upstream.StatsDataSource r0 = r4.dataSource     // Catch: java.lang.Throwable -> L3f
                com.google.android.exoplayer2.upstream.DataSpec r1 = r4.dataSpec     // Catch: java.lang.Throwable -> L3f
                r0.open(r1)     // Catch: java.lang.Throwable -> L3f
                r0 = 0
            Ld:
                r1 = -1
                if (r0 == r1) goto L39
                com.google.android.exoplayer2.upstream.StatsDataSource r0 = r4.dataSource     // Catch: java.lang.Throwable -> L3f
                long r0 = r0.getBytesRead()     // Catch: java.lang.Throwable -> L3f
                int r1 = (int) r0     // Catch: java.lang.Throwable -> L3f
                byte[] r0 = r4.sampleData     // Catch: java.lang.Throwable -> L3f
                if (r0 != 0) goto L22
                r0 = 1024(0x400, float:1.435E-42)
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3f
                r4.sampleData = r0     // Catch: java.lang.Throwable -> L3f
                goto L2e
            L22:
                int r2 = r0.length     // Catch: java.lang.Throwable -> L3f
                if (r1 != r2) goto L2e
                int r2 = r0.length     // Catch: java.lang.Throwable -> L3f
                int r2 = r2 * 2
                byte[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L3f
                r4.sampleData = r0     // Catch: java.lang.Throwable -> L3f
            L2e:
                com.google.android.exoplayer2.upstream.StatsDataSource r0 = r4.dataSource     // Catch: java.lang.Throwable -> L3f
                byte[] r2 = r4.sampleData     // Catch: java.lang.Throwable -> L3f
                int r3 = r2.length     // Catch: java.lang.Throwable -> L3f
                int r3 = r3 - r1
                int r0 = r0.read(r2, r1, r3)     // Catch: java.lang.Throwable -> L3f
                goto Ld
            L39:
                com.google.android.exoplayer2.upstream.StatsDataSource r0 = r4.dataSource
                com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r0)
                return
            L3f:
                r0 = move-exception
                com.google.android.exoplayer2.upstream.StatsDataSource r1 = r4.dataSource
                com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r1)
                throw r0
        }
    }

    public SingleSampleMediaPeriod(com.google.android.exoplayer2.upstream.DataSpec r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3, com.google.android.exoplayer2.Format r4, long r5, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.dataSpec = r1
            r0.dataSourceFactory = r2
            r0.transferListener = r3
            r0.format = r4
            r0.durationUs = r5
            r0.loadErrorHandlingPolicy = r7
            r0.eventDispatcher = r8
            r0.treatLoadErrorsAsEndOfStream = r9
            com.google.android.exoplayer2.source.TrackGroupArray r1 = new com.google.android.exoplayer2.source.TrackGroupArray
            r2 = 1
            com.google.android.exoplayer2.source.TrackGroup[] r3 = new com.google.android.exoplayer2.source.TrackGroup[r2]
            com.google.android.exoplayer2.source.TrackGroup r5 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r2]
            r6 = 0
            r2[r6] = r4
            r5.<init>(r2)
            r3[r6] = r5
            r1.<init>(r3)
            r0.tracks = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.sampleStreams = r1
            com.google.android.exoplayer2.upstream.Loader r1 = new com.google.android.exoplayer2.upstream.Loader
            java.lang.String r2 = "SingleSampleMediaPeriod"
            r1.<init>(r2)
            r0.loader = r1
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher access$300(com.google.android.exoplayer2.source.SingleSampleMediaPeriod r0) {
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r0.eventDispatcher
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r23) {
            r22 = this;
            r0 = r22
            boolean r1 = r0.loadingFinished
            if (r1 != 0) goto L56
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.isLoading()
            if (r1 != 0) goto L56
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.hasFatalError()
            if (r1 == 0) goto L17
            goto L56
        L17:
            com.google.android.exoplayer2.upstream.DataSource$Factory r1 = r0.dataSourceFactory
            com.google.android.exoplayer2.upstream.DataSource r1 = r1.createDataSource()
            com.google.android.exoplayer2.upstream.TransferListener r2 = r0.transferListener
            if (r2 == 0) goto L24
            r1.addTransferListener(r2)
        L24:
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SourceLoadable r2 = new com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SourceLoadable
            com.google.android.exoplayer2.upstream.DataSpec r3 = r0.dataSpec
            r2.<init>(r3, r1)
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r0.loadErrorHandlingPolicy
            r4 = 1
            int r3 = r3.getMinimumLoadableRetryCount(r4)
            long r9 = r1.startLoading(r2, r0, r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r11 = r0.eventDispatcher
            com.google.android.exoplayer2.source.LoadEventInfo r12 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r6 = r2.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r8 = r0.dataSpec
            r5 = r12
            r5.<init>(r6, r8, r9)
            r13 = 1
            r14 = -1
            com.google.android.exoplayer2.Format r15 = r0.format
            r16 = 0
            r17 = 0
            r18 = 0
            long r1 = r0.durationUs
            r20 = r1
            r11.loadStarted(r12, r13, r14, r15, r16, r17, r18, r20)
            return r4
        L56:
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long r1, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long r1, com.google.android.exoplayer2.SeekParameters r3) {
            r0 = this;
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r2 = this;
            boolean r0 = r2.loadingFinished
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            goto L9
        L7:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
            r2 = this;
            boolean r0 = r2.loadingFinished
            if (r0 != 0) goto L10
            com.google.android.exoplayer2.upstream.Loader r0 = r2.loader
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            r0 = 0
            goto L12
        L10:
            r0 = -9223372036854775808
        L12:
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
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.tracks
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            boolean r0 = r0.isLoading()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() {
            r0 = this;
            return
    }

    public void onLoadCanceled(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable r17, long r18, long r20, boolean r22) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.exoplayer2.upstream.StatsDataSource r2 = com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable.access$100(r17)
            com.google.android.exoplayer2.source.LoadEventInfo r15 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r4 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
            android.net.Uri r7 = r2.getLastOpenedUri()
            java.util.Map r8 = r2.getLastResponseHeaders()
            long r13 = r2.getBytesRead()
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = r1.loadTaskId
            r2.onLoadTaskConcluded(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r0.eventDispatcher
            long r12 = r0.durationUs
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r15
            r3.loadCanceled(r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
            r0 = this;
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SourceLoadable r1 = (com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable) r1
            r0.onLoadCanceled(r1, r2, r4, r6)
            return
    }

    public void onLoadCompleted(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable r17, long r18, long r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.exoplayer2.upstream.StatsDataSource r2 = com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable.access$100(r17)
            long r2 = r2.getBytesRead()
            int r3 = (int) r2
            r0.sampleSize = r3
            byte[] r2 = com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable.access$200(r17)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            r0.sampleData = r2
            r2 = 1
            r0.loadingFinished = r2
            com.google.android.exoplayer2.upstream.StatsDataSource r2 = com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable.access$100(r17)
            com.google.android.exoplayer2.source.LoadEventInfo r15 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r4 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
            android.net.Uri r7 = r2.getLastOpenedUri()
            java.util.Map r8 = r2.getLastResponseHeaders()
            int r2 = r0.sampleSize
            long r13 = (long) r2
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = r1.loadTaskId
            r2.onLoadTaskConcluded(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r0.eventDispatcher
            com.google.android.exoplayer2.Format r7 = r0.format
            long r12 = r0.durationUs
            r5 = 1
            r6 = -1
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r15
            r3.loadCompleted(r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
            r0 = this;
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SourceLoadable r1 = (com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable) r1
            r0.onLoadCompleted(r1, r2, r4)
            return
    }

    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable r37, long r38, long r40, java.io.IOException r42, int r43) {
            r36 = this;
            r0 = r36
            r1 = r37
            r13 = r42
            r2 = r43
            com.google.android.exoplayer2.upstream.StatsDataSource r3 = com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable.access$100(r37)
            com.google.android.exoplayer2.source.LoadEventInfo r4 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r5 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r7 = r1.dataSpec
            android.net.Uri r18 = r3.getLastOpenedUri()
            java.util.Map r19 = r3.getLastResponseHeaders()
            long r24 = r3.getBytesRead()
            r14 = r4
            r15 = r5
            r17 = r7
            r20 = r38
            r22 = r40
            r14.<init>(r15, r17, r18, r19, r20, r22, r24)
            com.google.android.exoplayer2.source.MediaLoadData r3 = new com.google.android.exoplayer2.source.MediaLoadData
            com.google.android.exoplayer2.Format r5 = r0.format
            long r6 = r0.durationUs
            long r34 = com.google.android.exoplayer2.util.Util.usToMs(r6)
            r27 = 1
            r28 = -1
            r30 = 0
            r31 = 0
            r32 = 0
            r26 = r3
            r29 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r34)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r5 = r0.loadErrorHandlingPolicy
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r6 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
            r6.<init>(r4, r3, r13, r2)
            long r5 = r5.getRetryDelayMsFor(r6)
            r3 = 0
            r7 = 1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L65
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r8 = r0.loadErrorHandlingPolicy
            int r8 = r8.getMinimumLoadableRetryCount(r7)
            if (r2 < r8) goto L63
            goto L65
        L63:
            r2 = 0
            goto L66
        L65:
            r2 = 1
        L66:
            boolean r8 = r0.treatLoadErrorsAsEndOfStream
            if (r8 == 0) goto L79
            if (r2 == 0) goto L79
            java.lang.String r2 = "SingleSampleMediaPeriod"
            java.lang.String r3 = "Loading failed, treating as end-of-stream."
            com.google.android.exoplayer2.util.Log.w(r2, r3, r13)
            r0.loadingFinished = r7
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
        L77:
            r15 = r2
            goto L83
        L79:
            if (r10 == 0) goto L80
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.createRetryAction(r3, r5)
            goto L77
        L80:
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL
            goto L77
        L83:
            boolean r2 = r15.isRetry()
            r16 = r2 ^ 1
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.eventDispatcher
            r5 = 1
            r6 = -1
            com.google.android.exoplayer2.Format r7 = r0.format
            r8 = 0
            r9 = 0
            long r10 = r0.durationUs
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r11 = r10
            r9 = 0
            r13 = r42
            r14 = r16
            r2.loadError(r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
            if (r16 == 0) goto Lac
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = r1.loadTaskId
            r2.onLoadTaskConcluded(r3)
        Lac:
            return r15
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
            r0 = this;
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SourceLoadable r1 = (com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable) r1
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = r0.onLoadError(r1, r2, r4, r6, r7)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
            r0 = this;
            r1.onPrepared(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r1) {
            r0 = this;
            return
    }

    public void release() {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            r0.release()
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SampleStreamImpl> r1 = r2.sampleStreams
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SampleStreamImpl> r1 = r2.sampleStreams
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SampleStreamImpl r1 = (com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SampleStreamImpl) r1
            r1.reset()
            int r0 = r0 + 1
            goto L1
        L17:
            return r3
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5, boolean[] r6, com.google.android.exoplayer2.source.SampleStream[] r7, boolean[] r8, long r9) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L34
            r1 = r7[r0]
            r2 = 0
            if (r1 == 0) goto L1a
            r1 = r5[r0]
            if (r1 == 0) goto L11
            boolean r1 = r6[r0]
            if (r1 != 0) goto L1a
        L11:
            java.util.ArrayList<com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SampleStreamImpl> r1 = r4.sampleStreams
            r3 = r7[r0]
            r1.remove(r3)
            r7[r0] = r2
        L1a:
            r1 = r7[r0]
            if (r1 != 0) goto L31
            r1 = r5[r0]
            if (r1 == 0) goto L31
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SampleStreamImpl r1 = new com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SampleStreamImpl
            r1.<init>(r4, r2)
            java.util.ArrayList<com.google.android.exoplayer2.source.SingleSampleMediaPeriod$SampleStreamImpl> r2 = r4.sampleStreams
            r2.add(r1)
            r7[r0] = r1
            r1 = 1
            r8[r0] = r1
        L31:
            int r0 = r0 + 1
            goto L1
        L34:
            return r9
    }
}
