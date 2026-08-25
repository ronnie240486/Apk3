package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
interface ImageReader {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class InputStreamImageReader implements com.bumptech.glide.load.resource.bitmap.ImageReader {
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
        private final com.bumptech.glide.load.data.InputStreamRewinder dataRewinder;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

        public InputStreamImageReader(java.io.InputStream r2, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r4)
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r0
                r1.byteArrayPool = r0
                java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
                java.util.List r3 = (java.util.List) r3
                r1.parsers = r3
                com.bumptech.glide.load.data.InputStreamRewinder r3 = new com.bumptech.glide.load.data.InputStreamRewinder
                r3.<init>(r2, r4)
                r1.dataRewinder = r3
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @androidx.annotation.Nullable
        public android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r3) throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.load.data.InputStreamRewinder r0 = r2.dataRewinder
                java.io.InputStream r0 = r0.rewindAndGet()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.InputStreamRewinder r1 = r3.dataRewinder
                java.io.InputStream r1 = r1.rewindAndGet()
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.InputStreamRewinder r1 = r3.dataRewinder
                java.io.InputStream r1 = r1.rewindAndGet()
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
                r1 = this;
                com.bumptech.glide.load.data.InputStreamRewinder r0 = r1.dataRewinder
                r0.fixMarkLimits()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(21)
    public static final class ParcelFileDescriptorImageReader implements com.bumptech.glide.load.resource.bitmap.ImageReader {
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
        private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder dataRewinder;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

        public ParcelFileDescriptorImageReader(android.os.ParcelFileDescriptor r1, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r3
                r0.byteArrayPool = r3
                java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
                java.util.List r2 = (java.util.List) r2
                r0.parsers = r2
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r2 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder
                r2.<init>(r1)
                r0.dataRewinder = r2
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @androidx.annotation.Nullable
        public android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r3) throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r2.dataRewinder
                android.os.ParcelFileDescriptor r0 = r0.rewindAndGet()
                java.io.FileDescriptor r0 = r0.getFileDescriptor()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r3.dataRewinder
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r3.dataRewinder
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
                r0 = this;
                return
        }
    }

    @androidx.annotation.Nullable
    android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r1) throws java.io.IOException;

    int getImageOrientation() throws java.io.IOException;

    com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException;

    void stopGrowingBuffers();
}
