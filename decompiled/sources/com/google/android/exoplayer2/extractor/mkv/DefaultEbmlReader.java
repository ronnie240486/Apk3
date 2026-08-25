package com.google.android.exoplayer2.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
final class DefaultEbmlReader implements com.google.android.exoplayer2.extractor.mkv.EbmlReader {
    private static final int ELEMENT_STATE_READ_CONTENT = 2;
    private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
    private static final int ELEMENT_STATE_READ_ID = 0;
    private static final int MAX_ID_BYTES = 4;
    private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
    private static final int MAX_LENGTH_BYTES = 8;
    private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
    private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
    private long elementContentSize;
    private int elementId;
    private int elementState;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.MasterElement> masterElementsStack;
    private com.google.android.exoplayer2.extractor.mkv.EbmlProcessor processor;
    private final byte[] scratch;
    private final com.google.android.exoplayer2.extractor.mkv.VarintReader varintReader;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class MasterElement {
        private final long elementEndPosition;
        private final int elementId;

        private MasterElement(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.elementId = r1
                r0.elementEndPosition = r2
                return
        }

        public /* synthetic */ MasterElement(int r1, long r2, com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ long access$000(com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.MasterElement r2) {
                long r0 = r2.elementEndPosition
                return r0
        }

        public static /* synthetic */ int access$100(com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.MasterElement r0) {
                int r0 = r0.elementId
                return r0
        }
    }

    public DefaultEbmlReader() {
            r1 = this;
            r1.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r1.scratch = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.masterElementsStack = r0
            com.google.android.exoplayer2.extractor.mkv.VarintReader r0 = new com.google.android.exoplayer2.extractor.mkv.VarintReader
            r0.<init>()
            r1.varintReader = r0
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"processor"})
    private long maybeResyncToNextLevel1Element(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
            r4 = this;
            r5.resetPeekPosition()
        L3:
            byte[] r0 = r4.scratch
            r1 = 0
            r2 = 4
            r5.peekFully(r0, r1, r2)
            byte[] r0 = r4.scratch
            r0 = r0[r1]
            int r0 = com.google.android.exoplayer2.extractor.mkv.VarintReader.parseUnsignedVarintLength(r0)
            r3 = -1
            if (r0 == r3) goto L2b
            if (r0 > r2) goto L2b
            byte[] r2 = r4.scratch
            long r1 = com.google.android.exoplayer2.extractor.mkv.VarintReader.assembleVarint(r2, r0, r1)
            int r2 = (int) r1
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r1 = r4.processor
            boolean r1 = r1.isLevel1Element(r2)
            if (r1 == 0) goto L2b
            r5.skipFully(r0)
            long r0 = (long) r2
            return r0
        L2b:
            r0 = 1
            r5.skipFully(r0)
            goto L3
    }

    private double readFloat(com.google.android.exoplayer2.extractor.ExtractorInput r3, int r4) throws java.io.IOException {
            r2 = this;
            long r0 = r2.readInteger(r3, r4)
            r3 = 4
            if (r4 != r3) goto Le
            int r3 = (int) r0
            float r3 = java.lang.Float.intBitsToFloat(r3)
            double r3 = (double) r3
            goto L12
        Le:
            double r3 = java.lang.Double.longBitsToDouble(r0)
        L12:
            return r3
    }

