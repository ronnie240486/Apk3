package com.google.common.io;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
class MultiReader extends java.io.Reader {

    @javax.annotation.CheckForNull
    private java.io.Reader current;
    private final java.util.Iterator<? extends com.google.common.io.CharSource> it;

    public MultiReader(java.util.Iterator<? extends com.google.common.io.CharSource> r1) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            r0.it = r1
            r0.advance()
            return
    }

    private void advance() throws java.io.IOException {
            r1 = this;
            r1.close()
            java.util.Iterator<? extends com.google.common.io.CharSource> r0 = r1.it
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L19
            java.util.Iterator<? extends com.google.common.io.CharSource> r0 = r1.it
            java.lang.Object r0 = r0.next()
            com.google.common.io.CharSource r0 = (com.google.common.io.CharSource) r0
            java.io.Reader r0 = r0.openStream()
            r1.current = r0
        L19:
            return
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.Reader r0 = r2.current
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r2.current = r1
            goto Lf
        Lb:
            r0 = move-exception
            r2.current = r1
            throw r0
        Lf:
            return
    }

    @Override // java.io.Reader
    public int read(char[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.io.Reader r0 = r2.current
            r1 = -1
            if (r0 != 0) goto L9
            return r1
        L9:
            int r0 = r0.read(r3, r4, r5)
            if (r0 != r1) goto L17
            r2.advance()
            int r3 = r2.read(r3, r4, r5)
            return r3
        L17:
            return r0
    }

    @Override // java.io.Reader
    public boolean ready() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.current
            if (r0 == 0) goto Lc
            boolean r0 = r0.ready()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // java.io.Reader
    public long skip(long r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            java.lang.String r4 = "n is negative"
            com.google.common.base.Preconditions.checkArgument(r3, r4)
            if (r2 <= 0) goto L21
        L10:
            java.io.Reader r2 = r5.current
            if (r2 == 0) goto L21
            long r2 = r2.skip(r6)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1d
            return r2
        L1d:
            r5.advance()
            goto L10
        L21:
            return r0
    }
}
