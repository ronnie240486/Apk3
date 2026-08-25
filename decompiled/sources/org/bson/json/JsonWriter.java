package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
public class JsonWriter extends org.bson.AbstractBsonWriter {
    private final org.bson.json.JsonWriterSettings settings;
    private final org.bson.json.StrictCharacterStreamJsonWriter strictJsonWriter;



    public class Context extends org.bson.AbstractBsonWriter.Context {
        public Context(org.bson.json.JsonWriter r1, org.bson.json.JsonWriter.Context r2, org.bson.BsonContextType r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        public Context(org.bson.json.JsonWriter r1, org.bson.json.JsonWriter.Context r2, org.bson.BsonContextType r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public /* bridge */ /* synthetic */ org.bson.AbstractBsonWriter.Context getParentContext() {
                r1 = this;
                org.bson.json.JsonWriter$Context r0 = r1.getParentContext()
                return r0
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public org.bson.json.JsonWriter.Context getParentContext() {
                r1 = this;
                org.bson.AbstractBsonWriter$Context r0 = super.getParentContext()
                org.bson.json.JsonWriter$Context r0 = (org.bson.json.JsonWriter.Context) r0
                return r0
        }
    }

    public JsonWriter(java.io.Writer r2) {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = new org.bson.json.JsonWriterSettings
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public JsonWriter(java.io.Writer r4, org.bson.json.JsonWriterSettings r5) {
            r3 = this;
            r3.<init>(r5)
            r3.settings = r5
            org.bson.json.JsonWriter$Context r0 = new org.bson.json.JsonWriter$Context
            org.bson.BsonContextType r1 = org.bson.BsonContextType.TOP_LEVEL
            r2 = 0
            r0.<init>(r3, r2, r1)
            r3.setContext(r0)
            org.bson.json.StrictCharacterStreamJsonWriter r0 = new org.bson.json.StrictCharacterStreamJsonWriter
            org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder r1 = org.bson.json.StrictCharacterStreamJsonWriterSettings.builder()
            boolean r2 = r5.isIndent()
            org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder r1 = r1.indent(r2)
            java.lang.String r2 = r5.getNewLineCharacters()
            org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder r1 = r1.newLineCharacters(r2)
            java.lang.String r2 = r5.getIndentCharacters()
            org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder r1 = r1.indentCharacters(r2)
            int r5 = r5.getMaxLength()
            org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder r5 = r1.maxLength(r5)
            org.bson.json.StrictCharacterStreamJsonWriterSettings r5 = r5.build()
            r0.<init>(r4, r5)
            r3.strictJsonWriter = r0
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final boolean abortPipe() {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r1.strictJsonWriter
            boolean r0 = r0.isTruncated()
            return r0
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteBinaryData(org.bson.BsonBinary r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getBinaryConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getBooleanConverter()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDBPointer(org.bson.BsonDbPointer r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.JsonMode r0 = r0.getOutputMode()
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 != r1) goto L15
            org.bson.json.JsonWriter$1 r0 = new org.bson.json.JsonWriter$1
            r0.<init>(r2)
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert2(r3, r1)
            goto L1f
        L15:
            org.bson.json.JsonWriter$2 r0 = new org.bson.json.JsonWriter$2
            r0.<init>(r2)
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert2(r3, r1)
        L1f:
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDateTime(long r2) {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = r1.settings
            org.bson.json.Converter r0 = r0.getDateTimeConverter()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            org.bson.json.StrictCharacterStreamJsonWriter r3 = r1.strictJsonWriter
            r0.convert(r2, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDecimal128(org.bson.types.Decimal128 r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getDecimal128Converter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDouble(double r2) {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = r1.settings
            org.bson.json.Converter r0 = r0.getDoubleConverter()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            org.bson.json.StrictCharacterStreamJsonWriter r3 = r1.strictJsonWriter
            r0.convert(r2, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndArray() {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r1.strictJsonWriter
            r0.writeEndArray()
            org.bson.json.JsonWriter$Context r0 = r1.getContext()
            org.bson.json.JsonWriter$Context r0 = r0.getParentContext()
            r1.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndDocument() {
            r2 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r2.strictJsonWriter
            r0.writeEndObject()
            org.bson.json.JsonWriter$Context r0 = r2.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT
            if (r0 != r1) goto L20
            org.bson.json.JsonWriter$Context r0 = r2.getContext()
            org.bson.json.JsonWriter$Context r0 = r0.getParentContext()
            r2.setContext(r0)
            r2.writeEndDocument()
            goto L2b
        L20:
            org.bson.json.JsonWriter$Context r0 = r2.getContext()
            org.bson.json.JsonWriter$Context r0 = r0.getParentContext()
            r2.setContext(r0)
        L2b:
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt32(int r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getInt32Converter()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt64(long r2) {
            r1 = this;
            org.bson.json.JsonWriterSettings r0 = r1.settings
            org.bson.json.Converter r0 = r0.getInt64Converter()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            org.bson.json.StrictCharacterStreamJsonWriter r3 = r1.strictJsonWriter
            r0.convert(r2, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScript(java.lang.String r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getJavaScriptConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScriptWithScope(java.lang.String r2) {
            r1 = this;
            r1.writeStartDocument()
            java.lang.String r0 = "$code"
            r1.writeString(r0, r2)
            java.lang.String r2 = "$scope"
            r1.writeName(r2)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMaxKey() {
            r3 = this;
            org.bson.json.JsonWriterSettings r0 = r3.settings
            org.bson.json.Converter r0 = r0.getMaxKeyConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r3.strictJsonWriter
            r2 = 0
            r0.convert(r2, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMinKey() {
            r3 = this;
            org.bson.json.JsonWriterSettings r0 = r3.settings
            org.bson.json.Converter r0 = r0.getMinKeyConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r3.strictJsonWriter
            r2 = 0
            r0.convert(r2, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteName(java.lang.String r2) {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r1.strictJsonWriter
            r0.writeName(r2)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
            r3 = this;
            org.bson.json.JsonWriterSettings r0 = r3.settings
            org.bson.json.Converter r0 = r0.getNullConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r3.strictJsonWriter
            r2 = 0
            r0.convert(r2, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(org.bson.types.ObjectId r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getObjectIdConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(org.bson.BsonRegularExpression r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getRegularExpressionConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteStartArray() {
            r3 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r3.strictJsonWriter
            r0.writeStartArray()
            org.bson.json.JsonWriter$Context r0 = new org.bson.json.JsonWriter$Context
            org.bson.json.JsonWriter$Context r1 = r3.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.ARRAY
            r0.<init>(r3, r1, r2)
            r3.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteStartDocument() {
            r3 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r3.strictJsonWriter
            r0.writeStartObject()
            org.bson.AbstractBsonWriter$State r0 = r3.getState()
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT
            if (r0 != r1) goto L10
            org.bson.BsonContextType r0 = org.bson.BsonContextType.SCOPE_DOCUMENT
            goto L12
        L10:
            org.bson.BsonContextType r0 = org.bson.BsonContextType.DOCUMENT
        L12:
            org.bson.json.JsonWriter$Context r1 = new org.bson.json.JsonWriter$Context
            org.bson.json.JsonWriter$Context r2 = r3.getContext()
            r1.<init>(r3, r2, r0)
            r3.setContext(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(java.lang.String r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getStringConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(java.lang.String r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getSymbolConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(org.bson.BsonTimestamp r3) {
            r2 = this;
            org.bson.json.JsonWriterSettings r0 = r2.settings
            org.bson.json.Converter r0 = r0.getTimestampConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r2.strictJsonWriter
            r0.convert(r3, r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
            r3 = this;
            org.bson.json.JsonWriterSettings r0 = r3.settings
            org.bson.json.Converter r0 = r0.getUndefinedConverter()
            org.bson.json.StrictCharacterStreamJsonWriter r1 = r3.strictJsonWriter
            r2 = 0
            r0.convert(r2, r1)
            return
    }

    @Override // org.bson.BsonWriter
    public void flush() {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r1.strictJsonWriter
            r0.flush()
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final /* bridge */ /* synthetic */ org.bson.AbstractBsonWriter.Context getContext() {
            r1 = this;
            org.bson.json.JsonWriter$Context r0 = r1.getContext()
            return r0
    }

    @Override // org.bson.AbstractBsonWriter
    public final org.bson.json.JsonWriter.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonWriter$Context r0 = super.getContext()
            org.bson.json.JsonWriter$Context r0 = (org.bson.json.JsonWriter.Context) r0
            return r0
    }

    public java.io.Writer getWriter() {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r1.strictJsonWriter
            java.io.Writer r0 = r0.getWriter()
            return r0
    }

    public boolean isTruncated() {
            r1 = this;
            org.bson.json.StrictCharacterStreamJsonWriter r0 = r1.strictJsonWriter
            boolean r0 = r0.isTruncated()
            return r0
    }
}
