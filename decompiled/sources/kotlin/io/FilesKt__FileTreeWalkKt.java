package kotlin.io;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"walk", "Lkotlin/io/FileTreeWalk;", "Ljava/io/File;", "direction", "Lkotlin/io/FileWalkDirection;", "walkBottomUp", "walkTopDown", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FileTreeWalkKt extends kotlin.io.FilesKt__FileReadWriteKt {
    public FilesKt__FileTreeWalkKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.FileTreeWalk walk(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull kotlin.io.FileWalkDirection r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "direction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.io.FileTreeWalk r0 = new kotlin.io.FileTreeWalk
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.io.FileTreeWalk walk$default(java.io.File r0, kotlin.io.FileWalkDirection r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.TOP_DOWN
        L6:
            kotlin.io.FileTreeWalk r0 = walk(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.FileTreeWalk walkBottomUp(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.io.FileWalkDirection r0 = kotlin.io.FileWalkDirection.BOTTOM_UP
            kotlin.io.FileTreeWalk r1 = walk(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.FileTreeWalk walkTopDown(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.io.FileWalkDirection r0 = kotlin.io.FileWalkDirection.TOP_DOWN
            kotlin.io.FileTreeWalk r1 = walk(r1, r0)
            return r1
    }
}
