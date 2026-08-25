package androidx.annotation;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface ChecksSdkIntAtLeast {
    int api() default -1;

    java.lang.String codename() default "";

    int lambda() default -1;

    int parameter() default -1;
}
