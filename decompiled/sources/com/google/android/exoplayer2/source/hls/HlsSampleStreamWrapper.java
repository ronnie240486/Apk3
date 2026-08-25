package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
final class HlsSampleStreamWrapper implements com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.source.chunk.Chunk>, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback, com.google.android.exoplayer2.source.SequenceableLoader, com.google.android.exoplayer2.extractor.ExtractorOutput, com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener {
    private static final java.util.Set<java.lang.Integer> MAPPABLE_TYPES = null;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final java.lang.String TAG = "HlsSampleStreamWrapper";
    private final com.google.android.exoplayer2.upstream.Allocator allocator;
    private final com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback callback;
    private final com.google.android.exoplayer2.source.hls.HlsChunkSource chunkSource;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format downstreamTrackFormat;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.drm.DrmInitData drmInitData;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private com.google.android.exoplayer2.extractor.TrackOutput emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private final android.os.Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsSampleStream> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.upstream.Loader loader;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.Chunk loadingChunk;
    private boolean loadingFinished;
    private final java.lang.Runnable maybeFinishPrepareRunnable;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> mediaChunks;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.Format muxedAudioFormat;
    private final com.google.android.exoplayer2.source.hls.HlsChunkSource.HlsChunkHolder nextChunkHolder;
    private final java.lang.Runnable onTracksEndedRunnable;
    private java.util.Set<com.google.android.exoplayer2.source.TrackGroup> optionalTrackGroups;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private android.util.SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private java.util.Set<java.lang.Integer> sampleQueueMappingDoneByType;
    private int[] sampleQueueTrackIds;
    private com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.HlsSampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.hls.HlsMediaChunk sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private com.google.android.exoplayer2.source.TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private final java.lang.String uid;
    private com.google.android.exoplayer2.Format upstreamTrackFormat;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface Callback extends com.google.android.exoplayer2.source.SequenceableLoader.Callback<com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(android.net.Uri r1);

