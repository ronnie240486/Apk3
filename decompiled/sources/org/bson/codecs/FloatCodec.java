package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class FloatCodec implements org.bson.codecs.Codec<java.lang.Float> {
    public FloatCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Float decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
            r3 = this;
            double r4 = org.bson.codecs.NumberCodecHelper.decodeDouble(r4)
            r0 = -4039728866288205824(0xc7efffffe0000000, double:-3.4028234663852886E38)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L1c
            r0 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L1c
            float r4 = (float) r4
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            return r4
        L1c:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "%s can not be converted into a Float."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Float r1 = r0.decode(r1, r2)
            return r1
    }

    public void encode(org.bson.BsonWriter r1, java.lang.Float r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            float r2 = r2.floatValue()
            double r2 = (double) r2
            r1.writeDouble(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Float> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            return r0
    }
}
