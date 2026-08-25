package com.bumptech.glide.load.resource.file;

/* JADX INFO: loaded from: classes.dex */
public class FileDecoder implements com.bumptech.glide.load.ResourceDecoder<java.io.File, java.io.File> {
    public FileDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<java.io.File> decode2(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.resource.file.FileResource r2 = new com.bumptech.glide.load.resource.file.FileResource
            r2.<init>(r1)
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<java.io.File> decode(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.io.File r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.io.File r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
