package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class AtomicBooleanCodec implements org.bson.codecs.Codec<java.util.concurrent.atomic.AtomicBoolean> {
    public AtomicBooleanCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.util.concurrent.atomic.AtomicBoolean decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            boolean r1 = r1.readBoolean()
            r2.<init>(r1)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, java.util.concurrent.atomic.AtomicBoolean r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            boolean r2 = r2.get()
            r1.writeBoolean(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r0 = java.util.concurrent.atomic.AtomicBoolean.class
            return r0
    }
}
