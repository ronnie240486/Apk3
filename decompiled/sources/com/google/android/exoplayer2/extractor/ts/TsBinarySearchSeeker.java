package com.google.android.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
final class TsBinarySearchSeeker extends com.google.android.exoplayer2.extractor.BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
    private static final long SEEK_TOLERANCE_US = 100000;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TsPcrSeeker implements com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker {
        private final com.google.android.exoplayer2.util.ParsableByteArray packetBuffer;
        private final int pcrPid;
        private final com.google.android.exoplayer2.util.TimestampAdjuster pcrTimestampAdjuster;
        private final int timestampSearchBytes;

        public TsPcrSeeker(int r1, com.google.android.exoplayer2.util.TimestampAdjuster r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.pcrPid = r1
                r0.pcrTimestampAdjuster = r2
                r0.timestampSearchBytes = r3
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                r1.<init>()
                r0.packetBuffer = r1
                return
        }

        private com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(com.google.android.exoplayer2.util.ParsableByteArray r17, long r18, long r20) {
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r20
                int r4 = r17.limit()
                r5 = -1
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = r5
                r11 = r7
            L13:
                int r13 = r17.bytesLeft()
                r14 = 188(0xbc, float:2.63E-43)
                if (r13 < r14) goto L67
                byte[] r13 = r17.getData()
                int r14 = r17.getPosition()
                int r13 = com.google.android.exoplayer2.extractor.ts.TsUtil.findSyncBytePosition(r13, r14, r4)
                int r14 = r13 + 188
                if (r14 <= r4) goto L2c
                goto L67
            L2c:
                int r5 = r0.pcrPid
                long r5 = com.google.android.exoplayer2.extractor.ts.TsUtil.readPcrFromPacket(r1, r13, r5)
                int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r15 == 0) goto L62
                com.google.android.exoplayer2.util.TimestampAdjuster r15 = r0.pcrTimestampAdjuster
                long r5 = r15.adjustTsTimestamp(r5)
                int r15 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                if (r15 <= 0) goto L50
                int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r1 != 0) goto L49
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r1 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(r5, r2)
                return r1
            L49:
                long r1 = r2 + r9
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r1 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(r1)
                return r1
            L50:
                r9 = 100000(0x186a0, double:4.94066E-319)
                long r9 = r9 + r5
                int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
                if (r11 <= 0) goto L60
                long r4 = (long) r13
                long r1 = r2 + r4
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r1 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(r1)
                return r1
            L60:
                long r9 = (long) r13
                r11 = r5
            L62:
                r1.setPosition(r14)
                long r5 = (long) r14
                goto L13
            L67:
                int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r1 == 0) goto L72
                long r1 = r2 + r5
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r1 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(r11, r1)
                return r1
            L72:
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r1 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT
                return r1
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
                int r0 = r6.timestampSearchBytes
                long r0 = (long) r0
                long r2 = r7.getLength()
                long r2 = r2 - r4
                long r0 = java.lang.Math.min(r0, r2)
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
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r7 = r0.searchForPcrValueInBuffer(r1, r2, r4)
                return r7
        }
    }

    public TsBinarySearchSeeker(com.google.android.exoplayer2.util.TimestampAdjuster r15, long r16, long r18, int r20, int r21) {
            r14 = this;
            com.google.android.exoplayer2.extractor.BinarySearchSeeker$DefaultSeekTimestampConverter r1 = new com.google.android.exoplayer2.extractor.BinarySearchSeeker$DefaultSeekTimestampConverter
            r1.<init>()
            com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker$TsPcrSeeker r2 = new com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker$TsPcrSeeker
            r0 = r15
            r3 = r20
            r4 = r21
            r2.<init>(r3, r15, r4)
            r3 = 1
            long r5 = r16 + r3
            r7 = 0
            r11 = 188(0xbc, double:9.3E-322)
            r13 = 940(0x3ac, float:1.317E-42)
            r0 = r14
            r3 = r16
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
    }
}
