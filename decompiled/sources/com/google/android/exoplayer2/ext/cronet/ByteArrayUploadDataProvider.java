package com.google.android.exoplayer2.ext.cronet;

/* JADX INFO: loaded from: classes2.dex */
final class ByteArrayUploadDataProvider extends org.chromium.net.UploadDataProvider {
    private final byte[] data;
    private int position;

    public ByteArrayUploadDataProvider(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
            r2 = this;
            byte[] r0 = r2.data
            int r0 = r0.length
            long r0 = (long) r0
            return r0
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(org.chromium.net.UploadDataSink r4, java.nio.ByteBuffer r5) throws java.io.IOException {
            r3 = this;
            int r0 = r5.remaining()
            byte[] r1 = r3.data
            int r1 = r1.length
            int r2 = r3.position
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            byte[] r1 = r3.data
            int r2 = r3.position
            r5.put(r1, r2, r0)
            int r5 = r3.position
            int r5 = r5 + r0
            r3.position = r5
            r5 = 0
            r4.onReadSucceeded(r5)
            return
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(org.chromium.net.UploadDataSink r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.position = r0
            r2.onRewindSucceeded()
            return
    }
}
