package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
class DataCacheWriter<DataType> implements com.bumptech.glide.load.engine.cache.DiskCache.Writer {
    private final DataType data;
    private final com.bumptech.glide.load.Encoder<DataType> encoder;
    private final com.bumptech.glide.load.Options options;

    public DataCacheWriter(com.bumptech.glide.load.Encoder<DataType> r1, DataType r2, com.bumptech.glide.load.Options r3) {
            r0 = this;
            r0.<init>()
            r0.encoder = r1
            r0.data = r2
            r0.options = r3
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public boolean write(@androidx.annotation.NonNull java.io.File r4) {
            r3 = this;
            com.bumptech.glide.load.Encoder<DataType> r0 = r3.encoder
            DataType r1 = r3.data
            com.bumptech.glide.load.Options r2 = r3.options
            boolean r4 = r0.encode(r1, r4, r2)
            return r4
    }
}
