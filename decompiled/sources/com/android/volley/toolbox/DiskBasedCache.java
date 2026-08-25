package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes3.dex */
public class DiskBasedCache implements com.android.volley.Cache {
    private static final int CACHE_MAGIC = 538247942;
    private static final int DEFAULT_DISK_USAGE_BYTES = 5242880;
    private final java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache.CacheHeader> mEntries;
    private final int mMaxCacheSizeInBytes;
    private final com.android.volley.toolbox.DiskBasedCache.FileSupplier mRootDirectorySupplier;
    private long mTotalSize;


    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public static class CacheHeader {
        public final java.util.List<com.android.volley.Header> allResponseHeaders;
        public final java.lang.String etag;
        public final java.lang.String key;
        public final long lastModified;
        public final long serverDate;
        public long size;
        public final long softTtl;
        public final long ttl;

        public CacheHeader(java.lang.String r13, com.android.volley.Cache.Entry r14) {
                r12 = this;
                java.lang.String r2 = r14.etag
                long r3 = r14.serverDate
                long r5 = r14.lastModified
                long r7 = r14.ttl
                long r9 = r14.softTtl
                java.util.List r11 = getAllResponseHeaders(r14)
                r0 = r12
                r1 = r13
                r0.<init>(r1, r2, r3, r5, r7, r9, r11)
                return
        }

        private CacheHeader(java.lang.String r1, java.lang.String r2, long r3, long r5, long r7, long r9, java.util.List<com.android.volley.Header> r11) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                java.lang.String r1 = ""
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto Le
                r2 = 0
            Le:
                r0.etag = r2
                r0.serverDate = r3
                r0.lastModified = r5
                r0.ttl = r7
                r0.softTtl = r9
                r0.allResponseHeaders = r11
                return
        }

        private static java.util.List<com.android.volley.Header> getAllResponseHeaders(com.android.volley.Cache.Entry r4) {
                java.util.List<com.android.volley.Header> r0 = r4.allResponseHeaders
                if (r0 == 0) goto L5
                return r0
            L5:
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.responseHeaders
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L18:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r4.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                com.android.volley.Header r2 = new com.android.volley.Header
                java.lang.Object r3 = r1.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r2.<init>(r3, r1)
                r0.add(r2)
                goto L18
            L39:
                return r0
        }

        public static com.android.volley.toolbox.DiskBasedCache.CacheHeader readHeader(com.android.volley.toolbox.DiskBasedCache.CountingInputStream r16) throws java.io.IOException {
                int r0 = com.android.volley.toolbox.DiskBasedCache.readInt(r16)
                r1 = 538247942(0x20150306, float:1.2621791E-19)
                if (r0 != r1) goto L66
                java.lang.String r3 = com.android.volley.toolbox.DiskBasedCache.readString(r16)
                java.lang.String r4 = com.android.volley.toolbox.DiskBasedCache.readString(r16)
                long r5 = com.android.volley.toolbox.DiskBasedCache.readLong(r16)
                long r7 = com.android.volley.toolbox.DiskBasedCache.readLong(r16)
                long r9 = com.android.volley.toolbox.DiskBasedCache.readLong(r16)
                long r11 = com.android.volley.toolbox.DiskBasedCache.readLong(r16)
                int r0 = com.android.volley.toolbox.DiskBasedCache.readInt(r16)
                if (r0 < 0) goto L59
                if (r0 != 0) goto L2e
                java.util.List r1 = java.util.Collections.emptyList()
                goto L33
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L33:
                r13 = r1
                r1 = 0
            L35:
                if (r1 >= r0) goto L52
                java.lang.String r2 = com.android.volley.toolbox.DiskBasedCache.readString(r16)
                java.lang.String r2 = r2.intern()
                java.lang.String r14 = com.android.volley.toolbox.DiskBasedCache.readString(r16)
                java.lang.String r14 = r14.intern()
                com.android.volley.Header r15 = new com.android.volley.Header
                r15.<init>(r2, r14)
                r13.add(r15)
                int r1 = r1 + 1
                goto L35
            L52:
                com.android.volley.toolbox.DiskBasedCache$CacheHeader r0 = new com.android.volley.toolbox.DiskBasedCache$CacheHeader
                r2 = r0
                r2.<init>(r3, r4, r5, r7, r9, r11, r13)
                return r0
            L59:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "readHeaderList size="
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
                r1.<init>(r0)
                throw r1
            L66:
                java.io.IOException r0 = new java.io.IOException
                r0.<init>()
                throw r0
        }

