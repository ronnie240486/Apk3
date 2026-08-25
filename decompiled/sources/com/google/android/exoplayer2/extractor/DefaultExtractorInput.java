package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorInput implements com.google.android.exoplayer2.extractor.ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final com.google.android.exoplayer2.upstream.DataReader dataReader;
    private byte[] peekBuffer;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final byte[] scratchSpace;
    private final long streamLength;

    static {
            java.lang.String r0 = "goog.exo.extractor"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    public DefaultExtractorInput(com.google.android.exoplayer2.upstream.DataReader r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.dataReader = r1
            r0.position = r2
            r0.streamLength = r4
            r1 = 65536(0x10000, float:9.1835E-41)
            byte[] r1 = new byte[r1]
            r0.peekBuffer = r1
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
            r0.scratchSpace = r1
            return
    }

    private void commitBytesRead(int r5) {
            r4 = this;
            r0 = -1
            if (r5 == r0) goto L9
            long r0 = r4.position
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.position = r0
        L9:
            return
    }

    private void ensureSpaceForPeek(int r4) {
            r3 = this;
            int r0 = r3.peekBufferPosition
            int r0 = r0 + r4
            byte[] r4 = r3.peekBuffer
            int r1 = r4.length
            if (r0 <= r1) goto L1d
            int r4 = r4.length
            int r4 = r4 * 2
            r1 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 + r0
            r2 = 524288(0x80000, float:7.34684E-40)
            int r0 = r0 + r2
            int r4 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r1, r0)
            byte[] r0 = r3.peekBuffer
            byte[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.peekBuffer = r4
        L1d:
            return
    }

    private int readFromPeekBuffer(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.peekBufferLength
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r5 = java.lang.Math.min(r0, r5)
            byte[] r0 = r2.peekBuffer
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            r2.updatePeekBuffer(r5)
            return r5
    }

    private int readFromUpstream(byte[] r2, int r3, int r4, int r5, boolean r6) throws java.io.IOException {
            r1 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L1e
            com.google.android.exoplayer2.upstream.DataReader r0 = r1.dataReader
            int r3 = r3 + r5
            int r4 = r4 - r5
            int r2 = r0.read(r2, r3, r4)
            r3 = -1
            if (r2 != r3) goto L1c
            if (r5 != 0) goto L16
            if (r6 == 0) goto L16
            return r3
        L16:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L1c:
            int r5 = r5 + r2
            return r5
        L1e:
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
            r2.<init>()
            throw r2
    }

    private int skipFromPeekBuffer(int r2) {
            r1 = this;
            int r0 = r1.peekBufferLength
            int r2 = java.lang.Math.min(r0, r2)
            r1.updatePeekBuffer(r2)
            return r2
    }

    private void updatePeekBuffer(int r6) {
            r5 = this;
            int r0 = r5.peekBufferLength
            int r0 = r0 - r6
            r5.peekBufferLength = r0
            r1 = 0
            r5.peekBufferPosition = r1
            byte[] r2 = r5.peekBuffer
            int r3 = r2.length
            r4 = 524288(0x80000, float:7.34684E-40)
            int r3 = r3 - r4
            if (r0 >= r3) goto L16
            r3 = 65536(0x10000, float:9.1835E-41)
            int r3 = r3 + r0
            byte[] r3 = new byte[r3]
            goto L17
        L16:
            r3 = r2
        L17:
            java.lang.System.arraycopy(r2, r6, r3, r1, r0)
            r5.peekBuffer = r3
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.advancePeekPosition(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int r8, boolean r9) throws java.io.IOException {
            r7 = this;
            r7.ensureSpaceForPeek(r8)
            int r0 = r7.peekBufferLength
            int r1 = r7.peekBufferPosition
            int r0 = r0 - r1
            r5 = r0
        L9:
            if (r5 >= r8) goto L21
            byte[] r2 = r7.peekBuffer
            int r3 = r7.peekBufferPosition
            r1 = r7
            r4 = r8
            r6 = r9
            int r5 = r1.readFromUpstream(r2, r3, r4, r5, r6)
            r0 = -1
            if (r5 != r0) goto L1b
            r8 = 0
            return r8
        L1b:
            int r0 = r7.peekBufferPosition
            int r0 = r0 + r5
            r7.peekBufferLength = r0
            goto L9
        L21:
            int r9 = r7.peekBufferPosition
            int r9 = r9 + r8
            r7.peekBufferPosition = r9
            r8 = 1
            return r8
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
            r2 = this;
            long r0 = r2.streamLength
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
            r4 = this;
            long r0 = r4.position
            int r2 = r4.peekBufferPosition
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
            r2 = this;
            long r0 = r2.position
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            r7.ensureSpaceForPeek(r10)
            int r0 = r7.peekBufferLength
            int r3 = r7.peekBufferPosition
            int r0 = r0 - r3
            if (r0 != 0) goto L1e
            byte[] r2 = r7.peekBuffer
            r5 = 0
            r6 = 1
            r1 = r7
            r4 = r10
            int r10 = r1.readFromUpstream(r2, r3, r4, r5, r6)
            r0 = -1
            if (r10 != r0) goto L18
            return r0
        L18:
            int r0 = r7.peekBufferLength
            int r0 = r0 + r10
            r7.peekBufferLength = r0
            goto L22
        L1e:
            int r10 = java.lang.Math.min(r10, r0)
        L22:
            byte[] r0 = r7.peekBuffer
            int r1 = r7.peekBufferPosition
            java.lang.System.arraycopy(r0, r1, r8, r9, r10)
            int r8 = r7.peekBufferPosition
            int r8 = r8 + r10
            r7.peekBufferPosition = r8
            return r10
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.peekFully(r2, r3, r4, r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] r2, int r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            boolean r5 = r1.advancePeekPosition(r4, r5)
            if (r5 != 0) goto L8
            r2 = 0
            return r2
        L8:
            byte[] r5 = r1.peekBuffer
            int r0 = r1.peekBufferPosition
            int r0 = r0 - r4
            java.lang.System.arraycopy(r5, r0, r2, r3, r4)
            r2 = 1
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            int r0 = r7.readFromPeekBuffer(r8, r9, r10)
            if (r0 != 0) goto L10
            r5 = 0
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r0 = r1.readFromUpstream(r2, r3, r4, r5, r6)
        L10:
            r7.commitBytesRead(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.readFully(r2, r3, r4, r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] r8, int r9, int r10, boolean r11) throws java.io.IOException {
            r7 = this;
            int r0 = r7.readFromPeekBuffer(r8, r9, r10)
            r5 = r0
        L5:
            r0 = -1
            if (r5 >= r10) goto L14
            if (r5 == r0) goto L14
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            int r5 = r1.readFromUpstream(r2, r3, r4, r5, r6)
            goto L5
        L14:
            r7.commitBytesRead(r5)
            if (r5 == r0) goto L1b
            r8 = 1
            goto L1c
        L1b:
            r8 = 0
        L1c:
            return r8
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
            r1 = this;
            r0 = 0
            r1.peekBufferPosition = r0
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends java.lang.Throwable> void setRetryPosition(long r4, E r6) throws java.lang.Throwable {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r3.position = r4
            throw r6
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int r8) throws java.io.IOException {
            r7 = this;
            int r0 = r7.skipFromPeekBuffer(r8)
            if (r0 != 0) goto L15
            byte[] r2 = r7.scratchSpace
            r3 = 0
            int r0 = r2.length
            int r4 = java.lang.Math.min(r8, r0)
            r5 = 0
            r6 = 1
            r1 = r7
            int r0 = r1.readFromUpstream(r2, r3, r4, r5, r6)
        L15:
            r7.commitBytesRead(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.skipFully(r2, r0)
            return
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int r8, boolean r9) throws java.io.IOException {
            r7 = this;
            int r0 = r7.skipFromPeekBuffer(r8)
            r5 = r0
        L5:
            r0 = -1
            if (r5 >= r8) goto L1c
            if (r5 == r0) goto L1c
            byte[] r0 = r7.scratchSpace
            int r0 = r0.length
            int r0 = r0 + r5
            int r4 = java.lang.Math.min(r8, r0)
            byte[] r2 = r7.scratchSpace
            int r3 = -r5
            r1 = r7
            r6 = r9
            int r5 = r1.readFromUpstream(r2, r3, r4, r5, r6)
            goto L5
        L1c:
            r7.commitBytesRead(r5)
            if (r5 == r0) goto L23
            r8 = 1
            goto L24
        L23:
            r8 = 0
        L24:
            return r8
    }
}
