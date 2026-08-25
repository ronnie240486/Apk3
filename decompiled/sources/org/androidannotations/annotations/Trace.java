package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Trace {
    public static final java.lang.String DEFAULT_TAG = "NO_TAG";

    int level() default 4;

    java.lang.String tag() default "NO_TAG";
}
