package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface DataSink {

    public interface Factory {
        com.google.android.exoplayer2.upstream.DataSink createDataSink();
    }

    void close() throws java.io.IOException;

    void open(com.google.android.exoplayer2.upstream.DataSpec r1) throws java.io.IOException;

    void write(byte[] r1, int r2, int r3) throws java.io.IOException;
}
