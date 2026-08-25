package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class MediaSourceList {
    private static final java.lang.String TAG = "MediaSourceList";
    private final java.util.HashMap<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder, com.google.android.exoplayer2.MediaSourceList.MediaSourceAndListener> childSources;
    private final java.util.Set<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> enabledMediaSourceHolders;
    private final com.google.android.exoplayer2.util.HandlerWrapper eventHandler;
    private final com.google.android.exoplayer2.analytics.AnalyticsCollector eventListener;
    private boolean isPrepared;
    private final java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> mediaSourceByMediaPeriod;
    private final java.util.Map<java.lang.Object, com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> mediaSourceByUid;
    private final java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> mediaSourceHolders;
    private final com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener mediaSourceListInfoListener;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.TransferListener mediaTransferListener;
    private final com.google.android.exoplayer2.analytics.PlayerId playerId;
    private com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;

    /* JADX INFO: loaded from: classes3.dex */
    public final class ForwardingEventListener implements com.google.android.exoplayer2.source.MediaSourceEventListener, com.google.android.exoplayer2.drm.DrmSessionEventListener {
        private final com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder id;
        public final /* synthetic */ com.google.android.exoplayer2.MediaSourceList this$0;

        public static /* synthetic */ void $r8$lambda$1F0h0us8Zh9Z8E8qZ5sAsC3YrPY(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, com.google.android.exoplayer2.source.MediaLoadData r2) {
                r0.lambda$onDownstreamFormatChanged$5(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$1irD_JbyOLxWYS6zMlyDPUAT9cw(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0.lambda$onLoadStarted$0(r1, r2, r3)
                return
        }

        public static /* synthetic */ void $r8$lambda$CrewDdLXFGx1pP2NvroyaGw7eeY(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1) {
                r0.lambda$onDrmSessionReleased$11(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$MKpf-HLPRP3N3B3fZcvRqgW5fIk, reason: not valid java name */
        public static /* synthetic */ void m169$r8$lambda$MKpfHLPRP3N3B3fZcvRqgW5fIk(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0.lambda$onLoadCompleted$1(r1, r2, r3)
                return
        }

        public static /* synthetic */ void $r8$lambda$Z252bkVZmh2EYOVlfel9NmBBgmY(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1) {
                r0.lambda$onDrmKeysLoaded$7(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$crDo_6psujTIswCodqiLesLyERI(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1) {
                r0.lambda$onDrmKeysRemoved$10(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$jur7tk7vKzzjIjjCVHXdRaxRZlI(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, com.google.android.exoplayer2.source.MediaLoadData r2) {
                r0.lambda$onUpstreamDiscarded$4(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$mGNrvy6v7j_ZgL_PFQUMP_2F9Qs(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, java.io.IOException r4, boolean r5) {
                r0.lambda$onLoadError$3(r1, r2, r3, r4, r5)
                return
        }

        public static /* synthetic */ void $r8$lambda$nAHq6gMYlBawBUCanNG8GHGElp4(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1) {
                r0.lambda$onDrmKeysRestored$9(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$ul1RdAqfjWds0agw35ykSDQVk8Q(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, int r2) {
                r0.lambda$onDrmSessionAcquired$6(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$wndeDC3gUyEYe-OHnUrs8rlAd8g, reason: not valid java name */
        public static /* synthetic */ void m170$r8$lambda$wndeDC3gUyEYeOHnUrs8rlAd8g(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0.lambda$onLoadCanceled$2(r1, r2, r3)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$xFkGCpuEwpp2-sG4Pmtj8Y9E_bk, reason: not valid java name */
        public static /* synthetic */ void m171$r8$lambda$xFkGCpuEwpp2sG4Pmtj8Y9E_bk(com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r0, android.util.Pair r1, java.lang.Exception r2) {
                r0.lambda$onDrmSessionManagerError$8(r1, r2)
                return
        }

        public ForwardingEventListener(com.google.android.exoplayer2.MediaSourceList r1, com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.id = r2
                return
        }

        @androidx.annotation.Nullable
        private android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> getEventParameters(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r2 = this;
                r0 = 0
                if (r4 == 0) goto Ld
                com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r1 = r2.id
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = com.google.android.exoplayer2.MediaSourceList.access$100(r1, r4)
                if (r4 != 0) goto Lc
                return r0
            Lc:
                r0 = r4
            Ld:
                com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r4 = r2.id
                int r3 = com.google.android.exoplayer2.MediaSourceList.access$200(r4, r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                android.util.Pair r3 = android.util.Pair.create(r3, r0)
                return r3
        }

        private /* synthetic */ void lambda$onDownstreamFormatChanged$5(android.util.Pair r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onDownstreamFormatChanged(r1, r3, r4)
                return
        }

        private /* synthetic */ void lambda$onDrmKeysLoaded$7(android.util.Pair r3) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onDrmKeysLoaded(r1, r3)
                return
        }

        private /* synthetic */ void lambda$onDrmKeysRemoved$10(android.util.Pair r3) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onDrmKeysRemoved(r1, r3)
                return
        }

        private /* synthetic */ void lambda$onDrmKeysRestored$9(android.util.Pair r3) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onDrmKeysRestored(r1, r3)
                return
        }

        private /* synthetic */ void lambda$onDrmSessionAcquired$6(android.util.Pair r3, int r4) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onDrmSessionAcquired(r1, r3, r4)
                return
        }

        private /* synthetic */ void lambda$onDrmSessionManagerError$8(android.util.Pair r3, java.lang.Exception r4) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onDrmSessionManagerError(r1, r3, r4)
                return
        }

        private /* synthetic */ void lambda$onDrmSessionReleased$11(android.util.Pair r3) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onDrmSessionReleased(r1, r3)
                return
        }

        private /* synthetic */ void lambda$onLoadCanceled$2(android.util.Pair r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onLoadCanceled(r1, r3, r4, r5)
                return
        }

        private /* synthetic */ void lambda$onLoadCompleted$1(android.util.Pair r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onLoadCompleted(r1, r3, r4, r5)
                return
        }

        private /* synthetic */ void lambda$onLoadError$3(android.util.Pair r9, com.google.android.exoplayer2.source.LoadEventInfo r10, com.google.android.exoplayer2.source.MediaLoadData r11, java.io.IOException r12, boolean r13) {
                r8 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r8.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r1 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r0 = r9.first
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r2 = r0.intValue()
                java.lang.Object r9 = r9.second
                r3 = r9
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r1.onLoadError(r2, r3, r4, r5, r6, r7)
                return
        }

        private /* synthetic */ void lambda$onLoadStarted$0(android.util.Pair r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onLoadStarted(r1, r3, r4, r5)
                return
        }

        private /* synthetic */ void lambda$onUpstreamDiscarded$4(android.util.Pair r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r2 = this;
                com.google.android.exoplayer2.MediaSourceList r0 = r2.this$0
                com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = com.google.android.exoplayer2.MediaSourceList.access$300(r0)
                java.lang.Object r1 = r3.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                java.lang.Object r3 = r3.second
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
                r0.onUpstreamDiscarded(r1, r3, r4)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                android.util.Pair r3 = r2.getEventParameters(r3, r4)
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.MediaSourceList r4 = r2.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r4 = com.google.android.exoplayer2.MediaSourceList.access$000(r4)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2
                r1 = 0
                r0.<init>(r2, r3, r5, r1)
                r4.post(r0)
            L15:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r2 = this;
                android.util.Pair r3 = r2.getEventParameters(r3, r4)
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.MediaSourceList r4 = r2.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r4 = com.google.android.exoplayer2.MediaSourceList.access$000(r4)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0
                r1 = 2
                r0.<init>(r2, r3, r1)
                r4.post(r0)
            L15:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r2 = this;
                android.util.Pair r3 = r2.getEventParameters(r3, r4)
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.MediaSourceList r4 = r2.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r4 = com.google.android.exoplayer2.MediaSourceList.access$000(r4)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0
                r1 = 0
                r0.<init>(r2, r3, r1)
                r4.post(r0)
            L15:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r2 = this;
                android.util.Pair r3 = r2.getEventParameters(r3, r4)
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.MediaSourceList r4 = r2.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r4 = com.google.android.exoplayer2.MediaSourceList.access$000(r4)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0
                r1 = 3
                r0.<init>(r2, r3, r1)
                r4.post(r0)
            L15:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public final /* synthetic */ void onDrmSessionAcquired(int r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                r0 = this;
                com.google.android.exoplayer2.drm.DrmSessionEventListener.CC.$default$onDrmSessionAcquired(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, int r4) {
                r1 = this;
                android.util.Pair r2 = r1.getEventParameters(r2, r3)
                if (r2 == 0) goto L14
                com.google.android.exoplayer2.MediaSourceList r3 = r1.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r3 = com.google.android.exoplayer2.MediaSourceList.access$000(r3)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3 r0 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3
                r0.<init>(r1, r2, r4)
                r3.post(r0)
            L14:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, java.lang.Exception r5) {
                r2 = this;
                android.util.Pair r3 = r2.getEventParameters(r3, r4)
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.MediaSourceList r4 = r2.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r4 = com.google.android.exoplayer2.MediaSourceList.access$000(r4)
                com.google.android.exoplayer2.MediaPeriodQueue$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.MediaPeriodQueue$$ExternalSyntheticLambda0
                r1 = 1
                r0.<init>(r2, r3, r5, r1)
                r4.post(r0)
            L15:
                return
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r2 = this;
                android.util.Pair r3 = r2.getEventParameters(r3, r4)
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.MediaSourceList r4 = r2.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r4 = com.google.android.exoplayer2.MediaSourceList.access$000(r4)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0
                r1 = 1
                r0.<init>(r2, r3, r1)
                r4.post(r0)
            L15:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int r7, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r8, com.google.android.exoplayer2.source.LoadEventInfo r9, com.google.android.exoplayer2.source.MediaLoadData r10) {
                r6 = this;
                android.util.Pair r2 = r6.getEventParameters(r7, r8)
                if (r2 == 0) goto L19
                com.google.android.exoplayer2.MediaSourceList r7 = r6.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r7 = com.google.android.exoplayer2.MediaSourceList.access$000(r7)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1 r8 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1
                r5 = 1
                r0 = r8
                r1 = r6
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                r7.post(r8)
            L19:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int r7, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r8, com.google.android.exoplayer2.source.LoadEventInfo r9, com.google.android.exoplayer2.source.MediaLoadData r10) {
                r6 = this;
                android.util.Pair r2 = r6.getEventParameters(r7, r8)
                if (r2 == 0) goto L19
                com.google.android.exoplayer2.MediaSourceList r7 = r6.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r7 = com.google.android.exoplayer2.MediaSourceList.access$000(r7)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1 r8 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1
                r5 = 2
                r0 = r8
                r1 = r6
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                r7.post(r8)
            L19:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int r8, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r9, com.google.android.exoplayer2.source.LoadEventInfo r10, com.google.android.exoplayer2.source.MediaLoadData r11, java.io.IOException r12, boolean r13) {
                r7 = this;
                android.util.Pair r2 = r7.getEventParameters(r8, r9)
                if (r2 == 0) goto L1a
                com.google.android.exoplayer2.MediaSourceList r8 = r7.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r8 = com.google.android.exoplayer2.MediaSourceList.access$000(r8)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda4 r9 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda4
                r0 = r9
                r1 = r7
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.post(r9)
            L1a:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int r7, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r8, com.google.android.exoplayer2.source.LoadEventInfo r9, com.google.android.exoplayer2.source.MediaLoadData r10) {
                r6 = this;
                android.util.Pair r2 = r6.getEventParameters(r7, r8)
                if (r2 == 0) goto L19
                com.google.android.exoplayer2.MediaSourceList r7 = r6.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r7 = com.google.android.exoplayer2.MediaSourceList.access$000(r7)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1 r8 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1
                r5 = 0
                r0 = r8
                r1 = r6
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                r7.post(r8)
            L19:
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                android.util.Pair r3 = r2.getEventParameters(r3, r4)
                if (r3 == 0) goto L15
                com.google.android.exoplayer2.MediaSourceList r4 = r2.this$0
                com.google.android.exoplayer2.util.HandlerWrapper r4 = com.google.android.exoplayer2.MediaSourceList.access$000(r4)
                com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2
                r1 = 1
                r0.<init>(r2, r3, r5, r1)
                r4.post(r0)
            L15:
                return
        }
    }

    public static final class MediaSourceAndListener {
        public final com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller caller;
        public final com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener eventListener;
        public final com.google.android.exoplayer2.source.MediaSource mediaSource;

        public MediaSourceAndListener(com.google.android.exoplayer2.source.MediaSource r1, com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller r2, com.google.android.exoplayer2.MediaSourceList.ForwardingEventListener r3) {
                r0 = this;
                r0.<init>()
                r0.mediaSource = r1
                r0.caller = r2
                r0.eventListener = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class MediaSourceHolder implements com.google.android.exoplayer2.MediaSourceInfoHolder {
        public final java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> activeMediaPeriodIds;
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

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public com.google.android.exoplayer2.Timeline getTimeline() {
                r1 = this;
                com.google.android.exoplayer2.source.MaskingMediaSource r0 = r1.mediaSource
                com.google.android.exoplayer2.Timeline r0 = r0.getTimeline()
                return r0
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public java.lang.Object getUid() {
                r1 = this;
                java.lang.Object r0 = r1.uid
                return r0
        }

        public void reset(int r1) {
                r0 = this;
                r0.firstWindowIndexInChild = r1
                r1 = 0
                r0.isRemoved = r1
                java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r0.activeMediaPeriodIds
                r1.clear()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public static /* synthetic */ void $r8$lambda$IvId91cF5h9kInKwFrUZDZ47tvc(com.google.android.exoplayer2.MediaSourceList r0, com.google.android.exoplayer2.source.MediaSource r1, com.google.android.exoplayer2.Timeline r2) {
            r0.lambda$prepareChildSource$0(r1, r2)
            return
    }

    public MediaSourceList(com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener r1, com.google.android.exoplayer2.analytics.AnalyticsCollector r2, com.google.android.exoplayer2.util.HandlerWrapper r3, com.google.android.exoplayer2.analytics.PlayerId r4) {
            r0 = this;
            r0.<init>()
            r0.playerId = r4
            r0.mediaSourceListInfoListener = r1
            com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder r1 = new com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder
            r4 = 0
            r1.<init>(r4)
            r0.shuffleOrder = r1
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            r0.mediaSourceByMediaPeriod = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mediaSourceByUid = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mediaSourceHolders = r1
            r0.eventListener = r2
            r0.eventHandler = r3
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.childSources = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.enabledMediaSourceHolders = r1
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.util.HandlerWrapper access$000(com.google.android.exoplayer2.MediaSourceList r0) {
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r0.eventHandler
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.MediaPeriodId access$100(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1) {
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = getMediaPeriodIdForChildMediaPeriodId(r0, r1)
            return r0
    }

    public static /* synthetic */ int access$200(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r0, int r1) {
            int r0 = getWindowIndexForChildWindowIndex(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector access$300(com.google.android.exoplayer2.MediaSourceList r0) {
            com.google.android.exoplayer2.analytics.AnalyticsCollector r0 = r0.eventListener
            return r0
    }

    private void correctOffsets(int r3, int r4) {
            r2 = this;
        L0:
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r2.mediaSourceHolders
            int r0 = r0.size()
            if (r3 >= r0) goto L18
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r2.mediaSourceHolders
            java.lang.Object r0 = r0.get(r3)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r0
            int r1 = r0.firstWindowIndexInChild
            int r1 = r1 + r4
            r0.firstWindowIndexInChild = r1
            int r3 = r3 + 1
            goto L0
        L18:
            return
    }

    private void disableChildSource(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r2) {
            r1 = this;
            java.util.HashMap<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder, com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener> r0 = r1.childSources
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener r2 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceAndListener) r2
            if (r2 == 0) goto L11
            com.google.android.exoplayer2.source.MediaSource r0 = r2.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r2 = r2.caller
            r0.disable(r2)
        L11:
            return
    }

    private void disableUnusedMediaSources() {
            r3 = this;
            java.util.Set<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r3.enabledMediaSourceHolders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r1 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r1
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r2 = r1.activeMediaPeriodIds
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            r3.disableChildSource(r1)
            r0.remove()
            goto L6
        L21:
            return
    }

    private void enableMediaSource(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r2) {
            r1 = this;
            java.util.Set<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r1.enabledMediaSourceHolders
            r0.add(r2)
            java.util.HashMap<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder, com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener> r0 = r1.childSources
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener r2 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceAndListener) r2
            if (r2 == 0) goto L16
            com.google.android.exoplayer2.source.MediaSource r0 = r2.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r2 = r2.caller
            r0.enable(r2)
        L16:
            return
    }

    private static java.lang.Object getChildPeriodUid(java.lang.Object r0) {
            java.lang.Object r0 = com.google.android.exoplayer2.AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(r0)
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r6, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r7) {
            r0 = 0
        L1:
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r6.activeMediaPeriodIds
            int r1 = r1.size()
            if (r0 >= r1) goto L27
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r6.activeMediaPeriodIds
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r1
            long r1 = r1.windowSequenceNumber
            long r3 = r7.windowSequenceNumber
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L24
            java.lang.Object r0 = r7.periodUid
            java.lang.Object r6 = getPeriodUid(r6, r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r6 = r7.copyWithPeriodUid(r6)
            return r6
        L24:
            int r0 = r0 + 1
            goto L1
        L27:
            r6 = 0
            return r6
    }

    private static java.lang.Object getMediaSourceHolderUid(java.lang.Object r0) {
            java.lang.Object r0 = com.google.android.exoplayer2.AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(r0)
            return r0
    }

    private static java.lang.Object getPeriodUid(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r0, java.lang.Object r1) {
            java.lang.Object r0 = r0.uid
            java.lang.Object r0 = com.google.android.exoplayer2.AbstractConcatenatedTimeline.getConcatenatedUid(r0, r1)
            return r0
    }

    private static int getWindowIndexForChildWindowIndex(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r0, int r1) {
            int r0 = r0.firstWindowIndexInChild
            int r1 = r1 + r0
            return r1
    }

    private /* synthetic */ void lambda$prepareChildSource$0(com.google.android.exoplayer2.source.MediaSource r1, com.google.android.exoplayer2.Timeline r2) {
            r0 = this;
            com.google.android.exoplayer2.MediaSourceList$MediaSourceListInfoRefreshListener r1 = r0.mediaSourceListInfoListener
            r1.onPlaylistUpdateRequested()
            return
    }

    private void maybeReleaseChildSource(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r4) {
            r3 = this;
            boolean r0 = r4.isRemoved
            if (r0 == 0) goto L34
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r0 = r4.activeMediaPeriodIds
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L34
            java.util.HashMap<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder, com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener> r0 = r3.childSources
            java.lang.Object r0 = r0.remove(r4)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceAndListener) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceAndListener) r0
            com.google.android.exoplayer2.source.MediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r2 = r0.caller
            r1.releaseSource(r2)
            com.google.android.exoplayer2.source.MediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r2 = r0.eventListener
            r1.removeEventListener(r2)
            com.google.android.exoplayer2.source.MediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r0 = r0.eventListener
            r1.removeDrmEventListener(r0)
            java.util.Set<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r3.enabledMediaSourceHolders
            r0.remove(r4)
        L34:
            return
    }

    private void prepareChildSource(com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder r6) {
            r5 = this;
            com.google.android.exoplayer2.source.MaskingMediaSource r0 = r6.mediaSource
            com.google.android.exoplayer2.MediaSourceList$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.MediaSourceList$$ExternalSyntheticLambda0
            r1.<init>(r5)
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r2 = new com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener
            r2.<init>(r5, r6)
            java.util.HashMap<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder, com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener> r3 = r5.childSources
            com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener r4 = new com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener
            r4.<init>(r0, r1, r2)
            r3.put(r6, r4)
            android.os.Handler r6 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper()
            r0.addEventListener(r6, r2)
            android.os.Handler r6 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper()
            r0.addDrmEventListener(r6, r2)
            com.google.android.exoplayer2.upstream.TransferListener r6 = r5.mediaTransferListener
            com.google.android.exoplayer2.analytics.PlayerId r2 = r5.playerId
            r0.prepareSource(r1, r6, r2)
            return
    }

    private void removeMediaSourcesInternal(int r5, int r6) {
            r4 = this;
            r0 = 1
            int r6 = r6 - r0
        L2:
            if (r6 < r5) goto L2d
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r4.mediaSourceHolders
            java.lang.Object r1 = r1.remove(r6)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r1 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r1
            java.util.Map<java.lang.Object, com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r2 = r4.mediaSourceByUid
            java.lang.Object r3 = r1.uid
            r2.remove(r3)
            com.google.android.exoplayer2.source.MaskingMediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.Timeline r2 = r2.getTimeline()
            int r2 = r2.getWindowCount()
            int r2 = -r2
            r4.correctOffsets(r6, r2)
            r1.isRemoved = r0
            boolean r2 = r4.isPrepared
            if (r2 == 0) goto L2a
            r4.maybeReleaseChildSource(r1)
        L2a:
            int r6 = r6 + (-1)
            goto L2
        L2d:
            return
    }

    public com.google.android.exoplayer2.Timeline addMediaSources(int r4, java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> r5, com.google.android.exoplayer2.source.ShuffleOrder r6) {
            r3 = this;
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L6d
            r3.shuffleOrder = r6
            r6 = r4
        L9:
            int r0 = r5.size()
            int r0 = r0 + r4
            if (r6 >= r0) goto L6d
            int r0 = r6 - r4
            java.lang.Object r0 = r5.get(r0)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r0
            if (r6 <= 0) goto L35
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r3.mediaSourceHolders
            int r2 = r6 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r1 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r1
            com.google.android.exoplayer2.source.MaskingMediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.Timeline r2 = r2.getTimeline()
            int r1 = r1.firstWindowIndexInChild
            int r2 = r2.getWindowCount()
            int r2 = r2 + r1
            r0.reset(r2)
            goto L39
        L35:
            r1 = 0
            r0.reset(r1)
        L39:
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.Timeline r1 = r1.getTimeline()
            int r1 = r1.getWindowCount()
            r3.correctOffsets(r6, r1)
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r3.mediaSourceHolders
            r1.add(r6, r0)
            java.util.Map<java.lang.Object, com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r3.mediaSourceByUid
            java.lang.Object r2 = r0.uid
            r1.put(r2, r0)
            boolean r1 = r3.isPrepared
            if (r1 == 0) goto L6a
            r3.prepareChildSource(r0)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r3.mediaSourceByMediaPeriod
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L67
            java.util.Set<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r3.enabledMediaSourceHolders
            r1.add(r0)
            goto L6a
        L67:
            r3.disableChildSource(r0)
        L6a:
            int r6 = r6 + 1
            goto L9
        L6d:
            com.google.android.exoplayer2.Timeline r4 = r3.createTimeline()
            return r4
    }

    public com.google.android.exoplayer2.Timeline clear(@androidx.annotation.Nullable com.google.android.exoplayer2.source.ShuffleOrder r2) {
            r1 = this;
            if (r2 == 0) goto L3
            goto L9
        L3:
            com.google.android.exoplayer2.source.ShuffleOrder r2 = r1.shuffleOrder
            com.google.android.exoplayer2.source.ShuffleOrder r2 = r2.cloneAndClear()
        L9:
            r1.shuffleOrder = r2
            r2 = 0
            int r0 = r1.getSize()
            r1.removeMediaSourcesInternal(r2, r0)
            com.google.android.exoplayer2.Timeline r2 = r1.createTimeline()
            return r2
    }

    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.upstream.Allocator r4, long r5) {
            r2 = this;
            java.lang.Object r0 = r3.periodUid
            java.lang.Object r0 = getMediaSourceHolderUid(r0)
            java.lang.Object r1 = r3.periodUid
            java.lang.Object r1 = getChildPeriodUid(r1)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.copyWithPeriodUid(r1)
            java.util.Map<java.lang.Object, com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r2.mediaSourceByUid
            java.lang.Object r0 = r1.get(r0)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r0
            r2.enableMediaSource(r0)
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r0.activeMediaPeriodIds
            r1.add(r3)
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            com.google.android.exoplayer2.source.MaskingMediaPeriod r3 = r1.createPeriod(r3, r4, r5)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r4 = r2.mediaSourceByMediaPeriod
            r4.put(r3, r0)
            r2.disableUnusedMediaSources()
            return r3
    }

    public com.google.android.exoplayer2.Timeline createTimeline() {
            r3 = this;
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r3.mediaSourceHolders
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.google.android.exoplayer2.Timeline r0 = com.google.android.exoplayer2.Timeline.EMPTY
            return r0
        Lb:
            r0 = 0
            r1 = 0
        Ld:
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r2 = r3.mediaSourceHolders
            int r2 = r2.size()
            if (r0 >= r2) goto L2d
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r2 = r3.mediaSourceHolders
            java.lang.Object r2 = r2.get(r0)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r2 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r2
            r2.firstWindowIndexInChild = r1
            com.google.android.exoplayer2.source.MaskingMediaSource r2 = r2.mediaSource
            com.google.android.exoplayer2.Timeline r2 = r2.getTimeline()
            int r2 = r2.getWindowCount()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto Ld
        L2d:
            com.google.android.exoplayer2.PlaylistTimeline r0 = new com.google.android.exoplayer2.PlaylistTimeline
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r3.mediaSourceHolders
            com.google.android.exoplayer2.source.ShuffleOrder r2 = r3.shuffleOrder
            r0.<init>(r1, r2)
            return r0
    }

    public int getSize() {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r1.mediaSourceHolders
            int r0 = r0.size()
            return r0
    }

    public boolean isPrepared() {
            r1 = this;
            boolean r0 = r1.isPrepared
            return r0
    }

    public com.google.android.exoplayer2.Timeline moveMediaSource(int r2, int r3, com.google.android.exoplayer2.source.ShuffleOrder r4) {
            r1 = this;
            int r0 = r2 + 1
            com.google.android.exoplayer2.Timeline r2 = r1.moveMediaSourceRange(r2, r0, r3, r4)
            return r2
    }

    public com.google.android.exoplayer2.Timeline moveMediaSourceRange(int r4, int r5, int r6, com.google.android.exoplayer2.source.ShuffleOrder r7) {
            r3 = this;
            r0 = 1
            if (r4 < 0) goto Lf
            if (r4 > r5) goto Lf
            int r1 = r3.getSize()
            if (r5 > r1) goto Lf
            if (r6 < 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r3.shuffleOrder = r7
            if (r4 == r5) goto L56
            if (r4 != r6) goto L1a
            goto L56
        L1a:
            int r7 = java.lang.Math.min(r4, r6)
            int r1 = r5 - r4
            int r1 = r1 + r6
            int r1 = r1 - r0
            int r0 = r5 + (-1)
            int r0 = java.lang.Math.max(r1, r0)
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r1 = r3.mediaSourceHolders
            java.lang.Object r1 = r1.get(r7)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r1 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r1
            int r1 = r1.firstWindowIndexInChild
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r2 = r3.mediaSourceHolders
            com.google.android.exoplayer2.util.Util.moveItems(r2, r4, r5, r6)
        L37:
            if (r7 > r0) goto L51
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r4 = r3.mediaSourceHolders
            java.lang.Object r4 = r4.get(r7)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r4 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r4
            r4.firstWindowIndexInChild = r1
            com.google.android.exoplayer2.source.MaskingMediaSource r4 = r4.mediaSource
            com.google.android.exoplayer2.Timeline r4 = r4.getTimeline()
            int r4 = r4.getWindowCount()
            int r1 = r1 + r4
            int r7 = r7 + 1
            goto L37
        L51:
            com.google.android.exoplayer2.Timeline r4 = r3.createTimeline()
            return r4
        L56:
            com.google.android.exoplayer2.Timeline r4 = r3.createTimeline()
            return r4
    }

    public void prepare(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r4) {
            r3 = this;
            boolean r0 = r3.isPrepared
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r3.mediaTransferListener = r4
            r4 = 0
        La:
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r3.mediaSourceHolders
            int r0 = r0.size()
            if (r4 >= r0) goto L25
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r3.mediaSourceHolders
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r0
            r3.prepareChildSource(r0)
            java.util.Set<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r2 = r3.enabledMediaSourceHolders
            r2.add(r0)
            int r4 = r4 + 1
            goto La
        L25:
            r3.isPrepared = r1
            return
    }

    public void release() {
            r5 = this;
            java.util.HashMap<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder, com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener> r0 = r5.childSources
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener r1 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceAndListener) r1
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource     // Catch: java.lang.RuntimeException -> L1e
            com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller r3 = r1.caller     // Catch: java.lang.RuntimeException -> L1e
            r2.releaseSource(r3)     // Catch: java.lang.RuntimeException -> L1e
            goto L26
        L1e:
            r2 = move-exception
            java.lang.String r3 = "MediaSourceList"
            java.lang.String r4 = "Failed to release child source."
            com.google.android.exoplayer2.util.Log.e(r3, r4, r2)
        L26:
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r3 = r1.eventListener
            r2.removeEventListener(r3)
            com.google.android.exoplayer2.source.MediaSource r2 = r1.mediaSource
            com.google.android.exoplayer2.MediaSourceList$ForwardingEventListener r1 = r1.eventListener
            r2.removeDrmEventListener(r1)
            goto La
        L35:
            java.util.HashMap<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder, com.google.android.exoplayer2.MediaSourceList$MediaSourceAndListener> r0 = r5.childSources
            r0.clear()
            java.util.Set<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r5.enabledMediaSourceHolders
            r0.clear()
            r0 = 0
            r5.isPrepared = r0
            return
    }

    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r3) {
            r2 = this;
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r2.mediaSourceByMediaPeriod
            java.lang.Object r0 = r0.remove(r3)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder r0 = (com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder) r0
            com.google.android.exoplayer2.source.MaskingMediaSource r1 = r0.mediaSource
            r1.releasePeriod(r3)
            java.util.List<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId> r1 = r0.activeMediaPeriodIds
            com.google.android.exoplayer2.source.MaskingMediaPeriod r3 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r3
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.id
            r1.remove(r3)
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r3 = r2.mediaSourceByMediaPeriod
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L27
            r2.disableUnusedMediaSources()
        L27:
            r2.maybeReleaseChildSource(r0)
            return
    }

    public com.google.android.exoplayer2.Timeline removeMediaSourceRange(int r2, int r3, com.google.android.exoplayer2.source.ShuffleOrder r4) {
            r1 = this;
            if (r2 < 0) goto Lc
            if (r2 > r3) goto Lc
            int r0 = r1.getSize()
            if (r3 > r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.shuffleOrder = r4
            r1.removeMediaSourcesInternal(r2, r3)
            com.google.android.exoplayer2.Timeline r2 = r1.createTimeline()
            return r2
    }

    public com.google.android.exoplayer2.Timeline setMediaSources(java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> r3, com.google.android.exoplayer2.source.ShuffleOrder r4) {
            r2 = this;
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r2.mediaSourceHolders
            int r0 = r0.size()
            r1 = 0
            r2.removeMediaSourcesInternal(r1, r0)
            java.util.List<com.google.android.exoplayer2.MediaSourceList$MediaSourceHolder> r0 = r2.mediaSourceHolders
            int r0 = r0.size()
            com.google.android.exoplayer2.Timeline r3 = r2.addMediaSources(r0, r3, r4)
            return r3
    }

    public com.google.android.exoplayer2.Timeline setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r3) {
            r2 = this;
            int r0 = r2.getSize()
            int r1 = r3.getLength()
            if (r1 == r0) goto L13
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r3.cloneAndClear()
            r1 = 0
            com.google.android.exoplayer2.source.ShuffleOrder r3 = r3.cloneAndInsert(r1, r0)
        L13:
            r2.shuffleOrder = r3
            com.google.android.exoplayer2.Timeline r3 = r2.createTimeline()
            return r3
    }
}
