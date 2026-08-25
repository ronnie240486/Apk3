package com.bumptech.glide.load.resource;

/* JADX INFO: loaded from: classes.dex */
public class SimpleResource<T> implements com.bumptech.glide.load.engine.Resource<T> {
    public final T data;

    public SimpleResource(@androidx.annotation.NonNull T r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            r0.data = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public final T get() {
            r1 = this;
            T r0 = r1.data
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public java.lang.Class<T> getResourceClass() {
            r1 = this;
            T r0 = r1.data
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
            r0 = this;
            return
    }
}
