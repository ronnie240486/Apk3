package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteArrayAdapter implements com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface<byte[]> {
    private static final java.lang.String TAG = "ByteArrayPool";

    public ByteArrayAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public /* bridge */ /* synthetic */ int getArrayLength(byte[] r1) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            int r1 = r0.getArrayLength2(r1)
            return r1
    }

    /* JADX INFO: renamed from: getArrayLength, reason: avoid collision after fix types in other method */
    public int getArrayLength2(byte[] r1) {
            r0 = this;
            int r1 = r1.length
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public int getElementSizeInBytes() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = "ByteArrayPool"
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public /* bridge */ /* synthetic */ byte[] newArray(int r1) {
            r0 = this;
            byte[] r1 = r0.newArray2(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
    public byte[] newArray2(int r1) {
            r0 = this;
            byte[] r1 = new byte[r1]
            return r1
    }
}
