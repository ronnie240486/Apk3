package org.bson.codecs.jsr310;

/* JADX INFO: loaded from: classes.dex */
public class InstantCodec extends org.bson.codecs.jsr310.DateTimeBasedCodec<java.time.Instant> {
    public InstantCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.time.Instant r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.time.Instant decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            long r1 = r0.validateAndReadDateTime(r1)
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.time.Instant r2 = (java.time.Instant) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r3, java.time.Instant r4, org.bson.codecs.EncoderContext r5) {
            r2 = this;
            long r0 = r4.toEpochMilli()     // Catch: java.lang.ArithmeticException -> L8
            r3.writeDateTime(r0)     // Catch: java.lang.ArithmeticException -> L8
            return
        L8:
            r3 = move-exception
            org.bson.codecs.configuration.CodecConfigurationException r5 = new org.bson.codecs.configuration.CodecConfigurationException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            java.lang.String r1 = r3.getMessage()
            r0[r4] = r1
            java.lang.String r4 = "Unsupported Instant value '%s' could not be converted to milliseconds: %s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r5.<init>(r4, r3)
            throw r5
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.time.Instant> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.time.Instant> r0 = java.time.Instant.class
            return r0
    }
}
