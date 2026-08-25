package kotlin.io;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileTreeWalk implements kotlin.sequences.Sequence<java.io.File> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.io.FileWalkDirection direction;
    private final int maxDepth;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> onEnter;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> onFail;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> onLeave;

    @org.jetbrains.annotations.NotNull
    private final java.io.File start;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class DirectoryState extends kotlin.io.FileTreeWalk.WalkState {
        public DirectoryState(@org.jetbrains.annotations.NotNull java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "rootDir"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "root", "Lkotlin/io/FileTreeWalk$DirectoryState;", "directoryState", "gotoNext", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "state", "Ljava/util/ArrayDeque;", "<init>", "(Lkotlin/io/FileTreeWalk;)V", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    public final class FileTreeWalkIterator extends kotlin.collections.AbstractIterator<java.io.File> {

        @org.jetbrains.annotations.NotNull
        private final java.util.ArrayDeque<kotlin.io.FileTreeWalk.WalkState> state;
        public final /* synthetic */ kotlin.io.FileTreeWalk this$0;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "failed", "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public final class BottomUpDirectoryState extends kotlin.io.FileTreeWalk.DirectoryState {
            private boolean failed;
            private int fileIndex;

            @org.jetbrains.annotations.Nullable
            private java.io.File[] fileList;
            private boolean rootVisited;
            public final /* synthetic */ kotlin.io.FileTreeWalk.FileTreeWalkIterator this$0;

            public BottomUpDirectoryState(@org.jetbrains.annotations.NotNull kotlin.io.FileTreeWalk.FileTreeWalkIterator r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    r1.this$0 = r2
                    r1.<init>(r3)
                    return
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            @org.jetbrains.annotations.Nullable
            public java.io.File step() {
                    r11 = this;
                    boolean r0 = r11.failed
                    r1 = 0
                    r2 = 1
                    if (r0 != 0) goto L57
                    java.io.File[] r0 = r11.fileList
                    if (r0 != 0) goto L57
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r11.this$0
                    kotlin.io.FileTreeWalk r0 = r0.this$0
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnEnter$p(r0)
                    r3 = 0
                    if (r0 == 0) goto L26
                    java.io.File r4 = r11.getRoot()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L26
                    r3 = 1
                L26:
                    if (r3 == 0) goto L29
                    return r1
                L29:
                    java.io.File r0 = r11.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r11.fileList = r0
                    if (r0 != 0) goto L57
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r11.this$0
                    kotlin.io.FileTreeWalk r0 = r0.this$0
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.FileTreeWalk.access$getOnFail$p(r0)
                    if (r0 == 0) goto L55
                    java.io.File r3 = r11.getRoot()
                    kotlin.io.AccessDeniedException r10 = new kotlin.io.AccessDeniedException
                    java.io.File r5 = r11.getRoot()
                    r6 = 0
                    r8 = 2
                    r9 = 0
                    java.lang.String r7 = "Cannot list files in a directory"
                    r4 = r10
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.invoke(r3, r10)
                L55:
                    r11.failed = r2
                L57:
                    java.io.File[] r0 = r11.fileList
                    if (r0 == 0) goto L71
                    int r3 = r11.fileIndex
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r3 >= r0) goto L71
                    java.io.File[] r0 = r11.fileList
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r11.fileIndex
                    int r2 = r1 + 1
                    r11.fileIndex = r2
                    r0 = r0[r1]
                    return r0
                L71:
                    boolean r0 = r11.rootVisited
                    if (r0 != 0) goto L7c
                    r11.rootVisited = r2
                    java.io.File r0 = r11.getRoot()
                    return r0
                L7c:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r11.this$0
                    kotlin.io.FileTreeWalk r0 = r0.this$0
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L8d
                    java.io.File r2 = r11.getRoot()
                    r0.invoke(r2)
                L8d:
                    return r1
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public final class SingleFileState extends kotlin.io.FileTreeWalk.WalkState {
            private boolean visited;

            public SingleFileState(@org.jetbrains.annotations.NotNull kotlin.io.FileTreeWalk.FileTreeWalkIterator r1, java.io.File r2) {
                    r0 = this;
                    java.lang.String r1 = "rootFile"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            @org.jetbrains.annotations.Nullable
            public java.io.File step() {
                    r1 = this;
                    boolean r0 = r1.visited
                    if (r0 == 0) goto L6
                    r0 = 0
                    return r0
                L6:
                    r0 = 1
                    r1.visited = r0
                    java.io.File r0 = r1.getRoot()
                    return r0
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        /* JADX INFO: loaded from: classes.dex */
        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public final class TopDownDirectoryState extends kotlin.io.FileTreeWalk.DirectoryState {
            private int fileIndex;

            @org.jetbrains.annotations.Nullable
            private java.io.File[] fileList;
            private boolean rootVisited;
            public final /* synthetic */ kotlin.io.FileTreeWalk.FileTreeWalkIterator this$0;

            public TopDownDirectoryState(@org.jetbrains.annotations.NotNull kotlin.io.FileTreeWalk.FileTreeWalkIterator r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    r1.this$0 = r2
                    r1.<init>(r3)
                    return
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            @org.jetbrains.annotations.Nullable
            public java.io.File step() {
                    r10 = this;
                    boolean r0 = r10.rootVisited
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = r0.this$0
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnEnter$p(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.getRoot()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = 1
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.rootVisited = r3
                    java.io.File r0 = r10.getRoot()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L4b
                    int r2 = r10.fileIndex
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = r0.this$0
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.fileList
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r10.fileList = r0
                    if (r0 != 0) goto L7b
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = r0.this$0
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.FileTreeWalk.access$getOnFail$p(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.getRoot()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.getRoot()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = r0.this$0
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.fileList
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r10.fileIndex
                    int r2 = r1 + 1
                    r10.fileIndex = r2
                    r0 = r0[r1]
                    return r0
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlin.io.FileWalkDirection[] r0 = kotlin.io.FileWalkDirection.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.TOP_DOWN
                    int r1 = r1.ordinal()
                    r2 = 1
                    r0[r1] = r2
                    kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.BOTTOM_UP
                    int r1 = r1.ordinal()
                    r2 = 2
                    r0[r1] = r2
                    kotlin.io.FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        public FileTreeWalkIterator(kotlin.io.FileTreeWalk r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r2.state = r0
                java.io.File r1 = kotlin.io.FileTreeWalk.access$getStart$p(r3)
                boolean r1 = r1.isDirectory()
                if (r1 == 0) goto L22
                java.io.File r3 = kotlin.io.FileTreeWalk.access$getStart$p(r3)
                kotlin.io.FileTreeWalk$DirectoryState r3 = r2.directoryState(r3)
                r0.push(r3)
                goto L3c
            L22:
                java.io.File r1 = kotlin.io.FileTreeWalk.access$getStart$p(r3)
                boolean r1 = r1.isFile()
                if (r1 == 0) goto L39
                kotlin.io.FileTreeWalk$FileTreeWalkIterator$SingleFileState r1 = new kotlin.io.FileTreeWalk$FileTreeWalkIterator$SingleFileState
                java.io.File r3 = kotlin.io.FileTreeWalk.access$getStart$p(r3)
                r1.<init>(r2, r3)
                r0.push(r1)
                goto L3c
            L39:
                r2.done()
            L3c:
                return
        }

        private final kotlin.io.FileTreeWalk.DirectoryState directoryState(java.io.File r3) {
                r2 = this;
                kotlin.io.FileTreeWalk r0 = r2.this$0
                kotlin.io.FileWalkDirection r0 = kotlin.io.FileTreeWalk.access$getDirection$p(r0)
                int[] r1 = kotlin.io.FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L20
                r1 = 2
                if (r0 != r1) goto L1a
                kotlin.io.FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState r0 = new kotlin.io.FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState
                r0.<init>(r2, r3)
                goto L25
            L1a:
                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                r3.<init>()
                throw r3
            L20:
                kotlin.io.FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState r0 = new kotlin.io.FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState
                r0.<init>(r2, r3)
            L25:
                return r0
        }

        private final java.io.File gotoNext() {
                r3 = this;
            L0:
                java.util.ArrayDeque<kotlin.io.FileTreeWalk$WalkState> r0 = r3.state
                java.lang.Object r0 = r0.peek()
                kotlin.io.FileTreeWalk$WalkState r0 = (kotlin.io.FileTreeWalk.WalkState) r0
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                java.io.File r1 = r0.step()
                if (r1 != 0) goto L18
                java.util.ArrayDeque<kotlin.io.FileTreeWalk$WalkState> r0 = r3.state
                r0.pop()
                goto L0
            L18:
                java.io.File r0 = r0.getRoot()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 != 0) goto L41
                boolean r0 = r1.isDirectory()
                if (r0 == 0) goto L41
                java.util.ArrayDeque<kotlin.io.FileTreeWalk$WalkState> r0 = r3.state
                int r0 = r0.size()
                kotlin.io.FileTreeWalk r2 = r3.this$0
                int r2 = kotlin.io.FileTreeWalk.access$getMaxDepth$p(r2)
                if (r0 < r2) goto L37
                goto L41
            L37:
                java.util.ArrayDeque<kotlin.io.FileTreeWalk$WalkState> r0 = r3.state
                kotlin.io.FileTreeWalk$DirectoryState r1 = r3.directoryState(r1)
                r0.push(r1)
                goto L0
            L41:
                return r1
        }

        @Override // kotlin.collections.AbstractIterator
        public final void computeNext() {
                r1 = this;
                java.io.File r0 = r1.gotoNext()
                if (r0 == 0) goto La
                r1.setNext(r0)
                goto Ld
            La:
                r1.done()
            Ld:
                return
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class WalkState {

        @org.jetbrains.annotations.NotNull
        private final java.io.File root;

        public WalkState(@org.jetbrains.annotations.NotNull java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "root"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.root = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.io.File getRoot() {
                r1 = this;
                java.io.File r0 = r1.root
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public abstract java.io.File step();
    }

    public FileTreeWalk(@org.jetbrains.annotations.NotNull java.io.File r9, @org.jetbrains.annotations.NotNull kotlin.io.FileWalkDirection r10) {
            r8 = this;
            java.lang.String r0 = "start"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "direction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    public /* synthetic */ FileTreeWalk(java.io.File r1, kotlin.io.FileWalkDirection r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            kotlin.io.FileWalkDirection r2 = kotlin.io.FileWalkDirection.TOP_DOWN
        L6:
            r0.<init>(r1, r2)
            return
    }

    private FileTreeWalk(java.io.File r1, kotlin.io.FileWalkDirection r2, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> r3, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> r4, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit> r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.start = r1
            r0.direction = r2
            r0.onEnter = r3
            r0.onLeave = r4
            r0.onFail = r5
            r0.maxDepth = r6
            return
    }

    public static final /* synthetic */ kotlin.io.FileWalkDirection access$getDirection$p(kotlin.io.FileTreeWalk r0) {
            kotlin.io.FileWalkDirection r0 = r0.direction
            return r0
    }

    public static final /* synthetic */ int access$getMaxDepth$p(kotlin.io.FileTreeWalk r0) {
            int r0 = r0.maxDepth
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getOnEnter$p(kotlin.io.FileTreeWalk r0) {
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r0 = r0.onEnter
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$getOnFail$p(kotlin.io.FileTreeWalk r0) {
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> r0 = r0.onFail
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getOnLeave$p(kotlin.io.FileTreeWalk r0) {
            kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r0 = r0.onLeave
            return r0
    }

    public static final /* synthetic */ java.io.File access$getStart$p(kotlin.io.FileTreeWalk r0) {
            java.io.File r0 = r0.start
            return r0
    }

    @Override // kotlin.sequences.Sequence
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.io.File> iterator() {
            r1 = this;
            kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = new kotlin.io.FileTreeWalk$FileTreeWalkIterator
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.FileTreeWalk maxDepth(int r9) {
            r8 = this;
            if (r9 <= 0) goto L14
            kotlin.io.FileTreeWalk r7 = new kotlin.io.FileTreeWalk
            java.io.File r1 = r8.start
            kotlin.io.FileWalkDirection r2 = r8.direction
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r3 = r8.onEnter
            kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r4 = r8.onLeave
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> r5 = r8.onFail
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "depth must be positive, but was "
            r1.append(r2)
            r1.append(r9)
            r9 = 46
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.FileTreeWalk onEnter(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.io.FileTreeWalk r0 = new kotlin.io.FileTreeWalk
            java.io.File r2 = r8.start
            kotlin.io.FileWalkDirection r3 = r8.direction
            kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r5 = r8.onLeave
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> r6 = r8.onFail
            int r7 = r8.maxDepth
            r1 = r0
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.FileTreeWalk onFail(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.io.FileTreeWalk r0 = new kotlin.io.FileTreeWalk
            java.io.File r2 = r8.start
            kotlin.io.FileWalkDirection r3 = r8.direction
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r4 = r8.onEnter
            kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit> r5 = r8.onLeave
            int r7 = r8.maxDepth
            r1 = r0
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.io.FileTreeWalk onLeave(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.io.FileTreeWalk r0 = new kotlin.io.FileTreeWalk
            java.io.File r2 = r8.start
            kotlin.io.FileWalkDirection r3 = r8.direction
            kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean> r4 = r8.onEnter
            kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit> r6 = r8.onFail
            int r7 = r8.maxDepth
            r1 = r0
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }
}
