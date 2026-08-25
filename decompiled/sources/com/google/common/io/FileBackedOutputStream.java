package com.google.common.io;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class FileBackedOutputStream extends java.io.OutputStream {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private java.io.File file;
    private final int fileThreshold;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private com.google.common.io.FileBackedOutputStream.MemoryOutput memory;

    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private java.io.OutputStream out;

    @javax.annotation.CheckForNull
    private final java.io.File parentDirectory;
    private final boolean resetOnFinalize;
    private final com.google.common.io.ByteSource source;



    /* JADX INFO: loaded from: classes2.dex */
    public static class MemoryOutput extends java.io.ByteArrayOutputStream {
        private MemoryOutput() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ MemoryOutput(com.google.common.io.FileBackedOutputStream.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final byte[] getBuffer() {
                r1 = this;
                byte[] r0 = r1.buf
                return r0
        }

        public final int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }
    }

    public FileBackedOutputStream(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FileBackedOutputStream(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private FileBackedOutputStream(int r1, boolean r2, @javax.annotation.CheckForNull java.io.File r3) {
            r0 = this;
            r0.<init>()
            r0.fileThreshold = r1
            r0.resetOnFinalize = r2
            r0.parentDirectory = r3
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = new com.google.common.io.FileBackedOutputStream$MemoryOutput
            r3 = 0
            r1.<init>(r3)
            r0.memory = r1
            r0.out = r1
            if (r2 == 0) goto L1d
            com.google.common.io.FileBackedOutputStream$1 r1 = new com.google.common.io.FileBackedOutputStream$1
            r1.<init>(r0)
            r0.source = r1
            goto L24
        L1d:
            com.google.common.io.FileBackedOutputStream$2 r1 = new com.google.common.io.FileBackedOutputStream$2
            r1.<init>(r0)
            r0.source = r1
        L24:
            return
    }

    public static /* synthetic */ java.io.InputStream access$100(com.google.common.io.FileBackedOutputStream r0) throws java.io.IOException {
            java.io.InputStream r0 = r0.openInputStream()
            return r0
    }

    private synchronized java.io.InputStream openInputStream() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.file     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto Le
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27
            java.io.File r1 = r4.file     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r4)
            return r0
        Le:
            com.google.common.io.FileBackedOutputStream$MemoryOutput r0 = r4.memory     // Catch: java.lang.Throwable -> L27
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L27
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L27
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = r4.memory     // Catch: java.lang.Throwable -> L27
            byte[] r1 = r1.getBuffer()     // Catch: java.lang.Throwable -> L27
            r2 = 0
            com.google.common.io.FileBackedOutputStream$MemoryOutput r3 = r4.memory     // Catch: java.lang.Throwable -> L27
            int r3 = r3.getCount()     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r4)
            return r0
        L27:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("this")
    private void update(int r6) throws java.io.IOException {
            r5 = this;
            com.google.common.io.FileBackedOutputStream$MemoryOutput r0 = r5.memory
            if (r0 == 0) goto L41
            int r0 = r0.getCount()
            int r0 = r0 + r6
            int r6 = r5.fileThreshold
            if (r0 <= r6) goto L41
            java.io.File r6 = r5.parentDirectory
            java.lang.String r0 = "FileBackedOutputStream"
            r1 = 0
            java.io.File r6 = java.io.File.createTempFile(r0, r1, r6)
            boolean r0 = r5.resetOnFinalize
            if (r0 == 0) goto L1d
            r6.deleteOnExit()
        L1d:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L3c
            r0.<init>(r6)     // Catch: java.io.IOException -> L3c
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r5.memory     // Catch: java.io.IOException -> L3c
            byte[] r2 = r2.getBuffer()     // Catch: java.io.IOException -> L3c
            r3 = 0
            com.google.common.io.FileBackedOutputStream$MemoryOutput r4 = r5.memory     // Catch: java.io.IOException -> L3c
            int r4 = r4.getCount()     // Catch: java.io.IOException -> L3c
            r0.write(r2, r3, r4)     // Catch: java.io.IOException -> L3c
            r0.flush()     // Catch: java.io.IOException -> L3c
            r5.out = r0     // Catch: java.io.IOException -> L3c
            r5.file = r6
            r5.memory = r1
            goto L41
        L3c:
            r0 = move-exception
            r6.delete()
            throw r0
        L41:
            return
    }

    public com.google.common.io.ByteSource asByteSource() {
            r1 = this;
            com.google.common.io.ByteSource r0 = r1.source
            return r0
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> L8
            r0.flush()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void reset() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.close()     // Catch: java.lang.Throwable -> L4a
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = r4.memory     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L11
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = new com.google.common.io.FileBackedOutputStream$MemoryOutput     // Catch: java.lang.Throwable -> L48
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r4.memory = r1     // Catch: java.lang.Throwable -> L48
            goto L14
        L11:
            r1.reset()     // Catch: java.lang.Throwable -> L48
        L14:
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = r4.memory     // Catch: java.lang.Throwable -> L48
            r4.out = r1     // Catch: java.lang.Throwable -> L48
            java.io.File r1 = r4.file     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L46
            r4.file = r0     // Catch: java.lang.Throwable -> L48
            boolean r0 = r1.delete()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L25
            goto L46
        L25:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L48
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L48
            int r2 = r2 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "Could not delete: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L48
            r3.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L48
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r4)
            return
        L48:
            r0 = move-exception
            goto L8e
        L4a:
            r1 = move-exception
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r4.memory     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L57
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = new com.google.common.io.FileBackedOutputStream$MemoryOutput     // Catch: java.lang.Throwable -> L48
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r4.memory = r2     // Catch: java.lang.Throwable -> L48
            goto L5c
        L57:
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r4.memory     // Catch: java.lang.Throwable -> L48
            r2.reset()     // Catch: java.lang.Throwable -> L48
        L5c:
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r4.memory     // Catch: java.lang.Throwable -> L48
            r4.out = r2     // Catch: java.lang.Throwable -> L48
            java.io.File r2 = r4.file     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L8d
            r4.file = r0     // Catch: java.lang.Throwable -> L48
            boolean r0 = r2.delete()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L8d
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L48
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L48
            int r2 = r2 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "Could not delete: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L48
            r3.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L48
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L8d:
            throw r1     // Catch: java.lang.Throwable -> L48
        L8e:
            monitor-exit(r4)
            throw r0
    }

    @Override // java.io.OutputStream
    public synchronized void write(int r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.update(r0)     // Catch: java.lang.Throwable -> Lc
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> Lc
            r0.write(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            int r1 = r3.length     // Catch: java.lang.Throwable -> L8
            r2.write(r3, r0, r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.update(r4)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> Lb
            r0.write(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
