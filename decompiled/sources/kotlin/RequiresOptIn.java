package kotlin;

/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u0099F0\u0001¨\u0006\t"}, d2 = {"Lkotlin/RequiresOptIn;", "", "message", "", "level", "Lkotlin/RequiresOptIn$Level;", "()Lkotlin/RequiresOptIn$Level;", "()Ljava/lang/String;", "Level", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
public @interface RequiresOptIn {

    /* JADX INFO: compiled from: OptIn.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/RequiresOptIn$Level;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final enum Level extends java.lang.Enum<kotlin.RequiresOptIn.Level> {
        private static final /* synthetic */ kotlin.RequiresOptIn.Level[] $VALUES = null;
        public static final kotlin.RequiresOptIn.Level ERROR = null;
        public static final kotlin.RequiresOptIn.Level WARNING = null;

        private static final /* synthetic */ kotlin.RequiresOptIn.Level[] $values() {
                r0 = 2
                kotlin.RequiresOptIn$Level[] r0 = new kotlin.RequiresOptIn.Level[r0]
                kotlin.RequiresOptIn$Level r1 = kotlin.RequiresOptIn.Level.WARNING
                r2 = 0
                r0[r2] = r1
                kotlin.RequiresOptIn$Level r1 = kotlin.RequiresOptIn.Level.ERROR
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.RequiresOptIn$Level r0 = new kotlin.RequiresOptIn$Level
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.RequiresOptIn.Level.WARNING = r0
                kotlin.RequiresOptIn$Level r0 = new kotlin.RequiresOptIn$Level
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.RequiresOptIn.Level.ERROR = r0
                kotlin.RequiresOptIn$Level[] r0 = $values()
                kotlin.RequiresOptIn.Level.$VALUES = r0
                return
        }

        private Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.RequiresOptIn.Level valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.RequiresOptIn$Level> r0 = kotlin.RequiresOptIn.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.RequiresOptIn$Level r1 = (kotlin.RequiresOptIn.Level) r1
                return r1
        }

        public static kotlin.RequiresOptIn.Level[] values() {
                kotlin.RequiresOptIn$Level[] r0 = kotlin.RequiresOptIn.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.RequiresOptIn$Level[] r0 = (kotlin.RequiresOptIn.Level[]) r0
                return r0
        }
    }

    kotlin.RequiresOptIn.Level level() default kotlin.RequiresOptIn.Level.ERROR;

    java.lang.String message() default "";
}
