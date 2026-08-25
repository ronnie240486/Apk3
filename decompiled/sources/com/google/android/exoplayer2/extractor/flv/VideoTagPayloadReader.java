package com.google.android.exoplayer2.extractor.flv;

/* JADX INFO: loaded from: classes2.dex */
final class VideoTagPayloadReader extends com.google.android.exoplayer2.extractor.flv.TagPayloadReader {
    private static final int AVC_PACKET_TYPE_AVC_NALU = 1;
    private static final int AVC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    private static final int VIDEO_CODEC_AVC = 7;
    private static final int VIDEO_FRAME_KEYFRAME = 1;
    private static final int VIDEO_FRAME_VIDEO_INFO = 5;
    private int frameType;
    private boolean hasOutputFormat;
    private boolean hasOutputKeyframe;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalLength;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalStartCode;
    private int nalUnitLengthFieldLength;

    public VideoTagPayloadReader(com.google.android.exoplayer2.extractor.TrackOutput r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            byte[] r0 = com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE
            r2.<init>(r0)
            r1.nalStartCode = r2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r0 = 4
            r2.<init>(r0)
            r1.nalLength = r2
            return
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean parseHeader(com.google.android.exoplayer2.util.ParsableByteArray r3) throws com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException {
            r2 = this;
            int r3 = r3.readUnsignedByte()
            int r0 = r3 >> 4
            r0 = r0 & 15
            r3 = r3 & 15
            r1 = 7
            if (r3 != r1) goto L16
            r2.frameType = r0
            r3 = 5
            if (r0 == r3) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
        L16:
            com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException r0 = new com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException
            java.lang.String r1 = "Video format not supported: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean parsePayload(com.google.android.exoplayer2.util.ParsableByteArray r11, long r12) throws com.google.android.exoplayer2.ParserException {
            r10 = this;
            int r0 = r11.readUnsignedByte()
            int r1 = r11.readInt24()
            long r1 = (long) r1
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            long r4 = r1 + r12
            r12 = 1
            r13 = 0
            if (r0 != 0) goto L6b
            boolean r1 = r10.hasOutputFormat
            if (r1 != 0) goto L6b
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            int r1 = r11.bytesLeft()
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            byte[] r1 = r0.getData()
            int r2 = r11.bytesLeft()
            r11.readBytes(r1, r13, r2)
            com.google.android.exoplayer2.video.AvcConfig r11 = com.google.android.exoplayer2.video.AvcConfig.parse(r0)
            int r0 = r11.nalUnitLengthFieldLength
            r10.nalUnitLengthFieldLength = r0
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "video/avc"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            java.lang.String r1 = r11.codecs
            com.google.android.exoplayer2.Format$Builder r0 = r0.setCodecs(r1)
            int r1 = r11.width
            com.google.android.exoplayer2.Format$Builder r0 = r0.setWidth(r1)
            int r1 = r11.height
            com.google.android.exoplayer2.Format$Builder r0 = r0.setHeight(r1)
            float r1 = r11.pixelWidthHeightRatio
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPixelWidthHeightRatio(r1)
            java.util.List<byte[]> r11 = r11.initializationData
            com.google.android.exoplayer2.Format$Builder r11 = r0.setInitializationData(r11)
            com.google.android.exoplayer2.Format r11 = r11.build()
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r10.output
            r0.format(r11)
            r10.hasOutputFormat = r12
            return r13
        L6b:
            if (r0 != r12) goto Lcd
            boolean r0 = r10.hasOutputFormat
            if (r0 == 0) goto Lcd
            int r0 = r10.frameType
            if (r0 != r12) goto L77
            r6 = 1
            goto L78
        L77:
            r6 = 0
        L78:
            boolean r0 = r10.hasOutputKeyframe
            if (r0 != 0) goto L7f
            if (r6 != 0) goto L7f
            return r13
        L7f:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r10.nalLength
            byte[] r0 = r0.getData()
            r0[r13] = r13
            r0[r12] = r13
            r1 = 2
            r0[r1] = r13
            int r0 = r10.nalUnitLengthFieldLength
            r1 = 4
            int r0 = 4 - r0
            r7 = 0
        L92:
            int r2 = r11.bytesLeft()
            if (r2 <= 0) goto Lc3
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r10.nalLength
            byte[] r2 = r2.getData()
            int r3 = r10.nalUnitLengthFieldLength
            r11.readBytes(r2, r0, r3)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r10.nalLength
            r2.setPosition(r13)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r10.nalLength
            int r2 = r2.readUnsignedIntToInt()
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r10.nalStartCode
            r3.setPosition(r13)
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r10.output
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r10.nalStartCode
            r3.sampleData(r8, r1)
            int r7 = r7 + 4
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r10.output
            r3.sampleData(r11, r2)
            int r7 = r7 + r2
            goto L92
        Lc3:
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r10.output
            r8 = 0
            r9 = 0
            r3.sampleMetadata(r4, r6, r7, r8, r9)
            r10.hasOutputKeyframe = r12
            return r12
        Lcd:
            return r13
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
            r1 = this;
            r0 = 0
            r1.hasOutputKeyframe = r0
            return
    }
}
