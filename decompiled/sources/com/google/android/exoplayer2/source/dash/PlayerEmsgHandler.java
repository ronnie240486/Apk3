package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerEmsgHandler implements android.os.Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final com.google.android.exoplayer2.upstream.Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private final com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder decoder;
    private long expiredManifestPublishTimeUs;
    private final android.os.Handler handler;
    private boolean isWaitingForManifestRefresh;
    private com.google.android.exoplayer2.source.dash.manifest.DashManifest manifest;
    private final java.util.TreeMap<java.lang.Long, java.lang.Long> manifestPublishTimeToExpiryTimeUs;
    private final com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private boolean released;

    public static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.eventTimeUs = r1
                r0.manifestPublishTimeMsInEmsg = r3
                return
        }
    }

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long r1);

        void onDashManifestRefreshRequested();
    }

    public final class PlayerTrackEmsgHandler implements com.google.android.exoplayer2.extractor.TrackOutput {
        private final com.google.android.exoplayer2.metadata.MetadataInputBuffer buffer;
        private final com.google.android.exoplayer2.FormatHolder formatHolder;
        private long maxLoadedChunkEndTimeUs;
        private final com.google.android.exoplayer2.source.SampleQueue sampleQueue;
        public final /* synthetic */ com.google.android.exoplayer2.source.dash.PlayerEmsgHandler this$0;

        public PlayerTrackEmsgHandler(com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r1, com.google.android.exoplayer2.upstream.Allocator r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.android.exoplayer2.source.SampleQueue r1 = com.google.android.exoplayer2.source.SampleQueue.createWithoutDrm(r2)
                r0.sampleQueue = r1
                com.google.android.exoplayer2.FormatHolder r1 = new com.google.android.exoplayer2.FormatHolder
                r1.<init>()
                r0.formatHolder = r1
                com.google.android.exoplayer2.metadata.MetadataInputBuffer r1 = new com.google.android.exoplayer2.metadata.MetadataInputBuffer
                r1.<init>()
                r0.buffer = r1
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0.maxLoadedChunkEndTimeUs = r1
                return
        }

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.metadata.MetadataInputBuffer dequeueSample() {
                r4 = this;
                com.google.android.exoplayer2.metadata.MetadataInputBuffer r0 = r4.buffer
                r0.clear()
                com.google.android.exoplayer2.source.SampleQueue r0 = r4.sampleQueue
                com.google.android.exoplayer2.FormatHolder r1 = r4.formatHolder
                com.google.android.exoplayer2.metadata.MetadataInputBuffer r2 = r4.buffer
                r3 = 0
                int r0 = r0.read(r1, r2, r3, r3)
                r1 = -4
                if (r0 != r1) goto L1b
                com.google.android.exoplayer2.metadata.MetadataInputBuffer r0 = r4.buffer
                r0.flip()
                com.google.android.exoplayer2.metadata.MetadataInputBuffer r0 = r4.buffer
                return r0
            L1b:
                r0 = 0
                return r0
        }

        private void onManifestExpiredMessageEncountered(long r2, long r4) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$ManifestExpiryEventInfo r0 = new com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$ManifestExpiryEventInfo
                r0.<init>(r2, r4)
                com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r2 = r1.this$0
                android.os.Handler r2 = com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.access$300(r2)
                com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r3 = r1.this$0
                android.os.Handler r3 = com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.access$300(r3)
                r4 = 1
                android.os.Message r3 = r3.obtainMessage(r4, r0)
                r2.sendMessage(r3)
                return
        }

        private void parseAndDiscardSamples() {
                r5 = this;
            L0:
                com.google.android.exoplayer2.source.SampleQueue r0 = r5.sampleQueue
                r1 = 0
                boolean r0 = r0.isReady(r1)
                if (r0 == 0) goto L33
                com.google.android.exoplayer2.metadata.MetadataInputBuffer r0 = r5.dequeueSample()
                if (r0 != 0) goto L10
                goto L0
            L10:
                long r2 = r0.timeUs
                com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r4 = r5.this$0
                com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder r4 = com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.access$000(r4)
                com.google.android.exoplayer2.metadata.Metadata r0 = r4.decode(r0)
                if (r0 != 0) goto L1f
                goto L0
            L1f:
                com.google.android.exoplayer2.metadata.Metadata$Entry r0 = r0.get(r1)
                com.google.android.exoplayer2.metadata.emsg.EventMessage r0 = (com.google.android.exoplayer2.metadata.emsg.EventMessage) r0
                java.lang.String r1 = r0.schemeIdUri
                java.lang.String r4 = r0.value
                boolean r1 = com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.access$100(r1, r4)
                if (r1 == 0) goto L0
                r5.parsePlayerEmsgEvent(r2, r0)
                goto L0
            L33:
                com.google.android.exoplayer2.source.SampleQueue r0 = r5.sampleQueue
                r0.discardToRead()
                return
        }

        private void parsePlayerEmsgEvent(long r5, com.google.android.exoplayer2.metadata.emsg.EventMessage r7) {
                r4 = this;
                long r0 = com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.access$200(r7)
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto Le
                return
            Le:
                r4.onManifestExpiredMessageEncountered(r5, r0)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(com.google.android.exoplayer2.Format r2) {
                r1 = this;
                com.google.android.exoplayer2.source.SampleQueue r0 = r1.sampleQueue
                r0.format(r2)
                return
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long r2) {
                r1 = this;
                com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r0 = r1.this$0
                boolean r2 = r0.maybeRefreshManifestBeforeLoadingNextChunk(r2)
                return r2
        }

        public void onChunkLoadCompleted(com.google.android.exoplayer2.source.chunk.Chunk r6) {
                r5 = this;
                long r0 = r5.maxLoadedChunkEndTimeUs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                long r2 = r6.endTimeUs
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L15
            L11:
                long r0 = r6.endTimeUs
                r5.maxLoadedChunkEndTimeUs = r0
            L15:
                com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r6 = r5.this$0
                r6.onChunkLoadCompleted()
                return
        }

        public boolean onChunkLoadError(com.google.android.exoplayer2.source.chunk.Chunk r6) {
                r5 = this;
                long r0 = r5.maxLoadedChunkEndTimeUs
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L13
                long r2 = r6.startTimeUs
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 >= 0) goto L13
                r6 = 1
                goto L14
            L13:
                r6 = 0
            L14:
                com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r0 = r5.this$0
                boolean r6 = r0.onChunkLoadError(r6)
                return r6
        }

        public void release() {
                r1 = this;
                com.google.android.exoplayer2.source.SampleQueue r0 = r1.sampleQueue
                r0.release()
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final /* synthetic */ int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3) {
                r0 = this;
                int r1 = com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(com.google.android.exoplayer2.upstream.DataReader r1, int r2, boolean r3, int r4) throws java.io.IOException {
                r0 = this;
                com.google.android.exoplayer2.source.SampleQueue r4 = r0.sampleQueue
                int r1 = r4.sampleData(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final /* synthetic */ void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.extractor.TrackOutput.CC.$default$sampleData(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r1, int r2, int r3) {
                r0 = this;
                com.google.android.exoplayer2.source.SampleQueue r3 = r0.sampleQueue
                r3.sampleData(r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long r8, int r10, int r11, int r12, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r13) {
                r7 = this;
                com.google.android.exoplayer2.source.SampleQueue r0 = r7.sampleQueue
                r1 = r8
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.sampleMetadata(r1, r3, r4, r5, r6)
                r7.parseAndDiscardSamples()
                return
        }
    }

    public PlayerEmsgHandler(com.google.android.exoplayer2.source.dash.manifest.DashManifest r1, com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback r2, com.google.android.exoplayer2.upstream.Allocator r3) {
            r0 = this;
            r0.<init>()
            r0.manifest = r1
            r0.playerEmsgCallback = r2
            r0.allocator = r3
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r0.manifestPublishTimeToExpiryTimeUs = r1
            android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper(r0)
            r0.handler = r1
            com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder r1 = new com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder
            r1.<init>()
            r0.decoder = r1
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder access$000(com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r0) {
            com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder r0 = r0.decoder
            return r0
    }

    public static /* synthetic */ boolean access$100(java.lang.String r0, java.lang.String r1) {
            boolean r0 = isPlayerEmsgEvent(r0, r1)
            return r0
    }

    public static /* synthetic */ long access$200(com.google.android.exoplayer2.metadata.emsg.EventMessage r2) {
            long r0 = getManifestPublishTimeMsInEmsg(r2)
            return r0
    }

    public static /* synthetic */ android.os.Handler access$300(com.google.android.exoplayer2.source.dash.PlayerEmsgHandler r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    @androidx.annotation.Nullable
    private java.util.Map.Entry<java.lang.Long, java.lang.Long> ceilingExpiryEntryForPublishTime(long r2) {
            r1 = this;
            java.util.TreeMap<java.lang.Long, java.lang.Long> r0 = r1.manifestPublishTimeToExpiryTimeUs
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.Map$Entry r2 = r0.ceilingEntry(r2)
            return r2
    }

    private static long getManifestPublishTimeMsInEmsg(com.google.android.exoplayer2.metadata.emsg.EventMessage r2) {
            byte[] r2 = r2.messageData     // Catch: com.google.android.exoplayer2.ParserException -> Lb
            java.lang.String r2 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r2)     // Catch: com.google.android.exoplayer2.ParserException -> Lb
            long r0 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r2)     // Catch: com.google.android.exoplayer2.ParserException -> Lb
            return r0
        Lb:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    private void handleManifestExpiredMessage(long r4, long r6) {
            r3 = this;
            java.util.TreeMap<java.lang.Long, java.lang.Long> r0 = r3.manifestPublishTimeToExpiryTimeUs
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L1c
            java.util.TreeMap<java.lang.Long, java.lang.Long> r0 = r3.manifestPublishTimeToExpiryTimeUs
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.put(r6, r4)
            goto L31
        L1c:
            long r0 = r0.longValue()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L31
            java.util.TreeMap<java.lang.Long, java.lang.Long> r0 = r3.manifestPublishTimeToExpiryTimeUs
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.put(r6, r4)
        L31:
            return
    }

    private static boolean isPlayerEmsgEvent(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "urn:mpeg:dash:event:2012"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L23
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            java.lang.String r1 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            java.lang.String r1 = "3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L23
        L21:
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
            r1 = this;
            boolean r0 = r1.chunkLoadedCompletedSinceLastManifestRefreshRequest
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            r1.isWaitingForManifestRefresh = r0
            r0 = 0
            r1.chunkLoadedCompletedSinceLastManifestRefreshRequest = r0
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerEmsgCallback r0 = r1.playerEmsgCallback
            r0.onDashManifestRefreshRequested()
            return
    }

    private void notifyManifestPublishTimeExpired() {
            r3 = this;
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerEmsgCallback r0 = r3.playerEmsgCallback
            long r1 = r3.expiredManifestPublishTimeUs
            r0.onDashManifestPublishTimeExpired(r1)
            return
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
            r6 = this;
            java.util.TreeMap<java.lang.Long, java.lang.Long> r0 = r6.manifestPublishTimeToExpiryTimeUs
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r3 = r6.manifest
            long r3 = r3.publishTimeMs
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto La
            r0.remove()
            goto La
        L2c:
            return
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r7) {
            r6 = this;
            boolean r0 = r6.released
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r7.what
            if (r0 == r1) goto Lc
            r7 = 0
            return r7
        Lc:
            java.lang.Object r7 = r7.obj
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$ManifestExpiryEventInfo r7 = (com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.ManifestExpiryEventInfo) r7
            long r2 = r7.eventTimeUs
            long r4 = r7.manifestPublishTimeMsInEmsg
            r6.handleManifestExpiredMessage(r2, r4)
            return r1
    }

    public final boolean maybeRefreshManifestBeforeLoadingNextChunk(long r7) {
            r6 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r6.manifest
            boolean r1 = r0.dynamic
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            boolean r1 = r6.isWaitingForManifestRefresh
            r3 = 1
            if (r1 == 0) goto Le
            return r3
        Le:
            long r0 = r0.publishTimeMs
            java.util.Map$Entry r0 = r6.ceilingExpiryEntryForPublishTime(r0)
            if (r0 == 0) goto L34
            java.lang.Object r1 = r0.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L34
            java.lang.Object r7 = r0.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            r6.expiredManifestPublishTimeUs = r7
            r6.notifyManifestPublishTimeExpired()
            r2 = 1
        L34:
            if (r2 == 0) goto L39
            r6.maybeNotifyDashManifestRefreshNeeded()
        L39:
            return r2
    }

    public com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
            r2 = this;
            com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler r0 = new com.google.android.exoplayer2.source.dash.PlayerEmsgHandler$PlayerTrackEmsgHandler
            com.google.android.exoplayer2.upstream.Allocator r1 = r2.allocator
            r0.<init>(r2, r1)
            return r0
    }

    public final void onChunkLoadCompleted() {
            r1 = this;
            r0 = 1
            r1.chunkLoadedCompletedSinceLastManifestRefreshRequest = r0
            return
    }

    public final boolean onChunkLoadError(boolean r4) {
            r3 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = r3.manifest
            boolean r0 = r0.dynamic
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r3.isWaitingForManifestRefresh
            r2 = 1
            if (r0 == 0) goto Le
            return r2
        Le:
            if (r4 == 0) goto L14
            r3.maybeNotifyDashManifestRefreshNeeded()
            return r2
        L14:
            return r1
    }

    public void release() {
            r2 = this;
            r0 = 1
            r2.released = r0
            android.os.Handler r0 = r2.handler
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    public void updateManifest(com.google.android.exoplayer2.source.dash.manifest.DashManifest r3) {
            r2 = this;
            r0 = 0
            r2.isWaitingForManifestRefresh = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.expiredManifestPublishTimeUs = r0
            r2.manifest = r3
            r2.removePreviouslyExpiredManifestPublishTimeValues()
            return
    }
}
