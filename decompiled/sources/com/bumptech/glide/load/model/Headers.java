package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes2.dex */
public interface Headers {
    public static final com.bumptech.glide.load.model.Headers DEFAULT = null;

    @java.lang.Deprecated
    public static final com.bumptech.glide.load.model.Headers NONE = null;


    static {
            com.bumptech.glide.load.model.Headers$1 r0 = new com.bumptech.glide.load.model.Headers$1
            r0.<init>()
            com.bumptech.glide.load.model.Headers.NONE = r0
            com.bumptech.glide.load.model.LazyHeaders$Builder r0 = new com.bumptech.glide.load.model.LazyHeaders$Builder
            r0.<init>()
            com.bumptech.glide.load.model.LazyHeaders r0 = r0.build()
            com.bumptech.glide.load.model.Headers.DEFAULT = r0
            return
    }

    java.util.Map<java.lang.String, java.lang.String> getHeaders();
}
