package com.google.android.exoplayer2.extractor.flv;

/* JADX INFO: loaded from: classes.dex */
final class ScriptTagPayloadReader extends com.google.android.exoplayer2.extractor.flv.TagPayloadReader {
    private static final int AMF_TYPE_BOOLEAN = 1;
    private static final int AMF_TYPE_DATE = 11;
    private static final int AMF_TYPE_ECMA_ARRAY = 8;
    private static final int AMF_TYPE_END_MARKER = 9;
    private static final int AMF_TYPE_NUMBER = 0;
    private static final int AMF_TYPE_OBJECT = 3;
    private static final int AMF_TYPE_STRICT_ARRAY = 10;
    private static final int AMF_TYPE_STRING = 2;
    private static final java.lang.String KEY_DURATION = "duration";
    private static final java.lang.String KEY_FILE_POSITIONS = "filepositions";
    private static final java.lang.String KEY_KEY_FRAMES = "keyframes";
    private static final java.lang.String KEY_TIMES = "times";
    private static final java.lang.String NAME_METADATA = "onMetaData";
    private long durationUs;
    private long[] keyFrameTagPositions;
    private long[] keyFrameTimesUs;

    public ScriptTagPayloadReader() {
            r2 = this;
            com.google.android.exoplayer2.extractor.DummyTrackOutput r0 = new com.google.android.exoplayer2.extractor.DummyTrackOutput
            r0.<init>()
            r2.<init>(r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.durationUs = r0
            r0 = 0
            long[] r1 = new long[r0]
            r2.keyFrameTimesUs = r1
            long[] r0 = new long[r0]
            r2.keyFrameTagPositions = r0
            return
    }

    private static java.lang.Boolean readAmfBoolean(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            int r1 = r1.readUnsignedByte()
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
    }

    @androidx.annotation.Nullable
    private static java.lang.Object readAmfData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
            if (r2 == 0) goto L37
            r0 = 1
            if (r2 == r0) goto L32
            r0 = 2
            if (r2 == r0) goto L2d
            r0 = 3
            if (r2 == r0) goto L28
            r0 = 8
            if (r2 == r0) goto L23
            r0 = 10
            if (r2 == r0) goto L1e
            r0 = 11
            if (r2 == r0) goto L19
            r1 = 0
            return r1
        L19:
            java.util.Date r1 = readAmfDate(r1)
            return r1
        L1e:
            java.util.ArrayList r1 = readAmfStrictArray(r1)
            return r1
        L23:
            java.util.HashMap r1 = readAmfEcmaArray(r1)
            return r1
        L28:
            java.util.HashMap r1 = readAmfObject(r1)
            return r1
        L2d:
            java.lang.String r1 = readAmfString(r1)
            return r1
        L32:
            java.lang.Boolean r1 = readAmfBoolean(r1)
            return r1
        L37:
            java.lang.Double r1 = readAmfDouble(r1)
            return r1
    }

    private static java.util.Date readAmfDate(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            java.util.Date r0 = new java.util.Date
            java.lang.Double r1 = readAmfDouble(r3)
            double r1 = r1.doubleValue()
            long r1 = (long) r1
            r0.<init>(r1)
            r1 = 2
            r3.skipBytes(r1)
            return r0
    }

