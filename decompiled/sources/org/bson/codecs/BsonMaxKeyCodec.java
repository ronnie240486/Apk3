package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonMaxKeyCodec implements org.bson.codecs.Codec<org.bson.BsonMaxKey> {
    public BsonMaxKeyCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonMaxKey r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonMaxKey decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            r1.readMaxKey()
            org.bson.BsonMaxKey r1 = new org.bson.BsonMaxKey
            r1.<init>()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonMaxKey r2 = (org.bson.BsonMaxKey) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonMaxKey r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeMaxKey()
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonMaxKey> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonMaxKey> r0 = org.bson.BsonMaxKey.class
            return r0
    }
}
