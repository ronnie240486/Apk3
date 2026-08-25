package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.source.chunk.ChunkSource;

/* JADX INFO: loaded from: classes.dex */
public class ChunkSampleStream<T extends com.google.android.exoplayer2.source.chunk.ChunkSource> implements com.google.android.exoplayer2.source.SampleStream, com.google.android.exoplayer2.source.SequenceableLoader, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.source.chunk.Chunk>, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback {
    private static final java.lang.String TAG = "ChunkSampleStream";
    private final com.google.android.exoplayer2.source.SequenceableLoader.Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T>> callback;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.BaseMediaChunk canceledMediaChunk;
    private final com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput chunkOutput;
    private final T chunkSource;
    private final com.google.android.exoplayer2.source.SampleQueue[] embeddedSampleQueues;
    private final com.google.android.exoplayer2.Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private long lastSeekPositionUs;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.upstream.Loader loader;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.Chunk loadingChunk;
    public boolean loadingFinished;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> mediaChunks;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final com.google.android.exoplayer2.source.chunk.ChunkHolder nextChunkHolder;
    private int nextNotifyPrimaryFormatMediaChunkIndex;
    private long pendingResetPositionUs;
    private com.google.android.exoplayer2.Format primaryDownstreamTrackFormat;
    private final com.google.android.exoplayer2.source.SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final java.util.List<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> readOnlyMediaChunks;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback;

    /* JADX INFO: loaded from: classes2.dex */
    public final class EmbeddedSampleStream implements com.google.android.exoplayer2.source.SampleStream {
        private final int index;
        private boolean notifiedDownstreamFormat;
        public final com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T> parent;
        private final com.google.android.exoplayer2.source.SampleQueue sampleQueue;
        public final /* synthetic */ com.google.android.exoplayer2.source.chunk.ChunkSampleStream this$0;

        public EmbeddedSampleStream(com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1, com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T> r2, com.google.android.exoplayer2.source.SampleQueue r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.parent = r2
                r0.sampleQueue = r3
                r0.index = r4
                return
        }

        private void maybeNotifyDownstreamFormat() {
                r8 = this;
                boolean r0 = r8.notifiedDownstreamFormat
                if (r0 != 0) goto L2c
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r8.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$500(r0)
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r8.this$0
                int[] r0 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$200(r0)
                int r2 = r8.index
                r2 = r0[r2]
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r8.this$0
                com.google.android.exoplayer2.Format[] r0 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$300(r0)
                int r3 = r8.index
                r3 = r0[r3]
                r4 = 0
                r5 = 0
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r8.this$0
                long r6 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$400(r0)
                r1.downstreamFormatChanged(r2, r3, r4, r5, r6)
                r0 = 1
                r8.notifiedDownstreamFormat = r0
            L2c:
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
                r2 = this;
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r2.this$0
                boolean r0 = r0.isPendingReset()
                if (r0 != 0) goto L16
                com.google.android.exoplayer2.source.SampleQueue r0 = r2.sampleQueue
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1 = r2.this$0
                boolean r1 = r1.loadingFinished
                boolean r0 = r0.isReady(r1)
                if (r0 == 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder r4, com.google.android.exoplayer2.decoder.DecoderInputBuffer r5, int r6) {
                r3 = this;
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r3.this$0
                boolean r0 = r0.isPendingReset()
                r1 = -3
                if (r0 == 0) goto La
                return r1
            La:
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r3.this$0
                com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$000(r0)
                if (r0 == 0) goto L29
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r3.this$0
                com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$000(r0)
                int r2 = r3.index
                int r2 = r2 + 1
                int r0 = r0.getFirstSampleIndex(r2)
                com.google.android.exoplayer2.source.SampleQueue r2 = r3.sampleQueue
                int r2 = r2.getReadIndex()
                if (r0 > r2) goto L29
                return r1
            L29:
                r3.maybeNotifyDownstreamFormat()
                com.google.android.exoplayer2.source.SampleQueue r0 = r3.sampleQueue
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1 = r3.this$0
                boolean r1 = r1.loadingFinished
                int r4 = r0.read(r4, r5, r6, r1)
                return r4
        }

        public void release() {
                r3 = this;
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r3.this$0
                boolean[] r0 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$100(r0)
                int r1 = r3.index
                boolean r0 = r0[r1]
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r3.this$0
                boolean[] r0 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$100(r0)
                int r1 = r3.index
                r2 = 0
                r0[r1] = r2
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long r3) {
                r2 = this;
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0 = r2.this$0
                boolean r0 = r0.isPendingReset()
                if (r0 == 0) goto La
                r3 = 0
                return r3
            La:
                com.google.android.exoplayer2.source.SampleQueue r0 = r2.sampleQueue
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1 = r2.this$0
                boolean r1 = r1.loadingFinished
                int r3 = r0.getSkipCount(r3, r1)
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r4 = r2.this$0
                com.google.android.exoplayer2.source.chunk.BaseMediaChunk r4 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$000(r4)
                if (r4 == 0) goto L35
                com.google.android.exoplayer2.source.chunk.ChunkSampleStream r4 = r2.this$0
                com.google.android.exoplayer2.source.chunk.BaseMediaChunk r4 = com.google.android.exoplayer2.source.chunk.ChunkSampleStream.access$000(r4)
                int r0 = r2.index
                int r0 = r0 + 1
                int r4 = r4.getFirstSampleIndex(r0)
                com.google.android.exoplayer2.source.SampleQueue r0 = r2.sampleQueue
                int r0 = r0.getReadIndex()
                int r4 = r4 - r0
                int r3 = java.lang.Math.min(r3, r4)
            L35:
                com.google.android.exoplayer2.source.SampleQueue r4 = r2.sampleQueue
                r4.skip(r3)
                if (r3 <= 0) goto L3f
                r2.maybeNotifyDownstreamFormat()
            L3f:
                return r3
        }
    }

