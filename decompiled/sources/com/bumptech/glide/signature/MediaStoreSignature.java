package com.bumptech.glide.signature;

/* JADX INFO: loaded from: classes.dex */
public class MediaStoreSignature implements com.bumptech.glide.load.Key {
    private final long dateModified;

    @androidx.annotation.NonNull
    private final java.lang.String mimeType;
    private final int orientation;

    public MediaStoreSignature(@androidx.annotation.Nullable java.lang.String r1, long r2, int r4) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
        L7:
            r0.mimeType = r1
            r0.dateModified = r2
            r0.orientation = r4
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L30
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L12
            goto L30
        L12:
            com.bumptech.glide.signature.MediaStoreSignature r8 = (com.bumptech.glide.signature.MediaStoreSignature) r8
            long r2 = r7.dateModified
            long r4 = r8.dateModified
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1d
            return r1
        L1d:
            int r2 = r7.orientation
            int r3 = r8.orientation
            if (r2 == r3) goto L24
            return r1
        L24:
            java.lang.String r2 = r7.mimeType
            java.lang.String r8 = r8.mimeType
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L2f
            return r1
        L2f:
            return r0
        L30:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.mimeType
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r5.dateModified
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.orientation
            int r0 = r0 + r1
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r4) {
            r3 = this;
            r0 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long r1 = r3.dateModified
            java.nio.ByteBuffer r0 = r0.putLong(r1)
            int r1 = r3.orientation
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r4.update(r0)
            java.lang.String r0 = r3.mimeType
            java.nio.charset.Charset r1 = com.bumptech.glide.load.Key.CHARSET
            byte[] r0 = r0.getBytes(r1)
            r4.update(r0)
            return
    }
}
