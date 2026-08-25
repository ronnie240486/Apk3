package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class OverridableUuidRepresentationUuidCodec extends org.bson.codecs.UuidCodec implements org.bson.codecs.OverridableUuidRepresentationCodec<java.util.UUID> {
    public OverridableUuidRepresentationUuidCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public OverridableUuidRepresentationUuidCodec(org.bson.UuidRepresentation r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.bson.codecs.OverridableUuidRepresentationCodec
    public org.bson.codecs.Codec<java.util.UUID> withUuidRepresentation(org.bson.UuidRepresentation r2) {
            r1 = this;
            org.bson.codecs.OverridableUuidRepresentationUuidCodec r0 = new org.bson.codecs.OverridableUuidRepresentationUuidCodec
            r0.<init>(r2)
            return r0
    }
}
