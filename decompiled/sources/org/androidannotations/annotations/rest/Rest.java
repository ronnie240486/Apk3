package org.androidannotations.annotations.rest;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Rest {
    java.lang.Class<?>[] converters();

    java.lang.Class<?>[] interceptors() default {};

    java.lang.Class<?> requestFactory() default java.lang.Void.class;

    java.lang.String rootUrl() default "";
}
