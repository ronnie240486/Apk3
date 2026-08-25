package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class ByteCodec implements org.bson.codecs.Codec<java.lang.Byte> {
    public ByteCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Byte decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            int r3 = org.bson.codecs.NumberCodecHelper.decodeInt(r3)
            r4 = -128(0xffffffffffffff80, float:NaN)
            if (r3 < r4) goto L12
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 > r4) goto L12
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L12:
            org.bson.BsonInvalidOperationException r4 = new org.bson.BsonInvalidOperationException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            java.lang.String r3 = "%s can not be converted into a Byte."
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r4.<init>(r3)
            throw r4
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Byte r1 = r0.decode(r1, r2)
            return r1
    }

    public void encode(org.bson.BsonWriter r1, java.lang.Byte r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            byte r2 = r2.byteValue()
            r1.writeInt32(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Byte r2 = (java.lang.Byte) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Byte> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            return r0
    }
}
