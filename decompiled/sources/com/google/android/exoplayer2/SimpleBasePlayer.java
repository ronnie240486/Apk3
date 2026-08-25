package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleBasePlayer extends com.google.android.exoplayer2.BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final com.google.android.exoplayer2.util.HandlerWrapper applicationHandler;
    private final android.os.Looper applicationLooper;
    private final com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player.Listener> listeners;
    private final java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> pendingOperations;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private boolean released;
    private com.google.android.exoplayer2.SimpleBasePlayer.State state;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.SimpleBasePlayer$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class MediaItemData {
        private final com.google.android.exoplayer2.MediaMetadata combinedMediaMetadata;
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;

        @androidx.annotation.Nullable
        public final java.lang.Object manifest;
        public final com.google.android.exoplayer2.MediaItem mediaItem;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer.PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final com.google.android.exoplayer2.Tracks tracks;
        public final java.lang.Object uid;
        public final long windowStartTimeMs;

        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;

            @androidx.annotation.Nullable
            private com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;

            @androidx.annotation.Nullable
            private java.lang.Object manifest;
            private com.google.android.exoplayer2.MediaItem mediaItem;

            @androidx.annotation.Nullable
            private com.google.android.exoplayer2.MediaMetadata mediaMetadata;
            private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer.PeriodData> periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private com.google.android.exoplayer2.Tracks tracks;
            private java.lang.Object uid;
            private long windowStartTimeMs;

            private Builder(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData r3) {
                    r2 = this;
                    r2.<init>()
                    java.lang.Object r0 = r3.uid
                    r2.uid = r0
                    com.google.android.exoplayer2.Tracks r0 = r3.tracks
                    r2.tracks = r0
                    com.google.android.exoplayer2.MediaItem r0 = r3.mediaItem
                    r2.mediaItem = r0
                    com.google.android.exoplayer2.MediaMetadata r0 = r3.mediaMetadata
                    r2.mediaMetadata = r0
                    java.lang.Object r0 = r3.manifest
                    r2.manifest = r0
                    com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r3.liveConfiguration
                    r2.liveConfiguration = r0
                    long r0 = r3.presentationStartTimeMs
                    r2.presentationStartTimeMs = r0
                    long r0 = r3.windowStartTimeMs
                    r2.windowStartTimeMs = r0
                    long r0 = r3.elapsedRealtimeEpochOffsetMs
                    r2.elapsedRealtimeEpochOffsetMs = r0
                    boolean r0 = r3.isSeekable
                    r2.isSeekable = r0
                    boolean r0 = r3.isDynamic
                    r2.isDynamic = r0
                    long r0 = r3.defaultPositionUs
                    r2.defaultPositionUs = r0
                    long r0 = r3.durationUs
                    r2.durationUs = r0
                    long r0 = r3.positionInFirstPeriodUs
                    r2.positionInFirstPeriodUs = r0
                    boolean r0 = r3.isPlaceholder
                    r2.isPlaceholder = r0
                    com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r3 = r3.periods
                    r2.periods = r3
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData r1, com.google.android.exoplayer2.SimpleBasePlayer.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public Builder(java.lang.Object r5) {
                    r4 = this;
                    r4.<init>()
                    r4.uid = r5
                    com.google.android.exoplayer2.Tracks r5 = com.google.android.exoplayer2.Tracks.EMPTY
                    r4.tracks = r5
                    com.google.android.exoplayer2.MediaItem r5 = com.google.android.exoplayer2.MediaItem.EMPTY
                    r4.mediaItem = r5
                    r5 = 0
                    r4.mediaMetadata = r5
                    r4.manifest = r5
                    r4.liveConfiguration = r5
                    r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    r4.presentationStartTimeMs = r0
                    r4.windowStartTimeMs = r0
                    r4.elapsedRealtimeEpochOffsetMs = r0
                    r5 = 0
                    r4.isSeekable = r5
                    r4.isDynamic = r5
                    r2 = 0
                    r4.defaultPositionUs = r2
                    r4.durationUs = r0
                    r4.positionInFirstPeriodUs = r2
                    r4.isPlaceholder = r5
                    com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of()
                    r4.periods = r5
                    return
            }

            public static /* synthetic */ com.google.android.exoplayer2.MediaItem.LiveConfiguration access$4700(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r0.liveConfiguration
                    return r0
            }

            public static /* synthetic */ long access$4800(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r2) {
                    long r0 = r2.presentationStartTimeMs
                    return r0
            }

            public static /* synthetic */ long access$4900(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r2) {
                    long r0 = r2.windowStartTimeMs
                    return r0
            }

            public static /* synthetic */ long access$5000(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r2) {
                    long r0 = r2.elapsedRealtimeEpochOffsetMs
                    return r0
            }

            public static /* synthetic */ com.google.common.collect.ImmutableList access$5100(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r0 = r0.periods
                    return r0
            }

            public static /* synthetic */ long access$5200(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r2) {
                    long r0 = r2.durationUs
                    return r0
            }

            public static /* synthetic */ long access$5300(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r2) {
                    long r0 = r2.defaultPositionUs
                    return r0
            }

            public static /* synthetic */ java.lang.Object access$5400(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    java.lang.Object r0 = r0.uid
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.Tracks access$5500(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    com.google.android.exoplayer2.Tracks r0 = r0.tracks
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.MediaItem access$5600(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    com.google.android.exoplayer2.MediaItem r0 = r0.mediaItem
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$5700(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    com.google.android.exoplayer2.MediaMetadata r0 = r0.mediaMetadata
                    return r0
            }

            public static /* synthetic */ java.lang.Object access$5800(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    java.lang.Object r0 = r0.manifest
                    return r0
            }

            public static /* synthetic */ boolean access$5900(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    boolean r0 = r0.isSeekable
                    return r0
            }

            public static /* synthetic */ boolean access$6000(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    boolean r0 = r0.isDynamic
                    return r0
            }

            public static /* synthetic */ long access$6100(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r2) {
                    long r0 = r2.positionInFirstPeriodUs
                    return r0
            }

            public static /* synthetic */ boolean access$6200(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r0) {
                    boolean r0 = r0.isPlaceholder
                    return r0
            }

            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData build() {
                    r2 = this;
                    com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r0 = new com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setDefaultPositionUs(long r4) {
                    r3 = this;
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r3.defaultPositionUs = r4
                    return r3
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setDurationUs(long r4) {
                    r3 = this;
                    r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 == 0) goto L12
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto L10
                    goto L12
                L10:
                    r0 = 0
                    goto L13
                L12:
                    r0 = 1
                L13:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r3.durationUs = r4
                    return r3
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setElapsedRealtimeEpochOffsetMs(long r1) {
                    r0 = this;
                    r0.elapsedRealtimeEpochOffsetMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setIsDynamic(boolean r1) {
                    r0 = this;
                    r0.isDynamic = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setIsPlaceholder(boolean r1) {
                    r0 = this;
                    r0.isPlaceholder = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setIsSeekable(boolean r1) {
                    r0 = this;
                    r0.isSeekable = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setLiveConfiguration(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.LiveConfiguration r1) {
                    r0 = this;
                    r0.liveConfiguration = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setManifest(@androidx.annotation.Nullable java.lang.Object r1) {
                    r0 = this;
                    r0.manifest = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setMediaItem(com.google.android.exoplayer2.MediaItem r1) {
                    r0 = this;
                    r0.mediaItem = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setMediaMetadata(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaMetadata r1) {
                    r0 = this;
                    r0.mediaMetadata = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setPeriods(java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.PeriodData> r10) {
                    r9 = this;
                    int r0 = r10.size()
                    r1 = 0
                    r2 = 0
                L6:
                    int r3 = r0 + (-1)
                    if (r2 >= r3) goto L48
                    java.lang.Object r3 = r10.get(r2)
                    com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r3 = (com.google.android.exoplayer2.SimpleBasePlayer.PeriodData) r3
                    long r3 = r3.durationUs
                    r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    r7 = 1
                    int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r8 == 0) goto L1e
                    r3 = 1
                    goto L1f
                L1e:
                    r3 = 0
                L1f:
                    java.lang.String r4 = "Periods other than last need a duration"
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r3, r4)
                    int r3 = r2 + 1
                    r4 = r3
                L27:
                    if (r4 >= r0) goto L46
                    java.lang.Object r5 = r10.get(r2)
                    com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r5 = (com.google.android.exoplayer2.SimpleBasePlayer.PeriodData) r5
                    java.lang.Object r5 = r5.uid
                    java.lang.Object r6 = r10.get(r4)
                    com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r6 = (com.google.android.exoplayer2.SimpleBasePlayer.PeriodData) r6
                    java.lang.Object r6 = r6.uid
                    boolean r5 = r5.equals(r6)
                    r5 = r5 ^ r7
                    java.lang.String r6 = "Duplicate PeriodData UIDs in period list"
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r5, r6)
                    int r4 = r4 + 1
                    goto L27
                L46:
                    r2 = r3
                    goto L6
                L48:
                    com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf(r10)
                    r9.periods = r10
                    return r9
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setPositionInFirstPeriodUs(long r4) {
                    r3 = this;
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r3.positionInFirstPeriodUs = r4
                    return r3
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setPresentationStartTimeMs(long r1) {
                    r0 = this;
                    r0.presentationStartTimeMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setTracks(com.google.android.exoplayer2.Tracks r1) {
                    r0 = this;
                    r0.tracks = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setUid(java.lang.Object r1) {
                    r0 = this;
                    r0.uid = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder setWindowStartTimeMs(long r1) {
                    r0 = this;
                    r0.windowStartTimeMs = r1
                    return r0
            }
        }

        private MediaItemData(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r10) {
                r9 = this;
                r9.<init>()
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4700(r10)
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r3 = 1
                r4 = 0
                if (r0 != 0) goto L43
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4800(r10)
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 != 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                java.lang.String r5 = "presentationStartTimeMs can only be set if liveConfiguration != null"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r5)
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4900(r10)
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 != 0) goto L2b
                r0 = 1
                goto L2c
            L2b:
                r0 = 0
            L2c:
                java.lang.String r5 = "windowStartTimeMs can only be set if liveConfiguration != null"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r5)
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5000(r10)
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 != 0) goto L3c
                r0 = 1
                goto L3d
            L3c:
                r0 = 0
            L3d:
                java.lang.String r5 = "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r5)
                goto L68
            L43:
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4800(r10)
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 == 0) goto L68
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4900(r10)
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 == 0) goto L68
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4900(r10)
                long r7 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4800(r10)
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 < 0) goto L61
                r0 = 1
                goto L62
            L61:
                r0 = 0
            L62:
                java.lang.String r5 = "windowStartTimeMs can't be less than presentationStartTimeMs"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r5)
            L68:
                com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5100(r10)
                int r0 = r0.size()
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5200(r10)
                int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r7 == 0) goto L8c
                long r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5300(r10)
                long r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5200(r10)
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 > 0) goto L86
                r1 = 1
                goto L87
            L86:
                r1 = 0
            L87:
                java.lang.String r2 = "defaultPositionUs can't be greater than durationUs"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r1, r2)
            L8c:
                java.lang.Object r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5400(r10)
                r9.uid = r1
                com.google.android.exoplayer2.Tracks r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5500(r10)
                r9.tracks = r1
                com.google.android.exoplayer2.MediaItem r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5600(r10)
                r9.mediaItem = r1
                com.google.android.exoplayer2.MediaMetadata r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5700(r10)
                r9.mediaMetadata = r1
                java.lang.Object r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5800(r10)
                r9.manifest = r1
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4700(r10)
                r9.liveConfiguration = r1
                long r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4800(r10)
                r9.presentationStartTimeMs = r1
                long r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$4900(r10)
                r9.windowStartTimeMs = r1
                long r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5000(r10)
                r9.elapsedRealtimeEpochOffsetMs = r1
                boolean r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5900(r10)
                r9.isSeekable = r1
                boolean r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$6000(r10)
                r9.isDynamic = r1
                long r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5300(r10)
                r9.defaultPositionUs = r1
                long r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5200(r10)
                r9.durationUs = r1
                long r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$6100(r10)
                r9.positionInFirstPeriodUs = r1
                boolean r5 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$6200(r10)
                r9.isPlaceholder = r5
                com.google.common.collect.ImmutableList r10 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder.access$5100(r10)
                r9.periods = r10
                int r5 = r10.size()
                long[] r5 = new long[r5]
                r9.periodPositionInWindowUs = r5
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L116
                long r1 = -r1
                r5[r4] = r1
            Lfd:
                int r10 = r0 + (-1)
                if (r4 >= r10) goto L116
                long[] r10 = r9.periodPositionInWindowUs
                int r1 = r4 + 1
                r5 = r10[r4]
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r2 = r9.periods
                java.lang.Object r2 = r2.get(r4)
                com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r2 = (com.google.android.exoplayer2.SimpleBasePlayer.PeriodData) r2
                long r7 = r2.durationUs
                long r5 = r5 + r7
                r10[r1] = r5
                r4 = r1
                goto Lfd
            L116:
                com.google.android.exoplayer2.MediaMetadata r10 = r9.mediaMetadata
                if (r10 == 0) goto L11b
                goto L123
            L11b:
                com.google.android.exoplayer2.MediaItem r10 = r9.mediaItem
                com.google.android.exoplayer2.Tracks r0 = r9.tracks
                com.google.android.exoplayer2.MediaMetadata r10 = getCombinedMediaMetadata(r10, r0)
            L123:
                r9.combinedMediaMetadata = r10
                return
        }

        public /* synthetic */ MediaItemData(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder r1, com.google.android.exoplayer2.SimpleBasePlayer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ java.lang.Object access$4300(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData r0, int r1) {
                java.lang.Object r0 = r0.getPeriodUid(r1)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.Timeline.Window access$4400(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData r0, int r1, com.google.android.exoplayer2.Timeline.Window r2) {
                com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.Timeline.Period access$4500(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData r0, int r1, int r2, com.google.android.exoplayer2.Timeline.Period r3) {
                com.google.android.exoplayer2.Timeline$Period r0 = r0.getPeriod(r1, r2, r3)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$7100(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData r0) {
                com.google.android.exoplayer2.MediaMetadata r0 = r0.combinedMediaMetadata
                return r0
        }

        private static com.google.android.exoplayer2.MediaMetadata getCombinedMediaMetadata(com.google.android.exoplayer2.MediaItem r9, com.google.android.exoplayer2.Tracks r10) {
                com.google.android.exoplayer2.MediaMetadata$Builder r0 = new com.google.android.exoplayer2.MediaMetadata$Builder
                r0.<init>()
                com.google.common.collect.ImmutableList r1 = r10.getGroups()
                int r1 = r1.size()
                r2 = 0
                r3 = 0
            Lf:
                if (r3 >= r1) goto L49
                com.google.common.collect.ImmutableList r4 = r10.getGroups()
                java.lang.Object r4 = r4.get(r3)
                com.google.android.exoplayer2.Tracks$Group r4 = (com.google.android.exoplayer2.Tracks.Group) r4
                r5 = 0
            L1c:
                int r6 = r4.length
                if (r5 >= r6) goto L46
                boolean r6 = r4.isTrackSelected(r5)
                if (r6 == 0) goto L43
                com.google.android.exoplayer2.Format r6 = r4.getTrackFormat(r5)
                com.google.android.exoplayer2.metadata.Metadata r7 = r6.metadata
                if (r7 == 0) goto L43
                r7 = 0
            L2f:
                com.google.android.exoplayer2.metadata.Metadata r8 = r6.metadata
                int r8 = r8.length()
                if (r7 >= r8) goto L43
                com.google.android.exoplayer2.metadata.Metadata r8 = r6.metadata
                com.google.android.exoplayer2.metadata.Metadata$Entry r8 = r8.get(r7)
                r8.populateMediaMetadata(r0)
                int r7 = r7 + 1
                goto L2f
            L43:
                int r5 = r5 + 1
                goto L1c
            L46:
                int r3 = r3 + 1
                goto Lf
            L49:
                com.google.android.exoplayer2.MediaMetadata r9 = r9.mediaMetadata
                com.google.android.exoplayer2.MediaMetadata$Builder r9 = r0.populate(r9)
                com.google.android.exoplayer2.MediaMetadata r9 = r9.build()
                return r9
        }

        private com.google.android.exoplayer2.Timeline.Period getPeriod(int r12, int r13, com.google.android.exoplayer2.Timeline.Period r14) {
                r11 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r0 = r11.periods
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1d
                java.lang.Object r3 = r11.uid
                long r0 = r11.positionInFirstPeriodUs
                long r4 = r11.durationUs
                long r5 = r0 + r4
                r7 = 0
                com.google.android.exoplayer2.source.ads.AdPlaybackState r9 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
                boolean r10 = r11.isPlaceholder
                r1 = r14
                r2 = r3
                r4 = r12
                r1.set(r2, r3, r4, r5, r7, r9, r10)
                goto L3c
            L1d:
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r0 = r11.periods
                java.lang.Object r0 = r0.get(r13)
                com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r0 = (com.google.android.exoplayer2.SimpleBasePlayer.PeriodData) r0
                java.lang.Object r2 = r0.uid
                java.lang.Object r1 = r11.uid
                android.util.Pair r3 = android.util.Pair.create(r1, r2)
                long r5 = r0.durationUs
                long[] r1 = r11.periodPositionInWindowUs
                r7 = r1[r13]
                com.google.android.exoplayer2.source.ads.AdPlaybackState r9 = r0.adPlaybackState
                boolean r10 = r0.isPlaceholder
                r1 = r14
                r4 = r12
                r1.set(r2, r3, r4, r5, r7, r9, r10)
            L3c:
                return r14
        }

        private java.lang.Object getPeriodUid(int r2) {
                r1 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r0 = r1.periods
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                java.lang.Object r2 = r1.uid
                return r2
            Lb:
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r0 = r1.periods
                java.lang.Object r2 = r0.get(r2)
                com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r2 = (com.google.android.exoplayer2.SimpleBasePlayer.PeriodData) r2
                java.lang.Object r2 = r2.uid
                java.lang.Object r0 = r1.uid
                android.util.Pair r2 = android.util.Pair.create(r0, r2)
                return r2
        }

        private com.google.android.exoplayer2.Timeline.Window getWindow(int r24, com.google.android.exoplayer2.Timeline.Window r25) {
                r23 = this;
                r0 = r23
                r1 = r25
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r2 = r0.periods
                boolean r2 = r2.isEmpty()
                r18 = 1
                if (r2 == 0) goto L11
                r19 = 1
                goto L19
            L11:
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r2 = r0.periods
                int r2 = r2.size()
                r19 = r2
            L19:
                java.lang.Object r2 = r0.uid
                com.google.android.exoplayer2.MediaItem r3 = r0.mediaItem
                java.lang.Object r4 = r0.manifest
                long r5 = r0.presentationStartTimeMs
                long r7 = r0.windowStartTimeMs
                long r9 = r0.elapsedRealtimeEpochOffsetMs
                boolean r11 = r0.isSeekable
                boolean r12 = r0.isDynamic
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r13 = r0.liveConfiguration
                long r14 = r0.defaultPositionUs
                r22 = r2
                long r1 = r0.durationUs
                r16 = r1
                int r1 = r24 + r19
                int r19 = r1 + (-1)
                long r1 = r0.positionInFirstPeriodUs
                r20 = r1
                r2 = r25
                r1 = r25
                r18 = r24
                r2 = r22
                r1.set(r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19, r20)
                boolean r1 = r0.isPlaceholder
                r2 = r25
                r2.isPlaceholder = r1
                return r2
        }

        public com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData$Builder r0 = new com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r8 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r8
                java.lang.Object r1 = r7.uid
                java.lang.Object r3 = r8.uid
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L95
                com.google.android.exoplayer2.Tracks r1 = r7.tracks
                com.google.android.exoplayer2.Tracks r3 = r8.tracks
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L95
                com.google.android.exoplayer2.MediaItem r1 = r7.mediaItem
                com.google.android.exoplayer2.MediaItem r3 = r8.mediaItem
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L95
                com.google.android.exoplayer2.MediaMetadata r1 = r7.mediaMetadata
                com.google.android.exoplayer2.MediaMetadata r3 = r8.mediaMetadata
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L95
                java.lang.Object r1 = r7.manifest
                java.lang.Object r3 = r8.manifest
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L95
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r7.liveConfiguration
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r3 = r8.liveConfiguration
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L95
                long r3 = r7.presentationStartTimeMs
                long r5 = r8.presentationStartTimeMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L95
                long r3 = r7.windowStartTimeMs
                long r5 = r8.windowStartTimeMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L95
                long r3 = r7.elapsedRealtimeEpochOffsetMs
                long r5 = r8.elapsedRealtimeEpochOffsetMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L95
                boolean r1 = r7.isSeekable
                boolean r3 = r8.isSeekable
                if (r1 != r3) goto L95
                boolean r1 = r7.isDynamic
                boolean r3 = r8.isDynamic
                if (r1 != r3) goto L95
                long r3 = r7.defaultPositionUs
                long r5 = r8.defaultPositionUs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L95
                long r3 = r7.durationUs
                long r5 = r8.durationUs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L95
                long r3 = r7.positionInFirstPeriodUs
                long r5 = r8.positionInFirstPeriodUs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L95
                boolean r1 = r7.isPlaceholder
                boolean r3 = r8.isPlaceholder
                if (r1 != r3) goto L95
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r1 = r7.periods
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r8 = r8.periods
                boolean r8 = r1.equals(r8)
                if (r8 == 0) goto L95
                goto L96
            L95:
                r0 = 0
            L96:
                return r0
        }

        public int hashCode() {
                r6 = this;
                java.lang.Object r0 = r6.uid
                int r0 = r0.hashCode()
                int r0 = r0 + 217
                int r0 = r0 * 31
                com.google.android.exoplayer2.Tracks r1 = r6.tracks
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.MediaItem r0 = r6.mediaItem
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.MediaMetadata r1 = r6.mediaMetadata
                r2 = 0
                if (r1 != 0) goto L23
                r1 = 0
                goto L27
            L23:
                int r1 = r1.hashCode()
            L27:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r6.manifest
                if (r1 != 0) goto L30
                r1 = 0
                goto L34
            L30:
                int r1 = r1.hashCode()
            L34:
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r6.liveConfiguration
                if (r1 != 0) goto L3c
                goto L40
            L3c:
                int r2 = r1.hashCode()
            L40:
                int r0 = r0 + r2
                int r0 = r0 * 31
                long r1 = r6.presentationStartTimeMs
                r3 = 32
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                long r1 = r6.windowStartTimeMs
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                long r1 = r6.elapsedRealtimeEpochOffsetMs
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r6.isSeekable
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r6.isDynamic
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r6.defaultPositionUs
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                long r1 = r6.durationUs
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                long r1 = r6.positionInFirstPeriodUs
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r6.isPlaceholder
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r1 = r6.periods
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }
    }

    public static final class PeriodData {
        public final com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final java.lang.Object uid;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class Builder {
            private com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private java.lang.Object uid;

            private Builder(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData r3) {
                    r2 = this;
                    r2.<init>()
                    java.lang.Object r0 = r3.uid
                    r2.uid = r0
                    long r0 = r3.durationUs
                    r2.durationUs = r0
                    com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r3.adPlaybackState
                    r2.adPlaybackState = r0
                    boolean r3 = r3.isPlaceholder
                    r2.isPlaceholder = r3
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData r1, com.google.android.exoplayer2.SimpleBasePlayer.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public Builder(java.lang.Object r3) {
                    r2 = this;
                    r2.<init>()
                    r2.uid = r3
                    r0 = 0
                    r2.durationUs = r0
                    com.google.android.exoplayer2.source.ads.AdPlaybackState r3 = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE
                    r2.adPlaybackState = r3
                    r3 = 0
                    r2.isPlaceholder = r3
                    return
            }

            public static /* synthetic */ java.lang.Object access$6500(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder r0) {
                    java.lang.Object r0 = r0.uid
                    return r0
            }

            public static /* synthetic */ long access$6600(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder r2) {
                    long r0 = r2.durationUs
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.source.ads.AdPlaybackState access$6700(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder r0) {
                    com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r0.adPlaybackState
                    return r0
            }

            public static /* synthetic */ boolean access$6800(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder r0) {
                    boolean r0 = r0.isPlaceholder
                    return r0
            }

            public com.google.android.exoplayer2.SimpleBasePlayer.PeriodData build() {
                    r2 = this;
                    com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r0 = new com.google.android.exoplayer2.SimpleBasePlayer$PeriodData
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder setAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState r1) {
                    r0 = this;
                    r0.adPlaybackState = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder setDurationUs(long r4) {
                    r3 = this;
                    r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 == 0) goto L12
                    r0 = 0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto L10
                    goto L12
                L10:
                    r0 = 0
                    goto L13
                L12:
                    r0 = 1
                L13:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r3.durationUs = r4
                    return r3
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder setIsPlaceholder(boolean r1) {
                    r0 = this;
                    r0.isPlaceholder = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder setUid(java.lang.Object r1) {
                    r0 = this;
                    r0.uid = r1
                    return r0
            }
        }

        private PeriodData(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder r3) {
                r2 = this;
                r2.<init>()
                java.lang.Object r0 = com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder.access$6500(r3)
                r2.uid = r0
                long r0 = com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder.access$6600(r3)
                r2.durationUs = r0
                com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder.access$6700(r3)
                r2.adPlaybackState = r0
                boolean r3 = com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder.access$6800(r3)
                r2.isPlaceholder = r3
                return
        }

        public /* synthetic */ PeriodData(com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder r1, com.google.android.exoplayer2.SimpleBasePlayer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.exoplayer2.SimpleBasePlayer.PeriodData.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.SimpleBasePlayer$PeriodData$Builder r0 = new com.google.android.exoplayer2.SimpleBasePlayer$PeriodData$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.android.exoplayer2.SimpleBasePlayer.PeriodData
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.SimpleBasePlayer$PeriodData r8 = (com.google.android.exoplayer2.SimpleBasePlayer.PeriodData) r8
                java.lang.Object r1 = r7.uid
                java.lang.Object r3 = r8.uid
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L2f
                long r3 = r7.durationUs
                long r5 = r8.durationUs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L2f
                com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r7.adPlaybackState
                com.google.android.exoplayer2.source.ads.AdPlaybackState r3 = r8.adPlaybackState
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L2f
                boolean r1 = r7.isPlaceholder
                boolean r8 = r8.isPlaceholder
                if (r1 != r8) goto L2f
                goto L30
            L2f:
                r0 = 0
            L30:
                return r0
        }

        public int hashCode() {
                r5 = this;
                java.lang.Object r0 = r5.uid
                int r0 = r0.hashCode()
                int r0 = r0 + 217
                int r0 = r0 * 31
                long r1 = r5.durationUs
                r3 = 32
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r5.adPlaybackState
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r5.isPlaceholder
                int r1 = r1 + r0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PlaceholderUid {
        private PlaceholderUid() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ PlaceholderUid(com.google.android.exoplayer2.SimpleBasePlayer.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class PlaylistTimeline extends com.google.android.exoplayer2.Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> periodIndexByUid;
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r10) {
                r9 = this;
                r9.<init>()
                int r0 = r10.size()
                r9.playlist = r10
                int[] r1 = new int[r0]
                r9.firstPeriodIndexByWindowIndex = r1
                r1 = 0
                r2 = 0
                r3 = 0
            L10:
                if (r2 >= r0) goto L24
                java.lang.Object r4 = r10.get(r2)
                com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r4 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r4
                int[] r5 = r9.firstPeriodIndexByWindowIndex
                r5[r2] = r3
                int r4 = getPeriodCountInMediaItem(r4)
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L10
            L24:
                int[] r2 = new int[r3]
                r9.windowIndexByPeriodIndex = r2
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                r9.periodIndexByUid = r2
                r2 = 0
                r3 = 0
            L31:
                if (r2 >= r0) goto L59
                java.lang.Object r4 = r10.get(r2)
                com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r4 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r4
                r5 = 0
            L3a:
                int r6 = getPeriodCountInMediaItem(r4)
                if (r5 >= r6) goto L56
                java.util.HashMap<java.lang.Object, java.lang.Integer> r6 = r9.periodIndexByUid
                java.lang.Object r7 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.access$4300(r4, r5)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
                r6.put(r7, r8)
                int[] r6 = r9.windowIndexByPeriodIndex
                r6[r3] = r2
                int r3 = r3 + 1
                int r5 = r5 + 1
                goto L3a
            L56:
                int r2 = r2 + 1
                goto L31
            L59:
                return
        }

        private static int getPeriodCountInMediaItem(com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData r1) {
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r0 = r1.periods
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto La
                r1 = 1
                goto L10
            La:
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$PeriodData> r1 = r1.periods
                int r1 = r1.size()
            L10:
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean r1) {
                r0 = this;
                int r1 = super.getFirstWindowIndex(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object r2) {
                r1 = this;
                java.util.HashMap<java.lang.Object, java.lang.Integer> r0 = r1.periodIndexByUid
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

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean r1) {
                r0 = this;
                int r1 = super.getLastWindowIndex(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int r1, int r2, boolean r3) {
                r0 = this;
                int r1 = super.getNextWindowIndex(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int r2, com.google.android.exoplayer2.Timeline.Period r3, boolean r4) {
                r1 = this;
                int[] r4 = r1.windowIndexByPeriodIndex
                r4 = r4[r2]
                int[] r0 = r1.firstPeriodIndexByWindowIndex
                r0 = r0[r4]
                int r2 = r2 - r0
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r1.playlist
                java.lang.Object r0 = r0.get(r4)
                com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r0 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r0
                com.google.android.exoplayer2.Timeline$Period r2 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.access$4500(r0, r4, r2, r3)
                return r2
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriodByUid(java.lang.Object r2, com.google.android.exoplayer2.Timeline.Period r3) {
                r1 = this;
                java.util.HashMap<java.lang.Object, java.lang.Integer> r0 = r1.periodIndexByUid
                java.lang.Object r2 = r0.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0 = 1
                com.google.android.exoplayer2.Timeline$Period r2 = r1.getPeriod(r2, r3, r0)
                return r2
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
                r1 = this;
                int[] r0 = r1.windowIndexByPeriodIndex
                int r0 = r0.length
                return r0
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int r1, int r2, boolean r3) {
                r0 = this;
                int r1 = super.getPreviousWindowIndex(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int r3) {
                r2 = this;
                int[] r0 = r2.windowIndexByPeriodIndex
                r0 = r0[r3]
                int[] r1 = r2.firstPeriodIndexByWindowIndex
                r1 = r1[r0]
                int r3 = r3 - r1
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r1 = r2.playlist
                java.lang.Object r0 = r1.get(r0)
                com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r0 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r0
                java.lang.Object r3 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.access$4300(r0, r3)
                return r3
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int r1, com.google.android.exoplayer2.Timeline.Window r2, long r3) {
                r0 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r3 = r0.playlist
                java.lang.Object r3 = r3.get(r1)
                com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r3 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r3
                int[] r4 = r0.firstPeriodIndexByWindowIndex
                r1 = r4[r1]
                com.google.android.exoplayer2.Timeline$Window r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.access$4400(r3, r1, r2)
                return r1
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
                r1 = this;
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r1.playlist
                int r0 = r0.size()
                return r0
        }
    }

    public interface PositionSupplier {
        public static final com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier ZERO = null;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.ZERO
                    return
            }

            public static com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier getConstant(long r1) {
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda0
                    r0.<init>(r1)
                    return r0
            }

            public static com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier getExtrapolating(long r7, float r9) {
                    long r3 = android.os.SystemClock.elapsedRealtime()
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda1 r6 = new com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda1
                    r0 = r6
                    r1 = r7
                    r5 = r9
                    r0.<init>(r1, r3, r5)
                    return r6
            }

            public static /* synthetic */ long lambda$getConstant$0(long r0) {
                    return r0
            }

            public static /* synthetic */ long lambda$getExtrapolating$1(long r2, long r4, float r6) {
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    long r0 = r0 - r4
                    float r4 = (float) r0
                    float r4 = r4 * r6
                    long r4 = (long) r4
                    long r2 = r2 + r4
                    return r2
            }
        }

        static {
                r0 = 0
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r0)
                com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.ZERO = r0
                return
        }

        long get();
    }

    public static final class State {
        public final com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier adBufferedPositionMsSupplier;
        public final com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier adPositionMsSupplier;
        public final com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
        public final com.google.android.exoplayer2.Player.Commands availableCommands;
        public final com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier contentBufferedPositionMsSupplier;
        public final com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final com.google.android.exoplayer2.text.CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final com.google.android.exoplayer2.DeviceInfo deviceInfo;

        @androidx.annotation.IntRange(from = 0)
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final com.google.android.exoplayer2.PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.PlaybackException playerError;
        public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> playlist;
        public final com.google.android.exoplayer2.MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final com.google.android.exoplayer2.util.Size surfaceSize;
        public final com.google.android.exoplayer2.metadata.Metadata timedMetadata;
        public final com.google.android.exoplayer2.Timeline timeline;
        public final com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier totalBufferedDurationMsSupplier;
        public final com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
        public final com.google.android.exoplayer2.video.VideoSize videoSize;

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        public final float volume;

        /* JADX INFO: loaded from: classes2.dex */
        public static final class Builder {
            private com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier adBufferedPositionMsSupplier;

            @androidx.annotation.Nullable
            private java.lang.Long adPositionMs;
            private com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier adPositionMsSupplier;
            private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
            private com.google.android.exoplayer2.Player.Commands availableCommands;
            private com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier contentBufferedPositionMsSupplier;

            @androidx.annotation.Nullable
            private java.lang.Long contentPositionMs;
            private com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private com.google.android.exoplayer2.text.CueGroup currentCues;
            private int currentMediaItemIndex;
            private com.google.android.exoplayer2.DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private com.google.android.exoplayer2.PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;

            @androidx.annotation.Nullable
            private com.google.android.exoplayer2.PlaybackException playerError;
            private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> playlist;
            private com.google.android.exoplayer2.MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private com.google.android.exoplayer2.util.Size surfaceSize;
            private com.google.android.exoplayer2.metadata.Metadata timedMetadata;
            private com.google.android.exoplayer2.Timeline timeline;
            private com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier totalBufferedDurationMsSupplier;
            private com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters;
            private com.google.android.exoplayer2.video.VideoSize videoSize;
            private float volume;

            public Builder() {
                    r6 = this;
                    r6.<init>()
                    com.google.android.exoplayer2.Player$Commands r0 = com.google.android.exoplayer2.Player.Commands.EMPTY
                    r6.availableCommands = r0
                    r0 = 0
                    r6.playWhenReady = r0
                    r1 = 1
                    r6.playWhenReadyChangeReason = r1
                    r6.playbackState = r1
                    r6.playbackSuppressionReason = r0
                    r1 = 0
                    r6.playerError = r1
                    r6.repeatMode = r0
                    r6.shuffleModeEnabled = r0
                    r6.isLoading = r0
                    r2 = 5000(0x1388, double:2.4703E-320)
                    r6.seekBackIncrementMs = r2
                    r2 = 15000(0x3a98, double:7.411E-320)
                    r6.seekForwardIncrementMs = r2
                    r2 = 3000(0xbb8, double:1.482E-320)
                    r6.maxSeekToPreviousPositionMs = r2
                    com.google.android.exoplayer2.PlaybackParameters r2 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
                    r6.playbackParameters = r2
                    com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT
                    r6.trackSelectionParameters = r2
                    com.google.android.exoplayer2.audio.AudioAttributes r2 = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT
                    r6.audioAttributes = r2
                    r2 = 1065353216(0x3f800000, float:1.0)
                    r6.volume = r2
                    com.google.android.exoplayer2.video.VideoSize r2 = com.google.android.exoplayer2.video.VideoSize.UNKNOWN
                    r6.videoSize = r2
                    com.google.android.exoplayer2.text.CueGroup r2 = com.google.android.exoplayer2.text.CueGroup.EMPTY_TIME_ZERO
                    r6.currentCues = r2
                    com.google.android.exoplayer2.DeviceInfo r2 = com.google.android.exoplayer2.DeviceInfo.UNKNOWN
                    r6.deviceInfo = r2
                    r6.deviceVolume = r0
                    r6.isDeviceMuted = r0
                    com.google.android.exoplayer2.util.Size r2 = com.google.android.exoplayer2.util.Size.UNKNOWN
                    r6.surfaceSize = r2
                    r6.newlyRenderedFirstFrame = r0
                    com.google.android.exoplayer2.metadata.Metadata r2 = new com.google.android.exoplayer2.metadata.Metadata
                    com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
                    r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    r2.<init>(r4, r3)
                    r6.timedMetadata = r2
                    com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
                    r6.playlist = r2
                    com.google.android.exoplayer2.Timeline r2 = com.google.android.exoplayer2.Timeline.EMPTY
                    r6.timeline = r2
                    com.google.android.exoplayer2.MediaMetadata r2 = com.google.android.exoplayer2.MediaMetadata.EMPTY
                    r6.playlistMetadata = r2
                    r2 = -1
                    r6.currentMediaItemIndex = r2
                    r6.currentAdGroupIndex = r2
                    r6.currentAdIndexInAdGroup = r2
                    r6.contentPositionMs = r1
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r2 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r4)
                    r6.contentPositionMsSupplier = r2
                    r6.adPositionMs = r1
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.ZERO
                    r6.adPositionMsSupplier = r1
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r2 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r4)
                    r6.contentBufferedPositionMsSupplier = r2
                    r6.adBufferedPositionMsSupplier = r1
                    r6.totalBufferedDurationMsSupplier = r1
                    r6.hasPositionDiscontinuity = r0
                    r0 = 5
                    r6.positionDiscontinuityReason = r0
                    r0 = 0
                    r6.discontinuityPositionMs = r0
                    return
            }

            private Builder(com.google.android.exoplayer2.SimpleBasePlayer.State r3) {
                    r2 = this;
                    r2.<init>()
                    com.google.android.exoplayer2.Player$Commands r0 = r3.availableCommands
                    r2.availableCommands = r0
                    boolean r0 = r3.playWhenReady
                    r2.playWhenReady = r0
                    int r0 = r3.playWhenReadyChangeReason
                    r2.playWhenReadyChangeReason = r0
                    int r0 = r3.playbackState
                    r2.playbackState = r0
                    int r0 = r3.playbackSuppressionReason
                    r2.playbackSuppressionReason = r0
                    com.google.android.exoplayer2.PlaybackException r0 = r3.playerError
                    r2.playerError = r0
                    int r0 = r3.repeatMode
                    r2.repeatMode = r0
                    boolean r0 = r3.shuffleModeEnabled
                    r2.shuffleModeEnabled = r0
                    boolean r0 = r3.isLoading
                    r2.isLoading = r0
                    long r0 = r3.seekBackIncrementMs
                    r2.seekBackIncrementMs = r0
                    long r0 = r3.seekForwardIncrementMs
                    r2.seekForwardIncrementMs = r0
                    long r0 = r3.maxSeekToPreviousPositionMs
                    r2.maxSeekToPreviousPositionMs = r0
                    com.google.android.exoplayer2.PlaybackParameters r0 = r3.playbackParameters
                    r2.playbackParameters = r0
                    com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r3.trackSelectionParameters
                    r2.trackSelectionParameters = r0
                    com.google.android.exoplayer2.audio.AudioAttributes r0 = r3.audioAttributes
                    r2.audioAttributes = r0
                    float r0 = r3.volume
                    r2.volume = r0
                    com.google.android.exoplayer2.video.VideoSize r0 = r3.videoSize
                    r2.videoSize = r0
                    com.google.android.exoplayer2.text.CueGroup r0 = r3.currentCues
                    r2.currentCues = r0
                    com.google.android.exoplayer2.DeviceInfo r0 = r3.deviceInfo
                    r2.deviceInfo = r0
                    int r0 = r3.deviceVolume
                    r2.deviceVolume = r0
                    boolean r0 = r3.isDeviceMuted
                    r2.isDeviceMuted = r0
                    com.google.android.exoplayer2.util.Size r0 = r3.surfaceSize
                    r2.surfaceSize = r0
                    boolean r0 = r3.newlyRenderedFirstFrame
                    r2.newlyRenderedFirstFrame = r0
                    com.google.android.exoplayer2.metadata.Metadata r0 = r3.timedMetadata
                    r2.timedMetadata = r0
                    com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r3.playlist
                    r2.playlist = r0
                    com.google.android.exoplayer2.Timeline r0 = r3.timeline
                    r2.timeline = r0
                    com.google.android.exoplayer2.MediaMetadata r0 = r3.playlistMetadata
                    r2.playlistMetadata = r0
                    int r0 = r3.currentMediaItemIndex
                    r2.currentMediaItemIndex = r0
                    int r0 = r3.currentAdGroupIndex
                    r2.currentAdGroupIndex = r0
                    int r0 = r3.currentAdIndexInAdGroup
                    r2.currentAdIndexInAdGroup = r0
                    r0 = 0
                    r2.contentPositionMs = r0
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r3.contentPositionMsSupplier
                    r2.contentPositionMsSupplier = r1
                    r2.adPositionMs = r0
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r3.adPositionMsSupplier
                    r2.adPositionMsSupplier = r0
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r3.contentBufferedPositionMsSupplier
                    r2.contentBufferedPositionMsSupplier = r0
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r3.adBufferedPositionMsSupplier
                    r2.adBufferedPositionMsSupplier = r0
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r3.totalBufferedDurationMsSupplier
                    r2.totalBufferedDurationMsSupplier = r0
                    boolean r0 = r3.hasPositionDiscontinuity
                    r2.hasPositionDiscontinuity = r0
                    int r0 = r3.positionDiscontinuityReason
                    r2.positionDiscontinuityReason = r0
                    long r0 = r3.discontinuityPositionMs
                    r2.discontinuityPositionMs = r0
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.SimpleBasePlayer.State r1, com.google.android.exoplayer2.SimpleBasePlayer.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            public static /* synthetic */ com.google.android.exoplayer2.Timeline access$100(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.Timeline r0 = r0.timeline
                    return r0
            }

            public static /* synthetic */ boolean access$1000(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    boolean r0 = r0.isLoading
                    return r0
            }

            public static /* synthetic */ boolean access$1100(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    boolean r0 = r0.playWhenReady
                    return r0
            }

            public static /* synthetic */ int access$1200(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.playbackSuppressionReason
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.PlaybackParameters access$1300(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier access$1400(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.adPositionMsSupplier
                    return r0
            }

            public static /* synthetic */ java.lang.Long access$1500(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    java.lang.Long r0 = r0.adPositionMs
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.Player.Commands access$1600(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.Player$Commands r0 = r0.availableCommands
                    return r0
            }

            public static /* synthetic */ int access$1700(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.playWhenReadyChangeReason
                    return r0
            }

            public static /* synthetic */ int access$1800(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.repeatMode
                    return r0
            }

            public static /* synthetic */ boolean access$1900(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    boolean r0 = r0.shuffleModeEnabled
                    return r0
            }

            public static /* synthetic */ int access$200(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.playbackState
                    return r0
            }

            public static /* synthetic */ long access$2000(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r2) {
                    long r0 = r2.seekBackIncrementMs
                    return r0
            }

            public static /* synthetic */ long access$2100(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r2) {
                    long r0 = r2.seekForwardIncrementMs
                    return r0
            }

            public static /* synthetic */ long access$2200(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r2) {
                    long r0 = r2.maxSeekToPreviousPositionMs
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters access$2300(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.trackSelectionParameters
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.audio.AudioAttributes access$2400(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.audio.AudioAttributes r0 = r0.audioAttributes
                    return r0
            }

            public static /* synthetic */ float access$2500(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    float r0 = r0.volume
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.video.VideoSize access$2600(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.video.VideoSize r0 = r0.videoSize
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.text.CueGroup access$2700(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.text.CueGroup r0 = r0.currentCues
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.DeviceInfo access$2800(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.DeviceInfo r0 = r0.deviceInfo
                    return r0
            }

            public static /* synthetic */ int access$2900(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.deviceVolume
                    return r0
            }

            public static /* synthetic */ int access$300(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.currentAdGroupIndex
                    return r0
            }

            public static /* synthetic */ boolean access$3000(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    boolean r0 = r0.isDeviceMuted
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.util.Size access$3100(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.util.Size r0 = r0.surfaceSize
                    return r0
            }

            public static /* synthetic */ boolean access$3200(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    boolean r0 = r0.newlyRenderedFirstFrame
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.metadata.Metadata access$3300(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.metadata.Metadata r0 = r0.timedMetadata
                    return r0
            }

            public static /* synthetic */ com.google.common.collect.ImmutableList access$3400(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r0.playlist
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata access$3500(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.MediaMetadata r0 = r0.playlistMetadata
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier access$3600(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.contentBufferedPositionMsSupplier
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier access$3700(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.adBufferedPositionMsSupplier
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier access$3800(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.totalBufferedDurationMsSupplier
                    return r0
            }

            public static /* synthetic */ boolean access$3900(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    boolean r0 = r0.hasPositionDiscontinuity
                    return r0
            }

            public static /* synthetic */ int access$400(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.currentAdIndexInAdGroup
                    return r0
            }

            public static /* synthetic */ int access$4000(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.positionDiscontinuityReason
                    return r0
            }

            public static /* synthetic */ long access$4100(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r2) {
                    long r0 = r2.discontinuityPositionMs
                    return r0
            }

            public static /* synthetic */ int access$500(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    int r0 = r0.currentMediaItemIndex
                    return r0
            }

            public static /* synthetic */ java.lang.Long access$600(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    java.lang.Long r0 = r0.contentPositionMs
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier access$700(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.contentPositionMsSupplier
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.PlaybackException access$900(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r0) {
                    com.google.android.exoplayer2.PlaybackException r0 = r0.playerError
                    return r0
            }

            public com.google.android.exoplayer2.SimpleBasePlayer.State build() {
                    r2 = this;
                    com.google.android.exoplayer2.SimpleBasePlayer$State r0 = new com.google.android.exoplayer2.SimpleBasePlayer$State
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder clearPositionDiscontinuity() {
                    r1 = this;
                    r0 = 0
                    r1.hasPositionDiscontinuity = r0
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setAdBufferedPositionMs(com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier r1) {
                    r0 = this;
                    r0.adBufferedPositionMsSupplier = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setAdPositionMs(long r1) {
                    r0 = this;
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    r0.adPositionMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setAdPositionMs(com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier r2) {
                    r1 = this;
                    r0 = 0
                    r1.adPositionMs = r0
                    r1.adPositionMsSupplier = r2
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes r1) {
                    r0 = this;
                    r0.audioAttributes = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setAvailableCommands(com.google.android.exoplayer2.Player.Commands r1) {
                    r0 = this;
                    r0.availableCommands = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setContentBufferedPositionMs(com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier r1) {
                    r0 = this;
                    r0.contentBufferedPositionMsSupplier = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setContentPositionMs(long r1) {
                    r0 = this;
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    r0.contentPositionMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setContentPositionMs(com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier r2) {
                    r1 = this;
                    r0 = 0
                    r1.contentPositionMs = r0
                    r1.contentPositionMsSupplier = r2
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setCurrentAd(int r5, int r6) {
                    r4 = this;
                    r0 = -1
                    r1 = 1
                    r2 = 0
                    if (r5 != r0) goto L7
                    r3 = 1
                    goto L8
                L7:
                    r3 = 0
                L8:
                    if (r6 != r0) goto Lc
                    r0 = 1
                    goto Ld
                Lc:
                    r0 = 0
                Ld:
                    if (r3 != r0) goto L10
                    goto L11
                L10:
                    r1 = 0
                L11:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
                    r4.currentAdGroupIndex = r5
                    r4.currentAdIndexInAdGroup = r6
                    return r4
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setCurrentCues(com.google.android.exoplayer2.text.CueGroup r1) {
                    r0 = this;
                    r0.currentCues = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setCurrentMediaItemIndex(int r1) {
                    r0 = this;
                    r0.currentMediaItemIndex = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setDeviceInfo(com.google.android.exoplayer2.DeviceInfo r1) {
                    r0 = this;
                    r0.deviceInfo = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setDeviceVolume(@androidx.annotation.IntRange(from = 0) int r2) {
                    r1 = this;
                    if (r2 < 0) goto L4
                    r0 = 1
                    goto L5
                L4:
                    r0 = 0
                L5:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r1.deviceVolume = r2
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setIsDeviceMuted(boolean r1) {
                    r0 = this;
                    r0.isDeviceMuted = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setIsLoading(boolean r1) {
                    r0 = this;
                    r0.isLoading = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setMaxSeekToPreviousPositionMs(long r1) {
                    r0 = this;
                    r0.maxSeekToPreviousPositionMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setNewlyRenderedFirstFrame(boolean r1) {
                    r0 = this;
                    r0.newlyRenderedFirstFrame = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlayWhenReady(boolean r1, int r2) {
                    r0 = this;
                    r0.playWhenReady = r1
                    r0.playWhenReadyChangeReason = r2
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r1) {
                    r0 = this;
                    r0.playbackParameters = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlaybackState(int r1) {
                    r0 = this;
                    r0.playbackState = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlaybackSuppressionReason(int r1) {
                    r0 = this;
                    r0.playbackSuppressionReason = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlayerError(@androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r1) {
                    r0 = this;
                    r0.playerError = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlaylist(java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r5) {
                    r4 = this;
                    java.util.HashSet r0 = new java.util.HashSet
                    r0.<init>()
                    r1 = 0
                L6:
                    int r2 = r5.size()
                    if (r1 >= r2) goto L20
                    java.lang.Object r2 = r5.get(r1)
                    com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r2 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r2
                    java.lang.Object r2 = r2.uid
                    boolean r2 = r0.add(r2)
                    java.lang.String r3 = "Duplicate MediaItemData UID in playlist"
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r2, r3)
                    int r1 = r1 + 1
                    goto L6
                L20:
                    com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf(r5)
                    r4.playlist = r5
                    com.google.android.exoplayer2.SimpleBasePlayer$PlaylistTimeline r5 = new com.google.android.exoplayer2.SimpleBasePlayer$PlaylistTimeline
                    com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r4.playlist
                    r5.<init>(r0)
                    r4.timeline = r5
                    return r4
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata r1) {
                    r0 = this;
                    r0.playlistMetadata = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPositionDiscontinuity(int r2, long r3) {
                    r1 = this;
                    r0 = 1
                    r1.hasPositionDiscontinuity = r0
                    r1.positionDiscontinuityReason = r2
                    r1.discontinuityPositionMs = r3
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setRepeatMode(int r1) {
                    r0 = this;
                    r0.repeatMode = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setSeekBackIncrementMs(long r1) {
                    r0 = this;
                    r0.seekBackIncrementMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setSeekForwardIncrementMs(long r1) {
                    r0 = this;
                    r0.seekForwardIncrementMs = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setShuffleModeEnabled(boolean r1) {
                    r0 = this;
                    r0.shuffleModeEnabled = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setSurfaceSize(com.google.android.exoplayer2.util.Size r1) {
                    r0 = this;
                    r0.surfaceSize = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setTimedMetadata(com.google.android.exoplayer2.metadata.Metadata r1) {
                    r0 = this;
                    r0.timedMetadata = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setTotalBufferedDurationMs(com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier r1) {
                    r0 = this;
                    r0.totalBufferedDurationMsSupplier = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
                    r0 = this;
                    r0.trackSelectionParameters = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setVideoSize(com.google.android.exoplayer2.video.VideoSize r1) {
                    r0 = this;
                    r0.videoSize = r1
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setVolume(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
                    r1 = this;
                    r0 = 0
                    int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r0 < 0) goto Ld
                    r0 = 1065353216(0x3f800000, float:1.0)
                    int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r0 > 0) goto Ld
                    r0 = 1
                    goto Le
                Ld:
                    r0 = 0
                Le:
                    com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                    r1.volume = r2
                    return r1
            }
        }

        private State(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r14) {
                r13 = this;
                r13.<init>()
                com.google.android.exoplayer2.Timeline r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$100(r14)
                boolean r0 = r0.isEmpty()
                r1 = 4
                r2 = 0
                r3 = -1
                r4 = 1
                if (r0 == 0) goto L3c
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                if (r0 == r4) goto L20
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                if (r0 != r1) goto L1e
                goto L20
            L1e:
                r0 = 0
                goto L21
            L20:
                r0 = 1
            L21:
                java.lang.String r5 = "Empty playlist only allowed in STATE_IDLE or STATE_ENDED"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r5)
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$300(r14)
                if (r0 != r3) goto L34
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$400(r14)
                if (r0 != r3) goto L34
                r0 = 1
                goto L35
            L34:
                r0 = 0
            L35:
                java.lang.String r5 = "Ads not allowed if playlist is empty"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r5)
                goto Lbd
            L3c:
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$500(r14)
                if (r0 != r3) goto L44
                r8 = 0
                goto L5b
            L44:
                int r5 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$500(r14)
                com.google.android.exoplayer2.Timeline r6 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$100(r14)
                int r6 = r6.getWindowCount()
                if (r5 >= r6) goto L54
                r5 = 1
                goto L55
            L54:
                r5 = 0
            L55:
                java.lang.String r6 = "currentMediaItemIndex must be less than playlist.size()"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r5, r6)
                r8 = r0
            L5b:
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$300(r14)
                if (r0 == r3) goto Lbd
                com.google.android.exoplayer2.Timeline$Period r0 = new com.google.android.exoplayer2.Timeline$Period
                r0.<init>()
                com.google.android.exoplayer2.Timeline$Window r11 = new com.google.android.exoplayer2.Timeline$Window
                r11.<init>()
                java.lang.Long r5 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$600(r14)
                if (r5 == 0) goto L7a
                java.lang.Long r5 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$600(r14)
                long r5 = r5.longValue()
                goto L82
            L7a:
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r5 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$700(r14)
                long r5 = r5.get()
            L82:
                r9 = r5
                com.google.android.exoplayer2.Timeline r7 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$100(r14)
                r12 = r0
                int r5 = com.google.android.exoplayer2.SimpleBasePlayer.access$800(r7, r8, r9, r11, r12)
                com.google.android.exoplayer2.Timeline r6 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$100(r14)
                r6.getPeriod(r5, r0)
                int r5 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$300(r14)
                int r6 = r0.getAdGroupCount()
                if (r5 >= r6) goto L9f
                r5 = 1
                goto La0
            L9f:
                r5 = 0
            La0:
                java.lang.String r6 = "PeriodData has less ad groups than adGroupIndex"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r5, r6)
                int r5 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$300(r14)
                int r0 = r0.getAdCountInAdGroup(r5)
                if (r0 == r3) goto Lbd
                int r5 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$400(r14)
                if (r5 >= r0) goto Lb7
                r0 = 1
                goto Lb8
            Lb7:
                r0 = 0
            Lb8:
                java.lang.String r5 = "Ad group has less ads than adIndexInGroupIndex"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r5)
            Lbd:
                com.google.android.exoplayer2.PlaybackException r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$900(r14)
                if (r0 == 0) goto Lcf
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                if (r0 != r4) goto Lca
                r2 = 1
            Lca:
                java.lang.String r0 = "Player error only allowed in STATE_IDLE"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r2, r0)
            Lcf:
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                if (r0 == r4) goto Ldb
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                if (r0 != r1) goto Le5
            Ldb:
                boolean r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1000(r14)
                r0 = r0 ^ r4
                java.lang.String r1 = "isLoading only allowed when not in STATE_IDLE or STATE_ENDED"
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            Le5:
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$700(r14)
                java.lang.Long r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$600(r14)
                r2 = 3
                if (r1 == 0) goto L138
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$300(r14)
                if (r0 != r3) goto L12c
                boolean r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1100(r14)
                if (r0 == 0) goto L12c
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                if (r0 != r2) goto L12c
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1200(r14)
                if (r0 != 0) goto L12c
                java.lang.Long r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$600(r14)
                long r0 = r0.longValue()
                r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 == 0) goto L12c
                java.lang.Long r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$600(r14)
                long r0 = r0.longValue()
                com.google.android.exoplayer2.PlaybackParameters r4 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1300(r14)
                float r4 = r4.speed
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getExtrapolating(r0, r4)
                goto L138
            L12c:
                java.lang.Long r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$600(r14)
                long r0 = r0.longValue()
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r0)
            L138:
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1400(r14)
                java.lang.Long r4 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1500(r14)
                if (r4 == 0) goto L175
                int r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$300(r14)
                if (r1 == r3) goto L169
                boolean r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1100(r14)
                if (r1 == 0) goto L169
                int r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                if (r1 != r2) goto L169
                int r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1200(r14)
                if (r1 != 0) goto L169
                java.lang.Long r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1500(r14)
                long r1 = r1.longValue()
                r3 = 1065353216(0x3f800000, float:1.0)
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getExtrapolating(r1, r3)
                goto L175
            L169:
                java.lang.Long r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1500(r14)
                long r1 = r1.longValue()
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r1)
            L175:
                com.google.android.exoplayer2.Player$Commands r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1600(r14)
                r13.availableCommands = r2
                boolean r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1100(r14)
                r13.playWhenReady = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1700(r14)
                r13.playWhenReadyChangeReason = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$200(r14)
                r13.playbackState = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1200(r14)
                r13.playbackSuppressionReason = r2
                com.google.android.exoplayer2.PlaybackException r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$900(r14)
                r13.playerError = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1800(r14)
                r13.repeatMode = r2
                boolean r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1900(r14)
                r13.shuffleModeEnabled = r2
                boolean r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1000(r14)
                r13.isLoading = r2
                long r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2000(r14)
                r13.seekBackIncrementMs = r2
                long r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2100(r14)
                r13.seekForwardIncrementMs = r2
                long r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2200(r14)
                r13.maxSeekToPreviousPositionMs = r2
                com.google.android.exoplayer2.PlaybackParameters r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$1300(r14)
                r13.playbackParameters = r2
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2300(r14)
                r13.trackSelectionParameters = r2
                com.google.android.exoplayer2.audio.AudioAttributes r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2400(r14)
                r13.audioAttributes = r2
                float r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2500(r14)
                r13.volume = r2
                com.google.android.exoplayer2.video.VideoSize r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2600(r14)
                r13.videoSize = r2
                com.google.android.exoplayer2.text.CueGroup r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2700(r14)
                r13.currentCues = r2
                com.google.android.exoplayer2.DeviceInfo r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2800(r14)
                r13.deviceInfo = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$2900(r14)
                r13.deviceVolume = r2
                boolean r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3000(r14)
                r13.isDeviceMuted = r2
                com.google.android.exoplayer2.util.Size r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3100(r14)
                r13.surfaceSize = r2
                boolean r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3200(r14)
                r13.newlyRenderedFirstFrame = r2
                com.google.android.exoplayer2.metadata.Metadata r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3300(r14)
                r13.timedMetadata = r2
                com.google.common.collect.ImmutableList r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3400(r14)
                r13.playlist = r2
                com.google.android.exoplayer2.Timeline r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$100(r14)
                r13.timeline = r2
                com.google.android.exoplayer2.MediaMetadata r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3500(r14)
                r13.playlistMetadata = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$500(r14)
                r13.currentMediaItemIndex = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$300(r14)
                r13.currentAdGroupIndex = r2
                int r2 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$400(r14)
                r13.currentAdIndexInAdGroup = r2
                r13.contentPositionMsSupplier = r0
                r13.adPositionMsSupplier = r1
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3600(r14)
                r13.contentBufferedPositionMsSupplier = r0
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3700(r14)
                r13.adBufferedPositionMsSupplier = r0
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3800(r14)
                r13.totalBufferedDurationMsSupplier = r0
                boolean r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$3900(r14)
                r13.hasPositionDiscontinuity = r0
                int r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$4000(r14)
                r13.positionDiscontinuityReason = r0
                long r0 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$4100(r14)
                r13.discontinuityPositionMs = r0
                return
        }

        public /* synthetic */ State(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r1, com.google.android.exoplayer2.SimpleBasePlayer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = new com.google.android.exoplayer2.SimpleBasePlayer$State$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.android.exoplayer2.SimpleBasePlayer.State
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.exoplayer2.SimpleBasePlayer$State r8 = (com.google.android.exoplayer2.SimpleBasePlayer.State) r8
                boolean r1 = r7.playWhenReady
                boolean r3 = r8.playWhenReady
                if (r1 != r3) goto L139
                int r1 = r7.playWhenReadyChangeReason
                int r3 = r8.playWhenReadyChangeReason
                if (r1 != r3) goto L139
                com.google.android.exoplayer2.Player$Commands r1 = r7.availableCommands
                com.google.android.exoplayer2.Player$Commands r3 = r8.availableCommands
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                int r1 = r7.playbackState
                int r3 = r8.playbackState
                if (r1 != r3) goto L139
                int r1 = r7.playbackSuppressionReason
                int r3 = r8.playbackSuppressionReason
                if (r1 != r3) goto L139
                com.google.android.exoplayer2.PlaybackException r1 = r7.playerError
                com.google.android.exoplayer2.PlaybackException r3 = r8.playerError
                boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r1, r3)
                if (r1 == 0) goto L139
                int r1 = r7.repeatMode
                int r3 = r8.repeatMode
                if (r1 != r3) goto L139
                boolean r1 = r7.shuffleModeEnabled
                boolean r3 = r8.shuffleModeEnabled
                if (r1 != r3) goto L139
                boolean r1 = r7.isLoading
                boolean r3 = r8.isLoading
                if (r1 != r3) goto L139
                long r3 = r7.seekBackIncrementMs
                long r5 = r8.seekBackIncrementMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L139
                long r3 = r7.seekForwardIncrementMs
                long r5 = r8.seekForwardIncrementMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L139
                long r3 = r7.maxSeekToPreviousPositionMs
                long r5 = r8.maxSeekToPreviousPositionMs
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L139
                com.google.android.exoplayer2.PlaybackParameters r1 = r7.playbackParameters
                com.google.android.exoplayer2.PlaybackParameters r3 = r8.playbackParameters
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r7.trackSelectionParameters
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3 = r8.trackSelectionParameters
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.audio.AudioAttributes r1 = r7.audioAttributes
                com.google.android.exoplayer2.audio.AudioAttributes r3 = r8.audioAttributes
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                float r1 = r7.volume
                float r3 = r8.volume
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L139
                com.google.android.exoplayer2.video.VideoSize r1 = r7.videoSize
                com.google.android.exoplayer2.video.VideoSize r3 = r8.videoSize
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.text.CueGroup r1 = r7.currentCues
                com.google.android.exoplayer2.text.CueGroup r3 = r8.currentCues
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.DeviceInfo r1 = r7.deviceInfo
                com.google.android.exoplayer2.DeviceInfo r3 = r8.deviceInfo
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                int r1 = r7.deviceVolume
                int r3 = r8.deviceVolume
                if (r1 != r3) goto L139
                boolean r1 = r7.isDeviceMuted
                boolean r3 = r8.isDeviceMuted
                if (r1 != r3) goto L139
                com.google.android.exoplayer2.util.Size r1 = r7.surfaceSize
                com.google.android.exoplayer2.util.Size r3 = r8.surfaceSize
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                boolean r1 = r7.newlyRenderedFirstFrame
                boolean r3 = r8.newlyRenderedFirstFrame
                if (r1 != r3) goto L139
                com.google.android.exoplayer2.metadata.Metadata r1 = r7.timedMetadata
                com.google.android.exoplayer2.metadata.Metadata r3 = r8.timedMetadata
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r1 = r7.playlist
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r3 = r8.playlist
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.MediaMetadata r1 = r7.playlistMetadata
                com.google.android.exoplayer2.MediaMetadata r3 = r8.playlistMetadata
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                int r1 = r7.currentMediaItemIndex
                int r3 = r8.currentMediaItemIndex
                if (r1 != r3) goto L139
                int r1 = r7.currentAdGroupIndex
                int r3 = r8.currentAdGroupIndex
                if (r1 != r3) goto L139
                int r1 = r7.currentAdIndexInAdGroup
                int r3 = r8.currentAdIndexInAdGroup
                if (r1 != r3) goto L139
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r7.contentPositionMsSupplier
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r3 = r8.contentPositionMsSupplier
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r7.adPositionMsSupplier
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r3 = r8.adPositionMsSupplier
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r7.contentBufferedPositionMsSupplier
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r3 = r8.contentBufferedPositionMsSupplier
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r7.adBufferedPositionMsSupplier
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r3 = r8.adBufferedPositionMsSupplier
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r7.totalBufferedDurationMsSupplier
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r3 = r8.totalBufferedDurationMsSupplier
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L139
                boolean r1 = r7.hasPositionDiscontinuity
                boolean r3 = r8.hasPositionDiscontinuity
                if (r1 != r3) goto L139
                int r1 = r7.positionDiscontinuityReason
                int r3 = r8.positionDiscontinuityReason
                if (r1 != r3) goto L139
                long r3 = r7.discontinuityPositionMs
                long r5 = r8.discontinuityPositionMs
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L139
                goto L13a
            L139:
                r0 = 0
            L13a:
                return r0
        }

        public int hashCode() {
                r6 = this;
                com.google.android.exoplayer2.Player$Commands r0 = r6.availableCommands
                int r0 = r0.hashCode()
                int r0 = r0 + 217
                int r0 = r0 * 31
                boolean r1 = r6.playWhenReady
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r6.playWhenReadyChangeReason
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r6.playbackState
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r6.playbackSuppressionReason
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.PlaybackException r1 = r6.playerError
                if (r1 != 0) goto L24
                r1 = 0
                goto L28
            L24:
                int r1 = r1.hashCode()
            L28:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r6.repeatMode
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r6.shuffleModeEnabled
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r6.isLoading
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r6.seekBackIncrementMs
                r3 = 32
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                long r1 = r6.seekForwardIncrementMs
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                long r1 = r6.maxSeekToPreviousPositionMs
                long r4 = r1 >>> r3
                long r1 = r1 ^ r4
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.google.android.exoplayer2.PlaybackParameters r1 = r6.playbackParameters
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r6.trackSelectionParameters
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.audio.AudioAttributes r1 = r6.audioAttributes
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                float r0 = r6.volume
                int r0 = java.lang.Float.floatToRawIntBits(r0)
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.video.VideoSize r1 = r6.videoSize
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.text.CueGroup r0 = r6.currentCues
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.DeviceInfo r1 = r6.deviceInfo
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r6.deviceVolume
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r6.isDeviceMuted
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.util.Size r0 = r6.surfaceSize
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r6.newlyRenderedFirstFrame
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.metadata.Metadata r1 = r6.timedMetadata
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r6.playlist
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.MediaMetadata r1 = r6.playlistMetadata
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r6.currentMediaItemIndex
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r6.currentAdGroupIndex
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r6.currentAdIndexInAdGroup
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r6.contentPositionMsSupplier
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r6.adPositionMsSupplier
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r6.contentBufferedPositionMsSupplier
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r6.adBufferedPositionMsSupplier
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r6.totalBufferedDurationMsSupplier
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r6.hasPositionDiscontinuity
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r6.positionDiscontinuityReason
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r6.discontinuityPositionMs
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$2AU_PwUU4Ob-h1IVmtWA59vsodE, reason: not valid java name */
    public static /* synthetic */ void m173$r8$lambda$2AU_PwUU4Obh1IVmtWA59vsodE(com.google.android.exoplayer2.SimpleBasePlayer r0, com.google.android.exoplayer2.Player.Listener r1, com.google.android.exoplayer2.util.FlagSet r2) {
            r0.lambda$new$0(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$4OhuP12xkkS-ZLbLhE7uyfa7bPw, reason: not valid java name */
    public static /* synthetic */ void m174$r8$lambda$4OhuP12xkkSZLbLhE7uyfa7bPw(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$38(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$6kasqRwfaloWQIblycSzB6VW-ho, reason: not valid java name */
    public static /* synthetic */ void m175$r8$lambda$6kasqRwfaloWQIblycSzB6VWho(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$47(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$CxJV2Y0wrFeAiJ2i0QEOKPUKwow(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$40(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$EA-4AC225VlzDaOsc4E6O3T5VBs, reason: not valid java name */
    public static /* synthetic */ void m176$r8$lambda$EA4AC225VlzDaOsc4E6O3T5VBs(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$37(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$EuMiUpthsBUGmLRdweSxgPpvE4o(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$48(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$KF8MP3OZOh3pN8wewruW8JPiwcM(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$49(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$LGf9DpZdLlWigjdFEzIYOEcVeGc(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$45(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$LjPz67j9QDkM4HxhmkHZutkwJDk(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$41(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$MPaqyPNhPNhtpHOjOa6t-Sor-yM, reason: not valid java name */
    public static /* synthetic */ void m177$r8$lambda$MPaqyPNhPNhtpHOjOa6tSoryM(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$36(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$N3vyrrgzrHwJk3fr6KDN61UBS6M(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$53(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$NKBNir6luWyymSdYSynE4xWtpUg(com.google.android.exoplayer2.Tracks r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$31(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$PTEJn_Iki-IJZwuLGiaUDuHLRJ4, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State m178$r8$lambda$PTEJn_IkiIJZwuLGiaUDuHLRJ4(com.google.android.exoplayer2.SimpleBasePlayer.State r0, boolean r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = lambda$setPlayWhenReady$1(r0, r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$T5ox9g1BEdc7Cw6MnQjRQpOFjtY(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$39(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$UNjZbEvw-KNsQScgj0daOVnYVAc, reason: not valid java name */
    public static /* synthetic */ void m179$r8$lambda$UNjZbEvwKNsQScgj0daOVnYVAc(com.google.android.exoplayer2.MediaItem r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            lambda$updateStateAndInformListeners$27(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$VYDLbPexqALtezlAH_ZIZdtvsbo(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$30(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$VqS2v7fCjdPyAhWai1ofXNVaEJY(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$50(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$WNlrrOc8a5QSPPc9fnpK89rIh_g(int r0, com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.Listener r3) {
            lambda$updateStateAndInformListeners$26(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$YVkZWrJGnh7y5hbBJkgzF4xaP7Y(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$54(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$YgMMmT15uaXRNhSI1cZe9MHz1pk(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$51(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ZhE0q64JI_NvIUwPUZSqcscZIGs(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$44(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$_UjzCyLsveLqTUXMp7zkNOmdX80(com.google.android.exoplayer2.MediaMetadata r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$32(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$aGT6aaUgUmNm7qZd_hAD35Kxa6o(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$46(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$aeQPRLOvJ91QcHDZGpIRmfFTyk8(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$33(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$bDXW_c6W5wgNPHyv_5Ri72e5EFc(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$42(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$bOQPU1v_RouU3fB51IgcSYnm5ks(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$34(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$kAr3ZAQc456G-RKSsHp0itrY1gk, reason: not valid java name */
    public static /* synthetic */ void m180$r8$lambda$kAr3ZAQc456GRKSsHp0itrY1gk(com.google.android.exoplayer2.SimpleBasePlayer.State r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            lambda$updateStateAndInformListeners$25(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$pTYmbOOT7StD5yxuWAlQb3_3sus(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$28(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$qUaq_FRLluRZtP5EFdBK3M77tX8(com.google.android.exoplayer2.SimpleBasePlayer r0, java.lang.Runnable r1) {
            r0.postOrRunOnApplicationHandler(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$rZXUkl1jw_qODd7iaDsuGHQPnmw(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$35(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$x3e4pBscHQdd8tbTDHRtSibIRJ4(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$43(r0, r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$xcDpyKaA_EWBp8-gngea4bDRORg, reason: not valid java name */
    public static /* synthetic */ void m181$r8$lambda$xcDpyKaA_EWBp8gngea4bDRORg(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$52(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$yyPcUZj804b8lLv2whVr4CfF27U(com.google.android.exoplayer2.SimpleBasePlayer r0, com.google.common.util.concurrent.ListenableFuture r1) {
            r0.lambda$updateStateForPendingOperation$55(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$zXuOdx-u5JmncohY2-MKrrmks0A, reason: not valid java name */
    public static /* synthetic */ void m182$r8$lambda$zXuOdxu5JmncohY2MKrrmks0A(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            lambda$updateStateAndInformListeners$29(r0, r1)
            return
    }

    public SimpleBasePlayer(android.os.Looper r5) {
            r4 = this;
            com.google.android.exoplayer2.util.Clock r0 = com.google.android.exoplayer2.util.Clock.DEFAULT
            r4.<init>()
            r4.applicationLooper = r5
            r1 = 0
            com.google.android.exoplayer2.util.HandlerWrapper r1 = r0.createHandler(r5, r1)
            r4.applicationHandler = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4.pendingOperations = r1
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            r4.period = r1
            com.google.android.exoplayer2.util.ListenerSet r1 = new com.google.android.exoplayer2.util.ListenerSet
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r2 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
            r3 = 9
            r2.<init>(r4, r3)
            r1.<init>(r5, r0, r2)
            r4.listeners = r1
            return
    }

    public static /* synthetic */ int access$800(com.google.android.exoplayer2.Timeline r0, int r1, long r2, com.google.android.exoplayer2.Timeline.Window r4, com.google.android.exoplayer2.Timeline.Period r5) {
            int r0 = getPeriodIndexFromWindowPosition(r0, r1, r2, r4, r5)
            return r0
    }

    private static com.google.android.exoplayer2.SimpleBasePlayer.State buildStateForNewPosition(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder r7, com.google.android.exoplayer2.SimpleBasePlayer.State r8, long r9, java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r11, int r12, long r13, boolean r15) {
            long r9 = getPositionOrDefaultInMediaItem(r9, r8)
            boolean r0 = r11.isEmpty()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L1b
            if (r12 == r4) goto L19
            int r0 = r11.size()
            if (r12 < r0) goto L1b
        L19:
            r13 = r1
            r12 = 0
        L1b:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L31
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L31
            java.lang.Object r13 = r11.get(r12)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r13 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r13
            long r13 = r13.defaultPositionUs
            long r13 = com.google.android.exoplayer2.util.Util.usToMs(r13)
        L31:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r8.playlist
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L43
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L41
            goto L43
        L41:
            r0 = 0
            goto L44
        L43:
            r0 = 1
        L44:
            if (r0 != 0) goto L63
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r2 = r8.playlist
            int r5 = getCurrentMediaItemIndexInternal(r8)
            java.lang.Object r2 = r2.get(r5)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r2 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r2
            java.lang.Object r2 = r2.uid
            java.lang.Object r11 = r11.get(r12)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r11 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r11
            java.lang.Object r11 = r11.uid
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L63
            r3 = 1
        L63:
            if (r0 != 0) goto Ld0
            if (r3 != 0) goto Ld0
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 >= 0) goto L6c
            goto Ld0
        L6c:
            if (r11 != 0) goto L9d
            r7.setCurrentMediaItemIndex(r12)
            int r11 = r8.currentAdGroupIndex
            if (r11 == r4) goto L8c
            if (r15 == 0) goto L8c
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r9 = r8.adBufferedPositionMsSupplier
            long r9 = r9.get()
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r8 = r8.adPositionMsSupplier
            long r11 = r8.get()
            long r9 = r9 - r11
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r8 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r9)
            r7.setTotalBufferedDurationMs(r8)
            goto Le9
        L8c:
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r11 = r7.setCurrentAd(r4, r4)
            long r12 = getContentBufferedPositionMsInternal(r8)
            long r12 = r12 - r9
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r8 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r12)
            r11.setTotalBufferedDurationMs(r8)
            goto Le9
        L9d:
            long r0 = getContentBufferedPositionMsInternal(r8)
            long r0 = java.lang.Math.max(r0, r13)
            r2 = 0
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r8 = r8.totalBufferedDurationMsSupplier
            long r5 = r8.get()
            long r8 = r13 - r9
            long r5 = r5 - r8
            long r8 = java.lang.Math.max(r2, r5)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r10 = r7.setCurrentMediaItemIndex(r12)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r10 = r10.setCurrentAd(r4, r4)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r10 = r10.setContentPositionMs(r13)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r11 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r10 = r10.setContentBufferedPositionMs(r11)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r8 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r8)
            r10.setTotalBufferedDurationMs(r8)
            goto Le9
        Ld0:
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r8 = r7.setCurrentMediaItemIndex(r12)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r8 = r8.setCurrentAd(r4, r4)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r8 = r8.setContentPositionMs(r13)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r9 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r13)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r8 = r8.setContentBufferedPositionMs(r9)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r9 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.ZERO
            r8.setTotalBufferedDurationMs(r9)
        Le9:
            com.google.android.exoplayer2.SimpleBasePlayer$State r7 = r7.build()
            return r7
    }

    private void clearVideoOutput(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 27
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_VIDEO_SURFACE"
            r2.<init>(r0)
            throw r2
    }

    private static long getContentBufferedPositionMsInternal(com.google.android.exoplayer2.SimpleBasePlayer.State r2) {
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r2.contentBufferedPositionMsSupplier
            long r0 = r0.get()
            long r0 = getPositionOrDefaultInMediaItem(r0, r2)
            return r0
    }

    private static long getContentPositionMsInternal(com.google.android.exoplayer2.SimpleBasePlayer.State r2) {
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r2.contentPositionMsSupplier
            long r0 = r0.get()
            long r0 = getPositionOrDefaultInMediaItem(r0, r2)
            return r0
    }

    private static int getCurrentMediaItemIndexInternal(com.google.android.exoplayer2.SimpleBasePlayer.State r1) {
            int r1 = r1.currentMediaItemIndex
            r0 = -1
            if (r1 == r0) goto L6
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static int getCurrentPeriodIndexInternal(com.google.android.exoplayer2.SimpleBasePlayer.State r6, com.google.android.exoplayer2.Timeline.Window r7, com.google.android.exoplayer2.Timeline.Period r8) {
            int r1 = getCurrentMediaItemIndexInternal(r6)
            com.google.android.exoplayer2.Timeline r0 = r6.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            return r1
        Ld:
            com.google.android.exoplayer2.Timeline r0 = r6.timeline
            long r2 = getContentPositionMsInternal(r6)
            r4 = r7
            r5 = r8
            int r6 = getPeriodIndexFromWindowPosition(r0, r1, r2, r4, r5)
            return r6
    }

    private static long getCurrentPeriodOrAdPositionMs(com.google.android.exoplayer2.SimpleBasePlayer.State r2, java.lang.Object r3, com.google.android.exoplayer2.Timeline.Period r4) {
            int r0 = r2.currentAdGroupIndex
            r1 = -1
            if (r0 == r1) goto Lc
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r2 = r2.adPositionMsSupplier
            long r2 = r2.get()
            goto L1c
        Lc:
            long r0 = getContentPositionMsInternal(r2)
            com.google.android.exoplayer2.Timeline r2 = r2.timeline
            com.google.android.exoplayer2.Timeline$Period r2 = r2.getPeriodByUid(r3, r4)
            long r2 = r2.getPositionInWindowMs()
            long r2 = r0 - r2
        L1c:
            return r2
    }

    private static com.google.android.exoplayer2.Tracks getCurrentTracksInternal(com.google.android.exoplayer2.SimpleBasePlayer.State r1) {
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r1.playlist
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.google.android.exoplayer2.Tracks r1 = com.google.android.exoplayer2.Tracks.EMPTY
            goto L19
        Lb:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r1.playlist
            int r1 = getCurrentMediaItemIndexInternal(r1)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r1 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r1
            com.google.android.exoplayer2.Tracks r1 = r1.tracks
        L19:
            return r1
    }

    private static int getMediaItemIndexInNewPlaylist(java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r2, com.google.android.exoplayer2.Timeline r3, int r4, com.google.android.exoplayer2.Timeline.Period r5) {
            boolean r0 = r2.isEmpty()
            r1 = -1
            if (r0 == 0) goto L10
            int r2 = r3.getWindowCount()
            if (r4 >= r2) goto Le
            goto Lf
        Le:
            r4 = -1
        Lf:
            return r4
        L10:
            java.lang.Object r2 = r2.get(r4)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r2 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r2
            r4 = 0
            java.lang.Object r2 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.access$4300(r2, r4)
            int r4 = r3.getIndexOfPeriod(r2)
            if (r4 != r1) goto L22
            return r1
        L22:
            com.google.android.exoplayer2.Timeline$Period r2 = r3.getPeriodByUid(r2, r5)
            int r2 = r2.windowIndex
            return r2
    }

    private static int getMediaItemTransitionReason(com.google.android.exoplayer2.SimpleBasePlayer.State r6, com.google.android.exoplayer2.SimpleBasePlayer.State r7, int r8, boolean r9, com.google.android.exoplayer2.Timeline.Window r10) {
            com.google.android.exoplayer2.Timeline r0 = r6.timeline
            com.google.android.exoplayer2.Timeline r1 = r7.timeline
            boolean r2 = r1.isEmpty()
            r3 = -1
            if (r2 == 0) goto L12
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L12
            return r3
        L12:
            boolean r1 = r1.isEmpty()
            boolean r0 = r0.isEmpty()
            r2 = 3
            if (r1 == r0) goto L1e
            return r2
        L1e:
            com.google.android.exoplayer2.Timeline r0 = r6.timeline
            int r1 = getCurrentMediaItemIndexInternal(r6)
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r10)
            java.lang.Object r0 = r0.uid
            com.google.android.exoplayer2.Timeline r1 = r7.timeline
            int r4 = getCurrentMediaItemIndexInternal(r7)
            com.google.android.exoplayer2.Timeline$Window r10 = r1.getWindow(r4, r10)
            java.lang.Object r10 = r10.uid
            boolean r1 = r0 instanceof com.google.android.exoplayer2.SimpleBasePlayer.PlaceholderUid
            if (r1 == 0) goto L3f
            boolean r1 = r10 instanceof com.google.android.exoplayer2.SimpleBasePlayer.PlaceholderUid
            if (r1 != 0) goto L3f
            return r3
        L3f:
            boolean r10 = r0.equals(r10)
            r0 = 2
            r1 = 1
            if (r10 != 0) goto L4e
            if (r8 != 0) goto L4a
            return r1
        L4a:
            if (r8 != r1) goto L4d
            return r0
        L4d:
            return r2
        L4e:
            if (r8 != 0) goto L5e
            long r4 = getContentPositionMsInternal(r6)
            long r6 = getContentPositionMsInternal(r7)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L5e
            r6 = 0
            return r6
        L5e:
            if (r8 != r1) goto L63
            if (r9 == 0) goto L63
            return r0
        L63:
            return r3
    }

    private static com.google.android.exoplayer2.MediaMetadata getMediaMetadataInternal(com.google.android.exoplayer2.SimpleBasePlayer.State r1) {
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r1.playlist
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.google.android.exoplayer2.MediaMetadata r1 = com.google.android.exoplayer2.MediaMetadata.EMPTY
            goto L1b
        Lb:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r1.playlist
            int r1 = getCurrentMediaItemIndexInternal(r1)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r1 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r1
            com.google.android.exoplayer2.MediaMetadata r1 = com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData.access$7100(r1)
        L1b:
            return r1
    }

    private static int getPeriodIndexFromWindowPosition(com.google.android.exoplayer2.Timeline r6, int r7, long r8, com.google.android.exoplayer2.Timeline.Window r10, com.google.android.exoplayer2.Timeline.Period r11) {
            long r4 = com.google.android.exoplayer2.util.Util.msToUs(r8)
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = r7
            android.util.Pair r7 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            java.lang.Object r7 = r7.first
            int r6 = r6.getIndexOfPeriod(r7)
            return r6
    }

    private static long getPeriodOrAdDurationMs(com.google.android.exoplayer2.SimpleBasePlayer.State r1, java.lang.Object r2, com.google.android.exoplayer2.Timeline.Period r3) {
            com.google.android.exoplayer2.Timeline r0 = r1.timeline
            r0.getPeriodByUid(r2, r3)
            int r2 = r1.currentAdGroupIndex
            r0 = -1
            if (r2 != r0) goto Ld
            long r1 = r3.durationUs
            goto L13
        Ld:
            int r1 = r1.currentAdIndexInAdGroup
            long r1 = r3.getAdDurationUs(r2, r1)
        L13:
            long r1 = com.google.android.exoplayer2.util.Util.usToMs(r1)
            return r1
    }

    private static int getPositionDiscontinuityReason(com.google.android.exoplayer2.SimpleBasePlayer.State r10, com.google.android.exoplayer2.SimpleBasePlayer.State r11, boolean r12, com.google.android.exoplayer2.Timeline.Window r13, com.google.android.exoplayer2.Timeline.Period r14) {
            boolean r0 = r11.hasPositionDiscontinuity
            if (r0 == 0) goto L7
            int r10 = r11.positionDiscontinuityReason
            return r10
        L7:
            if (r12 == 0) goto Lb
            r10 = 1
            return r10
        Lb:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r12 = r10.playlist
            boolean r12 = r12.isEmpty()
            r0 = -1
            if (r12 == 0) goto L15
            return r0
        L15:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r12 = r11.playlist
            boolean r12 = r12.isEmpty()
            r1 = 4
            if (r12 == 0) goto L1f
            return r1
        L1f:
            com.google.android.exoplayer2.Timeline r12 = r10.timeline
            int r2 = getCurrentPeriodIndexInternal(r10, r13, r14)
            java.lang.Object r12 = r12.getUidOfPeriod(r2)
            com.google.android.exoplayer2.Timeline r2 = r11.timeline
            int r13 = getCurrentPeriodIndexInternal(r11, r13, r14)
            java.lang.Object r13 = r2.getUidOfPeriod(r13)
            boolean r2 = r12 instanceof com.google.android.exoplayer2.SimpleBasePlayer.PlaceholderUid
            if (r2 == 0) goto L3c
            boolean r2 = r13 instanceof com.google.android.exoplayer2.SimpleBasePlayer.PlaceholderUid
            if (r2 != 0) goto L3c
            return r0
        L3c:
            boolean r2 = r13.equals(r12)
            r3 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L79
            int r2 = r10.currentAdGroupIndex
            int r6 = r11.currentAdGroupIndex
            if (r2 != r6) goto L79
            int r2 = r10.currentAdIndexInAdGroup
            int r6 = r11.currentAdIndexInAdGroup
            if (r2 == r6) goto L55
            goto L79
        L55:
            long r1 = getCurrentPeriodOrAdPositionMs(r10, r12, r14)
            long r6 = getCurrentPeriodOrAdPositionMs(r11, r13, r14)
            long r6 = r1 - r6
            long r6 = java.lang.Math.abs(r6)
            r8 = 1000(0x3e8, double:4.94E-321)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L6a
            return r0
        L6a:
            long r10 = getPeriodOrAdDurationMs(r10, r12, r14)
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L77
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 < 0) goto L77
            goto L78
        L77:
            r3 = 5
        L78:
            return r3
        L79:
            com.google.android.exoplayer2.Timeline r11 = r11.timeline
            int r11 = r11.getIndexOfPeriod(r12)
            if (r11 != r0) goto L82
            return r1
        L82:
            long r0 = getCurrentPeriodOrAdPositionMs(r10, r12, r14)
            long r10 = getPeriodOrAdDurationMs(r10, r12, r14)
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r12 < 0) goto L93
            goto L94
        L93:
            r3 = 3
        L94:
            return r3
    }

    private static com.google.android.exoplayer2.Player.PositionInfo getPositionInfo(com.google.android.exoplayer2.SimpleBasePlayer.State r12, boolean r13, com.google.android.exoplayer2.Timeline.Window r14, com.google.android.exoplayer2.Timeline.Period r15) {
            int r2 = getCurrentMediaItemIndexInternal(r12)
            com.google.android.exoplayer2.Timeline r0 = r12.timeline
            boolean r0 = r0.isEmpty()
            r1 = -1
            r3 = 0
            if (r0 != 0) goto L28
            int r0 = getCurrentPeriodIndexInternal(r12, r14, r15)
            com.google.android.exoplayer2.Timeline r3 = r12.timeline
            r4 = 1
            com.google.android.exoplayer2.Timeline$Period r15 = r3.getPeriod(r0, r15, r4)
            java.lang.Object r15 = r15.uid
            com.google.android.exoplayer2.Timeline r3 = r12.timeline
            com.google.android.exoplayer2.Timeline$Window r3 = r3.getWindow(r2, r14)
            java.lang.Object r3 = r3.uid
            com.google.android.exoplayer2.MediaItem r14 = r14.mediaItem
            r4 = r15
            r5 = r0
            goto L2b
        L28:
            r14 = r3
            r4 = r14
            r5 = -1
        L2b:
            if (r13 == 0) goto L3b
            long r6 = r12.discontinuityPositionMs
            int r13 = r12.currentAdGroupIndex
            if (r13 != r1) goto L35
            r0 = r6
            goto L39
        L35:
            long r0 = getContentPositionMsInternal(r12)
        L39:
            r8 = r0
            goto L4d
        L3b:
            long r6 = getContentPositionMsInternal(r12)
            int r13 = r12.currentAdGroupIndex
            if (r13 == r1) goto L4a
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r13 = r12.adPositionMsSupplier
            long r0 = r13.get()
            goto L4b
        L4a:
            r0 = r6
        L4b:
            r8 = r6
            r6 = r0
        L4d:
            com.google.android.exoplayer2.Player$PositionInfo r13 = new com.google.android.exoplayer2.Player$PositionInfo
            int r10 = r12.currentAdGroupIndex
            int r11 = r12.currentAdIndexInAdGroup
            r0 = r13
            r1 = r3
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            return r13
    }

    private static long getPositionOrDefaultInMediaItem(long r3, com.google.android.exoplayer2.SimpleBasePlayer.State r5) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto La
            return r3
        La:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r3 = r5.playlist
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L15
            r3 = 0
            return r3
        L15:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r3 = r5.playlist
            int r4 = getCurrentMediaItemIndexInternal(r5)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r3 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r3
            long r3 = r3.defaultPositionUs
            long r3 = com.google.android.exoplayer2.util.Util.usToMs(r3)
            return r3
    }

    private static com.google.android.exoplayer2.SimpleBasePlayer.State getStateWithNewPlaylist(com.google.android.exoplayer2.SimpleBasePlayer.State r11, java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r12, com.google.android.exoplayer2.Timeline.Period r13) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r11.buildUpon()
            r0.setPlaylist(r12)
            com.google.android.exoplayer2.Timeline r1 = com.google.android.exoplayer2.SimpleBasePlayer.State.Builder.access$100(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r2 = r11.contentPositionMsSupplier
            long r2 = r2.get()
            int r4 = getCurrentMediaItemIndexInternal(r11)
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r5 = r11.playlist
            int r5 = getMediaItemIndexInNewPlaylist(r5, r1, r4, r13)
            r6 = -1
            if (r5 != r6) goto L24
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L25
        L24:
            r7 = r2
        L25:
            r9 = 1
            int r4 = r4 + r9
        L27:
            if (r5 != r6) goto L3a
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r10 = r11.playlist
            int r10 = r10.size()
            if (r4 >= r10) goto L3a
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r5 = r11.playlist
            int r5 = getMediaItemIndexInNewPlaylist(r5, r1, r4, r13)
            int r4 = r4 + 1
            goto L27
        L3a:
            int r13 = r11.playbackState
            if (r13 == r9) goto L49
            if (r5 != r6) goto L49
            r13 = 4
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r13 = r0.setPlaybackState(r13)
            r1 = 0
            r13.setIsLoading(r1)
        L49:
            r13 = 1
            r1 = r11
            r4 = r12
            r6 = r7
            r8 = r13
            com.google.android.exoplayer2.SimpleBasePlayer$State r11 = buildStateForNewPosition(r0, r1, r2, r4, r5, r6, r8)
            return r11
    }

    private static com.google.android.exoplayer2.SimpleBasePlayer.State getStateWithNewPlaylistAndPosition(com.google.android.exoplayer2.SimpleBasePlayer.State r9, java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r10, int r11, long r12) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r9.buildUpon()
            r0.setPlaylist(r10)
            int r1 = r9.playbackState
            r2 = 1
            if (r1 == r2) goto L20
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L1c
            r1 = 4
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r0.setPlaybackState(r1)
            r2 = 0
            r1.setIsLoading(r2)
            goto L20
        L1c:
            r1 = 2
            r0.setPlaybackState(r1)
        L20:
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = r9.contentPositionMsSupplier
            long r2 = r1.get()
            r8 = 0
            r1 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            com.google.android.exoplayer2.SimpleBasePlayer$State r9 = buildStateForNewPosition(r0, r1, r2, r4, r5, r6, r8)
            return r9
    }

    private static com.google.android.exoplayer2.util.Size getSurfaceHolderSize(android.view.SurfaceHolder r2) {
            android.view.Surface r0 = r2.getSurface()
            boolean r0 = r0.isValid()
            if (r0 != 0) goto Ld
            com.google.android.exoplayer2.util.Size r2 = com.google.android.exoplayer2.util.Size.ZERO
            return r2
        Ld:
            android.graphics.Rect r2 = r2.getSurfaceFrame()
            com.google.android.exoplayer2.util.Size r0 = new com.google.android.exoplayer2.util.Size
            int r1 = r2.width()
            int r2 = r2.height()
            r0.<init>(r1, r2)
            return r0
    }

    private static int getTimelineChangeReason(java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r6, java.util.List<com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData> r7) {
            int r0 = r6.size()
            int r1 = r7.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            int r1 = r6.size()
            r3 = 1
            if (r0 >= r1) goto L3a
            java.lang.Object r1 = r6.get(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r1 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r1
            java.lang.Object r1 = r1.uid
            java.lang.Object r4 = r7.get(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r4 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r4
            java.lang.Object r4 = r4.uid
            boolean r5 = r1 instanceof com.google.android.exoplayer2.SimpleBasePlayer.PlaceholderUid
            if (r5 == 0) goto L2d
            boolean r5 = r4 instanceof com.google.android.exoplayer2.SimpleBasePlayer.PlaceholderUid
            if (r5 != 0) goto L2d
            goto L2e
        L2d:
            r3 = 0
        L2e:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L37
            if (r3 != 0) goto L37
            return r2
        L37:
            int r0 = r0 + 1
            goto Ld
        L3a:
            return r3
    }

    private static boolean isPlaying(com.google.android.exoplayer2.SimpleBasePlayer.State r2) {
            boolean r0 = r2.playWhenReady
            if (r0 == 0) goto Lf
            int r0 = r2.playbackState
            r1 = 3
            if (r0 != r1) goto Lf
            int r2 = r2.playbackSuppressionReason
            if (r2 != 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    private /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$addMediaItems$3(com.google.android.exoplayer2.SimpleBasePlayer.State r5, java.util.List r6, int r7) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r1 = r5.playlist
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.size()
            if (r1 >= r2) goto L20
            int r2 = r1 + r7
            java.lang.Object r3 = r6.get(r1)
            com.google.android.exoplayer2.MediaItem r3 = (com.google.android.exoplayer2.MediaItem) r3
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r3 = r4.getPlaceholderMediaItemData(r3)
            r0.add(r2, r3)
            int r1 = r1 + 1
            goto L8
        L20:
            com.google.android.exoplayer2.Timeline$Period r6 = r4.period
            com.google.android.exoplayer2.SimpleBasePlayer$State r5 = getStateWithNewPlaylist(r5, r0, r6)
            return r5
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$clearVideoOutput$20(com.google.android.exoplayer2.SimpleBasePlayer.State r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r1.buildUpon()
            com.google.android.exoplayer2.util.Size r0 = com.google.android.exoplayer2.util.Size.ZERO
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r1.setSurfaceSize(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r1 = r1.build()
            return r1
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$decreaseDeviceVolume$23(com.google.android.exoplayer2.SimpleBasePlayer.State r2) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r2.buildUpon()
            int r2 = r2.deviceVolume
            int r2 = r2 + (-1)
            r1 = 0
            int r2 = java.lang.Math.max(r1, r2)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r2 = r0.setDeviceVolume(r2)
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r2.build()
            return r2
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$increaseDeviceVolume$22(com.google.android.exoplayer2.SimpleBasePlayer.State r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r1.buildUpon()
            int r1 = r1.deviceVolume
            int r1 = r1 + 1
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r0.setDeviceVolume(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r1 = r1.build()
            return r1
    }

    private /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$moveMediaItems$4(com.google.android.exoplayer2.SimpleBasePlayer.State r3, int r4, int r5, int r6) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r1 = r3.playlist
            r0.<init>(r1)
            com.google.android.exoplayer2.util.Util.moveItems(r0, r4, r5, r6)
            com.google.android.exoplayer2.Timeline$Period r4 = r2.period
            com.google.android.exoplayer2.SimpleBasePlayer$State r3 = getStateWithNewPlaylist(r3, r0, r4)
            return r3
    }

    private /* synthetic */ void lambda$new$0(com.google.android.exoplayer2.Player.Listener r2, com.google.android.exoplayer2.util.FlagSet r3) {
            r1 = this;
            com.google.android.exoplayer2.Player$Events r0 = new com.google.android.exoplayer2.Player$Events
            r0.<init>(r3)
            r2.onEvents(r1, r0)
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$prepare$6(com.google.android.exoplayer2.SimpleBasePlayer.State r2) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r2.buildUpon()
            r1 = 0
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setPlayerError(r1)
            com.google.android.exoplayer2.Timeline r2 = r2.timeline
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L13
            r2 = 4
            goto L14
        L13:
            r2 = 2
        L14:
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r2 = r0.setPlaybackState(r2)
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r2.build()
            return r2
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$release$12(com.google.android.exoplayer2.SimpleBasePlayer.State r0) {
            return r0
    }

    private /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$removeMediaItems$5(com.google.android.exoplayer2.SimpleBasePlayer.State r3, int r4, int r5) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r1 = r3.playlist
            r0.<init>(r1)
            com.google.android.exoplayer2.util.Util.removeRange(r0, r4, r5)
            com.google.android.exoplayer2.Timeline$Period r4 = r2.period
            com.google.android.exoplayer2.SimpleBasePlayer$State r3 = getStateWithNewPlaylist(r3, r0, r4)
            return r3
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$seekTo$9(com.google.android.exoplayer2.SimpleBasePlayer.State r1, int r2, long r3) {
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r1.playlist
            com.google.android.exoplayer2.SimpleBasePlayer$State r1 = getStateWithNewPlaylistAndPosition(r1, r0, r2, r3)
            return r1
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setDeviceMuted$24(com.google.android.exoplayer2.SimpleBasePlayer.State r0, boolean r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setIsDeviceMuted(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setDeviceVolume$21(com.google.android.exoplayer2.SimpleBasePlayer.State r0, int r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setDeviceVolume(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setMediaItemsInternal$2(java.util.List r4, com.google.android.exoplayer2.SimpleBasePlayer.State r5, int r6, long r7) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L1c
            java.lang.Object r2 = r4.get(r1)
            com.google.android.exoplayer2.MediaItem r2 = (com.google.android.exoplayer2.MediaItem) r2
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r2 = r3.getPlaceholderMediaItemData(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L1c:
            com.google.android.exoplayer2.SimpleBasePlayer$State r4 = getStateWithNewPlaylistAndPosition(r5, r0, r6, r7)
            return r4
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setPlayWhenReady$1(com.google.android.exoplayer2.SimpleBasePlayer.State r1, boolean r2) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r1.buildUpon()
            r0 = 1
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r1.setPlayWhenReady(r2, r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r1 = r1.build()
            return r1
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setPlaybackParameters$10(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.PlaybackParameters r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setPlaybackParameters(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setPlaylistMetadata$14(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.MediaMetadata r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setPlaylistMetadata(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setRepeatMode$7(com.google.android.exoplayer2.SimpleBasePlayer.State r0, int r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setRepeatMode(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setShuffleModeEnabled$8(com.google.android.exoplayer2.SimpleBasePlayer.State r0, boolean r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setShuffleModeEnabled(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setTrackSelectionParameters$13(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setTrackSelectionParameters(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setVideoSurface$16(com.google.android.exoplayer2.SimpleBasePlayer.State r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r1.buildUpon()
            com.google.android.exoplayer2.util.Size r0 = com.google.android.exoplayer2.util.Size.UNKNOWN
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r1 = r1.setSurfaceSize(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r1 = r1.build()
            return r1
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setVideoSurfaceHolder$17(com.google.android.exoplayer2.SimpleBasePlayer.State r0, android.view.SurfaceHolder r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.util.Size r1 = getSurfaceHolderSize(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setSurfaceSize(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setVideoSurfaceView$18(com.google.android.exoplayer2.SimpleBasePlayer.State r0, android.view.SurfaceView r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            android.view.SurfaceHolder r1 = r1.getHolder()
            com.google.android.exoplayer2.util.Size r1 = getSurfaceHolderSize(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setSurfaceSize(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setVideoTextureView$19(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.util.Size r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setSurfaceSize(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$setVolume$15(com.google.android.exoplayer2.SimpleBasePlayer.State r0, float r1) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setVolume(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.SimpleBasePlayer.State lambda$stop$11(com.google.android.exoplayer2.SimpleBasePlayer.State r3) {
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r3.buildUpon()
            r1 = 1
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setPlaybackState(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.ZERO
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setTotalBufferedDurationMs(r1)
            long r1 = getContentPositionMsInternal(r3)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r1 = com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier.CC.getConstant(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r0 = r0.setContentBufferedPositionMs(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r3 = r3.adPositionMsSupplier
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r3 = r0.setAdBufferedPositionMs(r3)
            r0 = 0
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r3 = r3.setIsLoading(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r3 = r3.build()
            return r3
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$25(com.google.android.exoplayer2.SimpleBasePlayer.State r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            r2.onTimelineChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$26(int r0, com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.Listener r3) {
            r3.onPositionDiscontinuity(r0)
            r3.onPositionDiscontinuity(r1, r2, r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$27(com.google.android.exoplayer2.MediaItem r0, int r1, com.google.android.exoplayer2.Player.Listener r2) {
            r2.onMediaItemTransition(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$28(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.PlaybackException r0 = r0.playerError
            r1.onPlayerErrorChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$29(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.PlaybackException r0 = r0.playerError
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.PlaybackException r0 = (com.google.android.exoplayer2.PlaybackException) r0
            r1.onPlayerError(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$30(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.trackSelectionParameters
            r1.onTrackSelectionParametersChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$31(com.google.android.exoplayer2.Tracks r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onTracksChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$32(com.google.android.exoplayer2.MediaMetadata r0, com.google.android.exoplayer2.Player.Listener r1) {
            r1.onMediaMetadataChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$33(com.google.android.exoplayer2.SimpleBasePlayer.State r1, com.google.android.exoplayer2.Player.Listener r2) {
            boolean r0 = r1.isLoading
            r2.onLoadingChanged(r0)
            boolean r1 = r1.isLoading
            r2.onIsLoadingChanged(r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$34(com.google.android.exoplayer2.SimpleBasePlayer.State r1, com.google.android.exoplayer2.Player.Listener r2) {
            boolean r0 = r1.playWhenReady
            int r1 = r1.playbackState
            r2.onPlayerStateChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$35(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            int r0 = r0.playbackState
            r1.onPlaybackStateChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$36(com.google.android.exoplayer2.SimpleBasePlayer.State r1, com.google.android.exoplayer2.Player.Listener r2) {
            boolean r0 = r1.playWhenReady
            int r1 = r1.playWhenReadyChangeReason
            r2.onPlayWhenReadyChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$37(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            int r0 = r0.playbackSuppressionReason
            r1.onPlaybackSuppressionReasonChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$38(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            boolean r0 = isPlaying(r0)
            r1.onIsPlayingChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$39(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            r1.onPlaybackParametersChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$40(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            int r0 = r0.repeatMode
            r1.onRepeatModeChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$41(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            boolean r0 = r0.shuffleModeEnabled
            r1.onShuffleModeEnabledChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$42(com.google.android.exoplayer2.SimpleBasePlayer.State r2, com.google.android.exoplayer2.Player.Listener r3) {
            long r0 = r2.seekBackIncrementMs
            r3.onSeekBackIncrementChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$43(com.google.android.exoplayer2.SimpleBasePlayer.State r2, com.google.android.exoplayer2.Player.Listener r3) {
            long r0 = r2.seekForwardIncrementMs
            r3.onSeekForwardIncrementChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$44(com.google.android.exoplayer2.SimpleBasePlayer.State r2, com.google.android.exoplayer2.Player.Listener r3) {
            long r0 = r2.maxSeekToPreviousPositionMs
            r3.onMaxSeekToPreviousPositionChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$45(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r0.audioAttributes
            r1.onAudioAttributesChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$46(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.video.VideoSize r0 = r0.videoSize
            r1.onVideoSizeChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$47(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.DeviceInfo r0 = r0.deviceInfo
            r1.onDeviceInfoChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$48(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.MediaMetadata r0 = r0.playlistMetadata
            r1.onPlaylistMetadataChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$49(com.google.android.exoplayer2.SimpleBasePlayer.State r1, com.google.android.exoplayer2.Player.Listener r2) {
            com.google.android.exoplayer2.util.Size r0 = r1.surfaceSize
            int r0 = r0.getWidth()
            com.google.android.exoplayer2.util.Size r1 = r1.surfaceSize
            int r1 = r1.getHeight()
            r2.onSurfaceSizeChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$50(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            float r0 = r0.volume
            r1.onVolumeChanged(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$51(com.google.android.exoplayer2.SimpleBasePlayer.State r1, com.google.android.exoplayer2.Player.Listener r2) {
            int r0 = r1.deviceVolume
            boolean r1 = r1.isDeviceMuted
            r2.onDeviceVolumeChanged(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$52(com.google.android.exoplayer2.SimpleBasePlayer.State r1, com.google.android.exoplayer2.Player.Listener r2) {
            com.google.android.exoplayer2.text.CueGroup r0 = r1.currentCues
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> r0 = r0.cues
            r2.onCues(r0)
            com.google.android.exoplayer2.text.CueGroup r1 = r1.currentCues
            r2.onCues(r1)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$53(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.metadata.Metadata r0 = r0.timedMetadata
            r1.onMetadata(r0)
            return
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$54(com.google.android.exoplayer2.SimpleBasePlayer.State r0, com.google.android.exoplayer2.Player.Listener r1) {
            com.google.android.exoplayer2.Player$Commands r0 = r0.availableCommands
            r1.onAvailableCommandsChanged(r0)
            return
    }

    private /* synthetic */ void lambda$updateStateForPendingOperation$55(com.google.common.util.concurrent.ListenableFuture r2) {
            r1 = this;
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> r0 = r1.pendingOperations
            r0.remove(r2)
            java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> r2 = r1.pendingOperations
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1e
            boolean r2 = r1.released
            if (r2 != 0) goto L1e
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r1.getState()
            r0 = 0
            r1.updateStateAndInformListeners(r2, r0, r0)
        L1e:
            return
    }

    private void postOrRunOnApplicationHandler(java.lang.Runnable r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.applicationHandler
            android.os.Looper r0 = r0.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L10
            r3.run()
            goto L15
        L10:
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.applicationHandler
            r0.post(r3)
        L15:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void setMediaItemsInternal(java.util.List<com.google.android.exoplayer2.MediaItem> r1, int r2, long r3) {
            r0 = this;
            r3 = 1
            r4 = -1
            if (r2 == r4) goto L9
            if (r2 < 0) goto L7
            goto L9
        L7:
            r2 = 0
            goto La
        L9:
            r2 = 1
        La:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            r2 = 20
            boolean r2 = r0.shouldHandleCommand(r2)
            if (r2 != 0) goto L24
            int r1 = r1.size()
            if (r1 != r3) goto L23
            r1 = 31
            boolean r1 = r0.shouldHandleCommand(r1)
            if (r1 != 0) goto L24
        L23:
            return
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)"
            r1.<init>(r2)
            throw r1
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private boolean shouldHandleCommand(int r2) {
            r1 = this;
            boolean r0 = r1.released
            if (r0 != 0) goto L10
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.Player$Commands r0 = r0.availableCommands
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateAndInformListeners(com.google.android.exoplayer2.SimpleBasePlayer.State r18, boolean r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r0.state
            r0.state = r1
            boolean r3 = r1.hasPositionDiscontinuity
            r4 = 0
            if (r3 != 0) goto L11
            boolean r3 = r1.newlyRenderedFirstFrame
            if (r3 == 0) goto L23
        L11:
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r3 = r18.buildUpon()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r3 = r3.clearPositionDiscontinuity()
            com.google.android.exoplayer2.SimpleBasePlayer$State$Builder r3 = r3.setNewlyRenderedFirstFrame(r4)
            com.google.android.exoplayer2.SimpleBasePlayer$State r3 = r3.build()
            r0.state = r3
        L23:
            boolean r3 = r2.playWhenReady
            boolean r5 = r1.playWhenReady
            if (r3 == r5) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            int r5 = r2.playbackState
            int r6 = r1.playbackState
            if (r5 == r6) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            com.google.android.exoplayer2.Tracks r6 = getCurrentTracksInternal(r2)
            com.google.android.exoplayer2.Tracks r7 = getCurrentTracksInternal(r18)
            com.google.android.exoplayer2.MediaMetadata r8 = getMediaMetadataInternal(r2)
            com.google.android.exoplayer2.MediaMetadata r9 = getMediaMetadataInternal(r18)
            com.google.android.exoplayer2.Timeline$Window r10 = r0.window
            com.google.android.exoplayer2.Timeline$Period r11 = r0.period
            r12 = r19
            int r10 = getPositionDiscontinuityReason(r2, r1, r12, r10, r11)
            com.google.android.exoplayer2.Timeline r11 = r2.timeline
            com.google.android.exoplayer2.Timeline r12 = r1.timeline
            boolean r11 = r11.equals(r12)
            r11 = r11 ^ 1
            com.google.android.exoplayer2.Timeline$Window r12 = r0.window
            r13 = r20
            int r12 = getMediaItemTransitionReason(r2, r1, r10, r13, r12)
            r13 = 2
            if (r11 == 0) goto L76
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r11 = r2.playlist
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r14 = r1.playlist
            int r11 = getTimelineChangeReason(r11, r14)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r14 = r0.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda5 r15 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda5
            r15.<init>(r1, r11, r13)
            r14.queueEvent(r4, r15)
        L76:
            r11 = 11
            r13 = -1
            if (r10 == r13) goto L9b
            com.google.android.exoplayer2.Timeline$Window r13 = r0.window
            com.google.android.exoplayer2.Timeline$Period r14 = r0.period
            com.google.android.exoplayer2.Player$PositionInfo r4 = getPositionInfo(r2, r4, r13, r14)
            boolean r13 = r1.hasPositionDiscontinuity
            com.google.android.exoplayer2.Timeline$Window r14 = r0.window
            com.google.android.exoplayer2.Timeline$Period r15 = r0.period
            com.google.android.exoplayer2.Player$PositionInfo r13 = getPositionInfo(r1, r13, r14, r15)
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r14 = r0.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda1 r15 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda1
            r16 = r5
            r5 = 1
            r15.<init>(r10, r4, r13, r5)
            r14.queueEvent(r11, r15)
            goto L9d
        L9b:
            r16 = r5
        L9d:
            r4 = -1
            if (r12 == r4) goto Lc3
            com.google.android.exoplayer2.Timeline r4 = r1.timeline
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Laa
            r4 = 0
            goto Lb8
        Laa:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r4 = r1.playlist
            int r5 = getCurrentMediaItemIndexInternal(r18)
            java.lang.Object r4 = r4.get(r5)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r4 = (com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData) r4
            com.google.android.exoplayer2.MediaItem r4 = r4.mediaItem
        Lb8:
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r0.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda2 r13 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda2
            r14 = 1
            r13.<init>(r4, r12, r14)
            r5.queueEvent(r14, r13)
        Lc3:
            com.google.android.exoplayer2.PlaybackException r4 = r2.playerError
            com.google.android.exoplayer2.PlaybackException r5 = r1.playerError
            boolean r4 = com.google.android.exoplayer2.util.Util.areEqual(r4, r5)
            r5 = 10
            if (r4 != 0) goto Le0
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r0.listeners
            r12 = 0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r12, r4, r5)
            com.google.android.exoplayer2.PlaybackException r4 = r1.playerError
            if (r4 == 0) goto Le0
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r0.listeners
            r12 = 21
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r12, r4, r5)
        Le0:
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4 = r2.trackSelectionParameters
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r12 = r1.trackSelectionParameters
            boolean r4 = r4.equals(r12)
            r12 = 22
            r13 = 19
            if (r4 != 0) goto Lf3
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r12, r4, r13)
        Lf3:
            boolean r4 = r6.equals(r7)
            r6 = 8
            if (r4 != 0) goto L106
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r0.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9 r13 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
            r13.<init>(r7, r6)
            r7 = 2
            r4.queueEvent(r7, r13)
        L106:
            boolean r4 = r8.equals(r9)
            r7 = 14
            if (r4 != 0) goto L119
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r0.listeners
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda3 r8 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda3
            r13 = 1
            r8.<init>(r9, r13)
            r4.queueEvent(r7, r8)
        L119:
            boolean r4 = r2.isLoading
            boolean r7 = r1.isLoading
            r8 = 3
            if (r4 == r7) goto L127
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r0.listeners
            r7 = 23
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7, r4, r8)
        L127:
            r4 = 24
            if (r3 != 0) goto L12d
            if (r16 == 0) goto L133
        L12d:
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r7 = r0.listeners
            r9 = -1
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r7, r9)
        L133:
            r7 = 4
            if (r16 == 0) goto L13c
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r9 = r0.listeners
            r13 = 1
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r13, r9, r7)
        L13c:
            r9 = 5
            if (r3 != 0) goto L145
            int r3 = r2.playWhenReadyChangeReason
            int r13 = r1.playWhenReadyChangeReason
            if (r3 == r13) goto L14b
        L145:
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            r13 = 2
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r13, r3, r9)
        L14b:
            int r3 = r2.playbackSuppressionReason
            int r13 = r1.playbackSuppressionReason
            r14 = 6
            if (r3 == r13) goto L157
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r8, r3, r14)
        L157:
            boolean r3 = isPlaying(r2)
            boolean r8 = isPlaying(r18)
            r13 = 7
            if (r3 == r8) goto L167
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7, r3, r13)
        L167:
            com.google.android.exoplayer2.PlaybackParameters r3 = r2.playbackParameters
            com.google.android.exoplayer2.PlaybackParameters r7 = r1.playbackParameters
            boolean r3 = r3.equals(r7)
            r7 = 12
            if (r3 != 0) goto L178
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r9, r3, r7)
        L178:
            int r3 = r2.repeatMode
            int r7 = r1.repeatMode
            if (r3 == r7) goto L183
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r14, r3, r6)
        L183:
            boolean r3 = r2.shuffleModeEnabled
            boolean r7 = r1.shuffleModeEnabled
            r8 = 9
            if (r3 == r7) goto L190
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r13, r3, r8)
        L190:
            long r13 = r2.seekBackIncrementMs
            long r11 = r1.seekBackIncrementMs
            r3 = 16
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 == 0) goto L19f
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r7 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r7, r3)
        L19f:
            long r6 = r2.seekForwardIncrementMs
            long r11 = r1.seekForwardIncrementMs
            r9 = 17
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 == 0) goto L1ae
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r6 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r8, r6, r9)
        L1ae:
            long r6 = r2.maxSeekToPreviousPositionMs
            long r11 = r1.maxSeekToPreviousPositionMs
            r8 = 18
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 == 0) goto L1bd
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r6 = r0.listeners
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r6, r8)
        L1bd:
            com.google.android.exoplayer2.audio.AudioAttributes r5 = r2.audioAttributes
            com.google.android.exoplayer2.audio.AudioAttributes r6 = r1.audioAttributes
            boolean r5 = r5.equals(r6)
            r6 = 20
            if (r5 != 0) goto L1d0
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r0.listeners
            r7 = 11
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7, r5, r6)
        L1d0:
            com.google.android.exoplayer2.video.VideoSize r5 = r2.videoSize
            com.google.android.exoplayer2.video.VideoSize r7 = r1.videoSize
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L1e3
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r0.listeners
            r7 = 25
            r11 = 12
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r11, r5, r7)
        L1e3:
            com.google.android.exoplayer2.DeviceInfo r5 = r2.deviceInfo
            com.google.android.exoplayer2.DeviceInfo r7 = r1.deviceInfo
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L1f6
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r0.listeners
            r7 = 29
            r11 = 13
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r11, r5, r7)
        L1f6:
            com.google.android.exoplayer2.MediaMetadata r5 = r2.playlistMetadata
            com.google.android.exoplayer2.MediaMetadata r7 = r1.playlistMetadata
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L209
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r0.listeners
            r7 = 15
            r11 = 14
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r11, r5, r7)
        L209:
            boolean r5 = r1.newlyRenderedFirstFrame
            if (r5 == 0) goto L216
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r0.listeners
            r7 = 26
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r11 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$18
            r5.queueEvent(r7, r11)
        L216:
            com.google.android.exoplayer2.util.Size r5 = r2.surfaceSize
            com.google.android.exoplayer2.util.Size r7 = r1.surfaceSize
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L227
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r5 = r0.listeners
            r7 = 15
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7, r5, r4)
        L227:
            float r4 = r2.volume
            float r5 = r1.volume
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L236
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r4 = r0.listeners
            r5 = 22
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r4, r5)
        L236:
            int r3 = r2.deviceVolume
            int r4 = r1.deviceVolume
            if (r3 != r4) goto L242
            boolean r3 = r2.isDeviceMuted
            boolean r4 = r1.isDeviceMuted
            if (r3 == r4) goto L249
        L242:
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            r4 = 30
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r9, r3, r4)
        L249:
            com.google.android.exoplayer2.text.CueGroup r3 = r2.currentCues
            com.google.android.exoplayer2.text.CueGroup r4 = r1.currentCues
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L25a
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            r4 = 27
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r8, r3, r4)
        L25a:
            com.google.android.exoplayer2.metadata.Metadata r3 = r2.timedMetadata
            com.google.android.exoplayer2.metadata.Metadata r4 = r1.timedMetadata
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L27a
            com.google.android.exoplayer2.metadata.Metadata r3 = r1.timedMetadata
            long r3 = r3.presentationTimeUs
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L27a
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            r4 = 28
            r5 = 19
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5, r3, r4)
        L27a:
            r3 = 1
            if (r10 != r3) goto L285
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r3 = r0.listeners
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r4 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$19
            r5 = -1
            r3.queueEvent(r5, r4)
        L285:
            com.google.android.exoplayer2.Player$Commands r2 = r2.availableCommands
            com.google.android.exoplayer2.Player$Commands r3 = r1.availableCommands
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L296
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r2 = r0.listeners
            r3 = 13
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r2, r3)
        L296:
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r1 = r0.listeners
            r1.flushEvents()
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateForPendingOperation(com.google.common.util.concurrent.ListenableFuture<?> r2, com.google.common.base.Supplier<com.google.android.exoplayer2.SimpleBasePlayer.State> r3) {
            r1 = this;
            r0 = 0
            r1.updateStateForPendingOperation(r2, r3, r0, r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateForPendingOperation(com.google.common.util.concurrent.ListenableFuture<?> r2, com.google.common.base.Supplier<com.google.android.exoplayer2.SimpleBasePlayer.State> r3, boolean r4, boolean r5) {
            r1 = this;
            boolean r0 = r2.isDone()
            if (r0 == 0) goto L16
            java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> r0 = r1.pendingOperations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r1.getState()
            r1.updateStateAndInformListeners(r2, r4, r5)
            goto L32
        L16:
            java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> r0 = r1.pendingOperations
            r0.add(r2)
            java.lang.Object r3 = r3.get()
            com.google.android.exoplayer2.SimpleBasePlayer$State r3 = (com.google.android.exoplayer2.SimpleBasePlayer.State) r3
            r1.updateStateAndInformListeners(r3, r4, r5)
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda11 r3 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda11
            r4 = 2
            r3.<init>(r1, r2, r4)
            com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda3 r4 = new com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda3
            r4.<init>(r1)
            r2.addListener(r3, r4)
        L32:
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"state"})
    private void verifyApplicationThreadAndInitState() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = r3.applicationLooper
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L17
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r3.state
            if (r0 != 0) goto L16
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r3.getState()
            r3.state = r0
        L16:
            return
        L17:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            r1 = 1
            android.os.Looper r2 = r3.applicationLooper
            java.lang.Thread r2 = r2.getThread()
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            java.lang.String r1 = "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.formatInvariant(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addListener(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r1.listeners
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.Player$Listener r2 = (com.google.android.exoplayer2.Player.Listener) r2
            r0.add(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(int r3, java.util.List<com.google.android.exoplayer2.MediaItem> r4) {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            if (r3 < 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r0.playlist
            int r0 = r0.size()
            r1 = 20
            boolean r1 = r2.shouldHandleCommand(r1)
            if (r1 == 0) goto L2d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L22
            goto L2d
        L22:
            java.lang.Math.min(r3, r0)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS"
            r3.<init>(r4)
            throw r3
        L2d:
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface() {
            r1 = this;
            r0 = 0
            r1.clearVideoOutput(r0)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface(@androidx.annotation.Nullable android.view.Surface r1) {
            r0 = this;
            r0.clearVideoOutput(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r1) {
            r0 = this;
            r0.clearVideoOutput(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r1) {
            r0 = this;
            r0.clearVideoOutput(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r1) {
            r0 = this;
            r0.clearVideoOutput(r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void decreaseDeviceVolume() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            r0 = 26
            boolean r0 = r2.shouldHandleCommand(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final android.os.Looper getApplicationLooper() {
            r1 = this;
            android.os.Looper r0 = r1.applicationLooper
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r0.audioAttributes
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.Player.Commands getAvailableCommands() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.Player$Commands r0 = r0.availableCommands
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getBufferedPosition() {
            r4 = this;
            r4.verifyApplicationThreadAndInitState()
            boolean r0 = r4.isPlayingAd()
            if (r0 == 0) goto L1e
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r4.state
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.adBufferedPositionMsSupplier
            long r0 = r0.get()
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r4.state
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r2 = r2.adPositionMsSupplier
            long r2 = r2.get()
            long r0 = java.lang.Math.max(r0, r2)
            goto L22
        L1e:
            long r0 = r4.getContentBufferedPosition()
        L22:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentBufferedPosition() {
            r4 = this;
            r4.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r4.state
            long r0 = getContentBufferedPositionMsInternal(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r4.state
            long r2 = getContentPositionMsInternal(r2)
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            long r0 = getContentPositionMsInternal(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            int r0 = r0.currentAdGroupIndex
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            int r0 = r0.currentAdIndexInAdGroup
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public final com.google.android.exoplayer2.text.CueGroup getCurrentCues() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.text.CueGroup r0 = r0.currentCues
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentMediaItemIndex() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            int r0 = getCurrentMediaItemIndexInternal(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
            r3 = this;
            r3.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r3.state
            com.google.android.exoplayer2.Timeline$Window r1 = r3.window
            com.google.android.exoplayer2.Timeline$Period r2 = r3.period
            int r0 = getCurrentPeriodIndexInternal(r0, r1, r2)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            boolean r0 = r2.isPlayingAd()
            if (r0 == 0) goto L12
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.adPositionMsSupplier
            long r0 = r0.get()
            goto L16
        L12:
            long r0 = r2.getContentPosition()
        L16:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.Timeline getCurrentTimeline() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.Tracks getCurrentTracks() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.Tracks r0 = getCurrentTracksInternal(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final com.google.android.exoplayer2.DeviceInfo getDeviceInfo() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.DeviceInfo r0 = r0.deviceInfo
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final int getDeviceVolume() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            int r0 = r0.deviceVolume
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
            r3 = this;
            r3.verifyApplicationThreadAndInitState()
            boolean r0 = r3.isPlayingAd()
            if (r0 == 0) goto L27
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r3.state
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            int r1 = r3.getCurrentPeriodIndex()
            com.google.android.exoplayer2.Timeline$Period r2 = r3.period
            r0.getPeriod(r1, r2)
            com.google.android.exoplayer2.Timeline$Period r0 = r3.period
            com.google.android.exoplayer2.SimpleBasePlayer$State r1 = r3.state
            int r2 = r1.currentAdGroupIndex
            int r1 = r1.currentAdIndexInAdGroup
            long r0 = r0.getAdDurationUs(r2, r1)
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            return r0
        L27:
            long r0 = r3.getContentDuration()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getMaxSeekToPreviousPosition() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            long r0 = r0.maxSeekToPreviousPositionMs
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.MediaMetadata getMediaMetadata() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.MediaMetadata r0 = getMediaMetadataInternal(r0)
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    public final com.google.android.exoplayer2.SimpleBasePlayer.MediaItemData getPlaceholderMediaItemData(com.google.android.exoplayer2.MediaItem r4) {
            r3 = this;
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData$Builder r0 = new com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData$Builder
            com.google.android.exoplayer2.SimpleBasePlayer$PlaceholderUid r1 = new com.google.android.exoplayer2.SimpleBasePlayer$PlaceholderUid
            r2 = 0
            r1.<init>(r2)
            r0.<init>(r1)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData$Builder r4 = r0.setMediaItem(r4)
            r0 = 1
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData$Builder r4 = r4.setIsDynamic(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData$Builder r4 = r4.setIsPlaceholder(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData r4 = r4.build()
            return r4
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            boolean r0 = r0.playWhenReady
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            int r0 = r0.playbackState
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackSuppressionReason() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            int r0 = r0.playbackSuppressionReason
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.PlaybackException getPlayerError() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.PlaybackException r0 = r0.playerError
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.MediaMetadata r0 = r0.playlistMetadata
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getRepeatMode() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            int r0 = r0.repeatMode
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekBackIncrement() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            long r0 = r0.seekBackIncrementMs
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekForwardIncrement() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            long r0 = r0.seekForwardIncrementMs
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            boolean r0 = r0.shuffleModeEnabled
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract com.google.android.exoplayer2.SimpleBasePlayer.State getState();

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.util.Size getSurfaceSize() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.util.Size r0 = r0.surfaceSize
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getTotalBufferedDuration() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r0 = r0.totalBufferedDurationMsSupplier
            long r0 = r0.get()
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r0.trackSelectionParameters
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final com.google.android.exoplayer2.video.VideoSize getVideoSize() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            com.google.android.exoplayer2.video.VideoSize r0 = r0.videoSize
            return r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final float getVolume() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            float r0 = r0.volume
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    public com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_PLAY_PAUSE"
            r2.<init>(r0)
            throw r2
    }

    @com.google.errorprone.annotations.ForOverride
    public final com.google.common.util.concurrent.ListenableFuture handleSetVideoOutput() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing implementation to handle COMMAND_SET_VIDEO_SURFACE"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void increaseDeviceVolume() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            r0 = 26
            boolean r0 = r2.shouldHandleCommand(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final boolean isDeviceMuted() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            boolean r0 = r0.isDeviceMuted
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isLoading() {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r1.state
            boolean r0 = r0.isLoading
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            int r0 = r0.currentAdGroupIndex
            r1 = -1
            if (r0 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItems(int r4, int r5, int r6) {
            r3 = this;
            r3.verifyApplicationThreadAndInitState()
            if (r4 < 0) goto Lb
            if (r5 < r4) goto Lb
            if (r6 < 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r3.state
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r1 = r0.playlist
            int r1 = r1.size()
            r2 = 20
            boolean r2 = r3.shouldHandleCommand(r2)
            if (r2 == 0) goto L42
            if (r1 == 0) goto L42
            if (r4 < r1) goto L24
            goto L42
        L24:
            int r5 = java.lang.Math.min(r5, r1)
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r0.playlist
            int r0 = r0.size()
            int r1 = r5 - r4
            int r0 = r0 - r1
            int r6 = java.lang.Math.min(r6, r0)
            if (r4 == r5) goto L42
            if (r6 != r4) goto L3a
            goto L42
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS"
            r4.<init>(r5)
            throw r4
        L42:
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            r0 = 2
            boolean r0 = r2.shouldHandleCommand(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing implementation to handle COMMAND_PREPARE"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final void release() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            boolean r0 = r2.released
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing implementation to handle COMMAND_RELEASE"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeListener(com.google.android.exoplayer2.Player.Listener r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player$Listener> r0 = r1.listeners
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItems(int r3, int r4) {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            if (r3 < 0) goto L9
            if (r4 < r3) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r2.state
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r0 = r0.playlist
            int r0 = r0.size()
            r1 = 20
            boolean r1 = r2.shouldHandleCommand(r1)
            if (r1 == 0) goto L31
            if (r0 == 0) goto L31
            if (r3 < r0) goto L22
            goto L31
        L22:
            int r4 = java.lang.Math.min(r4, r0)
            if (r3 != r4) goto L29
            return
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS"
            r3.<init>(r4)
            throw r3
        L31:
            return
    }

    @Override // com.google.android.exoplayer2.BasePlayer
    @androidx.annotation.VisibleForTesting(otherwise = 4)
    public final void seekTo(int r1, long r2, int r4, boolean r5) {
            r0 = this;
            r0.verifyApplicationThreadAndInitState()
            if (r1 < 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            com.google.android.exoplayer2.SimpleBasePlayer$State r2 = r0.state
            boolean r3 = r0.shouldHandleCommand(r4)
            if (r3 == 0) goto L32
            boolean r3 = r0.isPlayingAd()
            if (r3 != 0) goto L32
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r3 = r2.playlist
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2a
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.SimpleBasePlayer$MediaItemData> r2 = r2.playlist
            int r2 = r2.size()
            if (r1 < r2) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing implementation to handle one of the COMMAND_SEEK_*"
            r1.<init>(r2)
            throw r1
        L32:
            return
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void setDeviceMuted(boolean r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 26
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void setDeviceVolume(int r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 25
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_DEVICE_VOLUME"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r3, int r4, long r5) {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            r0 = -1
            if (r4 != r0) goto L12
            com.google.android.exoplayer2.SimpleBasePlayer$State r4 = r2.state
            int r5 = r4.currentMediaItemIndex
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r4 = r4.contentPositionMsSupplier
            long r0 = r4.get()
            r4 = r5
            r5 = r0
        L12:
            r2.setMediaItemsInternal(r3, r4, r5)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r4, boolean r5) {
            r3 = this;
            r3.verifyApplicationThreadAndInitState()
            if (r5 == 0) goto L7
            r0 = -1
            goto Lb
        L7:
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r3.state
            int r0 = r0.currentMediaItemIndex
        Lb:
            if (r5 == 0) goto L13
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L1b
        L13:
            com.google.android.exoplayer2.SimpleBasePlayer$State r5 = r3.state
            com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier r5 = r5.contentPositionMsSupplier
            long r1 = r5.get()
        L1b:
            r3.setMediaItemsInternal(r4, r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlayWhenReady(boolean r4) {
            r3 = this;
            r3.verifyApplicationThreadAndInitState()
            com.google.android.exoplayer2.SimpleBasePlayer$State r0 = r3.state
            r1 = 1
            boolean r1 = r3.shouldHandleCommand(r1)
            if (r1 != 0) goto Ld
            return
        Ld:
            com.google.common.util.concurrent.ListenableFuture r1 = r3.handleSetPlayWhenReady(r4)
            com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda2 r2 = new com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda2
            r2.<init>(r0, r4)
            r3.updateStateForPendingOperation(r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 13
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 19
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_MEDIA_ITEMS_METADATA"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setRepeatMode(int r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 15
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_REPEAT_MODE"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setShuffleModeEnabled(boolean r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 14
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_SHUFFLE_MODE"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 29
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurface(@androidx.annotation.Nullable android.view.Surface r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r0 = 27
            boolean r0 = r1.shouldHandleCommand(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            if (r2 != 0) goto L12
            r1.clearVideoSurface()
            return
        L12:
            r1.handleSetVideoOutput()
            r2 = 0
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r0 = 27
            boolean r0 = r1.shouldHandleCommand(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            if (r2 != 0) goto L12
            r1.clearVideoSurface()
            return
        L12:
            r1.handleSetVideoOutput()
            r2 = 0
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r0 = 27
            boolean r0 = r1.shouldHandleCommand(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            if (r2 != 0) goto L12
            r1.clearVideoSurface()
            return
        L12:
            r1.handleSetVideoOutput()
            r2 = 0
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r3) {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            r0 = 27
            boolean r0 = r2.shouldHandleCommand(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            if (r3 != 0) goto L12
            r2.clearVideoSurface()
            return
        L12:
            boolean r0 = r3.isAvailable()
            if (r0 == 0) goto L26
            com.google.android.exoplayer2.util.Size r0 = new com.google.android.exoplayer2.util.Size
            int r1 = r3.getWidth()
            int r3 = r3.getHeight()
            r0.<init>(r1, r3)
            goto L28
        L26:
            com.google.android.exoplayer2.util.Size r3 = com.google.android.exoplayer2.util.Size.ZERO
        L28:
            r2.handleSetVideoOutput()
            r3 = 0
            throw r3
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final void setVolume(float r2) {
            r1 = this;
            r1.verifyApplicationThreadAndInitState()
            r2 = 24
            boolean r2 = r1.shouldHandleCommand(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing implementation to handle COMMAND_SET_VOLUME"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
            r2 = this;
            r2.verifyApplicationThreadAndInitState()
            r0 = 3
            boolean r0 = r2.shouldHandleCommand(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing implementation to handle COMMAND_STOP"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop(boolean r1) {
            r0 = this;
            r0.stop()
            if (r1 == 0) goto L8
            r0.clearMediaItems()
        L8:
            return
    }
}
