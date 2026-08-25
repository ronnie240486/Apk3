package org.androidannotations.annotations;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface OrmLiteDao {
    java.lang.Class<?> helper();

    @java.lang.Deprecated
    java.lang.Class<?> model() default java.lang.Void.class;
}
