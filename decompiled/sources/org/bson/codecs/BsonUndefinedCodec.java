package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonUndefinedCodec implements org.bson.codecs.Codec<org.bson.BsonUndefined> {
    public BsonUndefinedCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonUndefined r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonUndefined decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            r1.readUndefined()
            org.bson.BsonUndefined r1 = new org.bson.BsonUndefined
            r1.<init>()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonUndefined r2 = (org.bson.BsonUndefined) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.BsonUndefined r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r1.writeUndefined()
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonUndefined> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonUndefined> r0 = org.bson.BsonUndefined.class
            return r0
    }
}
