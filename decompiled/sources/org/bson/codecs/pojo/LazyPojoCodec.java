package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
class LazyPojoCodec<T> extends org.bson.codecs.pojo.PojoCodec<T> {
    private final org.bson.codecs.pojo.ClassModel<T> classModel;
    private final java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> codecCache;
    private final org.bson.codecs.pojo.DiscriminatorLookup discriminatorLookup;
    private volatile org.bson.codecs.pojo.PojoCodecImpl<T> pojoCodec;
    private final org.bson.codecs.pojo.PropertyCodecRegistry propertyCodecRegistry;
    private final org.bson.codecs.configuration.CodecRegistry registry;

    public LazyPojoCodec(org.bson.codecs.pojo.ClassModel<T> r1, org.bson.codecs.configuration.CodecRegistry r2, org.bson.codecs.pojo.PropertyCodecRegistry r3, org.bson.codecs.pojo.DiscriminatorLookup r4, java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> r5) {
            r0 = this;
            r0.<init>()
            r0.classModel = r1
            r0.registry = r2
            r0.propertyCodecRegistry = r3
            r0.discriminatorLookup = r4
            r0.codecCache = r5
            return
    }

    private org.bson.codecs.Codec<T> getPojoCodec() {
            r7 = this;
            org.bson.codecs.pojo.PojoCodecImpl<T> r0 = r7.pojoCodec
            if (r0 != 0) goto L16
            org.bson.codecs.pojo.PojoCodecImpl r0 = new org.bson.codecs.pojo.PojoCodecImpl
            org.bson.codecs.pojo.ClassModel<T> r2 = r7.classModel
            org.bson.codecs.configuration.CodecRegistry r3 = r7.registry
            org.bson.codecs.pojo.PropertyCodecRegistry r4 = r7.propertyCodecRegistry
            org.bson.codecs.pojo.DiscriminatorLookup r5 = r7.discriminatorLookup
            java.util.concurrent.ConcurrentMap<org.bson.codecs.pojo.ClassModel<?>, org.bson.codecs.Codec<?>> r6 = r7.codecCache
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.pojoCodec = r0
        L16:
            org.bson.codecs.pojo.PojoCodecImpl<T> r0 = r7.pojoCodec
            return r0
    }

    @Override // org.bson.codecs.Decoder
    public T decode(org.bson.BsonReader r2, org.bson.codecs.DecoderContext r3) {
            r1 = this;
            org.bson.codecs.Codec r0 = r1.getPojoCodec()
            java.lang.Object r2 = r0.decode(r2, r3)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public void encode(org.bson.BsonWriter r2, T r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            org.bson.codecs.Codec r0 = r1.getPojoCodec()
            r0.encode(r2, r3, r4)
            return
    }

    @Override // org.bson.codecs.pojo.PojoCodec
    public final org.bson.codecs.pojo.ClassModel<T> getClassModel() {
            r1 = this;
            org.bson.codecs.pojo.ClassModel<T> r0 = r1.classModel
            return r0
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<T> getEncoderClass() {
            r1 = this;
            org.bson.codecs.pojo.ClassModel<T> r0 = r1.classModel
            java.lang.Class r0 = r0.getType()
            return r0
    }
}
