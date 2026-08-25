package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
class EngineKey implements com.bumptech.glide.load.Key {
    private int hashCode;
    private final int height;
    private final java.lang.Object model;
    private final com.bumptech.glide.load.Options options;
    private final java.lang.Class<?> resourceClass;
    private final com.bumptech.glide.load.Key signature;
    private final java.lang.Class<?> transcodeClass;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> transformations;
    private final int width;

    public EngineKey(java.lang.Object r1, com.bumptech.glide.load.Key r2, int r3, int r4, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r5, java.lang.Class<?> r6, java.lang.Class<?> r7, com.bumptech.glide.load.Options r8) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            r0.model = r1
            java.lang.String r1 = "Signature must not be null"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r2, r1)
            com.bumptech.glide.load.Key r1 = (com.bumptech.glide.load.Key) r1
            r0.signature = r1
            r0.width = r3
            r0.height = r4
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r5)
            java.util.Map r1 = (java.util.Map) r1
            r0.transformations = r1
            java.lang.String r1 = "Resource class must not be null"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r6, r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.resourceClass = r1
            java.lang.String r1 = "Transcode class must not be null"
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r7, r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.transcodeClass = r1
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r8)
            com.bumptech.glide.load.Options r1 = (com.bumptech.glide.load.Options) r1
            r0.options = r1
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.EngineKey
            r1 = 0
            if (r0 == 0) goto L50
            com.bumptech.glide.load.engine.EngineKey r4 = (com.bumptech.glide.load.engine.EngineKey) r4
            java.lang.Object r0 = r3.model
            java.lang.Object r2 = r4.model
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            com.bumptech.glide.load.Key r0 = r3.signature
            com.bumptech.glide.load.Key r2 = r4.signature
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            int r0 = r3.height
            int r2 = r4.height
            if (r0 != r2) goto L50
            int r0 = r3.width
            int r2 = r4.width
            if (r0 != r2) goto L50
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r3.transformations
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r2 = r4.transformations
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            java.lang.Class<?> r0 = r3.resourceClass
            java.lang.Class<?> r2 = r4.resourceClass
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            java.lang.Class<?> r0 = r3.transcodeClass
            java.lang.Class<?> r2 = r4.transcodeClass
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            com.bumptech.glide.load.Options r0 = r3.options
            com.bumptech.glide.load.Options r4 = r4.options
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L50
            r1 = 1
        L50:
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L4d
            java.lang.Object r0 = r2.model
            int r0 = r0.hashCode()
            r2.hashCode = r0
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
            r2.hashCode = r1
            int r1 = r1 * 31
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r0 = r2.transformations
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            r2.hashCode = r0
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.resourceClass
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.hashCode = r1
            int r1 = r1 * 31
            java.lang.Class<?> r0 = r2.transcodeClass
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            r2.hashCode = r0
            int r0 = r0 * 31
            com.bumptech.glide.load.Options r1 = r2.options
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.hashCode = r1
        L4d:
            int r0 = r2.hashCode
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "EngineKey{model="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Object r1 = r2.model
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.width
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.height
            r0.append(r1)
            java.lang.String r1 = ", resourceClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.resourceClass
            r0.append(r1)
            java.lang.String r1 = ", transcodeClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.transcodeClass
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            com.bumptech.glide.load.Key r1 = r2.signature
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r2.hashCode
            r0.append(r1)
            java.lang.String r1 = ", transformations="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r1 = r2.transformations
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
    public void updateDiskCacheKey(@androidx.annotation.NonNull java.security.MessageDigest r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
