package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class CodeWithScopeCodec implements org.bson.codecs.Codec<org.bson.types.CodeWithScope> {
    private final org.bson.codecs.Codec<org.bson.Document> documentCodec;

    public CodeWithScopeCodec(org.bson.codecs.Codec<org.bson.Document> r1) {
            r0 = this;
            r0.<init>()
            r0.documentCodec = r1
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.types.CodeWithScope r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.types.CodeWithScope decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            java.lang.String r0 = r3.readJavaScriptWithScope()
            org.bson.codecs.Codec<org.bson.Document> r1 = r2.documentCodec
            java.lang.Object r3 = r1.decode(r3, r4)
            org.bson.Document r3 = (org.bson.Document) r3
            org.bson.types.CodeWithScope r4 = new org.bson.types.CodeWithScope
            r4.<init>(r0, r3)
            return r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.types.CodeWithScope r2 = (org.bson.types.CodeWithScope) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r2, org.bson.types.CodeWithScope r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            java.lang.String r0 = r3.getCode()
            r2.writeJavaScriptWithScope(r0)
            org.bson.codecs.Codec<org.bson.Document> r0 = r1.documentCodec
            org.bson.Document r3 = r3.getScope()
            r0.encode(r2, r3, r4)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.types.CodeWithScope> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.types.CodeWithScope> r0 = org.bson.types.CodeWithScope.class
            return r0
    }
}
