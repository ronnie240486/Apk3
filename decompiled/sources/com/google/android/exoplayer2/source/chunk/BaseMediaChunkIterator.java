package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMediaChunkIterator implements com.google.android.exoplayer2.source.chunk.MediaChunkIterator {
    private long currentIndex;
    private final long fromIndex;
    private final long toIndex;

    public BaseMediaChunkIterator(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.fromIndex = r1
            r0.toIndex = r3
            r0.reset()
            return
    }

    public final void checkInBounds() {
            r5 = this;
            long r0 = r5.currentIndex
            long r2 = r5.fromIndex
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            long r2 = r5.toIndex
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lf
            return
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final long getCurrentIndex() {
            r2 = this;
            long r0 = r2.currentIndex
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean isEnded() {
            r5 = this;
            long r0 = r5.currentIndex
            long r2 = r5.toIndex
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public boolean next() {
            r4 = this;
            long r0 = r4.currentIndex
            r2 = 1
            long r0 = r0 + r2
            r4.currentIndex = r0
            boolean r0 = r4.isEnded()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
    public void reset() {
            r4 = this;
            long r0 = r4.fromIndex
            r2 = 1
            long r0 = r0 - r2
            r4.currentIndex = r0
            return
    }
}
