package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonBooleanCodec implements org.bson.codecs.Codec<org.bson.BsonBoolean> {
    public BsonBooleanCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonBoolean r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonBoolean decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            boolean r1 = r1.readBoolean()
            org.bson.BsonBoolean r1 = org.bson.BsonBoolean.valueOf(r1)
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonBoolean r2 = (org.bson.BsonBoolean) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonBoolean r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            boolean r2 = r2.getValue()
            r1.writeBoolean(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonBoolean> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonBoolean> r0 = org.bson.BsonBoolean.class
            return r0
    }
}
