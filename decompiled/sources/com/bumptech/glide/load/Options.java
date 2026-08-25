package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes2.dex */
public final class Options implements com.bumptech.glide.load.Key {
    private final androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> values;

    public Options() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.CachedHashCodeArrayMap r0 = new com.bumptech.glide.util.CachedHashCodeArrayMap
            r0.<init>()
            r1.values = r0
            return
    }

    private static <T> void updateDiskCacheKey(@androidx.annotation.NonNull com.bumptech.glide.load.Option<T> r0, @androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull java.security.MessageDigest r2) {
            r0.update(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.Options
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.Options r2 = (com.bumptech.glide.load.Options) r2
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r2 = r2.values
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public <T> T get(@androidx.annotation.NonNull com.bumptech.glide.load.Option<T> r2) {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lf
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            java.lang.Object r2 = r0.get(r2)
            goto L13
        Lf:
            java.lang.Object r2 = r2.getDefaultValue()
        L13:
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            int r0 = r0.hashCode()
            return r0
    }

    public void putAll(@androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r2 = r2.values
            r0.putAll(r2)
            return
    }

    @androidx.annotation.NonNull
    public <T> com.bumptech.glide.load.Options set(@androidx.annotation.NonNull com.bumptech.glide.load.Option<T> r2, @androidx.annotation.NonNull T r3) {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            r0.put(r2, r3)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Options{values="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r1 = r2.values
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r4) {
            r3 = this;
            r0 = 0
        L1:
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r1 = r3.values
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r1 = r3.values
            java.lang.Object r1 = r1.keyAt(r0)
            com.bumptech.glide.load.Option r1 = (com.bumptech.glide.load.Option) r1
            androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> r2 = r3.values
            java.lang.Object r2 = r2.valueAt(r0)
            updateDiskCacheKey(r1, r2, r4)
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }
}