        public final com.android.volley.Cache.Entry toCacheEntry(byte[] r5) {
                r4 = this;
                com.android.volley.Cache$Entry r0 = new com.android.volley.Cache$Entry
                r0.<init>()
                r0.data = r5
                java.lang.String r5 = r4.etag
                r0.etag = r5
                long r1 = r4.serverDate
                r0.serverDate = r1
                long r1 = r4.lastModified
                r0.lastModified = r1
                long r1 = r4.ttl
                r0.ttl = r1
                long r1 = r4.softTtl
                r0.softTtl = r1
                java.util.List<com.android.volley.Header> r5 = r4.allResponseHeaders
                java.util.TreeMap r1 = new java.util.TreeMap
                java.util.Comparator r2 = java.lang.String.CASE_INSENSITIVE_ORDER
                r1.<init>(r2)
                java.util.Iterator r5 = r5.iterator()
            L28:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L40
                java.lang.Object r2 = r5.next()
                com.android.volley.Header r2 = (com.android.volley.Header) r2
                java.lang.String r3 = r2.getName()
                java.lang.String r2 = r2.getValue()
                r1.put(r3, r2)
                goto L28
            L40:
                r0.responseHeaders = r1
                java.util.List<com.android.volley.Header> r5 = r4.allResponseHeaders
                java.util.List r5 = java.util.Collections.unmodifiableList(r5)
                r0.allResponseHeaders = r5
                return r0
        }

