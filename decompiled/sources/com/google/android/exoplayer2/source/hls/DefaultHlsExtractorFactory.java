package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultHlsExtractorFactory implements com.google.android.exoplayer2.source.hls.HlsExtractorFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = null;
    private final boolean exposeCea608WhenMissingDeclarations;
    private final int payloadReaderFactoryFlags;

    static {
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [8, 13, 11, 2, 0, 1, 7} // fill-array
            com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory.DEFAULT_EXTRACTOR_ORDER = r0
            return
    }

    public DefaultHlsExtractorFactory() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1)
            return
    }

    public DefaultHlsExtractorFactory(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.payloadReaderFactoryFlags = r1
            r0.exposeCea608WhenMissingDeclarations = r2
            return
    }

    private static void addFileTypeIfValidAndNotPresent(int r2, java.util.List<java.lang.Integer> r3) {
            int[] r0 = com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory.DEFAULT_EXTRACTOR_ORDER
            int r0 = com.google.common.primitives.Ints.indexOf(r0, r2)
            r1 = -1
            if (r0 == r1) goto L1b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L14
            goto L1b
        L14:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L1b:
            return
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"SwitchIntDef"})
    private com.google.android.exoplayer2.extractor.Extractor createExtractorByFileType(int r2, com.google.android.exoplayer2.Format r3, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r4, com.google.android.exoplayer2.util.TimestampAdjuster r5) {
            r1 = this;
            if (r2 == 0) goto L44
            r0 = 1
            if (r2 == r0) goto L3e
            r0 = 2
            if (r2 == r0) goto L38
            r0 = 7
            if (r2 == r0) goto L2f
            r0 = 8
            if (r2 == r0) goto L2a
            r0 = 11
            if (r2 == r0) goto L21
            r4 = 13
            if (r2 == r4) goto L19
            r2 = 0
            return r2
        L19:
            com.google.android.exoplayer2.source.hls.WebvttExtractor r2 = new com.google.android.exoplayer2.source.hls.WebvttExtractor
            java.lang.String r3 = r3.language
            r2.<init>(r3, r5)
            return r2
        L21:
            int r2 = r1.payloadReaderFactoryFlags
            boolean r0 = r1.exposeCea608WhenMissingDeclarations
            com.google.android.exoplayer2.extractor.ts.TsExtractor r2 = createTsExtractor(r2, r0, r3, r4, r5)
            return r2
        L2a:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r2 = createFragmentedMp4Extractor(r5, r3, r4)
            return r2
        L2f:
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor r2 = new com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            return r2
        L38:
            com.google.android.exoplayer2.extractor.ts.AdtsExtractor r2 = new com.google.android.exoplayer2.extractor.ts.AdtsExtractor
            r2.<init>()
            return r2
        L3e:
            com.google.android.exoplayer2.extractor.ts.Ac4Extractor r2 = new com.google.android.exoplayer2.extractor.ts.Ac4Extractor
            r2.<init>()
            return r2
        L44:
            com.google.android.exoplayer2.extractor.ts.Ac3Extractor r2 = new com.google.android.exoplayer2.extractor.ts.Ac3Extractor
            r2.<init>()
            return r2
    }

    private static com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor createFragmentedMp4Extractor(com.google.android.exoplayer2.util.TimestampAdjuster r2, com.google.android.exoplayer2.Format r3, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r4) {
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r0 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            boolean r3 = isFmp4Variant(r3)
            if (r3 == 0) goto La
            r3 = 4
            goto Lb
        La:
            r3 = 0
        Lb:
            r1 = 0
            if (r4 == 0) goto Lf
            goto L13
        Lf:
            java.util.List r4 = java.util.Collections.emptyList()
        L13:
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    private static com.google.android.exoplayer2.extractor.ts.TsExtractor createTsExtractor(int r0, boolean r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r3, com.google.android.exoplayer2.util.TimestampAdjuster r4) {
            r0 = r0 | 16
            if (r3 == 0) goto L7
            r0 = r0 | 32
            goto L21
        L7:
            if (r1 == 0) goto L1d
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            java.lang.String r3 = "application/cea-608"
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r3)
            com.google.android.exoplayer2.Format r1 = r1.build()
            java.util.List r3 = java.util.Collections.singletonList(r1)
            goto L21
        L1d:
            java.util.List r3 = java.util.Collections.emptyList()
        L21:
            java.lang.String r1 = r2.codecs
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = com.google.android.exoplayer2.util.MimeTypes.containsCodecsCorrespondingToMimeType(r1, r2)
            if (r2 != 0) goto L33
            r0 = r0 | 2
        L33:
            java.lang.String r2 = "video/avc"
            boolean r1 = com.google.android.exoplayer2.util.MimeTypes.containsCodecsCorrespondingToMimeType(r1, r2)
            if (r1 != 0) goto L3e
            r0 = r0 | 4
        L3e:
            com.google.android.exoplayer2.extractor.ts.TsExtractor r1 = new com.google.android.exoplayer2.extractor.ts.TsExtractor
            com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory r2 = new com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory
            r2.<init>(r0, r3)
            r0 = 2
            r1.<init>(r0, r4, r2)
            return r1
    }

    private static boolean isFmp4Variant(com.google.android.exoplayer2.Format r4) {
            com.google.android.exoplayer2.metadata.Metadata r4 = r4.metadata
            r0 = 0
            if (r4 != 0) goto L6
            return r0
        L6:
            r1 = 0
        L7:
            int r2 = r4.length()
            if (r1 >= r2) goto L23
            com.google.android.exoplayer2.metadata.Metadata$Entry r2 = r4.get(r1)
            boolean r3 = r2 instanceof com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            if (r3 == 0) goto L20
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r2 = (com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry) r2
            java.util.List<com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo> r4 = r2.variantInfos
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ 1
            return r4
        L20:
            int r1 = r1 + 1
            goto L7
        L23:
            return r0
    }

    private static boolean sniffQuietly(com.google.android.exoplayer2.extractor.Extractor r0, com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            boolean r0 = r0.sniff(r1)     // Catch: java.lang.Throwable -> L8 java.io.EOFException -> Ld
            r1.resetPeekPosition()
            goto L11
        L8:
            r0 = move-exception
            r1.resetPeekPosition()
            throw r0
        Ld:
            r1.resetPeekPosition()
            r0 = 0
        L11:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor createExtractor(android.net.Uri r7, com.google.android.exoplayer2.Format r8, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r9, com.google.android.exoplayer2.util.TimestampAdjuster r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11, com.google.android.exoplayer2.extractor.ExtractorInput r12, com.google.android.exoplayer2.analytics.PlayerId r13) throws java.io.IOException {
            r6 = this;
            java.lang.String r13 = r8.sampleMimeType
            int r13 = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromMimeType(r13)
            int r11 = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromResponseHeaders(r11)
            int r7 = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromUri(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            int[] r1 = com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory.DEFAULT_EXTRACTOR_ORDER
            int r2 = r1.length
            r0.<init>(r2)
            addFileTypeIfValidAndNotPresent(r13, r0)
            addFileTypeIfValidAndNotPresent(r11, r0)
            addFileTypeIfValidAndNotPresent(r7, r0)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L22:
            if (r4 >= r2) goto L2c
            r5 = r1[r4]
            addFileTypeIfValidAndNotPresent(r5, r0)
            int r4 = r4 + 1
            goto L22
        L2c:
            r1 = 0
            r12.resetPeekPosition()
        L30:
            int r2 = r0.size()
            if (r3 >= r2) goto L66
            java.lang.Object r2 = r0.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.exoplayer2.extractor.Extractor r4 = r6.createExtractorByFileType(r2, r8, r9, r10)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.extractor.Extractor r4 = (com.google.android.exoplayer2.extractor.Extractor) r4
            boolean r5 = sniffQuietly(r4, r12)
            if (r5 == 0) goto L56
            com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor r7 = new com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor
            r7.<init>(r4, r8, r10)
            return r7
        L56:
            if (r1 != 0) goto L63
            if (r2 == r13) goto L62
            if (r2 == r11) goto L62
            if (r2 == r7) goto L62
            r5 = 11
            if (r2 != r5) goto L63
        L62:
            r1 = r4
        L63:
            int r3 = r3 + 1
            goto L30
        L66:
            com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor r7 = new com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.extractor.Extractor r9 = (com.google.android.exoplayer2.extractor.Extractor) r9
            r7.<init>(r9, r8, r10)
            return r7
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor createExtractor(android.net.Uri r1, com.google.android.exoplayer2.Format r2, @androidx.annotation.Nullable java.util.List r3, com.google.android.exoplayer2.util.TimestampAdjuster r4, java.util.Map r5, com.google.android.exoplayer2.extractor.ExtractorInput r6, com.google.android.exoplayer2.analytics.PlayerId r7) throws java.io.IOException {
            r0 = this;
            com.google.android.exoplayer2.source.hls.BundledHlsMediaChunkExtractor r1 = r0.createExtractor(r1, r2, r3, r4, r5, r6, r7)
            return r1
    }
}