        void onPrepared();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class EmsgUnwrappingTrackOutput implements com.google.android.exoplayer2.extractor.TrackOutput {
        private static final com.google.android.exoplayer2.Format EMSG_FORMAT = null;
        private static final com.google.android.exoplayer2.Format ID3_FORMAT = null;
        private byte[] buffer;
        private int bufferPosition;
        private final com.google.android.exoplayer2.extractor.TrackOutput delegate;
        private final com.google.android.exoplayer2.Format delegateFormat;
        private final com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder emsgDecoder;
        private com.google.android.exoplayer2.Format format;

        static {
                com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
                r0.<init>()
                java.lang.String r1 = "application/id3"
                com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
                com.google.android.exoplayer2.Format r0 = r0.build()
                com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.EmsgUnwrappingTrackOutput.ID3_FORMAT = r0
                com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
                r0.<init>()
                java.lang.String r1 = "application/x-emsg"
                com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
                com.google.android.exoplayer2.Format r0 = r0.build()
                com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.EmsgUnwrappingTrackOutput.EMSG_FORMAT = r0
                return
        }

        public EmsgUnwrappingTrackOutput(com.google.android.exoplayer2.extractor.TrackOutput r2, int r3) {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder r0 = new com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder
                r0.<init>()
                r1.emsgDecoder = r0
                r1.delegate = r2
                r2 = 1
                if (r3 == r2) goto L23
                r2 = 3
                if (r3 != r2) goto L17
                com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.EmsgUnwrappingTrackOutput.EMSG_FORMAT
                r1.delegateFormat = r2
                goto L27
            L17:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Unknown metadataType: "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
                r2.<init>(r3)
                throw r2
            L23:
                com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.EmsgUnwrappingTrackOutput.ID3_FORMAT
                r1.delegateFormat = r2
            L27:
                r2 = 0
                byte[] r3 = new byte[r2]
                r1.buffer = r3
                r1.bufferPosition = r2
                return
        }

        private boolean emsgContainsExpectedWrappedFormat(com.google.android.exoplayer2.metadata.emsg.EventMessage r2) {
                r1 = this;
                com.google.android.exoplayer2.Format r2 = r2.getWrappedMetadataFormat()
                if (r2 == 0) goto L14
                com.google.android.exoplayer2.Format r0 = r1.delegateFormat
                java.lang.String r0 = r0.sampleMimeType
                java.lang.String r2 = r2.sampleMimeType
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
                if (r2 == 0) goto L14
                r2 = 1
                goto L15
            L14:
                r2 = 0
            L15:
                return r2
        }

        private void ensureBufferCapacity(int r3) {
                r2 = this;
                byte[] r0 = r2.buffer
                int r1 = r0.length
                if (r1 >= r3) goto Le
                int r1 = r3 / 2
                int r1 = r1 + r3
                byte[] r3 = java.util.Arrays.copyOf(r0, r1)
                r2.buffer = r3
            Le:
                return
        }

        private com.google.android.exoplayer2.util.ParsableByteArray getSampleAndTrimBuffer(int r4, int r5) {
                r3 = this;
                int r0 = r3.bufferPosition
                int r0 = r0 - r5
                int r4 = r0 - r4
                byte[] r1 = r3.buffer
                byte[] r4 = java.util.Arrays.copyOfRange(r1, r4, r0)
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                r1.<init>(r4)
                byte[] r4 = r3.buffer
                r2 = 0
                java.lang.System.arraycopy(r4, r0, r4, r2, r5)
                r3.bufferPosition = r5
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(com.google.android.exoplayer2.Format r2) {
                r1 = this;
                r1.format = r2
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r1.delegate
                com.google.android.exoplayer2.Format r0 = r1.delegateFormat
                r2.format(r0)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final /* synthetic */ int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3) {
                r0 = this;
                int r1 = com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(com.google.android.exoplayer2.upstream.DataReader r2, int r3, boolean r4, int r5) throws java.io.IOException {
                r1 = this;
                int r5 = r1.bufferPosition
                int r5 = r5 + r3
                r1.ensureBufferCapacity(r5)
                byte[] r5 = r1.buffer
                int r0 = r1.bufferPosition
                int r2 = r2.read(r5, r0, r3)
                r3 = -1
                if (r2 != r3) goto L1a
                if (r4 == 0) goto L14
                return r3
            L14:
                java.io.EOFException r2 = new java.io.EOFException
                r2.<init>()
                throw r2
            L1a:
                int r3 = r1.bufferPosition
                int r3 = r3 + r2
                r1.bufferPosition = r3
                return r2
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final /* synthetic */ void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r2, int r3, int r4) {
                r1 = this;
                int r4 = r1.bufferPosition
                int r4 = r4 + r3
                r1.ensureBufferCapacity(r4)
                byte[] r4 = r1.buffer
                int r0 = r1.bufferPosition
                r2.readBytes(r4, r0, r3)
                int r2 = r1.bufferPosition
                int r2 = r2 + r3
                r1.bufferPosition = r2
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long r8, int r10, int r11, int r12, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r13) {
                r7 = this;
                com.google.android.exoplayer2.Format r0 = r7.format
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.util.ParsableByteArray r11 = r7.getSampleAndTrimBuffer(r11, r12)
                com.google.android.exoplayer2.Format r0 = r7.format
                java.lang.String r0 = r0.sampleMimeType
                com.google.android.exoplayer2.Format r1 = r7.delegateFormat
                java.lang.String r1 = r1.sampleMimeType
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
                if (r0 == 0) goto L18
                goto L5d
            L18:
                com.google.android.exoplayer2.Format r0 = r7.format
                java.lang.String r0 = r0.sampleMimeType
                java.lang.String r1 = "application/x-emsg"
                boolean r0 = r1.equals(r0)
                java.lang.String r1 = "HlsSampleStreamWrapper"
                if (r0 == 0) goto L70
                com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder r0 = r7.emsgDecoder
                com.google.android.exoplayer2.metadata.emsg.EventMessage r11 = r0.decode(r11)
                boolean r0 = r7.emsgContainsExpectedWrappedFormat(r11)
                if (r0 != 0) goto L4d
                r8 = 2
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r9 = 0
                com.google.android.exoplayer2.Format r10 = r7.delegateFormat
                java.lang.String r10 = r10.sampleMimeType
                r8[r9] = r10
                r9 = 1
                com.google.android.exoplayer2.Format r10 = r11.getWrappedMetadataFormat()
                r8[r9] = r10
                java.lang.String r9 = "Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s"
                java.lang.String r8 = java.lang.String.format(r9, r8)
                com.google.android.exoplayer2.util.Log.w(r1, r8)
                return
            L4d:
                com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
                byte[] r11 = r11.getWrappedMetadataBytes()
                java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
                byte[] r11 = (byte[]) r11
                r0.<init>(r11)
                r11 = r0
            L5d:
                int r4 = r11.bytesLeft()
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r7.delegate
                r0.sampleData(r11, r4)
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r7.delegate
                r1 = r8
                r3 = r10
                r5 = r12
                r6 = r13
                r0.sampleMetadata(r1, r3, r4, r5, r6)
                return
            L70:
                java.lang.String r8 = "Ignoring sample for unsupported format: "
                java.lang.StringBuilder r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8)
                com.google.android.exoplayer2.Format r9 = r7.format
                java.lang.String r9 = r9.sampleMimeType
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.google.android.exoplayer2.util.Log.w(r1, r8)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class HlsSampleQueue extends com.google.android.exoplayer2.source.SampleQueue {

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.drm.DrmInitData drmInitData;
        private final java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> overridingDrmInitData;

        private HlsSampleQueue(com.google.android.exoplayer2.upstream.Allocator r1, com.google.android.exoplayer2.drm.DrmSessionManager r2, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r3, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.overridingDrmInitData = r4
                return
        }

        public /* synthetic */ HlsSampleQueue(com.google.android.exoplayer2.upstream.Allocator r1, com.google.android.exoplayer2.drm.DrmSessionManager r2, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r3, java.util.Map r4, com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.metadata.Metadata getAdjustedMetadata(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r8) {
                r7 = this;
                r0 = 0
                if (r8 != 0) goto L4
                return r0
            L4:
                int r1 = r8.length()
                r2 = 0
                r3 = 0
            La:
                r4 = -1
                if (r3 >= r1) goto L25
                com.google.android.exoplayer2.metadata.Metadata$Entry r5 = r8.get(r3)
                boolean r6 = r5 instanceof com.google.android.exoplayer2.metadata.id3.PrivFrame
                if (r6 == 0) goto L22
                com.google.android.exoplayer2.metadata.id3.PrivFrame r5 = (com.google.android.exoplayer2.metadata.id3.PrivFrame) r5
                java.lang.String r5 = r5.owner
                java.lang.String r6 = "com.apple.streaming.transportStreamTimestamp"
                boolean r5 = r6.equals(r5)
                if (r5 == 0) goto L22
                goto L26
            L22:
                int r3 = r3 + 1
                goto La
            L25:
                r3 = -1
            L26:
                if (r3 != r4) goto L29
                return r8
            L29:
                r4 = 1
                if (r1 != r4) goto L2d
                return r0
            L2d:
                int r0 = r1 + (-1)
                com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            L31:
                if (r2 >= r1) goto L44
                if (r2 == r3) goto L41
                if (r2 >= r3) goto L39
                r4 = r2
                goto L3b
            L39:
                int r4 = r2 + (-1)
            L3b:
                com.google.android.exoplayer2.metadata.Metadata$Entry r5 = r8.get(r2)
                r0[r4] = r5
            L41:
                int r2 = r2 + 1
                goto L31
            L44:
                com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
                r8.<init>(r0)
                return r8
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue
        public com.google.android.exoplayer2.Format getAdjustedUpstreamFormat(com.google.android.exoplayer2.Format r4) {
                r3 = this;
                com.google.android.exoplayer2.drm.DrmInitData r0 = r3.drmInitData
                if (r0 == 0) goto L5
                goto L7
            L5:
                com.google.android.exoplayer2.drm.DrmInitData r0 = r4.drmInitData
            L7:
                if (r0 == 0) goto L16
                java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r1 = r3.overridingDrmInitData
                java.lang.String r2 = r0.schemeType
                java.lang.Object r1 = r1.get(r2)
                com.google.android.exoplayer2.drm.DrmInitData r1 = (com.google.android.exoplayer2.drm.DrmInitData) r1
                if (r1 == 0) goto L16
                r0 = r1
            L16:
                com.google.android.exoplayer2.metadata.Metadata r1 = r4.metadata
                com.google.android.exoplayer2.metadata.Metadata r1 = r3.getAdjustedMetadata(r1)
                com.google.android.exoplayer2.drm.DrmInitData r2 = r4.drmInitData
                if (r0 != r2) goto L24
                com.google.android.exoplayer2.metadata.Metadata r2 = r4.metadata
                if (r1 == r2) goto L34
            L24:
                com.google.android.exoplayer2.Format$Builder r4 = r4.buildUpon()
                com.google.android.exoplayer2.Format$Builder r4 = r4.setDrmInitData(r0)
                com.google.android.exoplayer2.Format$Builder r4 = r4.setMetadata(r1)
                com.google.android.exoplayer2.Format r4 = r4.build()
            L34:
                com.google.android.exoplayer2.Format r4 = super.getAdjustedUpstreamFormat(r4)
                return r4
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue, com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long r1, int r3, int r4, int r5, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r6) {
                r0 = this;
                super.sampleMetadata(r1, r3, r4, r5, r6)
                return
        }

        public void setDrmInitData(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r1) {
                r0 = this;
                r0.drmInitData = r1
                r0.invalidateUpstreamFormatAdjustment()
                return
        }

        public void setSourceChunk(com.google.android.exoplayer2.source.hls.HlsMediaChunk r1) {
                r0 = this;
                int r1 = r1.uid
                r0.sourceId(r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$6vTR3mtGTvT72nPYfSpGJ3S1EYI(com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0) {
            r0.onTracksEnded()
            return
    }

    public static /* synthetic */ void $r8$lambda$FTpP0pC43I2Fmbrry86yPSv4RFI(com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0) {
            r0.maybeFinishPrepare()
            return
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 3
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r3
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r2] = r4
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.MAPPABLE_TYPES = r0
            return
    }

    public HlsSampleStreamWrapper(java.lang.String r1, int r2, com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback r3, com.google.android.exoplayer2.source.hls.HlsChunkSource r4, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r5, com.google.android.exoplayer2.upstream.Allocator r6, long r7, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r9, com.google.android.exoplayer2.drm.DrmSessionManager r10, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r11, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r12, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r13, int r14) {
            r0 = this;
            r0.<init>()
            r0.uid = r1
            r0.trackType = r2
            r0.callback = r3
            r0.chunkSource = r4
            r0.overridingDrmInitData = r5
            r0.allocator = r6
            r0.muxedAudioFormat = r9
            r0.drmSessionManager = r10
            r0.drmEventDispatcher = r11
            r0.loadErrorHandlingPolicy = r12
            r0.mediaSourceEventDispatcher = r13
            r0.metadataType = r14
            com.google.android.exoplayer2.upstream.Loader r1 = new com.google.android.exoplayer2.upstream.Loader
            java.lang.String r2 = "Loader:HlsSampleStreamWrapper"
            r1.<init>(r2)
            r0.loader = r1
            com.google.android.exoplayer2.source.hls.HlsChunkSource$HlsChunkHolder r1 = new com.google.android.exoplayer2.source.hls.HlsChunkSource$HlsChunkHolder
            r1.<init>()
            r0.nextChunkHolder = r1
            r1 = 0
            int[] r2 = new int[r1]
            r0.sampleQueueTrackIds = r2
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set<java.lang.Integer> r3 = com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.MAPPABLE_TYPES
            int r4 = r3.size()
            r2.<init>(r4)
            r0.sampleQueueMappingDoneByType = r2
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            int r3 = r3.size()
            r2.<init>(r3)
            r0.sampleQueueIndicesByType = r2
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.HlsSampleQueue[r1]
            r0.sampleQueues = r2
            boolean[] r2 = new boolean[r1]
            r0.sampleQueueIsAudioVideoFlags = r2
            boolean[] r2 = new boolean[r1]
            r0.sampleQueuesEnabledStates = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mediaChunks = r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r0.readOnlyMediaChunks = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.hlsSampleStreams = r2
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda0
            r2.<init>(r0, r1)
            r0.maybeFinishPrepareRunnable = r2
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda0
            r2 = 1
            r1.<init>(r0, r2)
            r0.onTracksEndedRunnable = r1
            android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
            r0.handler = r1
            r0.lastSeekPositionUs = r7
            r0.pendingResetPositionUs = r7
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void assertIsPrepared() {
            r1 = this;
            boolean r0 = r1.prepared
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.trackGroups
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.util.Set<com.google.android.exoplayer2.source.TrackGroup> r0 = r1.optionalTrackGroups
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void buildTracksFromSampleStreams() {
            r15 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r15.sampleQueues
            int r0 = r0.length
            r1 = -2
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -2
            r6 = -1
        L9:
            r7 = 2
            r8 = 1
            if (r4 >= r0) goto L4a
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r9 = r15.sampleQueues
            r9 = r9[r4]
            com.google.android.exoplayer2.Format r9 = r9.getUpstreamFormat()
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r9)
            com.google.android.exoplayer2.Format r9 = (com.google.android.exoplayer2.Format) r9
            java.lang.String r9 = r9.sampleMimeType
            boolean r10 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r9)
            if (r10 == 0) goto L24
            goto L35
        L24:
            boolean r7 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r9)
            if (r7 == 0) goto L2c
            r7 = 1
            goto L35
        L2c:
            boolean r7 = com.google.android.exoplayer2.util.MimeTypes.isText(r9)
            if (r7 == 0) goto L34
            r7 = 3
            goto L35
        L34:
            r7 = -2
        L35:
            int r8 = getTrackTypeScore(r7)
            int r9 = getTrackTypeScore(r5)
            if (r8 <= r9) goto L42
            r6 = r4
            r5 = r7
            goto L47
        L42:
            if (r7 != r5) goto L47
            if (r6 == r2) goto L47
            r6 = -1
        L47:
            int r4 = r4 + 1
            goto L9
        L4a:
            com.google.android.exoplayer2.source.hls.HlsChunkSource r1 = r15.chunkSource
            com.google.android.exoplayer2.source.TrackGroup r1 = r1.getTrackGroup()
            int r4 = r1.length
            r15.primaryTrackGroupIndex = r2
            int[] r2 = new int[r0]
            r15.trackGroupToSampleQueueIndex = r2
            r2 = 0
        L59:
            if (r2 >= r0) goto L62
            int[] r9 = r15.trackGroupToSampleQueueIndex
            r9[r2] = r2
            int r2 = r2 + 1
            goto L59
        L62:
            com.google.android.exoplayer2.source.TrackGroup[] r2 = new com.google.android.exoplayer2.source.TrackGroup[r0]
            r9 = 0
        L65:
            if (r9 >= r0) goto Le2
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r10 = r15.sampleQueues
            r10 = r10[r9]
            com.google.android.exoplayer2.Format r10 = r10.getUpstreamFormat()
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r10)
            com.google.android.exoplayer2.Format r10 = (com.google.android.exoplayer2.Format) r10
            if (r9 != r6) goto La6
            com.google.android.exoplayer2.Format[] r11 = new com.google.android.exoplayer2.Format[r4]
            r12 = 0
        L7a:
            if (r12 >= r4) goto L9a
            com.google.android.exoplayer2.Format r13 = r1.getFormat(r12)
            if (r5 != r8) goto L8a
            com.google.android.exoplayer2.Format r14 = r15.muxedAudioFormat
            if (r14 == 0) goto L8a
            com.google.android.exoplayer2.Format r13 = r13.withManifestFormatInfo(r14)
        L8a:
            if (r4 != r8) goto L91
            com.google.android.exoplayer2.Format r13 = r10.withManifestFormatInfo(r13)
            goto L95
        L91:
            com.google.android.exoplayer2.Format r13 = deriveFormat(r13, r10, r8)
        L95:
            r11[r12] = r13
            int r12 = r12 + 1
            goto L7a
        L9a:
            com.google.android.exoplayer2.source.TrackGroup r10 = new com.google.android.exoplayer2.source.TrackGroup
            java.lang.String r12 = r15.uid
            r10.<init>(r12, r11)
            r2[r9] = r10
            r15.primaryTrackGroupIndex = r9
            goto Ldf
        La6:
            if (r5 != r7) goto Lb3
            java.lang.String r11 = r10.sampleMimeType
            boolean r11 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r11)
            if (r11 == 0) goto Lb3
            com.google.android.exoplayer2.Format r11 = r15.muxedAudioFormat
            goto Lb4
        Lb3:
            r11 = 0
        Lb4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r15.uid
            r12.append(r13)
            java.lang.String r13 = ":muxed:"
            r12.append(r13)
            if (r9 >= r6) goto Lc7
            r13 = r9
            goto Lc9
        Lc7:
            int r13 = r9 + (-1)
        Lc9:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.google.android.exoplayer2.source.TrackGroup r13 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r14 = new com.google.android.exoplayer2.Format[r8]
            com.google.android.exoplayer2.Format r10 = deriveFormat(r11, r10, r3)
            r14[r3] = r10
            r13.<init>(r12, r14)
            r2[r9] = r13
        Ldf:
            int r9 = r9 + 1
            goto L65
        Le2:
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r15.createTrackGroupArrayWithDrmInfo(r2)
            r15.trackGroups = r0
            java.util.Set<com.google.android.exoplayer2.source.TrackGroup> r0 = r15.optionalTrackGroups
            if (r0 != 0) goto Led
            r3 = 1
        Led:
            com.google.android.exoplayer2.util.Assertions.checkState(r3)
            java.util.Set r0 = java.util.Collections.emptySet()
            r15.optionalTrackGroups = r0
            return
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int r5) {
            r4 = this;
            r0 = r5
        L1:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r4.mediaChunks
            int r1 = r1.size()
            r2 = 0
            if (r0 >= r1) goto L1a
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r4.mediaChunks
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r1 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r1
            boolean r1 = r1.shouldSpliceIn
            if (r1 == 0) goto L17
            return r2
        L17:
            int r0 = r0 + 1
            goto L1
        L1a:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r4.mediaChunks
            java.lang.Object r5 = r0.get(r5)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r5 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r5
            r0 = 0
        L23:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r1 = r4.sampleQueues
            int r1 = r1.length
            if (r0 >= r1) goto L3a
            int r1 = r5.getFirstSampleIndex(r0)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r3 = r4.sampleQueues
            r3 = r3[r0]
            int r3 = r3.getReadIndex()
            if (r3 <= r1) goto L37
            return r2
        L37:
            int r0 = r0 + 1
            goto L23
        L3a:
            r5 = 1
            return r5
    }

    private static com.google.android.exoplayer2.extractor.DummyTrackOutput createFakeTrackOutput(int r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unmapped track with id "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " of type "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "HlsSampleStreamWrapper"
            com.google.android.exoplayer2.util.Log.w(r3, r2)
            com.google.android.exoplayer2.extractor.DummyTrackOutput r2 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
            r2.<init>()
            return r2
    }

    private com.google.android.exoplayer2.source.SampleQueue createSampleQueue(int r10, int r11) {
            r9 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r9.sampleQueues
            int r0 = r0.length
            r1 = 1
            if (r11 == r1) goto Lb
            r2 = 2
            if (r11 != r2) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue r8 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue
            com.google.android.exoplayer2.upstream.Allocator r3 = r9.allocator
            com.google.android.exoplayer2.drm.DrmSessionManager r4 = r9.drmSessionManager
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r5 = r9.drmEventDispatcher
            java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r6 = r9.overridingDrmInitData
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            long r2 = r9.lastSeekPositionUs
            r8.setStartTimeUs(r2)
            if (r1 == 0) goto L26
            com.google.android.exoplayer2.drm.DrmInitData r2 = r9.drmInitData
            r8.setDrmInitData(r2)
        L26:
            long r2 = r9.sampleOffsetUs
            r8.setSampleOffsetUs(r2)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = r9.sourceChunk
            if (r2 == 0) goto L32
            r8.setSourceChunk(r2)
        L32:
            r8.setUpstreamFormatChangeListener(r9)
            int[] r2 = r9.sampleQueueTrackIds
            int r3 = r0 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r3)
            r9.sampleQueueTrackIds = r2
            r2[r0] = r10
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r10 = r9.sampleQueues
            java.lang.Object[] r10 = com.google.android.exoplayer2.util.Util.nullSafeArrayAppend(r10, r8)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r10 = (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.HlsSampleQueue[]) r10
            r9.sampleQueues = r10
            boolean[] r10 = r9.sampleQueueIsAudioVideoFlags
            boolean[] r10 = java.util.Arrays.copyOf(r10, r3)
            r9.sampleQueueIsAudioVideoFlags = r10
            r10[r0] = r1
            boolean r1 = r9.haveAudioVideoSampleQueues
            boolean r10 = r10[r0]
            r10 = r10 | r1
            r9.haveAudioVideoSampleQueues = r10
            java.util.Set<java.lang.Integer> r10 = r9.sampleQueueMappingDoneByType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r10.add(r1)
            android.util.SparseIntArray r10 = r9.sampleQueueIndicesByType
            r10.append(r11, r0)
            int r10 = getTrackTypeScore(r11)
            int r1 = r9.primarySampleQueueType
            int r1 = getTrackTypeScore(r1)
            if (r10 <= r1) goto L7a
            r9.primarySampleQueueIndex = r0
            r9.primarySampleQueueType = r11
        L7a:
            boolean[] r10 = r9.sampleQueuesEnabledStates
            boolean[] r10 = java.util.Arrays.copyOf(r10, r3)
            r9.sampleQueuesEnabledStates = r10
            return r8
    }

    private com.google.android.exoplayer2.source.TrackGroupArray createTrackGroupArrayWithDrmInfo(com.google.android.exoplayer2.source.TrackGroup[] r8) {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.length
            if (r1 >= r2) goto L2f
            r2 = r8[r1]
            int r3 = r2.length
            com.google.android.exoplayer2.Format[] r3 = new com.google.android.exoplayer2.Format[r3]
            r4 = 0
        Lc:
            int r5 = r2.length
            if (r4 >= r5) goto L23
            com.google.android.exoplayer2.Format r5 = r2.getFormat(r4)
            com.google.android.exoplayer2.drm.DrmSessionManager r6 = r7.drmSessionManager
            int r6 = r6.getCryptoType(r5)
            com.google.android.exoplayer2.Format r5 = r5.copyWithCryptoType(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto Lc
        L23:
            com.google.android.exoplayer2.source.TrackGroup r4 = new com.google.android.exoplayer2.source.TrackGroup
            java.lang.String r2 = r2.id
            r4.<init>(r2, r3)
            r8[r1] = r4
            int r1 = r1 + 1
            goto L2
        L2f:
            com.google.android.exoplayer2.source.TrackGroupArray r0 = new com.google.android.exoplayer2.source.TrackGroupArray
            r0.<init>(r8)
            return r0
    }

    private static com.google.android.exoplayer2.Format deriveFormat(@androidx.annotation.Nullable com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.Format r8, boolean r9) {
            if (r7 != 0) goto L3
            return r8
        L3:
            java.lang.String r0 = r8.sampleMimeType
            int r0 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r0)
            java.lang.String r1 = r7.codecs
            int r1 = com.google.android.exoplayer2.util.Util.getCodecCountOfType(r1, r0)
            r2 = 1
            if (r1 != r2) goto L1d
            java.lang.String r1 = r7.codecs
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r1, r0)
            java.lang.String r3 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r1)
            goto L27
        L1d:
            java.lang.String r1 = r7.codecs
            java.lang.String r3 = r8.sampleMimeType
            java.lang.String r1 = com.google.android.exoplayer2.util.MimeTypes.getCodecsCorrespondingToMimeType(r1, r3)
            java.lang.String r3 = r8.sampleMimeType
        L27:
            com.google.android.exoplayer2.Format$Builder r4 = r8.buildUpon()
            java.lang.String r5 = r7.id
            com.google.android.exoplayer2.Format$Builder r4 = r4.setId(r5)
            java.lang.String r5 = r7.label
            com.google.android.exoplayer2.Format$Builder r4 = r4.setLabel(r5)
            java.lang.String r5 = r7.language
            com.google.android.exoplayer2.Format$Builder r4 = r4.setLanguage(r5)
            int r5 = r7.selectionFlags
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSelectionFlags(r5)
            int r5 = r7.roleFlags
            com.google.android.exoplayer2.Format$Builder r4 = r4.setRoleFlags(r5)
            r5 = -1
            if (r9 == 0) goto L4f
            int r6 = r7.averageBitrate
            goto L50
        L4f:
            r6 = -1
        L50:
            com.google.android.exoplayer2.Format$Builder r4 = r4.setAverageBitrate(r6)
            if (r9 == 0) goto L59
            int r9 = r7.peakBitrate
            goto L5a
        L59:
            r9 = -1
        L5a:
            com.google.android.exoplayer2.Format$Builder r9 = r4.setPeakBitrate(r9)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setCodecs(r1)
            r1 = 2
            if (r0 != r1) goto L76
            int r1 = r7.width
            com.google.android.exoplayer2.Format$Builder r1 = r9.setWidth(r1)
            int r4 = r7.height
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r4)
            float r4 = r7.frameRate
            r1.setFrameRate(r4)
        L76:
            if (r3 == 0) goto L7b
            r9.setSampleMimeType(r3)
        L7b:
            int r1 = r7.channelCount
            if (r1 == r5) goto L84
            if (r0 != r2) goto L84
            r9.setChannelCount(r1)
        L84:
            com.google.android.exoplayer2.metadata.Metadata r7 = r7.metadata
            if (r7 == 0) goto L93
            com.google.android.exoplayer2.metadata.Metadata r8 = r8.metadata
            if (r8 == 0) goto L90
            com.google.android.exoplayer2.metadata.Metadata r7 = r8.copyWithAppendedEntriesFrom(r7)
        L90:
            r9.setMetadata(r7)
        L93:
            com.google.android.exoplayer2.Format r7 = r9.build()
            return r7
    }

