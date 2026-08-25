package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class BsonDocumentWriter extends org.bson.AbstractBsonWriter {
    private final org.bson.BsonDocument document;

    /* JADX INFO: renamed from: org.bson.BsonDocumentWriter$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$AbstractBsonWriter$State = null;

        static {
                org.bson.AbstractBsonWriter$State[] r0 = org.bson.AbstractBsonWriter.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.BsonDocumentWriter.AnonymousClass1.$SwitchMap$org$bson$AbstractBsonWriter$State = r0
                org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.BsonDocumentWriter.AnonymousClass1.$SwitchMap$org$bson$AbstractBsonWriter$State     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.BsonDocumentWriter.AnonymousClass1.$SwitchMap$org$bson$AbstractBsonWriter$State     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public class Context extends org.bson.AbstractBsonWriter.Context {
        private org.bson.BsonValue container;
        public final /* synthetic */ org.bson.BsonDocumentWriter this$0;

        public Context(org.bson.BsonDocumentWriter r3) {
                r2 = this;
                r2.this$0 = r3
                org.bson.BsonContextType r0 = org.bson.BsonContextType.TOP_LEVEL
                r1 = 0
                r2.<init>(r3, r1, r0)
                return
        }

        public Context(org.bson.BsonDocumentWriter r1, org.bson.BsonValue r2, org.bson.BsonContextType r3, org.bson.BsonDocumentWriter.Context r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r4, r3)
                r0.container = r2
                return
        }

        public static /* synthetic */ org.bson.BsonValue access$000(org.bson.BsonDocumentWriter.Context r0) {
                org.bson.BsonValue r0 = r0.container
                return r0
        }

        public final void add(org.bson.BsonValue r3) {
                r2 = this;
                org.bson.BsonValue r0 = r2.container
                boolean r1 = r0 instanceof org.bson.BsonArray
                if (r1 == 0) goto Lc
                org.bson.BsonArray r0 = (org.bson.BsonArray) r0
                r0.add(r3)
                goto L17
            Lc:
                org.bson.BsonDocument r0 = (org.bson.BsonDocument) r0
                org.bson.BsonDocumentWriter r1 = r2.this$0
                java.lang.String r1 = r1.getName()
                r0.put2(r1, r3)
            L17:
                return
        }
    }

    public BsonDocumentWriter(org.bson.BsonDocument r2) {
            r1 = this;
            org.bson.BsonWriterSettings r0 = new org.bson.BsonWriterSettings
            r0.<init>()
            r1.<init>(r0)
            r1.document = r2
            org.bson.BsonDocumentWriter$Context r2 = new org.bson.BsonDocumentWriter$Context
            r2.<init>(r1)
            r1.setContext(r2)
            return
    }

    private void write(org.bson.BsonValue r2) {
            r1 = this;
            org.bson.BsonDocumentWriter$Context r0 = r1.getContext()
            r0.add(r2)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteBinaryData(org.bson.BsonBinary r1) {
            r0 = this;
            r0.write(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean r1) {
            r0 = this;
            org.bson.BsonBoolean r1 = org.bson.BsonBoolean.valueOf(r1)
            r0.write(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDBPointer(org.bson.BsonDbPointer r1) {
            r0 = this;
            r0.write(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDateTime(long r2) {
            r1 = this;
            org.bson.BsonDateTime r0 = new org.bson.BsonDateTime
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDecimal128(org.bson.types.Decimal128 r2) {
            r1 = this;
            org.bson.BsonDecimal128 r0 = new org.bson.BsonDecimal128
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDouble(double r2) {
            r1 = this;
            org.bson.BsonDouble r0 = new org.bson.BsonDouble
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndArray() {
            r2 = this;
            org.bson.BsonDocumentWriter$Context r0 = r2.getContext()
            org.bson.BsonValue r0 = org.bson.BsonDocumentWriter.Context.access$000(r0)
            org.bson.BsonDocumentWriter$Context r1 = r2.getContext()
            org.bson.AbstractBsonWriter$Context r1 = r1.getParentContext()
            r2.setContext(r1)
            r2.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndDocument() {
            r3 = this;
            org.bson.BsonDocumentWriter$Context r0 = r3.getContext()
            org.bson.BsonValue r0 = org.bson.BsonDocumentWriter.Context.access$000(r0)
            org.bson.BsonDocumentWriter$Context r1 = r3.getContext()
            org.bson.AbstractBsonWriter$Context r1 = r1.getParentContext()
            r3.setContext(r1)
            org.bson.BsonDocumentWriter$Context r1 = r3.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE
            if (r1 != r2) goto L43
            org.bson.BsonDocument r0 = (org.bson.BsonDocument) r0
            org.bson.BsonDocumentWriter$Context r1 = r3.getContext()
            org.bson.BsonValue r1 = org.bson.BsonDocumentWriter.Context.access$000(r1)
            org.bson.BsonString r1 = (org.bson.BsonString) r1
            org.bson.BsonDocumentWriter$Context r2 = r3.getContext()
            org.bson.AbstractBsonWriter$Context r2 = r2.getParentContext()
            r3.setContext(r2)
            org.bson.BsonJavaScriptWithScope r2 = new org.bson.BsonJavaScriptWithScope
            java.lang.String r1 = r1.getValue()
            r2.<init>(r1, r0)
            r3.write(r2)
            goto L52
        L43:
            org.bson.BsonDocumentWriter$Context r1 = r3.getContext()
            org.bson.BsonContextType r1 = r1.getContextType()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.TOP_LEVEL
            if (r1 == r2) goto L52
            r3.write(r0)
        L52:
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt32(int r2) {
            r1 = this;
            org.bson.BsonInt32 r0 = new org.bson.BsonInt32
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt64(long r2) {
            r1 = this;
            org.bson.BsonInt64 r0 = new org.bson.BsonInt64
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScript(java.lang.String r2) {
            r1 = this;
            org.bson.BsonJavaScript r0 = new org.bson.BsonJavaScript
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScriptWithScope(java.lang.String r4) {
            r3 = this;
            org.bson.BsonDocumentWriter$Context r0 = new org.bson.BsonDocumentWriter$Context
            org.bson.BsonString r1 = new org.bson.BsonString
            r1.<init>(r4)
            org.bson.BsonContextType r4 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE
            org.bson.BsonDocumentWriter$Context r2 = r3.getContext()
            r0.<init>(r3, r1, r4, r2)
            r3.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMaxKey() {
            r1 = this;
            org.bson.BsonMaxKey r0 = new org.bson.BsonMaxKey
            r0.<init>()
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMinKey() {
            r1 = this;
            org.bson.BsonMinKey r0 = new org.bson.BsonMinKey
            r0.<init>()
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
            r1 = this;
            org.bson.BsonNull r0 = org.bson.BsonNull.VALUE
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(org.bson.types.ObjectId r2) {
            r1 = this;
            org.bson.BsonObjectId r0 = new org.bson.BsonObjectId
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(org.bson.BsonRegularExpression r1) {
            r0 = this;
            r0.write(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteStartArray() {
            r4 = this;
            org.bson.BsonDocumentWriter$Context r0 = new org.bson.BsonDocumentWriter$Context
            org.bson.BsonArray r1 = new org.bson.BsonArray
            r1.<init>()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.ARRAY
            org.bson.BsonDocumentWriter$Context r3 = r4.getContext()
            r0.<init>(r4, r1, r2, r3)
            r4.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteStartDocument() {
            r4 = this;
            int[] r0 = org.bson.BsonDocumentWriter.AnonymousClass1.$SwitchMap$org$bson$AbstractBsonWriter$State
            org.bson.AbstractBsonWriter$State r1 = r4.getState()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L54
            r1 = 2
            if (r0 == r1) goto L40
            r1 = 3
            if (r0 != r1) goto L29
            org.bson.BsonDocumentWriter$Context r0 = new org.bson.BsonDocumentWriter$Context
            org.bson.BsonDocument r1 = new org.bson.BsonDocument
            r1.<init>()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.SCOPE_DOCUMENT
            org.bson.BsonDocumentWriter$Context r3 = r4.getContext()
            r0.<init>(r4, r1, r2, r3)
            r4.setContext(r0)
            goto L64
        L29:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.String r1 = "Unexpected state "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            org.bson.AbstractBsonWriter$State r2 = r4.getState()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            org.bson.BsonDocumentWriter$Context r0 = new org.bson.BsonDocumentWriter$Context
            org.bson.BsonDocument r1 = new org.bson.BsonDocument
            r1.<init>()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.DOCUMENT
            org.bson.BsonDocumentWriter$Context r3 = r4.getContext()
            r0.<init>(r4, r1, r2, r3)
            r4.setContext(r0)
            goto L64
        L54:
            org.bson.BsonDocumentWriter$Context r0 = new org.bson.BsonDocumentWriter$Context
            org.bson.BsonDocument r1 = r4.document
            org.bson.BsonContextType r2 = org.bson.BsonContextType.DOCUMENT
            org.bson.BsonDocumentWriter$Context r3 = r4.getContext()
            r0.<init>(r4, r1, r2, r3)
            r4.setContext(r0)
        L64:
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(java.lang.String r2) {
            r1 = this;
            org.bson.BsonString r0 = new org.bson.BsonString
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(java.lang.String r2) {
            r1 = this;
            org.bson.BsonSymbol r0 = new org.bson.BsonSymbol
            r0.<init>(r2)
            r1.write(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(org.bson.BsonTimestamp r1) {
            r0 = this;
            r0.write(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
            r1 = this;
            org.bson.BsonUndefined r0 = new org.bson.BsonUndefined
            r0.<init>()
            r1.write(r0)
            return
    }

    @Override // org.bson.BsonWriter
    public void flush() {
            r0 = this;
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final /* bridge */ /* synthetic */ org.bson.AbstractBsonWriter.Context getContext() {
            r1 = this;
            org.bson.BsonDocumentWriter$Context r0 = r1.getContext()
            return r0
    }

    @Override // org.bson.AbstractBsonWriter
    public final org.bson.BsonDocumentWriter.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonWriter$Context r0 = super.getContext()
            org.bson.BsonDocumentWriter$Context r0 = (org.bson.BsonDocumentWriter.Context) r0
            return r0
    }

    public org.bson.BsonDocument getDocument() {
            r1 = this;
            org.bson.BsonDocument r0 = r1.document
            return r0
    }
}