    private long readInteger(com.google.android.exoplayer2.extractor.ExtractorInput r7, int r8) throws java.io.IOException {
            r6 = this;
            byte[] r0 = r6.scratch
            r1 = 0
            r7.readFully(r0, r1, r8)
            r2 = 0
        L8:
            if (r1 >= r8) goto L18
            r7 = 8
            long r2 = r2 << r7
            byte[] r7 = r6.scratch
            r7 = r7[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r4 = (long) r7
            long r2 = r2 | r4
            int r1 = r1 + 1
            goto L8
        L18:
            return r2
    }

    private static java.lang.String readString(com.google.android.exoplayer2.extractor.ExtractorInput r2, int r3) throws java.io.IOException {
            if (r3 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            byte[] r0 = new byte[r3]
            r1 = 0
            r2.readFully(r0, r1, r3)
        Lb:
            if (r3 <= 0) goto L16
            int r2 = r3 + (-1)
            r2 = r0[r2]
            if (r2 != 0) goto L16
            int r3 = r3 + (-1)
            goto Lb
        L16:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r1, r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void init(com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r1) {
            r0 = this;
            r0.processor = r1
            return
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public boolean read(com.google.android.exoplayer2.extractor.ExtractorInput r13) throws java.io.IOException {
            r12 = this;
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r0 = r12.processor
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
        L5:
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement> r0 = r12.masterElementsStack
            java.lang.Object r0 = r0.peek()
            com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement r0 = (com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.MasterElement) r0
            r1 = 1
            if (r0 == 0) goto L2e
            long r2 = r13.getPosition()
            long r4 = com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.MasterElement.access$000(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L2e
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r13 = r12.processor
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement> r0 = r12.masterElementsStack
            java.lang.Object r0 = r0.pop()
            com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement r0 = (com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.MasterElement) r0
            int r0 = com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader.MasterElement.access$100(r0)
            r13.endMasterElement(r0)
            return r1
        L2e:
            int r0 = r12.elementState
            r2 = 4
            r3 = 0
            if (r0 != 0) goto L50
            com.google.android.exoplayer2.extractor.mkv.VarintReader r0 = r12.varintReader
            long r4 = r0.readUnsignedVarint(r13, r1, r3, r2)
            r6 = -2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L44
            long r4 = r12.maybeResyncToNextLevel1Element(r13)
        L44:
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4b
            return r3
        L4b:
            int r0 = (int) r4
            r12.elementId = r0
            r12.elementState = r1
        L50:
            int r0 = r12.elementState
            r4 = 2
            if (r0 != r1) goto L61
            com.google.android.exoplayer2.extractor.mkv.VarintReader r0 = r12.varintReader
            r5 = 8
            long r5 = r0.readUnsignedVarint(r13, r3, r1, r5)
            r12.elementContentSize = r5
            r12.elementState = r4
        L61:
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r0 = r12.processor
            int r5 = r12.elementId
            int r0 = r0.getElementType(r5)
            if (r0 == 0) goto L141
            r5 = 0
            if (r0 == r1) goto L122
            r6 = 8
            if (r0 == r4) goto Lf9
            r4 = 3
            if (r0 == r4) goto Lcd
            if (r0 == r2) goto Lc0
            r2 = 5
            if (r0 != r2) goto Laa
            long r8 = r12.elementContentSize
            r10 = 4
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L9b
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L87
            goto L9b
        L87:
            java.lang.String r13 = "Invalid float size: "
            java.lang.StringBuilder r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13)
            long r0 = r12.elementContentSize
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r13, r5)
            throw r13
        L9b:
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r0 = r12.processor
            int r2 = r12.elementId
            int r4 = (int) r8
            double r4 = r12.readFloat(r13, r4)
            r0.floatElement(r2, r4)
            r12.elementState = r3
            return r1
        Laa:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "Invalid element type "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r13, r5)
            throw r13
        Lc0:
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r0 = r12.processor
            int r2 = r12.elementId
            long r4 = r12.elementContentSize
            int r5 = (int) r4
            r0.binaryElement(r2, r5, r13)
            r12.elementState = r3
            return r1
        Lcd:
            long r6 = r12.elementContentSize
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto Le5
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r0 = r12.processor
            int r2 = r12.elementId
            int r4 = (int) r6
            java.lang.String r13 = readString(r13, r4)
            r0.stringElement(r2, r13)
            r12.elementState = r3
            return r1
        Le5:
            java.lang.String r13 = "String element size: "
            java.lang.StringBuilder r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13)
            long r0 = r12.elementContentSize
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r13, r5)
            throw r13
        Lf9:
            long r8 = r12.elementContentSize
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L10e
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r0 = r12.processor
            int r2 = r12.elementId
            int r4 = (int) r8
            long r4 = r12.readInteger(r13, r4)
            r0.integerElement(r2, r4)
            r12.elementState = r3
            return r1
        L10e:
            java.lang.String r13 = "Invalid integer size: "
            java.lang.StringBuilder r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13)
            long r0 = r12.elementContentSize
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r13, r5)
            throw r13
        L122:
            long r6 = r13.getPosition()
            long r8 = r12.elementContentSize
            long r8 = r8 + r6
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement> r13 = r12.masterElementsStack
            com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement r0 = new com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement
            int r2 = r12.elementId
            r0.<init>(r2, r8, r5)
            r13.push(r0)
            com.google.android.exoplayer2.extractor.mkv.EbmlProcessor r4 = r12.processor
            int r5 = r12.elementId
            long r8 = r12.elementContentSize
            r4.startMasterElement(r5, r6, r8)
            r12.elementState = r3
            return r1
        L141:
            long r0 = r12.elementContentSize
            int r1 = (int) r0
            r13.skipFully(r1)
            r12.elementState = r3
            goto L5
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void reset() {
            r1 = this;
            r0 = 0
            r1.elementState = r0
            java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader$MasterElement> r0 = r1.masterElementsStack
            r0.clear()
            com.google.android.exoplayer2.extractor.mkv.VarintReader r0 = r1.varintReader
            r0.reset()
            return
    }
}
