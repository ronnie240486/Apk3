package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class TrueHdSampleRechunker {
    private int chunkFlags;
    private int chunkOffset;
    private int chunkSampleCount;
    private int chunkSize;
    private long chunkTimeUs;
    private boolean foundSyncframe;
    private final byte[] syncframePrefix;

    public TrueHdSampleRechunker() {
            r1 = this;
            r1.<init>()
            r0 = 10
            byte[] r0 = new byte[r0]
            r1.syncframePrefix = r0
            return
    }

    public void outputPendingSampleMetadata(com.google.android.exoplayer2.extractor.TrackOutput r9, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r10) {
            r8 = this;
            int r0 = r8.chunkSampleCount
            if (r0 <= 0) goto L14
            long r2 = r8.chunkTimeUs
            int r4 = r8.chunkFlags
            int r5 = r8.chunkSize
            int r6 = r8.chunkOffset
            r1 = r9
            r7 = r10
            r1.sampleMetadata(r2, r4, r5, r6, r7)
            r9 = 0
            r8.chunkSampleCount = r9
        L14:
            return
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.foundSyncframe = r0
            r1.chunkSampleCount = r0
            return
    }

    public void sampleMetadata(com.google.android.exoplayer2.extractor.TrackOutput r4, long r5, int r7, int r8, int r9, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r10) {
            r3 = this;
            int r0 = r3.chunkOffset
            int r1 = r8 + r9
            r2 = 0
            if (r0 > r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "TrueHD chunk samples must be contiguous in the sample queue."
            com.google.android.exoplayer2.util.Assertions.checkState(r0, r1)
            boolean r0 = r3.foundSyncframe
            if (r0 != 0) goto L14
            return
        L14:
            int r0 = r3.chunkSampleCount
            int r1 = r0 + 1
            r3.chunkSampleCount = r1
            if (r0 != 0) goto L22
            r3.chunkTimeUs = r5
            r3.chunkFlags = r7
            r3.chunkSize = r2
        L22:
            int r5 = r3.chunkSize
            int r5 = r5 + r8
            r3.chunkSize = r5
            r3.chunkOffset = r9
            r5 = 16
            if (r1 < r5) goto L30
            r3.outputPendingSampleMetadata(r4, r10)
        L30:
            return
    }

    public void startSample(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.foundSyncframe
            if (r0 == 0) goto L5
            return
        L5:
            byte[] r0 = r3.syncframePrefix
            r1 = 0
            r2 = 10
            r4.peekFully(r0, r1, r2)
            r4.resetPeekPosition()
            byte[] r4 = r3.syncframePrefix
            int r4 = com.google.android.exoplayer2.audio.Ac3Util.parseTrueHdSyncframeAudioSampleCount(r4)
            if (r4 != 0) goto L19
            return
        L19:
            r4 = 1
            r3.foundSyncframe = r4
            return
    }
}
