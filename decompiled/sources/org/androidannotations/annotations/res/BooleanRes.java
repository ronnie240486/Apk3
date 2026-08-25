package org.androidannotations.annotations.res;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface BooleanRes {
    java.lang.String resName() default "";

    int value() default -1;
}
