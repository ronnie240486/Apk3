package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
public class MapCodec implements org.bson.codecs.Codec<java.util.Map<java.lang.String, java.lang.Object>>, org.bson.codecs.OverridableUuidRepresentationCodec<java.util.Map<java.lang.String, java.lang.Object>> {
    private static final org.bson.codecs.BsonTypeClassMap DEFAULT_BSON_TYPE_CLASS_MAP = null;
    private static final org.bson.codecs.configuration.CodecRegistry DEFAULT_REGISTRY = null;
    private final org.bson.codecs.BsonTypeCodecMap bsonTypeCodecMap;
    private final org.bson.codecs.configuration.CodecRegistry registry;
    private final org.bson.UuidRepresentation uuidRepresentation;
    private final org.bson.Transformer valueTransformer;


    static {
            r0 = 5
            org.bson.codecs.configuration.CodecProvider[] r0 = new org.bson.codecs.configuration.CodecProvider[r0]
            org.bson.codecs.ValueCodecProvider r1 = new org.bson.codecs.ValueCodecProvider
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.bson.codecs.BsonValueCodecProvider r1 = new org.bson.codecs.BsonValueCodecProvider
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            org.bson.codecs.DocumentCodecProvider r1 = new org.bson.codecs.DocumentCodecProvider
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            org.bson.codecs.IterableCodecProvider r1 = new org.bson.codecs.IterableCodecProvider
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            org.bson.codecs.MapCodecProvider r1 = new org.bson.codecs.MapCodecProvider
            r1.<init>()
            r2 = 4
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.configuration.CodecRegistries.fromProviders(r0)
            org.bson.codecs.MapCodec.DEFAULT_REGISTRY = r0
            org.bson.codecs.BsonTypeClassMap r0 = new org.bson.codecs.BsonTypeClassMap
            r0.<init>()
            org.bson.codecs.MapCodec.DEFAULT_BSON_TYPE_CLASS_MAP = r0
            return
    }

    public MapCodec() {
            r1 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.MapCodec.DEFAULT_REGISTRY
            r1.<init>(r0)
            return
    }

    public MapCodec(org.bson.codecs.configuration.CodecRegistry r2) {
            r1 = this;
            org.bson.codecs.BsonTypeClassMap r0 = org.bson.codecs.MapCodec.DEFAULT_BSON_TYPE_CLASS_MAP
            r1.<init>(r2, r0)
            return
    }

    public MapCodec(org.bson.codecs.configuration.CodecRegistry r2, org.bson.codecs.BsonTypeClassMap r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public MapCodec(org.bson.codecs.configuration.CodecRegistry r3, org.bson.codecs.BsonTypeClassMap r4, org.bson.Transformer r5) {
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

    private MapCodec(org.bson.codecs.configuration.CodecRegistry r2, org.bson.codecs.BsonTypeCodecMap r3, org.bson.Transformer r4, org.bson.UuidRepresentation r5) {
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
            org.bson.codecs.MapCodec$1 r4 = new org.bson.codecs.MapCodec$1
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
            org.bson.BsonType r1 = org.bson.BsonType.ARRAY
            if (r0 != r1) goto L1e
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class<java.util.List> r1 = java.util.List.class
            org.bson.codecs.Codec r0 = r0.get(r1)
            java.lang.Object r4 = r5.decodeWithChildContext(r0, r4)
            return r4
        L1e:
            org.bson.BsonType r1 = org.bson.BsonType.BINARY
            if (r0 != r1) goto L69
            int r1 = r4.peekBinarySize()
            r2 = 16
            if (r1 != r2) goto L69
            org.bson.codecs.BsonTypeCodecMap r1 = r3.bsonTypeCodecMap
            org.bson.codecs.Codec r0 = r1.get(r0)
            byte r1 = r4.peekBinarySubType()
            r2 = 3
            if (r1 == r2) goto L4e
            r2 = 4
            if (r1 == r2) goto L3b
            goto L64
        L3b:
            org.bson.UuidRepresentation r1 = r3.uuidRepresentation
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.JAVA_LEGACY
            if (r1 == r2) goto L45
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.STANDARD
            if (r1 != r2) goto L64
        L45:
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            org.bson.codecs.Codec r0 = r0.get(r1)
            goto L64
        L4e:
            org.bson.UuidRepresentation r1 = r3.uuidRepresentation
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.JAVA_LEGACY
            if (r1 == r2) goto L5c
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.C_SHARP_LEGACY
            if (r1 == r2) goto L5c
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.PYTHON_LEGACY
            if (r1 != r2) goto L64
        L5c:
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            org.bson.codecs.Codec r0 = r0.get(r1)
        L64:
            java.lang.Object r4 = r5.decodeWithChildContext(r0, r4)
            return r4
        L69:
            org.bson.Transformer r1 = r3.valueTransformer
            org.bson.codecs.BsonTypeCodecMap r2 = r3.bsonTypeCodecMap
            org.bson.codecs.Codec r0 = r2.get(r0)
            java.lang.Object r4 = r0.decode(r4, r5)
            java.lang.Object r4 = r1.transform(r4)
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
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.util.Map r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.util.Map<java.lang.String, java.lang.Object> decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.readStartDocument()
        L8:
            org.bson.BsonType r1 = r4.readBsonType()
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
            if (r1 == r2) goto L1c
            java.lang.String r1 = r4.readName()
            java.lang.Object r2 = r3.readValue(r4, r5)
            r0.put(r1, r2)
            goto L8
        L1c:
            r4.readEndDocument()
            return r0
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.util.Map r2 = (java.util.Map) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r3, java.util.Map<java.lang.String, java.lang.Object> r4, org.bson.codecs.EncoderContext r5) {
            r2 = this;
            r3.writeStartDocument()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.writeName(r1)
            java.lang.Object r0 = r0.getValue()
            r2.writeValue(r3, r5, r0)
            goto Lb
        L28:
            r3.writeEndDocument()
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.util.Map<java.lang.String, java.lang.Object>> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            return r0
    }

    @Override // org.bson.codecs.OverridableUuidRepresentationCodec
    public org.bson.codecs.Codec<java.util.Map<java.lang.String, java.lang.Object>> withUuidRepresentation(org.bson.UuidRepresentation r5) {
            r4 = this;
            org.bson.codecs.MapCodec r0 = new org.bson.codecs.MapCodec
            org.bson.codecs.configuration.CodecRegistry r1 = r4.registry
            org.bson.codecs.BsonTypeCodecMap r2 = r4.bsonTypeCodecMap
            org.bson.Transformer r3 = r4.valueTransformer
            r0.<init>(r1, r2, r3, r5)
            return r0
    }
}
