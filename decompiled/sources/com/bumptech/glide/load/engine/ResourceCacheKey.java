package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
final class ResourceCacheKey implements com.bumptech.glide.load.Key {
    private static final com.bumptech.glide.util.LruCache<java.lang.Class<?>, byte[]> RESOURCE_CLASS_BYTES = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private final java.lang.Class<?> decodedResourceClass;
    private final int height;
    private final com.bumptech.glide.load.Options options;
    private final com.bumptech.glide.load.Key signature;
    private final com.bumptech.glide.load.Key sourceKey;
    private final com.bumptech.glide.load.Transformation<?> transformation;
    private final int width;

    static {
            com.bumptech.glide.util.LruCache r0 = new com.bumptech.glide.util.LruCache
            r1 = 50
            r0.<init>(r1)
            com.bumptech.glide.load.engine.ResourceCacheKey.RESOURCE_CLASS_BYTES = r0
            return
    }

    public ResourceCacheKey(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1, com.bumptech.glide.load.Key r2, com.bumptech.glide.load.Key r3, int r4, int r5, com.bumptech.glide.load.Transformation<?> r6, java.lang.Class<?> r7, com.bumptech.glide.load.Options r8) {
            r0 = this;
            r0.<init>()
            r0.arrayPool = r1
            r0.sourceKey = r2
            r0.signature = r3
            r0.width = r4
            r0.height = r5
            r0.transformation = r6
            r0.decodedResourceClass = r7
            r0.options = r8
            return
    }

    private byte[] getResourceClassBytes() {
            r3 = this;
            com.bumptech.glide.util.LruCache<java.lang.Class<?>, byte[]> r0 = com.bumptech.glide.load.engine.ResourceCacheKey.RESOURCE_CLASS_BYTES
            java.lang.Class<?> r1 = r3.decodedResourceClass
            java.lang.Object r1 = r0.get(r1)
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L1d
            java.lang.Class<?> r1 = r3.decodedResourceClass
            java.lang.String r1 = r1.getName()
            java.nio.charset.Charset r2 = com.bumptech.glide.load.Key.CHARSET
            byte[] r1 = r1.getBytes(r2)
            java.lang.Class<?> r2 = r3.decodedResourceClass
            r0.put(r2, r1)
        L1d:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.ResourceCacheKey
            r1 = 0
            if (r0 == 0) goto L46
            com.bumptech.glide.load.engine.ResourceCacheKey r4 = (com.bumptech.glide.load.engine.ResourceCacheKey) r4
            int r0 = r3.height
            int r2 = r4.height
            if (r0 != r2) goto L46
            int r0 = r3.width
            int r2 = r4.width
            if (r0 != r2) goto L46
            com.bumptech.glide.load.Transformation<?> r0 = r3.transformation
            com.bumptech.glide.load.Transformation<?> r2 = r4.transformation
            boolean r0 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r2)
            if (r0 == 0) goto L46
            java.lang.Class<?> r0 = r3.decodedResourceClass
            java.lang.Class<?> r2 = r4.decodedResourceClass
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            com.bumptech.glide.load.Key r0 = r3.sourceKey
            com.bumptech.glide.load.Key r2 = r4.sourceKey
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            com.bumptech.glide.load.Key r0 = r3.signature
            com.bumptech.glide.load.Key r2 = r4.signature
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            com.bumptech.glide.load.Options r0 = r3.options
            com.bumptech.glide.load.Options r4 = r4.options
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L46
            r1 = 1
        L46:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r2 = this;
            com.bumptech.glide.load.Key r0 = r2.sourceKey
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.bumptech.glide.load.Key r1 = r2.signature
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.width
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.height
            int r1 = r1 + r0
            com.bumptech.glide.load.Transformation<?> r0 = r2.transformation
            if (r0 == 0) goto L24
            int r1 = r1 * 31
            int r0 = r0.hashCode()
            int r1 = r1 + r0
        L24:
            int r1 = r1 * 31
            java.lang.Class<?> r0 = r2.decodedResourceClass
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.bumptech.glide.load.Options r1 = r2.options
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ResourceCacheKey{sourceKey="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.bumptech.glide.load.Key r1 = r2.sourceKey
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            com.bumptech.glide.load.Key r1 = r2.signature
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.width
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.height
            r0.append(r1)
            java.lang.String r1 = ", decodedResourceClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.decodedResourceClass
            r0.append(r1)
            java.lang.String r1 = ", transformation='"
            r0.append(r1)
            com.bumptech.glide.load.Transformation<?> r1 = r2.transformation
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", options="
            r0.append(r1)
            com.bumptech.glide.load.Options r1 = r2.options
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r4) {
            r3 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r3.arrayPool
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 8
            java.lang.Object r0 = r0.getExact(r2, r1)
            byte[] r0 = (byte[]) r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            int r2 = r3.width
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            int r2 = r3.height
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            r1.array()
            com.bumptech.glide.load.Key r1 = r3.signature
            r1.updateDiskCacheKey(r4)
            com.bumptech.glide.load.Key r1 = r3.sourceKey
            r1.updateDiskCacheKey(r4)
            r4.update(r0)
            com.bumptech.glide.load.Transformation<?> r1 = r3.transformation
            if (r1 == 0) goto L33
            r1.updateDiskCacheKey(r4)
        L33:
            com.bumptech.glide.load.Options r1 = r3.options
            r1.updateDiskCacheKey(r4)
            byte[] r1 = r3.getResourceClassBytes()
            r4.update(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r4 = r3.arrayPool
            r4.put(r0)
            return
    }
}
