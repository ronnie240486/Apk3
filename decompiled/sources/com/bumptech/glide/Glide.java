package com.bumptech.glide;

/* JADX INFO: loaded from: classes2.dex */
public class Glide implements android.content.ComponentCallbacks2 {
    private static final java.lang.String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
    private static final java.lang.String TAG = "Glide";

    @androidx.annotation.GuardedBy("Glide.class")
    private static volatile com.bumptech.glide.Glide glide;
    private static volatile boolean isInitializing;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.load.engine.prefill.BitmapPreFiller bitmapPreFiller;
    private final com.bumptech.glide.manager.ConnectivityMonitorFactory connectivityMonitorFactory;
    private final com.bumptech.glide.Glide.RequestOptionsFactory defaultRequestOptionsFactory;
    private final com.bumptech.glide.load.engine.Engine engine;
    private final com.bumptech.glide.GlideContext glideContext;

    @androidx.annotation.GuardedBy("managers")
    private final java.util.List<com.bumptech.glide.RequestManager> managers;
    private final com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private com.bumptech.glide.MemoryCategory memoryCategory;
    private final com.bumptech.glide.Registry registry;
    private final com.bumptech.glide.manager.RequestManagerRetriever requestManagerRetriever;

    /* JADX INFO: loaded from: classes.dex */
    public interface RequestOptionsFactory {
        @androidx.annotation.NonNull
        com.bumptech.glide.request.RequestOptions build();
    }

