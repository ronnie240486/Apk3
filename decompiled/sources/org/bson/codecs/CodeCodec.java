package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class CodeCodec implements org.bson.codecs.Codec<org.bson.types.Code> {
    public CodeCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.types.Code r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.types.Code decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.types.Code r2 = new org.bson.types.Code
            java.lang.String r1 = r1.readJavaScript()
            r2.<init>(r1)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.types.Code r2 = (org.bson.types.Code) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.types.Code r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.String r2 = r2.getCode()
            r1.writeJavaScript(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.types.Code> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.types.Code> r0 = org.bson.types.Code.class
            return r0
    }
}