        public final boolean writeHeader(java.io.OutputStream r6) {
                r5 = this;
                r0 = 538247942(0x20150306, float:1.2621791E-19)
                r1 = 1
                r2 = 0
                com.android.volley.toolbox.DiskBasedCache.writeInt(r6, r0)     // Catch: java.io.IOException -> L5b
                java.lang.String r0 = r5.key     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeString(r6, r0)     // Catch: java.io.IOException -> L5b
                java.lang.String r0 = r5.etag     // Catch: java.io.IOException -> L5b
                if (r0 != 0) goto L13
                java.lang.String r0 = ""
            L13:
                com.android.volley.toolbox.DiskBasedCache.writeString(r6, r0)     // Catch: java.io.IOException -> L5b
                long r3 = r5.serverDate     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeLong(r6, r3)     // Catch: java.io.IOException -> L5b
                long r3 = r5.lastModified     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeLong(r6, r3)     // Catch: java.io.IOException -> L5b
                long r3 = r5.ttl     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeLong(r6, r3)     // Catch: java.io.IOException -> L5b
                long r3 = r5.softTtl     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeLong(r6, r3)     // Catch: java.io.IOException -> L5b
                java.util.List<com.android.volley.Header> r0 = r5.allResponseHeaders     // Catch: java.io.IOException -> L5b
                if (r0 == 0) goto L54
                int r3 = r0.size()     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeInt(r6, r3)     // Catch: java.io.IOException -> L5b
                java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L5b
            L39:
                boolean r3 = r0.hasNext()     // Catch: java.io.IOException -> L5b
                if (r3 == 0) goto L57
                java.lang.Object r3 = r0.next()     // Catch: java.io.IOException -> L5b
                com.android.volley.Header r3 = (com.android.volley.Header) r3     // Catch: java.io.IOException -> L5b
                java.lang.String r4 = r3.getName()     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeString(r6, r4)     // Catch: java.io.IOException -> L5b
                java.lang.String r3 = r3.getValue()     // Catch: java.io.IOException -> L5b
                com.android.volley.toolbox.DiskBasedCache.writeString(r6, r3)     // Catch: java.io.IOException -> L5b
                goto L39
            L54:
                com.android.volley.toolbox.DiskBasedCache.writeInt(r6, r2)     // Catch: java.io.IOException -> L5b
            L57:
                r6.flush()     // Catch: java.io.IOException -> L5b
                return r1
            L5b:
                r6 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.String r6 = r6.toString()
                r0[r2] = r6
                java.lang.String r6 = "%s"
                com.android.volley.VolleyLog.d(r6, r0)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public static class CountingInputStream extends java.io.FilterInputStream {
        private long bytesRead;
        private final long length;

        public CountingInputStream(java.io.InputStream r1, long r2) {
                r0 = this;
                r0.<init>(r1)
                r0.length = r2
                return
        }

        public final long bytesRemaining() {
                r4 = this;
                long r0 = r4.length
                long r2 = r4.bytesRead
                long r0 = r0 - r2
                return r0
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
                r5 = this;
                int r0 = super.read()
                r1 = -1
                if (r0 == r1) goto Le
                long r1 = r5.bytesRead
                r3 = 1
                long r1 = r1 + r3
                r5.bytesRead = r1
            Le:
                return r0
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                int r3 = super.read(r3, r4, r5)
                r4 = -1
                if (r3 == r4) goto Ld
                long r4 = r2.bytesRead
                long r0 = (long) r3
                long r4 = r4 + r0
                r2.bytesRead = r4
            Ld:
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface FileSupplier {
        java.io.File get();
    }

    public DiskBasedCache(com.android.volley.toolbox.DiskBasedCache.FileSupplier r2) {
            r1 = this;
            r0 = 5242880(0x500000, float:7.34684E-39)
            r1.<init>(r2, r0)
            return
    }

    public DiskBasedCache(com.android.volley.toolbox.DiskBasedCache.FileSupplier r5, int r6) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 1
            r0.<init>(r1, r2, r3)
            r4.mEntries = r0
            r0 = 0
            r4.mTotalSize = r0
            r4.mRootDirectorySupplier = r5
            r4.mMaxCacheSizeInBytes = r6
            return
    }

    public DiskBasedCache(java.io.File r2) {
            r1 = this;
            r0 = 5242880(0x500000, float:7.34684E-39)
            r1.<init>(r2, r0)
            return
    }

    public DiskBasedCache(java.io.File r5, int r6) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 1
            r0.<init>(r1, r2, r3)
            r4.mEntries = r0
            r0 = 0
            r4.mTotalSize = r0
            com.android.volley.toolbox.DiskBasedCache$1 r0 = new com.android.volley.toolbox.DiskBasedCache$1
            r0.<init>(r5)
            r4.mRootDirectorySupplier = r0
            r4.mMaxCacheSizeInBytes = r6
            return
    }

    private java.lang.String getFilenameForKey(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            int r0 = r0 / 2
            r1 = 0
            java.lang.String r1 = r3.substring(r1, r0)
            int r1 = r1.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.substring(r0)
            int r3 = r3.hashCode()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private void initializeIfRootDirectoryDeleted() {
            r2 = this;
            com.android.volley.toolbox.DiskBasedCache$FileSupplier r0 = r2.mRootDirectorySupplier
            java.io.File r0 = r0.get()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L20
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Re-initializing cache after external clearing."
            com.android.volley.VolleyLog.d(r1, r0)
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r2.mEntries
            r0.clear()
            r0 = 0
            r2.mTotalSize = r0
            r2.initialize()
        L20:
            return
    }

    private void pruneIfNeeded() {
            r14 = this;
            long r0 = r14.mTotalSize
            int r2 = r14.mMaxCacheSizeInBytes
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            return
        La:
            boolean r0 = com.android.volley.VolleyLog.DEBUG
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Pruning old cache entries."
            com.android.volley.VolleyLog.v(r2, r0)
        L16:
            long r2 = r14.mTotalSize
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r14.mEntries
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L27:
            boolean r7 = r0.hasNext()
            r8 = 2
            r9 = 1
            if (r7 == 0) goto L74
            java.lang.Object r7 = r0.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            com.android.volley.toolbox.DiskBasedCache$CacheHeader r7 = (com.android.volley.toolbox.DiskBasedCache.CacheHeader) r7
            java.lang.String r10 = r7.key
            java.io.File r10 = r14.getFileForKey(r10)
            boolean r10 = r10.delete()
            if (r10 == 0) goto L4f
            long r10 = r14.mTotalSize
            long r12 = r7.size
            long r10 = r10 - r12
            r14.mTotalSize = r10
            goto L60
        L4f:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r7 = r7.key
            r10[r1] = r7
            java.lang.String r7 = r14.getFilenameForKey(r7)
            r10[r9] = r7
            java.lang.String r7 = "Could not delete cache entry for key=%s, filename=%s"
            com.android.volley.VolleyLog.d(r7, r10)
        L60:
            r0.remove()
            int r6 = r6 + 1
            long r10 = r14.mTotalSize
            float r7 = (float) r10
            int r10 = r14.mMaxCacheSizeInBytes
            float r10 = (float) r10
            r11 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r11
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 >= 0) goto L27
        L74:
            boolean r0 = com.android.volley.VolleyLog.DEBUG
            if (r0 == 0) goto L9b
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r1] = r6
            long r6 = r14.mTotalSize
            long r6 = r6 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0[r9] = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r8] = r1
            java.lang.String r1 = "pruned %d files, %d bytes, %d ms"
            com.android.volley.VolleyLog.v(r1, r0)
        L9b:
            return
    }

    private void putEntry(java.lang.String r8, com.android.volley.toolbox.DiskBasedCache.CacheHeader r9) {
            r7 = this;
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r7.mEntries
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L10
            long r0 = r7.mTotalSize
            long r2 = r9.size
            long r0 = r0 + r2
            r7.mTotalSize = r0
            goto L22
        L10:
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r7.mEntries
            java.lang.Object r0 = r0.get(r8)
            com.android.volley.toolbox.DiskBasedCache$CacheHeader r0 = (com.android.volley.toolbox.DiskBasedCache.CacheHeader) r0
            long r1 = r7.mTotalSize
            long r3 = r9.size
            long r5 = r0.size
            long r3 = r3 - r5
            long r3 = r3 + r1
            r7.mTotalSize = r3
        L22:
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r7.mEntries
            r0.put(r8, r9)
            return
    }

    private static int read(java.io.InputStream r1) throws java.io.IOException {
            int r1 = r1.read()
            r0 = -1
            if (r1 == r0) goto L8
            return r1
        L8:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static int readInt(java.io.InputStream r2) throws java.io.IOException {
            int r0 = read(r2)
            int r0 = r0 << 0
            r0 = r0 | 0
            int r1 = read(r2)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = read(r2)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r2 = read(r2)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static long readLong(java.io.InputStream r7) throws java.io.IOException {
            int r0 = read(r7)
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 0
            long r0 = r0 << r4
            r4 = 0
            long r0 = r0 | r4
            int r4 = read(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = read(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = read(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = read(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = read(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = read(r7)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r7 = read(r7)
            long r4 = (long) r7
            long r2 = r2 & r4
            r7 = 56
            long r2 = r2 << r7
            long r0 = r0 | r2
            return r0
    }

    public static java.lang.String readString(com.android.volley.toolbox.DiskBasedCache.CountingInputStream r2) throws java.io.IOException {
            long r0 = readLong(r2)
            byte[] r2 = streamToBytes(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)
            return r0
    }

    private void removeEntry(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r4.mEntries
            java.lang.Object r5 = r0.remove(r5)
            com.android.volley.toolbox.DiskBasedCache$CacheHeader r5 = (com.android.volley.toolbox.DiskBasedCache.CacheHeader) r5
            if (r5 == 0) goto L11
            long r0 = r4.mTotalSize
            long r2 = r5.size
            long r0 = r0 - r2
            r4.mTotalSize = r0
        L11:
            return
    }

    @androidx.annotation.VisibleForTesting
    public static byte[] streamToBytes(com.android.volley.toolbox.DiskBasedCache.CountingInputStream r6, long r7) throws java.io.IOException {
            long r0 = r6.bytesRemaining()
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L1f
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L1f
            int r2 = (int) r7
            long r3 = (long) r2
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L1f
            byte[] r7 = new byte[r2]
            java.io.DataInputStream r8 = new java.io.DataInputStream
            r8.<init>(r6)
            r8.readFully(r7)
            return r7
        L1f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "streamToBytes length="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ", maxLength="
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
    }

    public static void writeInt(java.io.OutputStream r1, int r2) throws java.io.IOException {
            int r0 = r2 >> 0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    public static void writeLong(java.io.OutputStream r2, long r3) throws java.io.IOException {
            r0 = 0
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 8
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 16
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 24
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 32
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 40
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 48
            long r0 = r3 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r2.write(r0)
            r0 = 56
            long r3 = r3 >>> r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r2.write(r3)
            return
    }

    public static void writeString(java.io.OutputStream r2, java.lang.String r3) throws java.io.IOException {
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)
            int r0 = r3.length
            long r0 = (long) r0
            writeLong(r2, r0)
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // com.android.volley.Cache
    public synchronized void clear() {
            r5 = this;
            monitor-enter(r5)
            com.android.volley.toolbox.DiskBasedCache$FileSupplier r0 = r5.mRootDirectorySupplier     // Catch: java.lang.Throwable -> L2c
            java.io.File r0 = r0.get()     // Catch: java.lang.Throwable -> L2c
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            if (r0 == 0) goto L1a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2c
            r3 = 0
        L10:
            if (r3 >= r2) goto L1a
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L2c
            r4.delete()     // Catch: java.lang.Throwable -> L2c
            int r3 = r3 + 1
            goto L10
        L1a:
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r5.mEntries     // Catch: java.lang.Throwable -> L2c
            r0.clear()     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r5.mTotalSize = r2     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "Cache cleared."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2c
            com.android.volley.VolleyLog.d(r0, r1)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return
        L2c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // com.android.volley.Cache
    public synchronized com.android.volley.Cache.Entry get(java.lang.String r11) {
            r10 = this;
            monitor-enter(r10)
            java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache$CacheHeader> r0 = r10.mEntries     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L7f
            com.android.volley.toolbox.DiskBasedCache$CacheHeader r0 = (com.android.volley.toolbox.DiskBasedCache.CacheHeader) r0     // Catch: java.lang.Throwable -> L7f
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r10)
            return r1
        Le:
            java.io.File r2 = r10.getFileForKey(r11)     // Catch: java.lang.Throwable -> L7f
            r3 = 1
            r4 = 0
            r5 = 2
            com.android.volley.toolbox.DiskBasedCache$CountingInputStream r6 = new com.android.volley.toolbox.DiskBasedCache$CountingInputStream     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            r8.<init>(r2)     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            r7.<init>(r8)     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            long r8 = r2.length()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            r6.<init>(r7, r8)     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            com.android.volley.toolbox.DiskBasedCache$CacheHeader r7 = com.android.volley.toolbox.DiskBasedCache.CacheHeader.readHeader(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = r7.key     // Catch: java.lang.Throwable -> L61
            boolean r8 = android.text.TextUtils.equals(r11, r8)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L50
            java.lang.String r0 = "%s: key=%s, found=%s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L61
            r8[r4] = r9     // Catch: java.lang.Throwable -> L61
            r8[r3] = r11     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r7.key     // Catch: java.lang.Throwable -> L61
            r8[r5] = r7     // Catch: java.lang.Throwable -> L61
            com.android.volley.VolleyLog.d(r0, r8)     // Catch: java.lang.Throwable -> L61
            r10.removeEntry(r11)     // Catch: java.lang.Throwable -> L61
            r6.close()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            monitor-exit(r10)
            return r1
        L50:
            long r7 = r6.bytesRemaining()     // Catch: java.lang.Throwable -> L61
            byte[] r7 = streamToBytes(r6, r7)     // Catch: java.lang.Throwable -> L61
            com.android.volley.Cache$Entry r0 = r0.toCacheEntry(r7)     // Catch: java.lang.Throwable -> L61
            r6.close()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            monitor-exit(r10)
            return r0
        L61:
            r0 = move-exception
            r6.close()     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
            throw r0     // Catch: java.io.IOException -> L66 java.lang.Throwable -> L7f
        L66:
            r0 = move-exception
            java.lang.String r6 = "%s: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L7f
            r5[r4] = r2     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7f
            r5[r3] = r0     // Catch: java.lang.Throwable -> L7f
            com.android.volley.VolleyLog.d(r6, r5)     // Catch: java.lang.Throwable -> L7f
            r10.remove(r11)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r10)
            return r1
        L7f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    public java.io.File getFileForKey(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            com.android.volley.toolbox.DiskBasedCache$FileSupplier r1 = r2.mRootDirectorySupplier
            java.io.File r1 = r1.get()
            java.lang.String r3 = r2.getFilenameForKey(r3)
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.android.volley.Cache
    public synchronized void initialize() {
            r9 = this;
            monitor-enter(r9)
            com.android.volley.toolbox.DiskBasedCache$FileSupplier r0 = r9.mRootDirectorySupplier     // Catch: java.lang.Throwable -> L60
            java.io.File r0 = r0.get()     // Catch: java.lang.Throwable -> L60
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L60
            r2 = 0
            if (r1 != 0) goto L24
            boolean r1 = r0.mkdirs()     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L22
            java.lang.String r1 = "Unable to create cache dir %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L60
            r3[r2] = r0     // Catch: java.lang.Throwable -> L60
            com.android.volley.VolleyLog.e(r1, r3)     // Catch: java.lang.Throwable -> L60
        L22:
            monitor-exit(r9)
            return
        L24:
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L2c
            monitor-exit(r9)
            return
        L2c:
            int r1 = r0.length     // Catch: java.lang.Throwable -> L60
        L2d:
            if (r2 >= r1) goto L5e
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L60
            long r4 = r3.length()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            com.android.volley.toolbox.DiskBasedCache$CountingInputStream r6 = new com.android.volley.toolbox.DiskBasedCache$CountingInputStream     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            r8.<init>(r3)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            r7.<init>(r8)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            r6.<init>(r7, r4)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            com.android.volley.toolbox.DiskBasedCache$CacheHeader r7 = com.android.volley.toolbox.DiskBasedCache.CacheHeader.readHeader(r6)     // Catch: java.lang.Throwable -> L53
            r7.size = r4     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r7.key     // Catch: java.lang.Throwable -> L53
            r9.putEntry(r4, r7)     // Catch: java.lang.Throwable -> L53
            r6.close()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            goto L5b
        L53:
            r4 = move-exception
            r6.close()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
            throw r4     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L60
        L58:
            r3.delete()     // Catch: java.lang.Throwable -> L60
        L5b:
            int r2 = r2 + 1
            goto L2d
        L5e:
            monitor-exit(r9)
            return
        L60:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    @Override // com.android.volley.Cache
    public synchronized void invalidate(java.lang.String r4, boolean r5) {
            r3 = this;
            monitor-enter(r3)
            com.android.volley.Cache$Entry r0 = r3.get(r4)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            r1 = 0
            r0.softTtl = r1     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto Lf
            r0.ttl = r1     // Catch: java.lang.Throwable -> L14
        Lf:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r3)
            return
        L14:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // com.android.volley.Cache
    public synchronized void put(java.lang.String r8, com.android.volley.Cache.Entry r9) {
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.mTotalSize     // Catch: java.lang.Throwable -> L7b
            byte[] r2 = r9.data     // Catch: java.lang.Throwable -> L7b
            int r3 = r2.length     // Catch: java.lang.Throwable -> L7b
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L7b
            long r0 = r0 + r3
            int r3 = r7.mMaxCacheSizeInBytes     // Catch: java.lang.Throwable -> L7b
            long r4 = (long) r3     // Catch: java.lang.Throwable -> L7b
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1d
            int r0 = r2.length     // Catch: java.lang.Throwable -> L7b
            float r0 = (float) r0
            float r1 = (float) r3
            r2 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
            monitor-exit(r7)
            return
        L1d:
            java.io.File r0 = r7.getFileForKey(r8)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            r2 = 1
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r4.<init>(r0)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r3.<init>(r4)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            com.android.volley.toolbox.DiskBasedCache$CacheHeader r4 = new com.android.volley.toolbox.DiskBasedCache$CacheHeader     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r4.<init>(r8, r9)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            boolean r5 = r4.writeHeader(r3)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            if (r5 == 0) goto L4d
            byte[] r9 = r9.data     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r3.write(r9)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r3.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            long r5 = r0.length()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r4.size = r5     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r7.putEntry(r8, r4)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r7.pruneIfNeeded()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            goto L79
        L4d:
            r3.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            java.lang.String r8 = "Failed to write header for %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r9[r1] = r3     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            com.android.volley.VolleyLog.d(r8, r9)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            r8.<init>()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
            throw r8     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L7b
        L63:
            boolean r8 = r0.delete()     // Catch: java.lang.Throwable -> L7b
            if (r8 != 0) goto L76
            java.lang.String r8 = "Could not clean up file %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L7b
            r9[r1] = r0     // Catch: java.lang.Throwable -> L7b
            com.android.volley.VolleyLog.d(r8, r9)     // Catch: java.lang.Throwable -> L7b
        L76:
            r7.initializeIfRootDirectoryDeleted()     // Catch: java.lang.Throwable -> L7b
        L79:
            monitor-exit(r7)
            return
        L7b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @Override // com.android.volley.Cache
    public synchronized void remove(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.io.File r0 = r3.getFileForKey(r4)     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> L22
            r3.removeEntry(r4)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            java.lang.String r0 = "Could not delete cache entry for key=%s, filename=%s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L22
            r2 = 1
            java.lang.String r4 = r3.getFilenameForKey(r4)     // Catch: java.lang.Throwable -> L22
            r1[r2] = r4     // Catch: java.lang.Throwable -> L22
            com.android.volley.VolleyLog.d(r0, r1)     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r3)
            return
        L22:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
