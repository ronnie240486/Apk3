package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes3.dex */
public final class InputStreamRewinder implements com.bumptech.glide.load.data.DataRewinder<java.io.InputStream> {
    private static final int MARK_READ_LIMIT = 5242880;
    private final com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream bufferedStream;

    public static final class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory<java.io.InputStream> {
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;

        public Factory(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1) {
                r0 = this;
                r0.<init>()
                r0.byteArrayPool = r1
                return
        }

        @androidx.annotation.NonNull
        /* JADX INFO: renamed from: build, reason: avoid collision after fix types in other method */
        public com.bumptech.glide.load.data.DataRewinder<java.io.InputStream> build2(java.io.InputStream r3) {
                r2 = this;
                com.bumptech.glide.load.data.InputStreamRewinder r0 = new com.bumptech.glide.load.data.InputStreamRewinder
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r2.byteArrayPool
                r0.<init>(r3, r1)
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.data.DataRewinder<java.io.InputStream> build(java.io.InputStream r1) {
                r0 = this;
                java.io.InputStream r1 = (java.io.InputStream) r1
                com.bumptech.glide.load.data.DataRewinder r1 = r0.build2(r1)
                return r1
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @androidx.annotation.NonNull
        public java.lang.Class<java.io.InputStream> getDataClass() {
                r1 = this;
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                return r0
        }
    }

    public InputStreamRewinder(java.io.InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream
            r0.<init>(r2, r3)
            r1.bufferedStream = r0
            r2 = 5242880(0x500000, float:7.34684E-39)
            r0.mark(r2)
            return
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = r1.bufferedStream
            r0.release()
            return
    }

    public void fixMarkLimits() {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = r1.bufferedStream
            r0.fixMarkLimit()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.DataRewinder
    @androidx.annotation.NonNull
    public java.io.InputStream rewindAndGet() throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = r1.bufferedStream
            r0.reset()
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r0 = r1.bufferedStream
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.io.InputStream rewindAndGet() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.rewindAndGet()
            return r0
    }
}
