package com.bumptech.glide.load.resource.bytes;

/* JADX INFO: loaded from: classes.dex */
public class BytesResource implements com.bumptech.glide.load.engine.Resource<byte[]> {
    private final byte[] bytes;

    public BytesResource(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            byte[] r1 = (byte[]) r1
            r0.bytes = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ byte[] get() {
            r1 = this;
            byte[] r0 = r1.get2()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public byte[] get2() {
            r1 = this;
            byte[] r0 = r1.bytes
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @androidx.annotation.NonNull
    public java.lang.Class<byte[]> getResourceClass() {
            r1 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
            r1 = this;
            byte[] r0 = r1.bytes
            int r0 = r0.length
            return r0
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
            r0 = this;
            return
    }
}
