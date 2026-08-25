package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(31)
public final class MediaMetricsListener implements com.google.android.exoplayer2.analytics.AnalyticsListener, com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener {

    @androidx.annotation.Nullable
    private java.lang.String activeSessionId;
    private int audioUnderruns;
    private final java.util.HashMap<java.lang.String, java.lang.Long> bandwidthBytes;
    private final java.util.HashMap<java.lang.String, java.lang.Long> bandwidthTimeMs;
    private final android.content.Context context;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format currentAudioFormat;
    private int currentNetworkType;
    private int currentPlaybackState;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format currentTextFormat;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Format currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;

    @androidx.annotation.Nullable
    private android.media.metrics.PlaybackMetrics.Builder metricsBuilder;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingAudioFormat;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.PlaybackException pendingPlayerError;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingTextFormat;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingVideoFormat;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private final android.media.metrics.PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final com.google.android.exoplayer2.analytics.PlaybackSessionManager sessionManager;
    private final long startTimeMs;
    private final com.google.android.exoplayer2.Timeline.Window window;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ErrorInfo {
        public final int errorCode;
        public final int subErrorCode;

        public ErrorInfo(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.errorCode = r1
                r0.subErrorCode = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PendingFormatUpdate {
        public final com.google.android.exoplayer2.Format format;
        public final int selectionReason;
        public final java.lang.String sessionId;

        public PendingFormatUpdate(com.google.android.exoplayer2.Format r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                r0.selectionReason = r2
                r0.sessionId = r3
                return
        }
    }

    private MediaMetricsListener(android.content.Context r1, android.media.metrics.PlaybackSession r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.playbackSession = r2
            com.google.android.exoplayer2.Timeline$Window r1 = new com.google.android.exoplayer2.Timeline$Window
            r1.<init>()
            r0.window = r1
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            r0.period = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.bandwidthBytes = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.bandwidthTimeMs = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.startTimeMs = r1
            r1 = 0
            r0.currentPlaybackState = r1
            r0.currentNetworkType = r1
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r1 = new com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager
            r1.<init>()
            r0.sessionManager = r1
            r1.setListener(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(@androidx.annotation.Nullable com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate r2) {
            r1 = this;
            if (r2 == 0) goto L12
            java.lang.String r2 = r2.sessionId
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r0 = r1.sessionManager
            java.lang.String r0 = r0.getActiveSessionId()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.analytics.MediaMetricsListener create(android.content.Context r2) {
            java.lang.String r0 = "media_metrics"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.media.metrics.MediaMetricsManager r0 = (android.media.metrics.MediaMetricsManager) r0
            if (r0 != 0) goto Lc
            r2 = 0
            goto L16
        Lc:
            com.google.android.exoplayer2.analytics.MediaMetricsListener r1 = new com.google.android.exoplayer2.analytics.MediaMetricsListener
            android.media.metrics.PlaybackSession r0 = r0.createPlaybackSession()
            r1.<init>(r2, r0)
            r2 = r1
        L16:
            return r2
    }

    private void finishCurrentSession() {
            r7 = this;
            android.media.metrics.PlaybackMetrics$Builder r0 = r7.metricsBuilder
            r1 = 0
            if (r0 == 0) goto L69
            boolean r2 = r7.reportedEventsForCurrentSession
            if (r2 == 0) goto L69
            int r2 = r7.audioUnderruns
            r0.setAudioUnderrunCount(r2)
            android.media.metrics.PlaybackMetrics$Builder r0 = r7.metricsBuilder
            int r2 = r7.droppedFrames
            r0.setVideoFramesDropped(r2)
            android.media.metrics.PlaybackMetrics$Builder r0 = r7.metricsBuilder
            int r2 = r7.playedFrames
            r0.setVideoFramesPlayed(r2)
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r7.bandwidthTimeMs
            java.lang.String r2 = r7.activeSessionId
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.metricsBuilder
            r3 = 0
            if (r0 != 0) goto L2e
            r5 = r3
            goto L32
        L2e:
            long r5 = r0.longValue()
        L32:
            r2.setNetworkTransferDurationMillis(r5)
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r7.bandwidthBytes
            java.lang.String r2 = r7.activeSessionId
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.metricsBuilder
            if (r0 != 0) goto L45
            r5 = r3
            goto L49
        L45:
            long r5 = r0.longValue()
        L49:
            r2.setNetworkBytesRead(r5)
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.metricsBuilder
            if (r0 == 0) goto L5a
            long r5 = r0.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r2.setStreamSource(r0)
            android.media.metrics.PlaybackSession r0 = r7.playbackSession
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.metricsBuilder
            android.media.metrics.PlaybackMetrics r2 = r2.build()
            r0.reportPlaybackMetrics(r2)
        L69:
            r0 = 0
            r7.metricsBuilder = r0
            r7.activeSessionId = r0
            r7.audioUnderruns = r1
            r7.droppedFrames = r1
            r7.playedFrames = r1
            r7.currentVideoFormat = r0
            r7.currentAudioFormat = r0
            r7.currentTextFormat = r0
            r7.reportedEventsForCurrentSession = r1
            return
    }

    @android.annotation.SuppressLint({"SwitchIntDef"})
    private static int getDrmErrorCode(int r0) {
            int r0 = com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(r0)
            switch(r0) {
                case 6002: goto L13;
                case 6003: goto L10;
                case 6004: goto Ld;
                case 6005: goto La;
                default: goto L7;
            }
        L7:
            r0 = 27
            return r0
        La:
            r0 = 26
            return r0
        Ld:
            r0 = 25
            return r0
        L10:
            r0 = 28
            return r0
        L13:
            r0 = 24
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.drm.DrmInitData getDrmInitData(com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> r3) {
            com.google.common.collect.UnmodifiableIterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            com.google.android.exoplayer2.Tracks$Group r0 = (com.google.android.exoplayer2.Tracks.Group) r0
            r1 = 0
        L11:
            int r2 = r0.length
            if (r1 >= r2) goto L4
            boolean r2 = r0.isTrackSelected(r1)
            if (r2 == 0) goto L24
            com.google.android.exoplayer2.Format r2 = r0.getTrackFormat(r1)
            com.google.android.exoplayer2.drm.DrmInitData r2 = r2.drmInitData
            if (r2 == 0) goto L24
            return r2
        L24:
            int r1 = r1 + 1
            goto L11
        L27:
            r3 = 0
            return r3
    }

    private static int getDrmType(com.google.android.exoplayer2.drm.DrmInitData r3) {
            r0 = 0
        L1:
            int r1 = r3.schemeDataCount
            if (r0 >= r1) goto L2c
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = r3.get(r0)
            java.util.UUID r1 = r1.uuid
            java.util.UUID r2 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L15
            r3 = 3
            return r3
        L15:
            java.util.UUID r2 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1f
            r3 = 2
            return r3
        L1f:
            java.util.UUID r2 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L29
            r3 = 6
            return r3
        L29:
            int r0 = r0 + 1
            goto L1
        L2c:
            r3 = 1
            return r3
    }

    private static com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo getErrorInfo(com.google.android.exoplayer2.PlaybackException r9, android.content.Context r10, boolean r11) {
            int r0 = r9.errorCode
            r1 = 0
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r0 != r2) goto Lf
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 20
            r9.<init>(r10, r1)
            return r9
        Lf:
            boolean r0 = r9 instanceof com.google.android.exoplayer2.ExoPlaybackException
            r2 = 1
            if (r0 == 0) goto L21
            r0 = r9
            com.google.android.exoplayer2.ExoPlaybackException r0 = (com.google.android.exoplayer2.ExoPlaybackException) r0
            int r3 = r0.type
            if (r3 != r2) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            int r0 = r0.rendererFormatSupport
            goto L23
        L21:
            r0 = 0
            r3 = 0
        L23:
            java.lang.Throwable r4 = r9.getCause()
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r5 = r4 instanceof java.io.IOException
            r6 = 3
            r7 = 18
            r8 = 23
            if (r5 == 0) goto L16b
            boolean r0 = r4 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            if (r0 == 0) goto L45
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r4 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r4
            int r9 = r4.responseCode
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r10 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r11 = 5
            r10.<init>(r11, r9)
            return r10
        L45:
            boolean r0 = r4 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException
            if (r0 != 0) goto L15e
            boolean r0 = r4 instanceof com.google.android.exoplayer2.ParserException
            if (r0 == 0) goto L4f
            goto L15e
        L4f:
            boolean r11 = r4 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
            if (r11 != 0) goto L11b
            boolean r11 = r4 instanceof com.google.android.exoplayer2.upstream.UdpDataSource.UdpDataSourceException
            if (r11 == 0) goto L59
            goto L11b
        L59:
            int r9 = r9.errorCode
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 21
            if (r9 != r10) goto L67
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r9.<init>(r11, r1)
            return r9
        L67:
            boolean r9 = r4 instanceof com.google.android.exoplayer2.drm.DrmSession.DrmSessionException
            if (r9 == 0) goto Ld9
            java.lang.Throwable r9 = r4.getCause()
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            int r10 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r10 < r11) goto L91
            boolean r11 = r9 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r11 == 0) goto L91
            android.media.MediaDrm$MediaDrmStateException r9 = (android.media.MediaDrm.MediaDrmStateException) r9
            java.lang.String r9 = r9.getDiagnosticInfo()
            int r9 = com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(r9)
            int r10 = getDrmErrorCode(r9)
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r11 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r11.<init>(r10, r9)
            return r11
        L91:
            if (r10 < r8) goto L9f
            boolean r11 = r9 instanceof android.media.MediaDrmResetException
            if (r11 == 0) goto L9f
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 27
            r9.<init>(r10, r1)
            return r9
        L9f:
            if (r10 < r7) goto Lad
            boolean r11 = r9 instanceof android.media.NotProvisionedException
            if (r11 == 0) goto Lad
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 24
            r9.<init>(r10, r1)
            return r9
        Lad:
            if (r10 < r7) goto Lbb
            boolean r10 = r9 instanceof android.media.DeniedByServerException
            if (r10 == 0) goto Lbb
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 29
            r9.<init>(r10, r1)
            return r9
        Lbb:
            boolean r10 = r9 instanceof com.google.android.exoplayer2.drm.UnsupportedDrmException
            if (r10 == 0) goto Lc5
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r9.<init>(r8, r1)
            return r9
        Lc5:
            boolean r9 = r9 instanceof com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException
            if (r9 == 0) goto Ld1
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 28
            r9.<init>(r10, r1)
            return r9
        Ld1:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 30
            r9.<init>(r10, r1)
            return r9
        Ld9:
            boolean r9 = r4 instanceof com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException
            if (r9 == 0) goto L113
            java.lang.Throwable r9 = r4.getCause()
            boolean r9 = r9 instanceof java.io.FileNotFoundException
            if (r9 == 0) goto L113
            java.lang.Throwable r9 = r4.getCause()
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Throwable r9 = r9.getCause()
            int r10 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r10 < r11) goto L10b
            boolean r10 = r9 instanceof android.system.ErrnoException
            if (r10 == 0) goto L10b
            android.system.ErrnoException r9 = (android.system.ErrnoException) r9
            int r9 = r9.errno
            int r10 = android.system.OsConstants.EACCES
            if (r9 != r10) goto L10b
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 32
            r9.<init>(r10, r1)
            return r9
        L10b:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 31
            r9.<init>(r10, r1)
            return r9
        L113:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 9
            r9.<init>(r10, r1)
            return r9
        L11b:
            com.google.android.exoplayer2.util.NetworkTypeObserver r9 = com.google.android.exoplayer2.util.NetworkTypeObserver.getInstance(r10)
            int r9 = r9.getNetworkType()
            if (r9 != r2) goto L12b
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r9.<init>(r6, r1)
            return r9
        L12b:
            java.lang.Throwable r9 = r4.getCause()
            boolean r10 = r9 instanceof java.net.UnknownHostException
            if (r10 == 0) goto L13a
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 6
            r9.<init>(r10, r1)
            return r9
        L13a:
            boolean r9 = r9 instanceof java.net.SocketTimeoutException
            if (r9 == 0) goto L145
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 7
            r9.<init>(r10, r1)
            return r9
        L145:
            boolean r9 = r4 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
            if (r9 == 0) goto L156
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r4 = (com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) r4
            int r9 = r4.type
            if (r9 != r2) goto L156
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 4
            r9.<init>(r10, r1)
            return r9
        L156:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 8
            r9.<init>(r10, r1)
            return r9
        L15e:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            if (r11 == 0) goto L165
            r10 = 10
            goto L167
        L165:
            r10 = 11
        L167:
            r9.<init>(r10, r1)
            return r9
        L16b:
            if (r3 == 0) goto L179
            if (r0 == 0) goto L171
            if (r0 != r2) goto L179
        L171:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 35
            r9.<init>(r10, r1)
            return r9
        L179:
            if (r3 == 0) goto L185
            if (r0 != r6) goto L185
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 15
            r9.<init>(r10, r1)
            return r9
        L185:
            if (r3 == 0) goto L190
            r9 = 2
            if (r0 != r9) goto L190
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r9.<init>(r8, r1)
            return r9
        L190:
            boolean r9 = r4 instanceof com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException
            if (r9 == 0) goto L1a4
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r4 = (com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException) r4
            java.lang.String r9 = r4.diagnosticInfo
            int r9 = com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(r9)
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r10 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r11 = 13
            r10.<init>(r11, r9)
            return r10
        L1a4:
            boolean r9 = r4 instanceof com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException
            r10 = 14
            if (r9 == 0) goto L1b8
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r4 = (com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException) r4
            java.lang.String r9 = r4.diagnosticInfo
            int r9 = com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(r9)
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r11 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r11.<init>(r10, r9)
            return r11
        L1b8:
            boolean r9 = r4 instanceof java.lang.OutOfMemoryError
            if (r9 == 0) goto L1c2
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r9.<init>(r10, r1)
            return r9
        L1c2:
            boolean r9 = r4 instanceof com.google.android.exoplayer2.audio.AudioSink.InitializationException
            if (r9 == 0) goto L1d2
            com.google.android.exoplayer2.audio.AudioSink$InitializationException r4 = (com.google.android.exoplayer2.audio.AudioSink.InitializationException) r4
            int r9 = r4.audioTrackState
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r10 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r11 = 17
            r10.<init>(r11, r9)
            return r10
        L1d2:
            boolean r9 = r4 instanceof com.google.android.exoplayer2.audio.AudioSink.WriteException
            if (r9 == 0) goto L1e0
            com.google.android.exoplayer2.audio.AudioSink$WriteException r4 = (com.google.android.exoplayer2.audio.AudioSink.WriteException) r4
            int r9 = r4.errorCode
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r10 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10.<init>(r7, r9)
            return r10
        L1e0:
            int r9 = com.google.android.exoplayer2.util.Util.SDK_INT
            r10 = 16
            if (r9 < r10) goto L1fa
            boolean r9 = r4 instanceof android.media.MediaCodec.CryptoException
            if (r9 == 0) goto L1fa
            android.media.MediaCodec$CryptoException r4 = (android.media.MediaCodec.CryptoException) r4
            int r9 = r4.getErrorCode()
            int r10 = getDrmErrorCode(r9)
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r11 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r11.<init>(r10, r9)
            return r11
        L1fa:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r9 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo
            r10 = 22
            r9.<init>(r10, r1)
            return r9
    }

    private static android.util.Pair<java.lang.String, java.lang.String> getLanguageAndRegion(java.lang.String r3) {
            java.lang.String r0 = "-"
            java.lang.String[] r3 = com.google.android.exoplayer2.util.Util.split(r3, r0)
            r0 = 0
            r0 = r3[r0]
            int r1 = r3.length
            r2 = 2
            if (r1 < r2) goto L11
            r1 = 1
            r3 = r3[r1]
            goto L12
        L11:
            r3 = 0
        L12:
            android.util.Pair r3 = android.util.Pair.create(r0, r3)
            return r3
    }

    private static int getNetworkType(android.content.Context r0) {
            com.google.android.exoplayer2.util.NetworkTypeObserver r0 = com.google.android.exoplayer2.util.NetworkTypeObserver.getInstance(r0)
            int r0 = r0.getNetworkType()
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L1c;
                case 2: goto L1a;
                case 3: goto L18;
                case 4: goto L16;
                case 5: goto L14;
                case 6: goto Lb;
                case 7: goto L12;
                case 8: goto Lb;
                case 9: goto Lf;
                case 10: goto Ld;
                default: goto Lb;
            }
        Lb:
            r0 = 1
            return r0
        Ld:
            r0 = 7
            return r0
        Lf:
            r0 = 8
            return r0
        L12:
            r0 = 3
            return r0
        L14:
            r0 = 6
            return r0
        L16:
            r0 = 5
            return r0
        L18:
            r0 = 4
            return r0
        L1a:
            r0 = 2
            return r0
        L1c:
            r0 = 9
            return r0
        L1f:
            r0 = 0
            return r0
    }

    private static int getStreamType(com.google.android.exoplayer2.MediaItem r2) {
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r2 = r2.localConfiguration
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            android.net.Uri r0 = r2.uri
            java.lang.String r2 = r2.mimeType
            int r2 = com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(r0, r2)
            if (r2 == 0) goto L1b
            r0 = 1
            if (r2 == r0) goto L19
            r1 = 2
            if (r2 == r1) goto L17
            return r0
        L17:
            r2 = 4
            return r2
        L19:
            r2 = 5
            return r2
        L1b:
            r2 = 3
            return r2
    }

    private static int getTrackChangeReason(int r3) {
            r0 = 2
            r1 = 1
            if (r3 == r1) goto Ld
            r2 = 3
            if (r3 == r0) goto Lc
            if (r3 == r2) goto La
            return r1
        La:
            r3 = 4
            return r3
        Lc:
            return r2
        Ld:
            return r0
    }

    private void maybeAddSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.Events r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L2b
            int r1 = r5.get(r0)
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r2 = r5.getEventTime(r1)
            if (r1 != 0) goto L17
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r1 = r4.sessionManager
            r1.updateSessionsWithTimelineChange(r2)
            goto L28
        L17:
            r3 = 11
            if (r1 != r3) goto L23
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r1 = r4.sessionManager
            int r3 = r4.discontinuityReason
            r1.updateSessionsWithDiscontinuity(r2, r3)
            goto L28
        L23:
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r1 = r4.sessionManager
            r1.updateSessions(r2)
        L28:
            int r0 = r0 + 1
            goto L1
        L2b:
            return
    }

