package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes.dex */
public final class TextRenderer extends com.google.android.exoplayer2.BaseRenderer implements android.os.Handler.Callback {
    private static final int MSG_UPDATE_OUTPUT = 0;
    private static final int REPLACEMENT_STATE_NONE = 0;
    private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
    private static final java.lang.String TAG = "TextRenderer";

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.SubtitleDecoder decoder;
    private final com.google.android.exoplayer2.text.SubtitleDecoderFactory decoderFactory;
    private int decoderReplacementState;
    private long finalStreamEndPositionUs;
    private final com.google.android.exoplayer2.FormatHolder formatHolder;
    private boolean inputStreamEnded;
    private long lastRendererPositionUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.SubtitleInputBuffer nextInputBuffer;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.SubtitleOutputBuffer nextSubtitle;
    private int nextSubtitleEventIndex;
    private final com.google.android.exoplayer2.text.TextOutput output;

    @androidx.annotation.Nullable
    private final android.os.Handler outputHandler;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format streamFormat;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitle;
    private boolean waitingForKeyFrame;

    public TextRenderer(com.google.android.exoplayer2.text.TextOutput r2, @androidx.annotation.Nullable android.os.Looper r3) {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleDecoderFactory r0 = com.google.android.exoplayer2.text.SubtitleDecoderFactory.DEFAULT
            r1.<init>(r2, r3, r0)
            return
    }

