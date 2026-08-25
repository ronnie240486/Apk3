package com.bumptech.glide.annotation;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface GlideModule {
    java.lang.String glideName() default "GlideApp";
}
