package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class IterableCodec implements org.bson.codecs.Codec<java.lang.Iterable>, org.bson.codecs.OverridableUuidRepresentationCodec<java.lang.Iterable> {
    private final org.bson.codecs.BsonTypeCodecMap bsonTypeCodecMap;
    private final org.bson.codecs.configuration.CodecRegistry registry;
    private final org.bson.UuidRepresentation uuidRepresentation;
    private final org.bson.Transformer valueTransformer;


    public IterableCodec(org.bson.codecs.configuration.CodecRegistry r2, org.bson.codecs.BsonTypeClassMap r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public IterableCodec(org.bson.codecs.configuration.CodecRegistry r3, org.bson.codecs.BsonTypeClassMap r4, org.bson.Transformer r5) {
            r2 = this;
            org.bson.codecs.BsonTypeCodecMap r0 = new org.bson.codecs.BsonTypeCodecMap
            java.lang.String r1 = "bsonTypeClassMap"
            java.lang.Object r4 = org.bson.assertions.Assertions.notNull(r1, r4)
            org.bson.codecs.BsonTypeClassMap r4 = (org.bson.codecs.BsonTypeClassMap) r4
            r0.<init>(r4, r3)
            org.bson.UuidRepresentation r4 = org.bson.UuidRepresentation.JAVA_LEGACY
            r2.<init>(r3, r0, r5, r4)
            return
    }

    private IterableCodec(org.bson.codecs.configuration.CodecRegistry r2, org.bson.codecs.BsonTypeCodecMap r3, org.bson.Transformer r4, org.bson.UuidRepresentation r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "registry"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.configuration.CodecRegistry r2 = (org.bson.codecs.configuration.CodecRegistry) r2
            r1.registry = r2
            r1.bsonTypeCodecMap = r3
            if (r4 == 0) goto L12
            goto L17
        L12:
            org.bson.codecs.IterableCodec$1 r4 = new org.bson.codecs.IterableCodec$1
            r4.<init>()
        L17:
            r1.valueTransformer = r4
            r1.uuidRepresentation = r5
            return
    }

    private java.lang.Object readValue(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
            r3 = this;
            org.bson.BsonType r0 = r4.getCurrentBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.NULL
            if (r0 != r1) goto Ld
            r4.readNull()
            r4 = 0
            return r4
        Ld:
            org.bson.codecs.BsonTypeCodecMap r1 = r3.bsonTypeCodecMap
            org.bson.codecs.Codec r1 = r1.get(r0)
            org.bson.BsonType r2 = org.bson.BsonType.BINARY
            if (r0 != r2) goto L53
            int r0 = r4.peekBinarySize()
            r2 = 16
            if (r0 != r2) goto L53
            byte r0 = r4.peekBinarySubType()
            r2 = 3
            if (r0 == r2) goto L3d
            r2 = 4
            if (r0 == r2) goto L2a
            goto L53
        L2a:
            org.bson.UuidRepresentation r0 = r3.uuidRepresentation
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.JAVA_LEGACY
            if (r0 == r2) goto L34
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.STANDARD
            if (r0 != r2) goto L53
        L34:
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            org.bson.codecs.Codec r1 = r0.get(r1)
            goto L53
        L3d:
            org.bson.UuidRepresentation r0 = r3.uuidRepresentation
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.JAVA_LEGACY
            if (r0 == r2) goto L4b
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.C_SHARP_LEGACY
            if (r0 == r2) goto L4b
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.PYTHON_LEGACY
            if (r0 != r2) goto L53
        L4b:
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            org.bson.codecs.Codec r1 = r0.get(r1)
        L53:
            org.bson.Transformer r0 = r3.valueTransformer
            java.lang.Object r4 = r1.decode(r4, r5)
            java.lang.Object r4 = r0.transform(r4)
            return r4
    }

    private void writeValue(org.bson.BsonWriter r3, org.bson.codecs.EncoderContext r4, java.lang.Object r5) {
            r2 = this;
            if (r5 != 0) goto L6
            r3.writeNull()
            goto L13
        L6:
            org.bson.codecs.configuration.CodecRegistry r0 = r2.registry
            java.lang.Class r1 = r5.getClass()
            org.bson.codecs.Codec r0 = r0.get(r1)
            r4.encodeWithChildContext(r0, r3, r5)
        L13:
            return
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Iterable decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
            r3 = this;
            r4.readStartArray()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L8:
            org.bson.BsonType r1 = r4.readBsonType()
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
            if (r1 == r2) goto L18
            java.lang.Object r1 = r3.readValue(r4, r5)
            r0.add(r1)
            goto L8
        L18:
            r4.readEndArray()
            return r0
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Iterable r1 = r0.decode(r1, r2)
            return r1
    }

    public void encode(org.bson.BsonWriter r2, java.lang.Iterable r3, org.bson.codecs.EncoderContext r4) {
            r1 = this;
            r2.writeStartArray()
            java.util.Iterator r3 = r3.iterator()
        L7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r3.next()
            r1.writeValue(r2, r4, r0)
            goto L7
        L15:
            r2.writeEndArray()
            return
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Iterable> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
            return r0
    }

    @Override // org.bson.codecs.OverridableUuidRepresentationCodec
    public org.bson.codecs.Codec<java.lang.Iterable> withUuidRepresentation(org.bson.UuidRepresentation r5) {
            r4 = this;
            org.bson.codecs.IterableCodec r0 = new org.bson.codecs.IterableCodec
            org.bson.codecs.configuration.CodecRegistry r1 = r4.registry
            org.bson.codecs.BsonTypeCodecMap r2 = r4.bsonTypeCodecMap
            org.bson.Transformer r3 = r4.valueTransformer
            r0.<init>(r1, r2, r3, r5)
            return r0
    }
}
