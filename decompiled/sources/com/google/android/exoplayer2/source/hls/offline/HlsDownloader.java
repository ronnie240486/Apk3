package com.google.android.exoplayer2.source.hls.offline;

/* JADX INFO: loaded from: classes.dex */
public final class HlsDownloader extends com.google.android.exoplayer2.offline.SegmentDownloader<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> {
    @java.lang.Deprecated
    public HlsDownloader(com.google.android.exoplayer2.MediaItem r8, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r9, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r10, java.util.concurrent.Executor r11) {
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

    public HlsDownloader(com.google.android.exoplayer2.MediaItem r1, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> r2, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r3, java.util.concurrent.Executor r4, long r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public HlsDownloader(com.google.android.exoplayer2.MediaItem r2, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r3) {
            r1 = this;
            com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.source.hls.offline.HlsDownloader$$ExternalSyntheticLambda0.INSTANCE
            r1.<init>(r2, r3, r0)
            return
    }

    public HlsDownloader(com.google.android.exoplayer2.MediaItem r8, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory r9, java.util.concurrent.Executor r10) {
            r7 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser r2 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser
            r2.<init>()
            r5 = 20000(0x4e20, double:9.8813E-320)
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private void addMediaPlaylistDataSpecs(java.util.List<android.net.Uri> r3, java.util.List<com.google.android.exoplayer2.upstream.DataSpec> r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L17
            java.lang.Object r1 = r3.get(r0)
            android.net.Uri r1 = (android.net.Uri) r1
            com.google.android.exoplayer2.upstream.DataSpec r1 = com.google.android.exoplayer2.offline.SegmentDownloader.getCompressibleDataSpec(r1)
            r4.add(r1)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    private void addSegment(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r10, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment r11, java.util.HashSet<android.net.Uri> r12, java.util.ArrayList<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> r13) {
            r9 = this;
            java.lang.String r0 = r10.baseUri
            long r1 = r10.startTimeUs
            long r3 = r11.relativeStartTimeUs
            long r1 = r1 + r3
            java.lang.String r10 = r11.fullSegmentEncryptionKeyUri
            if (r10 == 0) goto L21
            android.net.Uri r10 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r0, r10)
            boolean r12 = r12.add(r10)
            if (r12 == 0) goto L21
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r12 = new com.google.android.exoplayer2.offline.SegmentDownloader$Segment
            com.google.android.exoplayer2.upstream.DataSpec r10 = com.google.android.exoplayer2.offline.SegmentDownloader.getCompressibleDataSpec(r10)
            r12.<init>(r1, r10)
            r13.add(r12)
        L21:
            java.lang.String r10 = r11.url
            android.net.Uri r4 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r0, r10)
            com.google.android.exoplayer2.upstream.DataSpec r10 = new com.google.android.exoplayer2.upstream.DataSpec
            long r5 = r11.byteRangeOffset
            long r7 = r11.byteRangeLength
            r3 = r10
            r3.<init>(r4, r5, r7)
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r11 = new com.google.android.exoplayer2.offline.SegmentDownloader$Segment
            r11.<init>(r1, r10)
            r13.add(r11)
            return
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public final java.util.List getSegments(com.google.android.exoplayer2.upstream.DataSource r9, com.google.android.exoplayer2.offline.FilterableManifest r10, boolean r11) throws java.io.IOException, java.lang.InterruptedException {
            r8 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist r10 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r10 instanceof com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist
            if (r1 == 0) goto L13
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r10 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist) r10
            java.util.List<android.net.Uri> r10 = r10.mediaPlaylistUrls
            r8.addMediaPlaylistDataSpecs(r10, r0)
            goto L20
        L13:
            java.lang.String r10 = r10.baseUri
            android.net.Uri r10 = android.net.Uri.parse(r10)
            com.google.android.exoplayer2.upstream.DataSpec r10 = com.google.android.exoplayer2.offline.SegmentDownloader.getCompressibleDataSpec(r10)
            r0.add(r10)
        L20:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            com.google.android.exoplayer2.upstream.DataSpec r2 = (com.google.android.exoplayer2.upstream.DataSpec) r2
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r3 = new com.google.android.exoplayer2.offline.SegmentDownloader$Segment
            r4 = 0
            r3.<init>(r4, r2)
            r10.add(r3)
            com.google.android.exoplayer2.offline.FilterableManifest r2 = r8.getManifest(r9, r2, r11)     // Catch: java.io.IOException -> L6a
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist) r2     // Catch: java.io.IOException -> L6a
            r3 = 0
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r4 = r2.segments
            r5 = 0
        L4e:
            int r6 = r4.size()
            if (r5 >= r6) goto L2e
            java.lang.Object r6 = r4.get(r5)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r6 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r6
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r7 = r6.initializationSegment
            if (r7 == 0) goto L64
            if (r7 == r3) goto L64
            r8.addSegment(r2, r7, r1, r10)
            r3 = r7
        L64:
            r8.addSegment(r2, r6, r1, r10)
            int r5 = r5 + 1
            goto L4e
        L6a:
            r2 = move-exception
            if (r11 == 0) goto L6e
            goto L2e
        L6e:
            throw r2
        L6f:
            return r10
    }
}
