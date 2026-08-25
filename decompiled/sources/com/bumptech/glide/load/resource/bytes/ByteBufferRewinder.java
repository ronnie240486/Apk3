package com.bumptech.glide.load.resource.bytes;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferRewinder implements com.bumptech.glide.load.data.DataRewinder<java.nio.ByteBuffer> {
    private final java.nio.ByteBuffer buffer;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory<java.nio.ByteBuffer> {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.data.DataRewinder<java.nio.ByteBuffer> build(java.nio.ByteBuffer r1) {
                r0 = this;
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                com.bumptech.glide.load.data.DataRewinder r1 = r0.build2(r1)
                return r1
        }

        @androidx.annotation.NonNull
        /* JADX INFO: renamed from: build, reason: avoid collision after fix types in other method */
        public com.bumptech.glide.load.data.DataRewinder<java.nio.ByteBuffer> build2(java.nio.ByteBuffer r2) {
                r1 = this;
                com.bumptech.glide.load.resource.bytes.ByteBufferRewinder r0 = new com.bumptech.glide.load.resource.bytes.ByteBufferRewinder
                r0.<init>(r2)
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @androidx.annotation.NonNull
        public java.lang.Class<java.nio.ByteBuffer> getDataClass() {
                r1 = this;
                java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
                return r0
        }
    }

    public ByteBufferRewinder(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            return
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.nio.ByteBuffer rewindAndGet() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.rewindAndGet2()
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    @androidx.annotation.NonNull
    /* JADX INFO: renamed from: rewindAndGet, reason: avoid collision after fix types in other method */
    public java.nio.ByteBuffer rewindAndGet2() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            r1 = 0
            r0.position(r1)
            java.nio.ByteBuffer r0 = r2.buffer
            return r0
    }
}
