package kotlin.annotation;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum AnnotationRetention extends java.lang.Enum<kotlin.annotation.AnnotationRetention> {
    private static final /* synthetic */ kotlin.annotation.AnnotationRetention[] $VALUES = null;
    public static final kotlin.annotation.AnnotationRetention BINARY = null;
    public static final kotlin.annotation.AnnotationRetention RUNTIME = null;
    public static final kotlin.annotation.AnnotationRetention SOURCE = null;

    private static final /* synthetic */ kotlin.annotation.AnnotationRetention[] $values() {
            r0 = 3
            kotlin.annotation.AnnotationRetention[] r0 = new kotlin.annotation.AnnotationRetention[r0]
            kotlin.annotation.AnnotationRetention r1 = kotlin.annotation.AnnotationRetention.SOURCE
            r2 = 0
            r0[r2] = r1
            kotlin.annotation.AnnotationRetention r1 = kotlin.annotation.AnnotationRetention.BINARY
            r2 = 1
            r0[r2] = r1
            kotlin.annotation.AnnotationRetention r1 = kotlin.annotation.AnnotationRetention.RUNTIME
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.annotation.AnnotationRetention r0 = new kotlin.annotation.AnnotationRetention
            java.lang.String r1 = "SOURCE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationRetention.SOURCE = r0
            kotlin.annotation.AnnotationRetention r0 = new kotlin.annotation.AnnotationRetention
            java.lang.String r1 = "BINARY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationRetention.BINARY = r0
            kotlin.annotation.AnnotationRetention r0 = new kotlin.annotation.AnnotationRetention
            java.lang.String r1 = "RUNTIME"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationRetention.RUNTIME = r0
            kotlin.annotation.AnnotationRetention[] r0 = $values()
            kotlin.annotation.AnnotationRetention.$VALUES = r0
            return
    }

    private AnnotationRetention(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.annotation.AnnotationRetention valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.annotation.AnnotationRetention> r0 = kotlin.annotation.AnnotationRetention.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.annotation.AnnotationRetention r1 = (kotlin.annotation.AnnotationRetention) r1
            return r1
    }

    public static kotlin.annotation.AnnotationRetention[] values() {
            kotlin.annotation.AnnotationRetention[] r0 = kotlin.annotation.AnnotationRetention.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.annotation.AnnotationRetention[] r0 = (kotlin.annotation.AnnotationRetention[]) r0
            return r0
    }
}
