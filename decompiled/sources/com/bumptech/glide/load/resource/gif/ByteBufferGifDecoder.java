package com.bumptech.glide.load.resource.gif;

/* JADX INFO: loaded from: classes2.dex */
public class ByteBufferGifDecoder implements com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> {
    private static final com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.GifDecoderFactory GIF_DECODER_FACTORY = null;
    private static final com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.GifHeaderParserPool PARSER_POOL = null;
    private static final java.lang.String TAG = "BufferGifDecoder";
    private final android.content.Context context;
    private final com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.GifDecoderFactory gifDecoderFactory;
    private final com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.GifHeaderParserPool parserPool;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;
    private final com.bumptech.glide.load.resource.gif.GifBitmapProvider provider;

    @androidx.annotation.VisibleForTesting
    public static class GifDecoderFactory {
        public GifDecoderFactory() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public static class GifHeaderParserPool {
        private final java.util.Queue<com.bumptech.glide.gifdecoder.GifHeaderParser> pool;

        public GifHeaderParserPool() {
                r1 = this;
                r1.<init>()
                r0 = 0
                java.util.Queue r0 = com.bumptech.glide.util.Util.createQueue(r0)
                r1.pool = r0
                return
        }

        public final synchronized com.bumptech.glide.gifdecoder.GifHeaderParser obtain(java.nio.ByteBuffer r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.Queue<com.bumptech.glide.gifdecoder.GifHeaderParser> r0 = r1.pool     // Catch: java.lang.Throwable -> L16
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L16
                com.bumptech.glide.gifdecoder.GifHeaderParser r0 = (com.bumptech.glide.gifdecoder.GifHeaderParser) r0     // Catch: java.lang.Throwable -> L16
                if (r0 != 0) goto L10
                com.bumptech.glide.gifdecoder.GifHeaderParser r0 = new com.bumptech.glide.gifdecoder.GifHeaderParser     // Catch: java.lang.Throwable -> L16
                r0.<init>()     // Catch: java.lang.Throwable -> L16
            L10:
                com.bumptech.glide.gifdecoder.GifHeaderParser r2 = r0.setData(r2)     // Catch: java.lang.Throwable -> L16
                monitor-exit(r1)
                return r2
            L16:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        public final synchronized void release(com.bumptech.glide.gifdecoder.GifHeaderParser r2) {
                r1 = this;
                monitor-enter(r1)
                r2.clear()     // Catch: java.lang.Throwable -> Lb
                java.util.Queue<com.bumptech.glide.gifdecoder.GifHeaderParser> r0 = r1.pool     // Catch: java.lang.Throwable -> Lb
                r0.offer(r2)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return
            Lb:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }
    }

    static {
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifDecoderFactory r0 = new com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifDecoderFactory
            r0.<init>()
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.GIF_DECODER_FACTORY = r0
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r0 = new com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool
            r0.<init>()
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.PARSER_POOL = r0
            return
    }

    public ByteBufferGifDecoder(android.content.Context r4) {
            r3 = this;
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.get(r4)
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            java.util.List r0 = r0.getImageHeaderParsers()
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.get(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r1.getBitmapPool()
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.get(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r2.getArrayPool()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public ByteBufferGifDecoder(android.content.Context r3, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r5, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6) {
            r2 = this;
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r0 = com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.PARSER_POOL
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifDecoderFactory r1 = com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.GIF_DECODER_FACTORY
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            r2.context = r3
            r2.parsers = r4
            r2.gifDecoderFactory = r1
            com.bumptech.glide.load.resource.gif.GifBitmapProvider r3 = new com.bumptech.glide.load.resource.gif.GifBitmapProvider
            r3.<init>(r5, r6)
            r2.provider = r3
            r2.parserPool = r0
            return
    }

    @androidx.annotation.Nullable
    private com.bumptech.glide.load.resource.gif.GifDrawableResource decode(java.nio.ByteBuffer r17, int r18, int r19, com.bumptech.glide.gifdecoder.GifHeaderParser r20, com.bumptech.glide.load.Options r21) {
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Decoded GIF from stream in "
            java.lang.String r3 = "BufferGifDecoder"
            long r4 = com.bumptech.glide.util.LogTime.getLogTime()
            r6 = 2
            com.bumptech.glide.gifdecoder.GifHeader r0 = r20.parseHeader()     // Catch: java.lang.Throwable -> Lb3
            int r7 = r0.getNumFrames()     // Catch: java.lang.Throwable -> Lb3
            r8 = 0
            if (r7 <= 0) goto L9a
            int r7 = r0.getStatus()     // Catch: java.lang.Throwable -> Lb3
            if (r7 == 0) goto L1e
            goto L9a
        L1e:
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r7 = com.bumptech.glide.load.resource.gif.GifOptions.DECODE_FORMAT     // Catch: java.lang.Throwable -> Lb3
            r9 = r21
            java.lang.Object r7 = r9.get(r7)     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.DecodeFormat r9 = com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565     // Catch: java.lang.Throwable -> Lb3
            if (r7 != r9) goto L2d
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> Lb3
            goto L2f
        L2d:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lb3
        L2f:
            r13 = r18
            r14 = r19
            int r9 = getSampleSize(r0, r13, r14)     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifDecoderFactory r10 = r1.gifDecoderFactory     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.resource.gif.GifBitmapProvider r11 = r1.provider     // Catch: java.lang.Throwable -> Lb3
            java.util.Objects.requireNonNull(r10)     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.gifdecoder.StandardGifDecoder r12 = new com.bumptech.glide.gifdecoder.StandardGifDecoder     // Catch: java.lang.Throwable -> Lb3
            r10 = r17
            r12.<init>(r11, r0, r10, r9)     // Catch: java.lang.Throwable -> Lb3
            r12.setDefaultBitmapConfig(r7)     // Catch: java.lang.Throwable -> Lb3
            r12.advance()     // Catch: java.lang.Throwable -> Lb3
            android.graphics.Bitmap r15 = r12.getNextFrame()     // Catch: java.lang.Throwable -> Lb3
            if (r15 != 0) goto L6a
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L69
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            double r4 = com.bumptech.glide.util.LogTime.getElapsedMillis(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L69:
            return r8
        L6a:
            com.bumptech.glide.load.resource.UnitTransformation r0 = com.bumptech.glide.load.resource.UnitTransformation.get()     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.resource.gif.GifDrawable r7 = new com.bumptech.glide.load.resource.gif.GifDrawable     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r10 = r1.context     // Catch: java.lang.Throwable -> Lb3
            r9 = r7
            r11 = r12
            r12 = r0
            r13 = r18
            r14 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.resource.gif.GifDrawableResource r0 = new com.bumptech.glide.load.resource.gif.GifDrawableResource     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lb3
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto L99
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            double r4 = com.bumptech.glide.util.LogTime.getElapsedMillis(r4)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r3, r2)
        L99:
            return r0
        L9a:
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto Lb2
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            double r4 = com.bumptech.glide.util.LogTime.getElapsedMillis(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        Lb2:
            return r8
        Lb3:
            r0 = move-exception
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto Lcc
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            double r4 = com.bumptech.glide.util.LogTime.getElapsedMillis(r4)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r3, r2)
        Lcc:
            throw r0
    }

    private static int getSampleSize(com.bumptech.glide.gifdecoder.GifHeader r5, int r6, int r7) {
            int r0 = r5.getHeight()
            int r0 = r0 / r7
            int r1 = r5.getWidth()
            int r1 = r1 / r6
            int r0 = java.lang.Math.min(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            goto L16
        L12:
            int r0 = java.lang.Integer.highestOneBit(r0)
        L16:
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            r2 = 2
            java.lang.String r3 = "BufferGifDecoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L56
            if (r0 <= r1) goto L56
            java.lang.String r1 = "Downsampling GIF, sampleSize: "
            java.lang.String r2 = ", target dimens: ["
            java.lang.String r4 = "x"
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2, r6, r4)
            r6.append(r7)
            java.lang.String r7 = "], actual dimens: ["
            r6.append(r7)
            int r7 = r5.getWidth()
            r6.append(r7)
            r6.append(r4)
            int r5 = r5.getHeight()
            r6.append(r5)
            java.lang.String r5 = "]"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.v(r3, r5)
        L56:
            return r0
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> decode(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            com.bumptech.glide.load.resource.gif.GifDrawableResource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.resource.gif.GifDrawableResource decode2(@androidx.annotation.NonNull java.nio.ByteBuffer r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.Options r11) {
            r7 = this;
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r0 = r7.parserPool
            com.bumptech.glide.gifdecoder.GifHeaderParser r0 = r0.obtain(r8)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r0
            r6 = r11
            com.bumptech.glide.load.resource.gif.GifDrawableResource r8 = r1.decode(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r9 = r7.parserPool
            r9.release(r0)
            return r8
        L16:
            r8 = move-exception
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder$GifHeaderParserPool r9 = r7.parserPool
            r9.release(r0)
            throw r8
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull java.nio.ByteBuffer r2, @androidx.annotation.NonNull com.bumptech.glide.load.Options r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.Option<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.gif.GifOptions.DISABLE_ANIMATION
            java.lang.Object r3 = r3.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L1a
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3 = r1.parsers
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r3, r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
            if (r2 != r3) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }
}
