package kotlin.internal;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.2")
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum RequireKotlinVersionKind extends java.lang.Enum<kotlin.internal.RequireKotlinVersionKind> {
    private static final /* synthetic */ kotlin.internal.RequireKotlinVersionKind[] $VALUES = null;
    public static final kotlin.internal.RequireKotlinVersionKind API_VERSION = null;
    public static final kotlin.internal.RequireKotlinVersionKind COMPILER_VERSION = null;
    public static final kotlin.internal.RequireKotlinVersionKind LANGUAGE_VERSION = null;

    private static final /* synthetic */ kotlin.internal.RequireKotlinVersionKind[] $values() {
            r0 = 3
            kotlin.internal.RequireKotlinVersionKind[] r0 = new kotlin.internal.RequireKotlinVersionKind[r0]
            kotlin.internal.RequireKotlinVersionKind r1 = kotlin.internal.RequireKotlinVersionKind.LANGUAGE_VERSION
            r2 = 0
            r0[r2] = r1
            kotlin.internal.RequireKotlinVersionKind r1 = kotlin.internal.RequireKotlinVersionKind.COMPILER_VERSION
            r2 = 1
            r0[r2] = r1
            kotlin.internal.RequireKotlinVersionKind r1 = kotlin.internal.RequireKotlinVersionKind.API_VERSION
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.internal.RequireKotlinVersionKind r0 = new kotlin.internal.RequireKotlinVersionKind
            java.lang.String r1 = "LANGUAGE_VERSION"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.internal.RequireKotlinVersionKind.LANGUAGE_VERSION = r0
            kotlin.internal.RequireKotlinVersionKind r0 = new kotlin.internal.RequireKotlinVersionKind
            java.lang.String r1 = "COMPILER_VERSION"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.internal.RequireKotlinVersionKind.COMPILER_VERSION = r0
            kotlin.internal.RequireKotlinVersionKind r0 = new kotlin.internal.RequireKotlinVersionKind
            java.lang.String r1 = "API_VERSION"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.internal.RequireKotlinVersionKind.API_VERSION = r0
            kotlin.internal.RequireKotlinVersionKind[] r0 = $values()
            kotlin.internal.RequireKotlinVersionKind.$VALUES = r0
            return
    }

    private RequireKotlinVersionKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.internal.RequireKotlinVersionKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.internal.RequireKotlinVersionKind> r0 = kotlin.internal.RequireKotlinVersionKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.internal.RequireKotlinVersionKind r1 = (kotlin.internal.RequireKotlinVersionKind) r1
            return r1
    }

    public static kotlin.internal.RequireKotlinVersionKind[] values() {
            kotlin.internal.RequireKotlinVersionKind[] r0 = kotlin.internal.RequireKotlinVersionKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.internal.RequireKotlinVersionKind[] r0 = (kotlin.internal.RequireKotlinVersionKind[]) r0
            return r0
    }
}