    private void discardUpstream(int r8) {
            r7 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r7.loader
            boolean r0 = r0.isLoading()
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
        Lb:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r7.mediaChunks
            int r0 = r0.size()
            r1 = -1
            if (r8 >= r0) goto L1e
            boolean r0 = r7.canDiscardUpstreamMediaChunksFromIndex(r8)
            if (r0 == 0) goto L1b
            goto L1f
        L1b:
            int r8 = r8 + 1
            goto Lb
        L1e:
            r8 = -1
        L1f:
            if (r8 != r1) goto L22
            return
        L22:
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = r7.getLastMediaChunk()
            long r5 = r0.endTimeUs
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r8 = r7.discardUpstreamMediaChunksFromIndex(r8)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r7.mediaChunks
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L39
            long r0 = r7.lastSeekPositionUs
            r7.pendingResetPositionUs = r0
            goto L44
        L39:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r7.mediaChunks
            java.lang.Object r0 = com.google.common.collect.Iterables.getLast(r0)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            r0.invalidateExtractor()
        L44:
            r0 = 0
            r7.loadingFinished = r0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r7.mediaSourceEventDispatcher
            int r2 = r7.primarySampleQueueType
            long r3 = r8.startTimeUs
            r1.upstreamDiscarded(r2, r3, r5)
            return
    }

