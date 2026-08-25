package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class AtomicLongCodec implements org.bson.codecs.Codec<java.util.concurrent.atomic.AtomicLong> {
    public AtomicLongCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicLong r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.util.concurrent.atomic.AtomicLong decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            long r0 = org.bson.codecs.NumberCodecHelper.decodeLong(r3)
            r4.<init>(r0)
            return r4
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, java.util.concurrent.atomic.AtomicLong r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            long r2 = r2.longValue()
            r1.writeInt64(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.util.concurrent.atomic.AtomicLong> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r0 = java.util.concurrent.atomic.AtomicLong.class
            return r0
    }
}
