package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonBinaryWriter extends org.bson.AbstractBsonWriter {
    private final org.bson.BsonBinaryWriterSettings binaryWriterSettings;
    private final org.bson.io.BsonOutput bsonOutput;
    private org.bson.BsonBinaryWriter.Mark mark;
    private final java.util.Stack<java.lang.Integer> maxDocumentSizeStack;

    public class Context extends org.bson.AbstractBsonWriter.Context {
        private int index;
        private final int startPosition;
        public final /* synthetic */ org.bson.BsonBinaryWriter this$0;

        public Context(org.bson.BsonBinaryWriter r1, org.bson.BsonBinaryWriter.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                int r1 = r2.startPosition
                r0.startPosition = r1
                int r1 = r2.index
                r0.index = r1
                return
        }

        public Context(org.bson.BsonBinaryWriter r1, org.bson.BsonBinaryWriter.Context r2, org.bson.BsonContextType r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2, r3)
                r0.startPosition = r4
                return
        }

        public static /* synthetic */ int access$008(org.bson.BsonBinaryWriter.Context r2) {
                int r0 = r2.index
                int r1 = r0 + 1
                r2.index = r1
                return r0
        }

        public static /* synthetic */ int access$100(org.bson.BsonBinaryWriter.Context r0) {
                int r0 = r0.startPosition
                return r0
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public /* bridge */ /* synthetic */ org.bson.AbstractBsonWriter.Context copy() {
                r1 = this;
                org.bson.BsonBinaryWriter$Context r0 = r1.copy()
                return r0
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public org.bson.BsonBinaryWriter.Context copy() {
                r2 = this;
                org.bson.BsonBinaryWriter$Context r0 = new org.bson.BsonBinaryWriter$Context
                org.bson.BsonBinaryWriter r1 = r2.this$0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public /* bridge */ /* synthetic */ org.bson.AbstractBsonWriter.Context getParentContext() {
                r1 = this;
                org.bson.BsonBinaryWriter$Context r0 = r1.getParentContext()
                return r0
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public org.bson.BsonBinaryWriter.Context getParentContext() {
                r1 = this;
                org.bson.AbstractBsonWriter$Context r0 = super.getParentContext()
                org.bson.BsonBinaryWriter$Context r0 = (org.bson.BsonBinaryWriter.Context) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class Mark extends org.bson.AbstractBsonWriter.Mark {
        private final int position;
        public final /* synthetic */ org.bson.BsonBinaryWriter this$0;

        public Mark(org.bson.BsonBinaryWriter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                org.bson.io.BsonOutput r1 = org.bson.BsonBinaryWriter.access$200(r1)
                int r1 = r1.getPosition()
                r0.position = r1
                return
        }

        @Override // org.bson.AbstractBsonWriter.Mark
        public final void reset() {
                r2 = this;
                super.reset()
                org.bson.BsonBinaryWriter r0 = r2.this$0
                org.bson.io.BsonOutput r0 = org.bson.BsonBinaryWriter.access$200(r0)
                org.bson.BsonBinaryWriter r1 = r2.this$0
                org.bson.BsonBinaryWriter$Mark r1 = org.bson.BsonBinaryWriter.access$300(r1)
                int r1 = r1.position
                r0.truncateToPosition(r1)
                return
        }
    }

    public BsonBinaryWriter(org.bson.BsonWriterSettings r2, org.bson.BsonBinaryWriterSettings r3, org.bson.io.BsonOutput r4) {
            r1 = this;
            org.bson.NoOpFieldNameValidator r0 = new org.bson.NoOpFieldNameValidator
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public BsonBinaryWriter(org.bson.BsonWriterSettings r1, org.bson.BsonBinaryWriterSettings r2, org.bson.io.BsonOutput r3, org.bson.FieldNameValidator r4) {
            r0 = this;
            r0.<init>(r1, r4)
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            r0.maxDocumentSizeStack = r1
            r0.binaryWriterSettings = r2
            r0.bsonOutput = r3
            int r2 = r2.getMaxDocumentSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.push(r2)
            return
    }

    public BsonBinaryWriter(org.bson.io.BsonOutput r3) {
            r2 = this;
            org.bson.BsonWriterSettings r0 = new org.bson.BsonWriterSettings
            r0.<init>()
            org.bson.BsonBinaryWriterSettings r1 = new org.bson.BsonBinaryWriterSettings
            r1.<init>()
            r2.<init>(r0, r1, r3)
            return
    }

    public BsonBinaryWriter(org.bson.io.BsonOutput r3, org.bson.FieldNameValidator r4) {
            r2 = this;
            org.bson.BsonWriterSettings r0 = new org.bson.BsonWriterSettings
            r0.<init>()
            org.bson.BsonBinaryWriterSettings r1 = new org.bson.BsonBinaryWriterSettings
            r1.<init>()
            r2.<init>(r0, r1, r3, r4)
            return
    }

    public static /* synthetic */ org.bson.io.BsonOutput access$200(org.bson.BsonBinaryWriter r0) {
            org.bson.io.BsonOutput r0 = r0.bsonOutput
            return r0
    }

    public static /* synthetic */ org.bson.BsonBinaryWriter.Mark access$300(org.bson.BsonBinaryWriter r0) {
            org.bson.BsonBinaryWriter$Mark r0 = r0.mark
            return r0
    }

    private void backpatchSize() {
            r3 = this;
            org.bson.io.BsonOutput r0 = r3.bsonOutput
            int r0 = r0.getPosition()
            org.bson.BsonBinaryWriter$Context r1 = r3.getContext()
            int r1 = org.bson.BsonBinaryWriter.Context.access$100(r1)
            int r0 = r0 - r1
            r3.validateSize(r0)
            org.bson.io.BsonOutput r1 = r3.bsonOutput
            int r2 = r1.getPosition()
            int r2 = r2 - r0
            r1.writeInt32(r2, r0)
            return
    }

    private void pipeDocument(org.bson.BsonReader r5, java.util.List<org.bson.BsonElement> r6) {
            r4 = this;
            boolean r0 = r5 instanceof org.bson.BsonBinaryReader
            if (r0 == 0) goto Lc1
            org.bson.BsonBinaryReader r5 = (org.bson.BsonBinaryReader) r5
            org.bson.AbstractBsonWriter$State r0 = r4.getState()
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            if (r0 != r1) goto L1c
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r4.writeCurrentName()
        L1c:
            org.bson.io.BsonInput r0 = r5.getBsonInput()
            int r1 = r0.readInt32()
            r2 = 5
            if (r1 < r2) goto Lb9
            org.bson.io.BsonOutput r2 = r4.bsonOutput
            int r2 = r2.getPosition()
            org.bson.io.BsonOutput r3 = r4.bsonOutput
            r3.writeInt32(r1)
            int r1 = r1 + (-4)
            byte[] r1 = new byte[r1]
            r0.readBytes(r1)
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            r0.writeBytes(r1)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r5.setState(r0)
            if (r6 == 0) goto L81
            org.bson.io.BsonOutput r5 = r4.bsonOutput
            int r0 = r5.getPosition()
            int r0 = r0 + (-1)
            r5.truncateToPosition(r0)
            org.bson.BsonBinaryWriter$Context r5 = new org.bson.BsonBinaryWriter$Context
            org.bson.BsonBinaryWriter$Context r0 = r4.getContext()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT
            r5.<init>(r4, r0, r1, r2)
            r4.setContext(r5)
            org.bson.AbstractBsonWriter$State r5 = org.bson.AbstractBsonWriter.State.NAME
            r4.setState(r5)
            r4.pipeExtraElements(r6)
            org.bson.io.BsonOutput r5 = r4.bsonOutput
            r6 = 0
            r5.writeByte(r6)
            org.bson.io.BsonOutput r5 = r4.bsonOutput
            int r6 = r5.getPosition()
            int r6 = r6 - r2
            r5.writeInt32(r2, r6)
            org.bson.BsonBinaryWriter$Context r5 = r4.getContext()
            org.bson.BsonBinaryWriter$Context r5 = r5.getParentContext()
            r4.setContext(r5)
        L81:
            org.bson.BsonBinaryWriter$Context r5 = r4.getContext()
            if (r5 != 0) goto L8d
            org.bson.AbstractBsonWriter$State r5 = org.bson.AbstractBsonWriter.State.DONE
            r4.setState(r5)
            goto Lae
        L8d:
            org.bson.BsonBinaryWriter$Context r5 = r4.getContext()
            org.bson.BsonContextType r5 = r5.getContextType()
            org.bson.BsonContextType r6 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE
            if (r5 != r6) goto La7
            r4.backpatchSize()
            org.bson.BsonBinaryWriter$Context r5 = r4.getContext()
            org.bson.BsonBinaryWriter$Context r5 = r5.getParentContext()
            r4.setContext(r5)
        La7:
            org.bson.AbstractBsonWriter$State r5 = r4.getNextState()
            r4.setState(r5)
        Lae:
            org.bson.io.BsonOutput r5 = r4.bsonOutput
            int r5 = r5.getPosition()
            int r5 = r5 - r2
            r4.validateSize(r5)
            goto Lca
        Lb9:
            org.bson.BsonSerializationException r5 = new org.bson.BsonSerializationException
            java.lang.String r6 = "Document size must be at least 5"
            r5.<init>(r6)
            throw r5
        Lc1:
            if (r6 == 0) goto Lc7
            super.pipe(r5, r6)
            goto Lca
        Lc7:
            super.pipe(r5)
        Lca:
            return
    }

    private void validateSize(int r4) {
            r3 = this;
            java.util.Stack<java.lang.Integer> r0 = r3.maxDocumentSizeStack
            java.lang.Object r0 = r0.peek()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r4 > r0) goto Lf
            return
        Lf:
            org.bson.BsonMaximumSizeExceededException r0 = new org.bson.BsonMaximumSizeExceededException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            r4 = 1
            java.util.Stack<java.lang.Integer> r2 = r3.maxDocumentSizeStack
            java.lang.Object r2 = r2.peek()
            r1[r4] = r2
            java.lang.String r4 = "Document size of %d is larger than maximum of %d."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    private void writeCurrentName() {
            r2 = this;
            org.bson.BsonBinaryWriter$Context r0 = r2.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY
            if (r0 != r1) goto L1e
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonBinaryWriter$Context r1 = r2.getContext()
            int r1 = org.bson.BsonBinaryWriter.Context.access$008(r1)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.writeCString(r1)
            goto L27
        L1e:
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            java.lang.String r1 = r2.getName()
            r0.writeCString(r1)
        L27:
            return
    }

    @Override // org.bson.AbstractBsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            super.close()
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteBinaryData(org.bson.BsonBinary r5) {
            r4 = this;
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.BINARY
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r4.writeCurrentName()
            byte[] r0 = r5.getData()
            int r0 = r0.length
            byte r1 = r5.getType()
            org.bson.BsonBinarySubType r2 = org.bson.BsonBinarySubType.OLD_BINARY
            byte r3 = r2.getValue()
            if (r1 != r3) goto L21
            int r0 = r0 + 4
        L21:
            org.bson.io.BsonOutput r1 = r4.bsonOutput
            r1.writeInt32(r0)
            org.bson.io.BsonOutput r1 = r4.bsonOutput
            byte r3 = r5.getType()
            r1.writeByte(r3)
            byte r1 = r5.getType()
            byte r2 = r2.getValue()
            if (r1 != r2) goto L40
            org.bson.io.BsonOutput r1 = r4.bsonOutput
            int r0 = r0 + (-4)
            r1.writeInt32(r0)
        L40:
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            byte[] r5 = r5.getData()
            r0.writeBytes(r5)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.BOOLEAN
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeByte(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDBPointer(org.bson.BsonDbPointer r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.DB_POINTER
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            java.lang.String r1 = r3.getNamespace()
            r0.writeString(r1)
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.types.ObjectId r3 = r3.getId()
            byte[] r3 = r3.toByteArray()
            r0.writeBytes(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDateTime(long r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeInt64(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDecimal128(org.bson.types.Decimal128 r4) {
            r3 = this;
            org.bson.io.BsonOutput r0 = r3.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r3.writeCurrentName()
            org.bson.io.BsonOutput r0 = r3.bsonOutput
            long r1 = r4.getLow()
            r0.writeInt64(r1)
            org.bson.io.BsonOutput r0 = r3.bsonOutput
            long r1 = r4.getHigh()
            r0.writeInt64(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDouble(double r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.DOUBLE
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeDouble(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndArray() {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r1 = 0
            r0.writeByte(r1)
            r2.backpatchSize()
            org.bson.BsonBinaryWriter$Context r0 = r2.getContext()
            org.bson.BsonBinaryWriter$Context r0 = r0.getParentContext()
            r2.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndDocument() {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r1 = 0
            r0.writeByte(r1)
            r2.backpatchSize()
            org.bson.BsonBinaryWriter$Context r0 = r2.getContext()
            org.bson.BsonBinaryWriter$Context r0 = r0.getParentContext()
            r2.setContext(r0)
            org.bson.BsonBinaryWriter$Context r0 = r2.getContext()
            if (r0 == 0) goto L34
            org.bson.BsonBinaryWriter$Context r0 = r2.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE
            if (r0 != r1) goto L34
            r2.backpatchSize()
            org.bson.BsonBinaryWriter$Context r0 = r2.getContext()
            org.bson.BsonBinaryWriter$Context r0 = r0.getParentContext()
            r2.setContext(r0)
        L34:
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt32(int r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.INT32
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeInt32(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt64(long r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.INT64
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeInt64(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScript(java.lang.String r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeString(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScriptWithScope(java.lang.String r5) {
            r4 = this;
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r4.writeCurrentName()
            org.bson.BsonBinaryWriter$Context r0 = new org.bson.BsonBinaryWriter$Context
            org.bson.BsonBinaryWriter$Context r1 = r4.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE
            org.bson.io.BsonOutput r3 = r4.bsonOutput
            int r3 = r3.getPosition()
            r0.<init>(r4, r1, r2, r3)
            r4.setContext(r0)
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            r1 = 0
            r0.writeInt32(r1)
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            r0.writeString(r5)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMaxKey() {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.MAX_KEY
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMinKey() {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.MIN_KEY
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.NULL
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(org.bson.types.ObjectId r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.OBJECT_ID
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            byte[] r3 = r3.toByteArray()
            r0.writeBytes(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(org.bson.BsonRegularExpression r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.REGULAR_EXPRESSION
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            java.lang.String r1 = r3.getPattern()
            r0.writeCString(r1)
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            java.lang.String r3 = r3.getOptions()
            r0.writeCString(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteStartArray() {
            r4 = this;
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.ARRAY
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r4.writeCurrentName()
            org.bson.BsonBinaryWriter$Context r0 = new org.bson.BsonBinaryWriter$Context
            org.bson.BsonBinaryWriter$Context r1 = r4.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.ARRAY
            org.bson.io.BsonOutput r3 = r4.bsonOutput
            int r3 = r3.getPosition()
            r0.<init>(r4, r1, r2, r3)
            r4.setContext(r0)
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            r1 = 0
            r0.writeInt32(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteStartDocument() {
            r4 = this;
            org.bson.AbstractBsonWriter$State r0 = r4.getState()
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE
            if (r0 != r1) goto L16
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r4.writeCurrentName()
        L16:
            org.bson.BsonBinaryWriter$Context r0 = new org.bson.BsonBinaryWriter$Context
            org.bson.BsonBinaryWriter$Context r1 = r4.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.DOCUMENT
            org.bson.io.BsonOutput r3 = r4.bsonOutput
            int r3 = r3.getPosition()
            r0.<init>(r4, r1, r2, r3)
            r4.setContext(r0)
            org.bson.io.BsonOutput r0 = r4.bsonOutput
            r1 = 0
            r0.writeInt32(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(java.lang.String r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.STRING
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeString(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(java.lang.String r3) {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.SYMBOL
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            r0.writeString(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(org.bson.BsonTimestamp r4) {
            r3 = this;
            org.bson.io.BsonOutput r0 = r3.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.TIMESTAMP
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r3.writeCurrentName()
            org.bson.io.BsonOutput r0 = r3.bsonOutput
            long r1 = r4.getValue()
            r0.writeInt64(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
            r2 = this;
            org.bson.io.BsonOutput r0 = r2.bsonOutput
            org.bson.BsonType r1 = org.bson.BsonType.UNDEFINED
            int r1 = r1.getValue()
            r0.writeByte(r1)
            r2.writeCurrentName()
            return
    }

    @Override // org.bson.BsonWriter
    public void flush() {
            r0 = this;
            return
    }

    public org.bson.BsonBinaryWriterSettings getBinaryWriterSettings() {
            r1 = this;
            org.bson.BsonBinaryWriterSettings r0 = r1.binaryWriterSettings
            return r0
    }

    public org.bson.io.BsonOutput getBsonOutput() {
            r1 = this;
            org.bson.io.BsonOutput r0 = r1.bsonOutput
            return r0
    }

    @Override // org.bson.AbstractBsonWriter
    public final /* bridge */ /* synthetic */ org.bson.AbstractBsonWriter.Context getContext() {
            r1 = this;
            org.bson.BsonBinaryWriter$Context r0 = r1.getContext()
            return r0
    }

    @Override // org.bson.AbstractBsonWriter
    public final org.bson.BsonBinaryWriter.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonWriter$Context r0 = super.getContext()
            org.bson.BsonBinaryWriter$Context r0 = (org.bson.BsonBinaryWriter.Context) r0
            return r0
    }

    public void mark() {
            r1 = this;
            org.bson.BsonBinaryWriter$Mark r0 = new org.bson.BsonBinaryWriter$Mark
            r0.<init>(r1)
            r1.mark = r0
            return
    }

    @Override // org.bson.AbstractBsonWriter, org.bson.BsonWriter
    public void pipe(org.bson.BsonReader r2) {
            r1 = this;
            java.lang.String r0 = "reader"
            org.bson.assertions.Assertions.notNull(r0, r2)
            r0 = 0
            r1.pipeDocument(r2, r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void pipe(org.bson.BsonReader r2, java.util.List<org.bson.BsonElement> r3) {
            r1 = this;
            java.lang.String r0 = "reader"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "extraElements"
            org.bson.assertions.Assertions.notNull(r0, r3)
            r1.pipeDocument(r2, r3)
            return
    }

    public void popMaxDocumentSize() {
            r1 = this;
            java.util.Stack<java.lang.Integer> r0 = r1.maxDocumentSizeStack
            r0.pop()
            return
    }

    public void pushMaxDocumentSize(int r2) {
            r1 = this;
            java.util.Stack<java.lang.Integer> r0 = r1.maxDocumentSizeStack
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.push(r2)
            return
    }

    public void reset() {
            r2 = this;
            org.bson.BsonBinaryWriter$Mark r0 = r2.mark
            if (r0 == 0) goto Lb
            r0.reset()
            r0 = 0
            r2.mark = r0
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not reset without first marking"
            r0.<init>(r1)
            throw r0
    }
}
