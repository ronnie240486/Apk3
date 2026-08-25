package com.google.android.exoplayer2.source.dash;

/* JADX INFO: loaded from: classes.dex */
public final class DashUtil {
    private DashUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.exoplayer2.upstream.DataSpec buildDataSpec(com.google.android.exoplayer2.source.dash.manifest.Representation r2, com.google.android.exoplayer2.source.dash.manifest.RangedUri r3, int r4) {
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r0 = r2.baseUrls
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r0 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r0
            java.lang.String r0 = r0.url
            com.google.android.exoplayer2.upstream.DataSpec r2 = buildDataSpec(r2, r0, r3, r4)
            return r2
    }

    public static com.google.android.exoplayer2.upstream.DataSpec buildDataSpec(com.google.android.exoplayer2.source.dash.manifest.Representation r2, java.lang.String r3, com.google.android.exoplayer2.source.dash.manifest.RangedUri r4, int r5) {
            com.google.android.exoplayer2.upstream.DataSpec$Builder r0 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r0.<init>()
            android.net.Uri r3 = r4.resolveUri(r3)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r0.setUri(r3)
            long r0 = r4.start
            com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r3.setPosition(r0)
            long r0 = r4.length
            com.google.android.exoplayer2.upstream.DataSpec$Builder r3 = r3.setLength(r0)
            java.lang.String r2 = resolveCacheKey(r2, r4)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r2 = r3.setKey(r2)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r2 = r2.setFlags(r5)
            com.google.android.exoplayer2.upstream.DataSpec r2 = r2.build()
            return r2
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.dash.manifest.Representation getFirstRepresentation(com.google.android.exoplayer2.source.dash.manifest.Period r2, int r3) {
            int r3 = r2.getAdaptationSetIndex(r3)
            r0 = 0
            r1 = -1
            if (r3 != r1) goto L9
            return r0
        L9:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r2 = r2.adaptationSets
            java.lang.Object r2 = r2.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r2 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r2
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r2 = r2.representations
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L1a
            goto L22
        L1a:
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            r0 = r2
            com.google.android.exoplayer2.source.dash.manifest.Representation r0 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r0
        L22:
            return r0
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.extractor.ChunkIndex loadChunkIndex(com.google.android.exoplayer2.upstream.DataSource r1, int r2, com.google.android.exoplayer2.source.dash.manifest.Representation r3) throws java.io.IOException {
            r0 = 0
            com.google.android.exoplayer2.extractor.ChunkIndex r1 = loadChunkIndex(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.extractor.ChunkIndex loadChunkIndex(com.google.android.exoplayer2.upstream.DataSource r1, int r2, com.google.android.exoplayer2.source.dash.manifest.Representation r3, int r4) throws java.io.IOException {
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r3.getInitializationUri()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            com.google.android.exoplayer2.Format r0 = r3.format
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r2 = newChunkExtractor(r2, r0)
            r0 = 1
            loadInitializationData(r2, r1, r3, r4, r0)     // Catch: java.lang.Throwable -> L1a
            r2.release()
            com.google.android.exoplayer2.extractor.ChunkIndex r1 = r2.getChunkIndex()
            return r1
        L1a:
            r1 = move-exception
            r2.release()
            throw r1
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.Format loadFormatWithDrmInitData(com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.source.dash.manifest.Period r3) throws java.io.IOException {
            r0 = 2
            com.google.android.exoplayer2.source.dash.manifest.Representation r1 = getFirstRepresentation(r3, r0)
            if (r1 != 0) goto L10
            r0 = 1
            com.google.android.exoplayer2.source.dash.manifest.Representation r1 = getFirstRepresentation(r3, r0)
            if (r1 != 0) goto L10
            r2 = 0
            return r2
        L10:
            com.google.android.exoplayer2.Format r3 = r1.format
            com.google.android.exoplayer2.Format r2 = loadSampleFormat(r2, r0, r1)
            if (r2 != 0) goto L19
            goto L1d
        L19:
            com.google.android.exoplayer2.Format r3 = r2.withManifestFormatInfo(r3)
        L1d:
            return r3
    }

    private static void loadInitializationData(com.google.android.exoplayer2.source.chunk.ChunkExtractor r2, com.google.android.exoplayer2.upstream.DataSource r3, com.google.android.exoplayer2.source.dash.manifest.Representation r4, int r5, boolean r6) throws java.io.IOException {
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r4.getInitializationUri()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = (com.google.android.exoplayer2.source.dash.manifest.RangedUri) r0
            if (r6 == 0) goto L29
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = r4.getIndexUri()
            if (r6 != 0) goto L13
            return
        L13:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r1 = r4.baseUrls
            java.lang.Object r1 = r1.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r1
            java.lang.String r1 = r1.url
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r0.attemptMerge(r6, r1)
            if (r1 != 0) goto L28
            loadInitializationData(r3, r4, r5, r2, r0)
            r0 = r6
            goto L29
        L28:
            r0 = r1
        L29:
            loadInitializationData(r3, r4, r5, r2, r0)
            return
    }

    public static void loadInitializationData(com.google.android.exoplayer2.source.chunk.ChunkExtractor r1, com.google.android.exoplayer2.upstream.DataSource r2, com.google.android.exoplayer2.source.dash.manifest.Representation r3, boolean r4) throws java.io.IOException {
            r0 = 0
            loadInitializationData(r1, r2, r3, r0, r4)
            return
    }

    private static void loadInitializationData(com.google.android.exoplayer2.upstream.DataSource r8, com.google.android.exoplayer2.source.dash.manifest.Representation r9, int r10, com.google.android.exoplayer2.source.chunk.ChunkExtractor r11, com.google.android.exoplayer2.source.dash.manifest.RangedUri r12) throws java.io.IOException {
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r0 = r9.baseUrls
            java.lang.Object r10 = r0.get(r10)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r10 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r10
            java.lang.String r10 = r10.url
            r0 = 0
            com.google.android.exoplayer2.upstream.DataSpec r3 = buildDataSpec(r9, r10, r12, r0)
            com.google.android.exoplayer2.source.chunk.InitializationChunk r10 = new com.google.android.exoplayer2.source.chunk.InitializationChunk
            com.google.android.exoplayer2.Format r4 = r9.format
            r5 = 0
            r6 = 0
            r1 = r10
            r2 = r8
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.load()
            return
    }

    public static com.google.android.exoplayer2.source.dash.manifest.DashManifest loadManifest(com.google.android.exoplayer2.upstream.DataSource r2, android.net.Uri r3) throws java.io.IOException {
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser r0 = new com.google.android.exoplayer2.source.dash.manifest.DashManifestParser
            r0.<init>()
            r1 = 4
            java.lang.Object r2 = com.google.android.exoplayer2.upstream.ParsingLoadable.load(r2, r0, r3, r1)
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r2 = (com.google.android.exoplayer2.source.dash.manifest.DashManifest) r2
            return r2
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.Format loadSampleFormat(com.google.android.exoplayer2.upstream.DataSource r1, int r2, com.google.android.exoplayer2.source.dash.manifest.Representation r3) throws java.io.IOException {
            r0 = 0
            com.google.android.exoplayer2.Format r1 = loadSampleFormat(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.Format loadSampleFormat(com.google.android.exoplayer2.upstream.DataSource r1, int r2, com.google.android.exoplayer2.source.dash.manifest.Representation r3, int r4) throws java.io.IOException {
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r3.getInitializationUri()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            com.google.android.exoplayer2.Format r0 = r3.format
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r2 = newChunkExtractor(r2, r0)
            r0 = 0
            loadInitializationData(r2, r1, r3, r4, r0)     // Catch: java.lang.Throwable -> L22
            r2.release()
            com.google.android.exoplayer2.Format[] r1 = r2.getSampleFormats()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r1)
            com.google.android.exoplayer2.Format[] r1 = (com.google.android.exoplayer2.Format[]) r1
            r1 = r1[r0]
            return r1
        L22:
            r1 = move-exception
            r2.release()
            throw r1
    }

    private static com.google.android.exoplayer2.source.chunk.ChunkExtractor newChunkExtractor(int r2, com.google.android.exoplayer2.Format r3) {
            java.lang.String r0 = r3.containerMimeType
            if (r0 == 0) goto L17
            java.lang.String r1 = "video/webm"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L15
            java.lang.String r1 = "audio/webm"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L20
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r0 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
            r0.<init>()
            goto L25
        L20:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r0 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            r0.<init>()
        L25:
            com.google.android.exoplayer2.source.chunk.BundledChunkExtractor r1 = new com.google.android.exoplayer2.source.chunk.BundledChunkExtractor
            r1.<init>(r0, r2, r3)
            return r1
    }

    public static java.lang.String resolveCacheKey(com.google.android.exoplayer2.source.dash.manifest.Representation r1, com.google.android.exoplayer2.source.dash.manifest.RangedUri r2) {
            java.lang.String r0 = r1.getCacheKey()
            if (r0 == 0) goto L7
            goto L1a
        L7:
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r1 = r1.baseUrls
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r1
            java.lang.String r1 = r1.url
            android.net.Uri r1 = r2.resolveUri(r1)
            java.lang.String r0 = r1.toString()
        L1a:
            return r0
    }
}
