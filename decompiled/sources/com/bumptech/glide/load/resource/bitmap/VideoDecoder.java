package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class VideoDecoder<T> implements com.bumptech.glide.load.ResourceDecoder<T, android.graphics.Bitmap> {
    private static final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory DEFAULT_FACTORY = null;
    public static final long DEFAULT_FRAME = -1;
    public static final com.bumptech.glide.load.Option<java.lang.Integer> FRAME_OPTION = null;
    private static final java.lang.String TAG = "VideoDecoder";
    public static final com.bumptech.glide.load.Option<java.lang.Long> TARGET_FRAME = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory factory;
    private final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<T> initializer;



    public static final class AssetFileDescriptorInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<android.content.res.AssetFileDescriptor> {
        private AssetFileDescriptorInitializer() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AssetFileDescriptorInitializer(com.bumptech.glide.load.resource.bitmap.VideoDecoder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
        public void initialize2(android.media.MediaMetadataRetriever r7, android.content.res.AssetFileDescriptor r8) {
                r6 = this;
                java.io.FileDescriptor r1 = r8.getFileDescriptor()
                long r2 = r8.getStartOffset()
                long r4 = r8.getLength()
                r0 = r7
                r0.setDataSource(r1, r2, r4)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        public /* bridge */ /* synthetic */ void initialize(android.media.MediaMetadataRetriever r1, android.content.res.AssetFileDescriptor r2) {
                r0 = this;
                android.content.res.AssetFileDescriptor r2 = (android.content.res.AssetFileDescriptor) r2
                r0.initialize2(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(23)
    public static final class ByteBufferInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<java.nio.ByteBuffer> {


        public ByteBufferInitializer() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        public /* bridge */ /* synthetic */ void initialize(android.media.MediaMetadataRetriever r1, java.nio.ByteBuffer r2) {
                r0 = this;
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r0.initialize2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
        public void initialize2(android.media.MediaMetadataRetriever r2, java.nio.ByteBuffer r3) {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer$1 r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer$1
                r0.<init>(r3)
                r2.setDataSource(r0)
                return
        }
    }

    @androidx.annotation.VisibleForTesting
    public static class MediaMetadataRetrieverFactory {
        public MediaMetadataRetrieverFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.media.MediaMetadataRetriever build() {
                r1 = this;
                android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
                r0.<init>()
                return r0
        }
    }

    @androidx.annotation.VisibleForTesting
    public interface MediaMetadataRetrieverInitializer<T> {
        void initialize(android.media.MediaMetadataRetriever r1, T r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ParcelFileDescriptorInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<android.os.ParcelFileDescriptor> {
        public ParcelFileDescriptorInitializer() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: initialize, reason: avoid collision after fix types in other method */
        public void initialize2(android.media.MediaMetadataRetriever r1, android.os.ParcelFileDescriptor r2) {
                r0 = this;
                java.io.FileDescriptor r2 = r2.getFileDescriptor()
                r1.setDataSource(r2)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        public /* bridge */ /* synthetic */ void initialize(android.media.MediaMetadataRetriever r1, android.os.ParcelFileDescriptor r2) {
                r0 = this;
                android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
                r0.initialize2(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class VideoDecoderException extends java.lang.RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
                r1 = this;
                java.lang.String r0 = "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"
                r1.<init>(r0)
                return
        }
    }

    static {
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$1 r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$1
            r1.<init>()
            java.lang.String r2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.disk(r2, r0, r1)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder.TARGET_FRAME = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$2 r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$2
            r1.<init>()
            java.lang.String r2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.disk(r2, r0, r1)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder.FRAME_OPTION = r0
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.VideoDecoder.DEFAULT_FACTORY = r0
            return
    }

    public VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<T> r3) {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.DEFAULT_FACTORY
            r1.<init>()
            r1.bitmapPool = r2
            r1.initializer = r3
            r1.factory = r0
            return
    }

    public static com.bumptech.glide.load.ResourceDecoder<android.content.res.AssetFileDescriptor, android.graphics.Bitmap> asset(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3) {
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$AssetFileDescriptorInitializer r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$AssetFileDescriptorInitializer
            r2 = 0
            r1.<init>(r2)
            r0.<init>(r3, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(api = 23)
    public static com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, android.graphics.Bitmap> byteBuffer(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$ByteBufferInitializer
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static android.graphics.Bitmap decodeFrame(android.media.MediaMetadataRetriever r2, long r3, int r5, int r6, int r7, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L15
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L15
            if (r7 == r0) goto L15
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.NONE
            if (r8 == r0) goto L15
            android.graphics.Bitmap r6 = decodeScaledFrame(r2, r3, r5, r6, r7, r8)
            goto L16
        L15:
            r6 = 0
        L16:
            if (r6 != 0) goto L1c
            android.graphics.Bitmap r6 = decodeOriginalFrame(r2, r3, r5)
        L1c:
            if (r6 == 0) goto L1f
            return r6
        L1f:
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException r2 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException
            r2.<init>()
            throw r2
    }

    private static android.graphics.Bitmap decodeOriginalFrame(android.media.MediaMetadataRetriever r0, long r1, int r3) {
            android.graphics.Bitmap r0 = r0.getFrameAtTime(r1, r3)
            return r0
    }

    @androidx.annotation.Nullable
    @android.annotation.TargetApi(27)
    private static android.graphics.Bitmap decodeScaledFrame(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L43
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L43
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L43
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L43
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L43
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L43
            r3 = 90
            if (r2 == r3) goto L26
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L29
        L26:
            r8 = r1
            r1 = r0
            r0 = r8
        L29:
            float r13 = r15.getScaleFactor(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L43
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L43
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L43
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L43
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L43
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r9 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L43
            return r9
        L43:
            r9 = move-exception
            r10 = 3
            java.lang.String r11 = "VideoDecoder"
            boolean r10 = android.util.Log.isLoggable(r11, r10)
            if (r10 == 0) goto L52
            java.lang.String r10 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r11, r10, r9)
        L52:
            r9 = 0
            return r9
    }

    public static com.bumptech.glide.load.ResourceDecoder<android.os.ParcelFileDescriptor, android.graphics.Bitmap> parcel(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$ParcelFileDescriptorInitializer r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$ParcelFileDescriptorInitializer
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@androidx.annotation.NonNull T r9, int r10, int r11, @androidx.annotation.NonNull com.bumptech.glide.load.Options r12) throws java.io.IOException {
            r8 = this;
            com.bumptech.glide.load.Option<java.lang.Long> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.TARGET_FRAME
            java.lang.Object r0 = r12.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L25
            r0 = -1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L19
            goto L25
        L19:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r2)
            r9.<init>(r10)
            throw r9
        L25:
            com.bumptech.glide.load.Option<java.lang.Integer> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.FRAME_OPTION
            java.lang.Object r0 = r12.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L34
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L34:
            com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION
            java.lang.Object r12 = r12.get(r1)
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r12 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r12
            if (r12 != 0) goto L40
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r12 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.DEFAULT
        L40:
            r7 = r12
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverFactory r12 = r8.factory
            android.media.MediaMetadataRetriever r12 = r12.build()
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaMetadataRetrieverInitializer<T> r1 = r8.initializer     // Catch: java.lang.Throwable -> L61
            r1.initialize(r12, r9)     // Catch: java.lang.Throwable -> L61
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L61
            r1 = r12
            r5 = r10
            r6 = r11
            android.graphics.Bitmap r9 = decodeFrame(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L61
            r12.release()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r10 = r8.bitmapPool
            com.bumptech.glide.load.resource.bitmap.BitmapResource r9 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r9, r10)
            return r9
        L61:
            r9 = move-exception
            r12.release()
            throw r9
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
