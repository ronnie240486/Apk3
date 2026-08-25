package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes3.dex */
public final class ExoplayerCuesDecoder implements com.google.android.exoplayer2.text.SubtitleDecoder {
    private static final int INPUT_BUFFER_AVAILABLE = 0;
    private static final int INPUT_BUFFER_DEQUEUED = 1;
    private static final int INPUT_BUFFER_QUEUED = 2;
    private static final int OUTPUT_BUFFERS_COUNT = 2;
    private final java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> availableOutputBuffers;
    private final com.google.android.exoplayer2.text.CueDecoder cueDecoder;
    private final com.google.android.exoplayer2.text.SubtitleInputBuffer inputBuffer;
    private int inputBufferState;
    private boolean released;


    /* JADX INFO: loaded from: classes2.dex */
    public static final class SingleEventSubtitle implements com.google.android.exoplayer2.text.Subtitle {
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> cues;
        private final long timeUs;

        public SingleEventSubtitle(long r1, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> r3) {
                r0 = this;
                r0.<init>()
                r0.timeUs = r1
                r0.cues = r3
                return
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long r4) {
                r3 = this;
                long r0 = r3.timeUs
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L9
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> r4 = r3.cues
                goto Ld
            L9:
                com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of()
            Ld:
                return r4
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public long getEventTime(int r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 1
                goto L5
            L4:
                r3 = 0
            L5:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
                long r0 = r2.timeUs
                return r0
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getEventTimeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getNextEventTimeIndex(long r4) {
                r3 = this;
                long r0 = r3.timeUs
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 <= 0) goto L8
                r4 = 0
                goto L9
            L8:
                r4 = -1
            L9:
                return r4
        }
    }

    public ExoplayerCuesDecoder() {
            r4 = this;
            r4.<init>()
            com.google.android.exoplayer2.text.CueDecoder r0 = new com.google.android.exoplayer2.text.CueDecoder
            r0.<init>()
            r4.cueDecoder = r0
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = new com.google.android.exoplayer2.text.SubtitleInputBuffer
            r0.<init>()
            r4.inputBuffer = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r4.availableOutputBuffers = r0
            r0 = 0
            r1 = 0
        L1a:
            r2 = 2
            if (r1 >= r2) goto L2a
            java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r2 = r4.availableOutputBuffers
            com.google.android.exoplayer2.text.ExoplayerCuesDecoder$1 r3 = new com.google.android.exoplayer2.text.ExoplayerCuesDecoder$1
            r3.<init>(r4)
            r2.addFirst(r3)
            int r1 = r1 + 1
            goto L1a
        L2a:
            r4.inputBufferState = r0
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.text.ExoplayerCuesDecoder r0, com.google.android.exoplayer2.text.SubtitleOutputBuffer r1) {
            r0.releaseOutputBuffer(r1)
            return
    }

    private void releaseOutputBuffer(com.google.android.exoplayer2.text.SubtitleOutputBuffer r4) {
            r3 = this;
            java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r3.availableOutputBuffers
            int r0 = r0.size()
            r1 = 1
            r2 = 2
            if (r0 >= r2) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r3.availableOutputBuffers
            boolean r0 = r0.contains(r4)
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r4.clear()
            java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r3.availableOutputBuffers
            r0.addFirst(r4)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r2 = this;
            boolean r0 = r2.released
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r0 = r2.inputBufferState
            if (r0 == 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r2.inputBufferState = r1
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = r2.inputBuffer
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
            r7 = this;
            boolean r0 = r7.released
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r0 = r7.inputBufferState
            r1 = 2
            if (r0 != r1) goto L58
            java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r7.availableOutputBuffers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            goto L58
        L15:
            java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> r0 = r7.availableOutputBuffers
            java.lang.Object r0 = r0.removeFirst()
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r0
            com.google.android.exoplayer2.text.SubtitleInputBuffer r1 = r7.inputBuffer
            boolean r1 = r1.isEndOfStream()
            if (r1 == 0) goto L2a
            r1 = 4
            r0.addFlag(r1)
            goto L4f
        L2a:
            com.google.android.exoplayer2.text.ExoplayerCuesDecoder$SingleEventSubtitle r4 = new com.google.android.exoplayer2.text.ExoplayerCuesDecoder$SingleEventSubtitle
            com.google.android.exoplayer2.text.SubtitleInputBuffer r1 = r7.inputBuffer
            long r2 = r1.timeUs
            com.google.android.exoplayer2.text.CueDecoder r5 = r7.cueDecoder
            java.nio.ByteBuffer r1 = r1.data
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            byte[] r1 = r1.array()
            com.google.common.collect.ImmutableList r1 = r5.decode(r1)
            r4.<init>(r2, r1)
            com.google.android.exoplayer2.text.SubtitleInputBuffer r1 = r7.inputBuffer
            long r2 = r1.timeUs
            r5 = 0
            r1 = r0
            r1.setContent(r2, r4, r5)
        L4f:
            com.google.android.exoplayer2.text.SubtitleInputBuffer r1 = r7.inputBuffer
            r1.clear()
            r1 = 0
            r7.inputBufferState = r1
            return r0
        L58:
            r0 = 0
            return r0
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
            r1 = this;
            boolean r0 = r1.released
            r0 = r0 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = r1.inputBuffer
            r0.clear()
            r0 = 0
            r1.inputBufferState = r0
            return
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "ExoplayerCuesDecoder"
            return r0
    }

    /* JADX INFO: renamed from: queueInputBuffer, reason: avoid collision after fix types in other method */
    public void queueInputBuffer2(com.google.android.exoplayer2.text.SubtitleInputBuffer r4) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
            r3 = this;
            boolean r0 = r3.released
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            int r0 = r3.inputBufferState
            r2 = 0
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = r3.inputBuffer
            if (r0 != r4) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r4 = 2
            r3.inputBufferState = r4
            return
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(com.google.android.exoplayer2.text.SubtitleInputBuffer r1) throws com.google.android.exoplayer2.decoder.DecoderException {
            r0 = this;
            com.google.android.exoplayer2.text.SubtitleInputBuffer r1 = (com.google.android.exoplayer2.text.SubtitleInputBuffer) r1
            r0.queueInputBuffer2(r1)
            return
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
            r1 = this;
            r0 = 1
            r1.released = r0
            return
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long r1) {
            r0 = this;
            return
    }
}