    private com.google.android.exoplayer2.source.hls.HlsMediaChunk discardUpstreamMediaChunksFromIndex(int r4) {
            r3 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r3.mediaChunks
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r3.mediaChunks
            int r2 = r1.size()
            com.google.android.exoplayer2.util.Util.removeRange(r1, r4, r2)
            r4 = 0
        L12:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r1 = r3.sampleQueues
            int r1 = r1.length
            if (r4 >= r1) goto L25
            int r1 = r0.getFirstSampleIndex(r4)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = r3.sampleQueues
            r2 = r2[r4]
            r2.discardUpstreamSamples(r1)
            int r4 = r4 + 1
            goto L12
        L25:
            return r0
    }

    private boolean finishedReadingChunk(com.google.android.exoplayer2.source.hls.HlsMediaChunk r5) {
            r4 = this;
            int r5 = r5.uid
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r4.sampleQueues
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L1d
            boolean[] r3 = r4.sampleQueuesEnabledStates
            boolean r3 = r3[r2]
            if (r3 == 0) goto L1a
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r3 = r4.sampleQueues
            r3 = r3[r2]
            int r3 = r3.peekSourceId()
            if (r3 != r5) goto L1a
            return r1
        L1a:
            int r2 = r2 + 1
            goto L7
        L1d:
            r5 = 1
            return r5
    }

