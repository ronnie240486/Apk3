package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class StringCodec implements org.bson.codecs.Codec<java.lang.String> {
    public StringCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.String r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.String decode(org.bson.BsonReader r2, org.bson.codecs.DecoderContext r3) {
            r1 = this;
            org.bson.BsonType r3 = r2.getCurrentBsonType()
            org.bson.BsonType r0 = org.bson.BsonType.SYMBOL
            if (r3 != r0) goto Ld
            java.lang.String r2 = r2.readSymbol()
            return r2
        Ld:
            java.lang.String r2 = r2.readString()
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, java.lang.String r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeString(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.String> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            return r0
    }
}
