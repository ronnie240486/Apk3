package com.google.android.exoplayer2.extractor.flac;

/* JADX INFO: loaded from: classes.dex */
final class FlacBinarySearchSeeker extends com.google.android.exoplayer2.extractor.BinarySearchSeeker {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class FlacTimestampSeeker implements com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker {
        private final com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        private FlacTimestampSeeker(com.google.android.exoplayer2.extractor.FlacStreamMetadata r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.flacStreamMetadata = r1
                r0.frameStartMarker = r2
                com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r1 = new com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder
                r1.<init>()
                r0.sampleNumberHolder = r1
                return
        }

        public /* synthetic */ FlacTimestampSeeker(com.google.android.exoplayer2.extractor.FlacStreamMetadata r1, int r2, com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private long findNextFrame(com.google.android.exoplayer2.extractor.ExtractorInput r8) throws java.io.IOException {
                r7 = this;
            L0:
                long r0 = r8.getPeekPosition()
                long r2 = r8.getLength()
                r4 = 6
                long r2 = r2 - r4
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 >= 0) goto L20
                com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r7.flacStreamMetadata
                int r1 = r7.frameStartMarker
                com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r2 = r7.sampleNumberHolder
                boolean r0 = com.google.android.exoplayer2.extractor.FlacFrameReader.checkFrameHeaderFromPeek(r8, r0, r1, r2)
                if (r0 != 0) goto L20
                r0 = 1
                r8.advancePeekPosition(r0)
                goto L0
            L20:
                long r0 = r8.getPeekPosition()
                long r2 = r8.getLength()
                long r2 = r2 - r4
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L3f
                long r0 = r8.getLength()
                long r2 = r8.getPeekPosition()
                long r0 = r0 - r2
                int r1 = (int) r0
                r8.advancePeekPosition(r1)
                com.google.android.exoplayer2.extractor.FlacStreamMetadata r8 = r7.flacStreamMetadata
                long r0 = r8.totalSamples
                return r0
            L3f:
                com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r8 = r7.sampleNumberHolder
                long r0 = r8.sampleNumber
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public final /* synthetic */ void onSeekFinished() {
                r0 = this;
                com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker.CC.$default$onSeekFinished(r0)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(com.google.android.exoplayer2.extractor.ExtractorInput r11, long r12) throws java.io.IOException {
                r10 = this;
                long r0 = r11.getPosition()
                long r2 = r10.findNextFrame(r11)
                long r4 = r11.getPeekPosition()
                com.google.android.exoplayer2.extractor.FlacStreamMetadata r6 = r10.flacStreamMetadata
                int r6 = r6.minFrameSize
                r7 = 6
                int r6 = java.lang.Math.max(r7, r6)
                r11.advancePeekPosition(r6)
                long r6 = r10.findNextFrame(r11)
                long r8 = r11.getPeekPosition()
                int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r11 > 0) goto L2d
                int r11 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r11 <= 0) goto L2d
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r11 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(r4)
                return r11
            L2d:
                int r11 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r11 > 0) goto L36
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r11 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(r6, r8)
                return r11
            L36:
                com.google.android.exoplayer2.extractor.BinarySearchSeeker$TimestampSearchResult r11 = com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(r2, r0)
                return r11
        }
    }

    public FlacBinarySearchSeeker(com.google.android.exoplayer2.extractor.FlacStreamMetadata r15, int r16, long r17, long r19) {
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2 r1 = new com.flextv.livestore.activities.MovieActivity$$ExternalSyntheticLambda2
            r2 = 8
            r1.<init>(r15, r2)
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker$FlacTimestampSeeker r2 = new com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker$FlacTimestampSeeker
            r3 = 0
            r4 = r16
            r2.<init>(r15, r4, r3)
            long r3 = r15.getDurationUs()
            long r5 = r0.totalSamples
            long r11 = r15.getApproxBytesPerFrame()
            int r0 = r0.minFrameSize
            r7 = 6
            int r13 = java.lang.Math.max(r7, r0)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
    }
}
