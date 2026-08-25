package com.bumptech.glide.load.resource.transcode;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawableBytesTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> {
    public GifDrawableBytesTranscoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.Resource<byte[]> transcode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            java.lang.Object r1 = r1.get()
            com.bumptech.glide.load.resource.gif.GifDrawable r1 = (com.bumptech.glide.load.resource.gif.GifDrawable) r1
            java.nio.ByteBuffer r1 = r1.getBuffer()
            com.bumptech.glide.load.resource.bytes.BytesResource r2 = new com.bumptech.glide.load.resource.bytes.BytesResource
            byte[] r1 = com.bumptech.glide.util.ByteBufferUtil.toBytes(r1)
            r2.<init>(r1)
            return r2
    }
}
