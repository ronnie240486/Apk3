package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class Document implements java.util.Map<java.lang.String, java.lang.Object>, java.io.Serializable, org.bson.conversions.Bson {
    private static final long serialVersionUID = 6297731997167536582L;
    private final java.util.LinkedHashMap<java.lang.String, java.lang.Object> documentAsMap;

    public Document() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.documentAsMap = r0
            return
    }

    public Document(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.documentAsMap = r0
            r0.put(r2, r3)
            return
    }

    public Document(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
            r1.documentAsMap = r0
            return
    }

    private <T> java.util.List<T> constructValuesList(java.lang.Object r2, java.lang.Class<T> r3, java.util.List<T> r4) {
            r1 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Object r2 = r1.get(r2, r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto Lb
            return r4
        Lb:
            java.util.Iterator r4 = r2.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r4.next()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L24
            goto Lf
        L24:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            java.lang.String r3 = r3.getName()
            r4[r0] = r3
            java.lang.String r3 = "List element cannot be cast to %s"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r2.<init>(r3)
            throw r2
        L3a:
            return r2
    }

    private <T> T getEmbeddedValue(java.util.List<?> r4, java.lang.Class<T> r5, T r6) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = r3
        L5:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()
            org.bson.Document r0 = (org.bson.Document) r0
            java.lang.Object r0 = r0.get(r1)
            boolean r2 = r0 instanceof org.bson.Document
            if (r2 != 0) goto L5
            if (r0 != 0) goto L1c
            return r6
        L1c:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L23
            goto L5
        L23:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r6 = 1
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r5[r6] = r0
            java.lang.String r6 = "At key %s, the value is not a Document (%s)"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r4.<init>(r5)
            throw r4
        L40:
            if (r5 == 0) goto L46
            java.lang.Object r0 = r5.cast(r0)
        L46:
            return r0
    }

    public static org.bson.Document parse(java.lang.String r1) {
            org.bson.codecs.DocumentCodec r0 = new org.bson.codecs.DocumentCodec
            r0.<init>()
            org.bson.Document r1 = parse(r1, r0)
            return r1
    }

    public static org.bson.Document parse(java.lang.String r1, org.bson.codecs.Decoder<org.bson.Document> r2) {
            java.lang.String r0 = "codec"
            org.bson.assertions.Assertions.notNull(r0, r2)
            org.bson.json.JsonReader r0 = new org.bson.json.JsonReader
            r0.<init>(r1)
            org.bson.codecs.DecoderContext$Builder r1 = org.bson.codecs.DecoderContext.builder()
            org.bson.codecs.DecoderContext r1 = r1.build()
            java.lang.Object r1 = r2.decode(r0, r1)
            org.bson.Document r1 = (org.bson.Document) r1
            return r1
    }

    public org.bson.Document append(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            r0.put(r2, r3)
            return r1
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> entrySet() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L20
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L20
        L12:
            org.bson.Document r5 = (org.bson.Document) r5
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r2 = r4.documentAsMap
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r5 = r5.documentAsMap
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            return r1
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public <T> T get(java.lang.Object r2, java.lang.Class<T> r3) {
            r1 = this;
            java.lang.String r0 = "clazz"
            org.bson.assertions.Assertions.notNull(r0, r3)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = r3.cast(r2)
            return r2
    }

    public <T> T get(java.lang.Object r2, T r3) {
            r1 = this;
            java.lang.String r0 = "defaultValue"
            org.bson.assertions.Assertions.notNull(r0, r3)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto Le
            goto Lf
        Le:
            r3 = r2
        Lf:
            return r3
    }

    public java.lang.Boolean getBoolean(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            return r1
    }

    public boolean getBoolean(java.lang.Object r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r1 = r0.get(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public java.util.Date getDate(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.util.Date r1 = (java.util.Date) r1
            return r1
    }

    public java.lang.Double getDouble(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Double r1 = (java.lang.Double) r1
            return r1
    }

    public <T> T getEmbedded(java.util.List<?> r3, java.lang.Class<T> r4) {
            r2 = this;
            java.lang.String r0 = "keys"
            org.bson.assertions.Assertions.notNull(r0, r3)
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            org.bson.assertions.Assertions.isTrue(r0, r1)
            java.lang.String r0 = "clazz"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 0
            java.lang.Object r3 = r2.getEmbeddedValue(r3, r4, r0)
            return r3
    }

    public <T> T getEmbedded(java.util.List<?> r3, T r4) {
            r2 = this;
            java.lang.String r0 = "keys"
            org.bson.assertions.Assertions.notNull(r0, r3)
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            org.bson.assertions.Assertions.isTrue(r0, r1)
            java.lang.String r0 = "defaultValue"
            org.bson.assertions.Assertions.notNull(r0, r4)
            r0 = 0
            java.lang.Object r3 = r2.getEmbeddedValue(r3, r0, r4)
            return r3
    }

    public int getInteger(java.lang.Object r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r0.get(r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    public java.lang.Integer getInteger(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
    }

    public <T> java.util.List<T> getList(java.lang.Object r2, java.lang.Class<T> r3) {
            r1 = this;
            java.lang.String r0 = "clazz"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r0 = 0
            java.util.List r2 = r1.constructValuesList(r2, r3, r0)
            return r2
    }

    public <T> java.util.List<T> getList(java.lang.Object r2, java.lang.Class<T> r3, java.util.List<T> r4) {
            r1 = this;
            java.lang.String r0 = "defaultValue"
            org.bson.assertions.Assertions.notNull(r0, r4)
            java.lang.String r0 = "clazz"
            org.bson.assertions.Assertions.notNull(r0, r3)
            java.util.List r2 = r1.constructValuesList(r2, r3, r4)
            return r2
    }

    public java.lang.Long getLong(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            return r1
    }

    public org.bson.types.ObjectId getObjectId(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            org.bson.types.ObjectId r1 = (org.bson.types.ObjectId) r1
            return r1
    }

    public java.lang.String getString(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.put2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public java.lang.Object put2(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.Object> r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            int r0 = r0.size()
            return r0
    }

    @Override // org.bson.conversions.Bson
    public <C> org.bson.BsonDocument toBsonDocument(java.lang.Class<C> r2, org.bson.codecs.configuration.CodecRegistry r3) {
            r1 = this;
            org.bson.BsonDocumentWrapper r2 = new org.bson.BsonDocumentWrapper
            java.lang.Class<org.bson.Document> r0 = org.bson.Document.class
            org.bson.codecs.Codec r3 = r3.get(r0)
            r2.<init>(r1, r3)
            return r2
    }

    public java.lang.String toJson() {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = new org.bson.json.JsonWriterSettings
            r0.<init>()
            java.lang.String r0 = r1.toJson(r0)
            return r0
    }

    public java.lang.String toJson(org.bson.codecs.Encoder<org.bson.Document> r2) {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = new org.bson.json.JsonWriterSettings
            r0.<init>()
            java.lang.String r2 = r1.toJson(r0, r2)
            return r2
    }

    public java.lang.String toJson(org.bson.json.JsonWriterSettings r2) {
            r1 = this;
            org.bson.codecs.DocumentCodec r0 = new org.bson.codecs.DocumentCodec
            r0.<init>()
            java.lang.String r2 = r1.toJson(r2, r0)
            return r2
    }

    public java.lang.String toJson(org.bson.json.JsonWriterSettings r3, org.bson.codecs.Encoder<org.bson.Document> r4) {
            r2 = this;
            org.bson.json.JsonWriter r0 = new org.bson.json.JsonWriter
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            r0.<init>(r1, r3)
            org.bson.codecs.EncoderContext$Builder r3 = org.bson.codecs.EncoderContext.builder()
            org.bson.codecs.EncoderContext r3 = r3.build()
            r4.encode(r0, r2, r3)
            java.io.Writer r3 = r0.getWriter()
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Document{"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r2.documentAsMap
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<java.lang.Object> values() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r1.documentAsMap
            java.util.Collection r0 = r0.values()
            return r0
    }
}
