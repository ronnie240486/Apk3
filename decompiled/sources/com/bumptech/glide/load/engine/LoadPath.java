package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public class LoadPath<Data, ResourceType, Transcode> {
    private final java.lang.Class<Data> dataClass;
    private final java.util.List<? extends com.bumptech.glide.load.engine.DecodePath<Data, ResourceType, Transcode>> decodePaths;
    private final java.lang.String failureMessage;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> listPool;

    public LoadPath(java.lang.Class<Data> r1, java.lang.Class<ResourceType> r2, java.lang.Class<Transcode> r3, java.util.List<com.bumptech.glide.load.engine.DecodePath<Data, ResourceType, Transcode>> r4, androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r5) {
            r0 = this;
            r0.<init>()
            r0.dataClass = r1
            r0.listPool = r5
            java.util.Collection r4 = com.bumptech.glide.util.Preconditions.checkNotEmpty(r4)
            java.util.List r4 = (java.util.List) r4
            r0.decodePaths = r4
            java.lang.String r4 = "Failed LoadPath{"
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "->"
            r4.append(r1)
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r3.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "}"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.failureMessage = r1
            return
    }

    private com.bumptech.glide.load.engine.Resource<Transcode> loadWithExceptionList(com.bumptech.glide.load.data.DataRewinder<Data> r13, @androidx.annotation.NonNull com.bumptech.glide.load.Options r14, int r15, int r16, com.bumptech.glide.load.engine.DecodePath.DecodeCallback<ResourceType> r17, java.util.List<java.lang.Throwable> r18) throws com.bumptech.glide.load.engine.GlideException {
            r12 = this;
            r1 = r12
            r2 = r18
            java.util.List<? extends com.bumptech.glide.load.engine.DecodePath<Data, ResourceType, Transcode>> r0 = r1.decodePaths
            int r3 = r0.size()
            r0 = 0
            r4 = 0
            r4 = r0
            r5 = 0
        Ld:
            if (r5 >= r3) goto L30
            java.util.List<? extends com.bumptech.glide.load.engine.DecodePath<Data, ResourceType, Transcode>> r0 = r1.decodePaths
            java.lang.Object r0 = r0.get(r5)
            r6 = r0
            com.bumptech.glide.load.engine.DecodePath r6 = (com.bumptech.glide.load.engine.DecodePath) r6
            r7 = r13
            r8 = r15
            r9 = r16
            r10 = r14
            r11 = r17
            com.bumptech.glide.load.engine.Resource r0 = r6.decode(r7, r8, r9, r10, r11)     // Catch: com.bumptech.glide.load.engine.GlideException -> L25
            r4 = r0
            goto L2a
        L25:
            r0 = move-exception
            r6 = r0
            r2.add(r6)
        L2a:
            if (r4 == 0) goto L2d
            goto L30
        L2d:
            int r5 = r5 + 1
            goto Ld
        L30:
            if (r4 == 0) goto L33
            return r4
        L33:
            com.bumptech.glide.load.engine.GlideException r0 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r3 = r1.failureMessage
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r0.<init>(r3, r4)
            throw r0
    }

    public java.lang.Class<Data> getDataClass() {
            r1 = this;
            java.lang.Class<Data> r0 = r1.dataClass
            return r0
    }

    public com.bumptech.glide.load.engine.Resource<Transcode> load(com.bumptech.glide.load.data.DataRewinder<Data> r9, @androidx.annotation.NonNull com.bumptech.glide.load.Options r10, int r11, int r12, com.bumptech.glide.load.engine.DecodePath.DecodeCallback<ResourceType> r13) throws com.bumptech.glide.load.engine.GlideException {
            r8 = this;
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r8.listPool
            java.lang.Object r0 = r0.acquire()
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r0
            com.bumptech.glide.load.engine.Resource r9 = r1.loadWithExceptionList(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1d
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r10 = r8.listPool
            r10.release(r0)
            return r9
        L1d:
            r9 = move-exception
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r10 = r8.listPool
            r10.release(r0)
            throw r9
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "LoadPath{decodePaths="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<? extends com.bumptech.glide.load.engine.DecodePath<Data, ResourceType, Transcode>> r1 = r2.decodePaths
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
