package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public final class BsonDocumentWrapper<T> extends org.bson.BsonDocument {
    private static final long serialVersionUID = 1;
    private final transient org.bson.codecs.Encoder<T> encoder;
    private org.bson.BsonDocument unwrapped;
    private final transient T wrappedDocument;

    public BsonDocumentWrapper(T r1, org.bson.codecs.Encoder<T> r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            r0.wrappedDocument = r1
            r0.encoder = r2
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Document can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static org.bson.BsonDocument asBsonDocument(java.lang.Object r2, org.bson.codecs.configuration.CodecRegistry r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof org.bson.BsonDocument
            if (r0 == 0) goto Lb
            org.bson.BsonDocument r2 = (org.bson.BsonDocument) r2
            return r2
        Lb:
            org.bson.BsonDocumentWrapper r0 = new org.bson.BsonDocumentWrapper
            java.lang.Class r1 = r2.getClass()
            org.bson.codecs.Codec r3 = r3.get(r1)
            r0.<init>(r2, r3)
            return r0
    }

    private org.bson.BsonDocument getUnwrapped() {
            r5 = this;
            org.bson.codecs.Encoder<T> r0 = r5.encoder
            if (r0 == 0) goto L26
            org.bson.BsonDocument r0 = r5.unwrapped
            if (r0 != 0) goto L23
            org.bson.BsonDocument r0 = new org.bson.BsonDocument
            r0.<init>()
            org.bson.BsonDocumentWriter r1 = new org.bson.BsonDocumentWriter
            r1.<init>(r0)
            org.bson.codecs.Encoder<T> r2 = r5.encoder
            T r3 = r5.wrappedDocument
            org.bson.codecs.EncoderContext$Builder r4 = org.bson.codecs.EncoderContext.builder()
            org.bson.codecs.EncoderContext r4 = r4.build()
            r2.encode(r1, r3, r4)
            r5.unwrapped = r0
        L23:
            org.bson.BsonDocument r0 = r5.unwrapped
            return r0
        L26:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.String r1 = "Can not unwrap a BsonDocumentWrapper with no Encoder"
            r0.<init>(r1)
            throw r0
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Proxy required"
            r2.<init>(r0)
            throw r2
    }

    private java.lang.Object writeReplace() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public void clear() {
            r0 = this;
            super.clear()
            return
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
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            org.bson.BsonDocument r0 = r0.mo2036clone()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, org.bson.BsonValue>> entrySet() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
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
    public org.bson.BsonValue get2(java.lang.Object r2) {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            org.bson.BsonValue r2 = r0.get2(r2)
            return r2
    }

    public org.bson.codecs.Encoder<T> getEncoder() {
            r1 = this;
            org.bson.codecs.Encoder<T> r0 = r1.encoder
            return r0
    }

    public T getWrappedDocument() {
            r1 = this;
            T r0 = r1.wrappedDocument
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public int hashCode() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public boolean isEmpty() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isUnwrapped() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.unwrapped
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
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
    public org.bson.BsonValue put2(java.lang.String r2, org.bson.BsonValue r3) {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            org.bson.BsonValue r2 = r0.put2(r2, r3)
            return r2
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends org.bson.BsonValue> r1) {
            r0 = this;
            super.putAll(r1)
            return
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
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            org.bson.BsonValue r2 = r0.remove2(r2)
            return r2
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public int size() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            int r0 = r0.size()
            return r0
    }

    @Override // org.bson.BsonDocument
    public java.lang.String toString() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.bson.BsonDocument, java.util.Map
    public java.util.Collection<org.bson.BsonValue> values() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.getUnwrapped()
            java.util.Collection r0 = r0.values()
            return r0
    }
}
