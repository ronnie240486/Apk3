package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleMediaChunk extends com.google.android.exoplayer2.source.chunk.BaseMediaChunk {
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final com.google.android.exoplayer2.Format sampleFormat;
    private final int trackType;

    public SingleSampleMediaChunk(com.google.android.exoplayer2.upstream.DataSource r17, com.google.android.exoplayer2.upstream.DataSpec r18, com.google.android.exoplayer2.Format r19, int r20, @androidx.annotation.Nullable java.lang.Object r21, long r22, long r24, long r26, int r28, com.google.android.exoplayer2.Format r29) {
            r16 = this;
            r14 = r16
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r24
            r14 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r14)
            r1 = r28
            r0.trackType = r1
            r1 = r29
            r0.sampleFormat = r1
            return
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
            r1 = this;
            boolean r0 = r1.loadCompleted
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws java.io.IOException {
            r11 = this;
            com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput r0 = r11.getOutput()
            r1 = 0
            r0.setSampleOffsetUs(r1)
            int r1 = r11.trackType
            r2 = 0
            com.google.android.exoplayer2.extractor.TrackOutput r3 = r0.track(r2, r1)
            com.google.android.exoplayer2.Format r0 = r11.sampleFormat
            r3.format(r0)
            com.google.android.exoplayer2.upstream.DataSpec r0 = r11.dataSpec     // Catch: java.lang.Throwable -> L5c
            long r4 = r11.nextLoadPosition     // Catch: java.lang.Throwable -> L5c
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.subrange(r4)     // Catch: java.lang.Throwable -> L5c
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r11.dataSource     // Catch: java.lang.Throwable -> L5c
            long r0 = r1.open(r0)     // Catch: java.lang.Throwable -> L5c
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L2c
            long r4 = r11.nextLoadPosition     // Catch: java.lang.Throwable -> L5c
            long r0 = r0 + r4
        L2c:
            r8 = r0
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r0 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput     // Catch: java.lang.Throwable -> L5c
            com.google.android.exoplayer2.upstream.StatsDataSource r5 = r11.dataSource     // Catch: java.lang.Throwable -> L5c
            long r6 = r11.nextLoadPosition     // Catch: java.lang.Throwable -> L5c
            r4 = r0
            r4.<init>(r5, r6, r8)     // Catch: java.lang.Throwable -> L5c
        L37:
            r1 = -1
            r10 = 1
            if (r2 == r1) goto L49
            long r4 = r11.nextLoadPosition     // Catch: java.lang.Throwable -> L5c
            long r1 = (long) r2     // Catch: java.lang.Throwable -> L5c
            long r4 = r4 + r1
            r11.nextLoadPosition = r4     // Catch: java.lang.Throwable -> L5c
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r3.sampleData(r0, r1, r10)     // Catch: java.lang.Throwable -> L5c
            goto L37
        L49:
            long r0 = r11.nextLoadPosition     // Catch: java.lang.Throwable -> L5c
            int r7 = (int) r0     // Catch: java.lang.Throwable -> L5c
            long r4 = r11.startTimeUs     // Catch: java.lang.Throwable -> L5c
            r6 = 1
            r8 = 0
            r9 = 0
            r3.sampleMetadata(r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5c
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = r11.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r0)
            r11.loadCompleted = r10
            return
        L5c:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.StatsDataSource r1 = r11.dataSource
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r1)
            throw r0
    }
}
