package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonTimestampCodec implements org.bson.codecs.Codec<org.bson.BsonTimestamp> {
    public BsonTimestampCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonTimestamp r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonTimestamp decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonTimestamp r1 = r1.readTimestamp()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonTimestamp r2 = (org.bson.BsonTimestamp) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonTimestamp r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeTimestamp(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonTimestamp> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonTimestamp> r0 = org.bson.BsonTimestamp.class
            return r0
    }
}
