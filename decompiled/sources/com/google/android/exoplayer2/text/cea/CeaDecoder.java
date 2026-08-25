package com.google.android.exoplayer2.text.cea;

/* JADX INFO: loaded from: classes3.dex */
abstract class CeaDecoder implements com.google.android.exoplayer2.text.SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer> availableInputBuffers;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> availableOutputBuffers;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer dequeuedInputBuffer;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer> queuedInputBuffers;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.CeaDecoder$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CeaInputBuffer extends com.google.android.exoplayer2.text.SubtitleInputBuffer implements java.lang.Comparable<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer> {
        private long queuedInputBufferCount;

        private CeaInputBuffer() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ CeaInputBuffer(com.google.android.exoplayer2.text.cea.CeaDecoder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ long access$102(com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer r0, long r1) {
                r0.queuedInputBufferCount = r1
                return r1
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer r9) {
                r8 = this;
                boolean r0 = r8.isEndOfStream()
                boolean r1 = r9.isEndOfStream()
                r2 = 1
                r3 = -1
                if (r0 == r1) goto L15
                boolean r9 = r8.isEndOfStream()
                if (r9 == 0) goto L13
                goto L14
            L13:
                r2 = -1
            L14:
                return r2
            L15:
                long r0 = r8.timeUs
                long r4 = r9.timeUs
                long r0 = r0 - r4
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto L2b
                long r0 = r8.queuedInputBufferCount
                long r6 = r9.queuedInputBufferCount
                long r0 = r0 - r6
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 != 0) goto L2b
                r9 = 0
                return r9
            L2b:
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 <= 0) goto L30
                goto L31
            L30:
                r2 = -1
            L31:
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer r1) {
                r0 = this;
                com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r1 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CeaOutputBuffer extends com.google.android.exoplayer2.text.SubtitleOutputBuffer {
        private com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaOutputBuffer> owner;

        public CeaOutputBuffer(com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaOutputBuffer> r1) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                return
        }

        @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
        public final void release() {
                r1 = this;
                com.google.android.exoplayer2.decoder.DecoderOutputBuffer$Owner<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaOutputBuffer> r0 = r1.owner
                r0.releaseOutputBuffer(r1)
                return
        }
    }

    public CeaDecoder() {
            r5 = this;
            r5.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r5.availableInputBuffers = r0
            r0 = 0
            r1 = 0
        Lc:
            r2 = 10
            if (r1 >= r2) goto L1e
            java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r2 = r5.availableInputBuffers
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r3 = new com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer
            r4 = 0
            r3.<init>(r4)
            r2.add(r3)
            int r1 = r1 + 1
            goto Lc
        L1e:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r5.availableOutputBuffers = r1
        L25:
            r1 = 2
            if (r0 >= r1) goto L3a
            java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r1 = r5.availableOutputBuffers
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaOutputBuffer r2 = new com.google.android.exoplayer2.text.cea.CeaDecoder$CeaOutputBuffer
            com.google.android.exoplayer2.text.cea.CeaDecoder$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.text.cea.CeaDecoder$$ExternalSyntheticLambda0
            r3.<init>(r5)
            r2.<init>(r3)
            r1.add(r2)
            int r0 = r0 + 1
            goto L25
        L3a:
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            r0.<init>()
            r5.queuedInputBuffers = r0
            return
    }

    private void releaseInputBuffer(com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer r2) {
            r1 = this;
            r2.clear()
            java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r1.availableInputBuffers
            r0.add(r2)
            return
    }

    public abstract com.google.android.exoplayer2.text.Subtitle createSubtitle();

    public abstract void decode(com.google.android.exoplayer2.text.SubtitleInputBuffer r1);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r1 = this;
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = r1.dequeuedInputBuffer
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r1.availableInputBuffers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            r0 = 0
            return r0
        L14:
            java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r1.availableInputBuffers
            java.lang.Object r0 = r0.pollFirst()
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r0
            r1.dequeuedInputBuffer = r0
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = r1.dequeueInputBuffer()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r9 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r9.availableOutputBuffers
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r9.queuedInputBuffers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L80
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r9.queuedInputBuffers
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r0
            long r2 = r0.timeUs
            long r4 = r9.playbackPositionUs
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L80
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r9.queuedInputBuffers
            java.lang.Object r0 = r0.poll()
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r0
            boolean r2 = r0.isEndOfStream()
            if (r2 == 0) goto L52
            java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r1 = r9.availableOutputBuffers
            java.lang.Object r1 = r1.pollFirst()
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r1 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r1 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r1
            r2 = 4
            r1.addFlag(r2)
            r9.releaseInputBuffer(r0)
            return r1
        L52:
            r9.decode(r0)
            boolean r2 = r9.isNewSubtitleDataAvailable()
            if (r2 == 0) goto L7c
            com.google.android.exoplayer2.text.Subtitle r6 = r9.createSubtitle()
            java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r1 = r9.availableOutputBuffers
            java.lang.Object r1 = r1.pollFirst()
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r1 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r1 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r1
            long r4 = r0.timeUs
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
            r3.setContent(r4, r6, r7)
            r9.releaseInputBuffer(r0)
            return r1
        L7c:
            r9.releaseInputBuffer(r0)
            goto La
        L80:
            return r1
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer() throws com.google.android.exoplayer2.decoder.DecoderException {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = r1.dequeueOutputBuffer()
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
            r2 = this;
            r0 = 0
            r2.queuedInputBufferCount = r0
            r2.playbackPositionUs = r0
        L6:
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r2.queuedInputBuffers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r2.queuedInputBuffers
            java.lang.Object r0 = r0.poll()
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r0
            r2.releaseInputBuffer(r0)
            goto L6
        L20:
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = r2.dequeuedInputBuffer
            if (r0 == 0) goto L2a
            r2.releaseInputBuffer(r0)
            r0 = 0
            r2.dequeuedInputBuffer = r0
        L2a:
            return
    }

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.text.SubtitleOutputBuffer getAvailableOutputBuffer() {
            r1 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r1.availableOutputBuffers
            java.lang.Object r0 = r0.pollFirst()
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r0
            return r0
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public abstract java.lang.String getName();

    public final long getPositionUs() {
            r2 = this;
            long r0 = r2.playbackPositionUs
            return r0
    }

    public abstract boolean isNewSubtitleDataAvailable();

    /* JADX WARN: Can't rename method to resolve collision */
    public void queueInputBuffer(com.google.android.exoplayer2.text.SubtitleInputBuffer r5) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r4 = this;
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r0 = r4.dequeuedInputBuffer
            if (r5 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer r5 = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) r5
            boolean r0 = r5.isDecodeOnly()
            if (r0 == 0) goto L16
            r4.releaseInputBuffer(r5)
            goto L25
        L16:
            long r0 = r4.queuedInputBufferCount
            r2 = 1
            long r2 = r2 + r0
            r4.queuedInputBufferCount = r2
            com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer.access$102(r5, r0)
            java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder$CeaInputBuffer> r0 = r4.queuedInputBuffers
            r0.add(r5)
        L25:
            r5 = 0
            r4.dequeuedInputBuffer = r5
            return
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(com.google.android.exoplayer2.text.SubtitleInputBuffer r1) throws com.google.android.exoplayer2.decoder.DecoderException {
            r0 = this;
            com.google.android.exoplayer2.text.SubtitleInputBuffer r1 = (com.google.android.exoplayer2.text.SubtitleInputBuffer) r1
            r0.queueInputBuffer(r1)
            return
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
            r0 = this;
            return
    }

    public final void releaseOutputBuffer(com.google.android.exoplayer2.text.SubtitleOutputBuffer r2) {
            r1 = this;
            r2.clear()
            java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r1.availableOutputBuffers
            r0.add(r2)
            return
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long r1) {
            r0 = this;
            r0.playbackPositionUs = r1
            return
    }
}
