package com.google.android.exoplayer2.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.CheckResult
    public static com.google.android.exoplayer2.source.ads.AdPlaybackState addAdGroupToAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState r7, long r8, long r10, long... r12) {
            r0 = -1
            long r8 = getMediaPeriodPositionUsForContent(r8, r0, r7)
            int r0 = r7.removedAdGroupCount
            r2 = r0
        L8:
            int r0 = r7.adGroupCount
            if (r2 >= r0) goto L25
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r7.getAdGroup(r2)
            long r0 = r0.timeUs
            r3 = -9223372036854775808
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L25
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r7.getAdGroup(r2)
            long r0 = r0.timeUs
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 > 0) goto L25
            int r2 = r2 + 1
            goto L8
        L25:
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = r7.withNewAdGroup(r2, r8)
            r8 = 1
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = r7.withIsServerSideInserted(r2, r8)
            int r8 = r12.length
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = r7.withAdCount(r2, r8)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = r7.withAdDurationsUs(r2, r12)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = r7.withContentResumeOffsetUs(r2, r10)
            r8 = 0
            r1 = r7
        L3d:
            int r7 = r12.length
            if (r8 >= r7) goto L50
            r3 = r12[r8]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L50
            int r7 = r8 + 1
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r1.withSkippedAd(r2, r8)
            r8 = r7
            goto L3d
        L50:
            long r3 = com.google.android.exoplayer2.util.Util.sum(r12)
            r5 = r10
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = correctFollowingAdGroupTimes(r1, r2, r3, r5)
            return r7
    }

    private static com.google.android.exoplayer2.source.ads.AdPlaybackState correctFollowingAdGroupTimes(com.google.android.exoplayer2.source.ads.AdPlaybackState r3, int r4, long r5, long r7) {
            long r5 = -r5
            long r5 = r5 + r7
        L2:
            int r4 = r4 + 1
            int r7 = r3.adGroupCount
            if (r4 >= r7) goto L1a
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r7 = r3.getAdGroup(r4)
            long r7 = r7.timeUs
            r0 = -9223372036854775808
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2
            long r7 = r7 + r5
            com.google.android.exoplayer2.source.ads.AdPlaybackState r3 = r3.withAdGroupTimeUs(r4, r7)
            goto L2
        L1a:
            return r3
    }

    public static int getAdCountInGroup(com.google.android.exoplayer2.source.ads.AdPlaybackState r0, int r1) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r0.getAdGroup(r1)
            int r0 = r0.count
            r1 = -1
            if (r0 != r1) goto La
            r0 = 0
        La:
            return r0
    }

    public static long getMediaPeriodPositionUs(long r1, com.google.android.exoplayer2.source.MediaPeriodId r3, com.google.android.exoplayer2.source.ads.AdPlaybackState r4) {
            boolean r0 = r3.isAd()
            if (r0 == 0) goto Lf
            int r0 = r3.adGroupIndex
            int r3 = r3.adIndexInAdGroup
            long r1 = getMediaPeriodPositionUsForAd(r1, r0, r3, r4)
            goto L15
        Lf:
            int r3 = r3.nextAdGroupIndex
            long r1 = getMediaPeriodPositionUsForContent(r1, r3, r4)
        L15:
            return r1
    }

    public static long getMediaPeriodPositionUsForAd(long r7, int r9, int r10, com.google.android.exoplayer2.source.ads.AdPlaybackState r11) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r11.getAdGroup(r9)
            long r1 = r0.timeUs
            long r7 = r7 - r1
            int r1 = r11.removedAdGroupCount
        L9:
            r2 = 0
            if (r1 >= r9) goto L24
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r11.getAdGroup(r1)
        L10:
            int r4 = getAdCountInGroup(r11, r1)
            if (r2 >= r4) goto L1e
            long[] r4 = r3.durationsUs
            r5 = r4[r2]
            long r7 = r7 - r5
            int r2 = r2 + 1
            goto L10
        L1e:
            long r2 = r3.contentResumeOffsetUs
            long r7 = r7 + r2
            int r1 = r1 + 1
            goto L9
        L24:
            int r9 = getAdCountInGroup(r11, r9)
            if (r10 >= r9) goto L34
        L2a:
            if (r2 >= r10) goto L34
            long[] r9 = r0.durationsUs
            r3 = r9[r2]
            long r7 = r7 - r3
            int r2 = r2 + 1
            goto L2a
        L34:
            return r7
    }

    public static long getMediaPeriodPositionUsForContent(long r10, int r12, com.google.android.exoplayer2.source.ads.AdPlaybackState r13) {
            r0 = -1
            if (r12 != r0) goto L5
            int r12 = r13.adGroupCount
        L5:
            int r0 = r13.removedAdGroupCount
            r1 = 0
        L9:
            if (r0 >= r12) goto L41
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r13.getAdGroup(r0)
            long r4 = r3.timeUs
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L41
            long r6 = r10 - r1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L1e
            goto L41
        L1e:
            r4 = 0
        L1f:
            int r5 = getAdCountInGroup(r13, r0)
            if (r4 >= r5) goto L2d
            long[] r5 = r3.durationsUs
            r6 = r5[r4]
            long r1 = r1 + r6
            int r4 = r4 + 1
            goto L1f
        L2d:
            long r4 = r3.contentResumeOffsetUs
            long r1 = r1 - r4
            long r6 = r3.timeUs
            long r4 = r4 + r6
            long r8 = r10 - r1
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 <= 0) goto L3e
            long r10 = java.lang.Math.max(r6, r8)
            return r10
        L3e:
            int r0 = r0 + 1
            goto L9
        L41:
            long r10 = r10 - r1
            return r10
    }

    public static long getStreamPositionUs(long r1, com.google.android.exoplayer2.source.MediaPeriodId r3, com.google.android.exoplayer2.source.ads.AdPlaybackState r4) {
            boolean r0 = r3.isAd()
            if (r0 == 0) goto Lf
            int r0 = r3.adGroupIndex
            int r3 = r3.adIndexInAdGroup
            long r1 = getStreamPositionUsForAd(r1, r0, r3, r4)
            goto L15
        Lf:
            int r3 = r3.nextAdGroupIndex
            long r1 = getStreamPositionUsForContent(r1, r3, r4)
        L15:
            return r1
    }

    public static long getStreamPositionUs(com.google.android.exoplayer2.Player r5, com.google.android.exoplayer2.source.ads.AdPlaybackState r6) {
            com.google.android.exoplayer2.Timeline r0 = r5.getCurrentTimeline()
            boolean r1 = r0.isEmpty()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L10
            return r2
        L10:
            int r1 = r5.getCurrentPeriodIndex()
            com.google.android.exoplayer2.Timeline$Period r4 = new com.google.android.exoplayer2.Timeline$Period
            r4.<init>()
            com.google.android.exoplayer2.Timeline$Period r0 = r0.getPeriod(r1, r4)
            java.lang.Object r1 = r0.getAdsId()
            java.lang.Object r4 = r6.adsId
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r4)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            boolean r1 = r5.isPlayingAd()
            if (r1 == 0) goto L45
            int r0 = r5.getCurrentAdGroupIndex()
            int r1 = r5.getCurrentAdIndexInAdGroup()
            long r2 = r5.getCurrentPosition()
            long r2 = com.google.android.exoplayer2.util.Util.msToUs(r2)
            long r5 = getStreamPositionUsForAd(r2, r0, r1, r6)
            return r5
        L45:
            long r1 = r5.getCurrentPosition()
            long r1 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            long r3 = r0.getPositionInWindowUs()
            long r1 = r1 - r3
            r5 = -1
            long r5 = getStreamPositionUsForContent(r1, r5, r6)
            return r5
    }

    public static long getStreamPositionUsForAd(long r7, int r9, int r10, com.google.android.exoplayer2.source.ads.AdPlaybackState r11) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r11.getAdGroup(r9)
            long r1 = r0.timeUs
            long r7 = r7 + r1
            int r1 = r11.removedAdGroupCount
        L9:
            r2 = 0
            if (r1 >= r9) goto L24
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r11.getAdGroup(r1)
        L10:
            int r4 = getAdCountInGroup(r11, r1)
            if (r2 >= r4) goto L1e
            long[] r4 = r3.durationsUs
            r5 = r4[r2]
            long r7 = r7 + r5
            int r2 = r2 + 1
            goto L10
        L1e:
            long r2 = r3.contentResumeOffsetUs
            long r7 = r7 - r2
            int r1 = r1 + 1
            goto L9
        L24:
            int r9 = getAdCountInGroup(r11, r9)
            if (r10 >= r9) goto L34
        L2a:
            if (r2 >= r10) goto L34
            long[] r9 = r0.durationsUs
            r3 = r9[r2]
            long r7 = r7 + r3
            int r2 = r2 + 1
            goto L2a
        L34:
            return r7
    }

    public static long getStreamPositionUsForContent(long r10, int r12, com.google.android.exoplayer2.source.ads.AdPlaybackState r13) {
            r0 = -1
            if (r12 != r0) goto L5
            int r12 = r13.adGroupCount
        L5:
            int r0 = r13.removedAdGroupCount
            r1 = 0
        L9:
            if (r0 >= r12) goto L3f
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r13.getAdGroup(r0)
            long r4 = r3.timeUs
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L3f
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L1c
            goto L3f
        L1c:
            long r4 = r4 + r1
            r6 = 0
        L1e:
            int r7 = getAdCountInGroup(r13, r0)
            if (r6 >= r7) goto L2c
            long[] r7 = r3.durationsUs
            r8 = r7[r6]
            long r1 = r1 + r8
            int r6 = r6 + 1
            goto L1e
        L2c:
            long r6 = r3.contentResumeOffsetUs
            long r1 = r1 - r6
            long r8 = r3.timeUs
            long r8 = r8 + r6
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L3c
            long r10 = r10 + r1
            long r10 = java.lang.Math.max(r4, r10)
            return r10
        L3c:
            int r0 = r0 + 1
            goto L9
        L3f:
            long r10 = r10 + r1
            return r10
    }
}
