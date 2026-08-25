package kotlin.annotation;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum AnnotationTarget extends java.lang.Enum<kotlin.annotation.AnnotationTarget> {
    private static final /* synthetic */ kotlin.annotation.AnnotationTarget[] $VALUES = null;
    public static final kotlin.annotation.AnnotationTarget ANNOTATION_CLASS = null;
    public static final kotlin.annotation.AnnotationTarget CLASS = null;
    public static final kotlin.annotation.AnnotationTarget CONSTRUCTOR = null;
    public static final kotlin.annotation.AnnotationTarget EXPRESSION = null;
    public static final kotlin.annotation.AnnotationTarget FIELD = null;
    public static final kotlin.annotation.AnnotationTarget FILE = null;
    public static final kotlin.annotation.AnnotationTarget FUNCTION = null;
    public static final kotlin.annotation.AnnotationTarget LOCAL_VARIABLE = null;
    public static final kotlin.annotation.AnnotationTarget PROPERTY = null;
    public static final kotlin.annotation.AnnotationTarget PROPERTY_GETTER = null;
    public static final kotlin.annotation.AnnotationTarget PROPERTY_SETTER = null;
    public static final kotlin.annotation.AnnotationTarget TYPE = null;

    @kotlin.SinceKotlin(version = "1.1")
    public static final kotlin.annotation.AnnotationTarget TYPEALIAS = null;
    public static final kotlin.annotation.AnnotationTarget TYPE_PARAMETER = null;
    public static final kotlin.annotation.AnnotationTarget VALUE_PARAMETER = null;

    private static final /* synthetic */ kotlin.annotation.AnnotationTarget[] $values() {
            r0 = 15
            kotlin.annotation.AnnotationTarget[] r0 = new kotlin.annotation.AnnotationTarget[r0]
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.CLASS
            r2 = 0
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS
            r2 = 1
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.TYPE_PARAMETER
            r2 = 2
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.PROPERTY
            r2 = 3
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.FIELD
            r2 = 4
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE
            r2 = 5
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.VALUE_PARAMETER
            r2 = 6
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.CONSTRUCTOR
            r2 = 7
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.FUNCTION
            r2 = 8
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.PROPERTY_GETTER
            r2 = 9
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.PROPERTY_SETTER
            r2 = 10
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.TYPE
            r2 = 11
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.EXPRESSION
            r2 = 12
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.FILE
            r2 = 13
            r0[r2] = r1
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.TYPEALIAS
            r2 = 14
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "CLASS"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.CLASS = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "ANNOTATION_CLASS"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "TYPE_PARAMETER"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.TYPE_PARAMETER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "PROPERTY"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.PROPERTY = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "FIELD"
            r2 = 4
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.FIELD = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "LOCAL_VARIABLE"
            r2 = 5
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "VALUE_PARAMETER"
            r2 = 6
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.VALUE_PARAMETER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "CONSTRUCTOR"
            r2 = 7
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.CONSTRUCTOR = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "FUNCTION"
            r2 = 8
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.FUNCTION = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "PROPERTY_GETTER"
            r2 = 9
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.PROPERTY_GETTER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "PROPERTY_SETTER"
            r2 = 10
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.PROPERTY_SETTER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "TYPE"
            r2 = 11
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.TYPE = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "EXPRESSION"
            r2 = 12
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.EXPRESSION = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "FILE"
            r2 = 13
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.FILE = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "TYPEALIAS"
            r2 = 14
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.TYPEALIAS = r0
            kotlin.annotation.AnnotationTarget[] r0 = $values()
            kotlin.annotation.AnnotationTarget.$VALUES = r0
            return
    }

    private AnnotationTarget(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.annotation.AnnotationTarget valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.annotation.AnnotationTarget> r0 = kotlin.annotation.AnnotationTarget.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.annotation.AnnotationTarget r1 = (kotlin.annotation.AnnotationTarget) r1
            return r1
    }

    public static kotlin.annotation.AnnotationTarget[] values() {
            kotlin.annotation.AnnotationTarget[] r0 = kotlin.annotation.AnnotationTarget.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.annotation.AnnotationTarget[] r0 = (kotlin.annotation.AnnotationTarget[]) r0
            return r0
    }
}
