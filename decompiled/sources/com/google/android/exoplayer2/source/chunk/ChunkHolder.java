package com.google.android.exoplayer2.source.chunk;

/* JADX INFO: loaded from: classes3.dex */
public final class ChunkHolder {

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.source.chunk.Chunk chunk;
    public boolean endOfStream;

    public ChunkHolder() {
            r0 = this;
            r0.<init>()
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.chunk = r0
            r0 = 0
            r1.endOfStream = r0
            return
    }
}
