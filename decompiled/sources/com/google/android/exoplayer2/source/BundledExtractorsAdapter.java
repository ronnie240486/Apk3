package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class BundledExtractorsAdapter implements com.google.android.exoplayer2.source.ProgressiveMediaExtractor {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.Extractor extractor;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.ExtractorInput extractorInput;
    private final com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(com.google.android.exoplayer2.extractor.ExtractorsFactory r1) {
            r0 = this;
            r0.<init>()
            r0.extractorsFactory = r1
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
            r2 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r2.extractor
            boolean r1 = r0 instanceof com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            if (r1 == 0) goto Lb
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor r0 = (com.google.android.exoplayer2.extractor.mp3.Mp3Extractor) r0
            r0.disableSeeking()
        Lb:
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
            r2 = this;
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r2.extractorInput
            if (r0 == 0) goto L9
            long r0 = r0.getPosition()
            goto Lb
        L9:
            r0 = -1
        Lb:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void init(com.google.android.exoplayer2.upstream.DataReader r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.exoplayer2.extractor.ExtractorOutput r15) throws java.io.IOException {
            r7 = this;
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r6 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.extractorInput = r6
            com.google.android.exoplayer2.extractor.Extractor r8 = r7.extractor
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.exoplayer2.extractor.ExtractorsFactory r8 = r7.extractorsFactory
            com.google.android.exoplayer2.extractor.Extractor[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.extractor = r8
            goto L75
        L20:
            int r10 = r8.length
            r0 = 0
        L22:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.sniff(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.extractor = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            com.google.android.exoplayer2.util.Assertions.checkState(r14)
            r6.resetPeekPosition()
            goto L71
        L35:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.extractor
            if (r1 != 0) goto L67
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L42:
            r8 = move-exception
            com.google.android.exoplayer2.extractor.Extractor r9 = r7.extractor
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L50
        L4f:
            r13 = 1
        L50:
            com.google.android.exoplayer2.util.Assertions.checkState(r13)
            r6.resetPeekPosition()
            throw r8
        L57:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.extractor
            if (r1 != 0) goto L67
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r6.resetPeekPosition()
            int r0 = r0 + 1
            goto L22
        L71:
            com.google.android.exoplayer2.extractor.Extractor r10 = r7.extractor
            if (r10 == 0) goto L7b
        L75:
            com.google.android.exoplayer2.extractor.Extractor r8 = r7.extractor
            r8.init(r15)
            return
        L7b:
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            java.lang.String r11 = "None of the available extractors ("
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.getCommaDelimitedSimpleClassNames(r8)
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r8, r12)
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public int read(com.google.android.exoplayer2.extractor.PositionHolder r3) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r2.extractor
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.Extractor r0 = (com.google.android.exoplayer2.extractor.Extractor) r0
            com.google.android.exoplayer2.extractor.ExtractorInput r1 = r2.extractorInput
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.extractor.ExtractorInput r1 = (com.google.android.exoplayer2.extractor.ExtractorInput) r1
            int r3 = r0.read(r1, r3)
            return r3
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
            r2 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r2.extractor
            r1 = 0
            if (r0 == 0) goto La
            r0.release()
            r2.extractor = r1
        La:
            r2.extractorInput = r1
            return
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void seek(long r2, long r4) {
            r1 = this;
            com.google.android.exoplayer2.extractor.Extractor r0 = r1.extractor
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.Extractor r0 = (com.google.android.exoplayer2.extractor.Extractor) r0
            r0.seek(r2, r4)
            return
    }
}
