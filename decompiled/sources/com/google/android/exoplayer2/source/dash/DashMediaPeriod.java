package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes.dex */
final class DashMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader.Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>>, com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback<com.google.android.exoplayer2.source.dash.DashChunkSource> {
    private static final java.util.regex.Pattern CEA608_SERVICE_DESCRIPTOR_REGEX = null;
    private static final java.util.regex.Pattern CEA708_SERVICE_DESCRIPTOR_REGEX = null;
    private final com.google.android.exoplayer2.upstream.Allocator allocator;
    private final com.google.android.exoplayer2.source.dash.BaseUrlExclusionList baseUrlExclusionList;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
    private final com.google.android.exoplayer2.source.dash.DashChunkSource.Factory chunkSourceFactory;
    private com.google.android.exoplayer2.source.SequenceableLoader compositeSequenceableLoader;
    private final com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private final long elapsedRealtimeOffsetMs;
    private com.google.android.exoplayer2.source.dash.EventSampleStream[] eventSampleStreams;
    private java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> eventStreams;
    public final int id;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private com.google.android.exoplayer2.source.dash.manifest.DashManifest manifest;
    private final com.google.android.exoplayer2.upstream.LoaderErrorThrower manifestLoaderErrorThrower;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private int periodIndex;
    private final com.google.android.exoplayer2.source.dash.PlayerEmsgHandler playerEmsgHandler;
    private final com.google.android.exoplayer2.analytics.PlayerId playerId;
    private com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] sampleStreams;
    private final java.util.IdentityHashMap<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>, com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream;
    private final com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfos;
    private final com.google.android.exoplayer2.source.TrackGroupArray trackGroups;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.upstream.TransferListener transferListener;

    public static final class TrackGroupInfo {
        private static final int CATEGORY_EMBEDDED = 1;
        private static final int CATEGORY_MANIFEST_EVENTS = 2;
        private static final int CATEGORY_PRIMARY = 0;
        public final int[] adaptationSetIndices;
        public final int embeddedClosedCaptionTrackGroupIndex;
        public final int embeddedEventMessageTrackGroupIndex;
        public final int eventStreamGroupIndex;
        public final int primaryTrackGroupIndex;
        public final int trackGroupCategory;
        public final int trackType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        private TrackGroupInfo(int r1, int r2, int[] r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                r0.<init>()
                r0.trackType = r1
                r0.adaptationSetIndices = r3
                r0.trackGroupCategory = r2
                r0.primaryTrackGroupIndex = r4
                r0.embeddedEventMessageTrackGroupIndex = r5
                r0.embeddedClosedCaptionTrackGroupIndex = r6
                r0.eventStreamGroupIndex = r7
                return
        }

        public static com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo embeddedClosedCaptionTrack(int[] r9, int r10) {
                com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r8 = new com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo
                r1 = 3
                r2 = 1
                r5 = -1
                r6 = -1
                r7 = -1
                r0 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public static com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo embeddedEmsgTrack(int[] r9, int r10) {
                com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r8 = new com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo
                r1 = 5
                r2 = 1
                r5 = -1
                r6 = -1
                r7 = -1
                r0 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public static com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo mpdEventTrack(int r9) {
                com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r8 = new com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo
                r0 = 0
                int[] r3 = new int[r0]
                r1 = 5
                r2 = 2
                r4 = -1
                r5 = -1
                r6 = -1
                r0 = r8
                r7 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public static com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo primaryTrack(int r9, int[] r10, int r11, int r12, int r13) {
                com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r8 = new com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo
                r2 = 0
                r7 = -1
                r0 = r8
                r1 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }
    }

    static {
            java.lang.String r0 = "CC([1-4])=(.+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.dash.DashMediaPeriod.CEA608_SERVICE_DESCRIPTOR_REGEX = r0
            java.lang.String r0 = "([1-4])=lang:(\\w+)(,.+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.dash.DashMediaPeriod.CEA708_SERVICE_DESCRIPTOR_REGEX = r0
            return
    }

    public DashMediaPeriod(int r9, com.google.android.exoplayer2.source.dash.manifest.DashManifest r10, com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r11, int r12, com.google.android.exoplayer2.source.dash.DashChunkSource.Factory r13, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r14, com.google.android.exoplayer2.drm.DrmSessionManager r15, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r16, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r17, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r18, long r19, com.google.android.exoplayer2.upstream.LoaderErrorThrower r21, com.google.android.exoplayer2.upstream.Allocator r22, com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r23, com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback r24, com.google.android.exoplayer2.analytics.PlayerId r25) {
            r8 = this;
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r15
            r4 = r22
            r5 = r23
            r8.<init>()
            r6 = r9
            r0.id = r6
            r0.manifest = r1
            r6 = r11
            r0.baseUrlExclusionList = r6
            r0.periodIndex = r2
            r6 = r13
            r0.chunkSourceFactory = r6
            r6 = r14
            r0.transferListener = r6
            r0.drmSessionManager = r3
            r6 = r16
            r0.drmEventDispatcher = r6
            r6 = r17
            r0.loadErrorHandlingPolicy = r6
            r6 = r18
            r0.mediaSourceEventDispatcher = r6
            r6 = r19
            r0.elapsedRealtimeOffsetMs = r6
            r6 = r21
            r0.manifestLoaderErrorThrower = r6
            r0.allocator = r4
            r0.compositeSequenceableLoaderFactory = r5
            r6 = r25
            r0.playerId = r6
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r6 = new com.google.android.exoplayer2.source.dash.PlayerEmsgHandler
            r7 = r24
            r6.<init>(r10, r7, r4)
            r0.playerEmsgHandler = r6
            r4 = 0
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream[] r6 = newSampleStreamArray(r4)
            r0.sampleStreams = r6
            com.google.android.exoplayer2.source.dash.EventSampleStream[] r4 = new com.google.android.exoplayer2.source.dash.EventSampleStream[r4]
            r0.eventSampleStreams = r4
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            r0.trackEmsgHandlerBySampleStream = r4
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] r4 = r0.sampleStreams
            com.google.android.exoplayer2.source.SequenceableLoader r4 = r5.createCompositeSequenceableLoader(r4)
            r0.compositeSequenceableLoader = r4
            com.google.android.exoplayer2.source.dash.manifest.Period r1 = r10.getPeriod(r12)
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r2 = r1.eventStreams
            r0.eventStreams = r2
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r1 = r1.adaptationSets
            android.util.Pair r1 = buildTrackGroups(r15, r1, r2)
            java.lang.Object r2 = r1.first
            com.google.android.exoplayer2.source.TrackGroupArray r2 = (com.google.android.exoplayer2.source.TrackGroupArray) r2
            r0.trackGroups = r2
            java.lang.Object r1 = r1.second
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo[] r1 = (com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo[]) r1
            r0.trackGroupInfos = r1
            return
    }

    private static void buildManifestEventTrackGroupInfos(java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r6, com.google.android.exoplayer2.source.TrackGroup[] r7, com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo[] r8, int r9) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L55
            java.lang.Object r2 = r6.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.EventStream r2 = (com.google.android.exoplayer2.source.dash.manifest.EventStream) r2
            com.google.android.exoplayer2.Format$Builder r3 = new com.google.android.exoplayer2.Format$Builder
            r3.<init>()
            java.lang.String r4 = r2.id()
            com.google.android.exoplayer2.Format$Builder r3 = r3.setId(r4)
            java.lang.String r4 = "application/x-emsg"
            com.google.android.exoplayer2.Format$Builder r3 = r3.setSampleMimeType(r4)
            com.google.android.exoplayer2.Format r3 = r3.build()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.id()
            r4.append(r2)
            java.lang.String r2 = ":"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
            com.google.android.exoplayer2.source.TrackGroup r4 = new com.google.android.exoplayer2.source.TrackGroup
            r5 = 1
            com.google.android.exoplayer2.Format[] r5 = new com.google.android.exoplayer2.Format[r5]
            r5[r0] = r3
            r4.<init>(r2, r5)
            r7[r9] = r4
            int r2 = r9 + 1
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r3 = com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo.mpdEventTrack(r1)
            r8[r9] = r3
            int r1 = r1 + 1
            r9 = r2
            goto L2
        L55:
            return
    }

    private static int buildPrimaryAndEmbeddedTrackGroupInfos(com.google.android.exoplayer2.drm.DrmSessionManager r17, java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r18, int[][] r19, int r20, boolean[] r21, com.google.android.exoplayer2.Format[][] r22, com.google.android.exoplayer2.source.TrackGroup[] r23, com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo[] r24) {
            r0 = r18
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r20
        L7:
            if (r2 >= r4) goto Ld4
            r5 = r19[r2]
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r5.length
            r8 = 0
        L12:
            if (r8 >= r7) goto L24
            r9 = r5[r8]
            java.lang.Object r9 = r0.get(r9)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r9 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r9
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r9 = r9.representations
            r6.addAll(r9)
            int r8 = r8 + 1
            goto L12
        L24:
            int r7 = r6.size()
            com.google.android.exoplayer2.Format[] r8 = new com.google.android.exoplayer2.Format[r7]
            r9 = 0
        L2b:
            if (r9 >= r7) goto L44
            java.lang.Object r10 = r6.get(r9)
            com.google.android.exoplayer2.source.dash.manifest.Representation r10 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r10
            com.google.android.exoplayer2.Format r10 = r10.format
            r11 = r17
            int r12 = r11.getCryptoType(r10)
            com.google.android.exoplayer2.Format r10 = r10.copyWithCryptoType(r12)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L2b
        L44:
            r11 = r17
            r6 = r5[r1]
            java.lang.Object r6 = r0.get(r6)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r6 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r6
            int r7 = r6.id
            r9 = -1
            if (r7 == r9) goto L58
            java.lang.String r7 = java.lang.Integer.toString(r7)
            goto L5f
        L58:
            java.lang.String r7 = "unset:"
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r2)
        L5f:
            int r10 = r3 + 1
            boolean r12 = r21[r2]
            if (r12 == 0) goto L6d
            int r12 = r10 + 1
            r16 = r12
            r12 = r10
            r10 = r16
            goto L6e
        L6d:
            r12 = -1
        L6e:
            r13 = r22[r2]
            int r13 = r13.length
            if (r13 == 0) goto L7b
            int r13 = r10 + 1
            r16 = r13
            r13 = r10
            r10 = r16
            goto L7c
        L7b:
            r13 = -1
        L7c:
            com.google.android.exoplayer2.source.TrackGroup r14 = new com.google.android.exoplayer2.source.TrackGroup
            r14.<init>(r7, r8)
            r23[r3] = r14
            int r6 = r6.type
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r6 = com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo.primaryTrack(r6, r5, r3, r12, r13)
            r24[r3] = r6
            if (r12 == r9) goto Lb8
            java.lang.String r6 = ":emsg"
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r6)
            com.google.android.exoplayer2.Format$Builder r8 = new com.google.android.exoplayer2.Format$Builder
            r8.<init>()
            com.google.android.exoplayer2.Format$Builder r8 = r8.setId(r6)
            java.lang.String r14 = "application/x-emsg"
            com.google.android.exoplayer2.Format$Builder r8 = r8.setSampleMimeType(r14)
            com.google.android.exoplayer2.Format r8 = r8.build()
            com.google.android.exoplayer2.source.TrackGroup r14 = new com.google.android.exoplayer2.source.TrackGroup
            r15 = 1
            com.google.android.exoplayer2.Format[] r15 = new com.google.android.exoplayer2.Format[r15]
            r15[r1] = r8
            r14.<init>(r6, r15)
            r23[r12] = r14
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r6 = com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo.embeddedEmsgTrack(r5, r3)
            r24[r12] = r6
        Lb8:
            if (r13 == r9) goto Lcf
            java.lang.String r6 = ":cc"
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r6)
            com.google.android.exoplayer2.source.TrackGroup r7 = new com.google.android.exoplayer2.source.TrackGroup
            r8 = r22[r2]
            r7.<init>(r6, r8)
            r23[r13] = r7
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo r3 = com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo.embeddedClosedCaptionTrack(r5, r3)
            r24[r13] = r3
        Lcf:
            int r2 = r2 + 1
            r3 = r10
            goto L7
        Ld4:
            return r3
    }

    private com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource> buildSampleStream(com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo r33, com.google.android.exoplayer2.trackselection.ExoTrackSelection r34, long r35) {
            r32 = this;
            r14 = r32
            r0 = r33
            int r1 = r0.embeddedEventMessageTrackGroupIndex
            r2 = -1
            r3 = 1
            r4 = 0
            if (r1 == r2) goto Le
            r25 = 1
            goto L10
        Le:
            r25 = 0
        L10:
            r5 = 0
            if (r25 == 0) goto L1b
            com.google.android.exoplayer2.source.TrackGroupArray r6 = r14.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r1 = r6.get(r1)
            r6 = 1
            goto L1d
        L1b:
            r1 = r5
            r6 = 0
        L1d:
            int r7 = r0.embeddedClosedCaptionTrackGroupIndex
            if (r7 == r2) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L30
            com.google.android.exoplayer2.source.TrackGroupArray r8 = r14.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r7 = r8.get(r7)
            int r8 = r7.length
            int r6 = r6 + r8
            goto L31
        L30:
            r7 = r5
        L31:
            com.google.android.exoplayer2.Format[] r8 = new com.google.android.exoplayer2.Format[r6]
            int[] r6 = new int[r6]
            if (r25 == 0) goto L42
            com.google.android.exoplayer2.Format r1 = r1.getFormat(r4)
            r8[r4] = r1
            r1 = 5
            r6[r4] = r1
            r1 = 1
            goto L43
        L42:
            r1 = 0
        L43:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r2 == 0) goto L60
        L4a:
            int r2 = r7.length
            if (r4 >= r2) goto L60
            com.google.android.exoplayer2.Format r2 = r7.getFormat(r4)
            r8[r1] = r2
            r2 = 3
            r6[r1] = r2
            r2 = r8[r1]
            r9.add(r2)
            int r1 = r1 + r3
            int r4 = r4 + 1
            goto L4a
        L60:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r14.manifest
            boolean r1 = r1.dynamic
            if (r1 == 0) goto L6e
            if (r25 == 0) goto L6e
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r1 = r14.playerEmsgHandler
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler r5 = r1.newPlayerTrackEmsgHandler()
        L6e:
            r13 = r5
            com.google.android.exoplayer2.source.dash.DashChunkSource$Factory r15 = r14.chunkSourceFactory
            com.google.android.exoplayer2.upstream.LoaderErrorThrower r1 = r14.manifestLoaderErrorThrower
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = r14.manifest
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r3 = r14.baseUrlExclusionList
            int r4 = r14.periodIndex
            int[] r5 = r0.adaptationSetIndices
            int r7 = r0.trackType
            long r10 = r14.elapsedRealtimeOffsetMs
            com.google.android.exoplayer2.upstream.TransferListener r12 = r14.transferListener
            r30 = r8
            com.google.android.exoplayer2.analytics.PlayerId r8 = r14.playerId
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r34
            r22 = r7
            r23 = r10
            r26 = r9
            r27 = r13
            r28 = r12
            r29 = r8
            com.google.android.exoplayer2.source.dash.DashChunkSource r5 = r15.createDashChunkSource(r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29)
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream r15 = new com.google.android.exoplayer2.source.chunk.ChunkSampleStream
            int r2 = r0.trackType
            com.google.android.exoplayer2.upstream.Allocator r7 = r14.allocator
            com.google.android.exoplayer2.drm.DrmSessionManager r10 = r14.drmSessionManager
            com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r11 = r14.drmEventDispatcher
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r12 = r14.loadErrorHandlingPolicy
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r14.mediaSourceEventDispatcher
            r1 = r15
            r3 = r6
            r4 = r30
            r6 = r32
            r8 = r35
            r31 = r13
            r13 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            monitor-enter(r32)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>, com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler> r0 = r14.trackEmsgHandlerBySampleStream     // Catch: java.lang.Throwable -> Lc7
            r5 = r31
            r0.put(r15, r5)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r32)     // Catch: java.lang.Throwable -> Lc7
            return r15
        Lc7:
            r0 = move-exception
            monitor-exit(r32)     // Catch: java.lang.Throwable -> Lc7
            throw r0
    }

    private static android.util.Pair<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo[]> buildTrackGroups(com.google.android.exoplayer2.drm.DrmSessionManager r10, java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r11, java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r12) {
            int[][] r2 = getGroupedAdaptationSetIndices(r11)
            int r3 = r2.length
            boolean[] r4 = new boolean[r3]
            com.google.android.exoplayer2.Format[][] r5 = new com.google.android.exoplayer2.Format[r3][]
            int r0 = identifyEmbeddedTracks(r3, r11, r2, r4, r5)
            int r0 = r0 + r3
            int r1 = r12.size()
            int r1 = r1 + r0
            com.google.android.exoplayer2.source.TrackGroup[] r8 = new com.google.android.exoplayer2.source.TrackGroup[r1]
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo[] r9 = new com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo[r1]
            r0 = r10
            r1 = r11
            r6 = r8
            r7 = r9
            int r10 = buildPrimaryAndEmbeddedTrackGroupInfos(r0, r1, r2, r3, r4, r5, r6, r7)
            buildManifestEventTrackGroupInfos(r12, r8, r9, r10)
            com.google.android.exoplayer2.source.TrackGroupArray r10 = new com.google.android.exoplayer2.source.TrackGroupArray
            r10.<init>(r8)
            android.util.Pair r10 = android.util.Pair.create(r10, r9)
            return r10
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.dash.manifest.Descriptor findAdaptationSetSwitchingProperty(java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r1) {
            java.lang.String r0 = "urn:mpeg:dash:adaptation-set-switching:2016"
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = findDescriptor(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.dash.manifest.Descriptor findDescriptor(java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r3, java.lang.String r4) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r3.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r1
            java.lang.String r2 = r1.schemeIdUri
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.dash.manifest.Descriptor findTrickPlayProperty(java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r1) {
            java.lang.String r0 = "http://dashif.org/guidelines/trickmode"
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = findDescriptor(r1, r0)
            return r1
    }

    private static com.google.android.exoplayer2.Format[] getClosedCaptionTrackFormats(java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r9, int[] r10) {
            int r0 = r10.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L99
            r3 = r10[r2]
            java.lang.Object r4 = r9.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r4 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r4
            java.lang.Object r3 = r9.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r3 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r3
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r3 = r3.accessibilityDescriptors
            r5 = 0
        L16:
            int r6 = r3.size()
            if (r5 >= r6) goto L95
            java.lang.Object r6 = r3.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r6 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r6
            java.lang.String r7 = r6.schemeIdUri
            java.lang.String r8 = "urn:scte:dash:cc:cea-608:2015"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L5a
            com.google.android.exoplayer2.Format$Builder r9 = new com.google.android.exoplayer2.Format$Builder
            r9.<init>()
            java.lang.String r10 = "application/cea-608"
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSampleMimeType(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r0 = r4.id
            r10.append(r0)
            java.lang.String r0 = ":cea608"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.google.android.exoplayer2.Format$Builder r9 = r9.setId(r10)
            com.google.android.exoplayer2.Format r9 = r9.build()
            java.util.regex.Pattern r10 = com.google.android.exoplayer2.source.dash.DashMediaPeriod.CEA608_SERVICE_DESCRIPTOR_REGEX
            com.google.android.exoplayer2.Format[] r9 = parseClosedCaptionDescriptor(r6, r10, r9)
            return r9
        L5a:
            java.lang.String r7 = r6.schemeIdUri
            java.lang.String r8 = "urn:scte:dash:cc:cea-708:2015"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L92
            com.google.android.exoplayer2.Format$Builder r9 = new com.google.android.exoplayer2.Format$Builder
            r9.<init>()
            java.lang.String r10 = "application/cea-708"
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSampleMimeType(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r0 = r4.id
            r10.append(r0)
            java.lang.String r0 = ":cea708"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.google.android.exoplayer2.Format$Builder r9 = r9.setId(r10)
            com.google.android.exoplayer2.Format r9 = r9.build()
            java.util.regex.Pattern r10 = com.google.android.exoplayer2.source.dash.DashMediaPeriod.CEA708_SERVICE_DESCRIPTOR_REGEX
            com.google.android.exoplayer2.Format[] r9 = parseClosedCaptionDescriptor(r6, r10, r9)
            return r9
        L92:
            int r5 = r5 + 1
            goto L16
        L95:
            int r2 = r2 + 1
            goto L3
        L99:
            com.google.android.exoplayer2.Format[] r9 = new com.google.android.exoplayer2.Format[r1]
            return r9
    }

    private static int[][] getGroupedAdaptationSetIndices(java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r12) {
            int r0 = r12.size()
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>(r0)
            r4 = 0
            r5 = 0
        L15:
            if (r5 >= r0) goto L37
            java.lang.Object r6 = r12.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r6 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r6
            int r6 = r6.id
            r1.put(r6, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.add(r7)
            r2.add(r6)
            r3.put(r5, r6)
            int r5 = r5 + 1
            goto L15
        L37:
            r5 = 0
        L38:
            if (r5 >= r0) goto La2
            java.lang.Object r6 = r12.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r6 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r6
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r7 = r6.essentialProperties
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r7 = findTrickPlayProperty(r7)
            if (r7 != 0) goto L4e
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r7 = r6.supplementalProperties
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r7 = findTrickPlayProperty(r7)
        L4e:
            r8 = -1
            if (r7 == 0) goto L5e
            java.lang.String r7 = r7.value
            int r7 = java.lang.Integer.parseInt(r7)
            int r7 = r1.get(r7, r8)
            if (r7 == r8) goto L5e
            goto L5f
        L5e:
            r7 = r5
        L5f:
            if (r7 != r5) goto L88
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r6 = r6.supplementalProperties
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r6 = findAdaptationSetSwitchingProperty(r6)
            if (r6 == 0) goto L88
            java.lang.String r6 = r6.value
            java.lang.String r9 = ","
            java.lang.String[] r6 = com.google.android.exoplayer2.util.Util.split(r6, r9)
            int r9 = r6.length
            r10 = 0
        L73:
            if (r10 >= r9) goto L88
            r11 = r6[r10]
            int r11 = java.lang.Integer.parseInt(r11)
            int r11 = r1.get(r11, r8)
            if (r11 == r8) goto L85
            int r7 = java.lang.Math.min(r7, r11)
        L85:
            int r10 = r10 + 1
            goto L73
        L88:
            if (r7 == r5) goto L9f
            java.lang.Object r6 = r3.get(r5)
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.get(r7)
            java.util.List r7 = (java.util.List) r7
            r7.addAll(r6)
            r3.put(r5, r7)
            r2.remove(r6)
        L9f:
            int r5 = r5 + 1
            goto L38
        La2:
            int r12 = r2.size()
            int[][] r0 = new int[r12][]
        La8:
            if (r4 >= r12) goto Lbe
            java.lang.Object r1 = r2.get(r4)
            java.util.Collection r1 = (java.util.Collection) r1
            int[] r1 = com.google.common.primitives.Ints.toArray(r1)
            r0[r4] = r1
            r1 = r0[r4]
            java.util.Arrays.sort(r1)
            int r4 = r4 + 1
            goto La8
        Lbe:
            return r0
    }

    private int getPrimaryStreamIndex(int r5, int[] r6) {
            r4 = this;
            r5 = r6[r5]
            r0 = -1
            if (r5 != r0) goto L6
            return r0
        L6:
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo[] r1 = r4.trackGroupInfos
            r5 = r1[r5]
            int r5 = r5.primaryTrackGroupIndex
            r1 = 0
        Ld:
            int r2 = r6.length
            if (r1 >= r2) goto L20
            r2 = r6[r1]
            if (r2 != r5) goto L1d
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo[] r3 = r4.trackGroupInfos
            r2 = r3[r2]
            int r2 = r2.trackGroupCategory
            if (r2 != 0) goto L1d
            return r1
        L1d:
            int r1 = r1 + 1
            goto Ld
        L20:
            return r0
    }

    private int[] getStreamIndexToTrackGroupIndex(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5) {
            r4 = this;
            int r0 = r5.length
            int[] r0 = new int[r0]
            r1 = 0
        L4:
            int r2 = r5.length
            if (r1 >= r2) goto L20
            r2 = r5[r1]
            if (r2 == 0) goto L1a
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r4.trackGroups
            r3 = r5[r1]
            com.google.android.exoplayer2.source.TrackGroup r3 = r3.getTrackGroup()
            int r2 = r2.indexOf(r3)
            r0[r1] = r2
            goto L1d
        L1a:
            r2 = -1
            r0[r1] = r2
        L1d:
            int r1 = r1 + 1
            goto L4
        L20:
            return r0
    }

    private static boolean hasEventMessageTrack(java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r6, int[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L2c
            r3 = r7[r2]
            java.lang.Object r3 = r6.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r3 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r3
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r3 = r3.representations
            r4 = 0
        L10:
            int r5 = r3.size()
            if (r4 >= r5) goto L29
            java.lang.Object r5 = r3.get(r4)
            com.google.android.exoplayer2.source.dash.manifest.Representation r5 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r5
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r5 = r5.inbandEventStreams
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L26
            r6 = 1
            return r6
        L26:
            int r4 = r4 + 1
            goto L10
        L29:
            int r2 = r2 + 1
            goto L3
        L2c:
            return r1
    }

    private static int identifyEmbeddedTracks(int r3, java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r4, int[][] r5, boolean[] r6, com.google.android.exoplayer2.Format[][] r7) {
            r0 = 0
            r1 = 0
        L2:
            if (r0 >= r3) goto L23
            r2 = r5[r0]
            boolean r2 = hasEventMessageTrack(r4, r2)
            if (r2 == 0) goto L11
            r2 = 1
            r6[r0] = r2
            int r1 = r1 + 1
        L11:
            r2 = r5[r0]
            com.google.android.exoplayer2.Format[] r2 = getClosedCaptionTrackFormats(r4, r2)
            r7[r0] = r2
            r2 = r7[r0]
            int r2 = r2.length
            if (r2 == 0) goto L20
            int r1 = r1 + 1
        L20:
            int r0 = r0 + 1
            goto L2
        L23:
            return r1
    }

    private static com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] newSampleStreamArray(int r0) {
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream[] r0 = new com.google.android.exoplayer2.source.chunk.ChunkSampleStream[r0]
            return r0
    }

    private static com.google.android.exoplayer2.Format[] parseClosedCaptionDescriptor(com.google.android.exoplayer2.source.dash.manifest.Descriptor r9, java.util.regex.Pattern r10, com.google.android.exoplayer2.Format r11) {
            java.lang.String r9 = r9.value
            r0 = 0
            r1 = 1
            if (r9 != 0) goto Lb
            com.google.android.exoplayer2.Format[] r9 = new com.google.android.exoplayer2.Format[r1]
            r9[r0] = r11
            return r9
        Lb:
            java.lang.String r2 = ";"
            java.lang.String[] r9 = com.google.android.exoplayer2.util.Util.split(r9, r2)
            int r2 = r9.length
            com.google.android.exoplayer2.Format[] r2 = new com.google.android.exoplayer2.Format[r2]
            r3 = 0
        L15:
            int r4 = r9.length
            if (r3 >= r4) goto L65
            r4 = r9[r3]
            java.util.regex.Matcher r4 = r10.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 != 0) goto L29
            com.google.android.exoplayer2.Format[] r9 = new com.google.android.exoplayer2.Format[r1]
            r9[r0] = r11
            return r9
        L29:
            java.lang.String r5 = r4.group(r1)
            int r5 = java.lang.Integer.parseInt(r5)
            com.google.android.exoplayer2.Format$Builder r6 = r11.buildUpon()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r11.id
            r7.append(r8)
            java.lang.String r8 = ":"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.google.android.exoplayer2.Format$Builder r6 = r6.setId(r7)
            com.google.android.exoplayer2.Format$Builder r5 = r6.setAccessibilityChannel(r5)
            r6 = 2
            java.lang.String r4 = r4.group(r6)
            com.google.android.exoplayer2.Format$Builder r4 = r5.setLanguage(r4)
            com.google.android.exoplayer2.Format r4 = r4.build()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L15
        L65:
            return r2
    }

    private void releaseDisabledStreams(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r3, boolean[] r4, com.google.android.exoplayer2.source.SampleStream[] r5) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto L2d
            r1 = r3[r0]
            if (r1 == 0) goto Lc
            boolean r1 = r4[r0]
            if (r1 != 0) goto L2a
        Lc:
            r1 = r5[r0]
            boolean r1 = r1 instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream
            if (r1 == 0) goto L1a
            r1 = r5[r0]
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream) r1
            r1.release(r2)
            goto L27
        L1a:
            r1 = r5[r0]
            boolean r1 = r1 instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream
            if (r1 == 0) goto L27
            r1 = r5[r0]
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream r1 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream) r1
            r1.release()
        L27:
            r1 = 0
            r5[r0] = r1
        L2a:
            int r0 = r0 + 1
            goto L1
        L2d:
            return
    }

    private void releaseOrphanEmbeddedStreams(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5, com.google.android.exoplayer2.source.SampleStream[] r6, int[] r7) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.length
            if (r1 >= r2) goto L45
            r2 = r6[r1]
            boolean r2 = r2 instanceof com.google.android.exoplayer2.source.EmptySampleStream
            if (r2 != 0) goto L11
            r2 = r6[r1]
            boolean r2 = r2 instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream
            if (r2 == 0) goto L42
        L11:
            int r2 = r4.getPrimaryStreamIndex(r1, r7)
            r3 = -1
            if (r2 != r3) goto L1d
            r2 = r6[r1]
            boolean r2 = r2 instanceof com.google.android.exoplayer2.source.EmptySampleStream
            goto L30
        L1d:
            r3 = r6[r1]
            boolean r3 = r3 instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream
            if (r3 == 0) goto L2f
            r3 = r6[r1]
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream r3 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream) r3
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T extends com.google.android.exoplayer2.source.chunk.ChunkSource> r3 = r3.parent
            r2 = r6[r2]
            if (r3 != r2) goto L2f
            r2 = 1
            goto L30
        L2f:
            r2 = 0
        L30:
            if (r2 != 0) goto L42
            r2 = r6[r1]
            boolean r2 = r2 instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream
            if (r2 == 0) goto L3f
            r2 = r6[r1]
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream r2 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream) r2
            r2.release()
        L3f:
            r2 = 0
            r6[r1] = r2
        L42:
            int r1 = r1 + 1
            goto L2
        L45:
            return
    }

    private void selectNewStreams(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r7, com.google.android.exoplayer2.source.SampleStream[] r8, boolean[] r9, long r10, int[] r12) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r7.length
            r3 = 1
            if (r1 >= r2) goto L59
            r2 = r7[r1]
            if (r2 != 0) goto Lb
            goto L56
        Lb:
            r4 = r8[r1]
            if (r4 != 0) goto L43
            r9[r1] = r3
            r3 = r12[r1]
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo[] r4 = r6.trackGroupInfos
            r3 = r4[r3]
            int r4 = r3.trackGroupCategory
            if (r4 != 0) goto L22
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream r2 = r6.buildSampleStream(r3, r2, r10)
            r8[r1] = r2
            goto L56
        L22:
            r5 = 2
            if (r4 != r5) goto L56
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r4 = r6.eventStreams
            int r3 = r3.eventStreamGroupIndex
            java.lang.Object r3 = r4.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.EventStream r3 = (com.google.android.exoplayer2.source.dash.manifest.EventStream) r3
            com.google.android.exoplayer2.source.TrackGroup r2 = r2.getTrackGroup()
            com.google.android.exoplayer2.Format r2 = r2.getFormat(r0)
            com.google.android.exoplayer2.source.dash.EventSampleStream r4 = new com.google.android.exoplayer2.source.dash.EventSampleStream
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r5 = r6.manifest
            boolean r5 = r5.dynamic
            r4.<init>(r3, r2, r5)
            r8[r1] = r4
            goto L56
        L43:
            r3 = r8[r1]
            boolean r3 = r3 instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream
            if (r3 == 0) goto L56
            r3 = r8[r1]
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream r3 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream) r3
            com.google.android.exoplayer2.source.chunk.ChunkSource r3 = r3.getChunkSource()
            com.google.android.exoplayer2.source.dash.DashChunkSource r3 = (com.google.android.exoplayer2.source.dash.DashChunkSource) r3
            r3.updateTrackSelection(r2)
        L56:
            int r1 = r1 + 1
            goto L2
        L59:
            int r9 = r7.length
            if (r0 >= r9) goto L8c
            r9 = r8[r0]
            if (r9 != 0) goto L89
            r9 = r7[r0]
            if (r9 == 0) goto L89
            r9 = r12[r0]
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo[] r1 = r6.trackGroupInfos
            r9 = r1[r9]
            int r1 = r9.trackGroupCategory
            if (r1 != r3) goto L89
            int r1 = r6.getPrimaryStreamIndex(r0, r12)
            r2 = -1
            if (r1 != r2) goto L7d
            com.google.android.exoplayer2.source.EmptySampleStream r9 = new com.google.android.exoplayer2.source.EmptySampleStream
            r9.<init>()
            r8[r0] = r9
            goto L89
        L7d:
            r1 = r8[r1]
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream) r1
            int r9 = r9.trackType
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream r9 = r1.selectEmbeddedTrack(r10, r9)
            r8[r0] = r9
        L89:
            int r0 = r0 + 1
            goto L59
        L8c:
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long r2) {
            r1 = this;
            com.google.android.exoplayer2.source.SequenceableLoader r0 = r1.compositeSequenceableLoader
            boolean r2 = r0.continueLoading(r2)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long r5, boolean r7) {
            r4 = this;
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] r0 = r4.sampleStreams
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
    public long getAdjustedSeekPositionUs(long r7, com.google.android.exoplayer2.SeekParameters r9) {
            r6 = this;
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] r0 = r6.sampleStreams
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L15
            r3 = r0[r2]
            int r4 = r3.primaryTrackType
            r5 = 2
            if (r4 != r5) goto L12
            long r7 = r3.getAdjustedSeekPositionUs(r7, r9)
            return r7
        L12:
            int r2 = r2 + 1
            goto L4
        L15:
            return r7
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
    public java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> r14) {
            r13 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r13.manifest
            int r1 = r13.periodIndex
            com.google.android.exoplayer2.source.dash.manifest.Period r0 = r0.getPeriod(r1)
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r0 = r0.adaptationSets
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        L13:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r14.next()
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection) r2
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r13.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r4 = r2.getTrackGroup()
            int r3 = r3.indexOf(r4)
            com.google.android.exoplayer2.source.dash.DashMediaPeriod$TrackGroupInfo[] r4 = r13.trackGroupInfos
            r3 = r4[r3]
            int r4 = r3.trackGroupCategory
            if (r4 == 0) goto L32
            goto L13
        L32:
            int[] r3 = r3.adaptationSetIndices
            int r4 = r2.length()
            int[] r5 = new int[r4]
            r6 = 0
            r7 = 0
        L3c:
            int r8 = r2.length()
            if (r7 >= r8) goto L4b
            int r8 = r2.getIndexInTrackGroup(r7)
            r5[r7] = r8
            int r7 = r7 + 1
            goto L3c
        L4b:
            java.util.Arrays.sort(r5)
            r2 = r3[r6]
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r2 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r2
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r2 = r2.representations
            int r2 = r2.size()
            r7 = 0
            r8 = 0
        L5e:
            if (r6 >= r4) goto L13
            r9 = r5[r6]
        L62:
            int r10 = r8 + r2
            if (r9 < r10) goto L78
            int r7 = r7 + 1
            r2 = r3[r7]
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r2 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r2
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r2 = r2.representations
            int r2 = r2.size()
            r8 = r10
            goto L62
        L78:
            com.google.android.exoplayer2.offline.StreamKey r10 = new com.google.android.exoplayer2.offline.StreamKey
            int r11 = r13.periodIndex
            r12 = r3[r7]
            int r9 = r9 - r8
            r10.<init>(r11, r12, r9)
            r1.add(r10)
            int r6 = r6 + 1
            goto L5e
        L88:
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            r1 = this;
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.trackGroups
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
            r1 = this;
            com.google.android.exoplayer2.upstream.LoaderErrorThrower r0 = r1.manifestLoaderErrorThrower
            r0.maybeThrowError()
            return
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
            r0 = this;
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream) r1
            r0.onContinueLoadingRequested(r1)
            return
    }

    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource> r1) {
            r0 = this;
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.callback
            r1.onContinueLoadingRequested(r0)
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback
    public synchronized void onSampleStreamReleased(com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>, com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler> r0 = r1.trackEmsgHandlerBySampleStream     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L10
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler r2 = (com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler) r2     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Le
            r2.release()     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
            r0 = this;
            r0.callback = r1
            r1.onPrepared(r0)
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
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r0 = r4.playerEmsgHandler
            r0.release()
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] r0 = r4.sampleStreams
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L13
            r3 = r0[r2]
            r3.release(r4)
            int r2 = r2 + 1
            goto L9
        L13:
            r0 = 0
            r4.callback = r0
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long r6) {
            r5 = this;
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] r0 = r5.sampleStreams
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto Lf
            r4 = r0[r3]
            r4.seekToUs(r6)
            int r3 = r3 + 1
            goto L5
        Lf:
            com.google.android.exoplayer2.source.dash.EventSampleStream[] r0 = r5.eventSampleStreams
            int r1 = r0.length
        L12:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            r3.seekToUs(r6)
            int r2 = r2 + 1
            goto L12
        L1c:
            return r6
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r8, boolean[] r9, com.google.android.exoplayer2.source.SampleStream[] r10, boolean[] r11, long r12) {
            r7 = this;
            int[] r6 = r7.getStreamIndexToTrackGroupIndex(r8)
            r7.releaseDisabledStreams(r8, r9, r10)
            r7.releaseOrphanEmbeddedStreams(r8, r10, r6)
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r0.selectNewStreams(r1, r2, r3, r4, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r11 = r10.length
            r0 = 0
        L1e:
            if (r0 >= r11) goto L38
            r1 = r10[r0]
            boolean r2 = r1 instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream
            if (r2 == 0) goto L2c
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream r1 = (com.google.android.exoplayer2.source.chunk.ChunkSampleStream) r1
            r8.add(r1)
            goto L35
        L2c:
            boolean r2 = r1 instanceof com.google.android.exoplayer2.source.dash.EventSampleStream
            if (r2 == 0) goto L35
            com.google.android.exoplayer2.source.dash.EventSampleStream r1 = (com.google.android.exoplayer2.source.dash.EventSampleStream) r1
            r9.add(r1)
        L35:
            int r0 = r0 + 1
            goto L1e
        L38:
            int r10 = r8.size()
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream[] r10 = newSampleStreamArray(r10)
            r7.sampleStreams = r10
            r8.toArray(r10)
            int r8 = r9.size()
            com.google.android.exoplayer2.source.dash.EventSampleStream[] r8 = new com.google.android.exoplayer2.source.dash.EventSampleStream[r8]
            r7.eventSampleStreams = r8
            r9.toArray(r8)
            com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory r8 = r7.compositeSequenceableLoaderFactory
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] r9 = r7.sampleStreams
            com.google.android.exoplayer2.source.SequenceableLoader r8 = r8.createCompositeSequenceableLoader(r9)
            r7.compositeSequenceableLoader = r8
            return r12
    }

    public void updateManifest(com.google.android.exoplayer2.source.dash.manifest.DashManifest r10, int r11) {
            r9 = this;
            r9.manifest = r10
            r9.periodIndex = r11
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r0 = r9.playerEmsgHandler
            r0.updateManifest(r10)
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.DashChunkSource>[] r0 = r9.sampleStreams
            r1 = 0
            if (r0 == 0) goto L25
            int r2 = r0.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L20
            r4 = r0[r3]
            com.google.android.exoplayer2.source.chunk.ChunkSource r4 = r4.getChunkSource()
            com.google.android.exoplayer2.source.dash.DashChunkSource r4 = (com.google.android.exoplayer2.source.dash.DashChunkSource) r4
            r4.updateManifest(r10, r11)
            int r3 = r3 + 1
            goto L10
        L20:
            com.google.android.exoplayer2.source.MediaPeriod$Callback r0 = r9.callback
            r0.onContinueLoadingRequested(r9)
        L25:
            com.google.android.exoplayer2.source.dash.manifest.Period r0 = r10.getPeriod(r11)
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r0 = r0.eventStreams
            r9.eventStreams = r0
            com.google.android.exoplayer2.source.dash.EventSampleStream[] r0 = r9.eventSampleStreams
            int r2 = r0.length
            r3 = 0
        L31:
            if (r3 >= r2) goto L69
            r4 = r0[r3]
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r5 = r9.eventStreams
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r5.next()
            com.google.android.exoplayer2.source.dash.manifest.EventStream r6 = (com.google.android.exoplayer2.source.dash.manifest.EventStream) r6
            java.lang.String r7 = r6.id()
            java.lang.String r8 = r4.eventStreamId()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3b
            int r5 = r10.getPeriodCount()
            r7 = 1
            int r5 = r5 - r7
            boolean r8 = r10.dynamic
            if (r8 == 0) goto L62
            if (r11 != r5) goto L62
            goto L63
        L62:
            r7 = 0
        L63:
            r4.updateEventStream(r6, r7)
        L66:
            int r3 = r3 + 1
            goto L31
        L69:
            return
    }
}
