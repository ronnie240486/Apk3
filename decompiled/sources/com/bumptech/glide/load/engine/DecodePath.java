package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes2.dex */
public class DecodePath<DataType, ResourceType, Transcode> {
    private static final java.lang.String TAG = "DecodePath";
    private final java.lang.Class<DataType> dataClass;
    private final java.util.List<? extends com.bumptech.glide.load.ResourceDecoder<DataType, ResourceType>> decoders;
    private final java.lang.String failureMessage;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> listPool;
    private final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<ResourceType, Transcode> transcoder;

    /* JADX INFO: loaded from: classes.dex */
    public interface DecodeCallback<ResourceType> {
        @androidx.annotation.NonNull
        com.bumptech.glide.load.engine.Resource<ResourceType> onResourceDecoded(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<ResourceType> r1);
    }

    public DecodePath(java.lang.Class<DataType> r1, java.lang.Class<ResourceType> r2, java.lang.Class<Transcode> r3, java.util.List<? extends com.bumptech.glide.load.ResourceDecoder<DataType, ResourceType>> r4, com.bumptech.glide.load.resource.transcode.ResourceTranscoder<ResourceType, Transcode> r5, androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r6) {
            r0 = this;
            r0.<init>()
            r0.dataClass = r1
            r0.decoders = r4
            r0.transcoder = r5
            r0.listPool = r6
            java.lang.String r4 = "Failed DecodePath{"
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

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.engine.Resource<ResourceType> decodeResource(com.bumptech.glide.load.data.DataRewinder<DataType> r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.Options r11) throws com.bumptech.glide.load.engine.GlideException {
            r7 = this;
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r7.listPool
            java.lang.Object r0 = r0.acquire()
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r0
            com.bumptech.glide.load.engine.Resource r8 = r1.decodeResourceWithList(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r9 = r7.listPool
            r9.release(r0)
            return r8
        L1c:
            r8 = move-exception
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r9 = r7.listPool
            r9.release(r0)
            throw r8
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.engine.Resource<ResourceType> decodeResourceWithList(com.bumptech.glide.load.data.DataRewinder<DataType> r9, int r10, int r11, @androidx.annotation.NonNull com.bumptech.glide.load.Options r12, java.util.List<java.lang.Throwable> r13) throws com.bumptech.glide.load.engine.GlideException {
            r8 = this;
            java.util.List<? extends com.bumptech.glide.load.ResourceDecoder<DataType, ResourceType>> r0 = r8.decoders
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L50
            java.util.List<? extends com.bumptech.glide.load.ResourceDecoder<DataType, ResourceType>> r3 = r8.decoders
            java.lang.Object r3 = r3.get(r2)
            com.bumptech.glide.load.ResourceDecoder r3 = (com.bumptech.glide.load.ResourceDecoder) r3
            java.lang.Object r4 = r9.rewindAndGet()     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            boolean r4 = r3.handles(r4, r12)     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r9.rewindAndGet()     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            com.bumptech.glide.load.engine.Resource r1 = r3.decode(r4, r10, r11, r12)     // Catch: java.lang.OutOfMemoryError -> L25 java.lang.RuntimeException -> L27 java.io.IOException -> L29
            goto L4a
        L25:
            r4 = move-exception
            goto L2a
        L27:
            r4 = move-exception
            goto L2a
        L29:
            r4 = move-exception
        L2a:
            r5 = 2
            java.lang.String r6 = "DecodePath"
            boolean r5 = android.util.Log.isLoggable(r6, r5)
            if (r5 == 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Failed to decode data for "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.v(r6, r3, r4)
        L47:
            r13.add(r4)
        L4a:
            if (r1 == 0) goto L4d
            goto L50
        L4d:
            int r2 = r2 + 1
            goto L8
        L50:
            if (r1 == 0) goto L53
            return r1
        L53:
            com.bumptech.glide.load.engine.GlideException r9 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r10 = r8.failureMessage
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r13)
            r9.<init>(r10, r11)
            throw r9
    }

    public com.bumptech.glide.load.engine.Resource<Transcode> decode(com.bumptech.glide.load.data.DataRewinder<DataType> r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4, com.bumptech.glide.load.engine.DecodePath.DecodeCallback<ResourceType> r5) throws com.bumptech.glide.load.engine.GlideException {
            r0 = this;
            com.bumptech.glide.load.engine.Resource r1 = r0.decodeResource(r1, r2, r3, r4)
            com.bumptech.glide.load.engine.Resource r1 = r5.onResourceDecoded(r1)
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder<ResourceType, Transcode> r2 = r0.transcoder
            com.bumptech.glide.load.engine.Resource r1 = r2.transcode(r1, r4)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DecodePath{ dataClass="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class<DataType> r1 = r2.dataClass
            r0.append(r1)
            java.lang.String r1 = ", decoders="
            r0.append(r1)
            java.util.List<? extends com.bumptech.glide.load.ResourceDecoder<DataType, ResourceType>> r1 = r2.decoders
            r0.append(r1)
            java.lang.String r1 = ", transcoder="
            r0.append(r1)
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder<ResourceType, Transcode> r1 = r2.transcoder
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
