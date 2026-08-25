package okhttp3.internal.cache;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010)\n\u0002\b\u0007*\u0001\u0014\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0004[\\]^B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0016J!\u0010;\u001a\u0002092\n\u0010<\u001a\u00060=R\u00020\u00002\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0002\b?J\u0006\u0010@\u001a\u000209J \u0010A\u001a\b\u0018\u00010=R\u00020\u00002\u0006\u0010B\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\u000bH\u0007J\u0006\u0010D\u001a\u000209J\b\u0010E\u001a\u000209H\u0016J\u0017\u0010F\u001a\b\u0018\u00010GR\u00020\u00002\u0006\u0010B\u001a\u00020(H\u0086\u0002J\u0006\u0010H\u001a\u000209J\u0006\u0010I\u001a\u00020\u0010J\b\u0010J\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020%H\u0002J\b\u0010L\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0002J\u0010\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020(H\u0002J\r\u0010P\u001a\u000209H\u0000¢\u0006\u0002\bQJ\u000e\u0010R\u001a\u00020\u00102\u0006\u0010B\u001a\u00020(J\u0019\u0010S\u001a\u00020\u00102\n\u0010T\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0002\bUJ\b\u0010V\u001a\u00020\u0010H\u0002J\u0006\u00105\u001a\u00020\u000bJ\u0010\u0010W\u001a\f\u0012\b\u0012\u00060GR\u00020\u00000XJ\u0006\u0010Y\u001a\u000209J\u0010\u0010Z\u001a\u0002092\u0006\u0010B\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\b\u0012\u00060)R\u00020\u00000'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R&\u0010\n\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006_"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "directory", "Ljava/io/File;", "appVersion", "", "valueCount", "maxSize", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "civilizedFileSystem", "", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getDirectory", "()Ljava/io/File;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "value", "getMaxSize", "()J", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "size", "getValueCount$okhttp", "()I", "checkNotClosed", "", "close", "completeEdit", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "success", "completeEdit$okhttp", "delete", "edit", "key", "expectedSequenceNumber", "evictAll", "flush", "get", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "initialize", "isClosed", "journalRebuildRequired", "newJournalWriter", "processJournal", "readJournal", "readJournalLine", "line", "rebuildJournal", "rebuildJournal$okhttp", "remove", "removeEntry", "entry", "removeEntry$okhttp", "removeOldestEntry", "snapshots", "", "trimToSize", "validateKey", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class DiskLruCache implements java.io.Closeable, java.io.Flushable {

    @kotlin.jvm.JvmField
    public static final long ANY_SEQUENCE_NUMBER = 0;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CLEAN = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.cache.DiskLruCache.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DIRTY = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JOURNAL_FILE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JOURNAL_FILE_BACKUP = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JOURNAL_FILE_TEMP = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.Regex LEGAL_KEY_PATTERN = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MAGIC = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String READ = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REMOVE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VERSION_1 = null;
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.cache.DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final java.io.File directory;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.io.FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final java.io.File journalFile;
    private final java.io.File journalFileBackup;
    private final java.io.File journalFileTmp;
    private okio.BufferedSink journalWriter;

    @org.jetbrains.annotations.NotNull
    private final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    /* JADX INFO: compiled from: DiskLruCache.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "done", "", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "written", "", "getWritten$okhttp", "()[Z", "abort", "", "commit", "detach", "detach$okhttp", "newSink", "Lokio/Sink;", "index", "", "newSource", "Lokio/Source;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class Editor {
        private boolean done;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.internal.cache.DiskLruCache.Entry entry;
        public final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        @org.jetbrains.annotations.Nullable
        private final boolean[] written;

        public Editor(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache r2, okhttp3.internal.cache.DiskLruCache.Entry r3) {
                r1 = this;
                java.lang.String r0 = "entry"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.entry = r3
                boolean r3 = r3.getReadable$okhttp()
                if (r3 == 0) goto L14
                r2 = 0
                goto L1a
            L14:
                int r2 = r2.getValueCount$okhttp()
                boolean[] r2 = new boolean[r2]
            L1a:
                r1.written = r2
                return
        }

        public final void abort() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch: java.lang.Throwable -> L2d
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L21
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L2d
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L2d
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)     // Catch: java.lang.Throwable -> L2d
                if (r1 == 0) goto L1b
                okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch: java.lang.Throwable -> L2d
                r3 = 0
                r1.completeEdit$okhttp(r4, r3)     // Catch: java.lang.Throwable -> L2d
            L1b:
                r4.done = r2     // Catch: java.lang.Throwable -> L2d
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r0)
                return
            L21:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2d
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L2d
                throw r2     // Catch: java.lang.Throwable -> L2d
            L2d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final void commit() throws java.io.IOException {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L2c
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L20
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L2c
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L2c
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)     // Catch: java.lang.Throwable -> L2c
                if (r1 == 0) goto L1a
                okhttp3.internal.cache.DiskLruCache r1 = r3.this$0     // Catch: java.lang.Throwable -> L2c
                r1.completeEdit$okhttp(r3, r2)     // Catch: java.lang.Throwable -> L2c
            L1a:
                r3.done = r2     // Catch: java.lang.Throwable -> L2c
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r0)
                return
            L20:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2c
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L2c
                throw r2     // Catch: java.lang.Throwable -> L2c
            L2c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final void detach$okhttp() {
                r2 = this;
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r2.entry
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.getCurrentEditor$okhttp()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L21
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 == 0) goto L1b
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                r1 = 0
                r0.completeEdit$okhttp(r2, r1)
                goto L21
            L1b:
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r2.entry
                r1 = 1
                r0.setZombie$okhttp(r1)
            L21:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.cache.DiskLruCache.Entry getEntry$okhttp() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Entry r0 = r1.entry
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final boolean[] getWritten$okhttp() {
                r1 = this;
                boolean[] r0 = r1.written
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Sink newSink(int r4) {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L5f
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L53
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L5f
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L5f
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)     // Catch: java.lang.Throwable -> L5f
                r1 = r1 ^ r2
                if (r1 == 0) goto L1c
                okio.Sink r4 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L5f
                monitor-exit(r0)
                return r4
            L1c:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L5f
                boolean r1 = r1.getReadable$okhttp()     // Catch: java.lang.Throwable -> L5f
                if (r1 != 0) goto L2b
                boolean[] r1 = r3.written     // Catch: java.lang.Throwable -> L5f
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L5f
                r1[r4] = r2     // Catch: java.lang.Throwable -> L5f
            L2b:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L5f
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L5f
                java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L5f
                okhttp3.internal.cache.DiskLruCache r1 = r3.this$0     // Catch: java.io.FileNotFoundException -> L4d java.lang.Throwable -> L5f
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch: java.io.FileNotFoundException -> L4d java.lang.Throwable -> L5f
                okio.Sink r4 = r1.sink(r4)     // Catch: java.io.FileNotFoundException -> L4d java.lang.Throwable -> L5f
                okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink     // Catch: java.lang.Throwable -> L5f
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r2 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch: java.lang.Throwable -> L5f
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L5f
                monitor-exit(r0)
                return r1
            L4d:
                okio.Sink r4 = okio.Okio.blackhole()     // Catch: java.lang.Throwable -> L5f
                monitor-exit(r0)
                return r4
            L53:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5f
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L5f
                throw r1     // Catch: java.lang.Throwable -> L5f
            L5f:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
        }

        @org.jetbrains.annotations.Nullable
        public final okio.Source newSource(int r5) {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch: java.lang.Throwable -> L4f
                r1 = r1 ^ 1
                if (r1 == 0) goto L43
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L4f
                boolean r1 = r1.getReadable$okhttp()     // Catch: java.lang.Throwable -> L4f
                r2 = 0
                if (r1 == 0) goto L41
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L4f
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L4f
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)     // Catch: java.lang.Throwable -> L4f
                r1 = r1 ^ 1
                if (r1 != 0) goto L41
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L4f
                boolean r1 = r1.getZombie$okhttp()     // Catch: java.lang.Throwable -> L4f
                if (r1 == 0) goto L29
                goto L41
            L29:
                okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch: java.io.FileNotFoundException -> L3f java.lang.Throwable -> L4f
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch: java.io.FileNotFoundException -> L3f java.lang.Throwable -> L4f
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch: java.io.FileNotFoundException -> L3f java.lang.Throwable -> L4f
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch: java.io.FileNotFoundException -> L3f java.lang.Throwable -> L4f
                java.lang.Object r5 = r3.get(r5)     // Catch: java.io.FileNotFoundException -> L3f java.lang.Throwable -> L4f
                java.io.File r5 = (java.io.File) r5     // Catch: java.io.FileNotFoundException -> L3f java.lang.Throwable -> L4f
                okio.Source r2 = r1.source(r5)     // Catch: java.io.FileNotFoundException -> L3f java.lang.Throwable -> L4f
            L3f:
                monitor-exit(r0)
                return r2
            L41:
                monitor-exit(r0)
                return r2
            L43:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4f
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4f
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L4f
                throw r1     // Catch: java.lang.Throwable -> L4f
            L4f:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001aH\u0002J\u001b\u00105\u001a\u0002062\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0000¢\u0006\u0002\b7J\u0013\u00108\u001a\b\u0018\u000109R\u00020\fH\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\b>R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$¨\u0006?"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "key", "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "cleanFiles", "", "Ljava/io/File;", "getCleanFiles$okhttp", "()Ljava/util/List;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles$okhttp", "getKey$okhttp", "()Ljava/lang/String;", "lengths", "", "getLengths$okhttp", "()[J", "lockingSourceCount", "", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "readable", "", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "sequenceNumber", "", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "invalidLengths", "", "strings", "", "newSource", "Lokio/Source;", "index", "setLengths", "", "setLengths$okhttp", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot$okhttp", "writeLengths", "writer", "Lokio/BufferedSink;", "writeLengths$okhttp", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class Entry {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.io.File> cleanFiles;

        @org.jetbrains.annotations.Nullable
        private okhttp3.internal.cache.DiskLruCache.Editor currentEditor;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.io.File> dirtyFiles;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String key;

        @org.jetbrains.annotations.NotNull
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        public final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
        private boolean zombie;

        public Entry(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache r8, java.lang.String r9) {
                r7 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r7.this$0 = r8
                r7.<init>()
                r7.key = r9
                int r0 = r8.getValueCount$okhttp()
                long[] r0 = new long[r0]
                r7.lengths = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7.cleanFiles = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7.dirtyFiles = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r9)
                r9 = 46
                r0.append(r9)
                int r9 = r0.length()
                int r1 = r8.getValueCount$okhttp()
                r2 = 0
            L35:
                if (r2 >= r1) goto L69
                r0.append(r2)
                java.util.List<java.io.File> r3 = r7.cleanFiles
                java.io.File r4 = new java.io.File
                java.io.File r5 = r8.getDirectory()
                java.lang.String r6 = r0.toString()
                r4.<init>(r5, r6)
                r3.add(r4)
                java.lang.String r3 = ".tmp"
                r0.append(r3)
                java.util.List<java.io.File> r3 = r7.dirtyFiles
                java.io.File r4 = new java.io.File
                java.io.File r5 = r8.getDirectory()
                java.lang.String r6 = r0.toString()
                r4.<init>(r5, r6)
                r3.add(r4)
                r0.setLength(r9)
                int r2 = r2 + 1
                goto L35
            L69:
                return
        }

        private final java.lang.Void invalidLengths(java.util.List<java.lang.String> r4) throws java.io.IOException {
                r3 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected journal line: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private final okio.Source newSource(int r3) {
                r2 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                okhttp3.internal.io.FileSystem r0 = r0.getFileSystem$okhttp()
                java.util.List<java.io.File> r1 = r2.cleanFiles
                java.lang.Object r3 = r1.get(r3)
                java.io.File r3 = (java.io.File) r3
                okio.Source r3 = r0.source(r3)
                okhttp3.internal.cache.DiskLruCache r0 = r2.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 == 0) goto L1b
                return r3
            L1b:
                int r0 = r2.lockingSourceCount
                int r0 = r0 + 1
                r2.lockingSourceCount = r0
                okhttp3.internal.cache.DiskLruCache$Entry$newSource$1 r0 = new okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                r0.<init>(r2, r3, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.io.File> getCleanFiles$okhttp() {
                r1 = this;
                java.util.List<java.io.File> r0 = r1.cleanFiles
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.cache.DiskLruCache.Editor getCurrentEditor$okhttp() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r1.currentEditor
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.io.File> getDirtyFiles$okhttp() {
                r1 = this;
                java.util.List<java.io.File> r0 = r1.dirtyFiles
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getKey$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final long[] getLengths$okhttp() {
                r1 = this;
                long[] r0 = r1.lengths
                return r0
        }

        public final int getLockingSourceCount$okhttp() {
                r1 = this;
                int r0 = r1.lockingSourceCount
                return r0
        }

        public final boolean getReadable$okhttp() {
                r1 = this;
                boolean r0 = r1.readable
                return r0
        }

        public final long getSequenceNumber$okhttp() {
                r2 = this;
                long r0 = r2.sequenceNumber
                return r0
        }

        public final boolean getZombie$okhttp() {
                r1 = this;
                boolean r0 = r1.zombie
                return r0
        }

        public final void setCurrentEditor$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.cache.DiskLruCache.Editor r1) {
                r0 = this;
                r0.currentEditor = r1
                return
        }

        public final void setLengths$okhttp(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "strings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r6.size()
                okhttp3.internal.cache.DiskLruCache r1 = r5.this$0
                int r1 = r1.getValueCount$okhttp()
                if (r0 != r1) goto L34
                r0 = 0
                int r1 = r6.size()     // Catch: java.lang.NumberFormatException -> L2b
            L17:
                if (r0 >= r1) goto L2a
                long[] r2 = r5.lengths     // Catch: java.lang.NumberFormatException -> L2b
                java.lang.Object r3 = r6.get(r0)     // Catch: java.lang.NumberFormatException -> L2b
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L2b
                long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L2b
                r2[r0] = r3     // Catch: java.lang.NumberFormatException -> L2b
                int r0 = r0 + 1
                goto L17
            L2a:
                return
            L2b:
                r5.invalidLengths(r6)
                kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
                r6.<init>()
                throw r6
            L34:
                r5.invalidLengths(r6)
                kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
                r6.<init>()
                throw r6
        }

        public final void setLockingSourceCount$okhttp(int r1) {
                r0 = this;
                r0.lockingSourceCount = r1
                return
        }

        public final void setReadable$okhttp(boolean r1) {
                r0 = this;
                r0.readable = r1
                return
        }

        public final void setSequenceNumber$okhttp(long r1) {
                r0 = this;
                r0.sequenceNumber = r1
                return
        }

        public final void setZombie$okhttp(boolean r1) {
                r0 = this;
                r0.zombie = r1
                return
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot$okhttp() {
                r10 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r10.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L35
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 == 0) goto Ld
                goto L35
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "Thread "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L35:
                boolean r0 = r10.readable
                r1 = 0
                if (r0 != 0) goto L3b
                return r1
            L3b:
                okhttp3.internal.cache.DiskLruCache r0 = r10.this$0
                boolean r0 = okhttp3.internal.cache.DiskLruCache.access$getCivilizedFileSystem$p(r0)
                if (r0 != 0) goto L4c
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r10.currentEditor
                if (r0 != 0) goto L4b
                boolean r0 = r10.zombie
                if (r0 == 0) goto L4c
            L4b:
                return r1
            L4c:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                long[] r2 = r10.lengths
                java.lang.Object r2 = r2.clone()
                r8 = r2
                long[] r8 = (long[]) r8
                r2 = 0
                okhttp3.internal.cache.DiskLruCache r3 = r10.this$0     // Catch: java.io.FileNotFoundException -> L7b
                int r3 = r3.getValueCount$okhttp()     // Catch: java.io.FileNotFoundException -> L7b
            L61:
                if (r2 >= r3) goto L6d
                okio.Source r4 = r10.newSource(r2)     // Catch: java.io.FileNotFoundException -> L7b
                r0.add(r4)     // Catch: java.io.FileNotFoundException -> L7b
                int r2 = r2 + 1
                goto L61
            L6d:
                okhttp3.internal.cache.DiskLruCache$Snapshot r9 = new okhttp3.internal.cache.DiskLruCache$Snapshot     // Catch: java.io.FileNotFoundException -> L7b
                okhttp3.internal.cache.DiskLruCache r3 = r10.this$0     // Catch: java.io.FileNotFoundException -> L7b
                java.lang.String r4 = r10.key     // Catch: java.io.FileNotFoundException -> L7b
                long r5 = r10.sequenceNumber     // Catch: java.io.FileNotFoundException -> L7b
                r2 = r9
                r7 = r0
                r2.<init>(r3, r4, r5, r7, r8)     // Catch: java.io.FileNotFoundException -> L7b
                return r9
            L7b:
                java.util.Iterator r0 = r0.iterator()
            L7f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L8f
                java.lang.Object r2 = r0.next()
                okio.Source r2 = (okio.Source) r2
                okhttp3.internal.Util.closeQuietly(r2)
                goto L7f
            L8f:
                okhttp3.internal.cache.DiskLruCache r0 = r10.this$0     // Catch: java.io.IOException -> L94
                r0.removeEntry$okhttp(r10)     // Catch: java.io.IOException -> L94
            L94:
                return r1
        }

        public final void writeLengths$okhttp(@org.jetbrains.annotations.NotNull okio.BufferedSink r7) throws java.io.IOException {
                r6 = this;
                java.lang.String r0 = "writer"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                long[] r0 = r6.lengths
                int r1 = r0.length
                r2 = 0
            La:
                if (r2 >= r1) goto L1a
                r3 = r0[r2]
                r5 = 32
                okio.BufferedSink r5 = r7.writeByte(r5)
                r5.writeDecimalLong(r3)
                int r2 = r2 + 1
                goto La
            L1a:
                return
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "key", "", "sequenceNumber", "", "sources", "", "Lokio/Source;", "lengths", "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "close", "", "edit", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getLength", "index", "", "getSource", "okhttp"}, k = 1, mv = {1, 4, 1})
    public final class Snapshot implements java.io.Closeable {
        private final java.lang.String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final java.util.List<okio.Source> sources;
        public final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        public Snapshot(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache r2, java.lang.String r3, @org.jetbrains.annotations.NotNull long r4, @org.jetbrains.annotations.NotNull java.util.List<? extends okio.Source> r6, long[] r7) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "sources"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "lengths"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.key = r3
                r1.sequenceNumber = r4
                r1.sources = r6
                r1.lengths = r7
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                java.util.List<okio.Source> r0 = r2.sources
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                okio.Source r1 = (okio.Source) r1
                okhttp3.internal.Util.closeQuietly(r1)
                goto L6
            L16:
                return
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.cache.DiskLruCache.Editor edit() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                java.lang.String r1 = r4.key
                long r2 = r4.sequenceNumber
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
                return r0
        }

        public final long getLength(int r4) {
                r3 = this;
                long[] r0 = r3.lengths
                r1 = r0[r4]
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Source getSource(int r2) {
                r1 = this;
                java.util.List<okio.Source> r0 = r1.sources
                java.lang.Object r2 = r0.get(r2)
                okio.Source r2 = (okio.Source) r2
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String key() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\r\u0010\u000b\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012 \u0006*\b\u0018\u00010\u0005R\u00020\u00030\u0005R\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0002R\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "nextSnapshot", "removeSnapshot", "hasNext", "", "next", "remove", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class AnonymousClass1 implements java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot>, kotlin.jvm.internal.markers.KMutableIterator {
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Entry> delegate;
        private okhttp3.internal.cache.DiskLruCache.Snapshot nextSnapshot;
        private okhttp3.internal.cache.DiskLruCache.Snapshot removeSnapshot;
        public final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

        public AnonymousClass1(okhttp3.internal.cache.DiskLruCache r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.LinkedHashMap r2 = r2.getLruEntries$okhttp()
                java.util.Collection r2 = r2.values()
                r0.<init>(r2)
                java.util.Iterator r2 = r0.iterator()
                java.lang.String r0 = "ArrayList(lruEntries.values).iterator()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                r1.delegate = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r4 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r4.nextSnapshot
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch: java.lang.Throwable -> L34
                boolean r2 = r2.getClosed$okhttp()     // Catch: java.lang.Throwable -> L34
                r3 = 0
                if (r2 == 0) goto L14
                monitor-exit(r0)
                return r3
            L14:
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r4.delegate     // Catch: java.lang.Throwable -> L34
                boolean r2 = r2.hasNext()     // Catch: java.lang.Throwable -> L34
                if (r2 == 0) goto L30
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Entry> r2 = r4.delegate     // Catch: java.lang.Throwable -> L34
                java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L34
                okhttp3.internal.cache.DiskLruCache$Entry r2 = (okhttp3.internal.cache.DiskLruCache.Entry) r2     // Catch: java.lang.Throwable -> L34
                if (r2 == 0) goto L14
                okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.snapshot$okhttp()     // Catch: java.lang.Throwable -> L34
                if (r2 == 0) goto L14
                r4.nextSnapshot = r2     // Catch: java.lang.Throwable -> L34
                monitor-exit(r0)
                return r1
            L30:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L34
                monitor-exit(r0)
                return r3
            L34:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ okhttp3.internal.cache.DiskLruCache.Snapshot next() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public okhttp3.internal.cache.DiskLruCache.Snapshot next2() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L11
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.nextSnapshot
                r2.removeSnapshot = r0
                r1 = 0
                r2.nextSnapshot = r1
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                return r0
            L11:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r3.removeSnapshot
                if (r0 == 0) goto L16
                r1 = 0
                okhttp3.internal.cache.DiskLruCache r2 = r3.this$0     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L13
                java.lang.String r0 = r0.key()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L13
                r2.remove(r0)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L13
                goto L13
            Lf:
                r0 = move-exception
                r3.removeSnapshot = r1
                throw r0
            L13:
                r3.removeSnapshot = r1
                return
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "remove() before next()"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            okhttp3.internal.cache.DiskLruCache$Companion r0 = new okhttp3.internal.cache.DiskLruCache$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.DiskLruCache.Companion = r0
            java.lang.String r0 = "journal"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE = r0
            java.lang.String r0 = "journal.tmp"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_TEMP = r0
            java.lang.String r0 = "journal.bkp"
            okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_BACKUP = r0
            java.lang.String r0 = "libcore.io.DiskLruCache"
            okhttp3.internal.cache.DiskLruCache.MAGIC = r0
            java.lang.String r0 = "1"
            okhttp3.internal.cache.DiskLruCache.VERSION_1 = r0
            r0 = -1
            okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[a-z0-9_-]{1,120}"
            r0.<init>(r1)
            okhttp3.internal.cache.DiskLruCache.LEGAL_KEY_PATTERN = r0
            java.lang.String r0 = "CLEAN"
            okhttp3.internal.cache.DiskLruCache.CLEAN = r0
            java.lang.String r0 = "DIRTY"
            okhttp3.internal.cache.DiskLruCache.DIRTY = r0
            java.lang.String r0 = "REMOVE"
            okhttp3.internal.cache.DiskLruCache.REMOVE = r0
            java.lang.String r0 = "READ"
            okhttp3.internal.cache.DiskLruCache.READ = r0
            return
    }

    public DiskLruCache(@org.jetbrains.annotations.NotNull okhttp3.internal.io.FileSystem r3, @org.jetbrains.annotations.NotNull java.io.File r4, int r5, int r6, long r7, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r9) {
            r2 = this;
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r2.<init>()
            r2.fileSystem = r3
            r2.directory = r4
            r2.appVersion = r5
            r2.valueCount = r6
            r2.maxSize = r7
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r5 = 0
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 1
            r3.<init>(r5, r0, r1)
            r2.lruEntries = r3
            okhttp3.internal.concurrent.TaskQueue r3 = r9.newQueue()
            r2.cleanupQueue = r3
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r3 = new okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = okhttp3.internal.Util.okHttpName
            java.lang.String r1 = " Cache"
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r0, r1)
            r3.<init>(r2, r9)
            r2.cleanupTask = r3
            r0 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L4a
            r3 = 1
            goto L4b
        L4a:
            r3 = 0
        L4b:
            if (r3 == 0) goto L7b
            if (r6 <= 0) goto L50
            r5 = 1
        L50:
            if (r5 == 0) goto L6e
            java.io.File r3 = new java.io.File
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE
            r3.<init>(r4, r5)
            r2.journalFile = r3
            java.io.File r3 = new java.io.File
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_TEMP
            r3.<init>(r4, r5)
            r2.journalFileTmp = r3
            java.io.File r3 = new java.io.File
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.JOURNAL_FILE_BACKUP
            r3.<init>(r4, r5)
            r2.journalFileBackup = r3
            return
        L6e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "valueCount <= 0"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L7b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "maxSize <= 0"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.civilizedFileSystem
            return r0
    }

    public static final /* synthetic */ boolean access$getHasJournalErrors$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.hasJournalErrors
            return r0
    }

    public static final /* synthetic */ boolean access$getInitialized$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.initialized
            return r0
    }

    public static final /* synthetic */ okio.BufferedSink access$getJournalWriter$p(okhttp3.internal.cache.DiskLruCache r0) {
            okio.BufferedSink r0 = r0.journalWriter
            return r0
    }

    public static final /* synthetic */ boolean access$getMostRecentRebuildFailed$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.mostRecentRebuildFailed
            return r0
    }

    public static final /* synthetic */ boolean access$getMostRecentTrimFailed$p(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.mostRecentTrimFailed
            return r0
    }

    public static final /* synthetic */ int access$getRedundantOpCount$p(okhttp3.internal.cache.DiskLruCache r0) {
            int r0 = r0.redundantOpCount
            return r0
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(okhttp3.internal.cache.DiskLruCache r0) {
            boolean r0 = r0.journalRebuildRequired()
            return r0
    }

    public static final /* synthetic */ void access$setCivilizedFileSystem$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.civilizedFileSystem = r1
            return
    }

    public static final /* synthetic */ void access$setHasJournalErrors$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.hasJournalErrors = r1
            return
    }

    public static final /* synthetic */ void access$setInitialized$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.initialized = r1
            return
    }

    public static final /* synthetic */ void access$setJournalWriter$p(okhttp3.internal.cache.DiskLruCache r0, okio.BufferedSink r1) {
            r0.journalWriter = r1
            return
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.mostRecentRebuildFailed = r1
            return
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(okhttp3.internal.cache.DiskLruCache r0, boolean r1) {
            r0.mostRecentTrimFailed = r1
            return
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(okhttp3.internal.cache.DiskLruCache r0, int r1) {
            r0.redundantOpCount = r1
            return
    }

    private final synchronized void checkNotClosed() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L15
            r0 = r0 ^ 1
            if (r0 == 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L15
            throw r1     // Catch: java.lang.Throwable -> L15
        L15:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public static /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor edit$default(okhttp3.internal.cache.DiskLruCache r0, java.lang.String r1, long r2, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER
        L6:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
            return r0
    }

    private final boolean journalRebuildRequired() {
            r2 = this;
            int r0 = r2.redundantOpCount
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r2.lruEntries
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private final okio.BufferedSink newJournalWriter() throws java.io.FileNotFoundException {
            r3 = this;
            okhttp3.internal.io.FileSystem r0 = r3.fileSystem
            java.io.File r1 = r3.journalFile
            okio.Sink r0 = r0.appendingSink(r1)
            okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink
            okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1 r2 = new okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            r2.<init>(r3)
            r1.<init>(r0, r2)
            okio.BufferedSink r0 = okio.Okio.buffer(r1)
            return r0
    }

    private final void processJournal() throws java.io.IOException {
            r9 = this;
            okhttp3.internal.io.FileSystem r0 = r9.fileSystem
            java.io.File r1 = r9.journalFileTmp
            r0.delete(r1)
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "i.next()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r1.getCurrentEditor$okhttp()
            r3 = 0
            if (r2 != 0) goto L3b
            int r2 = r9.valueCount
        L2b:
            if (r3 >= r2) goto L11
            long r4 = r9.size
            long[] r6 = r1.getLengths$okhttp()
            r7 = r6[r3]
            long r4 = r4 + r7
            r9.size = r4
            int r3 = r3 + 1
            goto L2b
        L3b:
            r2 = 0
            r1.setCurrentEditor$okhttp(r2)
            int r2 = r9.valueCount
        L41:
            if (r3 >= r2) goto L64
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getCleanFiles$okhttp()
            java.lang.Object r5 = r5.get(r3)
            java.io.File r5 = (java.io.File) r5
            r4.delete(r5)
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem
            java.util.List r5 = r1.getDirtyFiles$okhttp()
            java.lang.Object r5 = r5.get(r3)
            java.io.File r5 = (java.io.File) r5
            r4.delete(r5)
            int r3 = r3 + 1
            goto L41
        L64:
            r0.remove()
            goto L11
        L68:
            return
    }

    private final void readJournal() throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> Lb3
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)     // Catch: java.lang.Throwable -> Lb3
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L84
            java.lang.String r7 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> Lb3
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r3)     // Catch: java.lang.Throwable -> Lb3
            r7 = r7 ^ r8
            if (r7 != 0) goto L84
            int r7 = r9.appVersion     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)     // Catch: java.lang.Throwable -> Lb3
            r4 = r4 ^ r8
            if (r4 != 0) goto L84
            int r4 = r9.valueCount     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)     // Catch: java.lang.Throwable -> Lb3
            r4 = r4 ^ r8
            if (r4 != 0) goto L84
            int r4 = r6.length()     // Catch: java.lang.Throwable -> Lb3
            r7 = 0
            if (r4 <= 0) goto L57
            goto L58
        L57:
            r8 = 0
        L58:
            if (r8 != 0) goto L84
        L5a:
            java.lang.String r0 = r1.readUtf8LineStrict()     // Catch: java.io.EOFException -> L64 java.lang.Throwable -> Lb3
            r9.readJournalLine(r0)     // Catch: java.io.EOFException -> L64 java.lang.Throwable -> Lb3
            int r7 = r7 + 1
            goto L5a
        L64:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb3
            int r7 = r7 - r0
            r9.redundantOpCount = r7     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L77
            r9.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> Lb3
            goto L7d
        L77:
            okio.BufferedSink r0 = r9.newJournalWriter()     // Catch: java.lang.Throwable -> Lb3
            r9.journalWriter = r0     // Catch: java.lang.Throwable -> Lb3
        L7d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb3
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r0)
            return
        L84:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r7.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb3
            r7.append(r2)     // Catch: java.lang.Throwable -> Lb3
            r7.append(r0)     // Catch: java.lang.Throwable -> Lb3
            r7.append(r3)     // Catch: java.lang.Throwable -> Lb3
            r7.append(r0)     // Catch: java.lang.Throwable -> Lb3
            r7.append(r5)     // Catch: java.lang.Throwable -> Lb3
            r7.append(r0)     // Catch: java.lang.Throwable -> Lb3
            r7.append(r6)     // Catch: java.lang.Throwable -> Lb3
            r0 = 93
            r7.append(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> Lb3
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            throw r4     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r0)
            throw r2
    }

    private final void readJournalLine(java.lang.String r13) throws java.io.IOException {
            r12 = this;
            r0 = 32
            r1 = 0
            r2 = 6
            int r2 = kotlin.text.StringsKt.indexOf$default(r13, r0, r1, r2)
            java.lang.String r3 = "unexpected journal line: "
            r4 = -1
            if (r2 == r4) goto Lbc
            int r5 = r2 + 1
            r6 = 4
            int r6 = kotlin.text.StringsKt.indexOf$default(r13, r0, r5, r6)
            java.lang.String r7 = "(this as java.lang.String).substring(startIndex)"
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            r9 = 0
            if (r6 != r4) goto L3a
            java.util.Objects.requireNonNull(r13, r8)
            java.lang.String r5 = r13.substring(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.REMOVE
            int r11 = r10.length()
            if (r2 != r11) goto L46
            boolean r10 = kotlin.text.StringsKt.startsWith$default(r13, r10)
            if (r10 == 0) goto L46
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r13 = r12.lruEntries
            r13.remove(r5)
            return
        L3a:
            java.util.Objects.requireNonNull(r13, r8)
            java.lang.String r5 = r13.substring(r5, r6)
            java.lang.String r10 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r10)
        L46:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r12.lruEntries
            java.lang.Object r10 = r10.get(r5)
            okhttp3.internal.cache.DiskLruCache$Entry r10 = (okhttp3.internal.cache.DiskLruCache.Entry) r10
            if (r10 != 0) goto L5a
            okhttp3.internal.cache.DiskLruCache$Entry r10 = new okhttp3.internal.cache.DiskLruCache$Entry
            r10.<init>(r12, r5)
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r12.lruEntries
            r11.put(r5, r10)
        L5a:
            if (r6 == r4) goto L88
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.CLEAN
            int r11 = r5.length()
            if (r2 != r11) goto L88
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r13, r5)
            if (r5 == 0) goto L88
            r2 = 1
            int r6 = r6 + r2
            java.util.Objects.requireNonNull(r13, r8)
            java.lang.String r13 = r13.substring(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r7)
            char[] r3 = new char[r2]
            r3[r1] = r0
            java.util.List r13 = kotlin.text.StringsKt.split$default(r13, r3)
            r10.setReadable$okhttp(r2)
            r10.setCurrentEditor$okhttp(r9)
            r10.setLengths$okhttp(r13)
            goto Lb1
        L88:
            if (r6 != r4) goto La1
            java.lang.String r0 = okhttp3.internal.cache.DiskLruCache.DIRTY
            int r1 = r0.length()
            if (r2 != r1) goto La1
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r13, r0)
            if (r0 == 0) goto La1
            okhttp3.internal.cache.DiskLruCache$Editor r13 = new okhttp3.internal.cache.DiskLruCache$Editor
            r13.<init>(r12, r10)
            r10.setCurrentEditor$okhttp(r13)
            goto Lb1
        La1:
            if (r6 != r4) goto Lb2
            java.lang.String r0 = okhttp3.internal.cache.DiskLruCache.READ
            int r1 = r0.length()
            if (r2 != r1) goto Lb2
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r13, r0)
            if (r0 == 0) goto Lb2
        Lb1:
            return
        Lb2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r13)
            r0.<init>(r13)
            throw r0
        Lbc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r13)
            r0.<init>(r13)
            throw r0
    }

    private final boolean removeOldestEntry() {
            r3 = this;
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r3.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.getZombie$okhttp()
            if (r2 != 0) goto La
            java.lang.String r0 = "toEvict"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r3.removeEntry$okhttp(r1)
            r0 = 1
            return r0
        L27:
            r0 = 0
            return r0
    }

    private final void validateKey(java.lang.String r3) {
            r2 = this;
            kotlin.text.Regex r0 = okhttp3.internal.cache.DiskLruCache.LEGAL_KEY_PATTERN
            boolean r0 = r0.matches(r3)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "keys must match regex [a-z0-9_-]{1,120}: \""
            r0.append(r1)
            r0.append(r3)
            r3 = 34
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.initialized     // Catch: java.lang.Throwable -> L56
            r1 = 1
            if (r0 == 0) goto L52
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto Lb
            goto L52
        Lb:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L56
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "lruEntries.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L56
            r2 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r3 = new okhttp3.internal.cache.DiskLruCache.Entry[r2]     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L4a
            okhttp3.internal.cache.DiskLruCache$Entry[] r0 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r0     // Catch: java.lang.Throwable -> L56
            int r3 = r0.length     // Catch: java.lang.Throwable -> L56
        L22:
            if (r2 >= r3) goto L38
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L56
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L35
            okhttp3.internal.cache.DiskLruCache$Editor r4 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L35
            r4.detach$okhttp()     // Catch: java.lang.Throwable -> L56
        L35:
            int r2 = r2 + 1
            goto L22
        L38:
            r6.trimToSize()     // Catch: java.lang.Throwable -> L56
            okio.BufferedSink r0 = r6.journalWriter     // Catch: java.lang.Throwable -> L56
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L56
            r0.close()     // Catch: java.lang.Throwable -> L56
            r0 = 0
            r6.journalWriter = r0     // Catch: java.lang.Throwable -> L56
            r6.closed = r1     // Catch: java.lang.Throwable -> L56
            monitor-exit(r6)
            return
        L4a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L52:
            r6.closed = r1     // Catch: java.lang.Throwable -> L56
            monitor-exit(r6)
            return
        L56:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    public final synchronized void completeEdit$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)     // Catch: java.lang.Throwable -> L142
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r9.getEntry$okhttp()     // Catch: java.lang.Throwable -> L142
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L142
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)     // Catch: java.lang.Throwable -> L142
            if (r1 == 0) goto L136
            r1 = 0
            if (r10 == 0) goto L61
            boolean r2 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L142
            if (r2 != 0) goto L61
            int r2 = r8.valueCount     // Catch: java.lang.Throwable -> L142
            r3 = 0
        L20:
            if (r3 >= r2) goto L61
            boolean[] r4 = r9.getWritten$okhttp()     // Catch: java.lang.Throwable -> L142
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L142
            boolean r4 = r4[r3]     // Catch: java.lang.Throwable -> L142
            if (r4 == 0) goto L47
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch: java.lang.Throwable -> L142
            java.util.List r5 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L142
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L142
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L142
            boolean r4 = r4.exists(r5)     // Catch: java.lang.Throwable -> L142
            if (r4 != 0) goto L44
            r9.abort()     // Catch: java.lang.Throwable -> L142
            monitor-exit(r8)
            return
        L44:
            int r3 = r3 + 1
            goto L20
        L47:
            r9.abort()     // Catch: java.lang.Throwable -> L142
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L142
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L142
            r10.<init>()     // Catch: java.lang.Throwable -> L142
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch: java.lang.Throwable -> L142
            r10.append(r3)     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L142
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L142
            throw r9     // Catch: java.lang.Throwable -> L142
        L61:
            int r9 = r8.valueCount     // Catch: java.lang.Throwable -> L142
        L63:
            if (r1 >= r9) goto Laf
            java.util.List r2 = r0.getDirtyFiles$okhttp()     // Catch: java.lang.Throwable -> L142
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L142
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L142
            if (r10 == 0) goto La7
            boolean r3 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L142
            if (r3 != 0) goto La7
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch: java.lang.Throwable -> L142
            boolean r3 = r3.exists(r2)     // Catch: java.lang.Throwable -> L142
            if (r3 == 0) goto Lac
            java.util.List r3 = r0.getCleanFiles$okhttp()     // Catch: java.lang.Throwable -> L142
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L142
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L142
            okhttp3.internal.io.FileSystem r4 = r8.fileSystem     // Catch: java.lang.Throwable -> L142
            r4.rename(r2, r3)     // Catch: java.lang.Throwable -> L142
            long[] r2 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L142
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L142
            okhttp3.internal.io.FileSystem r2 = r8.fileSystem     // Catch: java.lang.Throwable -> L142
            long r2 = r2.size(r3)     // Catch: java.lang.Throwable -> L142
            long[] r6 = r0.getLengths$okhttp()     // Catch: java.lang.Throwable -> L142
            r6[r1] = r2     // Catch: java.lang.Throwable -> L142
            long r6 = r8.size     // Catch: java.lang.Throwable -> L142
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.size = r6     // Catch: java.lang.Throwable -> L142
            goto Lac
        La7:
            okhttp3.internal.io.FileSystem r3 = r8.fileSystem     // Catch: java.lang.Throwable -> L142
            r3.delete(r2)     // Catch: java.lang.Throwable -> L142
        Lac:
            int r1 = r1 + 1
            goto L63
        Laf:
            r9 = 0
            r0.setCurrentEditor$okhttp(r9)     // Catch: java.lang.Throwable -> L142
            boolean r9 = r0.getZombie$okhttp()     // Catch: java.lang.Throwable -> L142
            if (r9 == 0) goto Lbe
            r8.removeEntry$okhttp(r0)     // Catch: java.lang.Throwable -> L142
            monitor-exit(r8)
            return
        Lbe:
            int r9 = r8.redundantOpCount     // Catch: java.lang.Throwable -> L142
            r1 = 1
            int r9 = r9 + r1
            r8.redundantOpCount = r9     // Catch: java.lang.Throwable -> L142
            okio.BufferedSink r9 = r8.journalWriter     // Catch: java.lang.Throwable -> L142
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch: java.lang.Throwable -> L142
            boolean r2 = r0.getReadable$okhttp()     // Catch: java.lang.Throwable -> L142
            r3 = 10
            r4 = 32
            if (r2 != 0) goto Lf3
            if (r10 == 0) goto Ld6
            goto Lf3
        Ld6:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r8.lruEntries     // Catch: java.lang.Throwable -> L142
            java.lang.String r1 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L142
            r10.remove(r1)     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.REMOVE     // Catch: java.lang.Throwable -> L142
            okio.BufferedSink r10 = r9.writeUtf8(r10)     // Catch: java.lang.Throwable -> L142
            r10.writeByte(r4)     // Catch: java.lang.Throwable -> L142
            java.lang.String r10 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L142
            r9.writeUtf8(r10)     // Catch: java.lang.Throwable -> L142
            r9.writeByte(r3)     // Catch: java.lang.Throwable -> L142
            goto L118
        Lf3:
            r0.setReadable$okhttp(r1)     // Catch: java.lang.Throwable -> L142
            java.lang.String r1 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> L142
            okio.BufferedSink r1 = r9.writeUtf8(r1)     // Catch: java.lang.Throwable -> L142
            r1.writeByte(r4)     // Catch: java.lang.Throwable -> L142
            java.lang.String r1 = r0.getKey$okhttp()     // Catch: java.lang.Throwable -> L142
            r9.writeUtf8(r1)     // Catch: java.lang.Throwable -> L142
            r0.writeLengths$okhttp(r9)     // Catch: java.lang.Throwable -> L142
            r9.writeByte(r3)     // Catch: java.lang.Throwable -> L142
            if (r10 == 0) goto L118
            long r1 = r8.nextSequenceNumber     // Catch: java.lang.Throwable -> L142
            r3 = 1
            long r3 = r3 + r1
            r8.nextSequenceNumber = r3     // Catch: java.lang.Throwable -> L142
            r0.setSequenceNumber$okhttp(r1)     // Catch: java.lang.Throwable -> L142
        L118:
            r9.flush()     // Catch: java.lang.Throwable -> L142
            long r9 = r8.size     // Catch: java.lang.Throwable -> L142
            long r0 = r8.maxSize     // Catch: java.lang.Throwable -> L142
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L129
            boolean r9 = r8.journalRebuildRequired()     // Catch: java.lang.Throwable -> L142
            if (r9 == 0) goto L134
        L129:
            okhttp3.internal.concurrent.TaskQueue r0 = r8.cleanupQueue     // Catch: java.lang.Throwable -> L142
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r8.cleanupTask     // Catch: java.lang.Throwable -> L142
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L142
        L134:
            monitor-exit(r8)
            return
        L136:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L142
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L142
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L142
            throw r10     // Catch: java.lang.Throwable -> L142
        L142:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final void delete() throws java.io.IOException {
            r2 = this;
            r2.close()
            okhttp3.internal.io.FileSystem r0 = r2.fileSystem
            java.io.File r1 = r2.directory
            r0.deleteContents(r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.cache.DiskLruCache.Editor edit(@org.jetbrains.annotations.NotNull java.lang.String r7) throws java.io.IOException {
            r6 = this;
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            r1 = r7
            okhttp3.internal.cache.DiskLruCache$Editor r7 = edit$default(r0, r1, r2, r4, r5)
            return r7
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(@org.jetbrains.annotations.NotNull java.lang.String r11, long r12) throws java.io.IOException {
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)     // Catch: java.lang.Throwable -> L8f
            r10.initialize()     // Catch: java.lang.Throwable -> L8f
            r10.checkNotClosed()     // Catch: java.lang.Throwable -> L8f
            r10.validateKey(r11)     // Catch: java.lang.Throwable -> L8f
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L8f
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L8f
            long r1 = okhttp3.internal.cache.DiskLruCache.ANY_SEQUENCE_NUMBER     // Catch: java.lang.Throwable -> L8f
            r3 = 0
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 == 0) goto L2a
            if (r0 == 0) goto L28
            long r1 = r0.getSequenceNumber$okhttp()     // Catch: java.lang.Throwable -> L8f
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 == 0) goto L2a
        L28:
            monitor-exit(r10)
            return r3
        L2a:
            if (r0 == 0) goto L31
            okhttp3.internal.cache.DiskLruCache$Editor r12 = r0.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> L8f
            goto L32
        L31:
            r12 = r3
        L32:
            if (r12 == 0) goto L36
            monitor-exit(r10)
            return r3
        L36:
            if (r0 == 0) goto L40
            int r12 = r0.getLockingSourceCount$okhttp()     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L40
            monitor-exit(r10)
            return r3
        L40:
            boolean r12 = r10.mostRecentTrimFailed     // Catch: java.lang.Throwable -> L8f
            if (r12 != 0) goto L82
            boolean r12 = r10.mostRecentRebuildFailed     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L49
            goto L82
        L49:
            okio.BufferedSink r12 = r10.journalWriter     // Catch: java.lang.Throwable -> L8f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r13 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> L8f
            okio.BufferedSink r13 = r12.writeUtf8(r13)     // Catch: java.lang.Throwable -> L8f
            r1 = 32
            okio.BufferedSink r13 = r13.writeByte(r1)     // Catch: java.lang.Throwable -> L8f
            okio.BufferedSink r13 = r13.writeUtf8(r11)     // Catch: java.lang.Throwable -> L8f
            r1 = 10
            r13.writeByte(r1)     // Catch: java.lang.Throwable -> L8f
            r12.flush()     // Catch: java.lang.Throwable -> L8f
            boolean r12 = r10.hasJournalErrors     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L6c
            monitor-exit(r10)
            return r3
        L6c:
            if (r0 != 0) goto L78
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r10, r11)     // Catch: java.lang.Throwable -> L8f
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r12 = r10.lruEntries     // Catch: java.lang.Throwable -> L8f
            r12.put(r11, r0)     // Catch: java.lang.Throwable -> L8f
        L78:
            okhttp3.internal.cache.DiskLruCache$Editor r11 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch: java.lang.Throwable -> L8f
            r11.<init>(r10, r0)     // Catch: java.lang.Throwable -> L8f
            r0.setCurrentEditor$okhttp(r11)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r10)
            return r11
        L82:
            okhttp3.internal.concurrent.TaskQueue r4 = r10.cleanupQueue     // Catch: java.lang.Throwable -> L8f
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = r10.cleanupTask     // Catch: java.lang.Throwable -> L8f
            r6 = 0
            r8 = 2
            r9 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r10)
            return r3
        L8f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    public final synchronized void evictAll() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            r6.initialize()     // Catch: java.lang.Throwable -> L37
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L37
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "lruEntries.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L37
            r1 = 0
            okhttp3.internal.cache.DiskLruCache$Entry[] r2 = new okhttp3.internal.cache.DiskLruCache.Entry[r1]     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L2f
            okhttp3.internal.cache.DiskLruCache$Entry[] r0 = (okhttp3.internal.cache.DiskLruCache.Entry[]) r0     // Catch: java.lang.Throwable -> L37
            int r2 = r0.length     // Catch: java.lang.Throwable -> L37
            r3 = 0
        L1c:
            if (r3 >= r2) goto L2b
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Throwable -> L37
            r6.removeEntry$okhttp(r4)     // Catch: java.lang.Throwable -> L37
            int r3 = r3 + 1
            goto L1c
        L2b:
            r6.mostRecentTrimFailed = r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r6)
            return
        L2f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.initialized     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.checkNotClosed()     // Catch: java.lang.Throwable -> L17
            r1.trimToSize()     // Catch: java.lang.Throwable -> L17
            okio.BufferedSink r0 = r1.journalWriter     // Catch: java.lang.Throwable -> L17
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L17
            r0.flush()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(@org.jetbrains.annotations.NotNull java.lang.String r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)     // Catch: java.lang.Throwable -> L5c
            r7.initialize()     // Catch: java.lang.Throwable -> L5c
            r7.checkNotClosed()     // Catch: java.lang.Throwable -> L5c
            r7.validateKey(r8)     // Catch: java.lang.Throwable -> L5c
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L5c
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            if (r0 == 0) goto L5a
            java.lang.String r2 = "lruEntries[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L5c
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L58
            int r1 = r7.redundantOpCount     // Catch: java.lang.Throwable -> L5c
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch: java.lang.Throwable -> L5c
            okio.BufferedSink r1 = r7.journalWriter     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.READ     // Catch: java.lang.Throwable -> L5c
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L5c
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch: java.lang.Throwable -> L5c
            okio.BufferedSink r8 = r1.writeUtf8(r8)     // Catch: java.lang.Throwable -> L5c
            r1 = 10
            r8.writeByte(r1)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = r7.journalRebuildRequired()     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L56
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch: java.lang.Throwable -> L5c
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch: java.lang.Throwable -> L5c
            r3 = 0
            r5 = 2
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L5c
        L56:
            monitor-exit(r7)
            return r0
        L58:
            monitor-exit(r7)
            return r1
        L5a:
            monitor-exit(r7)
            return r1
        L5c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public final boolean getClosed$okhttp() {
            r1 = this;
            boolean r0 = r1.closed
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.File getDirectory() {
            r1 = this;
            java.io.File r0 = r1.directory
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.io.FileSystem getFileSystem$okhttp() {
            r1 = this;
            okhttp3.internal.io.FileSystem r0 = r1.fileSystem
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache.Entry> getLruEntries$okhttp() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r1.lruEntries
            return r0
    }

    public final synchronized long getMaxSize() {
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

    public final int getValueCount$okhttp() {
            r1 = this;
            int r0 = r1.valueCount
            return r0
    }

    public final synchronized void initialize() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r5)     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lc
            goto L38
        Lc:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Lc3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r1.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "Thread "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r3 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> Lc3
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc3
            r1.append(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc3
            throw r0     // Catch: java.lang.Throwable -> Lc3
        L38:
            boolean r0 = r5.initialized     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto L3e
            monitor-exit(r5)
            return
        L3e:
            okhttp3.internal.io.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> Lc3
            java.io.File r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> Lc3
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto L63
            okhttp3.internal.io.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> Lc3
            java.io.File r1 = r5.journalFile     // Catch: java.lang.Throwable -> Lc3
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto L5a
            okhttp3.internal.io.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> Lc3
            java.io.File r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> Lc3
            r0.delete(r1)     // Catch: java.lang.Throwable -> Lc3
            goto L63
        L5a:
            okhttp3.internal.io.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> Lc3
            java.io.File r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> Lc3
            java.io.File r2 = r5.journalFile     // Catch: java.lang.Throwable -> Lc3
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> Lc3
        L63:
            okhttp3.internal.io.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> Lc3
            java.io.File r1 = r5.journalFileBackup     // Catch: java.lang.Throwable -> Lc3
            boolean r0 = okhttp3.internal.Util.isCivilized(r0, r1)     // Catch: java.lang.Throwable -> Lc3
            r5.civilizedFileSystem = r0     // Catch: java.lang.Throwable -> Lc3
            okhttp3.internal.io.FileSystem r0 = r5.fileSystem     // Catch: java.lang.Throwable -> Lc3
            java.io.File r1 = r5.journalFile     // Catch: java.lang.Throwable -> Lc3
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Lc3
            r1 = 1
            if (r0 == 0) goto Lbc
            r5.readJournal()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> Lc3
            r5.processJournal()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> Lc3
            r5.initialized = r1     // Catch: java.io.IOException -> L82 java.lang.Throwable -> Lc3
            monitor-exit(r5)
            return
        L82:
            r0 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> Lc3
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> Lc3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r3.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "DiskLruCache "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc3
            java.io.File r4 = r5.directory     // Catch: java.lang.Throwable -> Lc3
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = " is corrupt: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> Lc3
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = ", removing"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lc3
            r4 = 5
            r2.log(r3, r4, r0)     // Catch: java.lang.Throwable -> Lc3
            r0 = 0
            r5.delete()     // Catch: java.lang.Throwable -> Lb8
            r5.closed = r0     // Catch: java.lang.Throwable -> Lc3
            goto Lbc
        Lb8:
            r1 = move-exception
            r5.closed = r0     // Catch: java.lang.Throwable -> Lc3
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lbc:
            r5.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> Lc3
            r5.initialized = r1     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r5)
            return
        Lc3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public final synchronized boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void rebuildJournal$okhttp() throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            okio.BufferedSink r0 = r7.journalWriter     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.Throwable -> Lc5
        L8:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> Lc5
            java.io.File r1 = r7.journalFileTmp     // Catch: java.lang.Throwable -> Lc5
            okio.Sink r0 = r0.sink(r1)     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> Lc5
            r1 = 0
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> Lbe
            okio.BufferedSink r2 = r0.writeUtf8(r2)     // Catch: java.lang.Throwable -> Lbe
            r3 = 10
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> Lbe
            okio.BufferedSink r2 = r0.writeUtf8(r2)     // Catch: java.lang.Throwable -> Lbe
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> Lbe
            int r2 = r7.appVersion     // Catch: java.lang.Throwable -> Lbe
            long r4 = (long) r2     // Catch: java.lang.Throwable -> Lbe
            okio.BufferedSink r2 = r0.writeDecimalLong(r4)     // Catch: java.lang.Throwable -> Lbe
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> Lbe
            int r2 = r7.valueCount     // Catch: java.lang.Throwable -> Lbe
            long r4 = (long) r2     // Catch: java.lang.Throwable -> Lbe
            okio.BufferedSink r2 = r0.writeDecimalLong(r4)     // Catch: java.lang.Throwable -> Lbe
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> Lbe
            r0.writeByte(r3)     // Catch: java.lang.Throwable -> Lbe
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r7.lruEntries     // Catch: java.lang.Throwable -> Lbe
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> Lbe
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbe
        L4a:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbe
            if (r4 == 0) goto L89
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lbe
            okhttp3.internal.cache.DiskLruCache$Entry r4 = (okhttp3.internal.cache.DiskLruCache.Entry) r4     // Catch: java.lang.Throwable -> Lbe
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch: java.lang.Throwable -> Lbe
            r6 = 32
            if (r5 == 0) goto L72
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.DIRTY     // Catch: java.lang.Throwable -> Lbe
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> Lbe
            r5.writeByte(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = r4.getKey$okhttp()     // Catch: java.lang.Throwable -> Lbe
            r0.writeUtf8(r4)     // Catch: java.lang.Throwable -> Lbe
            r0.writeByte(r3)     // Catch: java.lang.Throwable -> Lbe
            goto L4a
        L72:
            java.lang.String r5 = okhttp3.internal.cache.DiskLruCache.CLEAN     // Catch: java.lang.Throwable -> Lbe
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> Lbe
            r5.writeByte(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r4.getKey$okhttp()     // Catch: java.lang.Throwable -> Lbe
            r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> Lbe
            r4.writeLengths$okhttp(r0)     // Catch: java.lang.Throwable -> Lbe
            r0.writeByte(r3)     // Catch: java.lang.Throwable -> Lbe
            goto L4a
        L89:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbe
            kotlin.io.CloseableKt.closeFinally(r0, r1)     // Catch: java.lang.Throwable -> Lc5
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> Lc5
            java.io.File r1 = r7.journalFile     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = r0.exists(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto La1
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> Lc5
            java.io.File r1 = r7.journalFile     // Catch: java.lang.Throwable -> Lc5
            java.io.File r2 = r7.journalFileBackup     // Catch: java.lang.Throwable -> Lc5
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> Lc5
        La1:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> Lc5
            java.io.File r1 = r7.journalFileTmp     // Catch: java.lang.Throwable -> Lc5
            java.io.File r2 = r7.journalFile     // Catch: java.lang.Throwable -> Lc5
            r0.rename(r1, r2)     // Catch: java.lang.Throwable -> Lc5
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch: java.lang.Throwable -> Lc5
            java.io.File r1 = r7.journalFileBackup     // Catch: java.lang.Throwable -> Lc5
            r0.delete(r1)     // Catch: java.lang.Throwable -> Lc5
            okio.BufferedSink r0 = r7.newJournalWriter()     // Catch: java.lang.Throwable -> Lc5
            r7.journalWriter = r0     // Catch: java.lang.Throwable -> Lc5
            r0 = 0
            r7.hasJournalErrors = r0     // Catch: java.lang.Throwable -> Lc5
            r7.mostRecentRebuildFailed = r0     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r7)
            return
        Lbe:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)     // Catch: java.lang.Throwable -> Lc5
            throw r2     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public final synchronized boolean remove(@org.jetbrains.annotations.NotNull java.lang.String r7) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L33
            r6.initialize()     // Catch: java.lang.Throwable -> L33
            r6.checkNotClosed()     // Catch: java.lang.Throwable -> L33
            r6.validateKey(r7)     // Catch: java.lang.Throwable -> L33
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch: java.lang.Throwable -> L33
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L33
            okhttp3.internal.cache.DiskLruCache$Entry r7 = (okhttp3.internal.cache.DiskLruCache.Entry) r7     // Catch: java.lang.Throwable -> L33
            r0 = 0
            if (r7 == 0) goto L31
            java.lang.String r1 = "lruEntries[key] ?: return false"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)     // Catch: java.lang.Throwable -> L33
            boolean r7 = r6.removeEntry$okhttp(r7)     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L2f
            long r1 = r6.size     // Catch: java.lang.Throwable -> L33
            long r3 = r6.maxSize     // Catch: java.lang.Throwable -> L33
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L2f
            r6.mostRecentTrimFailed = r0     // Catch: java.lang.Throwable -> L33
        L2f:
            monitor-exit(r6)
            return r7
        L31:
            monitor-exit(r6)
            return r0
        L33:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final boolean removeEntry$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.cache.DiskLruCache.Entry r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            boolean r0 = r10.civilizedFileSystem
            r1 = 10
            r2 = 32
            r3 = 1
            if (r0 != 0) goto L3d
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 <= 0) goto L2d
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L2d
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.DIRTY
            r0.writeUtf8(r4)
            r0.writeByte(r2)
            java.lang.String r4 = r11.getKey$okhttp()
            r0.writeUtf8(r4)
            r0.writeByte(r1)
            r0.flush()
        L2d:
            int r0 = r11.getLockingSourceCount$okhttp()
            if (r0 > 0) goto L39
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L3d
        L39:
            r11.setZombie$okhttp(r3)
            return r3
        L3d:
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r11.getCurrentEditor$okhttp()
            if (r0 == 0) goto L46
            r0.detach$okhttp()
        L46:
            r0 = 0
            int r4 = r10.valueCount
        L49:
            if (r0 >= r4) goto L70
            okhttp3.internal.io.FileSystem r5 = r10.fileSystem
            java.util.List r6 = r11.getCleanFiles$okhttp()
            java.lang.Object r6 = r6.get(r0)
            java.io.File r6 = (java.io.File) r6
            r5.delete(r6)
            long r5 = r10.size
            long[] r7 = r11.getLengths$okhttp()
            r8 = r7[r0]
            long r5 = r5 - r8
            r10.size = r5
            long[] r5 = r11.getLengths$okhttp()
            r6 = 0
            r5[r0] = r6
            int r0 = r0 + 1
            goto L49
        L70:
            int r0 = r10.redundantOpCount
            int r0 = r0 + r3
            r10.redundantOpCount = r0
            okio.BufferedSink r0 = r10.journalWriter
            if (r0 == 0) goto L8b
            java.lang.String r4 = okhttp3.internal.cache.DiskLruCache.REMOVE
            r0.writeUtf8(r4)
            r0.writeByte(r2)
            java.lang.String r2 = r11.getKey$okhttp()
            r0.writeUtf8(r2)
            r0.writeByte(r1)
        L8b:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r10.lruEntries
            java.lang.String r11 = r11.getKey$okhttp()
            r0.remove(r11)
            boolean r11 = r10.journalRebuildRequired()
            if (r11 == 0) goto La5
            okhttp3.internal.concurrent.TaskQueue r4 = r10.cleanupQueue
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r5 = r10.cleanupTask
            r6 = 0
            r8 = 2
            r9 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r4, r5, r6, r8, r9)
        La5:
            return r3
    }

    public final void setClosed$okhttp(boolean r1) {
            r0 = this;
            r0.closed = r1
            return
    }

    public final synchronized void setMaxSize(long r7) {
            r6 = this;
            monitor-enter(r6)
            r6.maxSize = r7     // Catch: java.lang.Throwable -> L14
            boolean r7 = r6.initialized     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L12
            okhttp3.internal.concurrent.TaskQueue r0 = r6.cleanupQueue     // Catch: java.lang.Throwable -> L14
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r6.cleanupTask     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r6)
            return
        L14:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final synchronized long size() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r2.initialize()     // Catch: java.lang.Throwable -> L8
            long r0 = r2.size     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> snapshots() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.initialize()     // Catch: java.lang.Throwable -> Lb
            okhttp3.internal.cache.DiskLruCache$snapshots$1 r0 = new okhttp3.internal.cache.DiskLruCache$snapshots$1     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void trimToSize() throws java.io.IOException {
            r5 = this;
        L0:
            long r0 = r5.size
            long r2 = r5.maxSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lf
            boolean r0 = r5.removeOldestEntry()
            if (r0 != 0) goto L0
            return
        Lf:
            r0 = 0
            r5.mostRecentTrimFailed = r0
            return
    }
}
