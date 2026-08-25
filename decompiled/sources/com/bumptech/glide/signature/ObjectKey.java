package com.bumptech.glide.signature;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectKey implements com.bumptech.glide.load.Key {
    private final java.lang.Object object;

    public ObjectKey(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            r0.object = r1
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.signature.ObjectKey
            if (r0 == 0) goto Lf
            com.bumptech.glide.signature.ObjectKey r2 = (com.bumptech.glide.signature.ObjectKey) r2
            java.lang.Object r0 = r1.object
            java.lang.Object r2 = r2.object
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.object
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ObjectKey{object="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Object r1 = r2.object
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            java.lang.Object r0 = r2.object
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = com.bumptech.glide.load.Key.CHARSET
            byte[] r0 = r0.getBytes(r1)
            r3.update(r0)
            return
    }
}
