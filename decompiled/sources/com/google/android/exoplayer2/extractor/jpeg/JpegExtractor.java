package com.google.android.exoplayer2.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
public final class JpegExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final long EXIF_HEADER = 1165519206;
    private static final int EXIF_ID_CODE_LENGTH = 6;
    private static final java.lang.String HEADER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/";
    private static final int IMAGE_TRACK_ID = 1024;
    private static final int MARKER_APP0 = 65504;
    private static final int MARKER_APP1 = 65505;
    private static final int MARKER_SOI = 65496;
    private static final int MARKER_SOS = 65498;
    private static final int STATE_ENDED = 6;
    private static final int STATE_READING_MARKER = 0;
    private static final int STATE_READING_MOTION_PHOTO_VIDEO = 5;
    private static final int STATE_READING_SEGMENT = 2;
    private static final int STATE_READING_SEGMENT_LENGTH = 1;
    private static final int STATE_SNIFFING_MOTION_PHOTO_VIDEO = 4;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private com.google.android.exoplayer2.extractor.ExtractorInput lastExtractorInput;
    private int marker;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.extractor.mp4.Mp4Extractor mp4Extractor;
    private com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput mp4ExtractorStartOffsetExtractorInput;
    private long mp4StartPosition;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private int segmentLength;
    private int state;

    public JpegExtractor() {
            r2 = this;
            r2.<init>()
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 6
            r0.<init>(r1)
            r2.scratch = r0
            r0 = -1
            r2.mp4StartPosition = r0
            return
    }

    private void advancePeekPositionToNextSegment(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            r1 = 2
            r0.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r2 = 0
            r4.peekFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            int r0 = r0.readUnsignedShort()
            int r0 = r0 - r1
            r4.advancePeekPosition(r0)
            return
    }

    private void endReadingWithImageTrack() {
            r4 = this;
            r0 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            r4.outputImageTrack(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r4.extractorOutput
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = (com.google.android.exoplayer2.extractor.ExtractorOutput) r0
            r0.endTracks()
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r4.extractorOutput
            com.google.android.exoplayer2.extractor.SeekMap$Unseekable r1 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r2)
            r0.seekMap(r1)
            r0 = 6
            r4.state = r0
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata getMotionPhotoMetadata(java.lang.String r4, long r5) throws java.io.IOException {
            r0 = 0
            r1 = -1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L8
            return r0
        L8:
            com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription r4 = com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.parse(r4)
            if (r4 != 0) goto Lf
            return r0
        Lf:
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r4 = r4.getMotionPhotoMetadata(r5)
            return r4
    }

    private void outputImageTrack(com.google.android.exoplayer2.metadata.Metadata.Entry... r4) {
            r3 = this;
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = r3.extractorOutput
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.ExtractorOutput r0 = (com.google.android.exoplayer2.extractor.ExtractorOutput) r0
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 4
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r0.track(r1, r2)
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            java.lang.String r2 = "image/jpeg"
            com.google.android.exoplayer2.Format$Builder r1 = r1.setContainerMimeType(r2)
            com.google.android.exoplayer2.metadata.Metadata r2 = new com.google.android.exoplayer2.metadata.Metadata
            r2.<init>(r4)
            com.google.android.exoplayer2.Format$Builder r4 = r1.setMetadata(r2)
            com.google.android.exoplayer2.Format r4 = r4.build()
            r0.format(r4)
            return
    }

    private int peekMarker(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            r1 = 2
            r0.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r2 = 0
            r4.peekFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            int r4 = r4.readUnsignedShort()
            return r4
    }

    private void readMarker(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.scratch
            r1 = 2
            r0.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.scratch
            byte[] r0 = r0.getData()
            r2 = 0
            r5.readFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r4.scratch
            int r5 = r5.readUnsignedShort()
            r4.marker = r5
            r0 = 65498(0xffda, float:9.1782E-41)
            if (r5 != r0) goto L2d
            long r0 = r4.mp4StartPosition
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L29
            r5 = 4
            r4.state = r5
            goto L3f
        L29:
            r4.endReadingWithImageTrack()
            goto L3f
        L2d:
            r0 = 65488(0xffd0, float:9.1768E-41)
            if (r5 < r0) goto L37
            r0 = 65497(0xffd9, float:9.1781E-41)
            if (r5 <= r0) goto L3f
        L37:
            r0 = 65281(0xff01, float:9.1478E-41)
            if (r5 == r0) goto L3f
            r5 = 1
            r4.state = r5
        L3f:
            return
    }

    private void readSegment(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            int r0 = r4.marker
            r1 = 0
            r2 = 65505(0xffe1, float:9.1792E-41)
            if (r0 != r2) goto L3f
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            int r2 = r4.segmentLength
            r0.<init>(r2)
            byte[] r2 = r0.getData()
            int r3 = r4.segmentLength
            r5.readFully(r2, r1, r3)
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r2 = r4.motionPhotoMetadata
            if (r2 != 0) goto L44
            java.lang.String r2 = r0.readNullTerminatedString()
            java.lang.String r3 = "http://ns.adobe.com/xap/1.0/"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
            java.lang.String r0 = r0.readNullTerminatedString()
            if (r0 == 0) goto L44
            long r2 = r5.getLength()
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r5 = getMotionPhotoMetadata(r0, r2)
            r4.motionPhotoMetadata = r5
            if (r5 == 0) goto L44
            long r2 = r5.videoStartPosition
            r4.mp4StartPosition = r2
            goto L44
        L3f:
            int r0 = r4.segmentLength
            r5.skipFully(r0)
        L44:
            r4.state = r1
            return
    }

    private void readSegmentLength(com.google.android.exoplayer2.extractor.ExtractorInput r4) throws java.io.IOException {
            r3 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            r1 = 2
            r0.reset(r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r3.scratch
            byte[] r0 = r0.getData()
            r2 = 0
            r4.readFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r3.scratch
            int r4 = r4.readUnsignedShort()
            int r4 = r4 - r1
            r3.segmentLength = r4
            r3.state = r1
            return
    }

    private void sniffMotionPhotoVideo(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r4.scratch
            byte[] r0 = r0.getData()
            r1 = 0
            r2 = 1
            boolean r0 = r5.peekFully(r0, r1, r2, r2)
            if (r0 != 0) goto L12
            r4.endReadingWithImageTrack()
            goto L4c
        L12:
            r5.resetPeekPosition()
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r0 = r4.mp4Extractor
            if (r0 != 0) goto L20
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r0 = new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor
            r0.<init>()
            r4.mp4Extractor = r0
        L20:
            com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput r0 = new com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput
            long r1 = r4.mp4StartPosition
            r0.<init>(r5, r1)
            r4.mp4ExtractorStartOffsetExtractorInput = r0
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r5 = r4.mp4Extractor
            boolean r5 = r5.sniff(r0)
            if (r5 == 0) goto L49
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r5 = r4.mp4Extractor
            com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput r0 = new com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput
            long r1 = r4.mp4StartPosition
            com.google.android.exoplayer2.extractor.ExtractorOutput r3 = r4.extractorOutput
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.extractor.ExtractorOutput r3 = (com.google.android.exoplayer2.extractor.ExtractorOutput) r3
            r0.<init>(r1, r3)
            r5.init(r0)
            r4.startReadingMotionPhoto()
            goto L4c
        L49:
            r4.endReadingWithImageTrack()
        L4c:
            return
    }

    private void startReadingMotionPhoto() {
            r3 = this;
            r0 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r1 = r3.motionPhotoMetadata
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.metadata.Metadata$Entry r1 = (com.google.android.exoplayer2.metadata.Metadata.Entry) r1
            r2 = 0
            r0[r2] = r1
            r3.outputImageTrack(r0)
            r0 = 5
            r3.state = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r1) {
            r0 = this;
            r0.extractorOutput = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r8, com.google.android.exoplayer2.extractor.PositionHolder r9) throws java.io.IOException {
            r7 = this;
            int r0 = r7.state
            r1 = 0
            if (r0 == 0) goto L60
            r2 = 1
            if (r0 == r2) goto L5c
            r3 = 2
            if (r0 == r3) goto L58
            r3 = 4
            if (r0 == r3) goto L47
            r1 = 5
            if (r0 == r1) goto L1c
            r8 = 6
            if (r0 != r8) goto L16
            r8 = -1
            return r8
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L1c:
            com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput r0 = r7.mp4ExtractorStartOffsetExtractorInput
            if (r0 == 0) goto L24
            com.google.android.exoplayer2.extractor.ExtractorInput r0 = r7.lastExtractorInput
            if (r8 == r0) goto L2f
        L24:
            r7.lastExtractorInput = r8
            com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput r0 = new com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput
            long r3 = r7.mp4StartPosition
            r0.<init>(r8, r3)
            r7.mp4ExtractorStartOffsetExtractorInput = r0
        L2f:
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r8 = r7.mp4Extractor
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r8 = (com.google.android.exoplayer2.extractor.mp4.Mp4Extractor) r8
            com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput r0 = r7.mp4ExtractorStartOffsetExtractorInput
            int r8 = r8.read(r0, r9)
            if (r8 != r2) goto L46
            long r0 = r9.position
            long r2 = r7.mp4StartPosition
            long r0 = r0 + r2
            r9.position = r0
        L46:
            return r8
        L47:
            long r3 = r8.getPosition()
            long r5 = r7.mp4StartPosition
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L54
            r9.position = r5
            return r2
        L54:
            r7.sniffMotionPhotoVideo(r8)
            return r1
        L58:
            r7.readSegment(r8)
            return r1
        L5c:
            r7.readSegmentLength(r8)
            return r1
        L60:
            r7.readMarker(r8)
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r1 = this;
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r0 = r1.mp4Extractor
            if (r0 == 0) goto L7
            r0.release()
        L7:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r4 = 0
            r3.state = r4
            r4 = 0
            r3.mp4Extractor = r4
            goto L1d
        Ld:
            int r0 = r3.state
            r1 = 5
            if (r0 != r1) goto L1d
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r0 = r3.mp4Extractor
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r0 = (com.google.android.exoplayer2.extractor.mp4.Mp4Extractor) r0
            r0.seek(r4, r6)
        L1d:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            int r0 = r6.peekMarker(r7)
            r1 = 0
            r2 = 65496(0xffd8, float:9.178E-41)
            if (r0 == r2) goto Lb
            return r1
        Lb:
            int r0 = r6.peekMarker(r7)
            r6.marker = r0
            r2 = 65504(0xffe0, float:9.179E-41)
            if (r0 != r2) goto L1f
            r6.advancePeekPositionToNextSegment(r7)
            int r0 = r6.peekMarker(r7)
            r6.marker = r0
        L1f:
            int r0 = r6.marker
            r2 = 65505(0xffe1, float:9.1792E-41)
            if (r0 == r2) goto L27
            return r1
        L27:
            r0 = 2
            r7.advancePeekPosition(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            r2 = 6
            r0.reset(r2)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.scratch
            byte[] r0 = r0.getData()
            r7.peekFully(r0, r1, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.scratch
            long r2 = r7.readUnsignedInt()
            r4 = 1165519206(0x45786966, double:5.758429993E-315)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L50
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.scratch
            int r7 = r7.readUnsignedShort()
            if (r7 != 0) goto L50
            r1 = 1
        L50:
            return r1
    }
}
