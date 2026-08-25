package com.google.android.exoplayer2.source.mediaparser;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(30)
@android.annotation.SuppressLint({"Override"})
public final class InputReaderAdapterV30 implements android.media.MediaParser.SeekableInputReader {
    private long currentPosition;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public InputReaderAdapterV30() {
            r0 = this;
            r0.<init>()
            return
    }

    public long getAndResetSeekPosition() {
            r4 = this;
            long r0 = r4.lastSeekPosition
            r2 = -1
            r4.lastSeekPosition = r2
            return r0
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
            r2 = this;
            long r0 = r2.resourceLength
            return r0
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
            r2 = this;
            long r0 = r2.currentPosition
            return r0
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataReader r0 = r2.dataReader
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.upstream.DataReader r0 = (com.google.android.exoplayer2.upstream.DataReader) r0
            int r3 = r0.read(r3, r4, r5)
            long r4 = r2.currentPosition
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.currentPosition = r4
            return r3
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long r1) {
            r0 = this;
            r0.lastSeekPosition = r1
            return
    }

    public void setCurrentPosition(long r1) {
            r0 = this;
            r0.currentPosition = r1
            return
    }

    public void setDataReader(com.google.android.exoplayer2.upstream.DataReader r1, long r2) {
            r0 = this;
            r0.dataReader = r1
            r0.resourceLength = r2
            r1 = -1
            r0.lastSeekPosition = r1
            return
    }
}
