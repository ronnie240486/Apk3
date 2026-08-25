package org.bson;

/* JADX INFO: loaded from: classes3.dex */
class BSONCallbackAdapter extends org.bson.AbstractBsonWriter {
    private org.bson.BSONCallback bsonCallback;

    /* JADX INFO: loaded from: classes.dex */
    public class Context extends org.bson.AbstractBsonWriter.Context {
        private org.bson.BSONCallback callback;
        private java.lang.String code;
        private int index;
        private java.lang.String name;

        public Context(org.bson.BSONCallbackAdapter r1, org.bson.BSONCallbackAdapter.Context r2, org.bson.BsonContextType r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ org.bson.BSONCallback access$000(org.bson.BSONCallbackAdapter.Context r0) {
                org.bson.BSONCallback r0 = r0.callback
                return r0
        }

        public static /* synthetic */ org.bson.BSONCallback access$002(org.bson.BSONCallbackAdapter.Context r0, org.bson.BSONCallback r1) {
                r0.callback = r1
                return r1
        }

        public static /* synthetic */ java.lang.String access$100(org.bson.BSONCallbackAdapter.Context r0) {
                java.lang.String r0 = r0.name
                return r0
        }

        public static /* synthetic */ java.lang.String access$102(org.bson.BSONCallbackAdapter.Context r0, java.lang.String r1) {
                r0.name = r1
                return r1
        }

        public static /* synthetic */ java.lang.String access$200(org.bson.BSONCallbackAdapter.Context r0) {
                java.lang.String r0 = r0.code
                return r0
        }

        public static /* synthetic */ java.lang.String access$202(org.bson.BSONCallbackAdapter.Context r0, java.lang.String r1) {
                r0.code = r1
                return r1
        }

        public static /* synthetic */ int access$308(org.bson.BSONCallbackAdapter.Context r2) {
                int r0 = r2.index
                int r1 = r0 + 1
                r2.index = r1
                return r0
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public /* bridge */ /* synthetic */ org.bson.AbstractBsonWriter.Context getParentContext() {
                r1 = this;
                org.bson.BSONCallbackAdapter$Context r0 = r1.getParentContext()
                return r0
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public org.bson.BSONCallbackAdapter.Context getParentContext() {
                r1 = this;
                org.bson.AbstractBsonWriter$Context r0 = super.getParentContext()
                org.bson.BSONCallbackAdapter$Context r0 = (org.bson.BSONCallbackAdapter.Context) r0
                return r0
        }
    }

    public BSONCallbackAdapter(org.bson.BsonWriterSettings r1, org.bson.BSONCallback r2) {
            r0 = this;
            r0.<init>(r1)
            r0.bsonCallback = r2
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteBinaryData(org.bson.BsonBinary r9) {
            r8 = this;
            byte r0 = r9.getType()
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.UUID_LEGACY
            byte r1 = r1.getValue()
            if (r0 != r1) goto L29
            org.bson.BSONCallback r2 = r8.bsonCallback
            java.lang.String r3 = r8.getName()
            byte[] r0 = r9.getData()
            r1 = 0
            long r4 = org.bson.io.Bits.readLong(r0, r1)
            byte[] r9 = r9.getData()
            r0 = 8
            long r6 = org.bson.io.Bits.readLong(r9, r0)
            r2.gotUUID(r3, r4, r6)
            goto L3a
        L29:
            org.bson.BSONCallback r0 = r8.bsonCallback
            java.lang.String r1 = r8.getName()
            byte r2 = r9.getType()
            byte[] r9 = r9.getData()
            r0.gotBinary(r1, r2, r9)
        L3a:
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotBoolean(r1, r3)
            org.bson.AbstractBsonWriter$State r3 = r2.getNextState()
            r2.setState(r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDBPointer(org.bson.BsonDbPointer r4) {
            r3 = this;
            org.bson.BSONCallback r0 = r3.bsonCallback
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = r4.getNamespace()
            org.bson.types.ObjectId r4 = r4.getId()
            r0.gotDBRef(r1, r2, r4)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDateTime(long r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotDate(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDecimal128(org.bson.types.Decimal128 r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotDecimal128(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteDouble(double r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotDouble(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndArray() {
            r1 = this;
            org.bson.BSONCallbackAdapter$Context r0 = r1.getContext()
            org.bson.BSONCallbackAdapter$Context r0 = r0.getParentContext()
            r1.setContext(r0)
            org.bson.BSONCallback r0 = r1.bsonCallback
            r0.arrayDone()
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteEndDocument() {
            r4 = this;
            org.bson.BSONCallbackAdapter$Context r0 = r4.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BSONCallbackAdapter$Context r1 = r4.getContext()
            org.bson.BSONCallbackAdapter$Context r1 = r1.getParentContext()
            r4.setContext(r1)
            org.bson.BSONCallback r1 = r4.bsonCallback
            r1.objectDone()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT
            if (r0 != r1) goto L3f
            org.bson.BSONCallback r0 = r4.bsonCallback
            java.lang.Object r0 = r0.get()
            org.bson.BSONCallbackAdapter$Context r1 = r4.getContext()
            org.bson.BSONCallback r1 = org.bson.BSONCallbackAdapter.Context.access$000(r1)
            r4.bsonCallback = r1
            org.bson.BSONCallbackAdapter$Context r2 = r4.getContext()
            java.lang.String r2 = org.bson.BSONCallbackAdapter.Context.access$100(r2)
            org.bson.BSONCallbackAdapter$Context r3 = r4.getContext()
            java.lang.String r3 = org.bson.BSONCallbackAdapter.Context.access$200(r3)
            r1.gotCodeWScope(r2, r3, r0)
        L3f:
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt32(int r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotInt(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteInt64(long r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotLong(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScript(java.lang.String r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotCode(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteJavaScriptWithScope(java.lang.String r3) {
            r2 = this;
            org.bson.BSONCallbackAdapter$Context r0 = r2.getContext()
            org.bson.BSONCallback r1 = r2.bsonCallback
            org.bson.BSONCallbackAdapter.Context.access$002(r0, r1)
            org.bson.BSONCallbackAdapter$Context r0 = r2.getContext()
            org.bson.BSONCallbackAdapter.Context.access$202(r0, r3)
            org.bson.BSONCallbackAdapter$Context r3 = r2.getContext()
            java.lang.String r0 = r2.getName()
            org.bson.BSONCallbackAdapter.Context.access$102(r3, r0)
            org.bson.BSONCallback r3 = r2.bsonCallback
            org.bson.BSONCallback r3 = r3.createBSONCallback()
            r2.bsonCallback = r3
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMaxKey() {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotMaxKey(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public final void doWriteMinKey() {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotMinKey(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotNull(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(org.bson.types.ObjectId r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotObjectId(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(org.bson.BsonRegularExpression r4) {
            r3 = this;
            org.bson.BSONCallback r0 = r3.bsonCallback
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = r4.getPattern()
            java.lang.String r4 = r4.getOptions()
            r0.gotRegex(r1, r2, r4)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartArray() {
            r3 = this;
            org.bson.BSONCallback r0 = r3.bsonCallback
            java.lang.String r1 = r3.getName()
            r0.arrayStart(r1)
            org.bson.BSONCallbackAdapter$Context r0 = new org.bson.BSONCallbackAdapter$Context
            org.bson.BSONCallbackAdapter$Context r1 = r3.getContext()
            org.bson.BsonContextType r2 = org.bson.BsonContextType.ARRAY
            r0.<init>(r3, r1, r2)
            r3.setContext(r0)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartDocument() {
            r3 = this;
            org.bson.AbstractBsonWriter$State r0 = r3.getState()
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT
            if (r0 != r1) goto Lb
            org.bson.BsonContextType r0 = org.bson.BsonContextType.SCOPE_DOCUMENT
            goto Ld
        Lb:
            org.bson.BsonContextType r0 = org.bson.BsonContextType.DOCUMENT
        Ld:
            org.bson.BSONCallbackAdapter$Context r1 = r3.getContext()
            if (r1 == 0) goto L22
            org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT
            if (r0 != r1) goto L18
            goto L22
        L18:
            org.bson.BSONCallback r1 = r3.bsonCallback
            java.lang.String r2 = r3.getName()
            r1.objectStart(r2)
            goto L27
        L22:
            org.bson.BSONCallback r1 = r3.bsonCallback
            r1.objectStart()
        L27:
            org.bson.BSONCallbackAdapter$Context r1 = new org.bson.BSONCallbackAdapter$Context
            org.bson.BSONCallbackAdapter$Context r2 = r3.getContext()
            r1.<init>(r3, r2, r0)
            r3.setContext(r1)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(java.lang.String r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotString(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(java.lang.String r3) {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotSymbol(r1, r3)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(org.bson.BsonTimestamp r4) {
            r3 = this;
            org.bson.BSONCallback r0 = r3.bsonCallback
            java.lang.String r1 = r3.getName()
            int r2 = r4.getTime()
            int r4 = r4.getInc()
            r0.gotTimestamp(r1, r2, r4)
            return
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
            r2 = this;
            org.bson.BSONCallback r0 = r2.bsonCallback
            java.lang.String r1 = r2.getName()
            r0.gotUndefined(r1)
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
            org.bson.BSONCallbackAdapter$Context r0 = r1.getContext()
            return r0
    }

    @Override // org.bson.AbstractBsonWriter
    public final org.bson.BSONCallbackAdapter.Context getContext() {
            r1 = this;
            org.bson.AbstractBsonWriter$Context r0 = super.getContext()
            org.bson.BSONCallbackAdapter$Context r0 = (org.bson.BSONCallbackAdapter.Context) r0
            return r0
    }

    @Override // org.bson.AbstractBsonWriter
    public final java.lang.String getName() {
            r2 = this;
            org.bson.BSONCallbackAdapter$Context r0 = r2.getContext()
            org.bson.BsonContextType r0 = r0.getContextType()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY
            if (r0 != r1) goto L19
            org.bson.BSONCallbackAdapter$Context r0 = r2.getContext()
            int r0 = org.bson.BSONCallbackAdapter.Context.access$308(r0)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L19:
            java.lang.String r0 = super.getName()
            return r0
    }
}
