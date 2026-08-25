package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcatenatingMediaSource extends com.google.android.exoplayer2.source.CompositeMediaSource<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> {
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private static final com.google.android.exoplayer2.MediaItem PLACEHOLDER_MEDIA_ITEM = null;
    private final java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceByMediaPeriod;
    private final java.util.Map<java.lang.Object, com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceByUid;
    private final java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceHolders;

    @androidx.annotation.GuardedBy("this")
    private final java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourcesPublic;
    private java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;

    @androidx.annotation.GuardedBy("this")
    private final java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> pendingOnCompletionActions;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private android.os.Handler playbackThreadHandler;
    private com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ConcatenatingMediaSource$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ConcatenatedTimeline extends com.google.android.exoplayer2.AbstractConcatenatedTimeline {
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final com.google.android.exoplayer2.Timeline[] timelines;
        private final java.lang.Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(java.util.Collection<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> r5, com.google.android.exoplayer2.source.ShuffleOrder r6, boolean r7) {
                r4 = this;
                r4.<init>(r7, r6)
                int r6 = r5.size()
                int[] r7 = new int[r6]
                r4.firstPeriodInChildIndices = r7
                int[] r7 = new int[r6]
                r4.firstWindowInChildIndices = r7
                com.google.android.exoplayer2.Timeline[] r7 = new com.google.android.exoplayer2.Timeline[r6]
                r4.timelines = r7
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r4.uids = r6
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                r4.childIndexByUid = r6
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
                r7 = 0
                r0 = 0
            L25:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L6a
                java.lang.Object r1 = r5.next()
                com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r1 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r1
                com.google.android.exoplayer2.Timeline[] r2 = r4.timelines
                com.google.android.exoplayer2.source.MaskingMediaSource r3 = r1.mediaSource
                com.google.android.exoplayer2.Timeline r3 = r3.getTimeline()
                r2[r0] = r3
                int[] r2 = r4.firstWindowInChildIndices
                r2[r0] = r6
                int[] r2 = r4.firstPeriodInChildIndices
                r2[r0] = r7
                com.google.android.exoplayer2.Timeline[] r2 = r4.timelines
                r2 = r2[r0]
                int r2 = r2.getWindowCount()
                int r6 = r6 + r2
                com.google.android.exoplayer2.Timeline[] r2 = r4.timelines
                r2 = r2[r0]
                int r2 = r2.getPeriodCount()
                int r7 = r7 + r2
                java.lang.Object[] r2 = r4.uids
                java.lang.Object r1 = r1.uid
                r2[r0] = r1
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r4.childIndexByUid
                r2 = r2[r0]
                int r3 = r0 + 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.put(r2, r0)
                r0 = r3
                goto L25
            L6a:
                r4.windowCount = r6
                r4.periodCount = r7
                return
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByChildUid(java.lang.Object r2) {
                r1 = this;
                java.util.HashMap<java.lang.Object, java.lang.Integer> r0 = r1.childIndexByUid
                java.lang.Object r2 = r0.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto Lc
                r2 = -1
                goto L10
            Lc:
                int r2 = r2.intValue()
            L10:
                return r2
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByPeriodIndex(int r3) {
                r2 = this;
                int[] r0 = r2.firstPeriodInChildIndices
                int r3 = r3 + 1
                r1 = 0
                int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
                return r3
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getChildIndexByWindowIndex(int r3) {
                r2 = this;
                int[] r0 = r2.firstWindowInChildIndices
                int r3 = r3 + 1
                r1 = 0
                int r3 = com.google.android.exoplayer2.util.Util.binarySearchFloor(r0, r3, r1, r1)
                return r3
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final java.lang.Object getChildUidByChildIndex(int r2) {
                r1 = this;
                java.lang.Object[] r0 = r1.uids
                r2 = r0[r2]
                return r2
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstPeriodIndexByChildIndex(int r2) {
                r1 = this;
                int[] r0 = r1.firstPeriodInChildIndices
                r2 = r0[r2]
                return r2
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final int getFirstWindowIndexByChildIndex(int r2) {
                r1 = this;
                int[] r0 = r1.firstWindowInChildIndices
                r2 = r0[r2]
                return r2
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
                r1 = this;
                int r0 = r1.periodCount
                return r0
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public final com.google.android.exoplayer2.Timeline getTimelineByChildIndex(int r2) {
                r1 = this;
                com.google.android.exoplayer2.Timeline[] r0 = r1.timelines
                r2 = r0[r2]
                return r2
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
                r1 = this;
                int r0 = r1.windowCount
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class FakeMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource {
        private FakeMediaSource() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ FakeMediaSource(com.google.android.exoplayer2.source.ConcatenatingMediaSource.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, com.google.android.exoplayer2.upstream.Allocator r2, long r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public com.google.android.exoplayer2.MediaItem getMediaItem() {
                r1 = this;
                com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.ConcatenatingMediaSource.access$100()
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public final void releaseSourceInternal() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class HandlerAndRunnable {
        private final android.os.Handler handler;
        private final java.lang.Runnable runnable;

        public HandlerAndRunnable(android.os.Handler r1, java.lang.Runnable r2) {
                r0 = this;
                r0.<init>()
                r0.handler = r1
                r0.runnable = r2
                return
        }

        public void dispatch() {
                r2 = this;
                android.os.Handler r0 = r2.handler
                java.lang.Runnable r1 = r2.runnable
                r0.post(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MediaSourceHolder {
        public final java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> activeMediaPeriodIds;
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final com.google.android.exoplayer2.source.MaskingMediaSource mediaSource;
        public final java.lang.Object uid;

        public MediaSourceHolder(com.google.android.exoplayer2.source.MediaSource r2, boolean r3) {
                r1 = this;
                r1.<init>()
                com.google.android.exoplayer2.source.MaskingMediaSource r0 = new com.google.android.exoplayer2.source.MaskingMediaSource
                r0.<init>(r2, r3)
                r1.mediaSource = r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.activeMediaPeriodIds = r2
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1.uid = r2
                return
        }

        public void reset(int r1, int r2) {
                r0 = this;
                r0.childIndex = r1
                r0.firstWindowIndexInChild = r2
                r1 = 0
                r0.isRemoved = r1
                java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r0.activeMediaPeriodIds
                r1.clear()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class MessageData<T> {
        public final T customData;
        public final int index;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable onCompletionAction;

        public MessageData(int r1, T r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable r3) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                r0.customData = r2
                r0.onCompletionAction = r3
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$JacrSZ3qF-BT98_Hb7oUkRJgk1w, reason: not valid java name */
    public static /* synthetic */ boolean m236$r8$lambda$JacrSZ3qFBT98_Hb7oUkRJgk1w(com.google.android.exoplayer2.source.ConcatenatingMediaSource r0, android.os.Message r1) {
            boolean r0 = r0.handleMessage(r1)
            return r0
    }

    static {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            android.net.Uri r1 = android.net.Uri.EMPTY
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setUri(r1)
            com.google.android.exoplayer2.MediaItem r0 = r0.build()
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM = r0
            return
    }

    public ConcatenatingMediaSource(boolean r2, com.google.android.exoplayer2.source.ShuffleOrder r3, com.google.android.exoplayer2.source.MediaSource... r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public ConcatenatingMediaSource(boolean r4, boolean r5, com.google.android.exoplayer2.source.ShuffleOrder r6, com.google.android.exoplayer2.source.MediaSource... r7) {
            r3 = this;
            r3.<init>()
            int r0 = r7.length
            r1 = 0
        L5:
            if (r1 >= r0) goto Lf
            r2 = r7[r1]
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            int r1 = r1 + 1
            goto L5
        Lf:
            int r0 = r6.getLength()
            if (r0 <= 0) goto L19
            com.google.android.exoplayer2.source.ShuffleOrder r6 = r6.cloneAndClear()
        L19:
            r3.shuffleOrder = r6
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            r3.mediaSourceByMediaPeriod = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r3.mediaSourceByUid = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.mediaSourcesPublic = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.mediaSourceHolders = r6
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r3.nextTimelineUpdateOnCompletionActions = r6
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r3.pendingOnCompletionActions = r6
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r3.enabledMediaSourceHolders = r6
            r3.isAtomic = r4
            r3.useLazyPreparation = r5
            java.util.List r4 = java.util.Arrays.asList(r7)
            r3.addMediaSources(r4)
            return
    }

    public ConcatenatingMediaSource(boolean r3, com.google.android.exoplayer2.source.MediaSource... r4) {
            r2 = this;
            com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder r0 = new com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder
            r1 = 0
            r0.<init>(r1)
            r2.<init>(r3, r0, r4)
            return
    }

    public ConcatenatingMediaSource(com.google.android.exoplayer2.source.MediaSource... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaItem access$100() {
            com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM
            return r0
    }

    private void addMediaSourceInternal(int r3, com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r4) {
            r2 = this;
            if (r3 <= 0) goto L1d
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceHolders
            int r1 = r3 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.Timeline r1 = r1.getTimeline()
            int r0 = r0.firstWindowIndexInChild
            int r1 = r1.getWindowCount()
            int r1 = r1 + r0
            r4.reset(r3, r1)
            goto L21
        L1d:
            r0 = 0
            r4.reset(r3, r0)
        L21:
            com.google.android.exoplayer2.source.MaskingMediaSource r0 = r4.mediaSource
            com.google.android.exoplayer2.Timeline r0 = r0.getTimeline()
            int r0 = r0.getWindowCount()
            r1 = 1
            r2.correctOffsets(r3, r1, r0)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceHolders
            r0.add(r3, r4)
            java.util.Map<java.lang.Object, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r2.mediaSourceByUid
            java.lang.Object r0 = r4.uid
            r3.put(r0, r4)
            com.google.android.exoplayer2.source.MaskingMediaSource r3 = r4.mediaSource
            r2.prepareChildSource(r4, r3)
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L54
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r2.mediaSourceByMediaPeriod
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L54
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r2.enabledMediaSourceHolders
            r3.add(r4)
            goto L57
        L54:
            r2.disableChildSource(r4)
        L57:
            return
    }

    private void addMediaSourcesInternal(int r3, java.util.Collection<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> r4) {
            r2 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r4.next()
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            int r1 = r3 + 1
            r2.addMediaSourceInternal(r3, r0)
            r3 = r1
            goto L4
        L17:
            return
    }

    @androidx.annotation.GuardedBy("this")
    private void addPublicMediaSources(int r8, java.util.Collection<com.google.android.exoplayer2.source.MediaSource> r9, @androidx.annotation.Nullable android.os.Handler r10, @androidx.annotation.Nullable java.lang.Runnable r11) {
            r7 = this;
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r11 != 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r2 != r3) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            android.os.Handler r0 = r7.playbackThreadHandler
            java.util.Iterator r2 = r9.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            com.google.android.exoplayer2.source.MediaSource r3 = (com.google.android.exoplayer2.source.MediaSource) r3
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            goto L19
        L29:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r9.iterator()
        L36:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r3.next()
            com.google.android.exoplayer2.source.MediaSource r4 = (com.google.android.exoplayer2.source.MediaSource) r4
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r5 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder
            boolean r6 = r7.useLazyPreparation
            r5.<init>(r4, r6)
            r2.add(r5)
            goto L36
        L4d:
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r7.mediaSourcesPublic
            r3.addAll(r8, r2)
            if (r0 == 0) goto L6b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L6b
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r9 = r7.createOnCompletionAction(r10, r11)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r10 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData
            r10.<init>(r8, r2, r9)
            android.os.Message r8 = r0.obtainMessage(r1, r10)
            r8.sendToTarget()
            goto L72
        L6b:
            if (r11 == 0) goto L72
            if (r10 == 0) goto L72
            r10.post(r11)
        L72:
            return
    }

    private void correctOffsets(int r3, int r4, int r5) {
            r2 = this;
        L0:
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceHolders
            int r0 = r0.size()
            if (r3 >= r0) goto L1d
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceHolders
            java.lang.Object r0 = r0.get(r3)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            int r1 = r0.childIndex
            int r1 = r1 + r4
            r0.childIndex = r1
            int r1 = r0.firstWindowIndexInChild
            int r1 = r1 + r5
            r0.firstWindowIndexInChild = r1
            int r3 = r3 + 1
            goto L0
        L1d:
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable createOnCompletionAction(@androidx.annotation.Nullable android.os.Handler r2, @androidx.annotation.Nullable java.lang.Runnable r3) {
            r1 = this;
            if (r2 == 0) goto L10
            if (r3 != 0) goto L5
            goto L10
        L5:
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r0 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable
            r0.<init>(r2, r3)
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable> r2 = r1.pendingOnCompletionActions
            r2.add(r0)
            return r0
        L10:
            r2 = 0
            return r2
    }

    private void disableUnusedMediaSources() {
            r3 = this;
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r3.enabledMediaSourceHolders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r1 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r1
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r2 = r1.activeMediaPeriodIds
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            r3.disableChildSource(r1)
            r0.remove()
            goto L6
        L21:
            return
    }

    private synchronized void dispatchOnCompletionActions(java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L1c
        L5:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L15
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1c
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r1 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable) r1     // Catch: java.lang.Throwable -> L1c
            r1.dispatch()     // Catch: java.lang.Throwable -> L1c
            goto L5
        L15:
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable> r0 = r2.pendingOnCompletionActions     // Catch: java.lang.Throwable -> L1c
            r0.removeAll(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return
        L1c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private void enableMediaSource(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r2) {
            r1 = this;
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.enabledMediaSourceHolders
            r0.add(r2)
            r1.enableChildSource(r2)
            return
    }

    private static java.lang.Object getChildPeriodUid(java.lang.Object r0) {
            java.lang.Object r0 = com.google.android.exoplayer2.AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(r0)
            return r0
    }

    private static java.lang.Object getMediaSourceHolderUid(java.lang.Object r0) {
            java.lang.Object r0 = com.google.android.exoplayer2.AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(r0)
            return r0
    }

    private static java.lang.Object getPeriodUid(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r0, java.lang.Object r1) {
            java.lang.Object r0 = r0.uid
            java.lang.Object r0 = com.google.android.exoplayer2.AbstractConcatenatedTimeline.getConcatenatedUid(r0, r1)
            return r0
    }

    private android.os.Handler getPlaybackThreadHandlerOnPlaybackThread() {
            r1 = this;
            android.os.Handler r0 = r1.playbackThreadHandler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
    }

    private boolean handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            r1 = 1
            if (r0 == 0) goto Lb1
            if (r0 == r1) goto L75
            r2 = 2
            if (r0 == r2) goto L40
            r2 = 3
            if (r0 == r2) goto L2b
            r2 = 4
            if (r0 == r2) goto L26
            r2 = 5
            if (r0 != r2) goto L20
            java.lang.Object r5 = r5.obj
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)
            java.util.Set r5 = (java.util.Set) r5
            r4.dispatchOnCompletionActions(r5)
            goto Ld9
        L20:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L26:
            r4.updateTimelineAndScheduleOnCompletionActions()
            goto Ld9
        L2b:
            java.lang.Object r5 = r5.obj
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r5 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) r5
            T r0 = r5.customData
            com.google.android.exoplayer2.source.ShuffleOrder r0 = (com.google.android.exoplayer2.source.ShuffleOrder) r0
            r4.shuffleOrder = r0
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
            goto Ld9
        L40:
            java.lang.Object r5 = r5.obj
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r5 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) r5
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r4.shuffleOrder
            int r2 = r5.index
            int r3 = r2 + 1
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r0.cloneAndRemove(r2, r3)
            r4.shuffleOrder = r0
            T r2 = r5.customData
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r0.cloneAndInsert(r2, r1)
            r4.shuffleOrder = r0
            int r0 = r5.index
            T r2 = r5.customData
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.moveMediaSourceInternal(r0, r2)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
            goto Ld9
        L75:
            java.lang.Object r5 = r5.obj
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r5 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) r5
            int r0 = r5.index
            T r2 = r5.customData
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r0 != 0) goto L9a
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r4.shuffleOrder
            int r3 = r3.getLength()
            if (r2 != r3) goto L9a
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r4.shuffleOrder
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r3.cloneAndClear()
            r4.shuffleOrder = r3
            goto La2
        L9a:
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r4.shuffleOrder
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r3.cloneAndRemove(r0, r2)
            r4.shuffleOrder = r3
        La2:
            int r2 = r2 - r1
        La3:
            if (r2 < r0) goto Lab
            r4.removeMediaSourceInternal(r2)
            int r2 = r2 + (-1)
            goto La3
        Lab:
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
            goto Ld9
        Lb1:
            java.lang.Object r5 = r5.obj
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r5)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r5 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) r5
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r4.shuffleOrder
            int r2 = r5.index
            T r3 = r5.customData
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r0.cloneAndInsert(r2, r3)
            r4.shuffleOrder = r0
            int r0 = r5.index
            T r2 = r5.customData
            java.util.Collection r2 = (java.util.Collection) r2
            r4.addMediaSourcesInternal(r0, r2)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r5 = r5.onCompletionAction
            r4.scheduleTimelineUpdate(r5)
        Ld9:
            return r1
    }

    private void maybeReleaseChildSource(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r2) {
            r1 = this;
            boolean r0 = r2.isRemoved
            if (r0 == 0) goto L14
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r2.activeMediaPeriodIds
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.enabledMediaSourceHolders
            r0.remove(r2)
            r1.releaseChildSource(r2)
        L14:
            return
    }

    private void moveMediaSourceInternal(int r5, int r6) {
            r4 = this;
            int r0 = java.lang.Math.min(r5, r6)
            int r1 = java.lang.Math.max(r5, r6)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r2 = r4.mediaSourceHolders
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r2 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r2
            int r2 = r2.firstWindowIndexInChild
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r4.mediaSourceHolders
            java.lang.Object r5 = r3.remove(r5)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r5 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r5
            r3.add(r6, r5)
        L1d:
            if (r0 > r1) goto L39
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r5 = r4.mediaSourceHolders
            java.lang.Object r5 = r5.get(r0)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r5 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r5
            r5.childIndex = r0
            r5.firstWindowIndexInChild = r2
            com.google.android.exoplayer2.source.MaskingMediaSource r5 = r5.mediaSource
            com.google.android.exoplayer2.Timeline r5 = r5.getTimeline()
            int r5 = r5.getWindowCount()
            int r2 = r2 + r5
            int r0 = r0 + 1
            goto L1d
        L39:
            return
    }

    @androidx.annotation.GuardedBy("this")
    private void movePublicMediaSource(int r5, int r6, @androidx.annotation.Nullable android.os.Handler r7, @androidx.annotation.Nullable java.lang.Runnable r8) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r8 != 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r2 != r3) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            android.os.Handler r0 = r4.playbackThreadHandler
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r1 = r4.mediaSourcesPublic
            java.lang.Object r2 = r1.remove(r5)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r2 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r2
            r1.add(r6, r2)
            if (r0 == 0) goto L38
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r7 = r4.createOnCompletionAction(r7, r8)
            r8 = 2
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.<init>(r5, r6, r7)
            android.os.Message r5 = r0.obtainMessage(r8, r1)
            r5.sendToTarget()
            goto L3f
        L38:
            if (r8 == 0) goto L3f
            if (r7 == 0) goto L3f
            r7.post(r8)
        L3f:
            return
    }

    private void removeMediaSourceInternal(int r4) {
            r3 = this;
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r3.mediaSourceHolders
            java.lang.Object r0 = r0.remove(r4)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            java.util.Map<java.lang.Object, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r1 = r3.mediaSourceByUid
            java.lang.Object r2 = r0.uid
            r1.remove(r2)
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.Timeline r1 = r1.getTimeline()
            int r1 = r1.getWindowCount()
            int r1 = -r1
            r2 = -1
            r3.correctOffsets(r4, r2, r1)
            r4 = 1
            r0.isRemoved = r4
            r3.maybeReleaseChildSource(r0)
            return
    }

    @androidx.annotation.GuardedBy("this")
    private void removePublicMediaSources(int r5, int r6, @androidx.annotation.Nullable android.os.Handler r7, @androidx.annotation.Nullable java.lang.Runnable r8) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r8 != 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r2 != r3) goto Lf
            r0 = 1
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            android.os.Handler r0 = r4.playbackThreadHandler
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r2 = r4.mediaSourcesPublic
            com.google.android.exoplayer2.util.Util.removeRange(r2, r5, r6)
            if (r0 == 0) goto L30
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r7 = r4.createOnCompletionAction(r7, r8)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r8 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.<init>(r5, r6, r7)
            android.os.Message r5 = r0.obtainMessage(r1, r8)
            r5.sendToTarget()
            goto L37
        L30:
            if (r8 == 0) goto L37
            if (r7 == 0) goto L37
            r7.post(r8)
        L37:
            return
    }

    private void scheduleTimelineUpdate() {
            r1 = this;
            r0 = 0
            r1.scheduleTimelineUpdate(r0)
            return
    }

    private void scheduleTimelineUpdate(@androidx.annotation.Nullable com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable r3) {
            r2 = this;
            boolean r0 = r2.timelineUpdateScheduled
            if (r0 != 0) goto L13
            android.os.Handler r0 = r2.getPlaybackThreadHandlerOnPlaybackThread()
            r1 = 4
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            r0 = 1
            r2.timelineUpdateScheduled = r0
        L13:
            if (r3 == 0) goto L1a
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable> r0 = r2.nextTimelineUpdateOnCompletionActions
            r0.add(r3)
        L1a:
            return
    }

    @androidx.annotation.GuardedBy("this")
    private void setPublicShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r5, @androidx.annotation.Nullable android.os.Handler r6, @androidx.annotation.Nullable java.lang.Runnable r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r7 != 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r2 != r3) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            android.os.Handler r0 = r4.playbackThreadHandler
            if (r0 == 0) goto L3b
            int r2 = r4.getSize()
            int r3 = r5.getLength()
            if (r3 == r2) goto L29
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r5.cloneAndClear()
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r5.cloneAndInsert(r1, r2)
        L29:
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable r6 = r4.createOnCompletionAction(r6, r7)
            r7 = 3
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r2 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData
            r2.<init>(r1, r5, r6)
            android.os.Message r5 = r0.obtainMessage(r7, r2)
            r5.sendToTarget()
            goto L4e
        L3b:
            int r0 = r5.getLength()
            if (r0 <= 0) goto L45
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r5.cloneAndClear()
        L45:
            r4.shuffleOrder = r5
            if (r7 == 0) goto L4e
            if (r6 == 0) goto L4e
            r6.post(r7)
        L4e:
            return
    }

    private void updateMediaSourceInternal(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r3, com.google.android.exoplayer2.Timeline r4) {
            r2 = this;
            int r0 = r3.childIndex
            int r0 = r0 + 1
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r1 = r2.mediaSourceHolders
            int r1 = r1.size()
            if (r0 >= r1) goto L2c
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceHolders
            int r1 = r3.childIndex
            int r1 = r1 + 1
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            int r4 = r4.getWindowCount()
            int r0 = r0.firstWindowIndexInChild
            int r1 = r3.firstWindowIndexInChild
            int r0 = r0 - r1
            int r4 = r4 - r0
            if (r4 == 0) goto L2c
            int r3 = r3.childIndex
            int r3 = r3 + 1
            r0 = 0
            r2.correctOffsets(r3, r0, r4)
        L2c:
            r2.scheduleTimelineUpdate()
            return
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
            r5 = this;
            r0 = 0
            r5.timelineUpdateScheduled = r0
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable> r0 = r5.nextTimelineUpdateOnCompletionActions
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r5.nextTimelineUpdateOnCompletionActions = r1
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$ConcatenatedTimeline r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$ConcatenatedTimeline
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r2 = r5.mediaSourceHolders
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r5.shuffleOrder
            boolean r4 = r5.isAtomic
            r1.<init>(r2, r3, r4)
            r5.refreshSourceInfo(r1)
            android.os.Handler r1 = r5.getPlaybackThreadHandlerOnPlaybackThread()
            r2 = 5
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
            return
    }

    public synchronized void addMediaSource(int r2, com.google.android.exoplayer2.source.MediaSource r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.addPublicMediaSources(r2, r3, r0, r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void addMediaSource(int r1, com.google.android.exoplayer2.source.MediaSource r2, android.os.Handler r3, java.lang.Runnable r4) {
            r0 = this;
            monitor-enter(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Throwable -> La
            r0.addPublicMediaSources(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized void addMediaSource(com.google.android.exoplayer2.source.MediaSource r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.mediaSourcesPublic     // Catch: java.lang.Throwable -> Lc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc
            r1.addMediaSource(r0, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void addMediaSource(com.google.android.exoplayer2.source.MediaSource r2, android.os.Handler r3, java.lang.Runnable r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.mediaSourcesPublic     // Catch: java.lang.Throwable -> Lc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc
            r1.addMediaSource(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void addMediaSources(int r2, java.util.Collection<com.google.android.exoplayer2.source.MediaSource> r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.addPublicMediaSources(r2, r3, r0, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void addMediaSources(int r1, java.util.Collection<com.google.android.exoplayer2.source.MediaSource> r2, android.os.Handler r3, java.lang.Runnable r4) {
            r0 = this;
            monitor-enter(r0)
            r0.addPublicMediaSources(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized void addMediaSources(java.util.Collection<com.google.android.exoplayer2.source.MediaSource> r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourcesPublic     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            r2.addPublicMediaSources(r0, r3, r1, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized void addMediaSources(java.util.Collection<com.google.android.exoplayer2.source.MediaSource> r2, android.os.Handler r3, java.lang.Runnable r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.mediaSourcesPublic     // Catch: java.lang.Throwable -> Lc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc
            r1.addPublicMediaSources(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void clear() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            int r1 = r2.getSize()     // Catch: java.lang.Throwable -> Lb
            r2.removeMediaSourceRange(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized void clear(android.os.Handler r3, java.lang.Runnable r4) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            int r1 = r2.getSize()     // Catch: java.lang.Throwable -> Lb
            r2.removeMediaSourceRange(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        Lb:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.upstream.Allocator r5, long r6) {
            r3 = this;
            java.lang.Object r0 = r4.periodUid
            java.lang.Object r0 = getMediaSourceHolderUid(r0)
            java.lang.Object r1 = r4.periodUid
            java.lang.Object r1 = getChildPeriodUid(r1)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r4.copyWithPeriodUid(r1)
            java.util.Map<java.lang.Object, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r1 = r3.mediaSourceByUid
            java.lang.Object r0 = r1.get(r0)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            if (r0 != 0) goto L2f
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$FakeMediaSource r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$FakeMediaSource
            r2 = 0
            r1.<init>(r2)
            boolean r2 = r3.useLazyPreparation
            r0.<init>(r1, r2)
            r1 = 1
            r0.isRemoved = r1
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            r3.prepareChildSource(r0, r1)
        L2f:
            r3.enableMediaSource(r0)
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r0.activeMediaPeriodIds
            r1.add(r4)
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.source.MaskingMediaPeriod r4 = r1.createPeriod(r4, r5, r6)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r5 = r3.mediaSourceByMediaPeriod
            r5.put(r4, r0)
            r3.disableUnusedMediaSources()
            return r4
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void disableInternal() {
            r1 = this;
            super.disableInternal()
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.enabledMediaSourceHolders
            r0.clear()
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void enableInternal() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public synchronized com.google.android.exoplayer2.Timeline getInitialTimeline() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r4.shuffleOrder     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.getLength()     // Catch: java.lang.Throwable -> L2e
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r1 = r4.mediaSourcesPublic     // Catch: java.lang.Throwable -> L2e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2e
            if (r0 == r1) goto L21
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r4.shuffleOrder     // Catch: java.lang.Throwable -> L2e
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r0.cloneAndClear()     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r2 = r4.mediaSourcesPublic     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r0.cloneAndInsert(r1, r2)     // Catch: java.lang.Throwable -> L2e
            goto L23
        L21:
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r4.shuffleOrder     // Catch: java.lang.Throwable -> L2e
        L23:
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$ConcatenatedTimeline r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$ConcatenatedTimeline     // Catch: java.lang.Throwable -> L2e
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r2 = r4.mediaSourcesPublic     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r4.isAtomic     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            return r1
        L2e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM
            return r0
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r7, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r8) {
            r6 = this;
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r7 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r7
            r0 = 0
        L3:
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r7.activeMediaPeriodIds
            int r1 = r1.size()
            if (r0 >= r1) goto L29
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r7.activeMediaPeriodIds
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r1
            long r1 = r1.windowSequenceNumber
            long r3 = r8.windowSequenceNumber
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L26
            java.lang.Object r0 = r8.periodUid
            java.lang.Object r7 = getPeriodUid(r7, r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r8.copyWithPeriodUid(r7)
            goto L2a
        L26:
            int r0 = r0 + 1
            goto L3
        L29:
            r7 = 0
        L2a:
            return r7
    }

    public synchronized com.google.android.exoplayer2.source.MediaSource getMediaSource(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.mediaSourcesPublic     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Ld
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r2 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r2     // Catch: java.lang.Throwable -> Ld
            com.google.android.exoplayer2.source.MaskingMediaSource r2 = r2.mediaSource     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized int getSize() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r1.mediaSourcesPublic     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r1 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r1
            int r1 = r1.firstWindowIndexInChild
            int r2 = r2 + r1
            return r2
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
            r1 = this;
            r0 = 0
            return r0
    }

    public synchronized void moveMediaSource(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.movePublicMediaSource(r2, r3, r0, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void moveMediaSource(int r1, int r2, android.os.Handler r3, java.lang.Runnable r4) {
            r0 = this;
            monitor-enter(r0)
            r0.movePublicMediaSource(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder r1, com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.Timeline r3) {
            r0 = this;
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r1 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r1
            r0.updateMediaSourceInternal(r1, r3)
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final synchronized void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r3) {
            r2 = this;
            monitor-enter(r2)
            super.prepareSourceInternal(r3)     // Catch: java.lang.Throwable -> L35
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L35
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L35
            r1 = 0
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r2.playbackThreadHandler = r3     // Catch: java.lang.Throwable -> L35
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r2.mediaSourcesPublic     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L1d
            r2.updateTimelineAndScheduleOnCompletionActions()     // Catch: java.lang.Throwable -> L35
            goto L33
        L1d:
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r2.shuffleOrder     // Catch: java.lang.Throwable -> L35
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourcesPublic     // Catch: java.lang.Throwable -> L35
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L35
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r3.cloneAndInsert(r1, r0)     // Catch: java.lang.Throwable -> L35
            r2.shuffleOrder = r3     // Catch: java.lang.Throwable -> L35
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r2.mediaSourcesPublic     // Catch: java.lang.Throwable -> L35
            r2.addMediaSourcesInternal(r1, r3)     // Catch: java.lang.Throwable -> L35
            r2.scheduleTimelineUpdate()     // Catch: java.lang.Throwable -> L35
        L33:
            monitor-exit(r2)
            return
        L35:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r3) {
            r2 = this;
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceByMediaPeriod
            java.lang.Object r0 = r0.remove(r3)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r0 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) r0
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            r1.releasePeriod(r3)
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r0.activeMediaPeriodIds
            com.google.android.exoplayer2.source.MaskingMediaPeriod r3 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r3
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.id
            r1.remove(r3)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r3 = r2.mediaSourceByMediaPeriod
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L27
            r2.disableUnusedMediaSources()
        L27:
            r2.maybeReleaseChildSource(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final synchronized void releaseSourceInternal() {
            r2 = this;
            monitor-enter(r2)
            super.releaseSourceInternal()     // Catch: java.lang.Throwable -> L34
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceHolders     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.enabledMediaSourceHolders     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            java.util.Map<java.lang.Object, com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourceByUid     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r2.shuffleOrder     // Catch: java.lang.Throwable -> L34
            com.google.android.exoplayer2.source.ShuffleOrder r0 = r0.cloneAndClear()     // Catch: java.lang.Throwable -> L34
            r2.shuffleOrder = r0     // Catch: java.lang.Throwable -> L34
            android.os.Handler r0 = r2.playbackThreadHandler     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L25
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L34
            r2.playbackThreadHandler = r1     // Catch: java.lang.Throwable -> L34
        L25:
            r0 = 0
            r2.timelineUpdateScheduled = r0     // Catch: java.lang.Throwable -> L34
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable> r0 = r2.nextTimelineUpdateOnCompletionActions     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource$HandlerAndRunnable> r0 = r2.pendingOnCompletionActions     // Catch: java.lang.Throwable -> L34
            r2.dispatchOnCompletionActions(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return
        L34:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized com.google.android.exoplayer2.source.MediaSource removeMediaSource(int r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.exoplayer2.source.MediaSource r0 = r3.getMediaSource(r4)     // Catch: java.lang.Throwable -> Ld
            int r1 = r4 + 1
            r2 = 0
            r3.removePublicMediaSources(r4, r1, r2, r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r0
        Ld:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized com.google.android.exoplayer2.source.MediaSource removeMediaSource(int r3, android.os.Handler r4, java.lang.Runnable r5) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.exoplayer2.source.MediaSource r0 = r2.getMediaSource(r3)     // Catch: java.lang.Throwable -> Lc
            int r1 = r3 + 1
            r2.removePublicMediaSources(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r0
        Lc:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized void removeMediaSourceRange(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.removePublicMediaSources(r2, r3, r0, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void removeMediaSourceRange(int r1, int r2, android.os.Handler r3, java.lang.Runnable r4) {
            r0 = this;
            monitor-enter(r0)
            r0.removePublicMediaSources(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.setPublicShuffleOrder(r2, r0, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r1, android.os.Handler r2, java.lang.Runnable r3) {
            r0 = this;
            monitor-enter(r0)
            r0.setPublicShuffleOrder(r1, r2, r3)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
