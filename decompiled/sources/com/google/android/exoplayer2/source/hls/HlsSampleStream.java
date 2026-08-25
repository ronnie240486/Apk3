package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
final class HlsSampleStream implements com.google.android.exoplayer2.source.SampleStream {
    private int sampleQueueIndex;
    private final com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper sampleStreamWrapper;
    private final int trackGroupIndex;

    public HlsSampleStream(com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.sampleStreamWrapper = r1
            r0.trackGroupIndex = r2
            r1 = -1
            r0.sampleQueueIndex = r1
            return
    }

    private boolean hasValidSampleQueueIndex() {
            r2 = this;
            int r0 = r2.sampleQueueIndex
            r1 = -1
            if (r0 == r1) goto Ld
            r1 = -3
            if (r0 == r1) goto Ld
            r1 = -2
            if (r0 == r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public void bindSampleQueue() {
            r2 = this;
            int r0 = r2.sampleQueueIndex
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r2.sampleStreamWrapper
            int r1 = r2.trackGroupIndex
            int r0 = r0.bindSampleQueueToSampleStream(r1)
            r2.sampleQueueIndex = r0
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
            r2 = this;
            int r0 = r2.sampleQueueIndex
            r1 = -3
            if (r0 == r1) goto L18
            boolean r0 = r2.hasValidSampleQueueIndex()
            if (r0 == 0) goto L16
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r2.sampleStreamWrapper
            int r1 = r2.sampleQueueIndex
            boolean r0 = r0.isReady(r1)
            if (r0 == 0) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws java.io.IOException {
            r3 = this;
            int r0 = r3.sampleQueueIndex
            r1 = -2
            if (r0 == r1) goto L17
            r1 = -1
            if (r0 != r1) goto Le
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r3.sampleStreamWrapper
            r0.maybeThrowError()
            goto L16
        Le:
            r1 = -3
            if (r0 == r1) goto L16
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r1 = r3.sampleStreamWrapper
            r1.maybeThrowError(r0)
        L16:
            return
        L17:
            com.google.android.exoplayer2.source.hls.SampleQueueMappingException r0 = new com.google.android.exoplayer2.source.hls.SampleQueueMappingException
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r1 = r3.sampleStreamWrapper
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r1.getTrackGroups()
            int r2 = r3.trackGroupIndex
            com.google.android.exoplayer2.source.TrackGroup r1 = r1.get(r2)
            r2 = 0
            com.google.android.exoplayer2.Format r1 = r1.getFormat(r2)
            java.lang.String r1 = r1.sampleMimeType
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(com.google.android.exoplayer2.FormatHolder r3, com.google.android.exoplayer2.decoder.DecoderInputBuffer r4, int r5) {
            r2 = this;
            int r0 = r2.sampleQueueIndex
            r1 = -3
            if (r0 != r1) goto Lb
            r3 = 4
            r4.addFlag(r3)
            r3 = -4
            return r3
        Lb:
            boolean r0 = r2.hasValidSampleQueueIndex()
            if (r0 == 0) goto L19
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r2.sampleStreamWrapper
            int r1 = r2.sampleQueueIndex
            int r1 = r0.readData(r1, r3, r4, r5)
        L19:
            return r1
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long r3) {
            r2 = this;
            boolean r0 = r2.hasValidSampleQueueIndex()
            if (r0 == 0) goto Lf
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r2.sampleStreamWrapper
            int r1 = r2.sampleQueueIndex
            int r3 = r0.skipData(r1, r3)
            goto L10
        Lf:
            r3 = 0
        L10:
            return r3
    }

    public void unbindSampleQueue() {
            r3 = this;
            int r0 = r3.sampleQueueIndex
            r1 = -1
            if (r0 == r1) goto Le
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r3.sampleStreamWrapper
            int r2 = r3.trackGroupIndex
            r0.unbindSampleQueue(r2)
            r3.sampleQueueIndex = r1
        Le:
            return
    }
}
