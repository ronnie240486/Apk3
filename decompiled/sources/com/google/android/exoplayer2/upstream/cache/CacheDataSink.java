package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheDataSink implements com.google.android.exoplayer2.upstream.DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static final java.lang.String TAG = "CacheDataSink";
    private final int bufferSize;
    private com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream bufferedOutputStream;
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;

    @androidx.annotation.Nullable
    private java.io.File file;
    private final long fragmentSize;

    @androidx.annotation.Nullable
    private java.io.OutputStream outputStream;
    private long outputStreamBytesWritten;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class CacheDataSinkException extends com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        public CacheDataSinkException(java.io.IOException r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSink.Factory {
        private int bufferSize;
        private com.google.android.exoplayer2.upstream.cache.Cache cache;
        private long fragmentSize;

        public Factory() {
                r2 = this;
                r2.<init>()
                r0 = 5242880(0x500000, double:2.590327E-317)
                r2.fragmentSize = r0
                r0 = 20480(0x5000, float:2.8699E-41)
                r2.bufferSize = r0
                return
        }

        @Override // com.google.android.exoplayer2.upstream.DataSink.Factory
        public com.google.android.exoplayer2.upstream.DataSink createDataSink() {
                r5 = this;
                com.google.android.exoplayer2.upstream.cache.CacheDataSink r0 = new com.google.android.exoplayer2.upstream.cache.CacheDataSink
                com.google.android.exoplayer2.upstream.cache.Cache r1 = r5.cache
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.upstream.cache.Cache r1 = (com.google.android.exoplayer2.upstream.cache.Cache) r1
                long r2 = r5.fragmentSize
                int r4 = r5.bufferSize
                r0.<init>(r1, r2, r4)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSink.Factory setBufferSize(int r1) {
                r0 = this;
                r0.bufferSize = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSink.Factory setCache(com.google.android.exoplayer2.upstream.cache.Cache r1) {
                r0 = this;
                r0.cache = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.upstream.cache.CacheDataSink.Factory setFragmentSize(long r1) {
                r0 = this;
                r0.fragmentSize = r1
                return r0
        }
    }

    public CacheDataSink(com.google.android.exoplayer2.upstream.cache.Cache r2, long r3) {
            r1 = this;
            r0 = 20480(0x5000, float:2.8699E-41)
            r1.<init>(r2, r3, r0)
            return
    }

    public CacheDataSink(com.google.android.exoplayer2.upstream.cache.Cache r6, long r7, int r9) {
            r5 = this;
            r5.<init>()
            r0 = -1
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto L12
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L13
        L12:
            r2 = 1
        L13:
            java.lang.String r3 = "fragmentSize must be positive or C.LENGTH_UNSET."
            com.google.android.exoplayer2.util.Assertions.checkState(r2, r3)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2a
            r0 = 2097152(0x200000, double:1.036131E-317)
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 >= 0) goto L2a
            java.lang.String r0 = "CacheDataSink"
            java.lang.String r1 = "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance."
            com.google.android.exoplayer2.util.Log.w(r0, r1)
        L2a:
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.upstream.cache.Cache r6 = (com.google.android.exoplayer2.upstream.cache.Cache) r6
            r5.cache = r6
            if (r2 != 0) goto L39
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L39:
            r5.fragmentSize = r7
            r5.bufferSize = r9
            return
    }

    private void closeCurrentOutputStream() throws java.io.IOException {
            r4 = this;
            java.io.OutputStream r0 = r4.outputStream
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.flush()     // Catch: java.lang.Throwable -> L22
            java.io.OutputStream r0 = r4.outputStream
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            r4.outputStream = r1
            java.io.File r0 = r4.file
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.io.File r0 = (java.io.File) r0
            r4.file = r1
            com.google.android.exoplayer2.upstream.cache.Cache r1 = r4.cache
            long r2 = r4.outputStreamBytesWritten
            r1.commitFile(r0, r2)
            return
        L22:
            r0 = move-exception
            java.io.OutputStream r2 = r4.outputStream
            com.google.android.exoplayer2.util.Util.closeQuietly(r2)
            r4.outputStream = r1
            java.io.File r2 = r4.file
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)
            java.io.File r2 = (java.io.File) r2
            r4.file = r1
            r2.delete()
            throw r0
    }

    private void openNextOutputStream(com.google.android.exoplayer2.upstream.DataSpec r11) throws java.io.IOException {
            r10 = this;
            long r0 = r11.length
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto L12
        L9:
            long r2 = r10.dataSpecBytesWritten
            long r0 = r0 - r2
            long r2 = r10.dataSpecFragmentSize
            long r2 = java.lang.Math.min(r0, r2)
        L12:
            r8 = r2
            com.google.android.exoplayer2.upstream.cache.Cache r4 = r10.cache
            java.lang.String r0 = r11.key
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            long r0 = r11.position
            long r2 = r10.dataSpecBytesWritten
            long r6 = r0 + r2
            java.io.File r11 = r4.startFile(r5, r6, r8)
            r10.file = r11
            java.io.FileOutputStream r11 = new java.io.FileOutputStream
            java.io.File r0 = r10.file
            r11.<init>(r0)
            int r0 = r10.bufferSize
            if (r0 <= 0) goto L4b
            com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream r0 = r10.bufferedOutputStream
            if (r0 != 0) goto L43
            com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream r0 = new com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream
            int r1 = r10.bufferSize
            r0.<init>(r11, r1)
            r10.bufferedOutputStream = r0
            goto L46
        L43:
            r0.reset(r11)
        L46:
            com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream r11 = r10.bufferedOutputStream
            r10.outputStream = r11
            goto L4d
        L4b:
            r10.outputStream = r11
        L4d:
            r0 = 0
            r10.outputStreamBytesWritten = r0
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException {
            r2 = this;
            com.google.android.exoplayer2.upstream.DataSpec r0 = r2.dataSpec
            if (r0 != 0) goto L5
            return
        L5:
            r2.closeCurrentOutputStream()     // Catch: java.io.IOException -> L9
            return
        L9:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException r1 = new com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(com.google.android.exoplayer2.upstream.DataSpec r6) throws com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException {
            r5 = this;
            java.lang.String r0 = r6.key
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            long r0 = r6.length
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            r0 = 2
            boolean r0 = r6.isFlagSet(r0)
            if (r0 == 0) goto L18
            r6 = 0
            r5.dataSpec = r6
            return
        L18:
            r5.dataSpec = r6
            r0 = 4
            boolean r0 = r6.isFlagSet(r0)
            if (r0 == 0) goto L24
            long r0 = r5.fragmentSize
            goto L29
        L24:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L29:
            r5.dataSpecFragmentSize = r0
            r0 = 0
            r5.dataSpecBytesWritten = r0
            r5.openNextOutputStream(r6)     // Catch: java.io.IOException -> L33
            return
        L33:
            r6 = move-exception
            com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException r0 = new com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException
            r0.<init>(r6)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] r9, int r10, int r11) throws com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException {
            r8 = this;
            com.google.android.exoplayer2.upstream.DataSpec r0 = r8.dataSpec
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
        L6:
            if (r1 >= r11) goto L44
            long r2 = r8.outputStreamBytesWritten     // Catch: java.io.IOException -> L3d
            long r4 = r8.dataSpecFragmentSize     // Catch: java.io.IOException -> L3d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L16
            r8.closeCurrentOutputStream()     // Catch: java.io.IOException -> L3d
            r8.openNextOutputStream(r0)     // Catch: java.io.IOException -> L3d
        L16:
            int r2 = r11 - r1
            long r2 = (long) r2     // Catch: java.io.IOException -> L3d
            long r4 = r8.dataSpecFragmentSize     // Catch: java.io.IOException -> L3d
            long r6 = r8.outputStreamBytesWritten     // Catch: java.io.IOException -> L3d
            long r4 = r4 - r6
            long r2 = java.lang.Math.min(r2, r4)     // Catch: java.io.IOException -> L3d
            int r3 = (int) r2     // Catch: java.io.IOException -> L3d
            java.io.OutputStream r2 = r8.outputStream     // Catch: java.io.IOException -> L3d
            java.lang.Object r2 = com.google.android.exoplayer2.util.Util.castNonNull(r2)     // Catch: java.io.IOException -> L3d
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch: java.io.IOException -> L3d
            int r4 = r10 + r1
            r2.write(r9, r4, r3)     // Catch: java.io.IOException -> L3d
            int r1 = r1 + r3
            long r4 = r8.outputStreamBytesWritten     // Catch: java.io.IOException -> L3d
            long r2 = (long) r3     // Catch: java.io.IOException -> L3d
            long r4 = r4 + r2
            r8.outputStreamBytesWritten = r4     // Catch: java.io.IOException -> L3d
            long r4 = r8.dataSpecBytesWritten     // Catch: java.io.IOException -> L3d
            long r4 = r4 + r2
            r8.dataSpecBytesWritten = r4     // Catch: java.io.IOException -> L3d
            goto L6
        L3d:
            r9 = move-exception
            com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException r10 = new com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException
            r10.<init>(r9)
            throw r10
        L44:
            return
    }
}
