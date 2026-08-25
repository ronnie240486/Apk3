package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternal implements android.os.Handler.Callback, com.google.android.exoplayer2.source.MediaPeriod.Callback, com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener, com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener, com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener, com.google.android.exoplayer2.PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_OFFLOAD_SCHEDULING_ENABLED = 24;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final java.lang.String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;
    private final com.google.android.exoplayer2.util.Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final com.google.android.exoplayer2.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final com.google.android.exoplayer2.util.HandlerWrapper handler;

    @androidx.annotation.Nullable
    private final android.os.HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final com.google.android.exoplayer2.LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final com.google.android.exoplayer2.LoadControl loadControl;
    private final com.google.android.exoplayer2.DefaultMediaClock mediaClock;
    private final com.google.android.exoplayer2.MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition pendingInitialSeekPosition;
    private final java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ExoPlaybackException pendingRecoverableRendererError;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private com.google.android.exoplayer2.PlaybackInfo playbackInfo;
    private com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate;
    private final com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final android.os.Looper playbackLooper;
    private long playbackMaybeBecameStuckAtMs;
    private final com.google.android.exoplayer2.MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final com.google.android.exoplayer2.Renderer[] renderers;
    private final java.util.Set<com.google.android.exoplayer2.Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private com.google.android.exoplayer2.SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector;
    private final com.google.android.exoplayer2.Timeline.Window window;


    public static final class MediaSourceListUpdateMessage {
        private final java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> r1, com.google.android.exoplayer2.source.ShuffleOrder r2, int r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.mediaSourceHolders = r1
                r0.shuffleOrder = r2
                r0.windowIndex = r3
                r0.positionUs = r4
                return
        }

        public /* synthetic */ MediaSourceListUpdateMessage(java.util.List r1, com.google.android.exoplayer2.source.ShuffleOrder r2, int r3, long r4, com.google.android.exoplayer2.ExoPlayerImplInternal.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ int access$200(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage r0) {
                int r0 = r0.windowIndex
                return r0
        }

        public static /* synthetic */ java.util.List access$300(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage r0) {
                java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r0.mediaSourceHolders
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.ShuffleOrder access$400(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage r0) {
                com.google.android.exoplayer2.source.ShuffleOrder r0 = r0.shuffleOrder
                return r0
        }

        public static /* synthetic */ long access$500(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage r2) {
                long r0 = r2.positionUs
                return r0
        }
    }

    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int r1, int r2, int r3, com.google.android.exoplayer2.source.ShuffleOrder r4) {
                r0 = this;
                r0.<init>()
                r0.fromIndex = r1
                r0.toIndex = r2
                r0.newFromIndex = r3
                r0.shuffleOrder = r4
                return
        }
    }

    public static final class PendingMessageInfo implements java.lang.Comparable<com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo> {
        public final com.google.android.exoplayer2.PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;

        @androidx.annotation.Nullable
        public java.lang.Object resolvedPeriodUid;

        public PendingMessageInfo(com.google.android.exoplayer2.PlayerMessage r1) {
                r0 = this;
                r0.<init>()
                r0.message = r1
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo r6) {
                r5 = this;
                java.lang.Object r0 = r5.resolvedPeriodUid
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L8
                r3 = 1
                goto L9
            L8:
                r3 = 0
            L9:
                java.lang.Object r4 = r6.resolvedPeriodUid
                if (r4 != 0) goto Lf
                r4 = 1
                goto L10
            Lf:
                r4 = 0
            L10:
                if (r3 == r4) goto L16
                if (r0 == 0) goto L15
                r1 = -1
            L15:
                return r1
            L16:
                if (r0 != 0) goto L19
                return r2
            L19:
                int r0 = r5.resolvedPeriodIndex
                int r1 = r6.resolvedPeriodIndex
                int r0 = r0 - r1
                if (r0 == 0) goto L21
                return r0
            L21:
                long r0 = r5.resolvedPeriodTimeUs
                long r2 = r6.resolvedPeriodTimeUs
                int r6 = com.google.android.exoplayer2.util.Util.compareLong(r0, r2)
                return r6
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r1 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public void setResolvedPosition(int r1, long r2, java.lang.Object r4) {
                r0 = this;
                r0.resolvedPeriodIndex = r1
                r0.resolvedPeriodTimeUs = r2
                r0.resolvedPeriodUid = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public com.google.android.exoplayer2.PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(com.google.android.exoplayer2.PlaybackInfo r1) {
                r0 = this;
                r0.<init>()
                r0.playbackInfo = r1
                return
        }

        public static /* synthetic */ boolean access$100(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r0) {
                boolean r0 = r0.hasPendingChange
                return r0
        }

        public void incrementPendingOperationAcks(int r3) {
                r2 = this;
                boolean r0 = r2.hasPendingChange
                if (r3 <= 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                r0 = r0 | r1
                r2.hasPendingChange = r0
                int r0 = r2.operationAcks
                int r0 = r0 + r3
                r2.operationAcks = r0
                return
        }

        public void setPlayWhenReadyChangeReason(int r2) {
                r1 = this;
                r0 = 1
                r1.hasPendingChange = r0
                r1.hasPlayWhenReadyChangeReason = r0
                r1.playWhenReadyChangeReason = r2
                return
        }

        public void setPlaybackInfo(com.google.android.exoplayer2.PlaybackInfo r3) {
                r2 = this;
                boolean r0 = r2.hasPendingChange
                com.google.android.exoplayer2.PlaybackInfo r1 = r2.playbackInfo
                if (r1 == r3) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                r0 = r0 | r1
                r2.hasPendingChange = r0
                r2.playbackInfo = r3
                return
        }

        public void setPositionDiscontinuity(int r4) {
                r3 = this;
                boolean r0 = r3.positionDiscontinuity
                r1 = 1
                if (r0 == 0) goto L12
                int r0 = r3.discontinuityReason
                r2 = 5
                if (r0 == r2) goto L12
                if (r4 != r2) goto Ld
                goto Le
            Ld:
                r1 = 0
            Le:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
                return
            L12:
                r3.hasPendingChange = r1
                r3.positionDiscontinuity = r1
                r3.discontinuityReason = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, long r2, long r4, boolean r6, boolean r7, boolean r8) {
                r0 = this;
                r0.<init>()
                r0.periodId = r1
                r0.periodPositionUs = r2
                r0.requestedContentPositionUs = r4
                r0.forceBufferingState = r6
                r0.endPlayback = r7
                r0.setTargetLiveOffset = r8
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SeekPosition {
        public final com.google.android.exoplayer2.Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(com.google.android.exoplayer2.Timeline r1, int r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.timeline = r1
                r0.windowIndex = r2
                r0.windowPositionUs = r3
                return
        }
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$1_DjYPkjLUEXuPoxE5lNi4y5U_o(com.google.android.exoplayer2.ExoPlayerImplInternal r0) {
            java.lang.Boolean r0 = r0.lambda$release$0()
            return r0
    }

    public static /* synthetic */ void $r8$lambda$3HitbVL62UKYp7hLXQr7Za1RR_8(com.google.android.exoplayer2.ExoPlayerImplInternal r0, com.google.android.exoplayer2.PlayerMessage r1) {
            r0.lambda$sendMessageToTargetThread$1(r1)
            return
    }

    public ExoPlayerImplInternal(com.google.android.exoplayer2.Renderer[] r14, com.google.android.exoplayer2.trackselection.TrackSelector r15, com.google.android.exoplayer2.trackselection.TrackSelectorResult r16, com.google.android.exoplayer2.LoadControl r17, com.google.android.exoplayer2.upstream.BandwidthMeter r18, int r19, boolean r20, com.google.android.exoplayer2.analytics.AnalyticsCollector r21, com.google.android.exoplayer2.SeekParameters r22, com.google.android.exoplayer2.LivePlaybackSpeedControl r23, long r24, boolean r26, android.os.Looper r27, com.google.android.exoplayer2.util.Clock r28, com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener r29, com.google.android.exoplayer2.analytics.PlayerId r30, android.os.Looper r31) {
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r18
            r4 = r21
            r5 = r24
            r7 = r28
            r8 = r30
            r9 = r31
            r13.<init>()
            r10 = r29
            r0.playbackInfoUpdateListener = r10
            r0.renderers = r1
            r0.trackSelector = r2
            r10 = r16
            r0.emptyTrackSelectorResult = r10
            r11 = r17
            r0.loadControl = r11
            r0.bandwidthMeter = r3
            r12 = r19
            r0.repeatMode = r12
            r12 = r20
            r0.shuffleModeEnabled = r12
            r12 = r22
            r0.seekParameters = r12
            r12 = r23
            r0.livePlaybackSpeedControl = r12
            r0.releaseTimeoutMs = r5
            r0.setForegroundModeTimeoutMs = r5
            r5 = r26
            r0.pauseAtEndOfWindow = r5
            r0.clock = r7
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.playbackMaybeBecameStuckAtMs = r5
            long r5 = r17.getBackBufferDurationUs()
            r0.backBufferDurationUs = r5
            boolean r5 = r17.retainBackBufferFromKeyframe()
            r0.retainBackBufferFromKeyframe = r5
            com.google.android.exoplayer2.PlaybackInfo r5 = com.google.android.exoplayer2.PlaybackInfo.createDummy(r16)
            r0.playbackInfo = r5
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r6 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate
            r6.<init>(r5)
            r0.playbackInfoUpdate = r6
            int r5 = r1.length
            com.google.android.exoplayer2.RendererCapabilities[] r5 = new com.google.android.exoplayer2.RendererCapabilities[r5]
            r0.rendererCapabilities = r5
            r5 = 0
        L64:
            int r6 = r1.length
            if (r5 >= r6) goto L79
            r6 = r1[r5]
            r6.init(r5, r8)
            com.google.android.exoplayer2.RendererCapabilities[] r6 = r0.rendererCapabilities
            r10 = r1[r5]
            com.google.android.exoplayer2.RendererCapabilities r10 = r10.getCapabilities()
            r6[r5] = r10
            int r5 = r5 + 1
            goto L64
        L79:
            com.google.android.exoplayer2.DefaultMediaClock r1 = new com.google.android.exoplayer2.DefaultMediaClock
            r1.<init>(r13, r7)
            r0.mediaClock = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.pendingMessages = r1
            java.util.Set r1 = com.google.common.collect.Sets.newIdentityHashSet()
            r0.renderersToReset = r1
            com.google.android.exoplayer2.Timeline$Window r1 = new com.google.android.exoplayer2.Timeline$Window
            r1.<init>()
            r0.window = r1
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            r0.period = r1
            r15.init(r13, r3)
            r1 = 1
            r0.deliverPendingMessageAtStartPositionRequired = r1
            r1 = 0
            r2 = r27
            com.google.android.exoplayer2.util.HandlerWrapper r2 = r7.createHandler(r2, r1)
            com.google.android.exoplayer2.MediaPeriodQueue r3 = new com.google.android.exoplayer2.MediaPeriodQueue
            r3.<init>(r4, r2)
            r0.queue = r3
            com.google.android.exoplayer2.MediaSourceList r3 = new com.google.android.exoplayer2.MediaSourceList
            r3.<init>(r13, r4, r2, r8)
            r0.mediaSourceList = r3
            if (r9 == 0) goto Lbd
            r0.internalPlaybackThread = r1
            r0.playbackLooper = r9
            goto Ld1
        Lbd:
            android.os.HandlerThread r1 = new android.os.HandlerThread
            r2 = -16
            java.lang.String r3 = "ExoPlayer:Playback"
            r1.<init>(r3, r2)
            r0.internalPlaybackThread = r1
            r1.start()
            android.os.Looper r1 = r1.getLooper()
            r0.playbackLooper = r1
        Ld1:
            android.os.Looper r1 = r0.playbackLooper
            com.google.android.exoplayer2.util.HandlerWrapper r1 = r7.createHandler(r1, r13)
            r0.handler = r1
            return
    }

    public static /* synthetic */ void access$602(com.google.android.exoplayer2.ExoPlayerImplInternal r1) {
            r0 = 1
            r1.requestForRendererSleep = r0
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.util.HandlerWrapper access$700(com.google.android.exoplayer2.ExoPlayerImplInternal r0) {
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r0.handler
            return r0
    }

    private void addMediaItemsInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage r3, int r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r2.playbackInfoUpdate
            r1 = 1
            r0.incrementPendingOperationAcks(r1)
            com.google.android.exoplayer2.MediaSourceList r0 = r2.mediaSourceList
            r1 = -1
            if (r4 != r1) goto Lf
            int r4 = r0.getSize()
        Lf:
            java.util.List r1 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$300(r3)
            com.google.android.exoplayer2.source.ShuffleOrder r3 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$400(r3)
            com.google.android.exoplayer2.Timeline r3 = r0.addMediaSources(r4, r1, r3)
            r4 = 0
            r2.handleMediaSourceListInfoRefreshed(r3, r4)
            return
    }

    private void attemptRendererErrorRecovery() throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r0 = 1
            r1.seekToCurrentPosition(r0)
            return
    }

    private void deliverMessage(com.google.android.exoplayer2.PlayerMessage r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            boolean r0 = r5.isCanceled()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            com.google.android.exoplayer2.PlayerMessage$Target r1 = r5.getTarget()     // Catch: java.lang.Throwable -> L1b
            int r2 = r5.getType()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r5.getPayload()     // Catch: java.lang.Throwable -> L1b
            r1.handleMessage(r2, r3)     // Catch: java.lang.Throwable -> L1b
            r5.markAsProcessed(r0)
            return
        L1b:
            r1 = move-exception
            r5.markAsProcessed(r0)
            throw r1
    }

    private void disableRenderer(com.google.android.exoplayer2.Renderer r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            boolean r0 = isRendererEnabled(r2)
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.DefaultMediaClock r0 = r1.mediaClock
            r0.onRendererDisabled(r2)
            r1.ensureStopped(r2)
            r2.disable()
            int r2 = r1.enabledRendererCount
            int r2 = r2 + (-1)
            r1.enabledRendererCount = r2
            return
    }

    private void doSomeWork() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
            r16 = this;
            r0 = r16
            com.google.android.exoplayer2.util.Clock r1 = r0.clock
            long r1 = r1.uptimeMillis()
            com.google.android.exoplayer2.util.HandlerWrapper r3 = r0.handler
            r4 = 2
            r3.removeMessages(r4)
            r16.updatePeriods()
            com.google.android.exoplayer2.PlaybackInfo r3 = r0.playbackInfo
            int r3 = r3.playbackState
            r5 = 1
            if (r3 == r5) goto L1f8
            r6 = 4
            if (r3 != r6) goto L1d
            goto L1f8
        L1d:
            com.google.android.exoplayer2.MediaPeriodQueue r3 = r0.queue
            com.google.android.exoplayer2.MediaPeriodHolder r3 = r3.getPlayingPeriod()
            r7 = 10
            if (r3 != 0) goto L2b
            r0.scheduleNextWork(r1, r7)
            return
        L2b:
            java.lang.String r9 = "doSomeWork"
            com.google.android.exoplayer2.util.TraceUtil.beginSection(r9)
            r16.updatePlaybackPositions()
            boolean r9 = r3.prepared
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto Lac
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            com.google.android.exoplayer2.source.MediaPeriod r9 = r3.mediaPeriod
            com.google.android.exoplayer2.PlaybackInfo r15 = r0.playbackInfo
            long r7 = r15.positionUs
            long r10 = r0.backBufferDurationUs
            long r7 = r7 - r10
            boolean r10 = r0.retainBackBufferFromKeyframe
            r9.discardBuffer(r7, r10)
            r7 = 0
            r8 = 1
            r9 = 1
        L51:
            com.google.android.exoplayer2.Renderer[] r10 = r0.renderers
            int r11 = r10.length
            if (r7 >= r11) goto Lb3
            r10 = r10[r7]
            boolean r11 = isRendererEnabled(r10)
            if (r11 != 0) goto L5f
            goto La7
        L5f:
            long r4 = r0.rendererPositionUs
            r10.render(r4, r13)
            if (r8 == 0) goto L6e
            boolean r4 = r10.isEnded()
            if (r4 == 0) goto L6e
            r8 = 1
            goto L6f
        L6e:
            r8 = 0
        L6f:
            com.google.android.exoplayer2.source.SampleStream[] r4 = r3.sampleStreams
            r4 = r4[r7]
            com.google.android.exoplayer2.source.SampleStream r5 = r10.getStream()
            if (r4 == r5) goto L7b
            r4 = 1
            goto L7c
        L7b:
            r4 = 0
        L7c:
            if (r4 != 0) goto L86
            boolean r5 = r10.hasReadStreamToEnd()
            if (r5 == 0) goto L86
            r5 = 1
            goto L87
        L86:
            r5 = 0
        L87:
            if (r4 != 0) goto L9a
            if (r5 != 0) goto L9a
            boolean r4 = r10.isReady()
            if (r4 != 0) goto L9a
            boolean r4 = r10.isEnded()
            if (r4 == 0) goto L98
            goto L9a
        L98:
            r4 = 0
            goto L9b
        L9a:
            r4 = 1
        L9b:
            if (r9 == 0) goto La1
            if (r4 == 0) goto La1
            r9 = 1
            goto La2
        La1:
            r9 = 0
        La2:
            if (r4 != 0) goto La7
            r10.maybeThrowStreamError()
        La7:
            int r7 = r7 + 1
            r4 = 2
            r5 = 1
            goto L51
        Lac:
            com.google.android.exoplayer2.source.MediaPeriod r4 = r3.mediaPeriod
            r4.maybeThrowPrepareError()
            r8 = 1
            r9 = 1
        Lb3:
            com.google.android.exoplayer2.MediaPeriodInfo r4 = r3.info
            long r4 = r4.durationUs
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto Ld0
            boolean r7 = r3.prepared
            if (r7 == 0) goto Ld0
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto Lce
            com.google.android.exoplayer2.PlaybackInfo r7 = r0.playbackInfo
            long r7 = r7.positionUs
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto Ld0
        Lce:
            r4 = 1
            goto Ld1
        Ld0:
            r4 = 0
        Ld1:
            if (r4 == 0) goto Le1
            boolean r5 = r0.pendingPauseAtEndOfPeriod
            if (r5 == 0) goto Le1
            r0.pendingPauseAtEndOfPeriod = r12
            com.google.android.exoplayer2.PlaybackInfo r5 = r0.playbackInfo
            int r5 = r5.playbackSuppressionReason
            r7 = 5
            r0.setPlayWhenReadyInternal(r12, r5, r12, r7)
        Le1:
            r5 = 3
            if (r4 == 0) goto Lf1
            com.google.android.exoplayer2.MediaPeriodInfo r4 = r3.info
            boolean r4 = r4.isFinal
            if (r4 == 0) goto Lf1
            r0.setState(r6)
            r16.stopRenderers()
            goto L13a
        Lf1:
            com.google.android.exoplayer2.PlaybackInfo r4 = r0.playbackInfo
            int r4 = r4.playbackState
            r7 = 2
            if (r4 != r7) goto L10e
            boolean r4 = r0.shouldTransitionToReadyState(r9)
            if (r4 == 0) goto L10e
            r0.setState(r5)
            r4 = 0
            r0.pendingRecoverableRendererError = r4
            boolean r4 = r16.shouldPlayWhenReady()
            if (r4 == 0) goto L13a
            r16.startRenderers()
            goto L13a
        L10e:
            com.google.android.exoplayer2.PlaybackInfo r4 = r0.playbackInfo
            int r4 = r4.playbackState
            if (r4 != r5) goto L13a
            int r4 = r0.enabledRendererCount
            if (r4 != 0) goto L11f
            boolean r4 = r16.isTimelineReady()
            if (r4 == 0) goto L121
            goto L13a
        L11f:
            if (r9 != 0) goto L13a
        L121:
            boolean r4 = r16.shouldPlayWhenReady()
            r0.isRebuffering = r4
            r4 = 2
            r0.setState(r4)
            boolean r4 = r0.isRebuffering
            if (r4 == 0) goto L137
            r16.notifyTrackSelectionRebuffer()
            com.google.android.exoplayer2.LivePlaybackSpeedControl r4 = r0.livePlaybackSpeedControl
            r4.notifyRebuffer()
        L137:
            r16.stopRenderers()
        L13a:
            com.google.android.exoplayer2.PlaybackInfo r4 = r0.playbackInfo
            int r4 = r4.playbackState
            r7 = 2
            if (r4 != r7) goto L17e
            r4 = 0
        L142:
            com.google.android.exoplayer2.Renderer[] r7 = r0.renderers
            int r8 = r7.length
            if (r4 >= r8) goto L167
            r7 = r7[r4]
            boolean r7 = isRendererEnabled(r7)
            if (r7 == 0) goto L164
            com.google.android.exoplayer2.Renderer[] r7 = r0.renderers
            r7 = r7[r4]
            com.google.android.exoplayer2.source.SampleStream r7 = r7.getStream()
            com.google.android.exoplayer2.source.SampleStream[] r8 = r3.sampleStreams
            r8 = r8[r4]
            if (r7 != r8) goto L164
            com.google.android.exoplayer2.Renderer[] r7 = r0.renderers
            r7 = r7[r4]
            r7.maybeThrowStreamError()
        L164:
            int r4 = r4 + 1
            goto L142
        L167:
            com.google.android.exoplayer2.PlaybackInfo r3 = r0.playbackInfo
            boolean r4 = r3.isLoading
            if (r4 != 0) goto L17e
            long r3 = r3.totalBufferedDurationUs
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L17e
            boolean r3 = r16.isLoadingPossible()
            if (r3 == 0) goto L17e
            r3 = 1
            goto L17f
        L17e:
            r3 = 0
        L17f:
            if (r3 != 0) goto L184
            r0.playbackMaybeBecameStuckAtMs = r13
            goto L1a2
        L184:
            long r3 = r0.playbackMaybeBecameStuckAtMs
            int r7 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r7 != 0) goto L193
            com.google.android.exoplayer2.util.Clock r3 = r0.clock
            long r3 = r3.elapsedRealtime()
            r0.playbackMaybeBecameStuckAtMs = r3
            goto L1a2
        L193:
            com.google.android.exoplayer2.util.Clock r3 = r0.clock
            long r3 = r3.elapsedRealtime()
            long r7 = r0.playbackMaybeBecameStuckAtMs
            long r3 = r3 - r7
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L1f0
        L1a2:
            boolean r3 = r16.shouldPlayWhenReady()
            if (r3 == 0) goto L1b0
            com.google.android.exoplayer2.PlaybackInfo r3 = r0.playbackInfo
            int r3 = r3.playbackState
            if (r3 != r5) goto L1b0
            r3 = 1
            goto L1b1
        L1b0:
            r3 = 0
        L1b1:
            boolean r4 = r0.offloadSchedulingEnabled
            if (r4 == 0) goto L1bd
            boolean r4 = r0.requestForRendererSleep
            if (r4 == 0) goto L1bd
            if (r3 == 0) goto L1bd
            r15 = 1
            goto L1be
        L1bd:
            r15 = 0
        L1be:
            com.google.android.exoplayer2.PlaybackInfo r4 = r0.playbackInfo
            boolean r7 = r4.sleepingForOffload
            if (r7 == r15) goto L1ca
            com.google.android.exoplayer2.PlaybackInfo r4 = r4.copyWithSleepingForOffload(r15)
            r0.playbackInfo = r4
        L1ca:
            r0.requestForRendererSleep = r12
            if (r15 != 0) goto L1ec
            com.google.android.exoplayer2.PlaybackInfo r4 = r0.playbackInfo
            int r4 = r4.playbackState
            if (r4 != r6) goto L1d5
            goto L1ec
        L1d5:
            if (r3 != 0) goto L1e7
            r3 = 2
            if (r4 != r3) goto L1db
            goto L1e7
        L1db:
            if (r4 != r5) goto L1ec
            int r3 = r0.enabledRendererCount
            if (r3 == 0) goto L1ec
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.scheduleNextWork(r1, r3)
            goto L1ec
        L1e7:
            r3 = 10
            r0.scheduleNextWork(r1, r3)
        L1ec:
            com.google.android.exoplayer2.util.TraceUtil.endSection()
            return
        L1f0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L1f8:
            return
    }

    private void enableRenderer(int r18, boolean r19) throws com.google.android.exoplayer2.ExoPlaybackException {
            r17 = this;
            r0 = r17
            com.google.android.exoplayer2.Renderer[] r1 = r0.renderers
            r1 = r1[r18]
            boolean r2 = isRendererEnabled(r1)
            if (r2 == 0) goto Ld
            return
        Ld:
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r0.queue
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.getReadingPeriod()
            com.google.android.exoplayer2.MediaPeriodQueue r3 = r0.queue
            com.google.android.exoplayer2.MediaPeriodHolder r3 = r3.getPlayingPeriod()
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L1f
            r9 = 1
            goto L20
        L1f:
            r9 = 0
        L20:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r3 = r2.getTrackSelectorResult()
            com.google.android.exoplayer2.RendererConfiguration[] r6 = r3.rendererConfigurations
            r6 = r6[r18]
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r3 = r3.selections
            r3 = r3[r18]
            com.google.android.exoplayer2.Format[] r7 = getFormats(r3)
            boolean r3 = r17.shouldPlayWhenReady()
            if (r3 == 0) goto L3f
            com.google.android.exoplayer2.PlaybackInfo r3 = r0.playbackInfo
            int r3 = r3.playbackState
            r8 = 3
            if (r3 != r8) goto L3f
            r14 = 1
            goto L40
        L3f:
            r14 = 0
        L40:
            if (r19 != 0) goto L46
            if (r14 == 0) goto L46
            r8 = 1
            goto L47
        L46:
            r8 = 0
        L47:
            int r3 = r0.enabledRendererCount
            int r3 = r3 + r5
            r0.enabledRendererCount = r3
            java.util.Set<com.google.android.exoplayer2.Renderer> r3 = r0.renderersToReset
            r3.add(r1)
            com.google.android.exoplayer2.source.SampleStream[] r3 = r2.sampleStreams
            r5 = r3[r18]
            long r10 = r0.rendererPositionUs
            long r12 = r2.getStartPositionRendererTime()
            long r15 = r2.getRendererOffset()
            r2 = r1
            r3 = r6
            r4 = r7
            r6 = r10
            r10 = r12
            r12 = r15
            r2.enable(r3, r4, r5, r6, r8, r9, r10, r12)
            r2 = 11
            com.google.android.exoplayer2.ExoPlayerImplInternal$1 r3 = new com.google.android.exoplayer2.ExoPlayerImplInternal$1
            r3.<init>(r0)
            r1.handleMessage(r2, r3)
            com.google.android.exoplayer2.DefaultMediaClock r2 = r0.mediaClock
            r2.onRendererEnabled(r1)
            if (r14 == 0) goto L7c
            r1.start()
        L7c:
            return
    }

    private void enableRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            com.google.android.exoplayer2.Renderer[] r0 = r1.renderers
            int r0 = r0.length
            boolean[] r0 = new boolean[r0]
            r1.enableRenderers(r0)
            return
    }

    private void enableRenderers(boolean[] r7) throws com.google.android.exoplayer2.ExoPlaybackException {
            r6 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r6.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getReadingPeriod()
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r0.getTrackSelectorResult()
            r2 = 0
            r3 = 0
        Lc:
            com.google.android.exoplayer2.Renderer[] r4 = r6.renderers
            int r4 = r4.length
            if (r3 >= r4) goto L2d
            boolean r4 = r1.isRendererEnabled(r3)
            if (r4 != 0) goto L2a
            java.util.Set<com.google.android.exoplayer2.Renderer> r4 = r6.renderersToReset
            com.google.android.exoplayer2.Renderer[] r5 = r6.renderers
            r5 = r5[r3]
            boolean r4 = r4.remove(r5)
            if (r4 == 0) goto L2a
            com.google.android.exoplayer2.Renderer[] r4 = r6.renderers
            r4 = r4[r3]
            r4.reset()
        L2a:
            int r3 = r3 + 1
            goto Lc
        L2d:
            com.google.android.exoplayer2.Renderer[] r3 = r6.renderers
            int r3 = r3.length
            if (r2 >= r3) goto L40
            boolean r3 = r1.isRendererEnabled(r2)
            if (r3 == 0) goto L3d
            boolean r3 = r7[r2]
            r6.enableRenderer(r2, r3)
        L3d:
            int r2 = r2 + 1
            goto L2d
        L40:
            r7 = 1
            r0.allRenderersInCorrectState = r7
            return
    }

    private void ensureStopped(com.google.android.exoplayer2.Renderer r3) {
            r2 = this;
            int r0 = r3.getState()
            r1 = 2
            if (r0 != r1) goto La
            r3.stop()
        La:
            return
    }

    private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.metadata.Metadata> extractMetadataFromTrackSelectionArray(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r8) {
            r7 = this;
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
            r4 = 0
        L9:
            if (r3 >= r1) goto L29
            r5 = r8[r3]
            if (r5 == 0) goto L26
            com.google.android.exoplayer2.Format r5 = r5.getFormat(r2)
            com.google.android.exoplayer2.metadata.Metadata r5 = r5.metadata
            if (r5 != 0) goto L22
            com.google.android.exoplayer2.metadata.Metadata r5 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r5.<init>(r6)
            r0.add(r5)
            goto L26
        L22:
            r0.add(r5)
            r4 = 1
        L26:
            int r3 = r3 + 1
            goto L9
        L29:
            if (r4 == 0) goto L30
            com.google.common.collect.ImmutableList r8 = r0.build()
            goto L34
        L30:
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of()
        L34:
            return r8
    }

    private long getCurrentLiveOffsetUs() {
            r5 = this;
            com.google.android.exoplayer2.PlaybackInfo r0 = r5.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r0.periodId
            java.lang.Object r2 = r2.periodUid
            long r3 = r0.positionUs
            long r0 = r5.getLiveOffsetUs(r1, r2, r3)
            return r0
    }

    private static com.google.android.exoplayer2.Format[] getFormats(com.google.android.exoplayer2.trackselection.ExoTrackSelection r4) {
            r0 = 0
            if (r4 == 0) goto L8
            int r1 = r4.length()
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r1]
        Lb:
            if (r0 >= r1) goto L16
            com.google.android.exoplayer2.Format r3 = r4.getFormat(r0)
            r2[r0] = r3
            int r0 = r0 + 1
            goto Lb
        L16:
            return r2
    }

    private long getLiveOffsetUs(com.google.android.exoplayer2.Timeline r5, java.lang.Object r6, long r7) {
            r4 = this;
            com.google.android.exoplayer2.Timeline$Period r0 = r4.period
            com.google.android.exoplayer2.Timeline$Period r6 = r5.getPeriodByUid(r6, r0)
            int r6 = r6.windowIndex
            com.google.android.exoplayer2.Timeline$Window r0 = r4.window
            r5.getWindow(r6, r0)
            com.google.android.exoplayer2.Timeline$Window r5 = r4.window
            long r0 = r5.windowStartTimeMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L3d
            boolean r5 = r5.isLive()
            if (r5 == 0) goto L3d
            com.google.android.exoplayer2.Timeline$Window r5 = r4.window
            boolean r6 = r5.isDynamic
            if (r6 != 0) goto L27
            goto L3d
        L27:
            long r5 = r5.getCurrentUnixTimeMs()
            com.google.android.exoplayer2.Timeline$Window r0 = r4.window
            long r0 = r0.windowStartTimeMs
            long r5 = r5 - r0
            long r5 = com.google.android.exoplayer2.util.Util.msToUs(r5)
            com.google.android.exoplayer2.Timeline$Period r0 = r4.period
            long r0 = r0.getPositionInWindowUs()
            long r0 = r0 + r7
            long r5 = r5 - r0
            return r5
        L3d:
            return r2
    }

    private long getMaxRendererReadPositionUs() {
            r9 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r9.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getReadingPeriod()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            long r1 = r0.getRendererOffset()
            boolean r3 = r0.prepared
            if (r3 != 0) goto L14
            return r1
        L14:
            r3 = 0
        L15:
            com.google.android.exoplayer2.Renderer[] r4 = r9.renderers
            int r5 = r4.length
            if (r3 >= r5) goto L47
            r4 = r4[r3]
            boolean r4 = isRendererEnabled(r4)
            if (r4 == 0) goto L44
            com.google.android.exoplayer2.Renderer[] r4 = r9.renderers
            r4 = r4[r3]
            com.google.android.exoplayer2.source.SampleStream r4 = r4.getStream()
            com.google.android.exoplayer2.source.SampleStream[] r5 = r0.sampleStreams
            r5 = r5[r3]
            if (r4 == r5) goto L31
            goto L44
        L31:
            com.google.android.exoplayer2.Renderer[] r4 = r9.renderers
            r4 = r4[r3]
            long r4 = r4.getReadingPositionUs()
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L40
            return r6
        L40:
            long r1 = java.lang.Math.max(r4, r1)
        L44:
            int r3 = r3 + 1
            goto L15
        L47:
            return r1
    }

    private android.util.Pair<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, java.lang.Long> getPlaceholderFirstMediaPeriodPositionUs(com.google.android.exoplayer2.Timeline r10) {
            r9 = this;
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L15
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r10 = com.google.android.exoplayer2.PlaybackInfo.getDummyPeriodForEmptyTimeline()
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            android.util.Pair r10 = android.util.Pair.create(r10, r0)
            return r10
        L15:
            boolean r0 = r9.shuffleModeEnabled
            int r6 = r10.getFirstWindowIndex(r0)
            com.google.android.exoplayer2.Timeline$Window r4 = r9.window
            com.google.android.exoplayer2.Timeline$Period r5 = r9.period
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r10
            android.util.Pair r0 = r3.getPeriodPositionUs(r4, r5, r6, r7)
            com.google.android.exoplayer2.MediaPeriodQueue r3 = r9.queue
            java.lang.Object r4 = r0.first
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(r10, r4, r1)
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            boolean r0 = r3.isAd()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r3.periodUid
            com.google.android.exoplayer2.Timeline$Period r4 = r9.period
            r10.getPeriodByUid(r0, r4)
            int r10 = r3.adIndexInAdGroup
            com.google.android.exoplayer2.Timeline$Period r0 = r9.period
            int r4 = r3.adGroupIndex
            int r0 = r0.getFirstAdIndexToPlay(r4)
            if (r10 != r0) goto L58
            com.google.android.exoplayer2.Timeline$Period r10 = r9.period
            long r1 = r10.getAdResumePositionUs()
        L58:
            r4 = r1
        L59:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            android.util.Pair r10 = android.util.Pair.create(r3, r10)
            return r10
    }

    private long getTotalBufferedDurationUs() {
            r2 = this;
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            long r0 = r0.bufferedPositionUs
            long r0 = r2.getTotalBufferedDurationUs(r0)
            return r0
    }

    private long getTotalBufferedDurationUs(long r6) {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getLoadingPeriod()
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            long r3 = r5.rendererPositionUs
            long r3 = r0.toPeriodTime(r3)
            long r6 = r6 - r3
            long r6 = java.lang.Math.max(r1, r6)
            return r6
    }

    private void handleContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r3) {
            r2 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r2.queue
            boolean r3 = r0.isLoading(r3)
            if (r3 != 0) goto L9
            return
        L9:
            com.google.android.exoplayer2.MediaPeriodQueue r3 = r2.queue
            long r0 = r2.rendererPositionUs
            r3.reevaluateBuffer(r0)
            r2.maybeContinueLoading()
            return
    }

    private void handleIoException(java.io.IOException r2, int r3) {
            r1 = this;
            com.google.android.exoplayer2.ExoPlaybackException r2 = com.google.android.exoplayer2.ExoPlaybackException.createForSource(r2, r3)
            com.google.android.exoplayer2.MediaPeriodQueue r3 = r1.queue
            com.google.android.exoplayer2.MediaPeriodHolder r3 = r3.getPlayingPeriod()
            if (r3 == 0) goto L14
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r3.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.id
            com.google.android.exoplayer2.ExoPlaybackException r2 = r2.copyWithMediaPeriodId(r3)
        L14:
            java.lang.String r3 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Playback error"
            com.google.android.exoplayer2.util.Log.e(r3, r0, r2)
            r3 = 0
            r1.stopInternal(r3, r3)
            com.google.android.exoplayer2.PlaybackInfo r3 = r1.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r2 = r3.copyWithPlaybackError(r2)
            r1.playbackInfo = r2
            return
    }

    private void handleLoadingMediaPeriodChanged(boolean r6) {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getLoadingPeriod()
            if (r0 != 0) goto Ld
            com.google.android.exoplayer2.PlaybackInfo r1 = r5.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId
            goto L11
        Ld:
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r0.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.id
        L11:
            com.google.android.exoplayer2.PlaybackInfo r2 = r5.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.loadingMediaPeriodId
            boolean r2 = r2.equals(r1)
            r2 = r2 ^ 1
            if (r2 == 0) goto L25
            com.google.android.exoplayer2.PlaybackInfo r3 = r5.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r1 = r3.copyWithLoadingMediaPeriodId(r1)
            r5.playbackInfo = r1
        L25:
            com.google.android.exoplayer2.PlaybackInfo r1 = r5.playbackInfo
            if (r0 != 0) goto L2c
            long r3 = r1.positionUs
            goto L30
        L2c:
            long r3 = r0.getBufferedPositionUs()
        L30:
            r1.bufferedPositionUs = r3
            com.google.android.exoplayer2.PlaybackInfo r1 = r5.playbackInfo
            long r3 = r5.getTotalBufferedDurationUs()
            r1.totalBufferedDurationUs = r3
            if (r2 != 0) goto L3e
            if (r6 == 0) goto L4f
        L3e:
            if (r0 == 0) goto L4f
            boolean r6 = r0.prepared
            if (r6 == 0) goto L4f
            com.google.android.exoplayer2.source.TrackGroupArray r6 = r0.getTrackGroups()
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r0 = r0.getTrackSelectorResult()
            r5.updateLoadControlTrackSelection(r6, r0)
        L4f:
            return
    }

    private void handleMediaSourceListInfoRefreshed(com.google.android.exoplayer2.Timeline r28, boolean r29) throws com.google.android.exoplayer2.ExoPlaybackException {
            r27 = this;
            r11 = r27
            r12 = r28
            com.google.android.exoplayer2.PlaybackInfo r2 = r11.playbackInfo
            com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition r3 = r11.pendingInitialSeekPosition
            com.google.android.exoplayer2.MediaPeriodQueue r4 = r11.queue
            int r5 = r11.repeatMode
            boolean r6 = r11.shuffleModeEnabled
            com.google.android.exoplayer2.Timeline$Window r7 = r11.window
            com.google.android.exoplayer2.Timeline$Period r8 = r11.period
            r1 = r28
            com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange r7 = resolvePositionForPlaylistChange(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r9 = r7.periodId
            long r13 = r7.requestedContentPositionUs
            boolean r0 = r7.forceBufferingState
            long r5 = r7.periodPositionUs
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId
            boolean r1 = r1.equals(r9)
            r10 = 1
            r15 = 0
            if (r1 == 0) goto L38
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            long r1 = r1.positionUs
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L35
            goto L38
        L35:
            r16 = 0
            goto L3a
        L38:
            r16 = 1
        L3a:
            r17 = 3
            r8 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.endPlayback     // Catch: java.lang.Throwable -> L13d
            if (r1 == 0) goto L53
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo     // Catch: java.lang.Throwable -> L13d
            int r1 = r1.playbackState     // Catch: java.lang.Throwable -> L13d
            if (r1 == r10) goto L50
            r11.setState(r4)     // Catch: java.lang.Throwable -> L13d
        L50:
            r11.resetInternal(r15, r15, r15, r10)     // Catch: java.lang.Throwable -> L13d
        L53:
            if (r16 != 0) goto L77
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r11.queue     // Catch: java.lang.Throwable -> L70
            long r3 = r11.rendererPositionUs     // Catch: java.lang.Throwable -> L70
            long r22 = r27.getMaxRendererReadPositionUs()     // Catch: java.lang.Throwable -> L70
            r2 = r28
            r10 = -1
            r20 = 4
            r25 = r5
            r5 = r22
            boolean r0 = r1.updateQueuedPeriods(r2, r3, r5)     // Catch: java.lang.Throwable -> L138
            if (r0 != 0) goto Lb5
            r11.seekToCurrentPosition(r15)     // Catch: java.lang.Throwable -> L138
            goto Lb5
        L70:
            r0 = move-exception
            r10 = -1
            r20 = 4
        L74:
            r15 = r8
            goto L142
        L77:
            r25 = r5
            r10 = -1
            r20 = 4
            boolean r1 = r28.isEmpty()     // Catch: java.lang.Throwable -> L138
            if (r1 != 0) goto Lb5
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r11.queue     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()     // Catch: java.lang.Throwable -> Lb1
        L88:
            if (r1 == 0) goto La6
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r1.info     // Catch: java.lang.Throwable -> L138
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.id     // Catch: java.lang.Throwable -> L138
            boolean r2 = r2.equals(r9)     // Catch: java.lang.Throwable -> L138
            if (r2 == 0) goto La1
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r11.queue     // Catch: java.lang.Throwable -> L138
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r1.info     // Catch: java.lang.Throwable -> L138
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r2.getUpdatedMediaPeriodInfo(r12, r3)     // Catch: java.lang.Throwable -> L138
            r1.info = r2     // Catch: java.lang.Throwable -> L138
            r1.updateClipping()     // Catch: java.lang.Throwable -> L138
        La1:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getNext()     // Catch: java.lang.Throwable -> L138
            goto L88
        La6:
            r5 = r25
            long r0 = r11.seekToPeriodPosition(r9, r5, r0)     // Catch: java.lang.Throwable -> Laf
            r21 = r0
            goto Lb9
        Laf:
            r0 = move-exception
            goto L74
        Lb1:
            r0 = move-exception
            r5 = r25
            goto L74
        Lb5:
            r5 = r25
            r21 = r5
        Lb9:
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.periodId
            boolean r0 = r7.setTargetLiveOffset
            if (r0 == 0) goto Lc6
            r6 = r21
            goto Lc8
        Lc6:
            r6 = r18
        Lc8:
            r0 = 0
            r1 = r27
            r2 = r28
            r3 = r9
            r15 = r8
            r8 = r0
            r1.updatePlaybackSpeedSettingsForNewPeriod(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto Ldd
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            long r0 = r0.requestedContentPositionUs
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 == 0) goto L119
        Ldd:
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.periodId
            java.lang.Object r1 = r1.periodUid
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            if (r16 == 0) goto Lfc
            if (r29 == 0) goto Lfc
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Lfc
            com.google.android.exoplayer2.Timeline$Period r2 = r11.period
            com.google.android.exoplayer2.Timeline$Period r0 = r0.getPeriodByUid(r1, r2)
            boolean r0 = r0.isPlaceholder
            if (r0 != 0) goto Lfc
            r24 = 1
            goto Lfe
        Lfc:
            r24 = 0
        Lfe:
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            long r7 = r0.discontinuityStartPositionUs
            int r0 = r12.getIndexOfPeriod(r1)
            if (r0 != r10) goto L10a
            r10 = 4
            goto L10b
        L10a:
            r10 = 3
        L10b:
            r1 = r27
            r2 = r9
            r3 = r21
            r5 = r13
            r9 = r24
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.handlePositionDiscontinuity(r2, r3, r5, r7, r9, r10)
            r11.playbackInfo = r0
        L119:
            r27.resetPendingPauseAtEndOfPeriod()
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            r11.resolvePendingMessagePositions(r12, r0)
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r0 = r0.copyWithTimeline(r12)
            r11.playbackInfo = r0
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L133
            r11.pendingInitialSeekPosition = r15
        L133:
            r1 = 0
            r11.handleLoadingMediaPeriodChanged(r1)
            return
        L138:
            r0 = move-exception
            r15 = r8
            r5 = r25
            goto L142
        L13d:
            r0 = move-exception
            r15 = r8
            r10 = -1
            r20 = 4
        L142:
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r1.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = r1.periodId
            boolean r1 = r7.setTargetLiveOffset
            if (r1 == 0) goto L14e
            r18 = r5
        L14e:
            r21 = 0
            r1 = r27
            r2 = r28
            r3 = r9
            r25 = r5
            r5 = r8
            r6 = r18
            r8 = r21
            r1.updatePlaybackSpeedSettingsForNewPeriod(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto L169
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            long r1 = r1.requestedContentPositionUs
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L1a5
        L169:
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r1.periodId
            java.lang.Object r2 = r2.periodUid
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            if (r16 == 0) goto L188
            if (r29 == 0) goto L188
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L188
            com.google.android.exoplayer2.Timeline$Period r3 = r11.period
            com.google.android.exoplayer2.Timeline$Period r1 = r1.getPeriodByUid(r2, r3)
            boolean r1 = r1.isPlaceholder
            if (r1 != 0) goto L188
            r24 = 1
            goto L18a
        L188:
            r24 = 0
        L18a:
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            long r7 = r1.discontinuityStartPositionUs
            int r1 = r12.getIndexOfPeriod(r2)
            if (r1 != r10) goto L196
            r10 = 4
            goto L197
        L196:
            r10 = 3
        L197:
            r1 = r27
            r2 = r9
            r3 = r25
            r5 = r13
            r9 = r24
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.handlePositionDiscontinuity(r2, r3, r5, r7, r9, r10)
            r11.playbackInfo = r1
        L1a5:
            r27.resetPendingPauseAtEndOfPeriod()
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            r11.resolvePendingMessagePositions(r12, r1)
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.copyWithTimeline(r12)
            r11.playbackInfo = r1
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L1bf
            r11.pendingInitialSeekPosition = r15
        L1bf:
            r1 = 0
            r11.handleLoadingMediaPeriodChanged(r1)
            throw r0
    }

    private void handlePeriodPrepared(com.google.android.exoplayer2.source.MediaPeriod r12) throws com.google.android.exoplayer2.ExoPlaybackException {
            r11 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            boolean r12 = r0.isLoading(r12)
            if (r12 != 0) goto L9
            return
        L9:
            com.google.android.exoplayer2.MediaPeriodQueue r12 = r11.queue
            com.google.android.exoplayer2.MediaPeriodHolder r12 = r12.getLoadingPeriod()
            com.google.android.exoplayer2.DefaultMediaClock r0 = r11.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            float r0 = r0.speed
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            r12.handlePrepared(r0, r1)
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r12.getTrackGroups()
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r12.getTrackSelectorResult()
            r11.updateLoadControlTrackSelection(r0, r1)
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            if (r12 != r0) goto L4f
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r12.info
            long r0 = r0.startPositionUs
            r11.resetRendererPosition(r0)
            r11.enableRenderers()
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r0.periodId
            com.google.android.exoplayer2.MediaPeriodInfo r12 = r12.info
            long r7 = r12.startPositionUs
            long r5 = r0.requestedContentPositionUs
            r9 = 0
            r10 = 5
            r1 = r11
            r3 = r7
            com.google.android.exoplayer2.PlaybackInfo r12 = r1.handlePositionDiscontinuity(r2, r3, r5, r7, r9, r10)
            r11.playbackInfo = r12
        L4f:
            r11.maybeContinueLoading()
            return
    }

    private void handlePlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r4, float r5, boolean r6, boolean r7) throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            if (r6 == 0) goto L12
            if (r7 == 0) goto La
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r6 = r3.playbackInfoUpdate
            r7 = 1
            r6.incrementPendingOperationAcks(r7)
        La:
            com.google.android.exoplayer2.PlaybackInfo r6 = r3.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r6 = r6.copyWithPlaybackParameters(r4)
            r3.playbackInfo = r6
        L12:
            float r6 = r4.speed
            r3.updateTrackSelectionPlaybackSpeed(r6)
            com.google.android.exoplayer2.Renderer[] r6 = r3.renderers
            int r7 = r6.length
            r0 = 0
        L1b:
            if (r0 >= r7) goto L29
            r1 = r6[r0]
            if (r1 == 0) goto L26
            float r2 = r4.speed
            r1.setPlaybackSpeed(r5, r2)
        L26:
            int r0 = r0 + 1
            goto L1b
        L29:
            return
    }

    private void handlePlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r3, boolean r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            float r0 = r3.speed
            r1 = 1
            r2.handlePlaybackParameters(r3, r0, r1, r4)
            return
    }

    @androidx.annotation.CheckResult
    private com.google.android.exoplayer2.PlaybackInfo handlePositionDiscontinuity(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r15, long r16, long r18, long r20, boolean r22, int r23) {
            r14 = this;
            r0 = r14
            r2 = r15
            r5 = r18
            boolean r1 = r0.deliverPendingMessageAtStartPositionRequired
            if (r1 != 0) goto L1d
            com.google.android.exoplayer2.PlaybackInfo r1 = r0.playbackInfo
            long r3 = r1.positionUs
            int r1 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            com.google.android.exoplayer2.PlaybackInfo r1 = r0.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            goto L1e
        L1d:
            r1 = 1
        L1e:
            r0.deliverPendingMessageAtStartPositionRequired = r1
            r14.resetPendingPauseAtEndOfPeriod()
            com.google.android.exoplayer2.PlaybackInfo r1 = r0.playbackInfo
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r1.trackGroups
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r4 = r1.trackSelectorResult
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r1 = r1.staticMetadata
            com.google.android.exoplayer2.MediaSourceList r7 = r0.mediaSourceList
            boolean r7 = r7.isPrepared()
            if (r7 == 0) goto L65
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r0.queue
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()
            if (r1 != 0) goto L3e
            com.google.android.exoplayer2.source.TrackGroupArray r3 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            goto L42
        L3e:
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r1.getTrackGroups()
        L42:
            if (r1 != 0) goto L47
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r4 = r0.emptyTrackSelectorResult
            goto L4b
        L47:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r4 = r1.getTrackSelectorResult()
        L4b:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r7 = r4.selections
            com.google.common.collect.ImmutableList r7 = r14.extractMetadataFromTrackSelectionArray(r7)
            if (r1 == 0) goto L61
            com.google.android.exoplayer2.MediaPeriodInfo r8 = r1.info
            long r9 = r8.requestedContentPositionUs
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L61
            com.google.android.exoplayer2.MediaPeriodInfo r8 = r8.copyWithRequestedContentPositionUs(r5)
            r1.info = r8
        L61:
            r11 = r3
            r12 = r4
            r13 = r7
            goto L7e
        L65:
            com.google.android.exoplayer2.PlaybackInfo r7 = r0.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r7.periodId
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L7b
            com.google.android.exoplayer2.source.TrackGroupArray r1 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r3 = r0.emptyTrackSelectorResult
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of()
            r11 = r1
            r12 = r3
            r13 = r4
            goto L7e
        L7b:
            r13 = r1
            r11 = r3
            r12 = r4
        L7e:
            if (r22 == 0) goto L87
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r1 = r0.playbackInfoUpdate
            r3 = r23
            r1.setPositionDiscontinuity(r3)
        L87:
            com.google.android.exoplayer2.PlaybackInfo r1 = r0.playbackInfo
            long r9 = r14.getTotalBufferedDurationUs()
            r2 = r15
            r3 = r16
            r5 = r18
            r7 = r20
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.copyWithNewPosition(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
    }

    private boolean hasReachedServerSideInsertedAdsTransition(com.google.android.exoplayer2.Renderer r4, com.google.android.exoplayer2.MediaPeriodHolder r5) {
            r3 = this;
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r5.getNext()
            com.google.android.exoplayer2.MediaPeriodInfo r5 = r5.info
            boolean r5 = r5.isFollowedByTransitionToSameStream
            if (r5 == 0) goto L24
            boolean r5 = r0.prepared
            if (r5 == 0) goto L24
            boolean r5 = r4 instanceof com.google.android.exoplayer2.text.TextRenderer
            if (r5 != 0) goto L22
            boolean r5 = r4 instanceof com.google.android.exoplayer2.metadata.MetadataRenderer
            if (r5 != 0) goto L22
            long r4 = r4.getReadingPositionUs()
            long r0 = r0.getStartPositionRendererTime()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L24
        L22:
            r4 = 1
            goto L25
        L24:
            r4 = 0
        L25:
            return r4
    }

    private boolean hasReadingPeriodFinishedReading() {
            r6 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r6.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getReadingPeriod()
            boolean r1 = r0.prepared
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            r1 = 0
        Ld:
            com.google.android.exoplayer2.Renderer[] r3 = r6.renderers
            int r4 = r3.length
            if (r1 >= r4) goto L31
            r3 = r3[r1]
            com.google.android.exoplayer2.source.SampleStream[] r4 = r0.sampleStreams
            r4 = r4[r1]
            com.google.android.exoplayer2.source.SampleStream r5 = r3.getStream()
            if (r5 != r4) goto L30
            if (r4 == 0) goto L2d
            boolean r4 = r3.hasReadStreamToEnd()
            if (r4 != 0) goto L2d
            boolean r3 = r6.hasReachedServerSideInsertedAdsTransition(r3, r0)
            if (r3 != 0) goto L2d
            goto L30
        L2d:
            int r1 = r1 + 1
            goto Ld
        L30:
            return r2
        L31:
            r0 = 1
            return r0
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, long r3, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5, com.google.android.exoplayer2.Timeline.Period r6, long r7) {
            r0 = 0
            if (r1 != 0) goto L48
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L48
            java.lang.Object r1 = r2.periodUid
            java.lang.Object r3 = r5.periodUid
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L12
            goto L48
        L12:
            boolean r1 = r2.isAd()
            r3 = 1
            if (r1 == 0) goto L39
            int r1 = r2.adGroupIndex
            boolean r1 = r6.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L39
            int r1 = r2.adGroupIndex
            int r4 = r2.adIndexInAdGroup
            int r1 = r6.getAdState(r1, r4)
            r4 = 4
            if (r1 == r4) goto L38
            int r1 = r2.adGroupIndex
            int r2 = r2.adIndexInAdGroup
            int r1 = r6.getAdState(r1, r2)
            r2 = 2
            if (r1 == r2) goto L38
            r0 = 1
        L38:
            return r0
        L39:
            boolean r1 = r5.isAd()
            if (r1 == 0) goto L48
            int r1 = r5.adGroupIndex
            boolean r1 = r6.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L48
            r0 = 1
        L48:
            return r0
    }

    private boolean isLoadingPossible() {
            r6 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r6.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getLoadingPeriod()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            long r2 = r0.getNextLoadPositionUs()
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 1
            return r0
    }

    private static boolean isRendererEnabled(com.google.android.exoplayer2.Renderer r0) {
            int r0 = r0.getState()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private boolean isTimelineReady() {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r0.info
            long r1 = r1.durationUs
            boolean r0 = r0.prepared
            if (r0 == 0) goto L27
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L25
            com.google.android.exoplayer2.PlaybackInfo r0 = r5.playbackInfo
            long r3 = r0.positionUs
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L25
            boolean r0 = r5.shouldPlayWhenReady()
            if (r0 != 0) goto L27
        L25:
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    private static boolean isUsingPlaceholderPeriod(com.google.android.exoplayer2.PlaybackInfo r2, com.google.android.exoplayer2.Timeline.Period r3) {
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r2.periodId
            com.google.android.exoplayer2.Timeline r2 = r2.timeline
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L17
            java.lang.Object r0 = r0.periodUid
            com.google.android.exoplayer2.Timeline$Period r2 = r2.getPeriodByUid(r0, r3)
            boolean r2 = r2.isPlaceholder
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    private /* synthetic */ java.lang.Boolean lambda$release$0() {
            r1 = this;
            boolean r0 = r1.released
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private /* synthetic */ void lambda$sendMessageToTargetThread$1(com.google.android.exoplayer2.PlayerMessage r3) {
            r2 = this;
            r2.deliverMessage(r3)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4
            return
        L4:
            r3 = move-exception
            java.lang.String r0 = "ExoPlayerImplInternal"
            java.lang.String r1 = "Unexpected error delivering message on external thread."
            com.google.android.exoplayer2.util.Log.e(r0, r1, r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    private void maybeContinueLoading() {
            r3 = this;
            boolean r0 = r3.shouldContinueLoading()
            r3.shouldContinueLoading = r0
            if (r0 == 0) goto L13
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r3.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getLoadingPeriod()
            long r1 = r3.rendererPositionUs
            r0.continueLoading(r1)
        L13:
            r3.updateIsLoading()
            return
    }

    private void maybeNotifyPlaybackInfoChanged() {
            r2 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r2.playbackInfoUpdate
            com.google.android.exoplayer2.PlaybackInfo r1 = r2.playbackInfo
            r0.setPlaybackInfo(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r2.playbackInfoUpdate
            boolean r0 = com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate.access$100(r0)
            if (r0 == 0) goto L1f
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdateListener r0 = r2.playbackInfoUpdateListener
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r1 = r2.playbackInfoUpdate
            r0.onPlaybackInfoUpdate(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate
            com.google.android.exoplayer2.PlaybackInfo r1 = r2.playbackInfo
            r0.<init>(r1)
            r2.playbackInfoUpdate = r0
        L1f:
            return
    }

    private void maybeTriggerPendingMessages(long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException {
            r7 = this;
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r0 = r7.pendingMessages
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf7
            com.google.android.exoplayer2.PlaybackInfo r0 = r7.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L14
            goto Lf7
        L14:
            boolean r0 = r7.deliverPendingMessageAtStartPositionRequired
            if (r0 == 0) goto L1e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.deliverPendingMessageAtStartPositionRequired = r0
        L1e:
            com.google.android.exoplayer2.PlaybackInfo r0 = r7.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            java.lang.Object r0 = r0.periodUid
            int r0 = r1.getIndexOfPeriod(r0)
            int r1 = r7.nextPendingMessageIndexHint
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r2 = r7.pendingMessages
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L44
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r4 = r1 + (-1)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L45
        L44:
            r3 = r2
        L45:
            if (r3 == 0) goto L62
            int r4 = r3.resolvedPeriodIndex
            if (r4 > r0) goto L53
            if (r4 != r0) goto L62
            long r3 = r3.resolvedPeriodTimeUs
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L62
        L53:
            int r1 = r1 + (-1)
            if (r1 <= 0) goto L44
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r4 = r1 + (-1)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L45
        L62:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r3 = r3.size()
            if (r1 >= r3) goto L73
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L74
        L73:
            r3 = r2
        L74:
            if (r3 == 0) goto L99
            java.lang.Object r4 = r3.resolvedPeriodUid
            if (r4 == 0) goto L99
            int r4 = r3.resolvedPeriodIndex
            if (r4 < r0) goto L86
            if (r4 != r0) goto L99
            long r4 = r3.resolvedPeriodTimeUs
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L99
        L86:
            int r1 = r1 + 1
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r3 = r3.size()
            if (r1 >= r3) goto L73
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L74
        L99:
            if (r3 == 0) goto Lf5
            java.lang.Object r4 = r3.resolvedPeriodUid
            if (r4 == 0) goto Lf5
            int r4 = r3.resolvedPeriodIndex
            if (r4 != r0) goto Lf5
            long r4 = r3.resolvedPeriodTimeUs
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto Lf5
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto Lf5
            com.google.android.exoplayer2.PlayerMessage r4 = r3.message     // Catch: java.lang.Throwable -> Lde
            r7.sendMessageToTarget(r4)     // Catch: java.lang.Throwable -> Lde
            com.google.android.exoplayer2.PlayerMessage r4 = r3.message
            boolean r4 = r4.getDeleteAfterDelivery()
            if (r4 != 0) goto Lc6
            com.google.android.exoplayer2.PlayerMessage r3 = r3.message
            boolean r3 = r3.isCanceled()
            if (r3 == 0) goto Lc3
            goto Lc6
        Lc3:
            int r1 = r1 + 1
            goto Lcb
        Lc6:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            r3.remove(r1)
        Lcb:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r3 = r3.size()
            if (r1 >= r3) goto Ldc
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L99
        Ldc:
            r3 = r2
            goto L99
        Lde:
            r8 = move-exception
            com.google.android.exoplayer2.PlayerMessage r9 = r3.message
            boolean r9 = r9.getDeleteAfterDelivery()
            if (r9 != 0) goto Lef
            com.google.android.exoplayer2.PlayerMessage r9 = r3.message
            boolean r9 = r9.isCanceled()
            if (r9 == 0) goto Lf4
        Lef:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r9 = r7.pendingMessages
            r9.remove(r1)
        Lf4:
            throw r8
        Lf5:
            r7.nextPendingMessageIndexHint = r1
        Lf7:
            return
    }

    private void maybeUpdateLoadingPeriod() throws com.google.android.exoplayer2.ExoPlaybackException {
            r11 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            long r1 = r11.rendererPositionUs
            r0.reevaluateBuffer(r1)
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            boolean r0 = r0.shouldLoadNextMediaPeriod()
            if (r0 == 0) goto L48
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            long r1 = r11.rendererPositionUs
            com.google.android.exoplayer2.PlaybackInfo r3 = r11.playbackInfo
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.getNextMediaPeriodInfo(r1, r3)
            if (r0 == 0) goto L48
            com.google.android.exoplayer2.MediaPeriodQueue r4 = r11.queue
            com.google.android.exoplayer2.RendererCapabilities[] r5 = r11.rendererCapabilities
            com.google.android.exoplayer2.trackselection.TrackSelector r6 = r11.trackSelector
            com.google.android.exoplayer2.LoadControl r1 = r11.loadControl
            com.google.android.exoplayer2.upstream.Allocator r7 = r1.getAllocator()
            com.google.android.exoplayer2.MediaSourceList r8 = r11.mediaSourceList
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r10 = r11.emptyTrackSelectorResult
            r9 = r0
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r4.enqueueNextMediaPeriodHolder(r5, r6, r7, r8, r9, r10)
            com.google.android.exoplayer2.source.MediaPeriod r2 = r1.mediaPeriod
            long r3 = r0.startPositionUs
            r2.prepare(r11, r3)
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r11.queue
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.getPlayingPeriod()
            if (r2 != r1) goto L44
            long r0 = r0.startPositionUs
            r11.resetRendererPosition(r0)
        L44:
            r0 = 0
            r11.handleLoadingMediaPeriodChanged(r0)
        L48:
            boolean r0 = r11.shouldContinueLoading
            if (r0 == 0) goto L56
            boolean r0 = r11.isLoadingPossible()
            r11.shouldContinueLoading = r0
            r11.updateIsLoading()
            goto L59
        L56:
            r11.maybeContinueLoading()
        L59:
            return
    }

    private void maybeUpdatePlayingPeriod() throws com.google.android.exoplayer2.ExoPlaybackException {
            r14 = this;
            r0 = 0
            r1 = 1
            r2 = 0
        L3:
            boolean r3 = r14.shouldAdvancePlayingPeriod()
            if (r3 == 0) goto L61
            if (r2 == 0) goto Le
            r14.maybeNotifyPlaybackInfoChanged()
        Le:
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r14.queue
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.advancePlayingPeriod()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.MediaPeriodHolder r2 = (com.google.android.exoplayer2.MediaPeriodHolder) r2
            com.google.android.exoplayer2.PlaybackInfo r3 = r14.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.periodId
            java.lang.Object r3 = r3.periodUid
            com.google.android.exoplayer2.MediaPeriodInfo r4 = r2.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r4.id
            java.lang.Object r4 = r4.periodUid
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L45
            com.google.android.exoplayer2.PlaybackInfo r3 = r14.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.periodId
            int r4 = r3.adGroupIndex
            r5 = -1
            if (r4 != r5) goto L45
            com.google.android.exoplayer2.MediaPeriodInfo r4 = r2.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r4.id
            int r6 = r4.adGroupIndex
            if (r6 != r5) goto L45
            int r3 = r3.nextAdGroupIndex
            int r4 = r4.nextAdGroupIndex
            if (r3 == r4) goto L45
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r2.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r2.id
            long r10 = r2.startPositionUs
            long r8 = r2.requestedContentPositionUs
            r12 = r3 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            com.google.android.exoplayer2.PlaybackInfo r2 = r4.handlePositionDiscontinuity(r5, r6, r8, r10, r12, r13)
            r14.playbackInfo = r2
            r14.resetPendingPauseAtEndOfPeriod()
            r14.updatePlaybackPositions()
            r2 = 1
            goto L3
        L61:
            return
    }

    private void maybeUpdateReadingPeriod() throws com.google.android.exoplayer2.ExoPlaybackException {
            r14 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r14.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getReadingPeriod()
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r0.getNext()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            if (r1 == 0) goto Lbd
            boolean r1 = r14.pendingPauseAtEndOfPeriod
            if (r1 == 0) goto L1b
            goto Lbd
        L1b:
            boolean r1 = r14.hasReadingPeriodFinishedReading()
            if (r1 != 0) goto L22
            return
        L22:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r0.getNext()
            boolean r1 = r1.prepared
            if (r1 != 0) goto L39
            long r1 = r14.rendererPositionUs
            com.google.android.exoplayer2.MediaPeriodHolder r3 = r0.getNext()
            long r3 = r3.getStartPositionRendererTime()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L39
            return
        L39:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r11 = r0.getTrackSelectorResult()
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r14.queue
            com.google.android.exoplayer2.MediaPeriodHolder r12 = r1.advanceReadingPeriod()
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r13 = r12.getTrackSelectorResult()
            com.google.android.exoplayer2.PlaybackInfo r1 = r14.playbackInfo
            com.google.android.exoplayer2.Timeline r3 = r1.timeline
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r12.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r1.id
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r0.id
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r0 = r14
            r1 = r3
            r0.updatePlaybackSpeedSettingsForNewPeriod(r1, r2, r3, r4, r5, r7)
            boolean r0 = r12.prepared
            if (r0 == 0) goto L74
            com.google.android.exoplayer2.source.MediaPeriod r0 = r12.mediaPeriod
            long r0 = r0.readDiscontinuity()
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L74
            long r0 = r12.getStartPositionRendererTime()
            r14.setAllRendererStreamsFinal(r0)
            return
        L74:
            r0 = 0
        L75:
            com.google.android.exoplayer2.Renderer[] r1 = r14.renderers
            int r1 = r1.length
            if (r0 >= r1) goto Lbc
            boolean r1 = r11.isRendererEnabled(r0)
            boolean r2 = r13.isRendererEnabled(r0)
            if (r1 == 0) goto Lb9
            com.google.android.exoplayer2.Renderer[] r1 = r14.renderers
            r1 = r1[r0]
            boolean r1 = r1.isCurrentStreamFinal()
            if (r1 != 0) goto Lb9
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r14.rendererCapabilities
            r1 = r1[r0]
            int r1 = r1.getTrackType()
            r3 = -2
            if (r1 != r3) goto L9b
            r1 = 1
            goto L9c
        L9b:
            r1 = 0
        L9c:
            com.google.android.exoplayer2.RendererConfiguration[] r3 = r11.rendererConfigurations
            r3 = r3[r0]
            com.google.android.exoplayer2.RendererConfiguration[] r4 = r13.rendererConfigurations
            r4 = r4[r0]
            if (r2 == 0) goto Lae
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto Lae
            if (r1 == 0) goto Lb9
        Lae:
            com.google.android.exoplayer2.Renderer[] r1 = r14.renderers
            r1 = r1[r0]
            long r2 = r12.getStartPositionRendererTime()
            r14.setCurrentStreamFinal(r1, r2)
        Lb9:
            int r0 = r0 + 1
            goto L75
        Lbc:
            return
        Lbd:
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r0.info
            boolean r1 = r1.isFinal
            if (r1 != 0) goto Lc7
            boolean r1 = r14.pendingPauseAtEndOfPeriod
            if (r1 == 0) goto Lff
        Lc7:
            com.google.android.exoplayer2.Renderer[] r1 = r14.renderers
            int r2 = r1.length
            if (r10 >= r2) goto Lff
            r1 = r1[r10]
            com.google.android.exoplayer2.source.SampleStream[] r2 = r0.sampleStreams
            r2 = r2[r10]
            if (r2 == 0) goto Lfc
            com.google.android.exoplayer2.source.SampleStream r3 = r1.getStream()
            if (r3 != r2) goto Lfc
            boolean r2 = r1.hasReadStreamToEnd()
            if (r2 == 0) goto Lfc
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r0.info
            long r2 = r2.durationUs
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto Lf8
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Lf8
            long r2 = r0.getRendererOffset()
            com.google.android.exoplayer2.MediaPeriodInfo r4 = r0.info
            long r4 = r4.durationUs
            long r2 = r2 + r4
            goto Lf9
        Lf8:
            r2 = r8
        Lf9:
            r14.setCurrentStreamFinal(r1, r2)
        Lfc:
            int r10 = r10 + 1
            goto Lc7
        Lff:
            return
    }

    private void maybeUpdateReadingRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r2.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getReadingPeriod()
            if (r0 == 0) goto L1e
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r2.queue
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()
            if (r1 == r0) goto L1e
            boolean r0 = r0.allRenderersInCorrectState
            if (r0 == 0) goto L15
            goto L1e
        L15:
            boolean r0 = r2.replaceStreamsOrDisableRendererForTransition()
            if (r0 == 0) goto L1e
            r2.enableRenderers()
        L1e:
            return
    }

    private void mediaSourceListUpdateRequestedInternal() throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.MediaSourceList r0 = r2.mediaSourceList
            com.google.android.exoplayer2.Timeline r0 = r0.createTimeline()
            r1 = 1
            r2.handleMediaSourceListInfoRefreshed(r0, r1)
            return
    }

    private void moveMediaItemsInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.MoveMediaItemsMessage r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r4.playbackInfoUpdate
            r1 = 1
            r0.incrementPendingOperationAcks(r1)
            com.google.android.exoplayer2.MediaSourceList r0 = r4.mediaSourceList
            int r1 = r5.fromIndex
            int r2 = r5.toIndex
            int r3 = r5.newFromIndex
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r5.shuffleOrder
            com.google.android.exoplayer2.Timeline r5 = r0.moveMediaSourceRange(r1, r2, r3, r5)
            r0 = 0
            r4.handleMediaSourceListInfoRefreshed(r5, r0)
            return
    }

    private void notifyTrackSelectionDiscontinuity() {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
        L6:
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r0.getTrackSelectorResult()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r1.selections
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L1c
            r4 = r1[r3]
            if (r4 == 0) goto L19
            r4.onDiscontinuity()
        L19:
            int r3 = r3 + 1
            goto L10
        L1c:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            goto L6
        L21:
            return
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean r6) {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
        L6:
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r0.getTrackSelectorResult()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r1.selections
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L1c
            r4 = r1[r3]
            if (r4 == 0) goto L19
            r4.onPlayWhenReadyChanged(r6)
        L19:
            int r3 = r3 + 1
            goto L10
        L1c:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            goto L6
        L21:
            return
    }

    private void notifyTrackSelectionRebuffer() {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
        L6:
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r0.getTrackSelectorResult()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r1.selections
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L1c
            r4 = r1[r3]
            if (r4 == 0) goto L19
            r4.onRebuffer()
        L19:
            int r3 = r3 + 1
            goto L10
        L1c:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            goto L6
        L21:
            return
    }

    private void prepareInternal() {
            r3 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r3.playbackInfoUpdate
            r1 = 1
            r0.incrementPendingOperationAcks(r1)
            r0 = 0
            r3.resetInternal(r0, r0, r0, r1)
            com.google.android.exoplayer2.LoadControl r0 = r3.loadControl
            r0.onPrepared()
            com.google.android.exoplayer2.PlaybackInfo r0 = r3.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            r1 = 2
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r3.setState(r0)
            com.google.android.exoplayer2.MediaSourceList r0 = r3.mediaSourceList
            com.google.android.exoplayer2.upstream.BandwidthMeter r2 = r3.bandwidthMeter
            com.google.android.exoplayer2.upstream.TransferListener r2 = r2.getTransferListener()
            r0.prepare(r2)
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            r0.sendEmptyMessage(r1)
            return
    }

    private void releaseInternal() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.resetInternal(r0, r1, r0, r1)
            com.google.android.exoplayer2.LoadControl r1 = r2.loadControl
            r1.onReleased()
            r2.setState(r0)
            android.os.HandlerThread r1 = r2.internalPlaybackThread
            if (r1 == 0) goto L14
            r1.quit()
        L14:
            monitor-enter(r2)
            r2.released = r0     // Catch: java.lang.Throwable -> L1c
            r2.notifyAll()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    private void removeMediaItemsInternal(int r3, int r4, com.google.android.exoplayer2.source.ShuffleOrder r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r2.playbackInfoUpdate
            r1 = 1
            r0.incrementPendingOperationAcks(r1)
            com.google.android.exoplayer2.MediaSourceList r0 = r2.mediaSourceList
            com.google.android.exoplayer2.Timeline r3 = r0.removeMediaSourceRange(r3, r4, r5)
            r4 = 0
            r2.handleMediaSourceListInfoRefreshed(r3, r4)
            return
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws com.google.android.exoplayer2.ExoPlaybackException {
            r15 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r15.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getReadingPeriod()
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r0.getTrackSelectorResult()
            r2 = 0
            r3 = 0
            r4 = 0
        Ld:
            com.google.android.exoplayer2.Renderer[] r5 = r15.renderers
            int r6 = r5.length
            r7 = 1
            if (r3 >= r6) goto L5e
            r8 = r5[r3]
            boolean r5 = isRendererEnabled(r8)
            if (r5 != 0) goto L1c
            goto L5b
        L1c:
            com.google.android.exoplayer2.source.SampleStream r5 = r8.getStream()
            com.google.android.exoplayer2.source.SampleStream[] r6 = r0.sampleStreams
            r6 = r6[r3]
            if (r5 == r6) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            boolean r6 = r1.isRendererEnabled(r3)
            if (r6 == 0) goto L32
            if (r5 != 0) goto L32
            goto L5b
        L32:
            boolean r5 = r8.isCurrentStreamFinal()
            if (r5 != 0) goto L50
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5 = r1.selections
            r5 = r5[r3]
            com.google.android.exoplayer2.Format[] r9 = getFormats(r5)
            com.google.android.exoplayer2.source.SampleStream[] r5 = r0.sampleStreams
            r10 = r5[r3]
            long r11 = r0.getStartPositionRendererTime()
            long r13 = r0.getRendererOffset()
            r8.replaceStream(r9, r10, r11, r13)
            goto L5b
        L50:
            boolean r5 = r8.isEnded()
            if (r5 == 0) goto L5a
            r15.disableRenderer(r8)
            goto L5b
        L5a:
            r4 = 1
        L5b:
            int r3 = r3 + 1
            goto Ld
        L5e:
            r0 = r4 ^ 1
            return r0
    }

    private void reselectTracksInternal() throws com.google.android.exoplayer2.ExoPlaybackException {
            r19 = this;
            r10 = r19
            com.google.android.exoplayer2.DefaultMediaClock r0 = r10.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            float r0 = r0.speed
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r10.queue
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r10.queue
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.getReadingPeriod()
            r3 = 1
        L17:
            if (r1 == 0) goto Lf3
            boolean r4 = r1.prepared
            if (r4 != 0) goto L1f
            goto Lf3
        L1f:
            com.google.android.exoplayer2.PlaybackInfo r4 = r10.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r4.timeline
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r13 = r1.selectTracks(r0, r4)
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r4 = r1.getTrackSelectorResult()
            boolean r4 = r13.isEquivalent(r4)
            r9 = 0
            if (r4 != 0) goto Le8
            r8 = 4
            if (r3 == 0) goto Lb5
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r10.queue
            com.google.android.exoplayer2.MediaPeriodHolder r6 = r0.getPlayingPeriod()
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r10.queue
            boolean r16 = r0.removeAfter(r6)
            com.google.android.exoplayer2.Renderer[] r0 = r10.renderers
            int r0 = r0.length
            boolean[] r7 = new boolean[r0]
            com.google.android.exoplayer2.PlaybackInfo r0 = r10.playbackInfo
            long r14 = r0.positionUs
            r12 = r6
            r17 = r7
            long r12 = r12.applyTrackSelection(r13, r14, r16, r17)
            com.google.android.exoplayer2.PlaybackInfo r0 = r10.playbackInfo
            int r1 = r0.playbackState
            if (r1 == r8) goto L5f
            long r0 = r0.positionUs
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L5f
            r14 = 1
            goto L60
        L5f:
            r14 = 0
        L60:
            com.google.android.exoplayer2.PlaybackInfo r0 = r10.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            long r2 = r0.discontinuityStartPositionUs
            r15 = 5
            r0 = r19
            r16 = r2
            r2 = r12
            r11 = r6
            r18 = r7
            r6 = r16
            r8 = r14
            r9 = r15
            com.google.android.exoplayer2.PlaybackInfo r0 = r0.handlePositionDiscontinuity(r1, r2, r4, r6, r8, r9)
            r10.playbackInfo = r0
            if (r14 == 0) goto L80
            r10.resetRendererPosition(r12)
        L80:
            com.google.android.exoplayer2.Renderer[] r0 = r10.renderers
            int r0 = r0.length
            boolean[] r0 = new boolean[r0]
            r9 = 0
        L86:
            com.google.android.exoplayer2.Renderer[] r1 = r10.renderers
            int r2 = r1.length
            if (r9 >= r2) goto Lb1
            r1 = r1[r9]
            boolean r2 = isRendererEnabled(r1)
            r0[r9] = r2
            com.google.android.exoplayer2.source.SampleStream[] r2 = r11.sampleStreams
            r2 = r2[r9]
            boolean r3 = r0[r9]
            if (r3 == 0) goto Lae
            com.google.android.exoplayer2.source.SampleStream r3 = r1.getStream()
            if (r2 == r3) goto La5
            r10.disableRenderer(r1)
            goto Lae
        La5:
            boolean r2 = r18[r9]
            if (r2 == 0) goto Lae
            long r2 = r10.rendererPositionUs
            r1.resetPosition(r2)
        Lae:
            int r9 = r9 + 1
            goto L86
        Lb1:
            r10.enableRenderers(r0)
            goto Ld0
        Lb5:
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r10.queue
            r0.removeAfter(r1)
            boolean r0 = r1.prepared
            if (r0 == 0) goto Ld0
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r1.info
            long r2 = r0.startPositionUs
            long r4 = r10.rendererPositionUs
            long r4 = r1.toPeriodTime(r4)
            long r2 = java.lang.Math.max(r2, r4)
            r4 = 0
            r1.applyTrackSelection(r13, r2, r4)
        Ld0:
            r5 = 1
            r10.handleLoadingMediaPeriodChanged(r5)
            com.google.android.exoplayer2.PlaybackInfo r0 = r10.playbackInfo
            int r0 = r0.playbackState
            r1 = 4
            if (r0 == r1) goto Le7
            r19.maybeContinueLoading()
            r19.updatePlaybackPositions()
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r10.handler
            r1 = 2
            r0.sendEmptyMessage(r1)
        Le7:
            return
        Le8:
            r4 = 0
            r5 = 1
            if (r1 != r2) goto Led
            r3 = 0
        Led:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getNext()
            goto L17
        Lf3:
            return
    }

    private void resetInternal(boolean r29, boolean r30, boolean r31, boolean r32) {
            r28 = this;
            r1 = r28
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r1.handler
            r2 = 2
            r0.removeMessages(r2)
            r2 = 0
            r1.pendingRecoverableRendererError = r2
            r3 = 0
            r1.isRebuffering = r3
            com.google.android.exoplayer2.DefaultMediaClock r0 = r1.mediaClock
            r0.stop()
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.rendererPositionUs = r4
            com.google.android.exoplayer2.Renderer[] r4 = r1.renderers
            int r5 = r4.length
            r6 = 0
        L1e:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L33
            r0 = r4[r6]
            r1.disableRenderer(r0)     // Catch: java.lang.RuntimeException -> L28 com.google.android.exoplayer2.ExoPlaybackException -> L2a
            goto L30
        L28:
            r0 = move-exception
            goto L2b
        L2a:
            r0 = move-exception
        L2b:
            java.lang.String r8 = "Disable failed."
            com.google.android.exoplayer2.util.Log.e(r7, r8, r0)
        L30:
            int r6 = r6 + 1
            goto L1e
        L33:
            if (r29 == 0) goto L53
            com.google.android.exoplayer2.Renderer[] r4 = r1.renderers
            int r5 = r4.length
            r6 = 0
        L39:
            if (r6 >= r5) goto L53
            r0 = r4[r6]
            java.util.Set<com.google.android.exoplayer2.Renderer> r8 = r1.renderersToReset
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L50
            r0.reset()     // Catch: java.lang.RuntimeException -> L49
            goto L50
        L49:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            com.google.android.exoplayer2.util.Log.e(r7, r0, r8)
        L50:
            int r6 = r6 + 1
            goto L39
        L53:
            r1.enabledRendererCount = r3
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r0.periodId
            long r5 = r0.positionUs
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L75
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline$Period r7 = r1.period
            boolean r0 = isUsingPlaceholderPeriod(r0, r7)
            if (r0 == 0) goto L70
            goto L75
        L70:
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            long r7 = r0.positionUs
            goto L79
        L75:
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            long r7 = r0.requestedContentPositionUs
        L79:
            if (r30 == 0) goto La6
            r1.pendingInitialSeekPosition = r2
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            android.util.Pair r0 = r1.getPlaceholderFirstMediaPeriodPositionUs(r0)
            java.lang.Object r4 = r0.first
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto La6
            r0 = 1
            r17 = r4
            r25 = r5
            goto Lab
        La6:
            r17 = r4
            r25 = r5
            r0 = 0
        Lab:
            com.google.android.exoplayer2.MediaPeriodQueue r4 = r1.queue
            r4.clear()
            r1.shouldContinueLoading = r3
            com.google.android.exoplayer2.PlaybackInfo r3 = new com.google.android.exoplayer2.PlaybackInfo
            com.google.android.exoplayer2.PlaybackInfo r4 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline r5 = r4.timeline
            int r11 = r4.playbackState
            if (r32 == 0) goto Lbd
            goto Lbf
        Lbd:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r4.playbackError
        Lbf:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto Lc6
            com.google.android.exoplayer2.source.TrackGroupArray r2 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            goto Lc8
        Lc6:
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r4.trackGroups
        Lc8:
            r14 = r2
            if (r0 == 0) goto Lce
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r1.emptyTrackSelectorResult
            goto Ld0
        Lce:
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r4.trackSelectorResult
        Ld0:
            r15 = r2
            if (r0 == 0) goto Ld8
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto Lda
        Ld8:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r0 = r4.staticMetadata
        Lda:
            r16 = r0
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            boolean r2 = r0.playWhenReady
            r18 = r2
            int r2 = r0.playbackSuppressionReason
            r19 = r2
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            r20 = r0
            r23 = 0
            r27 = 0
            r4 = r3
            r6 = r17
            r9 = r25
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27)
            r1.playbackInfo = r3
            if (r31 == 0) goto L101
            com.google.android.exoplayer2.MediaSourceList r0 = r1.mediaSourceList
            r0.release()
        L101:
            return
    }

    private void resetPendingPauseAtEndOfPeriod() {
            r1 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r1.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            if (r0 == 0) goto L14
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.info
            boolean r0 = r0.isLastInTimelineWindow
            if (r0 == 0) goto L14
            boolean r0 = r1.pauseAtEndOfWindow
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r1.pendingPauseAtEndOfPeriod = r0
            return
    }

    private void resetRendererPosition(long r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r4.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            if (r0 != 0) goto Lf
            r0 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            long r5 = r5 + r0
            goto L13
        Lf:
            long r5 = r0.toRendererTime(r5)
        L13:
            r4.rendererPositionUs = r5
            com.google.android.exoplayer2.DefaultMediaClock r0 = r4.mediaClock
            r0.resetPosition(r5)
            com.google.android.exoplayer2.Renderer[] r5 = r4.renderers
            int r6 = r5.length
            r0 = 0
        L1e:
            if (r0 >= r6) goto L30
            r1 = r5[r0]
            boolean r2 = isRendererEnabled(r1)
            if (r2 == 0) goto L2d
            long r2 = r4.rendererPositionUs
            r1.resetPosition(r2)
        L2d:
            int r0 = r0 + 1
            goto L1e
        L30:
            r4.notifyTrackSelectionDiscontinuity()
            return
    }

    private static void resolvePendingMessageEndOfStreamPosition(com.google.android.exoplayer2.Timeline r4, com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo r5, com.google.android.exoplayer2.Timeline.Window r6, com.google.android.exoplayer2.Timeline.Period r7) {
            java.lang.Object r0 = r5.resolvedPeriodUid
            com.google.android.exoplayer2.Timeline$Period r0 = r4.getPeriodByUid(r0, r7)
            int r0 = r0.windowIndex
            com.google.android.exoplayer2.Timeline$Window r6 = r4.getWindow(r0, r6)
            int r6 = r6.lastPeriodIndex
            r0 = 1
            com.google.android.exoplayer2.Timeline$Period r4 = r4.getPeriod(r6, r7, r0)
            java.lang.Object r4 = r4.uid
            long r0 = r7.durationUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L24
            r2 = 1
            long r0 = r0 - r2
            goto L29
        L24:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L29:
            r5.setResolvedPosition(r6, r0, r4)
            return
    }

    private static boolean resolvePendingMessagePosition(com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo r15, com.google.android.exoplayer2.Timeline r16, com.google.android.exoplayer2.Timeline r17, int r18, boolean r19, com.google.android.exoplayer2.Timeline.Window r20, com.google.android.exoplayer2.Timeline.Period r21) {
            r0 = r15
            r8 = r16
            r1 = r17
            r9 = r20
            r10 = r21
            java.lang.Object r2 = r0.resolvedPeriodUid
            r11 = 0
            r12 = 1
            r13 = -9223372036854775808
            if (r2 != 0) goto L71
            com.google.android.exoplayer2.PlayerMessage r1 = r0.message
            long r1 = r1.getPositionMs()
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 != 0) goto L21
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L2b
        L21:
            com.google.android.exoplayer2.PlayerMessage r1 = r0.message
            long r1 = r1.getPositionMs()
            long r1 = com.google.android.exoplayer2.util.Util.msToUs(r1)
        L2b:
            com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition r3 = new com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition
            com.google.android.exoplayer2.PlayerMessage r4 = r0.message
            com.google.android.exoplayer2.Timeline r4 = r4.getTimeline()
            com.google.android.exoplayer2.PlayerMessage r5 = r0.message
            int r5 = r5.getMediaItemIndex()
            r3.<init>(r4, r5, r1)
            r4 = 0
            r1 = r16
            r2 = r3
            r3 = r4
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            android.util.Pair r1 = resolveSeekPositionUs(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L50
            return r11
        L50:
            java.lang.Object r2 = r1.first
            int r2 = r8.getIndexOfPeriod(r2)
            java.lang.Object r3 = r1.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            java.lang.Object r1 = r1.first
            r15.setResolvedPosition(r2, r3, r1)
            com.google.android.exoplayer2.PlayerMessage r1 = r0.message
            long r1 = r1.getPositionMs()
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 != 0) goto L70
            resolvePendingMessageEndOfStreamPosition(r8, r15, r9, r10)
        L70:
            return r12
        L71:
            int r2 = r8.getIndexOfPeriod(r2)
            r3 = -1
            if (r2 != r3) goto L79
            return r11
        L79:
            com.google.android.exoplayer2.PlayerMessage r3 = r0.message
            long r3 = r3.getPositionMs()
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 != 0) goto L87
            resolvePendingMessageEndOfStreamPosition(r8, r15, r9, r10)
            return r12
        L87:
            r0.resolvedPeriodIndex = r2
            java.lang.Object r2 = r0.resolvedPeriodUid
            r1.getPeriodByUid(r2, r10)
            boolean r2 = r10.isPlaceholder
            if (r2 == 0) goto Lcf
            int r2 = r10.windowIndex
            com.google.android.exoplayer2.Timeline$Window r2 = r1.getWindow(r2, r9)
            int r2 = r2.firstPeriodIndex
            java.lang.Object r3 = r0.resolvedPeriodUid
            int r1 = r1.getIndexOfPeriod(r3)
            if (r2 != r1) goto Lcf
            long r1 = r0.resolvedPeriodTimeUs
            long r3 = r21.getPositionInWindowUs()
            long r5 = r3 + r1
            java.lang.Object r1 = r0.resolvedPeriodUid
            com.google.android.exoplayer2.Timeline$Period r1 = r8.getPeriodByUid(r1, r10)
            int r4 = r1.windowIndex
            r1 = r16
            r2 = r20
            r3 = r21
            android.util.Pair r1 = r1.getPeriodPositionUs(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            int r2 = r8.getIndexOfPeriod(r2)
            java.lang.Object r3 = r1.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            java.lang.Object r1 = r1.first
            r15.setResolvedPosition(r2, r3, r1)
        Lcf:
            return r12
    }

    private void resolvePendingMessagePositions(com.google.android.exoplayer2.Timeline r10, com.google.android.exoplayer2.Timeline r11) {
            r9 = this;
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto Ld
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r0 = r9.pendingMessages
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L15:
            if (r0 < 0) goto L46
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r1 = r9.pendingMessages
            java.lang.Object r1 = r1.get(r0)
            r2 = r1
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r2 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r2
            int r5 = r9.repeatMode
            boolean r6 = r9.shuffleModeEnabled
            com.google.android.exoplayer2.Timeline$Window r7 = r9.window
            com.google.android.exoplayer2.Timeline$Period r8 = r9.period
            r3 = r10
            r4 = r11
            boolean r1 = resolvePendingMessagePosition(r2, r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto L43
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r1 = r9.pendingMessages
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r1 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r1
            com.google.android.exoplayer2.PlayerMessage r1 = r1.message
            r2 = 0
            r1.markAsProcessed(r2)
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r1 = r9.pendingMessages
            r1.remove(r0)
        L43:
            int r0 = r0 + (-1)
            goto L15
        L46:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r10 = r9.pendingMessages
            java.util.Collections.sort(r10)
            return
    }

    private static com.google.android.exoplayer2.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(com.google.android.exoplayer2.Timeline r30, com.google.android.exoplayer2.PlaybackInfo r31, @androidx.annotation.Nullable com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r32, com.google.android.exoplayer2.MediaPeriodQueue r33, int r34, boolean r35, com.google.android.exoplayer2.Timeline.Window r36, com.google.android.exoplayer2.Timeline.Period r37) {
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r37
            boolean r0 = r30.isEmpty()
            if (r0 == 0) goto L25
            com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = com.google.android.exoplayer2.PlaybackInfo.getDummyPeriodForEmptyTimeline()
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 1
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L25:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r8.periodId
            java.lang.Object r12 = r14.periodUid
            boolean r13 = isUsingPlaceholderPeriod(r8, r11)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r8.periodId
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L3b
            if (r13 == 0) goto L38
            goto L3b
        L38:
            long r0 = r8.positionUs
            goto L3d
        L3b:
            long r0 = r8.requestedContentPositionUs
        L3d:
            r15 = r0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            r19 = 0
            r20 = 1
            if (r9 == 0) goto L9d
            r2 = 1
            r0 = r30
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r21 = r14
            r14 = -1
            r6 = r37
            android.util.Pair r0 = resolveSeekPositionUs(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L6a
            int r0 = r7.getFirstWindowIndex(r10)
            r6 = r0
            r0 = r15
            r2 = 0
            r3 = 0
            r4 = 1
            goto L90
        L6a:
            long r1 = r9.windowPositionUs
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 != 0) goto L7b
            java.lang.Object r0 = r0.first
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r0, r11)
            int r6 = r0.windowIndex
            r0 = r15
            r2 = 0
            goto L87
        L7b:
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 1
            r6 = -1
        L87:
            int r3 = r8.playbackState
            r4 = 4
            if (r3 != r4) goto L8e
            r3 = 1
            goto L8f
        L8e:
            r3 = 0
        L8f:
            r4 = 0
        L90:
            r9 = r36
            r29 = r2
            r27 = r3
            r28 = r4
            r3 = r6
            r6 = r21
            goto L14b
        L9d:
            r21 = r14
            r14 = -1
            com.google.android.exoplayer2.Timeline r0 = r8.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lba
            int r0 = r7.getFirstWindowIndex(r10)
        Lac:
            r9 = r36
            r3 = r0
            r0 = r15
            r6 = r21
        Lb2:
            r27 = 0
            r28 = 0
        Lb6:
            r29 = 0
            goto L14b
        Lba:
            int r0 = r7.getIndexOfPeriod(r12)
            if (r0 != r14) goto Leb
            com.google.android.exoplayer2.Timeline r5 = r8.timeline
            r0 = r36
            r1 = r37
            r2 = r34
            r3 = r35
            r4 = r12
            r6 = r30
            java.lang.Object r0 = resolveSubsequentPeriod(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto Ld9
            int r0 = r7.getFirstWindowIndex(r10)
            r4 = 1
            goto Le0
        Ld9:
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r0, r11)
            int r0 = r0.windowIndex
            r4 = 0
        Le0:
            r9 = r36
            r3 = r0
            r28 = r4
            r0 = r15
            r6 = r21
            r27 = 0
            goto Lb6
        Leb:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto Lf6
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r12, r11)
            int r0 = r0.windowIndex
            goto Lac
        Lf6:
            if (r13 == 0) goto L143
            com.google.android.exoplayer2.Timeline r0 = r8.timeline
            r6 = r21
            java.lang.Object r1 = r6.periodUid
            r0.getPeriodByUid(r1, r11)
            com.google.android.exoplayer2.Timeline r0 = r8.timeline
            int r1 = r11.windowIndex
            r9 = r36
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r9)
            int r0 = r0.firstPeriodIndex
            com.google.android.exoplayer2.Timeline r1 = r8.timeline
            java.lang.Object r2 = r6.periodUid
            int r1 = r1.getIndexOfPeriod(r2)
            if (r0 != r1) goto L13a
            long r0 = r37.getPositionInWindowUs()
            long r4 = r0 + r15
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r12, r11)
            int r3 = r0.windowIndex
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r12 = r1
            r0 = r2
            goto L13b
        L13a:
            r0 = r15
        L13b:
            r3 = -1
            r27 = 0
            r28 = 0
            r29 = 1
            goto L14b
        L143:
            r9 = r36
            r6 = r21
            r0 = r15
            r3 = -1
            goto Lb2
        L14b:
            if (r3 == r14) goto L16b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = r33
            r25 = r17
            goto L16f
        L16b:
            r2 = r33
            r25 = r0
        L16f:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(r7, r12, r0)
            int r3 = r2.nextAdGroupIndex
            if (r3 == r14) goto L180
            int r4 = r6.nextAdGroupIndex
            if (r4 == r14) goto L17e
            if (r3 < r4) goto L17e
            goto L180
        L17e:
            r3 = 0
            goto L181
        L180:
            r3 = 1
        L181:
            java.lang.Object r4 = r6.periodUid
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L198
            boolean r4 = r6.isAd()
            if (r4 != 0) goto L198
            boolean r4 = r2.isAd()
            if (r4 != 0) goto L198
            if (r3 == 0) goto L198
            goto L19a
        L198:
            r20 = 0
        L19a:
            com.google.android.exoplayer2.Timeline$Period r17 = r7.getPeriodByUid(r12, r11)
            r12 = r13
            r13 = r6
            r3 = r6
            r14 = r15
            r16 = r2
            r18 = r25
            boolean r4 = isIgnorableServerSideAdInsertionPeriodChange(r12, r13, r14, r16, r17, r18)
            if (r20 != 0) goto L1ae
            if (r4 == 0) goto L1af
        L1ae:
            r2 = r3
        L1af:
            boolean r4 = r2.isAd()
            if (r4 == 0) goto L1d4
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L1be
            long r0 = r8.positionUs
            goto L1d4
        L1be:
            java.lang.Object r0 = r2.periodUid
            r7.getPeriodByUid(r0, r11)
            int r0 = r2.adIndexInAdGroup
            int r1 = r2.adGroupIndex
            int r1 = r11.getFirstAdIndexToPlay(r1)
            if (r0 != r1) goto L1d2
            long r0 = r37.getAdResumePositionUs()
            goto L1d4
        L1d2:
            r0 = 0
        L1d4:
            r23 = r0
            com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange
            r21 = r0
            r22 = r2
            r21.<init>(r22, r23, r25, r27, r28, r29)
            return r0
    }

    @androidx.annotation.Nullable
    private static android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs(com.google.android.exoplayer2.Timeline r12, com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r13, boolean r14, int r15, boolean r16, com.google.android.exoplayer2.Timeline.Window r17, com.google.android.exoplayer2.Timeline.Period r18) {
            r7 = r12
            r0 = r13
            r8 = r18
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            boolean r2 = r12.isEmpty()
            r9 = 0
            if (r2 == 0) goto Le
            return r9
        Le:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L16
            r10 = r7
            goto L17
        L16:
            r10 = r1
        L17:
            int r4 = r0.windowIndex     // Catch: java.lang.IndexOutOfBoundsException -> L8e
            long r5 = r0.windowPositionUs     // Catch: java.lang.IndexOutOfBoundsException -> L8e
            r1 = r10
            r2 = r17
            r3 = r18
            android.util.Pair r1 = r1.getPeriodPositionUs(r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L8e
            boolean r2 = r12.equals(r10)
            if (r2 == 0) goto L2b
            return r1
        L2b:
            java.lang.Object r2 = r1.first
            int r2 = r12.getIndexOfPeriod(r2)
            r3 = -1
            if (r2 == r3) goto L64
            java.lang.Object r2 = r1.first
            com.google.android.exoplayer2.Timeline$Period r2 = r10.getPeriodByUid(r2, r8)
            boolean r2 = r2.isPlaceholder
            if (r2 == 0) goto L63
            int r2 = r8.windowIndex
            r11 = r17
            com.google.android.exoplayer2.Timeline$Window r2 = r10.getWindow(r2, r11)
            int r2 = r2.firstPeriodIndex
            java.lang.Object r3 = r1.first
            int r3 = r10.getIndexOfPeriod(r3)
            if (r2 != r3) goto L63
            java.lang.Object r1 = r1.first
            com.google.android.exoplayer2.Timeline$Period r1 = r12.getPeriodByUid(r1, r8)
            int r3 = r1.windowIndex
            long r4 = r0.windowPositionUs
            r0 = r12
            r1 = r17
            r2 = r18
            android.util.Pair r1 = r0.getPeriodPositionUs(r1, r2, r3, r4)
        L63:
            return r1
        L64:
            r11 = r17
            if (r14 == 0) goto L8e
            java.lang.Object r4 = r1.first
            r0 = r17
            r1 = r18
            r2 = r15
            r3 = r16
            r5 = r10
            r6 = r12
            java.lang.Object r0 = resolveSubsequentPeriod(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L8e
            com.google.android.exoplayer2.Timeline$Period r0 = r12.getPeriodByUid(r0, r8)
            int r3 = r0.windowIndex
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r12
            r1 = r17
            r2 = r18
            android.util.Pair r0 = r0.getPeriodPositionUs(r1, r2, r3, r4)
            return r0
        L8e:
            return r9
    }

    @androidx.annotation.Nullable
    public static java.lang.Object resolveSubsequentPeriod(com.google.android.exoplayer2.Timeline.Window r9, com.google.android.exoplayer2.Timeline.Period r10, int r11, boolean r12, java.lang.Object r13, com.google.android.exoplayer2.Timeline r14, com.google.android.exoplayer2.Timeline r15) {
            int r13 = r14.getIndexOfPeriod(r13)
            int r0 = r14.getPeriodCount()
            r1 = -1
            r2 = 0
            r4 = r13
            r13 = -1
        Lc:
            if (r2 >= r0) goto L27
            if (r13 != r1) goto L27
            r3 = r14
            r5 = r10
            r6 = r9
            r7 = r11
            r8 = r12
            int r4 = r3.getNextPeriodIndex(r4, r5, r6, r7, r8)
            if (r4 != r1) goto L1c
            goto L27
        L1c:
            java.lang.Object r13 = r14.getUidOfPeriod(r4)
            int r13 = r15.getIndexOfPeriod(r13)
            int r2 = r2 + 1
            goto Lc
        L27:
            if (r13 != r1) goto L2b
            r9 = 0
            goto L2f
        L2b:
            java.lang.Object r9 = r15.getUidOfPeriod(r13)
        L2f:
            return r9
    }

    private void scheduleNextWork(long r2, long r4) {
            r1 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r1.handler
            long r2 = r2 + r4
            r4 = 2
            r0.sendEmptyMessageAtTime(r4, r2)
            return
    }

    private void seekToCurrentPosition(boolean r12) throws com.google.android.exoplayer2.ExoPlaybackException {
            r11 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.id
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            long r3 = r1.positionUs
            r5 = 1
            r6 = 0
            r1 = r11
            r2 = r0
            long r3 = r1.seekToPeriodPosition(r2, r3, r5, r6)
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            long r1 = r1.positionUs
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L2e
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            long r5 = r1.requestedContentPositionUs
            long r7 = r1.discontinuityStartPositionUs
            r10 = 5
            r1 = r11
            r2 = r0
            r9 = r12
            com.google.android.exoplayer2.PlaybackInfo r12 = r1.handlePositionDiscontinuity(r2, r3, r5, r7, r9, r10)
            r11.playbackInfo = r12
        L2e:
            return
    }

    private void seekToInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r20) throws com.google.android.exoplayer2.ExoPlaybackException {
            r19 = this;
            r11 = r19
            r0 = r20
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r1 = r11.playbackInfoUpdate
            r8 = 1
            r1.incrementPendingOperationAcks(r8)
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            int r4 = r11.repeatMode
            boolean r5 = r11.shuffleModeEnabled
            com.google.android.exoplayer2.Timeline$Window r6 = r11.window
            com.google.android.exoplayer2.Timeline$Period r7 = r11.period
            r3 = 1
            r2 = r20
            android.util.Pair r1 = resolveSeekPositionUs(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L4b
            com.google.android.exoplayer2.PlaybackInfo r7 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r7 = r7.timeline
            android.util.Pair r7 = r11.getPlaceholderFirstMediaPeriodPositionUs(r7)
            java.lang.Object r9 = r7.first
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r9 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            com.google.android.exoplayer2.PlaybackInfo r7 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r7 = r7.timeline
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r8
            r10 = r7
            r17 = r4
        L47:
            r4 = r12
            r12 = r17
            goto La1
        L4b:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.windowPositionUs
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L5d
            r9 = r4
            goto L5e
        L5d:
            r9 = r12
        L5e:
            com.google.android.exoplayer2.MediaPeriodQueue r14 = r11.queue
            com.google.android.exoplayer2.PlaybackInfo r15 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r15 = r15.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r14.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(r15, r7, r12)
            boolean r14 = r7.isAd()
            if (r14 == 0) goto L93
            com.google.android.exoplayer2.PlaybackInfo r4 = r11.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r4.timeline
            java.lang.Object r5 = r7.periodUid
            com.google.android.exoplayer2.Timeline$Period r12 = r11.period
            r4.getPeriodByUid(r5, r12)
            com.google.android.exoplayer2.Timeline$Period r4 = r11.period
            int r5 = r7.adGroupIndex
            int r4 = r4.getFirstAdIndexToPlay(r5)
            int r5 = r7.adIndexInAdGroup
            if (r4 != r5) goto L8d
            com.google.android.exoplayer2.Timeline$Period r4 = r11.period
            long r4 = r4.getAdResumePositionUs()
            r12 = r4
            goto L8e
        L8d:
            r12 = r2
        L8e:
            r4 = r12
            r12 = r9
            r10 = 1
            r9 = r7
            goto La1
        L93:
            long r14 = r0.windowPositionUs
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L9b
            r4 = 1
            goto L9c
        L9b:
            r4 = 0
        L9c:
            r17 = r9
            r10 = r4
            r9 = r7
            goto L47
        La1:
            com.google.android.exoplayer2.PlaybackInfo r7 = r11.playbackInfo     // Catch: java.lang.Throwable -> L146
            com.google.android.exoplayer2.Timeline r7 = r7.timeline     // Catch: java.lang.Throwable -> L146
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L146
            if (r7 == 0) goto Lae
            r11.pendingInitialSeekPosition = r0     // Catch: java.lang.Throwable -> L146
            goto Lbd
        Lae:
            r0 = 4
            if (r1 != 0) goto Lc0
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo     // Catch: java.lang.Throwable -> L146
            int r1 = r1.playbackState     // Catch: java.lang.Throwable -> L146
            if (r1 == r8) goto Lba
            r11.setState(r0)     // Catch: java.lang.Throwable -> L146
        Lba:
            r11.resetInternal(r6, r8, r6, r8)     // Catch: java.lang.Throwable -> L146
        Lbd:
            r7 = r4
            goto L134
        Lc0:
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo     // Catch: java.lang.Throwable -> L146
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId     // Catch: java.lang.Throwable -> L146
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Throwable -> L146
            if (r1 == 0) goto L10f
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r11.queue     // Catch: java.lang.Throwable -> L146
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()     // Catch: java.lang.Throwable -> L146
            if (r1 == 0) goto Le3
            boolean r7 = r1.prepared     // Catch: java.lang.Throwable -> L146
            if (r7 == 0) goto Le3
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto Le3
            com.google.android.exoplayer2.source.MediaPeriod r1 = r1.mediaPeriod     // Catch: java.lang.Throwable -> L146
            com.google.android.exoplayer2.SeekParameters r2 = r11.seekParameters     // Catch: java.lang.Throwable -> L146
            long r1 = r1.getAdjustedSeekPositionUs(r4, r2)     // Catch: java.lang.Throwable -> L146
            goto Le4
        Le3:
            r1 = r4
        Le4:
            long r14 = com.google.android.exoplayer2.util.Util.usToMs(r1)     // Catch: java.lang.Throwable -> L146
            com.google.android.exoplayer2.PlaybackInfo r3 = r11.playbackInfo     // Catch: java.lang.Throwable -> L146
            long r6 = r3.positionUs     // Catch: java.lang.Throwable -> L146
            long r6 = com.google.android.exoplayer2.util.Util.usToMs(r6)     // Catch: java.lang.Throwable -> L146
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L110
            com.google.android.exoplayer2.PlaybackInfo r3 = r11.playbackInfo     // Catch: java.lang.Throwable -> L146
            int r6 = r3.playbackState     // Catch: java.lang.Throwable -> L146
            r7 = 2
            if (r6 == r7) goto Lfe
            r7 = 3
            if (r6 != r7) goto L110
        Lfe:
            long r7 = r3.positionUs     // Catch: java.lang.Throwable -> L146
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.handlePositionDiscontinuity(r2, r3, r5, r7, r9, r10)
            r11.playbackInfo = r0
            return
        L10f:
            r1 = r4
        L110:
            com.google.android.exoplayer2.PlaybackInfo r3 = r11.playbackInfo     // Catch: java.lang.Throwable -> L146
            int r3 = r3.playbackState     // Catch: java.lang.Throwable -> L146
            if (r3 != r0) goto L118
            r0 = 1
            goto L119
        L118:
            r0 = 0
        L119:
            long r14 = r11.seekToPeriodPosition(r9, r1, r0)     // Catch: java.lang.Throwable -> L146
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L122
            goto L123
        L122:
            r8 = 0
        L123:
            r10 = r10 | r8
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo     // Catch: java.lang.Throwable -> L143
            com.google.android.exoplayer2.Timeline r4 = r0.timeline     // Catch: java.lang.Throwable -> L143
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.periodId     // Catch: java.lang.Throwable -> L143
            r8 = 1
            r1 = r19
            r2 = r4
            r3 = r9
            r6 = r12
            r1.updatePlaybackSpeedSettingsForNewPeriod(r2, r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L143
            r7 = r14
        L134:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.handlePositionDiscontinuity(r2, r3, r5, r7, r9, r10)
            r11.playbackInfo = r0
            return
        L143:
            r0 = move-exception
            r7 = r14
            goto L148
        L146:
            r0 = move-exception
            r7 = r4
        L148:
            r14 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.handlePositionDiscontinuity(r2, r3, r5, r7, r9, r10)
            r11.playbackInfo = r1
            throw r0
    }

    private long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r8, long r9, boolean r11) throws com.google.android.exoplayer2.ExoPlaybackException {
            r7 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r7.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r7.queue
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getReadingPeriod()
            if (r0 == r1) goto L11
            r0 = 1
            r5 = 1
            goto L13
        L11:
            r0 = 0
            r5 = 0
        L13:
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r11
            long r8 = r1.seekToPeriodPosition(r2, r3, r5, r6)
            return r8
    }

    private long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r6, long r7, boolean r9, boolean r10) throws com.google.android.exoplayer2.ExoPlaybackException {
            r5 = this;
            r5.stopRenderers()
            r0 = 0
            r5.isRebuffering = r0
            r1 = 2
            if (r10 != 0) goto L10
            com.google.android.exoplayer2.PlaybackInfo r10 = r5.playbackInfo
            int r10 = r10.playbackState
            r2 = 3
            if (r10 != r2) goto L13
        L10:
            r5.setState(r1)
        L13:
            com.google.android.exoplayer2.MediaPeriodQueue r10 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r10 = r10.getPlayingPeriod()
            r2 = r10
        L1a:
            if (r2 == 0) goto L2c
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r2.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.id
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L27
            goto L2c
        L27:
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.getNext()
            goto L1a
        L2c:
            if (r9 != 0) goto L3c
            if (r10 != r2) goto L3c
            if (r2 == 0) goto L6a
            long r9 = r2.toRendererTime(r7)
            r3 = 0
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 >= 0) goto L6a
        L3c:
            com.google.android.exoplayer2.Renderer[] r6 = r5.renderers
            int r9 = r6.length
            r10 = 0
        L40:
            if (r10 >= r9) goto L4a
            r3 = r6[r10]
            r5.disableRenderer(r3)
            int r10 = r10 + 1
            goto L40
        L4a:
            if (r2 == 0) goto L6a
        L4c:
            com.google.android.exoplayer2.MediaPeriodQueue r6 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r6 = r6.getPlayingPeriod()
            if (r6 == r2) goto L5a
            com.google.android.exoplayer2.MediaPeriodQueue r6 = r5.queue
            r6.advancePlayingPeriod()
            goto L4c
        L5a:
            com.google.android.exoplayer2.MediaPeriodQueue r6 = r5.queue
            r6.removeAfter(r2)
            r9 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r2.setRendererOffset(r9)
            r5.enableRenderers()
        L6a:
            if (r2 == 0) goto L9b
            com.google.android.exoplayer2.MediaPeriodQueue r6 = r5.queue
            r6.removeAfter(r2)
            boolean r6 = r2.prepared
            if (r6 != 0) goto L7e
            com.google.android.exoplayer2.MediaPeriodInfo r6 = r2.info
            com.google.android.exoplayer2.MediaPeriodInfo r6 = r6.copyWithStartPositionUs(r7)
            r2.info = r6
            goto L94
        L7e:
            boolean r6 = r2.hasEnabledTracks
            if (r6 == 0) goto L94
            com.google.android.exoplayer2.source.MediaPeriod r6 = r2.mediaPeriod
            long r6 = r6.seekToUs(r7)
            com.google.android.exoplayer2.source.MediaPeriod r8 = r2.mediaPeriod
            long r9 = r5.backBufferDurationUs
            long r9 = r6 - r9
            boolean r2 = r5.retainBackBufferFromKeyframe
            r8.discardBuffer(r9, r2)
            r7 = r6
        L94:
            r5.resetRendererPosition(r7)
            r5.maybeContinueLoading()
            goto La3
        L9b:
            com.google.android.exoplayer2.MediaPeriodQueue r6 = r5.queue
            r6.clear()
            r5.resetRendererPosition(r7)
        La3:
            r5.handleLoadingMediaPeriodChanged(r0)
            com.google.android.exoplayer2.util.HandlerWrapper r6 = r5.handler
            r6.sendEmptyMessage(r1)
            return r7
    }

    private void sendMessageInternal(com.google.android.exoplayer2.PlayerMessage r10) throws com.google.android.exoplayer2.ExoPlaybackException {
            r9 = this;
            long r0 = r10.getPositionMs()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            r9.sendMessageToTarget(r10)
            goto L4e
        L11:
            com.google.android.exoplayer2.PlaybackInfo r0 = r9.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r0 = r9.pendingMessages
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r1 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo
            r1.<init>(r10)
            r0.add(r1)
            goto L4e
        L26:
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo
            r0.<init>(r10)
            com.google.android.exoplayer2.PlaybackInfo r1 = r9.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r1.timeline
            int r5 = r9.repeatMode
            boolean r6 = r9.shuffleModeEnabled
            com.google.android.exoplayer2.Timeline$Window r7 = r9.window
            com.google.android.exoplayer2.Timeline$Period r8 = r9.period
            r2 = r0
            r3 = r4
            boolean r1 = resolvePendingMessagePosition(r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L4a
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r10 = r9.pendingMessages
            r10.add(r0)
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r10 = r9.pendingMessages
            java.util.Collections.sort(r10)
            goto L4e
        L4a:
            r0 = 0
            r10.markAsProcessed(r0)
        L4e:
            return
    }

    private void sendMessageToTarget(com.google.android.exoplayer2.PlayerMessage r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            android.os.Looper r0 = r3.getLooper()
            android.os.Looper r1 = r2.playbackLooper
            if (r0 != r1) goto L1b
            r2.deliverMessage(r3)
            com.google.android.exoplayer2.PlaybackInfo r3 = r2.playbackInfo
            int r3 = r3.playbackState
            r0 = 3
            r1 = 2
            if (r3 == r0) goto L15
            if (r3 != r1) goto L26
        L15:
            com.google.android.exoplayer2.util.HandlerWrapper r3 = r2.handler
            r3.sendEmptyMessage(r1)
            goto L26
        L1b:
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 15
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
        L26:
            return
    }

    private void sendMessageToTargetThread(com.google.android.exoplayer2.PlayerMessage r4) {
            r3 = this;
            android.os.Looper r0 = r4.getLooper()
            java.lang.Thread r1 = r0.getThread()
            boolean r1 = r1.isAlive()
            if (r1 != 0) goto L1a
            java.lang.String r0 = "TAG"
            java.lang.String r1 = "Trying to send message on a dead thread."
            com.google.android.exoplayer2.util.Log.w(r0, r1)
            r0 = 0
            r4.markAsProcessed(r0)
            return
        L1a:
            com.google.android.exoplayer2.util.Clock r1 = r3.clock
            r2 = 0
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r1.createHandler(r0, r2)
            com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda11 r1 = new com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda11
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    private void setAllRendererStreamsFinal(long r6) {
            r5 = this;
            com.google.android.exoplayer2.Renderer[] r0 = r5.renderers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            com.google.android.exoplayer2.source.SampleStream r4 = r3.getStream()
            if (r4 == 0) goto L11
            r5.setCurrentStreamFinal(r3, r6)
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            return
    }

    private void setCurrentStreamFinal(com.google.android.exoplayer2.Renderer r2, long r3) {
            r1 = this;
            r2.setCurrentStreamFinal()
            boolean r0 = r2 instanceof com.google.android.exoplayer2.text.TextRenderer
            if (r0 == 0) goto Lc
            com.google.android.exoplayer2.text.TextRenderer r2 = (com.google.android.exoplayer2.text.TextRenderer) r2
            r2.setFinalStreamEndPositionUs(r3)
        Lc:
            return
    }

    private void setForegroundModeInternal(boolean r5, @androidx.annotation.Nullable java.util.concurrent.atomic.AtomicBoolean r6) {
            r4 = this;
            boolean r0 = r4.foregroundMode
            if (r0 == r5) goto L24
            r4.foregroundMode = r5
            if (r5 != 0) goto L24
            com.google.android.exoplayer2.Renderer[] r5 = r4.renderers
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L24
            r2 = r5[r1]
            boolean r3 = isRendererEnabled(r2)
            if (r3 != 0) goto L21
            java.util.Set<com.google.android.exoplayer2.Renderer> r3 = r4.renderersToReset
            boolean r3 = r3.remove(r2)
            if (r3 == 0) goto L21
            r2.reset()
        L21:
            int r1 = r1 + 1
            goto Lc
        L24:
            if (r6 == 0) goto L33
            monitor-enter(r4)
            r5 = 1
            r6.set(r5)     // Catch: java.lang.Throwable -> L30
            r4.notifyAll()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r5
        L33:
            return
    }

    private void setMediaClockPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 16
            r0.removeMessages(r1)
            com.google.android.exoplayer2.DefaultMediaClock r0 = r2.mediaClock
            r0.setPlaybackParameters(r3)
            return
    }

    private void setMediaItemsInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage r6) throws com.google.android.exoplayer2.ExoPlaybackException {
            r5 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r5.playbackInfoUpdate
            r1 = 1
            r0.incrementPendingOperationAcks(r1)
            int r0 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$200(r6)
            r1 = -1
            if (r0 == r1) goto L29
            com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition
            com.google.android.exoplayer2.PlaylistTimeline r1 = new com.google.android.exoplayer2.PlaylistTimeline
            java.util.List r2 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$300(r6)
            com.google.android.exoplayer2.source.ShuffleOrder r3 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$400(r6)
            r1.<init>(r2, r3)
            int r2 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$200(r6)
            long r3 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$500(r6)
            r0.<init>(r1, r2, r3)
            r5.pendingInitialSeekPosition = r0
        L29:
            com.google.android.exoplayer2.MediaSourceList r0 = r5.mediaSourceList
            java.util.List r1 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$300(r6)
            com.google.android.exoplayer2.source.ShuffleOrder r6 = com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage.access$400(r6)
            com.google.android.exoplayer2.Timeline r6 = r0.setMediaSources(r1, r6)
            r0 = 0
            r5.handleMediaSourceListInfoRefreshed(r6, r0)
            return
    }

    private void setOffloadSchedulingEnabledInternal(boolean r2) {
            r1 = this;
            boolean r0 = r1.offloadSchedulingEnabled
            if (r2 != r0) goto L5
            return
        L5:
            r1.offloadSchedulingEnabled = r2
            if (r2 != 0) goto L15
            com.google.android.exoplayer2.PlaybackInfo r2 = r1.playbackInfo
            boolean r2 = r2.sleepingForOffload
            if (r2 == 0) goto L15
            com.google.android.exoplayer2.util.HandlerWrapper r2 = r1.handler
            r0 = 2
            r2.sendEmptyMessage(r0)
        L15:
            return
    }

    private void setPauseAtEndOfWindowInternal(boolean r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r1.pauseAtEndOfWindow = r2
            r1.resetPendingPauseAtEndOfPeriod()
            boolean r2 = r1.pendingPauseAtEndOfPeriod
            if (r2 == 0) goto L1f
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r1.queue
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.getReadingPeriod()
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r1.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            if (r2 == r0) goto L1f
            r2 = 1
            r1.seekToCurrentPosition(r2)
            r2 = 0
            r1.handleLoadingMediaPeriodChanged(r2)
        L1f:
            return
    }

    private void setPlayWhenReadyInternal(boolean r2, int r3, boolean r4, int r5) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r1.playbackInfoUpdate
            r0.incrementPendingOperationAcks(r4)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r4 = r1.playbackInfoUpdate
            r4.setPlayWhenReadyChangeReason(r5)
            com.google.android.exoplayer2.PlaybackInfo r4 = r1.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r3 = r4.copyWithPlayWhenReady(r2, r3)
            r1.playbackInfo = r3
            r3 = 0
            r1.isRebuffering = r3
            r1.notifyTrackSelectionPlayWhenReadyChanged(r2)
            boolean r2 = r1.shouldPlayWhenReady()
            if (r2 != 0) goto L25
            r1.stopRenderers()
            r1.updatePlaybackPositions()
            goto L3d
        L25:
            com.google.android.exoplayer2.PlaybackInfo r2 = r1.playbackInfo
            int r2 = r2.playbackState
            r3 = 3
            r4 = 2
            if (r2 != r3) goto L36
            r1.startRenderers()
            com.google.android.exoplayer2.util.HandlerWrapper r2 = r1.handler
            r2.sendEmptyMessage(r4)
            goto L3d
        L36:
            if (r2 != r4) goto L3d
            com.google.android.exoplayer2.util.HandlerWrapper r2 = r1.handler
            r2.sendEmptyMessage(r4)
        L3d:
            return
    }

    private void setPlaybackParametersInternal(com.google.android.exoplayer2.PlaybackParameters r2) throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            r1.setMediaClockPlaybackParameters(r2)
            com.google.android.exoplayer2.DefaultMediaClock r2 = r1.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r2 = r2.getPlaybackParameters()
            r0 = 1
            r1.handlePlaybackParameters(r2, r0)
            return
    }

    private void setRepeatModeInternal(int r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            r2.repeatMode = r3
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r2.queue
            com.google.android.exoplayer2.PlaybackInfo r1 = r2.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            boolean r3 = r0.updateRepeatMode(r1, r3)
            if (r3 != 0) goto L12
            r3 = 1
            r2.seekToCurrentPosition(r3)
        L12:
            r3 = 0
            r2.handleLoadingMediaPeriodChanged(r3)
            return
    }

    private void setSeekParametersInternal(com.google.android.exoplayer2.SeekParameters r1) {
            r0 = this;
            r0.seekParameters = r1
            return
    }

    private void setShuffleModeEnabledInternal(boolean r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            r2.shuffleModeEnabled = r3
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r2.queue
            com.google.android.exoplayer2.PlaybackInfo r1 = r2.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            boolean r3 = r0.updateShuffleModeEnabled(r1, r3)
            if (r3 != 0) goto L12
            r3 = 1
            r2.seekToCurrentPosition(r3)
        L12:
            r3 = 0
            r2.handleLoadingMediaPeriodChanged(r3)
            return
    }

    private void setShuffleOrderInternal(com.google.android.exoplayer2.source.ShuffleOrder r3) throws com.google.android.exoplayer2.ExoPlaybackException {
            r2 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r2.playbackInfoUpdate
            r1 = 1
            r0.incrementPendingOperationAcks(r1)
            com.google.android.exoplayer2.MediaSourceList r0 = r2.mediaSourceList
            com.google.android.exoplayer2.Timeline r3 = r0.setShuffleOrder(r3)
            r0 = 0
            r2.handleMediaSourceListInfoRefreshed(r3, r0)
            return
    }

    private void setState(int r4) {
            r3 = this;
            com.google.android.exoplayer2.PlaybackInfo r0 = r3.playbackInfo
            int r1 = r0.playbackState
            if (r1 == r4) goto L16
            r1 = 2
            if (r4 == r1) goto L10
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.playbackMaybeBecameStuckAtMs = r1
        L10:
            com.google.android.exoplayer2.PlaybackInfo r4 = r0.copyWithPlaybackState(r4)
            r3.playbackInfo = r4
        L16:
            return
    }

    private boolean shouldAdvancePlayingPeriod() {
            r7 = this;
            boolean r0 = r7.shouldPlayWhenReady()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r7.pendingPauseAtEndOfPeriod
            if (r0 == 0) goto Ld
            return r1
        Ld:
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r7.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            if (r0 != 0) goto L16
            return r1
        L16:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            if (r0 == 0) goto L2b
            long r2 = r7.rendererPositionUs
            long r4 = r0.getStartPositionRendererTime()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L2b
            boolean r0 = r0.allRenderersInCorrectState
            if (r0 == 0) goto L2b
            r1 = 1
        L2b:
            return r1
    }

    private boolean shouldContinueLoading() {
            r12 = this;
            boolean r0 = r12.isLoadingPossible()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r12.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getLoadingPeriod()
            long r2 = r0.getNextLoadPositionUs()
            long r2 = r12.getTotalBufferedDurationUs(r2)
            com.google.android.exoplayer2.MediaPeriodQueue r4 = r12.queue
            com.google.android.exoplayer2.MediaPeriodHolder r4 = r4.getPlayingPeriod()
            if (r0 != r4) goto L25
            long r4 = r12.rendererPositionUs
            long r4 = r0.toPeriodTime(r4)
            goto L30
        L25:
            long r4 = r12.rendererPositionUs
            long r4 = r0.toPeriodTime(r4)
            com.google.android.exoplayer2.MediaPeriodInfo r0 = r0.info
            long r6 = r0.startPositionUs
            long r4 = r4 - r6
        L30:
            r10 = r4
            com.google.android.exoplayer2.LoadControl r4 = r12.loadControl
            com.google.android.exoplayer2.DefaultMediaClock r0 = r12.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            float r9 = r0.speed
            r5 = r10
            r7 = r2
            boolean r0 = r4.shouldContinueLoading(r5, r7, r9)
            if (r0 != 0) goto L75
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L75
            long r4 = r12.backBufferDurationUs
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L56
            boolean r4 = r12.retainBackBufferFromKeyframe
            if (r4 == 0) goto L75
        L56:
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r12.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            com.google.android.exoplayer2.source.MediaPeriod r0 = r0.mediaPeriod
            com.google.android.exoplayer2.PlaybackInfo r4 = r12.playbackInfo
            long r4 = r4.positionUs
            r0.discardBuffer(r4, r1)
            com.google.android.exoplayer2.LoadControl r4 = r12.loadControl
            com.google.android.exoplayer2.DefaultMediaClock r0 = r12.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.getPlaybackParameters()
            float r9 = r0.speed
            r5 = r10
            r7 = r2
            boolean r0 = r4.shouldContinueLoading(r5, r7, r9)
        L75:
            return r0
    }

    private boolean shouldPlayWhenReady() {
            r2 = this;
            com.google.android.exoplayer2.PlaybackInfo r0 = r2.playbackInfo
            boolean r1 = r0.playWhenReady
            if (r1 == 0) goto Lc
            int r0 = r0.playbackSuppressionReason
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean shouldTransitionToReadyState(boolean r13) {
            r12 = this;
            int r0 = r12.enabledRendererCount
            if (r0 != 0) goto L9
            boolean r13 = r12.isTimelineReady()
            return r13
        L9:
            r0 = 0
            if (r13 != 0) goto Ld
            return r0
        Ld:
            com.google.android.exoplayer2.PlaybackInfo r13 = r12.playbackInfo
            boolean r1 = r13.isLoading
            r2 = 1
            if (r1 != 0) goto L15
            return r2
        L15:
            com.google.android.exoplayer2.Timeline r13 = r13.timeline
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r12.queue
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r1.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.id
            boolean r13 = r12.shouldUseLivePlaybackSpeedControl(r13, r1)
            if (r13 == 0) goto L2e
            com.google.android.exoplayer2.LivePlaybackSpeedControl r13 = r12.livePlaybackSpeedControl
            long r3 = r13.getTargetLiveOffsetUs()
            goto L33
        L2e:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L33:
            r10 = r3
            com.google.android.exoplayer2.MediaPeriodQueue r13 = r12.queue
            com.google.android.exoplayer2.MediaPeriodHolder r13 = r13.getLoadingPeriod()
            boolean r1 = r13.isFullyBuffered()
            if (r1 == 0) goto L48
            com.google.android.exoplayer2.MediaPeriodInfo r1 = r13.info
            boolean r1 = r1.isFinal
            if (r1 == 0) goto L48
            r1 = 1
            goto L49
        L48:
            r1 = 0
        L49:
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r13.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.id
            boolean r3 = r3.isAd()
            if (r3 == 0) goto L59
            boolean r13 = r13.prepared
            if (r13 != 0) goto L59
            r13 = 1
            goto L5a
        L59:
            r13 = 0
        L5a:
            if (r1 != 0) goto L74
            if (r13 != 0) goto L74
            com.google.android.exoplayer2.LoadControl r5 = r12.loadControl
            long r6 = r12.getTotalBufferedDurationUs()
            com.google.android.exoplayer2.DefaultMediaClock r13 = r12.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r13 = r13.getPlaybackParameters()
            float r8 = r13.speed
            boolean r9 = r12.isRebuffering
            boolean r13 = r5.shouldStartPlayback(r6, r8, r9, r10)
            if (r13 == 0) goto L75
        L74:
            r0 = 1
        L75:
            return r0
    }

    private boolean shouldUseLivePlaybackSpeedControl(com.google.android.exoplayer2.Timeline r5, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r6) {
            r4 = this;
            boolean r0 = r6.isAd()
            r1 = 0
            if (r0 != 0) goto L37
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Le
            goto L37
        Le:
            java.lang.Object r6 = r6.periodUid
            com.google.android.exoplayer2.Timeline$Period r0 = r4.period
            com.google.android.exoplayer2.Timeline$Period r6 = r5.getPeriodByUid(r6, r0)
            int r6 = r6.windowIndex
            com.google.android.exoplayer2.Timeline$Window r0 = r4.window
            r5.getWindow(r6, r0)
            com.google.android.exoplayer2.Timeline$Window r5 = r4.window
            boolean r5 = r5.isLive()
            if (r5 == 0) goto L37
            com.google.android.exoplayer2.Timeline$Window r5 = r4.window
            boolean r6 = r5.isDynamic
            if (r6 == 0) goto L37
            long r5 = r5.windowStartTimeMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L37
            r1 = 1
        L37:
            return r1
    }

    private void startRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
            r5 = this;
            r0 = 0
            r5.isRebuffering = r0
            com.google.android.exoplayer2.DefaultMediaClock r1 = r5.mediaClock
            r1.start()
            com.google.android.exoplayer2.Renderer[] r1 = r5.renderers
            int r2 = r1.length
        Lb:
            if (r0 >= r2) goto L1b
            r3 = r1[r0]
            boolean r4 = isRendererEnabled(r3)
            if (r4 == 0) goto L18
            r3.start()
        L18:
            int r0 = r0 + 1
            goto Lb
        L1b:
            return
    }

    private void stopInternal(boolean r3, boolean r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            if (r3 != 0) goto Lb
            boolean r3 = r2.foregroundMode
            if (r3 != 0) goto L9
            goto Lb
        L9:
            r3 = 0
            goto Lc
        Lb:
            r3 = 1
        Lc:
            r2.resetInternal(r3, r0, r1, r0)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r3 = r2.playbackInfoUpdate
            r3.incrementPendingOperationAcks(r4)
            com.google.android.exoplayer2.LoadControl r3 = r2.loadControl
            r3.onStopped()
            r2.setState(r1)
            return
    }

    private void stopRenderers() throws com.google.android.exoplayer2.ExoPlaybackException {
            r5 = this;
            com.google.android.exoplayer2.DefaultMediaClock r0 = r5.mediaClock
            r0.stop()
            com.google.android.exoplayer2.Renderer[] r0 = r5.renderers
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            boolean r4 = isRendererEnabled(r3)
            if (r4 == 0) goto L16
            r5.ensureStopped(r3)
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            return
    }

    private void updateIsLoading() {
            r3 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r3.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getLoadingPeriod()
            boolean r1 = r3.shouldContinueLoading
            if (r1 != 0) goto L17
            if (r0 == 0) goto L15
            com.google.android.exoplayer2.source.MediaPeriod r0 = r0.mediaPeriod
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            com.google.android.exoplayer2.PlaybackInfo r1 = r3.playbackInfo
            boolean r2 = r1.isLoading
            if (r0 == r2) goto L24
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.copyWithIsLoading(r0)
            r3.playbackInfo = r0
        L24:
            return
    }

    private void updateLoadControlTrackSelection(com.google.android.exoplayer2.source.TrackGroupArray r3, com.google.android.exoplayer2.trackselection.TrackSelectorResult r4) {
            r2 = this;
            com.google.android.exoplayer2.LoadControl r0 = r2.loadControl
            com.google.android.exoplayer2.Renderer[] r1 = r2.renderers
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r4 = r4.selections
            r0.onTracksSelected(r1, r3, r4)
            return
    }

    private void updatePeriods() throws com.google.android.exoplayer2.ExoPlaybackException {
            r1 = this;
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            com.google.android.exoplayer2.MediaSourceList r0 = r1.mediaSourceList
            boolean r0 = r0.isPrepared()
            if (r0 != 0) goto L13
            goto L1f
        L13:
            r1.maybeUpdateLoadingPeriod()
            r1.maybeUpdateReadingPeriod()
            r1.maybeUpdateReadingRenderers()
            r1.maybeUpdatePlayingPeriod()
        L1f:
            return
    }

    private void updatePlaybackPositions() throws com.google.android.exoplayer2.ExoPlaybackException {
            r11 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
            if (r0 != 0) goto L9
            return
        L9:
            boolean r1 = r0.prepared
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L1a
            com.google.android.exoplayer2.source.MediaPeriod r1 = r0.mediaPeriod
            long r4 = r1.readDiscontinuity()
            r6 = r4
            goto L1b
        L1a:
            r6 = r2
        L1b:
            r10 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L3c
            r11.resetRendererPosition(r6)
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            long r0 = r0.positionUs
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L5e
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r0.periodId
            long r4 = r0.requestedContentPositionUs
            r8 = 1
            r9 = 5
            r0 = r11
            r2 = r6
            com.google.android.exoplayer2.PlaybackInfo r0 = r0.handlePositionDiscontinuity(r1, r2, r4, r6, r8, r9)
            r11.playbackInfo = r0
            goto L5e
        L3c:
            com.google.android.exoplayer2.DefaultMediaClock r1 = r11.mediaClock
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r11.queue
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.getReadingPeriod()
            if (r0 == r2) goto L48
            r2 = 1
            goto L49
        L48:
            r2 = 0
        L49:
            long r1 = r1.syncAndGetPositionUs(r2)
            r11.rendererPositionUs = r1
            long r0 = r0.toPeriodTime(r1)
            com.google.android.exoplayer2.PlaybackInfo r2 = r11.playbackInfo
            long r2 = r2.positionUs
            r11.maybeTriggerPendingMessages(r2, r0)
            com.google.android.exoplayer2.PlaybackInfo r2 = r11.playbackInfo
            r2.positionUs = r0
        L5e:
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r11.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getLoadingPeriod()
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            long r2 = r0.getBufferedPositionUs()
            r1.bufferedPositionUs = r2
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            long r1 = r11.getTotalBufferedDurationUs()
            r0.totalBufferedDurationUs = r1
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            boolean r1 = r0.playWhenReady
            if (r1 == 0) goto Lc9
            int r1 = r0.playbackState
            r2 = 3
            if (r1 != r2) goto Lc9
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r11.shouldUseLivePlaybackSpeedControl(r1, r0)
            if (r0 == 0) goto Lc9
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            float r0 = r0.speed
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc9
            com.google.android.exoplayer2.LivePlaybackSpeedControl r0 = r11.livePlaybackSpeedControl
            long r1 = r11.getCurrentLiveOffsetUs()
            long r3 = r11.getTotalBufferedDurationUs()
            float r0 = r0.getAdjustedPlaybackSpeed(r1, r3)
            com.google.android.exoplayer2.DefaultMediaClock r1 = r11.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r1 = r1.getPlaybackParameters()
            float r1 = r1.speed
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto Lc9
            com.google.android.exoplayer2.PlaybackInfo r1 = r11.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r1 = r1.playbackParameters
            com.google.android.exoplayer2.PlaybackParameters r0 = r1.withSpeed(r0)
            r11.setMediaClockPlaybackParameters(r0)
            com.google.android.exoplayer2.PlaybackInfo r0 = r11.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            com.google.android.exoplayer2.DefaultMediaClock r1 = r11.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r1 = r1.getPlaybackParameters()
            float r1 = r1.speed
            r11.handlePlaybackParameters(r0, r1, r10, r10)
        Lc9:
            return
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(com.google.android.exoplayer2.Timeline r4, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5, com.google.android.exoplayer2.Timeline r6, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r7, long r8, boolean r10) throws com.google.android.exoplayer2.ExoPlaybackException {
            r3 = this;
            boolean r0 = r3.shouldUseLivePlaybackSpeedControl(r4, r5)
            if (r0 != 0) goto L2d
            boolean r4 = r5.isAd()
            if (r4 == 0) goto Lf
            com.google.android.exoplayer2.PlaybackParameters r4 = com.google.android.exoplayer2.PlaybackParameters.DEFAULT
            goto L13
        Lf:
            com.google.android.exoplayer2.PlaybackInfo r4 = r3.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r4 = r4.playbackParameters
        L13:
            com.google.android.exoplayer2.DefaultMediaClock r5 = r3.mediaClock
            com.google.android.exoplayer2.PlaybackParameters r5 = r5.getPlaybackParameters()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L2c
            r3.setMediaClockPlaybackParameters(r4)
            com.google.android.exoplayer2.PlaybackInfo r5 = r3.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r5 = r5.playbackParameters
            float r4 = r4.speed
            r6 = 0
            r3.handlePlaybackParameters(r5, r4, r6, r6)
        L2c:
            return
        L2d:
            java.lang.Object r0 = r5.periodUid
            com.google.android.exoplayer2.Timeline$Period r1 = r3.period
            com.google.android.exoplayer2.Timeline$Period r0 = r4.getPeriodByUid(r0, r1)
            int r0 = r0.windowIndex
            com.google.android.exoplayer2.Timeline$Window r1 = r3.window
            r4.getWindow(r0, r1)
            com.google.android.exoplayer2.LivePlaybackSpeedControl r0 = r3.livePlaybackSpeedControl
            com.google.android.exoplayer2.Timeline$Window r1 = r3.window
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r1.liveConfiguration
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = (com.google.android.exoplayer2.MediaItem.LiveConfiguration) r1
            r0.setLiveConfiguration(r1)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L60
            com.google.android.exoplayer2.LivePlaybackSpeedControl r6 = r3.livePlaybackSpeedControl
            java.lang.Object r5 = r5.periodUid
            long r4 = r3.getLiveOffsetUs(r4, r5, r8)
            r6.setTargetLiveOffsetOverrideUs(r4)
            goto L8a
        L60:
            com.google.android.exoplayer2.Timeline$Window r4 = r3.window
            java.lang.Object r4 = r4.uid
            r5 = 0
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L7d
            java.lang.Object r5 = r7.periodUid
            com.google.android.exoplayer2.Timeline$Period r7 = r3.period
            com.google.android.exoplayer2.Timeline$Period r5 = r6.getPeriodByUid(r5, r7)
            int r5 = r5.windowIndex
            com.google.android.exoplayer2.Timeline$Window r7 = r3.window
            com.google.android.exoplayer2.Timeline$Window r5 = r6.getWindow(r5, r7)
            java.lang.Object r5 = r5.uid
        L7d:
            boolean r4 = com.google.android.exoplayer2.util.Util.areEqual(r5, r4)
            if (r4 == 0) goto L85
            if (r10 == 0) goto L8a
        L85:
            com.google.android.exoplayer2.LivePlaybackSpeedControl r4 = r3.livePlaybackSpeedControl
            r4.setTargetLiveOffsetOverrideUs(r0)
        L8a:
            return
    }

    private void updateTrackSelectionPlaybackSpeed(float r6) {
            r5 = this;
            com.google.android.exoplayer2.MediaPeriodQueue r0 = r5.queue
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getPlayingPeriod()
        L6:
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r1 = r0.getTrackSelectorResult()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = r1.selections
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L1c
            r4 = r1[r3]
            if (r4 == 0) goto L19
            r4.onPlaybackSpeed(r6)
        L19:
            int r3 = r3 + 1
            goto L10
        L1c:
            com.google.android.exoplayer2.MediaPeriodHolder r0 = r0.getNext()
            goto L6
        L21:
            return
    }

    private synchronized void waitUninterruptibly(com.google.common.base.Supplier<java.lang.Boolean> r7, long r8) {
            r6 = this;
            monitor-enter(r6)
            com.google.android.exoplayer2.util.Clock r0 = r6.clock     // Catch: java.lang.Throwable -> L3a
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L3a
            long r0 = r0 + r8
            r2 = 0
        L9:
            java.lang.Object r3 = r7.get()     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L3a
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L2f
            r3 = 0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2f
            com.google.android.exoplayer2.util.Clock r3 = r6.clock     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L3a
            r3.onThreadBlocked()     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L3a
            r6.wait(r8)     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L3a
            goto L26
        L24:
            r8 = 1
            r2 = 1
        L26:
            com.google.android.exoplayer2.util.Clock r8 = r6.clock     // Catch: java.lang.Throwable -> L3a
            long r8 = r8.elapsedRealtime()     // Catch: java.lang.Throwable -> L3a
            long r8 = r0 - r8
            goto L9
        L2f:
            if (r2 == 0) goto L38
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3a
            r7.interrupt()     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r6)
            return
        L3a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public void addMediaSources(int r10, java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> r11, com.google.android.exoplayer2.source.ShuffleOrder r12) {
            r9 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r9.handler
            com.google.android.exoplayer2.ExoPlayerImplInternal$MediaSourceListUpdateMessage r8 = new com.google.android.exoplayer2.ExoPlayerImplInternal$MediaSourceListUpdateMessage
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r1 = r8
            r2 = r11
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r7)
            r11 = 18
            r12 = 0
            com.google.android.exoplayer2.util.HandlerWrapper$Message r10 = r0.obtainMessage(r11, r10, r12, r8)
            r10.sendToTarget()
            return
    }

    public void experimentalSetForegroundModeTimeoutMs(long r1) {
            r0 = this;
            r0.setForegroundModeTimeoutMs = r1
            return
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            r1 = 0
            r2 = 24
            com.google.android.exoplayer2.util.HandlerWrapper$Message r4 = r0.obtainMessage(r2, r4, r1)
            r4.sendToTarget()
            return
    }

    public android.os.Looper getPlaybackLooper() {
            r1 = this;
            android.os.Looper r0 = r1.playbackLooper
            return r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r8) {
            r7 = this;
            java.lang.String r0 = "Playback error"
            java.lang.String r1 = "ExoPlayerImplInternal"
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            r4 = 1
            int r5 = r8.what     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            switch(r5) {
                case 0: goto Lef;
                case 1: goto Le1;
                case 2: goto Ldc;
                case 3: goto Ld3;
                case 4: goto Lca;
                case 5: goto Lc1;
                case 6: goto Lbc;
                case 7: goto Lb8;
                case 8: goto Laf;
                case 9: goto La6;
                case 10: goto La1;
                case 11: goto L9a;
                case 12: goto L8e;
                case 13: goto L7e;
                case 14: goto L75;
                case 15: goto L6c;
                case 16: goto L63;
                case 17: goto L5a;
                case 18: goto L4f;
                case 19: goto L46;
                case 20: goto L39;
                case 21: goto L30;
                case 22: goto L2b;
                case 23: goto L1f;
                case 24: goto L13;
                case 25: goto Le;
                default: goto Ld;
            }     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
        Ld:
            return r3
        Le:
            r7.attemptRendererErrorRecovery()     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L13:
            int r8 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            if (r8 != r4) goto L19
            r8 = 1
            goto L1a
        L19:
            r8 = 0
        L1a:
            r7.setOffloadSchedulingEnabledInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L1f:
            int r8 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            if (r8 == 0) goto L25
            r8 = 1
            goto L26
        L25:
            r8 = 0
        L26:
            r7.setPauseAtEndOfWindowInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L2b:
            r7.mediaSourceListUpdateRequestedInternal()     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L30:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.source.ShuffleOrder r8 = (com.google.android.exoplayer2.source.ShuffleOrder) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.setShuffleOrderInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L39:
            int r5 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            int r6 = r8.arg2     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.source.ShuffleOrder r8 = (com.google.android.exoplayer2.source.ShuffleOrder) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.removeMediaItemsInternal(r5, r6, r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L46:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.ExoPlayerImplInternal$MoveMediaItemsMessage r8 = (com.google.android.exoplayer2.ExoPlayerImplInternal.MoveMediaItemsMessage) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.moveMediaItemsInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L4f:
            java.lang.Object r5 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.ExoPlayerImplInternal$MediaSourceListUpdateMessage r5 = (com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage) r5     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            int r8 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.addMediaItemsInternal(r5, r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L5a:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.ExoPlayerImplInternal$MediaSourceListUpdateMessage r8 = (com.google.android.exoplayer2.ExoPlayerImplInternal.MediaSourceListUpdateMessage) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.setMediaItemsInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L63:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.PlaybackParameters r8 = (com.google.android.exoplayer2.PlaybackParameters) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.handlePlaybackParameters(r8, r3)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L6c:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.PlayerMessage r8 = (com.google.android.exoplayer2.PlayerMessage) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.sendMessageToTargetThread(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L75:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.PlayerMessage r8 = (com.google.android.exoplayer2.PlayerMessage) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.sendMessageInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L7e:
            int r5 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            if (r5 == 0) goto L84
            r5 = 1
            goto L85
        L84:
            r5 = 0
        L85:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.setForegroundModeInternal(r5, r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L8e:
            int r8 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            if (r8 == 0) goto L94
            r8 = 1
            goto L95
        L94:
            r8 = 0
        L95:
            r7.setShuffleModeEnabledInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        L9a:
            int r8 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.setRepeatModeInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        La1:
            r7.reselectTracksInternal()     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        La6:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.source.MediaPeriod r8 = (com.google.android.exoplayer2.source.MediaPeriod) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.handleContinueLoadingRequested(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Laf:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.source.MediaPeriod r8 = (com.google.android.exoplayer2.source.MediaPeriod) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.handlePeriodPrepared(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Lb8:
            r7.releaseInternal()     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            return r4
        Lbc:
            r7.stopInternal(r3, r4)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Lc1:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.SeekParameters r8 = (com.google.android.exoplayer2.SeekParameters) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.setSeekParametersInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Lca:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.PlaybackParameters r8 = (com.google.android.exoplayer2.PlaybackParameters) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.setPlaybackParametersInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Ld3:
            java.lang.Object r8 = r8.obj     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition r8 = (com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition) r8     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.seekToInternal(r8)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Ldc:
            r7.doSomeWork()     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Le1:
            int r5 = r8.arg1     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            if (r5 == 0) goto Le7
            r5 = 1
            goto Le8
        Le7:
            r5 = 0
        Le8:
            int r8 = r8.arg2     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            r7.setPlayWhenReadyInternal(r5, r8, r4, r4)     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Lef:
            r7.prepareInternal()     // Catch: java.lang.RuntimeException -> Lf4 java.io.IOException -> L113 com.google.android.exoplayer2.source.BehindLiveWindowException -> L11b com.google.android.exoplayer2.upstream.DataSourceException -> L123 com.google.android.exoplayer2.ParserException -> L12b com.google.android.exoplayer2.drm.DrmSession.DrmSessionException -> L152 com.google.android.exoplayer2.ExoPlaybackException -> L159
            goto L1a0
        Lf4:
            r8 = move-exception
            boolean r5 = r8 instanceof java.lang.IllegalStateException
            if (r5 != 0) goto Lfd
            boolean r5 = r8 instanceof java.lang.IllegalArgumentException
            if (r5 == 0) goto Lff
        Lfd:
            r2 = 1004(0x3ec, float:1.407E-42)
        Lff:
            com.google.android.exoplayer2.ExoPlaybackException r8 = com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(r8, r2)
            com.google.android.exoplayer2.util.Log.e(r1, r0, r8)
            r7.stopInternal(r4, r3)
            com.google.android.exoplayer2.PlaybackInfo r0 = r7.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r8 = r0.copyWithPlaybackError(r8)
            r7.playbackInfo = r8
            goto L1a0
        L113:
            r8 = move-exception
            r0 = 2000(0x7d0, float:2.803E-42)
            r7.handleIoException(r8, r0)
            goto L1a0
        L11b:
            r8 = move-exception
            r0 = 1002(0x3ea, float:1.404E-42)
            r7.handleIoException(r8, r0)
            goto L1a0
        L123:
            r8 = move-exception
            int r0 = r8.reason
            r7.handleIoException(r8, r0)
            goto L1a0
        L12b:
            r8 = move-exception
            int r0 = r8.dataType
            if (r0 != r4) goto L13e
            boolean r0 = r8.contentIsMalformed
            if (r0 == 0) goto L139
            r0 = 3001(0xbb9, float:4.205E-42)
            r2 = 3001(0xbb9, float:4.205E-42)
            goto L14e
        L139:
            r0 = 3003(0xbbb, float:4.208E-42)
            r2 = 3003(0xbbb, float:4.208E-42)
            goto L14e
        L13e:
            r1 = 4
            if (r0 != r1) goto L14e
            boolean r0 = r8.contentIsMalformed
            if (r0 == 0) goto L14a
            r0 = 3002(0xbba, float:4.207E-42)
            r2 = 3002(0xbba, float:4.207E-42)
            goto L14e
        L14a:
            r0 = 3004(0xbbc, float:4.21E-42)
            r2 = 3004(0xbbc, float:4.21E-42)
        L14e:
            r7.handleIoException(r8, r2)
            goto L1a0
        L152:
            r8 = move-exception
            int r0 = r8.errorCode
            r7.handleIoException(r8, r0)
            goto L1a0
        L159:
            r8 = move-exception
            int r2 = r8.type
            if (r2 != r4) goto L16e
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r7.queue
            com.google.android.exoplayer2.MediaPeriodHolder r2 = r2.getReadingPeriod()
            if (r2 == 0) goto L16e
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r2.info
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.id
            com.google.android.exoplayer2.ExoPlaybackException r8 = r8.copyWithMediaPeriodId(r2)
        L16e:
            boolean r2 = r8.isRecoverable
            if (r2 == 0) goto L189
            com.google.android.exoplayer2.ExoPlaybackException r2 = r7.pendingRecoverableRendererError
            if (r2 != 0) goto L189
            java.lang.String r0 = "Recoverable renderer error"
            com.google.android.exoplayer2.util.Log.w(r1, r0, r8)
            r7.pendingRecoverableRendererError = r8
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r7.handler
            r1 = 25
            com.google.android.exoplayer2.util.HandlerWrapper$Message r8 = r0.obtainMessage(r1, r8)
            r0.sendMessageAtFrontOfQueue(r8)
            goto L1a0
        L189:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r7.pendingRecoverableRendererError
            if (r2 == 0) goto L192
            r2.addSuppressed(r8)
            com.google.android.exoplayer2.ExoPlaybackException r8 = r7.pendingRecoverableRendererError
        L192:
            com.google.android.exoplayer2.util.Log.e(r1, r0, r8)
            r7.stopInternal(r4, r3)
            com.google.android.exoplayer2.PlaybackInfo r0 = r7.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r8 = r0.copyWithPlaybackError(r8)
            r7.playbackInfo = r8
        L1a0:
            r7.maybeNotifyPlaybackInfoChanged()
            return r4
    }

    public void moveMediaSources(int r2, int r3, int r4, com.google.android.exoplayer2.source.ShuffleOrder r5) {
            r1 = this;
            com.google.android.exoplayer2.ExoPlayerImplInternal$MoveMediaItemsMessage r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$MoveMediaItemsMessage
            r0.<init>(r2, r3, r4, r5)
            com.google.android.exoplayer2.util.HandlerWrapper r2 = r1.handler
            r3 = 19
            com.google.android.exoplayer2.util.HandlerWrapper$Message r2 = r2.obtainMessage(r3, r0)
            r2.sendToTarget()
            return
    }

    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 9
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod r1 = (com.google.android.exoplayer2.source.MediaPeriod) r1
            r0.onContinueLoadingRequested(r1)
            return
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 16
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 22
            r0.sendEmptyMessage(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 8
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 10
            r0.sendEmptyMessage(r1)
            return
    }

    public void prepare() {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 0
            com.google.android.exoplayer2.util.HandlerWrapper$Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            return
    }

    public synchronized boolean release() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L27
            android.os.Looper r0 = r3.playbackLooper     // Catch: java.lang.Throwable -> L2a
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L12
            goto L27
        L12:
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler     // Catch: java.lang.Throwable -> L2a
            r1 = 7
            r0.sendEmptyMessage(r1)     // Catch: java.lang.Throwable -> L2a
            com.google.android.exoplayer2.ExoPlayerImplInternal$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2a
            long r1 = r3.releaseTimeoutMs     // Catch: java.lang.Throwable -> L2a
            r3.waitUninterruptibly(r0, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r3.released     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return r0
        L27:
            r0 = 1
            monitor-exit(r3)
            return r0
        L2a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public void removeMediaSources(int r3, int r4, com.google.android.exoplayer2.source.ShuffleOrder r5) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 20
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3, r4, r5)
            r3.sendToTarget()
            return
    }

    public void seekTo(com.google.android.exoplayer2.Timeline r3, int r4, long r5) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition r1 = new com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition
            r1.<init>(r3, r4, r5)
            r3 = 3
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r3, r1)
            r3.sendToTarget()
            return
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(com.google.android.exoplayer2.PlayerMessage r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L1f
            android.os.Looper r0 = r2.playbackLooper     // Catch: java.lang.Throwable -> L2c
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L12
            goto L1f
        L12:
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler     // Catch: java.lang.Throwable -> L2c
            r1 = 14
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)     // Catch: java.lang.Throwable -> L2c
            r3.sendToTarget()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return
        L1f:
            java.lang.String r0 = "ExoPlayerImplInternal"
            java.lang.String r1 = "Ignoring messages sent after release."
            com.google.android.exoplayer2.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L2c
            r0 = 0
            r3.markAsProcessed(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return
        L2c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized boolean setForegroundMode(boolean r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.released     // Catch: java.lang.Throwable -> L43
            r1 = 1
            if (r0 != 0) goto L41
            android.os.Looper r0 = r4.playbackLooper     // Catch: java.lang.Throwable -> L43
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L13
            goto L41
        L13:
            r0 = 13
            r2 = 0
            if (r5 == 0) goto L23
            com.google.android.exoplayer2.util.HandlerWrapper r5 = r4.handler     // Catch: java.lang.Throwable -> L43
            com.google.android.exoplayer2.util.HandlerWrapper$Message r5 = r5.obtainMessage(r0, r1, r2)     // Catch: java.lang.Throwable -> L43
            r5.sendToTarget()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            return r1
        L23:
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L43
            com.google.android.exoplayer2.util.HandlerWrapper r3 = r4.handler     // Catch: java.lang.Throwable -> L43
            com.google.android.exoplayer2.util.HandlerWrapper$Message r0 = r3.obtainMessage(r0, r2, r2, r5)     // Catch: java.lang.Throwable -> L43
            r0.sendToTarget()     // Catch: java.lang.Throwable -> L43
            com.google.android.exoplayer2.ExoPlayerImplInternal$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L43
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L43
            long r1 = r4.setForegroundModeTimeoutMs     // Catch: java.lang.Throwable -> L43
            r4.waitUninterruptibly(r0, r1)     // Catch: java.lang.Throwable -> L43
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            return r5
        L41:
            monitor-exit(r4)
            return r1
        L43:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public void setMediaSources(java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> r10, int r11, long r12, com.google.android.exoplayer2.source.ShuffleOrder r14) {
            r9 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r9.handler
            com.google.android.exoplayer2.ExoPlayerImplInternal$MediaSourceListUpdateMessage r8 = new com.google.android.exoplayer2.ExoPlayerImplInternal$MediaSourceListUpdateMessage
            r7 = 0
            r1 = r8
            r2 = r10
            r3 = r14
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r7)
            r10 = 17
            com.google.android.exoplayer2.util.HandlerWrapper$Message r10 = r0.obtainMessage(r10, r8)
            r10.sendToTarget()
            return
    }

    public void setPauseAtEndOfWindow(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            r1 = 0
            r2 = 23
            com.google.android.exoplayer2.util.HandlerWrapper$Message r4 = r0.obtainMessage(r2, r4, r1)
            r4.sendToTarget()
            return
    }

    public void setPlayWhenReady(boolean r3, int r4) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 1
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3, r4)
            r3.sendToTarget()
            return
    }

    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 4
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    public void setRepeatMode(int r4) {
            r3 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            r1 = 11
            r2 = 0
            com.google.android.exoplayer2.util.HandlerWrapper$Message r4 = r0.obtainMessage(r1, r4, r2)
            r4.sendToTarget()
            return
    }

    public void setSeekParameters(com.google.android.exoplayer2.SeekParameters r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 5
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    public void setShuffleModeEnabled(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r3.handler
            r1 = 0
            r2 = 12
            com.google.android.exoplayer2.util.HandlerWrapper$Message r4 = r0.obtainMessage(r2, r4, r1)
            r4.sendToTarget()
            return
    }

    public void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r3) {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 21
            com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    public void stop() {
            r2 = this;
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.handler
            r1 = 6
            com.google.android.exoplayer2.util.HandlerWrapper$Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            return
    }
}
