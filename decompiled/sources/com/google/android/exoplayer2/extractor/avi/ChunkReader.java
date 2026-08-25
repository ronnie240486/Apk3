package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes2.dex */
final class ChunkReader {
    private static final int CHUNK_TYPE_AUDIO = 1651965952;
    private static final int CHUNK_TYPE_VIDEO_COMPRESSED = 1667497984;
    private static final int CHUNK_TYPE_VIDEO_UNCOMPRESSED = 1650720768;
    private static final int INITIAL_INDEX_SIZE = 512;
    private final int alternativeChunkId;
    private int bytesRemainingInCurrentChunk;
    private final int chunkId;
    private int currentChunkIndex;
    private int currentChunkSize;
    private final long durationUs;
    private int indexChunkCount;
    private int indexSize;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;
    private final int streamHeaderChunkCount;
    public final com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

    public ChunkReader(int r3, int r4, long r5, int r7, com.google.android.exoplayer2.extractor.TrackOutput r8) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r1 = 2
            if (r4 == r0) goto Lb
            if (r4 != r1) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r2.durationUs = r5
            r2.streamHeaderChunkCount = r7
            r2.trackOutput = r8
            if (r4 != r1) goto L19
            r5 = 1667497984(0x63640000, float:4.2058576E21)
            goto L1b
        L19:
            r5 = 1651965952(0x62770000, float:1.13908645E21)
        L1b:
            int r5 = getChunkIdFourCc(r3, r5)
            r2.chunkId = r5
            if (r4 != r1) goto L2a
            r4 = 1650720768(0x62640000, float:1.0514644E21)
            int r3 = getChunkIdFourCc(r3, r4)
            goto L2b
        L2a:
            r3 = -1
        L2b:
            r2.alternativeChunkId = r3
            r3 = 512(0x200, float:7.17E-43)
            long[] r4 = new long[r3]
            r2.keyFrameOffsets = r4
            int[] r3 = new int[r3]
            r2.keyFrameIndices = r3
            return
    }

    private static int getChunkIdFourCc(int r1, int r2) {
            int r0 = r1 / 10
            int r1 = r1 % 10
            int r1 = r1 + 48
            int r1 = r1 << 8
            int r0 = r0 + 48
            r1 = r1 | r0
            r1 = r1 | r2
            return r1
    }

    private long getChunkTimestampUs(int r5) {
            r4 = this;
            long r0 = r4.durationUs
            long r2 = (long) r5
            long r0 = r0 * r2
            int r5 = r4.streamHeaderChunkCount
            long r2 = (long) r5
            long r0 = r0 / r2
            return r0
    }

    private com.google.android.exoplayer2.extractor.SeekPoint getSeekPoint(int r7) {
            r6 = this;
            com.google.android.exoplayer2.extractor.SeekPoint r0 = new com.google.android.exoplayer2.extractor.SeekPoint
            int[] r1 = r6.keyFrameIndices
            r1 = r1[r7]
            long r1 = (long) r1
            long r3 = r6.getFrameDurationUs()
            long r1 = r1 * r3
            long[] r3 = r6.keyFrameOffsets
            r4 = r3[r7]
            r0.<init>(r1, r4)
            return r0
    }

    public void advanceCurrentChunk() {
            r1 = this;
            int r0 = r1.currentChunkIndex
            int r0 = r0 + 1
            r1.currentChunkIndex = r0
            return
    }

    public void appendKeyFrameToIndex(long r3) {
            r2 = this;
            int r0 = r2.indexSize
            int[] r1 = r2.keyFrameIndices
            int r1 = r1.length
            if (r0 != r1) goto L21
            long[] r0 = r2.keyFrameOffsets
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            long[] r0 = java.util.Arrays.copyOf(r0, r1)
            r2.keyFrameOffsets = r0
            int[] r0 = r2.keyFrameIndices
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r2.keyFrameIndices = r0
        L21:
            long[] r0 = r2.keyFrameOffsets
            int r1 = r2.indexSize
            r0[r1] = r3
            int[] r3 = r2.keyFrameIndices
            int r4 = r2.indexChunkCount
            r3[r1] = r4
            int r1 = r1 + 1
            r2.indexSize = r1
            return
    }

    public void compactIndex() {
            r2 = this;
            long[] r0 = r2.keyFrameOffsets
            int r1 = r2.indexSize
            long[] r0 = java.util.Arrays.copyOf(r0, r1)
            r2.keyFrameOffsets = r0
            int[] r0 = r2.keyFrameIndices
            int r1 = r2.indexSize
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r2.keyFrameIndices = r0
            return
    }

    public long getCurrentChunkTimestampUs() {
            r2 = this;
            int r0 = r2.currentChunkIndex
            long r0 = r2.getChunkTimestampUs(r0)
            return r0
    }

    public long getFrameDurationUs() {
            r2 = this;
            r0 = 1
            long r0 = r2.getChunkTimestampUs(r0)
            return r0
    }

    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r3) {
            r2 = this;
            long r0 = r2.getFrameDurationUs()
            long r3 = r3 / r0
            int r4 = (int) r3
            int[] r3 = r2.keyFrameIndices
            r0 = 1
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r3, r4, r0, r0)
            int[] r1 = r2.keyFrameIndices
            r1 = r1[r3]
            if (r1 != r4) goto L1d
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r4 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r3 = r2.getSeekPoint(r3)
            r4.<init>(r3)
            return r4
        L1d:
            com.google.android.exoplayer2.extractor.SeekPoint r4 = r2.getSeekPoint(r3)
            int r3 = r3 + r0
            long[] r0 = r2.keyFrameOffsets
            int r0 = r0.length
            if (r3 >= r0) goto L31
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r0 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r3 = r2.getSeekPoint(r3)
            r0.<init>(r4, r3)
            return r0
        L31:
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r3 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r3.<init>(r4)
            return r3
    }

    public boolean handlesChunkId(int r2) {
            r1 = this;
            int r0 = r1.chunkId
            if (r0 == r2) goto Lb
            int r0 = r1.alternativeChunkId
            if (r0 != r2) goto L9
            goto Lb
        L9:
            r2 = 0
            goto Lc
        Lb:
            r2 = 1
        Lc:
            return r2
    }

    public void incrementIndexChunkCount() {
            r1 = this;
            int r0 = r1.indexChunkCount
            int r0 = r0 + 1
            r1.indexChunkCount = r0
            return
    }

    public boolean isAudio() {
            r2 = this;
            int r0 = r2.chunkId
            r1 = 1651965952(0x62770000, float:1.13908645E21)
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isCurrentFrameAKeyFrame() {
            r2 = this;
            int[] r0 = r2.keyFrameIndices
            int r1 = r2.currentChunkIndex
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isVideo() {
            r2 = this;
            int r0 = r2.chunkId
            r1 = 1667497984(0x63640000, float:4.2058576E21)
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean onChunkData(com.google.android.exoplayer2.extractor.ExtractorInput r11) throws java.io.IOException {
            r10 = this;
            int r0 = r10.bytesRemainingInCurrentChunk
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r10.trackOutput
            r2 = 0
            int r11 = r1.sampleData(r11, r0, r2)
            int r0 = r0 - r11
            r10.bytesRemainingInCurrentChunk = r0
            if (r0 != 0) goto Lf
            r2 = 1
        Lf:
            if (r2 == 0) goto L29
            int r11 = r10.currentChunkSize
            if (r11 <= 0) goto L26
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r10.trackOutput
            long r4 = r10.getCurrentChunkTimestampUs()
            boolean r6 = r10.isCurrentFrameAKeyFrame()
            int r7 = r10.currentChunkSize
            r8 = 0
            r9 = 0
            r3.sampleMetadata(r4, r6, r7, r8, r9)
        L26:
            r10.advanceCurrentChunk()
        L29:
            return r2
    }

    public void onChunkStart(int r1) {
            r0 = this;
            r0.currentChunkSize = r1
            r0.bytesRemainingInCurrentChunk = r1
            return
    }

    public void seekToPosition(long r3) {
            r2 = this;
            int r0 = r2.indexSize
            if (r0 != 0) goto L8
            r3 = 0
            r2.currentChunkIndex = r3
            goto L15
        L8:
            long[] r0 = r2.keyFrameOffsets
            r1 = 1
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
            int[] r4 = r2.keyFrameIndices
            r3 = r4[r3]
            r2.currentChunkIndex = r3
        L15:
            return
    }
}