    public TextRenderer(com.google.android.exoplayer2.text.TextOutput r2, @androidx.annotation.Nullable android.os.Looper r3, com.google.android.exoplayer2.text.SubtitleDecoderFactory r4) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.text.TextOutput r2 = (com.google.android.exoplayer2.text.TextOutput) r2
            r1.output = r2
            if (r3 != 0) goto L10
            r2 = 0
            goto L14
        L10:
            android.os.Handler r2 = com.google.android.exoplayer2.util.Util.createHandler(r3, r1)
        L14:
            r1.outputHandler = r2
            r1.decoderFactory = r4
            com.google.android.exoplayer2.FormatHolder r2 = new com.google.android.exoplayer2.FormatHolder
            r2.<init>()
            r1.formatHolder = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.finalStreamEndPositionUs = r2
            r1.outputStreamOffsetUs = r2
            r1.lastRendererPositionUs = r2
            return
    }

    private void clearOutput() {
            r4 = this;
            com.google.android.exoplayer2.text.CueGroup r0 = new com.google.android.exoplayer2.text.CueGroup
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            long r2 = r4.lastRendererPositionUs
            long r2 = r4.getPresentationTimeUs(r2)
            r0.<init>(r1, r2)
            r4.updateOutput(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"subtitle"})
    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getCurrentEventTimeUs(long r2) {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = r1.subtitle
            int r2 = r0.getNextEventTimeIndex(r2)
            if (r2 == 0) goto L2a
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r3 = r1.subtitle
            int r3 = r3.getEventTimeCount()
            if (r3 != 0) goto L11
            goto L2a
        L11:
            r3 = -1
            if (r2 != r3) goto L21
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r2 = r1.subtitle
            int r3 = r2.getEventTimeCount()
            int r3 = r3 + (-1)
            long r2 = r2.getEventTime(r3)
            goto L29
        L21:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r3 = r1.subtitle
            int r2 = r2 + (-1)
            long r2 = r3.getEventTime(r2)
        L29:
            return r2
        L2a:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r2 = r1.subtitle
            long r2 = r2.timeUs
            return r2
    }

    private long getNextEventTime() {
            r4 = this;
            int r0 = r4.nextSubtitleEventIndex
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = -1
            if (r0 != r3) goto Lb
            return r1
        Lb:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = r4.subtitle
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            int r0 = r4.nextSubtitleEventIndex
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r3 = r4.subtitle
            int r3 = r3.getEventTimeCount()
            if (r0 < r3) goto L1b
            goto L23
        L1b:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = r4.subtitle
            int r1 = r4.nextSubtitleEventIndex
            long r1 = r0.getEventTime(r1)
        L23:
            return r1
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getPresentationTimeUs(long r8) {
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
            long r4 = r7.outputStreamOffsetUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r0 = r7.outputStreamOffsetUs
            long r8 = r8 - r0
            return r8
    }

    private void handleDecoderError(com.google.android.exoplayer2.text.SubtitleDecoderException r3) {
            r2 = this;
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.google.android.exoplayer2.Format r1 = r2.streamFormat
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TextRenderer"
            com.google.android.exoplayer2.util.Log.e(r1, r0, r3)
            r2.clearOutput()
            r2.replaceDecoder()
            return
    }

    private void initDecoder() {
            r2 = this;
            r0 = 1
            r2.waitingForKeyFrame = r0
            com.google.android.exoplayer2.text.SubtitleDecoderFactory r0 = r2.decoderFactory
            com.google.android.exoplayer2.Format r1 = r2.streamFormat
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.Format r1 = (com.google.android.exoplayer2.Format) r1
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = r0.createDecoder(r1)
            r2.decoder = r0
            return
    }

    private void invokeUpdateOutputInternal(com.google.android.exoplayer2.text.CueGroup r3) {
            r2 = this;
            com.google.android.exoplayer2.text.TextOutput r0 = r2.output
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> r1 = r3.cues
            r0.onCues(r1)
            com.google.android.exoplayer2.text.TextOutput r0 = r2.output
            r0.onCues(r3)
            return
    }

    private void releaseBuffers() {
            r2 = this;
            r0 = 0
            r2.nextInputBuffer = r0
            r1 = -1
            r2.nextSubtitleEventIndex = r1
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r1 = r2.subtitle
            if (r1 == 0) goto Lf
            r1.release()
            r2.subtitle = r0
        Lf:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r1 = r2.nextSubtitle
            if (r1 == 0) goto L18
            r1.release()
            r2.nextSubtitle = r0
        L18:
            return
    }

    private void releaseDecoder() {
            r1 = this;
            r1.releaseBuffers()
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = r1.decoder
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = (com.google.android.exoplayer2.text.SubtitleDecoder) r0
            r0.release()
            r0 = 0
            r1.decoder = r0
            r0 = 0
            r1.decoderReplacementState = r0
            return
    }

    private void replaceDecoder() {
            r0 = this;
            r0.releaseDecoder()
            r0.initDecoder()
            return
    }

    private void updateOutput(com.google.android.exoplayer2.text.CueGroup r3) {
            r2 = this;
            android.os.Handler r0 = r2.outputHandler
            if (r0 == 0) goto Ld
            r1 = 0
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            goto L10
        Ld:
            r2.invokeUpdateOutputInternal(r3)
        L10:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "TextRenderer"
            return r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r0 = r2.what
            if (r0 != 0) goto Ld
            java.lang.Object r2 = r2.obj
            com.google.android.exoplayer2.text.CueGroup r2 = (com.google.android.exoplayer2.text.CueGroup) r2
            r1.invokeUpdateOutputInternal(r2)
            r2 = 1
            return r2
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
            r1 = this;
            boolean r0 = r1.outputStreamEnded
            return r0
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onDisabled() {
            r2 = this;
            r0 = 0
            r2.streamFormat = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.finalStreamEndPositionUs = r0
            r2.clearOutput()
            r2.outputStreamOffsetUs = r0
            r2.lastRendererPositionUs = r0
            r2.releaseDecoder()
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onPositionReset(long r1, boolean r3) {
            r0 = this;
            r0.lastRendererPositionUs = r1
            r0.clearOutput()
            r1 = 0
            r0.inputStreamEnded = r1
            r0.outputStreamEnded = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.finalStreamEndPositionUs = r1
            int r1 = r0.decoderReplacementState
            if (r1 == 0) goto L19
            r0.replaceDecoder()
            goto L27
        L19:
            r0.releaseBuffers()
            com.google.android.exoplayer2.text.SubtitleDecoder r1 = r0.decoder
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.text.SubtitleDecoder r1 = (com.google.android.exoplayer2.text.SubtitleDecoder) r1
            r1.flush()
        L27:
            return
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStreamChanged(com.google.android.exoplayer2.Format[] r1, long r2, long r4) {
            r0 = this;
            r0.outputStreamOffsetUs = r4
            r2 = 0
            r1 = r1[r2]
            r0.streamFormat = r1
            com.google.android.exoplayer2.text.SubtitleDecoder r1 = r0.decoder
            if (r1 == 0) goto Lf
            r1 = 1
            r0.decoderReplacementState = r1
            goto L12
        Lf:
            r0.initDecoder()
        L12:
            return
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long r9, long r11) {
            r8 = this;
            r8.lastRendererPositionUs = r9
            boolean r11 = r8.isCurrentStreamFinal()
            r12 = 1
            if (r11 == 0) goto L1d
            long r0 = r8.finalStreamEndPositionUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L1d
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 < 0) goto L1d
            r8.releaseBuffers()
            r8.outputStreamEnded = r12
        L1d:
            boolean r11 = r8.outputStreamEnded
            if (r11 == 0) goto L22
            return
        L22:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r11 = r8.nextSubtitle
            if (r11 != 0) goto L47
            com.google.android.exoplayer2.text.SubtitleDecoder r11 = r8.decoder
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            com.google.android.exoplayer2.text.SubtitleDecoder r11 = (com.google.android.exoplayer2.text.SubtitleDecoder) r11
            r11.setPositionUs(r9)
            com.google.android.exoplayer2.text.SubtitleDecoder r11 = r8.decoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L42
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L42
            com.google.android.exoplayer2.text.SubtitleDecoder r11 = (com.google.android.exoplayer2.text.SubtitleDecoder) r11     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L42
            java.lang.Object r11 = r11.dequeueOutputBuffer()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L42
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r11 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r11     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L42
            r8.nextSubtitle = r11     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L42
            goto L47
        L42:
            r9 = move-exception
            r8.handleDecoderError(r9)
            return
        L47:
            int r11 = r8.getState()
            r0 = 2
            if (r11 == r0) goto L4f
            return
        L4f:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r11 = r8.subtitle
            r1 = 0
            if (r11 == 0) goto L68
            long r2 = r8.getNextEventTime()
            r11 = 0
        L59:
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L69
            int r11 = r8.nextSubtitleEventIndex
            int r11 = r11 + r12
            r8.nextSubtitleEventIndex = r11
            long r2 = r8.getNextEventTime()
            r11 = 1
            goto L59
        L68:
            r11 = 0
        L69:
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r2 = r8.nextSubtitle
            r3 = 0
            if (r2 == 0) goto La9
            boolean r4 = r2.isEndOfStream()
            if (r4 == 0) goto L91
            if (r11 != 0) goto La9
            long r4 = r8.getNextEventTime()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto La9
            int r2 = r8.decoderReplacementState
            if (r2 != r0) goto L8b
            r8.replaceDecoder()
            goto La9
        L8b:
            r8.releaseBuffers()
            r8.outputStreamEnded = r12
            goto La9
        L91:
            long r4 = r2.timeUs
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 > 0) goto La9
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r11 = r8.subtitle
            if (r11 == 0) goto L9e
            r11.release()
        L9e:
            int r11 = r2.getNextEventTimeIndex(r9)
            r8.nextSubtitleEventIndex = r11
            r8.subtitle = r2
            r8.nextSubtitle = r3
            r11 = 1
        La9:
            if (r11 == 0) goto Lc6
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r11 = r8.subtitle
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            long r4 = r8.getCurrentEventTimeUs(r9)
            long r4 = r8.getPresentationTimeUs(r4)
            com.google.android.exoplayer2.text.CueGroup r11 = new com.google.android.exoplayer2.text.CueGroup
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r2 = r8.subtitle
            java.util.List r9 = r2.getCues(r9)
            r11.<init>(r9, r4)
            r8.updateOutput(r11)
        Lc6:
            int r9 = r8.decoderReplacementState
            if (r9 != r0) goto Lcb
            return
        Lcb:
            boolean r9 = r8.inputStreamEnded     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r9 != 0) goto L148
            com.google.android.exoplayer2.text.SubtitleInputBuffer r9 = r8.nextInputBuffer     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r9 != 0) goto Le6
            com.google.android.exoplayer2.text.SubtitleDecoder r9 = r8.decoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            com.google.android.exoplayer2.text.SubtitleDecoder r9 = (com.google.android.exoplayer2.text.SubtitleDecoder) r9     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            java.lang.Object r9 = r9.dequeueInputBuffer()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            com.google.android.exoplayer2.text.SubtitleInputBuffer r9 = (com.google.android.exoplayer2.text.SubtitleInputBuffer) r9     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r9 != 0) goto Le4
            return
        Le4:
            r8.nextInputBuffer = r9     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
        Le6:
            int r10 = r8.decoderReplacementState     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r10 != r12) goto Lfe
            r10 = 4
            r9.setFlags(r10)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            com.google.android.exoplayer2.text.SubtitleDecoder r10 = r8.decoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            com.google.android.exoplayer2.text.SubtitleDecoder r10 = (com.google.android.exoplayer2.text.SubtitleDecoder) r10     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r10.queueInputBuffer(r9)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r8.nextInputBuffer = r3     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r8.decoderReplacementState = r0     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            return
        Lfe:
            com.google.android.exoplayer2.FormatHolder r10 = r8.formatHolder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            int r10 = r8.readSource(r10, r9, r1)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r11 = -4
            if (r10 != r11) goto L140
            boolean r10 = r9.isEndOfStream()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r10 == 0) goto L112
            r8.inputStreamEnded = r12     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r8.waitingForKeyFrame = r1     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            goto L12e
        L112:
            com.google.android.exoplayer2.FormatHolder r10 = r8.formatHolder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            com.google.android.exoplayer2.Format r10 = r10.format     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r10 != 0) goto L119
            return
        L119:
            long r10 = r10.subsampleOffsetUs     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r9.subsampleOffsetUs = r10     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r9.flip()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            boolean r10 = r8.waitingForKeyFrame     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            boolean r11 = r9.isKeyFrame()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r11 != 0) goto L12a
            r11 = 1
            goto L12b
        L12a:
            r11 = 0
        L12b:
            r10 = r10 & r11
            r8.waitingForKeyFrame = r10     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
        L12e:
            boolean r10 = r8.waitingForKeyFrame     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            if (r10 != 0) goto Lcb
            com.google.android.exoplayer2.text.SubtitleDecoder r10 = r8.decoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            com.google.android.exoplayer2.text.SubtitleDecoder r10 = (com.google.android.exoplayer2.text.SubtitleDecoder) r10     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r10.queueInputBuffer(r9)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            r8.nextInputBuffer = r3     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L144
            goto Lcb
        L140:
            r9 = -3
            if (r10 != r9) goto Lcb
            return
        L144:
            r9 = move-exception
            r8.handleDecoderError(r9)
        L148:
            return
    }

    public void setFinalStreamEndPositionUs(long r2) {
            r1 = this;
            boolean r0 = r1.isCurrentStreamFinal()
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r1.finalStreamEndPositionUs = r2
            return
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            com.google.android.exoplayer2.text.SubtitleDecoderFactory r0 = r1.decoderFactory
            boolean r0 = r0.supportsFormat(r2)
            if (r0 == 0) goto L14
            int r2 = r2.cryptoType
            if (r2 != 0) goto Le
            r2 = 4
            goto Lf
        Le:
            r2 = 2
        Lf:
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
            return r2
        L14:
            java.lang.String r2 = r2.sampleMimeType
            boolean r2 = com.google.android.exoplayer2.util.MimeTypes.isText(r2)
            if (r2 == 0) goto L22
            r2 = 1
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
            return r2
        L22:
            r2 = 0
            int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.create(r2)
            return r2
    }
}
