package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class BsonDocumentCodec implements org.bson.codecs.CollectibleCodec<org.bson.BsonDocument> {
    private static final org.bson.codecs.configuration.CodecRegistry DEFAULT_REGISTRY = null;
    private static final java.lang.String ID_FIELD_NAME = "_id";
    private final org.bson.codecs.BsonTypeCodecMap bsonTypeCodecMap;
    private final org.bson.codecs.configuration.CodecRegistry codecRegistry;

    static {
            r0 = 1
            org.bson.codecs.configuration.CodecProvider[] r0 = new org.bson.codecs.configuration.CodecProvider[r0]
            org.bson.codecs.BsonValueCodecProvider r1 = new org.bson.codecs.BsonValueCodecProvider
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.configuration.CodecRegistries.fromProviders(r0)
            org.bson.codecs.BsonDocumentCodec.DEFAULT_REGISTRY = r0
            return
    }

    public BsonDocumentCodec() {
            r1 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = org.bson.codecs.BsonDocumentCodec.DEFAULT_REGISTRY
            r1.<init>(r0)
            return
    }

    public BsonDocumentCodec(org.bson.codecs.configuration.CodecRegistry r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L13
            r2.codecRegistry = r3
            org.bson.codecs.BsonTypeCodecMap r0 = new org.bson.codecs.BsonTypeCodecMap
            org.bson.codecs.BsonTypeClassMap r1 = org.bson.codecs.BsonValueCodecProvider.getBsonTypeClassMap()
            r0.<init>(r1, r3)
            r2.bsonTypeCodecMap = r0
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Codec registry can not be null"
            r3.<init>(r0)
            throw r3
    }

    private void beforeFields(org.bson.BsonWriter r3, org.bson.codecs.EncoderContext r4, org.bson.BsonDocument r5) {
            r2 = this;
            boolean r0 = r4.isEncodingCollectibleDocument()
            if (r0 == 0) goto L18
            java.lang.String r0 = "_id"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L18
            r3.writeName(r0)
            org.bson.BsonValue r5 = r5.get2(r0)
            r2.writeValue(r3, r4, r5)
        L18:
            return
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

    private void writeValue(org.bson.BsonWriter r3, org.bson.codecs.EncoderContext r4, org.bson.BsonValue r5) {
            r2 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = r2.codecRegistry
            java.lang.Class r1 = r5.getClass()
            org.bson.codecs.Codec r0 = r0.get(r1)
            r4.encodeWithChildContext(r0, r3, r5)
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            org.bson.BsonDocument r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public org.bson.BsonDocument decode(org.bson.BsonReader r6, org.bson.codecs.DecoderContext r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.readStartDocument()
        L8:
            org.bson.BsonType r1 = r6.readBsonType()
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT
            if (r1 == r2) goto L2d
            java.lang.String r1 = r6.readName()
            org.bson.BsonElement r2 = new org.bson.BsonElement
            org.bson.codecs.BsonTypeCodecMap r3 = r5.bsonTypeCodecMap
            org.bson.BsonType r4 = r6.getCurrentBsonType()
            org.bson.codecs.Codec r3 = r3.get(r4)
            java.lang.Object r3 = r3.decode(r6, r7)
            org.bson.BsonValue r3 = (org.bson.BsonValue) r3
            r2.<init>(r1, r3)
            r0.add(r2)
            goto L8
        L2d:
            r6.readEndDocument()
            org.bson.BsonDocument r6 = new org.bson.BsonDocument
            r6.<init>(r0)
            return r6
    }

    @Override // org.bson.codecs.CollectibleCodec
    public /* bridge */ /* synthetic */ boolean documentHasId(org.bson.BsonDocument r1) {
            r0 = this;
            org.bson.BsonDocument r1 = (org.bson.BsonDocument) r1
            boolean r1 = r0.documentHasId2(r1)
            return r1
    }

    /* JADX INFO: renamed from: documentHasId, reason: avoid collision after fix types in other method */
    public boolean documentHasId2(org.bson.BsonDocument r2) {
            r1 = this;
            java.lang.String r0 = "_id"
            boolean r2 = r2.containsKey(r0)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            org.bson.BsonDocument r2 = (org.bson.BsonDocument) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r3, org.bson.BsonDocument r4, org.bson.codecs.EncoderContext r5) {
            r2 = this;
            r3.writeStartDocument()
            r2.beforeFields(r3, r5, r4)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3a
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
            org.bson.BsonValue r0 = (org.bson.BsonValue) r0
            r2.writeValue(r3, r5, r0)
            goto Le
        L3a:
            r3.writeEndDocument()
            return
    }

    @Override // org.bson.codecs.CollectibleCodec
    public /* bridge */ /* synthetic */ org.bson.BsonDocument generateIdIfAbsentFromDocument(org.bson.BsonDocument r1) {
            r0 = this;
            org.bson.BsonDocument r1 = (org.bson.BsonDocument) r1
            org.bson.BsonDocument r1 = r0.generateIdIfAbsentFromDocument2(r1)
            return r1
    }

    /* JADX INFO: renamed from: generateIdIfAbsentFromDocument, reason: avoid collision after fix types in other method */
    public org.bson.BsonDocument generateIdIfAbsentFromDocument2(org.bson.BsonDocument r3) {
            r2 = this;
            boolean r0 = r2.documentHasId2(r3)
            if (r0 != 0) goto L15
            org.bson.BsonObjectId r0 = new org.bson.BsonObjectId
            org.bson.types.ObjectId r1 = new org.bson.types.ObjectId
            r1.<init>()
            r0.<init>(r1)
            java.lang.String r1 = "_id"
            r3.put2(r1, r0)
        L15:
            return r3
    }

    public org.bson.codecs.configuration.CodecRegistry getCodecRegistry() {
            r1 = this;
            org.bson.codecs.configuration.CodecRegistry r0 = r1.codecRegistry
            return r0
    }

    @Override // org.bson.codecs.CollectibleCodec
    public /* bridge */ /* synthetic */ org.bson.BsonValue getDocumentId(org.bson.BsonDocument r1) {
            r0 = this;
            org.bson.BsonDocument r1 = (org.bson.BsonDocument) r1
            org.bson.BsonValue r1 = r0.getDocumentId2(r1)
            return r1
    }

    /* JADX INFO: renamed from: getDocumentId, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue getDocumentId2(org.bson.BsonDocument r2) {
            r1 = this;
            java.lang.String r0 = "_id"
            org.bson.BsonValue r2 = r2.get2(r0)
            return r2
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<org.bson.BsonDocument> getEncoderClass() {
            r1 = this;
            java.lang.Class<org.bson.BsonDocument> r0 = org.bson.BsonDocument.class
            return r0
    }
}
