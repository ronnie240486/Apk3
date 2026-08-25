package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class ClippingMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaPeriod.Callback {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException clippingError;
    public long endUs;
    public final com.google.android.exoplayer2.source.MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private com.google.android.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream[] sampleStreams;
    public long startUs;

    /* JADX INFO: loaded from: classes3.dex */
    public final class ClippingSampleStream implements com.google.android.exoplayer2.source.SampleStream {
        public final com.google.android.exoplayer2.source.SampleStream childStream;
        private boolean sentEos;
        public final /* synthetic */ com.google.android.exoplayer2.source.ClippingMediaPeriod this$0;

        public ClippingSampleStream(com.google.android.exoplayer2.source.ClippingMediaPeriod r1, com.google.android.exoplayer2.source.SampleStream r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.childStream = r2
                return
        }

        public void clearSentEos() {
                r1 = this;
                r0 = 0
                r1.sentEos = r0
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
                r1 = this;
                com.google.android.exoplayer2.source.ClippingMediaPeriod r0 = r1.this$0
                boolean r0 = r0.isPendingInitialDiscontinuity()
                if (r0 != 0) goto L12
                com.google.android.exoplayer2.source.SampleStream r0 = r1.childStream
                boolean r0 = r0.isReady()
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
                com.google.android.exoplayer2.source.SampleStream r0 = r1.childStream
                r0.maybeThrowError()
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder r11, com.google.android.exoplayer2.decoder.DecoderInputBuffer r12, int r13) {
                r10 = this;
                com.google.android.exoplayer2.source.ClippingMediaPeriod r0 = r10.this$0
                boolean r0 = r0.isPendingInitialDiscontinuity()
                r1 = -3
                if (r0 == 0) goto La
                return r1
            La:
                boolean r0 = r10.sentEos
                r2 = 4
                r3 = -4
                if (r0 == 0) goto L14
                r12.setFlags(r2)
                return r3
            L14:
                com.google.android.exoplayer2.source.SampleStream r0 = r10.childStream
                int r13 = r0.readData(r11, r12, r13)
                r0 = -5
                r4 = -9223372036854775808
                if (r13 != r0) goto L57
                com.google.android.exoplayer2.Format r12 = r11.format
                java.lang.Object r12 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
                com.google.android.exoplayer2.Format r12 = (com.google.android.exoplayer2.Format) r12
                int r13 = r12.encoderDelay
                if (r13 != 0) goto L2f
                int r1 = r12.encoderPadding
                if (r1 == 0) goto L56
            L2f:
                com.google.android.exoplayer2.source.ClippingMediaPeriod r1 = r10.this$0
                long r2 = r1.startUs
                r6 = 0
                r8 = 0
                int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r9 == 0) goto L3b
                r13 = 0
            L3b:
                long r1 = r1.endUs
                int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r3 == 0) goto L42
                goto L44
            L42:
                int r8 = r12.encoderPadding
            L44:
                com.google.android.exoplayer2.Format$Builder r12 = r12.buildUpon()
                com.google.android.exoplayer2.Format$Builder r12 = r12.setEncoderDelay(r13)
                com.google.android.exoplayer2.Format$Builder r12 = r12.setEncoderPadding(r8)
                com.google.android.exoplayer2.Format r12 = r12.build()
                r11.format = r12
            L56:
                return r0
            L57:
                com.google.android.exoplayer2.source.ClippingMediaPeriod r11 = r10.this$0
                long r6 = r11.endUs
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 == 0) goto L7f
                if (r13 != r3) goto L67
                long r8 = r12.timeUs
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r0 >= 0) goto L75
            L67:
                if (r13 != r1) goto L7f
                long r0 = r11.getBufferedPositionUs()
                int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r11 != 0) goto L7f
                boolean r11 = r12.waitingForKeys
                if (r11 != 0) goto L7f
            L75:
                r12.clear()
                r12.setFlags(r2)
                r11 = 1
                r10.sentEos = r11
                return r3
            L7f:
                return r13
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ClippingMediaPeriod r0 = r1.this$0
                boolean r0 = r0.isPendingInitialDiscontinuity()
                if (r0 == 0) goto La
                r2 = -3
                return r2
            La:
                com.google.android.exoplayer2.source.SampleStream r0 = r1.childStream
                int r2 = r0.skipData(r2)
                return r2
        }
    }

    public ClippingMediaPeriod(com.google.android.exoplayer2.source.MediaPeriod r1, boolean r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.mediaPeriod = r1
            r1 = 0
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r1 = new com.google.android.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream[r1]
            r0.sampleStreams = r1
            if (r2 == 0) goto Le
            r1 = r3
            goto L13
        Le:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L13:
            r0.pendingInitialDiscontinuityPositionUs = r1
            r0.startUs = r3
            r0.endUs = r5
            return
    }

    private com.google.android.exoplayer2.SeekParameters clipSeekParameters(long r10, com.google.android.exoplayer2.SeekParameters r12) {
            r9 = this;
            long r0 = r12.toleranceBeforeUs
            long r2 = r9.startUs
            long r4 = r10 - r2
            r2 = 0
            long r0 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r2, r4)
            long r2 = r12.toleranceAfterUs
            long r4 = r9.endUs
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L1d
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r10
            goto L1f
        L1d:
            long r4 = r4 - r10
            r6 = r4
        L1f:
            r4 = 0
            long r10 = com.google.android.exoplayer2.util.Util.constrainValue(r2, r4, r6)
            long r2 = r12.toleranceBeforeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L32
            long r2 = r12.toleranceAfterUs
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L32
            return r12
        L32:
            com.google.android.exoplayer2.SeekParameters r12 = new com.google.android.exoplayer2.SeekParameters
            r12.<init>(r0, r10)
            return r12
    }

    private static boolean shouldKeepInitialDiscontinuity(long r4, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r6) {
            r0 = 0
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 == 0) goto L22
            int r4 = r6.length
            r5 = 0
        L9:
            if (r5 >= r4) goto L22
            r1 = r6[r5]
            if (r1 == 0) goto L1f
            com.google.android.exoplayer2.Format r1 = r1.getSelectedFormat()
            java.lang.String r2 = r1.sampleMimeType
            java.lang.String r1 = r1.codecs
            boolean r1 = com.google.android.exoplayer2.util.MimeTypes.allSamplesAreSyncSamples(r2, r1)
            if (r1 != 0) goto L1f
            r4 = 1
            return r4
        L1f:
            int r5 = r5 + 1
            goto L9
        L22:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            boolean r2 = r0.continueLoading(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long r2, boolean r4) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            r0.discardBuffer(r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long r4, com.google.android.exoplayer2.SeekParameters r6) {
            r3 = this;
            long r0 = r3.startUs
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r0
        L7:
            com.google.android.exoplayer2.SeekParameters r6 = r3.clipSeekParameters(r4, r6)
            com.google.android.exoplayer2.source.MediaPeriod r0 = r3.mediaPeriod
            long r4 = r0.getAdjustedSeekPositionUs(r4, r6)
            return r4
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r7 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r7.mediaPeriod
            long r0 = r0.getBufferedPositionUs()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            long r4 = r7.endUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L17
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
            r7 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r7.mediaPeriod
            long r0 = r0.getNextLoadPositionUs()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            long r4 = r7.endUs
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L17
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r2
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
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.getTrackGroups()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            boolean r0 = r0.isLoading()
            return r0
    }

    public final boolean isPendingInitialDiscontinuity() {
            r5 = this;
            long r0 = r5.pendingInitialDiscontinuityPositionUs
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

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r0 = r1.clippingError
            if (r0 != 0) goto La
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            r0.maybeThrowPrepareError()
            return
        La:
            throw r0
    }

    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
            r1.onContinueLoadingRequested(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod r1 = (com.google.android.exoplayer2.source.MediaPeriod) r1
            r0.onContinueLoadingRequested(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException r1 = r0.clippingError
            if (r1 == 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = (com.google.android.exoplayer2.source.MediaPeriod.Callback) r1
            r1.onPrepared(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
            r0 = this;
            r0.callback = r1
            com.google.android.exoplayer2.source.MediaPeriod r1 = r0.mediaPeriod
            r1.prepare(r0, r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
            r9 = this;
            boolean r0 = r9.isPendingInitialDiscontinuity()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L19
            long r3 = r9.pendingInitialDiscontinuityPositionUs
            r9.pendingInitialDiscontinuityPositionUs = r1
            long r5 = r9.readDiscontinuity()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r3 = r5
        L18:
            return r3
        L19:
            com.google.android.exoplayer2.source.MediaPeriod r0 = r9.mediaPeriod
            long r3 = r0.readDiscontinuity()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            return r1
        L24:
            long r0 = r9.startUs
            r2 = 1
            r5 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 < 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r0 = r9.endUs
            r6 = -9223372036854775808
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L40
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 > 0) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            return r3
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaPeriod r0 = r1.mediaPeriod
            r0.reevaluateBuffer(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long r7) {
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.pendingInitialDiscontinuityPositionUs = r0
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r0 = r6.sampleStreams
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.clearSentEos()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.exoplayer2.source.MediaPeriod r0 = r6.mediaPeriod
            long r0 = r0.seekToUs(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.startUs
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.endUs
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r13, boolean[] r14, com.google.android.exoplayer2.source.SampleStream[] r15, boolean[] r16, long r17) {
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r2 = new com.google.android.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream[r2]
            r0.sampleStreams = r2
            int r2 = r1.length
            com.google.android.exoplayer2.source.SampleStream[] r9 = new com.google.android.exoplayer2.source.SampleStream[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r3 = r0.sampleStreams
            r4 = r1[r2]
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r4 = (com.google.android.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            com.google.android.exoplayer2.source.SampleStream r11 = r3.childStream
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            com.google.android.exoplayer2.source.MediaPeriod r2 = r0.mediaPeriod
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.selectTracks(r3, r4, r5, r6, r7)
            boolean r4 = r12.isPendingInitialDiscontinuity()
            if (r4 == 0) goto L47
            long r4 = r0.startUs
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = shouldKeepInitialDiscontinuity(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.pendingInitialDiscontinuityPositionUs = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.startUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L65
            long r4 = r0.endUs
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L67
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L65
            goto L67
        L65:
            r4 = 0
            goto L68
        L67:
            r4 = 1
        L68:
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r4[r10] = r11
            goto L8e
        L77:
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            com.google.android.exoplayer2.source.SampleStream r5 = r5.childStream
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r5 = new com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream
            r6 = r9[r10]
            r5.<init>(r12, r6)
            r4[r10] = r5
        L8e:
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
    }

    public void setClippingError(com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException r1) {
            r0 = this;
            r0.clippingError = r1
            return
    }

    public void updateClipping(long r1, long r3) {
            r0 = this;
            r0.startUs = r1
            r0.endUs = r3
            return
    }
}
