package com.bumptech.glide.load.resource;

/* JADX INFO: loaded from: classes3.dex */
public final class UnitTransformation<T> implements com.bumptech.glide.load.Transformation<T> {
    private static final com.bumptech.glide.load.Transformation<?> TRANSFORMATION = null;

    static {
            com.bumptech.glide.load.resource.UnitTransformation r0 = new com.bumptech.glide.load.resource.UnitTransformation
            r0.<init>()
            com.bumptech.glide.load.resource.UnitTransformation.TRANSFORMATION = r0
            return
    }

    private UnitTransformation() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.resource.UnitTransformation<T> get() {
            com.bumptech.glide.load.Transformation<?> r0 = com.bumptech.glide.load.resource.UnitTransformation.TRANSFORMATION
            com.bumptech.glide.load.resource.UnitTransformation r0 = (com.bumptech.glide.load.resource.UnitTransformation) r0
            return r0
    }

    @Override // com.bumptech.glide.load.Transformation
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.Resource<T> transform(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<T> r2, int r3, int r4) {
            r0 = this;
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r1) {
            r0 = this;
            return
    }
}
