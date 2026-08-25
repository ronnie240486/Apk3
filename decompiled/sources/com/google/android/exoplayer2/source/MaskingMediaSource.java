package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskingMediaSource extends com.google.android.exoplayer2.source.WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline timeline;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final com.google.android.exoplayer2.Timeline.Window window;

    /* JADX INFO: loaded from: classes.dex */
    public static final class MaskingTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        public static final java.lang.Object MASKING_EXTERNAL_PERIOD_UID = null;

        @androidx.annotation.Nullable
        private final java.lang.Object replacedInternalPeriodUid;

        @androidx.annotation.Nullable
        private final java.lang.Object replacedInternalWindowUid;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID = r0
                return
        }

        private MaskingTimeline(com.google.android.exoplayer2.Timeline r1, @androidx.annotation.Nullable java.lang.Object r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r0 = this;
                r0.<init>(r1)
                r0.replacedInternalWindowUid = r2
                r0.replacedInternalPeriodUid = r3
                return
        }

        public static /* synthetic */ java.lang.Object access$000(com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline r0) {
                java.lang.Object r0 = r0.replacedInternalPeriodUid
                return r0
        }

        public static com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline createWithPlaceholderTimeline(com.google.android.exoplayer2.MediaItem r3) {
                com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = new com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline
                com.google.android.exoplayer2.source.MaskingMediaSource$PlaceholderTimeline r1 = new com.google.android.exoplayer2.source.MaskingMediaSource$PlaceholderTimeline
                r1.<init>(r3)
                java.lang.Object r3 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
                java.lang.Object r2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
                r0.<init>(r1, r3, r2)
                return r0
        }

        public static com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline createWithRealTimeline(com.google.android.exoplayer2.Timeline r1, @androidx.annotation.Nullable java.lang.Object r2, @androidx.annotation.Nullable java.lang.Object r3) {
                com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = new com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline cloneWithUpdatedTimeline(com.google.android.exoplayer2.Timeline r4) {
                r3 = this;
                com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = new com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline
                java.lang.Object r1 = r3.replacedInternalWindowUid
                java.lang.Object r2 = r3.replacedInternalPeriodUid
                r0.<init>(r4, r1, r2)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object r3) {
                r2 = this;
                com.google.android.exoplayer2.Timeline r0 = r2.timeline
                java.lang.Object r1 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto Lf
                java.lang.Object r1 = r2.replacedInternalPeriodUid
                if (r1 == 0) goto Lf
                r3 = r1
            Lf:
                int r3 = r0.getIndexOfPeriod(r3)
                return r3
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r2, com.google.android.exoplayer2.Timeline.Period r3, boolean r4) {
                r1 = this;
                com.google.android.exoplayer2.Timeline r0 = r1.timeline
                r0.getPeriod(r2, r3, r4)
                java.lang.Object r2 = r3.uid
                java.lang.Object r0 = r1.replacedInternalPeriodUid
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r0)
                if (r2 == 0) goto L15
                if (r4 == 0) goto L15
                java.lang.Object r2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
                r3.uid = r2
            L15:
                return r3
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int r2) {
                r1 = this;
                com.google.android.exoplayer2.Timeline r0 = r1.timeline
                java.lang.Object r2 = r0.getUidOfPeriod(r2)
                java.lang.Object r0 = r1.replacedInternalPeriodUid
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r2, r0)
                if (r0 == 0) goto L10
                java.lang.Object r2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
            L10:
                return r2
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r2, com.google.android.exoplayer2.Timeline.Window r3, long r4) {
                r1 = this;
                com.google.android.exoplayer2.Timeline r0 = r1.timeline
                r0.getWindow(r2, r3, r4)
                java.lang.Object r2 = r3.uid
                java.lang.Object r4 = r1.replacedInternalWindowUid
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r4)
                if (r2 == 0) goto L13
                java.lang.Object r2 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
                r3.uid = r2
            L13:
                return r3
        }
    }

    @androidx.annotation.VisibleForTesting
    public static final class PlaceholderTimeline extends com.google.android.exoplayer2.Timeline {
        private final com.google.android.exoplayer2.MediaItem mediaItem;

        public PlaceholderTimeline(com.google.android.exoplayer2.MediaItem r1) {
                r0 = this;
                r0.<init>()
                r0.mediaItem = r1
                return
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object r2) {
                r1 = this;
                java.lang.Object r0 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
                if (r2 != r0) goto L6
                r2 = 0
                goto L7
            L6:
                r2 = -1
            L7:
                return r2
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r12, com.google.android.exoplayer2.Timeline.Period r13, boolean r14) {
                r11 = this;
                r12 = 0
                if (r14 == 0) goto La
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = r0
                goto Lb
            La:
                r2 = r12
            Lb:
                if (r14 == 0) goto Lf
                java.lang.Object r12 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
            Lf:
                r3 = r12
                r4 = 0
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r7 = 0
                com.google.android.exoplayer2.source.ads.AdPlaybackState r9 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
                r10 = 1
                r1 = r13
                r1.set(r2, r3, r4, r5, r7, r9, r10)
                return r13
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r22, com.google.android.exoplayer2.Timeline.Window r23, long r24) {
                r21 = this;
                r15 = r23
                r0 = r23
                java.lang.Object r1 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
                r13 = r21
                com.google.android.exoplayer2.MediaItem r2 = r13.mediaItem
                r3 = 0
                r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r10 = 0
                r11 = 1
                r12 = 0
                r16 = 0
                r13 = r16
                r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r15 = r16
                r17 = 0
                r18 = 0
                r19 = 0
                r0.set(r1, r2, r3, r4, r6, r8, r10, r11, r12, r13, r15, r17, r18, r19)
                r0 = 1
                r1 = r23
                r1.isPlaceholder = r0
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public MaskingMediaSource(com.google.android.exoplayer2.source.MediaSource r2, boolean r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            if (r3 == 0) goto Le
            boolean r3 = r2.isSingleWindow()
            if (r3 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r1.useLazyPreparation = r3
            com.google.android.exoplayer2.Timeline$Window r3 = new com.google.android.exoplayer2.Timeline$Window
            r3.<init>()
            r1.window = r3
            com.google.android.exoplayer2.Timeline$Period r3 = new com.google.android.exoplayer2.Timeline$Period
            r3.<init>()
            r1.period = r3
            com.google.android.exoplayer2.Timeline r3 = r2.getInitialTimeline()
            if (r3 == 0) goto L2f
            r2 = 0
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(r3, r2, r2)
            r1.timeline = r2
            r1.hasRealTimeline = r0
            goto L39
        L2f:
            com.google.android.exoplayer2.MediaItem r2 = r2.getMediaItem()
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithPlaceholderTimeline(r2)
            r1.timeline = r2
        L39:
            return
    }

    private java.lang.Object getExternalPeriodUid(java.lang.Object r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r1.timeline
            java.lang.Object r0 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.access$000(r0)
            if (r0 == 0) goto L16
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r1.timeline
            java.lang.Object r0 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.access$000(r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            java.lang.Object r2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
        L16:
            return r2
    }

    private java.lang.Object getInternalPeriodUid(java.lang.Object r2) {
            r1 = this;
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r1.timeline
            java.lang.Object r0 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.access$000(r0)
            if (r0 == 0) goto L16
            java.lang.Object r0 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r2 = r1.timeline
            java.lang.Object r2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.access$000(r2)
        L16:
            return r2
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private void setPreparePositionOverrideToUnpreparedMaskingPeriod(long r7) {
            r6 = this;
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = r6.unpreparedMaskingMediaPeriod
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r1 = r6.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r0.id
            java.lang.Object r2 = r2.periodUid
            int r1 = r1.getIndexOfPeriod(r2)
            r2 = -1
            if (r1 != r2) goto L10
            return
        L10:
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r2 = r6.timeline
            com.google.android.exoplayer2.Timeline$Period r3 = r6.period
            com.google.android.exoplayer2.Timeline$Period r1 = r2.getPeriod(r1, r3)
            long r1 = r1.durationUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L30
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L30
            r7 = 0
            r3 = 1
            long r1 = r1 - r3
            long r7 = java.lang.Math.max(r7, r1)
        L30:
            r0.overridePreparePositionUs(r7)
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MaskingMediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.upstream.Allocator r3, long r4) {
            r1 = this;
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = new com.google.android.exoplayer2.source.MaskingMediaPeriod
            r0.<init>(r2, r3, r4)
            com.google.android.exoplayer2.source.MediaSource r3 = r1.mediaSource
            r0.setMediaSource(r3)
            boolean r3 = r1.isPrepared
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r2.periodUid
            java.lang.Object r3 = r1.getInternalPeriodUid(r3)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.copyWithPeriodUid(r3)
            r0.createPeriod(r2)
            goto L28
        L1c:
            r1.unpreparedMaskingMediaPeriod = r0
            boolean r2 = r1.hasStartedPreparing
            if (r2 != 0) goto L28
            r2 = 1
            r1.hasStartedPreparing = r2
            r1.prepareChildSource()
        L28:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, com.google.android.exoplayer2.upstream.Allocator r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.source.MaskingMediaPeriod r1 = r0.createPeriod(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
            r1 = this;
            java.lang.Object r0 = r2.periodUid
            java.lang.Object r0 = r1.getExternalPeriodUid(r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.copyWithPeriodUid(r0)
            return r2
    }

    public com.google.android.exoplayer2.Timeline getTimeline() {
            r1 = this;
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r1.timeline
            return r0
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public final void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline r15) {
            r14 = this;
            boolean r0 = r14.isPrepared
            if (r0 == 0) goto L19
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = r0.cloneWithUpdatedTimeline(r15)
            r14.timeline = r15
            com.google.android.exoplayer2.source.MaskingMediaPeriod r15 = r14.unpreparedMaskingMediaPeriod
            if (r15 == 0) goto Lae
            long r0 = r15.getPreparePositionOverrideUs()
            r14.setPreparePositionOverrideToUnpreparedMaskingPeriod(r0)
            goto Lae
        L19:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L36
            boolean r0 = r14.hasRealTimeline
            if (r0 == 0) goto L2a
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = r0.cloneWithUpdatedTimeline(r15)
            goto L32
        L2a:
            java.lang.Object r0 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
            java.lang.Object r1 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(r15, r0, r1)
        L32:
            r14.timeline = r15
            goto Lae
        L36:
            com.google.android.exoplayer2.Timeline$Window r0 = r14.window
            r1 = 0
            r15.getWindow(r1, r0)
            com.google.android.exoplayer2.Timeline$Window r0 = r14.window
            long r2 = r0.getDefaultPositionUs()
            com.google.android.exoplayer2.Timeline$Window r0 = r14.window
            java.lang.Object r0 = r0.uid
            com.google.android.exoplayer2.source.MaskingMediaPeriod r4 = r14.unpreparedMaskingMediaPeriod
            if (r4 == 0) goto L74
            long r4 = r4.getPreparePositionUs()
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r6 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaPeriod r7 = r14.unpreparedMaskingMediaPeriod
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r7.id
            java.lang.Object r7 = r7.periodUid
            com.google.android.exoplayer2.Timeline$Period r8 = r14.period
            r6.getPeriodByUid(r7, r8)
            com.google.android.exoplayer2.Timeline$Period r6 = r14.period
            long r6 = r6.getPositionInWindowUs()
            long r6 = r6 + r4
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r4 = r14.timeline
            com.google.android.exoplayer2.Timeline$Window r5 = r14.window
            com.google.android.exoplayer2.Timeline$Window r1 = r4.getWindow(r1, r5)
            long r4 = r1.getDefaultPositionUs()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            com.google.android.exoplayer2.Timeline$Window r9 = r14.window
            com.google.android.exoplayer2.Timeline$Period r10 = r14.period
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.getPeriodPositionUs(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.hasRealTimeline
            if (r1 == 0) goto L94
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = r0.cloneWithUpdatedTimeline(r15)
            goto L98
        L94:
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(r15, r0, r2)
        L98:
            r14.timeline = r15
            com.google.android.exoplayer2.source.MaskingMediaPeriod r15 = r14.unpreparedMaskingMediaPeriod
            if (r15 == 0) goto Lae
            r14.setPreparePositionOverrideToUnpreparedMaskingPeriod(r3)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r15 = r15.id
            java.lang.Object r0 = r15.periodUid
            java.lang.Object r0 = r14.getInternalPeriodUid(r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r15 = r15.copyWithPeriodUid(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.hasRealTimeline = r0
            r14.isPrepared = r0
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r14.timeline
            r14.refreshSourceInfo(r0)
            if (r15 == 0) goto Lc6
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = r14.unpreparedMaskingMediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r0
            r0.createPeriod(r15)
        Lc6:
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public void prepareSourceInternal() {
            r1 = this;
            boolean r0 = r1.useLazyPreparation
            if (r0 != 0) goto La
            r0 = 1
            r1.hasStartedPreparing = r0
            r1.prepareChildSource()
        La:
            return
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r2) {
            r1 = this;
            r0 = r2
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r0
            r0.releasePeriod()
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = r1.unpreparedMaskingMediaPeriod
            if (r2 != r0) goto Ld
            r2 = 0
            r1.unpreparedMaskingMediaPeriod = r2
        Ld:
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
            r1 = this;
            r0 = 0
            r1.isPrepared = r0
            r1.hasStartedPreparing = r0
            super.releaseSourceInternal()
            return
    }
}
