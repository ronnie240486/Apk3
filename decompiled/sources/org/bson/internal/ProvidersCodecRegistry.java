package org.bson.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ProvidersCodecRegistry implements org.bson.codecs.configuration.CodecRegistry, org.bson.codecs.configuration.CodecProvider, org.bson.internal.CycleDetectingCodecRegistry {
    private final org.bson.internal.CodecCache codecCache;
    private final java.util.List<org.bson.codecs.configuration.CodecProvider> codecProviders;

    public ProvidersCodecRegistry(java.util.List<? extends org.bson.codecs.configuration.CodecProvider> r3) {
            r2 = this;
            r2.<init>()
            org.bson.internal.CodecCache r0 = new org.bson.internal.CodecCache
            r0.<init>()
            r2.codecCache = r0
            if (r3 == 0) goto L14
            int r0 = r3.size()
            if (r0 <= 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            java.lang.String r1 = "codecProviders must not be null or empty"
            org.bson.assertions.Assertions.isTrueArgument(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r2.codecProviders = r0
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L49
            java.lang.Class<org.bson.internal.ProvidersCodecRegistry> r2 = org.bson.internal.ProvidersCodecRegistry.class
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L10
            goto L49
        L10:
            org.bson.internal.ProvidersCodecRegistry r6 = (org.bson.internal.ProvidersCodecRegistry) r6
            java.util.List<org.bson.codecs.configuration.CodecProvider> r2 = r5.codecProviders
            int r2 = r2.size()
            java.util.List<org.bson.codecs.configuration.CodecProvider> r3 = r6.codecProviders
            int r3 = r3.size()
            if (r2 == r3) goto L21
            return r1
        L21:
            r2 = 0
        L22:
            java.util.List<org.bson.codecs.configuration.CodecProvider> r3 = r5.codecProviders
            int r3 = r3.size()
            if (r2 >= r3) goto L48
            java.util.List<org.bson.codecs.configuration.CodecProvider> r3 = r5.codecProviders
            java.lang.Object r3 = r3.get(r2)
            org.bson.codecs.configuration.CodecProvider r3 = (org.bson.codecs.configuration.CodecProvider) r3
            java.lang.Class r3 = r3.getClass()
            java.util.List<org.bson.codecs.configuration.CodecProvider> r4 = r6.codecProviders
            java.lang.Object r4 = r4.get(r2)
            org.bson.codecs.configuration.CodecProvider r4 = (org.bson.codecs.configuration.CodecProvider) r4
            java.lang.Class r4 = r4.getClass()
            if (r3 == r4) goto L45
            return r1
        L45:
            int r2 = r2 + 1
            goto L22
        L48:
            return r0
        L49:
            return r1
    }

    @Override // org.bson.codecs.configuration.CodecRegistry
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r2) {
            r1 = this;
            org.bson.internal.ChildCodecRegistry r0 = new org.bson.internal.ChildCodecRegistry
            r0.<init>(r1, r2)
            org.bson.codecs.Codec r2 = r1.get(r0)
            return r2
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r3, org.bson.codecs.configuration.CodecRegistry r4) {
            r2 = this;
            java.util.List<org.bson.codecs.configuration.CodecProvider> r0 = r2.codecProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            org.bson.codecs.configuration.CodecProvider r1 = (org.bson.codecs.configuration.CodecProvider) r1
            org.bson.codecs.Codec r1 = r1.get(r3, r4)
            if (r1 == 0) goto L6
            return r1
        L19:
            r3 = 0
            return r3
    }

    @Override // org.bson.internal.CycleDetectingCodecRegistry
    public <T> org.bson.codecs.Codec<T> get(org.bson.internal.ChildCodecRegistry<T> r4) {
            r3 = this;
            org.bson.internal.CodecCache r0 = r3.codecCache
            java.lang.Class r1 = r4.getCodecClass()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L3c
            java.util.List<org.bson.codecs.configuration.CodecProvider> r0 = r3.codecProviders
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            org.bson.codecs.configuration.CodecProvider r1 = (org.bson.codecs.configuration.CodecProvider) r1
            java.lang.Class r2 = r4.getCodecClass()
            org.bson.codecs.Codec r1 = r1.get(r2, r4)
            if (r1 == 0) goto L12
            org.bson.internal.CodecCache r0 = r3.codecCache
            java.lang.Class r4 = r4.getCodecClass()
            r0.put(r4, r1)
            return r1
        L32:
            org.bson.internal.CodecCache r0 = r3.codecCache
            java.lang.Class r1 = r4.getCodecClass()
            r2 = 0
            r0.put(r1, r2)
        L3c:
            org.bson.internal.CodecCache r0 = r3.codecCache
            java.lang.Class r4 = r4.getCodecClass()
            org.bson.codecs.Codec r4 = r0.getOrThrow(r4)
            return r4
    }

    public int hashCode() {
            r1 = this;
            java.util.List<org.bson.codecs.configuration.CodecProvider> r0 = r1.codecProviders
            int r0 = r0.hashCode()
            return r0
    }
}
