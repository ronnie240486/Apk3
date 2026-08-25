package com.google.common.io;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class CharSink {
    public CharSink() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.io.Writer openBufferedStream() throws java.io.IOException {
            r2 = this;
            java.io.Writer r0 = r2.openStream()
            boolean r1 = r0 instanceof java.io.BufferedWriter
            if (r1 == 0) goto Lb
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
            goto L11
        Lb:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r1.<init>(r0)
            r0 = r1
        L11:
            return r0
    }

    public abstract java.io.Writer openStream() throws java.io.IOException;

    public void write(java.lang.CharSequence r3) throws java.io.IOException {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Writer r1 = r2.openStream()     // Catch: java.lang.Throwable -> L1b
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L1b
            java.io.Writer r1 = (java.io.Writer) r1     // Catch: java.lang.Throwable -> L1b
            r1.append(r3)     // Catch: java.lang.Throwable -> L1b
            r1.flush()     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r3 = move-exception
            java.lang.RuntimeException r3 = r0.rethrow(r3)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L21
        L21:
            r3 = move-exception
            r0.close()
            throw r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long writeFrom(java.lang.Readable r5) throws java.io.IOException {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Writer r1 = r4.openStream()     // Catch: java.lang.Throwable -> L1c
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L1c
            java.io.Writer r1 = (java.io.Writer) r1     // Catch: java.lang.Throwable -> L1c
            long r2 = com.google.common.io.CharStreams.copy(r5, r1)     // Catch: java.lang.Throwable -> L1c
            r1.flush()     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return r2
        L1c:
            r5 = move-exception
            java.lang.RuntimeException r5 = r0.rethrow(r5)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L22:
            r5 = move-exception
            r0.close()
            throw r5
    }

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1.writeLines(r2, r0)
            return
    }

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> r4, java.lang.String r5) throws java.io.IOException {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Writer r1 = r3.openBufferedStream()     // Catch: java.lang.Throwable -> L33
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L33
            java.io.Writer r1 = (java.io.Writer) r1     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L33
        L18:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L33
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Throwable -> L33
            java.io.Writer r2 = r1.append(r2)     // Catch: java.lang.Throwable -> L33
            r2.append(r5)     // Catch: java.lang.Throwable -> L33
            goto L18
        L2c:
            r1.flush()     // Catch: java.lang.Throwable -> L33
            r0.close()
            return
        L33:
            r4 = move-exception
            java.lang.RuntimeException r4 = r0.rethrow(r4)     // Catch: java.lang.Throwable -> L39
            throw r4     // Catch: java.lang.Throwable -> L39
        L39:
            r4 = move-exception
            r0.close()
            throw r4
    }
}