    private void maybeReportNetworkChange(long r5) {
            r4 = this;
            android.content.Context r0 = r4.context
            int r0 = getNetworkType(r0)
            int r1 = r4.currentNetworkType
            if (r0 == r1) goto L25
            r4.currentNetworkType = r0
            android.media.metrics.PlaybackSession r1 = r4.playbackSession
            android.media.metrics.NetworkEvent$Builder r2 = new android.media.metrics.NetworkEvent$Builder
            r2.<init>()
            android.media.metrics.NetworkEvent$Builder r0 = r2.setNetworkType(r0)
            long r2 = r4.startTimeMs
            long r5 = r5 - r2
            android.media.metrics.NetworkEvent$Builder r5 = r0.setTimeSinceCreatedMillis(r5)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r1.reportNetworkEvent(r5)
        L25:
            return
    }

    private void maybeReportPlaybackError(long r8) {
            r7 = this;
            com.google.android.exoplayer2.PlaybackException r0 = r7.pendingPlayerError
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r1 = r7.context
            int r2 = r7.ioErrorType
            r3 = 4
            r4 = 1
            if (r2 != r3) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$ErrorInfo r1 = getErrorInfo(r0, r1, r2)
            android.media.metrics.PlaybackSession r2 = r7.playbackSession
            android.media.metrics.PlaybackErrorEvent$Builder r3 = new android.media.metrics.PlaybackErrorEvent$Builder
            r3.<init>()
            long r5 = r7.startTimeMs
            long r8 = r8 - r5
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r3.setTimeSinceCreatedMillis(r8)
            int r9 = r1.errorCode
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r9)
            int r9 = r1.subErrorCode
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setSubErrorCode(r9)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setException(r0)
            android.media.metrics.PlaybackErrorEvent r8 = r8.build()
            r2.reportPlaybackErrorEvent(r8)
            r7.reportedEventsForCurrentSession = r4
            r8 = 0
            r7.pendingPlayerError = r8
            return
    }

    private void maybeReportPlaybackStateChange(com.google.android.exoplayer2.Player r4, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r5, long r6) {
            r3 = this;
            int r0 = r4.getPlaybackState()
            r1 = 0
            r2 = 2
            if (r0 == r2) goto La
            r3.isSeeking = r1
        La:
            com.google.android.exoplayer2.PlaybackException r0 = r4.getPlayerError()
            r2 = 1
            if (r0 != 0) goto L14
            r3.hasFatalError = r1
            goto L1e
        L14:
            r0 = 10
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L1e
            r3.hasFatalError = r2
        L1e:
            int r4 = r3.resolveNewPlaybackState(r4)
            int r5 = r3.currentPlaybackState
            if (r5 == r4) goto L45
            r3.currentPlaybackState = r4
            r3.reportedEventsForCurrentSession = r2
            android.media.metrics.PlaybackSession r4 = r3.playbackSession
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r0 = r3.currentPlaybackState
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r0)
            long r0 = r3.startTimeMs
            long r6 = r6 - r0
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r6)
            android.media.metrics.PlaybackStateEvent r5 = r5.build()
            r4.reportPlaybackStateEvent(r5)
        L45:
            return
    }

    private void maybeReportTrackChanges(com.google.android.exoplayer2.Player r4, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r5, long r6) {
            r3 = this;
            r0 = 2
            boolean r5 = r5.contains(r0)
            r1 = 0
            if (r5 == 0) goto L30
            com.google.android.exoplayer2.Tracks r4 = r4.getCurrentTracks()
            boolean r5 = r4.isTypeSelected(r0)
            r0 = 1
            boolean r0 = r4.isTypeSelected(r0)
            r2 = 3
            boolean r4 = r4.isTypeSelected(r2)
            if (r5 != 0) goto L20
            if (r0 != 0) goto L20
            if (r4 == 0) goto L30
        L20:
            r2 = 0
            if (r5 != 0) goto L26
            r3.maybeUpdateVideoFormat(r6, r1, r2)
        L26:
            if (r0 != 0) goto L2b
            r3.maybeUpdateAudioFormat(r6, r1, r2)
        L2b:
            if (r4 != 0) goto L30
            r3.maybeUpdateTextFormat(r6, r1, r2)
        L30:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r4 = r3.pendingVideoFormat
            boolean r4 = r3.canReportPendingFormatUpdate(r4)
            if (r4 == 0) goto L48
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r4 = r3.pendingVideoFormat
            com.google.android.exoplayer2.Format r5 = r4.format
            int r0 = r5.height
            r2 = -1
            if (r0 == r2) goto L48
            int r4 = r4.selectionReason
            r3.maybeUpdateVideoFormat(r6, r5, r4)
            r3.pendingVideoFormat = r1
        L48:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r4 = r3.pendingAudioFormat
            boolean r4 = r3.canReportPendingFormatUpdate(r4)
            if (r4 == 0) goto L5b
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r4 = r3.pendingAudioFormat
            com.google.android.exoplayer2.Format r5 = r4.format
            int r4 = r4.selectionReason
            r3.maybeUpdateAudioFormat(r6, r5, r4)
            r3.pendingAudioFormat = r1
        L5b:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r4 = r3.pendingTextFormat
            boolean r4 = r3.canReportPendingFormatUpdate(r4)
            if (r4 == 0) goto L6e
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r4 = r3.pendingTextFormat
            com.google.android.exoplayer2.Format r5 = r4.format
            int r4 = r4.selectionReason
            r3.maybeUpdateTextFormat(r6, r5, r4)
            r3.pendingTextFormat = r1
        L6e:
            return
    }

    private void maybeUpdateAudioFormat(long r7, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r9, int r10) {
            r6 = this;
            com.google.android.exoplayer2.Format r0 = r6.currentAudioFormat
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r9)
            if (r0 == 0) goto L9
            return
        L9:
            com.google.android.exoplayer2.Format r0 = r6.currentAudioFormat
            if (r0 != 0) goto L12
            if (r10 != 0) goto L12
            r10 = 1
            r5 = 1
            goto L13
        L12:
            r5 = r10
        L13:
            r6.currentAudioFormat = r9
            r1 = 0
            r0 = r6
            r2 = r7
            r4 = r9
            r0.reportTrackChangeEvent(r1, r2, r4, r5)
            return
    }

    private void maybeUpdateMetricsBuilderValues(com.google.android.exoplayer2.Player r3, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r4) {
            r2 = this;
            r0 = 0
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L16
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r0 = r4.getEventTime(r0)
            android.media.metrics.PlaybackMetrics$Builder r1 = r2.metricsBuilder
            if (r1 == 0) goto L16
            com.google.android.exoplayer2.Timeline r1 = r0.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.mediaPeriodId
            r2.maybeUpdateTimelineMetadata(r1, r0)
        L16:
            r0 = 2
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L3e
            android.media.metrics.PlaybackMetrics$Builder r0 = r2.metricsBuilder
            if (r0 == 0) goto L3e
            com.google.android.exoplayer2.Tracks r3 = r3.getCurrentTracks()
            com.google.common.collect.ImmutableList r3 = r3.getGroups()
            com.google.android.exoplayer2.drm.DrmInitData r3 = getDrmInitData(r3)
            if (r3 == 0) goto L3e
            android.media.metrics.PlaybackMetrics$Builder r0 = r2.metricsBuilder
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            android.media.metrics.PlaybackMetrics$Builder r0 = (android.media.metrics.PlaybackMetrics.Builder) r0
            int r3 = getDrmType(r3)
            r0.setDrmType(r3)
        L3e:
            r3 = 1011(0x3f3, float:1.417E-42)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L4c
            int r3 = r2.audioUnderruns
            int r3 = r3 + 1
            r2.audioUnderruns = r3
        L4c:
            return
    }

    private void maybeUpdateTextFormat(long r7, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r9, int r10) {
            r6 = this;
            com.google.android.exoplayer2.Format r0 = r6.currentTextFormat
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r9)
            if (r0 == 0) goto L9
            return
        L9:
            com.google.android.exoplayer2.Format r0 = r6.currentTextFormat
            if (r0 != 0) goto L12
            if (r10 != 0) goto L12
            r10 = 1
            r5 = 1
            goto L13
        L12:
            r5 = r10
        L13:
            r6.currentTextFormat = r9
            r1 = 2
            r0 = r6
            r2 = r7
            r4 = r9
            r0.reportTrackChangeEvent(r1, r2, r4, r5)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(com.google.android.exoplayer2.Timeline r6, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r7) {
            r5 = this;
            android.media.metrics.PlaybackMetrics$Builder r0 = r5.metricsBuilder
            if (r7 != 0) goto L5
            return
        L5:
            java.lang.Object r7 = r7.periodUid
            int r7 = r6.getIndexOfPeriod(r7)
            r1 = -1
            if (r7 != r1) goto Lf
            return
        Lf:
            com.google.android.exoplayer2.Timeline$Period r1 = r5.period
            r6.getPeriod(r7, r1)
            com.google.android.exoplayer2.Timeline$Period r7 = r5.period
            int r7 = r7.windowIndex
            com.google.android.exoplayer2.Timeline$Window r1 = r5.window
            r6.getWindow(r7, r1)
            com.google.android.exoplayer2.Timeline$Window r6 = r5.window
            com.google.android.exoplayer2.MediaItem r6 = r6.mediaItem
            int r6 = getStreamType(r6)
            r0.setStreamType(r6)
            com.google.android.exoplayer2.Timeline$Window r6 = r5.window
            long r1 = r6.durationUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L4c
            boolean r7 = r6.isPlaceholder
            if (r7 != 0) goto L4c
            boolean r7 = r6.isDynamic
            if (r7 != 0) goto L4c
            boolean r6 = r6.isLive()
            if (r6 != 0) goto L4c
            com.google.android.exoplayer2.Timeline$Window r6 = r5.window
            long r6 = r6.getDurationMs()
            r0.setMediaDurationMillis(r6)
        L4c:
            com.google.android.exoplayer2.Timeline$Window r6 = r5.window
            boolean r6 = r6.isLive()
            r7 = 1
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L57:
            r6 = 1
        L58:
            r0.setPlaybackType(r6)
            r5.reportedEventsForCurrentSession = r7
            return
    }

    private void maybeUpdateVideoFormat(long r7, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r9, int r10) {
            r6 = this;
            com.google.android.exoplayer2.Format r0 = r6.currentVideoFormat
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r9)
            if (r0 == 0) goto L9
            return
        L9:
            com.google.android.exoplayer2.Format r0 = r6.currentVideoFormat
            if (r0 != 0) goto L12
            if (r10 != 0) goto L12
            r10 = 1
            r5 = 1
            goto L13
        L12:
            r5 = r10
        L13:
            r6.currentVideoFormat = r9
            r1 = 1
            r0 = r6
            r2 = r7
            r4 = r9
            r0.reportTrackChangeEvent(r1, r2, r4, r5)
            return
    }

    private void reportTrackChangeEvent(int r4, long r5, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r7, int r8) {
            r3 = this;
            android.media.metrics.TrackChangeEvent$Builder r0 = new android.media.metrics.TrackChangeEvent$Builder
            r0.<init>(r4)
            long r1 = r3.startTimeMs
            long r5 = r5 - r1
            android.media.metrics.TrackChangeEvent$Builder r4 = r0.setTimeSinceCreatedMillis(r5)
            r5 = 1
            if (r7 == 0) goto L76
            r4.setTrackState(r5)
            int r6 = getTrackChangeReason(r8)
            r4.setTrackChangeReason(r6)
            java.lang.String r6 = r7.containerMimeType
            if (r6 == 0) goto L20
            r4.setContainerMimeType(r6)
        L20:
            java.lang.String r6 = r7.sampleMimeType
            if (r6 == 0) goto L27
            r4.setSampleMimeType(r6)
        L27:
            java.lang.String r6 = r7.codecs
            if (r6 == 0) goto L2e
            r4.setCodecName(r6)
        L2e:
            int r6 = r7.bitrate
            r8 = -1
            if (r6 == r8) goto L36
            r4.setBitrate(r6)
        L36:
            int r6 = r7.width
            if (r6 == r8) goto L3d
            r4.setWidth(r6)
        L3d:
            int r6 = r7.height
            if (r6 == r8) goto L44
            r4.setHeight(r6)
        L44:
            int r6 = r7.channelCount
            if (r6 == r8) goto L4b
            r4.setChannelCount(r6)
        L4b:
            int r6 = r7.sampleRate
            if (r6 == r8) goto L52
            r4.setAudioSampleRate(r6)
        L52:
            java.lang.String r6 = r7.language
            if (r6 == 0) goto L6a
            android.util.Pair r6 = getLanguageAndRegion(r6)
            java.lang.Object r8 = r6.first
            java.lang.String r8 = (java.lang.String) r8
            r4.setLanguage(r8)
            java.lang.Object r6 = r6.second
            if (r6 == 0) goto L6a
            java.lang.String r6 = (java.lang.String) r6
            r4.setLanguageRegion(r6)
        L6a:
            float r6 = r7.frameRate
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L7a
            r4.setVideoFrameRate(r6)
            goto L7a
        L76:
            r6 = 0
            r4.setTrackState(r6)
        L7a:
            r3.reportedEventsForCurrentSession = r5
            android.media.metrics.PlaybackSession r5 = r3.playbackSession
            android.media.metrics.TrackChangeEvent r4 = r4.build()
            r5.reportTrackChangeEvent(r4)
            return
    }

    private int resolveNewPlaybackState(com.google.android.exoplayer2.Player r4) {
            r3 = this;
            int r0 = r4.getPlaybackState()
            boolean r1 = r3.isSeeking
            if (r1 == 0) goto La
            r4 = 5
            return r4
        La:
            boolean r1 = r3.hasFatalError
            if (r1 == 0) goto L11
            r4 = 13
            return r4
        L11:
            r1 = 4
            if (r0 != r1) goto L17
            r4 = 11
            return r4
        L17:
            r2 = 2
            if (r0 != r2) goto L35
            int r0 = r3.currentPlaybackState
            if (r0 == 0) goto L34
            if (r0 != r2) goto L21
            goto L34
        L21:
            boolean r0 = r4.getPlayWhenReady()
            if (r0 != 0) goto L29
            r4 = 7
            return r4
        L29:
            int r4 = r4.getPlaybackSuppressionReason()
            if (r4 == 0) goto L32
            r4 = 10
            goto L33
        L32:
            r4 = 6
        L33:
            return r4
        L34:
            return r2
        L35:
            r2 = 3
            if (r0 != r2) goto L48
            boolean r0 = r4.getPlayWhenReady()
            if (r0 != 0) goto L3f
            return r1
        L3f:
            int r4 = r4.getPlaybackSuppressionReason()
            if (r4 == 0) goto L47
            r2 = 9
        L47:
            return r2
        L48:
            r4 = 1
            if (r0 != r4) goto L52
            int r4 = r3.currentPlaybackState
            if (r4 == 0) goto L52
            r4 = 12
            return r4
        L52:
            int r4 = r3.currentPlaybackState
            return r4
    }

    public android.media.metrics.LogSessionId getLogSessionId() {
            r1 = this;
            android.media.metrics.PlaybackSession r0 = r1.playbackSession
            android.media.metrics.LogSessionId r0 = r0.getSessionId()
            return r0
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.audio.AudioAttributes r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioAttributesChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioCodecError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderReleased(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDisabled(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioEnabled(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioInputFormatChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioInputFormatChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioPositionAdvancing(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioSessionIdChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioSinkError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioUnderrun(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.Commands r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAvailableCommandsChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r6, int r7, long r8, long r10) {
            r5 = this;
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r10 = r6.mediaPeriodId
            if (r10 == 0) goto L48
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r11 = r5.sessionManager
            com.google.android.exoplayer2.Timeline r6 = r6.timeline
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r10 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r10
            java.lang.String r6 = r11.getSessionForMediaPeriodId(r6, r10)
            java.util.HashMap<java.lang.String, java.lang.Long> r10 = r5.bandwidthBytes
            java.lang.Object r10 = r10.get(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            java.util.HashMap<java.lang.String, java.lang.Long> r11 = r5.bandwidthTimeMs
            java.lang.Object r11 = r11.get(r6)
            java.lang.Long r11 = (java.lang.Long) r11
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r5.bandwidthBytes
            r1 = 0
            if (r10 != 0) goto L2a
            r3 = r1
            goto L2e
        L2a:
            long r3 = r10.longValue()
        L2e:
            long r3 = r3 + r8
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r0.put(r6, r8)
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = r5.bandwidthTimeMs
            if (r11 != 0) goto L3b
            goto L3f
        L3b:
            long r1 = r11.longValue()
        L3f:
            long r9 = (long) r7
            long r1 = r1 + r9
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r8.put(r6, r7)
        L48:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.text.CueGroup r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.util.List r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderDisabled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderEnabled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, java.lang.String r3, long r4) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInitialized(r0, r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, com.google.android.exoplayer2.Format r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInputFormatChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.DeviceInfo r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceInfoChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, boolean r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceVolumeChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r6, com.google.android.exoplayer2.source.MediaLoadData r7) {
            r5 = this;
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r6.mediaPeriodId
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r0 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate
            com.google.android.exoplayer2.Format r1 = r7.trackFormat
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.Format r1 = (com.google.android.exoplayer2.Format) r1
            int r2 = r7.trackSelectionReason
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r3 = r5.sessionManager
            com.google.android.exoplayer2.Timeline r4 = r6.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r6.mediaPeriodId
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r6
            java.lang.String r6 = r3.getSessionForMediaPeriodId(r4, r6)
            r0.<init>(r1, r2, r6)
            int r6 = r7.trackType
            if (r6 == 0) goto L38
            r7 = 1
            if (r6 == r7) goto L35
            r7 = 2
            if (r6 == r7) goto L38
            r7 = 3
            if (r6 == r7) goto L32
            goto L3a
        L32:
            r5.pendingTextFormat = r0
            goto L3a
        L35:
            r5.pendingAudioFormat = r0
            goto L3a
        L38:
            r5.pendingVideoFormat = r0
        L3a:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysLoaded(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysRemoved(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysRestored(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionManagerError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionReleased(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDroppedVideoFrames(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onEvents(com.google.android.exoplayer2.Player r3, com.google.android.exoplayer2.analytics.AnalyticsListener.Events r4) {
            r2 = this;
            int r0 = r4.size()
            if (r0 != 0) goto L7
            return
        L7:
            r2.maybeAddSessions(r4)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.maybeUpdateMetricsBuilderValues(r3, r4)
            r2.maybeReportPlaybackError(r0)
            r2.maybeReportTrackChanges(r3, r4, r0)
            r2.maybeReportNetworkChange(r0)
            r2.maybeReportPlaybackStateChange(r3, r4, r0)
            r3 = 1028(0x404, float:1.44E-42)
            boolean r0 = r4.contains(r3)
            if (r0 == 0) goto L2e
            com.google.android.exoplayer2.analytics.PlaybackSessionManager r0 = r2.sessionManager
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r3 = r4.getEventTime(r3)
            r0.finishAllSessions(r3)
        L2e:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onIsLoadingChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onIsPlayingChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadCanceled(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadCompleted(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, java.io.IOException r4, boolean r5) {
            r0 = this;
            int r1 = r3.dataType
            r0.ioErrorType = r1
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadStarted(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadingChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMaxSeekToPreviousPositionChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaItem r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMediaItemTransition(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMediaMetadataChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.metadata.Metadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMetadata(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayWhenReadyChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackParameters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackParametersChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackStateChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2) {
            r0 = this;
            r0.pendingPlayerError = r2
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.PlaybackException r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerErrorChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerReleased(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerStateChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.MediaMetadata r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaylistMetadataChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPositionDiscontinuity(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Player.PositionInfo r2, com.google.android.exoplayer2.Player.PositionInfo r3, int r4) {
            r0 = this;
            r1 = 1
            if (r4 != r1) goto L5
            r0.isSeeking = r1
        L5:
            r0.discontinuityReason = r4
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Object r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onRenderedFirstFrame(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onRepeatModeChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekBackIncrementChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekForwardIncrementChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekProcessed(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekStarted(r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, java.lang.String r3) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r2.mediaPeriodId
            if (r0 == 0) goto Lb
            boolean r0 = r0.isAd()
            if (r0 == 0) goto Lb
            return
        Lb:
            r1.finishCurrentSession()
            r1.activeSessionId = r3
            android.media.metrics.PlaybackMetrics$Builder r3 = new android.media.metrics.PlaybackMetrics$Builder
            r3.<init>()
            java.lang.String r0 = "ExoPlayerLib"
            android.media.metrics.PlaybackMetrics$Builder r3 = r3.setPlayerName(r0)
            java.lang.String r0 = "2.18.6"
            android.media.metrics.PlaybackMetrics$Builder r3 = r3.setPlayerVersion(r0)
            r1.metricsBuilder = r3
            com.google.android.exoplayer2.Timeline r3 = r2.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.mediaPeriodId
            r1.maybeUpdateTimelineMetadata(r3, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, boolean r3) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.mediaPeriodId
            if (r1 == 0) goto La
            boolean r1 = r1.isAd()
            if (r1 != 0) goto L16
        La:
            java.lang.String r1 = r0.activeSessionId
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L13
            goto L16
        L13:
            r0.finishCurrentSession()
        L16:
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = r0.bandwidthTimeMs
            r1.remove(r2)
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = r0.bandwidthBytes
            r1.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onShuffleModeChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, boolean r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSkipSilenceEnabledChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSurfaceSizeChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTimelineChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTrackSelectionParametersChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Tracks r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTracksChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.source.MediaLoadData r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onUpstreamDiscarded(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.Exception r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoCodecError(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(r0, r1, r2, r3, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, java.lang.String r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderReleased(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r2, com.google.android.exoplayer2.decoder.DecoderCounters r3) {
            r1 = this;
            int r2 = r1.droppedFrames
            int r0 = r3.droppedBufferCount
            int r2 = r2 + r0
            r1.droppedFrames = r2
            int r2 = r1.playedFrames
            int r3 = r3.renderedOutputBufferCount
            int r2 = r2 + r3
            r1.playedFrames = r2
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.decoder.DecoderCounters r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoEnabled(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, long r2, int r4) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoFrameProcessingOffset(r0, r1, r2, r4)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoInputFormatChanged(r0, r1, r2)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoInputFormatChanged(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, int r2, int r3, int r4, float r5) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoSizeChanged(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r4, com.google.android.exoplayer2.video.VideoSize r5) {
            r3 = this;
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r4 = r3.pendingVideoFormat
            if (r4 == 0) goto L2a
            com.google.android.exoplayer2.Format r0 = r4.format
            int r1 = r0.height
            r2 = -1
            if (r1 != r2) goto L2a
            com.google.android.exoplayer2.Format$Builder r0 = r0.buildUpon()
            int r1 = r5.width
            com.google.android.exoplayer2.Format$Builder r0 = r0.setWidth(r1)
            int r5 = r5.height
            com.google.android.exoplayer2.Format$Builder r5 = r0.setHeight(r5)
            com.google.android.exoplayer2.Format r5 = r5.build()
            com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate r0 = new com.google.android.exoplayer2.analytics.MediaMetricsListener$PendingFormatUpdate
            int r1 = r4.selectionReason
            java.lang.String r4 = r4.sessionId
            r0.<init>(r5, r1, r4)
            r3.pendingVideoFormat = r0
        L2a:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final /* synthetic */ void onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r1, float r2) {
            r0 = this;
            com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVolumeChanged(r0, r1, r2)
            return
    }
}
