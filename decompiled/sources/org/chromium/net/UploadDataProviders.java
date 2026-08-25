package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public final class UploadDataProviders {



    public static final class ByteBufferUploadProvider extends org.chromium.net.UploadDataProvider {
        private final java.nio.ByteBuffer mUploadBuffer;

        private ByteBufferUploadProvider(java.nio.ByteBuffer r1) {
                r0 = this;
                r0.<init>()
                r0.mUploadBuffer = r1
                return
        }

        public /* synthetic */ ByteBufferUploadProvider(java.nio.ByteBuffer r1, org.chromium.net.UploadDataProviders.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mUploadBuffer
                int r0 = r0.limit()
                long r0 = (long) r0
                return r0
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink r5, java.nio.ByteBuffer r6) {
                r4 = this;
                boolean r0 = r6.hasRemaining()
                if (r0 == 0) goto L3b
                int r0 = r6.remaining()
                java.nio.ByteBuffer r1 = r4.mUploadBuffer
                int r1 = r1.remaining()
                if (r0 < r1) goto L18
                java.nio.ByteBuffer r0 = r4.mUploadBuffer
                r6.put(r0)
                goto L36
            L18:
                java.nio.ByteBuffer r0 = r4.mUploadBuffer
                int r0 = r0.limit()
                java.nio.ByteBuffer r1 = r4.mUploadBuffer
                int r2 = r1.position()
                int r3 = r6.remaining()
                int r3 = r3 + r2
                r1.limit(r3)
                java.nio.ByteBuffer r1 = r4.mUploadBuffer
                r6.put(r1)
                java.nio.ByteBuffer r6 = r4.mUploadBuffer
                r6.limit(r0)
            L36:
                r6 = 0
                r5.onReadSucceeded(r6)
                return
            L3b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Cronet passed a buffer with no bytes remaining"
                r5.<init>(r6)
                throw r5
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.mUploadBuffer
                r1 = 0
                r0.position(r1)
                r3.onRewindSucceeded()
                return
        }
    }

    public interface FileChannelProvider {
        java.nio.channels.FileChannel getChannel() throws java.io.IOException;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class FileUploadProvider extends org.chromium.net.UploadDataProvider {
        private volatile java.nio.channels.FileChannel mChannel;
        private final java.lang.Object mLock;
        private final org.chromium.net.UploadDataProviders.FileChannelProvider mProvider;

        private FileUploadProvider(org.chromium.net.UploadDataProviders.FileChannelProvider r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                r1.mProvider = r2
                return
        }

        public /* synthetic */ FileUploadProvider(org.chromium.net.UploadDataProviders.FileChannelProvider r1, org.chromium.net.UploadDataProviders.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.nio.channels.FileChannel getChannel() throws java.io.IOException {
                r2 = this;
                java.nio.channels.FileChannel r0 = r2.mChannel
                if (r0 != 0) goto L18
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                java.nio.channels.FileChannel r1 = r2.mChannel     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L13
                org.chromium.net.UploadDataProviders$FileChannelProvider r1 = r2.mProvider     // Catch: java.lang.Throwable -> L15
                java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch: java.lang.Throwable -> L15
                r2.mChannel = r1     // Catch: java.lang.Throwable -> L15
            L13:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                goto L18
            L15:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
            L18:
                java.nio.channels.FileChannel r0 = r2.mChannel
                return r0
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.nio.channels.FileChannel r0 = r1.mChannel
                if (r0 == 0) goto L7
                r0.close()
            L7:
                return
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws java.io.IOException {
                r2 = this;
                java.nio.channels.FileChannel r0 = r2.getChannel()
                long r0 = r0.size()
                return r0
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink r6, java.nio.ByteBuffer r7) throws java.io.IOException {
                r5 = this;
                boolean r0 = r7.hasRemaining()
                if (r0 == 0) goto L1c
                java.nio.channels.FileChannel r0 = r5.getChannel()
                r1 = 0
                r2 = 0
            Lc:
                if (r2 != 0) goto L18
                int r3 = r0.read(r7)
                r4 = -1
                if (r3 != r4) goto L16
                goto L18
            L16:
                int r2 = r2 + r3
                goto Lc
            L18:
                r6.onReadSucceeded(r1)
                return
            L1c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Cronet passed a buffer with no bytes remaining"
                r6.<init>(r7)
                throw r6
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink r4) throws java.io.IOException {
                r3 = this;
                java.nio.channels.FileChannel r0 = r3.getChannel()
                r1 = 0
                r0.position(r1)
                r4.onRewindSucceeded()
                return
        }
    }

    private UploadDataProviders() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.chromium.net.UploadDataProvider create(android.os.ParcelFileDescriptor r2) {
            org.chromium.net.UploadDataProviders$FileUploadProvider r0 = new org.chromium.net.UploadDataProviders$FileUploadProvider
            org.chromium.net.UploadDataProviders$2 r1 = new org.chromium.net.UploadDataProviders$2
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static org.chromium.net.UploadDataProvider create(java.io.File r2) {
            org.chromium.net.UploadDataProviders$FileUploadProvider r0 = new org.chromium.net.UploadDataProviders$FileUploadProvider
            org.chromium.net.UploadDataProviders$1 r1 = new org.chromium.net.UploadDataProviders$1
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static org.chromium.net.UploadDataProvider create(java.nio.ByteBuffer r2) {
            org.chromium.net.UploadDataProviders$ByteBufferUploadProvider r0 = new org.chromium.net.UploadDataProviders$ByteBufferUploadProvider
            java.nio.ByteBuffer r2 = r2.slice()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static org.chromium.net.UploadDataProvider create(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            org.chromium.net.UploadDataProvider r2 = create(r2, r1, r0)
            return r2
    }

    public static org.chromium.net.UploadDataProvider create(byte[] r1, int r2, int r3) {
            org.chromium.net.UploadDataProviders$ByteBufferUploadProvider r0 = new org.chromium.net.UploadDataProviders$ByteBufferUploadProvider
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1, r2, r3)
            java.nio.ByteBuffer r1 = r1.slice()
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }
}
