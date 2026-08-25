package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes.dex */
public class StreamGifDecoder implements com.bumptech.glide.load.ResourceDecoder<java.io.InputStream, com.bumptech.glide.load.resource.gif.GifDrawable> {
    private static final java.lang.String TAG = "StreamGifDecoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
    private final com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> byteBufferDecoder;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

    public StreamGifDecoder(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
            r0 = this;
            r0.<init>()
            r0.parsers = r1
            r0.byteBufferDecoder = r2
            r0.byteArrayPool = r3
            return
    }

    private static byte[] inputStreamToBytes(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L1d
        L9:
            int r2 = r4.read(r1)     // Catch: java.io.IOException -> L1d
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L1d
            goto L9
        L15:
            r0.flush()     // Catch: java.io.IOException -> L1d
            byte[] r4 = r0.toByteArray()
            return r4
        L1d:
            r4 = move-exception
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r4)
        L2c:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> decode2(@androidx.annotation.NonNull java.io.InputStream r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.Options r5) throws java.io.IOException {
            r1 = this;
            byte[] r2 = inputStreamToBytes(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> r0 = r1.byteBufferDecoder
            com.bumptech.glide.load.engine.Resource r2 = r0.decode(r2, r3, r4, r5)
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> decode(@androidx.annotation.NonNull java.io.InputStream r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.Option<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.gif.GifOptions.DISABLE_ANIMATION
            java.lang.Object r3 = r3.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L1c
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3 = r1.parsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.byteArrayPool
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r3, r2, r0)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
            if (r2 != r3) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
