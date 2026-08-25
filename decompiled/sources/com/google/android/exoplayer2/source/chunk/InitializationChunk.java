package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class InitializationChunk extends com.google.android.exoplayer2.source.chunk.Chunk {
    private final com.google.android.exoplayer2.source.chunk.ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private long nextLoadPosition;
    private com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public InitializationChunk(com.google.android.exoplayer2.upstream.DataSource r12, com.google.android.exoplayer2.upstream.DataSpec r13, com.google.android.exoplayer2.Format r14, int r15, @androidx.annotation.Nullable java.lang.Object r16, com.google.android.exoplayer2.source.chunk.ChunkExtractor r17) {
            r11 = this;
            r3 = 2
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r11
            r1 = r12
            r2 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            r1 = r17
            r0.chunkExtractor = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
            r1 = this;
            r0 = 1
            r1.loadCanceled = r0
            return
    }

    public void init(com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider r1) {
            r0 = this;
            r0.trackOutputProvider = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws java.io.IOException {
            r11 = this;
            long r0 = r11.nextLoadPosition
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L19
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r5 = r11.chunkExtractor
            com.google.android.exoplayer2.source.chunk.ChunkExtractor$TrackOutputProvider r6 = r11.trackOutputProvider
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.init(r6, r7, r9)
        L19:
            com.google.android.exoplayer2.upstream.DataSpec r0 = r11.dataSpec     // Catch: java.lang.Throwable -> L5a
            long r1 = r11.nextLoadPosition     // Catch: java.lang.Throwable -> L5a
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.subrange(r1)     // Catch: java.lang.Throwable -> L5a
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r7 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput     // Catch: java.lang.Throwable -> L5a
            com.google.android.exoplayer2.upstream.StatsDataSource r2 = r11.dataSource     // Catch: java.lang.Throwable -> L5a
            long r3 = r0.position     // Catch: java.lang.Throwable -> L5a
            long r5 = r2.open(r0)     // Catch: java.lang.Throwable -> L5a
            r1 = r7
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L5a
        L2f:
            boolean r0 = r11.loadCanceled     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L3c
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r0 = r11.chunkExtractor     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.read(r7)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L3c
            goto L2f
        L3c:
            long r0 = r7.getPosition()     // Catch: java.lang.Throwable -> L5a
            com.google.android.exoplayer2.upstream.DataSpec r2 = r11.dataSpec     // Catch: java.lang.Throwable -> L5a
            long r2 = r2.position     // Catch: java.lang.Throwable -> L5a
            long r0 = r0 - r2
            r11.nextLoadPosition = r0     // Catch: java.lang.Throwable -> L5a
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r11.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r0)
            return
        L4d:
            r0 = move-exception
            long r1 = r7.getPosition()     // Catch: java.lang.Throwable -> L5a
            com.google.android.exoplayer2.upstream.DataSpec r3 = r11.dataSpec     // Catch: java.lang.Throwable -> L5a
            long r3 = r3.position     // Catch: java.lang.Throwable -> L5a
            long r1 = r1 - r3
            r11.nextLoadPosition = r1     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r11.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r1)
            throw r0
    }
}
