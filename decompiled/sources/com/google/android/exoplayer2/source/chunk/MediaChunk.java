package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaChunk extends com.google.android.exoplayer2.source.chunk.Chunk {
    public final long chunkIndex;

    public MediaChunk(com.google.android.exoplayer2.upstream.DataSource r12, com.google.android.exoplayer2.upstream.DataSpec r13, com.google.android.exoplayer2.Format r14, int r15, @androidx.annotation.Nullable java.lang.Object r16, long r17, long r19, long r21) {
            r11 = this;
            r3 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            r1 = r21
            r0.chunkIndex = r1
            return
    }

    public long getNextChunkIndex() {
            r5 = this;
            long r0 = r5.chunkIndex
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            r2 = 1
            long r2 = r2 + r0
        Lb:
            return r2
    }

    public abstract boolean isLoadCompleted();
}
