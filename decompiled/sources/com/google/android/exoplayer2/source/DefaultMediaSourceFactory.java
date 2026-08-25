package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements com.google.android.exoplayer2.source.MediaSourceFactory {
    private static final java.lang.String TAG = "DMediaSourceFactory";

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.AdViewProvider adViewProvider;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.ads.AdsLoader.Provider adsLoaderProvider;
    private com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private boolean useProgressiveMediaSourceForSubtitles;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public interface AdsLoaderProvider extends com.google.android.exoplayer2.source.ads.AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {
        private com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private final com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final java.util.Map<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource.Factory> mediaSourceFactories;
        private final java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory>> mediaSourceFactorySuppliers;
        private final java.util.Set<java.lang.Integer> supportedTypes;

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$M749OSWtJ8xXVUD9V5IBAmkD3nQ(java.lang.Class r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$maybeLoadSupplier$3(r0)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$Mur96n6tNkIpu1yUP_B7-HAXIgk, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory m238$r8$lambda$Mur96n6tNkIpu1yUP_B7HAXIgk(java.lang.Class r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$maybeLoadSupplier$1(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$ZiYVZ346FdSpIQlsHmPy-P6lbuY, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory m239$r8$lambda$ZiYVZ346FdSpIQlsHmPyP6lbuY(java.lang.Class r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$maybeLoadSupplier$0(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$mlQXrr_zH9gyNu5f9-E2sGgdxd4, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory m240$r8$lambda$mlQXrr_zH9gyNu5f9E2sGgdxd4(java.lang.Class r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = lambda$maybeLoadSupplier$2(r0, r1)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory $r8$lambda$v5XdLnRjrD5Dbq2Zkel9T_x_xXM(com.google.android.exoplayer2.source.DefaultMediaSourceFactory.DelegateFactoryLoader r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = r0.lambda$maybeLoadSupplier$4(r1)
                return r0
        }

        public DelegateFactoryLoader(com.google.android.exoplayer2.extractor.ExtractorsFactory r1) {
                r0 = this;
                r0.<init>()
                r0.extractorsFactory = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.mediaSourceFactorySuppliers = r1
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.supportedTypes = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.mediaSourceFactories = r1
                return
        }

        private void ensureAllSuppliersAreLoaded() {
                r1 = this;
                r0 = 0
                r1.maybeLoadSupplier(r0)
                r0 = 1
                r1.maybeLoadSupplier(r0)
                r0 = 2
                r1.maybeLoadSupplier(r0)
                r0 = 3
                r1.maybeLoadSupplier(r0)
                r0 = 4
                r1.maybeLoadSupplier(r0)
                return
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$maybeLoadSupplier$0(java.lang.Class r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.access$100(r0, r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$maybeLoadSupplier$1(java.lang.Class r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.access$100(r0, r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$maybeLoadSupplier$2(java.lang.Class r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.access$100(r0, r1)
                return r0
        }

        private static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$maybeLoadSupplier$3(java.lang.Class r0) {
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = com.google.android.exoplayer2.source.DefaultMediaSourceFactory.access$000(r0)
                return r0
        }

        private /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$maybeLoadSupplier$4(com.google.android.exoplayer2.upstream.DataSource.Factory r3) {
                r2 = this;
                com.google.android.exoplayer2.source.ProgressiveMediaSource$Factory r0 = new com.google.android.exoplayer2.source.ProgressiveMediaSource$Factory
                com.google.android.exoplayer2.extractor.ExtractorsFactory r1 = r2.extractorsFactory
                r0.<init>(r3, r1)
                return r0
        }

        @androidx.annotation.Nullable
        private com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> maybeLoadSupplier(int r6) {
                r5 = this;
                java.lang.Class<com.google.android.exoplayer2.source.MediaSource$Factory> r0 = com.google.android.exoplayer2.source.MediaSource.Factory.class
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource$Factory>> r1 = r5.mediaSourceFactorySuppliers
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L1b
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource$Factory>> r0 = r5.mediaSourceFactorySuppliers
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r6 = r0.get(r6)
                com.google.common.base.Supplier r6 = (com.google.common.base.Supplier) r6
                return r6
            L1b:
                r1 = 0
                com.google.android.exoplayer2.upstream.DataSource$Factory r2 = r5.dataSourceFactory
                java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.upstream.DataSource$Factory r2 = (com.google.android.exoplayer2.upstream.DataSource.Factory) r2
                if (r6 == 0) goto L6a
                r3 = 1
                if (r6 == r3) goto L57
                r3 = 2
                if (r6 == r3) goto L4b
                r3 = 3
                if (r6 == r3) goto L3a
                r0 = 4
                if (r6 == r0) goto L33
                goto L77
            L33:
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0     // Catch: java.lang.ClassNotFoundException -> L68
                r0.<init>(r5, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L68
                r1 = r0
                goto L77
            L3a:
                java.lang.String r2 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L68
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L68
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda1 r2 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda1     // Catch: java.lang.ClassNotFoundException -> L68
                r2.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L68
                r1 = r2
                goto L77
            L4b:
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r4 = com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.class
                java.lang.Class r0 = r4.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L68
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0 r4 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0     // Catch: java.lang.ClassNotFoundException -> L68
                r4.<init>(r0, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L68
                goto L66
            L57:
                java.lang.String r4 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L68
                java.lang.Class r0 = r4.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L68
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0 r4 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0     // Catch: java.lang.ClassNotFoundException -> L68
                r4.<init>(r0, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L68
            L66:
                r1 = r4
                goto L77
            L68:
                goto L77
            L6a:
                java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.Factory.class
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L68
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0     // Catch: java.lang.ClassNotFoundException -> L68
                r4 = 0
                r3.<init>(r0, r2, r4)     // Catch: java.lang.ClassNotFoundException -> L68
                r1 = r3
            L77:
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource$Factory>> r0 = r5.mediaSourceFactorySuppliers
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r0.put(r2, r1)
                if (r1 == 0) goto L8b
                java.util.Set<java.lang.Integer> r0 = r5.supportedTypes
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0.add(r6)
            L8b:
                return r1
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.MediaSource.Factory getMediaSourceFactory(int r3) {
                r2 = this;
                java.util.Map<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource$Factory> r0 = r2.mediaSourceFactories
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r0.get(r1)
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = (com.google.android.exoplayer2.source.MediaSource.Factory) r0
                if (r0 == 0) goto Lf
                return r0
            Lf:
                com.google.common.base.Supplier r0 = r2.maybeLoadSupplier(r3)
                if (r0 != 0) goto L17
                r3 = 0
                return r3
            L17:
                java.lang.Object r0 = r0.get()
                com.google.android.exoplayer2.source.MediaSource$Factory r0 = (com.google.android.exoplayer2.source.MediaSource.Factory) r0
                com.google.android.exoplayer2.drm.DrmSessionManagerProvider r1 = r2.drmSessionManagerProvider
                if (r1 == 0) goto L24
                r0.setDrmSessionManagerProvider(r1)
            L24:
                com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1 = r2.loadErrorHandlingPolicy
                if (r1 == 0) goto L2b
                r0.setLoadErrorHandlingPolicy(r1)
            L2b:
                java.util.Map<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource$Factory> r1 = r2.mediaSourceFactories
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.put(r3, r0)
                return r0
        }

        public int[] getSupportedTypes() {
                r1 = this;
                r1.ensureAllSuppliersAreLoaded()
                java.util.Set<java.lang.Integer> r0 = r1.supportedTypes
                int[] r0 = com.google.common.primitives.Ints.toArray(r0)
                return r0
        }

        public void setDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
                r1 = this;
                com.google.android.exoplayer2.upstream.DataSource$Factory r0 = r1.dataSourceFactory
                if (r2 == r0) goto L10
                r1.dataSourceFactory = r2
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource$Factory>> r2 = r1.mediaSourceFactorySuppliers
                r2.clear()
                java.util.Map<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource$Factory> r2 = r1.mediaSourceFactories
                r2.clear()
            L10:
                return
        }

        public void setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r3) {
                r2 = this;
                r2.drmSessionManagerProvider = r3
                java.util.Map<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource$Factory> r0 = r2.mediaSourceFactories
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSource$Factory r1 = (com.google.android.exoplayer2.source.MediaSource.Factory) r1
                r1.setDrmSessionManagerProvider(r3)
                goto Lc
            L1c:
                return
        }

        public void setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r3) {
                r2 = this;
                r2.loadErrorHandlingPolicy = r3
                java.util.Map<java.lang.Integer, com.google.android.exoplayer2.source.MediaSource$Factory> r0 = r2.mediaSourceFactories
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSource$Factory r1 = (com.google.android.exoplayer2.source.MediaSource.Factory) r1
                r1.setLoadErrorHandlingPolicy(r3)
                goto Lc
            L1c:
                return
        }
    }

    public static final class UnknownSubtitlesExtractor implements com.google.android.exoplayer2.extractor.Extractor {
        private final com.google.android.exoplayer2.Format format;

        public UnknownSubtitlesExtractor(com.google.android.exoplayer2.Format r1) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                return
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void init(com.google.android.exoplayer2.extractor.ExtractorOutput r5) {
                r4 = this;
                r0 = 0
                r1 = 3
                com.google.android.exoplayer2.extractor.TrackOutput r0 = r5.track(r0, r1)
                com.google.android.exoplayer2.extractor.SeekMap$Unseekable r1 = new com.google.android.exoplayer2.extractor.SeekMap$Unseekable
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r1.<init>(r2)
                r5.seekMap(r1)
                r5.endTracks()
                com.google.android.exoplayer2.Format r5 = r4.format
                com.google.android.exoplayer2.Format$Builder r5 = r5.buildUpon()
                java.lang.String r1 = "text/x-unknown"
                com.google.android.exoplayer2.Format$Builder r5 = r5.setSampleMimeType(r1)
                com.google.android.exoplayer2.Format r1 = r4.format
                java.lang.String r1 = r1.sampleMimeType
                com.google.android.exoplayer2.Format$Builder r5 = r5.setCodecs(r1)
                com.google.android.exoplayer2.Format r5 = r5.build()
                r0.format(r5)
                return
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public int read(com.google.android.exoplayer2.extractor.ExtractorInput r1, com.google.android.exoplayer2.extractor.PositionHolder r2) throws java.io.IOException {
                r0 = this;
                r2 = 2147483647(0x7fffffff, float:NaN)
                int r1 = r1.skip(r2)
                r2 = -1
                if (r1 != r2) goto Lb
                return r2
            Lb:
                r1 = 0
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void release() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void seek(long r1, long r3) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$kCLgPvx_eEewdVW5S-3ZC0F5E4I, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] m237$r8$lambda$kCLgPvx_eEewdVW5S3ZC0F5E4I(com.google.android.exoplayer2.Format r0) {
            com.google.android.exoplayer2.extractor.Extractor[] r0 = lambda$createMediaSource$0(r0)
            return r0
    }

    public DefaultMediaSourceFactory(android.content.Context r2) {
            r1 = this;
            com.google.android.exoplayer2.upstream.DefaultDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultDataSource$Factory
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public DefaultMediaSourceFactory(android.content.Context r2, com.google.android.exoplayer2.extractor.ExtractorsFactory r3) {
            r1 = this;
            com.google.android.exoplayer2.upstream.DefaultDataSource$Factory r0 = new com.google.android.exoplayer2.upstream.DefaultDataSource$Factory
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public DefaultMediaSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
            r1 = this;
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory r0 = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public DefaultMediaSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory r2, com.google.android.exoplayer2.extractor.ExtractorsFactory r3) {
            r1 = this;
            r1.<init>()
            r1.dataSourceFactory = r2
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader r0 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader
            r0.<init>(r3)
            r1.delegateFactoryLoader = r0
            r0.setDataSourceFactory(r2)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.liveTargetOffsetMs = r2
            r1.liveMinOffsetMs = r2
            r1.liveMaxOffsetMs = r2
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1.liveMinSpeed = r2
            r1.liveMaxSpeed = r2
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory access$000(java.lang.Class r0) {
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = newInstance(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory access$100(java.lang.Class r0, com.google.android.exoplayer2.upstream.DataSource.Factory r1) {
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = newInstance(r0, r1)
            return r0
    }

    private static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$createMediaSource$0(com.google.android.exoplayer2.Format r3) {
            r0 = 1
            com.google.android.exoplayer2.extractor.Extractor[] r0 = new com.google.android.exoplayer2.extractor.Extractor[r0]
            com.google.android.exoplayer2.text.SubtitleDecoderFactory r1 = com.google.android.exoplayer2.text.SubtitleDecoderFactory.DEFAULT
            boolean r2 = r1.supportsFormat(r3)
            if (r2 == 0) goto L15
            com.google.android.exoplayer2.text.SubtitleExtractor r2 = new com.google.android.exoplayer2.text.SubtitleExtractor
            com.google.android.exoplayer2.text.SubtitleDecoder r1 = r1.createDecoder(r3)
            r2.<init>(r1, r3)
            goto L1a
        L15:
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory$UnknownSubtitlesExtractor r2 = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory$UnknownSubtitlesExtractor
            r2.<init>(r3)
        L1a:
            r3 = 0
            r0[r3] = r2
            return r0
    }

    private static com.google.android.exoplayer2.source.MediaSource maybeClipMediaSource(com.google.android.exoplayer2.MediaItem r12, com.google.android.exoplayer2.source.MediaSource r13) {
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r0 = r12.clippingConfiguration
            long r1 = r0.startPositionMs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L17
            long r3 = r0.endPositionMs
            r5 = -9223372036854775808
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L17
            boolean r0 = r0.relativeToDefaultPosition
            if (r0 != 0) goto L17
            return r13
        L17:
            com.google.android.exoplayer2.source.ClippingMediaSource r0 = new com.google.android.exoplayer2.source.ClippingMediaSource
            long r5 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r1 = r12.clippingConfiguration
            long r1 = r1.endPositionMs
            long r7 = com.google.android.exoplayer2.util.Util.msToUs(r1)
            com.google.android.exoplayer2.MediaItem$ClippingConfiguration r12 = r12.clippingConfiguration
            boolean r1 = r12.startsAtKeyFrame
            r9 = r1 ^ 1
            boolean r10 = r12.relativeToLiveWindow
            boolean r11 = r12.relativeToDefaultPosition
            r3 = r0
            r4 = r13
            r3.<init>(r4, r5, r7, r9, r10, r11)
            return r0
    }

    private com.google.android.exoplayer2.source.MediaSource maybeWrapWithAdsMediaSource(com.google.android.exoplayer2.MediaItem r10, com.google.android.exoplayer2.source.MediaSource r11) {
            r9 = this;
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r10.localConfiguration
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r10.localConfiguration
            com.google.android.exoplayer2.MediaItem$AdsConfiguration r0 = r0.adsConfiguration
            if (r0 != 0) goto Lc
            return r11
        Lc:
            com.google.android.exoplayer2.source.ads.AdsLoader$Provider r1 = r9.adsLoaderProvider
            com.google.android.exoplayer2.ui.AdViewProvider r8 = r9.adViewProvider
            java.lang.String r2 = "DMediaSourceFactory"
            if (r1 == 0) goto L46
            if (r8 != 0) goto L17
            goto L46
        L17:
            com.google.android.exoplayer2.source.ads.AdsLoader r7 = r1.getAdsLoader(r0)
            if (r7 != 0) goto L23
            java.lang.String r10 = "Playing media without ads, as no AdsLoader was provided."
            com.google.android.exoplayer2.util.Log.w(r2, r10)
            return r11
        L23:
            com.google.android.exoplayer2.source.ads.AdsMediaSource r1 = new com.google.android.exoplayer2.source.ads.AdsMediaSource
            com.google.android.exoplayer2.upstream.DataSpec r4 = new com.google.android.exoplayer2.upstream.DataSpec
            android.net.Uri r2 = r0.adTagUri
            r4.<init>(r2)
            java.lang.Object r2 = r0.adsId
            if (r2 == 0) goto L32
            r5 = r2
            goto L3f
        L32:
            java.lang.String r2 = r10.mediaId
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r10 = r10.localConfiguration
            android.net.Uri r10 = r10.uri
            android.net.Uri r0 = r0.adTagUri
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of(r2, r10, r0)
            r5 = r10
        L3f:
            r2 = r1
            r3 = r11
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        L46:
            java.lang.String r10 = "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider."
            com.google.android.exoplayer2.util.Log.w(r2, r10)
            return r11
    }

    private static com.google.android.exoplayer2.source.MediaSource.Factory newInstance(java.lang.Class<? extends com.google.android.exoplayer2.source.MediaSource.Factory> r2) {
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L10
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch: java.lang.Exception -> L10
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L10
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.Exception -> L10
            com.google.android.exoplayer2.source.MediaSource$Factory r2 = (com.google.android.exoplayer2.source.MediaSource.Factory) r2     // Catch: java.lang.Exception -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    private static com.google.android.exoplayer2.source.MediaSource.Factory newInstance(java.lang.Class<? extends com.google.android.exoplayer2.source.MediaSource.Factory> r4, com.google.android.exoplayer2.upstream.DataSource.Factory r5) {
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L17
            java.lang.Class<com.google.android.exoplayer2.upstream.DataSource$Factory> r2 = com.google.android.exoplayer2.upstream.DataSource.Factory.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L17
            java.lang.reflect.Constructor r4 = r4.getConstructor(r1)     // Catch: java.lang.Exception -> L17
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L17
            r0[r3] = r5     // Catch: java.lang.Exception -> L17
            java.lang.Object r4 = r4.newInstance(r0)     // Catch: java.lang.Exception -> L17
            com.google.android.exoplayer2.source.MediaSource$Factory r4 = (com.google.android.exoplayer2.source.MediaSource.Factory) r4     // Catch: java.lang.Exception -> L17
            return r4
        L17:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
            r1 = this;
            r0 = 0
            r1.adsLoaderProvider = r0
            r1.adViewProvider = r0
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public com.google.android.exoplayer2.source.MediaSource createMediaSource(com.google.android.exoplayer2.MediaItem r9) {
            r8 = this;
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r9.localConfiguration
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r9.localConfiguration
            android.net.Uri r0 = r0.uri
            java.lang.String r0 = r0.getScheme()
            if (r0 == 0) goto L25
            java.lang.String r1 = "ssai"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = r8.serverSideAdInsertionMediaSourceFactory
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.MediaSource$Factory r0 = (com.google.android.exoplayer2.source.MediaSource.Factory) r0
            com.google.android.exoplayer2.source.MediaSource r9 = r0.createMediaSource(r9)
            return r9
        L25:
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r0 = r9.localConfiguration
            android.net.Uri r1 = r0.uri
            java.lang.String r0 = r0.mimeType
            int r0 = com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(r1, r0)
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader r1 = r8.delegateFactoryLoader
            com.google.android.exoplayer2.source.MediaSource$Factory r1 = r1.getMediaSourceFactory(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No suitable media source factory found for content type: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r1, r0)
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r9.liveConfiguration
            com.google.android.exoplayer2.MediaItem$LiveConfiguration$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r9.liveConfiguration
            long r2 = r2.targetOffsetMs
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L61
            long r2 = r8.liveTargetOffsetMs
            r0.setTargetOffsetMs(r2)
        L61:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r9.liveConfiguration
            float r2 = r2.minPlaybackSpeed
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L71
            float r2 = r8.liveMinSpeed
            r0.setMinPlaybackSpeed(r2)
        L71:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r9.liveConfiguration
            float r2 = r2.maxPlaybackSpeed
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L7e
            float r2 = r8.liveMaxSpeed
            r0.setMaxPlaybackSpeed(r2)
        L7e:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r9.liveConfiguration
            long r2 = r2.minOffsetMs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L8b
            long r2 = r8.liveMinOffsetMs
            r0.setMinOffsetMs(r2)
        L8b:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r9.liveConfiguration
            long r2 = r2.maxOffsetMs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L98
            long r2 = r8.liveMaxOffsetMs
            r0.setMaxOffsetMs(r2)
        L98:
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r0.build()
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r2 = r9.liveConfiguration
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lb0
            com.google.android.exoplayer2.MediaItem$Builder r9 = r9.buildUpon()
            com.google.android.exoplayer2.MediaItem$Builder r9 = r9.setLiveConfiguration(r0)
            com.google.android.exoplayer2.MediaItem r9 = r9.build()
        Lb0:
            com.google.android.exoplayer2.source.MediaSource r0 = r1.createMediaSource(r9)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = r9.localConfiguration
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r1 = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) r1
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r1 = r1.subtitleConfigurations
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L17b
            int r2 = r1.size()
            int r2 = r2 + 1
            com.google.android.exoplayer2.source.MediaSource[] r2 = new com.google.android.exoplayer2.source.MediaSource[r2]
            r3 = 0
            r2[r3] = r0
        Lcf:
            int r0 = r1.size()
            if (r3 >= r0) goto L176
            boolean r0 = r8.useProgressiveMediaSourceForSubtitles
            if (r0 == 0) goto L156
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.Object r6 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            java.lang.String r6 = r6.mimeType
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r6)
            java.lang.Object r6 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            java.lang.String r6 = r6.language
            com.google.android.exoplayer2.Format$Builder r0 = r0.setLanguage(r6)
            java.lang.Object r6 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            int r6 = r6.selectionFlags
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSelectionFlags(r6)
            java.lang.Object r6 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            int r6 = r6.roleFlags
            com.google.android.exoplayer2.Format$Builder r0 = r0.setRoleFlags(r6)
            java.lang.Object r6 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            java.lang.String r6 = r6.label
            com.google.android.exoplayer2.Format$Builder r0 = r0.setLabel(r6)
            java.lang.Object r6 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            java.lang.String r6 = r6.id
            com.google.android.exoplayer2.Format$Builder r0 = r0.setId(r6)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0 r6 = new com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            r6.<init>(r0)
            com.google.android.exoplayer2.source.ProgressiveMediaSource$Factory r0 = new com.google.android.exoplayer2.source.ProgressiveMediaSource$Factory
            com.google.android.exoplayer2.upstream.DataSource$Factory r7 = r8.dataSourceFactory
            r0.<init>(r7, r6)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6 = r8.loadErrorHandlingPolicy
            if (r6 == 0) goto L13d
            r0.setLoadErrorHandlingPolicy(r6)
        L13d:
            int r6 = r3 + 1
            java.lang.Object r7 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r7 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r7
            android.net.Uri r7 = r7.uri
            java.lang.String r7 = r7.toString()
            com.google.android.exoplayer2.MediaItem r7 = com.google.android.exoplayer2.MediaItem.fromUri(r7)
            com.google.android.exoplayer2.source.ProgressiveMediaSource r0 = r0.createMediaSource(r7)
            r2[r6] = r0
            goto L172
        L156:
            com.google.android.exoplayer2.source.SingleSampleMediaSource$Factory r0 = new com.google.android.exoplayer2.source.SingleSampleMediaSource$Factory
            com.google.android.exoplayer2.upstream.DataSource$Factory r6 = r8.dataSourceFactory
            r0.<init>(r6)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r6 = r8.loadErrorHandlingPolicy
            if (r6 == 0) goto L164
            r0.setLoadErrorHandlingPolicy(r6)
        L164:
            int r6 = r3 + 1
            java.lang.Object r7 = r1.get(r3)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r7 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r7
            com.google.android.exoplayer2.source.SingleSampleMediaSource r0 = r0.createMediaSource(r7, r4)
            r2[r6] = r0
        L172:
            int r3 = r3 + 1
            goto Lcf
        L176:
            com.google.android.exoplayer2.source.MergingMediaSource r0 = new com.google.android.exoplayer2.source.MergingMediaSource
            r0.<init>(r2)
        L17b:
            com.google.android.exoplayer2.source.MediaSource r0 = maybeClipMediaSource(r9, r0)
            com.google.android.exoplayer2.source.MediaSource r9 = r8.maybeWrapWithAdsMediaSource(r9, r0)
            return r9
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory experimentalUseProgressiveMediaSourceForSubtitles(boolean r1) {
            r0 = this;
            r0.useProgressiveMediaSourceForSubtitles = r1
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public int[] getSupportedTypes() {
            r1 = this;
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader r0 = r1.delegateFactoryLoader
            int[] r0 = r0.getSupportedTypes()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setAdViewProvider(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.AdViewProvider r1) {
            r0 = this;
            r0.adViewProvider = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setAdsLoaderProvider(@androidx.annotation.Nullable com.google.android.exoplayer2.source.ads.AdsLoader.Provider r1) {
            r0 = this;
            r0.adsLoaderProvider = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory r2) {
            r1 = this;
            r1.dataSourceFactory = r2
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader r0 = r1.delegateFactoryLoader
            r0.setDataSourceFactory(r2)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r3) {
            r2 = this;
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader r0 = r2.delegateFactoryLoader
            java.lang.String r1 = "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3, r1)
            com.google.android.exoplayer2.drm.DrmSessionManagerProvider r3 = (com.google.android.exoplayer2.drm.DrmSessionManagerProvider) r3
            r0.setDrmSessionManagerProvider(r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider r1) {
            r0 = this;
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r1 = r0.setDrmSessionManagerProvider(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMaxOffsetMs(long r1) {
            r0 = this;
            r0.liveMaxOffsetMs = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMaxSpeed(float r1) {
            r0 = this;
            r0.liveMaxSpeed = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMinOffsetMs(long r1) {
            r0 = this;
            r0.liveMinOffsetMs = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveMinSpeed(float r1) {
            r0 = this;
            r0.liveMinSpeed = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLiveTargetOffsetMs(long r1) {
            r0 = this;
            r0.liveTargetOffsetMs = r1
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r2) {
            r1 = this;
            java.lang.String r0 = "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2, r0)
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r0 = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) r0
            r1.loadErrorHandlingPolicy = r0
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory$DelegateFactoryLoader r0 = r1.delegateFactoryLoader
            r0.setLoadErrorHandlingPolicy(r2)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r1) {
            r0 = this;
            com.google.android.exoplayer2.source.DefaultMediaSourceFactory r1 = r0.setLoadErrorHandlingPolicy(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setLocalAdInsertionComponents(com.google.android.exoplayer2.source.ads.AdsLoader.Provider r1, com.google.android.exoplayer2.ui.AdViewProvider r2) {
            r0 = this;
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.source.ads.AdsLoader$Provider r1 = (com.google.android.exoplayer2.source.ads.AdsLoader.Provider) r1
            r0.adsLoaderProvider = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.ui.AdViewProvider r1 = (com.google.android.exoplayer2.ui.AdViewProvider) r1
            r0.adViewProvider = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.source.DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(@androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.Factory r1) {
            r0 = this;
            r0.serverSideAdInsertionMediaSourceFactory = r1
            return r0
    }
}
