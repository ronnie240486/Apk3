package com.google.errorprone.annotations;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Documented
public @interface InlineMe {
    java.lang.String[] imports() default {};

    java.lang.String replacement();

    java.lang.String[] staticImports() default {};
}
