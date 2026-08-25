package com.google.android.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultOggSeeker implements com.google.android.exoplayer2.extractor.ogg.OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final com.google.android.exoplayer2.extractor.ogg.OggPageHeader pageHeader;
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final com.google.android.exoplayer2.extractor.ogg.StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class OggSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
        public final /* synthetic */ com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker this$0;

        private OggSeekMap(com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ OggSeekMap(com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r1, com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
                r3 = this;
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r0 = r3.this$0
                com.google.android.exoplayer2.extractor.ogg.StreamReader r0 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$100(r0)
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r1 = r3.this$0
                long r1 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$400(r1)
                long r0 = r0.convertGranuleToTime(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r13) {
                r12 = this;
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r0 = r12.this$0
                com.google.android.exoplayer2.extractor.ogg.StreamReader r0 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$100(r0)
                long r0 = r0.convertTimeToGranule(r13)
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r2 = r12.this$0
                long r2 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$200(r2)
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r4 = r12.this$0
                long r4 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$300(r4)
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r6 = r12.this$0
                long r6 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$200(r6)
                long r4 = r4 - r6
                long r4 = r4 * r0
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r0 = r12.this$0
                long r0 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$400(r0)
                long r4 = r4 / r0
                long r4 = r4 + r2
                r0 = 30000(0x7530, double:1.4822E-319)
                long r6 = r4 - r0
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r0 = r12.this$0
                long r8 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$200(r0)
                com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r0 = r12.this$0
                long r0 = com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.access$300(r0)
                r2 = 1
                long r10 = r0 - r2
                long r0 = com.google.android.exoplayer2.util.Util.constrainValue(r6, r8, r10)
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r2 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
                com.google.android.exoplayer2.extractor.SeekPoint r3 = new com.google.android.exoplayer2.extractor.SeekPoint
                r3.<init>(r13, r0)
                r2.<init>(r3)
                return r2
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public DefaultOggSeeker(com.google.android.exoplayer2.extractor.ogg.StreamReader r5, long r6, long r8, long r10, long r12, boolean r14) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L10
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r4.streamReader = r5
            r4.payloadStartPosition = r6
            r4.payloadEndPosition = r8
            long r8 = r8 - r6
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L25
            if (r14 == 0) goto L22
            goto L25
        L22:
            r4.state = r0
            goto L2a
        L25:
            r4.totalGranules = r12
            r5 = 4
            r4.state = r5
        L2a:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r5 = new com.google.android.exoplayer2.extractor.ogg.OggPageHeader
            r5.<init>()
            r4.pageHeader = r5
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.extractor.ogg.StreamReader access$100(com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r0) {
            com.google.android.exoplayer2.extractor.ogg.StreamReader r0 = r0.streamReader
            return r0
    }

    public static /* synthetic */ long access$200(com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r2) {
            long r0 = r2.payloadStartPosition
            return r0
    }

    public static /* synthetic */ long access$300(com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r2) {
            long r0 = r2.payloadEndPosition
            return r0
    }

    public static /* synthetic */ long access$400(com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker r2) {
            long r0 = r2.totalGranules
            return r0
    }

    private long getNextSeekPosition(com.google.android.exoplayer2.extractor.ExtractorInput r18) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = r0.start
            long r4 = r0.end
            r6 = -1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto Lf
            return r6
        Lf:
            long r2 = r18.getPosition()
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r4 = r0.pageHeader
            long r8 = r0.end
            boolean r4 = r4.skipToNextPage(r1, r8)
            if (r4 != 0) goto L2c
            long r4 = r0.start
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L24
            return r4
        L24:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L2c:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r4 = r0.pageHeader
            r5 = 0
            r4.populate(r1, r5)
            r18.resetPeekPosition()
            long r4 = r0.targetGranule
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r8 = r0.pageHeader
            long r9 = r8.granulePosition
            long r4 = r4 - r9
            int r11 = r8.headerSize
            int r8 = r8.bodySize
            int r11 = r11 + r8
            r12 = 0
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 > 0) goto L4f
            r14 = 72000(0x11940, double:3.55727E-319)
            int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r8 >= 0) goto L4f
            return r6
        L4f:
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 >= 0) goto L58
            r0.end = r2
            r0.endGranule = r9
            goto L66
        L58:
            long r2 = r18.getPosition()
            long r7 = (long) r11
            long r2 = r2 + r7
            r0.start = r2
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r2 = r0.pageHeader
            long r2 = r2.granulePosition
            r0.startGranule = r2
        L66:
            long r2 = r0.end
            long r7 = r0.start
            long r2 = r2 - r7
            r9 = 100000(0x186a0, double:4.94066E-319)
            int r12 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r12 >= 0) goto L75
            r0.end = r7
            return r7
        L75:
            long r2 = (long) r11
            r7 = 1
            if (r6 > 0) goto L7d
            r9 = 2
            goto L7e
        L7d:
            r9 = r7
        L7e:
            long r2 = r2 * r9
            long r9 = r18.getPosition()
            long r9 = r9 - r2
            long r1 = r0.end
            long r13 = r0.start
            long r11 = r1 - r13
            long r11 = r11 * r4
            long r3 = r0.endGranule
            long r5 = r0.startGranule
            long r3 = r3 - r5
            long r11 = r11 / r3
            long r11 = r11 + r9
            long r15 = r1 - r7
            long r1 = com.google.android.exoplayer2.util.Util.constrainValue(r11, r13, r15)
            return r1
    }

    private void skipToPageOfTargetGranule(com.google.android.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException {
            r6 = this;
        L0:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r6.pageHeader
            r0.skipToNextPage(r7)
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r6.pageHeader
            r1 = 0
            r0.populate(r7, r1)
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r6.pageHeader
            long r1 = r0.granulePosition
            long r3 = r6.targetGranule
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L19
            r7.resetPeekPosition()
            return
        L19:
            int r1 = r0.headerSize
            int r0 = r0.bodySize
            int r1 = r1 + r0
            r7.skipFully(r1)
            long r0 = r7.getPosition()
            r6.start = r0
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r6.pageHeader
            long r0 = r0.granulePosition
            r6.startGranule = r0
            goto L0
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.extractor.SeekMap createSeekMap() {
            r1 = this;
            com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker$OggSeekMap r0 = r1.createSeekMap()
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.OggSeekMap createSeekMap() {
            r6 = this;
            long r0 = r6.totalGranules
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto Lf
            com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker$OggSeekMap r0 = new com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker$OggSeekMap
            r0.<init>(r6, r2)
            r2 = r0
        Lf:
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public long read(com.google.android.exoplayer2.extractor.ExtractorInput r10) throws java.io.IOException {
            r9 = this;
            int r0 = r9.state
            r1 = 1
            r2 = 4
            if (r0 == 0) goto L30
            if (r0 == r1) goto L43
            r1 = 2
            r3 = -1
            r5 = 3
            if (r0 == r1) goto L19
            if (r0 == r5) goto L24
            if (r0 != r2) goto L13
            return r3
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L19:
            long r0 = r9.getNextSeekPosition(r10)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L22
            return r0
        L22:
            r9.state = r5
        L24:
            r9.skipToPageOfTargetGranule(r10)
            r9.state = r2
            long r0 = r9.startGranule
            r2 = 2
            long r0 = r0 + r2
            long r0 = -r0
            return r0
        L30:
            long r3 = r10.getPosition()
            r9.positionBeforeSeekToEnd = r3
            r9.state = r1
            long r5 = r9.payloadEndPosition
            r7 = 65307(0xff1b, double:3.2266E-319)
            long r5 = r5 - r7
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L43
            return r5
        L43:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            r0.reset()
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            boolean r0 = r0.skipToNextPage(r10)
            if (r0 == 0) goto L9d
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            r3 = 0
            r0.populate(r10, r3)
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            int r3 = r0.headerSize
            int r0 = r0.bodySize
            int r3 = r3 + r0
            r10.skipFully(r3)
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            long r3 = r0.granulePosition
        L64:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            int r5 = r0.type
            r5 = r5 & r2
            if (r5 == r2) goto L96
            boolean r0 = r0.skipToNextPage(r10)
            if (r0 == 0) goto L96
            long r5 = r10.getPosition()
            long r7 = r9.payloadEndPosition
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L96
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            boolean r0 = r0.populate(r10, r1)
            if (r0 == 0) goto L96
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            int r5 = r0.headerSize
            int r0 = r0.bodySize
            int r5 = r5 + r0
            boolean r0 = com.google.android.exoplayer2.extractor.ExtractorUtil.skipFullyQuietly(r10, r5)
            if (r0 != 0) goto L91
            goto L96
        L91:
            com.google.android.exoplayer2.extractor.ogg.OggPageHeader r0 = r9.pageHeader
            long r3 = r0.granulePosition
            goto L64
        L96:
            r9.totalGranules = r3
            r9.state = r2
            long r0 = r9.positionBeforeSeekToEnd
            return r0
        L9d:
            java.io.EOFException r10 = new java.io.EOFException
            r10.<init>()
            throw r10
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public void startSeek(long r11) {
            r10 = this;
            long r0 = r10.totalGranules
            r2 = 1
            long r8 = r0 - r2
            r6 = 0
            r4 = r11
            long r11 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r6, r8)
            r10.targetGranule = r11
            r11 = 2
            r10.state = r11
            long r11 = r10.payloadStartPosition
            r10.start = r11
            long r11 = r10.payloadEndPosition
            r10.end = r11
            r11 = 0
            r10.startGranule = r11
            long r11 = r10.totalGranules
            r10.endGranule = r11
            return
    }
}
