package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
final class SefReader {
    private static final com.google.common.base.Splitter ASTERISK_SPLITTER = null;
    private static final com.google.common.base.Splitter COLON_SPLITTER = null;
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final java.lang.String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final java.util.List<com.google.android.exoplayer2.extractor.mp4.SefReader.DataReference> dataReferences;
    private int readerState;
    private int tailLength;

    public static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.dataType = r1
                r0.startOffset = r2
                r0.size = r4
                return
        }
    }

    static {
            r0 = 58
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.android.exoplayer2.extractor.mp4.SefReader.COLON_SPLITTER = r0
            r0 = 42
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.android.exoplayer2.extractor.mp4.SefReader.ASTERISK_SPLITTER = r0
            return
    }

    public SefReader() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.dataReferences = r0
            r0 = 0
            r1.readerState = r0
            return
    }

    private void checkForSefData(com.google.android.exoplayer2.extractor.ExtractorInput r5, com.google.android.exoplayer2.extractor.PositionHolder r6) throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 8
            r0.<init>(r1)
            byte[] r2 = r0.getData()
            r3 = 0
            r5.readFully(r2, r3, r1)
            int r2 = r0.readLittleEndianInt()
            int r2 = r2 + r1
            r4.tailLength = r2
            int r0 = r0.readInt()
            r1 = 1397048916(0x53454654, float:8.472885E11)
            if (r0 == r1) goto L24
            r0 = 0
            r6.position = r0
            return
        L24:
            long r0 = r5.getPosition()
            int r5 = r4.tailLength
            int r5 = r5 + (-12)
            long r2 = (long) r5
            long r0 = r0 - r2
            r6.position = r0
            r5 = 2
            r4.readerState = r5
            return
    }

    private static int nameToDataType(java.lang.String r2) throws com.google.android.exoplayer2.ParserException {
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1711564334: goto L38;
                case -1332107749: goto L2d;
                case -1251387154: goto L22;
                case -830665521: goto L17;
                case 1760745220: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L42
        Lc:
            java.lang.String r0 = "Super_SlowMotion_BGM"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L15
            goto L42
        L15:
            r1 = 4
            goto L42
        L17:
            java.lang.String r0 = "Super_SlowMotion_Deflickering_On"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L42
        L20:
            r1 = 3
            goto L42
        L22:
            java.lang.String r0 = "Super_SlowMotion_Data"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L42
        L2b:
            r1 = 2
            goto L42
        L2d:
            java.lang.String r0 = "Super_SlowMotion_Edit_Data"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
            goto L42
        L36:
            r1 = 1
            goto L42
        L38:
            java.lang.String r0 = "SlowMotion_Data"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L42
        L41:
            r1 = 0
        L42:
            switch(r1) {
                case 0: goto L59;
                case 1: goto L56;
                case 2: goto L53;
                case 3: goto L50;
                case 4: goto L4d;
                default: goto L45;
            }
        L45:
            r2 = 0
            java.lang.String r0 = "Invalid SEF name"
            com.google.android.exoplayer2.ParserException r2 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r2)
            throw r2
        L4d:
            r2 = 2817(0xb01, float:3.947E-42)
            return r2
        L50:
            r2 = 2820(0xb04, float:3.952E-42)
            return r2
        L53:
            r2 = 2816(0xb00, float:3.946E-42)
            return r2
        L56:
            r2 = 2819(0xb03, float:3.95E-42)
            return r2
        L59:
            r2 = 2192(0x890, float:3.072E-42)
            return r2
    }

    private void readSdrs(com.google.android.exoplayer2.extractor.ExtractorInput r13, com.google.android.exoplayer2.extractor.PositionHolder r14) throws java.io.IOException {
            r12 = this;
            long r0 = r13.getLength()
            int r2 = r12.tailLength
            int r2 = r2 + (-12)
            r3 = 8
            int r2 = r2 - r3
            com.google.android.exoplayer2.util.ParsableByteArray r4 = new com.google.android.exoplayer2.util.ParsableByteArray
            r4.<init>(r2)
            byte[] r5 = r4.getData()
            r6 = 0
            r13.readFully(r5, r6, r2)
            r13 = 0
        L19:
            int r5 = r2 / 12
            if (r13 >= r5) goto L59
            r5 = 2
            r4.skipBytes(r5)
            short r5 = r4.readLittleEndianShort()
            r7 = 2192(0x890, float:3.072E-42)
            if (r5 == r7) goto L3d
            r7 = 2816(0xb00, float:3.946E-42)
            if (r5 == r7) goto L3d
            r7 = 2817(0xb01, float:3.947E-42)
            if (r5 == r7) goto L3d
            r7 = 2819(0xb03, float:3.95E-42)
            if (r5 == r7) goto L3d
            r7 = 2820(0xb04, float:3.952E-42)
            if (r5 == r7) goto L3d
            r4.skipBytes(r3)
            goto L56
        L3d:
            int r7 = r12.tailLength
            long r7 = (long) r7
            long r7 = r0 - r7
            int r9 = r4.readLittleEndianInt()
            long r9 = (long) r9
            long r7 = r7 - r9
            int r9 = r4.readLittleEndianInt()
            java.util.List<com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference> r10 = r12.dataReferences
            com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference r11 = new com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference
            r11.<init>(r5, r7, r9)
            r10.add(r11)
        L56:
            int r13 = r13 + 1
            goto L19
        L59:
            java.util.List<com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference> r13 = r12.dataReferences
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L66
            r0 = 0
            r14.position = r0
            return
        L66:
            r13 = 3
            r12.readerState = r13
            java.util.List<com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference> r13 = r12.dataReferences
            java.lang.Object r13 = r13.get(r6)
            com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference r13 = (com.google.android.exoplayer2.extractor.mp4.SefReader.DataReference) r13
            long r0 = r13.startOffset
            r14.position = r0
            return
    }

    private void readSefData(com.google.android.exoplayer2.extractor.ExtractorInput r7, java.util.List<com.google.android.exoplayer2.metadata.Metadata.Entry> r8) throws java.io.IOException {
            r6 = this;
            long r0 = r7.getPosition()
            long r2 = r7.getLength()
            long r4 = r7.getPosition()
            long r2 = r2 - r4
            int r4 = r6.tailLength
            long r4 = (long) r4
            long r2 = r2 - r4
            int r3 = (int) r2
            com.google.android.exoplayer2.util.ParsableByteArray r2 = new com.google.android.exoplayer2.util.ParsableByteArray
            r2.<init>(r3)
            byte[] r4 = r2.getData()
            r5 = 0
            r7.readFully(r4, r5, r3)
        L1f:
            java.util.List<com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference> r7 = r6.dataReferences
            int r7 = r7.size()
            if (r5 >= r7) goto L70
            java.util.List<com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference> r7 = r6.dataReferences
            java.lang.Object r7 = r7.get(r5)
            com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference r7 = (com.google.android.exoplayer2.extractor.mp4.SefReader.DataReference) r7
            long r3 = r7.startOffset
            long r3 = r3 - r0
            int r4 = (int) r3
            r2.setPosition(r4)
            r3 = 4
            r2.skipBytes(r3)
            int r3 = r2.readLittleEndianInt()
            java.lang.String r4 = r2.readString(r3)
            int r4 = nameToDataType(r4)
            int r7 = r7.size
            int r3 = r3 + 8
            int r7 = r7 - r3
            r3 = 2192(0x890, float:3.072E-42)
            if (r4 == r3) goto L66
            r7 = 2816(0xb00, float:3.946E-42)
            if (r4 == r7) goto L6d
            r7 = 2817(0xb01, float:3.947E-42)
            if (r4 == r7) goto L6d
            r7 = 2819(0xb03, float:3.95E-42)
            if (r4 == r7) goto L6d
            r7 = 2820(0xb04, float:3.952E-42)
            if (r4 != r7) goto L60
            goto L6d
        L60:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L66:
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData r7 = readSlowMotionData(r2, r7)
            r8.add(r7)
        L6d:
            int r5 = r5 + 1
            goto L1f
        L70:
            return
    }

    private static com.google.android.exoplayer2.metadata.mp4.SlowMotionData readSlowMotionData(com.google.android.exoplayer2.util.ParsableByteArray r12, int r13) throws com.google.android.exoplayer2.ParserException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r12 = r12.readString(r13)
            com.google.common.base.Splitter r13 = com.google.android.exoplayer2.extractor.mp4.SefReader.ASTERISK_SPLITTER
            java.util.List r12 = r13.splitToList(r12)
            r13 = 0
            r1 = 0
        L11:
            int r2 = r12.size()
            if (r1 >= r2) goto L65
            com.google.common.base.Splitter r2 = com.google.android.exoplayer2.extractor.mp4.SefReader.COLON_SPLITTER
            java.lang.Object r3 = r12.get(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.util.List r2 = r2.splitToList(r3)
            int r3 = r2.size()
            r4 = 3
            r5 = 0
            if (r3 != r4) goto L60
            java.lang.Object r3 = r2.get(r13)     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L5a
            long r7 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L5a
            r3 = 1
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L5a
            long r9 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L5a
            r4 = 2
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L5a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L5a
            int r2 = r2 - r3
            int r11 = r3 << r2
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r2 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment     // Catch: java.lang.NumberFormatException -> L5a
            r6 = r2
            r6.<init>(r7, r9, r11)     // Catch: java.lang.NumberFormatException -> L5a
            r0.add(r2)     // Catch: java.lang.NumberFormatException -> L5a
            int r1 = r1 + 1
            goto L11
        L5a:
            r12 = move-exception
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r5, r12)
            throw r12
        L60:
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r5, r5)
            throw r12
        L65:
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData r12 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData
            r12.<init>(r0)
            return r12
    }

    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r9, com.google.android.exoplayer2.extractor.PositionHolder r10, java.util.List<com.google.android.exoplayer2.metadata.Metadata.Entry> r11) throws java.io.IOException {
            r8 = this;
            int r0 = r8.readerState
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1f
            r4 = 2
            if (r0 == r4) goto L1b
            r4 = 3
            if (r0 != r4) goto L15
            r8.readSefData(r9, r11)
            r10.position = r1
            goto L3a
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L1b:
            r8.readSdrs(r9, r10)
            goto L3a
        L1f:
            r8.checkForSefData(r9, r10)
            goto L3a
        L23:
            long r4 = r9.getLength()
            r6 = -1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L36
            r6 = 8
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L34
            goto L36
        L34:
            long r1 = r4 - r6
        L36:
            r10.position = r1
            r8.readerState = r3
        L3a:
            return r3
    }

    public void reset() {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.extractor.mp4.SefReader$DataReference> r0 = r1.dataReferences
            r0.clear()
            r0 = 0
            r1.readerState = r0
            return
    }
}
