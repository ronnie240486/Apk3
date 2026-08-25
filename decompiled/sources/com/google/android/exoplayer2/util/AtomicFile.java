package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class AtomicFile {
    private static final java.lang.String TAG = "AtomicFile";
    private final java.io.File backupName;
    private final java.io.File baseName;

    public static final class AtomicFileOutputStream extends java.io.OutputStream {
        private boolean closed;
        private final java.io.FileOutputStream fileOutputStream;

        public AtomicFileOutputStream(java.io.File r2) throws java.io.FileNotFoundException {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.closed = r0
                java.io.FileOutputStream r0 = new java.io.FileOutputStream
                r0.<init>(r2)
                r1.fileOutputStream = r0
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.closed = r0
                r3.flush()
                java.io.FileOutputStream r0 = r3.fileOutputStream     // Catch: java.io.IOException -> L15
                java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.io.IOException -> L15
                r0.sync()     // Catch: java.io.IOException -> L15
                goto L1d
            L15:
                r0 = move-exception
                java.lang.String r1 = "AtomicFile"
                java.lang.String r2 = "Failed to sync file descriptor:"
                com.google.android.exoplayer2.util.Log.w(r1, r2, r0)
            L1d:
                java.io.FileOutputStream r0 = r3.fileOutputStream
                r0.close()
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.flush()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r2) throws java.io.IOException {
                r1 = this;
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.FileOutputStream r0 = r1.fileOutputStream
                r0.write(r2, r3, r4)
                return
        }
    }

    public AtomicFile(java.io.File r3) {
            r2 = this;
            r2.<init>()
            r2.baseName = r3
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPath()
            r1.append(r3)
            java.lang.String r3 = ".bak"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            r2.backupName = r0
            return
    }

    private void restoreBackup() {
            r2 = this;
            java.io.File r0 = r2.backupName
            boolean r0 = r0.exists()
            if (r0 == 0) goto L14
            java.io.File r0 = r2.baseName
            r0.delete()
            java.io.File r0 = r2.backupName
            java.io.File r1 = r2.baseName
            r0.renameTo(r1)
        L14:
            return
    }

    public void delete() {
            r1 = this;
            java.io.File r0 = r1.baseName
            r0.delete()
            java.io.File r0 = r1.backupName
            r0.delete()
            return
    }

    public void endWrite(java.io.OutputStream r1) throws java.io.IOException {
            r0 = this;
            r1.close()
            java.io.File r1 = r0.backupName
            r1.delete()
            return
    }

    public boolean exists() {
            r1 = this;
            java.io.File r0 = r1.baseName
            boolean r0 = r0.exists()
            if (r0 != 0) goto L13
            java.io.File r0 = r1.backupName
            boolean r0 = r0.exists()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    public java.io.InputStream openRead() throws java.io.FileNotFoundException {
            r2 = this;
            r2.restoreBackup()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.baseName
            r0.<init>(r1)
            return r0
    }

    public java.io.OutputStream startWrite() throws java.io.IOException {
            r4 = this;
            java.io.File r0 = r4.baseName
            boolean r0 = r0.exists()
            if (r0 == 0) goto L3e
            java.io.File r0 = r4.backupName
            boolean r0 = r0.exists()
            if (r0 != 0) goto L39
            java.io.File r0 = r4.baseName
            java.io.File r1 = r4.backupName
            boolean r0 = r0.renameTo(r1)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "Couldn't rename file "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.io.File r1 = r4.baseName
            r0.append(r1)
            java.lang.String r1 = " to backup file "
            r0.append(r1)
            java.io.File r1 = r4.backupName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AtomicFile"
            com.google.android.exoplayer2.util.Log.w(r1, r0)
            goto L3e
        L39:
            java.io.File r0 = r4.baseName
            r0.delete()
        L3e:
            com.google.android.exoplayer2.util.AtomicFile$AtomicFileOutputStream r0 = new com.google.android.exoplayer2.util.AtomicFile$AtomicFileOutputStream     // Catch: java.io.FileNotFoundException -> L46
            java.io.File r1 = r4.baseName     // Catch: java.io.FileNotFoundException -> L46
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L46
            goto L5e
        L46:
            r0 = move-exception
            java.io.File r1 = r4.baseName
            java.io.File r1 = r1.getParentFile()
            java.lang.String r2 = "Couldn't create "
            if (r1 == 0) goto L73
            boolean r1 = r1.mkdirs()
            if (r1 == 0) goto L73
            com.google.android.exoplayer2.util.AtomicFile$AtomicFileOutputStream r0 = new com.google.android.exoplayer2.util.AtomicFile$AtomicFileOutputStream     // Catch: java.io.FileNotFoundException -> L5f
            java.io.File r1 = r4.baseName     // Catch: java.io.FileNotFoundException -> L5f
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L5f
        L5e:
            return r0
        L5f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.io.File r3 = r4.baseName
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L73:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.io.File r3 = r4.baseName
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }
}