    private static java.lang.Double readAmfDouble(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static java.util.HashMap<java.lang.String, java.lang.Object> readAmfEcmaArray(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            int r0 = r5.readUnsignedIntToInt()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L20
            java.lang.String r3 = readAmfString(r5)
            int r4 = readAmfType(r5)
            java.lang.Object r4 = readAmfData(r5, r4)
            if (r4 == 0) goto L1d
            r1.put(r3, r4)
        L1d:
            int r2 = r2 + 1
            goto La
        L20:
            return r1
    }

    private static java.util.HashMap<java.lang.String, java.lang.Object> readAmfObject(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L5:
            java.lang.String r1 = readAmfString(r4)
            int r2 = readAmfType(r4)
            r3 = 9
            if (r2 != r3) goto L12
            return r0
        L12:
            java.lang.Object r2 = readAmfData(r4, r2)
            if (r2 == 0) goto L5
            r0.put(r1, r2)
            goto L5
    }

    private static java.util.ArrayList<java.lang.Object> readAmfStrictArray(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            int r0 = r4.readUnsignedIntToInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L1c
            int r3 = readAmfType(r4)
            java.lang.Object r3 = readAmfData(r4, r3)
            if (r3 == 0) goto L19
            r1.add(r3)
        L19:
            int r2 = r2 + 1
            goto La
        L1c:
            return r1
    }

    private static java.lang.String readAmfString(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            int r0 = r3.readUnsignedShort()
            int r1 = r3.getPosition()
            r3.skipBytes(r0)
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r3.getData()
            r2.<init>(r3, r1, r0)
            return r2
    }

    private static int readAmfType(com.google.android.exoplayer2.util.ParsableByteArray r0) {
            int r0 = r0.readUnsignedByte()
            return r0
    }

    public long getDurationUs() {
            r2 = this;
            long r0 = r2.durationUs
            return r0
    }

    public long[] getKeyFrameTagPositions() {
            r1 = this;
            long[] r0 = r1.keyFrameTagPositions
            return r0
    }

    public long[] getKeyFrameTimesUs() {
            r1 = this;
            long[] r0 = r1.keyFrameTimesUs
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean parseHeader(com.google.android.exoplayer2.util.ParsableByteArray r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean parsePayload(com.google.android.exoplayer2.util.ParsableByteArray r10, long r11) {
            r9 = this;
            int r11 = readAmfType(r10)
            r12 = 0
            r0 = 2
            if (r11 == r0) goto L9
            return r12
        L9:
            java.lang.String r11 = readAmfString(r10)
            java.lang.String r0 = "onMetaData"
            boolean r11 = r0.equals(r11)
            if (r11 != 0) goto L16
            return r12
        L16:
            int r11 = r10.bytesLeft()
            if (r11 != 0) goto L1d
            return r12
        L1d:
            int r11 = readAmfType(r10)
            r0 = 8
            if (r11 == r0) goto L26
            return r12
        L26:
            java.util.HashMap r10 = readAmfEcmaArray(r10)
            java.lang.String r11 = "duration"
            java.lang.Object r11 = r10.get(r11)
            boolean r0 = r11 instanceof java.lang.Double
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r0 == 0) goto L4a
            java.lang.Double r11 = (java.lang.Double) r11
            double r3 = r11.doubleValue()
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L4a
            double r3 = r3 * r1
            long r3 = (long) r3
            r9.durationUs = r3
        L4a:
            java.lang.String r11 = "keyframes"
            java.lang.Object r10 = r10.get(r11)
            boolean r11 = r10 instanceof java.util.Map
            if (r11 == 0) goto Lb0
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r11 = "filepositions"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r0 = "times"
            java.lang.Object r10 = r10.get(r0)
            boolean r0 = r11 instanceof java.util.List
            if (r0 == 0) goto Lb0
            boolean r0 = r10 instanceof java.util.List
            if (r0 == 0) goto Lb0
            java.util.List r11 = (java.util.List) r11
            java.util.List r10 = (java.util.List) r10
            int r0 = r10.size()
            long[] r3 = new long[r0]
            r9.keyFrameTimesUs = r3
            long[] r3 = new long[r0]
            r9.keyFrameTagPositions = r3
            r3 = 0
        L7c:
            if (r3 >= r0) goto Lb0
            java.lang.Object r4 = r11.get(r3)
            java.lang.Object r5 = r10.get(r3)
            boolean r6 = r5 instanceof java.lang.Double
            if (r6 == 0) goto La8
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto La8
            long[] r6 = r9.keyFrameTimesUs
            java.lang.Double r5 = (java.lang.Double) r5
            double r7 = r5.doubleValue()
            double r7 = r7 * r1
            long r7 = (long) r7
            r6[r3] = r7
            long[] r5 = r9.keyFrameTagPositions
            java.lang.Double r4 = (java.lang.Double) r4
            long r6 = r4.longValue()
            r5[r3] = r6
            int r3 = r3 + 1
            goto L7c
        La8:
            long[] r10 = new long[r12]
            r9.keyFrameTimesUs = r10
            long[] r10 = new long[r12]
            r9.keyFrameTagPositions = r10
        Lb0:
            return r12
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
            r0 = this;
            return
    }
}
