package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class UuidCodecProvider implements org.bson.codecs.configuration.CodecProvider {
    private org.bson.UuidRepresentation uuidRepresentation;

    public UuidCodecProvider(org.bson.UuidRepresentation r1) {
            r0 = this;
            r0.<init>()
            r0.uuidRepresentation = r1
            return
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r1, org.bson.codecs.configuration.CodecRegistry r2) {
            r0 = this;
            java.lang.Class<java.util.UUID> r2 = java.util.UUID.class
            if (r1 != r2) goto Lc
            org.bson.codecs.UuidCodec r1 = new org.bson.codecs.UuidCodec
            org.bson.UuidRepresentation r2 = r0.uuidRepresentation
            r1.<init>(r2)
            return r1
        Lc:
            r1 = 0
            return r1
    }
}
