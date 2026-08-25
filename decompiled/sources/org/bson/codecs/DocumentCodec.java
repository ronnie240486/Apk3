package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class DocumentCodec implements org.bson.codecs.CollectibleCodec<org.bson.Document>, org.bson.codecs.OverridableUuidRepresentationCodec<org.bson.Document> {
    private static final org.bson.codecs.BsonTypeClassMap DEFAULT_BSON_TYPE_CLASS_MAP = null;
    private static final org.bson.codecs.configuration.CodecRegistry DEFAULT_REGISTRY = null;
    private static final java.lang.String ID_FIELD_NAME = "_id";
    private final org.bson.codecs.BsonTypeCodecMap bsonTypeCodecMap;
    private final org.bson.codecs.IdGenerator idGenerator;
    private final org.bson.codecs.configuration.CodecRegistry registry;
    private final org.bson.UuidRepresentation uuidRepresentation;
    private final org.bson.Transformer valueTransformer;


    static {
            r0 = 3
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
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.configuration.CodecRegistries.fromProviders(r0)
            org.bson.codecs.DocumentCodec.DEFAULT_REGISTRY = r0
            org.bson.codecs.BsonTypeClassMap r0 = new org.bson.codecs.BsonTypeClassMap
            r0.<init>()
            org.bson.codecs.DocumentCodec.DEFAULT_BSON_TYPE_CLASS_MAP = r0
            return
    }

    public DocumentCodec() {
            r1 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.DocumentCodec.DEFAULT_REGISTRY
            r1.<init>(r0)
            return
    }

    public DocumentCodec(org.bson.codecs.configuration.CodecRegistry r2) {
            r1 = this;
            org.bson.codecs.BsonTypeClassMap r0 = org.bson.codecs.DocumentCodec.DEFAULT_BSON_TYPE_CLASS_MAP
            r1.<init>(r2, r0)
            return
    }

    public DocumentCodec(org.bson.codecs.configuration.CodecRegistry r2, org.bson.codecs.BsonTypeClassMap r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DocumentCodec(org.bson.codecs.configuration.CodecRegistry r7, org.bson.codecs.BsonTypeClassMap r8, org.bson.Transformer r9) {
            r6 = this;
            org.bson.codecs.BsonTypeCodecMap r2 = new org.bson.codecs.BsonTypeCodecMap
            java.lang.String r0 = "bsonTypeClassMap"
            java.lang.Object r8 = org.bson.assertions.Assertions.notNull(r0, r8)
            org.bson.codecs.BsonTypeClassMap r8 = (org.bson.codecs.BsonTypeClassMap) r8
            r2.<init>(r8, r7)
            org.bson.codecs.ObjectIdGenerator r3 = new org.bson.codecs.ObjectIdGenerator
            r3.<init>()
            org.bson.UuidRepresentation r5 = org.bson.UuidRepresentation.JAVA_LEGACY
            r0 = r6
            r1 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private DocumentCodec(org.bson.codecs.configuration.CodecRegistry r2, org.bson.codecs.BsonTypeCodecMap r3, org.bson.codecs.IdGenerator r4, org.bson.Transformer r5, org.bson.UuidRepresentation r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "registry"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.configuration.CodecRegistry r2 = (org.bson.codecs.configuration.CodecRegistry) r2
            r1.registry = r2
            r1.bsonTypeCodecMap = r3
            r1.idGenerator = r4
            if (r5 == 0) goto L14
            goto L19
        L14:
            org.bson.codecs.DocumentCodec$1 r5 = new org.bson.codecs.DocumentCodec$1
            r5.<init>()
        L19:
            r1.valueTransformer = r5
            r1.uuidRepresentation = r6
            return
    }

    private void beforeFields(org.bson.BsonWriter r3, org.bson.codecs.EncoderContext r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r2 = this;
            boolean r0 = r4.isEncodingCollectibleDocument()
            if (r0 == 0) goto L18
            java.lang.String r0 = "_id"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L18
            r3.writeName(r0)
            java.lang.Object r5 = r5.get(r0)
            r2.writeValue(r3, r4, r5)
        L18:
            return
    }

    private java.util.List<java.lang.Object> readList(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
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
            if (r0 != r1) goto L16
            java.util.List r4 = r3.readList(r4, r5)
            return r4
        L16:
            org.bson.codecs.BsonTypeCodecMap r1 = r3.bsonTypeCodecMap
            org.bson.codecs.Codec r1 = r1.get(r0)
            org.bson.BsonType r2 = org.bson.BsonType.BINARY
            if (r0 != r2) goto L5c
            int r0 = r4.peekBinarySize()
            r2 = 16
            if (r0 != r2) goto L5c
            byte r0 = r4.peekBinarySubType()
            r2 = 3
            if (r0 == r2) goto L46
            r2 = 4
            if (r0 == r2) goto L33
            goto L5c
        L33:
            org.bson.UuidRepresentation r0 = r3.uuidRepresentation
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.JAVA_LEGACY
            if (r0 == r2) goto L3d
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.STANDARD
            if (r0 != r2) goto L5c
        L3d:
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            org.bson.codecs.Codec r1 = r0.get(r1)
            goto L5c
        L46:
            org.bson.UuidRepresentation r0 = r3.uuidRepresentation
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.JAVA_LEGACY
            if (r0 == r2) goto L54
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.C_SHARP_LEGACY
            if (r0 == r2) goto L54
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.PYTHON_LEGACY
            if (r0 != r2) goto L5c
        L54:
            org.bson.codecs.configuration.CodecRegistry r0 = r3.registry
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            org.bson.codecs.Codec r1 = r0.get(r1)
        L5c:
            org.bson.Transformer r0 = r3.valueTransformer
            java.lang.Object r4 = r1.decode(r4, r5)
            java.lang.Object r4 = r0.transform(r4)
            return r4
    }

    private boolean skipField(org.bson.codecs.EncoderContext r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r1.isEncodingCollectibleDocument()
            if (r1 == 0) goto L10
            java.lang.String r1 = "_id"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    private void writeIterable(org.bson.BsonWriter r2, java.lang.Iterable<java.lang.Object> r3, org.bson.codecs.EncoderContext r4) {
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

    private void writeMap(org.bson.BsonWriter r3, java.util.Map<java.lang.String, java.lang.Object> r4, org.bson.codecs.EncoderContext r5) {
            r2 = this;
            r3.writeStartDocument()
            r2.beforeFields(r3, r5, r4)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r2.skipField(r5, r1)
            if (r1 == 0) goto L27
            goto Le
        L27:
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.writeName(r1)
            java.lang.Object r0 = r0.getValue()
            r2.writeValue(r3, r5, r0)
            goto Le
        L38:
            r3.writeEndDocument()
            return
    }

    private void writeValue(org.bson.BsonWriter r3, org.bson.codecs.EncoderContext r4, java.lang.Object r5) {
            r2 = this;
            if (r5 != 0) goto L6
            r3.writeNull()
            goto L2f
        L6:
            boolean r0 = r5 instanceof java.lang.Iterable
            if (r0 == 0) goto L14
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            org.bson.codecs.EncoderContext r4 = r4.getChildContext()
            r2.writeIterable(r3, r5, r4)
            goto L2f
        L14:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L22
            java.util.Map r5 = (java.util.Map) r5
            org.bson.codecs.EncoderContext r4 = r4.getChildContext()
            r2.writeMap(r3, r5, r4)
            goto L2f
        L22:
            org.bson.codecs.configuration.CodecRegistry r0 = r2.registry
            java.lang.Class r1 = r5.getClass()
            org.bson.codecs.Codec r0 = r0.get(r1)
            r4.encodeWithChildContext(r0, r3, r5)
        L2f:
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.Document r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.Document decode(org.bson.BsonReader r4, org.bson.codecs.DecoderContext r5) {
            r3 = this;
            org.bson.Document r0 = new org.bson.Document
            r0.<init>()
            r4.readStartDocument()
        L8:
            org.bson.BsonType r1 = r4.readBsonType()
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
            if (r1 == r2) goto L1c
            java.lang.String r1 = r4.readName()
            java.lang.Object r2 = r3.readValue(r4, r5)
            r0.put2(r1, r2)
            goto L8
        L1c:
            r4.readEndDocument()
            return r0
    }

    @Override // org.bson.codecs.CollectibleCodec
    public /* bridge */ /* synthetic */ boolean documentHasId(org.bson.Document r1) {
            r0 = this;
            org.bson.Document r1 = (org.bson.Document) r1
            boolean r1 = r0.documentHasId2(r1)
            return r1
    }

    /* JADX INFO: renamed from: documentHasId, reason: avoid collision after fix types in other method */
    public boolean documentHasId2(org.bson.Document r2) {
            r1 = this;
            java.lang.String r0 = "_id"
            boolean r2 = r2.containsKey(r0)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.Document r2 = (org.bson.Document) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r1, org.bson.Document r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            r0.writeMap(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.CollectibleCodec
    public /* bridge */ /* synthetic */ org.bson.Document generateIdIfAbsentFromDocument(org.bson.Document r1) {
            r0 = this;
            org.bson.Document r1 = (org.bson.Document) r1
            org.bson.Document r1 = r0.generateIdIfAbsentFromDocument2(r1)
            return r1
    }

    /* JADX INFO: renamed from: generateIdIfAbsentFromDocument, reason: avoid collision after fix types in other method */
    public org.bson.Document generateIdIfAbsentFromDocument2(org.bson.Document r3) {
            r2 = this;
            boolean r0 = r2.documentHasId2(r3)
            if (r0 != 0) goto L11
            org.bson.codecs.IdGenerator r0 = r2.idGenerator
            java.lang.Object r0 = r0.generate()
            java.lang.String r1 = "_id"
            r3.put2(r1, r0)
        L11:
            return r3
    }

    @Override // org.bson.codecs.CollectibleCodec
    public /* bridge */ /* synthetic */ org.bson.BsonValue getDocumentId(org.bson.Document r1) {
            r0 = this;
            org.bson.Document r1 = (org.bson.Document) r1
            org.bson.BsonValue r1 = r0.getDocumentId2(r1)
            return r1
    }

    /* JADX INFO: renamed from: getDocumentId, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue getDocumentId2(org.bson.Document r5) {
            r4 = this;
            boolean r0 = r4.documentHasId2(r5)
            if (r0 == 0) goto L36
            java.lang.String r0 = "_id"
            java.lang.Object r5 = r5.get(r0)
            boolean r1 = r5 instanceof org.bson.BsonValue
            if (r1 == 0) goto L13
            org.bson.BsonValue r5 = (org.bson.BsonValue) r5
            return r5
        L13:
            org.bson.BsonDocument r1 = new org.bson.BsonDocument
            r1.<init>()
            org.bson.BsonDocumentWriter r2 = new org.bson.BsonDocumentWriter
            r2.<init>(r1)
            r2.writeStartDocument()
            r2.writeName(r0)
            org.bson.codecs.EncoderContext$Builder r3 = org.bson.codecs.EncoderContext.builder()
            org.bson.codecs.EncoderContext r3 = r3.build()
            r4.writeValue(r2, r3, r5)
            r2.writeEndDocument()
            org.bson.BsonValue r5 = r1.get2(r0)
            return r5
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "The document does not contain an _id"
            r5.<init>(r0)
            throw r5
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.Document> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.Document> r0 = org.bson.Document.class
            return r0
    }

    @Override // org.bson.codecs.OverridableUuidRepresentationCodec
    public org.bson.codecs.Codec<org.bson.Document> withUuidRepresentation(org.bson.UuidRepresentation r8) {
            r7 = this;
            org.bson.codecs.DocumentCodec r6 = new org.bson.codecs.DocumentCodec
            org.bson.codecs.configuration.CodecRegistry r1 = r7.registry
            org.bson.codecs.BsonTypeCodecMap r2 = r7.bsonTypeCodecMap
            org.bson.codecs.IdGenerator r3 = r7.idGenerator
            org.bson.Transformer r4 = r7.valueTransformer
            r0 = r6
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
