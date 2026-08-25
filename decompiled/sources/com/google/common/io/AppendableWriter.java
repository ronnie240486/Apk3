package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
class AppendableWriter extends java.io.Writer {
    private boolean closed;
    private final java.lang.Appendable target;

    public AppendableWriter(java.lang.Appendable r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Appendable r1 = (java.lang.Appendable) r1
            r0.target = r1
            return
    }

    private void checkNotClosed() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Cannot write to a closed writer."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char r2) throws java.io.IOException {
            r1 = this;
            r1.checkNotClosed()
            java.lang.Appendable r0 = r1.target
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence r2) throws java.io.IOException {
            r1 = this;
            r1.checkNotClosed()
            java.lang.Appendable r0 = r1.target
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkNotClosed()
            java.lang.Appendable r0 = r1.target
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(@javax.annotation.CheckForNull java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(@javax.annotation.CheckForNull java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.closed = r0
            java.lang.Appendable r0 = r2.target
            boolean r1 = r0 instanceof java.io.Closeable
            if (r1 == 0) goto Le
            java.io.Closeable r0 = (java.io.Closeable) r0
            r0.close()
        Le:
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            r2.checkNotClosed()
            java.lang.Appendable r0 = r2.target
            boolean r1 = r0 instanceof java.io.Flushable
            if (r1 == 0) goto Le
            java.io.Flushable r0 = (java.io.Flushable) r0
            r0.flush()
        Le:
            return
    }

    @Override // java.io.Writer
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            r1.checkNotClosed()
            java.lang.Appendable r0 = r1.target
            char r2 = (char) r2
            r0.append(r2)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            r1.checkNotClosed()
            java.lang.Appendable r0 = r1.target
            r0.append(r2)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            r1.checkNotClosed()
            java.lang.Appendable r0 = r1.target
            int r4 = r4 + r3
            r0.append(r2, r3, r4)
            return
    }

    @Override // java.io.Writer
    public void write(char[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            r2.checkNotClosed()
            java.lang.Appendable r0 = r2.target
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r4, r5)
            r0.append(r1)
            return
    }
}
