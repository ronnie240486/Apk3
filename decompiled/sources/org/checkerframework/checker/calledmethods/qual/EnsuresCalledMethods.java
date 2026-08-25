package org.checkerframework.checker.calledmethods.qual;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PostconditionAnnotation(qualifier = org.checkerframework.checker.calledmethods.qual.CalledMethods.class)
public @interface EnsuresCalledMethods {
    @org.checkerframework.framework.qual.QualifierArgument("value")
    java.lang.String[] methods();

    java.lang.String[] value();
}
