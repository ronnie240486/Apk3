package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsPlaylistTracker implements com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist>> {
    public static final double DEFAULT_PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    public static final com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory FACTORY = null;
    private final com.google.android.exoplayer2.source.hls.HlsDataSourceFactory dataSourceFactory;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.Loader initialPlaylistLoader;
    private long initialStartTimeUs;
    private boolean isLive;
    private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener> listeners;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist;
    private final java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle> playlistBundles;
    private final com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory playlistParserFactory;

    @androidx.annotation.Nullable
    private android.os.Handler playlistRefreshHandler;
    private final double playlistStuckTargetDurationCoefficient;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist primaryMediaPlaylistSnapshot;

    @androidx.annotation.Nullable
    private android.net.Uri primaryMediaPlaylistUrl;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class FirstPrimaryMediaPlaylistListener implements com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener {
        public final /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker this$0;

        private FirstPrimaryMediaPlaylistListener(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ FirstPrimaryMediaPlaylistListener(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r1, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public void onPlaylistChanged() {
                r1 = this;
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0 = r1.this$0
                java.util.concurrent.CopyOnWriteArrayList r0 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1900(r0)
                r0.remove(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public boolean onPlaylistError(android.net.Uri r9, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r10, boolean r11) {
                r8 = this;
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r11 = r8.this$0
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r11 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$2000(r11)
                r0 = 0
                if (r11 != 0) goto L7c
                long r1 = android.os.SystemClock.elapsedRealtime()
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r11 = r8.this$0
                com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r11 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1200(r11)
                java.lang.Object r11 = com.google.android.exoplayer2.util.Util.castNonNull(r11)
                com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r11 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist) r11
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r11 = r11.variants
                r3 = 0
                r4 = 0
            L1d:
                int r5 = r11.size()
                if (r3 >= r5) goto L46
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r5 = r8.this$0
                java.util.HashMap r5 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$2100(r5)
                java.lang.Object r6 = r11.get(r3)
                com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r6 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r6
                android.net.Uri r6 = r6.url
                java.lang.Object r5 = r5.get(r6)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r5 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r5
                if (r5 == 0) goto L43
                long r5 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$300(r5)
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 >= 0) goto L43
                int r4 = r4 + 1
            L43:
                int r3 = r3 + 1
                goto L1d
            L46:
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions r11 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r1 = r8.this$0
                com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1200(r1)
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r1 = r1.variants
                int r1 = r1.size()
                r2 = 1
                r11.<init>(r2, r0, r1, r4)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r1 = r8.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$900(r1)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection r10 = r1.getFallbackSelectionFor(r11, r10)
                if (r10 == 0) goto L7c
                int r11 = r10.type
                r1 = 2
                if (r11 != r1) goto L7c
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r11 = r8.this$0
                java.util.HashMap r11 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$2100(r11)
                java.lang.Object r9 = r11.get(r9)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r9 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r9
                if (r9 == 0) goto L7c
                long r10 = r10.exclusionDurationMs
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$000(r9, r10)
            L7c:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class MediaPlaylistBundle implements com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist>> {
        private static final java.lang.String BLOCK_MSN_PARAM = "_HLS_msn";
        private static final java.lang.String BLOCK_PART_PARAM = "_HLS_part";
        private static final java.lang.String SKIP_PARAM = "_HLS_skip";
        private long earliestNextLoadTimeMs;
        private long excludeUntilMs;
        private long lastSnapshotChangeMs;
        private long lastSnapshotLoadMs;
        private boolean loadPending;
        private final com.google.android.exoplayer2.upstream.DataSource mediaPlaylistDataSource;
        private final com.google.android.exoplayer2.upstream.Loader mediaPlaylistLoader;

        @androidx.annotation.Nullable
        private java.io.IOException playlistError;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist playlistSnapshot;
        private final android.net.Uri playlistUrl;
        public final /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker this$0;

        public static /* synthetic */ void $r8$lambda$1BVYirnNpLtBVQiVEwnNBozuq7k(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle r0, android.net.Uri r1) {
                r0.lambda$loadPlaylistInternal$0(r1)
                return
        }

        public MediaPlaylistBundle(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2, android.net.Uri r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r1.playlistUrl = r3
                com.google.android.exoplayer2.upstream.Loader r3 = new com.google.android.exoplayer2.upstream.Loader
                java.lang.String r0 = "DefaultHlsPlaylistTracker:MediaPlaylist"
                r3.<init>(r0)
                r1.mediaPlaylistLoader = r3
                com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$700(r2)
                r3 = 4
                com.google.android.exoplayer2.upstream.DataSource r2 = r2.createDataSource(r3)
                r1.mediaPlaylistDataSource = r2
                return
        }

        public static /* synthetic */ boolean access$000(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle r0, long r1) {
                boolean r0 = r0.excludePlaylist(r1)
                return r0
        }

        public static /* synthetic */ void access$200(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle r0, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1, com.google.android.exoplayer2.source.LoadEventInfo r2) {
                r0.processLoadedPlaylist(r1, r2)
                return
        }

        public static /* synthetic */ long access$300(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle r2) {
                long r0 = r2.excludeUntilMs
                return r0
        }

        public static /* synthetic */ android.net.Uri access$400(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle r0) {
                android.net.Uri r0 = r0.playlistUrl
                return r0
        }

        public static /* synthetic */ void access$500(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle r0, android.net.Uri r1) {
                r0.loadPlaylistInternal(r1)
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist access$600(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle r0) {
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r0.playlistSnapshot
                return r0
        }

        private boolean excludePlaylist(long r3) {
                r2 = this;
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r0 = r0 + r3
                r2.excludeUntilMs = r0
                android.net.Uri r3 = r2.playlistUrl
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r4 = r2.this$0
                android.net.Uri r4 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1700(r4)
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L1f
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r3 = r2.this$0
                boolean r3 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1800(r3)
                if (r3 != 0) goto L1f
                r3 = 1
                goto L20
            L1f:
                r3 = 0
            L20:
                return r3
        }

        private android.net.Uri getMediaPlaylistUriForReload() {
                r7 = this;
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r7.playlistSnapshot
                if (r0 == 0) goto L7e
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r0 = r0.serverControl
                long r1 = r0.skipUntilUs
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L16
                boolean r0 = r0.canBlockReload
                if (r0 != 0) goto L16
                goto L7e
            L16:
                android.net.Uri r0 = r7.playlistUrl
                android.net.Uri$Builder r0 = r0.buildUpon()
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = r7.playlistSnapshot
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r2 = r1.serverControl
                boolean r2 = r2.canBlockReload
                if (r2 == 0) goto L60
                long r5 = r1.mediaSequence
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r1 = r1.segments
                int r1 = r1.size()
                long r1 = (long) r1
                long r5 = r5 + r1
                java.lang.String r1 = java.lang.String.valueOf(r5)
                java.lang.String r2 = "_HLS_msn"
                r0.appendQueryParameter(r2, r1)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = r7.playlistSnapshot
                long r5 = r1.partTargetDurationUs
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 == 0) goto L60
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r1 = r1.trailingParts
                int r2 = r1.size()
                boolean r5 = r1.isEmpty()
                if (r5 != 0) goto L57
                java.lang.Object r1 = com.google.common.collect.Iterables.getLast(r1)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r1
                boolean r1 = r1.isPreload
                if (r1 == 0) goto L57
                int r2 = r2 + (-1)
            L57:
                java.lang.String r1 = java.lang.String.valueOf(r2)
                java.lang.String r2 = "_HLS_part"
                r0.appendQueryParameter(r2, r1)
            L60:
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = r7.playlistSnapshot
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r1 = r1.serverControl
                long r5 = r1.skipUntilUs
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 == 0) goto L79
                boolean r1 = r1.canSkipDateRanges
                if (r1 == 0) goto L72
                java.lang.String r1 = "v2"
                goto L74
            L72:
                java.lang.String r1 = "YES"
            L74:
                java.lang.String r2 = "_HLS_skip"
                r0.appendQueryParameter(r2, r1)
            L79:
                android.net.Uri r0 = r0.build()
                return r0
            L7e:
                android.net.Uri r0 = r7.playlistUrl
                return r0
        }

        private /* synthetic */ void lambda$loadPlaylistInternal$0(android.net.Uri r2) {
                r1 = this;
                r0 = 0
                r1.loadPending = r0
                r1.loadPlaylistImmediately(r2)
                return
        }

        private void loadPlaylistImmediately(android.net.Uri r9) {
                r8 = this;
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0 = r8.this$0
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r0 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1300(r0)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r1 = r8.this$0
                com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1200(r1)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2 = r8.playlistSnapshot
                com.google.android.exoplayer2.upstream.ParsingLoadable$Parser r0 = r0.createPlaylistParser(r1, r2)
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = new com.google.android.exoplayer2.upstream.ParsingLoadable
                com.google.android.exoplayer2.upstream.DataSource r2 = r8.mediaPlaylistDataSource
                r3 = 4
                r1.<init>(r2, r9, r3, r0)
                com.google.android.exoplayer2.upstream.Loader r9 = r8.mediaPlaylistLoader
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0 = r8.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r0 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$900(r0)
                int r2 = r1.type
                int r0 = r0.getMinimumLoadableRetryCount(r2)
                long r6 = r9.startLoading(r1, r8, r0)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r9 = r8.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r9 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$800(r9)
                com.google.android.exoplayer2.source.LoadEventInfo r0 = new com.google.android.exoplayer2.source.LoadEventInfo
                long r3 = r1.loadTaskId
                com.google.android.exoplayer2.upstream.DataSpec r5 = r1.dataSpec
                r2 = r0
                r2.<init>(r3, r5, r6)
                int r1 = r1.type
                r9.loadStarted(r0, r1)
                return
        }

        private void loadPlaylistInternal(android.net.Uri r7) {
                r6 = this;
                r0 = 0
                r6.excludeUntilMs = r0
                boolean r0 = r6.loadPending
                if (r0 != 0) goto L3b
                com.google.android.exoplayer2.upstream.Loader r0 = r6.mediaPlaylistLoader
                boolean r0 = r0.isLoading()
                if (r0 != 0) goto L3b
                com.google.android.exoplayer2.upstream.Loader r0 = r6.mediaPlaylistLoader
                boolean r0 = r0.hasFatalError()
                if (r0 == 0) goto L19
                goto L3b
            L19:
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r2 = r6.earliestNextLoadTimeMs
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L38
                r2 = 1
                r6.loadPending = r2
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2 = r6.this$0
                android.os.Handler r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1100(r2)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle$$ExternalSyntheticLambda0
                r3.<init>(r6, r7)
                long r4 = r6.earliestNextLoadTimeMs
                long r4 = r4 - r0
                r2.postDelayed(r3, r4)
                goto L3b
            L38:
                r6.loadPlaylistImmediately(r7)
            L3b:
                return
        }

        private void processLoadedPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r14, com.google.android.exoplayer2.source.LoadEventInfo r15) {
                r13 = this;
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r13.playlistSnapshot
                long r1 = android.os.SystemClock.elapsedRealtime()
                r13.lastSnapshotLoadMs = r1
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r3 = r13.this$0
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1400(r3, r0, r14)
                r13.playlistSnapshot = r3
                r4 = 0
                r5 = 0
                r6 = 1
                if (r3 == r0) goto L21
                r13.playlistError = r5
                r13.lastSnapshotChangeMs = r1
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r14 = r13.this$0
                android.net.Uri r15 = r13.playlistUrl
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1500(r14, r15, r3)
                goto L76
            L21:
                boolean r3 = r3.hasEndTag
                if (r3 != 0) goto L76
                long r7 = r14.mediaSequence
                java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r14 = r14.segments
                int r14 = r14.size()
                long r9 = (long) r14
                long r7 = r7 + r9
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r14 = r13.playlistSnapshot
                long r9 = r14.mediaSequence
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 >= 0) goto L40
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException r5 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException
                android.net.Uri r14 = r13.playlistUrl
                r5.<init>(r14)
                r14 = 1
                goto L60
            L40:
                long r7 = r13.lastSnapshotChangeMs
                long r7 = r1 - r7
                double r7 = (double) r7
                long r9 = r14.targetDurationUs
                long r9 = com.google.android.exoplayer2.util.Util.usToMs(r9)
                double r9 = (double) r9
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r14 = r13.this$0
                double r11 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1600(r14)
                double r11 = r11 * r9
                int r14 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r14 <= 0) goto L5f
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException r5 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
                android.net.Uri r14 = r13.playlistUrl
                r5.<init>(r14)
            L5f:
                r14 = 0
            L60:
                if (r5 == 0) goto L76
                r13.playlistError = r5
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r3 = r13.this$0
                android.net.Uri r7 = r13.playlistUrl
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r8 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
                com.google.android.exoplayer2.source.MediaLoadData r9 = new com.google.android.exoplayer2.source.MediaLoadData
                r10 = 4
                r9.<init>(r10)
                r8.<init>(r15, r9, r5, r6)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1000(r3, r7, r8, r14)
            L76:
                r14 = 0
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3 = r13.playlistSnapshot
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r5 = r3.serverControl
                boolean r5 = r5.canBlockReload
                if (r5 != 0) goto L8a
                if (r3 == r0) goto L85
                long r14 = r3.targetDurationUs
                goto L8a
            L85:
                long r14 = r3.targetDurationUs
                r7 = 2
                long r14 = r14 / r7
            L8a:
                long r14 = com.google.android.exoplayer2.util.Util.usToMs(r14)
                long r14 = r14 + r1
                r13.earliestNextLoadTimeMs = r14
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r14 = r13.playlistSnapshot
                long r14 = r14.partTargetDurationUs
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r2 != 0) goto Lac
                android.net.Uri r14 = r13.playlistUrl
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r15 = r13.this$0
                android.net.Uri r15 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1700(r15)
                boolean r14 = r14.equals(r15)
                if (r14 == 0) goto Lad
            Lac:
                r4 = 1
            Lad:
                if (r4 == 0) goto Lbc
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r14 = r13.playlistSnapshot
                boolean r14 = r14.hasEndTag
                if (r14 != 0) goto Lbc
                android.net.Uri r14 = r13.getMediaPlaylistUriForReload()
                r13.loadPlaylistInternal(r14)
            Lbc:
                return
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist getPlaylistSnapshot() {
                r1 = this;
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r1.playlistSnapshot
                return r0
        }

        public boolean isSnapshotValid() {
                r10 = this;
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r10.playlistSnapshot
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                long r2 = android.os.SystemClock.elapsedRealtime()
                r4 = 30000(0x7530, double:1.4822E-319)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r10.playlistSnapshot
                long r6 = r0.durationUs
                long r6 = com.google.android.exoplayer2.util.Util.usToMs(r6)
                long r4 = java.lang.Math.max(r4, r6)
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r10.playlistSnapshot
                boolean r6 = r0.hasEndTag
                r7 = 1
                if (r6 != 0) goto L2d
                int r0 = r0.playlistType
                r6 = 2
                if (r0 == r6) goto L2d
                if (r0 == r7) goto L2d
                long r8 = r10.lastSnapshotLoadMs
                long r8 = r8 + r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 <= 0) goto L2e
            L2d:
                r1 = 1
            L2e:
                return r1
        }

        public void loadPlaylist() {
                r1 = this;
                android.net.Uri r0 = r1.playlistUrl
                r1.loadPlaylistInternal(r0)
                return
        }

        public void maybeThrowPlaylistRefreshError() throws java.io.IOException {
                r1 = this;
                com.google.android.exoplayer2.upstream.Loader r0 = r1.mediaPlaylistLoader
                r0.maybeThrowError()
                java.io.IOException r0 = r1.playlistError
                if (r0 != 0) goto La
                return
            La:
                throw r0
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                r0.onLoadCanceled(r1, r2, r4, r6)
                return
        }

        public void onLoadCanceled(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r16, long r17, long r19, boolean r21) {
                r15 = this;
                r0 = r15
                r1 = r16
                com.google.android.exoplayer2.source.LoadEventInfo r14 = new com.google.android.exoplayer2.source.LoadEventInfo
                long r3 = r1.loadTaskId
                com.google.android.exoplayer2.upstream.DataSpec r5 = r1.dataSpec
                android.net.Uri r6 = r16.getUri()
                java.util.Map r7 = r16.getResponseHeaders()
                long r12 = r16.bytesLoaded()
                r2 = r14
                r8 = r17
                r10 = r19
                r2.<init>(r3, r5, r6, r7, r8, r10, r12)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2 = r0.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$900(r2)
                long r3 = r1.loadTaskId
                r2.onLoadTaskConcluded(r3)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r1 = r0.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$800(r1)
                r2 = 4
                r1.loadCanceled(r14, r2)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                r0.onLoadCompleted(r1, r2, r4)
                return
        }

        public void onLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r17, long r18, long r20) {
                r16 = this;
                r0 = r16
                r1 = r17
                java.lang.Object r2 = r17.getResult()
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist) r2
                com.google.android.exoplayer2.source.LoadEventInfo r15 = new com.google.android.exoplayer2.source.LoadEventInfo
                long r4 = r1.loadTaskId
                com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
                android.net.Uri r7 = r17.getUri()
                java.util.Map r8 = r17.getResponseHeaders()
                long r13 = r17.bytesLoaded()
                r3 = r15
                r9 = r18
                r11 = r20
                r3.<init>(r4, r6, r7, r8, r9, r11, r13)
                boolean r3 = r2 instanceof com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
                r4 = 4
                if (r3 == 0) goto L38
                com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist) r2
                r0.processLoadedPlaylist(r2, r15)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2 = r0.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$800(r2)
                r2.loadCompleted(r15, r4)
                goto L4d
            L38:
                r2 = 0
                java.lang.String r3 = "Loaded playlist has unexpected type."
                com.google.android.exoplayer2.ParserException r2 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r3, r2)
                r0.playlistError = r2
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2 = r0.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$800(r2)
                java.io.IOException r3 = r0.playlistError
                r5 = 1
                r2.loadError(r15, r4, r3, r5)
            L4d:
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2 = r0.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$900(r2)
                long r3 = r1.loadTaskId
                r2.onLoadTaskConcluded(r3)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
                r0 = this;
                com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = r0.onLoadError(r1, r2, r4, r6, r7)
                return r1
        }

        public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r17, long r18, long r20, java.io.IOException r22, int r23) {
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r22
                com.google.android.exoplayer2.source.LoadEventInfo r15 = new com.google.android.exoplayer2.source.LoadEventInfo
                long r4 = r1.loadTaskId
                com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
                android.net.Uri r7 = r17.getUri()
                java.util.Map r8 = r17.getResponseHeaders()
                long r13 = r17.bytesLoaded()
                r3 = r15
                r9 = r18
                r11 = r20
                r3.<init>(r4, r6, r7, r8, r9, r11, r13)
                android.net.Uri r3 = r17.getUri()
                java.lang.String r4 = "_HLS_msn"
                java.lang.String r3 = r3.getQueryParameter(r4)
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L30
                r3 = 1
                goto L31
            L30:
                r3 = 0
            L31:
                boolean r6 = r2 instanceof com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.DeltaUpdateException
                if (r3 != 0) goto L37
                if (r6 == 0) goto L4e
            L37:
                r3 = 2147483647(0x7fffffff, float:NaN)
                boolean r7 = r2 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
                if (r7 == 0) goto L43
                r3 = r2
                com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r3 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r3
                int r3 = r3.responseCode
            L43:
                if (r6 != 0) goto La1
                r6 = 400(0x190, float:5.6E-43)
                if (r3 == r6) goto La1
                r6 = 503(0x1f7, float:7.05E-43)
                if (r3 != r6) goto L4e
                goto La1
            L4e:
                com.google.android.exoplayer2.source.MediaLoadData r3 = new com.google.android.exoplayer2.source.MediaLoadData
                int r6 = r1.type
                r3.<init>(r6)
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r6 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
                r7 = r23
                r6.<init>(r15, r3, r2, r7)
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r3 = r0.this$0
                android.net.Uri r7 = r0.playlistUrl
                boolean r3 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$1000(r3, r7, r6, r5)
                if (r3 == 0) goto L81
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r3 = r0.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$900(r3)
                long r6 = r3.getRetryDelayMsFor(r6)
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r3 == 0) goto L7e
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r3 = com.google.android.exoplayer2.upstream.Loader.createRetryAction(r5, r6)
                goto L83
            L7e:
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r3 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL
                goto L83
            L81:
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r3 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
            L83:
                boolean r5 = r3.isRetry()
                r4 = r4 ^ r5
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r5 = r0.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r5 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$800(r5)
                int r6 = r1.type
                r5.loadError(r15, r6, r2, r4)
                if (r4 == 0) goto La0
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2 = r0.this$0
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$900(r2)
                long r4 = r1.loadTaskId
                r2.onLoadTaskConcluded(r4)
            La0:
                return r3
            La1:
                long r5 = android.os.SystemClock.elapsedRealtime()
                r0.earliestNextLoadTimeMs = r5
                r16.loadPlaylist()
                com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r3 = r0.this$0
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.access$800(r3)
                java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r3 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher) r3
                int r1 = r1.type
                r3.loadError(r15, r1, r2, r4)
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
                return r1
        }

        public void release() {
                r1 = this;
                com.google.android.exoplayer2.upstream.Loader r0 = r1.mediaPlaylistLoader
                r0.release()
                return
        }
    }

    static {
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.FACTORY = r0
            return
    }

    public DefaultHlsPlaylistTracker(com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r7, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r8, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r9) {
            r6 = this;
            r4 = 4615063718147915776(0x400c000000000000, double:3.5)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public DefaultHlsPlaylistTracker(com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r1, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r3, double r4) {
            r0 = this;
            r0.<init>()
            r0.dataSourceFactory = r1
            r0.playlistParserFactory = r3
            r0.loadErrorHandlingPolicy = r2
            r0.playlistStuckTargetDurationCoefficient = r4
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.listeners = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.playlistBundles = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.initialStartTimeUs = r1
            return
    }

    public static /* synthetic */ boolean access$1000(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0, android.net.Uri r1, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r2, boolean r3) {
            boolean r0 = r0.notifyPlaylistError(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ android.os.Handler access$1100(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            android.os.Handler r0 = r0.playlistRefreshHandler
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist access$1200(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = r0.multivariantPlaylist
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory access$1300(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r0 = r0.playlistParserFactory
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist access$1400(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2) {
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r0.getLatestPlaylistSnapshot(r1, r2)
            return r0
    }

    public static /* synthetic */ void access$1500(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0, android.net.Uri r1, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2) {
            r0.onPlaylistUpdated(r1, r2)
            return
    }

    public static /* synthetic */ double access$1600(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r2) {
            double r0 = r2.playlistStuckTargetDurationCoefficient
            return r0
    }

    public static /* synthetic */ android.net.Uri access$1700(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            android.net.Uri r0 = r0.primaryMediaPlaylistUrl
            return r0
    }

    public static /* synthetic */ boolean access$1800(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            boolean r0 = r0.maybeSelectNewPrimaryUrl()
            return r0
    }

    public static /* synthetic */ java.util.concurrent.CopyOnWriteArrayList access$1900(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener> r0 = r0.listeners
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist access$2000(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r0.primaryMediaPlaylistSnapshot
            return r0
    }

    public static /* synthetic */ java.util.HashMap access$2100(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r0.playlistBundles
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.HlsDataSourceFactory access$700(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r0 = r0.dataSourceFactory
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher access$800(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r0.eventDispatcher
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy access$900(com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker r0) {
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r0 = r0.loadErrorHandlingPolicy
            return r0
    }

    private void createBundles(java.util.List<android.net.Uri> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            java.lang.Object r2 = r6.get(r1)
            android.net.Uri r2 = (android.net.Uri) r2
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r3 = new com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle
            r3.<init>(r5, r2)
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r4 = r5.playlistBundles
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1a:
            return
    }

    private static com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r4, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r5) {
            long r0 = r5.mediaSequence
            long r2 = r4.mediaSequence
            long r0 = r0 - r2
            int r5 = (int) r0
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r4 = r4.segments
            int r0 = r4.size()
            if (r5 >= r0) goto L15
            java.lang.Object r4 = r4.get(r5)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r4 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r4
            goto L16
        L15:
            r4 = 0
        L16:
            return r4
    }

    private com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist getLatestPlaylistSnapshot(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r4) {
            r2 = this;
            boolean r0 = r4.isNewerThan(r3)
            if (r0 != 0) goto Lf
            boolean r4 = r4.hasEndTag
            if (r4 == 0) goto Le
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3 = r3.copyWithEndTag()
        Le:
            return r3
        Lf:
            long r0 = r2.getLoadedPlaylistStartTimeUs(r3, r4)
            int r3 = r2.getLoadedPlaylistDiscontinuitySequence(r3, r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3 = r4.copyWith(r0, r3)
            return r3
    }

    private int getLoadedPlaylistDiscontinuitySequence(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r4, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r5) {
            r3 = this;
            boolean r0 = r5.hasDiscontinuitySequence
            if (r0 == 0) goto L7
            int r4 = r5.discontinuitySequence
            return r4
        L7:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r3.primaryMediaPlaylistSnapshot
            r1 = 0
            if (r0 == 0) goto Lf
            int r0 = r0.discontinuitySequence
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r4 != 0) goto L13
            return r0
        L13:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r2 = getFirstOldOverlappingSegment(r4, r5)
            if (r2 == 0) goto L2a
            int r4 = r4.discontinuitySequence
            int r0 = r2.relativeDiscontinuitySequence
            int r4 = r4 + r0
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r5 = r5.segments
            java.lang.Object r5 = r5.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r5 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r5
            int r5 = r5.relativeDiscontinuitySequence
            int r4 = r4 - r5
            return r4
        L2a:
            return r0
    }

    private long getLoadedPlaylistStartTimeUs(@androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r9, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r10) {
            r8 = this;
            boolean r0 = r10.hasProgramDateTime
            if (r0 == 0) goto L7
            long r9 = r10.startTimeUs
            return r9
        L7:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r8.primaryMediaPlaylistSnapshot
            if (r0 == 0) goto Le
            long r0 = r0.startTimeUs
            goto L10
        Le:
            r0 = 0
        L10:
            if (r9 != 0) goto L13
            return r0
        L13:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r2 = r9.segments
            int r2 = r2.size()
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r3 = getFirstOldOverlappingSegment(r9, r10)
            if (r3 == 0) goto L25
            long r9 = r9.startTimeUs
            long r0 = r3.relativeStartTimeUs
            long r9 = r9 + r0
            return r9
        L25:
            long r2 = (long) r2
            long r4 = r10.mediaSequence
            long r6 = r9.mediaSequence
            long r4 = r4 - r6
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L34
            long r9 = r9.getEndTimeUs()
            return r9
        L34:
            return r0
    }

    private android.net.Uri getRequestUriForPrimaryChange(android.net.Uri r4) {
            r3 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r3.primaryMediaPlaylistSnapshot
            if (r0 == 0) goto L35
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r1 = r0.serverControl
            boolean r1 = r1.canBlockReload
            if (r1 == 0) goto L35
            java.util.Map<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport> r0 = r0.renditionReports
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.RenditionReport) r0
            if (r0 == 0) goto L35
            android.net.Uri$Builder r4 = r4.buildUpon()
            long r1 = r0.lastMediaSequence
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "_HLS_msn"
            r4.appendQueryParameter(r2, r1)
            int r0 = r0.lastPartIndex
            r1 = -1
            if (r0 == r1) goto L31
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "_HLS_part"
            r4.appendQueryParameter(r1, r0)
        L31:
            android.net.Uri r4 = r4.build()
        L35:
            return r4
    }

    private boolean isVariantUrl(android.net.Uri r5) {
            r4 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = r4.multivariantPlaylist
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r0 = r0.variants
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L1f
            java.lang.Object r3 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r3 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r3
            android.net.Uri r3 = r3.url
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            int r2 = r2 + 1
            goto L6
        L1f:
            return r1
    }

    private boolean maybeSelectNewPrimaryUrl() {
            r10 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = r10.multivariantPlaylist
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r0 = r0.variants
            int r1 = r0.size()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            r5 = 0
        Le:
            if (r5 >= r1) goto L40
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r6 = r10.playlistBundles
            java.lang.Object r7 = r0.get(r5)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r7 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r7
            android.net.Uri r7 = r7.url
            java.lang.Object r6 = r6.get(r7)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r6 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r6
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r6 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r6
            long r7 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$300(r6)
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 <= 0) goto L3d
            android.net.Uri r0 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$400(r6)
            r10.primaryMediaPlaylistUrl = r0
            android.net.Uri r0 = r10.getRequestUriForPrimaryChange(r0)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$500(r6, r0)
            r0 = 1
            return r0
        L3d:
            int r5 = r5 + 1
            goto Le
        L40:
            return r4
    }

    private void maybeSetPrimaryUrl(android.net.Uri r4) {
            r3 = this;
            android.net.Uri r0 = r3.primaryMediaPlaylistUrl
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L3a
            boolean r0 = r3.isVariantUrl(r4)
            if (r0 == 0) goto L3a
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r3.primaryMediaPlaylistSnapshot
            if (r0 == 0) goto L17
            boolean r0 = r0.hasEndTag
            if (r0 == 0) goto L17
            goto L3a
        L17:
            r3.primaryMediaPlaylistUrl = r4
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r3.playlistBundles
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r0 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r0
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$600(r0)
            if (r1 == 0) goto L33
            boolean r2 = r1.hasEndTag
            if (r2 == 0) goto L33
            r3.primaryMediaPlaylistSnapshot = r1
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PrimaryPlaylistListener r4 = r3.primaryPlaylistListener
            r4.onPrimaryPlaylistRefreshed(r1)
            goto L3a
        L33:
            android.net.Uri r4 = r3.getRequestUriForPrimaryChange(r4)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$500(r0, r4)
        L3a:
            return
    }

    private boolean notifyPlaylistError(android.net.Uri r4, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r5, boolean r6) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener> r0 = r3.listeners
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener) r2
            boolean r2 = r2.onPlaylistError(r4, r5, r6)
            r2 = r2 ^ 1
            r1 = r1 | r2
            goto L7
        L1b:
            return r1
    }

    private void onPlaylistUpdated(android.net.Uri r3, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r4) {
            r2 = this;
            android.net.Uri r0 = r2.primaryMediaPlaylistUrl
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1d
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r3 = r2.primaryMediaPlaylistSnapshot
            if (r3 != 0) goto L16
            boolean r3 = r4.hasEndTag
            r3 = r3 ^ 1
            r2.isLive = r3
            long r0 = r4.startTimeUs
            r2.initialStartTimeUs = r0
        L16:
            r2.primaryMediaPlaylistSnapshot = r4
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PrimaryPlaylistListener r3 = r2.primaryPlaylistListener
            r3.onPrimaryPlaylistRefreshed(r4)
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener> r3 = r2.listeners
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r3.next()
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener r4 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener) r4
            r4.onPlaylistChanged()
            goto L23
        L33:
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void addListener(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean excludeMediaPlaylist(android.net.Uri r2, long r3) {
            r1 = this;
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r1.playlistBundles
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r2 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r2
            if (r2 == 0) goto L11
            boolean r2 = com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$000(r2, r3)
            r2 = r2 ^ 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
            r2 = this;
            long r0 = r2.initialStartTimeUs
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist getMultivariantPlaylist() {
            r1 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = r1.multivariantPlaylist
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist getPlaylistSnapshot(android.net.Uri r2, boolean r3) {
            r1 = this;
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r1.playlistBundles
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r0 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r0
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r0 = r0.getPlaylistSnapshot()
            if (r0 == 0) goto L13
            if (r3 == 0) goto L13
            r1.maybeSetPrimaryUrl(r2)
        L13:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
            r1 = this;
            boolean r0 = r1.isLive
            return r0
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(android.net.Uri r2) {
            r1 = this;
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r1.playlistBundles
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r2 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r2
            boolean r2 = r2.isSnapshotValid()
            return r2
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(android.net.Uri r2) throws java.io.IOException {
            r1 = this;
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r1.playlistBundles
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r2 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r2
            r2.maybeThrowPlaylistRefreshError()
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r1.initialPlaylistLoader
            if (r0 == 0) goto L7
            r0.maybeThrowError()
        L7:
            android.net.Uri r0 = r1.primaryMediaPlaylistUrl
            if (r0 == 0) goto Le
            r1.maybeThrowPlaylistRefreshError(r0)
        Le:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
            r0 = this;
            com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
            r0.onLoadCanceled(r1, r2, r4, r6)
            return
    }

    public void onLoadCanceled(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r16, long r17, long r19, boolean r21) {
            r15 = this;
            r0 = r15
            r1 = r16
            com.google.android.exoplayer2.source.LoadEventInfo r14 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r3 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r5 = r1.dataSpec
            android.net.Uri r6 = r16.getUri()
            java.util.Map r7 = r16.getResponseHeaders()
            long r12 = r16.bytesLoaded()
            r2 = r14
            r8 = r17
            r10 = r19
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r3 = r1.loadTaskId
            r2.onLoadTaskConcluded(r3)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.eventDispatcher
            r2 = 4
            r1.loadCanceled(r14, r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
            r0 = this;
            com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
            r0.onLoadCompleted(r1, r2, r4)
            return
    }

    public void onLoadCompleted(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r18, long r19, long r21) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object r2 = r18.getResult()
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist) r2
            boolean r3 = r2 instanceof com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
            if (r3 == 0) goto L15
            java.lang.String r4 = r2.baseUri
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r4 = com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.createSingleVariantMultivariantPlaylist(r4)
            goto L18
        L15:
            r4 = r2
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r4 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist) r4
        L18:
            r0.multivariantPlaylist = r4
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r5 = r4.variants
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r5 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r5
            android.net.Uri r5 = r5.url
            r0.primaryMediaPlaylistUrl = r5
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener> r5 = r0.listeners
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$FirstPrimaryMediaPlaylistListener r6 = new com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$FirstPrimaryMediaPlaylistListener
            r7 = 0
            r6.<init>(r0, r7)
            r5.add(r6)
            java.util.List<android.net.Uri> r4 = r4.mediaPlaylistUrls
            r0.createBundles(r4)
            com.google.android.exoplayer2.source.LoadEventInfo r4 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r6 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r8 = r1.dataSpec
            android.net.Uri r9 = r18.getUri()
            java.util.Map r10 = r18.getResponseHeaders()
            long r15 = r18.bytesLoaded()
            r5 = r4
            r11 = r19
            r13 = r21
            r5.<init>(r6, r8, r9, r10, r11, r13, r15)
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r5 = r0.playlistBundles
            android.net.Uri r6 = r0.primaryMediaPlaylistUrl
            java.lang.Object r5 = r5.get(r6)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r5 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r5
            if (r3 == 0) goto L63
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist) r2
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.access$200(r5, r2, r4)
            goto L66
        L63:
            r5.loadPlaylist()
        L66:
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r5 = r1.loadTaskId
            r2.onLoadTaskConcluded(r5)
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r1 = r0.eventDispatcher
            r2 = 4
            r1.loadCompleted(r4, r2)
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
            r0 = this;
            com.google.android.exoplayer2.upstream.ParsingLoadable r1 = (com.google.android.exoplayer2.upstream.ParsingLoadable) r1
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = r0.onLoadError(r1, r2, r4, r6, r7)
            return r1
    }

    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r17, long r18, long r20, java.io.IOException r22, int r23) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r22
            com.google.android.exoplayer2.source.LoadEventInfo r15 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r4 = r1.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r6 = r1.dataSpec
            android.net.Uri r7 = r17.getUri()
            java.util.Map r8 = r17.getResponseHeaders()
            long r13 = r17.bytesLoaded()
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.exoplayer2.source.MediaLoadData r3 = new com.google.android.exoplayer2.source.MediaLoadData
            int r4 = r1.type
            r3.<init>(r4)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r4 = r0.loadErrorHandlingPolicy
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo r5 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo
            r6 = r23
            r5.<init>(r15, r3, r2, r6)
            long r3 = r4.getRetryDelayMsFor(r5)
            r5 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L40
            r6 = 1
            goto L41
        L40:
            r6 = 0
        L41:
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r7 = r0.eventDispatcher
            int r8 = r1.type
            r7.loadError(r15, r8, r2, r6)
            if (r6 == 0) goto L51
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2 = r0.loadErrorHandlingPolicy
            long r7 = r1.loadTaskId
            r2.onLoadTaskConcluded(r7)
        L51:
            if (r6 == 0) goto L56
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL
            goto L5a
        L56:
            com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.createRetryAction(r5, r3)
        L5a:
            return r1
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(android.net.Uri r2) {
            r1 = this;
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r1.playlistBundles
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r2 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r2
            r2.loadPlaylist()
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void removeListener(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistEventListener> r0 = r1.listeners
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void start(android.net.Uri r8, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r9, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener r10) {
            r7 = this;
            android.os.Handler r0 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
            r7.playlistRefreshHandler = r0
            r7.eventDispatcher = r9
            r7.primaryPlaylistListener = r10
            com.google.android.exoplayer2.upstream.ParsingLoadable r10 = new com.google.android.exoplayer2.upstream.ParsingLoadable
            com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r0 = r7.dataSourceFactory
            r1 = 4
            com.google.android.exoplayer2.upstream.DataSource r0 = r0.createDataSource(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory r2 = r7.playlistParserFactory
            com.google.android.exoplayer2.upstream.ParsingLoadable$Parser r2 = r2.createPlaylistParser()
            r10.<init>(r0, r8, r1, r2)
            com.google.android.exoplayer2.upstream.Loader r8 = r7.initialPlaylistLoader
            if (r8 != 0) goto L22
            r8 = 1
            goto L23
        L22:
            r8 = 0
        L23:
            com.google.android.exoplayer2.util.Assertions.checkState(r8)
            com.google.android.exoplayer2.upstream.Loader r8 = new com.google.android.exoplayer2.upstream.Loader
            java.lang.String r0 = "DefaultHlsPlaylistTracker:MultivariantPlaylist"
            r8.<init>(r0)
            r7.initialPlaylistLoader = r8
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r0 = r7.loadErrorHandlingPolicy
            int r1 = r10.type
            int r0 = r0.getMinimumLoadableRetryCount(r1)
            long r5 = r8.startLoading(r10, r7, r0)
            com.google.android.exoplayer2.source.LoadEventInfo r8 = new com.google.android.exoplayer2.source.LoadEventInfo
            long r2 = r10.loadTaskId
            com.google.android.exoplayer2.upstream.DataSpec r4 = r10.dataSpec
            r1 = r8
            r1.<init>(r2, r4, r5)
            int r10 = r10.type
            r9.loadStarted(r8, r10)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
            r3 = this;
            r0 = 0
            r3.primaryMediaPlaylistUrl = r0
            r3.primaryMediaPlaylistSnapshot = r0
            r3.multivariantPlaylist = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.initialStartTimeUs = r1
            com.google.android.exoplayer2.upstream.Loader r1 = r3.initialPlaylistLoader
            r1.release()
            r3.initialPlaylistLoader = r0
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r1 = r3.playlistBundles
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle r2 = (com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) r2
            r2.release()
            goto L1f
        L2f:
            android.os.Handler r1 = r3.playlistRefreshHandler
            r1.removeCallbacksAndMessages(r0)
            r3.playlistRefreshHandler = r0
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle> r0 = r3.playlistBundles
            r0.clear()
            return
    }
}
