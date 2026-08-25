package kotlin.io;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum FileWalkDirection extends java.lang.Enum<kotlin.io.FileWalkDirection> {
    private static final /* synthetic */ kotlin.io.FileWalkDirection[] $VALUES = null;
    public static final kotlin.io.FileWalkDirection BOTTOM_UP = null;
    public static final kotlin.io.FileWalkDirection TOP_DOWN = null;

    private static final /* synthetic */ kotlin.io.FileWalkDirection[] $values() {
            r0 = 2
            kotlin.io.FileWalkDirection[] r0 = new kotlin.io.FileWalkDirection[r0]
            kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.TOP_DOWN
            r2 = 0
            r0[r2] = r1
            kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.BOTTOM_UP
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.io.FileWalkDirection r0 = new kotlin.io.FileWalkDirection
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.FileWalkDirection.TOP_DOWN = r0
            kotlin.io.FileWalkDirection r0 = new kotlin.io.FileWalkDirection
            java.lang.String r1 = "BOTTOM_UP"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.FileWalkDirection.BOTTOM_UP = r0
            kotlin.io.FileWalkDirection[] r0 = $values()
            kotlin.io.FileWalkDirection.$VALUES = r0
            return
    }

    private FileWalkDirection(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.io.FileWalkDirection valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.FileWalkDirection> r0 = kotlin.io.FileWalkDirection.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.FileWalkDirection r1 = (kotlin.io.FileWalkDirection) r1
            return r1
    }

    public static kotlin.io.FileWalkDirection[] values() {
            kotlin.io.FileWalkDirection[] r0 = kotlin.io.FileWalkDirection.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.FileWalkDirection[] r0 = (kotlin.io.FileWalkDirection[]) r0
            return r0
    }
}
