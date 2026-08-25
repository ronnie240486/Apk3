package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonValueCodec implements org.bson.codecs.Codec<org.bson.BsonValue> {
    private final org.bson.codecs.configuration.CodecRegistry codecRegistry;

    public BsonValueCodec() {
            r3 = this;
            r0 = 1
            org.bson.codecs.configuration.CodecProvider[] r0 = new org.bson.codecs.configuration.CodecProvider[r0]
            org.bson.codecs.BsonValueCodecProvider r1 = new org.bson.codecs.BsonValueCodecProvider
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.configuration.CodecRegistries.fromProviders(r0)
            r3.<init>(r0)
            return
    }

    public BsonValueCodec(org.bson.codecs.configuration.CodecRegistry r1) {
            r0 = this;
            r0.<init>()
            r0.codecRegistry = r1
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonValue r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonValue decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = r2.codecRegistry
            org.bson.BsonType r1 = r3.getCurrentBsonType()
            java.lang.Class r1 = org.bson.codecs.BsonValueCodecProvider.getClassForBsonType(r1)
            org.bson.codecs.Codec r0 = r0.get(r1)
            java.lang.Object r3 = r0.decode(r3, r4)
            org.bson.BsonValue r3 = (org.bson.BsonValue) r3
            return r3
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r3, org.bson.BsonValue r4, org.bson.codecs.EncoderContext r5) {
            r2 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = r2.codecRegistry
            java.lang.Class r1 = r4.getClass()
            org.bson.codecs.Codec r0 = r0.get(r1)
            r5.encodeWithChildContext(r0, r3, r4)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonValue> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonValue> r0 = org.bson.BsonValue.class
            return r0
    }
}
