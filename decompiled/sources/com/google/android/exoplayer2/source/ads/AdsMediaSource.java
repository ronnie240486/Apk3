package com.google.android.exoplayer2.source.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class AdsMediaSource extends com.google.android.exoplayer2.source.CompositeMediaSource<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = null;
    private final com.google.android.exoplayer2.source.MediaSource.Factory adMediaSourceFactory;
    private com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolders;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
    private final com.google.android.exoplayer2.upstream.DataSpec adTagDataSpec;
    private final com.google.android.exoplayer2.ui.AdViewProvider adViewProvider;
    private final java.lang.Object adsId;
    private final com.google.android.exoplayer2.source.ads.AdsLoader adsLoader;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener componentListener;
    private final com.google.android.exoplayer2.source.MediaSource contentMediaSource;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Timeline contentTimeline;
    private final android.os.Handler mainHandler;
    private final com.google.android.exoplayer2.Timeline.Period period;

    public static final class AdLoadException extends java.io.IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int r1, java.lang.Exception r2) {
                r0 = this;
                r0.<init>(r2)
                r0.type = r1
                return
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForAd(java.lang.Exception r2) {
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException r0 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException
                r1 = 0
                r0.<init>(r1, r2)
                return r0
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForAdGroup(java.lang.Exception r3, int r4) {
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException r0 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Failed to load ad group "
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4)
                r1.<init>(r4, r3)
                r3 = 1
                r0.<init>(r3, r1)
                return r0
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForAllAds(java.lang.Exception r2) {
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException r0 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException
                r1 = 2
                r0.<init>(r1, r2)
                return r0
        }

        public static com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException createForUnexpected(java.lang.RuntimeException r2) {
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException r0 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException
                r1 = 3
                r0.<init>(r1, r2)
                return r0
        }

        public java.lang.RuntimeException getRuntimeExceptionForUnexpected() {
                r2 = this;
                int r0 = r2.type
                r1 = 3
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                java.lang.Throwable r0 = r2.getCause()
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class AdMediaSourceHolder {
        private final java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> activeMediaPeriods;
        private com.google.android.exoplayer2.source.MediaSource adMediaSource;
        private android.net.Uri adUri;
        private final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId id;
        public final /* synthetic */ com.google.android.exoplayer2.source.ads.AdsMediaSource this$0;
        private com.google.android.exoplayer2.Timeline timeline;

        public AdMediaSourceHolder(com.google.android.exoplayer2.source.ads.AdsMediaSource r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.id = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.activeMediaPeriods = r1
                return
        }

        public com.google.android.exoplayer2.source.MediaPeriod createMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.upstream.Allocator r5, long r6) {
                r3 = this;
                com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = new com.google.android.exoplayer2.source.MaskingMediaPeriod
                r0.<init>(r4, r5, r6)
                java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> r5 = r3.activeMediaPeriods
                r5.add(r0)
                com.google.android.exoplayer2.source.MediaSource r5 = r3.adMediaSource
                if (r5 == 0) goto L23
                r0.setMediaSource(r5)
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener r5 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener
                com.google.android.exoplayer2.source.ads.AdsMediaSource r6 = r3.this$0
                android.net.Uri r7 = r3.adUri
                java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
                android.net.Uri r7 = (android.net.Uri) r7
                r5.<init>(r6, r7)
                r0.setPrepareListener(r5)
            L23:
                com.google.android.exoplayer2.Timeline r5 = r3.timeline
                if (r5 == 0) goto L36
                r6 = 0
                java.lang.Object r5 = r5.getUidOfPeriod(r6)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
                long r1 = r4.windowSequenceNumber
                r6.<init>(r5, r1)
                r0.createPeriod(r6)
            L36:
                return r0
        }

        public long getDurationUs() {
                r3 = this;
                com.google.android.exoplayer2.Timeline r0 = r3.timeline
                if (r0 != 0) goto La
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                goto L19
            La:
                r1 = 0
                com.google.android.exoplayer2.source.ads.AdsMediaSource r2 = r3.this$0
                com.google.android.exoplayer2.Timeline$Period r2 = com.google.android.exoplayer2.source.ads.AdsMediaSource.access$600(r2)
                com.google.android.exoplayer2.Timeline$Period r0 = r0.getPeriod(r1, r2)
                long r0 = r0.getDurationUs()
            L19:
                return r0
        }

        public void handleSourceInfoRefresh(com.google.android.exoplayer2.Timeline r7) {
                r6 = this;
                int r0 = r7.getPeriodCount()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L9
                goto La
            L9:
                r2 = 0
            La:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
                com.google.android.exoplayer2.Timeline r0 = r6.timeline
                if (r0 != 0) goto L34
                java.lang.Object r0 = r7.getUidOfPeriod(r1)
            L15:
                java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> r2 = r6.activeMediaPeriods
                int r2 = r2.size()
                if (r1 >= r2) goto L34
                java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> r2 = r6.activeMediaPeriods
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.source.MaskingMediaPeriod r2 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r2
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r2.id
                long r4 = r4.windowSequenceNumber
                r3.<init>(r0, r4)
                r2.createPeriod(r3)
                int r1 = r1 + 1
                goto L15
            L34:
                r6.timeline = r7
                return
        }

        public boolean hasMediaSource() {
                r1 = this;
                com.google.android.exoplayer2.source.MediaSource r0 = r1.adMediaSource
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public void initializeWithMediaSource(com.google.android.exoplayer2.source.MediaSource r5, android.net.Uri r6) {
                r4 = this;
                r4.adMediaSource = r5
                r4.adUri = r6
                r0 = 0
            L5:
                java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> r1 = r4.activeMediaPeriods
                int r1 = r1.size()
                if (r0 >= r1) goto L25
                java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> r1 = r4.activeMediaPeriods
                java.lang.Object r1 = r1.get(r0)
                com.google.android.exoplayer2.source.MaskingMediaPeriod r1 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r1
                r1.setMediaSource(r5)
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener r2 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener
                com.google.android.exoplayer2.source.ads.AdsMediaSource r3 = r4.this$0
                r2.<init>(r3, r6)
                r1.setPrepareListener(r2)
                int r0 = r0 + 1
                goto L5
            L25:
                com.google.android.exoplayer2.source.ads.AdsMediaSource r6 = r4.this$0
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r4.id
                int r1 = com.google.android.exoplayer2.source.ads.AdsMediaSource.$r8$clinit
                r6.prepareChildSource(r0, r5)
                return
        }

        public boolean isInactive() {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> r0 = r1.activeMediaPeriods
                boolean r0 = r0.isEmpty()
                return r0
        }

        public void release() {
                r3 = this;
                boolean r0 = r3.hasMediaSource()
                if (r0 == 0) goto Lf
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r3.this$0
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.id
                int r2 = com.google.android.exoplayer2.source.ads.AdsMediaSource.$r8$clinit
                r0.releaseChildSource(r1)
            Lf:
                return
        }

        public void releaseMediaPeriod(com.google.android.exoplayer2.source.MaskingMediaPeriod r2) {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.source.MaskingMediaPeriod> r0 = r1.activeMediaPeriods
                r0.remove(r2)
                r2.releasePeriod()
                return
        }
    }

    public final class AdPrepareListener implements com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener {
        private final android.net.Uri adUri;
        public final /* synthetic */ com.google.android.exoplayer2.source.ads.AdsMediaSource this$0;

        public static /* synthetic */ void $r8$lambda$ZAFSOHAWPkR_xRv3E5evwUUiTyg(com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareListener r0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, java.io.IOException r2) {
                r0.lambda$onPrepareError$1(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$iaOFHOi1HiE_ynOUr4SbIaoC-Vc, reason: not valid java name */
        public static /* synthetic */ void m253$r8$lambda$iaOFHOi1HiE_ynOUr4SbIaoCVc(com.google.android.exoplayer2.source.ads.AdsMediaSource.AdPrepareListener r0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1) {
                r0.lambda$onPrepareComplete$0(r1)
                return
        }

        public AdPrepareListener(com.google.android.exoplayer2.source.ads.AdsMediaSource r1, android.net.Uri r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.adUri = r2
                return
        }

        private /* synthetic */ void lambda$onPrepareComplete$0(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r3 = this;
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r3.this$0
                com.google.android.exoplayer2.source.ads.AdsLoader r0 = com.google.android.exoplayer2.source.ads.AdsMediaSource.access$400(r0)
                com.google.android.exoplayer2.source.ads.AdsMediaSource r1 = r3.this$0
                int r2 = r4.adGroupIndex
                int r4 = r4.adIndexInAdGroup
                r0.handlePrepareComplete(r1, r2, r4)
                return
        }

        private /* synthetic */ void lambda$onPrepareError$1(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, java.io.IOException r5) {
                r3 = this;
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r3.this$0
                com.google.android.exoplayer2.source.ads.AdsLoader r0 = com.google.android.exoplayer2.source.ads.AdsMediaSource.access$400(r0)
                com.google.android.exoplayer2.source.ads.AdsMediaSource r1 = r3.this$0
                int r2 = r4.adGroupIndex
                int r4 = r4.adIndexInAdGroup
                r0.handlePrepareError(r1, r2, r4, r5)
                return
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r3 = this;
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r3.this$0
                android.os.Handler r0 = com.google.android.exoplayer2.source.ads.AdsMediaSource.access$200(r0)
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.post(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r9, java.io.IOException r10) {
                r8 = this;
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r8.this$0
                int r1 = com.google.android.exoplayer2.source.ads.AdsMediaSource.$r8$clinit
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r0.createEventDispatcher(r9)
                com.google.android.exoplayer2.source.LoadEventInfo r7 = new com.google.android.exoplayer2.source.LoadEventInfo
                long r2 = com.google.android.exoplayer2.source.LoadEventInfo.getNewId()
                com.google.android.exoplayer2.upstream.DataSpec r4 = new com.google.android.exoplayer2.upstream.DataSpec
                android.net.Uri r1 = r8.adUri
                r4.<init>(r1)
                long r5 = android.os.SystemClock.elapsedRealtime()
                r1 = r7
                r1.<init>(r2, r4, r5)
                r1 = 6
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdLoadException r2 = com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException.createForAd(r10)
                r3 = 1
                r0.loadError(r7, r1, r2, r3)
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r8.this$0
                android.os.Handler r0 = com.google.android.exoplayer2.source.ads.AdsMediaSource.access$200(r0)
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1
                r1.<init>(r8, r9, r10)
                r0.post(r1)
                return
        }
    }

    public final class ComponentListener implements com.google.android.exoplayer2.source.ads.AdsLoader.EventListener {
        private final android.os.Handler playerHandler;
        private volatile boolean stopped;
        public final /* synthetic */ com.google.android.exoplayer2.source.ads.AdsMediaSource this$0;

        /* JADX INFO: renamed from: $r8$lambda$0n-PEDqeEt9IJPXJ3J126o4e0MQ, reason: not valid java name */
        public static /* synthetic */ void m254$r8$lambda$0nPEDqeEt9IJPXJ3J126o4e0MQ(com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener r0, com.google.android.exoplayer2.source.ads.AdPlaybackState r1) {
                r0.lambda$onAdPlaybackState$0(r1)
                return
        }

        public ComponentListener(com.google.android.exoplayer2.source.ads.AdsMediaSource r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                android.os.Handler r1 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper()
                r0.playerHandler = r1
                return
        }

        private /* synthetic */ void lambda$onAdPlaybackState$0(com.google.android.exoplayer2.source.ads.AdPlaybackState r2) {
                r1 = this;
                boolean r0 = r1.stopped
                if (r0 == 0) goto L5
                return
            L5:
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r1.this$0
                com.google.android.exoplayer2.source.ads.AdsMediaSource.access$100(r0, r2)
                return
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public final /* synthetic */ void onAdClicked() {
                r0 = this;
                com.google.android.exoplayer2.source.ads.AdsLoader.EventListener.CC.$default$onAdClicked(r0)
                return
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException r9, com.google.android.exoplayer2.upstream.DataSpec r10) {
                r8 = this;
                boolean r0 = r8.stopped
                if (r0 == 0) goto L5
                return
            L5:
                com.google.android.exoplayer2.source.ads.AdsMediaSource r0 = r8.this$0
                r1 = 0
                int r2 = com.google.android.exoplayer2.source.ads.AdsMediaSource.$r8$clinit
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r0 = r0.createEventDispatcher(r1)
                com.google.android.exoplayer2.source.LoadEventInfo r7 = new com.google.android.exoplayer2.source.LoadEventInfo
                long r2 = com.google.android.exoplayer2.source.LoadEventInfo.getNewId()
                long r5 = android.os.SystemClock.elapsedRealtime()
                r1 = r7
                r4 = r10
                r1.<init>(r2, r4, r5)
                r10 = 6
                r1 = 1
                r0.loadError(r7, r10, r9, r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState r4) {
                r3 = this;
                boolean r0 = r3.stopped
                if (r0 == 0) goto L5
                return
            L5:
                android.os.Handler r0 = r3.playerHandler
                com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r4, r2)
                r0.post(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public final /* synthetic */ void onAdTapped() {
                r0 = this;
                com.google.android.exoplayer2.source.ads.AdsLoader.EventListener.CC.$default$onAdTapped(r0)
                return
        }

        public void stop() {
                r2 = this;
                r0 = 1
                r2.stopped = r0
                android.os.Handler r0 = r2.playerHandler
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$1-m7XF1umsWz9SdpDX3nvldjhmE, reason: not valid java name */
    public static /* synthetic */ void m252$r8$lambda$1m7XF1umsWz9SdpDX3nvldjhmE(com.google.android.exoplayer2.source.ads.AdsMediaSource r0, com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener r1) {
            r0.lambda$prepareSourceInternal$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$AgVPpigbCJhxxQjVVqQPnZy0Xkc(com.google.android.exoplayer2.source.ads.AdsMediaSource r0, com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener r1) {
            r0.lambda$releaseSourceInternal$1(r1)
            return
    }

    static {
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.<init>(r1)
            com.google.android.exoplayer2.source.ads.AdsMediaSource.CHILD_SOURCE_MEDIA_PERIOD_ID = r0
            return
    }

    public AdsMediaSource(com.google.android.exoplayer2.source.MediaSource r1, com.google.android.exoplayer2.upstream.DataSpec r2, java.lang.Object r3, com.google.android.exoplayer2.source.MediaSource.Factory r4, com.google.android.exoplayer2.source.ads.AdsLoader r5, com.google.android.exoplayer2.ui.AdViewProvider r6) {
            r0 = this;
            r0.<init>()
            r0.contentMediaSource = r1
            r0.adMediaSourceFactory = r4
            r0.adsLoader = r5
            r0.adViewProvider = r6
            r0.adTagDataSpec = r2
            r0.adsId = r3
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.mainHandler = r1
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            r0.period = r1
            r1 = 0
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[r1][]
            r0.adMediaSourceHolders = r1
            int[] r1 = r4.getSupportedTypes()
            r5.setSupportedContentTypes(r1)
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.source.ads.AdsMediaSource r0, com.google.android.exoplayer2.source.ads.AdPlaybackState r1) {
            r0.onAdPlaybackState(r1)
            return
    }

    public static /* synthetic */ android.os.Handler access$200(com.google.android.exoplayer2.source.ads.AdsMediaSource r0) {
            android.os.Handler r0 = r0.mainHandler
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.ads.AdsLoader access$400(com.google.android.exoplayer2.source.ads.AdsMediaSource r0) {
            com.google.android.exoplayer2.source.ads.AdsLoader r0 = r0.adsLoader
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Timeline.Period access$600(com.google.android.exoplayer2.source.ads.AdsMediaSource r0) {
            com.google.android.exoplayer2.Timeline$Period r0 = r0.period
            return r0
    }

    private long[][] getAdDurationsUs() {
            r8 = this;
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r0 = r8.adMediaSourceHolders
            int r0 = r0.length
            long[][] r0 = new long[r0][]
            r1 = 0
            r2 = 0
        L7:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r3 = r8.adMediaSourceHolders
            int r4 = r3.length
            if (r2 >= r4) goto L35
            r3 = r3[r2]
            int r3 = r3.length
            long[] r3 = new long[r3]
            r0[r2] = r3
            r3 = 0
        L14:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r4 = r8.adMediaSourceHolders
            r5 = r4[r2]
            int r5 = r5.length
            if (r3 >= r5) goto L32
            r4 = r4[r2]
            r4 = r4[r3]
            r5 = r0[r2]
            if (r4 != 0) goto L29
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L2d
        L29:
            long r6 = r4.getDurationUs()
        L2d:
            r5[r3] = r6
            int r3 = r3 + 1
            goto L14
        L32:
            int r2 = r2 + 1
            goto L7
        L35:
            return r0
    }

    private /* synthetic */ void lambda$prepareSourceInternal$0(com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener r7) {
            r6 = this;
            com.google.android.exoplayer2.source.ads.AdsLoader r0 = r6.adsLoader
            com.google.android.exoplayer2.upstream.DataSpec r2 = r6.adTagDataSpec
            java.lang.Object r3 = r6.adsId
            com.google.android.exoplayer2.ui.AdViewProvider r4 = r6.adViewProvider
            r1 = r6
            r5 = r7
            r0.start(r1, r2, r3, r4, r5)
            return
    }

    private /* synthetic */ void lambda$releaseSourceInternal$1(com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener r2) {
            r1 = this;
            com.google.android.exoplayer2.source.ads.AdsLoader r0 = r1.adsLoader
            r0.stop(r1, r2)
            return
    }

    private void maybeUpdateAdMediaSources() {
            r8 = this;
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r8.adPlaybackState
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r2 = 0
        L7:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r3 = r8.adMediaSourceHolders
            int r3 = r3.length
            if (r2 >= r3) goto L58
            r3 = 0
        Ld:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r4 = r8.adMediaSourceHolders
            r5 = r4[r2]
            int r5 = r5.length
            if (r3 >= r5) goto L55
            r4 = r4[r2]
            r4 = r4[r3]
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r5 = r0.getAdGroup(r2)
            if (r4 == 0) goto L52
            boolean r6 = r4.hasMediaSource()
            if (r6 != 0) goto L52
            android.net.Uri[] r5 = r5.uris
            int r6 = r5.length
            if (r3 >= r6) goto L52
            r5 = r5[r3]
            if (r5 == 0) goto L52
            com.google.android.exoplayer2.MediaItem$Builder r6 = new com.google.android.exoplayer2.MediaItem$Builder
            r6.<init>()
            com.google.android.exoplayer2.MediaItem$Builder r6 = r6.setUri(r5)
            com.google.android.exoplayer2.source.MediaSource r7 = r8.contentMediaSource
            com.google.android.exoplayer2.MediaItem r7 = r7.getMediaItem()
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r7 = r7.localConfiguration
            if (r7 == 0) goto L45
            com.google.android.exoplayer2.MediaItem$DrmConfiguration r7 = r7.drmConfiguration
            r6.setDrmConfiguration(r7)
        L45:
            com.google.android.exoplayer2.source.MediaSource$Factory r7 = r8.adMediaSourceFactory
            com.google.android.exoplayer2.MediaItem r6 = r6.build()
            com.google.android.exoplayer2.source.MediaSource r6 = r7.createMediaSource(r6)
            r4.initializeWithMediaSource(r6, r5)
        L52:
            int r3 = r3 + 1
            goto Ld
        L55:
            int r2 = r2 + 1
            goto L7
        L58:
            return
    }

    private void maybeUpdateSourceInfo() {
            r3 = this;
            com.google.android.exoplayer2.Timeline r0 = r3.contentTimeline
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r3.adPlaybackState
            if (r1 == 0) goto L24
            if (r0 == 0) goto L24
            int r2 = r1.adGroupCount
            if (r2 != 0) goto L10
            r3.refreshSourceInfo(r0)
            goto L24
        L10:
            long[][] r2 = r3.getAdDurationsUs()
            com.google.android.exoplayer2.source.ads.AdPlaybackState r1 = r1.withAdDurationsUs(r2)
            r3.adPlaybackState = r1
            com.google.android.exoplayer2.source.ads.SinglePeriodAdTimeline r1 = new com.google.android.exoplayer2.source.ads.SinglePeriodAdTimeline
            com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = r3.adPlaybackState
            r1.<init>(r0, r2)
            r3.refreshSourceInfo(r1)
        L24:
            return
    }

    private void onAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState r4) {
            r3 = this;
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r3.adPlaybackState
            r1 = 0
            if (r0 != 0) goto L11
            int r0 = r4.adGroupCount
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r0 = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[r0][]
            r3.adMediaSourceHolders = r0
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[] r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[r1]
            java.util.Arrays.fill(r0, r1)
            goto L1b
        L11:
            int r2 = r4.adGroupCount
            int r0 = r0.adGroupCount
            if (r2 != r0) goto L18
            r1 = 1
        L18:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
        L1b:
            r3.adPlaybackState = r4
            r3.maybeUpdateAdMediaSources()
            r3.maybeUpdateSourceInfo()
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r6, com.google.android.exoplayer2.upstream.Allocator r7, long r8) {
            r5 = this;
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r5.adPlaybackState
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) r0
            int r0 = r0.adGroupCount
            if (r0 <= 0) goto L44
            boolean r0 = r6.isAd()
            if (r0 == 0) goto L44
            int r0 = r6.adGroupIndex
            int r1 = r6.adIndexInAdGroup
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r2 = r5.adMediaSourceHolders
            r3 = r2[r0]
            int r3 = r3.length
            if (r3 > r1) goto L29
            int r3 = r1 + 1
            r4 = r2[r0]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[] r3 = (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[]) r3
            r2[r0] = r3
        L29:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r2 = r5.adMediaSourceHolders
            r2 = r2[r0]
            r2 = r2[r1]
            if (r2 != 0) goto L3f
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder r2 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder
            r2.<init>(r5, r6)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r3 = r5.adMediaSourceHolders
            r0 = r3[r0]
            r0[r1] = r2
            r5.maybeUpdateAdMediaSources()
        L3f:
            com.google.android.exoplayer2.source.MediaPeriod r6 = r2.createMediaPeriod(r6, r7, r8)
            return r6
        L44:
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = new com.google.android.exoplayer2.source.MaskingMediaPeriod
            r0.<init>(r6, r7, r8)
            com.google.android.exoplayer2.source.MediaSource r7 = r5.contentMediaSource
            r0.setMediaSource(r7)
            r0.createPeriod(r6)
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource r0 = r1.contentMediaSource
            com.google.android.exoplayer2.MediaItem r0 = r0.getMediaItem()
            return r0
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
            boolean r0 = r2.isAd()
            if (r0 == 0) goto L9
            r3 = r2
        L9:
            return r3
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaSource r3, com.google.android.exoplayer2.Timeline r4) {
            r1 = this;
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r2
            boolean r3 = r2.isAd()
            if (r3 == 0) goto L1c
            int r3 = r2.adGroupIndex
            int r2 = r2.adIndexInAdGroup
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r0 = r1.adMediaSourceHolders
            r3 = r0[r3]
            r2 = r3[r2]
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder r2 = (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder) r2
            r2.handleSourceInfoRefresh(r4)
            goto L2a
        L1c:
            int r2 = r4.getPeriodCount()
            r3 = 1
            if (r2 != r3) goto L24
            goto L25
        L24:
            r3 = 0
        L25:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
            r1.contentTimeline = r4
        L2a:
            r1.maybeUpdateSourceInfo()
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r4) {
            r3 = this;
            super.prepareSourceInternal(r4)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener r4 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener
            r4.<init>(r3)
            r3.componentListener = r4
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = com.google.android.exoplayer2.source.ads.AdsMediaSource.CHILD_SOURCE_MEDIA_PERIOD_ID
            com.google.android.exoplayer2.source.MediaSource r1 = r3.contentMediaSource
            r3.prepareChildSource(r0, r1)
            android.os.Handler r0 = r3.mainHandler
            com.google.android.exoplayer2.source.ads.AdsMediaSource$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$$ExternalSyntheticLambda0
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r4) {
            r3 = this;
            com.google.android.exoplayer2.source.MaskingMediaPeriod r4 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r4
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r4.id
            boolean r1 = r0.isAd()
            if (r1 == 0) goto L32
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r1 = r3.adMediaSourceHolders
            int r2 = r0.adGroupIndex
            r1 = r1[r2]
            int r2 = r0.adIndexInAdGroup
            r1 = r1[r2]
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder r1 = (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder) r1
            r1.releaseMediaPeriod(r4)
            boolean r4 = r1.isInactive()
            if (r4 == 0) goto L35
            r1.release()
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r4 = r3.adMediaSourceHolders
            int r1 = r0.adGroupIndex
            r4 = r4[r1]
            int r0 = r0.adIndexInAdGroup
            r1 = 0
            r4[r0] = r1
            goto L35
        L32:
            r4.releasePeriod()
        L35:
            return
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r4 = this;
            super.releaseSourceInternal()
            com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener r0 = r4.componentListener
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$ComponentListener r0 = (com.google.android.exoplayer2.source.ads.AdsMediaSource.ComponentListener) r0
            r1 = 0
            r4.componentListener = r1
            r0.stop()
            r4.contentTimeline = r1
            r4.adPlaybackState = r1
            r1 = 0
            com.google.android.exoplayer2.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r2 = new com.google.android.exoplayer2.source.ads.AdsMediaSource.AdMediaSourceHolder[r1][]
            r4.adMediaSourceHolders = r2
            android.os.Handler r2 = r4.mainHandler
            com.google.android.exoplayer2.source.ads.AdsMediaSource$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$$ExternalSyntheticLambda0
            r3.<init>(r4, r0, r1)
            r2.post(r3)
            return
    }
}
