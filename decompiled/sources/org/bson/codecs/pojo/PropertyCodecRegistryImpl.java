package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
class PropertyCodecRegistryImpl implements org.bson.codecs.pojo.PropertyCodecRegistry {
    private final java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> propertyCodecProviders;

    public PropertyCodecRegistryImpl(org.bson.codecs.pojo.PojoCodec<?> r2, org.bson.codecs.configuration.CodecRegistry r3, java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto Ld
            r0.addAll(r4)
        Ld:
            org.bson.codecs.pojo.CollectionPropertyCodecProvider r4 = new org.bson.codecs.pojo.CollectionPropertyCodecProvider
            r4.<init>()
            r0.add(r4)
            org.bson.codecs.pojo.MapPropertyCodecProvider r4 = new org.bson.codecs.pojo.MapPropertyCodecProvider
            r4.<init>()
            r0.add(r4)
            org.bson.codecs.pojo.EnumPropertyCodecProvider r4 = new org.bson.codecs.pojo.EnumPropertyCodecProvider
            r4.<init>(r3)
            r0.add(r4)
            org.bson.codecs.pojo.FallbackPropertyCodecProvider r4 = new org.bson.codecs.pojo.FallbackPropertyCodecProvider
            r4.<init>(r2, r3)
            r0.add(r4)
            r1.propertyCodecProviders = r0
            return
    }

    @Override // org.bson.codecs.pojo.PropertyCodecRegistry
    public <S> org.bson.codecs.Codec<S> get(org.bson.codecs.pojo.TypeWithTypeParameters<S> r3) {
            r2 = this;
            java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r0 = r2.propertyCodecProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            org.bson.codecs.pojo.PropertyCodecProvider r1 = (org.bson.codecs.pojo.PropertyCodecProvider) r1
            org.bson.codecs.Codec r1 = r1.get(r3, r2)
            if (r1 == 0) goto L6
            return r1
        L19:
            r3 = 0
            return r3
    }
}
