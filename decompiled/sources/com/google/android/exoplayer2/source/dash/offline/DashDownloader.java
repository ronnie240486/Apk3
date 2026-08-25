package com.google.android.exoplayer2.source.dash.offline;

/* JADX INFO: loaded from: classes2.dex */
public final class DashDownloader extends com.google.android.exoplayer2.offline.SegmentDownloader<com.google.android.exoplayer2.source.dash.manifest.DashManifest> {
    private final com.google.android.exoplayer2.source.dash.BaseUrlExclusionList baseUrlExclusionList;


    @java.lang.Deprecated
    public DashDownloader(com.google.android.exoplayer2.MediaItem r8, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r9, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r10, java.util.concurrent.Executor r11) {
            r7 = this;
            r5 = 20000(0x4e20, double:9.8813E-320)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DashDownloader(com.google.android.exoplayer2.MediaItem r1, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r2, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r3, java.util.concurrent.Executor r4, long r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r1 = new com.google.android.exoplayer2.source.dash.BaseUrlExclusionList
            r1.<init>()
            r0.baseUrlExclusionList = r1
            return
    }

    public DashDownloader(com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r3) {
            r1 = this;
            com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0.INSTANCE$1
            r1.<init>(r2, r3, r0)
            return
    }

    public DashDownloader(com.google.android.exoplayer2.MediaItem r8, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r9, java.util.concurrent.Executor r10) {
            r7 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser r2 = new com.google.android.exoplayer2.source.dash.manifest.DashManifestParser
            r2.<init>()
            r5 = 20000(0x4e20, double:9.8813E-320)
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private void addSegmentsForAdaptationSet(com.google.android.exoplayer2.upstream.DataSource r27, com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r28, long r29, long r31, boolean r33, java.util.ArrayList<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> r34) throws java.io.IOException, java.lang.InterruptedException {
            r26 = this;
            r7 = r26
            r8 = r28
            r9 = r33
            r10 = r34
            r0 = 0
            r11 = 0
        La:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r8.representations
            int r0 = r0.size()
            if (r11 >= r0) goto Lbc
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r8.representations
            java.lang.Object r0 = r0.get(r11)
            com.google.android.exoplayer2.source.dash.manifest.Representation r0 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r0
            int r1 = r8.type     // Catch: java.io.IOException -> Lb0
            r12 = r27
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r13 = r7.getSegmentIndex(r12, r1, r0, r9)     // Catch: java.io.IOException -> Lae
            if (r13 == 0) goto La2
            r14 = r31
            long r16 = r13.getSegmentCount(r14)
            r1 = -1
            int r3 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r3 == 0) goto L9a
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r1 = r7.baseUrlExclusionList
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r2 = r0.baseUrls
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = r1.selectBaseUrl(r2)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r1
            java.lang.String r6 = r1.url
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r18 = r0.getInitializationUri()
            if (r18 == 0) goto L58
            r1 = r26
            r2 = r0
            r3 = r6
            r4 = r29
            r19 = r6
            r6 = r18
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
            goto L5a
        L58:
            r19 = r6
        L5a:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = r0.getIndexUri()
            if (r6 == 0) goto L6e
            r1 = r26
            r2 = r0
            r3 = r19
            r4 = r29
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
        L6e:
            long r1 = r13.getFirstSegmentNum()
            long r16 = r1 + r16
            r20 = 1
            long r16 = r16 - r20
            r4 = r1
        L79:
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 > 0) goto Lb7
            long r1 = r13.getTimeUs(r4)
            long r22 = r1 + r29
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = r13.getSegmentUrl(r4)
            r1 = r26
            r2 = r0
            r3 = r19
            r24 = r4
            r4 = r22
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
            long r4 = r24 + r20
            goto L79
        L9a:
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        La2:
            r14 = r31
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException     // Catch: java.io.IOException -> Lac
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch: java.io.IOException -> Lac
            throw r0     // Catch: java.io.IOException -> Lac
        Lac:
            r0 = move-exception
            goto Lb5
        Lae:
            r0 = move-exception
            goto Lb3
        Lb0:
            r0 = move-exception
            r12 = r27
        Lb3:
            r14 = r31
        Lb5:
            if (r9 == 0) goto Lbb
        Lb7:
            int r11 = r11 + 1
            goto La
        Lbb:
            throw r0
        Lbc:
            return
    }

    private com.google.android.exoplayer2.offline.SegmentDownloader.Segment createSegment(com.google.android.exoplayer2.source.dash.manifest.Representation r2, java.lang.String r3, long r4, com.google.android.exoplayer2.source.dash.manifest.RangedUri r6) {
            r1 = this;
            r0 = 0
            com.google.android.exoplayer2.upstream.DataSpec r2 = com.google.android.exoplayer2.source.dash.DashUtil.buildDataSpec(r2, r3, r6, r0)
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r3 = new com.google.android.exoplayer2.offline.SegmentDownloader$Segment
            r3.<init>(r4, r2)
            return r3
    }

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.source.dash.DashSegmentIndex getSegmentIndex(com.google.android.exoplayer2.upstream.DataSource r2, int r3, com.google.android.exoplayer2.source.dash.manifest.Representation r4, boolean r5) throws java.io.IOException, java.lang.InterruptedException {
            r1 = this;
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r4.getIndex()
            if (r0 == 0) goto L7
            return r0
        L7:
            com.google.android.exoplayer2.source.dash.offline.DashDownloader$1 r0 = new com.google.android.exoplayer2.source.dash.offline.DashDownloader$1
            r0.<init>(r2, r3, r4)
            java.lang.Object r2 = r1.execute(r0, r5)
            com.google.android.exoplayer2.extractor.ChunkIndex r2 = (com.google.android.exoplayer2.extractor.ChunkIndex) r2
            if (r2 != 0) goto L16
            r2 = 0
            goto L1e
        L16:
            com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex r3 = new com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex
            long r4 = r4.presentationTimeOffsetUs
            r3.<init>(r2, r4)
            r2 = r3
        L1e:
            return r2
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public final java.util.List getSegments(com.google.android.exoplayer2.upstream.DataSource r20, com.google.android.exoplayer2.offline.FilterableManifest r21, boolean r22) throws java.io.IOException, java.lang.InterruptedException {
            r19 = this;
            r0 = r21
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = (com.google.android.exoplayer2.source.dash.manifest.DashManifest) r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 0
            r12 = 0
        Lb:
            int r1 = r0.getPeriodCount()
            if (r12 >= r1) goto L47
            com.google.android.exoplayer2.source.dash.manifest.Period r1 = r0.getPeriod(r12)
            long r2 = r1.startMs
            long r13 = com.google.android.exoplayer2.util.Util.msToUs(r2)
            long r15 = r0.getPeriodDurationUs(r12)
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r9 = r1.adaptationSets
            r8 = 0
        L22:
            int r1 = r9.size()
            if (r8 >= r1) goto L44
            java.lang.Object r1 = r9.get(r8)
            r3 = r1
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r3 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r3
            r1 = r19
            r2 = r20
            r4 = r13
            r6 = r15
            r17 = r8
            r8 = r22
            r18 = r9
            r9 = r10
            r1.addSegmentsForAdaptationSet(r2, r3, r4, r6, r8, r9)
            int r8 = r17 + 1
            r9 = r18
            goto L22
        L44:
            int r12 = r12 + 1
            goto Lb
        L47:
            return r10
    }
}
