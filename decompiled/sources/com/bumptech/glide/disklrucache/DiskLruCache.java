package com.bumptech.glide.disklrucache;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache implements java.io.Closeable {
    private static final java.lang.String CLEAN = "CLEAN";
    private static final java.lang.String DIRTY = "DIRTY";
    private static final java.lang.String READ = "READ";
    private static final java.lang.String REMOVE = "REMOVE";
    private final int appVersion;
    private final java.util.concurrent.Callable<java.lang.Void> cleanupCallable;
    private final java.io.File directory;
    public final java.util.concurrent.ThreadPoolExecutor executorService;
    private final java.io.File journalFile;
    private final java.io.File journalFileBackup;
    private final java.io.File journalFileTmp;
    private java.io.Writer journalWriter;
    private final java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache.Entry> lruEntries;
    private long maxSize;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;


    /* JADX INFO: loaded from: classes.dex */
    public static final class DiskLruCacheThreadFactory implements java.util.concurrent.ThreadFactory {
        private DiskLruCacheThreadFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ DiskLruCacheThreadFactory(com.bumptech.glide.disklrucache.DiskLruCache.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                monitor-enter(r2)
                java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> Le
                java.lang.String r1 = "glide-disk-lru-cache-thread"
                r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
                r3 = 1
                r0.setPriority(r3)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r2)
                return r0
            Le:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class Editor {
        private boolean committed;
        private final com.bumptech.glide.disklrucache.DiskLruCache.Entry entry;
        public final /* synthetic */ com.bumptech.glide.disklrucache.DiskLruCache this$0;
        private final boolean[] written;

        private Editor(com.bumptech.glide.disklrucache.DiskLruCache r1, com.bumptech.glide.disklrucache.DiskLruCache.Entry r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.entry = r2
                boolean r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$700(r2)
                if (r2 == 0) goto Lf
                r1 = 0
                goto L15
            Lf:
                int r1 = com.bumptech.glide.disklrucache.DiskLruCache.access$1900(r1)
                boolean[] r1 = new boolean[r1]
            L15:
                r0.written = r1
                return
        }

        public /* synthetic */ Editor(com.bumptech.glide.disklrucache.DiskLruCache r1, com.bumptech.glide.disklrucache.DiskLruCache.Entry r2, com.bumptech.glide.disklrucache.DiskLruCache.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ com.bumptech.glide.disklrucache.DiskLruCache.Entry access$1500(com.bumptech.glide.disklrucache.DiskLruCache.Editor r0) {
                com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = r0.entry
                return r0
        }

        public static /* synthetic */ boolean[] access$1600(com.bumptech.glide.disklrucache.DiskLruCache.Editor r0) {
                boolean[] r0 = r0.written
                return r0
        }

        private java.io.InputStream newInputStream(int r5) throws java.io.IOException {
                r4 = this;
                com.bumptech.glide.disklrucache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                com.bumptech.glide.disklrucache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L2b
                com.bumptech.glide.disklrucache.DiskLruCache$Editor r1 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r1)     // Catch: java.lang.Throwable -> L2b
                if (r1 != r4) goto L25
                com.bumptech.glide.disklrucache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L2b
                boolean r1 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$700(r1)     // Catch: java.lang.Throwable -> L2b
                r2 = 0
                if (r1 != 0) goto L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return r2
            L16:
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                com.bumptech.glide.disklrucache.DiskLruCache$Entry r3 = r4.entry     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                java.io.File r5 = r3.getCleanFile(r5)     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                r1.<init>(r5)     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return r1
            L23:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return r2
            L25:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
                r5.<init>()     // Catch: java.lang.Throwable -> L2b
                throw r5     // Catch: java.lang.Throwable -> L2b
            L2b:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                throw r5
        }

        public void abort() throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.disklrucache.DiskLruCache r0 = r2.this$0
                r1 = 0
                com.bumptech.glide.disklrucache.DiskLruCache.access$2100(r0, r2, r1)
                return
        }

        public void abortUnlessCommitted() {
                r1 = this;
                boolean r0 = r1.committed
                if (r0 != 0) goto L7
                r1.abort()     // Catch: java.io.IOException -> L7
            L7:
                return
        }

        public void commit() throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.disklrucache.DiskLruCache r0 = r2.this$0
                r1 = 1
                com.bumptech.glide.disklrucache.DiskLruCache.access$2100(r0, r2, r1)
                r2.committed = r1
                return
        }

        public java.io.File getFile(int r4) throws java.io.IOException {
                r3 = this;
                com.bumptech.glide.disklrucache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                com.bumptech.glide.disklrucache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L2f
                com.bumptech.glide.disklrucache.DiskLruCache$Editor r1 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r1)     // Catch: java.lang.Throwable -> L2f
                if (r1 != r3) goto L29
                com.bumptech.glide.disklrucache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L2f
                boolean r1 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$700(r1)     // Catch: java.lang.Throwable -> L2f
                if (r1 != 0) goto L18
                boolean[] r1 = r3.written     // Catch: java.lang.Throwable -> L2f
                r2 = 1
                r1[r4] = r2     // Catch: java.lang.Throwable -> L2f
            L18:
                com.bumptech.glide.disklrucache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L2f
                java.io.File r4 = r1.getDirtyFile(r4)     // Catch: java.lang.Throwable -> L2f
                com.bumptech.glide.disklrucache.DiskLruCache r1 = r3.this$0     // Catch: java.lang.Throwable -> L2f
                java.io.File r1 = com.bumptech.glide.disklrucache.DiskLruCache.access$2000(r1)     // Catch: java.lang.Throwable -> L2f
                r1.mkdirs()     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                return r4
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
                r4.<init>()     // Catch: java.lang.Throwable -> L2f
                throw r4     // Catch: java.lang.Throwable -> L2f
            L2f:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                throw r4
        }

        public java.lang.String getString(int r1) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = r0.newInputStream(r1)
                if (r1 == 0) goto Lb
                java.lang.String r1 = com.bumptech.glide.disklrucache.DiskLruCache.access$1800(r1)
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        public void set(int r4, java.lang.String r5) throws java.io.IOException {
                r3 = this;
                r0 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1b
                java.io.File r4 = r3.getFile(r4)     // Catch: java.lang.Throwable -> L1b
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L1b
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L1b
                java.nio.charset.Charset r2 = com.bumptech.glide.disklrucache.Util.UTF_8     // Catch: java.lang.Throwable -> L1b
                r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1b
                r4.write(r5)     // Catch: java.lang.Throwable -> L18
                com.bumptech.glide.disklrucache.Util.closeQuietly(r4)
                return
            L18:
                r5 = move-exception
                r0 = r4
                goto L1c
            L1b:
                r5 = move-exception
            L1c:
                com.bumptech.glide.disklrucache.Util.closeQuietly(r0)
                throw r5
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class Entry {
        public java.io.File[] cleanFiles;
        private com.bumptech.glide.disklrucache.DiskLruCache.Editor currentEditor;
        public java.io.File[] dirtyFiles;
        private final java.lang.String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;
        public final /* synthetic */ com.bumptech.glide.disklrucache.DiskLruCache this$0;

        private Entry(com.bumptech.glide.disklrucache.DiskLruCache r7, java.lang.String r8) {
                r6 = this;
                r6.this$0 = r7
                r6.<init>()
                r6.key = r8
                int r0 = com.bumptech.glide.disklrucache.DiskLruCache.access$1900(r7)
                long[] r0 = new long[r0]
                r6.lengths = r0
                int r0 = com.bumptech.glide.disklrucache.DiskLruCache.access$1900(r7)
                java.io.File[] r0 = new java.io.File[r0]
                r6.cleanFiles = r0
                int r0 = com.bumptech.glide.disklrucache.DiskLruCache.access$1900(r7)
                java.io.File[] r0 = new java.io.File[r0]
                r6.dirtyFiles = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r8)
                r8 = 46
                r0.append(r8)
                int r8 = r0.length()
                r1 = 0
            L2e:
                int r2 = com.bumptech.glide.disklrucache.DiskLruCache.access$1900(r7)
                if (r1 >= r2) goto L64
                r0.append(r1)
                java.io.File[] r2 = r6.cleanFiles
                java.io.File r3 = new java.io.File
                java.io.File r4 = com.bumptech.glide.disklrucache.DiskLruCache.access$2000(r7)
                java.lang.String r5 = r0.toString()
                r3.<init>(r4, r5)
                r2[r1] = r3
                java.lang.String r2 = ".tmp"
                r0.append(r2)
                java.io.File[] r2 = r6.dirtyFiles
                java.io.File r3 = new java.io.File
                java.io.File r4 = com.bumptech.glide.disklrucache.DiskLruCache.access$2000(r7)
                java.lang.String r5 = r0.toString()
                r3.<init>(r4, r5)
                r2[r1] = r3
                r0.setLength(r8)
                int r1 = r1 + 1
                goto L2e
            L64:
                return
        }

        public /* synthetic */ Entry(com.bumptech.glide.disklrucache.DiskLruCache r1, java.lang.String r2, com.bumptech.glide.disklrucache.DiskLruCache.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ long[] access$1100(com.bumptech.glide.disklrucache.DiskLruCache.Entry r0) {
                long[] r0 = r0.lengths
                return r0
        }

        public static /* synthetic */ java.lang.String access$1200(com.bumptech.glide.disklrucache.DiskLruCache.Entry r0) {
                java.lang.String r0 = r0.key
                return r0
        }

        public static /* synthetic */ long access$1300(com.bumptech.glide.disklrucache.DiskLruCache.Entry r2) {
                long r0 = r2.sequenceNumber
                return r0
        }

        public static /* synthetic */ long access$1302(com.bumptech.glide.disklrucache.DiskLruCache.Entry r0, long r1) {
                r0.sequenceNumber = r1
                return r1
        }

        public static /* synthetic */ boolean access$700(com.bumptech.glide.disklrucache.DiskLruCache.Entry r0) {
                boolean r0 = r0.readable
                return r0
        }

        public static /* synthetic */ void access$702(com.bumptech.glide.disklrucache.DiskLruCache.Entry r1) {
                r0 = 1
                r1.readable = r0
                return
        }

        public static /* synthetic */ com.bumptech.glide.disklrucache.DiskLruCache.Editor access$800(com.bumptech.glide.disklrucache.DiskLruCache.Entry r0) {
                com.bumptech.glide.disklrucache.DiskLruCache$Editor r0 = r0.currentEditor
                return r0
        }

        public static /* synthetic */ com.bumptech.glide.disklrucache.DiskLruCache.Editor access$802(com.bumptech.glide.disklrucache.DiskLruCache.Entry r0, com.bumptech.glide.disklrucache.DiskLruCache.Editor r1) {
                r0.currentEditor = r1
                return r1
        }

        public static /* synthetic */ void access$900(com.bumptech.glide.disklrucache.DiskLruCache.Entry r0, java.lang.String[] r1) throws java.io.IOException {
                r0.setLengths(r1)
                return
        }

        private java.io.IOException invalidLengths(java.lang.String[] r3) throws java.io.IOException {
                r2 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "unexpected journal line: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r3 = java.util.Arrays.toString(r3)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        private void setLengths(java.lang.String[] r5) throws java.io.IOException {
                r4 = this;
                int r0 = r5.length
                com.bumptech.glide.disklrucache.DiskLruCache r1 = r4.this$0
                int r1 = com.bumptech.glide.disklrucache.DiskLruCache.access$1900(r1)
                if (r0 != r1) goto L20
                r0 = 0
            La:
                int r1 = r5.length     // Catch: java.lang.NumberFormatException -> L1b
                if (r0 >= r1) goto L1a
                long[] r1 = r4.lengths     // Catch: java.lang.NumberFormatException -> L1b
                r2 = r5[r0]     // Catch: java.lang.NumberFormatException -> L1b
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1b
                r1[r0] = r2     // Catch: java.lang.NumberFormatException -> L1b
                int r0 = r0 + 1
                goto La
            L1a:
                return
            L1b:
                java.io.IOException r5 = r4.invalidLengths(r5)
                throw r5
            L20:
                java.io.IOException r5 = r4.invalidLengths(r5)
                throw r5
        }

        public java.io.File getCleanFile(int r2) {
                r1 = this;
                java.io.File[] r0 = r1.cleanFiles
                r2 = r0[r2]
                return r2
        }

        public java.io.File getDirtyFile(int r2) {
                r1 = this;
                java.io.File[] r0 = r1.dirtyFiles
                r2 = r0[r2]
                return r2
        }

        public java.lang.String getLengths() throws java.io.IOException {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long[] r1 = r7.lengths
                int r2 = r1.length
                r3 = 0
            L9:
                if (r3 >= r2) goto L18
                r4 = r1[r3]
                r6 = 32
                r0.append(r6)
                r0.append(r4)
                int r3 = r3 + 1
                goto L9
            L18:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public final class Value {
        private final java.io.File[] files;
        private final java.lang.String key;
        private final long[] lengths;
        private final long sequenceNumber;
        public final /* synthetic */ com.bumptech.glide.disklrucache.DiskLruCache this$0;

        private Value(com.bumptech.glide.disklrucache.DiskLruCache r1, java.lang.String r2, long r3, java.io.File[] r5, long[] r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.sequenceNumber = r3
                r0.files = r5
                r0.lengths = r6
                return
        }

        public /* synthetic */ Value(com.bumptech.glide.disklrucache.DiskLruCache r1, java.lang.String r2, long r3, java.io.File[] r5, long[] r6, com.bumptech.glide.disklrucache.DiskLruCache.AnonymousClass1 r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5, r6)
                return
        }

        public com.bumptech.glide.disklrucache.DiskLruCache.Editor edit() throws java.io.IOException {
                r4 = this;
                com.bumptech.glide.disklrucache.DiskLruCache r0 = r4.this$0
                java.lang.String r1 = r4.key
                long r2 = r4.sequenceNumber
                com.bumptech.glide.disklrucache.DiskLruCache$Editor r0 = com.bumptech.glide.disklrucache.DiskLruCache.access$1700(r0, r1, r2)
                return r0
        }

        public java.io.File getFile(int r2) {
                r1 = this;
                java.io.File[] r0 = r1.files
                r2 = r0[r2]
                return r2
        }

        public long getLength(int r4) {
                r3 = this;
                long[] r0 = r3.lengths
                r1 = r0[r4]
                return r1
        }

        public java.lang.String getString(int r3) throws java.io.IOException {
                r2 = this;
                java.io.FileInputStream r0 = new java.io.FileInputStream
                java.io.File[] r1 = r2.files
                r3 = r1[r3]
                r0.<init>(r3)
                java.lang.String r3 = com.bumptech.glide.disklrucache.DiskLruCache.access$1800(r0)
                return r3
        }
    }

    private DiskLruCache(java.io.File r17, int r18, int r19, long r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>()
            r2 = 0
            r0.size = r2
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 0
            r6 = 1061158912(0x3f400000, float:0.75)
            r7 = 1
            r4.<init>(r5, r6, r7)
            r0.lruEntries = r4
            r0.nextSequenceNumber = r2
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r14 = new java.util.concurrent.LinkedBlockingQueue
            r14.<init>()
            com.bumptech.glide.disklrucache.DiskLruCache$DiskLruCacheThreadFactory r15 = new com.bumptech.glide.disklrucache.DiskLruCache$DiskLruCacheThreadFactory
            r3 = 0
            r15.<init>(r3)
            r9 = 0
            r10 = 1
            r11 = 60
            r8 = r2
            r8.<init>(r9, r10, r11, r13, r14, r15)
            r0.executorService = r2
            com.bumptech.glide.disklrucache.DiskLruCache$1 r2 = new com.bumptech.glide.disklrucache.DiskLruCache$1
            r2.<init>(r0)
            r0.cleanupCallable = r2
            r0.directory = r1
            r2 = r18
            r0.appVersion = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal"
            r2.<init>(r1, r3)
            r0.journalFile = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.tmp"
            r2.<init>(r1, r3)
            r0.journalFileTmp = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.bkp"
            r2.<init>(r1, r3)
            r0.journalFileBackup = r2
            r1 = r19
            r0.valueCount = r1
            r1 = r20
            r0.maxSize = r1
            return
    }

    public static /* synthetic */ java.io.Writer access$100(com.bumptech.glide.disklrucache.DiskLruCache r0) {
            java.io.Writer r0 = r0.journalWriter
            return r0
    }

    public static /* synthetic */ com.bumptech.glide.disklrucache.DiskLruCache.Editor access$1700(com.bumptech.glide.disklrucache.DiskLruCache r0, java.lang.String r1, long r2) throws java.io.IOException {
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String access$1800(java.io.InputStream r0) throws java.io.IOException {
            java.lang.String r0 = inputStreamToString(r0)
            return r0
    }

    public static /* synthetic */ int access$1900(com.bumptech.glide.disklrucache.DiskLruCache r0) {
            int r0 = r0.valueCount
            return r0
    }

    public static /* synthetic */ void access$200(com.bumptech.glide.disklrucache.DiskLruCache r0) throws java.io.IOException {
            r0.trimToSize()
            return
    }

    public static /* synthetic */ java.io.File access$2000(com.bumptech.glide.disklrucache.DiskLruCache r0) {
            java.io.File r0 = r0.directory
            return r0
    }

    public static /* synthetic */ void access$2100(com.bumptech.glide.disklrucache.DiskLruCache r0, com.bumptech.glide.disklrucache.DiskLruCache.Editor r1, boolean r2) throws java.io.IOException {
            r0.completeEdit(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$300(com.bumptech.glide.disklrucache.DiskLruCache r0) {
            boolean r0 = r0.journalRebuildRequired()
            return r0
    }

    public static /* synthetic */ void access$400(com.bumptech.glide.disklrucache.DiskLruCache r0) throws java.io.IOException {
            r0.rebuildJournal()
            return
    }

    public static /* synthetic */ void access$502(com.bumptech.glide.disklrucache.DiskLruCache r1) {
            r0 = 0
            r1.redundantOpCount = r0
            return
    }

    private void checkNotClosed() {
            r2 = this;
            java.io.Writer r0 = r2.journalWriter
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)
            throw r0
    }

    @android.annotation.TargetApi(26)
    private static void closeWriter(java.io.Writer r2) throws java.io.IOException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto La
            r2.close()
            return
        La:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitUnbufferedIo()
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.close()     // Catch: java.lang.Throwable -> L25
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L25:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    private synchronized void completeEdit(com.bumptech.glide.disklrucache.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = com.bumptech.glide.disklrucache.DiskLruCache.Editor.access$1500(r10)     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r1 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r0)     // Catch: java.lang.Throwable -> L10e
            if (r1 != r10) goto L108
            r1 = 0
            if (r11 == 0) goto L4d
            boolean r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$700(r0)     // Catch: java.lang.Throwable -> L10e
            if (r2 != 0) goto L4d
            r2 = 0
        L15:
            int r3 = r9.valueCount     // Catch: java.lang.Throwable -> L10e
            if (r2 >= r3) goto L4d
            boolean[] r3 = com.bumptech.glide.disklrucache.DiskLruCache.Editor.access$1600(r10)     // Catch: java.lang.Throwable -> L10e
            boolean r3 = r3[r2]     // Catch: java.lang.Throwable -> L10e
            if (r3 == 0) goto L33
            java.io.File r3 = r0.getDirtyFile(r2)     // Catch: java.lang.Throwable -> L10e
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L10e
            if (r3 != 0) goto L30
            r10.abort()     // Catch: java.lang.Throwable -> L10e
            monitor-exit(r9)
            return
        L30:
            int r2 = r2 + 1
            goto L15
        L33:
            r10.abort()     // Catch: java.lang.Throwable -> L10e
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            r11.<init>()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch: java.lang.Throwable -> L10e
            r11.append(r2)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L10e
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L10e
            throw r10     // Catch: java.lang.Throwable -> L10e
        L4d:
            int r10 = r9.valueCount     // Catch: java.lang.Throwable -> L10e
            if (r1 >= r10) goto L81
            java.io.File r10 = r0.getDirtyFile(r1)     // Catch: java.lang.Throwable -> L10e
            if (r11 == 0) goto L7b
            boolean r2 = r10.exists()     // Catch: java.lang.Throwable -> L10e
            if (r2 == 0) goto L7e
            java.io.File r2 = r0.getCleanFile(r1)     // Catch: java.lang.Throwable -> L10e
            r10.renameTo(r2)     // Catch: java.lang.Throwable -> L10e
            long[] r10 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L10e
            r3 = r10[r1]     // Catch: java.lang.Throwable -> L10e
            long r5 = r2.length()     // Catch: java.lang.Throwable -> L10e
            long[] r10 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L10e
            r10[r1] = r5     // Catch: java.lang.Throwable -> L10e
            long r7 = r9.size     // Catch: java.lang.Throwable -> L10e
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.size = r7     // Catch: java.lang.Throwable -> L10e
            goto L7e
        L7b:
            deleteIfExists(r10)     // Catch: java.lang.Throwable -> L10e
        L7e:
            int r1 = r1 + 1
            goto L4d
        L81:
            int r10 = r9.redundantOpCount     // Catch: java.lang.Throwable -> L10e
            int r10 = r10 + 1
            r9.redundantOpCount = r10     // Catch: java.lang.Throwable -> L10e
            r10 = 0
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$802(r0, r10)     // Catch: java.lang.Throwable -> L10e
            boolean r10 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$700(r0)     // Catch: java.lang.Throwable -> L10e
            r10 = r10 | r11
            r1 = 10
            r2 = 32
            if (r10 == 0) goto Lc9
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$702(r0)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            java.lang.String r3 = "CLEAN"
            r10.append(r3)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            r10.append(r2)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            java.lang.String r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1200(r0)     // Catch: java.lang.Throwable -> L10e
            r10.append(r2)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            java.lang.String r2 = r0.getLengths()     // Catch: java.lang.Throwable -> L10e
            r10.append(r2)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            r10.append(r1)     // Catch: java.lang.Throwable -> L10e
            if (r11 == 0) goto Lec
            long r10 = r9.nextSequenceNumber     // Catch: java.lang.Throwable -> L10e
            r1 = 1
            long r1 = r1 + r10
            r9.nextSequenceNumber = r1     // Catch: java.lang.Throwable -> L10e
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1302(r0, r10)     // Catch: java.lang.Throwable -> L10e
            goto Lec
        Lc9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r10 = r9.lruEntries     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1200(r0)     // Catch: java.lang.Throwable -> L10e
            r10.remove(r11)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            r10.append(r2)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1200(r0)     // Catch: java.lang.Throwable -> L10e
            r10.append(r11)     // Catch: java.lang.Throwable -> L10e
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            r10.append(r1)     // Catch: java.lang.Throwable -> L10e
        Lec:
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L10e
            flushWriter(r10)     // Catch: java.lang.Throwable -> L10e
            long r10 = r9.size     // Catch: java.lang.Throwable -> L10e
            long r0 = r9.maxSize     // Catch: java.lang.Throwable -> L10e
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto Lff
            boolean r10 = r9.journalRebuildRequired()     // Catch: java.lang.Throwable -> L10e
            if (r10 == 0) goto L106
        Lff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.executorService     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.cleanupCallable     // Catch: java.lang.Throwable -> L10e
            r10.submit(r11)     // Catch: java.lang.Throwable -> L10e
        L106:
            monitor-exit(r9)
            return
        L108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10e
            r10.<init>()     // Catch: java.lang.Throwable -> L10e
            throw r10     // Catch: java.lang.Throwable -> L10e
        L10e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    private static void deleteIfExists(java.io.File r1) throws java.io.IOException {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L13
            boolean r1 = r1.delete()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>()
            throw r1
        L13:
            return
    }

    private synchronized com.bumptech.glide.disklrucache.DiskLruCache.Editor edit(java.lang.String r6, long r7) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            r5.checkNotClosed()     // Catch: java.lang.Throwable -> L5d
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L5d
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L5d
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L1f
            if (r0 == 0) goto L1d
            long r1 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1300(r0)     // Catch: java.lang.Throwable -> L5d
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L1f
        L1d:
            monitor-exit(r5)
            return r3
        L1f:
            if (r0 != 0) goto L2c
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = new com.bumptech.glide.disklrucache.DiskLruCache$Entry     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L5d
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r7 = r5.lruEntries     // Catch: java.lang.Throwable -> L5d
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L5d
            goto L34
        L2c:
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r7 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L34
            monitor-exit(r5)
            return r3
        L34:
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r7 = new com.bumptech.glide.disklrucache.DiskLruCache$Editor     // Catch: java.lang.Throwable -> L5d
            r7.<init>(r5, r0, r3)     // Catch: java.lang.Throwable -> L5d
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$802(r0, r7)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r8 = r5.journalWriter     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r8 = r5.journalWriter     // Catch: java.lang.Throwable -> L5d
            r0 = 32
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r8 = r5.journalWriter     // Catch: java.lang.Throwable -> L5d
            r8.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r6 = r5.journalWriter     // Catch: java.lang.Throwable -> L5d
            r8 = 10
            r6.append(r8)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r6 = r5.journalWriter     // Catch: java.lang.Throwable -> L5d
            flushWriter(r6)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return r7
        L5d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @android.annotation.TargetApi(26)
    private static void flushWriter(java.io.Writer r2) throws java.io.IOException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto La
            r2.flush()
            return
        La:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitUnbufferedIo()
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.flush()     // Catch: java.lang.Throwable -> L25
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L25:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    private static java.lang.String inputStreamToString(java.io.InputStream r4) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.charset.Charset r1 = com.bumptech.glide.disklrucache.Util.UTF_8
            r0.<init>(r4, r1)
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L24
            r4.<init>()     // Catch: java.lang.Throwable -> L24
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L24
        L10:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L24
            r3 = -1
            if (r2 == r3) goto L1c
            r3 = 0
            r4.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L24
            goto L10
        L1c:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L24
            r0.close()
            return r4
        L24:
            r4 = move-exception
            r0.close()
            throw r4
    }

    private boolean journalRebuildRequired() {
            r2 = this;
            int r0 = r2.redundantOpCount
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r1 = r2.lruEntries
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static com.bumptech.glide.disklrucache.DiskLruCache open(java.io.File r9, int r10, int r11, long r12) throws java.io.IOException {
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L88
            if (r11 <= 0) goto L7f
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r9, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "journal"
            r1.<init>(r9, r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L26
            r0.delete()
            goto L2a
        L26:
            r2 = 0
            renameTo(r0, r1, r2)
        L2a:
            com.bumptech.glide.disklrucache.DiskLruCache r0 = new com.bumptech.glide.disklrucache.DiskLruCache
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7)
            java.io.File r1 = r0.journalFile
            boolean r1 = r1.exists()
            if (r1 == 0) goto L6e
            r0.readJournal()     // Catch: java.io.IOException -> L43
            r0.processJournal()     // Catch: java.io.IOException -> L43
            return r0
        L43:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "DiskLruCache "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = " is corrupt: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = ", removing"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            r0.delete()
        L6e:
            r9.mkdirs()
            com.bumptech.glide.disklrucache.DiskLruCache r0 = new com.bumptech.glide.disklrucache.DiskLruCache
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7)
            r0.rebuildJournal()
            return r0
        L7f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "valueCount <= 0"
            r9.<init>(r10)
            throw r9
        L88:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "maxSize <= 0"
            r9.<init>(r10)
            throw r9
    }

    private void processJournal() throws java.io.IOException {
            r8 = this;
            java.io.File r0 = r8.journalFileTmp
            deleteIfExists(r0)
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r8.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r1 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r1
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r1)
            r3 = 0
            if (r2 != 0) goto L34
        L22:
            int r2 = r8.valueCount
            if (r3 >= r2) goto Lf
            long r4 = r8.size
            long[] r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1100(r1)
            r6 = r2[r3]
            long r4 = r4 + r6
            r8.size = r4
            int r3 = r3 + 1
            goto L22
        L34:
            r2 = 0
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$802(r1, r2)
        L38:
            int r2 = r8.valueCount
            if (r3 >= r2) goto L4d
            java.io.File r2 = r1.getCleanFile(r3)
            deleteIfExists(r2)
            java.io.File r2 = r1.getDirtyFile(r3)
            deleteIfExists(r2)
            int r3 = r3 + 1
            goto L38
        L4d:
            r0.remove()
            goto Lf
        L51:
            return
    }

    private void readJournal() throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.disklrucache.StrictLineReader r1 = new com.bumptech.glide.disklrucache.StrictLineReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.journalFile
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.disklrucache.Util.US_ASCII
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r6 = r1.readLine()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto L8c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto L8c
            int r7 = r9.appVersion     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch: java.lang.Throwable -> Lbb
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == 0) goto L8c
            int r4 = r9.valueCount     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> Lbb
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == 0) goto L8c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == 0) goto L8c
            r0 = 0
        L55:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.EOFException -> L5f java.lang.Throwable -> Lbb
            r9.readJournalLine(r2)     // Catch: java.io.EOFException -> L5f java.lang.Throwable -> Lbb
            int r0 = r0 + 1
            goto L55
        L5f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r2 = r9.lruEntries     // Catch: java.lang.Throwable -> Lbb
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0 - r2
            r9.redundantOpCount = r0     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r1.hasUnterminatedLine()     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L72
            r9.rebuildJournal()     // Catch: java.lang.Throwable -> Lbb
            goto L88
        L72:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Lbb
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lbb
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lbb
            java.io.File r4 = r9.journalFile     // Catch: java.lang.Throwable -> Lbb
            r5 = 1
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lbb
            java.nio.charset.Charset r4 = com.bumptech.glide.disklrucache.Util.US_ASCII     // Catch: java.lang.Throwable -> Lbb
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lbb
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lbb
            r9.journalWriter = r0     // Catch: java.lang.Throwable -> Lbb
        L88:
            com.bumptech.glide.disklrucache.Util.closeQuietly(r1)
            return
        L8c:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r7.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r2)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r3)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r5)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> Lbb
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            throw r4     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            com.bumptech.glide.disklrucache.Util.closeQuietly(r1)
            throw r0
    }

    private void readJournalLine(java.lang.String r9) throws java.io.IOException {
            r8 = this;
            r0 = 32
            int r1 = r9.indexOf(r0)
            java.lang.String r2 = "unexpected journal line: "
            r3 = -1
            if (r1 == r3) goto L92
            int r4 = r1 + 1
            int r0 = r9.indexOf(r0, r4)
            if (r0 != r3) goto L29
            java.lang.String r4 = r9.substring(r4)
            r5 = 6
            if (r1 != r5) goto L2d
            java.lang.String r5 = "REMOVE"
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L2d
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r9 = r8.lruEntries
            r9.remove(r4)
            return
        L29:
            java.lang.String r4 = r9.substring(r4, r0)
        L2d:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r5 = r8.lruEntries
            java.lang.Object r5 = r5.get(r4)
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r5 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r5
            r6 = 0
            if (r5 != 0) goto L42
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r5 = new com.bumptech.glide.disklrucache.DiskLruCache$Entry
            r5.<init>(r8, r4, r6)
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r7 = r8.lruEntries
            r7.put(r4, r5)
        L42:
            r4 = 5
            if (r0 == r3) goto L65
            if (r1 != r4) goto L65
            java.lang.String r7 = "CLEAN"
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L65
            int r0 = r0 + 1
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r9 = r9.split(r0)
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$702(r5)
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$802(r5, r6)
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$900(r5, r9)
            goto L87
        L65:
            if (r0 != r3) goto L7a
            if (r1 != r4) goto L7a
            java.lang.String r4 = "DIRTY"
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto L7a
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r9 = new com.bumptech.glide.disklrucache.DiskLruCache$Editor
            r9.<init>(r8, r5, r6)
            com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$802(r5, r9)
            goto L87
        L7a:
            if (r0 != r3) goto L88
            r0 = 4
            if (r1 != r0) goto L88
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L88
        L87:
            return
        L88:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r9)
            r0.<init>(r9)
            throw r0
        L92:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r9)
            r0.<init>(r9)
            throw r0
    }

    private synchronized void rebuildJournal() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.journalWriter     // Catch: java.lang.Throwable -> Le9
            if (r0 == 0) goto L8
            closeWriter(r0)     // Catch: java.lang.Throwable -> Le9
        L8:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Le9
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Le9
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le9
            java.io.File r3 = r6.journalFileTmp     // Catch: java.lang.Throwable -> Le9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le9
            java.nio.charset.Charset r3 = com.bumptech.glide.disklrucache.Util.US_ASCII     // Catch: java.lang.Throwable -> Le9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Le9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            int r1 = r6.appVersion     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> Le4
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            int r1 = r6.valueCount     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> Le4
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Le4
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r1 = r6.lruEntries     // Catch: java.lang.Throwable -> Le4
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> Le4
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le4
        L5a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le4
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le4
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r2 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r2     // Catch: java.lang.Throwable -> Le4
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r3 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r2)     // Catch: java.lang.Throwable -> Le4
            r4 = 10
            if (r3 == 0) goto L8a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le4
            r3.<init>()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1200(r2)     // Catch: java.lang.Throwable -> Le4
            r3.append(r2)     // Catch: java.lang.Throwable -> Le4
            r3.append(r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Le4
            r0.write(r2)     // Catch: java.lang.Throwable -> Le4
            goto L5a
        L8a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le4
            r3.<init>()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = "CLEAN "
            r3.append(r5)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r5 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1200(r2)     // Catch: java.lang.Throwable -> Le4
            r3.append(r5)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = r2.getLengths()     // Catch: java.lang.Throwable -> Le4
            r3.append(r2)     // Catch: java.lang.Throwable -> Le4
            r3.append(r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Le4
            r0.write(r2)     // Catch: java.lang.Throwable -> Le4
            goto L5a
        Lad:
            closeWriter(r0)     // Catch: java.lang.Throwable -> Le9
            java.io.File r0 = r6.journalFile     // Catch: java.lang.Throwable -> Le9
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Le9
            r1 = 1
            if (r0 == 0) goto Lc0
            java.io.File r0 = r6.journalFile     // Catch: java.lang.Throwable -> Le9
            java.io.File r2 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Le9
            renameTo(r0, r2, r1)     // Catch: java.lang.Throwable -> Le9
        Lc0:
            java.io.File r0 = r6.journalFileTmp     // Catch: java.lang.Throwable -> Le9
            java.io.File r2 = r6.journalFile     // Catch: java.lang.Throwable -> Le9
            r3 = 0
            renameTo(r0, r2, r3)     // Catch: java.lang.Throwable -> Le9
            java.io.File r0 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Le9
            r0.delete()     // Catch: java.lang.Throwable -> Le9
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Le9
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Le9
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le9
            java.io.File r4 = r6.journalFile     // Catch: java.lang.Throwable -> Le9
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> Le9
            java.nio.charset.Charset r1 = com.bumptech.glide.disklrucache.Util.US_ASCII     // Catch: java.lang.Throwable -> Le9
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Le9
            r6.journalWriter = r0     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r6)
            return
        Le4:
            r1 = move-exception
            closeWriter(r0)     // Catch: java.lang.Throwable -> Le9
            throw r1     // Catch: java.lang.Throwable -> Le9
        Le9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    private static void renameTo(java.io.File r0, java.io.File r1, boolean r2) throws java.io.IOException {
            if (r2 == 0) goto L5
            deleteIfExists(r1)
        L5:
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    private void trimToSize() throws java.io.IOException {
            r5 = this;
        L0:
            long r0 = r5.size
            long r2 = r5.maxSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r5.lruEntries
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r5.remove(r0)
            goto L0
        L22:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.io.Writer r0 = r3.journalWriter     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L7
            monitor-exit(r3)
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r1 = r3.lruEntries     // Catch: java.lang.Throwable -> L3d
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r1 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r1     // Catch: java.lang.Throwable -> L3d
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r1)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L16
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r1 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r1)     // Catch: java.lang.Throwable -> L3d
            r1.abort()     // Catch: java.lang.Throwable -> L3d
            goto L16
        L30:
            r3.trimToSize()     // Catch: java.lang.Throwable -> L3d
            java.io.Writer r0 = r3.journalWriter     // Catch: java.lang.Throwable -> L3d
            closeWriter(r0)     // Catch: java.lang.Throwable -> L3d
            r0 = 0
            r3.journalWriter = r0     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r3)
            return
        L3d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public void delete() throws java.io.IOException {
            r1 = this;
            r1.close()
            java.io.File r0 = r1.directory
            com.bumptech.glide.disklrucache.Util.deleteContents(r0)
            return
    }

    public com.bumptech.glide.disklrucache.DiskLruCache.Editor edit(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = -1
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r3 = r2.edit(r3, r0)
            return r3
    }

    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.checkNotClosed()     // Catch: java.lang.Throwable -> Le
            r1.trimToSize()     // Catch: java.lang.Throwable -> Le
            java.io.Writer r0 = r1.journalWriter     // Catch: java.lang.Throwable -> Le
            flushWriter(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized com.bumptech.glide.disklrucache.DiskLruCache.Value get(java.lang.String r10) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            r9.checkNotClosed()     // Catch: java.lang.Throwable -> L6e
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L6e
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L6e
            r1 = 0
            if (r0 != 0) goto L11
            monitor-exit(r9)
            return r1
        L11:
            boolean r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$700(r0)     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L19
            monitor-exit(r9)
            return r1
        L19:
            java.io.File[] r2 = r0.cleanFiles     // Catch: java.lang.Throwable -> L6e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L6e
            r4 = 0
        L1d:
            if (r4 >= r3) goto L2c
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L6e
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L29
            monitor-exit(r9)
            return r1
        L29:
            int r4 = r4 + 1
            goto L1d
        L2c:
            int r1 = r9.redundantOpCount     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 + 1
            r9.redundantOpCount = r1     // Catch: java.lang.Throwable -> L6e
            java.io.Writer r1 = r9.journalWriter     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "READ"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6e
            java.io.Writer r1 = r9.journalWriter     // Catch: java.lang.Throwable -> L6e
            r2 = 32
            r1.append(r2)     // Catch: java.lang.Throwable -> L6e
            java.io.Writer r1 = r9.journalWriter     // Catch: java.lang.Throwable -> L6e
            r1.append(r10)     // Catch: java.lang.Throwable -> L6e
            java.io.Writer r1 = r9.journalWriter     // Catch: java.lang.Throwable -> L6e
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r9.journalRebuildRequired()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L59
            java.util.concurrent.ThreadPoolExecutor r1 = r9.executorService     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Callable<java.lang.Void> r2 = r9.cleanupCallable     // Catch: java.lang.Throwable -> L6e
            r1.submit(r2)     // Catch: java.lang.Throwable -> L6e
        L59:
            com.bumptech.glide.disklrucache.DiskLruCache$Value r8 = new com.bumptech.glide.disklrucache.DiskLruCache$Value     // Catch: java.lang.Throwable -> L6e
            long r3 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1300(r0)     // Catch: java.lang.Throwable -> L6e
            java.io.File[] r5 = r0.cleanFiles     // Catch: java.lang.Throwable -> L6e
            long[] r6 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L6e
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r9)
            return r8
        L6e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    public java.io.File getDirectory() {
            r1 = this;
            java.io.File r0 = r1.directory
            return r0
    }

    public synchronized long getMaxSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            java.io.Writer r0 = r1.journalWriter     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized boolean remove(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            r7.checkNotClosed()     // Catch: java.lang.Throwable -> L8f
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L8f
            com.bumptech.glide.disklrucache.DiskLruCache$Entry r0 = (com.bumptech.glide.disklrucache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            if (r0 == 0) goto L8d
            com.bumptech.glide.disklrucache.DiskLruCache$Editor r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$800(r0)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L17
            goto L8d
        L17:
            int r2 = r7.valueCount     // Catch: java.lang.Throwable -> L8f
            if (r1 >= r2) goto L59
            java.io.File r2 = r0.getCleanFile(r1)     // Catch: java.lang.Throwable -> L8f
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L43
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L2c
            goto L43
        L2c:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r0.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch: java.lang.Throwable -> L8f
            r0.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8     // Catch: java.lang.Throwable -> L8f
        L43:
            long r2 = r7.size     // Catch: java.lang.Throwable -> L8f
            long[] r4 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L8f
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L8f
            long r2 = r2 - r5
            r7.size = r2     // Catch: java.lang.Throwable -> L8f
            long[] r2 = com.bumptech.glide.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L8f
            r3 = 0
            r2[r1] = r3     // Catch: java.lang.Throwable -> L8f
            int r1 = r1 + 1
            goto L17
        L59:
            int r0 = r7.redundantOpCount     // Catch: java.lang.Throwable -> L8f
            r1 = 1
            int r0 = r0 + r1
            r7.redundantOpCount = r0     // Catch: java.lang.Throwable -> L8f
            java.io.Writer r0 = r7.journalWriter     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.io.Writer r0 = r7.journalWriter     // Catch: java.lang.Throwable -> L8f
            r2 = 32
            r0.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.io.Writer r0 = r7.journalWriter     // Catch: java.lang.Throwable -> L8f
            r0.append(r8)     // Catch: java.lang.Throwable -> L8f
            java.io.Writer r0 = r7.journalWriter     // Catch: java.lang.Throwable -> L8f
            r2 = 10
            r0.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L8f
            r0.remove(r8)     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r7.journalRebuildRequired()     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.executorService     // Catch: java.lang.Throwable -> L8f
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.cleanupCallable     // Catch: java.lang.Throwable -> L8f
            r8.submit(r0)     // Catch: java.lang.Throwable -> L8f
        L8b:
            monitor-exit(r7)
            return r1
        L8d:
            monitor-exit(r7)
            return r1
        L8f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public synchronized void setMaxSize(long r1) {
            r0 = this;
            monitor-enter(r0)
            r0.maxSize = r1     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.ThreadPoolExecutor r1 = r0.executorService     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.Callable<java.lang.Void> r2 = r0.cleanupCallable     // Catch: java.lang.Throwable -> Lc
            r1.submit(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized long size() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.size     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
