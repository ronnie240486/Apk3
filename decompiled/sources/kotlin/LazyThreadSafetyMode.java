package kotlin;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum LazyThreadSafetyMode extends java.lang.Enum<kotlin.LazyThreadSafetyMode> {
    private static final /* synthetic */ kotlin.LazyThreadSafetyMode[] $VALUES = null;
    public static final kotlin.LazyThreadSafetyMode NONE = null;
    public static final kotlin.LazyThreadSafetyMode PUBLICATION = null;
    public static final kotlin.LazyThreadSafetyMode SYNCHRONIZED = null;

    private static final /* synthetic */ kotlin.LazyThreadSafetyMode[] $values() {
            r0 = 3
            kotlin.LazyThreadSafetyMode[] r0 = new kotlin.LazyThreadSafetyMode[r0]
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED
            r2 = 0
            r0[r2] = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION
            r2 = 1
            r0[r2] = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.LazyThreadSafetyMode r0 = new kotlin.LazyThreadSafetyMode
            java.lang.String r1 = "SYNCHRONIZED"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.LazyThreadSafetyMode.SYNCHRONIZED = r0
            kotlin.LazyThreadSafetyMode r0 = new kotlin.LazyThreadSafetyMode
            java.lang.String r1 = "PUBLICATION"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.LazyThreadSafetyMode.PUBLICATION = r0
            kotlin.LazyThreadSafetyMode r0 = new kotlin.LazyThreadSafetyMode
            java.lang.String r1 = "NONE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.LazyThreadSafetyMode.NONE = r0
            kotlin.LazyThreadSafetyMode[] r0 = $values()
            kotlin.LazyThreadSafetyMode.$VALUES = r0
            return
    }

    private LazyThreadSafetyMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.LazyThreadSafetyMode valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.LazyThreadSafetyMode> r0 = kotlin.LazyThreadSafetyMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.LazyThreadSafetyMode r1 = (kotlin.LazyThreadSafetyMode) r1
            return r1
    }

    public static kotlin.LazyThreadSafetyMode[] values() {
            kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.LazyThreadSafetyMode[] r0 = (kotlin.LazyThreadSafetyMode[]) r0
            return r0
    }
}
