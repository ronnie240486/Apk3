package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class VideoBitmapDecoder extends com.bumptech.glide.load.resource.bitmap.VideoDecoder<android.os.ParcelFileDescriptor> {
    public VideoBitmapDecoder(android.content.Context r1) {
            r0 = this;
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.get(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r1.getBitmapPool()
            r0.<init>(r1)
            return
    }

    public VideoBitmapDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$ParcelFileDescriptorInitializer r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$ParcelFileDescriptorInitializer
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }
}
