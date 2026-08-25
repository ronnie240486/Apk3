package androidx.annotation.experimental;

/* JADX INFO: compiled from: Experimental.kt */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/annotation/experimental/Experimental;", "", "level", "Landroidx/annotation/experimental/Experimental$Level;", "()Landroidx/annotation/experimental/Experimental$Level;", "Level", "annotation-experimental_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @kotlin.ReplaceWith(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
public @interface Experimental {

    /* JADX INFO: compiled from: Experimental.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/annotation/experimental/Experimental$Level;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final enum Level extends java.lang.Enum<androidx.annotation.experimental.Experimental.Level> {
        private static final /* synthetic */ androidx.annotation.experimental.Experimental.Level[] $VALUES = null;
        public static final androidx.annotation.experimental.Experimental.Level ERROR = null;
        public static final androidx.annotation.experimental.Experimental.Level WARNING = null;

        private static final /* synthetic */ androidx.annotation.experimental.Experimental.Level[] $values() {
                r0 = 2
                androidx.annotation.experimental.Experimental$Level[] r0 = new androidx.annotation.experimental.Experimental.Level[r0]
                androidx.annotation.experimental.Experimental$Level r1 = androidx.annotation.experimental.Experimental.Level.WARNING
                r2 = 0
                r0[r2] = r1
                androidx.annotation.experimental.Experimental$Level r1 = androidx.annotation.experimental.Experimental.Level.ERROR
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.annotation.experimental.Experimental$Level r0 = new androidx.annotation.experimental.Experimental$Level
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.experimental.Experimental.Level.WARNING = r0
                androidx.annotation.experimental.Experimental$Level r0 = new androidx.annotation.experimental.Experimental$Level
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.annotation.experimental.Experimental.Level.ERROR = r0
                androidx.annotation.experimental.Experimental$Level[] r0 = $values()
                androidx.annotation.experimental.Experimental.Level.$VALUES = r0
                return
        }

        private Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.experimental.Experimental.Level valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.experimental.Experimental$Level> r0 = androidx.annotation.experimental.Experimental.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.experimental.Experimental$Level r1 = (androidx.annotation.experimental.Experimental.Level) r1
                return r1
        }

        public static androidx.annotation.experimental.Experimental.Level[] values() {
                androidx.annotation.experimental.Experimental$Level[] r0 = androidx.annotation.experimental.Experimental.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.experimental.Experimental$Level[] r0 = (androidx.annotation.experimental.Experimental.Level[]) r0
                return r0
        }
    }

    androidx.annotation.experimental.Experimental.Level level() default androidx.annotation.experimental.Experimental.Level.ERROR;
}
