package kotlin.io.path;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class PathRelativizer {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.path.PathRelativizer INSTANCE = null;
    private static final java.nio.file.Path emptyPath = null;
    private static final java.nio.file.Path parentPath = null;

    static {
            kotlin.io.path.PathRelativizer r0 = new kotlin.io.path.PathRelativizer
            r0.<init>()
            kotlin.io.path.PathRelativizer.INSTANCE = r0
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = ""
            java.nio.file.Path r1 = java.nio.file.Paths.get(r2, r1)
            kotlin.io.path.PathRelativizer.emptyPath = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = ".."
            java.nio.file.Path r0 = java.nio.file.Paths.get(r1, r0)
            kotlin.io.path.PathRelativizer.parentPath = r0
            return
    }

    private PathRelativizer() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.file.Path tryRelativeTo(@org.jetbrains.annotations.NotNull java.nio.file.Path r7, @org.jetbrains.annotations.NotNull java.nio.file.Path r8) {
            r6 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.nio.file.Path r8 = r8.normalize()
            java.nio.file.Path r7 = r7.normalize()
            java.nio.file.Path r0 = r8.relativize(r7)
            int r1 = r8.getNameCount()
            int r2 = r7.getNameCount()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = 0
        L24:
            if (r3 >= r1) goto L47
            java.nio.file.Path r4 = r8.getName(r3)
            java.nio.file.Path r5 = kotlin.io.path.PathRelativizer.parentPath
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L47
            java.nio.file.Path r4 = r7.getName(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L3f
            int r3 = r3 + 1
            goto L24
        L3f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unable to compute relative path"
            r7.<init>(r8)
            throw r7
        L47:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r1 != 0) goto L56
            java.nio.file.Path r1 = kotlin.io.path.PathRelativizer.emptyPath
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            if (r8 == 0) goto L56
            goto L8a
        L56:
            java.lang.String r7 = r0.toString()
            java.nio.file.FileSystem r8 = r0.getFileSystem()
            java.lang.String r8 = r8.getSeparator()
            java.lang.String r1 = "rn.fileSystem.separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            boolean r8 = kotlin.text.StringsKt.endsWith$default(r7, r8)
            if (r8 == 0) goto L89
            java.nio.file.FileSystem r8 = r0.getFileSystem()
            java.nio.file.FileSystem r0 = r0.getFileSystem()
            java.lang.String r0 = r0.getSeparator()
            int r0 = r0.length()
            java.lang.String r7 = kotlin.text.StringsKt.dropLast(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.nio.file.Path r7 = r8.getPath(r7, r0)
            goto L8a
        L89:
            r7 = r0
        L8a:
            java.lang.String r8 = "r"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
    }
}
