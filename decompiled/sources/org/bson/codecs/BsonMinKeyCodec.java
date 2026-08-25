package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonMinKeyCodec implements org.bson.codecs.Codec<org.bson.BsonMinKey> {
    public BsonMinKeyCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonMinKey r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonMinKey decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            r1.readMinKey()
            org.bson.BsonMinKey r1 = new org.bson.BsonMinKey
            r1.<init>()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonMinKey r2 = (org.bson.BsonMinKey) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonMinKey r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeMinKey()
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonMinKey> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonMinKey> r0 = org.bson.BsonMinKey.class
            return r0
    }
}
