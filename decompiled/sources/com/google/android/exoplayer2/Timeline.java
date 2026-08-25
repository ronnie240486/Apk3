package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Timeline implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Timeline> CREATOR = null;
    public static final com.google.android.exoplayer2.Timeline EMPTY = null;
    private static final java.lang.String FIELD_PERIODS = null;
    private static final java.lang.String FIELD_SHUFFLED_WINDOW_INDICES = null;
    private static final java.lang.String FIELD_WINDOWS = null;


    /* JADX INFO: loaded from: classes.dex */
    public static final class Period implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Timeline.Period> CREATOR = null;
        private static final java.lang.String FIELD_AD_PLAYBACK_STATE = null;
        private static final java.lang.String FIELD_DURATION_US = null;
        private static final java.lang.String FIELD_PLACEHOLDER = null;
        private static final java.lang.String FIELD_POSITION_IN_WINDOW_US = null;
        private static final java.lang.String FIELD_WINDOW_INDEX = null;
        private com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
        public long durationUs;

        @androidx.annotation.Nullable
        public java.lang.Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;

        @androidx.annotation.Nullable
        public java.lang.Object uid;
        public int windowIndex;

        public static /* synthetic */ com.google.android.exoplayer2.Timeline.Period $r8$lambda$cb0Ll1d1tnVYwhQwGd9j2fWlJfI(android.os.Bundle r0) {
                com.google.android.exoplayer2.Timeline$Period r0 = fromBundle(r0)
                return r0
        }

        static {
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Period.FIELD_WINDOW_INDEX = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Period.FIELD_DURATION_US = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Period.FIELD_POSITION_IN_WINDOW_US = r0
                r0 = 3
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Period.FIELD_PLACEHOLDER = r0
                r0 = 4
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Period.FIELD_AD_PLAYBACK_STATE = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$23
                com.google.android.exoplayer2.Timeline.Period.CREATOR = r0
                return
        }

        public Period() {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
                r1.adPlaybackState = r0
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.ads.AdPlaybackState access$000(com.google.android.exoplayer2.Timeline.Period r0) {
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r0.adPlaybackState
                return r0
        }

        private static com.google.android.exoplayer2.Timeline.Period fromBundle(android.os.Bundle r12) {
                java.lang.String r0 = com.google.android.exoplayer2.Timeline.Period.FIELD_WINDOW_INDEX
                r1 = 0
                int r5 = r12.getInt(r0, r1)
                java.lang.String r0 = com.google.android.exoplayer2.Timeline.Period.FIELD_DURATION_US
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                long r6 = r12.getLong(r0, r2)
                java.lang.String r0 = com.google.android.exoplayer2.Timeline.Period.FIELD_POSITION_IN_WINDOW_US
                r2 = 0
                long r8 = r12.getLong(r0, r2)
                java.lang.String r0 = com.google.android.exoplayer2.Timeline.Period.FIELD_PLACEHOLDER
                boolean r11 = r12.getBoolean(r0, r1)
                java.lang.String r0 = com.google.android.exoplayer2.Timeline.Period.FIELD_AD_PLAYBACK_STATE
                android.os.Bundle r12 = r12.getBundle(r0)
                if (r12 == 0) goto L31
                com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.source.ads.AdPlaybackState> r0 = com.google.android.exoplayer2.source.ads.AdPlaybackState.CREATOR
                com.google.android.exoplayer2.Bundleable r12 = r0.fromBundle(r12)
                com.google.android.exoplayer2.source.ads.AdPlaybackState r12 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r12
                goto L33
            L31:
                com.google.android.exoplayer2.source.ads.AdPlaybackState r12 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
            L33:
                r10 = r12
                com.google.android.exoplayer2.Timeline$Period r12 = new com.google.android.exoplayer2.Timeline$Period
                r12.<init>()
                r3 = 0
                r4 = 0
                r2 = r12
                r2.set(r3, r4, r5, r6, r8, r10, r11)
                return r12
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L53
                java.lang.Class<com.google.android.exoplayer2.Timeline$Period> r2 = com.google.android.exoplayer2.Timeline.Period.class
                java.lang.Class r3 = r8.getClass()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L14
                goto L53
            L14:
                com.google.android.exoplayer2.Timeline$Period r8 = (com.google.android.exoplayer2.Timeline.Period) r8
                java.lang.Object r2 = r7.id
                java.lang.Object r3 = r8.id
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L51
                java.lang.Object r2 = r7.uid
                java.lang.Object r3 = r8.uid
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L51
                int r2 = r7.windowIndex
                int r3 = r8.windowIndex
                if (r2 != r3) goto L51
                long r2 = r7.durationUs
                long r4 = r8.durationUs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L51
                long r2 = r7.positionInWindowUs
                long r4 = r8.positionInWindowUs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L51
                boolean r2 = r7.isPlaceholder
                boolean r3 = r8.isPlaceholder
                if (r2 != r3) goto L51
                com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = r7.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = r8.adPlaybackState
                boolean r8 = com.google.android.exoplayer2.util.Util.areEqual(r2, r8)
                if (r8 == 0) goto L51
                goto L52
            L51:
                r0 = 0
            L52:
                return r0
            L53:
                return r1
        }

        public int getAdCountInAdGroup(int r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r2 = r0.getAdGroup(r2)
                int r2 = r2.count
                return r2
        }

        public long getAdDurationUs(int r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r2.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r0.getAdGroup(r3)
                int r0 = r3.count
                r1 = -1
                if (r0 == r1) goto L10
                long[] r3 = r3.durationsUs
                r0 = r3[r4]
                goto L15
            L10:
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L15:
                return r0
        }

        public int getAdGroupCount() {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                int r0 = r0.adGroupCount
                return r0
        }

        public int getAdGroupIndexAfterPositionUs(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r3.adPlaybackState
                long r1 = r3.durationUs
                int r4 = r0.getAdGroupIndexAfterPositionUs(r4, r1)
                return r4
        }

        public int getAdGroupIndexForPositionUs(long r4) {
                r3 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r3.adPlaybackState
                long r1 = r3.durationUs
                int r4 = r0.getAdGroupIndexForPositionUs(r4, r1)
                return r4
        }

        public long getAdGroupTimeUs(int r3) {
                r2 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r2.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r0.getAdGroup(r3)
                long r0 = r3.timeUs
                return r0
        }

        public long getAdResumePositionUs() {
                r2 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r2.adPlaybackState
                long r0 = r0.adResumePositionUs
                return r0
        }

        public int getAdState(int r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r2.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r0.getAdGroup(r3)
                int r0 = r3.count
                r1 = -1
                if (r0 == r1) goto L10
                int[] r3 = r3.states
                r3 = r3[r4]
                goto L11
            L10:
                r3 = 0
            L11:
                return r3
        }

        @androidx.annotation.Nullable
        public java.lang.Object getAdsId() {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                java.lang.Object r0 = r0.adsId
                return r0
        }

        public long getContentResumeOffsetUs(int r3) {
                r2 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r2.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r3 = r0.getAdGroup(r3)
                long r0 = r3.contentResumeOffsetUs
                return r0
        }

        public long getDurationMs() {
                r2 = this;
                long r0 = r2.durationUs
                long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
                return r0
        }

        public long getDurationUs() {
                r2 = this;
                long r0 = r2.durationUs
                return r0
        }

        public int getFirstAdIndexToPlay(int r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r2 = r0.getAdGroup(r2)
                int r2 = r2.getFirstAdIndexToPlay()
                return r2
        }

        public int getNextAdIndexToPlay(int r2, int r3) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r2 = r0.getAdGroup(r2)
                int r2 = r2.getNextAdIndexToPlay(r3)
                return r2
        }

        public long getPositionInWindowMs() {
                r2 = this;
                long r0 = r2.positionInWindowUs
                long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
                return r0
        }

        public long getPositionInWindowUs() {
                r2 = this;
                long r0 = r2.positionInWindowUs
                return r0
        }

        public int getRemovedAdGroupCount() {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                int r0 = r0.removedAdGroupCount
                return r0
        }

        public boolean hasPlayedAdGroup(int r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r2 = r0.getAdGroup(r2)
                boolean r2 = r2.hasUnplayedAds()
                r2 = r2 ^ 1
                return r2
        }

        public int hashCode() {
                r6 = this;
                java.lang.Object r0 = r6.id
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                r2 = 217(0xd9, float:3.04E-43)
                int r2 = r2 + r0
                int r2 = r2 * 31
                java.lang.Object r0 = r6.uid
                if (r0 != 0) goto L15
                goto L19
            L15:
                int r1 = r0.hashCode()
            L19:
                int r2 = r2 + r1
                int r2 = r2 * 31
                int r0 = r6.windowIndex
                int r2 = r2 + r0
                int r2 = r2 * 31
                long r0 = r6.durationUs
                r3 = 32
                long r4 = r0 >>> r3
                long r0 = r0 ^ r4
                int r1 = (int) r0
                int r2 = r2 + r1
                int r2 = r2 * 31
                long r0 = r6.positionInWindowUs
                long r3 = r0 >>> r3
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r2 = r2 + r1
                int r2 = r2 * 31
                boolean r0 = r6.isPlaceholder
                int r2 = r2 + r0
                int r2 = r2 * 31
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r6.adPlaybackState
                int r0 = r0.hashCode()
                int r0 = r0 + r2
                return r0
        }

        public boolean isServerSideInsertedAdGroup(int r2) {
                r1 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r1.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r2 = r0.getAdGroup(r2)
                boolean r2 = r2.isServerSideInserted
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Timeline.Period set(@androidx.annotation.Nullable java.lang.Object r11, @androidx.annotation.Nullable java.lang.Object r12, int r13, long r14, long r16) {
                r10 = this;
                com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
                r9 = 0
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r6 = r16
                com.google.android.exoplayer2.Timeline$Period r0 = r0.set(r1, r2, r3, r4, r6, r8, r9)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Timeline.Period set(@androidx.annotation.Nullable java.lang.Object r1, @androidx.annotation.Nullable java.lang.Object r2, int r3, long r4, long r6, com.google.android.exoplayer2.source.ads.AdPlaybackState r8, boolean r9) {
                r0 = this;
                r0.id = r1
                r0.uid = r2
                r0.windowIndex = r3
                r0.durationUs = r4
                r0.positionInWindowUs = r6
                r0.adPlaybackState = r8
                r0.isPlaceholder = r9
                return r0
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r6 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                int r1 = r6.windowIndex
                if (r1 == 0) goto Le
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Period.FIELD_WINDOW_INDEX
                r0.putInt(r2, r1)
            Le:
                long r1 = r6.durationUs
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L1e
                java.lang.String r3 = com.google.android.exoplayer2.Timeline.Period.FIELD_DURATION_US
                r0.putLong(r3, r1)
            L1e:
                long r1 = r6.positionInWindowUs
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L2b
                java.lang.String r3 = com.google.android.exoplayer2.Timeline.Period.FIELD_POSITION_IN_WINDOW_US
                r0.putLong(r3, r1)
            L2b:
                boolean r1 = r6.isPlaceholder
                if (r1 == 0) goto L34
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Period.FIELD_PLACEHOLDER
                r0.putBoolean(r2, r1)
            L34:
                com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r6.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L49
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Period.FIELD_AD_PLAYBACK_STATE
                com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = r6.adPlaybackState
                android.os.Bundle r2 = r2.toBundle()
                r0.putBundle(r1, r2)
            L49:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RemotableTimeline extends com.google.android.exoplayer2.Timeline {
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Period> periods;
        private final int[] shuffledWindowIndices;
        private final int[] windowIndicesInShuffled;
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Window> windows;

        public RemotableTimeline(com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Window> r4, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Period> r5, int[] r6) {
                r3 = this;
                r3.<init>()
                int r0 = r4.size()
                int r1 = r6.length
                r2 = 0
                if (r0 != r1) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r3.windows = r4
                r3.periods = r5
                r3.shuffledWindowIndices = r6
                int r4 = r6.length
                int[] r4 = new int[r4]
                r3.windowIndicesInShuffled = r4
            L1c:
                int r4 = r6.length
                if (r2 >= r4) goto L28
                int[] r4 = r3.windowIndicesInShuffled
                r5 = r6[r2]
                r4[r5] = r2
                int r2 = r2 + 1
                goto L1c
            L28:
                return
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean r2) {
                r1 = this;
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L8
                r2 = -1
                return r2
            L8:
                r0 = 0
                if (r2 == 0) goto Lf
                int[] r2 = r1.shuffledWindowIndices
                r0 = r2[r0]
            Lf:
                return r0
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean r2) {
                r1 = this;
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L8
                r2 = -1
                return r2
            L8:
                if (r2 == 0) goto L15
                int[] r2 = r1.shuffledWindowIndices
                int r0 = r1.getWindowCount()
                int r0 = r0 + (-1)
                r2 = r2[r0]
                goto L1b
            L15:
                int r2 = r1.getWindowCount()
                int r2 = r2 + (-1)
            L1b:
                return r2
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int r3, int r4, boolean r5) {
                r2 = this;
                r0 = 1
                if (r4 != r0) goto L4
                return r3
            L4:
                int r1 = r2.getLastWindowIndex(r5)
                if (r3 != r1) goto L14
                r3 = 2
                if (r4 != r3) goto L12
                int r3 = r2.getFirstWindowIndex(r5)
                goto L13
            L12:
                r3 = -1
            L13:
                return r3
            L14:
                if (r5 == 0) goto L20
                int[] r4 = r2.shuffledWindowIndices
                int[] r5 = r2.windowIndicesInShuffled
                r3 = r5[r3]
                int r3 = r3 + r0
                r3 = r4[r3]
                goto L21
            L20:
                int r3 = r3 + r0
            L21:
                return r3
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r11, com.google.android.exoplayer2.Timeline.Period r12, boolean r13) {
                r10 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Period> r13 = r10.periods
                java.lang.Object r11 = r13.get(r11)
                com.google.android.exoplayer2.Timeline$Period r11 = (com.google.android.exoplayer2.Timeline.Period) r11
                java.lang.Object r1 = r11.id
                java.lang.Object r2 = r11.uid
                int r3 = r11.windowIndex
                long r4 = r11.durationUs
                long r6 = r11.positionInWindowUs
                com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = com.google.android.exoplayer2.Timeline.Period.access$000(r11)
                boolean r9 = r11.isPlaceholder
                r0 = r12
                r0.set(r1, r2, r3, r4, r6, r8, r9)
                return r12
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
                r1 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Period> r0 = r1.periods
                int r0 = r0.size()
                return r0
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int r3, int r4, boolean r5) {
                r2 = this;
                r0 = 1
                if (r4 != r0) goto L4
                return r3
            L4:
                int r1 = r2.getFirstWindowIndex(r5)
                if (r3 != r1) goto L14
                r3 = 2
                if (r4 != r3) goto L12
                int r3 = r2.getLastWindowIndex(r5)
                goto L13
            L12:
                r3 = -1
            L13:
                return r3
            L14:
                if (r5 == 0) goto L20
                int[] r4 = r2.shuffledWindowIndices
                int[] r5 = r2.windowIndicesInShuffled
                r3 = r5[r3]
                int r3 = r3 - r0
                r3 = r4[r3]
                goto L21
            L20:
                int r3 = r3 - r0
            L21:
                return r3
        }

        @Override // com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r23, com.google.android.exoplayer2.Timeline.Window r24, long r25) {
                r22 = this;
                r15 = r24
                r0 = r24
                r13 = r22
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Window> r1 = r13.windows
                r2 = r23
                java.lang.Object r1 = r1.get(r2)
                r14 = r1
                com.google.android.exoplayer2.Timeline$Window r14 = (com.google.android.exoplayer2.Timeline.Window) r14
                java.lang.Object r1 = r14.uid
                com.google.android.exoplayer2.MediaItem r2 = r14.mediaItem
                java.lang.Object r3 = r14.manifest
                long r4 = r14.presentationStartTimeMs
                long r6 = r14.windowStartTimeMs
                long r8 = r14.elapsedRealtimeEpochOffsetMs
                boolean r10 = r14.isSeekable
                boolean r11 = r14.isDynamic
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r12 = r14.liveConfiguration
                r25 = r0
                r23 = r1
                long r0 = r14.defaultPositionUs
                r26 = r2
                r2 = r14
                r13 = r0
                long r0 = r2.durationUs
                r15 = r0
                int r0 = r2.firstPeriodIndex
                r17 = r0
                int r0 = r2.lastPeriodIndex
                r18 = r0
                long r0 = r2.positionInFirstPeriodUs
                r19 = r0
                r1 = r23
                r0 = r25
                r21 = r2
                r2 = r26
                r0.set(r1, r2, r3, r4, r6, r8, r10, r11, r12, r13, r15, r17, r18, r19)
                r1 = r21
                boolean r0 = r1.isPlaceholder
                r1 = r24
                r1.isPlaceholder = r0
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
                r1 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Window> r0 = r1.windows
                int r0 = r0.size()
                return r0
        }
    }

    public static final class Window implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Timeline.Window> CREATOR = null;
        private static final java.lang.Object FAKE_WINDOW_UID = null;
        private static final java.lang.String FIELD_DEFAULT_POSITION_US = null;
        private static final java.lang.String FIELD_DURATION_US = null;
        private static final java.lang.String FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = null;
        private static final java.lang.String FIELD_FIRST_PERIOD_INDEX = null;
        private static final java.lang.String FIELD_IS_DYNAMIC = null;
        private static final java.lang.String FIELD_IS_PLACEHOLDER = null;
        private static final java.lang.String FIELD_IS_SEEKABLE = null;
        private static final java.lang.String FIELD_LAST_PERIOD_INDEX = null;
        private static final java.lang.String FIELD_LIVE_CONFIGURATION = null;
        private static final java.lang.String FIELD_MEDIA_ITEM = null;
        private static final java.lang.String FIELD_POSITION_IN_FIRST_PERIOD_US = null;
        private static final java.lang.String FIELD_PRESENTATION_START_TIME_MS = null;
        private static final java.lang.String FIELD_WINDOW_START_TIME_MS = null;
        private static final com.google.android.exoplayer2.MediaItem PLACEHOLDER_MEDIA_ITEM = null;
        public static final java.lang.Object SINGLE_WINDOW_UID = null;
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;

        @java.lang.Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;

        @androidx.annotation.Nullable
        public java.lang.Object manifest;
        public com.google.android.exoplayer2.MediaItem mediaItem;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @androidx.annotation.Nullable
        @java.lang.Deprecated
        public java.lang.Object tag;
        public java.lang.Object uid;
        public long windowStartTimeMs;

        public static /* synthetic */ com.google.android.exoplayer2.Timeline.Window $r8$lambda$DwPhLG2u8bNdNcFO2XKtY2D8gVM(android.os.Bundle r0) {
                com.google.android.exoplayer2.Timeline$Window r0 = fromBundle(r0)
                return r0
        }

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                com.google.android.exoplayer2.Timeline.Window.FAKE_WINDOW_UID = r0
                com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
                r0.<init>()
                java.lang.String r1 = "com.google.android.exoplayer2.Timeline"
                com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMediaId(r1)
                android.net.Uri r1 = android.net.Uri.EMPTY
                com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setUri(r1)
                com.google.android.exoplayer2.MediaItem r0 = r0.build()
                com.google.android.exoplayer2.Timeline.Window.PLACEHOLDER_MEDIA_ITEM = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_MEDIA_ITEM = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_PRESENTATION_START_TIME_MS = r0
                r0 = 3
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_WINDOW_START_TIME_MS = r0
                r0 = 4
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = r0
                r0 = 5
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_IS_SEEKABLE = r0
                r0 = 6
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_IS_DYNAMIC = r0
                r0 = 7
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_LIVE_CONFIGURATION = r0
                r0 = 8
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_IS_PLACEHOLDER = r0
                r0 = 9
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_DEFAULT_POSITION_US = r0
                r0 = 10
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_DURATION_US = r0
                r0 = 11
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_FIRST_PERIOD_INDEX = r0
                r0 = 12
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_LAST_PERIOD_INDEX = r0
                r0 = 13
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Timeline.Window.FIELD_POSITION_IN_FIRST_PERIOD_US = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$24
                com.google.android.exoplayer2.Timeline.Window.CREATOR = r0
                return
        }

        public Window() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
                r1.uid = r0
                com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.Timeline.Window.PLACEHOLDER_MEDIA_ITEM
                r1.mediaItem = r0
                return
        }

        private static com.google.android.exoplayer2.Timeline.Window fromBundle(android.os.Bundle r25) {
                r0 = r25
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_MEDIA_ITEM
                android.os.Bundle r1 = r0.getBundle(r1)
                if (r1 == 0) goto L13
                com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.MediaItem> r2 = com.google.android.exoplayer2.MediaItem.CREATOR
                com.google.android.exoplayer2.Bundleable r1 = r2.fromBundle(r1)
                com.google.android.exoplayer2.MediaItem r1 = (com.google.android.exoplayer2.MediaItem) r1
                goto L15
            L13:
                com.google.android.exoplayer2.MediaItem r1 = com.google.android.exoplayer2.MediaItem.EMPTY
            L15:
                r4 = r1
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_PRESENTATION_START_TIME_MS
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                long r6 = r0.getLong(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_WINDOW_START_TIME_MS
                long r8 = r0.getLong(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS
                long r10 = r0.getLong(r1, r2)
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_IS_SEEKABLE
                r5 = 0
                boolean r12 = r0.getBoolean(r1, r5)
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_IS_DYNAMIC
                boolean r13 = r0.getBoolean(r1, r5)
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_LIVE_CONFIGURATION
                android.os.Bundle r1 = r0.getBundle(r1)
                if (r1 == 0) goto L4b
                com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.MediaItem$LiveConfiguration> r14 = com.google.android.exoplayer2.MediaItem.LiveConfiguration.CREATOR
                com.google.android.exoplayer2.Bundleable r1 = r14.fromBundle(r1)
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = (com.google.android.exoplayer2.MediaItem.LiveConfiguration) r1
                goto L4c
            L4b:
                r1 = 0
            L4c:
                r14 = r1
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_IS_PLACEHOLDER
                boolean r1 = r0.getBoolean(r1, r5)
                java.lang.String r15 = com.google.android.exoplayer2.Timeline.Window.FIELD_DEFAULT_POSITION_US
                r23 = r6
                r5 = 0
                long r15 = r0.getLong(r15, r5)
                java.lang.String r7 = com.google.android.exoplayer2.Timeline.Window.FIELD_DURATION_US
                long r17 = r0.getLong(r7, r2)
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_FIRST_PERIOD_INDEX
                r3 = 0
                int r19 = r0.getInt(r2, r3)
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_LAST_PERIOD_INDEX
                int r20 = r0.getInt(r2, r3)
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_POSITION_IN_FIRST_PERIOD_US
                long r21 = r0.getLong(r2, r5)
                com.google.android.exoplayer2.Timeline$Window r0 = new com.google.android.exoplayer2.Timeline$Window
                r2 = r0
                r0.<init>()
                java.lang.Object r3 = com.google.android.exoplayer2.Timeline.Window.FAKE_WINDOW_UID
                r5 = 0
                r6 = r23
                r2.set(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
                r0.isPlaceholder = r1
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L90
                java.lang.Class<com.google.android.exoplayer2.Timeline$Window> r2 = com.google.android.exoplayer2.Timeline.Window.class
                java.lang.Class r3 = r8.getClass()
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L15
                goto L90
            L15:
                com.google.android.exoplayer2.Timeline$Window r8 = (com.google.android.exoplayer2.Timeline.Window) r8
                java.lang.Object r2 = r7.uid
                java.lang.Object r3 = r8.uid
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L8e
                com.google.android.exoplayer2.MediaItem r2 = r7.mediaItem
                com.google.android.exoplayer2.MediaItem r3 = r8.mediaItem
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L8e
                java.lang.Object r2 = r7.manifest
                java.lang.Object r3 = r8.manifest
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L8e
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r7.liveConfiguration
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r3 = r8.liveConfiguration
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
                if (r2 == 0) goto L8e
                long r2 = r7.presentationStartTimeMs
                long r4 = r8.presentationStartTimeMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                long r2 = r7.windowStartTimeMs
                long r4 = r8.windowStartTimeMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                long r2 = r7.elapsedRealtimeEpochOffsetMs
                long r4 = r8.elapsedRealtimeEpochOffsetMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                boolean r2 = r7.isSeekable
                boolean r3 = r8.isSeekable
                if (r2 != r3) goto L8e
                boolean r2 = r7.isDynamic
                boolean r3 = r8.isDynamic
                if (r2 != r3) goto L8e
                boolean r2 = r7.isPlaceholder
                boolean r3 = r8.isPlaceholder
                if (r2 != r3) goto L8e
                long r2 = r7.defaultPositionUs
                long r4 = r8.defaultPositionUs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                long r2 = r7.durationUs
                long r4 = r8.durationUs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L8e
                int r2 = r7.firstPeriodIndex
                int r3 = r8.firstPeriodIndex
                if (r2 != r3) goto L8e
                int r2 = r7.lastPeriodIndex
                int r3 = r8.lastPeriodIndex
                if (r2 != r3) goto L8e
                long r2 = r7.positionInFirstPeriodUs
                long r4 = r8.positionInFirstPeriodUs
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 != 0) goto L8e
                goto L8f
            L8e:
                r0 = 0
            L8f:
                return r0
            L90:
                return r1
        }

        public long getCurrentUnixTimeMs() {
                r2 = this;
                long r0 = r2.elapsedRealtimeEpochOffsetMs
                long r0 = com.google.android.exoplayer2.util.Util.getNowUnixTimeMs(r0)
                return r0
        }

        public long getDefaultPositionMs() {
                r2 = this;
                long r0 = r2.defaultPositionUs
                long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
                return r0
        }

        public long getDefaultPositionUs() {
                r2 = this;
                long r0 = r2.defaultPositionUs
                return r0
        }

        public long getDurationMs() {
                r2 = this;
                long r0 = r2.durationUs
                long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
                return r0
        }

        public long getDurationUs() {
                r2 = this;
                long r0 = r2.durationUs
                return r0
        }

        public long getPositionInFirstPeriodMs() {
                r2 = this;
                long r0 = r2.positionInFirstPeriodUs
                long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
                return r0
        }

        public long getPositionInFirstPeriodUs() {
                r2 = this;
                long r0 = r2.positionInFirstPeriodUs
                return r0
        }

        public int hashCode() {
                r6 = this;
                java.lang.Object r0 = r6.uid
                int r0 = r0.hashCode()
                int r0 = r0 + 217
                int r0 = r0 * 31
                com.google.android.exoplayer2.MediaItem r1 = r6.mediaItem
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.Object r0 = r6.manifest
                r2 = 0
                if (r0 != 0) goto L1a
                r0 = 0
                goto L1e
            L1a:
                int r0 = r0.hashCode()
            L1e:
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r6.liveConfiguration
                if (r0 != 0) goto L26
                goto L2a
            L26:
                int r2 = r0.hashCode()
            L2a:
                int r1 = r1 + r2
                int r1 = r1 * 31
                long r2 = r6.presentationStartTimeMs
                r0 = 32
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                long r2 = r6.windowStartTimeMs
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                long r2 = r6.elapsedRealtimeEpochOffsetMs
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                boolean r2 = r6.isSeekable
                int r1 = r1 + r2
                int r1 = r1 * 31
                boolean r2 = r6.isDynamic
                int r1 = r1 + r2
                int r1 = r1 * 31
                boolean r2 = r6.isPlaceholder
                int r1 = r1 + r2
                int r1 = r1 * 31
                long r2 = r6.defaultPositionUs
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                long r2 = r6.durationUs
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r3 = (int) r2
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r2 = r6.firstPeriodIndex
                int r1 = r1 + r2
                int r1 = r1 * 31
                int r2 = r6.lastPeriodIndex
                int r1 = r1 + r2
                int r1 = r1 * 31
                long r2 = r6.positionInFirstPeriodUs
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public boolean isLive() {
                r4 = this;
                boolean r0 = r4.isLive
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r4.liveConfiguration
                r2 = 1
                r3 = 0
                if (r1 == 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                if (r0 != r1) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r4.liveConfiguration
                if (r0 == 0) goto L18
                goto L19
            L18:
                r2 = 0
            L19:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.Timeline.Window set(java.lang.Object r6, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r7, @androidx.annotation.Nullable java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.LiveConfiguration r17, long r18, long r20, int r22, int r23, long r24) {
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.uid = r3
                if (r1 == 0) goto Lb
                r3 = r1
                goto Ld
            Lb:
                com.google.android.exoplayer2.MediaItem r3 = com.google.android.exoplayer2.Timeline.Window.PLACEHOLDER_MEDIA_ITEM
            Ld:
                r0.mediaItem = r3
                if (r1 == 0) goto L18
                com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = r1.localConfiguration
                if (r1 == 0) goto L18
                java.lang.Object r1 = r1.tag
                goto L19
            L18:
                r1 = 0
            L19:
                r0.tag = r1
                r1 = r8
                r0.manifest = r1
                r3 = r9
                r0.presentationStartTimeMs = r3
                r3 = r11
                r0.windowStartTimeMs = r3
                r3 = r13
                r0.elapsedRealtimeEpochOffsetMs = r3
                r1 = r15
                r0.isSeekable = r1
                r1 = r16
                r0.isDynamic = r1
                r1 = 0
                if (r2 == 0) goto L33
                r3 = 1
                goto L34
            L33:
                r3 = 0
            L34:
                r0.isLive = r3
                r0.liveConfiguration = r2
                r2 = r18
                r0.defaultPositionUs = r2
                r2 = r20
                r0.durationUs = r2
                r2 = r22
                r0.firstPeriodIndex = r2
                r2 = r23
                r0.lastPeriodIndex = r2
                r2 = r24
                r0.positionInFirstPeriodUs = r2
                r0.isPlaceholder = r1
                return r0
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r8 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                com.google.android.exoplayer2.MediaItem r1 = com.google.android.exoplayer2.MediaItem.EMPTY
                com.google.android.exoplayer2.MediaItem r2 = r8.mediaItem
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1a
                java.lang.String r1 = com.google.android.exoplayer2.Timeline.Window.FIELD_MEDIA_ITEM
                com.google.android.exoplayer2.MediaItem r2 = r8.mediaItem
                android.os.Bundle r2 = r2.toBundle()
                r0.putBundle(r1, r2)
            L1a:
                long r1 = r8.presentationStartTimeMs
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L2a
                java.lang.String r5 = com.google.android.exoplayer2.Timeline.Window.FIELD_PRESENTATION_START_TIME_MS
                r0.putLong(r5, r1)
            L2a:
                long r1 = r8.windowStartTimeMs
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L35
                java.lang.String r5 = com.google.android.exoplayer2.Timeline.Window.FIELD_WINDOW_START_TIME_MS
                r0.putLong(r5, r1)
            L35:
                long r1 = r8.elapsedRealtimeEpochOffsetMs
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L40
                java.lang.String r5 = com.google.android.exoplayer2.Timeline.Window.FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS
                r0.putLong(r5, r1)
            L40:
                boolean r1 = r8.isSeekable
                if (r1 == 0) goto L49
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_IS_SEEKABLE
                r0.putBoolean(r2, r1)
            L49:
                boolean r1 = r8.isDynamic
                if (r1 == 0) goto L52
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_IS_DYNAMIC
                r0.putBoolean(r2, r1)
            L52:
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r8.liveConfiguration
                if (r1 == 0) goto L5f
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_LIVE_CONFIGURATION
                android.os.Bundle r1 = r1.toBundle()
                r0.putBundle(r2, r1)
            L5f:
                boolean r1 = r8.isPlaceholder
                if (r1 == 0) goto L68
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_IS_PLACEHOLDER
                r0.putBoolean(r2, r1)
            L68:
                long r1 = r8.defaultPositionUs
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 == 0) goto L75
                java.lang.String r7 = com.google.android.exoplayer2.Timeline.Window.FIELD_DEFAULT_POSITION_US
                r0.putLong(r7, r1)
            L75:
                long r1 = r8.durationUs
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 == 0) goto L80
                java.lang.String r3 = com.google.android.exoplayer2.Timeline.Window.FIELD_DURATION_US
                r0.putLong(r3, r1)
            L80:
                int r1 = r8.firstPeriodIndex
                if (r1 == 0) goto L89
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_FIRST_PERIOD_INDEX
                r0.putInt(r2, r1)
            L89:
                int r1 = r8.lastPeriodIndex
                if (r1 == 0) goto L92
                java.lang.String r2 = com.google.android.exoplayer2.Timeline.Window.FIELD_LAST_PERIOD_INDEX
                r0.putInt(r2, r1)
            L92:
                long r1 = r8.positionInFirstPeriodUs
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 == 0) goto L9d
                java.lang.String r3 = com.google.android.exoplayer2.Timeline.Window.FIELD_POSITION_IN_FIRST_PERIOD_US
                r0.putLong(r3, r1)
            L9d:
                return r0
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.Timeline $r8$lambda$4eWR_EQUMv6FYlKol3461jBhxV8(android.os.Bundle r0) {
            com.google.android.exoplayer2.Timeline r0 = fromBundle(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.Timeline$1 r0 = new com.google.android.exoplayer2.Timeline$1
            r0.<init>()
            com.google.android.exoplayer2.Timeline.EMPTY = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Timeline.FIELD_WINDOWS = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Timeline.FIELD_PERIODS = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.Timeline.FIELD_SHUFFLED_WINDOW_INDICES = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$22
            com.google.android.exoplayer2.Timeline.CREATOR = r0
            return
    }

    public Timeline() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.exoplayer2.Timeline fromBundle(android.os.Bundle r3) {
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.Timeline$Window> r0 = com.google.android.exoplayer2.Timeline.Window.CREATOR
            java.lang.String r1 = com.google.android.exoplayer2.Timeline.FIELD_WINDOWS
            android.os.IBinder r1 = com.google.android.exoplayer2.util.BundleUtil.getBinder(r3, r1)
            com.google.common.collect.ImmutableList r0 = fromBundleListRetriever(r0, r1)
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.Timeline$Period> r1 = com.google.android.exoplayer2.Timeline.Period.CREATOR
            java.lang.String r2 = com.google.android.exoplayer2.Timeline.FIELD_PERIODS
            android.os.IBinder r2 = com.google.android.exoplayer2.util.BundleUtil.getBinder(r3, r2)
            com.google.common.collect.ImmutableList r1 = fromBundleListRetriever(r1, r2)
            java.lang.String r2 = com.google.android.exoplayer2.Timeline.FIELD_SHUFFLED_WINDOW_INDICES
            int[] r3 = r3.getIntArray(r2)
            com.google.android.exoplayer2.Timeline$RemotableTimeline r2 = new com.google.android.exoplayer2.Timeline$RemotableTimeline
            if (r3 != 0) goto L2a
            int r3 = r0.size()
            int[] r3 = generateUnshuffledIndices(r3)
        L2a:
            r2.<init>(r0, r1, r3)
            return r2
    }

    private static <T extends com.google.android.exoplayer2.Bundleable> com.google.common.collect.ImmutableList<T> fromBundleListRetriever(com.google.android.exoplayer2.Bundleable.Creator<T> r3, @androidx.annotation.Nullable android.os.IBinder r4) {
            if (r4 != 0) goto L7
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            return r3
        L7:
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            com.google.common.collect.ImmutableList r4 = com.google.android.exoplayer2.BundleListRetriever.getList(r4)
            r1 = 0
        L11:
            int r2 = r4.size()
            if (r1 >= r2) goto L27
            java.lang.Object r2 = r4.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.exoplayer2.Bundleable r2 = r3.fromBundle(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L11
        L27:
            com.google.common.collect.ImmutableList r3 = r0.build()
            return r3
    }

    private static int[] generateUnshuffledIndices(int r2) {
            int[] r0 = new int[r2]
            r1 = 0
        L3:
            if (r1 >= r2) goto La
            r0[r1] = r1
            int r1 = r1 + 1
            goto L3
        La:
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r10) {
            r9 = this;
            r0 = 1
            if (r9 != r10) goto L4
            return r0
        L4:
            boolean r1 = r10 instanceof com.google.android.exoplayer2.Timeline
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.Timeline r10 = (com.google.android.exoplayer2.Timeline) r10
            int r1 = r10.getWindowCount()
            int r3 = r9.getWindowCount()
            if (r1 != r3) goto L8d
            int r1 = r10.getPeriodCount()
            int r3 = r9.getPeriodCount()
            if (r1 == r3) goto L21
            goto L8d
        L21:
            com.google.android.exoplayer2.Timeline$Window r1 = new com.google.android.exoplayer2.Timeline$Window
            r1.<init>()
            com.google.android.exoplayer2.Timeline$Period r3 = new com.google.android.exoplayer2.Timeline$Period
            r3.<init>()
            com.google.android.exoplayer2.Timeline$Window r4 = new com.google.android.exoplayer2.Timeline$Window
            r4.<init>()
            com.google.android.exoplayer2.Timeline$Period r5 = new com.google.android.exoplayer2.Timeline$Period
            r5.<init>()
            r6 = 0
        L36:
            int r7 = r9.getWindowCount()
            if (r6 >= r7) goto L4e
            com.google.android.exoplayer2.Timeline$Window r7 = r9.getWindow(r6, r1)
            com.google.android.exoplayer2.Timeline$Window r8 = r10.getWindow(r6, r4)
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L4b
            return r2
        L4b:
            int r6 = r6 + 1
            goto L36
        L4e:
            r1 = 0
        L4f:
            int r4 = r9.getPeriodCount()
            if (r1 >= r4) goto L67
            com.google.android.exoplayer2.Timeline$Period r4 = r9.getPeriod(r1, r3, r0)
            com.google.android.exoplayer2.Timeline$Period r6 = r10.getPeriod(r1, r5, r0)
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L64
            return r2
        L64:
            int r1 = r1 + 1
            goto L4f
        L67:
            int r1 = r9.getFirstWindowIndex(r0)
            int r3 = r10.getFirstWindowIndex(r0)
            if (r1 == r3) goto L72
            return r2
        L72:
            int r3 = r9.getLastWindowIndex(r0)
            int r4 = r10.getLastWindowIndex(r0)
            if (r3 == r4) goto L7d
            return r2
        L7d:
            if (r1 == r3) goto L8c
            int r4 = r9.getNextWindowIndex(r1, r2, r0)
            int r1 = r10.getNextWindowIndex(r1, r2, r0)
            if (r4 == r1) goto L8a
            return r2
        L8a:
            r1 = r4
            goto L7d
        L8c:
            return r0
        L8d:
            return r2
    }

    public int getFirstWindowIndex(boolean r1) {
            r0 = this;
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L8
            r1 = -1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public abstract int getIndexOfPeriod(java.lang.Object r1);

    public int getLastWindowIndex(boolean r1) {
            r0 = this;
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L8
            r1 = -1
            goto Le
        L8:
            int r1 = r0.getWindowCount()
            int r1 = r1 + (-1)
        Le:
            return r1
    }

    public final int getNextPeriodIndex(int r2, com.google.android.exoplayer2.Timeline.Period r3, com.google.android.exoplayer2.Timeline.Window r4, int r5, boolean r6) {
            r1 = this;
            com.google.android.exoplayer2.Timeline$Period r3 = r1.getPeriod(r2, r3)
            int r3 = r3.windowIndex
            com.google.android.exoplayer2.Timeline$Window r0 = r1.getWindow(r3, r4)
            int r0 = r0.lastPeriodIndex
            if (r0 != r2) goto L1d
            int r2 = r1.getNextWindowIndex(r3, r5, r6)
            r3 = -1
            if (r2 != r3) goto L16
            return r3
        L16:
            com.google.android.exoplayer2.Timeline$Window r2 = r1.getWindow(r2, r4)
            int r2 = r2.firstPeriodIndex
            return r2
        L1d:
            int r2 = r2 + 1
            return r2
    }

    public int getNextWindowIndex(int r3, int r4, boolean r5) {
            r2 = this;
            r0 = 1
            if (r4 == 0) goto L1c
            if (r4 == r0) goto L1b
            r1 = 2
            if (r4 != r1) goto L15
            int r4 = r2.getLastWindowIndex(r5)
            if (r3 != r4) goto L13
            int r3 = r2.getFirstWindowIndex(r5)
            goto L14
        L13:
            int r3 = r3 + r0
        L14:
            return r3
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1b:
            return r3
        L1c:
            int r4 = r2.getLastWindowIndex(r5)
            if (r3 != r4) goto L24
            r3 = -1
            goto L25
        L24:
            int r3 = r3 + r0
        L25:
            return r3
    }

    public final com.google.android.exoplayer2.Timeline.Period getPeriod(int r2, com.google.android.exoplayer2.Timeline.Period r3) {
            r1 = this;
            r0 = 0
            com.google.android.exoplayer2.Timeline$Period r2 = r1.getPeriod(r2, r3, r0)
            return r2
    }

    public abstract com.google.android.exoplayer2.Timeline.Period getPeriod(int r1, com.google.android.exoplayer2.Timeline.Period r2, boolean r3);

    public com.google.android.exoplayer2.Timeline.Period getPeriodByUid(java.lang.Object r2, com.google.android.exoplayer2.Timeline.Period r3) {
            r1 = this;
            int r2 = r1.getIndexOfPeriod(r2)
            r0 = 1
            com.google.android.exoplayer2.Timeline$Period r2 = r1.getPeriod(r2, r3, r0)
            return r2
    }

    public abstract int getPeriodCount();

    @com.google.errorprone.annotations.InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPosition(com.google.android.exoplayer2.Timeline.Window r1, com.google.android.exoplayer2.Timeline.Period r2, int r3, long r4) {
            r0 = this;
            android.util.Pair r1 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPosition(com.google.android.exoplayer2.Timeline.Window r1, com.google.android.exoplayer2.Timeline.Period r2, int r3, long r4, long r6) {
            r0 = this;
            android.util.Pair r1 = r0.getPeriodPositionUs(r1, r2, r3, r4, r6)
            return r1
    }

    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUs(com.google.android.exoplayer2.Timeline.Window r9, com.google.android.exoplayer2.Timeline.Period r10, int r11, long r12) {
            r8 = this;
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.util.Pair r9 = r0.getPeriodPositionUs(r1, r2, r3, r4, r6)
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            android.util.Pair r9 = (android.util.Pair) r9
            return r9
    }

    @androidx.annotation.Nullable
    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUs(com.google.android.exoplayer2.Timeline.Window r5, com.google.android.exoplayer2.Timeline.Period r6, int r7, long r8, long r10) {
            r4 = this;
            int r0 = r4.getWindowCount()
            r1 = 0
            com.google.android.exoplayer2.util.Assertions.checkIndex(r7, r1, r0)
            r4.getWindow(r7, r5, r10)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 != 0) goto L1e
            long r8 = r5.getDefaultPositionUs()
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 != 0) goto L1e
            r5 = 0
            return r5
        L1e:
            int r7 = r5.firstPeriodIndex
            r4.getPeriod(r7, r6)
        L23:
            int r0 = r5.lastPeriodIndex
            if (r7 >= r0) goto L3b
            long r0 = r6.positionInWindowUs
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L3b
            int r0 = r7 + 1
            com.google.android.exoplayer2.Timeline$Period r1 = r4.getPeriod(r0, r6)
            long r1 = r1.positionInWindowUs
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L3b
            r7 = r0
            goto L23
        L3b:
            r5 = 1
            r4.getPeriod(r7, r6, r5)
            long r0 = r6.positionInWindowUs
            long r8 = r8 - r0
            long r0 = r6.durationUs
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 == 0) goto L4f
            r10 = 1
            long r0 = r0 - r10
            long r8 = java.lang.Math.min(r8, r0)
        L4f:
            r10 = 0
            long r7 = java.lang.Math.max(r10, r8)
            java.lang.Object r5 = r6.uid
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            android.util.Pair r5 = android.util.Pair.create(r5, r6)
            return r5
    }

    public int getPreviousWindowIndex(int r3, int r4, boolean r5) {
            r2 = this;
            r0 = 1
            if (r4 == 0) goto L1c
            if (r4 == r0) goto L1b
            r1 = 2
            if (r4 != r1) goto L15
            int r4 = r2.getFirstWindowIndex(r5)
            if (r3 != r4) goto L13
            int r3 = r2.getLastWindowIndex(r5)
            goto L14
        L13:
            int r3 = r3 - r0
        L14:
            return r3
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1b:
            return r3
        L1c:
            int r4 = r2.getFirstWindowIndex(r5)
            if (r3 != r4) goto L24
            r3 = -1
            goto L25
        L24:
            int r3 = r3 - r0
        L25:
            return r3
    }

    public abstract java.lang.Object getUidOfPeriod(int r1);

    public final com.google.android.exoplayer2.Timeline.Window getWindow(int r3, com.google.android.exoplayer2.Timeline.Window r4) {
            r2 = this;
            r0 = 0
            com.google.android.exoplayer2.Timeline$Window r3 = r2.getWindow(r3, r4, r0)
            return r3
    }

    public abstract com.google.android.exoplayer2.Timeline.Window getWindow(int r1, com.google.android.exoplayer2.Timeline.Window r2, long r3);

    public abstract int getWindowCount();

    public int hashCode() {
            r6 = this;
            com.google.android.exoplayer2.Timeline$Window r0 = new com.google.android.exoplayer2.Timeline$Window
            r0.<init>()
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            int r2 = r6.getWindowCount()
            int r2 = r2 + 217
            r3 = 0
            r4 = 0
        L12:
            int r5 = r6.getWindowCount()
            if (r4 >= r5) goto L26
            int r2 = r2 * 31
            com.google.android.exoplayer2.Timeline$Window r5 = r6.getWindow(r4, r0)
            int r5 = r5.hashCode()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L12
        L26:
            int r2 = r2 * 31
            int r0 = r6.getPeriodCount()
            int r0 = r0 + r2
            r2 = 0
        L2e:
            int r4 = r6.getPeriodCount()
            r5 = 1
            if (r2 >= r4) goto L43
            int r0 = r0 * 31
            com.google.android.exoplayer2.Timeline$Period r4 = r6.getPeriod(r2, r1, r5)
            int r4 = r4.hashCode()
            int r0 = r0 + r4
            int r2 = r2 + 1
            goto L2e
        L43:
            int r1 = r6.getFirstWindowIndex(r5)
        L47:
            r2 = -1
            if (r1 == r2) goto L52
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r1 = r6.getNextWindowIndex(r1, r3, r5)
            goto L47
        L52:
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.getWindowCount()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean isLastPeriod(int r1, com.google.android.exoplayer2.Timeline.Period r2, com.google.android.exoplayer2.Timeline.Window r3, int r4, boolean r5) {
            r0 = this;
            int r1 = r0.getNextPeriodIndex(r1, r2, r3, r4, r5)
            r2 = -1
            if (r1 != r2) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final android.os.Bundle toBundle() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.getWindowCount()
            com.google.android.exoplayer2.Timeline$Window r2 = new com.google.android.exoplayer2.Timeline$Window
            r2.<init>()
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r1) goto L22
            r5 = 0
            com.google.android.exoplayer2.Timeline$Window r5 = r8.getWindow(r4, r2, r5)
            android.os.Bundle r5 = r5.toBundle()
            r0.add(r5)
            int r4 = r4 + 1
            goto L10
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r8.getPeriodCount()
            com.google.android.exoplayer2.Timeline$Period r5 = new com.google.android.exoplayer2.Timeline$Period
            r5.<init>()
            r6 = 0
        L31:
            if (r6 >= r4) goto L41
            com.google.android.exoplayer2.Timeline$Period r7 = r8.getPeriod(r6, r5, r3)
            android.os.Bundle r7 = r7.toBundle()
            r2.add(r7)
            int r6 = r6 + 1
            goto L31
        L41:
            int[] r4 = new int[r1]
            r5 = 1
            if (r1 <= 0) goto L4c
            int r6 = r8.getFirstWindowIndex(r5)
            r4[r3] = r6
        L4c:
            r6 = 1
        L4d:
            if (r6 >= r1) goto L5c
            int r7 = r6 + (-1)
            r7 = r4[r7]
            int r7 = r8.getNextWindowIndex(r7, r3, r5)
            r4[r6] = r7
            int r6 = r6 + 1
            goto L4d
        L5c:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = com.google.android.exoplayer2.Timeline.FIELD_WINDOWS
            com.google.android.exoplayer2.BundleListRetriever r5 = new com.google.android.exoplayer2.BundleListRetriever
            r5.<init>(r0)
            com.google.android.exoplayer2.util.BundleUtil.putBinder(r1, r3, r5)
            java.lang.String r0 = com.google.android.exoplayer2.Timeline.FIELD_PERIODS
            com.google.android.exoplayer2.BundleListRetriever r3 = new com.google.android.exoplayer2.BundleListRetriever
            r3.<init>(r2)
            com.google.android.exoplayer2.util.BundleUtil.putBinder(r1, r0, r3)
            java.lang.String r0 = com.google.android.exoplayer2.Timeline.FIELD_SHUFFLED_WINDOW_INDICES
            r1.putIntArray(r0, r4)
            return r1
    }

    public final android.os.Bundle toBundleWithOneWindowOnly(int r6) {
            r5 = this;
            com.google.android.exoplayer2.Timeline$Window r0 = new com.google.android.exoplayer2.Timeline$Window
            r0.<init>()
            r1 = 0
            com.google.android.exoplayer2.Timeline$Window r6 = r5.getWindow(r6, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            int r2 = r6.firstPeriodIndex
        L17:
            int r3 = r6.lastPeriodIndex
            r4 = 0
            if (r2 > r3) goto L2b
            r5.getPeriod(r2, r1, r4)
            r1.windowIndex = r4
            android.os.Bundle r3 = r1.toBundle()
            r0.add(r3)
            int r2 = r2 + 1
            goto L17
        L2b:
            int r1 = r6.firstPeriodIndex
            int r3 = r3 - r1
            r6.lastPeriodIndex = r3
            r6.firstPeriodIndex = r4
            android.os.Bundle r6 = r6.toBundle()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = com.google.android.exoplayer2.Timeline.FIELD_WINDOWS
            com.google.android.exoplayer2.BundleListRetriever r3 = new com.google.android.exoplayer2.BundleListRetriever
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of(r6)
            r3.<init>(r6)
            com.google.android.exoplayer2.util.BundleUtil.putBinder(r1, r2, r3)
            java.lang.String r6 = com.google.android.exoplayer2.Timeline.FIELD_PERIODS
            com.google.android.exoplayer2.BundleListRetriever r2 = new com.google.android.exoplayer2.BundleListRetriever
            r2.<init>(r0)
            com.google.android.exoplayer2.util.BundleUtil.putBinder(r1, r6, r2)
            java.lang.String r6 = com.google.android.exoplayer2.Timeline.FIELD_SHUFFLED_WINDOW_INDICES
            r0 = 1
            int[] r0 = new int[r0]
            r0[r4] = r4
            r1.putIntArray(r6, r0)
            return r1
    }
}
