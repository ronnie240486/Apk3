package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes3.dex */
public interface ExtractorInput extends com.google.android.exoplayer2.upstream.DataReader {
    void advancePeekPosition(int r1) throws java.io.IOException;

    boolean advancePeekPosition(int r1, boolean r2) throws java.io.IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] r1, int r2, int r3) throws java.io.IOException;

    void peekFully(byte[] r1, int r2, int r3) throws java.io.IOException;

    boolean peekFully(byte[] r1, int r2, int r3, boolean r4) throws java.io.IOException;

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    int read(byte[] r1, int r2, int r3) throws java.io.IOException;

    void readFully(byte[] r1, int r2, int r3) throws java.io.IOException;

    boolean readFully(byte[] r1, int r2, int r3, boolean r4) throws java.io.IOException;

    void resetPeekPosition();

    <E extends java.lang.Throwable> void setRetryPosition(long r1, E r3) throws java.lang.Throwable;

    int skip(int r1) throws java.io.IOException;

    void skipFully(int r1) throws java.io.IOException;

    boolean skipFully(int r1, boolean r2) throws java.io.IOException;
}
