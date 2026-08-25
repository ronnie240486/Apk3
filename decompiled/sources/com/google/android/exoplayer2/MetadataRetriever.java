package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataRetriever {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.MetadataRetriever$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final com.google.android.exoplayer2.source.MediaSource.Factory mediaSourceFactory;
        private final com.google.android.exoplayer2.util.HandlerWrapper mediaSourceHandler;
        private final android.os.HandlerThread mediaSourceThread;
        private final com.google.common.util.concurrent.SettableFuture<com.google.android.exoplayer2.source.TrackGroupArray> trackGroupsFuture;

        /* JADX INFO: loaded from: classes2.dex */
        public final class MediaSourceHandlerCallback implements android.os.Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private com.google.android.exoplayer2.source.MediaPeriod mediaPeriod;
            private com.google.android.exoplayer2.source.MediaSource mediaSource;
            private final com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller mediaSourceCaller;
            public final /* synthetic */ com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal this$0;

            /* JADX INFO: loaded from: classes.dex */
            public final class MediaSourceCaller implements com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller {
                private final com.google.android.exoplayer2.upstream.Allocator allocator;
                private final com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller.MediaPeriodCallback mediaPeriodCallback;
                private boolean mediaPeriodCreated;
                public final /* synthetic */ com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback this$1;

                public final class MediaPeriodCallback implements com.google.android.exoplayer2.source.MediaPeriod.Callback {
                    public final /* synthetic */ com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller this$2;

                    private MediaPeriodCallback(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller r1) {
                            r0 = this;
                            r0.this$2 = r1
                            r0.<init>()
                            return
                    }

                    public /* synthetic */ MediaPeriodCallback(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.MediaSourceCaller r1, com.google.android.exoplayer2.MetadataRetriever.AnonymousClass1 r2) {
                            r0 = this;
                            r0.<init>(r1)
                            return
                    }

                    public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod r2) {
                            r1 = this;
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller r2 = r1.this$2
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback r2 = r2.this$1
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r2 = r2.this$0
                            com.google.android.exoplayer2.util.HandlerWrapper r2 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$100(r2)
                            r0 = 2
                            com.google.android.exoplayer2.util.HandlerWrapper$Message r2 = r2.obtainMessage(r0)
                            r2.sendToTarget()
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
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller r0 = r1.this$2
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback r0 = r0.this$1
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r0 = r0.this$0
                            com.google.common.util.concurrent.SettableFuture r0 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$200(r0)
                            com.google.android.exoplayer2.source.TrackGroupArray r2 = r2.getTrackGroups()
                            r0.set(r2)
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller r2 = r1.this$2
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback r2 = r2.this$1
                            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r2 = r2.this$0
                            com.google.android.exoplayer2.util.HandlerWrapper r2 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$100(r2)
                            r0 = 3
                            com.google.android.exoplayer2.util.HandlerWrapper$Message r2 = r2.obtainMessage(r0)
                            r2.sendToTarget()
                            return
                    }
                }

                public MediaSourceCaller(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback r3) {
                        r2 = this;
                        r2.this$1 = r3
                        r2.<init>()
                        com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller$MediaPeriodCallback r3 = new com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller$MediaPeriodCallback
                        r0 = 0
                        r3.<init>(r2, r0)
                        r2.mediaPeriodCallback = r3
                        com.google.android.exoplayer2.upstream.DefaultAllocator r3 = new com.google.android.exoplayer2.upstream.DefaultAllocator
                        r0 = 1
                        r1 = 65536(0x10000, float:9.1835E-41)
                        r3.<init>(r0, r1)
                        r2.allocator = r3
                        return
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource r5, com.google.android.exoplayer2.Timeline r6) {
                        r4 = this;
                        boolean r0 = r4.mediaPeriodCreated
                        if (r0 == 0) goto L5
                        return
                    L5:
                        r0 = 1
                        r4.mediaPeriodCreated = r0
                        com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback r0 = r4.this$1
                        com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
                        r2 = 0
                        java.lang.Object r6 = r6.getUidOfPeriod(r2)
                        r1.<init>(r6)
                        com.google.android.exoplayer2.upstream.Allocator r6 = r4.allocator
                        r2 = 0
                        com.google.android.exoplayer2.source.MediaPeriod r5 = r5.createPeriod(r1, r6, r2)
                        com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.access$502(r0, r5)
                        com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback r5 = r4.this$1
                        com.google.android.exoplayer2.source.MediaPeriod r5 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.access$500(r5)
                        com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller$MediaPeriodCallback r6 = r4.mediaPeriodCallback
                        r5.prepare(r6, r2)
                        return
                }
            }

            public MediaSourceHandlerCallback(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller r1 = new com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller
                    r1.<init>(r0)
                    r0.mediaSourceCaller = r1
                    return
            }

            public static /* synthetic */ com.google.android.exoplayer2.source.MediaPeriod access$500(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback r0) {
                    com.google.android.exoplayer2.source.MediaPeriod r0 = r0.mediaPeriod
                    return r0
            }

            public static /* synthetic */ com.google.android.exoplayer2.source.MediaPeriod access$502(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback r0, com.google.android.exoplayer2.source.MediaPeriod r1) {
                    r0.mediaPeriod = r1
                    return r1
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message r5) {
                    r4 = this;
                    int r0 = r5.what
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L86
                    r5 = 3
                    if (r0 == r2) goto L4f
                    r3 = 2
                    if (r0 == r3) goto L41
                    if (r0 == r5) goto L10
                    r5 = 0
                    return r5
                L10:
                    com.google.android.exoplayer2.source.MediaPeriod r5 = r4.mediaPeriod
                    if (r5 == 0) goto L21
                    com.google.android.exoplayer2.source.MediaSource r5 = r4.mediaSource
                    java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                    com.google.android.exoplayer2.source.MediaSource r5 = (com.google.android.exoplayer2.source.MediaSource) r5
                    com.google.android.exoplayer2.source.MediaPeriod r0 = r4.mediaPeriod
                    r5.releasePeriod(r0)
                L21:
                    com.google.android.exoplayer2.source.MediaSource r5 = r4.mediaSource
                    java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                    com.google.android.exoplayer2.source.MediaSource r5 = (com.google.android.exoplayer2.source.MediaSource) r5
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller r0 = r4.mediaSourceCaller
                    r5.releaseSource(r0)
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r5 = r4.this$0
                    com.google.android.exoplayer2.util.HandlerWrapper r5 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$100(r5)
                    r5.removeCallbacksAndMessages(r1)
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r5 = r4.this$0
                    android.os.HandlerThread r5 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$300(r5)
                    r5.quit()
                    return r2
                L41:
                    com.google.android.exoplayer2.source.MediaPeriod r5 = r4.mediaPeriod
                    java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
                    com.google.android.exoplayer2.source.MediaPeriod r5 = (com.google.android.exoplayer2.source.MediaPeriod) r5
                    r0 = 0
                    r5.continueLoading(r0)
                    return r2
                L4f:
                    com.google.android.exoplayer2.source.MediaPeriod r0 = r4.mediaPeriod     // Catch: java.lang.Exception -> L6e
                    if (r0 != 0) goto L5f
                    com.google.android.exoplayer2.source.MediaSource r0 = r4.mediaSource     // Catch: java.lang.Exception -> L6e
                    java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Exception -> L6e
                    com.google.android.exoplayer2.source.MediaSource r0 = (com.google.android.exoplayer2.source.MediaSource) r0     // Catch: java.lang.Exception -> L6e
                    r0.maybeThrowSourceInfoRefreshError()     // Catch: java.lang.Exception -> L6e
                    goto L62
                L5f:
                    r0.maybeThrowPrepareError()     // Catch: java.lang.Exception -> L6e
                L62:
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r0 = r4.this$0     // Catch: java.lang.Exception -> L6e
                    com.google.android.exoplayer2.util.HandlerWrapper r0 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$100(r0)     // Catch: java.lang.Exception -> L6e
                    r1 = 100
                    r0.sendEmptyMessageDelayed(r2, r1)     // Catch: java.lang.Exception -> L6e
                    goto L85
                L6e:
                    r0 = move-exception
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r1 = r4.this$0
                    com.google.common.util.concurrent.SettableFuture r1 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$200(r1)
                    r1.setException(r0)
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r0 = r4.this$0
                    com.google.android.exoplayer2.util.HandlerWrapper r0 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$100(r0)
                    com.google.android.exoplayer2.util.HandlerWrapper$Message r5 = r0.obtainMessage(r5)
                    r5.sendToTarget()
                L85:
                    return r2
                L86:
                    java.lang.Object r5 = r5.obj
                    com.google.android.exoplayer2.MediaItem r5 = (com.google.android.exoplayer2.MediaItem) r5
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r0 = r4.this$0
                    com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$000(r0)
                    com.google.android.exoplayer2.source.MediaSource r5 = r0.createMediaSource(r5)
                    r4.mediaSource = r5
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback$MediaSourceCaller r0 = r4.mediaSourceCaller
                    com.google.android.exoplayer2.analytics.PlayerId r3 = com.google.android.exoplayer2.analytics.PlayerId.UNSET
                    r5.prepareSource(r0, r1, r3)
                    com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r5 = r4.this$0
                    com.google.android.exoplayer2.util.HandlerWrapper r5 = com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.access$100(r5)
                    r5.sendEmptyMessage(r2)
                    return r2
            }
        }

        public MetadataRetrieverInternal(com.google.android.exoplayer2.source.MediaSource.Factory r2, com.google.android.exoplayer2.util.Clock r3) {
                r1 = this;
                r1.<init>()
                r1.mediaSourceFactory = r2
                android.os.HandlerThread r2 = new android.os.HandlerThread
                java.lang.String r0 = "ExoPlayer:MetadataRetriever"
                r2.<init>(r0)
                r1.mediaSourceThread = r2
                r2.start()
                android.os.Looper r2 = r2.getLooper()
                com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback r0 = new com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback
                r0.<init>(r1)
                com.google.android.exoplayer2.util.HandlerWrapper r2 = r3.createHandler(r2, r0)
                r1.mediaSourceHandler = r2
                com.google.common.util.concurrent.SettableFuture r2 = com.google.common.util.concurrent.SettableFuture.create()
                r1.trackGroupsFuture = r2
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory access$000(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = r0.mediaSourceFactory
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.util.HandlerWrapper access$100(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal r0) {
                com.google.android.exoplayer2.util.HandlerWrapper r0 = r0.mediaSourceHandler
                return r0
        }

        public static /* synthetic */ com.google.common.util.concurrent.SettableFuture access$200(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal r0) {
                com.google.common.util.concurrent.SettableFuture<com.google.android.exoplayer2.source.TrackGroupArray> r0 = r0.trackGroupsFuture
                return r0
        }

        public static /* synthetic */ android.os.HandlerThread access$300(com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal r0) {
                android.os.HandlerThread r0 = r0.mediaSourceThread
                return r0
        }

        public com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(com.google.android.exoplayer2.MediaItem r3) {
                r2 = this;
                com.google.android.exoplayer2.util.HandlerWrapper r0 = r2.mediaSourceHandler
                r1 = 0
                com.google.android.exoplayer2.util.HandlerWrapper$Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                com.google.common.util.concurrent.SettableFuture<com.google.android.exoplayer2.source.TrackGroupArray> r3 = r2.trackGroupsFuture
                return r3
        }
    }

    private MetadataRetriever() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(android.content.Context r3, com.google.android.exoplayer2.MediaItem r4) {
            com.google.android.exoplayer2.util.Clock r0 = com.google.android.exoplayer2.util.Clock.DEFAULT
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory r1 = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
            r1.<init>()
            r2 = 6
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory r1 = r1.setMp4ExtractorFlags(r2)
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r2 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory
            r2.<init>(r3, r1)
            com.google.common.util.concurrent.ListenableFuture r3 = retrieveMetadata(r2, r4, r0)
            return r3
    }

    public static com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(com.google.android.exoplayer2.source.MediaSource.Factory r1, com.google.android.exoplayer2.MediaItem r2) {
            com.google.android.exoplayer2.util.Clock r0 = com.google.android.exoplayer2.util.Clock.DEFAULT
            com.google.common.util.concurrent.ListenableFuture r1 = retrieveMetadata(r1, r2, r0)
            return r1
    }

    private static com.google.common.util.concurrent.ListenableFuture<com.google.android.exoplayer2.source.TrackGroupArray> retrieveMetadata(com.google.android.exoplayer2.source.MediaSource.Factory r1, com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.util.Clock r3) {
            com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal r0 = new com.google.android.exoplayer2.MetadataRetriever$MetadataRetrieverInternal
            r0.<init>(r1, r3)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.retrieveMetadata(r2)
            return r1
    }
}
