package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UploadDataProvider implements java.io.Closeable {
    public UploadDataProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    public abstract long getLength() throws java.io.IOException;

    public abstract void read(org.chromium.net.UploadDataSink r1, java.nio.ByteBuffer r2) throws java.io.IOException;

    public abstract void rewind(org.chromium.net.UploadDataSink r1) throws java.io.IOException;
}
