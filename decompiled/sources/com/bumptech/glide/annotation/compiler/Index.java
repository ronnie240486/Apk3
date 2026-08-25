package com.bumptech.glide.annotation.compiler;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@interface Index {
    java.lang.String[] extensions() default {};

    java.lang.String[] modules() default {};
}
