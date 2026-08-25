package org.bson;

/* JADX INFO: loaded from: classes.dex */
public final class RawBsonDocument extends org.bson.BsonDocument {
    private static final int MIN_BSON_DOCUMENT_SIZE = 5;
    private static final long serialVersionUID = 1;
    private final byte[] bytes;
    private final int length;
    private final int offset;

    public static class SerializationProxy implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public SerializationProxy(byte[] r3, int r4, int r5) {
                r2 = this;
                r2.<init>()
                int r0 = r3.length
                if (r0 != r5) goto L9
                r2.bytes = r3
                goto L11
            L9:
                byte[] r0 = new byte[r5]
                r2.bytes = r0
                r1 = 0
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            L11:
                return
        }

        private java.lang.Object readResolve() {
                r2 = this;
                org.bson.RawBsonDocument r0 = new org.bson.RawBsonDocument
                byte[] r1 = r2.bytes
                r0.<init>(r1)
                return r0
        }
    }

    public <T> RawBsonDocument(T r4, org.bson.codecs.Codec<T> r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "document"
            org.bson.assertions.Assertions.notNull(r0, r4)
            java.lang.String r0 = "codec"
            org.bson.assertions.Assertions.notNull(r0, r5)
            org.bson.io.BasicOutputBuffer r0 = new org.bson.io.BasicOutputBuffer
            r0.<init>()
            org.bson.BsonBinaryWriter r1 = new org.bson.BsonBinaryWriter
            r1.<init>(r0)
            org.bson.codecs.EncoderContext$Builder r2 = org.bson.codecs.EncoderContext.builder()     // Catch: java.lang.Throwable -> L35
            org.bson.codecs.EncoderContext r2 = r2.build()     // Catch: java.lang.Throwable -> L35
            r5.encode(r1, r4, r2)     // Catch: java.lang.Throwable -> L35
            byte[] r4 = r0.getInternalBuffer()     // Catch: java.lang.Throwable -> L35
            r3.bytes = r4     // Catch: java.lang.Throwable -> L35
            r4 = 0
            r3.offset = r4     // Catch: java.lang.Throwable -> L35
            int r4 = r0.getPosition()     // Catch: java.lang.Throwable -> L35
            r3.length = r4     // Catch: java.lang.Throwable -> L35
            r1.close()
            return
        L35:
            r4 = move-exception
            r1.close()
            throw r4
    }

    public RawBsonDocument(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "bytes"
            java.lang.Object r0 = org.bson.assertions.Assertions.notNull(r0, r3)
            byte[] r0 = (byte[]) r0
            int r3 = r3.length
            r1 = 0
            r2.<init>(r0, r1, r3)
            return
    }

    public RawBsonDocument(byte[] r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "bytes"
            org.bson.assertions.Assertions.notNull(r0, r5)
            r0 = 1
            r1 = 0
            if (r6 < 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            java.lang.String r3 = "offset >= 0"
            org.bson.assertions.Assertions.isTrueArgument(r3, r2)
            int r2 = r5.length
            if (r6 >= r2) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            java.lang.String r3 = "offset < bytes.length"
            org.bson.assertions.Assertions.isTrueArgument(r3, r2)
            int r2 = r5.length
            int r2 = r2 - r6
            if (r7 > r2) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            java.lang.String r3 = "length <= bytes.length - offset"
            org.bson.assertions.Assertions.isTrueArgument(r3, r2)
            r2 = 5
            if (r7 < r2) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            java.lang.String r1 = "length >= 5"
            org.bson.assertions.Assertions.isTrueArgument(r1, r0)
            r4.bytes = r5
            r4.offset = r6
            r4.length = r7
            return
    }

    private org.bson.BsonBinaryReader createReader() {
            r3 = this;
            org.bson.BsonBinaryReader r0 = new org.bson.BsonBinaryReader
            org.bson.io.ByteBufferBsonInput r1 = new org.bson.io.ByteBufferBsonInput
            org.bson.ByteBuf r2 = r3.getByteBuffer()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static org.bson.RawBsonDocument parse(java.lang.String r2) {
            java.lang.String r0 = "json"
            org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.codecs.RawBsonDocumentCodec r0 = new org.bson.codecs.RawBsonDocumentCodec
            r0.<init>()
            org.bson.json.JsonReader r1 = new org.bson.json.JsonReader
            r1.<init>(r2)
            org.bson.codecs.DecoderContext$Builder r2 = org.bson.codecs.DecoderContext.builder()
            org.bson.codecs.DecoderContext r2 = r2.build()
            org.bson.RawBsonDocument r2 = r0.decode(r1, r2)
            return r2
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Proxy required"
            r2.<init>(r0)
            throw r2
    }

    private org.bson.BsonDocument toBsonDocument() {
            r3 = this;
            org.bson.BsonBinaryReader r0 = r3.createReader()
            org.bson.codecs.BsonDocumentCodec r1 = new org.bson.codecs.BsonDocumentCodec     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            org.bson.codecs.DecoderContext$Builder r2 = org.bson.codecs.DecoderContext.builder()     // Catch: java.lang.Throwable -> L19
            org.bson.codecs.DecoderContext r2 = r2.build()     // Catch: java.lang.Throwable -> L19
            org.bson.BsonDocument r1 = r1.decode(r0, r2)     // Catch: java.lang.Throwable -> L19
            r0.close()
            return r1
        L19:
            r1 = move-exception
            r0.close()
            throw r1
    }

    private java.lang.Object writeReplace() {
            r4 = this;
            org.bson.RawBsonDocument$SerializationProxy r0 = new org.bson.RawBsonDocument$SerializationProxy
            byte[] r1 = r4.bytes
            int r2 = r4.offset
            int r3 = r4.length
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // org.bson.BsonDocument
    public org.bson.BsonDocument append(java.lang.String r1, org.bson.BsonValue r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "RawBsonDocument instances are immutable"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "RawBsonDocument instances are immutable"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonDocument
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            org.bson.BsonDocument r0 = r1.mo2036clone()
            return r0
    }

    @Override // org.bson.BsonDocument
    /* JADX INFO: renamed from: clone */
    public org.bson.BsonDocument mo2036clone() {
            r4 = this;
            org.bson.RawBsonDocument r0 = new org.bson.RawBsonDocument
            byte[] r1 = r4.bytes
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            int r2 = r4.offset
            int r3 = r4.length
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean containsKey(java.lang.Object r4) {
            r3 = this;
            if (r4 == 0) goto L31
            org.bson.BsonBinaryReader r0 = r3.createReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L2c
        L9:
            org.bson.BsonType r1 = r0.readBsonType()     // Catch: java.lang.Throwable -> L2c
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L2c
            if (r1 == r2) goto L24
            java.lang.String r1 = r0.readName()     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L20
            r4 = 1
            r0.close()
            return r4
        L20:
            r0.skipValue()     // Catch: java.lang.Throwable -> L2c
            goto L9
        L24:
            r0.readEndDocument()     // Catch: java.lang.Throwable -> L2c
            r0.close()
            r4 = 0
            return r4
        L2c:
            r4 = move-exception
            r0.close()
            throw r4
        L31:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key can not be null"
            r4.<init>(r0)
            throw r4
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            org.bson.BsonBinaryReader r0 = r3.createReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L2b
        L7:
            org.bson.BsonType r1 = r0.readBsonType()     // Catch: java.lang.Throwable -> L2b
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L2b
            if (r1 == r2) goto L23
            r0.skipName()     // Catch: java.lang.Throwable -> L2b
            byte[] r1 = r3.bytes     // Catch: java.lang.Throwable -> L2b
            org.bson.BsonValue r1 = org.bson.RawBsonValueHelper.decode(r1, r0)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L7
            r4 = 1
            r0.close()
            return r4
        L23:
            r0.readEndDocument()     // Catch: java.lang.Throwable -> L2b
            r0.close()
            r4 = 0
            return r4
        L2b:
            r4 = move-exception
            r0.close()
            throw r4
    }

    public <T> T decode(org.bson.codecs.Codec<T> r1) {
            r0 = this;
            java.lang.Object r1 = r0.decode(r1)
            return r1
    }

    public <T> T decode(org.bson.codecs.Decoder<T> r3) {
            r2 = this;
            org.bson.BsonBinaryReader r0 = r2.createReader()
            org.bson.codecs.DecoderContext$Builder r1 = org.bson.codecs.DecoderContext.builder()     // Catch: java.lang.Throwable -> L14
            org.bson.codecs.DecoderContext r1 = r1.build()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r3.decode(r0, r1)     // Catch: java.lang.Throwable -> L14
            r0.close()
            return r3
        L14:
            r3 = move-exception
            r0.close()
            throw r3
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, org.bson.BsonValue>> entrySet() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.toBsonDocument()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            org.bson.BsonDocument r0 = r1.toBsonDocument()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public /* bridge */ /* synthetic */ org.bson.BsonValue get(java.lang.Object r1) {
            r0 = this;
            org.bson.BsonValue r1 = r0.get2(r1)
            return r1
    }

    @Override // org.bson.BsonDocument, java.util.Map
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue get2(java.lang.Object r4) {
            r3 = this;
            java.lang.String r0 = "key"
            org.bson.assertions.Assertions.notNull(r0, r4)
            org.bson.BsonBinaryReader r0 = r3.createReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L34
        Lc:
            org.bson.BsonType r1 = r0.readBsonType()     // Catch: java.lang.Throwable -> L34
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L34
            if (r1 == r2) goto L2c
            java.lang.String r1 = r0.readName()     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L28
            byte[] r4 = r3.bytes     // Catch: java.lang.Throwable -> L34
            org.bson.BsonValue r4 = org.bson.RawBsonValueHelper.decode(r4, r0)     // Catch: java.lang.Throwable -> L34
            r0.close()
            return r4
        L28:
            r0.skipValue()     // Catch: java.lang.Throwable -> L34
            goto Lc
        L2c:
            r0.readEndDocument()     // Catch: java.lang.Throwable -> L34
            r0.close()
            r4 = 0
            return r4
        L34:
            r4 = move-exception
            r0.close()
            throw r4
    }

    public org.bson.ByteBuf getByteBuffer() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            int r2 = r3.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r1, r2)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            org.bson.ByteBufNIO r1 = new org.bson.ByteBufNIO
            r1.<init>(r0)
            return r1
    }

    @Override // org.bson.BsonDocument
    public java.lang.String getFirstKey() {
            r2 = this;
            org.bson.BsonBinaryReader r0 = r2.createReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r0.readName()     // Catch: org.bson.BsonInvalidOperationException -> Lf java.lang.Throwable -> L15
            r0.close()
            return r1
        Lf:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            throw r1     // Catch: java.lang.Throwable -> L15
        L15:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public int hashCode() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.toBsonDocument()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean isEmpty() {
            r3 = this;
            org.bson.BsonBinaryReader r0 = r3.createReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L1c
            org.bson.BsonType r1 = r0.readBsonType()     // Catch: java.lang.Throwable -> L1c
            org.bson.BsonType r2 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L1c
            if (r1 == r2) goto L14
            r1 = 0
            r0.close()
            return r1
        L14:
            r0.readEndDocument()     // Catch: java.lang.Throwable -> L1c
            r0.close()
            r0 = 1
            return r0
        L1c:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.toBsonDocument()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public /* bridge */ /* synthetic */ org.bson.BsonValue put(java.lang.String r1, org.bson.BsonValue r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonValue r1 = r0.put2(r1, r2)
            return r1
    }

    @Override // org.bson.BsonDocument
    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue put2(java.lang.String r1, org.bson.BsonValue r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "RawBsonDocument instances are immutable"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends org.bson.BsonValue> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonDocument instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public /* bridge */ /* synthetic */ org.bson.BsonValue remove(java.lang.Object r1) {
            r0 = this;
            org.bson.BsonValue r1 = r0.remove2(r1)
            return r1
    }

    @Override // org.bson.BsonDocument, java.util.Map
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue remove2(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonDocument instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public int size() {
            r4 = this;
            org.bson.BsonBinaryReader r0 = r4.createReader()
            r0.readStartDocument()     // Catch: java.lang.Throwable -> L20
            r1 = 0
        L8:
            org.bson.BsonType r2 = r0.readBsonType()     // Catch: java.lang.Throwable -> L20
            org.bson.BsonType r3 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L20
            if (r2 == r3) goto L19
            int r1 = r1 + 1
            r0.readName()     // Catch: java.lang.Throwable -> L20
            r0.skipValue()     // Catch: java.lang.Throwable -> L20
            goto L8
        L19:
            r0.readEndDocument()     // Catch: java.lang.Throwable -> L20
            r0.close()
            return r1
        L20:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // org.bson.BsonDocument
    public java.lang.String toJson() {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = new org.bson.json.JsonWriterSettings
            r0.<init>()
            java.lang.String r0 = r1.toJson(r0)
            return r0
    }

    @Override // org.bson.BsonDocument
    public java.lang.String toJson(org.bson.json.JsonWriterSettings r4) {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            org.bson.codecs.RawBsonDocumentCodec r1 = new org.bson.codecs.RawBsonDocumentCodec
            r1.<init>()
            org.bson.json.JsonWriter r2 = new org.bson.json.JsonWriter
            r2.<init>(r0, r4)
            org.bson.codecs.EncoderContext$Builder r4 = org.bson.codecs.EncoderContext.builder()
            org.bson.codecs.EncoderContext r4 = r4.build()
            r1.encode(r2, r3, r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public java.util.Collection<org.bson.BsonValue> values() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.toBsonDocument()
            java.util.Collection r0 = r0.values()
            return r0
    }
}
