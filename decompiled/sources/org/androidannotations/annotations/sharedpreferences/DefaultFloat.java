package org.androidannotations.annotations.sharedpreferences;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface DefaultFloat {
    int keyRes() default -1;

    float value();
}
