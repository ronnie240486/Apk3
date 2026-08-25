package org.bson.internal;

/* JADX INFO: loaded from: classes2.dex */
final class CodecCache {
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, org.bson.internal.Optional<? extends org.bson.codecs.Codec<?>>> codecCache;

    public CodecCache() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.codecCache = r0
            return
    }

    public boolean containsKey(java.lang.Class<?> r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, org.bson.internal.Optional<? extends org.bson.codecs.Codec<?>>> r0 = r1.codecCache
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public <T> org.bson.codecs.Codec<T> getOrThrow(java.lang.Class<T> r4) {
            r3 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, org.bson.internal.Optional<? extends org.bson.codecs.Codec<?>>> r0 = r3.codecCache
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L1d
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, org.bson.internal.Optional<? extends org.bson.codecs.Codec<?>>> r0 = r3.codecCache
            java.lang.Object r0 = r0.get(r4)
            org.bson.internal.Optional r0 = (org.bson.internal.Optional) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1d
            java.lang.Object r4 = r0.get()
            org.bson.codecs.Codec r4 = (org.bson.codecs.Codec) r4
            return r4
        L1d:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Can't find a codec for %s."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public void put(java.lang.Class<?> r2, org.bson.codecs.Codec<?> r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, org.bson.internal.Optional<? extends org.bson.codecs.Codec<?>>> r0 = r1.codecCache
            org.bson.internal.Optional r3 = org.bson.internal.Optional.of(r3)
            r0.put(r2, r3)
            return
    }
}
