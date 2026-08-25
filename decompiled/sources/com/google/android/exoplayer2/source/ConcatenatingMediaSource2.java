package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcatenatingMediaSource2 extends com.google.android.exoplayer2.source.CompositeMediaSource<java.lang.Integer> {
    private static final int MSG_UPDATE_TIMELINE = 0;
    private final com.google.android.exoplayer2.MediaItem mediaItem;
    private final java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder> mediaSourceByMediaPeriod;
    private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder> mediaSourceHolders;

    @androidx.annotation.Nullable
    private android.os.Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ConcatenatingMediaSource2$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private int index;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.MediaItem mediaItem;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.source.MediaSource.Factory mediaSourceFactory;
        private final com.google.common.collect.ImmutableList.Builder<com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder> mediaSourceHoldersBuilder;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
                r1.mediaSourceHoldersBuilder = r0
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2.Builder add(com.google.android.exoplayer2.MediaItem r3) {
                r2 = this;
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                com.google.android.exoplayer2.source.ConcatenatingMediaSource2$Builder r3 = r2.add(r3, r0)
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2.Builder add(com.google.android.exoplayer2.MediaItem r3, long r4) {
                r2 = this;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = r2.mediaSourceFactory
                java.lang.String r1 = "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first."
                com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0, r1)
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = r2.mediaSourceFactory
                com.google.android.exoplayer2.source.MediaSource r3 = r0.createMediaSource(r3)
                com.google.android.exoplayer2.source.ConcatenatingMediaSource2$Builder r3 = r2.add(r3, r4)
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2.Builder add(com.google.android.exoplayer2.source.MediaSource r3) {
                r2 = this;
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                com.google.android.exoplayer2.source.ConcatenatingMediaSource2$Builder r3 = r2.add(r3, r0)
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2.Builder add(com.google.android.exoplayer2.source.MediaSource r5, long r6) {
                r4 = this;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                boolean r0 = r5 instanceof com.google.android.exoplayer2.source.ProgressiveMediaSource
                if (r0 == 0) goto L13
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                java.lang.String r1 = "Progressive media source must define an initial placeholder duration."
                com.google.android.exoplayer2.util.Assertions.checkState(r0, r1)
                com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r0 = r4.mediaSourceHoldersBuilder
                com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder
                int r2 = r4.index
                int r3 = r2 + 1
                r4.index = r3
                long r6 = com.google.android.exoplayer2.util.Util.msToUs(r6)
                r1.<init>(r5, r2, r6)
                r0.add(r1)
                return r4
        }

        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2 build() {
                r4 = this;
                int r0 = r4.index
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "Must add at least one source to the concatenation."
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
                com.google.android.exoplayer2.MediaItem r0 = r4.mediaItem
                if (r0 != 0) goto L18
                android.net.Uri r0 = android.net.Uri.EMPTY
                com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.MediaItem.fromUri(r0)
                r4.mediaItem = r0
            L18:
                com.google.android.exoplayer2.source.ConcatenatingMediaSource2 r0 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource2
                com.google.android.exoplayer2.MediaItem r1 = r4.mediaItem
                com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r2 = r4.mediaSourceHoldersBuilder
                com.google.common.collect.ImmutableList r2 = r2.build()
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2.Builder setMediaItem(com.google.android.exoplayer2.MediaItem r1) {
                r0 = this;
                r0.mediaItem = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2.Builder setMediaSourceFactory(com.google.android.exoplayer2.source.MediaSource.Factory r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.source.MediaSource$Factory r1 = (com.google.android.exoplayer2.source.MediaSource.Factory) r1
                r0.mediaSourceFactory = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.ConcatenatingMediaSource2.Builder useDefaultMediaSourceFactory(android.content.Context r2) {
                r1 = this;
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory r0 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
                r0.<init>(r2)
                com.google.android.exoplayer2.source.ConcatenatingMediaSource2$Builder r2 = r1.setMediaSourceFactory(r0)
                return r2
        }
    }

    public static final class ConcatenatedTimeline extends com.google.android.exoplayer2.Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final com.google.common.collect.ImmutableList<java.lang.Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;

        @androidx.annotation.Nullable
        private final java.lang.Object manifest;
        private final com.google.android.exoplayer2.MediaItem mediaItem;
        private final com.google.common.collect.ImmutableList<java.lang.Long> periodOffsetsInWindowUs;
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline> timelines;

        public ConcatenatedTimeline(com.google.android.exoplayer2.MediaItem r1, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline> r2, com.google.common.collect.ImmutableList<java.lang.Integer> r3, com.google.common.collect.ImmutableList<java.lang.Long> r4, boolean r5, boolean r6, long r7, long r9, @androidx.annotation.Nullable java.lang.Object r11) {
                r0 = this;
                r0.<init>()
                r0.mediaItem = r1
                r0.timelines = r2
                r0.firstPeriodIndices = r3
                r0.periodOffsetsInWindowUs = r4
                r0.isSeekable = r5
                r0.isDynamic = r6
                r0.durationUs = r7
                r0.defaultPositionUs = r9
                r0.manifest = r11
                return
        }

        private int getChildIndexByPeriodIndex(int r3) {
                r2 = this;
                com.google.common.collect.ImmutableList<java.lang.Integer> r0 = r2.firstPeriodIndices
                int r3 = r3 + 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1 = 0
                int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
                return r3
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getIndexOfPeriod(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof android.util.Pair
                r1 = -1
                if (r0 == 0) goto L34
                r0 = r4
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.first
                boolean r0 = r0 instanceof java.lang.Integer
                if (r0 != 0) goto Lf
                goto L34
            Lf:
                int r0 = com.google.android.exoplayer2.source.ConcatenatingMediaSource2.access$100(r4)
                java.lang.Object r4 = com.google.android.exoplayer2.source.ConcatenatingMediaSource2.access$200(r4)
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline> r2 = r3.timelines
                java.lang.Object r2 = r2.get(r0)
                com.google.android.exoplayer2.Timeline r2 = (com.google.android.exoplayer2.Timeline) r2
                int r4 = r2.getIndexOfPeriod(r4)
                if (r4 != r1) goto L26
                goto L34
            L26:
                com.google.common.collect.ImmutableList<java.lang.Integer> r1 = r3.firstPeriodIndices
                java.lang.Object r0 = r1.get(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                int r1 = r0 + r4
            L34:
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final com.google.android.exoplayer2.Timeline.Period getPeriod(int r4, com.google.android.exoplayer2.Timeline.Period r5, boolean r6) {
                r3 = this;
                int r0 = r3.getChildIndexByPeriodIndex(r4)
                com.google.common.collect.ImmutableList<java.lang.Integer> r1 = r3.firstPeriodIndices
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline> r2 = r3.timelines
                java.lang.Object r2 = r2.get(r0)
                com.google.android.exoplayer2.Timeline r2 = (com.google.android.exoplayer2.Timeline) r2
                int r1 = r4 - r1
                r2.getPeriod(r1, r5, r6)
                r1 = 0
                r5.windowIndex = r1
                com.google.common.collect.ImmutableList<java.lang.Long> r1 = r3.periodOffsetsInWindowUs
                java.lang.Object r4 = r1.get(r4)
                java.lang.Long r4 = (java.lang.Long) r4
                long r1 = r4.longValue()
                r5.positionInWindowUs = r1
                if (r6 == 0) goto L3c
                java.lang.Object r4 = r5.uid
                java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
                java.lang.Object r4 = com.google.android.exoplayer2.source.ConcatenatingMediaSource2.access$300(r0, r4)
                r5.uid = r4
            L3c:
                return r5
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final com.google.android.exoplayer2.Timeline.Period getPeriodByUid(java.lang.Object r5, com.google.android.exoplayer2.Timeline.Period r6) {
                r4 = this;
                int r0 = com.google.android.exoplayer2.source.ConcatenatingMediaSource2.access$100(r5)
                java.lang.Object r1 = com.google.android.exoplayer2.source.ConcatenatingMediaSource2.access$200(r5)
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline> r2 = r4.timelines
                java.lang.Object r2 = r2.get(r0)
                com.google.android.exoplayer2.Timeline r2 = (com.google.android.exoplayer2.Timeline) r2
                com.google.common.collect.ImmutableList<java.lang.Integer> r3 = r4.firstPeriodIndices
                java.lang.Object r0 = r3.get(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                int r3 = r2.getIndexOfPeriod(r1)
                int r3 = r3 + r0
                r2.getPeriodByUid(r1, r6)
                r0 = 0
                r6.windowIndex = r0
                com.google.common.collect.ImmutableList<java.lang.Long> r0 = r4.periodOffsetsInWindowUs
                java.lang.Object r0 = r0.get(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                r6.positionInWindowUs = r0
                r6.uid = r5
                return r6
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.lang.Long> r0 = r1.periodOffsetsInWindowUs
                int r0 = r0.size()
                return r0
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final java.lang.Object getUidOfPeriod(int r4) {
                r3 = this;
                int r0 = r3.getChildIndexByPeriodIndex(r4)
                com.google.common.collect.ImmutableList<java.lang.Integer> r1 = r3.firstPeriodIndices
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline> r2 = r3.timelines
                java.lang.Object r2 = r2.get(r0)
                com.google.android.exoplayer2.Timeline r2 = (com.google.android.exoplayer2.Timeline) r2
                int r4 = r4 - r1
                java.lang.Object r4 = r2.getUidOfPeriod(r4)
                java.lang.Object r4 = com.google.android.exoplayer2.source.ConcatenatingMediaSource2.access$300(r0, r4)
                return r4
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final com.google.android.exoplayer2.Timeline.Window getWindow(int r23, com.google.android.exoplayer2.Timeline.Window r24, long r25) {
                r22 = this;
                r0 = r22
                r1 = r24
                java.lang.Object r2 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
                com.google.android.exoplayer2.MediaItem r3 = r0.mediaItem
                java.lang.Object r4 = r0.manifest
                boolean r11 = r0.isSeekable
                boolean r12 = r0.isDynamic
                long r14 = r0.defaultPositionUs
                long r5 = r0.durationUs
                r16 = r5
                int r5 = r22.getPeriodCount()
                int r19 = r5 + (-1)
                com.google.common.collect.ImmutableList<java.lang.Long> r5 = r0.periodOffsetsInWindowUs
                r6 = 0
                java.lang.Object r5 = r5.get(r6)
                java.lang.Long r5 = (java.lang.Long) r5
                long r5 = r5.longValue()
                long r5 = -r5
                r20 = r5
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r13 = 0
                r18 = 0
                com.google.android.exoplayer2.Timeline$Window r1 = r1.set(r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19, r20)
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final com.google.android.exoplayer2.source.MaskingMediaSource mediaSource;

        public MediaSourceHolder(com.google.android.exoplayer2.source.MediaSource r3, int r4, long r5) {
                r2 = this;
                r2.<init>()
                com.google.android.exoplayer2.source.MaskingMediaSource r0 = new com.google.android.exoplayer2.source.MaskingMediaSource
                r1 = 0
                r0.<init>(r3, r1)
                r2.mediaSource = r0
                r2.index = r4
                r2.initialPlaceholderDurationUs = r5
                return
        }
    }

    public static /* synthetic */ boolean $r8$lambda$5QwC6UTDyJPrb6lu5LkhFaRJXVw(com.google.android.exoplayer2.source.ConcatenatingMediaSource2 r0, android.os.Message r1) {
            boolean r0 = r0.handleMessage(r1)
            return r0
    }

    private ConcatenatingMediaSource2(com.google.android.exoplayer2.MediaItem r1, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder> r2) {
            r0 = this;
            r0.<init>()
            r0.mediaItem = r1
            r0.mediaSourceHolders = r2
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            r0.mediaSourceByMediaPeriod = r1
            return
    }

    public /* synthetic */ ConcatenatingMediaSource2(com.google.android.exoplayer2.MediaItem r1, com.google.common.collect.ImmutableList r2, com.google.android.exoplayer2.source.ConcatenatingMediaSource2.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ int access$100(java.lang.Object r0) {
            int r0 = getChildIndex(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object access$200(java.lang.Object r0) {
            java.lang.Object r0 = getChildPeriodUid(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object access$300(int r0, java.lang.Object r1) {
            java.lang.Object r0 = getPeriodUid(r0, r1)
            return r0
    }

    private void disableUnusedMediaSources() {
            r3 = this;
            r0 = 0
        L1:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r1 = r3.mediaSourceHolders
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r1 = r3.mediaSourceHolders
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder r1 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder) r1
            int r2 = r1.activeMediaPeriods
            if (r2 != 0) goto L1e
            int r1 = r1.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.disableChildSource(r1)
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            return
    }

    private static int getChildIndex(java.lang.Object r0) {
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long r2, int r4) {
            long r0 = (long) r4
            long r2 = r2 % r0
            int r3 = (int) r2
            return r3
    }

    private static java.lang.Object getChildPeriodUid(java.lang.Object r0) {
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            return r0
    }

    private static long getChildWindowSequenceNumber(long r2, int r4, int r5) {
            long r0 = (long) r4
            long r2 = r2 * r0
            long r4 = (long) r5
            long r2 = r2 + r4
            return r2
    }

    private static java.lang.Object getPeriodUid(int r0, java.lang.Object r1) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long r2, int r4) {
            long r0 = (long) r4
            long r2 = r2 / r0
            return r2
    }

    private boolean handleMessage(android.os.Message r1) {
            r0 = this;
            int r1 = r1.what
            if (r1 != 0) goto L7
            r0.updateTimeline()
        L7:
            r1 = 1
            return r1
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ConcatenatingMediaSource2.ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
            r30 = this;
            r0 = r30
            com.google.android.exoplayer2.Timeline$Window r1 = new com.google.android.exoplayer2.Timeline$Window
            r1.<init>()
            com.google.android.exoplayer2.Timeline$Period r2 = new com.google.android.exoplayer2.Timeline$Period
            r2.<init>()
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableList$Builder r4 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableList$Builder r5 = com.google.common.collect.ImmutableList.builder()
            r10 = 1
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
        L29:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r9 = r0.mediaSourceHolders
            int r9 = r9.size()
            if (r11 >= r9) goto L122
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r9 = r0.mediaSourceHolders
            java.lang.Object r9 = r9.get(r11)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder r9 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder) r9
            com.google.android.exoplayer2.source.MaskingMediaSource r7 = r9.mediaSource
            com.google.android.exoplayer2.Timeline r7 = r7.getTimeline()
            boolean r8 = r7.isEmpty()
            r8 = r8 ^ r10
            java.lang.String r10 = "Can't concatenate empty child Timeline."
            com.google.android.exoplayer2.util.Assertions.checkArgument(r8, r10)
            r3.add(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r4.add(r8)
            int r8 = r7.getPeriodCount()
            int r14 = r14 + r8
            r8 = 0
        L59:
            int r10 = r7.getWindowCount()
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r10) goto Lce
            r7.getWindow(r8, r1)
            if (r23 != 0) goto L6e
            java.lang.Object r10 = r1.manifest
            r13 = r10
            r23 = 1
        L6e:
            if (r12 == 0) goto L7c
            java.lang.Object r10 = r1.manifest
            boolean r10 = com.google.android.exoplayer2.util.Util.areEqual(r13, r10)
            if (r10 == 0) goto L7c
            r28 = r7
            r12 = 1
            goto L7f
        L7c:
            r28 = r7
            r12 = 0
        L7f:
            long r6 = r1.durationUs
            int r29 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r29 != 0) goto L8d
            long r6 = r9.initialPlaceholderDurationUs
            int r29 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r29 != 0) goto L8d
            r10 = 0
            return r10
        L8d:
            r10 = 0
            long r19 = r19 + r6
            int r6 = r9.index
            if (r6 != 0) goto La3
            if (r8 != 0) goto La3
            long r6 = r1.defaultPositionUs
            r29 = r11
            long r10 = r1.positionInFirstPeriodUs
            long r10 = -r10
            r21 = r6
            r15 = r10
            r10 = 0
            goto Lb5
        La3:
            r29 = r11
            long r6 = r1.positionInFirstPeriodUs
            r10 = 0
            int r24 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r24 != 0) goto Laf
            r6 = 1
            goto Lb0
        Laf:
            r6 = 0
        Lb0:
            java.lang.String r7 = "Can't concatenate windows. A window has a non-zero offset in a period."
            com.google.android.exoplayer2.util.Assertions.checkArgument(r6, r7)
        Lb5:
            boolean r6 = r1.isSeekable
            if (r6 != 0) goto Lc0
            boolean r6 = r1.isPlaceholder
            if (r6 == 0) goto Lbe
            goto Lc0
        Lbe:
            r6 = 0
            goto Lc1
        Lc0:
            r6 = 1
        Lc1:
            r17 = r17 & r6
            boolean r6 = r1.isDynamic
            r18 = r18 | r6
            int r8 = r8 + 1
            r7 = r28
            r11 = r29
            goto L59
        Lce:
            r28 = r7
            r29 = r11
            r10 = 0
            int r6 = r28.getPeriodCount()
            r7 = 0
        Ld9:
            if (r7 >= r6) goto L119
            java.lang.Long r8 = java.lang.Long.valueOf(r15)
            r5.add(r8)
            r8 = r28
            r8.getPeriod(r7, r2)
            long r10 = r2.durationUs
            int r28 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r28 != 0) goto L109
            r28 = r2
            r2 = 1
            if (r6 != r2) goto Lf4
            r10 = 1
            goto Lf5
        Lf4:
            r10 = 0
        Lf5:
            java.lang.String r11 = "Can't concatenate multiple periods with unknown duration in one window."
            com.google.android.exoplayer2.util.Assertions.checkArgument(r10, r11)
            long r10 = r1.durationUs
            int r25 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r25 == 0) goto L101
            goto L103
        L101:
            long r10 = r9.initialPlaceholderDurationUs
        L103:
            r25 = r3
            long r2 = r1.positionInFirstPeriodUs
            long r10 = r10 + r2
            goto L10d
        L109:
            r28 = r2
            r25 = r3
        L10d:
            long r15 = r15 + r10
            int r7 = r7 + 1
            r3 = r25
            r2 = r28
            r10 = 0
            r28 = r8
            goto Ld9
        L119:
            r28 = r2
            r25 = r3
            int r11 = r29 + 1
            r10 = 1
            goto L29
        L122:
            r25 = r3
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$ConcatenatedTimeline r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource2$ConcatenatedTimeline
            com.google.android.exoplayer2.MediaItem r2 = r0.mediaItem
            com.google.common.collect.ImmutableList r14 = r25.build()
            com.google.common.collect.ImmutableList r15 = r4.build()
            com.google.common.collect.ImmutableList r16 = r5.build()
            if (r12 == 0) goto L139
            r23 = r13
            goto L13b
        L139:
            r23 = 0
        L13b:
            r12 = r1
            r13 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r23)
            return r1
    }

    private void scheduleTimelineUpdate() {
            r2 = this;
            boolean r0 = r2.timelineUpdateScheduled
            if (r0 != 0) goto L17
            android.os.Handler r0 = r2.playbackThreadHandler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            r1 = 0
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            r0 = 1
            r2.timelineUpdateScheduled = r0
        L17:
            return
    }

    private void updateTimeline() {
            r1 = this;
            r0 = 0
            r1.timelineUpdateScheduled = r0
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$ConcatenatedTimeline r0 = r1.maybeCreateConcatenatedTimeline()
            if (r0 == 0) goto Lc
            r1.refreshSourceInfo(r0)
        Lc:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r6, com.google.android.exoplayer2.upstream.Allocator r7, long r8) {
            r5 = this;
            java.lang.Object r0 = r6.periodUid
            int r0 = getChildIndex(r0)
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r1 = r5.mediaSourceHolders
            java.lang.Object r0 = r1.get(r0)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder) r0
            java.lang.Object r1 = r6.periodUid
            java.lang.Object r1 = getChildPeriodUid(r1)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r6.copyWithPeriodUid(r1)
            long r2 = r6.windowSequenceNumber
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r6 = r5.mediaSourceHolders
            int r6 = r6.size()
            int r4 = r0.index
            long r2 = getChildWindowSequenceNumber(r2, r6, r4)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r1.copyWithWindowSequenceNumber(r2)
            int r1 = r0.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.enableChildSource(r1)
            int r1 = r0.activeMediaPeriods
            int r1 = r1 + 1
            r0.activeMediaPeriods = r1
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.source.MaskingMediaPeriod r6 = r1.createPeriod(r6, r7, r8)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r7 = r5.mediaSourceByMediaPeriod
            r7.put(r6, r0)
            r5.disableUnusedMediaSources()
            return r6
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void enableInternal() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.Timeline getInitialTimeline() {
            r1 = this;
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$ConcatenatedTimeline r0 = r1.maybeCreateConcatenatedTimeline()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.MediaItem r0 = r1.mediaItem
            return r0
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(java.lang.Integer r4, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5) {
            r3 = this;
            java.lang.Integer r4 = (java.lang.Integer) r4
            long r0 = r5.windowSequenceNumber
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r2 = r3.mediaSourceHolders
            int r2 = r2.size()
            int r0 = getChildIndexFromChildWindowSequenceNumber(r0, r2)
            int r1 = r4.intValue()
            if (r1 == r0) goto L16
            r4 = 0
            goto L34
        L16:
            long r0 = r5.windowSequenceNumber
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r2 = r3.mediaSourceHolders
            int r2 = r2.size()
            long r0 = getWindowSequenceNumberFromChildWindowSequenceNumber(r0, r2)
            int r4 = r4.intValue()
            java.lang.Object r2 = r5.periodUid
            java.lang.Object r4 = getPeriodUid(r4, r2)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r5.copyWithPeriodUid(r4)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r4.copyWithWindowSequenceNumber(r0)
        L34:
            return r4
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final /* bridge */ /* synthetic */ int getWindowIndexForChildWindowIndex(java.lang.Integer r1, int r2) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1 = 0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(java.lang.Integer r1, com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.Timeline r3) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0.scheduleTimelineUpdate()
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r2 = this;
            super.prepareSourceInternal(r3)
            android.os.Handler r3 = new android.os.Handler
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r2, r1)
            r3.<init>(r0)
            r2.playbackThreadHandler = r3
            r3 = 0
        L11:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r0 = r2.mediaSourceHolders
            int r0 = r0.size()
            if (r3 >= r0) goto L2d
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r0 = r2.mediaSourceHolders
            java.lang.Object r0 = r0.get(r3)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.exoplayer2.source.MaskingMediaSource r0 = r0.mediaSource
            r2.prepareChildSource(r1, r0)
            int r3 = r3 + 1
            goto L11
        L2d:
            r2.scheduleTimelineUpdate()
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r3) {
            r2 = this;
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r0 = r2.mediaSourceByMediaPeriod
            java.lang.Object r0 = r0.remove(r3)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource2.MediaSourceHolder) r0
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            r1.releasePeriod(r3)
            int r3 = r0.activeMediaPeriods
            int r3 = r3 + (-1)
            r0.activeMediaPeriods = r3
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource2$MediaSourceHolder> r3 = r2.mediaSourceByMediaPeriod
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L24
            r2.disableUnusedMediaSources()
        L24:
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r2 = this;
            super.releaseSourceInternal()
            android.os.Handler r0 = r2.playbackThreadHandler
            if (r0 == 0) goto Ld
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.playbackThreadHandler = r1
        Ld:
            r0 = 0
            r2.timelineUpdateScheduled = r0
            return
    }
}
