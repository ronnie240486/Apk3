package org.checkerframework.checker.nullness.qual;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.nullness.qual.NonNull.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RequiresNonNull {
    java.lang.String[] value();
}
