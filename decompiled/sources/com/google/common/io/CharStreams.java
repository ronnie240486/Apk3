package com.google.common.io;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    public static final class NullWriter extends java.io.Writer {
        private static final com.google.common.io.CharStreams.NullWriter INSTANCE = null;

        static {
                com.google.common.io.CharStreams$NullWriter r0 = new com.google.common.io.CharStreams$NullWriter
                r0.<init>()
                com.google.common.io.CharStreams.NullWriter.INSTANCE = r0
                return
        }

        private NullWriter() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ com.google.common.io.CharStreams.NullWriter access$000() {
                com.google.common.io.CharStreams$NullWriter r0 = com.google.common.io.CharStreams.NullWriter.INSTANCE
                return r0
        }

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(char r1) {
                r0 = this;
                return r0
        }

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence r1) {
                r0 = this;
                return r0
        }

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence r1, int r2, int r3) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 4
                goto L8
            L4:
                int r1 = r1.length()
            L8:
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r1)
                return r0
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
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharStreams.nullWriter()"
                return r0
        }

        @Override // java.io.Writer
        public void write(int r1) {
                r0 = this;
                return
        }

        @Override // java.io.Writer
        public void write(java.lang.String r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                return
        }

        @Override // java.io.Writer
        public void write(java.lang.String r1, int r2, int r3) {
                r0 = this;
                int r3 = r3 + r2
                int r1 = r1.length()
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r1)
                return
        }

        @Override // java.io.Writer
        public void write(char[] r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                return
        }

        @Override // java.io.Writer
        public void write(char[] r1, int r2, int r3) {
                r0 = this;
                int r3 = r3 + r2
                int r1 = r1.length
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r1)
                return
        }
    }

    private CharStreams() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.Beta
    public static java.io.Writer asWriter(java.lang.Appendable r1) {
            boolean r0 = r1 instanceof java.io.Writer
            if (r0 == 0) goto L7
            java.io.Writer r1 = (java.io.Writer) r1
            return r1
        L7:
            com.google.common.io.AppendableWriter r0 = new com.google.common.io.AppendableWriter
            r0.<init>(r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long copy(java.lang.Readable r6, java.lang.Appendable r7) throws java.io.IOException {
            boolean r0 = r6 instanceof java.io.Reader
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L32
            boolean r0 = r7 instanceof java.lang.StringBuilder
            if (r0 == 0) goto L14
            java.io.Reader r6 = (java.io.Reader) r6
            java.lang.StringBuilder r7 = (java.lang.StringBuilder) r7
            long r6 = copyReaderToBuilder(r6, r7)
            return r6
        L14:
            java.io.Reader r6 = (java.io.Reader) r6
            java.io.Writer r7 = asWriter(r7)
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Preconditions.checkNotNull(r7)
            r0 = 2048(0x800, float:2.87E-42)
            char[] r0 = new char[r0]
        L24:
            int r4 = r6.read(r0)
            if (r4 == r1) goto L31
            r5 = 0
            r7.write(r0, r5, r4)
            long r4 = (long) r4
            long r2 = r2 + r4
            goto L24
        L31:
            return r2
        L32:
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.nio.CharBuffer r0 = createBuffer()
        L3c:
            int r4 = r6.read(r0)
            if (r4 == r1) goto L52
            r0.flip()
            r7.append(r0)
            int r4 = r0.remaining()
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.clear()
            goto L3c
        L52:
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long copyReaderToBuilder(java.io.Reader r5, java.lang.StringBuilder r6) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.base.Preconditions.checkNotNull(r6)
            r0 = 2048(0x800, float:2.87E-42)
            char[] r0 = new char[r0]
            r1 = 0
        Lc:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r6.append(r0, r4, r3)
            long r3 = (long) r3
            long r1 = r1 + r3
            goto Lc
        L1a:
            return r1
    }

    public static java.nio.CharBuffer createBuffer() {
            r0 = 2048(0x800, float:2.87E-42)
            java.nio.CharBuffer r0 = java.nio.CharBuffer.allocate(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public static long exhaust(java.lang.Readable r8) throws java.io.IOException {
            java.nio.CharBuffer r0 = createBuffer()
            r1 = 0
        L6:
            int r3 = r8.read(r0)
            long r3 = (long) r3
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L16
            long r1 = r1 + r3
            r0.clear()
            goto L6
        L16:
            return r1
    }

    @com.google.common.annotations.Beta
    public static java.io.Writer nullWriter() {
            com.google.common.io.CharStreams$NullWriter r0 = com.google.common.io.CharStreams.NullWriter.access$000()
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.io.ParametricNullness
    public static <T> T readLines(java.lang.Readable r1, com.google.common.io.LineProcessor<T> r2) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.io.LineReader r0 = new com.google.common.io.LineReader
            r0.<init>(r1)
        Lb:
            java.lang.String r1 = r0.readLine()
            if (r1 == 0) goto L17
            boolean r1 = r2.processLine(r1)
            if (r1 != 0) goto Lb
        L17:
            java.lang.Object r1 = r2.getResult()
            return r1
    }

    @com.google.common.annotations.Beta
    public static java.util.List<java.lang.String> readLines(java.lang.Readable r2) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.io.LineReader r1 = new com.google.common.io.LineReader
            r1.<init>(r2)
        La:
            java.lang.String r2 = r1.readLine()
            if (r2 == 0) goto L14
            r0.add(r2)
            goto La
        L14:
            return r0
    }

    @com.google.common.annotations.Beta
    public static void skipFully(java.io.Reader r5, long r6) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r5)
        L3:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L19
            long r2 = r5.skip(r6)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L13
            long r6 = r6 - r2
            goto L3
        L13:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L19:
            return
    }

    public static java.lang.String toString(java.lang.Readable r0) throws java.io.IOException {
            java.lang.StringBuilder r0 = toStringBuilder(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.StringBuilder toStringBuilder(java.lang.Readable r2) throws java.io.IOException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2 instanceof java.io.Reader
            if (r1 == 0) goto Lf
            java.io.Reader r2 = (java.io.Reader) r2
            copyReaderToBuilder(r2, r0)
            goto L12
        Lf:
            copy(r2, r0)
        L12:
            return r0
    }
}
