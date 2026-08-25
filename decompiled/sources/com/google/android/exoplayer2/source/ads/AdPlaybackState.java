package com.google.android.exoplayer2.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final class AdPlaybackState implements com.google.android.exoplayer2.Bundleable {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.ads.AdPlaybackState> CREATOR = null;
    private static final java.lang.String FIELD_AD_GROUPS = null;
    private static final java.lang.String FIELD_AD_RESUME_POSITION_US = null;
    private static final java.lang.String FIELD_CONTENT_DURATION_US = null;
    private static final java.lang.String FIELD_REMOVED_AD_GROUP_COUNT = null;
    public static final com.google.android.exoplayer2.source.ads.AdPlaybackState NONE = null;
    private static final com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup REMOVED_AD_GROUP = null;
    public final int adGroupCount;
    private final com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroups;
    public final long adResumePositionUs;

    @androidx.annotation.Nullable
    public final java.lang.Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.AdPlaybackState$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AdGroup implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup> CREATOR = null;
        private static final java.lang.String FIELD_CONTENT_RESUME_OFFSET_US = null;
        private static final java.lang.String FIELD_COUNT = null;
        private static final java.lang.String FIELD_DURATIONS_US = null;
        private static final java.lang.String FIELD_IS_SERVER_SIDE_INSERTED = null;
        private static final java.lang.String FIELD_ORIGINAL_COUNT = null;
        private static final java.lang.String FIELD_STATES = null;
        private static final java.lang.String FIELD_TIME_US = null;
        private static final java.lang.String FIELD_URIS = null;
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final int originalCount;
        public final int[] states;
        public final long timeUs;
        public final android.net.Uri[] uris;

        /* JADX INFO: renamed from: $r8$lambda$C29-JxihoVs9-kyxHjAM5HCSTvU, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup m251$r8$lambda$C29JxihoVs9kyxHjAM5HCSTvU(android.os.Bundle r0) {
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = fromBundle(r0)
                return r0
        }

        static {
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_TIME_US = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_COUNT = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_URIS = r0
                r0 = 3
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_STATES = r0
                r0 = 4
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_DURATIONS_US = r0
                r0 = 5
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_CONTENT_RESUME_OFFSET_US = r0
                r0 = 6
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_IS_SERVER_SIDE_INSERTED = r0
                r0 = 7
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_ORIGINAL_COUNT = r0
                io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$17
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.CREATOR = r0
                return
        }

        public AdGroup(long r13) {
                r12 = this;
                r0 = 0
                int[] r6 = new int[r0]
                android.net.Uri[] r7 = new android.net.Uri[r0]
                long[] r8 = new long[r0]
                r4 = -1
                r5 = -1
                r9 = 0
                r11 = 0
                r1 = r12
                r2 = r13
                r1.<init>(r2, r4, r5, r6, r7, r8, r9, r11)
                return
        }

        private AdGroup(long r3, int r5, int r6, int[] r7, android.net.Uri[] r8, long[] r9, long r10, boolean r12) {
                r2 = this;
                r2.<init>()
                int r0 = r7.length
                int r1 = r8.length
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r2.timeUs = r3
                r2.count = r5
                r2.originalCount = r6
                r2.states = r7
                r2.uris = r8
                r2.durationsUs = r9
                r2.contentResumeOffsetUs = r10
                r2.isServerSideInserted = r12
                return
        }

        public /* synthetic */ AdGroup(long r1, int r3, int r4, int[] r5, android.net.Uri[] r6, long[] r7, long r8, boolean r10, com.google.android.exoplayer2.source.ads.AdPlaybackState.AnonymousClass1 r11) {
                r0 = this;
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10)
                return
        }

        @androidx.annotation.CheckResult
        private static long[] copyDurationsUsWithSpaceForAdCount(long[] r3, int r4) {
                int r0 = r3.length
                int r4 = java.lang.Math.max(r4, r0)
                long[] r3 = java.util.Arrays.copyOf(r3, r4)
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                java.util.Arrays.fill(r3, r0, r4, r1)
                return r3
        }

        @androidx.annotation.CheckResult
        private static int[] copyStatesWithSpaceForAdCount(int[] r2, int r3) {
                int r0 = r2.length
                int r3 = java.lang.Math.max(r3, r0)
                int[] r2 = java.util.Arrays.copyOf(r2, r3)
                r1 = 0
                java.util.Arrays.fill(r2, r0, r3, r1)
                return r2
        }

        private static com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup fromBundle(android.os.Bundle r13) {
                java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_TIME_US
                long r2 = r13.getLong(r0)
                java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_COUNT
                int r4 = r13.getInt(r0)
                java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_ORIGINAL_COUNT
                int r5 = r13.getInt(r0)
                java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_URIS
                java.util.ArrayList r0 = r13.getParcelableArrayList(r0)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_STATES
                int[] r1 = r13.getIntArray(r1)
                java.lang.String r6 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_DURATIONS_US
                long[] r6 = r13.getLongArray(r6)
                java.lang.String r7 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_CONTENT_RESUME_OFFSET_US
                long r9 = r13.getLong(r7)
                java.lang.String r7 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_IS_SERVER_SIDE_INSERTED
                boolean r11 = r13.getBoolean(r7)
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r13 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                r7 = 0
                if (r1 != 0) goto L37
                int[] r1 = new int[r7]
            L37:
                r8 = r1
                if (r0 != 0) goto L3d
                android.net.Uri[] r0 = new android.net.Uri[r7]
                goto L45
            L3d:
                android.net.Uri[] r1 = new android.net.Uri[r7]
                java.lang.Object[] r0 = r0.toArray(r1)
                android.net.Uri[] r0 = (android.net.Uri[]) r0
            L45:
                if (r6 != 0) goto L4b
                long[] r1 = new long[r7]
                r12 = r1
                goto L4c
            L4b:
                r12 = r6
            L4c:
                r1 = r13
                r6 = r8
                r7 = r0
                r8 = r12
                r1.<init>(r2, r4, r5, r6, r7, r8, r9, r11)
                return r13
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L55
                java.lang.Class<com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup> r2 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L55
            L10:
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r8 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup) r8
                long r2 = r7.timeUs
                long r4 = r8.timeUs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L53
                int r2 = r7.count
                int r3 = r8.count
                if (r2 != r3) goto L53
                int r2 = r7.originalCount
                int r3 = r8.originalCount
                if (r2 != r3) goto L53
                android.net.Uri[] r2 = r7.uris
                android.net.Uri[] r3 = r8.uris
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L53
                int[] r2 = r7.states
                int[] r3 = r8.states
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L53
                long[] r2 = r7.durationsUs
                long[] r3 = r8.durationsUs
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L53
                long r2 = r7.contentResumeOffsetUs
                long r4 = r8.contentResumeOffsetUs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L53
                boolean r2 = r7.isServerSideInserted
                boolean r8 = r8.isServerSideInserted
                if (r2 != r8) goto L53
                goto L54
            L53:
                r0 = 0
            L54:
                return r0
            L55:
                return r1
        }

        public int getFirstAdIndexToPlay() {
                r1 = this;
                r0 = -1
                int r0 = r1.getNextAdIndexToPlay(r0)
                return r0
        }

        public int getNextAdIndexToPlay(@androidx.annotation.IntRange(from = -1) int r4) {
                r3 = this;
                r0 = 1
                int r4 = r4 + r0
            L2:
                int[] r1 = r3.states
                int r2 = r1.length
                if (r4 >= r2) goto L17
                boolean r2 = r3.isServerSideInserted
                if (r2 != 0) goto L17
                r2 = r1[r4]
                if (r2 == 0) goto L17
                r1 = r1[r4]
                if (r1 != r0) goto L14
                goto L17
            L14:
                int r4 = r4 + 1
                goto L2
            L17:
                return r4
        }

        public boolean hasUnplayedAds() {
                r5 = this;
                int r0 = r5.count
                r1 = 1
                r2 = -1
                if (r0 != r2) goto L7
                return r1
            L7:
                r0 = 0
                r2 = 0
            L9:
                int r3 = r5.count
                if (r2 >= r3) goto L1c
                int[] r3 = r5.states
                r4 = r3[r2]
                if (r4 == 0) goto L1b
                r3 = r3[r2]
                if (r3 != r1) goto L18
                goto L1b
            L18:
                int r2 = r2 + 1
                goto L9
            L1b:
                return r1
            L1c:
                return r0
        }

        public int hashCode() {
                r6 = this;
                int r0 = r6.count
                int r0 = r0 * 31
                int r1 = r6.originalCount
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r6.timeUs
                r3 = 32
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                android.net.Uri[] r1 = r6.uris
                int r1 = java.util.Arrays.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                int[] r1 = r6.states
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                long[] r0 = r6.durationsUs
                int r0 = java.util.Arrays.hashCode(r0)
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r6.contentResumeOffsetUs
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r6.isServerSideInserted
                int r0 = r0 + r1
                return r0
        }

        public boolean shouldPlayAdGroup() {
                r2 = this;
                int r0 = r2.count
                r1 = -1
                if (r0 == r1) goto L10
                int r0 = r2.getFirstAdIndexToPlay()
                int r1 = r2.count
                if (r0 >= r1) goto Le
                goto L10
            Le:
                r0 = 0
                goto L11
            L10:
                r0 = 1
            L11:
                return r0
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r4 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_TIME_US
                long r2 = r4.timeUs
                r0.putLong(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_COUNT
                int r2 = r4.count
                r0.putInt(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_ORIGINAL_COUNT
                int r2 = r4.originalCount
                r0.putInt(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_URIS
                java.util.ArrayList r2 = new java.util.ArrayList
                android.net.Uri[] r3 = r4.uris
                java.util.List r3 = java.util.Arrays.asList(r3)
                r2.<init>(r3)
                r0.putParcelableArrayList(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_STATES
                int[] r2 = r4.states
                r0.putIntArray(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_DURATIONS_US
                long[] r2 = r4.durationsUs
                r0.putLongArray(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_CONTENT_RESUME_OFFSET_US
                long r2 = r4.contentResumeOffsetUs
                r0.putLong(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.FIELD_IS_SERVER_SIDE_INSERTED
                boolean r2 = r4.isServerSideInserted
                r0.putBoolean(r1, r2)
                return r0
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdCount(int r13) {
                r12 = this;
                int[] r0 = r12.states
                int[] r6 = copyStatesWithSpaceForAdCount(r0, r13)
                long[] r0 = r12.durationsUs
                long[] r8 = copyDurationsUsWithSpaceForAdCount(r0, r13)
                android.net.Uri[] r0 = r12.uris
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
                r7 = r0
                android.net.Uri[] r7 = (android.net.Uri[]) r7
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r2 = r12.timeUs
                int r5 = r12.originalCount
                long r9 = r12.contentResumeOffsetUs
                boolean r11 = r12.isServerSideInserted
                r1 = r0
                r4 = r13
                r1.<init>(r2, r4, r5, r6, r7, r8, r9, r11)
                return r0
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdDurationsUs(long[] r12) {
                r11 = this;
                int r0 = r12.length
                android.net.Uri[] r1 = r11.uris
                int r2 = r1.length
                if (r0 >= r2) goto Lc
                int r0 = r1.length
                long[] r12 = copyDurationsUsWithSpaceForAdCount(r12, r0)
                goto L1a
            Lc:
                int r0 = r11.count
                r2 = -1
                if (r0 == r2) goto L1a
                int r0 = r12.length
                int r2 = r1.length
                if (r0 <= r2) goto L1a
                int r0 = r1.length
                long[] r12 = java.util.Arrays.copyOf(r12, r0)
            L1a:
                r7 = r12
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r12 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r1 = r11.timeUs
                int r3 = r11.count
                int r4 = r11.originalCount
                int[] r5 = r11.states
                android.net.Uri[] r6 = r11.uris
                long r8 = r11.contentResumeOffsetUs
                boolean r10 = r11.isServerSideInserted
                r0 = r12
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10)
                return r12
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdState(int r19, @androidx.annotation.IntRange(from = 0) int r20) {
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                int r3 = r0.count
                r4 = 0
                r5 = 1
                r6 = -1
                if (r3 == r6) goto L12
                if (r2 >= r3) goto L10
                goto L12
            L10:
                r3 = 0
                goto L13
            L12:
                r3 = 1
            L13:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
                int[] r3 = r0.states
                int r6 = r2 + 1
                int[] r12 = copyStatesWithSpaceForAdCount(r3, r6)
                r3 = r12[r2]
                if (r3 == 0) goto L2a
                r3 = r12[r2]
                if (r3 == r5) goto L2a
                r3 = r12[r2]
                if (r3 != r1) goto L2b
            L2a:
                r4 = 1
            L2b:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r4)
                long[] r3 = r0.durationsUs
                int r4 = r3.length
                int r5 = r12.length
                if (r4 != r5) goto L35
                goto L3a
            L35:
                int r4 = r12.length
                long[] r3 = copyDurationsUsWithSpaceForAdCount(r3, r4)
            L3a:
                r14 = r3
                android.net.Uri[] r3 = r0.uris
                int r4 = r3.length
                int r5 = r12.length
                if (r4 != r5) goto L42
                goto L49
            L42:
                int r4 = r12.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
                android.net.Uri[] r3 = (android.net.Uri[]) r3
            L49:
                r13 = r3
                r12[r2] = r1
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r1 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r8 = r0.timeUs
                int r10 = r0.count
                int r11 = r0.originalCount
                long r2 = r0.contentResumeOffsetUs
                boolean r4 = r0.isServerSideInserted
                r7 = r1
                r15 = r2
                r17 = r4
                r7.<init>(r8, r10, r11, r12, r13, r14, r15, r17)
                return r1
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdUri(android.net.Uri r14, @androidx.annotation.IntRange(from = 0) int r15) {
                r13 = this;
                int[] r0 = r13.states
                int r1 = r15 + 1
                int[] r7 = copyStatesWithSpaceForAdCount(r0, r1)
                long[] r0 = r13.durationsUs
                int r1 = r0.length
                int r2 = r7.length
                if (r1 != r2) goto Lf
                goto L14
            Lf:
                int r1 = r7.length
                long[] r0 = copyDurationsUsWithSpaceForAdCount(r0, r1)
            L14:
                r9 = r0
                android.net.Uri[] r0 = r13.uris
                int r1 = r7.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                r8 = r0
                android.net.Uri[] r8 = (android.net.Uri[]) r8
                r8[r15] = r14
                r14 = 1
                r7[r15] = r14
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r14 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r3 = r13.timeUs
                int r5 = r13.count
                int r6 = r13.originalCount
                long r10 = r13.contentResumeOffsetUs
                boolean r12 = r13.isServerSideInserted
                r2 = r14
                r2.<init>(r3, r5, r6, r7, r8, r9, r10, r12)
                return r14
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAllAdsReset() {
                r12 = this;
                int r0 = r12.count
                r1 = -1
                if (r0 != r1) goto L6
                return r12
            L6:
                int[] r0 = r12.states
                int r4 = r0.length
                int[] r6 = java.util.Arrays.copyOf(r0, r4)
                r0 = 0
                r1 = 0
            Lf:
                if (r1 >= r4) goto L2e
                r2 = r6[r1]
                r3 = 3
                if (r2 == r3) goto L20
                r2 = r6[r1]
                r3 = 2
                if (r2 == r3) goto L20
                r2 = r6[r1]
                r3 = 4
                if (r2 != r3) goto L2b
            L20:
                android.net.Uri[] r2 = r12.uris
                r2 = r2[r1]
                if (r2 != 0) goto L28
                r2 = 0
                goto L29
            L28:
                r2 = 1
            L29:
                r6[r1] = r2
            L2b:
                int r1 = r1 + 1
                goto Lf
            L2e:
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r2 = r12.timeUs
                int r5 = r12.originalCount
                android.net.Uri[] r7 = r12.uris
                long[] r8 = r12.durationsUs
                long r9 = r12.contentResumeOffsetUs
                boolean r11 = r12.isServerSideInserted
                r1 = r0
                r1.<init>(r2, r4, r5, r6, r7, r8, r9, r11)
                return r0
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAllAdsSkipped() {
                r14 = this;
                int r0 = r14.count
                r1 = 0
                r2 = -1
                if (r0 != r2) goto L1c
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r4 = r14.timeUs
                r6 = 0
                int r7 = r14.originalCount
                int[] r8 = new int[r1]
                android.net.Uri[] r9 = new android.net.Uri[r1]
                long[] r10 = new long[r1]
                long r11 = r14.contentResumeOffsetUs
                boolean r13 = r14.isServerSideInserted
                r3 = r0
                r3.<init>(r4, r6, r7, r8, r9, r10, r11, r13)
                return r0
            L1c:
                int[] r0 = r14.states
                int r5 = r0.length
                int[] r7 = java.util.Arrays.copyOf(r0, r5)
            L23:
                if (r1 >= r5) goto L34
                r0 = r7[r1]
                r2 = 1
                if (r0 == r2) goto L2e
                r0 = r7[r1]
                if (r0 != 0) goto L31
            L2e:
                r0 = 2
                r7[r1] = r0
            L31:
                int r1 = r1 + 1
                goto L23
            L34:
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r3 = r14.timeUs
                int r6 = r14.originalCount
                android.net.Uri[] r8 = r14.uris
                long[] r9 = r14.durationsUs
                long r10 = r14.contentResumeOffsetUs
                boolean r12 = r14.isServerSideInserted
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r8, r9, r10, r12)
                return r0
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withContentResumeOffsetUs(long r13) {
                r12 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r1 = r12.timeUs
                int r3 = r12.count
                int r4 = r12.originalCount
                int[] r5 = r12.states
                android.net.Uri[] r6 = r12.uris
                long[] r7 = r12.durationsUs
                boolean r10 = r12.isServerSideInserted
                r0 = r11
                r8 = r13
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10)
                return r11
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withIsServerSideInserted(boolean r13) {
                r12 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r1 = r12.timeUs
                int r3 = r12.count
                int r4 = r12.originalCount
                int[] r5 = r12.states
                android.net.Uri[] r6 = r12.uris
                long[] r7 = r12.durationsUs
                long r8 = r12.contentResumeOffsetUs
                r0 = r11
                r10 = r13
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10)
                return r11
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withLastAdRemoved() {
                r13 = this;
                int[] r0 = r13.states
                int r1 = r0.length
                int r5 = r1 + (-1)
                int[] r7 = java.util.Arrays.copyOf(r0, r5)
                android.net.Uri[] r0 = r13.uris
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
                r8 = r0
                android.net.Uri[] r8 = (android.net.Uri[]) r8
                long[] r0 = r13.durationsUs
                int r1 = r0.length
                if (r1 <= r5) goto L1b
                long[] r0 = java.util.Arrays.copyOf(r0, r5)
            L1b:
                r9 = r0
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r3 = r13.timeUs
                int r6 = r13.originalCount
                long r10 = com.google.android.exoplayer2.util.Util.sum(r9)
                boolean r12 = r13.isServerSideInserted
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r8, r9, r10, r12)
                return r0
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withOriginalAdCount(int r13) {
                r12 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                long r1 = r12.timeUs
                int r3 = r12.count
                int[] r5 = r12.states
                android.net.Uri[] r6 = r12.uris
                long[] r7 = r12.durationsUs
                long r8 = r12.contentResumeOffsetUs
                boolean r10 = r12.isServerSideInserted
                r0 = r11
                r4 = r13
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10)
                return r11
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withTimeUs(long r13) {
                r12 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
                int r3 = r12.count
                int r4 = r12.originalCount
                int[] r5 = r12.states
                android.net.Uri[] r6 = r12.uris
                long[] r7 = r12.durationsUs
                long r8 = r12.contentResumeOffsetUs
                boolean r10 = r12.isServerSideInserted
                r0 = r11
                r1 = r13
                r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10)
                return r11
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.ads.AdPlaybackState $r8$lambda$v7MSQh9nkbSNgVVbdfE7aSUxQOQ(android.os.Bundle r0) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = fromBundle(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            r9 = 0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[r9]
            r1 = 0
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r7)
            com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE = r8
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r0.withAdCount(r9)
            com.google.android.exoplayer2.source.ads.AdPlaybackState.REMOVED_AD_GROUP = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_AD_GROUPS = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_AD_RESUME_POSITION_US = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_CONTENT_DURATION_US = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_REMOVED_AD_GROUP_COUNT = r0
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$16
            com.google.android.exoplayer2.source.ads.AdPlaybackState.CREATOR = r0
            return
    }

    public AdPlaybackState(java.lang.Object r9, long... r10) {
            r8 = this;
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = createEmptyAdGroups(r10)
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r5, r7)
            return
    }

    private AdPlaybackState(@androidx.annotation.Nullable java.lang.Object r1, com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] r2, long r3, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r0.adsId = r1
            r0.adResumePositionUs = r3
            r0.contentDurationUs = r5
            int r1 = r2.length
            int r1 = r1 + r7
            r0.adGroupCount = r1
            r0.adGroups = r2
            r0.removedAdGroupCount = r7
            return
    }

    private static com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] createEmptyAdGroups(long[] r6) {
            int r0 = r6.length
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r1 = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L12
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
            r4 = r6[r2]
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L12:
            return r1
    }

    public static com.google.android.exoplayer2.source.ads.AdPlaybackState fromAdPlaybackState(java.lang.Object r18, com.google.android.exoplayer2.source.ads.AdPlaybackState r19) {
            r0 = r19
            int r1 = r0.adGroupCount
            int r2 = r0.removedAdGroupCount
            int r1 = r1 - r2
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r4 = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[r1]
            r2 = 0
        La:
            if (r2 >= r1) goto L40
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = r0.adGroups
            r3 = r3[r2]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r17 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
            long r6 = r3.timeUs
            int r8 = r3.count
            int r9 = r3.originalCount
            int[] r5 = r3.states
            int r10 = r5.length
            int[] r10 = java.util.Arrays.copyOf(r5, r10)
            android.net.Uri[] r5 = r3.uris
            int r11 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r11)
            r11 = r5
            android.net.Uri[] r11 = (android.net.Uri[]) r11
            long[] r5 = r3.durationsUs
            int r12 = r5.length
            long[] r12 = java.util.Arrays.copyOf(r5, r12)
            long r13 = r3.contentResumeOffsetUs
            boolean r15 = r3.isServerSideInserted
            r16 = 0
            r5 = r17
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r15, r16)
            r4[r2] = r17
            int r2 = r2 + 1
            goto La
        L40:
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            long r5 = r0.adResumePositionUs
            long r7 = r0.contentDurationUs
            int r9 = r0.removedAdGroupCount
            r2 = r1
            r3 = r18
            r2.<init>(r3, r4, r5, r7, r9)
            return r1
    }

    private static com.google.android.exoplayer2.source.ads.AdPlaybackState fromBundle(android.os.Bundle r11) {
            java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_AD_GROUPS
            java.util.ArrayList r0 = r11.getParcelableArrayList(r0)
            r1 = 0
            if (r0 != 0) goto Ld
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[r1]
            r5 = r0
            goto L2d
        Ld:
            int r2 = r0.size()
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[r2]
        L13:
            int r3 = r0.size()
            if (r1 >= r3) goto L2c
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup> r3 = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.CREATOR
            java.lang.Object r4 = r0.get(r1)
            android.os.Bundle r4 = (android.os.Bundle) r4
            com.google.android.exoplayer2.Bundleable r3 = r3.fromBundle(r4)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L13
        L2c:
            r5 = r2
        L2d:
            java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_AD_RESUME_POSITION_US
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
            long r2 = r1.adResumePositionUs
            long r6 = r11.getLong(r0, r2)
            java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_CONTENT_DURATION_US
            long r2 = r1.contentDurationUs
            long r8 = r11.getLong(r0, r2)
            java.lang.String r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_REMOVED_AD_GROUP_COUNT
            int r1 = r1.removedAdGroupCount
            int r10 = r11.getInt(r0, r1)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r11 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            r4 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r8, r10)
            return r11
    }

    private boolean isPositionBeforeAdGroup(long r7, long r9, int r11) {
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L8
            return r2
        L8:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r6.getAdGroup(r11)
            long r3 = r11.timeUs
            r11 = 1
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L22
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 == 0) goto L20
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L21
        L20:
            r2 = 1
        L21:
            return r2
        L22:
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L27
            r2 = 1
        L27:
            return r2
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L45
            java.lang.Class<com.google.android.exoplayer2.source.ads.AdPlaybackState> r2 = com.google.android.exoplayer2.source.ads.AdPlaybackState.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L45
        L10:
            com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r8
            java.lang.Object r2 = r7.adsId
            java.lang.Object r3 = r8.adsId
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L43
            int r2 = r7.adGroupCount
            int r3 = r8.adGroupCount
            if (r2 != r3) goto L43
            long r2 = r7.adResumePositionUs
            long r4 = r8.adResumePositionUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            long r2 = r7.contentDurationUs
            long r4 = r8.contentDurationUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            int r2 = r7.removedAdGroupCount
            int r3 = r8.removedAdGroupCount
            if (r2 != r3) goto L43
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = r7.adGroups
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r8 = r8.adGroups
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
            return r1
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup getAdGroup(@androidx.annotation.IntRange(from = 0) int r3) {
            r2 = this;
            int r0 = r2.removedAdGroupCount
            if (r3 >= r0) goto L7
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = com.google.android.exoplayer2.source.ads.AdPlaybackState.REMOVED_AD_GROUP
            goto Lc
        L7:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r1 = r2.adGroups
            int r3 = r3 - r0
            r3 = r1[r3]
        Lc:
            return r3
    }

    public int getAdGroupIndexAfterPositionUs(long r7, long r9) {
            r6 = this;
            r0 = -1
            r1 = -9223372036854775808
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L41
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L15
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 < 0) goto L15
            goto L41
        L15:
            int r9 = r6.removedAdGroupCount
        L17:
            int r10 = r6.adGroupCount
            if (r9 >= r10) goto L3c
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r10 = r6.getAdGroup(r9)
            long r3 = r10.timeUs
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 == 0) goto L2f
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r10 = r6.getAdGroup(r9)
            long r3 = r10.timeUs
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L39
        L2f:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r10 = r6.getAdGroup(r9)
            boolean r10 = r10.shouldPlayAdGroup()
            if (r10 != 0) goto L3c
        L39:
            int r9 = r9 + 1
            goto L17
        L3c:
            int r7 = r6.adGroupCount
            if (r9 >= r7) goto L41
            r0 = r9
        L41:
            return r0
    }

    public int getAdGroupIndexForPositionUs(long r8, long r10) {
            r7 = this;
            int r0 = r7.adGroupCount
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L13
            r1 = r7
            r2 = r8
            r4 = r10
            r6 = r0
            boolean r1 = r1.isPositionBeforeAdGroup(r2, r4, r6)
            if (r1 == 0) goto L13
            int r0 = r0 + (-1)
            goto L4
        L13:
            if (r0 < 0) goto L20
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r8 = r7.getAdGroup(r0)
            boolean r8 = r8.hasUnplayedAds()
            if (r8 == 0) goto L20
            goto L21
        L20:
            r0 = -1
        L21:
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.adGroupCount
            int r0 = r0 * 31
            java.lang.Object r1 = r3.adsId
            if (r1 != 0) goto La
            r1 = 0
            goto Le
        La:
            int r1 = r1.hashCode()
        Le:
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.adResumePositionUs
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.contentDurationUs
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.removedAdGroupCount
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r1 = r3.adGroups
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public boolean isAdInErrorState(@androidx.annotation.IntRange(from = 0) int r4, @androidx.annotation.IntRange(from = 0) int r5) {
            r3 = this;
            int r0 = r3.adGroupCount
            r1 = 0
            if (r4 < r0) goto L6
            return r1
        L6:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r4 = r3.getAdGroup(r4)
            int r0 = r4.count
            r2 = -1
            if (r0 == r2) goto L1a
            if (r5 < r0) goto L12
            goto L1a
        L12:
            int[] r4 = r4.states
            r4 = r4[r5]
            r5 = 4
            if (r4 != r5) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = r7.adGroups
            int r3 = r2.length
            r4 = 0
        Le:
            if (r4 >= r3) goto L1c
            r5 = r2[r4]
            android.os.Bundle r5 = r5.toBundle()
            r1.add(r5)
            int r4 = r4 + 1
            goto Le
        L1c:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L27
            java.lang.String r2 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_AD_GROUPS
            r0.putParcelableArrayList(r2, r1)
        L27:
            long r1 = r7.adResumePositionUs
            com.google.android.exoplayer2.source.ads.AdPlaybackState r3 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
            long r4 = r3.adResumePositionUs
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L36
            java.lang.String r4 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_AD_RESUME_POSITION_US
            r0.putLong(r4, r1)
        L36:
            long r1 = r7.contentDurationUs
            long r4 = r3.contentDurationUs
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L43
            java.lang.String r4 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_CONTENT_DURATION_US
            r0.putLong(r4, r1)
        L43:
            int r1 = r7.removedAdGroupCount
            int r2 = r3.removedAdGroupCount
            if (r1 == r2) goto L4e
            java.lang.String r2 = com.google.android.exoplayer2.source.ads.AdPlaybackState.FIELD_REMOVED_AD_GROUP_COUNT
            r0.putInt(r2, r1)
        L4e:
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.String r0 = "AdPlaybackState(adsId="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Object r1 = r9.adsId
            r0.append(r1)
            java.lang.String r1 = ", adResumePositionUs="
            r0.append(r1)
            long r1 = r9.adResumePositionUs
            r0.append(r1)
            java.lang.String r1 = ", adGroups=["
            r0.append(r1)
            r1 = 0
        L1b:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = r9.adGroups
            int r2 = r2.length
            java.lang.String r3 = "])"
            if (r1 >= r2) goto Lb4
            java.lang.String r2 = "adGroup(timeUs="
            r0.append(r2)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = r9.adGroups
            r2 = r2[r1]
            long r4 = r2.timeUs
            r0.append(r4)
            java.lang.String r2 = ", ads=["
            r0.append(r2)
            r2 = 0
        L36:
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r4 = r9.adGroups
            r4 = r4[r1]
            int[] r4 = r4.states
            int r4 = r4.length
            java.lang.String r5 = ", "
            r6 = 1
            if (r2 >= r4) goto La4
            java.lang.String r4 = "ad(state="
            r0.append(r4)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r4 = r9.adGroups
            r4 = r4[r1]
            int[] r4 = r4.states
            r4 = r4[r2]
            if (r4 == 0) goto L7a
            if (r4 == r6) goto L74
            r7 = 2
            if (r4 == r7) goto L6e
            r7 = 3
            if (r4 == r7) goto L68
            r7 = 4
            if (r4 == r7) goto L62
            r4 = 63
            r0.append(r4)
            goto L7f
        L62:
            r4 = 33
            r0.append(r4)
            goto L7f
        L68:
            r4 = 80
            r0.append(r4)
            goto L7f
        L6e:
            r4 = 83
            r0.append(r4)
            goto L7f
        L74:
            r4 = 82
            r0.append(r4)
            goto L7f
        L7a:
            r4 = 95
            r0.append(r4)
        L7f:
            java.lang.String r4 = ", durationUs="
            r0.append(r4)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r4 = r9.adGroups
            r4 = r4[r1]
            long[] r4 = r4.durationsUs
            r7 = r4[r2]
            r0.append(r7)
            r4 = 41
            r0.append(r4)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r4 = r9.adGroups
            r4 = r4[r1]
            int[] r4 = r4.states
            int r4 = r4.length
            int r4 = r4 - r6
            if (r2 >= r4) goto La1
            r0.append(r5)
        La1:
            int r2 = r2 + 1
            goto L36
        La4:
            r0.append(r3)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = r9.adGroups
            int r2 = r2.length
            int r2 = r2 - r6
            if (r1 >= r2) goto Lb0
            r0.append(r5)
        Lb0:
            int r1 = r1 + 1
            goto L1b
        Lb4:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdCount(@androidx.annotation.IntRange(from = 0) int r10, @androidx.annotation.IntRange(from = 1) int r11) {
            r9 = this;
            if (r11 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            r1 = r0[r10]
            int r1 = r1.count
            if (r1 != r11) goto L14
            return r9
        L14:
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            r0 = r0[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withAdCount(r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdDurationsUs(@androidx.annotation.IntRange(from = 0) int r10, long... r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withAdDurationsUs(r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdDurationsUs(long[][] r11) {
            r10 = this;
            int r0 = r10.removedAdGroupCount
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r10.adGroups
            int r2 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r2)
            r4 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r4 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r4
        L15:
            int r0 = r10.adGroupCount
            if (r1 >= r0) goto L26
            r0 = r4[r1]
            r2 = r11[r1]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r0.withAdDurationsUs(r2)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L15
        L26:
            com.google.android.exoplayer2.source.ads.AdPlaybackState r11 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r3 = r10.adsId
            long r5 = r10.adResumePositionUs
            long r7 = r10.contentDurationUs
            int r9 = r10.removedAdGroupCount
            r2 = r11
            r2.<init>(r3, r4, r5, r7, r9)
            return r11
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdGroupTimeUs(@androidx.annotation.IntRange(from = 0) int r10, long r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            r0 = r0[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withTimeUs(r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdLoadError(@androidx.annotation.IntRange(from = 0) int r10, @androidx.annotation.IntRange(from = 0) int r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            r1 = 4
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withAdState(r1, r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdResumePositionUs(long r12) {
            r11 = this;
            long r0 = r11.adResumePositionUs
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L7
            return r11
        L7:
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r4 = r11.adsId
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r5 = r11.adGroups
            long r8 = r11.contentDurationUs
            int r10 = r11.removedAdGroupCount
            r3 = r0
            r6 = r12
            r3.<init>(r4, r5, r6, r8, r10)
            return r0
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAvailableAd(@androidx.annotation.IntRange(from = 0) int r2, @androidx.annotation.IntRange(from = 0) int r3) {
            r1 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = r1.withAvailableAdUri(r2, r3, r0)
            return r2
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAvailableAdUri(@androidx.annotation.IntRange(from = 0) int r10, @androidx.annotation.IntRange(from = 0) int r11, android.net.Uri r12) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            android.net.Uri r0 = android.net.Uri.EMPTY
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L1e
            r0 = r3[r10]
            boolean r0 = r0.isServerSideInserted
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withAdUri(r12, r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withContentDurationUs(long r12) {
            r11 = this;
            long r0 = r11.contentDurationUs
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L7
            return r11
        L7:
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r4 = r11.adsId
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r5 = r11.adGroups
            long r6 = r11.adResumePositionUs
            int r10 = r11.removedAdGroupCount
            r3 = r0
            r8 = r12
            r3.<init>(r4, r5, r6, r8, r10)
            return r0
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withContentResumeOffsetUs(@androidx.annotation.IntRange(from = 0) int r10, long r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            r1 = r0[r10]
            long r1 = r1.contentResumeOffsetUs
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto Le
            return r9
        Le:
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withContentResumeOffsetUs(r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withIsServerSideInserted(@androidx.annotation.IntRange(from = 0) int r10, boolean r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            r1 = r0[r10]
            boolean r1 = r1.isServerSideInserted
            if (r1 != r11) goto Lc
            return r9
        Lc:
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withIsServerSideInserted(r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withLastAdRemoved(@androidx.annotation.IntRange(from = 0) int r10) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r0.withLastAdRemoved()
            r3[r10] = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withNewAdGroup(@androidx.annotation.IntRange(from = 0) int r10, long r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup
            r0.<init>(r11)
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r11 = r9.adGroups
            java.lang.Object[] r11 = com.google.android.exoplayer2.util.Util.nullSafeArrayAppend(r11, r0)
            r3 = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            int r11 = r10 + 1
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r12 = r9.adGroups
            int r12 = r12.length
            int r12 = r12 - r10
            java.lang.System.arraycopy(r3, r10, r3, r11, r12)
            r3[r10] = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withOriginalAdCount(@androidx.annotation.IntRange(from = 0) int r10, int r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            r1 = r0[r10]
            int r1 = r1.originalCount
            if (r1 != r11) goto Lc
            return r9
        Lc:
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withOriginalAdCount(r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withPlayedAd(@androidx.annotation.IntRange(from = 0) int r10, @androidx.annotation.IntRange(from = 0) int r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            r1 = 3
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withAdState(r1, r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withRemovedAdGroupCount(@androidx.annotation.IntRange(from = 0) int r11) {
            r10 = this;
            int r0 = r10.removedAdGroupCount
            if (r0 != r11) goto L5
            return r10
        L5:
            r1 = 0
            if (r11 <= r0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            int r0 = r10.adGroupCount
            int r0 = r0 - r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r4 = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[r0]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r2 = r10.adGroups
            int r3 = r10.removedAdGroupCount
            int r3 = r11 - r3
            java.lang.System.arraycopy(r2, r3, r4, r1, r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r3 = r10.adsId
            long r5 = r10.adResumePositionUs
            long r7 = r10.contentDurationUs
            r2 = r0
            r9 = r11
            r2.<init>(r3, r4, r5, r7, r9)
            return r0
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withResetAdGroup(@androidx.annotation.IntRange(from = 0) int r10) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r0.withAllAdsReset()
            r3[r10] = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withSkippedAd(@androidx.annotation.IntRange(from = 0) int r10, @androidx.annotation.IntRange(from = 0) int r11) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            r1 = 2
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r11 = r0.withAdState(r1, r11)
            r3[r10] = r11
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }

    @androidx.annotation.CheckResult
    public com.google.android.exoplayer2.source.ads.AdPlaybackState withSkippedAdGroup(@androidx.annotation.IntRange(from = 0) int r10) {
            r9 = this;
            int r0 = r9.removedAdGroupCount
            int r10 = r10 - r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r0 = r9.adGroups
            int r1 = r0.length
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            r3 = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup[] r3 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) r3
            r0 = r3[r10]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r0 = r0.withAllAdsSkipped()
            r3[r10] = r0
            com.google.android.exoplayer2.source.ads.AdPlaybackState r10 = new com.google.android.exoplayer2.source.ads.AdPlaybackState
            java.lang.Object r2 = r9.adsId
            long r4 = r9.adResumePositionUs
            long r6 = r9.contentDurationUs
            int r8 = r9.removedAdGroupCount
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return r10
    }
}
