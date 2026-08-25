package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class MaxKeyCodec implements org.bson.codecs.Codec<org.bson.types.MaxKey> {
    public MaxKeyCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.types.MaxKey r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.types.MaxKey decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            r1.readMaxKey()
            org.bson.types.MaxKey r1 = new org.bson.types.MaxKey
            r1.<init>()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.types.MaxKey r2 = (org.bson.types.MaxKey) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.types.MaxKey r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeMaxKey()
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.types.MaxKey> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.types.MaxKey> r0 = org.bson.types.MaxKey.class
            return r0
    }
}
