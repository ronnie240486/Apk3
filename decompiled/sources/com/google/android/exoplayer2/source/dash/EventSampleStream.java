package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes.dex */
final class EventSampleStream implements com.google.android.exoplayer2.source.SampleStream {
    private int currentIndex;
    private final com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder eventMessageEncoder;
    private com.google.android.exoplayer2.source.dash.manifest.EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private long pendingSeekPositionUs;
    private final com.google.android.exoplayer2.Format upstreamFormat;

    public EventSampleStream(com.google.android.exoplayer2.source.dash.manifest.EventStream r3, com.google.android.exoplayer2.Format r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r2.upstreamFormat = r4
            r2.eventStream = r3
            com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder r4 = new com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder
            r4.<init>()
            r2.eventMessageEncoder = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.pendingSeekPositionUs = r0
            long[] r4 = r3.presentationTimesUs
            r2.eventTimesUs = r4
            r2.updateEventStream(r3, r5)
            return
    }

    public java.lang.String eventStreamId() {
            r1 = this;
            com.google.android.exoplayer2.source.dash.manifest.EventStream r0 = r1.eventStream
            java.lang.String r0 = r0.id()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(com.google.android.exoplayer2.FormatHolder r7, com.google.android.exoplayer2.decoder.DecoderInputBuffer r8, int r9) {
            r6 = this;
            int r0 = r6.currentIndex
            long[] r1 = r6.eventTimesUs
            int r1 = r1.length
            r2 = 1
            if (r0 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r3 = -4
            r4 = 4
            if (r1 == 0) goto L17
            boolean r5 = r6.eventStreamAppendable
            if (r5 != 0) goto L17
            r8.setFlags(r4)
            return r3
        L17:
            r5 = r9 & 2
            if (r5 != 0) goto L4f
            boolean r5 = r6.isFormatSentDownstream
            if (r5 != 0) goto L20
            goto L4f
        L20:
            if (r1 == 0) goto L24
            r7 = -3
            return r7
        L24:
            r7 = r9 & 1
            if (r7 != 0) goto L2c
            int r7 = r0 + 1
            r6.currentIndex = r7
        L2c:
            r7 = r9 & 4
            if (r7 != 0) goto L45
            com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder r7 = r6.eventMessageEncoder
            com.google.android.exoplayer2.source.dash.manifest.EventStream r9 = r6.eventStream
            com.google.android.exoplayer2.metadata.emsg.EventMessage[] r9 = r9.events
            r9 = r9[r0]
            byte[] r7 = r7.encode(r9)
            int r9 = r7.length
            r8.ensureSpaceForWrite(r9)
            java.nio.ByteBuffer r9 = r8.data
            r9.put(r7)
        L45:
            long[] r7 = r6.eventTimesUs
            r0 = r7[r0]
            r8.timeUs = r0
            r8.setFlags(r2)
            return r3
        L4f:
            com.google.android.exoplayer2.Format r8 = r6.upstreamFormat
            r7.format = r8
            r6.isFormatSentDownstream = r2
            r7 = -5
            return r7
    }

    public void seekToUs(long r5) {
            r4 = this;
            long[] r0 = r4.eventTimesUs
            r1 = 1
            r2 = 0
            int r0 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r0, r5, r1, r2)
            r4.currentIndex = r0
            boolean r3 = r4.eventStreamAppendable
            if (r3 == 0) goto L14
            long[] r3 = r4.eventTimesUs
            int r3 = r3.length
            if (r0 != r3) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L18
            goto L1d
        L18:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1d:
            r4.pendingSeekPositionUs = r5
            return
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long r5) {
            r4 = this;
            int r0 = r4.currentIndex
            long[] r1 = r4.eventTimesUs
            r2 = 1
            r3 = 0
            int r5 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r1, r5, r2, r3)
            int r5 = java.lang.Math.max(r0, r5)
            int r6 = r4.currentIndex
            int r6 = r5 - r6
            r4.currentIndex = r5
            return r6
    }

    public void updateEventStream(com.google.android.exoplayer2.source.dash.manifest.EventStream r9, boolean r10) {
            r8 = this;
            int r0 = r8.currentIndex
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto Lb
            r4 = r1
            goto L11
        Lb:
            long[] r3 = r8.eventTimesUs
            int r0 = r0 + (-1)
            r4 = r3[r0]
        L11:
            r8.eventStreamAppendable = r10
            r8.eventStream = r9
            long[] r9 = r9.presentationTimesUs
            r8.eventTimesUs = r9
            long r6 = r8.pendingSeekPositionUs
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L23
            r8.seekToUs(r6)
            goto L2e
        L23:
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 == 0) goto L2e
            r10 = 0
            int r9 = com.google.android.exoplayer2.util.Util.binarySearchCeil(r9, r4, r10, r10)
            r8.currentIndex = r9
        L2e:
            return
    }
}
