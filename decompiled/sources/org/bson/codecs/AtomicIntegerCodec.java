package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class AtomicIntegerCodec implements org.bson.codecs.Codec<java.util.concurrent.atomic.AtomicInteger> {
    public AtomicIntegerCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.util.concurrent.atomic.AtomicInteger decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            int r1 = org.bson.codecs.NumberCodecHelper.decodeInt(r1)
            r2.<init>(r1)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, java.util.concurrent.atomic.AtomicInteger r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            int r2 = r2.intValue()
            r1.writeInt32(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.util.concurrent.atomic.AtomicInteger> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r0 = java.util.concurrent.atomic.AtomicInteger.class
            return r0
    }
}
