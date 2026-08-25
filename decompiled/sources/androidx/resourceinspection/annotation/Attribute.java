package androidx.resourceinspection.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface Attribute {

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IntMap {
        int mask() default 0;

        @androidx.annotation.NonNull
        java.lang.String name();

        int value();
    }

    @androidx.annotation.NonNull
    androidx.resourceinspection.annotation.Attribute.IntMap[] intMapping() default {};

    @androidx.annotation.NonNull
    java.lang.String value();
}
