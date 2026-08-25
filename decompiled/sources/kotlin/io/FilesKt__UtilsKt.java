package kotlin.io;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {



    public FilesKt__UtilsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final boolean copyRecursively(@org.jetbrains.annotations.NotNull java.io.File r11, @org.jetbrains.annotations.NotNull java.io.File r12, boolean r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.OnErrorAction r12 = kotlin.io.OnErrorAction.TERMINATE
            if (r11 == r12) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
        L2e:
            kotlin.io.FileTreeWalk r0 = kotlin.io.FilesKt__FileTreeWalkKt.walkTopDown(r11)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch: kotlin.io.TerminateException -> Ldc
            r3.<init>(r14)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.FileTreeWalk r0 = r0.onFail(r3)     // Catch: kotlin.io.TerminateException -> Ldc
            java.util.Iterator r0 = r0.iterator()     // Catch: kotlin.io.TerminateException -> Ldc
        L3f:
            boolean r3 = r0.hasNext()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 == 0) goto Ldb
            java.lang.Object r3 = r0.next()     // Catch: kotlin.io.TerminateException -> Ldc
            java.io.File r3 = (java.io.File) r3     // Catch: kotlin.io.TerminateException -> Ldc
            boolean r4 = r3.exists()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto L66
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch: kotlin.io.TerminateException -> Ldc
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 != r4) goto L3f
            return r2
        L66:
            java.lang.String r4 = toRelativeString(r3, r11)     // Catch: kotlin.io.TerminateException -> Ldc
            java.io.File r5 = new java.io.File     // Catch: kotlin.io.TerminateException -> Ldc
            r5.<init>(r12, r4)     // Catch: kotlin.io.TerminateException -> Ldc
            boolean r4 = r5.exists()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto Lac
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto L81
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto Lac
        L81:
            if (r13 != 0) goto L85
        L83:
            r4 = 1
            goto L9a
        L85:
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto L92
            boolean r4 = deleteRecursively(r5)     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L92:
            boolean r4 = r5.delete()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L99:
            r4 = 0
        L9a:
            if (r4 == 0) goto Lac
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Lac:
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto Lb6
            r5.mkdirs()     // Catch: kotlin.io.TerminateException -> Ldc
            goto L3f
        Lb6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = copyTo$default(r4, r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Ldc
            long r4 = r4.length()     // Catch: kotlin.io.TerminateException -> Ldc
            long r6 = r3.length()     // Catch: kotlin.io.TerminateException -> Ldc
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L3f
            java.io.IOException r4 = new java.io.IOException     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Ldb:
            return r1
        Ldc:
            return r2
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File r0, java.io.File r1, boolean r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            kotlin.io.FilesKt__UtilsKt$copyRecursively$1 r3 = kotlin.io.FilesKt__UtilsKt.AnonymousClass1.INSTANCE
        Lb:
            boolean r0 = copyRecursively(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File copyTo(@org.jetbrains.annotations.NotNull java.io.File r6, @org.jetbrains.annotations.NotNull java.io.File r7, boolean r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L70
            boolean r0 = r7.exists()
            if (r0 == 0) goto L2f
            if (r8 == 0) goto L27
            boolean r8 = r7.delete()
            if (r8 == 0) goto L1f
            goto L2f
        L1f:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L27:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L2f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L44
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L3c
            goto L61
        L3c:
            kotlin.io.FileSystemException r8 = new kotlin.io.FileSystemException
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L44:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L4d
            r8.mkdirs()
        L4d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L69
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L69
            kotlin.io.ByteStreamsKt.copyTo(r8, r6, r9)     // Catch: java.lang.Throwable -> L62
            r9 = 0
            kotlin.io.CloseableKt.closeFinally(r6, r9)     // Catch: java.lang.Throwable -> L69
            kotlin.io.CloseableKt.closeFinally(r8, r9)
        L61:
            return r7
        L62:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L64
        L64:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r7)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L69:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L6b
        L6b:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r6)
            throw r7
        L70:
            kotlin.io.NoSuchFileException r7 = new kotlin.io.NoSuchFileException
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File r0, java.io.File r1, boolean r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 8192(0x2000, float:1.148E-41)
        Lb:
            java.io.File r0 = copyTo(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @org.jetbrains.annotations.NotNull
    public static final java.io.File createTempDir(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.io.File r3) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            r1.delete()
            boolean r2 = r1.mkdir()
            if (r2 == 0) goto L18
            java.lang.String r2 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        L18:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Unable to create temporary directory "
            r3.append(r0)
            r3.append(r1)
            r1 = 46
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = createTempDir(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @org.jetbrains.annotations.NotNull
    public static final java.io.File createTempFile(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.io.File r3) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            java.lang.String r2 = "createTempFile(prefix, suffix, directory)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = createTempFile(r1, r2, r3)
            return r1
    }

    public static final boolean deleteRecursively(@org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FileTreeWalk r4 = kotlin.io.FilesKt__FileTreeWalkKt.walkBottomUp(r4)
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        Le:
            r1 = 1
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r4.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.delete()
            if (r3 != 0) goto L27
            boolean r2 = r2.exists()
            if (r2 != 0) goto L2a
        L27:
            if (r1 == 0) goto L2a
            goto Le
        L2a:
            r1 = 0
            goto Lf
        L2c:
            return r1
    }

    public static final boolean endsWith(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r3)
            kotlin.io.FilePathComponents r1 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r4)
            boolean r2 = r1.isRooted()
            if (r2 == 0) goto L1d
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            return r3
        L1d:
            int r3 = r0.getSize()
            int r4 = r1.getSize()
            int r3 = r3 - r4
            if (r3 >= 0) goto L2a
            r3 = 0
            goto L3e
        L2a:
            java.util.List r4 = r0.getSegments()
            int r0 = r0.getSize()
            java.util.List r3 = r4.subList(r3, r0)
            java.util.List r4 = r1.getSegments()
            boolean r3 = r3.equals(r4)
        L3e:
            return r3
    }

    public static final boolean endsWith(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = endsWith(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getExtension(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r1 = kotlin.text.StringsKt.substringAfterLast(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getInvariantSeparatorsPath(@org.jetbrains.annotations.NotNull java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            char r0 = java.io.File.separatorChar
            r1 = 47
            java.lang.String r2 = "path"
            java.lang.String r3 = r3.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            if (r0 == r1) goto L1a
            char r0 = java.io.File.separatorChar
            java.lang.String r3 = kotlin.text.StringsKt.replace$default(r3, r0, r1)
        L1a:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getNameWithoutExtension(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r1 = kotlin.text.StringsKt.substringBeforeLast$default(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File normalize(@org.jetbrains.annotations.NotNull java.io.File r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.io.FilePathComponents r7 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r7)
            java.io.File r0 = r7.getRoot()
            java.util.List r7 = r7.getSegments()
            java.util.List r1 = normalize$FilesKt__UtilsKt(r7)
            java.lang.String r2 = java.io.File.separator
            java.lang.String r7 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 62
            java.lang.String r7 = kotlin.collections.CollectionsKt.joinToString$default(r1, r2, r3, r4, r5, r6)
            java.io.File r7 = resolve(r0, r7)
            return r7
    }

    private static final java.util.List<java.io.File> normalize$FilesKt__UtilsKt(java.util.List<? extends java.io.File> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r4.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "."
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 != 0) goto Ld
            java.lang.String r3 = ".."
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L51
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L4d
            java.lang.Object r2 = kotlin.collections.CollectionsKt.last(r0)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L4d
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            goto Ld
        L4d:
            r0.add(r1)
            goto Ld
        L51:
            r0.add(r1)
            goto Ld
        L55:
            return r0
    }

    private static final kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt(kotlin.io.FilePathComponents r2) {
            kotlin.io.FilePathComponents r0 = new kotlin.io.FilePathComponents
            java.io.File r1 = r2.getRoot()
            java.util.List r2 = r2.getSegments()
            java.util.List r2 = normalize$FilesKt__UtilsKt(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File relativeTo(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = toRelativeString(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.io.File relativeToOrNull(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r1 = toRelativeStringOrNull$FilesKt__UtilsKt(r1, r2)
            if (r1 == 0) goto L16
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File relativeToOrSelf(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = toRelativeStringOrNull$FilesKt__UtilsKt(r1, r2)
            if (r2 == 0) goto L15
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
        L15:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File resolve(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = kotlin.io.FilesKt__FilePathComponentsKt.isRooted(r3)
            if (r0 == 0) goto L11
            return r3
        L11:
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "this.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 != 0) goto L44
            char r0 = java.io.File.separatorChar
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r2, r0)
            if (r0 == 0) goto L2e
            goto L44
        L2e:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            char r1 = java.io.File.separatorChar
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            goto L58
        L44:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
        L58:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File resolve(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = resolve(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File resolveSibling(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.io.FilePathComponents r2 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r2)
            int r0 = r2.getSize()
            if (r0 != 0) goto L1c
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".."
            r0.<init>(r1)
            goto L27
        L1c:
            r0 = 0
            int r1 = r2.getSize()
            int r1 = r1 + (-1)
            java.io.File r0 = r2.subPath(r0, r1)
        L27:
            java.io.File r2 = r2.getRoot()
            java.io.File r2 = resolve(r2, r0)
            java.io.File r2 = resolve(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File resolveSibling(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = resolveSibling(r1, r0)
            return r1
    }

    public static final boolean startsWith(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FilePathComponents r3 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r3)
            kotlin.io.FilePathComponents r4 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r4)
            java.io.File r0 = r3.getRoot()
            java.io.File r1 = r4.getRoot()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto L22
            return r1
        L22:
            int r0 = r3.getSize()
            int r2 = r4.getSize()
            if (r0 >= r2) goto L2d
            goto L41
        L2d:
            java.util.List r3 = r3.getSegments()
            int r0 = r4.getSize()
            java.util.List r3 = r3.subList(r1, r0)
            java.util.List r4 = r4.getSegments()
            boolean r1 = r3.equals(r4)
        L41:
            return r1
    }

    public static final boolean startsWith(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = startsWith(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toRelativeString(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "this and base files have different roots: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            r1.append(r4)
            r3 = 46
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final java.lang.String toRelativeStringOrNull$FilesKt__UtilsKt(java.io.File r8, java.io.File r9) {
            kotlin.io.FilePathComponents r8 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r8)
            kotlin.io.FilePathComponents r8 = normalize$FilesKt__UtilsKt(r8)
            kotlin.io.FilePathComponents r9 = kotlin.io.FilesKt__FilePathComponentsKt.toComponents(r9)
            kotlin.io.FilePathComponents r9 = normalize$FilesKt__UtilsKt(r9)
            java.io.File r0 = r8.getRoot()
            java.io.File r1 = r9.getRoot()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto L20
            return r1
        L20:
            int r0 = r9.getSize()
            int r2 = r8.getSize()
            r3 = 0
            int r4 = java.lang.Math.min(r2, r0)
        L2d:
            if (r3 >= r4) goto L48
            java.util.List r5 = r8.getSegments()
            java.lang.Object r5 = r5.get(r3)
            java.util.List r6 = r9.getSegments()
            java.lang.Object r6 = r6.get(r3)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L48
            int r3 = r3 + 1
            goto L2d
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r0 + (-1)
            if (r3 > r5) goto L77
        L51:
            java.util.List r6 = r9.getSegments()
            java.lang.Object r6 = r6.get(r5)
            java.io.File r6 = (java.io.File) r6
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = ".."
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L68
            return r1
        L68:
            r4.append(r7)
            if (r5 == r3) goto L72
            char r6 = java.io.File.separatorChar
            r4.append(r6)
        L72:
            if (r5 == r3) goto L77
            int r5 = r5 + (-1)
            goto L51
        L77:
            if (r3 >= r2) goto L92
            if (r3 >= r0) goto L80
            char r9 = java.io.File.separatorChar
            r4.append(r9)
        L80:
            java.util.List r8 = r8.getSegments()
            java.util.List r8 = kotlin.collections.CollectionsKt.drop(r8, r3)
            java.lang.String r9 = java.io.File.separator
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            kotlin.collections.CollectionsKt.joinTo$default(r8, r4, r9)
        L92:
            java.lang.String r8 = r4.toString()
            return r8
    }
}
