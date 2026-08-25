package org.bson.codecs.configuration;

/* JADX INFO: loaded from: classes.dex */
final class MapOfCodecsProvider implements org.bson.codecs.configuration.CodecProvider {
    private final java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> codecsMap;

    public MapOfCodecsProvider(java.util.List<? extends org.bson.codecs.Codec<?>> r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.codecsMap = r0
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r4.next()
            org.bson.codecs.Codec r0 = (org.bson.codecs.Codec) r0
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r1 = r3.codecsMap
            java.lang.Class r2 = r0.getEncoderClass()
            r1.put(r2, r0)
            goto Le
        L24:
            return
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r1, org.bson.codecs.configuration.CodecRegistry r2) {
            r0 = this;
            java.util.Map<java.lang.Class<?>, org.bson.codecs.Codec<?>> r2 = r0.codecsMap
            java.lang.Object r1 = r2.get(r1)
            org.bson.codecs.Codec r1 = (org.bson.codecs.Codec) r1
            return r1
    }
}
