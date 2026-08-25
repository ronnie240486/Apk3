package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class MultiInputStream extends java.io.InputStream {

    @javax.annotation.CheckForNull
    private java.io.InputStream in;
    private java.util.Iterator<? extends com.google.common.io.ByteSource> it;

    public MultiInputStream(java.util.Iterator<? extends com.google.common.io.ByteSource> r1) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Iterator r1 = (java.util.Iterator) r1
            r0.it = r1
            r0.advance()
            return
    }

    private void advance() throws java.io.IOException {
            r1 = this;
            r1.close()
            java.util.Iterator<? extends com.google.common.io.ByteSource> r0 = r1.it
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L19
            java.util.Iterator<? extends com.google.common.io.ByteSource> r0 = r1.it
            java.lang.Object r0 = r0.next()
            com.google.common.io.ByteSource r0 = (com.google.common.io.ByteSource) r0
            java.io.InputStream r0 = r0.openStream()
            r1.in = r0
        L19:
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r2.in = r1
            goto Lf
        Lb:
            r0 = move-exception
            r2.in = r1
            throw r0
        Lf:
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
        L0:
            java.io.InputStream r0 = r2.in
            r1 = -1
            if (r0 == 0) goto L10
            int r0 = r0.read()
            if (r0 == r1) goto Lc
            return r0
        Lc:
            r2.advance()
            goto L0
        L10:
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
        L3:
            java.io.InputStream r0 = r2.in
            r1 = -1
            if (r0 == 0) goto L13
            int r0 = r0.read(r3, r4, r5)
            if (r0 == r1) goto Lf
            return r0
        Lf:
            r2.advance()
            goto L3
        L13:
            return r1
    }

    @Override // java.io.InputStream
    public long skip(long r6) throws java.io.IOException {
            r5 = this;
            java.io.InputStream r0 = r5.in
            r1 = 0
            if (r0 == 0) goto L27
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 > 0) goto Lb
            goto L27
        Lb:
            long r3 = r0.skip(r6)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L14
            return r3
        L14:
            int r0 = r5.read()
            r3 = -1
            if (r0 != r3) goto L1c
            return r1
        L1c:
            java.io.InputStream r0 = r5.in
            r1 = 1
            long r6 = r6 - r1
            long r6 = r0.skip(r6)
            long r6 = r6 + r1
            return r6
        L27:
            return r1
    }
}
