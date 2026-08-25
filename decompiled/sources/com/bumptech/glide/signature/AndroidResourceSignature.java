package com.bumptech.glide.signature;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidResourceSignature implements com.bumptech.glide.load.Key {
    private final com.bumptech.glide.load.Key applicationVersion;
    private final int nightMode;

    private AndroidResourceSignature(int r1, com.bumptech.glide.load.Key r2) {
            r0 = this;
            r0.<init>()
            r0.nightMode = r1
            r0.applicationVersion = r2
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.Key obtain(@androidx.annotation.NonNull android.content.Context r2) {
            com.bumptech.glide.load.Key r0 = com.bumptech.glide.signature.ApplicationVersionSignature.obtain(r2)
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            com.bumptech.glide.signature.AndroidResourceSignature r1 = new com.bumptech.glide.signature.AndroidResourceSignature
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.signature.AndroidResourceSignature
            r1 = 0
            if (r0 == 0) goto L18
            com.bumptech.glide.signature.AndroidResourceSignature r4 = (com.bumptech.glide.signature.AndroidResourceSignature) r4
            int r0 = r3.nightMode
            int r2 = r4.nightMode
            if (r0 != r2) goto L18
            com.bumptech.glide.load.Key r0 = r3.applicationVersion
            com.bumptech.glide.load.Key r4 = r4.applicationVersion
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r2 = this;
            com.bumptech.glide.load.Key r0 = r2.applicationVersion
            int r1 = r2.nightMode
            int r0 = com.bumptech.glide.util.Util.hashCode(r0, r1)
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            com.bumptech.glide.load.Key r0 = r2.applicationVersion
            r0.updateDiskCacheKey(r3)
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.nightMode
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r3.update(r0)
            return
    }
}
