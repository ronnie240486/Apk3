package org.androidannotations.annotations.sharedpreferences;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface DefaultInt {
    int keyRes() default -1;

    int value();
}
