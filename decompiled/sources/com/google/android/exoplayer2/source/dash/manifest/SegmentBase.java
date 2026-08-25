package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SegmentBase {

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.dash.manifest.RangedUri initialization;
    public final long presentationTimeOffset;
    public final long timescale;

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class MultiSegmentBase extends com.google.android.exoplayer2.source.dash.manifest.SegmentBase {

        @androidx.annotation.VisibleForTesting
        public final long availabilityTimeOffsetUs;
        public final long duration;
        private final long periodStartUnixTimeUs;

        @androidx.annotation.Nullable
        public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement> segmentTimeline;
        public final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(@androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.RangedUri r4, long r5, long r7, long r9, long r11, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement> r13, long r14, long r16, long r18) {
                r3 = this;
                r0 = r3
                r3.<init>(r4, r5, r7)
                r1 = r9
                r0.startNumber = r1
                r1 = r11
                r0.duration = r1
                r1 = r13
                r0.segmentTimeline = r1
                r1 = r14
                r0.availabilityTimeOffsetUs = r1
                r1 = r16
                r0.timeShiftBufferDepthUs = r1
                r1 = r18
                r0.periodStartUnixTimeUs = r1
                return
        }

        public long getAvailableSegmentCount(long r6, long r8) {
                r5 = this;
                long r0 = r5.getSegmentCount(r6)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Lb
                return r0
            Lb:
                long r0 = r5.periodStartUnixTimeUs
                long r0 = r8 - r0
                long r2 = r5.availabilityTimeOffsetUs
                long r0 = r0 + r2
                long r0 = r5.getSegmentNum(r0, r6)
                long r6 = r5.getFirstAvailableSegmentNum(r6, r8)
                long r0 = r0 - r6
                int r6 = (int) r0
                long r6 = (long) r6
                return r6
        }

        public long getFirstAvailableSegmentNum(long r6, long r8) {
                r5 = this;
                long r0 = r5.getSegmentCount(r6)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L27
                long r0 = r5.timeShiftBufferDepthUs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                goto L27
            L16:
                long r2 = r5.periodStartUnixTimeUs
                long r8 = r8 - r2
                long r8 = r8 - r0
                long r6 = r5.getSegmentNum(r8, r6)
                long r8 = r5.getFirstSegmentNum()
                long r6 = java.lang.Math.max(r8, r6)
                return r6
            L27:
                long r6 = r5.getFirstSegmentNum()
                return r6
        }

        public long getFirstSegmentNum() {
                r2 = this;
                long r0 = r2.startNumber
                return r0
        }

        public long getNextSegmentAvailableTimeUs(long r3, long r5) {
                r2 = this;
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r2.segmentTimeline
                if (r0 == 0) goto La
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r3
            La:
                long r0 = r2.getFirstAvailableSegmentNum(r3, r5)
                long r5 = r2.getAvailableSegmentCount(r3, r5)
                long r5 = r5 + r0
                long r0 = r2.getSegmentTimeUs(r5)
                long r3 = r2.getSegmentDurationUs(r5, r3)
                long r3 = r3 + r0
                long r5 = r2.availabilityTimeOffsetUs
                long r3 = r3 - r5
                return r3
        }

        public abstract long getSegmentCount(long r1);

        public final long getSegmentDurationUs(long r8, long r10) {
                r7 = this;
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r7.segmentTimeline
                r1 = 1000000(0xf4240, double:4.940656E-318)
                if (r0 == 0) goto L19
                long r10 = r7.startNumber
                long r8 = r8 - r10
                int r9 = (int) r8
                java.lang.Object r8 = r0.get(r9)
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement r8 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement) r8
                long r8 = r8.duration
                long r8 = r8 * r1
                long r10 = r7.timescale
                long r8 = r8 / r10
                return r8
            L19:
                long r3 = r7.getSegmentCount(r10)
                r5 = -1
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L35
                long r5 = r7.getFirstSegmentNum()
                long r5 = r5 + r3
                r3 = 1
                long r5 = r5 - r3
                int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r0 != 0) goto L35
                long r8 = r7.getSegmentTimeUs(r8)
                long r10 = r10 - r8
                goto L3d
            L35:
                long r8 = r7.duration
                long r8 = r8 * r1
                long r10 = r7.timescale
                long r10 = r8 / r10
            L3d:
                return r10
        }

        public long getSegmentNum(long r12, long r14) {
                r11 = this;
                long r0 = r11.getFirstSegmentNum()
                long r14 = r11.getSegmentCount(r14)
                r2 = 0
                int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
                if (r4 != 0) goto Lf
                return r0
            Lf:
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r2 = r11.segmentTimeline
                r3 = 1
                if (r2 != 0) goto L37
                long r5 = r11.duration
                r7 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r5 * r7
                long r7 = r11.timescale
                long r5 = r5 / r7
                long r7 = r11.startNumber
                long r12 = r12 / r5
                long r12 = r12 + r7
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 >= 0) goto L28
                goto L36
            L28:
                r5 = -1
                int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
                if (r2 != 0) goto L30
                r0 = r12
                goto L36
            L30:
                long r0 = r0 + r14
                long r0 = r0 - r3
                long r0 = java.lang.Math.min(r12, r0)
            L36:
                return r0
            L37:
                long r14 = r14 + r0
                long r14 = r14 - r3
                r5 = r0
            L3a:
                int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r2 > 0) goto L55
                long r7 = r14 - r5
                r9 = 2
                long r7 = r7 / r9
                long r7 = r7 + r5
                long r9 = r11.getSegmentTimeUs(r7)
                int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r2 >= 0) goto L4f
                long r5 = r7 + r3
                goto L3a
            L4f:
                if (r2 <= 0) goto L54
                long r7 = r7 - r3
                r14 = r7
                goto L3a
            L54:
                return r7
            L55:
                int r12 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r12 != 0) goto L5a
                r14 = r5
            L5a:
                return r14
        }

        public final long getSegmentTimeUs(long r7) {
                r6 = this;
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r6.segmentTimeline
                if (r0 == 0) goto L14
                long r1 = r6.startNumber
                long r7 = r7 - r1
                int r8 = (int) r7
                java.lang.Object r7 = r0.get(r8)
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement r7 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement) r7
                long r7 = r7.startTime
                long r0 = r6.presentationTimeOffset
                long r7 = r7 - r0
                goto L1b
            L14:
                long r0 = r6.startNumber
                long r7 = r7 - r0
                long r0 = r6.duration
                long r7 = r7 * r0
            L1b:
                r0 = r7
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r6.timescale
                long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r0, r2, r4)
                return r7
        }

        public abstract com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(com.google.android.exoplayer2.source.dash.manifest.Representation r1, long r2);

        public boolean isExplicit() {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r1.segmentTimeline
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    public static final class SegmentList extends com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase {

        @androidx.annotation.Nullable
        public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri> mediaSegments;

        public SegmentList(com.google.android.exoplayer2.source.dash.manifest.RangedUri r18, long r19, long r21, long r23, long r25, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement> r27, long r28, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri> r30, long r31, long r33) {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                r4 = r21
                r6 = r23
                r8 = r25
                r10 = r27
                r11 = r28
                r13 = r31
                r15 = r33
                r0.<init>(r1, r2, r4, r6, r8, r10, r11, r13, r15)
                r1 = r30
                r0.mediaSegments = r1
                return
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long r1) {
                r0 = this;
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri> r1 = r0.mediaSegments
                int r1 = r1.size()
                long r1 = (long) r1
                return r1
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(com.google.android.exoplayer2.source.dash.manifest.Representation r3, long r4) {
                r2 = this;
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri> r3 = r2.mediaSegments
                long r0 = r2.startNumber
                long r4 = r4 - r0
                int r5 = (int) r4
                java.lang.Object r3 = r3.get(r5)
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r3 = (com.google.android.exoplayer2.source.dash.manifest.RangedUri) r3
                return r3
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SegmentTemplate extends com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase {
        public final long endNumber;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.dash.manifest.UrlTemplate initializationTemplate;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.dash.manifest.UrlTemplate mediaTemplate;

        public SegmentTemplate(com.google.android.exoplayer2.source.dash.manifest.RangedUri r18, long r19, long r21, long r23, long r25, long r27, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement> r29, long r30, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r32, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r33, long r34, long r36) {
                r17 = this;
                r15 = r17
                r0 = r17
                r1 = r18
                r2 = r19
                r4 = r21
                r6 = r23
                r8 = r27
                r10 = r29
                r11 = r30
                r13 = r34
                r15 = r36
                r0.<init>(r1, r2, r4, r6, r8, r10, r11, r13, r15)
                r1 = r32
                r0.initializationTemplate = r1
                r1 = r33
                r0.mediaTemplate = r1
                r1 = r25
                r0.endNumber = r1
                return
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase
        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getInitialization(com.google.android.exoplayer2.source.dash.manifest.Representation r14) {
                r13 = this;
                com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r0 = r13.initializationTemplate
                if (r0 == 0) goto L1d
                com.google.android.exoplayer2.Format r14 = r14.format
                java.lang.String r1 = r14.id
                r2 = 0
                int r4 = r14.bitrate
                r5 = 0
                java.lang.String r8 = r0.buildUri(r1, r2, r4, r5)
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r14 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
                r9 = 0
                r11 = -1
                r7 = r14
                r7.<init>(r8, r9, r11)
                return r14
            L1d:
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r14 = super.getInitialization(r14)
                return r14
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long r6) {
                r5 = this;
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r5.segmentTimeline
                if (r0 == 0) goto La
                int r6 = r0.size()
                long r6 = (long) r6
                return r6
            La:
                long r0 = r5.endNumber
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L19
                long r6 = r5.startNumber
                long r0 = r0 - r6
                r6 = 1
                long r0 = r0 + r6
                return r0
            L19:
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r4 == 0) goto L4c
                java.math.BigInteger r6 = java.math.BigInteger.valueOf(r6)
                long r0 = r5.timescale
                java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
                java.math.BigInteger r6 = r6.multiply(r7)
                long r0 = r5.duration
                java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
                r0 = 1000000(0xf4240, double:4.940656E-318)
                java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
                java.math.BigInteger r7 = r7.multiply(r0)
                java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
                java.math.BigInteger r6 = com.google.common.math.BigIntegerMath.divide(r6, r7, r0)
                long r6 = r6.longValue()
                return r6
            L4c:
                return r2
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getSegmentUrl(com.google.android.exoplayer2.source.dash.manifest.Representation r15, long r16) {
                r14 = this;
                r0 = r14
                java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r1 = r0.segmentTimeline
                if (r1 == 0) goto L13
                long r2 = r0.startNumber
                long r2 = r16 - r2
                int r3 = (int) r2
                java.lang.Object r1 = r1.get(r3)
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement r1 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement) r1
                long r1 = r1.startTime
                goto L1b
            L13:
                long r1 = r0.startNumber
                long r1 = r16 - r1
                long r3 = r0.duration
                long r1 = r1 * r3
            L1b:
                r6 = r1
                com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r1 = r0.mediaTemplate
                r2 = r15
                com.google.android.exoplayer2.Format r2 = r2.format
                java.lang.String r3 = r2.id
                int r5 = r2.bitrate
                r2 = r3
                r3 = r16
                java.lang.String r9 = r1.buildUri(r2, r3, r5, r6)
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
                r10 = 0
                r12 = -1
                r8 = r1
                r8.<init>(r9, r10, r12)
                return r1
        }
    }

    public static final class SegmentTimelineElement {
        public final long duration;
        public final long startTime;

        public SegmentTimelineElement(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.startTime = r1
                r0.duration = r3
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L25
                java.lang.Class<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r2 = com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L25
            L10:
                com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement r8 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement) r8
                long r2 = r7.startTime
                long r4 = r8.startTime
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L23
                long r2 = r7.duration
                long r4 = r8.duration
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 != 0) goto L23
                goto L24
            L23:
                r0 = 0
            L24:
                return r0
            L25:
                return r1
        }

        public int hashCode() {
                r4 = this;
                long r0 = r4.startTime
                int r1 = (int) r0
                int r1 = r1 * 31
                long r2 = r4.duration
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SingleSegmentBase extends com.google.android.exoplayer2.source.dash.manifest.SegmentBase {
        public final long indexLength;
        public final long indexStart;

        public SingleSegmentBase() {
                r10 = this;
                r1 = 0
                r2 = 1
                r4 = 0
                r6 = 0
                r8 = 0
                r0 = r10
                r0.<init>(r1, r2, r4, r6, r8)
                return
        }

        public SingleSegmentBase(@androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.RangedUri r1, long r2, long r4, long r6, long r8) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                r0.indexStart = r6
                r0.indexLength = r8
                return
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.dash.manifest.RangedUri getIndex() {
                r7 = this;
                long r4 = r7.indexLength
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto La
                r0 = 0
                goto L13
            La:
                com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
                r1 = 0
                long r2 = r7.indexStart
                r0 = r6
                r0.<init>(r1, r2, r4)
            L13:
                return r0
        }
    }

    public SegmentBase(@androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.RangedUri r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.initialization = r1
            r0.timescale = r2
            r0.presentationTimeOffset = r4
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.dash.manifest.RangedUri getInitialization(com.google.android.exoplayer2.source.dash.manifest.Representation r1) {
            r0 = this;
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r0.initialization
            return r1
    }

    public long getPresentationTimeOffsetUs() {
            r6 = this;
            long r0 = r6.presentationTimeOffset
            long r4 = r6.timescale
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r0, r2, r4)
            return r0
    }
}
