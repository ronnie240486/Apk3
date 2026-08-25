package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes2.dex */
final class PsBinarySearchSeeker extends com.google.android.exoplayer2.extractor.BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 1000;
    private static final long SEEK_TOLERANCE_US = 100000;
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class PsScrSeeker implements com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker {
        private final com.google.android.exoplayer2.util.ParsableByteArray packetBuffer;
        private final com.google.android.exoplayer2.util.TimestampAdjuster scrTimestampAdjuster;

        private PsScrSeeker(com.google.android.exoplayer2.util.TimestampAdjuster r1) {
                r0 = this;
                r0.<init>()
                r0.scrTimestampAdjuster = r1
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                r1.<init>()
                r0.packetBuffer = r1
                return
        }

        public /* synthetic */ PsScrSeeker(com.google.android.exoplayer2.util.TimestampAdjuster r1, com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult searchForScrValueInBuffer(com.google.android.exoplayer2.util.ParsableByteArray r10, long r11, long r13) {
                r9 = this;
                r0 = -1
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r4 = r1
                r3 = -1
            L8:
                int r6 = r10.bytesLeft()
                r7 = 4
                if (r6 < r7) goto L6a
                byte[] r6 = r10.getData()
                int r8 = r10.getPosition()
                int r6 = com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker.access$100(r6, r8)
                r8 = 442(0x1ba, float:6.2E-43)
                if (r6 == r8) goto L24
                r6 = 1
                r10.skipBytes(r6)
                goto L8
            L24:
                r10.skipBytes(r7)
                long r6 = com.google.android.exoplayer2.extractor.ts.PsDurationReader.readScrValueFromPack(r10)
                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r0 == 0) goto L62
                com.google.android.exoplayer2.util.TimestampAdjuster r0 = r9.scrTimestampAdjuster
                long r6 = r0.adjustTsTimestamp(r6)
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 <= 0) goto L49
                int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r10 != 0) goto L42
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r10 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(r6, r13)
                return r10
            L42:
                long r10 = (long) r3
                long r13 = r13 + r10
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r10 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(r13)
                return r10
            L49:
                r3 = 100000(0x186a0, double:4.94066E-319)
                long r3 = r3 + r6
                int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r0 <= 0) goto L5c
                int r10 = r10.getPosition()
                long r10 = (long) r10
                long r13 = r13 + r10
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r10 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(r13)
                return r10
            L5c:
                int r0 = r10.getPosition()
                r3 = r0
                r4 = r6
            L62:
                skipToEndOfCurrentPack(r10)
                int r0 = r10.getPosition()
                goto L8
            L6a:
                int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r10 == 0) goto L75
                long r10 = (long) r0
                long r13 = r13 + r10
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r10 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(r4, r13)
                return r10
            L75:
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r10 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT
                return r10
        }

        private static void skipToEndOfCurrentPack(com.google.android.exoplayer2.util.ParsableByteArray r5) {
                int r0 = r5.limit()
                int r1 = r5.bytesLeft()
                r2 = 10
                if (r1 >= r2) goto L10
                r5.setPosition(r0)
                return
            L10:
                r1 = 9
                r5.skipBytes(r1)
                int r1 = r5.readUnsignedByte()
                r1 = r1 & 7
                int r2 = r5.bytesLeft()
                if (r2 >= r1) goto L25
                r5.setPosition(r0)
                return
            L25:
                r5.skipBytes(r1)
                int r1 = r5.bytesLeft()
                r2 = 4
                if (r1 >= r2) goto L33
                r5.setPosition(r0)
                return
            L33:
                byte[] r1 = r5.getData()
                int r3 = r5.getPosition()
                int r1 = com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker.access$100(r1, r3)
                r3 = 443(0x1bb, float:6.21E-43)
                if (r1 != r3) goto L57
                r5.skipBytes(r2)
                int r1 = r5.readUnsignedShort()
                int r3 = r5.bytesLeft()
                if (r3 >= r1) goto L54
                r5.setPosition(r0)
                return
            L54:
                r5.skipBytes(r1)
            L57:
                int r1 = r5.bytesLeft()
                if (r1 < r2) goto L9b
                byte[] r1 = r5.getData()
                int r3 = r5.getPosition()
                int r1 = com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker.access$100(r1, r3)
                r3 = 442(0x1ba, float:6.2E-43)
                if (r1 == r3) goto L9b
                r3 = 441(0x1b9, float:6.18E-43)
                if (r1 != r3) goto L72
                goto L9b
            L72:
                int r1 = r1 >>> 8
                r3 = 1
                if (r1 == r3) goto L78
                goto L9b
            L78:
                r5.skipBytes(r2)
                int r1 = r5.bytesLeft()
                r3 = 2
                if (r1 >= r3) goto L86
                r5.setPosition(r0)
                return
            L86:
                int r1 = r5.readUnsignedShort()
                int r3 = r5.limit()
                int r4 = r5.getPosition()
                int r4 = r4 + r1
                int r1 = java.lang.Math.min(r3, r4)
                r5.setPosition(r1)
                goto L57
            L9b:
                return
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
                r2 = this;
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r2.packetBuffer
                byte[] r1 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
                r0.reset(r1)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(com.google.android.exoplayer2.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
                r6 = this;
                long r4 = r7.getPosition()
                long r0 = r7.getLength()
                long r0 = r0 - r4
                r2 = 20000(0x4e20, double:9.8813E-320)
                long r0 = java.lang.Math.min(r2, r0)
                int r1 = (int) r0
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.packetBuffer
                r0.reset(r1)
                com.google.android.exoplayer2.util.ParsableByteArray r0 = r6.packetBuffer
                byte[] r0 = r0.getData()
                r2 = 0
                r7.peekFully(r0, r2, r1)
                com.google.android.exoplayer2.util.ParsableByteArray r1 = r6.packetBuffer
                r0 = r6
                r2 = r8
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r7 = r0.searchForScrValueInBuffer(r1, r2, r4)
                return r7
        }
    }

    public PsBinarySearchSeeker(com.google.android.exoplayer2.util.TimestampAdjuster r15, long r16, long r18) {
            r14 = this;
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$DefaultSeekTimestampConverter r1 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$DefaultSeekTimestampConverter
            r1.<init>()
            com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker$PsScrSeeker r2 = new com.google.android.exoplayer2.extractor.ts.PsBinarySearchSeeker$PsScrSeeker
            r0 = 0
            r3 = r15
            r2.<init>(r15, r0)
            r3 = 1
            long r5 = r16 + r3
            r7 = 0
            r11 = 188(0xbc, double:9.3E-322)
            r13 = 1000(0x3e8, float:1.401E-42)
            r0 = r14
            r3 = r16
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
    }

    public static /* synthetic */ int access$100(byte[] r0, int r1) {
            int r0 = peekIntAtPosition(r0, r1)
            return r0
    }

    private static int peekIntAtPosition(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }
}
