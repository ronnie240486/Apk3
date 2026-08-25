package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
final class DataCacheKey implements com.bumptech.glide.load.Key {
    private final com.bumptech.glide.load.Key signature;
    private final com.bumptech.glide.load.Key sourceKey;

    public DataCacheKey(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.Key r2) {
            r0 = this;
            r0.<init>()
            r0.sourceKey = r1
            r0.signature = r2
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.DataCacheKey
            r1 = 0
            if (r0 == 0) goto L1c
            com.bumptech.glide.load.engine.DataCacheKey r4 = (com.bumptech.glide.load.engine.DataCacheKey) r4
            com.bumptech.glide.load.Key r0 = r3.sourceKey
            com.bumptech.glide.load.Key r2 = r4.sourceKey
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1c
            com.bumptech.glide.load.Key r0 = r3.signature
            com.bumptech.glide.load.Key r4 = r4.signature
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1c
            r1 = 1
        L1c:
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
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DataCacheKey{sourceKey="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.bumptech.glide.load.Key r1 = r2.sourceKey
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            com.bumptech.glide.load.Key r1 = r2.signature
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.Key r0 = r1.sourceKey
            r0.updateDiskCacheKey(r2)
            com.bumptech.glide.load.Key r0 = r1.signature
            r0.updateDiskCacheKey(r2)
            return
    }
}
