package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Background {
    int delay() default 0;

    java.lang.String id() default "";

    java.lang.String serial() default "";
}
