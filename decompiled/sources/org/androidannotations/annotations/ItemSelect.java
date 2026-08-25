package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface ItemSelect {
    java.lang.String[] resName() default {""};

    int[] value() default {-1};
}
