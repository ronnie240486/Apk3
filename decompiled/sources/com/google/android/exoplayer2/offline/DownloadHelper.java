package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadHelper {
    public static final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = null;
    private com.google.android.exoplayer2.offline.DownloadHelper.Callback callback;
    private final android.os.Handler callbackHandler;
    private java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration;
    private com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer mediaPreparer;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.source.MediaSource mediaSource;
    private final com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilities;
    private final android.util.SparseIntArray scratchSet;
    private com.google.android.exoplayer2.source.TrackGroupArray[] trackGroupArrays;
    private java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector trackSelector;
    private final com.google.android.exoplayer2.Timeline.Window window;



    /* JADX INFO: loaded from: classes3.dex */
    public interface Callback {
        void onPrepareError(com.google.android.exoplayer2.offline.DownloadHelper r1, java.io.IOException r2);

        void onPrepared(com.google.android.exoplayer2.offline.DownloadHelper r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class DownloadTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {

        public static final class Factory implements com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory {
            private Factory() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Factory(com.google.android.exoplayer2.offline.DownloadHelper.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
            public com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r3, com.google.android.exoplayer2.upstream.BandwidthMeter r4, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r5, com.google.android.exoplayer2.Timeline r6) {
                    r2 = this;
                    int r4 = r3.length
                    com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r4 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r4]
                    r5 = 0
                L4:
                    int r6 = r3.length
                    if (r5 >= r6) goto L1f
                    r6 = r3[r5]
                    if (r6 != 0) goto Ld
                    r6 = 0
                    goto L1a
                Ld:
                    com.google.android.exoplayer2.offline.DownloadHelper$DownloadTrackSelection r6 = new com.google.android.exoplayer2.offline.DownloadHelper$DownloadTrackSelection
                    r0 = r3[r5]
                    com.google.android.exoplayer2.source.TrackGroup r0 = r0.group
                    r1 = r3[r5]
                    int[] r1 = r1.tracks
                    r6.<init>(r0, r1)
                L1a:
                    r4[r5] = r6
                    int r5 = r5 + 1
                    goto L4
                L1f:
                    return r4
            }
        }

        public DownloadTrackSelection(com.google.android.exoplayer2.source.TrackGroup r1, int[] r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @androidx.annotation.Nullable
        public java.lang.Object getSelectionData() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long r1, long r3, long r5, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r7, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r8) {
                r0 = this;
                return
        }
    }

    public static final class FakeBandwidthMeter implements com.google.android.exoplayer2.upstream.BandwidthMeter {
        private FakeBandwidthMeter() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ FakeBandwidthMeter(com.google.android.exoplayer2.offline.DownloadHelper.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void addEventListener(android.os.Handler r1, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r2) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public long getBitrateEstimate() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public final /* synthetic */ long getTimeToFirstByteEstimateUs() {
                r2 = this;
                long r0 = com.google.android.exoplayer2.upstream.BandwidthMeter.CC.$default$getTimeToFirstByteEstimateUs(r2)
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.upstream.TransferListener getTransferListener() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void removeEventListener(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LiveContentUnsupportedException extends java.io.IOException {
        public LiveContentUnsupportedException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class MediaPreparer implements com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller, com.google.android.exoplayer2.source.MediaPeriod.Callback, android.os.Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 1;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 0;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final com.google.android.exoplayer2.upstream.Allocator allocator;
        private final com.google.android.exoplayer2.offline.DownloadHelper downloadHelper;
        private final android.os.Handler downloadHelperHandler;
        public com.google.android.exoplayer2.source.MediaPeriod[] mediaPeriods;
        private final com.google.android.exoplayer2.source.MediaSource mediaSource;
        private final android.os.Handler mediaSourceHandler;
        private final android.os.HandlerThread mediaSourceThread;
        private final java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> pendingMediaPeriods;
        private boolean released;
        public com.google.android.exoplayer2.Timeline timeline;

        public static /* synthetic */ boolean $r8$lambda$Db71ShN3QybOcTYlOayKmy_uYGE(com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer r0, android.os.Message r1) {
                boolean r0 = r0.handleDownloadHelperCallbackMessage(r1)
                return r0
        }

        public MediaPreparer(com.google.android.exoplayer2.source.MediaSource r2, com.google.android.exoplayer2.offline.DownloadHelper r3) {
                r1 = this;
                r1.<init>()
                r1.mediaSource = r2
                r1.downloadHelper = r3
                com.google.android.exoplayer2.upstream.DefaultAllocator r2 = new com.google.android.exoplayer2.upstream.DefaultAllocator
                r3 = 1
                r0 = 65536(0x10000, float:9.1835E-41)
                r2.<init>(r3, r0)
                r1.allocator = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.pendingMediaPeriods = r2
                com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.offline.DownloadManager$$ExternalSyntheticLambda0
                r2.<init>(r1, r3)
                android.os.Handler r2 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper(r2)
                r1.downloadHelperHandler = r2
                android.os.HandlerThread r2 = new android.os.HandlerThread
                java.lang.String r3 = "ExoPlayer:DownloadHelper"
                r2.<init>(r3)
                r1.mediaSourceThread = r2
                r2.start()
                android.os.Looper r2 = r2.getLooper()
                android.os.Handler r2 = com.google.android.exoplayer2.util.Util.createHandler(r2, r1)
                r1.mediaSourceHandler = r2
                r3 = 0
                r2.sendEmptyMessage(r3)
                return
        }

        private boolean handleDownloadHelperCallbackMessage(android.os.Message r4) {
                r3 = this;
                boolean r0 = r3.released
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                int r0 = r4.what
                r2 = 1
                if (r0 == 0) goto L1f
                if (r0 == r2) goto Le
                return r1
            Le:
                r3.release()
                com.google.android.exoplayer2.offline.DownloadHelper r0 = r3.downloadHelper
                java.lang.Object r4 = r4.obj
                java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)
                java.io.IOException r4 = (java.io.IOException) r4
                com.google.android.exoplayer2.offline.DownloadHelper.access$300(r0, r4)
                return r2
            L1f:
                com.google.android.exoplayer2.offline.DownloadHelper r4 = r3.downloadHelper     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L25
                com.google.android.exoplayer2.offline.DownloadHelper.access$200(r4)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L25
                goto L34
            L25:
                r4 = move-exception
                android.os.Handler r0 = r3.downloadHelperHandler
                java.io.IOException r1 = new java.io.IOException
                r1.<init>(r4)
                android.os.Message r4 = r0.obtainMessage(r2, r1)
                r4.sendToTarget()
            L34:
                return r2
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r7) {
                r6 = this;
                int r0 = r7.what
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L76
                r3 = 0
                if (r0 == r2) goto L43
                r4 = 2
                if (r0 == r4) goto L31
                r7 = 3
                if (r0 == r7) goto L10
                return r3
            L10:
                com.google.android.exoplayer2.source.MediaPeriod[] r7 = r6.mediaPeriods
                if (r7 == 0) goto L21
                int r0 = r7.length
            L15:
                if (r3 >= r0) goto L21
                r4 = r7[r3]
                com.google.android.exoplayer2.source.MediaSource r5 = r6.mediaSource
                r5.releasePeriod(r4)
                int r3 = r3 + 1
                goto L15
            L21:
                com.google.android.exoplayer2.source.MediaSource r7 = r6.mediaSource
                r7.releaseSource(r6)
                android.os.Handler r7 = r6.mediaSourceHandler
                r7.removeCallbacksAndMessages(r1)
                android.os.HandlerThread r7 = r6.mediaSourceThread
                r7.quit()
                return r2
            L31:
                java.lang.Object r7 = r7.obj
                com.google.android.exoplayer2.source.MediaPeriod r7 = (com.google.android.exoplayer2.source.MediaPeriod) r7
                java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r0 = r6.pendingMediaPeriods
                boolean r0 = r0.contains(r7)
                if (r0 == 0) goto L42
                r0 = 0
                r7.continueLoading(r0)
            L42:
                return r2
            L43:
                com.google.android.exoplayer2.source.MediaPeriod[] r7 = r6.mediaPeriods     // Catch: java.io.IOException -> L6b
                if (r7 != 0) goto L4d
                com.google.android.exoplayer2.source.MediaSource r7 = r6.mediaSource     // Catch: java.io.IOException -> L6b
                r7.maybeThrowSourceInfoRefreshError()     // Catch: java.io.IOException -> L6b
                goto L63
            L4d:
                java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r7 = r6.pendingMediaPeriods     // Catch: java.io.IOException -> L6b
                int r7 = r7.size()     // Catch: java.io.IOException -> L6b
                if (r3 >= r7) goto L63
                java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r7 = r6.pendingMediaPeriods     // Catch: java.io.IOException -> L6b
                java.lang.Object r7 = r7.get(r3)     // Catch: java.io.IOException -> L6b
                com.google.android.exoplayer2.source.MediaPeriod r7 = (com.google.android.exoplayer2.source.MediaPeriod) r7     // Catch: java.io.IOException -> L6b
                r7.maybeThrowPrepareError()     // Catch: java.io.IOException -> L6b
                int r3 = r3 + 1
                goto L4d
            L63:
                android.os.Handler r7 = r6.mediaSourceHandler     // Catch: java.io.IOException -> L6b
                r0 = 100
                r7.sendEmptyMessageDelayed(r2, r0)     // Catch: java.io.IOException -> L6b
                goto L75
            L6b:
                r7 = move-exception
                android.os.Handler r0 = r6.downloadHelperHandler
                android.os.Message r7 = r0.obtainMessage(r2, r7)
                r7.sendToTarget()
            L75:
                return r2
            L76:
                com.google.android.exoplayer2.source.MediaSource r7 = r6.mediaSource
                com.google.android.exoplayer2.analytics.PlayerId r0 = com.google.android.exoplayer2.analytics.PlayerId.UNSET
                r7.prepareSource(r6, r1, r0)
                android.os.Handler r7 = r6.mediaSourceHandler
                r7.sendEmptyMessage(r2)
                return r2
        }

        public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r3) {
                r2 = this;
                java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r0 = r2.pendingMediaPeriods
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L12
                android.os.Handler r0 = r2.mediaSourceHandler
                r1 = 2
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
            L12:
                return
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public /* bridge */ /* synthetic */ void onContinueLoadingRequested(com.google.android.exoplayer2.source.SequenceableLoader r1) {
                r0 = this;
                com.google.android.exoplayer2.source.MediaPeriod r1 = (com.google.android.exoplayer2.source.MediaPeriod) r1
                r0.onContinueLoadingRequested(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod r2) {
                r1 = this;
                java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r0 = r1.pendingMediaPeriods
                r0.remove(r2)
                java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r2 = r1.pendingMediaPeriods
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L19
                android.os.Handler r2 = r1.mediaSourceHandler
                r0 = 1
                r2.removeMessages(r0)
                android.os.Handler r2 = r1.downloadHelperHandler
                r0 = 0
                r2.sendEmptyMessage(r0)
            L19:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource r7, com.google.android.exoplayer2.Timeline r8) {
                r6 = this;
                com.google.android.exoplayer2.Timeline r7 = r6.timeline
                if (r7 == 0) goto L5
                return
            L5:
                com.google.android.exoplayer2.Timeline$Window r7 = new com.google.android.exoplayer2.Timeline$Window
                r7.<init>()
                r0 = 0
                com.google.android.exoplayer2.Timeline$Window r7 = r8.getWindow(r0, r7)
                boolean r7 = r7.isLive()
                if (r7 == 0) goto L25
                android.os.Handler r7 = r6.downloadHelperHandler
                com.google.android.exoplayer2.offline.DownloadHelper$LiveContentUnsupportedException r8 = new com.google.android.exoplayer2.offline.DownloadHelper$LiveContentUnsupportedException
                r8.<init>()
                r0 = 1
                android.os.Message r7 = r7.obtainMessage(r0, r8)
                r7.sendToTarget()
                return
            L25:
                r6.timeline = r8
                int r7 = r8.getPeriodCount()
                com.google.android.exoplayer2.source.MediaPeriod[] r7 = new com.google.android.exoplayer2.source.MediaPeriod[r7]
                r6.mediaPeriods = r7
                r7 = 0
            L30:
                com.google.android.exoplayer2.source.MediaPeriod[] r1 = r6.mediaPeriods
                int r2 = r1.length
                r3 = 0
                if (r7 >= r2) goto L54
                com.google.android.exoplayer2.source.MediaSource r1 = r6.mediaSource
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
                java.lang.Object r5 = r8.getUidOfPeriod(r7)
                r2.<init>(r5)
                com.google.android.exoplayer2.upstream.Allocator r5 = r6.allocator
                com.google.android.exoplayer2.source.MediaPeriod r1 = r1.createPeriod(r2, r5, r3)
                com.google.android.exoplayer2.source.MediaPeriod[] r2 = r6.mediaPeriods
                r2[r7] = r1
                java.util.ArrayList<com.google.android.exoplayer2.source.MediaPeriod> r2 = r6.pendingMediaPeriods
                r2.add(r1)
                int r7 = r7 + 1
                goto L30
            L54:
                int r7 = r1.length
            L55:
                if (r0 >= r7) goto L5f
                r8 = r1[r0]
                r8.prepare(r6, r3)
                int r0 = r0 + 1
                goto L55
            L5f:
                return
        }

        public void release() {
                r2 = this;
                boolean r0 = r2.released
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.released = r0
                android.os.Handler r0 = r2.mediaSourceHandler
                r1 = 3
                r0.sendEmptyMessage(r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$AFT3qEpErkkKjrNw8hXZ_Xi8P68(com.google.android.exoplayer2.metadata.Metadata r0) {
            lambda$getRendererCapabilities$1(r0)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$KeStGaF2-KHebvcVcqEmpDq4A5Q, reason: not valid java name */
    public static /* synthetic */ void m230$r8$lambda$KeStGaF2KHebvcVcqEmpDq4A5Q(com.google.android.exoplayer2.offline.DownloadHelper r0) {
            r0.lambda$onMediaPrepared$4()
            return
    }

    public static /* synthetic */ void $r8$lambda$MY46M7IxuWh3va1M0Vu1EOnSN9I(com.google.android.exoplayer2.offline.DownloadHelper r0, java.io.IOException r1) {
            r0.lambda$onMediaPreparationFailed$5(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$No6hHk5oE1HQ-shDhmuOwRKi3BA, reason: not valid java name */
    public static /* synthetic */ void m231$r8$lambda$No6hHk5oE1HQshDhmuOwRKi3BA() {
            lambda$new$2()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ba6-DXsfLkglbkXSOAETQJ40Qmo, reason: not valid java name */
    public static /* synthetic */ void m232$r8$lambda$ba6DXsfLkglbkXSOAETQJ40Qmo(com.google.android.exoplayer2.text.CueGroup r0) {
            lambda$getRendererCapabilities$0(r0)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.drm.DrmSessionManager $r8$lambda$f9y5C0K7Fo6iTCuv60unBCuPs2Y(com.google.android.exoplayer2.drm.DrmSessionManager r0, com.google.android.exoplayer2.MediaItem r1) {
            com.google.android.exoplayer2.drm.DrmSessionManager r0 = lambda$createMediaSourceInternal$6(r0, r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$n824A1oj6IOjH0FRR1dWusSkZrk(com.google.android.exoplayer2.offline.DownloadHelper r0, com.google.android.exoplayer2.offline.DownloadHelper.Callback r1) {
            r0.lambda$prepare$3(r1)
            return
    }

    static {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.buildUpon()
            r1 = 1
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.setForceHighestSupportedBitrate(r1)
            r1 = 0
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.setConstrainAudioChannelCountToDeviceCapabilities(r1)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r0.build()
            com.google.android.exoplayer2.offline.DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = r0
            return
    }

    public DownloadHelper(com.google.android.exoplayer2.MediaItem r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource r3, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4, com.google.android.exoplayer2.RendererCapabilities[] r5) {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r2 = r2.localConfiguration
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r2 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r2
            r1.localConfiguration = r2
            r1.mediaSource = r3
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r2 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
            com.google.android.exoplayer2.offline.DownloadHelper$DownloadTrackSelection$Factory r3 = new com.google.android.exoplayer2.offline.DownloadHelper$DownloadTrackSelection$Factory
            r0 = 0
            r3.<init>(r0)
            r2.<init>(r4, r3)
            r1.trackSelector = r2
            r1.rendererCapabilities = r5
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            r1.scratchSet = r3
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0 r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.INSTANCE
            com.google.android.exoplayer2.offline.DownloadHelper$FakeBandwidthMeter r4 = new com.google.android.exoplayer2.offline.DownloadHelper$FakeBandwidthMeter
            r4.<init>(r0)
            r2.init(r3, r4)
            android.os.Handler r2 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper()
            r1.callbackHandler = r2
            com.google.android.exoplayer2.Timeline$Window r2 = new com.google.android.exoplayer2.Timeline$Window
            r2.<init>()
            r1.window = r2
            return
    }

    public static /* synthetic */ void access$200(com.google.android.exoplayer2.offline.DownloadHelper r0) throws com.google.android.exoplayer2.ExoPlaybackException {
            r0.onMediaPrepared()
            return
    }

    public static /* synthetic */ void access$300(com.google.android.exoplayer2.offline.DownloadHelper r0, java.io.IOException r1) {
            r0.onMediaPreparationFailed(r1)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void addTrackSelectionInternal(int r5, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r6) throws com.google.android.exoplayer2.ExoPlaybackException {
            r4 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r4.trackSelector
            r0.setParameters(r6)
            r4.runTrackSelection(r5)
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r6.overrides
            com.google.common.collect.ImmutableCollection r0 = r0.values()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r1
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r2 = r4.trackSelector
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r3 = r6.buildUpon()
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r1 = r3.setOverrideForType(r1)
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = r1.build()
            r2.setParameters(r1)
            r4.runTrackSelection(r5)
            goto L12
        L33:
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithMedia() {
            r1 = this;
            boolean r0 = r1.isPreparedWithMedia
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            return
    }

    public static com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.offline.DownloadRequest r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
            r0 = 0
            com.google.android.exoplayer2.source.MediaSource r1 = createMediaSource(r1, r2, r0)
            return r1
    }

    public static com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.offline.DownloadRequest r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager r2) {
            com.google.android.exoplayer2.MediaItem r0 = r0.toMediaItem()
            com.google.android.exoplayer2.source.MediaSource r0 = createMediaSourceInternal(r0, r1, r2)
            return r0
    }

    private static com.google.android.exoplayer2.source.MediaSource createMediaSourceInternal(com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager r4) {
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r0 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
            com.google.android.exoplayer2.extractor.ExtractorsFactory r1 = com.google.android.exoplayer2.extractor.ExtractorsFactory.EMPTY
            r0.<init>(r3, r1)
            if (r4 == 0) goto L11
            com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda0
            r3.<init>(r4)
            r0.setDrmSessionManagerProvider(r3)
        L11:
            com.google.android.exoplayer2.source.MediaSource r2 = r0.createMediaSource(r2)
            return r2
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forDash(android.content.Context r1, android.net.Uri r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, com.google.android.exoplayer2.RenderersFactory r4) {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = getDefaultTrackSelectorParameters(r1)
            r0 = 0
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forDash(r2, r3, r4, r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forDash(android.net.Uri r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2, com.google.android.exoplayer2.RenderersFactory r3, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager r4, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5) {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r1 = r0.setUri(r1)
            java.lang.String r0 = "application/dash+xml"
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setMimeType(r0)
            com.google.android.exoplayer2.MediaItem r1 = r1.build()
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r1, r5, r3, r2, r4)
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forHls(android.content.Context r1, android.net.Uri r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, com.google.android.exoplayer2.RenderersFactory r4) {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = getDefaultTrackSelectorParameters(r1)
            r0 = 0
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forHls(r2, r3, r4, r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forHls(android.net.Uri r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2, com.google.android.exoplayer2.RenderersFactory r3, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager r4, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5) {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r1 = r0.setUri(r1)
            java.lang.String r0 = "application/x-mpegURL"
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setMimeType(r0)
            com.google.android.exoplayer2.MediaItem r1 = r1.build()
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r1, r5, r3, r2, r4)
            return r1
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(android.content.Context r1, com.google.android.exoplayer2.MediaItem r2) {
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r2.localConfiguration
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r0
            boolean r0 = isProgressive(r0)
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = getDefaultTrackSelectorParameters(r1)
            r0 = 0
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r2, r1, r0, r0, r0)
            return r1
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(android.content.Context r1, com.google.android.exoplayer2.MediaItem r2, @androidx.annotation.Nullable com.google.android.exoplayer2.RenderersFactory r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource.Factory r4) {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = getDefaultTrackSelectorParameters(r1)
            r0 = 0
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r2, r1, r3, r4, r0)
            return r1
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(com.google.android.exoplayer2.MediaItem r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2, @androidx.annotation.Nullable com.google.android.exoplayer2.RenderersFactory r3, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource.Factory r4) {
            r0 = 0
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r1, r2, r3, r4, r0)
            return r1
    }

    public static com.google.android.exoplayer2.offline.DownloadHelper forMediaItem(com.google.android.exoplayer2.MediaItem r3, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4, @androidx.annotation.Nullable com.google.android.exoplayer2.RenderersFactory r5, @androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource.Factory r6, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager r7) {
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r3.localConfiguration
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r0
            boolean r0 = isProgressive(r0)
            r1 = 0
            if (r0 != 0) goto L14
            if (r6 == 0) goto L12
            goto L14
        L12:
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            com.google.android.exoplayer2.offline.DownloadHelper r2 = new com.google.android.exoplayer2.offline.DownloadHelper
            if (r0 == 0) goto L1e
            r6 = 0
            goto L28
        L1e:
            java.lang.Object r6 = com.google.android.exoplayer2.util.Util.castNonNull(r6)
            com.google.android.exoplayer2.upstream.DataSource$Factory r6 = (com.google.android.exoplayer2.upstream.DataSource.Factory) r6
            com.google.android.exoplayer2.source.MediaSource r6 = createMediaSourceInternal(r3, r6, r7)
        L28:
            if (r5 == 0) goto L2f
            com.google.android.exoplayer2.RendererCapabilities[] r5 = getRendererCapabilities(r5)
            goto L31
        L2f:
            com.google.android.exoplayer2.RendererCapabilities[] r5 = new com.google.android.exoplayer2.RendererCapabilities[r1]
        L31:
            r2.<init>(r3, r6, r4, r5)
            return r2
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forProgressive(android.content.Context r1, android.net.Uri r2) {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r2 = r0.setUri(r2)
            com.google.android.exoplayer2.MediaItem r2 = r2.build()
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forProgressive(android.content.Context r1, android.net.Uri r2, @androidx.annotation.Nullable java.lang.String r3) {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r2 = r0.setUri(r2)
            com.google.android.exoplayer2.MediaItem$Builder r2 = r2.setCustomCacheKey(r3)
            com.google.android.exoplayer2.MediaItem r2 = r2.build()
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forSmoothStreaming(android.content.Context r1, android.net.Uri r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, com.google.android.exoplayer2.RenderersFactory r4) {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = getDefaultTrackSelectorParameters(r1)
            r0 = 0
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forSmoothStreaming(r2, r3, r4, r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forSmoothStreaming(android.net.Uri r2, com.google.android.exoplayer2.upstream.DataSource.Factory r3, com.google.android.exoplayer2.RenderersFactory r4) {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = com.google.android.exoplayer2.offline.DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT
            r1 = 0
            com.google.android.exoplayer2.offline.DownloadHelper r2 = forSmoothStreaming(r2, r3, r4, r1, r0)
            return r2
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.offline.DownloadHelper forSmoothStreaming(android.net.Uri r1, com.google.android.exoplayer2.upstream.DataSource.Factory r2, com.google.android.exoplayer2.RenderersFactory r3, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager r4, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5) {
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r1 = r0.setUri(r1)
            java.lang.String r0 = "application/vnd.ms-sstr+xml"
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setMimeType(r0)
            com.google.android.exoplayer2.MediaItem r1 = r1.build()
            com.google.android.exoplayer2.offline.DownloadHelper r1 = forMediaItem(r1, r5, r3, r2, r4)
            return r1
    }

    public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(android.content.Context r1) {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.getDefaults(r1)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r1.buildUpon()
            r0 = 1
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r1.setForceHighestSupportedBitrate(r0)
            r0 = 0
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r1 = r1.setConstrainAudioChannelCountToDeviceCapabilities(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r1.build()
            return r1
    }

    public static com.google.android.exoplayer2.RendererCapabilities[] getRendererCapabilities(com.google.android.exoplayer2.RenderersFactory r6) {
            android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper()
            com.google.android.exoplayer2.offline.DownloadHelper$1 r2 = new com.google.android.exoplayer2.offline.DownloadHelper$1
            r2.<init>()
            com.google.android.exoplayer2.offline.DownloadHelper$2 r3 = new com.google.android.exoplayer2.offline.DownloadHelper$2
            r3.<init>()
            com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda2 r4 = com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda2.INSTANCE
            com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda1 r5 = com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda1.INSTANCE
            r0 = r6
            com.google.android.exoplayer2.Renderer[] r6 = r0.createRenderers(r1, r2, r3, r4, r5)
            int r0 = r6.length
            com.google.android.exoplayer2.RendererCapabilities[] r0 = new com.google.android.exoplayer2.RendererCapabilities[r0]
            r1 = 0
        L1b:
            int r2 = r6.length
            if (r1 >= r2) goto L29
            r2 = r6[r1]
            com.google.android.exoplayer2.RendererCapabilities r2 = r2.getCapabilities()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L1b
        L29:
            return r0
    }

    private static boolean isProgressive(com.google.android.exoplayer2.MediaItem.LocalConfiguration r1) {
            android.net.Uri r0 = r1.uri
            java.lang.String r1 = r1.mimeType
            int r1 = com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(r0, r1)
            r0 = 4
            if (r1 != r0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    private static /* synthetic */ com.google.android.exoplayer2.drm.DrmSessionManager lambda$createMediaSourceInternal$6(com.google.android.exoplayer2.drm.DrmSessionManager r0, com.google.android.exoplayer2.MediaItem r1) {
            return r0
    }

    private static /* synthetic */ void lambda$getRendererCapabilities$0(com.google.android.exoplayer2.text.CueGroup r0) {
            return
    }

    private static /* synthetic */ void lambda$getRendererCapabilities$1(com.google.android.exoplayer2.metadata.Metadata r0) {
            return
    }

    private static /* synthetic */ void lambda$new$2() {
            return
    }

    private /* synthetic */ void lambda$onMediaPreparationFailed$5(java.io.IOException r2) {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadHelper$Callback r0 = r1.callback
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.offline.DownloadHelper$Callback r0 = (com.google.android.exoplayer2.offline.DownloadHelper.Callback) r0
            r0.onPrepareError(r1, r2)
            return
    }

    private /* synthetic */ void lambda$onMediaPrepared$4() {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadHelper$Callback r0 = r1.callback
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.offline.DownloadHelper$Callback r0 = (com.google.android.exoplayer2.offline.DownloadHelper.Callback) r0
            r0.onPrepared(r1)
            return
    }

    private /* synthetic */ void lambda$prepare$3(com.google.android.exoplayer2.offline.DownloadHelper.Callback r1) {
            r0 = this;
            r1.onPrepared(r0)
            return
    }

    private void onMediaPreparationFailed(java.io.IOException r4) {
            r3 = this;
            android.os.Handler r0 = r3.callbackHandler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda5 r1 = new com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda5
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    private void onMediaPrepared() throws com.google.android.exoplayer2.ExoPlaybackException {
            r7 = this;
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = r7.mediaPreparer
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = r7.mediaPreparer
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r0.mediaPeriods
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = r7.mediaPreparer
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = r7.mediaPreparer
            com.google.android.exoplayer2.source.MediaPeriod[] r0 = r0.mediaPeriods
            int r0 = r0.length
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r7.rendererCapabilities
            int r1 = r1.length
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            r3[r4] = r1
            r5 = 0
            r3[r5] = r0
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r6, r3)
            java.util.List[][] r3 = (java.util.List[][]) r3
            r7.trackSelectionsByPeriodAndRenderer = r3
            int[] r2 = new int[r2]
            r2[r4] = r1
            r2[r5] = r0
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)
            java.util.List[][] r2 = (java.util.List[][]) r2
            r7.immutableTrackSelectionsByPeriodAndRenderer = r2
            r2 = 0
        L3f:
            if (r2 >= r0) goto L65
            r3 = 0
        L42:
            if (r3 >= r1) goto L62
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r4 = r7.trackSelectionsByPeriodAndRenderer
            r4 = r4[r2]
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4[r3] = r6
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r4 = r7.immutableTrackSelectionsByPeriodAndRenderer
            r4 = r4[r2]
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r6 = r7.trackSelectionsByPeriodAndRenderer
            r6 = r6[r2]
            r6 = r6[r3]
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            r4[r3] = r6
            int r3 = r3 + 1
            goto L42
        L62:
            int r2 = r2 + 1
            goto L3f
        L65:
            com.google.android.exoplayer2.source.TrackGroupArray[] r1 = new com.google.android.exoplayer2.source.TrackGroupArray[r0]
            r7.trackGroupArrays = r1
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo[] r1 = new com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo[r0]
            r7.mappedTrackInfos = r1
            r1 = 0
        L6e:
            if (r1 >= r0) goto L9c
            com.google.android.exoplayer2.source.TrackGroupArray[] r2 = r7.trackGroupArrays
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r3 = r7.mediaPreparer
            com.google.android.exoplayer2.source.MediaPeriod[] r3 = r3.mediaPeriods
            r3 = r3[r1]
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r3.getTrackGroups()
            r2[r1] = r3
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r2 = r7.runTrackSelection(r1)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r3 = r7.trackSelector
            java.lang.Object r2 = r2.info
            r3.onSelectionActivated(r2)
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo[] r2 = r7.mappedTrackInfos
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r3 = r7.trackSelector
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r3 = r3.getCurrentMappedTrackInfo()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r3 = (com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L6e
        L9c:
            r7.setPreparedWithMedia()
            android.os.Handler r0 = r7.callbackHandler
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda4
            r1.<init>(r7, r5)
            r0.post(r1)
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private com.google.android.exoplayer2.trackselection.TrackSelectorResult runTrackSelection(int r11) throws com.google.android.exoplayer2.ExoPlaybackException {
            r10 = this;
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r10.trackSelector
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r10.rendererCapabilities
            com.google.android.exoplayer2.source.TrackGroupArray[] r2 = r10.trackGroupArrays
            r2 = r2[r11]
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r4 = r10.mediaPreparer
            com.google.android.exoplayer2.Timeline r4 = r4.timeline
            java.lang.Object r4 = r4.getUidOfPeriod(r11)
            r3.<init>(r4)
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r4 = r10.mediaPreparer
            com.google.android.exoplayer2.Timeline r4 = r4.timeline
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r0 = r0.selectTracks(r1, r2, r3, r4)
            r1 = 0
            r2 = 0
        L1f:
            int r3 = r0.length
            if (r2 >= r3) goto Lae
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r3 = r0.selections
            r3 = r3[r2]
            if (r3 != 0) goto L2b
            goto Laa
        L2b:
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r4 = r10.trackSelectionsByPeriodAndRenderer
            r4 = r4[r11]
            r4 = r4[r2]
            r5 = 0
        L32:
            int r6 = r4.size()
            if (r5 >= r6) goto La4
            java.lang.Object r6 = r4.get(r5)
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r6 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection) r6
            com.google.android.exoplayer2.source.TrackGroup r7 = r6.getTrackGroup()
            com.google.android.exoplayer2.source.TrackGroup r8 = r3.getTrackGroup()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto La1
            android.util.SparseIntArray r7 = r10.scratchSet
            r7.clear()
            r7 = 0
        L52:
            int r8 = r6.length()
            if (r7 >= r8) goto L64
            android.util.SparseIntArray r8 = r10.scratchSet
            int r9 = r6.getIndexInTrackGroup(r7)
            r8.put(r9, r1)
            int r7 = r7 + 1
            goto L52
        L64:
            r7 = 0
        L65:
            int r8 = r3.length()
            if (r7 >= r8) goto L77
            android.util.SparseIntArray r8 = r10.scratchSet
            int r9 = r3.getIndexInTrackGroup(r7)
            r8.put(r9, r1)
            int r7 = r7 + 1
            goto L65
        L77:
            android.util.SparseIntArray r7 = r10.scratchSet
            int r7 = r7.size()
            int[] r7 = new int[r7]
            r8 = 0
        L80:
            android.util.SparseIntArray r9 = r10.scratchSet
            int r9 = r9.size()
            if (r8 >= r9) goto L93
            android.util.SparseIntArray r9 = r10.scratchSet
            int r9 = r9.keyAt(r8)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L80
        L93:
            com.google.android.exoplayer2.offline.DownloadHelper$DownloadTrackSelection r8 = new com.google.android.exoplayer2.offline.DownloadHelper$DownloadTrackSelection
            com.google.android.exoplayer2.source.TrackGroup r6 = r6.getTrackGroup()
            r8.<init>(r6, r7)
            r4.set(r5, r8)
            r5 = 1
            goto La5
        La1:
            int r5 = r5 + 1
            goto L32
        La4:
            r5 = 0
        La5:
            if (r5 != 0) goto Laa
            r4.add(r3)
        Laa:
            int r2 = r2 + 1
            goto L1f
        Lae:
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithMedia() {
            r1 = this;
            r0 = 1
            r1.isPreparedWithMedia = r0
            return
    }

    public void addAudioLanguagesToSelection(java.lang.String... r9) {
            r8 = this;
            r8.assertPreparedWithMedia()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = com.google.android.exoplayer2.offline.DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.buildUpon()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            r1 = 1
            r0.setForceHighestSupportedBitrate(r1)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            com.google.android.exoplayer2.RendererCapabilities[] r2 = r8.rendererCapabilities     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            int r3 = r2.length     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            r4 = 0
            r5 = 0
        L12:
            if (r5 >= r3) goto L25
            r6 = r2[r5]     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            int r6 = r6.getTrackType()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            if (r6 == r1) goto L1e
            r7 = 1
            goto L1f
        L1e:
            r7 = 0
        L1f:
            r0.setTrackTypeDisabled(r6, r7)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            int r5 = r5 + 1
            goto L12
        L25:
            int r1 = r8.getPeriodCount()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            int r2 = r9.length     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            r3 = 0
        L2b:
            if (r3 >= r2) goto L43
            r5 = r9[r3]     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r5 = r0.setPreferredAudioLanguage(r5)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r5 = r5.build()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            r6 = 0
        L38:
            if (r6 >= r1) goto L40
            r8.addTrackSelectionInternal(r6, r5)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L44
            int r6 = r6 + 1
            goto L38
        L40:
            int r3 = r3 + 1
            goto L2b
        L43:
            return
        L44:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
    }

    public void addTextLanguagesToSelection(boolean r8, java.lang.String... r9) {
            r7 = this;
            r7.assertPreparedWithMedia()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = com.google.android.exoplayer2.offline.DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.buildUpon()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            r0.setSelectUndeterminedTextLanguage(r8)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            r8 = 1
            r0.setForceHighestSupportedBitrate(r8)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r7.rendererCapabilities     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            int r2 = r1.length     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L29
            r5 = r1[r4]     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            int r5 = r5.getTrackType()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            r6 = 3
            if (r5 == r6) goto L22
            r6 = 1
            goto L23
        L22:
            r6 = 0
        L23:
            r0.setTrackTypeDisabled(r5, r6)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            int r4 = r4 + 1
            goto L15
        L29:
            int r8 = r7.getPeriodCount()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            int r1 = r9.length     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            r2 = 0
        L2f:
            if (r2 >= r1) goto L47
            r4 = r9[r2]     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r4 = r0.setPreferredTextLanguage(r4)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r4 = r4.build()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            r5 = 0
        L3c:
            if (r5 >= r8) goto L44
            r7.addTrackSelectionInternal(r5, r4)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L48
            int r5 = r5 + 1
            goto L3c
        L44:
            int r2 = r2 + 1
            goto L2f
        L47:
            return
        L48:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
    }

    public void addTrackSelection(int r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r0 = this;
            r0.assertPreparedWithMedia()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L7
            r0.addTrackSelectionInternal(r1, r2)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L7
            return
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    public void addTrackSelectionForSingleRenderer(int r4, int r5, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r6, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r7) {
            r3 = this;
            r3.assertPreparedWithMedia()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r6 = r6.buildUpon()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            r0 = 0
            r1 = 0
        L9:
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo[] r2 = r3.mappedTrackInfos     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            r2 = r2[r4]     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            int r2 = r2.getRendererCount()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            if (r1 >= r2) goto L1e
            if (r1 == r5) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            r6.setRendererDisabled(r1, r2)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            int r1 = r1 + 1
            goto L9
        L1e:
            boolean r1 = r7.isEmpty()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            if (r1 == 0) goto L2c
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r5 = r6.build()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            r3.addTrackSelectionInternal(r4, r5)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            goto L4d
        L2c:
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo[] r1 = r3.mappedTrackInfos     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            r1 = r1[r4]     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r1.getTrackGroups(r5)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
        L34:
            int r2 = r7.size()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            if (r0 >= r2) goto L4d
            java.lang.Object r2 = r7.get(r0)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) r2     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            r6.setSelectionOverride(r5, r1, r2)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = r6.build()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            r3.addTrackSelectionInternal(r4, r2)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> L4e
            int r0 = r0 + 1
            goto L34
        L4d:
            return
        L4e:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
    }

    public void clearTrackSelections(int r3) {
            r2 = this;
            r2.assertPreparedWithMedia()
            r0 = 0
        L4:
            com.google.android.exoplayer2.RendererCapabilities[] r1 = r2.rendererCapabilities
            int r1 = r1.length
            if (r0 >= r1) goto L15
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r1 = r2.trackSelectionsByPeriodAndRenderer
            r1 = r1[r3]
            r1 = r1[r0]
            r1.clear()
            int r0 = r0 + 1
            goto L4
        L15:
            return
    }

    public com.google.android.exoplayer2.offline.DownloadRequest getDownloadRequest(java.lang.String r8, @androidx.annotation.Nullable byte[] r9) {
            r7 = this;
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = new com.google.android.exoplayer2.offline.DownloadRequest$Builder
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = r7.localConfiguration
            android.net.Uri r1 = r1.uri
            r0.<init>(r8, r1)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r8 = r7.localConfiguration
            java.lang.String r8 = r8.mimeType
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r8 = r0.setMimeType(r8)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r7.localConfiguration
            com.google.android.exoplayer2.MediaItem$DrmConfiguration r0 = r0.drmConfiguration
            if (r0 == 0) goto L1c
            byte[] r0 = r0.getKeySetId()
            goto L1d
        L1c:
            r0 = 0
        L1d:
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r8 = r8.setKeySetId(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r7.localConfiguration
            java.lang.String r0 = r0.customCacheKey
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r8 = r8.setCustomCacheKey(r0)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r8 = r8.setData(r9)
            com.google.android.exoplayer2.source.MediaSource r9 = r7.mediaSource
            if (r9 != 0) goto L36
            com.google.android.exoplayer2.offline.DownloadRequest r8 = r8.build()
            return r8
        L36:
            r7.assertPreparedWithMedia()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r1 = r7.trackSelectionsByPeriodAndRenderer
            int r1 = r1.length
            r2 = 0
            r3 = 0
        L48:
            if (r3 >= r1) goto L71
            r0.clear()
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r4 = r7.trackSelectionsByPeriodAndRenderer
            r4 = r4[r3]
            int r4 = r4.length
            r5 = 0
        L53:
            if (r5 >= r4) goto L61
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r6 = r7.trackSelectionsByPeriodAndRenderer
            r6 = r6[r3]
            r6 = r6[r5]
            r0.addAll(r6)
            int r5 = r5 + 1
            goto L53
        L61:
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r4 = r7.mediaPreparer
            com.google.android.exoplayer2.source.MediaPeriod[] r4 = r4.mediaPeriods
            r4 = r4[r3]
            java.util.List r4 = r4.getStreamKeys(r0)
            r9.addAll(r4)
            int r3 = r3 + 1
            goto L48
        L71:
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r8 = r8.setStreamKeys(r9)
            com.google.android.exoplayer2.offline.DownloadRequest r8 = r8.build()
            return r8
    }

    public com.google.android.exoplayer2.offline.DownloadRequest getDownloadRequest(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r1.localConfiguration
            android.net.Uri r0 = r0.uri
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.offline.DownloadRequest r2 = r1.getDownloadRequest(r0, r2)
            return r2
    }

    @androidx.annotation.Nullable
    public java.lang.Object getManifest() {
            r3 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r3.mediaSource
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r3.assertPreparedWithMedia()
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = r3.mediaPreparer
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            int r0 = r0.getWindowCount()
            if (r0 <= 0) goto L20
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = r3.mediaPreparer
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            r1 = 0
            com.google.android.exoplayer2.Timeline$Window r2 = r3.window
            com.google.android.exoplayer2.Timeline$Window r0 = r0.getWindow(r1, r2)
            java.lang.Object r1 = r0.manifest
        L20:
            return r1
    }

    public com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int r2) {
            r1 = this;
            r1.assertPreparedWithMedia()
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo[] r0 = r1.mappedTrackInfos
            r2 = r0[r2]
            return r2
    }

    public int getPeriodCount() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.mediaSource
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1.assertPreparedWithMedia()
            com.google.android.exoplayer2.source.TrackGroupArray[] r0 = r1.trackGroupArrays
            int r0 = r0.length
            return r0
    }

    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups(int r2) {
            r1 = this;
            r1.assertPreparedWithMedia()
            com.google.android.exoplayer2.source.TrackGroupArray[] r0 = r1.trackGroupArrays
            r2 = r0[r2]
            return r2
    }

    public java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> getTrackSelections(int r2, int r3) {
            r1 = this;
            r1.assertPreparedWithMedia()
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r0 = r1.immutableTrackSelectionsByPeriodAndRenderer
            r2 = r0[r2]
            r2 = r2[r3]
            return r2
    }

    public com.google.android.exoplayer2.Tracks getTracks(int r3) {
            r2 = this;
            r2.assertPreparedWithMedia()
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo[] r0 = r2.mappedTrackInfos
            r0 = r0[r3]
            java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection>[][] r1 = r2.immutableTrackSelectionsByPeriodAndRenderer
            r3 = r1[r3]
            com.google.android.exoplayer2.Tracks r3 = com.google.android.exoplayer2.trackselection.TrackSelectionUtil.buildTracks(r0, r3)
            return r3
    }

    public void prepare(com.google.android.exoplayer2.offline.DownloadHelper.Callback r4) {
            r3 = this;
            com.google.android.exoplayer2.offline.DownloadHelper$Callback r0 = r3.callback
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r3.callback = r4
            com.google.android.exoplayer2.source.MediaSource r0 = r3.mediaSource
            if (r0 == 0) goto L18
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r4 = new com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer
            r4.<init>(r0, r3)
            r3.mediaPreparer = r4
            goto L23
        L18:
            android.os.Handler r0 = r3.callbackHandler
            com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda5 r1 = new com.google.android.exoplayer2.offline.DownloadHelper$$ExternalSyntheticLambda5
            r2 = 2
            r1.<init>(r3, r4, r2)
            r0.post(r1)
        L23:
            return
    }

    public void release() {
            r1 = this;
            com.google.android.exoplayer2.offline.DownloadHelper$MediaPreparer r0 = r1.mediaPreparer
            if (r0 == 0) goto L7
            r0.release()
        L7:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = r1.trackSelector
            r0.release()
            return
    }

    public void replaceTrackSelections(int r1, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2) {
            r0 = this;
            r0.assertPreparedWithMedia()     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> La
            r0.clearTrackSelections(r1)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> La
            r0.addTrackSelectionInternal(r1, r2)     // Catch: com.google.android.exoplayer2.ExoPlaybackException -> La
            return
        La:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }
}