    private static boolean formatsMatch(com.google.android.exoplayer2.Format r6, com.google.android.exoplayer2.Format r7) {
            java.lang.String r0 = r6.sampleMimeType
            java.lang.String r1 = r7.sampleMimeType
            int r2 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r0)
            r3 = 1
            r4 = 0
            r5 = 3
            if (r2 == r5) goto L16
            int r6 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r1)
            if (r2 != r6) goto L14
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
        L16:
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
            if (r1 != 0) goto L1d
            return r4
        L1d:
            java.lang.String r1 = "application/cea-608"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2f
            java.lang.String r1 = "application/cea-708"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2e
            goto L2f
        L2e:
            return r3
        L2f:
            int r6 = r6.accessibilityChannel
            int r7 = r7.accessibilityChannel
            if (r6 != r7) goto L36
            goto L37
        L36:
            r3 = 0
        L37:
            return r3
    }

    private com.google.android.exoplayer2.source.hls.HlsMediaChunk getLastMediaChunk() {
            r2 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r2.mediaChunks
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            return r0
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.TrackOutput getMappedTrackOutput(int r4, int r5) {
            r3 = this;
            java.util.Set<java.lang.Integer> r0 = com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.MAPPABLE_TYPES
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.contains(r1)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            android.util.SparseIntArray r0 = r3.sampleQueueIndicesByType
            r1 = -1
            int r0 = r0.get(r5, r1)
            if (r0 != r1) goto L18
            r4 = 0
            return r4
        L18:
            java.util.Set<java.lang.Integer> r1 = r3.sampleQueueMappingDoneByType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.add(r2)
            if (r1 == 0) goto L28
            int[] r1 = r3.sampleQueueTrackIds
            r1[r0] = r4
        L28:
            int[] r1 = r3.sampleQueueTrackIds
            r1 = r1[r0]
            if (r1 != r4) goto L33
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r4 = r3.sampleQueues
            r4 = r4[r0]
            goto L37
        L33:
            com.google.android.exoplayer2.extractor.DummyTrackOutput r4 = createFakeTrackOutput(r4, r5)
        L37:
            return r4
    }

    private static int getTrackTypeScore(int r3) {
            r0 = 2
            r1 = 1
            if (r3 == r1) goto Ld
            r2 = 3
            if (r3 == r0) goto Lc
            if (r3 == r2) goto Lb
            r3 = 0
            return r3
        Lb:
            return r1
        Lc:
            return r2
        Ld:
            return r0
    }

    private void initMediaChunkLoad(com.google.android.exoplayer2.source.hls.HlsMediaChunk r7) {
            r6 = this;
            r6.sourceChunk = r7
            com.google.android.exoplayer2.Format r0 = r7.trackFormat
            r6.upstreamTrackFormat = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.pendingResetPositionUs = r0
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r6.mediaChunks
            r0.add(r7)
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r1 = r6.sampleQueues
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L1b:
            if (r4 >= r2) goto L2d
            r5 = r1[r4]
            int r5 = r5.getWriteIndex()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L1b
        L2d:
            com.google.common.collect.ImmutableList r0 = r0.build()
            r7.init(r6, r0)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r6.sampleQueues
            int r1 = r0.length
        L37:
            if (r3 >= r1) goto L48
            r2 = r0[r3]
            r2.setSourceChunk(r7)
            boolean r4 = r7.shouldSpliceIn
            if (r4 == 0) goto L45
            r2.splice()
        L45:
            int r3 = r3 + 1
            goto L37
        L48:
            return
    }

    private static boolean isMediaChunk(com.google.android.exoplayer2.source.chunk.Chunk r0) {
            boolean r0 = r0 instanceof com.google.android.exoplayer2.source.hls.HlsMediaChunk
            return r0
    }

    private boolean isPendingReset() {
            r5 = this;
            long r0 = r5.pendingResetPositionUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroups"})
    private void mapSampleQueuesToMatchTrackGroups() {
            r6 = this;
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r6.trackGroups
            int r0 = r0.length
            int[] r1 = new int[r0]
            r6.trackGroupToSampleQueueIndex = r1
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r1 = 0
            r2 = 0
        Le:
            if (r2 >= r0) goto L3d
            r3 = 0
        L11:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r4 = r6.sampleQueues
            int r5 = r4.length
            if (r3 >= r5) goto L3a
            r4 = r4[r3]
            com.google.android.exoplayer2.Format r4 = r4.getUpstreamFormat()
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r4)
            com.google.android.exoplayer2.Format r4 = (com.google.android.exoplayer2.Format) r4
            com.google.android.exoplayer2.source.TrackGroupArray r5 = r6.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r5 = r5.get(r2)
            com.google.android.exoplayer2.Format r5 = r5.getFormat(r1)
            boolean r4 = formatsMatch(r4, r5)
            if (r4 == 0) goto L37
            int[] r4 = r6.trackGroupToSampleQueueIndex
            r4[r2] = r3
            goto L3a
        L37:
            int r3 = r3 + 1
            goto L11
        L3a:
            int r2 = r2 + 1
            goto Le
        L3d:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsSampleStream> r0 = r6.hlsSampleStreams
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.hls.HlsSampleStream r1 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r1
            r1.bindSampleQueue()
            goto L43
        L53:
            return
    }

    private void maybeFinishPrepare() {
            r4 = this;
            boolean r0 = r4.released
            if (r0 != 0) goto L32
            int[] r0 = r4.trackGroupToSampleQueueIndex
            if (r0 != 0) goto L32
            boolean r0 = r4.sampleQueuesBuilt
            if (r0 != 0) goto Ld
            goto L32
        Ld:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r4.sampleQueues
            int r1 = r0.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            com.google.android.exoplayer2.Format r3 = r3.getUpstreamFormat()
            if (r3 != 0) goto L1c
            return
        L1c:
            int r2 = r2 + 1
            goto L11
        L1f:
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r4.trackGroups
            if (r0 == 0) goto L27
            r4.mapSampleQueuesToMatchTrackGroups()
            goto L32
        L27:
            r4.buildTracksFromSampleStreams()
            r4.setIsPrepared()
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r0 = r4.callback
            r0.onPrepared()
        L32:
            return
    }

    private void onTracksEnded() {
            r1 = this;
            r0 = 1
            r1.sampleQueuesBuilt = r0
            r1.maybeFinishPrepare()
            return
    }

    private void resetSampleQueues() {
            r6 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r6.sampleQueues
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L11
            r4 = r0[r3]
            boolean r5 = r6.pendingResetUpstreamFormats
            r4.reset(r5)
            int r3 = r3 + 1
            goto L5
        L11:
            r6.pendingResetUpstreamFormats = r2
            return
    }

    private boolean seekInsideBufferUs(long r5) {
            r4 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r4.sampleQueues
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L1f
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r3 = r4.sampleQueues
            r3 = r3[r2]
            boolean r3 = r3.seekTo(r5, r1)
            if (r3 != 0) goto L1c
            boolean[] r3 = r4.sampleQueueIsAudioVideoFlags
            boolean r3 = r3[r2]
            if (r3 != 0) goto L1b
            boolean r3 = r4.haveAudioVideoSampleQueues
            if (r3 != 0) goto L1c
        L1b:
            return r1
        L1c:
            int r2 = r2 + 1
            goto L5
        L1f:
            r5 = 1
            return r5
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void setIsPrepared() {
            r1 = this;
            r0 = 1
            r1.prepared = r0
            return
    }

    private void updateSampleStreams(com.google.android.exoplayer2.source.SampleStream[] r5) {
            r4 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsSampleStream> r0 = r4.hlsSampleStreams
            r0.clear()
            int r0 = r5.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            r2 = r5[r1]
            if (r2 == 0) goto L14
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsSampleStream> r3 = r4.hlsSampleStreams
            com.google.android.exoplayer2.source.hls.HlsSampleStream r2 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r2
            r3.add(r2)
        L14:
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    public int bindSampleQueueToSampleStream(int r4) {
            r3 = this;
            r3.assertIsPrepared()
            int[] r0 = r3.trackGroupToSampleQueueIndex
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            int[] r0 = r3.trackGroupToSampleQueueIndex
            r0 = r0[r4]
            r1 = -2
            r2 = -1
            if (r0 != r2) goto L20
            java.util.Set<com.google.android.exoplayer2.source.TrackGroup> r0 = r3.optionalTrackGroups
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r3.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r4 = r2.get(r4)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L1f
            r1 = -3
        L1f:
            return r1
        L20:
            boolean[] r4 = r3.sampleQueuesEnabledStates
            boolean r2 = r4[r0]
            if (r2 == 0) goto L27
            return r1
        L27:
            r1 = 1
            r4[r0] = r1
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r24) {
            r23 = this;
            r0 = r23
            boolean r1 = r0.loadingFinished
            r2 = 0
            if (r1 != 0) goto Lcd
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.isLoading()
            if (r1 != 0) goto Lcd
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.hasFatalError()
            if (r1 == 0) goto L19
            goto Lcd
        L19:
            boolean r1 = r23.isPendingReset()
            if (r1 == 0) goto L35
            java.util.List r1 = java.util.Collections.emptyList()
            long r3 = r0.pendingResetPositionUs
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r5 = r0.sampleQueues
            int r6 = r5.length
            r7 = 0
        L29:
            if (r7 >= r6) goto L4c
            r8 = r5[r7]
            long r9 = r0.pendingResetPositionUs
            r8.setStartTimeUs(r9)
            int r7 = r7 + 1
            goto L29
        L35:
            java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r0.readOnlyMediaChunks
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r3 = r23.getLastMediaChunk()
            boolean r4 = r3.isLoadCompleted()
            if (r4 == 0) goto L44
            long r3 = r3.endTimeUs
            goto L4c
        L44:
            long r4 = r0.lastSeekPositionUs
            long r6 = r3.startTimeUs
            long r3 = java.lang.Math.max(r4, r6)
        L4c:
            r10 = r1
            r8 = r3
            com.google.android.exoplayer2.source.hls.HlsChunkSource$HlsChunkHolder r1 = r0.nextChunkHolder
            r1.clear()
            com.google.android.exoplayer2.source.hls.HlsChunkSource r5 = r0.chunkSource
            boolean r1 = r0.prepared
            r3 = 1
            if (r1 != 0) goto L63
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L61
            goto L63
        L61:
            r11 = 0
            goto L64
        L63:
            r11 = 1
        L64:
            com.google.android.exoplayer2.source.hls.HlsChunkSource$HlsChunkHolder r12 = r0.nextChunkHolder
            r6 = r24
            r5.getNextChunk(r6, r8, r10, r11, r12)
            com.google.android.exoplayer2.source.hls.HlsChunkSource$HlsChunkHolder r1 = r0.nextChunkHolder
            boolean r4 = r1.endOfStream
            com.google.android.exoplayer2.source.chunk.Chunk r5 = r1.chunk
            android.net.Uri r1 = r1.playlistUrl
            if (r4 == 0) goto L7f
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.pendingResetPositionUs = r1
            r0.loadingFinished = r3
            return r3
        L7f:
            if (r5 != 0) goto L89
            if (r1 == 0) goto L88
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r3 = r0.callback
            r3.onPlaylistRefreshRequired(r1)
        L88:
            return r2
        L89:
            boolean r1 = isMediaChunk(r5)
            if (r1 == 0) goto L95
            r1 = r5
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r1 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r1
            r0.initMediaChunkLoad(r1)
        L95:
            r0.loadingChunk = r5
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            int r4 = r5.type
            int r2 = r2.getMinimumLoadableRetryCount(r4)
            long r10 = r1.startLoading(r5, r0, r2)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r12 = r0.mediaSourceEventDispatcher
            com.google.android.exoplayer2.source.LoadEventInfo r13 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r7 = r5.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r9 = r5.dataSpec
            r6 = r13
            r6.<init>(r7, r9, r10)
            int r14 = r5.type
            int r15 = r0.trackType
            com.google.android.exoplayer2.Format r1 = r5.trackFormat
            int r2 = r5.trackSelectionReason
            java.lang.Object r4 = r5.trackSelectionData
            long r6 = r5.startTimeUs
            long r8 = r5.endTimeUs
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r6
            r21 = r8
            r12.loadStarted(r13, r14, r15, r16, r17, r18, r19, r21)
            return r3
        Lcd:
            return r2
    }

    public void continuePreparing() {
            r2 = this;
            boolean r0 = r2.prepared
            if (r0 != 0) goto L9
            long r0 = r2.lastSeekPositionUs
            r2.continueLoading(r0)
        L9:
            return
    }

    public void discardBuffer(long r5, boolean r7) {
            r4 = this;
            boolean r0 = r4.sampleQueuesBuilt
            if (r0 == 0) goto L1f
            boolean r0 = r4.isPendingReset()
            if (r0 == 0) goto Lb
            goto L1f
        Lb:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r4.sampleQueues
            int r0 = r0.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = r4.sampleQueues
            r2 = r2[r1]
            boolean[] r3 = r4.sampleQueuesEnabledStates
            boolean r3 = r3[r1]
            r2.discardTo(r5, r7, r3)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
            r2 = this;
            r0 = 1
            r2.tracksEnded = r0
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.onTracksEndedRunnable
            r0.post(r1)
            return
    }

    public long getAdjustedSeekPositionUs(long r2, com.google.android.exoplayer2.SeekParameters r4) {
            r1 = this;
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r1.chunkSource
            long r2 = r0.getAdjustedSeekPositionUs(r2, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r7 = this;
            boolean r0 = r7.loadingFinished
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.isPendingReset()
            if (r0 == 0) goto L10
            long r0 = r7.pendingResetPositionUs
            return r0
        L10:
            long r0 = r7.lastSeekPositionUs
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = r7.getLastMediaChunk()
            boolean r3 = r2.isLoadCompleted()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r7.mediaChunks
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r7.mediaChunks
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.endTimeUs
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.sampleQueuesBuilt
            if (r2 == 0) goto L55
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = r7.sampleQueues
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.getLargestQueuedTimestampUs()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
            r2 = this;
            boolean r0 = r2.isPendingReset()
            if (r0 == 0) goto L9
            long r0 = r2.pendingResetPositionUs
            return r0
        L9:
            boolean r0 = r2.loadingFinished
            if (r0 == 0) goto L10
            r0 = -9223372036854775808
            goto L16
        L10:
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = r2.getLastMediaChunk()
            long r0 = r0.endTimeUs
        L16:
            return r0
    }

    public int getPrimaryTrackGroupIndex() {
            r1 = this;
            int r0 = r1.primaryTrackGroupIndex
            return r0
    }

    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            r1 = this;
            r1.assertIsPrepared()
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.trackGroups
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            boolean r0 = r0.isLoading()
            return r0
    }

    public boolean isReady(int r2) {
            r1 = this;
            boolean r0 = r1.isPendingReset()
            if (r0 != 0) goto L14
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r1.sampleQueues
            r2 = r0[r2]
            boolean r0 = r1.loadingFinished
            boolean r2 = r2.isReady(r0)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public boolean isVideoSampleStream() {
            r2 = this;
            int r0 = r2.primarySampleQueueType
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public void maybeThrowError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            r0.maybeThrowError()
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r1.chunkSource
            r0.maybeThrowError()
            return
    }

    public void maybeThrowError(int r2) throws java.io.IOException {
            r1 = this;
            r1.maybeThrowError()
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r1.sampleQueues
            r2 = r0[r2]
            r2.maybeThrowError()
            return
    }

    public void maybeThrowPrepareError() throws java.io.IOException {
            r2 = this;
            r2.maybeThrowError()
            boolean r0 = r2.loadingFinished
            if (r0 == 0) goto L14
            boolean r0 = r2.prepared
            if (r0 == 0) goto Lc
            goto L14
        Lc:
            r0 = 0
            java.lang.String r1 = "Loading finished before preparation is complete."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r0)
            throw r0
        L14:
            return
    }

    public void onLoadCanceled(com.google.android.exoplayer2.source.chunk.Chunk r16, long r17, long r19, boolean r21) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 0
            r0.loadingChunk = r2
            com.google.android.exoplayer2.source.LoadEventInfo r2 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r4 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
            android.net.Uri r7 = r16.getUri()
            java.util.Map r8 = r16.getResponseHeaders()
            long r13 = r16.bytesLoaded()
            r3 = r2
            r9 = r17
            r11 = r19
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r0.loadErrorHandlingPolicy
            long r4 = r1.loadTaskId
            r3.onLoadTaskConcluded(r4)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r0.mediaSourceEventDispatcher
            int r5 = r1.type
            int r6 = r0.trackType
            com.google.android.exoplayer2.Format r7 = r1.trackFormat
            int r8 = r1.trackSelectionReason
            java.lang.Object r9 = r1.trackSelectionData
            long r10 = r1.startTimeUs
            long r12 = r1.endTimeUs
            r4 = r2
            r3.loadCanceled(r4, r5, r6, r7, r8, r9, r10, r12)
            if (r21 != 0) goto L53
            boolean r1 = r15.isPendingReset()
            if (r1 != 0) goto L47
            int r1 = r0.enabledTrackGroupCount
            if (r1 != 0) goto L4a
        L47:
            r15.resetSampleQueues()
        L4a:
            int r1 = r0.enabledTrackGroupCount
            if (r1 <= 0) goto L53
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r1 = r0.callback
            r1.onContinueLoadingRequested(r15)
        L53:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
            r0 = this;
            com.google.android.exoplayer2.source.chunk.Chunk r1 = (com.google.android.exoplayer2.source.chunk.Chunk) r1
            r0.onLoadCanceled(r1, r2, r4, r6)
            return
    }

    public void onLoadCompleted(com.google.android.exoplayer2.source.chunk.Chunk r16, long r17, long r19) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 0
            r0.loadingChunk = r2
            com.google.android.exoplayer2.source.hls.HlsChunkSource r2 = r0.chunkSource
            r2.onChunkLoadCompleted(r1)
            com.google.android.exoplayer2.source.LoadEventInfo r2 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r4 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
            android.net.Uri r7 = r16.getUri()
            java.util.Map r8 = r16.getResponseHeaders()
            long r13 = r16.bytesLoaded()
            r3 = r2
            r9 = r17
            r11 = r19
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r0.loadErrorHandlingPolicy
            long r4 = r1.loadTaskId
            r3.onLoadTaskConcluded(r4)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r0.mediaSourceEventDispatcher
            int r5 = r1.type
            int r6 = r0.trackType
            com.google.android.exoplayer2.Format r7 = r1.trackFormat
            int r8 = r1.trackSelectionReason
            java.lang.Object r9 = r1.trackSelectionData
            long r10 = r1.startTimeUs
            long r12 = r1.endTimeUs
            r4 = r2
            r3.loadCompleted(r4, r5, r6, r7, r8, r9, r10, r12)
            boolean r1 = r0.prepared
            if (r1 != 0) goto L4a
            long r1 = r0.lastSeekPositionUs
            r15.continueLoading(r1)
            goto L4f
        L4a:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r1 = r0.callback
            r1.onContinueLoadingRequested(r15)
        L4f:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
            r0 = this;
            com.google.android.exoplayer2.source.chunk.Chunk r1 = (com.google.android.exoplayer2.source.chunk.Chunk) r1
            r0.onLoadCompleted(r1, r2, r4)
            return
    }

    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.source.chunk.Chunk r31, long r32, long r34, java.io.IOException r36, int r37) {
            r30 = this;
            r0 = r30
            r1 = r31
            r13 = r36
            boolean r2 = isMediaChunk(r31)
            if (r2 == 0) goto L29
            r3 = r1
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r3 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r3
            boolean r3 = r3.isPublished()
            if (r3 != 0) goto L29
            boolean r3 = r13 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            if (r3 == 0) goto L29
            r3 = r13
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r3 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r3
            int r3 = r3.responseCode
            r4 = 410(0x19a, float:5.75E-43)
            if (r3 == r4) goto L26
            r4 = 404(0x194, float:5.66E-43)
            if (r3 != r4) goto L29
        L26:
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.RETRY
            return r1
        L29:
            long r3 = r31.bytesLoaded()
            com.google.android.exoplayer2.source.LoadEventInfo r5 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r6 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r8 = r1.dataSpec
            android.net.Uri r18 = r31.getUri()
            java.util.Map r19 = r31.getResponseHeaders()
            r14 = r5
            r15 = r6
            r17 = r8
            r20 = r32
            r22 = r34
            r24 = r3
            r14.<init>(r15, r17, r18, r19, r20, r22, r24)
            com.google.android.exoplayer2.source.MediaLoadData r6 = new com.google.android.exoplayer2.source.MediaLoadData
            int r7 = r1.type
            int r8 = r0.trackType
            com.google.android.exoplayer2.Format r9 = r1.trackFormat
            int r10 = r1.trackSelectionReason
            java.lang.Object r11 = r1.trackSelectionData
            long r14 = r1.startTimeUs
            long r26 = com.google.android.exoplayer2.util.Util.usToMs(r14)
            long r14 = r1.endTimeUs
            long r28 = com.google.android.exoplayer2.util.Util.usToMs(r14)
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r28)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r7 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
            r8 = r37
            r7.<init>(r5, r6, r13, r8)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6 = r0.loadErrorHandlingPolicy
            com.google.android.exoplayer2.source.hls.HlsChunkSource r8 = r0.chunkSource
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r8 = r8.getTrackSelection()
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions r8 = com.google.android.exoplayer2.trackselection.TrackSelectionUtil.createFallbackOptions(r8)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection r6 = r6.getFallbackSelectionFor(r8, r7)
            r8 = 0
            if (r6 == 0) goto L98
            int r9 = r6.type
            r10 = 2
            if (r9 != r10) goto L98
            com.google.android.exoplayer2.source.hls.HlsChunkSource r9 = r0.chunkSource
            long r10 = r6.exclusionDurationMs
            boolean r6 = r9.maybeExcludeTrack(r1, r10)
            r15 = r6
            goto L99
        L98:
            r15 = 0
        L99:
            r6 = 1
            if (r15 == 0) goto Ld4
            if (r2 == 0) goto Lcf
            r9 = 0
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 != 0) goto Lcf
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r0.mediaChunks
            int r3 = r2.size()
            int r3 = r3 - r6
            java.lang.Object r2 = r2.remove(r3)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r2
            if (r2 != r1) goto Lb4
            r8 = 1
        Lb4:
            com.google.android.exoplayer2.util.Assertions.checkState(r8)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r0.mediaChunks
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lc4
            long r2 = r0.lastSeekPositionUs
            r0.pendingResetPositionUs = r2
            goto Lcf
        Lc4:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r0.mediaChunks
            java.lang.Object r2 = com.google.common.collect.Iterables.getLast(r2)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r2
            r2.invalidateExtractor()
        Lcf:
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
        Ld1:
            r16 = r2
            goto Leb
        Ld4:
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r2 = r2.getRetryDelayMsFor(r7)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto Le8
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.createRetryAction(r8, r2)
            goto Ld1
        Le8:
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL
            goto Ld1
        Leb:
            boolean r2 = r16.isRetry()
            r17 = r2 ^ 1
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = r0.mediaSourceEventDispatcher
            int r4 = r1.type
            int r6 = r0.trackType
            com.google.android.exoplayer2.Format r7 = r1.trackFormat
            int r8 = r1.trackSelectionReason
            java.lang.Object r9 = r1.trackSelectionData
            long r10 = r1.startTimeUs
            long r12 = r1.endTimeUs
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r11 = r12
            r13 = r36
            r14 = r17
            r2.loadError(r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
            if (r17 == 0) goto L11b
            r2 = 0
            r0.loadingChunk = r2
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = r1.loadTaskId
            r2.onLoadTaskConcluded(r3)
        L11b:
            if (r15 == 0) goto L12c
            boolean r1 = r0.prepared
            if (r1 != 0) goto L127
            long r1 = r0.lastSeekPositionUs
            r0.continueLoading(r1)
            goto L12c
        L127:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r1 = r0.callback
            r1.onContinueLoadingRequested(r0)
        L12c:
            return r16
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
            r0 = this;
            com.google.android.exoplayer2.source.chunk.Chunk r1 = (com.google.android.exoplayer2.source.chunk.Chunk) r1
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = r0.onLoadError(r1, r2, r4, r6, r7)
            return r1
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
            r4 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r4.sampleQueues
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.release()
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    public void onNewExtractor() {
            r1 = this;
            java.util.Set<java.lang.Integer> r0 = r1.sampleQueueMappingDoneByType
            r0.clear()
            return
    }

    public boolean onPlaylistError(android.net.Uri r5, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r6, boolean r7) {
            r4 = this;
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r4.chunkSource
            boolean r0 = r0.obtainsChunksForPlaylist(r5)
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L2b
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7 = r4.loadErrorHandlingPolicy
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r4.chunkSource
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r0 = r0.getTrackSelection()
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions r0 = com.google.android.exoplayer2.trackselection.TrackSelectionUtil.createFallbackOptions(r0)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection r6 = r7.getFallbackSelectionFor(r0, r6)
            if (r6 == 0) goto L2b
            int r7 = r6.type
            r0 = 2
            if (r7 != r0) goto L2b
            long r6 = r6.exclusionDurationMs
            goto L2c
        L2b:
            r6 = r2
        L2c:
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r4.chunkSource
            boolean r5 = r0.onPlaylistError(r5, r6)
            if (r5 == 0) goto L39
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 == 0) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            return r1
    }

    public void onPlaylistUpdated() {
            r3 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r3.mediaChunks
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r3.mediaChunks
            java.lang.Object r0 = com.google.common.collect.Iterables.getLast(r0)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            com.google.android.exoplayer2.source.hls.HlsChunkSource r1 = r3.chunkSource
            int r1 = r1.getChunkPublicationState(r0)
            r2 = 1
            if (r1 != r2) goto L1e
            r0.publish()
            goto L32
        L1e:
            r0 = 2
            if (r1 != r0) goto L32
            boolean r0 = r3.loadingFinished
            if (r0 != 0) goto L32
            com.google.android.exoplayer2.upstream.Loader r0 = r3.loader
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L32
            com.google.android.exoplayer2.upstream.Loader r0 = r3.loader
            r0.cancelLoading()
        L32:
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            android.os.Handler r2 = r1.handler
            java.lang.Runnable r0 = r1.maybeFinishPrepareRunnable
            r2.post(r0)
            return
    }

    public void prepareWithMultivariantPlaylistInfo(com.google.android.exoplayer2.source.TrackGroup[] r5, int r6, int... r7) {
            r4 = this;
            com.google.android.exoplayer2.source.TrackGroupArray r5 = r4.createTrackGroupArrayWithDrmInfo(r5)
            r4.trackGroups = r5
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r4.optionalTrackGroups = r5
            int r5 = r7.length
            r0 = 0
        Lf:
            if (r0 >= r5) goto L21
            r1 = r7[r0]
            java.util.Set<com.google.android.exoplayer2.source.TrackGroup> r2 = r4.optionalTrackGroups
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r4.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r1 = r3.get(r1)
            r2.add(r1)
            int r0 = r0 + 1
            goto Lf
        L21:
            r4.primaryTrackGroupIndex = r6
            android.os.Handler r5 = r4.handler
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r6 = r4.callback
            java.util.Objects.requireNonNull(r6)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda0 r7 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda0
            r0 = 2
            r7.<init>(r6, r0)
            r5.post(r7)
            r4.setIsPrepared()
            return
    }

    public int readData(int r12, com.google.android.exoplayer2.FormatHolder r13, com.google.android.exoplayer2.decoder.DecoderInputBuffer r14, int r15) {
            r11 = this;
            boolean r0 = r11.isPendingReset()
            r1 = -3
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r11.mediaChunks
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L54
            r0 = 0
        L12:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r3 = r11.mediaChunks
            int r3 = r3.size()
            int r3 = r3 + (-1)
            if (r0 >= r3) goto L2d
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r3 = r11.mediaChunks
            java.lang.Object r3 = r3.get(r0)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r3 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r3
            boolean r3 = r11.finishedReadingChunk(r3)
            if (r3 == 0) goto L2d
            int r0 = r0 + 1
            goto L12
        L2d:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r3 = r11.mediaChunks
            com.google.android.exoplayer2.util.Util.removeRange(r3, r2, r0)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r11.mediaChunks
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            com.google.android.exoplayer2.Format r10 = r0.trackFormat
            com.google.android.exoplayer2.Format r3 = r11.downstreamTrackFormat
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L52
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = r11.mediaSourceEventDispatcher
            int r4 = r11.trackType
            int r6 = r0.trackSelectionReason
            java.lang.Object r7 = r0.trackSelectionData
            long r8 = r0.startTimeUs
            r5 = r10
            r3.downstreamFormatChanged(r4, r5, r6, r7, r8)
        L52:
            r11.downstreamTrackFormat = r10
        L54:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r11.mediaChunks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6b
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r11.mediaChunks
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            boolean r0 = r0.isPublished()
            if (r0 != 0) goto L6b
            return r1
        L6b:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r11.sampleQueues
            r0 = r0[r12]
            boolean r1 = r11.loadingFinished
            int r14 = r0.read(r13, r14, r15, r1)
            r15 = -5
            if (r14 != r15) goto Lc4
            com.google.android.exoplayer2.Format r15 = r13.format
            java.lang.Object r15 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r15)
            com.google.android.exoplayer2.Format r15 = (com.google.android.exoplayer2.Format) r15
            int r0 = r11.primarySampleQueueIndex
            if (r12 != r0) goto Lc2
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r11.sampleQueues
            r12 = r0[r12]
            int r12 = r12.peekSourceId()
        L8c:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r11.mediaChunks
            int r0 = r0.size()
            if (r2 >= r0) goto La3
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r11.mediaChunks
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            int r0 = r0.uid
            if (r0 == r12) goto La3
            int r2 = r2 + 1
            goto L8c
        La3:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r12 = r11.mediaChunks
            int r12 = r12.size()
            if (r2 >= r12) goto Lb6
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r12 = r11.mediaChunks
            java.lang.Object r12 = r12.get(r2)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r12 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r12
            com.google.android.exoplayer2.Format r12 = r12.trackFormat
            goto Lbe
        Lb6:
            com.google.android.exoplayer2.Format r12 = r11.upstreamTrackFormat
            java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            com.google.android.exoplayer2.Format r12 = (com.google.android.exoplayer2.Format) r12
        Lbe:
            com.google.android.exoplayer2.Format r15 = r15.withManifestFormatInfo(r12)
        Lc2:
            r13.format = r15
        Lc4:
            return r14
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r5) {
            r4 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r4.loader
            boolean r0 = r0.hasFatalError()
            if (r0 != 0) goto L6a
            boolean r0 = r4.isPendingReset()
            if (r0 == 0) goto Lf
            goto L6a
        Lf:
            com.google.android.exoplayer2.upstream.Loader r0 = r4.loader
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L2e
            com.google.android.exoplayer2.source.chunk.Chunk r0 = r4.loadingChunk
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r4.chunkSource
            com.google.android.exoplayer2.source.chunk.Chunk r1 = r4.loadingChunk
            java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r4.readOnlyMediaChunks
            boolean r5 = r0.shouldCancelLoad(r5, r1, r2)
            if (r5 == 0) goto L2d
            com.google.android.exoplayer2.upstream.Loader r5 = r4.loader
            r5.cancelLoading()
        L2d:
            return
        L2e:
            java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r4.readOnlyMediaChunks
            int r0 = r0.size()
        L34:
            if (r0 <= 0) goto L4c
            com.google.android.exoplayer2.source.hls.HlsChunkSource r1 = r4.chunkSource
            java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r4.readOnlyMediaChunks
            int r3 = r0 + (-1)
            java.lang.Object r2 = r2.get(r3)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r2
            int r1 = r1.getChunkPublicationState(r2)
            r2 = 2
            if (r1 != r2) goto L4c
            int r0 = r0 + (-1)
            goto L34
        L4c:
            java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r4.readOnlyMediaChunks
            int r1 = r1.size()
            if (r0 >= r1) goto L57
            r4.discardUpstream(r0)
        L57:
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r4.chunkSource
            java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r4.readOnlyMediaChunks
            int r5 = r0.getPreferredQueueSize(r5, r1)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r6 = r4.mediaChunks
            int r6 = r6.size()
            if (r5 >= r6) goto L6a
            r4.discardUpstream(r5)
        L6a:
            return
    }

    public void release() {
            r4 = this;
            boolean r0 = r4.prepared
            if (r0 == 0) goto L12
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r4.sampleQueues
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.preRelease()
            int r2 = r2 + 1
            goto L8
        L12:
            com.google.android.exoplayer2.upstream.Loader r0 = r4.loader
            r0.release(r4)
            android.os.Handler r0 = r4.handler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r0 = 1
            r4.released = r0
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsSampleStream> r0 = r4.hlsSampleStreams
            r0.clear()
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(com.google.android.exoplayer2.extractor.SeekMap r1) {
            r0 = this;
            return
    }

    public boolean seekToUs(long r4, boolean r6) {
            r3 = this;
            r3.lastSeekPositionUs = r4
            boolean r0 = r3.isPendingReset()
            r1 = 1
            if (r0 == 0) goto Lc
            r3.pendingResetPositionUs = r4
            return r1
        Lc:
            boolean r0 = r3.sampleQueuesBuilt
            r2 = 0
            if (r0 == 0) goto L1a
            if (r6 != 0) goto L1a
            boolean r6 = r3.seekInsideBufferUs(r4)
            if (r6 == 0) goto L1a
            return r2
        L1a:
            r3.pendingResetPositionUs = r4
            r3.loadingFinished = r2
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r4 = r3.mediaChunks
            r4.clear()
            com.google.android.exoplayer2.upstream.Loader r4 = r3.loader
            boolean r4 = r4.isLoading()
            if (r4 == 0) goto L42
            boolean r4 = r3.sampleQueuesBuilt
            if (r4 == 0) goto L3c
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r4 = r3.sampleQueues
            int r5 = r4.length
        L32:
            if (r2 >= r5) goto L3c
            r6 = r4[r2]
            r6.discardToEnd()
            int r2 = r2 + 1
            goto L32
        L3c:
            com.google.android.exoplayer2.upstream.Loader r4 = r3.loader
            r4.cancelLoading()
            goto L4a
        L42:
            com.google.android.exoplayer2.upstream.Loader r4 = r3.loader
            r4.clearFatalError()
            r3.resetSampleQueues()
        L4a:
            return r1
    }

    public boolean selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r20, boolean[] r21, com.google.android.exoplayer2.source.SampleStream[] r22, boolean[] r23, long r24, boolean r26) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            r19.assertIsPrepared()
            int r3 = r0.enabledTrackGroupCount
            r14 = 0
            r4 = 0
        Lf:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L2f
            r5 = r2[r4]
            com.google.android.exoplayer2.source.hls.HlsSampleStream r5 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r5
            if (r5 == 0) goto L2c
            r7 = r1[r4]
            if (r7 == 0) goto L22
            boolean r7 = r21[r4]
            if (r7 != 0) goto L2c
        L22:
            int r7 = r0.enabledTrackGroupCount
            int r7 = r7 - r15
            r0.enabledTrackGroupCount = r7
            r5.unbindSampleQueue()
            r2[r4] = r6
        L2c:
            int r4 = r4 + 1
            goto Lf
        L2f:
            if (r26 != 0) goto L41
            boolean r4 = r0.seenFirstTrackSelection
            if (r4 == 0) goto L38
            if (r3 != 0) goto L3f
            goto L41
        L38:
            long r3 = r0.lastSeekPositionUs
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L3f
            goto L41
        L3f:
            r3 = 0
            goto L42
        L41:
            r3 = 1
        L42:
            com.google.android.exoplayer2.source.hls.HlsChunkSource r4 = r0.chunkSource
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r4 = r4.getTrackSelection()
            r16 = r3
            r11 = r4
            r3 = 0
        L4c:
            int r5 = r1.length
            if (r3 >= r5) goto La3
            r5 = r1[r3]
            if (r5 != 0) goto L54
            goto La0
        L54:
            com.google.android.exoplayer2.source.TrackGroupArray r7 = r0.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r8 = r5.getTrackGroup()
            int r7 = r7.indexOf(r8)
            int r8 = r0.primaryTrackGroupIndex
            if (r7 != r8) goto L68
            com.google.android.exoplayer2.source.hls.HlsChunkSource r8 = r0.chunkSource
            r8.setTrackSelection(r5)
            r11 = r5
        L68:
            r5 = r2[r3]
            if (r5 != 0) goto La0
            int r5 = r0.enabledTrackGroupCount
            int r5 = r5 + r15
            r0.enabledTrackGroupCount = r5
            com.google.android.exoplayer2.source.hls.HlsSampleStream r5 = new com.google.android.exoplayer2.source.hls.HlsSampleStream
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.trackGroupToSampleQueueIndex
            if (r5 == 0) goto La0
            r5 = r2[r3]
            com.google.android.exoplayer2.source.hls.HlsSampleStream r5 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r5
            r5.bindSampleQueue()
            if (r16 != 0) goto La0
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r5 = r0.sampleQueues
            int[] r8 = r0.trackGroupToSampleQueueIndex
            r7 = r8[r7]
            r5 = r5[r7]
            boolean r7 = r5.seekTo(r12, r15)
            if (r7 != 0) goto L9d
            int r5 = r5.getReadIndex()
            if (r5 == 0) goto L9d
            r5 = 1
            goto L9e
        L9d:
            r5 = 0
        L9e:
            r16 = r5
        La0:
            int r3 = r3 + 1
            goto L4c
        La3:
            int r1 = r0.enabledTrackGroupCount
            if (r1 != 0) goto Lda
            com.google.android.exoplayer2.source.hls.HlsChunkSource r1 = r0.chunkSource
            r1.reset()
            r0.downstreamTrackFormat = r6
            r0.pendingResetUpstreamFormats = r15
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r0.mediaChunks
            r1.clear()
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.isLoading()
            if (r1 == 0) goto Ld5
            boolean r1 = r0.sampleQueuesBuilt
            if (r1 == 0) goto Lce
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r1 = r0.sampleQueues
            int r3 = r1.length
        Lc4:
            if (r14 >= r3) goto Lce
            r4 = r1[r14]
            r4.discardToEnd()
            int r14 = r14 + 1
            goto Lc4
        Lce:
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            r1.cancelLoading()
            goto L140
        Ld5:
            r19.resetSampleQueues()
            goto L140
        Lda:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r0.mediaChunks
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L12d
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r11, r4)
            if (r1 != 0) goto L12d
            boolean r1 = r0.seenFirstTrackSelection
            if (r1 != 0) goto L124
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lf3
            long r3 = -r12
        Lf3:
            r6 = r3
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r1 = r19.getLastMediaChunk()
            com.google.android.exoplayer2.source.hls.HlsChunkSource r3 = r0.chunkSource
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r17 = r3.createMediaChunkIterators(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r10 = r0.readOnlyMediaChunks
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.updateSelectedTrack(r4, r6, r8, r10, r11)
            com.google.android.exoplayer2.source.hls.HlsChunkSource r3 = r0.chunkSource
            com.google.android.exoplayer2.source.TrackGroup r3 = r3.getTrackGroup()
            com.google.android.exoplayer2.Format r1 = r1.trackFormat
            int r1 = r3.indexOf(r1)
            int r3 = r18.getSelectedIndexInTrackGroup()
            if (r3 == r1) goto L122
            goto L124
        L122:
            r1 = 0
            goto L125
        L124:
            r1 = 1
        L125:
            if (r1 == 0) goto L12d
            r0.pendingResetUpstreamFormats = r15
            r1 = 1
            r16 = 1
            goto L12f
        L12d:
            r1 = r26
        L12f:
            if (r16 == 0) goto L140
            r0.seekToUs(r12, r1)
        L134:
            int r1 = r2.length
            if (r14 >= r1) goto L140
            r1 = r2[r14]
            if (r1 == 0) goto L13d
            r23[r14] = r15
        L13d:
            int r14 = r14 + 1
            goto L134
        L140:
            r0.updateSampleStreams(r2)
            r0.seenFirstTrackSelection = r15
            return r16
    }

    public void setDrmInitData(@androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r4) {
            r3 = this;
            com.google.android.exoplayer2.drm.DrmInitData r0 = r3.drmInitData
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r4)
            if (r0 != 0) goto L1e
            r3.drmInitData = r4
            r0 = 0
        Lb:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r1 = r3.sampleQueues
            int r2 = r1.length
            if (r0 >= r2) goto L1e
            boolean[] r2 = r3.sampleQueueIsAudioVideoFlags
            boolean r2 = r2[r0]
            if (r2 == 0) goto L1b
            r1 = r1[r0]
            r1.setDrmInitData(r4)
        L1b:
            int r0 = r0 + 1
            goto Lb
        L1e:
            return
    }

    public void setIsTimestampMaster(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.source.hls.HlsChunkSource r0 = r1.chunkSource
            r0.setIsTimestampMaster(r2)
            return
    }

    public void setSampleOffsetUs(long r5) {
            r4 = this;
            long r0 = r4.sampleOffsetUs
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L16
            r4.sampleOffsetUs = r5
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r4.sampleQueues
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            r3.setSampleOffsetUs(r5)
            int r2 = r2 + 1
            goto Lc
        L16:
            return
    }

    public int skipData(int r3, long r4) {
            r2 = this;
            boolean r0 = r2.isPendingReset()
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r0 = r2.sampleQueues
            r0 = r0[r3]
            boolean r1 = r2.loadingFinished
            int r4 = r0.getSkipCount(r4, r1)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r5 = r2.mediaChunks
            r1 = 0
            java.lang.Object r5 = com.google.common.collect.Iterables.getLast(r5, r1)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r5 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r5
            if (r5 == 0) goto L30
            boolean r1 = r5.isPublished()
            if (r1 != 0) goto L30
            int r1 = r0.getReadIndex()
            int r3 = r5.getFirstSampleIndex(r3)
            int r3 = r3 - r1
            int r4 = java.lang.Math.min(r4, r3)
        L30:
            r0.skip(r4)
            return r4
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public com.google.android.exoplayer2.extractor.TrackOutput track(int r4, int r5) {
            r3 = this;
            java.util.Set<java.lang.Integer> r0 = com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.MAPPABLE_TYPES
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L11
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.getMappedTrackOutput(r4, r5)
            goto L24
        L11:
            r0 = 0
        L12:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r1 = r3.sampleQueues
            int r2 = r1.length
            if (r0 >= r2) goto L23
            int[] r2 = r3.sampleQueueTrackIds
            r2 = r2[r0]
            if (r2 != r4) goto L20
            r0 = r1[r0]
            goto L24
        L20:
            int r0 = r0 + 1
            goto L12
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L33
            boolean r0 = r3.tracksEnded
            if (r0 == 0) goto L2f
            com.google.android.exoplayer2.extractor.DummyTrackOutput r4 = createFakeTrackOutput(r4, r5)
            return r4
        L2f:
            com.google.android.exoplayer2.source.SampleQueue r0 = r3.createSampleQueue(r4, r5)
        L33:
            r4 = 5
            if (r5 != r4) goto L46
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r3.emsgUnwrappingTrackOutput
            if (r4 != 0) goto L43
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$EmsgUnwrappingTrackOutput r4 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$EmsgUnwrappingTrackOutput
            int r5 = r3.metadataType
            r4.<init>(r0, r5)
            r3.emsgUnwrappingTrackOutput = r4
        L43:
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r3.emsgUnwrappingTrackOutput
            return r4
        L46:
            return r0
    }

    public void unbindSampleQueue(int r3) {
            r2 = this;
            r2.assertIsPrepared()
            int[] r0 = r2.trackGroupToSampleQueueIndex
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            int[] r0 = r2.trackGroupToSampleQueueIndex
            r3 = r0[r3]
            boolean[] r0 = r2.sampleQueuesEnabledStates
            boolean r0 = r0[r3]
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            boolean[] r0 = r2.sampleQueuesEnabledStates
            r1 = 0
            r0[r3] = r1
            return
    }
}