    public interface ReleaseCallback<T extends com.google.android.exoplayer2.source.chunk.ChunkSource> {
        void onSampleStreamReleased(com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T> r1);
    }

    public ChunkSampleStream(int r2, @androidx.annotation.Nullable int[] r3, @androidx.annotation.Nullable com.google.android.exoplayer2.Format[] r4, T r5, com.google.android.exoplayer2.source.SequenceableLoader.Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T>> r6, com.google.android.exoplayer2.upstream.Allocator r7, long r8, com.google.android.exoplayer2.drm.DrmSessionManager r10, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r11, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r12, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r13) {
            r1 = this;
            r1.<init>()
            r1.primaryTrackType = r2
            r0 = 0
            if (r3 != 0) goto La
            int[] r3 = new int[r0]
        La:
            r1.embeddedTrackTypes = r3
            if (r4 != 0) goto L10
            com.google.android.exoplayer2.Format[] r4 = new com.google.android.exoplayer2.Format[r0]
        L10:
            r1.embeddedTrackFormats = r4
            r1.chunkSource = r5
            r1.callback = r6
            r1.mediaSourceEventDispatcher = r13
            r1.loadErrorHandlingPolicy = r12
            com.google.android.exoplayer2.upstream.Loader r4 = new com.google.android.exoplayer2.upstream.Loader
            java.lang.String r5 = "ChunkSampleStream"
            r4.<init>(r5)
            r1.loader = r4
            com.google.android.exoplayer2.source.chunk.ChunkHolder r4 = new com.google.android.exoplayer2.source.chunk.ChunkHolder
            r4.<init>()
            r1.nextChunkHolder = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.mediaChunks = r4
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            r1.readOnlyMediaChunks = r4
            int r3 = r3.length
            com.google.android.exoplayer2.source.SampleQueue[] r4 = new com.google.android.exoplayer2.source.SampleQueue[r3]
            r1.embeddedSampleQueues = r4
            boolean[] r4 = new boolean[r3]
            r1.embeddedTracksSelected = r4
            int r4 = r3 + 1
            int[] r5 = new int[r4]
            com.google.android.exoplayer2.source.SampleQueue[] r4 = new com.google.android.exoplayer2.source.SampleQueue[r4]
            com.google.android.exoplayer2.source.SampleQueue r6 = com.google.android.exoplayer2.source.SampleQueue.createWithDrm(r7, r10, r11)
            r1.primarySampleQueue = r6
            r5[r0] = r2
            r4[r0] = r6
        L50:
            if (r0 >= r3) goto L66
            com.google.android.exoplayer2.source.SampleQueue r2 = com.google.android.exoplayer2.source.SampleQueue.createWithoutDrm(r7)
            com.google.android.exoplayer2.source.SampleQueue[] r6 = r1.embeddedSampleQueues
            r6[r0] = r2
            int r6 = r0 + 1
            r4[r6] = r2
            int[] r2 = r1.embeddedTrackTypes
            r2 = r2[r0]
            r5[r6] = r2
            r0 = r6
            goto L50
        L66:
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r2 = new com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput
            r2.<init>(r5, r4)
            r1.chunkOutput = r2
            r1.pendingResetPositionUs = r8
            r1.lastSeekPositionUs = r8
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.chunk.BaseMediaChunk access$000(com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0) {
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = r0.canceledMediaChunk
            return r0
    }

    public static /* synthetic */ boolean[] access$100(com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0) {
            boolean[] r0 = r0.embeddedTracksSelected
            return r0
    }

    public static /* synthetic */ int[] access$200(com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0) {
            int[] r0 = r0.embeddedTrackTypes
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Format[] access$300(com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0) {
            com.google.android.exoplayer2.Format[] r0 = r0.embeddedTrackFormats
            return r0
    }

    public static /* synthetic */ long access$400(com.google.android.exoplayer2.source.chunk.ChunkSampleStream r2) {
            long r0 = r2.lastSeekPositionUs
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher access$500(com.google.android.exoplayer2.source.chunk.ChunkSampleStream r0) {
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r0.mediaSourceEventDispatcher
            return r0
    }

    private void discardDownstreamMediaChunks(int r3) {
            r2 = this;
            r0 = 0
            int r3 = r2.primarySampleIndexToMediaChunkIndex(r3, r0)
            int r1 = r2.nextNotifyPrimaryFormatMediaChunkIndex
            int r3 = java.lang.Math.min(r3, r1)
            if (r3 <= 0) goto L17
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r2.mediaChunks
            com.google.android.exoplayer2.util.Util.removeRange(r1, r0, r3)
            int r0 = r2.nextNotifyPrimaryFormatMediaChunkIndex
            int r0 = r0 - r3
            r2.nextNotifyPrimaryFormatMediaChunkIndex = r0
        L17:
            return
    }

    private void discardUpstream(int r8) {
            r7 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r7.loader
            boolean r0 = r0.isLoading()
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r7.mediaChunks
            int r0 = r0.size()
        L11:
            r1 = -1
            if (r8 >= r0) goto L1e
            boolean r2 = r7.haveReadFromMediaChunk(r8)
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r8 = r8 + 1
            goto L11
        L1e:
            r8 = -1
        L1f:
            if (r8 != r1) goto L22
            return
        L22:
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = r7.getLastMediaChunk()
            long r5 = r0.endTimeUs
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r8 = r7.discardUpstreamMediaChunksFromIndex(r8)
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r7.mediaChunks
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L38
            long r0 = r7.lastSeekPositionUs
            r7.pendingResetPositionUs = r0
        L38:
            r0 = 0
            r7.loadingFinished = r0
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r7.mediaSourceEventDispatcher
            int r2 = r7.primaryTrackType
            long r3 = r8.startTimeUs
            r1.upstreamDiscarded(r2, r3, r5)
            return
    }

    private com.google.android.exoplayer2.source.chunk.BaseMediaChunk discardUpstreamMediaChunksFromIndex(int r4) {
            r3 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r3.mediaChunks
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r0
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r3.mediaChunks
            int r2 = r1.size()
            com.google.android.exoplayer2.util.Util.removeRange(r1, r4, r2)
            int r4 = r3.nextNotifyPrimaryFormatMediaChunkIndex
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r3.mediaChunks
            int r1 = r1.size()
            int r4 = java.lang.Math.max(r4, r1)
            r3.nextNotifyPrimaryFormatMediaChunkIndex = r4
            com.google.android.exoplayer2.source.SampleQueue r4 = r3.primarySampleQueue
            r1 = 0
            int r2 = r0.getFirstSampleIndex(r1)
            r4.discardUpstreamSamples(r2)
        L29:
            com.google.android.exoplayer2.source.SampleQueue[] r4 = r3.embeddedSampleQueues
            int r2 = r4.length
            if (r1 >= r2) goto L3a
            r4 = r4[r1]
            int r1 = r1 + 1
            int r2 = r0.getFirstSampleIndex(r1)
            r4.discardUpstreamSamples(r2)
            goto L29
        L3a:
            return r0
    }

    private com.google.android.exoplayer2.source.chunk.BaseMediaChunk getLastMediaChunk() {
            r2 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r2.mediaChunks
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r0
            return r0
    }

    private boolean haveReadFromMediaChunk(int r6) {
            r5 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r5.mediaChunks
            java.lang.Object r6 = r0.get(r6)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r6 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r6
            com.google.android.exoplayer2.source.SampleQueue r0 = r5.primarySampleQueue
            int r0 = r0.getReadIndex()
            r1 = 0
            int r2 = r6.getFirstSampleIndex(r1)
            r3 = 1
            if (r0 <= r2) goto L17
            return r3
        L17:
            r0 = 0
        L18:
            com.google.android.exoplayer2.source.SampleQueue[] r2 = r5.embeddedSampleQueues
            int r4 = r2.length
            if (r0 >= r4) goto L2c
            r2 = r2[r0]
            int r2 = r2.getReadIndex()
            int r0 = r0 + 1
            int r4 = r6.getFirstSampleIndex(r0)
            if (r2 <= r4) goto L18
            return r3
        L2c:
            return r1
    }

    private boolean isMediaChunk(com.google.android.exoplayer2.source.chunk.Chunk r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.exoplayer2.source.chunk.BaseMediaChunk
            return r1
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
            r3 = this;
            com.google.android.exoplayer2.source.SampleQueue r0 = r3.primarySampleQueue
            int r0 = r0.getReadIndex()
            int r1 = r3.nextNotifyPrimaryFormatMediaChunkIndex
            int r1 = r1 + (-1)
            int r0 = r3.primarySampleIndexToMediaChunkIndex(r0, r1)
        Le:
            int r1 = r3.nextNotifyPrimaryFormatMediaChunkIndex
            if (r1 > r0) goto L1a
            int r2 = r1 + 1
            r3.nextNotifyPrimaryFormatMediaChunkIndex = r2
            r3.maybeNotifyPrimaryTrackFormatChanged(r1)
            goto Le
        L1a:
            return
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int r9) {
            r8 = this;
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r8.mediaChunks
            java.lang.Object r9 = r0.get(r9)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r9 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r9
            com.google.android.exoplayer2.Format r7 = r9.trackFormat
            com.google.android.exoplayer2.Format r0 = r8.primaryDownstreamTrackFormat
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L20
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r8.mediaSourceEventDispatcher
            int r1 = r8.primaryTrackType
            int r3 = r9.trackSelectionReason
            java.lang.Object r4 = r9.trackSelectionData
            long r5 = r9.startTimeUs
            r2 = r7
            r0.downstreamFormatChanged(r1, r2, r3, r4, r5)
        L20:
            r8.primaryDownstreamTrackFormat = r7
            return
    }

    private int primarySampleIndexToMediaChunkIndex(int r3, int r4) {
            r2 = this;
        L0:
            int r4 = r4 + 1
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r2.mediaChunks
            int r0 = r0.size()
            if (r4 >= r0) goto L1c
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r0 = r2.mediaChunks
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r0
            r1 = 0
            int r0 = r0.getFirstSampleIndex(r1)
            if (r0 <= r3) goto L0
            int r4 = r4 + (-1)
            return r4
        L1c:
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r3 = r2.mediaChunks
            int r3 = r3.size()
            int r3 = r3 + (-1)
            return r3
    }

    private void resetSampleQueues() {
            r4 = this;
            com.google.android.exoplayer2.source.SampleQueue r0 = r4.primarySampleQueue
            r0.reset()
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.embeddedSampleQueues
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L13
            r3 = r0[r2]
            r3.reset()
            int r2 = r2 + 1
            goto L9
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r24) {
            r23 = this;
            r0 = r23
            boolean r1 = r0.loadingFinished
            r2 = 0
            if (r1 != 0) goto Lca
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.isLoading()
            if (r1 != 0) goto Lca
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.hasFatalError()
            if (r1 == 0) goto L19
            goto Lca
        L19:
            boolean r1 = r23.isPendingReset()
            if (r1 == 0) goto L26
            java.util.List r3 = java.util.Collections.emptyList()
            long r4 = r0.pendingResetPositionUs
            goto L2e
        L26:
            java.util.List<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r3 = r0.readOnlyMediaChunks
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r4 = r23.getLastMediaChunk()
            long r4 = r4.endTimeUs
        L2e:
            r11 = r3
            r9 = r4
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r6 = r0.chunkSource
            com.google.android.exoplayer2.source.chunk.ChunkHolder r12 = r0.nextChunkHolder
            r7 = r24
            r6.getNextChunk(r7, r9, r11, r12)
            com.google.android.exoplayer2.source.chunk.ChunkHolder r3 = r0.nextChunkHolder
            boolean r4 = r3.endOfStream
            com.google.android.exoplayer2.source.chunk.Chunk r5 = r3.chunk
            r3.clear()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 1
            if (r4 == 0) goto L4f
            r0.pendingResetPositionUs = r6
            r0.loadingFinished = r3
            return r3
        L4f:
            if (r5 != 0) goto L52
            return r2
        L52:
            r0.loadingChunk = r5
            boolean r4 = r0.isMediaChunk(r5)
            if (r4 == 0) goto L88
            r4 = r5
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r4 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r4
            if (r1 == 0) goto L7d
            long r8 = r4.startTimeUs
            long r10 = r0.pendingResetPositionUs
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 == 0) goto L7b
            com.google.android.exoplayer2.source.SampleQueue r1 = r0.primarySampleQueue
            r1.setStartTimeUs(r10)
            com.google.android.exoplayer2.source.SampleQueue[] r1 = r0.embeddedSampleQueues
            int r8 = r1.length
        L6f:
            if (r2 >= r8) goto L7b
            r9 = r1[r2]
            long r10 = r0.pendingResetPositionUs
            r9.setStartTimeUs(r10)
            int r2 = r2 + 1
            goto L6f
        L7b:
            r0.pendingResetPositionUs = r6
        L7d:
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r1 = r0.chunkOutput
            r4.init(r1)
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r0.mediaChunks
            r1.add(r4)
            goto L94
        L88:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.source.chunk.InitializationChunk
            if (r1 == 0) goto L94
            r1 = r5
            com.google.android.exoplayer2.source.chunk.InitializationChunk r1 = (com.google.android.exoplayer2.source.chunk.InitializationChunk) r1
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r2 = r0.chunkOutput
            r1.init(r2)
        L94:
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
            int r15 = r0.primaryTrackType
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
        Lca:
            return r2
    }

    public void discardBuffer(long r5, boolean r7) {
            r4 = this;
            boolean r0 = r4.isPendingReset()
            if (r0 == 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.source.SampleQueue r0 = r4.primarySampleQueue
            int r0 = r0.getFirstIndex()
            com.google.android.exoplayer2.source.SampleQueue r1 = r4.primarySampleQueue
            r2 = 1
            r1.discardTo(r5, r7, r2)
            com.google.android.exoplayer2.source.SampleQueue r5 = r4.primarySampleQueue
            int r5 = r5.getFirstIndex()
            if (r5 <= r0) goto L33
            com.google.android.exoplayer2.source.SampleQueue r6 = r4.primarySampleQueue
            long r0 = r6.getFirstTimestampUs()
            r6 = 0
        L22:
            com.google.android.exoplayer2.source.SampleQueue[] r2 = r4.embeddedSampleQueues
            int r3 = r2.length
            if (r6 >= r3) goto L33
            r2 = r2[r6]
            boolean[] r3 = r4.embeddedTracksSelected
            boolean r3 = r3[r6]
            r2.discardTo(r0, r7, r3)
            int r6 = r6 + 1
            goto L22
        L33:
            r4.discardDownstreamMediaChunks(r5)
            return
    }

    public long getAdjustedSeekPositionUs(long r2, com.google.android.exoplayer2.SeekParameters r4) {
            r1 = this;
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r0 = r1.chunkSource
            long r2 = r0.getAdjustedSeekPositionUs(r2, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r4 = this;
            boolean r0 = r4.loadingFinished
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r4.isPendingReset()
            if (r0 == 0) goto L10
            long r0 = r4.pendingResetPositionUs
            return r0
        L10:
            long r0 = r4.lastSeekPositionUs
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r2 = r4.getLastMediaChunk()
            boolean r3 = r2.isLoadCompleted()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r2 = r4.mediaChunks
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r2 = r4.mediaChunks
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r2 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.endTimeUs
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            com.google.android.exoplayer2.source.SampleQueue r2 = r4.primarySampleQueue
            long r2 = r2.getLargestQueuedTimestampUs()
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    public T getChunkSource() {
            r1 = this;
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r0 = r1.chunkSource
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
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = r2.getLastMediaChunk()
            long r0 = r0.endTimeUs
        L16:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            boolean r0 = r0.isLoading()
            return r0
    }

    public final boolean isPendingReset() {
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

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
            r2 = this;
            boolean r0 = r2.isPendingReset()
            if (r0 != 0) goto L12
            com.google.android.exoplayer2.source.SampleQueue r0 = r2.primarySampleQueue
            boolean r1 = r2.loadingFinished
            boolean r0 = r0.isReady(r1)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            r0.maybeThrowError()
            com.google.android.exoplayer2.source.SampleQueue r0 = r1.primarySampleQueue
            r0.maybeThrowError()
            com.google.android.exoplayer2.upstream.Loader r0 = r1.loader
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L17
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r0 = r1.chunkSource
            r0.maybeThrowError()
        L17:
            return
    }

    public void onLoadCanceled(com.google.android.exoplayer2.source.chunk.Chunk r16, long r17, long r19, boolean r21) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 0
            r0.loadingChunk = r2
            r0.canceledMediaChunk = r2
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
            int r6 = r0.primaryTrackType
            com.google.android.exoplayer2.Format r7 = r1.trackFormat
            int r8 = r1.trackSelectionReason
            java.lang.Object r9 = r1.trackSelectionData
            long r10 = r1.startTimeUs
            long r12 = r1.endTimeUs
            r4 = r2
            r3.loadCanceled(r4, r5, r6, r7, r8, r9, r10, r12)
            if (r21 != 0) goto L6b
            boolean r2 = r15.isPendingReset()
            if (r2 == 0) goto L49
            r15.resetSampleQueues()
            goto L66
        L49:
            boolean r1 = r15.isMediaChunk(r16)
            if (r1 == 0) goto L66
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r0.mediaChunks
            int r1 = r1.size()
            int r1 = r1 + (-1)
            r15.discardUpstreamMediaChunksFromIndex(r1)
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r0.mediaChunks
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L66
            long r1 = r0.lastSeekPositionUs
            r0.pendingResetPositionUs = r1
        L66:
            com.google.android.exoplayer2.source.SequenceableLoader$Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T extends com.google.android.exoplayer2.source.chunk.ChunkSource>> r1 = r0.callback
            r1.onContinueLoadingRequested(r15)
        L6b:
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
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r2 = r0.chunkSource
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
            int r6 = r0.primaryTrackType
            com.google.android.exoplayer2.Format r7 = r1.trackFormat
            int r8 = r1.trackSelectionReason
            java.lang.Object r9 = r1.trackSelectionData
            long r10 = r1.startTimeUs
            long r12 = r1.endTimeUs
            r4 = r2
            r3.loadCompleted(r4, r5, r6, r7, r8, r9, r10, r12)
            com.google.android.exoplayer2.source.SequenceableLoader$Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T extends com.google.android.exoplayer2.source.chunk.ChunkSource>> r1 = r0.callback
            r1.onContinueLoadingRequested(r15)
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
            long r12 = r31.bytesLoaded()
            boolean r14 = r30.isMediaChunk(r31)
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r2 = r0.mediaChunks
            int r2 = r2.size()
            r15 = 1
            int r10 = r2 + (-1)
            r11 = 0
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            if (r14 == 0) goto L27
            boolean r2 = r0.haveReadFromMediaChunk(r10)
            if (r2 != 0) goto L25
            goto L27
        L25:
            r8 = 0
            goto L28
        L27:
            r8 = 1
        L28:
            com.google.android.exoplayer2.source.LoadEventInfo r9 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r3 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r5 = r1.dataSpec
            android.net.Uri r6 = r31.getUri()
            java.util.Map r7 = r31.getResponseHeaders()
            r2 = r9
            r15 = r8
            r17 = r14
            r14 = r9
            r8 = r32
            r29 = r10
            r10 = r34
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.source.MediaLoadData r2 = new com.google.android.exoplayer2.source.MediaLoadData
            int r3 = r1.type
            int r4 = r0.primaryTrackType
            com.google.android.exoplayer2.Format r5 = r1.trackFormat
            int r6 = r1.trackSelectionReason
            java.lang.Object r7 = r1.trackSelectionData
            long r8 = r1.startTimeUs
            long r24 = com.google.android.exoplayer2.util.Util.usToMs(r8)
            long r8 = r1.endTimeUs
            long r26 = com.google.android.exoplayer2.util.Util.usToMs(r8)
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r3 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
            r4 = r36
            r5 = r37
            r3.<init>(r14, r2, r4, r5)
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r2 = r0.chunkSource
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r5 = r0.loadErrorHandlingPolicy
            boolean r2 = r2.onChunkLoadError(r1, r15, r3, r5)
            if (r2 == 0) goto La6
            if (r15 == 0) goto L9f
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
            if (r17 == 0) goto La7
            r6 = r29
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r6 = r0.discardUpstreamMediaChunksFromIndex(r6)
            if (r6 != r1) goto L8e
            r11 = 1
            goto L8f
        L8e:
            r11 = 0
        L8f:
            com.google.android.exoplayer2.util.Assertions.checkState(r11)
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r6 = r0.mediaChunks
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto La7
            long r6 = r0.lastSeekPositionUs
            r0.pendingResetPositionUs = r6
            goto La7
        L9f:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r6 = "Ignoring attempt to cancel non-cancelable load."
            com.google.android.exoplayer2.util.Log.w(r2, r6)
        La6:
            r2 = 0
        La7:
            if (r2 != 0) goto Lc0
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r2 = r2.getRetryDelayMsFor(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto Lbe
            r6 = 0
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.createRetryAction(r6, r2)
            goto Lc0
        Lbe:
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r2 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL
        Lc0:
            boolean r3 = r2.isRetry()
            r6 = 1
            r3 = r3 ^ r6
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r6 = r0.mediaSourceEventDispatcher
            int r7 = r1.type
            int r8 = r0.primaryTrackType
            com.google.android.exoplayer2.Format r9 = r1.trackFormat
            int r10 = r1.trackSelectionReason
            java.lang.Object r11 = r1.trackSelectionData
            long r12 = r1.startTimeUs
            long r4 = r1.endTimeUs
            r16 = r6
            r17 = r14
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r25 = r4
            r27 = r36
            r28 = r3
            r16.loadError(r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            if (r3 == 0) goto L100
            r3 = 0
            r0.loadingChunk = r3
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = r0.loadErrorHandlingPolicy
            long r4 = r1.loadTaskId
            r3.onLoadTaskConcluded(r4)
            com.google.android.exoplayer2.source.SequenceableLoader$Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T extends com.google.android.exoplayer2.source.chunk.ChunkSource>> r1 = r0.callback
            r1.onContinueLoadingRequested(r0)
        L100:
            return r2
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
            com.google.android.exoplayer2.source.SampleQueue r0 = r4.primarySampleQueue
            r0.release()
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r4.embeddedSampleQueues
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L13
            r3 = r0[r2]
            r3.release()
            int r2 = r2 + 1
            goto L9
        L13:
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r0 = r4.chunkSource
            r0.release()
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream$ReleaseCallback<T extends com.google.android.exoplayer2.source.chunk.ChunkSource> r0 = r4.releaseCallback
            if (r0 == 0) goto L1f
            r0.onSampleStreamReleased(r4)
        L1f:
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(com.google.android.exoplayer2.FormatHolder r4, com.google.android.exoplayer2.decoder.DecoderInputBuffer r5, int r6) {
            r3 = this;
            boolean r0 = r3.isPendingReset()
            r1 = -3
            if (r0 == 0) goto L8
            return r1
        L8:
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = r3.canceledMediaChunk
            if (r0 == 0) goto L1a
            r2 = 0
            int r0 = r0.getFirstSampleIndex(r2)
            com.google.android.exoplayer2.source.SampleQueue r2 = r3.primarySampleQueue
            int r2 = r2.getReadIndex()
            if (r0 > r2) goto L1a
            return r1
        L1a:
            r3.maybeNotifyPrimaryTrackFormatChanged()
            com.google.android.exoplayer2.source.SampleQueue r0 = r3.primarySampleQueue
            boolean r1 = r3.loadingFinished
            int r4 = r0.read(r4, r5, r6, r1)
            return r4
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r4) {
            r3 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r3.loader
            boolean r0 = r0.hasFatalError()
            if (r0 != 0) goto L61
            boolean r0 = r3.isPendingReset()
            if (r0 == 0) goto Lf
            goto L61
        Lf:
            com.google.android.exoplayer2.upstream.Loader r0 = r3.loader
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L4e
            com.google.android.exoplayer2.source.chunk.Chunk r0 = r3.loadingChunk
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.chunk.Chunk r0 = (com.google.android.exoplayer2.source.chunk.Chunk) r0
            boolean r1 = r3.isMediaChunk(r0)
            if (r1 == 0) goto L34
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r3.mediaChunks
            int r1 = r1.size()
            int r1 = r1 + (-1)
            boolean r1 = r3.haveReadFromMediaChunk(r1)
            if (r1 == 0) goto L34
            return
        L34:
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r1 = r3.chunkSource
            java.util.List<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r2 = r3.readOnlyMediaChunks
            boolean r4 = r1.shouldCancelLoad(r4, r0, r2)
            if (r4 == 0) goto L4d
            com.google.android.exoplayer2.upstream.Loader r4 = r3.loader
            r4.cancelLoading()
            boolean r4 = r3.isMediaChunk(r0)
            if (r4 == 0) goto L4d
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r0 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r0
            r3.canceledMediaChunk = r0
        L4d:
            return
        L4e:
            T extends com.google.android.exoplayer2.source.chunk.ChunkSource r0 = r3.chunkSource
            java.util.List<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r1 = r3.readOnlyMediaChunks
            int r4 = r0.getPreferredQueueSize(r4, r1)
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r5 = r3.mediaChunks
            int r5 = r5.size()
            if (r4 >= r5) goto L61
            r3.discardUpstream(r4)
        L61:
            return
    }

    public void release() {
            r1 = this;
            r0 = 0
            r1.release(r0)
            return
    }

    public void release(@androidx.annotation.Nullable com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback<T> r4) {
            r3 = this;
            r3.releaseCallback = r4
            com.google.android.exoplayer2.source.SampleQueue r4 = r3.primarySampleQueue
            r4.preRelease()
            com.google.android.exoplayer2.source.SampleQueue[] r4 = r3.embeddedSampleQueues
            int r0 = r4.length
            r1 = 0
        Lb:
            if (r1 >= r0) goto L15
            r2 = r4[r1]
            r2.preRelease()
            int r1 = r1 + 1
            goto Lb
        L15:
            com.google.android.exoplayer2.upstream.Loader r4 = r3.loader
            r4.release(r3)
            return
    }

    public void seekToUs(long r11) {
            r10 = this;
            r10.lastSeekPositionUs = r11
            boolean r0 = r10.isPendingReset()
            if (r0 == 0) goto Lb
            r10.pendingResetPositionUs = r11
            return
        Lb:
            r0 = 0
            r1 = 0
            r2 = 0
        Le:
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r3 = r10.mediaChunks
            int r3 = r3.size()
            if (r2 >= r3) goto L37
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r3 = r10.mediaChunks
            java.lang.Object r3 = r3.get(r2)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r3 = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) r3
            long r4 = r3.startTimeUs
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 != 0) goto L31
            long r4 = r3.clippedStartTimeUs
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L31
            r0 = r3
            goto L37
        L31:
            if (r6 <= 0) goto L34
            goto L37
        L34:
            int r2 = r2 + 1
            goto Le
        L37:
            r2 = 1
            if (r0 == 0) goto L45
            com.google.android.exoplayer2.source.SampleQueue r3 = r10.primarySampleQueue
            int r0 = r0.getFirstSampleIndex(r1)
            boolean r0 = r3.seekTo(r0)
            goto L56
        L45:
            com.google.android.exoplayer2.source.SampleQueue r0 = r10.primarySampleQueue
            long r3 = r10.getNextLoadPositionUs()
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto L51
            r3 = 1
            goto L52
        L51:
            r3 = 0
        L52:
            boolean r0 = r0.seekTo(r11, r3)
        L56:
            if (r0 == 0) goto L71
            com.google.android.exoplayer2.source.SampleQueue r0 = r10.primarySampleQueue
            int r0 = r0.getReadIndex()
            int r0 = r10.primarySampleIndexToMediaChunkIndex(r0, r1)
            r10.nextNotifyPrimaryFormatMediaChunkIndex = r0
            com.google.android.exoplayer2.source.SampleQueue[] r0 = r10.embeddedSampleQueues
            int r3 = r0.length
        L67:
            if (r1 >= r3) goto La4
            r4 = r0[r1]
            r4.seekTo(r11, r2)
            int r1 = r1 + 1
            goto L67
        L71:
            r10.pendingResetPositionUs = r11
            r10.loadingFinished = r1
            java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> r11 = r10.mediaChunks
            r11.clear()
            r10.nextNotifyPrimaryFormatMediaChunkIndex = r1
            com.google.android.exoplayer2.upstream.Loader r11 = r10.loader
            boolean r11 = r11.isLoading()
            if (r11 == 0) goto L9c
            com.google.android.exoplayer2.source.SampleQueue r11 = r10.primarySampleQueue
            r11.discardToEnd()
            com.google.android.exoplayer2.source.SampleQueue[] r11 = r10.embeddedSampleQueues
            int r12 = r11.length
        L8c:
            if (r1 >= r12) goto L96
            r0 = r11[r1]
            r0.discardToEnd()
            int r1 = r1 + 1
            goto L8c
        L96:
            com.google.android.exoplayer2.upstream.Loader r11 = r10.loader
            r11.cancelLoading()
            goto La4
        L9c:
            com.google.android.exoplayer2.upstream.Loader r11 = r10.loader
            r11.clearFatalError()
            r10.resetSampleQueues()
        La4:
            return
    }

    public com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long r3, int r5) {
            r2 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.source.SampleQueue[] r1 = r2.embeddedSampleQueues
            int r1 = r1.length
            if (r0 >= r1) goto L2d
            int[] r1 = r2.embeddedTrackTypes
            r1 = r1[r0]
            if (r1 != r5) goto L2a
            boolean[] r5 = r2.embeddedTracksSelected
            boolean r5 = r5[r0]
            r1 = 1
            r5 = r5 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r5)
            boolean[] r5 = r2.embeddedTracksSelected
            r5[r0] = r1
            com.google.android.exoplayer2.source.SampleQueue[] r5 = r2.embeddedSampleQueues
            r5 = r5[r0]
            r5.seekTo(r3, r1)
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream r3 = new com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream
            com.google.android.exoplayer2.source.SampleQueue[] r4 = r2.embeddedSampleQueues
            r4 = r4[r0]
            r3.<init>(r2, r2, r4, r0)
            return r3
        L2a:
            int r0 = r0 + 1
            goto L1
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long r4) {
            r3 = this;
            boolean r0 = r3.isPendingReset()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.google.android.exoplayer2.source.SampleQueue r0 = r3.primarySampleQueue
            boolean r2 = r3.loadingFinished
            int r4 = r0.getSkipCount(r4, r2)
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk r5 = r3.canceledMediaChunk
            if (r5 == 0) goto L23
            int r5 = r5.getFirstSampleIndex(r1)
            com.google.android.exoplayer2.source.SampleQueue r0 = r3.primarySampleQueue
            int r0 = r0.getReadIndex()
            int r5 = r5 - r0
            int r4 = java.lang.Math.min(r4, r5)
        L23:
            com.google.android.exoplayer2.source.SampleQueue r5 = r3.primarySampleQueue
            r5.skip(r4)
            r3.maybeNotifyPrimaryTrackFormatChanged()
            return r4
    }
}
