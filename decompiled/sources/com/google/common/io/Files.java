package com.google.common.io;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class Files {
    private static final com.google.common.graph.SuccessorsFunction<java.io.File> FILE_TREE = null;
    private static final int TEMP_DIR_ATTEMPTS = 10000;



    /* JADX INFO: loaded from: classes.dex */
    public static final class FileByteSink extends com.google.common.io.ByteSink {
        private final java.io.File file;
        private final com.google.common.collect.ImmutableSet<com.google.common.io.FileWriteMode> modes;

        private FileByteSink(java.io.File r1, com.google.common.io.FileWriteMode... r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.io.File r1 = (java.io.File) r1
                r0.file = r1
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.copyOf(r2)
                r0.modes = r1
                return
        }

        public /* synthetic */ FileByteSink(java.io.File r1, com.google.common.io.FileWriteMode[] r2, com.google.common.io.Files.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.io.ByteSink
        public java.io.FileOutputStream openStream() throws java.io.IOException {
                r4 = this;
                java.io.FileOutputStream r0 = new java.io.FileOutputStream
                java.io.File r1 = r4.file
                com.google.common.collect.ImmutableSet<com.google.common.io.FileWriteMode> r2 = r4.modes
                com.google.common.io.FileWriteMode r3 = com.google.common.io.FileWriteMode.APPEND
                boolean r2 = r2.contains(r3)
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.common.io.ByteSink
        public /* bridge */ /* synthetic */ java.io.OutputStream openStream() throws java.io.IOException {
                r1 = this;
                java.io.FileOutputStream r0 = r1.openStream()
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.io.File r0 = r5.file
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.collect.ImmutableSet<com.google.common.io.FileWriteMode> r1 = r5.modes
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 20
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "Files.asByteSink("
                java.lang.String r4 = ", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class FileByteSource extends com.google.common.io.ByteSource {
        private final java.io.File file;

        private FileByteSource(java.io.File r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.io.File r1 = (java.io.File) r1
                r0.file = r1
                return
        }

        public /* synthetic */ FileByteSource(java.io.File r1, com.google.common.io.Files.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.io.ByteSource
        public java.io.FileInputStream openStream() throws java.io.IOException {
                r2 = this;
                java.io.FileInputStream r0 = new java.io.FileInputStream
                java.io.File r1 = r2.file
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public /* bridge */ /* synthetic */ java.io.InputStream openStream() throws java.io.IOException {
                r1 = this;
                java.io.FileInputStream r0 = r1.openStream()
                return r0
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() throws java.io.IOException {
                r4 = this;
                com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
                java.io.FileInputStream r1 = r4.openStream()     // Catch: java.lang.Throwable -> L1e
                java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L1e
                java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch: java.lang.Throwable -> L1e
                java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L1e
                long r2 = r2.size()     // Catch: java.lang.Throwable -> L1e
                byte[] r1 = com.google.common.io.ByteStreams.toByteArray(r1, r2)     // Catch: java.lang.Throwable -> L1e
                r0.close()
                return r1
            L1e:
                r1 = move-exception
                java.lang.RuntimeException r1 = r0.rethrow(r1)     // Catch: java.lang.Throwable -> L24
                throw r1     // Catch: java.lang.Throwable -> L24
            L24:
                r1 = move-exception
                r0.close()
                throw r1
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws java.io.IOException {
                r2 = this;
                java.io.File r0 = r2.file
                boolean r0 = r0.isFile()
                if (r0 == 0) goto Lf
                java.io.File r0 = r2.file
                long r0 = r0.length()
                return r0
            Lf:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
                java.io.File r1 = r2.file
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
                r2 = this;
                java.io.File r0 = r2.file
                boolean r0 = r0.isFile()
                if (r0 == 0) goto L17
                java.io.File r0 = r2.file
                long r0 = r0.length()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
                return r0
            L17:
                com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.io.File r0 = r4.file
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 20
                java.lang.String r2 = "Files.asByteSource("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    public static abstract enum FilePredicate extends java.lang.Enum<com.google.common.io.Files.FilePredicate> implements com.google.common.base.Predicate<java.io.File> {
        private static final /* synthetic */ com.google.common.io.Files.FilePredicate[] $VALUES = null;
        public static final com.google.common.io.Files.FilePredicate IS_DIRECTORY = null;
        public static final com.google.common.io.Files.FilePredicate IS_FILE = null;



        private static /* synthetic */ com.google.common.io.Files.FilePredicate[] $values() {
                r0 = 2
                com.google.common.io.Files$FilePredicate[] r0 = new com.google.common.io.Files.FilePredicate[r0]
                com.google.common.io.Files$FilePredicate r1 = com.google.common.io.Files.FilePredicate.IS_DIRECTORY
                r2 = 0
                r0[r2] = r1
                com.google.common.io.Files$FilePredicate r1 = com.google.common.io.Files.FilePredicate.IS_FILE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.io.Files$FilePredicate$1 r0 = new com.google.common.io.Files$FilePredicate$1
                r0.<init>()
                com.google.common.io.Files.FilePredicate.IS_DIRECTORY = r0
                com.google.common.io.Files$FilePredicate$2 r0 = new com.google.common.io.Files$FilePredicate$2
                r0.<init>()
                com.google.common.io.Files.FilePredicate.IS_FILE = r0
                com.google.common.io.Files$FilePredicate[] r0 = $values()
                com.google.common.io.Files.FilePredicate.$VALUES = r0
                return
        }

        private FilePredicate(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ FilePredicate(java.lang.String r1, int r2, com.google.common.io.Files.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.io.Files.FilePredicate valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.io.Files$FilePredicate> r0 = com.google.common.io.Files.FilePredicate.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.io.Files$FilePredicate r1 = (com.google.common.io.Files.FilePredicate) r1
                return r1
        }

        public static com.google.common.io.Files.FilePredicate[] values() {
                com.google.common.io.Files$FilePredicate[] r0 = com.google.common.io.Files.FilePredicate.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.io.Files$FilePredicate[] r0 = (com.google.common.io.Files.FilePredicate[]) r0
                return r0
        }
    }

    static {
            com.google.common.io.Files$2 r0 = new com.google.common.io.Files$2
            r0.<init>()
            com.google.common.io.Files.FILE_TREE = r0
            return
    }

    private Files() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    public static void append(java.lang.CharSequence r3, java.io.File r4, java.nio.charset.Charset r5) throws java.io.IOException {
            r0 = 1
            com.google.common.io.FileWriteMode[] r0 = new com.google.common.io.FileWriteMode[r0]
            com.google.common.io.FileWriteMode r1 = com.google.common.io.FileWriteMode.APPEND
            r2 = 0
            r0[r2] = r1
            com.google.common.io.CharSink r4 = asCharSink(r4, r5, r0)
            r4.write(r3)
            return
    }

    public static com.google.common.io.ByteSink asByteSink(java.io.File r2, com.google.common.io.FileWriteMode... r3) {
            com.google.common.io.Files$FileByteSink r0 = new com.google.common.io.Files$FileByteSink
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static com.google.common.io.ByteSource asByteSource(java.io.File r2) {
            com.google.common.io.Files$FileByteSource r0 = new com.google.common.io.Files$FileByteSource
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.common.io.CharSink asCharSink(java.io.File r0, java.nio.charset.Charset r1, com.google.common.io.FileWriteMode... r2) {
            com.google.common.io.ByteSink r0 = asByteSink(r0, r2)
            com.google.common.io.CharSink r0 = r0.asCharSink(r1)
            return r0
    }

    public static com.google.common.io.CharSource asCharSource(java.io.File r0, java.nio.charset.Charset r1) {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            com.google.common.io.CharSource r0 = r0.asCharSource(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static void copy(java.io.File r2, java.io.File r3) throws java.io.IOException {
            boolean r0 = r2.equals(r3)
            r0 = r0 ^ 1
            java.lang.String r1 = "Source %s and destination %s must be different"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2, r3)
            com.google.common.io.ByteSource r2 = asByteSource(r2)
            r0 = 0
            com.google.common.io.FileWriteMode[] r0 = new com.google.common.io.FileWriteMode[r0]
            com.google.common.io.ByteSink r3 = asByteSink(r3, r0)
            r2.copyTo(r3)
            return
    }

    @com.google.common.annotations.Beta
    public static void copy(java.io.File r0, java.io.OutputStream r1) throws java.io.IOException {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            r0.copyTo(r1)
            return
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    public static void copy(java.io.File r0, java.nio.charset.Charset r1, java.lang.Appendable r2) throws java.io.IOException {
            com.google.common.io.CharSource r0 = asCharSource(r0, r1)
            r0.copyTo(r2)
            return
    }

    @com.google.common.annotations.Beta
    public static void createParentDirs(java.io.File r3) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.io.File r0 = r3.getCanonicalFile()
            java.io.File r0 = r0.getParentFile()
            if (r0 != 0) goto Le
            return
        Le:
            r0.mkdirs()
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L18
            return
        L18:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            int r1 = r1 + 39
            java.lang.String r2 = "Unable to create parent directories of "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r3)
            throw r0
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    public static java.io.File createTempDir() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "java.io.tmpdir"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 21
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "-"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2 = 0
        L23:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 >= r3) goto L40
            java.io.File r3 = new java.io.File
            r4 = 11
            int r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r4)
            java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r1, r2)
            r3.<init>(r0, r4)
            boolean r4 = r3.mkdir()
            if (r4 == 0) goto L3d
            return r3
        L3d:
            int r2 = r2 + 1
            goto L23
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2 = 66
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
            java.lang.String r3 = "Failed to create directory within 10000 attempts (tried "
            java.lang.String r4 = "0 to "
            java.lang.StringBuilder r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r2, r3, r1, r4, r1)
            r2 = 9999(0x270f, float:1.4012E-41)
            r3 = 41
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    @com.google.common.annotations.Beta
    public static boolean equal(java.io.File r7, java.io.File r8) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Preconditions.checkNotNull(r8)
            if (r7 == r8) goto L34
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto Lf
            goto L34
        Lf:
            long r0 = r7.length()
            long r2 = r8.length()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L27
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L27
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            r7 = 0
            return r7
        L27:
            com.google.common.io.ByteSource r7 = asByteSource(r7)
            com.google.common.io.ByteSource r8 = asByteSource(r8)
            boolean r7 = r7.contentEquals(r8)
            return r7
        L34:
            r7 = 1
            return r7
    }

    @com.google.common.annotations.Beta
    public static com.google.common.graph.Traverser<java.io.File> fileTraverser() {
            com.google.common.graph.SuccessorsFunction<java.io.File> r0 = com.google.common.io.Files.FILE_TREE
            com.google.common.graph.Traverser r0 = com.google.common.graph.Traverser.forTree(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.lang.String getFileExtension(java.lang.String r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r2 = r0.getName()
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto L18
            java.lang.String r2 = ""
            goto L1e
        L18:
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
        L1e:
            return r2
    }

    @com.google.common.annotations.Beta
    public static java.lang.String getNameWithoutExtension(java.lang.String r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r2 = r0.getName()
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto L16
            goto L1b
        L16:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L1b:
            return r2
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    public static com.google.common.hash.HashCode hash(java.io.File r0, com.google.common.hash.HashFunction r1) throws java.io.IOException {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            com.google.common.hash.HashCode r0 = r0.hash(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.base.Predicate<java.io.File> isDirectory() {
            com.google.common.io.Files$FilePredicate r0 = com.google.common.io.Files.FilePredicate.IS_DIRECTORY
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.base.Predicate<java.io.File> isFile() {
            com.google.common.io.Files$FilePredicate r0 = com.google.common.io.Files.FilePredicate.IS_FILE
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.nio.MappedByteBuffer map(java.io.File r1) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r1)
            java.nio.channels.FileChannel$MapMode r0 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            java.nio.MappedByteBuffer r1 = map(r1, r0)
            return r1
    }

    @com.google.common.annotations.Beta
    public static java.nio.MappedByteBuffer map(java.io.File r2, java.nio.channels.FileChannel.MapMode r3) throws java.io.IOException {
            r0 = -1
            java.nio.MappedByteBuffer r2 = mapInternal(r2, r3, r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static java.nio.MappedByteBuffer map(java.io.File r3, java.nio.channels.FileChannel.MapMode r4, long r5) throws java.io.IOException {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "size (%s) may not be negative"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5)
            java.nio.MappedByteBuffer r3 = mapInternal(r3, r4, r5)
            return r3
    }

    private static java.nio.MappedByteBuffer mapInternal(java.io.File r7, java.nio.channels.FileChannel.MapMode r8, long r9) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.io.Closer r0 = com.google.common.io.Closer.create()
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L40
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L40
            if (r8 != r2) goto L13
            java.lang.String r2 = "r"
            goto L16
        L13:
            java.lang.String r2 = "rw"
        L16:
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L40
            java.io.Closeable r7 = r0.register(r1)     // Catch: java.lang.Throwable -> L40
            java.io.RandomAccessFile r7 = (java.io.RandomAccessFile) r7     // Catch: java.lang.Throwable -> L40
            java.nio.channels.FileChannel r7 = r7.getChannel()     // Catch: java.lang.Throwable -> L40
            java.io.Closeable r7 = r0.register(r7)     // Catch: java.lang.Throwable -> L40
            r1 = r7
            java.nio.channels.FileChannel r1 = (java.nio.channels.FileChannel) r1     // Catch: java.lang.Throwable -> L40
            r3 = 0
            r5 = -1
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 != 0) goto L36
            long r9 = r1.size()     // Catch: java.lang.Throwable -> L40
        L36:
            r5 = r9
            r2 = r8
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L40
            r0.close()
            return r7
        L40:
            r7 = move-exception
            java.lang.RuntimeException r7 = r0.rethrow(r7)     // Catch: java.lang.Throwable -> L46
            throw r7     // Catch: java.lang.Throwable -> L46
        L46:
            r7 = move-exception
            r0.close()
            throw r7
    }

    @com.google.common.annotations.Beta
    public static void move(java.io.File r2, java.io.File r3) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r2.equals(r3)
            r0 = r0 ^ 1
            java.lang.String r1 = "Source %s and destination %s must be different"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2, r3)
            boolean r0 = r2.renameTo(r3)
            if (r0 != 0) goto L50
            copy(r2, r3)
            boolean r0 = r2.delete()
            if (r0 != 0) goto L50
            boolean r0 = r3.delete()
            java.lang.String r1 = "Unable to delete "
            if (r0 != 0) goto L3c
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            int r0 = r0 + 17
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r3)
            r2.<init>(r3)
            throw r2
        L3c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r0 = r2.length()
            int r0 = r0 + 17
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r3.<init>(r2)
            throw r3
        L50:
            return
    }

    @com.google.common.annotations.Beta
    public static java.io.BufferedReader newReader(java.io.File r3, java.nio.charset.Charset r4) throws java.io.FileNotFoundException {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.io.BufferedWriter newWriter(java.io.File r3, java.nio.charset.Charset r4) throws java.io.FileNotFoundException {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.io.ParametricNullness
    public static <T> T readBytes(java.io.File r0, com.google.common.io.ByteProcessor<T> r1) throws java.io.IOException {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            java.lang.Object r0 = r0.read(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public static java.lang.String readFirstLine(java.io.File r0, java.nio.charset.Charset r1) throws java.io.IOException {
            com.google.common.io.CharSource r0 = asCharSource(r0, r1)
            java.lang.String r0 = r0.readFirstLine()
            return r0
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.io.ParametricNullness
    public static <T> T readLines(java.io.File r0, java.nio.charset.Charset r1, com.google.common.io.LineProcessor<T> r2) throws java.io.IOException {
            com.google.common.io.CharSource r0 = asCharSource(r0, r1)
            java.lang.Object r0 = r0.readLines(r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.util.List<java.lang.String> readLines(java.io.File r0, java.nio.charset.Charset r1) throws java.io.IOException {
            com.google.common.io.CharSource r0 = asCharSource(r0, r1)
            com.google.common.io.Files$1 r1 = new com.google.common.io.Files$1
            r1.<init>()
            java.lang.Object r0 = r0.readLines(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.lang.String simplifyPath(java.lang.String r7) {
            com.google.common.base.Preconditions.checkNotNull(r7)
            int r0 = r7.length()
            java.lang.String r1 = "."
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 47
            com.google.common.base.Splitter r2 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.Splitter r2 = r2.omitEmptyStrings()
            java.lang.Iterable r2 = r2.split(r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Objects.requireNonNull(r4)
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L23
            java.lang.String r5 = ".."
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L44
            r3.add(r4)
            goto L23
        L44:
            int r4 = r3.size()
            if (r4 <= 0) goto L66
            int r4 = r3.size()
            int r4 = r4 + (-1)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L66
            int r4 = r3.size()
            int r4 = r4 + (-1)
            r3.remove(r4)
            goto L23
        L66:
            r3.add(r5)
            goto L23
        L6a:
            com.google.common.base.Joiner r2 = com.google.common.base.Joiner.on(r0)
            java.lang.String r2 = r2.join(r3)
            r3 = 0
            char r7 = r7.charAt(r3)
            java.lang.String r3 = "/"
            if (r7 != r0) goto L90
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r0 = r7.length()
            if (r0 == 0) goto L8a
            java.lang.String r7 = r3.concat(r7)
            goto L8f
        L8a:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r3)
        L8f:
            r2 = r7
        L90:
            java.lang.String r7 = "/../"
            boolean r7 = r2.startsWith(r7)
            if (r7 == 0) goto L9e
            r7 = 3
            java.lang.String r2 = r2.substring(r7)
            goto L90
        L9e:
            java.lang.String r7 = "/.."
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto La8
            r1 = r3
            goto Lb2
        La8:
            java.lang.String r7 = ""
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto Lb1
            goto Lb2
        Lb1:
            r1 = r2
        Lb2:
            return r1
    }

    @com.google.common.annotations.Beta
    public static byte[] toByteArray(java.io.File r0) throws java.io.IOException {
            com.google.common.io.ByteSource r0 = asByteSource(r0)
            byte[] r0 = r0.read()
            return r0
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    public static java.lang.String toString(java.io.File r0, java.nio.charset.Charset r1) throws java.io.IOException {
            com.google.common.io.CharSource r0 = asCharSource(r0, r1)
            java.lang.String r0 = r0.read()
            return r0
    }

    @com.google.common.annotations.Beta
    public static void touch(java.io.File r3) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r3.createNewFile()
            if (r0 != 0) goto L2a
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = r3.setLastModified(r0)
            if (r0 == 0) goto L14
            goto L2a
        L14:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            int r1 = r1 + 38
            java.lang.String r2 = "Unable to update modification time of "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r3)
            throw r0
        L2a:
            return
    }

    @com.google.common.annotations.Beta
    @java.lang.Deprecated
    public static void write(java.lang.CharSequence r1, java.io.File r2, java.nio.charset.Charset r3) throws java.io.IOException {
            r0 = 0
            com.google.common.io.FileWriteMode[] r0 = new com.google.common.io.FileWriteMode[r0]
            com.google.common.io.CharSink r2 = asCharSink(r2, r3, r0)
            r2.write(r1)
            return
    }

    @com.google.common.annotations.Beta
    public static void write(byte[] r1, java.io.File r2) throws java.io.IOException {
            r0 = 0
            com.google.common.io.FileWriteMode[] r0 = new com.google.common.io.FileWriteMode[r0]
            com.google.common.io.ByteSink r2 = asByteSink(r2, r0)
            r2.write(r1)
            return
    }
}