    public Glide(@androidx.annotation.NonNull android.content.Context r26, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Engine r27, @androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.MemoryCache r28, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r29, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r30, @androidx.annotation.NonNull com.bumptech.glide.manager.RequestManagerRetriever r31, @androidx.annotation.NonNull com.bumptech.glide.manager.ConnectivityMonitorFactory r32, int r33, @androidx.annotation.NonNull com.bumptech.glide.Glide.RequestOptionsFactory r34, @androidx.annotation.NonNull java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r35, @androidx.annotation.NonNull java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r36, com.bumptech.glide.GlideExperiments r37) {
            r25 = this;
            r0 = r25
            r2 = r26
            r1 = r29
            r3 = r30
            java.lang.Class<com.bumptech.glide.gifdecoder.GifDecoder> r4 = com.bumptech.glide.gifdecoder.GifDecoder.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class<byte[]> r7 = byte[].class
            r25.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.managers = r8
            com.bumptech.glide.MemoryCategory r8 = com.bumptech.glide.MemoryCategory.NORMAL
            r0.memoryCategory = r8
            r9 = r27
            r0.engine = r9
            r0.bitmapPool = r1
            r0.arrayPool = r3
            r8 = r28
            r0.memoryCache = r8
            r8 = r31
            r0.requestManagerRetriever = r8
            r8 = r32
            r0.connectivityMonitorFactory = r8
            r8 = r34
            r0.defaultRequestOptionsFactory = r8
            android.content.res.Resources r10 = r26.getResources()
            com.bumptech.glide.Registry r11 = new com.bumptech.glide.Registry
            r11.<init>()
            r0.registry = r11
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser r12 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
            r12.<init>()
            r11.register(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 27
            if (r12 < r13) goto L57
            com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser r13 = new com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser
            r13.<init>()
            r11.register(r13)
        L57:
            java.util.List r13 = r11.getImageHeaderParsers()
            com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder r14 = new com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder
            r14.<init>(r2, r13, r1, r3)
            com.bumptech.glide.load.ResourceDecoder r15 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.parcel(r29)
            com.bumptech.glide.load.resource.bitmap.Downsampler r8 = new com.bumptech.glide.load.resource.bitmap.Downsampler
            java.util.List r9 = r11.getImageHeaderParsers()
            android.util.DisplayMetrics r0 = r10.getDisplayMetrics()
            r8.<init>(r9, r0, r1, r3)
            java.lang.Class<com.bumptech.glide.GlideBuilder$EnableImageDecoderForBitmaps> r0 = com.bumptech.glide.GlideBuilder.EnableImageDecoderForBitmaps.class
            r9 = r37
            boolean r0 = r9.isEnabled(r0)
            if (r0 == 0) goto L8c
            r0 = 28
            if (r12 < r0) goto L8c
            com.bumptech.glide.load.resource.bitmap.InputStreamBitmapImageDecoderResourceDecoder r0 = new com.bumptech.glide.load.resource.bitmap.InputStreamBitmapImageDecoderResourceDecoder
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapImageDecoderResourceDecoder r16 = new com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapImageDecoderResourceDecoder
            r16.<init>()
            r9 = r16
            goto L9a
        L8c:
            com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder r0 = new com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder
            r0.<init>(r8)
            r28 = r0
            com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder r0 = new com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder
            r0.<init>(r8, r3)
            r9 = r28
        L9a:
            r16 = r7
            com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder r7 = new com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder
            r7.<init>(r2)
            r28 = r12
            com.bumptech.glide.load.model.ResourceLoader$StreamFactory r12 = new com.bumptech.glide.load.model.ResourceLoader$StreamFactory
            r12.<init>(r10)
            com.bumptech.glide.load.model.ResourceLoader$UriFactory r2 = new com.bumptech.glide.load.model.ResourceLoader$UriFactory
            r2.<init>(r10)
            r17 = r5
            com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory r5 = new com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory
            r5.<init>(r10)
            r31 = r2
            com.bumptech.glide.load.model.ResourceLoader$AssetFileDescriptorFactory r2 = new com.bumptech.glide.load.model.ResourceLoader$AssetFileDescriptorFactory
            r2.<init>(r10)
            r32 = r2
            com.bumptech.glide.load.resource.bitmap.BitmapEncoder r2 = new com.bumptech.glide.load.resource.bitmap.BitmapEncoder
            r2.<init>(r3)
            r18 = r6
            com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder r6 = new com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder
            r6.<init>()
            r19 = r6
            com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder r6 = new com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder
            r6.<init>()
            r20 = r6
            android.content.ContentResolver r6 = r26.getContentResolver()
            r21 = r6
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            r22 = r5
            com.bumptech.glide.load.model.ByteBufferEncoder r5 = new com.bumptech.glide.load.model.ByteBufferEncoder
            r5.<init>()
            com.bumptech.glide.Registry r5 = r11.append(r6, r5)
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            r23 = r12
            com.bumptech.glide.load.model.StreamEncoder r12 = new com.bumptech.glide.load.model.StreamEncoder
            r12.<init>(r3)
            com.bumptech.glide.Registry r5 = r5.append(r6, r12)
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r12 = android.graphics.Bitmap.class
            r24 = r7
            java.lang.String r7 = "Bitmap"
            com.bumptech.glide.Registry r5 = r5.append(r7, r6, r12, r9)
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            java.lang.Class<android.graphics.Bitmap> r12 = android.graphics.Bitmap.class
            r5.append(r7, r6, r12, r0)
            boolean r5 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.isSupported()
            if (r5 == 0) goto L117
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.ParcelFileDescriptorBitmapDecoder r12 = new com.bumptech.glide.load.resource.bitmap.ParcelFileDescriptorBitmapDecoder
            r12.<init>(r8)
            r11.append(r7, r5, r6, r12)
        L117:
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            com.bumptech.glide.Registry r5 = r11.append(r7, r5, r6, r15)
            java.lang.Class<android.content.res.AssetFileDescriptor> r6 = android.content.res.AssetFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
            com.bumptech.glide.load.ResourceDecoder r12 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.asset(r29)
            com.bumptech.glide.Registry r5 = r5.append(r7, r6, r8, r12)
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
            com.bumptech.glide.load.model.UnitModelLoader$Factory r12 = com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()
            com.bumptech.glide.Registry r5 = r5.append(r6, r8, r12)
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder r12 = new com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder
            r12.<init>()
            com.bumptech.glide.Registry r5 = r5.append(r7, r6, r8, r12)
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            com.bumptech.glide.Registry r5 = r5.append(r6, r2)
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r8 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder r12 = new com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder
            r12.<init>(r10, r9)
            java.lang.String r9 = "BitmapDrawable"
            com.bumptech.glide.Registry r5 = r5.append(r9, r6, r8, r12)
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r8 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder r12 = new com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder
            r12.<init>(r10, r0)
            com.bumptech.glide.Registry r0 = r5.append(r9, r6, r8, r12)
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r6 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder r8 = new com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder
            r8.<init>(r10, r15)
            com.bumptech.glide.Registry r0 = r0.append(r9, r5, r6, r8)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder r6 = new com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder
            r6.<init>(r1, r2)
            com.bumptech.glide.Registry r0 = r0.append(r5, r6)
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r5 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.load.resource.gif.StreamGifDecoder r6 = new com.bumptech.glide.load.resource.gif.StreamGifDecoder
            r6.<init>(r13, r14, r3)
            java.lang.String r8 = "Gif"
            com.bumptech.glide.Registry r0 = r0.append(r8, r2, r5, r6)
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r5 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.Registry r0 = r0.append(r8, r2, r5, r14)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r2 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.load.resource.gif.GifDrawableEncoder r5 = new com.bumptech.glide.load.resource.gif.GifDrawableEncoder
            r5.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r2, r5)
            com.bumptech.glide.load.model.UnitModelLoader$Factory r2 = com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()
            com.bumptech.glide.Registry r0 = r0.append(r4, r4, r2)
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder r5 = new com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder
            r5.<init>(r1)
            com.bumptech.glide.Registry r0 = r0.append(r7, r4, r2, r5)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            r5 = r24
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder r6 = new com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder
            r6.<init>(r5, r1)
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r6)
            com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory r2 = new com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.register(r2)
            java.lang.Class<java.io.File> r2 = java.io.File.class
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            com.bumptech.glide.load.model.ByteBufferFileLoader$Factory r5 = new com.bumptech.glide.load.model.ByteBufferFileLoader$Factory
            r5.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<java.io.File> r2 = java.io.File.class
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.FileLoader$StreamFactory r5 = new com.bumptech.glide.load.model.FileLoader$StreamFactory
            r5.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<java.io.File> r2 = java.io.File.class
            java.lang.Class<java.io.File> r4 = java.io.File.class
            com.bumptech.glide.load.resource.file.FileDecoder r5 = new com.bumptech.glide.load.resource.file.FileDecoder
            r5.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<java.io.File> r2 = java.io.File.class
            java.lang.Class<android.os.ParcelFileDescriptor> r4 = android.os.ParcelFileDescriptor.class
            com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory r5 = new com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory
            r5.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<java.io.File> r2 = java.io.File.class
            java.lang.Class<java.io.File> r4 = java.io.File.class
            com.bumptech.glide.load.model.UnitModelLoader$Factory r5 = com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            com.bumptech.glide.load.data.InputStreamRewinder$Factory r2 = new com.bumptech.glide.load.data.InputStreamRewinder$Factory
            r2.<init>(r3)
            r0.register(r2)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.isSupported()
            if (r0 == 0) goto L229
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$Factory r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$Factory
            r0.<init>()
            r11.register(r0)
        L229:
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            r4 = r23
            com.bumptech.glide.Registry r2 = r11.append(r0, r2, r4)
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            r6 = r22
            com.bumptech.glide.Registry r2 = r2.append(r0, r5, r6)
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            r7 = r18
            com.bumptech.glide.Registry r2 = r2.append(r7, r5, r4)
            java.lang.Class<android.os.ParcelFileDescriptor> r4 = android.os.ParcelFileDescriptor.class
            com.bumptech.glide.Registry r2 = r2.append(r7, r4, r6)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            r5 = r31
            com.bumptech.glide.Registry r2 = r2.append(r7, r4, r5)
            java.lang.Class<android.content.res.AssetFileDescriptor> r4 = android.content.res.AssetFileDescriptor.class
            r6 = r32
            com.bumptech.glide.Registry r2 = r2.append(r0, r4, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r4 = android.content.res.AssetFileDescriptor.class
            com.bumptech.glide.Registry r2 = r2.append(r7, r4, r6)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            com.bumptech.glide.Registry r0 = r2.append(r0, r4, r5)
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            com.bumptech.glide.load.model.DataUrlLoader$StreamFactory r4 = new com.bumptech.glide.load.model.DataUrlLoader$StreamFactory
            r4.<init>()
            r5 = r17
            com.bumptech.glide.Registry r0 = r0.append(r5, r2, r4)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.DataUrlLoader$StreamFactory r6 = new com.bumptech.glide.load.model.DataUrlLoader$StreamFactory
            r6.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r6)
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            com.bumptech.glide.load.model.StringLoader$StreamFactory r4 = new com.bumptech.glide.load.model.StringLoader$StreamFactory
            r4.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r5, r2, r4)
            java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
            com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory r4 = new com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory
            r4.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r5, r2, r4)
            java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
            com.bumptech.glide.load.model.StringLoader$AssetFileDescriptorFactory r4 = new com.bumptech.glide.load.model.StringLoader$AssetFileDescriptorFactory
            r4.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r5, r2, r4)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.AssetUriLoader$StreamFactory r5 = new com.bumptech.glide.load.model.AssetUriLoader$StreamFactory
            android.content.res.AssetManager r6 = r26.getAssets()
            r5.<init>(r6)
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r4 = android.os.ParcelFileDescriptor.class
            com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory r5 = new com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory
            android.content.res.AssetManager r6 = r26.getAssets()
            r5.<init>(r6)
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory r5 = new com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory
            r6 = r26
            r5.<init>(r6)
            com.bumptech.glide.Registry r0 = r0.append(r2, r4, r5)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory r5 = new com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory
            r5.<init>(r6)
            r0.append(r2, r4, r5)
            r0 = 29
            r2 = r28
            if (r2 < r0) goto L2fb
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$InputStreamFactory r5 = new com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$InputStreamFactory
            r5.<init>(r6)
            r11.append(r0, r4, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r4 = android.os.ParcelFileDescriptor.class
            com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$FileDescriptorFactory r5 = new com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$FileDescriptorFactory
            r5.<init>(r6)
            r11.append(r0, r4, r5)
        L2fb:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.UriLoader$StreamFactory r5 = new com.bumptech.glide.load.model.UriLoader$StreamFactory
            r7 = r21
            r5.<init>(r7)
            com.bumptech.glide.Registry r0 = r11.append(r0, r4, r5)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory r8 = new com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory
            r8.<init>(r7)
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r8)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r5 = android.content.res.AssetFileDescriptor.class
            com.bumptech.glide.load.model.UriLoader$AssetFileDescriptorFactory r8 = new com.bumptech.glide.load.model.UriLoader$AssetFileDescriptorFactory
            r8.<init>(r7)
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r8)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            com.bumptech.glide.load.model.UrlUriLoader$StreamFactory r7 = new com.bumptech.glide.load.model.UrlUriLoader$StreamFactory
            r7.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r7)
            java.lang.Class<java.net.URL> r4 = java.net.URL.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory r7 = new com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory
            r7.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r7)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            java.lang.Class<java.io.File> r5 = java.io.File.class
            com.bumptech.glide.load.model.MediaStoreFileLoader$Factory r7 = new com.bumptech.glide.load.model.MediaStoreFileLoader$Factory
            r7.<init>(r6)
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r7)
            java.lang.Class<com.bumptech.glide.load.model.GlideUrl> r4 = com.bumptech.glide.load.model.GlideUrl.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory r7 = new com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory
            r7.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r7)
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory r5 = new com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory
            r5.<init>()
            r7 = r16
            com.bumptech.glide.Registry r0 = r0.append(r7, r4, r5)
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory r5 = new com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory
            r5.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r7, r4, r5)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            com.bumptech.glide.load.model.UnitModelLoader$Factory r8 = com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r8)
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.load.model.UnitModelLoader$Factory r8 = com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r8)
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder r8 = new com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder
            r8.<init>()
            com.bumptech.glide.Registry r0 = r0.append(r4, r5, r8)
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder r8 = new com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder
            r8.<init>(r10)
            com.bumptech.glide.Registry r0 = r0.register(r4, r5, r8)
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r5 = r19
            com.bumptech.glide.Registry r0 = r0.register(r4, r7, r5)
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder r8 = new com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder
            r9 = r20
            r8.<init>(r1, r5, r9)
            com.bumptech.glide.Registry r0 = r0.register(r4, r7, r8)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r4 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            r0.register(r4, r7, r9)
            r0 = 23
            if (r2 < r0) goto L3d7
            com.bumptech.glide.load.ResourceDecoder r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.byteBuffer(r29)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            r11.append(r1, r2, r0)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder r4 = new com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder
            r4.<init>(r10, r0)
            r11.append(r1, r2, r4)
        L3d7:
            com.bumptech.glide.request.target.ImageViewTargetFactory r5 = new com.bumptech.glide.request.target.ImageViewTargetFactory
            r5.<init>()
            com.bumptech.glide.GlideContext r0 = new com.bumptech.glide.GlideContext
            r1 = r0
            r2 = r26
            r3 = r30
            r4 = r11
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r27
            r10 = r37
            r11 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r25
            r1.glideContext = r0
            return
    }

    @androidx.annotation.GuardedBy("Glide.class")
    private static void checkAndInitializeGlide(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable com.bumptech.glide.GeneratedAppGlideModule r2) {
            boolean r0 = com.bumptech.glide.Glide.isInitializing
            if (r0 != 0) goto Le
            r0 = 1
            com.bumptech.glide.Glide.isInitializing = r0
            initializeGlide(r1, r2)
            r1 = 0
            com.bumptech.glide.Glide.isInitializing = r1
            return
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.VisibleForTesting
    public static void enableHardwareBitmaps() {
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance()
            r0.unblockHardwareBitmaps()
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.Glide get(@androidx.annotation.NonNull android.content.Context r3) {
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.glide
            if (r0 != 0) goto L1b
            android.content.Context r0 = r3.getApplicationContext()
            com.bumptech.glide.GeneratedAppGlideModule r0 = getAnnotationGeneratedGlideModules(r0)
            java.lang.Class<com.bumptech.glide.Glide> r1 = com.bumptech.glide.Glide.class
            monitor-enter(r1)
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L16
            checkAndInitializeGlide(r3, r0)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r3
        L1b:
            com.bumptech.glide.Glide r3 = com.bumptech.glide.Glide.glide
            return r3
    }

    @androidx.annotation.Nullable
    private static com.bumptech.glide.GeneratedAppGlideModule getAnnotationGeneratedGlideModules(android.content.Context r5) {
            java.lang.Class<com.bumptech.glide.GeneratedAppGlideModuleImpl> r0 = com.bumptech.glide.GeneratedAppGlideModuleImpl.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            java.lang.Object r5 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            com.bumptech.glide.GeneratedAppGlideModule r5 = (com.bumptech.glide.GeneratedAppGlideModule) r5     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.NoSuchMethodException -> L22 java.lang.IllegalAccessException -> L27 java.lang.InstantiationException -> L2c java.lang.ClassNotFoundException -> L31
            goto L41
        L1d:
            r5 = move-exception
            throwIncorrectGlideModule(r5)
            goto L40
        L22:
            r5 = move-exception
            throwIncorrectGlideModule(r5)
            goto L40
        L27:
            r5 = move-exception
            throwIncorrectGlideModule(r5)
            goto L40
        L2c:
            r5 = move-exception
            throwIncorrectGlideModule(r5)
            goto L40
        L31:
            r5 = 5
            java.lang.String r0 = "Glide"
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto L40
            java.lang.String r5 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"
            android.util.Log.w(r0, r5)
        L40:
            r5 = 0
        L41:
            return r5
    }

    @androidx.annotation.Nullable
    public static java.io.File getPhotoCacheDir(@androidx.annotation.NonNull android.content.Context r1) {
            java.lang.String r0 = "image_manager_disk_cache"
            java.io.File r1 = getPhotoCacheDir(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static java.io.File getPhotoCacheDir(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            java.io.File r2 = r2.getCacheDir()
            r0 = 0
            if (r2 == 0) goto L1b
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r3)
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L1a
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            return r1
        L1b:
            r2 = 6
            java.lang.String r3 = "Glide"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L29
            java.lang.String r2 = "default disk cache dir is null"
            android.util.Log.e(r3, r2)
        L29:
            return r0
    }

    @androidx.annotation.NonNull
    private static com.bumptech.glide.manager.RequestManagerRetriever getRetriever(@androidx.annotation.Nullable android.content.Context r1) {
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            com.bumptech.glide.util.Preconditions.checkNotNull(r1, r0)
            com.bumptech.glide.Glide r1 = get(r1)
            com.bumptech.glide.manager.RequestManagerRetriever r1 = r1.getRequestManagerRetriever()
            return r1
    }

    @androidx.annotation.VisibleForTesting
    public static void init(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.bumptech.glide.GlideBuilder r4) {
            com.bumptech.glide.GeneratedAppGlideModule r0 = getAnnotationGeneratedGlideModules(r3)
            java.lang.Class<com.bumptech.glide.Glide> r1 = com.bumptech.glide.Glide.class
            monitor-enter(r1)
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto Le
            tearDown()     // Catch: java.lang.Throwable -> L13
        Le:
            initializeGlide(r3, r4, r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    @androidx.annotation.VisibleForTesting
    @java.lang.Deprecated
    public static synchronized void init(com.bumptech.glide.Glide r2) {
            java.lang.Class<com.bumptech.glide.Glide> r0 = com.bumptech.glide.Glide.class
            monitor-enter(r0)
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto La
            tearDown()     // Catch: java.lang.Throwable -> Le
        La:
            com.bumptech.glide.Glide.glide = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @androidx.annotation.GuardedBy("Glide.class")
    private static void initializeGlide(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable com.bumptech.glide.GeneratedAppGlideModule r2) {
            com.bumptech.glide.GlideBuilder r0 = new com.bumptech.glide.GlideBuilder
            r0.<init>()
            initializeGlide(r1, r0, r2)
            return
    }

    @androidx.annotation.GuardedBy("Glide.class")
    private static void initializeGlide(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull com.bumptech.glide.GlideBuilder r9, @androidx.annotation.Nullable com.bumptech.glide.GeneratedAppGlideModule r10) {
            android.content.Context r8 = r8.getApplicationContext()
            java.util.List r0 = java.util.Collections.emptyList()
            if (r10 == 0) goto L10
            boolean r1 = r10.isManifestParsingEnabled()
            if (r1 == 0) goto L19
        L10:
            com.bumptech.glide.module.ManifestParser r0 = new com.bumptech.glide.module.ManifestParser
            r0.<init>(r8)
            java.util.List r0 = r0.parse()
        L19:
            r1 = 3
            java.lang.String r2 = "Glide"
            if (r10 == 0) goto L65
            java.util.Set r3 = r10.getExcludedModuleClasses()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L65
            java.util.Set r3 = r10.getExcludedModuleClasses()
            java.util.Iterator r4 = r0.iterator()
        L30:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            com.bumptech.glide.module.GlideModule r5 = (com.bumptech.glide.module.GlideModule) r5
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r3.contains(r6)
            if (r6 != 0) goto L47
            goto L30
        L47:
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L61
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "AppGlideModule excludes manifest GlideModule: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r2, r5)
        L61:
            r4.remove()
            goto L30
        L65:
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L90
            java.util.Iterator r1 = r0.iterator()
        L6f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L90
            java.lang.Object r3 = r1.next()
            com.bumptech.glide.module.GlideModule r3 = (com.bumptech.glide.module.GlideModule) r3
            java.lang.String r4 = "Discovered GlideModule from manifest: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.d(r2, r3)
            goto L6f
        L90:
            if (r10 == 0) goto L97
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r1 = r10.getRequestManagerFactory()
            goto L98
        L97:
            r1 = 0
        L98:
            r9.setRequestManagerFactory(r1)
            java.util.Iterator r1 = r0.iterator()
        L9f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.module.GlideModule r2 = (com.bumptech.glide.module.GlideModule) r2
            r2.applyOptions(r8, r9)
            goto L9f
        Laf:
            if (r10 == 0) goto Lb4
            r10.applyOptions(r8, r9)
        Lb4:
            com.bumptech.glide.Glide r9 = r9.build(r8)
            java.util.Iterator r0 = r0.iterator()
        Lbc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lea
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.module.GlideModule r1 = (com.bumptech.glide.module.GlideModule) r1
            com.bumptech.glide.Registry r2 = r9.registry     // Catch: java.lang.AbstractMethodError -> Lce
            r1.registerComponents(r8, r9, r2)     // Catch: java.lang.AbstractMethodError -> Lce
            goto Lbc
        Lce:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: "
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10, r8)
            throw r9
        Lea:
            if (r10 == 0) goto Lf1
            com.bumptech.glide.Registry r0 = r9.registry
            r10.registerComponents(r8, r9, r0)
        Lf1:
            r8.registerComponentCallbacks(r9)
            com.bumptech.glide.Glide.glide = r9
            return
    }

    @androidx.annotation.VisibleForTesting
    public static void tearDown() {
            java.lang.Class<com.bumptech.glide.Glide> r0 = com.bumptech.glide.Glide.class
            monitor-enter(r0)
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L1d
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L22
            r1.unregisterComponentCallbacks(r2)     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.load.engine.Engine r1 = r1.engine     // Catch: java.lang.Throwable -> L22
            r1.shutdown()     // Catch: java.lang.Throwable -> L22
        L1d:
            r1 = 0
            com.bumptech.glide.Glide.glide = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    private static void throwIncorrectGlideModule(java.lang.Exception r2) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r2)
            throw r0
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.RequestManager with(@androidx.annotation.NonNull android.app.Activity r1) {
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r1)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bumptech.glide.RequestManager with(@androidx.annotation.NonNull android.app.Fragment r1) {
            android.app.Activity r0 = r1.getActivity()
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r0)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.RequestManager with(@androidx.annotation.NonNull android.content.Context r1) {
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r1)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.RequestManager with(@androidx.annotation.NonNull android.view.View r1) {
            android.content.Context r0 = r1.getContext()
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r0)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.RequestManager with(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
            android.content.Context r0 = r1.getContext()
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r0)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.RequestManager with(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r1) {
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r1)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    public void clearDiskCache() {
            r1 = this;
            com.bumptech.glide.util.Util.assertBackgroundThread()
            com.bumptech.glide.load.engine.Engine r0 = r1.engine
            r0.clearDiskCache()
            return
    }

    public void clearMemory() {
            r1 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r1.memoryCache
            r0.clearMemory()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r1.bitmapPool
            r0.clearMemory()
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.arrayPool
            r0.clearMemory()
            return
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool getArrayPool() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.arrayPool
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool getBitmapPool() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r1.bitmapPool
            return r0
    }

    public final com.bumptech.glide.manager.ConnectivityMonitorFactory getConnectivityMonitorFactory() {
            r1 = this;
            com.bumptech.glide.manager.ConnectivityMonitorFactory r0 = r1.connectivityMonitorFactory
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.Context getContext() {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            android.content.Context r0 = r0.getBaseContext()
            return r0
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.GlideContext getGlideContext() {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.Registry getRegistry() {
            r1 = this;
            com.bumptech.glide.Registry r0 = r1.registry
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.manager.RequestManagerRetriever getRequestManagerRetriever() {
            r1 = this;
            com.bumptech.glide.manager.RequestManagerRetriever r0 = r1.requestManagerRetriever
            return r0
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            r0.clearMemory()
            return
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r1) {
            r0 = this;
            r0.trimMemory(r1)
            return
    }

    public synchronized void preFillBitmapPool(@androidx.annotation.NonNull com.bumptech.glide.load.engine.prefill.PreFillType.Builder... r5) {
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.load.engine.prefill.BitmapPreFiller r0 = r4.bitmapPreFiller     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L22
            com.bumptech.glide.Glide$RequestOptionsFactory r0 = r4.defaultRequestOptionsFactory     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.request.RequestOptions r0 = r0.build()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.Options r0 = r0.getOptions()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.DecodeFormat r0 = (com.bumptech.glide.load.DecodeFormat) r0     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.engine.prefill.BitmapPreFiller r1 = new com.bumptech.glide.load.engine.prefill.BitmapPreFiller     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r4.memoryCache     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3 = r4.bitmapPool     // Catch: java.lang.Throwable -> L29
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L29
            r4.bitmapPreFiller = r1     // Catch: java.lang.Throwable -> L29
        L22:
            com.bumptech.glide.load.engine.prefill.BitmapPreFiller r0 = r4.bitmapPreFiller     // Catch: java.lang.Throwable -> L29
            r0.preFill(r5)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)
            return
        L29:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final void registerRequestManager(com.bumptech.glide.RequestManager r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.RequestManager> r0 = r2.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L12
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L1a
            r1.add(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Cannot register already registered manager"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    public final boolean removeFromManagers(@androidx.annotation.NonNull com.bumptech.glide.request.target.Target<?> r4) {
            r3 = this;
            java.util.List<com.bumptech.glide.RequestManager> r0 = r3.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r3.managers     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.RequestManager r2 = (com.bumptech.glide.RequestManager) r2     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.untrack(r4)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L9
            r4 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r4
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            r4 = 0
            return r4
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.MemoryCategory setMemoryCategory(@androidx.annotation.NonNull com.bumptech.glide.MemoryCategory r3) {
            r2 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r2.memoryCache
            float r1 = r3.getMultiplier()
            r0.setSizeMultiplier(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r2.bitmapPool
            float r1 = r3.getMultiplier()
            r0.setSizeMultiplier(r1)
            com.bumptech.glide.MemoryCategory r0 = r2.memoryCategory
            r2.memoryCategory = r3
            return r0
    }

    public void trimMemory(int r4) {
            r3 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.List<com.bumptech.glide.RequestManager> r0 = r3.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r3.managers     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.RequestManager r2 = (com.bumptech.glide.RequestManager) r2     // Catch: java.lang.Throwable -> L2d
            r2.onTrimMemory(r4)     // Catch: java.lang.Throwable -> L2d
            goto Lc
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r3.memoryCache
            r0.trimMemory(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r3.bitmapPool
            r0.trimMemory(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r3.arrayPool
            r0.trimMemory(r4)
            return
        L2d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    public final void unregisterRequestManager(com.bumptech.glide.RequestManager r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.RequestManager> r0 = r2.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L12
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L1a
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Cannot unregister not yet registered manager"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }
}
