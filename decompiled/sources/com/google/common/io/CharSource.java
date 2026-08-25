package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class CharSource {

    /* JADX INFO: loaded from: classes2.dex */
    public final class AsByteSource extends com.google.common.io.ByteSource {
        public final java.nio.charset.Charset charset;
        public final /* synthetic */ com.google.common.io.CharSource this$0;

        public AsByteSource(com.google.common.io.CharSource r1, java.nio.charset.Charset r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
                r0.charset = r1
                return
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset r2) {
                r1 = this;
                java.nio.charset.Charset r0 = r1.charset
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lb
                com.google.common.io.CharSource r2 = r1.this$0
                return r2
            Lb:
                com.google.common.io.CharSource r2 = super.asCharSource(r2)
                return r2
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
                r3 = this;
                com.google.common.io.ReaderInputStream r0 = new com.google.common.io.ReaderInputStream
                com.google.common.io.CharSource r1 = r3.this$0
                java.io.Reader r1 = r1.openStream()
                java.nio.charset.Charset r2 = r3.charset
                r0.<init>(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.io.CharSource r0 = r5.this$0
                java.lang.String r0 = r0.toString()
                java.nio.charset.Charset r1 = r5.charset
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2 = 15
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = ".asByteSource("
                java.lang.String r4 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    public static class CharSequenceCharSource extends com.google.common.io.CharSource {
        private static final com.google.common.base.Splitter LINE_SPLITTER = null;
        public final java.lang.CharSequence seq;


        static {
                java.lang.String r0 = "\r\n|\n|\r"
                com.google.common.base.Splitter r0 = com.google.common.base.Splitter.onPattern(r0)
                com.google.common.io.CharSource.CharSequenceCharSource.LINE_SPLITTER = r0
                return
        }

        public CharSequenceCharSource(java.lang.CharSequence r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.seq = r1
                return
        }

        public static /* synthetic */ com.google.common.base.Splitter access$100() {
                com.google.common.base.Splitter r0 = com.google.common.io.CharSource.CharSequenceCharSource.LINE_SPLITTER
                return r0
        }

        private java.util.Iterator<java.lang.String> linesIterator() {
                r1 = this;
                com.google.common.io.CharSource$CharSequenceCharSource$1 r0 = new com.google.common.io.CharSource$CharSequenceCharSource$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
                r1 = this;
                java.lang.CharSequence r0 = r1.seq
                int r0 = r0.length()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // com.google.common.io.CharSource
        public long length() {
                r2 = this;
                java.lang.CharSequence r0 = r2.seq
                int r0 = r0.length()
                long r0 = (long) r0
                return r0
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
                r2 = this;
                java.lang.CharSequence r0 = r2.seq
                int r0 = r0.length()
                long r0 = (long) r0
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
                return r0
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() {
                r2 = this;
                com.google.common.io.CharSequenceReader r0 = new com.google.common.io.CharSequenceReader
                java.lang.CharSequence r1 = r2.seq
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.io.CharSource
        public java.lang.String read() {
                r1 = this;
                java.lang.CharSequence r0 = r1.seq
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.google.common.io.CharSource
        @javax.annotation.CheckForNull
        public java.lang.String readFirstLine() {
                r2 = this;
                java.util.Iterator r0 = r2.linesIterator()
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L11
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.collect.ImmutableList<java.lang.String> readLines() {
                r1 = this;
                java.util.Iterator r0 = r1.linesIterator()
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
                return r0
        }

        @Override // com.google.common.io.CharSource
        @com.google.common.io.ParametricNullness
        public <T> T readLines(com.google.common.io.LineProcessor<T> r3) throws java.io.IOException {
                r2 = this;
                java.util.Iterator r0 = r2.linesIterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r3.processLine(r1)
                if (r1 != 0) goto L4
            L16:
                java.lang.Object r3 = r3.getResult()
                return r3
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.CharSequence r0 = r4.seq
                r1 = 30
                java.lang.String r2 = "..."
                java.lang.String r0 = com.google.common.base.Ascii.truncate(r0, r1, r2)
                r1 = 17
                int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
                java.lang.String r2 = "CharSource.wrap("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ConcatenatedCharSource extends com.google.common.io.CharSource {
        private final java.lang.Iterable<? extends com.google.common.io.CharSource> sources;

        public ConcatenatedCharSource(java.lang.Iterable<? extends com.google.common.io.CharSource> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r0.sources = r1
                return
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws java.io.IOException {
                r2 = this;
                java.lang.Iterable<? extends com.google.common.io.CharSource> r0 = r2.sources
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                com.google.common.io.CharSource r1 = (com.google.common.io.CharSource) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L6
                r0 = 0
                return r0
            L1a:
                r0 = 1
                return r0
        }

        @Override // com.google.common.io.CharSource
        public long length() throws java.io.IOException {
                r5 = this;
                java.lang.Iterable<? extends com.google.common.io.CharSource> r0 = r5.sources
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L8:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r0.next()
                com.google.common.io.CharSource r3 = (com.google.common.io.CharSource) r3
                long r3 = r3.length()
                long r1 = r1 + r3
                goto L8
            L1a:
                return r1
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
                r5 = this;
                java.lang.Iterable<? extends com.google.common.io.CharSource> r0 = r5.sources
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L8:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L2f
                java.lang.Object r3 = r0.next()
                com.google.common.io.CharSource r3 = (com.google.common.io.CharSource) r3
                com.google.common.base.Optional r3 = r3.lengthIfKnown()
                boolean r4 = r3.isPresent()
                if (r4 != 0) goto L23
                com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
                return r0
            L23:
                java.lang.Object r3 = r3.get()
                java.lang.Long r3 = (java.lang.Long) r3
                long r3 = r3.longValue()
                long r1 = r1 + r3
                goto L8
            L2f:
                java.lang.Long r0 = java.lang.Long.valueOf(r1)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
                return r0
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() throws java.io.IOException {
                r2 = this;
                com.google.common.io.MultiReader r0 = new com.google.common.io.MultiReader
                java.lang.Iterable<? extends com.google.common.io.CharSource> r1 = r2.sources
                java.util.Iterator r1 = r1.iterator()
                r0.<init>(r1)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Iterable<? extends com.google.common.io.CharSource> r0 = r4.sources
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 19
                java.lang.String r2 = "CharSource.concat("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class EmptyCharSource extends com.google.common.io.CharSource.StringCharSource {
        private static final com.google.common.io.CharSource.EmptyCharSource INSTANCE = null;

        static {
                com.google.common.io.CharSource$EmptyCharSource r0 = new com.google.common.io.CharSource$EmptyCharSource
                r0.<init>()
                com.google.common.io.CharSource.EmptyCharSource.INSTANCE = r0
                return
        }

        private EmptyCharSource() {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r0)
                return
        }

        public static /* synthetic */ com.google.common.io.CharSource.EmptyCharSource access$000() {
                com.google.common.io.CharSource$EmptyCharSource r0 = com.google.common.io.CharSource.EmptyCharSource.INSTANCE
                return r0
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "CharSource.empty()"
                return r0
        }
    }

    public static class StringCharSource extends com.google.common.io.CharSource.CharSequenceCharSource {
        public StringCharSource(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(com.google.common.io.CharSink r4) throws java.io.IOException {
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
                java.io.Writer r4 = r4.openStream()     // Catch: java.lang.Throwable -> L23
                java.io.Closeable r4 = r0.register(r4)     // Catch: java.lang.Throwable -> L23
                java.io.Writer r4 = (java.io.Writer) r4     // Catch: java.lang.Throwable -> L23
                java.lang.CharSequence r1 = r3.seq     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23
                r4.write(r1)     // Catch: java.lang.Throwable -> L23
                java.lang.CharSequence r4 = r3.seq     // Catch: java.lang.Throwable -> L23
                int r4 = r4.length()     // Catch: java.lang.Throwable -> L23
                long r1 = (long) r4
                r0.close()
                return r1
            L23:
                r4 = move-exception
                java.lang.RuntimeException r4 = r0.rethrow(r4)     // Catch: java.lang.Throwable -> L29
                throw r4     // Catch: java.lang.Throwable -> L29
            L29:
                r4 = move-exception
                r0.close()
                throw r4
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(java.lang.Appendable r3) throws java.io.IOException {
                r2 = this;
                java.lang.CharSequence r0 = r2.seq
                r3.append(r0)
                java.lang.CharSequence r3 = r2.seq
                int r3 = r3.length()
                long r0 = (long) r3
                return r0
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.io.CharSource
        public java.io.Reader openStream() {
                r2 = this;
                java.io.StringReader r0 = new java.io.StringReader
                java.lang.CharSequence r1 = r2.seq
                java.lang.String r1 = (java.lang.String) r1
                r0.<init>(r1)
                return r0
        }
    }

    public CharSource() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.io.CharSource concat(java.lang.Iterable<? extends com.google.common.io.CharSource> r1) {
            com.google.common.io.CharSource$ConcatenatedCharSource r0 = new com.google.common.io.CharSource$ConcatenatedCharSource
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.io.CharSource concat(java.util.Iterator<? extends com.google.common.io.CharSource> r0) {
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            com.google.common.io.CharSource r0 = concat(r0)
            return r0
    }

    public static com.google.common.io.CharSource concat(com.google.common.io.CharSource... r0) {
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            com.google.common.io.CharSource r0 = concat(r0)
            return r0
    }

    private long countBySkipping(java.io.Reader r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            r2 = r0
        L3:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r4 = r8.skip(r4)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L12
            long r2 = r2 + r4
            goto L3
        L12:
            return r2
    }

    public static com.google.common.io.CharSource empty() {
            com.google.common.io.CharSource$EmptyCharSource r0 = com.google.common.io.CharSource.EmptyCharSource.access$000()
            return r0
    }

    public static com.google.common.io.CharSource wrap(java.lang.CharSequence r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Lc
            com.google.common.io.CharSource$StringCharSource r0 = new com.google.common.io.CharSource$StringCharSource
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            goto L11
        Lc:
            com.google.common.io.CharSource$CharSequenceCharSource r0 = new com.google.common.io.CharSource$CharSequenceCharSource
            r0.<init>(r1)
        L11:
            return r0
    }

    @com.google.common.annotations.Beta
    public com.google.common.io.ByteSource asByteSource(java.nio.charset.Charset r2) {
            r1 = this;
            com.google.common.io.CharSource$AsByteSource r0 = new com.google.common.io.CharSource$AsByteSource
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long copyTo(com.google.common.io.CharSink r4) throws java.io.IOException {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Reader r1 = r3.openStream()     // Catch: java.lang.Throwable -> L23
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L23
            java.io.Reader r1 = (java.io.Reader) r1     // Catch: java.lang.Throwable -> L23
            java.io.Writer r4 = r4.openStream()     // Catch: java.lang.Throwable -> L23
            java.io.Closeable r4 = r0.register(r4)     // Catch: java.lang.Throwable -> L23
            java.io.Writer r4 = (java.io.Writer) r4     // Catch: java.lang.Throwable -> L23
            long r1 = com.google.common.io.CharStreams.copy(r1, r4)     // Catch: java.lang.Throwable -> L23
            r0.close()
            return r1
        L23:
            r4 = move-exception
            java.lang.RuntimeException r4 = r0.rethrow(r4)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L29:
            r4 = move-exception
            r0.close()
            throw r4
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long copyTo(java.lang.Appendable r4) throws java.io.IOException {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Reader r1 = r3.openStream()     // Catch: java.lang.Throwable -> L19
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L19
            java.io.Reader r1 = (java.io.Reader) r1     // Catch: java.lang.Throwable -> L19
            long r1 = com.google.common.io.CharStreams.copy(r1, r4)     // Catch: java.lang.Throwable -> L19
            r0.close()
            return r1
        L19:
            r4 = move-exception
            java.lang.RuntimeException r4 = r0.rethrow(r4)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L1f:
            r4 = move-exception
            r0.close()
            throw r4
    }

    public boolean isEmpty() throws java.io.IOException {
            r7 = this;
            com.google.common.base.Optional r0 = r7.lengthIfKnown()
            boolean r1 = r0.isPresent()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
        L1f:
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Reader r1 = r7.openStream()     // Catch: java.lang.Throwable -> L3a
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L3a
            java.io.Reader r1 = (java.io.Reader) r1     // Catch: java.lang.Throwable -> L3a
            int r1 = r1.read()     // Catch: java.lang.Throwable -> L3a
            r4 = -1
            if (r1 != r4) goto L35
            goto L36
        L35:
            r2 = 0
        L36:
            r0.close()
            return r2
        L3a:
            r1 = move-exception
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L40
            throw r1     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @com.google.common.annotations.Beta
    public long length() throws java.io.IOException {
            r3 = this;
            com.google.common.base.Optional r0 = r3.lengthIfKnown()
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L15
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L15:
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Reader r1 = r3.openStream()     // Catch: java.lang.Throwable -> L2b
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L2b
            java.io.Reader r1 = (java.io.Reader) r1     // Catch: java.lang.Throwable -> L2b
            long r1 = r3.countBySkipping(r1)     // Catch: java.lang.Throwable -> L2b
            r0.close()
            return r1
        L2b:
            r1 = move-exception
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L31
            throw r1     // Catch: java.lang.Throwable -> L31
        L31:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @com.google.common.annotations.Beta
    public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
            r1 = this;
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            return r0
    }

    public java.io.BufferedReader openBufferedStream() throws java.io.IOException {
            r2 = this;
            java.io.Reader r0 = r2.openStream()
            boolean r1 = r0 instanceof java.io.BufferedReader
            if (r1 == 0) goto Lb
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L11
        Lb:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r1.<init>(r0)
            r0 = r1
        L11:
            return r0
    }

    public abstract java.io.Reader openStream() throws java.io.IOException;

    public java.lang.String read() throws java.io.IOException {
            r2 = this;
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Reader r1 = r2.openStream()     // Catch: java.lang.Throwable -> L16
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L16
            java.io.Reader r1 = (java.io.Reader) r1     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = com.google.common.io.CharStreams.toString(r1)     // Catch: java.lang.Throwable -> L16
            r0.close()
            return r1
        L16:
            r1 = move-exception
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @javax.annotation.CheckForNull
    public java.lang.String readFirstLine() throws java.io.IOException {
            r2 = this;
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.BufferedReader r1 = r2.openBufferedStream()     // Catch: java.lang.Throwable -> L16
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L16
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.readLine()     // Catch: java.lang.Throwable -> L16
            r0.close()
            return r1
        L16:
            r1 = move-exception
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public com.google.common.collect.ImmutableList<java.lang.String> readLines() throws java.io.IOException {
            r4 = this;
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.BufferedReader r1 = r4.openBufferedStream()     // Catch: java.lang.Throwable -> L24
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L24
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r2 = com.google.common.collect.Lists.newArrayList()     // Catch: java.lang.Throwable -> L24
        L12:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L1c
            r2.add(r3)     // Catch: java.lang.Throwable -> L24
            goto L12
        L1c:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r2)     // Catch: java.lang.Throwable -> L24
            r0.close()
            return r1
        L24:
            r1 = move-exception
            java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L2a:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @com.google.common.annotations.Beta
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.io.ParametricNullness
    public <T> T readLines(com.google.common.io.LineProcessor<T> r3) throws java.io.IOException {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.Reader r1 = r2.openStream()     // Catch: java.lang.Throwable -> L19
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L19
            java.io.Reader r1 = (java.io.Reader) r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = com.google.common.io.CharStreams.readLines(r1, r3)     // Catch: java.lang.Throwable -> L19
            r0.close()
            return r3
        L19:
            r3 = move-exception
            java.lang.RuntimeException r3 = r0.rethrow(r3)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L1f:
            r3 = move-exception
            r0.close()
            throw r3
    }
}
