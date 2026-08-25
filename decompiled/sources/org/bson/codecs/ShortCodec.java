package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class ShortCodec implements org.bson.codecs.Codec<java.lang.Short> {
    public ShortCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Short r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Short decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            int r3 = org.bson.codecs.NumberCodecHelper.decodeInt(r3)
            r4 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 < r4) goto L12
            r4 = 32767(0x7fff, float:4.5916E-41)
            if (r3 > r4) goto L12
            short r3 = (short) r3
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L12:
            org.bson.BsonInvalidOperationException r4 = new org.bson.BsonInvalidOperationException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            java.lang.String r3 = "%s can not be converted into a Short."
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r4.<init>(r3)
            throw r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Short r2 = (java.lang.Short) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, java.lang.Short r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            short r2 = r2.shortValue()
            r1.writeInt32(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Short> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            return r0
    }
}
