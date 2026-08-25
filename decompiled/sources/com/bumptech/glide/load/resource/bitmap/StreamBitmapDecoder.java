package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class StreamBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<java.io.InputStream, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
    private final com.bumptech.glide.load.resource.bitmap.Downsampler downsampler;

    public static class UntrustedCallbacks implements com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks {
        private final com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream bufferedStream;
        private final com.bumptech.glide.util.ExceptionPassthroughInputStream exceptionStream;

        public UntrustedCallbacks(com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1, com.bumptech.glide.util.ExceptionPassthroughInputStream r2) {
                r0 = this;
                r0.<init>()
                r0.bufferedStream = r1
                r0.exceptionStream = r2
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onDecodeComplete(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, android.graphics.Bitmap r3) throws java.io.IOException {
                r1 = this;
                com.bumptech.glide.util.ExceptionPassthroughInputStream r0 = r1.exceptionStream
                java.io.IOException r0 = r0.getException()
                if (r0 == 0) goto Le
                if (r3 == 0) goto Ld
                r2.put(r3)
            Ld:
                throw r0
            Le:
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onObtainBounds() {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = r1.bufferedStream
                r0.fixMarkLimit()
                return
        }
    }

    public StreamBitmapDecoder(com.bumptech.glide.load.resource.bitmap.Downsampler r1, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) {
            r0 = this;
            r0.<init>()
            r0.downsampler = r1
            r0.byteArrayPool = r2
            return
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@androidx.annotation.NonNull java.io.InputStream r9, int r10, int r11, @androidx.annotation.NonNull com.bumptech.glide.load.Options r12) throws java.io.IOException {
            r8 = this;
            boolean r0 = r9 instanceof com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream
            if (r0 == 0) goto L8
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r9 = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) r9
            r0 = 0
            goto L12
        L8:
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r8.byteArrayPool
            r0.<init>(r9, r1)
            r9 = 1
            r9 = r0
            r0 = 1
        L12:
            com.bumptech.glide.util.ExceptionPassthroughInputStream r1 = com.bumptech.glide.util.ExceptionPassthroughInputStream.obtain(r9)
            com.bumptech.glide.util.MarkEnforcingInputStream r3 = new com.bumptech.glide.util.MarkEnforcingInputStream
            r3.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder$UntrustedCallbacks r7 = new com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder$UntrustedCallbacks
            r7.<init>(r9, r1)
            com.bumptech.glide.load.resource.bitmap.Downsampler r2 = r8.downsampler     // Catch: java.lang.Throwable -> L32
            r4 = r10
            r5 = r11
            r6 = r12
            com.bumptech.glide.load.engine.Resource r10 = r2.decode(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32
            r1.release()
            if (r0 == 0) goto L31
            r9.release()
        L31:
            return r10
        L32:
            r10 = move-exception
            r1.release()
            if (r0 == 0) goto L3b
            r9.release()
        L3b:
            throw r10
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@androidx.annotation.NonNull java.io.InputStream r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            com.bumptech.glide.load.resource.bitmap.Downsampler r2 = r0.downsampler
            boolean r1 = r2.handles(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
