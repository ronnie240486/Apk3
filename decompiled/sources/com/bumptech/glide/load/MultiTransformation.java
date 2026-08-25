package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes2.dex */
public class MultiTransformation<T> implements com.bumptech.glide.load.Transformation<T> {
    private final java.util.Collection<? extends com.bumptech.glide.load.Transformation<T>> transformations;

    public MultiTransformation(@androidx.annotation.NonNull java.util.Collection<? extends com.bumptech.glide.load.Transformation<T>> r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r1.transformations = r2
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MultiTransformation must contain at least one Transformation"
            r2.<init>(r0)
            throw r2
    }

    @java.lang.SafeVarargs
    public MultiTransformation(@androidx.annotation.NonNull com.bumptech.glide.load.Transformation<T>... r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.length
            if (r0 == 0) goto Ld
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.transformations = r2
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MultiTransformation must contain at least one Transformation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.MultiTransformation
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.MultiTransformation r2 = (com.bumptech.glide.load.MultiTransformation) r2
            java.util.Collection<? extends com.bumptech.glide.load.Transformation<T>> r0 = r1.transformations
            java.util.Collection<? extends com.bumptech.glide.load.Transformation<T>> r2 = r2.transformations
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            java.util.Collection<? extends com.bumptech.glide.load.Transformation<T>> r0 = r1.transformations
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.bumptech.glide.load.Transformation
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.Resource<T> transform(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<T> r6, int r7, int r8) {
            r4 = this;
            java.util.Collection<? extends com.bumptech.glide.load.Transformation<T>> r0 = r4.transformations
            java.util.Iterator r0 = r0.iterator()
            r1 = r6
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            com.bumptech.glide.load.Transformation r2 = (com.bumptech.glide.load.Transformation) r2
            com.bumptech.glide.load.engine.Resource r2 = r2.transform(r5, r1, r7, r8)
            if (r1 == 0) goto L28
            boolean r3 = r1.equals(r6)
            if (r3 != 0) goto L28
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L28
            r1.recycle()
        L28:
            r1 = r2
            goto L7
        L2a:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            java.util.Collection<? extends com.bumptech.glide.load.Transformation<T>> r0 = r2.transformations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.Transformation r1 = (com.bumptech.glide.load.Transformation) r1
            r1.updateDiskCacheKey(r3)
            goto L6
        L16:
            return
    }
}
