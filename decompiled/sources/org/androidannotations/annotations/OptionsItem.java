package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface OptionsItem {
    java.lang.String[] resName() default {""};

    int[] value() default {-1};
}
