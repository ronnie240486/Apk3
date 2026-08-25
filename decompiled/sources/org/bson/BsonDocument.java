package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonDocument extends org.bson.BsonValue implements java.util.Map<java.lang.String, org.bson.BsonValue>, java.lang.Cloneable, org.bson.conversions.Bson, java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.util.Map<java.lang.String, org.bson.BsonValue> map;

    /* JADX INFO: renamed from: org.bson.BsonDocument$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonType = null;

        static {
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.BsonDocument.AnonymousClass1.$SwitchMap$org$bson$BsonType = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.BsonDocument.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.BsonDocument.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.bson.BsonDocument.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static class SerializationProxy implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public SerializationProxy(org.bson.BsonDocument r7) {
                r6 = this;
                r6.<init>()
                org.bson.io.BasicOutputBuffer r0 = new org.bson.io.BasicOutputBuffer
                r0.<init>()
                org.bson.codecs.BsonDocumentCodec r1 = new org.bson.codecs.BsonDocumentCodec
                r1.<init>()
                org.bson.BsonBinaryWriter r2 = new org.bson.BsonBinaryWriter
                r2.<init>(r0)
                org.bson.codecs.EncoderContext$Builder r3 = org.bson.codecs.EncoderContext.builder()
                org.bson.codecs.EncoderContext r3 = r3.build()
                r1.encode(r2, r7, r3)
                int r7 = r0.size()
                byte[] r7 = new byte[r7]
                r6.bytes = r7
                java.util.List r7 = r0.getByteBuffers()
                java.util.Iterator r7 = r7.iterator()
                r0 = 0
            L2e:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L51
                java.lang.Object r1 = r7.next()
                org.bson.ByteBuf r1 = (org.bson.ByteBuf) r1
                byte[] r2 = r1.array()
                int r3 = r1.position()
                byte[] r4 = r6.bytes
                int r5 = r1.limit()
                java.lang.System.arraycopy(r2, r3, r4, r0, r5)
                int r1 = r1.position()
                int r0 = r0 + r1
                goto L2e
            L51:
                return
        }

        private java.lang.Object readResolve() {
                r4 = this;
                org.bson.codecs.BsonDocumentCodec r0 = new org.bson.codecs.BsonDocumentCodec
                r0.<init>()
                org.bson.BsonBinaryReader r1 = new org.bson.BsonBinaryReader
                byte[] r2 = r4.bytes
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r3)
                r1.<init>(r2)
                org.bson.codecs.DecoderContext$Builder r2 = org.bson.codecs.DecoderContext.builder()
                org.bson.codecs.DecoderContext r2 = r2.build()
                org.bson.BsonDocument r0 = r0.decode(r1, r2)
                return r0
        }
    }

    public BsonDocument() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.map = r0
            return
    }

    public BsonDocument(java.lang.String r2, org.bson.BsonValue r3) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.map = r0
            r1.put2(r2, r3)
            return
    }

    public BsonDocument(java.util.List<org.bson.BsonElement> r3) {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.map = r0
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            org.bson.BsonElement r0 = (org.bson.BsonElement) r0
            java.lang.String r1 = r0.getName()
            org.bson.BsonValue r0 = r0.getValue()
            r2.put2(r1, r0)
            goto Le
        L26:
            return
    }

    public static org.bson.BsonDocument parse(java.lang.String r2) {
            org.bson.codecs.BsonDocumentCodec r0 = new org.bson.codecs.BsonDocumentCodec
            r0.<init>()
            org.bson.json.JsonReader r1 = new org.bson.json.JsonReader
            r1.<init>(r2)
            org.bson.codecs.DecoderContext$Builder r2 = org.bson.codecs.DecoderContext.builder()
            org.bson.codecs.DecoderContext r2 = r2.build()
            org.bson.BsonDocument r2 = r0.decode(r1, r2)
            return r2
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Proxy required"
            r2.<init>(r0)
            throw r2
    }

    private void throwIfKeyAbsent(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L7
            return
        L7:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Document does not contain key "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private java.lang.Object writeReplace() {
            r1 = this;
            org.bson.BsonDocument$SerializationProxy r0 = new org.bson.BsonDocument$SerializationProxy
            r0.<init>(r1)
            return r0
    }

    public org.bson.BsonDocument append(java.lang.String r1, org.bson.BsonValue r2) {
            r0 = this;
            r0.put2(r1, r2)
            return r0
    }

    public org.bson.BsonReader asBsonReader() {
            r1 = this;
            org.bson.BsonDocumentReader r0 = new org.bson.BsonDocumentReader
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            r0.clear()
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            org.bson.BsonDocument r0 = r1.mo2036clone()
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public org.bson.BsonDocument mo2036clone() {
            r5 = this;
            org.bson.BsonDocument r0 = new org.bson.BsonDocument
            r0.<init>()
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int[] r3 = org.bson.BsonDocument.AnonymousClass1.$SwitchMap$org$bson$BsonType
            java.lang.Object r4 = r2.getValue()
            org.bson.BsonValue r4 = (org.bson.BsonValue) r4
            org.bson.BsonType r4 = r4.getBsonType()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L90
            r4 = 2
            if (r3 == r4) goto L77
            r4 = 3
            if (r3 == r4) goto L5f
            r4 = 4
            if (r3 == r4) goto L47
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            r0.put2(r3, r2)
            goto Ld
        L47:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonJavaScriptWithScope r2 = r2.asJavaScriptWithScope()
            org.bson.BsonJavaScriptWithScope r2 = org.bson.BsonJavaScriptWithScope.clone(r2)
            r0.put2(r3, r2)
            goto Ld
        L5f:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonBinary r2 = r2.asBinary()
            org.bson.BsonBinary r2 = org.bson.BsonBinary.clone(r2)
            r0.put2(r3, r2)
            goto Ld
        L77:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonArray r2 = r2.asArray()
            org.bson.BsonArray r2 = r2.mo2035clone()
            r0.put2(r3, r2)
            goto Ld
        L90:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonDocument r2 = r2.asDocument()
            org.bson.BsonDocument r2 = r2.mo2036clone()
            r0.put2(r3, r2)
            goto Ld
        La9:
            return r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, org.bson.BsonValue>> entrySet() {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.bson.BsonDocument
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.bson.BsonDocument r2 = (org.bson.BsonDocument) r2
            java.util.Set r0 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ org.bson.BsonValue get(java.lang.Object r1) {
            r0 = this;
            org.bson.BsonValue r1 = r0.get2(r1)
            return r1
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue get2(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            return r2
    }

    public org.bson.BsonValue get(java.lang.Object r1, org.bson.BsonValue r2) {
            r0 = this;
            org.bson.BsonValue r1 = r0.get2(r1)
            if (r1 == 0) goto L7
            r2 = r1
        L7:
            return r2
    }

    public org.bson.BsonArray getArray(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonArray r1 = r1.asArray()
            return r1
    }

    public org.bson.BsonArray getArray(java.lang.Object r2, org.bson.BsonArray r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonArray r2 = r2.asArray()
            return r2
    }

    public org.bson.BsonBinary getBinary(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonBinary r1 = r1.asBinary()
            return r1
    }

    public org.bson.BsonBinary getBinary(java.lang.Object r2, org.bson.BsonBinary r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonBinary r2 = r2.asBinary()
            return r2
    }

    public org.bson.BsonBoolean getBoolean(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonBoolean r1 = r1.asBoolean()
            return r1
    }

    public org.bson.BsonBoolean getBoolean(java.lang.Object r2, org.bson.BsonBoolean r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonBoolean r2 = r2.asBoolean()
            return r2
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.DOCUMENT
            return r0
    }

    public org.bson.BsonDateTime getDateTime(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonDateTime r1 = r1.asDateTime()
            return r1
    }

    public org.bson.BsonDateTime getDateTime(java.lang.Object r2, org.bson.BsonDateTime r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonDateTime r2 = r2.asDateTime()
            return r2
    }

    public org.bson.BsonDecimal128 getDecimal128(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonDecimal128 r1 = r1.asDecimal128()
            return r1
    }

    public org.bson.BsonDecimal128 getDecimal128(java.lang.Object r2, org.bson.BsonDecimal128 r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonDecimal128 r2 = r2.asDecimal128()
            return r2
    }

    public org.bson.BsonDocument getDocument(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonDocument r1 = r1.asDocument()
            return r1
    }

    public org.bson.BsonDocument getDocument(java.lang.Object r2, org.bson.BsonDocument r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonDocument r2 = r2.asDocument()
            return r2
    }

    public org.bson.BsonDouble getDouble(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonDouble r1 = r1.asDouble()
            return r1
    }

    public org.bson.BsonDouble getDouble(java.lang.Object r2, org.bson.BsonDouble r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonDouble r2 = r2.asDouble()
            return r2
    }

    public java.lang.String getFirstKey() {
            r1 = this;
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public org.bson.BsonInt32 getInt32(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonInt32 r1 = r1.asInt32()
            return r1
    }

    public org.bson.BsonInt32 getInt32(java.lang.Object r2, org.bson.BsonInt32 r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonInt32 r2 = r2.asInt32()
            return r2
    }

    public org.bson.BsonInt64 getInt64(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonInt64 r1 = r1.asInt64()
            return r1
    }

    public org.bson.BsonInt64 getInt64(java.lang.Object r2, org.bson.BsonInt64 r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonInt64 r2 = r2.asInt64()
            return r2
    }

    public org.bson.BsonNumber getNumber(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonNumber r1 = r1.asNumber()
            return r1
    }

    public org.bson.BsonNumber getNumber(java.lang.Object r2, org.bson.BsonNumber r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonNumber r2 = r2.asNumber()
            return r2
    }

    public org.bson.BsonObjectId getObjectId(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonObjectId r1 = r1.asObjectId()
            return r1
    }

    public org.bson.BsonObjectId getObjectId(java.lang.Object r2, org.bson.BsonObjectId r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonObjectId r2 = r2.asObjectId()
            return r2
    }

    public org.bson.BsonRegularExpression getRegularExpression(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonRegularExpression r1 = r1.asRegularExpression()
            return r1
    }

    public org.bson.BsonRegularExpression getRegularExpression(java.lang.Object r2, org.bson.BsonRegularExpression r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonRegularExpression r2 = r2.asRegularExpression()
            return r2
    }

    public org.bson.BsonString getString(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonString r1 = r1.asString()
            return r1
    }

    public org.bson.BsonString getString(java.lang.Object r2, org.bson.BsonString r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonString r2 = r2.asString()
            return r2
    }

    public org.bson.BsonTimestamp getTimestamp(java.lang.Object r1) {
            r0 = this;
            r0.throwIfKeyAbsent(r1)
            org.bson.BsonValue r1 = r0.get2(r1)
            org.bson.BsonTimestamp r1 = r1.asTimestamp()
            return r1
    }

    public org.bson.BsonTimestamp getTimestamp(java.lang.Object r2, org.bson.BsonTimestamp r3) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L7
            return r3
        L7:
            org.bson.BsonValue r2 = r1.get2(r2)
            org.bson.BsonTimestamp r2 = r2.asTimestamp()
            return r2
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isArray(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isArray()
            return r2
    }

    public boolean isBinary(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isBinary()
            return r2
    }

    public boolean isBoolean(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isBoolean()
            return r2
    }

    public boolean isDateTime(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isDateTime()
            return r2
    }

    public boolean isDecimal128(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isDecimal128()
            return r2
    }

    public boolean isDocument(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isDocument()
            return r2
    }

    public boolean isDouble(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isDouble()
            return r2
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isInt32(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isInt32()
            return r2
    }

    public boolean isInt64(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isInt64()
            return r2
    }

    public boolean isNull(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isNull()
            return r2
    }

    public boolean isNumber(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isNumber()
            return r2
    }

    public boolean isObjectId(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isObjectId()
            return r2
    }

    public boolean isString(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isString()
            return r2
    }

    public boolean isTimestamp(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            org.bson.BsonValue r2 = r1.get2(r2)
            boolean r2 = r2.isTimestamp()
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ org.bson.BsonValue put(java.lang.String r1, org.bson.BsonValue r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonValue r1 = r0.put2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue put2(java.lang.String r4, org.bson.BsonValue r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L30
            java.lang.String r2 = "\u0000"
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L15
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r3.map
            java.lang.Object r4 = r0.put(r4, r5)
            org.bson.BsonValue r4 = (org.bson.BsonValue) r4
            return r4
        L15:
            org.bson.BSONException r5 = new org.bson.BSONException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            int r4 = r4.indexOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r0] = r4
            java.lang.String r4 = "BSON cstring '%s' is not valid because it contains a null character at index %d"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r5.<init>(r4)
            throw r5
        L30:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            java.lang.String r4 = "The value for key %s can not be null"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r5.<init>(r4)
            throw r5
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends org.bson.BsonValue> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            org.bson.BsonValue r0 = (org.bson.BsonValue) r0
            r2.put2(r1, r0)
            goto L8
        L24:
            return
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ org.bson.BsonValue remove(java.lang.Object r1) {
            r0 = this;
            org.bson.BsonValue r1 = r0.remove2(r1)
            return r1
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue remove2(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            int r0 = r0.size()
            return r0
    }

    @Override // org.bson.conversions.Bson
    public <C> org.bson.BsonDocument toBsonDocument(java.lang.Class<C> r1, org.bson.codecs.configuration.CodecRegistry r2) {
            r0 = this;
            return r0
    }

    public java.lang.String toJson() {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = new org.bson.json.JsonWriterSettings
            r0.<init>()
            java.lang.String r0 = r1.toJson(r0)
            return r0
    }

    public java.lang.String toJson(org.bson.json.JsonWriterSettings r4) {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            org.bson.codecs.BsonDocumentCodec r1 = new org.bson.codecs.BsonDocumentCodec
            r1.<init>()
            org.bson.json.JsonWriter r2 = new org.bson.json.JsonWriter
            r2.<init>(r0, r4)
            org.bson.codecs.EncoderContext$Builder r4 = org.bson.codecs.EncoderContext.builder()
            org.bson.codecs.EncoderContext r4 = r4.build()
            r1.encode(r2, r3, r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toJson()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<org.bson.BsonValue> values() {
            r1 = this;
            java.util.Map<java.lang.String, org.bson.BsonValue> r0 = r1.map
            java.util.Collection r0 = r0.values()
            return r0
    }
}
