package com.google.android.exoplayer2.source.hls;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener {
    private final com.google.android.exoplayer2.upstream.Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;
    private com.google.android.exoplayer2.source.SequenceableLoader compositeSequenceableLoader;
    private final com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final com.google.android.exoplayer2.source.hls.HlsDataSourceFactory dataSourceFactory;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] enabledSampleStreamWrappers;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final com.google.android.exoplayer2.source.hls.HlsExtractorFactory extractorFactory;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private int[][] manifestUrlIndicesPerWrapper;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaPeriod.Callback mediaPeriodCallback;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final com.google.android.exoplayer2.analytics.PlayerId playerId;
    private final com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker playlistTracker;
    private final com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback;
    private com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] sampleStreamWrappers;
    private final java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> streamWrapperIndices;
    private final com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider timestampAdjusterProvider;
    private com.google.android.exoplayer2.source.TrackGroupArray trackGroups;
    private final boolean useSessionKeys;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.HlsMediaPeriod$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public class SampleStreamWrapperCallback implements com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback {
        public final /* synthetic */ com.google.android.exoplayer2.source.hls.HlsMediaPeriod this$0;

        private SampleStreamWrapperCallback(com.google.android.exoplayer2.source.hls.HlsMediaPeriod r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ SampleStreamWrapperCallback(com.google.android.exoplayer2.source.hls.HlsMediaPeriod r1, com.google.android.exoplayer2.source.hls.HlsMediaPeriod.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
                r0 = this;
                com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r1 = (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper) r1
                r0.onContinueLoadingRequested(r1)
                return
        }

        public void onContinueLoadingRequested(com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r2) {
                r1 = this;
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r2 = r1.this$0
                com.google.android.exoplayer2.source.MediaPeriod$Callback r2 = com.google.android.exoplayer2.source.hls.HlsMediaPeriod.access$400(r2)
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0 = r1.this$0
                r2.onContinueLoadingRequested(r0)
                return
        }

        @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(android.net.Uri r2) {
                r1 = this;
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0 = r1.this$0
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = com.google.android.exoplayer2.source.hls.HlsMediaPeriod.access$500(r0)
                r0.refreshPlaylist(r2)
                return
        }

        @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
                r11 = this;
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0 = r11.this$0
                int r0 = com.google.android.exoplayer2.source.hls.HlsMediaPeriod.access$106(r0)
                if (r0 <= 0) goto L9
                return
            L9:
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0 = r11.this$0
                com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = com.google.android.exoplayer2.source.hls.HlsMediaPeriod.access$200(r0)
                int r1 = r0.length
                r2 = 0
                r3 = 0
                r4 = 0
            L13:
                if (r3 >= r1) goto L21
                r5 = r0[r3]
                com.google.android.exoplayer2.source.TrackGroupArray r5 = r5.getTrackGroups()
                int r5 = r5.length
                int r4 = r4 + r5
                int r3 = r3 + 1
                goto L13
            L21:
                com.google.android.exoplayer2.source.TrackGroup[] r0 = new com.google.android.exoplayer2.source.TrackGroup[r4]
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r1 = r11.this$0
                com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r1 = com.google.android.exoplayer2.source.hls.HlsMediaPeriod.access$200(r1)
                int r3 = r1.length
                r4 = 0
                r5 = 0
            L2c:
                if (r4 >= r3) goto L4c
                r6 = r1[r4]
                com.google.android.exoplayer2.source.TrackGroupArray r7 = r6.getTrackGroups()
                int r7 = r7.length
                r8 = 0
            L37:
                if (r8 >= r7) goto L49
                int r9 = r5 + 1
                com.google.android.exoplayer2.source.TrackGroupArray r10 = r6.getTrackGroups()
                com.google.android.exoplayer2.source.TrackGroup r10 = r10.get(r8)
                r0[r5] = r10
                int r8 = r8 + 1
                r5 = r9
                goto L37
            L49:
                int r4 = r4 + 1
                goto L2c
            L4c:
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r1 = r11.this$0
                com.google.android.exoplayer2.source.TrackGroupArray r2 = new com.google.android.exoplayer2.source.TrackGroupArray
                r2.<init>(r0)
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod.access$302(r1, r2)
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0 = r11.this$0
                com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = com.google.android.exoplayer2.source.hls.HlsMediaPeriod.access$400(r0)
                com.google.android.exoplayer2.source.hls.HlsMediaPeriod r1 = r11.this$0
                r0.onPrepared(r1)
                return
        }
    }

    public HlsMediaPeriod(com.google.android.exoplayer2.source.hls.HlsExtractorFactory r1, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2, com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r4, com.google.android.exoplayer2.drm.DrmSessionManager r5, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r6, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r7, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r8, com.google.android.exoplayer2.upstream.Allocator r9, com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r10, boolean r11, int r12, boolean r13, com.google.android.exoplayer2.analytics.PlayerId r14) {
            r0 = this;
            r0.<init>()
            r0.extractorFactory = r1
            r0.playlistTracker = r2
            r0.dataSourceFactory = r3
            r0.mediaTransferListener = r4
            r0.drmSessionManager = r5
            r0.drmEventDispatcher = r6
            r0.loadErrorHandlingPolicy = r7
            r0.eventDispatcher = r8
            r0.allocator = r9
            r0.compositeSequenceableLoaderFactory = r10
            r0.allowChunklessPreparation = r11
            r0.metadataType = r12
            r0.useSessionKeys = r13
            r0.playerId = r14
            com.google.android.exoplayer2.source.hls.HlsMediaPeriod$SampleStreamWrapperCallback r1 = new com.google.android.exoplayer2.source.hls.HlsMediaPeriod$SampleStreamWrapperCallback
            r2 = 0
            r1.<init>(r0, r2)
            r0.sampleStreamWrapperCallback = r1
            r1 = 0
            com.google.android.exoplayer2.source.SequenceableLoader[] r2 = new com.google.android.exoplayer2.source.SequenceableLoader[r1]
            com.google.android.exoplayer2.source.SequenceableLoader r2 = r10.createCompositeSequenceableLoader(r2)
            r0.compositeSequenceableLoader = r2
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            r0.streamWrapperIndices = r2
            com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider r2 = new com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider
            r2.<init>()
            r0.timestampAdjusterProvider = r2
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r2 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[r1]
            r0.sampleStreamWrappers = r2
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r2 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[r1]
            r0.enabledSampleStreamWrappers = r2
            int[][] r1 = new int[r1][]
            r0.manifestUrlIndicesPerWrapper = r1
            return
    }

    public static /* synthetic */ int access$106(com.google.android.exoplayer2.source.hls.HlsMediaPeriod r1) {
            int r0 = r1.pendingPrepareCount
            int r0 = r0 + (-1)
            r1.pendingPrepareCount = r0
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] access$200(com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0) {
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r0.sampleStreamWrappers
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.TrackGroupArray access$302(com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0, com.google.android.exoplayer2.source.TrackGroupArray r1) {
            r0.trackGroups = r1
            return r1
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaPeriod.Callback access$400(com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0) {
            com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = r0.mediaPeriodCallback
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker access$500(com.google.android.exoplayer2.source.hls.HlsMediaPeriod r0) {
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r0.playlistTracker
            return r0
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long r22, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition> r24, java.util.List<com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper> r25, java.util.List<int[]> r26, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r27) {
            r21 = this;
            r0 = r24
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r24.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r24.size()
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r24.size()
            r3.<init>(r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = 0
            r6 = 0
        L24:
            int r7 = r24.size()
            if (r6 >= r7) goto Le8
            java.lang.Object r7 = r0.get(r6)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r7 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition) r7
            java.lang.String r7 = r7.name
            boolean r8 = r4.add(r7)
            if (r8 != 0) goto L40
            r13 = r21
            r11 = r25
            r12 = r26
            goto Le4
        L40:
            r1.clear()
            r2.clear()
            r3.clear()
            r8 = 1
            r9 = 0
            r10 = 1
        L4c:
            int r11 = r24.size()
            if (r9 >= r11) goto L88
            java.lang.Object r11 = r0.get(r9)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r11 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition) r11
            java.lang.String r11 = r11.name
            boolean r11 = com.google.android.exoplayer2.util.Util.areEqual(r7, r11)
            if (r11 == 0) goto L85
            java.lang.Object r11 = r0.get(r9)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r11 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition) r11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r3.add(r12)
            android.net.Uri r12 = r11.url
            r1.add(r12)
            com.google.android.exoplayer2.Format r12 = r11.format
            r2.add(r12)
            com.google.android.exoplayer2.Format r11 = r11.format
            java.lang.String r11 = r11.codecs
            int r11 = com.google.android.exoplayer2.util.Util.getCodecCountOfType(r11, r8)
            if (r11 != r8) goto L83
            r11 = 1
            goto L84
        L83:
            r11 = 0
        L84:
            r10 = r10 & r11
        L85:
            int r9 = r9 + 1
            goto L4c
        L88:
            java.lang.String r9 = "audio:"
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r7)
            r13 = 1
            android.net.Uri[] r9 = new android.net.Uri[r5]
            java.lang.Object[] r9 = com.google.android.exoplayer2.util.Util.castNonNullTypeArray(r9)
            android.net.Uri[] r9 = (android.net.Uri[]) r9
            java.lang.Object[] r9 = r1.toArray(r9)
            r14 = r9
            android.net.Uri[] r14 = (android.net.Uri[]) r14
            com.google.android.exoplayer2.Format[] r9 = new com.google.android.exoplayer2.Format[r5]
            java.lang.Object[] r9 = r2.toArray(r9)
            r15 = r9
            com.google.android.exoplayer2.Format[] r15 = (com.google.android.exoplayer2.Format[]) r15
            r16 = 0
            java.util.List r17 = java.util.Collections.emptyList()
            r11 = r21
            r12 = r7
            r18 = r27
            r19 = r22
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r9 = r11.buildSampleStreamWrapper(r12, r13, r14, r15, r16, r17, r18, r19)
            int[] r11 = com.google.common.primitives.Ints.toArray(r3)
            r12 = r26
            r12.add(r11)
            r11 = r25
            r11.add(r9)
            r13 = r21
            boolean r14 = r13.allowChunklessPreparation
            if (r14 == 0) goto Le4
            if (r10 == 0) goto Le4
            com.google.android.exoplayer2.Format[] r10 = new com.google.android.exoplayer2.Format[r5]
            java.lang.Object[] r10 = r2.toArray(r10)
            com.google.android.exoplayer2.Format[] r10 = (com.google.android.exoplayer2.Format[]) r10
            com.google.android.exoplayer2.source.TrackGroup[] r8 = new com.google.android.exoplayer2.source.TrackGroup[r8]
            com.google.android.exoplayer2.source.TrackGroup r14 = new com.google.android.exoplayer2.source.TrackGroup
            r14.<init>(r7, r10)
            r8[r5] = r14
            int[] r7 = new int[r5]
            r9.prepareWithMultivariantPlaylistInfo(r8, r5, r7)
        Le4:
            int r6 = r6 + 1
            goto L24
        Le8:
            r13 = r21
            return
    }

    private void buildAndPrepareMainSampleStreamWrapper(com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r21, long r22, java.util.List<com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper> r24, java.util.List<int[]> r25, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r26) {
            r20 = this;
            r0 = r21
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r1 = r0.variants
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        Le:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r7 = r0.variants
            int r7 = r7.size()
            r8 = 2
            r9 = 1
            if (r4 >= r7) goto L47
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r7 = r0.variants
            java.lang.Object r7 = r7.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r7 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r7
            com.google.android.exoplayer2.Format r7 = r7.format
            int r10 = r7.height
            if (r10 > 0) goto L40
            java.lang.String r10 = r7.codecs
            java.lang.String r10 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r10, r8)
            if (r10 == 0) goto L2f
            goto L40
        L2f:
            java.lang.String r7 = r7.codecs
            java.lang.String r7 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r7, r9)
            if (r7 == 0) goto L3c
            r2[r4] = r9
            int r6 = r6 + 1
            goto L44
        L3c:
            r7 = -1
            r2[r4] = r7
            goto L44
        L40:
            r2[r4] = r8
            int r5 = r5 + 1
        L44:
            int r4 = r4 + 1
            goto Le
        L47:
            if (r5 <= 0) goto L4c
            r1 = r5
            r4 = 1
            goto L53
        L4c:
            if (r6 >= r1) goto L52
            int r1 = r1 - r6
            r4 = 0
            r5 = 1
            goto L54
        L52:
            r4 = 0
        L53:
            r5 = 0
        L54:
            android.net.Uri[] r13 = new android.net.Uri[r1]
            com.google.android.exoplayer2.Format[] r6 = new com.google.android.exoplayer2.Format[r1]
            int[] r7 = new int[r1]
            r10 = 0
            r11 = 0
        L5c:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r12 = r0.variants
            int r12 = r12.size()
            if (r10 >= r12) goto L88
            if (r4 == 0) goto L6a
            r12 = r2[r10]
            if (r12 != r8) goto L85
        L6a:
            if (r5 == 0) goto L70
            r12 = r2[r10]
            if (r12 == r9) goto L85
        L70:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r12 = r0.variants
            java.lang.Object r12 = r12.get(r10)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r12 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r12
            android.net.Uri r14 = r12.url
            r13[r11] = r14
            com.google.android.exoplayer2.Format r12 = r12.format
            r6[r11] = r12
            int r12 = r11 + 1
            r7[r11] = r10
            r11 = r12
        L85:
            int r10 = r10 + 1
            goto L5c
        L88:
            r2 = r6[r3]
            java.lang.String r2 = r2.codecs
            int r5 = com.google.android.exoplayer2.util.Util.getCodecCountOfType(r2, r8)
            int r2 = com.google.android.exoplayer2.util.Util.getCodecCountOfType(r2, r9)
            if (r2 == r9) goto La0
            if (r2 != 0) goto La8
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r8 = r0.audios
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto La8
        La0:
            if (r5 > r9) goto La8
            int r8 = r2 + r5
            if (r8 <= 0) goto La8
            r8 = 1
            goto La9
        La8:
            r8 = 0
        La9:
            if (r4 != 0) goto Laf
            if (r2 <= 0) goto Laf
            r12 = 1
            goto Lb0
        Laf:
            r12 = 0
        Lb0:
            java.lang.String r4 = "main"
            com.google.android.exoplayer2.Format r15 = r0.muxedAudioFormat
            java.util.List<com.google.android.exoplayer2.Format> r14 = r0.muxedCaptionFormats
            r10 = r20
            r11 = r4
            r16 = r14
            r14 = r6
            r17 = r26
            r18 = r22
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r10 = r10.buildSampleStreamWrapper(r11, r12, r13, r14, r15, r16, r17, r18)
            r11 = r24
            r11.add(r10)
            r11 = r25
            r11.add(r7)
            r7 = r20
            boolean r11 = r7.allowChunklessPreparation
            if (r11 == 0) goto L19d
            if (r8 == 0) goto L19d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r5 <= 0) goto L14d
            com.google.android.exoplayer2.Format[] r5 = new com.google.android.exoplayer2.Format[r1]
            r11 = 0
        Le0:
            if (r11 >= r1) goto Led
            r12 = r6[r11]
            com.google.android.exoplayer2.Format r12 = deriveVideoFormat(r12)
            r5[r11] = r12
            int r11 = r11 + 1
            goto Le0
        Led:
            com.google.android.exoplayer2.source.TrackGroup r1 = new com.google.android.exoplayer2.source.TrackGroup
            r1.<init>(r4, r5)
            r8.add(r1)
            if (r2 <= 0) goto L119
            com.google.android.exoplayer2.Format r1 = r0.muxedAudioFormat
            if (r1 != 0) goto L103
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r1 = r0.audios
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L119
        L103:
            com.google.android.exoplayer2.source.TrackGroup r1 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r9]
            r5 = r6[r3]
            com.google.android.exoplayer2.Format r6 = r0.muxedAudioFormat
            com.google.android.exoplayer2.Format r5 = deriveAudioFormat(r5, r6, r3)
            r2[r3] = r5
            java.lang.String r5 = "main:audio"
            r1.<init>(r5, r2)
            r8.add(r1)
        L119:
            java.util.List<com.google.android.exoplayer2.Format> r0 = r0.muxedCaptionFormats
            if (r0 == 0) goto L167
            r1 = 0
        L11e:
            int r2 = r0.size()
            if (r1 >= r2) goto L167
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r5 = ":cc:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.google.android.exoplayer2.source.TrackGroup r5 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r6 = new com.google.android.exoplayer2.Format[r9]
            java.lang.Object r11 = r0.get(r1)
            com.google.android.exoplayer2.Format r11 = (com.google.android.exoplayer2.Format) r11
            r6[r3] = r11
            r5.<init>(r2, r6)
            r8.add(r5)
            int r1 = r1 + 1
            goto L11e
        L14d:
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r1]
            r5 = 0
        L150:
            if (r5 >= r1) goto L15f
            r11 = r6[r5]
            com.google.android.exoplayer2.Format r12 = r0.muxedAudioFormat
            com.google.android.exoplayer2.Format r11 = deriveAudioFormat(r11, r12, r9)
            r2[r5] = r11
            int r5 = r5 + 1
            goto L150
        L15f:
            com.google.android.exoplayer2.source.TrackGroup r0 = new com.google.android.exoplayer2.source.TrackGroup
            r0.<init>(r4, r2)
            r8.add(r0)
        L167:
            com.google.android.exoplayer2.source.TrackGroup r0 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r1 = new com.google.android.exoplayer2.Format[r9]
            com.google.android.exoplayer2.Format$Builder r2 = new com.google.android.exoplayer2.Format$Builder
            r2.<init>()
            java.lang.String r4 = "ID3"
            com.google.android.exoplayer2.Format$Builder r2 = r2.setId(r4)
            java.lang.String r4 = "application/id3"
            com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleMimeType(r4)
            com.google.android.exoplayer2.Format r2 = r2.build()
            r1[r3] = r2
            java.lang.String r2 = "main:id3"
            r0.<init>(r2, r1)
            r8.add(r0)
            com.google.android.exoplayer2.source.TrackGroup[] r1 = new com.google.android.exoplayer2.source.TrackGroup[r3]
            java.lang.Object[] r1 = r8.toArray(r1)
            com.google.android.exoplayer2.source.TrackGroup[] r1 = (com.google.android.exoplayer2.source.TrackGroup[]) r1
            int[] r2 = new int[r9]
            int r0 = r8.indexOf(r0)
            r2[r3] = r0
            r10.prepareWithMultivariantPlaylistInfo(r1, r3, r2)
        L19d:
            return
    }

    private void buildAndPrepareSampleStreamWrappers(long r21) {
            r20 = this;
            r10 = r20
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r10.playlistTracker
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = r0.getMultivariantPlaylist()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r1 = r0
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist) r1
            boolean r0 = r10.useSessionKeys
            if (r0 == 0) goto L1a
            java.util.List<com.google.android.exoplayer2.drm.DrmInitData> r0 = r1.sessionKeyDrmInitData
            java.util.Map r0 = deriveOverridingDrmInitData(r0)
            goto L1e
        L1a:
            java.util.Map r0 = java.util.Collections.emptyMap()
        L1e:
            r11 = r0
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r0 = r1.variants
            boolean r0 = r0.isEmpty()
            r12 = 1
            r0 = r0 ^ r12
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r7 = r1.audios
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r13 = r1.subtitles
            r14 = 0
            r10.pendingPrepareCount = r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r0 == 0) goto L44
            r0 = r20
            r2 = r21
            r4 = r15
            r5 = r8
            r6 = r11
            r0.buildAndPrepareMainSampleStreamWrapper(r1, r2, r4, r5, r6)
        L44:
            r0 = r20
            r1 = r21
            r3 = r7
            r4 = r15
            r5 = r8
            r6 = r11
            r0.buildAndPrepareAudioSampleStreamWrappers(r1, r3, r4, r5, r6)
            int r0 = r15.size()
            r10.audioVideoSampleStreamWrapperCount = r0
            r0 = 0
            r9 = 0
        L57:
            int r0 = r13.size()
            if (r9 >= r0) goto Lc4
            java.lang.Object r0 = r13.get(r9)
            r7 = r0
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r7 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Rendition) r7
            java.lang.String r0 = "subtitle:"
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r0, r9, r1)
            java.lang.String r1 = r7.name
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            r2 = 3
            android.net.Uri[] r3 = new android.net.Uri[r12]
            android.net.Uri r0 = r7.url
            r3[r14] = r0
            com.google.android.exoplayer2.Format[] r4 = new com.google.android.exoplayer2.Format[r12]
            com.google.android.exoplayer2.Format r0 = r7.format
            r4[r14] = r0
            r5 = 0
            java.util.List r16 = java.util.Collections.emptyList()
            r0 = r20
            r1 = r6
            r17 = r6
            r6 = r16
            r18 = r7
            r7 = r11
            r19 = r8
            r16 = r9
            r8 = r21
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r0.buildSampleStreamWrapper(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[r12]
            r1[r14] = r16
            r2 = r19
            r2.add(r1)
            r15.add(r0)
            com.google.android.exoplayer2.source.TrackGroup[] r1 = new com.google.android.exoplayer2.source.TrackGroup[r12]
            com.google.android.exoplayer2.source.TrackGroup r3 = new com.google.android.exoplayer2.source.TrackGroup
            com.google.android.exoplayer2.Format[] r4 = new com.google.android.exoplayer2.Format[r12]
            r5 = r18
            com.google.android.exoplayer2.Format r5 = r5.format
            r4[r14] = r5
            r5 = r17
            r3.<init>(r5, r4)
            r1[r14] = r3
            int[] r3 = new int[r14]
            r0.prepareWithMultivariantPlaylistInfo(r1, r14, r3)
            int r9 = r16 + 1
            r8 = r2
            goto L57
        Lc4:
            r2 = r8
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[r14]
            java.lang.Object[] r0 = r15.toArray(r0)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[]) r0
            r10.sampleStreamWrappers = r0
            int[][] r0 = new int[r14][]
            java.lang.Object[] r0 = r2.toArray(r0)
            int[][] r0 = (int[][]) r0
            r10.manifestUrlIndicesPerWrapper = r0
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r10.sampleStreamWrappers
            int r0 = r0.length
            r10.pendingPrepareCount = r0
            r0 = 0
        Ldf:
            int r1 = r10.audioVideoSampleStreamWrapperCount
            if (r0 >= r1) goto Led
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r1 = r10.sampleStreamWrappers
            r1 = r1[r0]
            r1.setIsTimestampMaster(r12)
            int r0 = r0 + 1
            goto Ldf
        Led:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r10.sampleStreamWrappers
            int r1 = r0.length
        Lf0:
            if (r14 >= r1) goto Lfa
            r2 = r0[r14]
            r2.continuePreparing()
            int r14 = r14 + 1
            goto Lf0
        Lfa:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r10.sampleStreamWrappers
            r10.enabledSampleStreamWrappers = r0
            return
    }

    private com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper buildSampleStreamWrapper(java.lang.String r19, int r20, android.net.Uri[] r21, com.google.android.exoplayer2.Format[] r22, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r23, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.Format> r24, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r25, long r26) {
            r18 = this;
            r0 = r18
            com.google.android.exoplayer2.source.hls.HlsChunkSource r11 = new com.google.android.exoplayer2.source.hls.HlsChunkSource
            com.google.android.exoplayer2.source.hls.HlsExtractorFactory r2 = r0.extractorFactory
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r3 = r0.playlistTracker
            com.google.android.exoplayer2.source.hls.HlsDataSourceFactory r6 = r0.dataSourceFactory
            com.google.android.exoplayer2.upstream.TransferListener r7 = r0.mediaTransferListener
            com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider r8 = r0.timestampAdjusterProvider
            com.google.android.exoplayer2.analytics.PlayerId r10 = r0.playerId
            r1 = r11
            r4 = r21
            r5 = r22
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r16 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$Callback r4 = r0.sampleStreamWrapperCallback
            com.google.android.exoplayer2.upstream.Allocator r7 = r0.allocator
            com.google.android.exoplayer2.drm.DrmSessionManager r12 = r0.drmSessionManager
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r13 = r0.drmEventDispatcher
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r14 = r0.loadErrorHandlingPolicy
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r15 = r0.eventDispatcher
            int r10 = r0.metadataType
            r1 = r16
            r2 = r19
            r3 = r20
            r5 = r11
            r6 = r25
            r8 = r26
            r17 = r10
            r10 = r23
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)
            return r16
    }

    private static com.google.android.exoplayer2.Format deriveAudioFormat(com.google.android.exoplayer2.Format r12, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r13, boolean r14) {
            r0 = 0
            r1 = 0
            r2 = -1
            if (r13 == 0) goto L18
            java.lang.String r0 = r13.codecs
            com.google.android.exoplayer2.metadata.Metadata r1 = r13.metadata
            int r3 = r13.channelCount
            int r4 = r13.selectionFlags
            int r5 = r13.roleFlags
            java.lang.String r6 = r13.language
            java.lang.String r13 = r13.label
            r10 = r6
            r6 = r3
            r3 = r5
            r5 = r10
            goto L3d
        L18:
            java.lang.String r13 = r12.codecs
            r3 = 1
            java.lang.String r13 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r13, r3)
            com.google.android.exoplayer2.metadata.Metadata r3 = r12.metadata
            if (r14 == 0) goto L36
            int r0 = r12.channelCount
            int r1 = r12.selectionFlags
            int r4 = r12.roleFlags
            java.lang.String r5 = r12.language
            java.lang.String r6 = r12.label
            r10 = r0
            r0 = r13
            r13 = r6
            r6 = r10
            r11 = r4
            r4 = r1
            r1 = r3
            r3 = r11
            goto L3d
        L36:
            r5 = r0
            r1 = r3
            r3 = 0
            r4 = 0
            r6 = -1
            r0 = r13
            r13 = r5
        L3d:
            java.lang.String r7 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r0)
            if (r14 == 0) goto L46
            int r8 = r12.averageBitrate
            goto L47
        L46:
            r8 = -1
        L47:
            if (r14 == 0) goto L4b
            int r2 = r12.peakBitrate
        L4b:
            com.google.android.exoplayer2.Format$Builder r14 = new com.google.android.exoplayer2.Format$Builder
            r14.<init>()
            java.lang.String r9 = r12.id
            com.google.android.exoplayer2.Format$Builder r14 = r14.setId(r9)
            com.google.android.exoplayer2.Format$Builder r13 = r14.setLabel(r13)
            java.lang.String r12 = r12.containerMimeType
            com.google.android.exoplayer2.Format$Builder r12 = r13.setContainerMimeType(r12)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setSampleMimeType(r7)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setCodecs(r0)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setMetadata(r1)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setAverageBitrate(r8)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setPeakBitrate(r2)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setChannelCount(r6)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setSelectionFlags(r4)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setRoleFlags(r3)
            com.google.android.exoplayer2.Format$Builder r12 = r12.setLanguage(r5)
            com.google.android.exoplayer2.Format r12 = r12.build()
            return r12
    }

    private static java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> deriveOverridingDrmInitData(java.util.List<com.google.android.exoplayer2.drm.DrmInitData> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
        Lb:
            int r3 = r0.size()
            if (r2 >= r3) goto L3f
            java.lang.Object r3 = r8.get(r2)
            com.google.android.exoplayer2.drm.DrmInitData r3 = (com.google.android.exoplayer2.drm.DrmInitData) r3
            java.lang.String r4 = r3.schemeType
            int r2 = r2 + 1
            r5 = r2
        L1c:
            int r6 = r0.size()
            if (r5 >= r6) goto L3b
            java.lang.Object r6 = r0.get(r5)
            com.google.android.exoplayer2.drm.DrmInitData r6 = (com.google.android.exoplayer2.drm.DrmInitData) r6
            java.lang.String r7 = r6.schemeType
            boolean r7 = android.text.TextUtils.equals(r7, r4)
            if (r7 == 0) goto L38
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.merge(r6)
            r0.remove(r5)
            goto L1c
        L38:
            int r5 = r5 + 1
            goto L1c
        L3b:
            r1.put(r4, r3)
            goto Lb
        L3f:
            return r1
    }

    private static com.google.android.exoplayer2.Format deriveVideoFormat(com.google.android.exoplayer2.Format r4) {
            java.lang.String r0 = r4.codecs
            r1 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r0, r1)
            java.lang.String r1 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r0)
            com.google.android.exoplayer2.Format$Builder r2 = new com.google.android.exoplayer2.Format$Builder
            r2.<init>()
            java.lang.String r3 = r4.id
            com.google.android.exoplayer2.Format$Builder r2 = r2.setId(r3)
            java.lang.String r3 = r4.label
            com.google.android.exoplayer2.Format$Builder r2 = r2.setLabel(r3)
            java.lang.String r3 = r4.containerMimeType
            com.google.android.exoplayer2.Format$Builder r2 = r2.setContainerMimeType(r3)
            com.google.android.exoplayer2.Format$Builder r1 = r2.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format$Builder r0 = r1.setCodecs(r0)
            com.google.android.exoplayer2.metadata.Metadata r1 = r4.metadata
            com.google.android.exoplayer2.Format$Builder r0 = r0.setMetadata(r1)
            int r1 = r4.averageBitrate
            com.google.android.exoplayer2.Format$Builder r0 = r0.setAverageBitrate(r1)
            int r1 = r4.peakBitrate
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPeakBitrate(r1)
            int r1 = r4.width
            com.google.android.exoplayer2.Format$Builder r0 = r0.setWidth(r1)
            int r1 = r4.height
            com.google.android.exoplayer2.Format$Builder r0 = r0.setHeight(r1)
            float r1 = r4.frameRate
            com.google.android.exoplayer2.Format$Builder r0 = r0.setFrameRate(r1)
            int r1 = r4.selectionFlags
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSelectionFlags(r1)
            int r4 = r4.roleFlags
            com.google.android.exoplayer2.Format$Builder r4 = r0.setRoleFlags(r4)
            com.google.android.exoplayer2.Format r4 = r4.build()
            return r4
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r4) {
            r3 = this;
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r3.trackGroups
            if (r0 != 0) goto L14
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r4 = r3.sampleStreamWrappers
            int r5 = r4.length
            r0 = 0
            r1 = 0
        L9:
            if (r1 >= r5) goto L13
            r2 = r4[r1]
            r2.continuePreparing()
            int r1 = r1 + 1
            goto L9
        L13:
            return r0
        L14:
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r3.compositeSequenceableLoader
            boolean r4 = r0.continueLoading(r4)
            return r4
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long r5, boolean r7) {
            r4 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r4.enabledSampleStreamWrappers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.discardBuffer(r5, r7)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long r6, com.google.android.exoplayer2.SeekParameters r8) {
            r5 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r5.enabledSampleStreamWrappers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            boolean r4 = r3.isVideoSampleStream()
            if (r4 == 0) goto L13
            long r6 = r3.getAdjustedSeekPositionUs(r6, r8)
            goto L16
        L13:
            int r2 = r2 + 1
            goto L4
        L16:
            return r6
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
            r2 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r2.compositeSequenceableLoader
            long r0 = r0.getBufferedPositionUs()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
            r2 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r2.compositeSequenceableLoader
            long r0 = r0.getNextLoadPositionUs()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> r17) {
            r16 = this;
            r0 = r16
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r1 = r0.playlistTracker
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1 = r1.getMultivariantPlaylist()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist) r1
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r2 = r1.variants
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r4 = r0.sampleStreamWrappers
            int r4 = r4.length
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition> r5 = r1.subtitles
            int r5 = r5.size()
            int r4 = r4 - r5
            r5 = 0
            if (r2 == 0) goto L34
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r6 = r0.sampleStreamWrappers
            r6 = r6[r5]
            int[][] r7 = r0.manifestUrlIndicesPerWrapper
            r7 = r7[r5]
            com.google.android.exoplayer2.source.TrackGroupArray r8 = r6.getTrackGroups()
            int r6 = r6.getPrimaryTrackGroupIndex()
            goto L39
        L34:
            int[] r7 = new int[r5]
            com.google.android.exoplayer2.source.TrackGroupArray r8 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            r6 = 0
        L39:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r17.iterator()
            r11 = 0
            r12 = 0
        L44:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto Lba
            java.lang.Object r13 = r10.next()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r13 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection) r13
            com.google.android.exoplayer2.source.TrackGroup r14 = r13.getTrackGroup()
            int r15 = r8.indexOf(r14)
            r3 = -1
            if (r15 == r3) goto L79
            if (r15 != r6) goto L77
            r3 = 0
        L5e:
            int r12 = r13.length()
            if (r3 >= r12) goto L75
            int r12 = r13.getIndexInTrackGroup(r3)
            r12 = r7[r12]
            com.google.android.exoplayer2.offline.StreamKey r14 = new com.google.android.exoplayer2.offline.StreamKey
            r14.<init>(r5, r12)
            r9.add(r14)
            int r3 = r3 + 1
            goto L5e
        L75:
            r12 = 1
            goto Lb5
        L77:
            r11 = 1
            goto Lb5
        L79:
            r15 = r2
        L7a:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r5 = r0.sampleStreamWrappers
            int r3 = r5.length
            if (r15 >= r3) goto Lb5
            r3 = r5[r15]
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r3.getTrackGroups()
            int r3 = r3.indexOf(r14)
            r5 = -1
            if (r3 == r5) goto Laf
            if (r15 >= r4) goto L90
            r3 = 1
            goto L91
        L90:
            r3 = 2
        L91:
            int[][] r5 = r0.manifestUrlIndicesPerWrapper
            r5 = r5[r15]
            r14 = 0
        L96:
            int r15 = r13.length()
            if (r14 >= r15) goto Lb5
            int r15 = r13.getIndexInTrackGroup(r14)
            r15 = r5[r15]
            com.google.android.exoplayer2.offline.StreamKey r0 = new com.google.android.exoplayer2.offline.StreamKey
            r0.<init>(r3, r15)
            r9.add(r0)
            int r14 = r14 + 1
            r0 = r16
            goto L96
        Laf:
            int r15 = r15 + 1
            r3 = -1
            r0 = r16
            goto L7a
        Lb5:
            r0 = r16
            r3 = 1
            r5 = 0
            goto L44
        Lba:
            if (r11 == 0) goto Lf3
            if (r12 != 0) goto Lf3
            r0 = 0
            r2 = r7[r0]
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r3 = r1.variants
            r4 = r7[r0]
            java.lang.Object r0 = r3.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r0
            com.google.android.exoplayer2.Format r0 = r0.format
            int r0 = r0.bitrate
            r3 = 1
        Ld0:
            int r4 = r7.length
            if (r3 >= r4) goto Lea
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant> r4 = r1.variants
            r5 = r7[r3]
            java.lang.Object r4 = r4.get(r5)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r4 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r4
            com.google.android.exoplayer2.Format r4 = r4.format
            int r4 = r4.bitrate
            if (r4 >= r0) goto Le7
            r0 = r7[r3]
            r2 = r0
            r0 = r4
        Le7:
            int r3 = r3 + 1
            goto Ld0
        Lea:
            com.google.android.exoplayer2.offline.StreamKey r0 = new com.google.android.exoplayer2.offline.StreamKey
            r1 = 0
            r0.<init>(r1, r2)
            r9.add(r0)
        Lf3:
            return r9
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.trackGroups
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.TrackGroupArray r0 = (com.google.android.exoplayer2.source.TrackGroupArray) r0
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
            r1 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r1.compositeSequenceableLoader
            boolean r0 = r0.isLoading()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r4.sampleStreamWrappers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.maybeThrowPrepareError()
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
            r4 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r4.sampleStreamWrappers
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.onPlaylistUpdated()
            int r2 = r2 + 1
            goto L4
        Le:
            com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = r4.mediaPeriodCallback
            r0.onContinueLoadingRequested(r4)
            return
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(android.net.Uri r6, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r7, boolean r8) {
            r5 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r5.sampleStreamWrappers
            int r1 = r0.length
            r2 = 1
            r3 = 0
        L5:
            if (r3 >= r1) goto L11
            r4 = r0[r3]
            boolean r4 = r4.onPlaylistError(r6, r7, r8)
            r2 = r2 & r4
            int r3 = r3 + 1
            goto L5
        L11:
            com.google.android.exoplayer2.source.MediaPeriod$Callback r6 = r5.mediaPeriodCallback
            r6.onContinueLoadingRequested(r5)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
            r0 = this;
            r0.mediaPeriodCallback = r1
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r1 = r0.playlistTracker
            r1.addListener(r0)
            r0.buildAndPrepareSampleStreamWrappers(r2)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r1.compositeSequenceableLoader
            r0.reevaluateBuffer(r2)
            return
    }

    public void release() {
            r4 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r0 = r4.playlistTracker
            r0.removeListener(r4)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r4.sampleStreamWrappers
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L13
            r3 = r0[r2]
            r3.release()
            int r2 = r2 + 1
            goto L9
        L13:
            r0 = 0
            r4.mediaPeriodCallback = r0
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long r5) {
            r4 = this;
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r0 = r4.enabledSampleStreamWrappers
            int r1 = r0.length
            if (r1 <= 0) goto L21
            r1 = 0
            r0 = r0[r1]
            boolean r0 = r0.seekToUs(r5, r1)
            r1 = 1
        Ld:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r2 = r4.enabledSampleStreamWrappers
            int r3 = r2.length
            if (r1 >= r3) goto L1a
            r2 = r2[r1]
            r2.seekToUs(r5, r0)
            int r1 = r1 + 1
            goto Ld
        L1a:
            if (r0 == 0) goto L21
            com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider r0 = r4.timestampAdjusterProvider
            r0.reset()
        L21:
            return r5
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r22, boolean[] r23, com.google.android.exoplayer2.source.SampleStream[] r24, boolean[] r25, long r26) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r6 = 0
        Ld:
            int r7 = r1.length
            if (r6 >= r7) goto L4e
            r7 = r2[r6]
            r8 = -1
            if (r7 != 0) goto L17
            r7 = -1
            goto L25
        L17:
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> r7 = r0.streamWrapperIndices
            r9 = r2[r6]
            java.lang.Object r7 = r7.get(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L25:
            r3[r6] = r7
            r4[r6] = r8
            r7 = r1[r6]
            if (r7 == 0) goto L4b
            r7 = r1[r6]
            com.google.android.exoplayer2.source.TrackGroup r7 = r7.getTrackGroup()
            r9 = 0
        L34:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r10 = r0.sampleStreamWrappers
            int r11 = r10.length
            if (r9 >= r11) goto L4b
            r10 = r10[r9]
            com.google.android.exoplayer2.source.TrackGroupArray r10 = r10.getTrackGroups()
            int r10 = r10.indexOf(r7)
            if (r10 == r8) goto L48
            r4[r6] = r9
            goto L4b
        L48:
            int r9 = r9 + 1
            goto L34
        L4b:
            int r6 = r6 + 1
            goto Ld
        L4e:
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> r6 = r0.streamWrapperIndices
            r6.clear()
            int r6 = r1.length
            com.google.android.exoplayer2.source.SampleStream[] r7 = new com.google.android.exoplayer2.source.SampleStream[r6]
            int r8 = r1.length
            com.google.android.exoplayer2.source.SampleStream[] r8 = new com.google.android.exoplayer2.source.SampleStream[r8]
            int r9 = r1.length
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r14 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r9]
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r9 = r0.sampleStreamWrappers
            int r9 = r9.length
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r15 = new com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[r9]
            r12 = 0
            r13 = 0
            r17 = 0
        L65:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r9 = r0.sampleStreamWrappers
            int r9 = r9.length
            if (r13 >= r9) goto L101
            r9 = 0
        L6b:
            int r10 = r1.length
            if (r9 >= r10) goto L84
            r10 = r3[r9]
            r11 = 0
            if (r10 != r13) goto L76
            r10 = r2[r9]
            goto L77
        L76:
            r10 = r11
        L77:
            r8[r9] = r10
            r10 = r4[r9]
            if (r10 != r13) goto L7f
            r11 = r1[r9]
        L7f:
            r14[r9] = r11
            int r9 = r9 + 1
            goto L6b
        L84:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r9 = r0.sampleStreamWrappers
            r11 = r9[r13]
            r9 = r11
            r10 = r14
            r5 = r11
            r11 = r23
            r2 = r12
            r12 = r8
            r18 = r6
            r6 = r13
            r13 = r25
            r19 = r14
            r20 = r15
            r14 = r26
            r16 = r17
            boolean r9 = r9.selectTracks(r10, r11, r12, r13, r14, r16)
            r10 = 0
            r11 = 0
        La2:
            int r12 = r1.length
            r13 = 1
            if (r10 >= r12) goto Lca
            r12 = r8[r10]
            r14 = r4[r10]
            if (r14 != r6) goto Lbc
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            r7[r10] = r12
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.SampleStream, java.lang.Integer> r11 = r0.streamWrapperIndices
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r11.put(r12, r14)
            r11 = 1
            goto Lc7
        Lbc:
            r14 = r3[r10]
            if (r14 != r6) goto Lc7
            if (r12 != 0) goto Lc3
            goto Lc4
        Lc3:
            r13 = 0
        Lc4:
            com.google.android.exoplayer2.util.Assertions.checkState(r13)
        Lc7:
            int r10 = r10 + 1
            goto La2
        Lca:
            r10 = r20
            if (r11 == 0) goto Lf5
            r10[r2] = r5
            int r12 = r2 + 1
            if (r2 != 0) goto Leb
            r5.setIsTimestampMaster(r13)
            if (r9 != 0) goto Le3
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r2 = r0.enabledSampleStreamWrappers
            int r9 = r2.length
            if (r9 == 0) goto Le3
            r9 = 0
            r2 = r2[r9]
            if (r5 == r2) goto Lf6
        Le3:
            com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider r2 = r0.timestampAdjusterProvider
            r2.reset()
            r17 = 1
            goto Lf6
        Leb:
            int r2 = r0.audioVideoSampleStreamWrapperCount
            if (r6 >= r2) goto Lf0
            goto Lf1
        Lf0:
            r13 = 0
        Lf1:
            r5.setIsTimestampMaster(r13)
            goto Lf6
        Lf5:
            r12 = r2
        Lf6:
            int r13 = r6 + 1
            r2 = r24
            r15 = r10
            r6 = r18
            r14 = r19
            goto L65
        L101:
            r5 = r6
            r10 = r15
            r6 = 0
            java.lang.System.arraycopy(r7, r6, r2, r6, r5)
            java.lang.Object[] r1 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r10, r12)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r1 = (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[]) r1
            r0.enabledSampleStreamWrappers = r1
            com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r2 = r0.compositeSequenceableLoaderFactory
            com.google.android.exoplayer2.source.SequenceableLoader r1 = r2.createCompositeSequenceableLoader(r1)
            r0.compositeSequenceableLoader = r1
            return r26
    }
}
