package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class BsonCodecProvider implements org.bson.codecs.configuration.CodecProvider {
    public BsonCodecProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r2, org.bson.codecs.configuration.CodecRegistry r3) {
            r1 = this;
            java.lang.Class<org.bson.conversions.Bson> r0 = org.bson.conversions.Bson.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto Le
            org.bson.codecs.BsonCodec r2 = new org.bson.codecs.BsonCodec
            r2.<init>(r3)
            return r2
        Le:
            r2 = 0
            return r2
    }
}
