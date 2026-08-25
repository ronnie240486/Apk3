package com.google.android.exoplayer2.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class SlowMotionData implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData> CREATOR = null;
    public final java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> segments;


    /* JADX INFO: loaded from: classes2.dex */
    public static final class Segment implements android.os.Parcelable {
        public static final java.util.Comparator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> BY_START_THEN_END_THEN_DIVISOR = null;
        public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> CREATOR = null;
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;


        public static /* synthetic */ int $r8$lambda$fHu7dMf5JFxgXhjPMION0osau7U(com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment r0, com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment r1) {
                int r0 = lambda$static$0(r0, r1)
                return r0
        }

        static {
                com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0.INSTANCE$1
                com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.BY_START_THEN_END_THEN_DIVISOR = r0
                com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$1 r0 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$1
                r0.<init>()
                com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.CREATOR = r0
                return
        }

        public Segment(long r2, long r4, int r6) {
                r1 = this;
                r1.<init>()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r1.startTimeMs = r2
                r1.endTimeMs = r4
                r1.speedDivisor = r6
                return
        }

        private static /* synthetic */ int lambda$static$0(com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment r5, com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment r6) {
                com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.start()
                long r1 = r5.startTimeMs
                long r3 = r6.startTimeMs
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r3)
                long r1 = r5.endTimeMs
                long r3 = r6.endTimeMs
                com.google.common.collect.ComparisonChain r0 = r0.compare(r1, r3)
                int r5 = r5.speedDivisor
                int r6 = r6.speedDivisor
                com.google.common.collect.ComparisonChain r5 = r0.compare(r5, r6)
                int r5 = r5.result()
                return r5
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L2b
                java.lang.Class<com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment> r2 = com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L2b
            L10:
                com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r8 = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) r8
                long r2 = r7.startTimeMs
                long r4 = r8.startTimeMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L29
                long r2 = r7.endTimeMs
                long r4 = r8.endTimeMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L29
                int r2 = r7.speedDivisor
                int r8 = r8.speedDivisor
                if (r2 != r8) goto L29
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
            L2b:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r1 = r3.startTimeMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                long r1 = r3.endTimeMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r1 = r3.speedDivisor
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r1 = r3.startTimeMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                long r1 = r3.endTimeMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r1 = r3.speedDivisor
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d"
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                long r0 = r2.startTimeMs
                r3.writeLong(r0)
                long r0 = r2.endTimeMs
                r3.writeLong(r0)
                int r4 = r2.speedDivisor
                r3.writeInt(r4)
                return
        }
    }

    static {
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$1 r0 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData.CREATOR = r0
            return
    }

    public SlowMotionData(java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> r1) {
            r0 = this;
            r0.<init>()
            r0.segments = r1
            boolean r1 = doSegmentsOverlap(r1)
            r1 = r1 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            return
    }

    private static boolean doSegmentsOverlap(java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> r8) {
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r8.get(r1)
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r0 = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) r0
            long r2 = r0.endTimeMs
            r0 = 1
            r4 = 1
        L12:
            int r5 = r8.size()
            if (r4 >= r5) goto L30
            java.lang.Object r5 = r8.get(r4)
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r5 = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) r5
            long r5 = r5.startTimeMs
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L25
            return r0
        L25:
            java.lang.Object r2 = r8.get(r4)
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r2 = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) r2
            long r2 = r2.endTimeMs
            int r4 = r4 + 1
            goto L12
        L30:
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<com.google.android.exoplayer2.metadata.mp4.SlowMotionData> r0 = com.google.android.exoplayer2.metadata.mp4.SlowMotionData.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData r3 = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData) r3
            java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment> r0 = r2.segments
            java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment> r3 = r3.segments
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
            r1 = this;
            byte[] r0 = com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataBytes(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
            r1 = this;
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataFormat(r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment> r0 = r1.segments
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r1) {
            r0 = this;
            com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(r0, r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "SlowMotion: segments="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment> r1 = r2.segments
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment> r2 = r0.segments
            r1.writeList(r2)
            return
    }
}
