package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes3.dex */
public class SubtitleExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int STATE_CREATED = 0;
    private static final int STATE_EXTRACTING = 2;
    private static final int STATE_FINISHED = 4;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 5;
    private static final int STATE_SEEKING = 3;
    private int bytesRead;
    private final com.google.android.exoplayer2.text.CueEncoder cueEncoder;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private final com.google.android.exoplayer2.Format format;
    private final java.util.List<com.google.android.exoplayer2.util.ParsableByteArray> samples;
    private long seekTimeUs;
    private int state;
    private final com.google.android.exoplayer2.util.ParsableByteArray subtitleData;
    private final com.google.android.exoplayer2.text.SubtitleDecoder subtitleDecoder;
    private final java.util.List<java.lang.Long> timestamps;
    private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

    public SubtitleExtractor(com.google.android.exoplayer2.text.SubtitleDecoder r2, com.google.android.exoplayer2.Format r3) {
            r1 = this;
            r1.<init>()
            r1.subtitleDecoder = r2
            com.google.android.exoplayer2.text.CueEncoder r2 = new com.google.android.exoplayer2.text.CueEncoder
            r2.<init>()
            r1.cueEncoder = r2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2.<init>()
            r1.subtitleData = r2
            com.google.android.exoplayer2.Format$Builder r2 = r3.buildUpon()
            java.lang.String r0 = "text/x-exoplayer-cues"
            com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleMimeType(r0)
            java.lang.String r3 = r3.sampleMimeType
            com.google.android.exoplayer2.Format$Builder r2 = r2.setCodecs(r3)
            com.google.android.exoplayer2.Format r2 = r2.build()
            r1.format = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.timestamps = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.samples = r2
            r2 = 0
            r1.state = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.seekTimeUs = r2
            return
    }

    private void decode() throws java.io.IOException {
            r7 = this;
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = r7.subtitleDecoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.lang.Object r0 = r0.dequeueInputBuffer()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = (com.google.android.exoplayer2.text.SubtitleInputBuffer) r0     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
        L8:
            r1 = 5
            if (r0 != 0) goto L18
            java.lang.Thread.sleep(r1)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = r7.subtitleDecoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.lang.Object r0 = r0.dequeueInputBuffer()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleInputBuffer r0 = (com.google.android.exoplayer2.text.SubtitleInputBuffer) r0     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            goto L8
        L18:
            int r3 = r7.bytesRead     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            r0.ensureSpaceForWrite(r3)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.nio.ByteBuffer r3 = r0.data     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.subtitleData     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            byte[] r4 = r4.getData()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            int r5 = r7.bytesRead     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            r6 = 0
            r3.put(r4, r6, r5)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.nio.ByteBuffer r3 = r0.data     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            int r4 = r7.bytesRead     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            r3.limit(r4)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleDecoder r3 = r7.subtitleDecoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            r3.queueInputBuffer(r0)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = r7.subtitleDecoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.lang.Object r0 = r0.dequeueOutputBuffer()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r0     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
        L3f:
            if (r0 != 0) goto L4d
            java.lang.Thread.sleep(r1)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = r7.subtitleDecoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.lang.Object r0 = r0.dequeueOutputBuffer()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.SubtitleOutputBuffer r0 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) r0     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            goto L3f
        L4d:
            int r1 = r0.getEventTimeCount()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            if (r6 >= r1) goto L7b
            long r1 = r0.getEventTime(r6)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.util.List r1 = r0.getCues(r1)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.text.CueEncoder r2 = r7.cueEncoder     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            byte[] r1 = r2.encode(r1)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.util.List<java.lang.Long> r2 = r7.timestamps     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            long r3 = r0.getEventTime(r6)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            r2.add(r3)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            java.util.List<com.google.android.exoplayer2.util.ParsableByteArray> r2 = r7.samples     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            com.google.android.exoplayer2.util.ParsableByteArray r3 = new com.google.android.exoplayer2.util.ParsableByteArray     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            r3.<init>(r1)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            r2.add(r3)     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            int r6 = r6 + 1
            goto L4d
        L7b:
            r0.release()     // Catch: com.google.android.exoplayer2.text.SubtitleDecoderException -> L7f java.lang.InterruptedException -> L87
            return
        L7f:
            r0 = move-exception
            java.lang.String r1 = "SubtitleDecoder failed."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r1, r0)
            throw r0
        L87:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }

    private boolean readFromInput(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.subtitleData
            int r0 = r0.capacity()
            int r1 = r6.bytesRead
            if (r0 != r1) goto L11
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.subtitleData
            int r1 = r1 + 1024
            r0.ensureCapacity(r1)
        L11:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.subtitleData
            byte[] r0 = r0.getData()
            int r1 = r6.bytesRead
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r6.subtitleData
            int r2 = r2.capacity()
            int r3 = r6.bytesRead
            int r2 = r2 - r3
            int r0 = r7.read(r0, r1, r2)
            r1 = -1
            if (r0 == r1) goto L2e
            int r2 = r6.bytesRead
            int r2 = r2 + r0
            r6.bytesRead = r2
        L2e:
            long r2 = r7.getLength()
            r4 = -1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L3f
            int r7 = r6.bytesRead
            long r4 = (long) r7
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L41
        L3f:
            if (r0 != r1) goto L43
        L41:
            r7 = 1
            goto L44
        L43:
            r7 = 0
        L44:
            return r7
    }

    private boolean skipInput(com.google.android.exoplayer2.extractor.ExtractorInput r6) throws java.io.IOException {
            r5 = this;
            long r0 = r6.getLength()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L13
            long r0 = r6.getLength()
            int r0 = com.google.common.primitives.Ints.checkedCast(r0)
            goto L15
        L13:
            r0 = 1024(0x400, float:1.435E-42)
        L15:
            int r6 = r6.skip(r0)
            r0 = -1
            if (r6 != r0) goto L1e
            r6 = 1
            goto L1f
        L1e:
            r6 = 0
        L1f:
            return r6
    }

    private void writeToOutput() {
            r11 = this;
            com.google.android.exoplayer2.extractor.TrackOutput r0 = r11.trackOutput
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            java.util.List<java.lang.Long> r0 = r11.timestamps
            int r0 = r0.size()
            java.util.List<com.google.android.exoplayer2.util.ParsableByteArray> r1 = r11.samples
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            long r0 = r11.seekTimeUs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L28
            r0 = 0
            goto L32
        L28:
            java.util.List<java.lang.Long> r4 = r11.timestamps
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r4, r0, r3, r3)
        L32:
            java.util.List<com.google.android.exoplayer2.util.ParsableByteArray> r1 = r11.samples
            int r1 = r1.size()
            if (r0 >= r1) goto L66
            java.util.List<com.google.android.exoplayer2.util.ParsableByteArray> r1 = r11.samples
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.util.ParsableByteArray r1 = (com.google.android.exoplayer2.util.ParsableByteArray) r1
            r1.setPosition(r2)
            byte[] r3 = r1.getData()
            int r8 = r3.length
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r11.trackOutput
            r3.sampleData(r1, r8)
            com.google.android.exoplayer2.extractor.TrackOutput r4 = r11.trackOutput
            java.util.List<java.lang.Long> r1 = r11.timestamps
            java.lang.Object r1 = r1.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            r7 = 1
            r9 = 0
            r10 = 0
            r4.sampleMetadata(r5, r7, r8, r9, r10)
            int r0 = r0 + 1
            goto L32
        L66:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r8) {
            r7 = this;
            int r0 = r7.state
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r7.extractorOutput = r8
            r0 = 3
            com.google.android.exoplayer2.extractor.TrackOutput r8 = r8.track(r2, r0)
            r7.trackOutput = r8
            com.google.android.exoplayer2.extractor.ExtractorOutput r8 = r7.extractorOutput
            r8.endTracks()
            com.google.android.exoplayer2.extractor.ExtractorOutput r8 = r7.extractorOutput
            com.google.android.exoplayer2.extractor.IndexSeekMap r0 = new com.google.android.exoplayer2.extractor.IndexSeekMap
            long[] r3 = new long[r1]
            r4 = 0
            r3[r2] = r4
            long[] r6 = new long[r1]
            r6[r2] = r4
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r3, r6, r4)
            r8.seekMap(r0)
            com.google.android.exoplayer2.extractor.TrackOutput r8 = r7.trackOutput
            com.google.android.exoplayer2.Format r0 = r7.format
            r8.format(r0)
            r7.state = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r8, com.google.android.exoplayer2.extractor.PositionHolder r9) throws java.io.IOException {
            r7 = this;
            int r9 = r7.state
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Lb
            r2 = 5
            if (r9 == r2) goto Lb
            r9 = 1
            goto Lc
        Lb:
            r9 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkState(r9)
            int r9 = r7.state
            r2 = 2
            if (r9 != r0) goto L32
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r7.subtitleData
            long r3 = r8.getLength()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L29
            long r3 = r8.getLength()
            int r0 = com.google.common.primitives.Ints.checkedCast(r3)
            goto L2b
        L29:
            r0 = 1024(0x400, float:1.435E-42)
        L2b:
            r9.reset(r0)
            r7.bytesRead = r1
            r7.state = r2
        L32:
            int r9 = r7.state
            r0 = 4
            if (r9 != r2) goto L45
            boolean r9 = r7.readFromInput(r8)
            if (r9 == 0) goto L45
            r7.decode()
            r7.writeToOutput()
            r7.state = r0
        L45:
            int r9 = r7.state
            r2 = 3
            if (r9 != r2) goto L55
            boolean r8 = r7.skipInput(r8)
            if (r8 == 0) goto L55
            r7.writeToOutput()
            r7.state = r0
        L55:
            int r8 = r7.state
            if (r8 != r0) goto L5b
            r8 = -1
            return r8
        L5b:
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
            r2 = this;
            int r0 = r2.state
            r1 = 5
            if (r0 != r1) goto L6
            return
        L6:
            com.google.android.exoplayer2.text.SubtitleDecoder r0 = r2.subtitleDecoder
            r0.release()
            r2.state = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long r2, long r4) {
            r1 = this;
            int r2 = r1.state
            r3 = 1
            if (r2 == 0) goto La
            r0 = 5
            if (r2 == r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            r1.seekTimeUs = r4
            int r2 = r1.state
            r4 = 2
            if (r2 != r4) goto L17
            r1.state = r3
        L17:
            int r2 = r1.state
            r3 = 4
            if (r2 != r3) goto L1f
            r2 = 3
            r1.state = r2
        L1f:
            return
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException {
            r0 = this;
            r1 = 1
            return r1
    }
}
