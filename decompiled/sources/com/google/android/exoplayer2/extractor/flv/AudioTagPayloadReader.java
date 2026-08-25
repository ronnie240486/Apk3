package com.google.android.exoplayer2.extractor.flv;

/* JADX INFO: loaded from: classes2.dex */
final class AudioTagPayloadReader extends com.google.android.exoplayer2.extractor.flv.TagPayloadReader {
    private static final int AAC_PACKET_TYPE_AAC_RAW = 1;
    private static final int AAC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    private static final int AUDIO_FORMAT_AAC = 10;
    private static final int AUDIO_FORMAT_ALAW = 7;
    private static final int AUDIO_FORMAT_MP3 = 2;
    private static final int AUDIO_FORMAT_ULAW = 8;
    private static final int[] AUDIO_SAMPLING_RATE_TABLE = null;
    private int audioFormat;
    private boolean hasOutputFormat;
    private boolean hasParsedAudioDataHeader;

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [5512, 11025, 22050, 44100} // fill-array
            com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader.AUDIO_SAMPLING_RATE_TABLE = r0
            return
    }

    public AudioTagPayloadReader(com.google.android.exoplayer2.extractor.TrackOutput r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean parseHeader(com.google.android.exoplayer2.util.ParsableByteArray r4) throws com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException {
            r3 = this;
            boolean r0 = r3.hasParsedAudioDataHeader
            r1 = 1
            if (r0 != 0) goto L82
            int r4 = r4.readUnsignedByte()
            int r0 = r4 >> 4
            r0 = r0 & 15
            r3.audioFormat = r0
            r2 = 2
            if (r0 != r2) goto L38
            int r4 = r4 >> r2
            r4 = r4 & 3
            int[] r0 = com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader.AUDIO_SAMPLING_RATE_TABLE
            r4 = r0[r4]
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r2 = "audio/mpeg"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r1)
            com.google.android.exoplayer2.Format$Builder r4 = r0.setSampleRate(r4)
            com.google.android.exoplayer2.Format r4 = r4.build()
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.output
            r0.format(r4)
            r3.hasOutputFormat = r1
            goto L7f
        L38:
            r4 = 7
            if (r0 == r4) goto L5a
            r2 = 8
            if (r0 != r2) goto L40
            goto L5a
        L40:
            r4 = 10
            if (r0 != r4) goto L45
            goto L7f
        L45:
            com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException r4 = new com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException
            java.lang.String r0 = "Audio format not supported: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.audioFormat
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L5a:
            if (r0 != r4) goto L5f
            java.lang.String r4 = "audio/g711-alaw"
            goto L61
        L5f:
            java.lang.String r4 = "audio/g711-mlaw"
        L61:
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r4 = r0.setSampleMimeType(r4)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setChannelCount(r1)
            r0 = 8000(0x1f40, float:1.121E-41)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSampleRate(r0)
            com.google.android.exoplayer2.Format r4 = r4.build()
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r3.output
            r0.format(r4)
            r3.hasOutputFormat = r1
        L7f:
            r3.hasParsedAudioDataHeader = r1
            goto L85
        L82:
            r4.skipBytes(r1)
        L85:
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean parsePayload(com.google.android.exoplayer2.util.ParsableByteArray r13, long r14) throws com.google.android.exoplayer2.ParserException {
            r12 = this;
            int r0 = r12.audioFormat
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L19
            int r7 = r13.bytesLeft()
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r12.output
            r0.sampleData(r13, r7)
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r12.output
            r6 = 1
            r8 = 0
            r9 = 0
            r4 = r14
            r3.sampleMetadata(r4, r6, r7, r8, r9)
            return r1
        L19:
            int r0 = r13.readUnsignedByte()
            r2 = 0
            if (r0 != 0) goto L62
            boolean r3 = r12.hasOutputFormat
            if (r3 != 0) goto L62
            int r14 = r13.bytesLeft()
            byte[] r15 = new byte[r14]
            r13.readBytes(r15, r2, r14)
            com.google.android.exoplayer2.audio.AacUtil$Config r13 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r15)
            com.google.android.exoplayer2.Format$Builder r14 = new com.google.android.exoplayer2.Format$Builder
            r14.<init>()
            java.lang.String r0 = "audio/mp4a-latm"
            com.google.android.exoplayer2.Format$Builder r14 = r14.setSampleMimeType(r0)
            java.lang.String r0 = r13.codecs
            com.google.android.exoplayer2.Format$Builder r14 = r14.setCodecs(r0)
            int r0 = r13.channelCount
            com.google.android.exoplayer2.Format$Builder r14 = r14.setChannelCount(r0)
            int r13 = r13.sampleRateHz
            com.google.android.exoplayer2.Format$Builder r13 = r14.setSampleRate(r13)
            java.util.List r14 = java.util.Collections.singletonList(r15)
            com.google.android.exoplayer2.Format$Builder r13 = r13.setInitializationData(r14)
            com.google.android.exoplayer2.Format r13 = r13.build()
            com.google.android.exoplayer2.extractor.TrackOutput r14 = r12.output
            r14.format(r13)
            r12.hasOutputFormat = r1
            return r2
        L62:
            int r3 = r12.audioFormat
            r4 = 10
            if (r3 != r4) goto L6c
            if (r0 != r1) goto L6b
            goto L6c
        L6b:
            return r2
        L6c:
            int r9 = r13.bytesLeft()
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r12.output
            r0.sampleData(r13, r9)
            com.google.android.exoplayer2.extractor.TrackOutput r5 = r12.output
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r14
            r5.sampleMetadata(r6, r8, r9, r10, r11)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
            r0 = this;
            return
    }
}
