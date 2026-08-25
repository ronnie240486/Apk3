package kotlin.io;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum OnErrorAction extends java.lang.Enum<kotlin.io.OnErrorAction> {
    private static final /* synthetic */ kotlin.io.OnErrorAction[] $VALUES = null;
    public static final kotlin.io.OnErrorAction SKIP = null;
    public static final kotlin.io.OnErrorAction TERMINATE = null;

    private static final /* synthetic */ kotlin.io.OnErrorAction[] $values() {
            r0 = 2
            kotlin.io.OnErrorAction[] r0 = new kotlin.io.OnErrorAction[r0]
            kotlin.io.OnErrorAction r1 = kotlin.io.OnErrorAction.SKIP
            r2 = 0
            r0[r2] = r1
            kotlin.io.OnErrorAction r1 = kotlin.io.OnErrorAction.TERMINATE
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.io.OnErrorAction r0 = new kotlin.io.OnErrorAction
            java.lang.String r1 = "SKIP"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.OnErrorAction.SKIP = r0
            kotlin.io.OnErrorAction r0 = new kotlin.io.OnErrorAction
            java.lang.String r1 = "TERMINATE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.OnErrorAction.TERMINATE = r0
            kotlin.io.OnErrorAction[] r0 = $values()
            kotlin.io.OnErrorAction.$VALUES = r0
            return
    }

    private OnErrorAction(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.io.OnErrorAction valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.OnErrorAction> r0 = kotlin.io.OnErrorAction.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.OnErrorAction r1 = (kotlin.io.OnErrorAction) r1
            return r1
    }

    public static kotlin.io.OnErrorAction[] values() {
            kotlin.io.OnErrorAction[] r0 = kotlin.io.OnErrorAction.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.OnErrorAction[] r0 = (kotlin.io.OnErrorAction[]) r0
            return r0
    }
}
