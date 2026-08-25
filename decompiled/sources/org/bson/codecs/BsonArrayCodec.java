package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonArrayCodec implements org.bson.codecs.Codec<org.bson.BsonArray> {
    private static final org.bson.codecs.configuration.CodecRegistry DEFAULT_REGISTRY = null;
    private final org.bson.codecs.configuration.CodecRegistry codecRegistry;

    static {
            r0 = 1
            org.bson.codecs.configuration.CodecProvider[] r0 = new org.bson.codecs.configuration.CodecProvider[r0]
            org.bson.codecs.BsonValueCodecProvider r1 = new org.bson.codecs.BsonValueCodecProvider
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.configuration.CodecRegistries.fromProviders(r0)
            org.bson.codecs.BsonArrayCodec.DEFAULT_REGISTRY = r0
            return
    }

    public BsonArrayCodec() {
            r1 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.BsonArrayCodec.DEFAULT_REGISTRY
            r1.<init>(r0)
            return
    }

    public BsonArrayCodec(org.bson.codecs.configuration.CodecRegistry r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "codecRegistry"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.configuration.CodecRegistry r2 = (org.bson.codecs.configuration.CodecRegistry) r2
            r1.codecRegistry = r2
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonArray r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonArray decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
            r3 = this;
            r4.readStartArray()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L8:
            org.bson.BsonType r1 = r4.readBsonType()
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
            if (r1 == r2) goto L28
            org.bson.codecs.configuration.CodecRegistry r1 = r3.codecRegistry
            org.bson.BsonType r2 = r4.getCurrentBsonType()
            java.lang.Class r2 = org.bson.codecs.BsonValueCodecProvider.getClassForBsonType(r2)
            org.bson.codecs.Codec r1 = r1.get(r2)
            java.lang.Object r1 = r1.decode(r4, r5)
            org.bson.BsonValue r1 = (org.bson.BsonValue) r1
            r0.add(r1)
            goto L8
        L28:
            r4.readEndArray()
            org.bson.BsonArray r4 = new org.bson.BsonArray
            r4.<init>(r0)
            return r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonArray r2 = (org.bson.BsonArray) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r4, org.bson.BsonArray r5, org.bson.codecs.EncoderContext r6) {
            r3 = this;
            r4.writeStartArray()
            java.util.Iterator r5 = r5.iterator()
        L7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r5.next()
            org.bson.BsonValue r0 = (org.bson.BsonValue) r0
            org.bson.codecs.configuration.CodecRegistry r1 = r3.codecRegistry
            java.lang.Class r2 = r0.getClass()
            org.bson.codecs.Codec r1 = r1.get(r2)
            r6.encodeWithChildContext(r1, r4, r0)
            goto L7
        L21:
            r4.writeEndArray()
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonArray> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonArray> r0 = org.bson.BsonArray.class
            return r0
    }
}
