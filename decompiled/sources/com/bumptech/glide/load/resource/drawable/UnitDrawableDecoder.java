package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes.dex */
public class UnitDrawableDecoder implements com.bumptech.glide.load.ResourceDecoder<android.graphics.drawable.Drawable, android.graphics.drawable.Drawable> {
    public UnitDrawableDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode2(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.engine.Resource r1 = com.bumptech.glide.load.resource.drawable.NonOwnedDrawableResource.newInstance(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
