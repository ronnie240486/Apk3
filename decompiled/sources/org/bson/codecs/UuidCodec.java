package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class UuidCodec implements org.bson.codecs.Codec<java.util.UUID> {
    private final org.bson.UuidRepresentation uuidRepresentation;

    public UuidCodec() {
            r1 = this;
            r1.<init>()
            org.bson.UuidRepresentation r0 = org.bson.UuidRepresentation.JAVA_LEGACY
            r1.uuidRepresentation = r0
            return
    }

    public UuidCodec(org.bson.UuidRepresentation r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "uuidRepresentation"
            org.bson.assertions.Assertions.notNull(r0, r2)
            r1.uuidRepresentation = r2
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.UUID r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.util.UUID decode(org.bson.BsonReader r2, org.bson.codecs.DecoderContext r3) {
            r1 = this;
            byte r3 = r2.peekBinarySubType()
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_LEGACY
            byte r0 = r0.getValue()
            if (r3 == r0) goto L1d
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_STANDARD
            byte r0 = r0.getValue()
            if (r3 != r0) goto L15
            goto L1d
        L15:
            org.bson.BSONException r2 = new org.bson.BSONException
            java.lang.String r3 = "Unexpected BsonBinarySubType"
            r2.<init>(r3)
            throw r2
        L1d:
            org.bson.BsonBinary r2 = r2.readBinaryData()
            byte[] r2 = r2.getData()
            org.bson.UuidRepresentation r0 = r1.uuidRepresentation
            java.util.UUID r2 = org.bson.internal.UuidHelper.decodeBinaryToUuid(r2, r3, r0)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.util.UUID r2 = (java.util.UUID) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r2, java.util.UUID r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            org.bson.UuidRepresentation r4 = r1.uuidRepresentation
            org.bson.UuidRepresentation r0 = org.bson.UuidRepresentation.UNSPECIFIED
            if (r4 == r0) goto L26
            byte[] r3 = org.bson.internal.UuidHelper.encodeUuidToBinary(r3, r4)
            org.bson.UuidRepresentation r4 = r1.uuidRepresentation
            org.bson.UuidRepresentation r0 = org.bson.UuidRepresentation.STANDARD
            if (r4 != r0) goto L1b
            org.bson.BsonBinary r4 = new org.bson.BsonBinary
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_STANDARD
            r4.<init>(r0, r3)
            r2.writeBinaryData(r4)
            goto L25
        L1b:
            org.bson.BsonBinary r4 = new org.bson.BsonBinary
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_LEGACY
            r4.<init>(r0, r3)
            r2.writeBinaryData(r4)
        L25:
            return
        L26:
            org.bson.codecs.configuration.CodecConfigurationException r2 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r3 = "The uuidRepresentation has not been specified, so the UUID cannot be encoded."
            r2.<init>(r3)
            throw r2
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.util.UUID> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            return r0
    }

    public org.bson.UuidRepresentation getUuidRepresentation() {
            r1 = this;
            org.bson.UuidRepresentation r0 = r1.uuidRepresentation
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "UuidCodec{uuidRepresentation="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            org.bson.UuidRepresentation r1 = r2.uuidRepresentation
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
